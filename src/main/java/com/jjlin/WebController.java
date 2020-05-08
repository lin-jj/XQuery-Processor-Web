package com.jjlin;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.jjlin.processor.XQueryProcessor;
import com.jjlin.storage.StorageFileNotFoundException;
import com.jjlin.storage.StorageService;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class WebController {
	@Resource(name = "uploadedFiles")
	private List<String> uploadedFiles;

	private final StorageService storageService;

	@Autowired
	public WebController(StorageService storageService) {
		this.storageService = storageService;
	}

	@RequestMapping(value = "/")
	public String welcome(Map<String, Object> model) {
		model.put("result", "XQuery result");
		if (uploadedFiles.isEmpty())
			model.put("file", "No File Uploded.");
		else
			model.put("file", String.join(", ", uploadedFiles) + " uploaded.");
		return "welcome";
	}

	@RequestMapping(value = "/clean")
	public String clean(Map<String, Object> model) {
		storageService.deleteAll();
		storageService.init();
		uploadedFiles.clear();
		model.put("result", "XQuery result");
		model.put("file", "No File Uploded.");
		return "welcome";
	}
	
	@RequestMapping(value = "/XQuery", method = RequestMethod.POST)
	public String getResult(@ModelAttribute("SpringWeb")XQueryProcessor processor, ModelMap model) {
		try {
			if (uploadedFiles.isEmpty())
				model.put("file", "No File Uploded.");
			else
				model.put("file", String.join(", ", uploadedFiles) + " uploaded.");
			model.put("query", processor.getQuery());
			model.put("result", processor.proceed());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "result";
	}

//	@GetMapping("/files/{filename:.+}")
//	@ResponseBody
//	public ResponseEntity<Resource> serveFile(@PathVariable String filename) {
//
//		Resource file = storageService.loadAsResource(filename);
//		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
//				"attachment; filename=\"" + file.getFilename() + "\"").body(file);
//	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String handleFileUpload(@RequestParam("file") MultipartFile file, ModelMap model) {

		storageService.store(file);
		uploadedFiles.add(file.getOriginalFilename());
		if (uploadedFiles.isEmpty())
			model.put("file", "No File Uploded.");
		else
			model.put("file", String.join(", ", uploadedFiles) + " uploaded.");
		model.put("result", "XQuery result");
		return "uploaded";
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
		return ResponseEntity.notFound().build();
	}
}