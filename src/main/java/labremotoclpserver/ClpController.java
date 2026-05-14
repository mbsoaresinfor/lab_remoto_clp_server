package labremotoclpserver;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClpController {

	private Map<String,Integer> statusInterfaces = new LinkedHashMap<String,Integer>();
	
	public ClpController() {
		statusInterfaces.put("OUT1", 1);
		statusInterfaces.put("OUT2", 0);
		statusInterfaces.put("OUT3", 1);
		statusInterfaces.put("OUT4", 1);
		statusInterfaces.put("OUT5", 0);
		statusInterfaces.put("OUT6", 1);
		statusInterfaces.put("OUT7", 1);
		statusInterfaces.put("OUT8", 0);
		statusInterfaces.put("OUT9", 0);
		statusInterfaces.put("OUT10", 1);
	}
	
	 @GetMapping("/lerSaidaDigitais")
	 public String lerSaidaDigitais(){
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
	 
	 @PostMapping("/gravarInterfaces")
	 public void gravarInterfaces(@RequestBody String valor) {
		 
		 System.out.println("gravarInterfaces: " + valor);
	 }
	
	
}
