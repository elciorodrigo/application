package aplicacao.api;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import aplicacao.controllers.DadosCadastraisController;
import aplicacao.model.DadosCadastrais;

@RestController
public class DadosCadastraisAPI {
		
		@Autowired
		private DadosCadastraisController dadosCadastrais;
		
		@ResponseBody
		@CrossOrigin(origins = "*")
		@RequestMapping(value = "/dadosCadastrais", method = RequestMethod.GET)
		public DadosCadastrais listar(HttpServletResponse response) throws IOException {
			
			return dadosCadastrais.carregarDados();
	    }
	
}
