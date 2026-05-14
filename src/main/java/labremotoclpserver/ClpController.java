package labremotoclpserver;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class ClpController {

	private String saidaDigitais = "{\"OUT1\":1,\"OUT2\":0,\"OUT3\":0,\"OUT4\":0,\"OUT5\":0,\"OUT6\":0,\"OUT7\":0,\"OUT8\":0,\"OUT9\":0,\"OUT10\":1}";
	
	// TODO impl. está com problema.
	@GetMapping("/alterarSaidaDigitais/{value}")
	 public String alterarSaidaDigitais(@PathParam("value") String value){
		 
		 saidaDigitais = value;
		 System.out.println("alterarSaidaDigitais: "+saidaDigitais );
		 return saidaDigitais;
	 }
	
	 @GetMapping("/lerSaidaDigitais")
	 public String lerSaidaDigitais(){
		 
		 
		 System.out.println("lerSaidaDigitais: "+saidaDigitais );
		 return saidaDigitais;
	 }
	 
	 @PostMapping("/gravarInterfaces")
	 public void gravarInterfaces(@RequestBody String valor) {
		 
		 System.out.println("gravarInterfaces: " + valor);
	 }
	
	
}
