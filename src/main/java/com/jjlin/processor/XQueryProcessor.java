package com.jjlin.processor;
//import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import org.w3c.dom.*;

import javax.swing.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class XQueryProcessor {
	private String query;
	
	public void setQuery(String q) {
		this.query = q;
	}
	
	public String getQuery() {
		return this.query;
	}

    private static void pretty(Node document, Result result) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", Integer.toString(2));
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
        Source source = new DOMSource(document);
        transformer.transform(source, result);
    }

    public String proceed() throws Exception {
        CharStream charStream = CharStreams.fromString(this.query);
        XQueryLexer XQueryLexer = new XQueryLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(XQueryLexer);
        XQueryParser XQueryParser = new XQueryParser(commonTokenStream);
        ParseTree parseTree = XQueryParser.xq();
        XQueryExtendVisitor visitor = new XQueryExtendVisitor();


//        // parse tree visualization
//        JFrame frame = new JFrame("Antlr AST");
//        JPanel panel = new JPanel();
//        TreeViewer viewer = new TreeViewer(Arrays.asList(XQueryParser.getRuleNames()),parseTree);
//        viewer.setScale(1.5); // Scale a little
//        panel.add(viewer);
//        frame.add(panel);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);

        ArrayList<Node> ans = visitor.visit(parseTree);
        if(ans.isEmpty()){
            System.out.println("NO MATCHING RESULTS");
            return "NO MATCHING RESULTS";
        }
        StringWriter writer = new StringWriter();
        Result result = new StreamResult(writer);
        for(Node node : ans){
            if(node.getNodeType() == Node.DOCUMENT_NODE){
                System.out.println("ROOT NODE!");
            }else{
                pretty(node, result);
                if(node.getNodeType() == Node.TEXT_NODE) {
                	System.out.println("");
                }
            }
        }
        return writer.toString();
    }
}
