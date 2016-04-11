package aplicacao.api;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import aplicacao.controllers.DadosCadastraisController;
import aplicacao.filtros.Login;
import aplicacao.model.DadosCadastrais;

@RestController
public class DadosCadastraisAPI {
		
		@Autowired
		private DadosCadastraisController dadosCadastrais;
		
		
		@CrossOrigin(origins = "*")
		@RequestMapping(value = "/dadosCadastrais", method = RequestMethod.GET)
		public DadosCadastrais logar(Login login) throws IOException {
			/*
			 * teste=== commit 
			 */
			return dadosCadastrais.carregarDados(login);
	    }
	    
		
	
	
}
