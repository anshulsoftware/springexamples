package pack1;

import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {

	public static void main(String[] args) throws FileNotFoundException, ScriptException {
		 // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
       // ee.eval(new FileReader("C:\\Users\\PUSHPENDRA\\Desktop\\js\\hello.js"));  

        
        // Evaluating Nashorn code  
        ee.eval("print('Hello Nashorn');");
	}

}
