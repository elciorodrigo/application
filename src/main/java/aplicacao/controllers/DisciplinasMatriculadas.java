package aplicacao.controllers;


import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class DisciplinasMatriculadas {
	

	public void pegarDisciplinas(Connection.Response response) throws IOException{
		
		Document homePage = Jsoup.connect("http://www.sectrainfo.com.br/web_logatti/DisciplinasMatriculadas.aspx")
		       .cookies(response.cookies())
		        .get();
		
		for(int i=0; i < homePage.getElementsByTag("td").size(); i++){
				
				if(homePage.getElementsByTag("td").get(i).text().equals("M")){
					
					
					
					System.out.println(homePage.getElementsByTag("td").get(i+2).text() + 
			     	" : " +homePage.getElementsByTag("td").get(i+3).text()+
					" : " + homePage.getElementsByTag("td").get(i+4).text()+
					" : " + homePage.getElementsByTag("td").get(i+5).text()+
					" : " + homePage.getElementsByTag("td").get(i+6).text());
				}
			
		}
		
	//System.out.println(homePage.toString());
		
	
		
		
	}

}