package tinyBotExample;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;


public class testHtmlUnit {

		public static void main(String[] args) throws Exception{
			WebClient webClient = new WebClient();
			HtmlPage page = webClient.getPage("http://google.com.ar");
			System.out.println("TITLE : "+ page.getTitleText() );
			
		}
	
}
