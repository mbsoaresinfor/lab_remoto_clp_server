package labremotoclpserver;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClpController {

	private Map<String,Integer> statusInterfaces = new LinkedHashMap<String,Integer>();
	
	public ClpController() {
		statusInterfaces.put("OUT1", 1);
		statusInterfaces.put("OUT2", 2);
		statusInterfaces.put("OUT3", 3);
		statusInterfaces.put("OUT4", 4);
		statusInterfaces.put("OUT5", 5);
		statusInterfaces.put("OUT6", 6);
		statusInterfaces.put("OUT7", 7);
		statusInterfaces.put("OUT8", 8);
		statusInterfaces.put("OUT9", 9);
		statusInterfaces.put("OUT10", 10);
	}
	
	 @GetMapping("/getSaidaDigitais")
	 public String getSaidaDigitais(){
		 StringBuilder retorno = new StringBuilder("{");
		 int cont = 0;
		 for (Map.Entry<String, Integer> entry : statusInterfaces.entrySet()) {			 
			 retorno.append("\"").append(entry.getKey()).append("\"").append(":");
			 retorno.append(entry.getValue());
			 cont++;
			 if(cont != statusInterfaces.size()) {
				 retorno.append(",");
			 }			 
		  }
		 retorno.append("}");
		 return retorno.toString();
	 }
	
	
}
