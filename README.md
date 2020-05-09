# XQuery-Processor-Web
XQuery-Processor-Web is a website for Xquery Processing, developed with Eclipse, Spring Boot, Maven.

## Build
Use Maven to compile the project by executing the following command:
```
mvn compile
```
## Usage
Run the program as a Spring Boot App.

Open http://localhost:8080/, upload xml files, and enter your query.

For example, enter the following XQuery, and click 'Submit',

```
<acts> { for $a in doc("j_caesar.xml")//ACT

         where empty ( for $sp in $a/SCENE/SPEECH/SPEAKER
           
                       where $sp/text() = "CASCA" 
                            
                       return <speaker> {$sp/text()}</speaker> )
                            
         return <act>{$a/TITLE/text()}</act>
           
}</acts>
```

the result will be displayed on the website.
```
<acts>

    <act>ACT IV</act>
  
    <act>ACT V</act>
  
</acts>
```
