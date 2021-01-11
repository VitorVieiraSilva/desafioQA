package desafioQA;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.junit.Assert;

public class testesUI {
	
	

	private By driver;

	@Test
	public void validacaoCampos() {
	System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
	 
	 
	 //Valida se campos estão presentes e visíveis na tela
	 
	 driver.findElements(By.name("perfil")).get(0).isDisplayed();
	 driver.findElements(By.name("perfil")).get(1).isDisplayed();
	 driver.findElement(By.id("valorAplicar")).isDisplayed();
	 driver.findElement(By.id("valorInvestir")).isDisplayed();
	 driver.findElement(By.id("tempo")).isDisplayed();
	 driver.findElement(By.cssSelector(".btSelect > .btn")).click();
	 driver.findElement(By.linkText("Meses")).isDisplayed();
	 driver.findElement(By.linkText("Anos")).isDisplayed();
	 driver.findElement(By.linkText("Limpar formulário")).isDisplayed();
	 driver.findElement(By.cssSelector(".btnSimular")).isDisplayed();
	 driver.quit();
	   
	}
	
	@Test
	public void validacaoMinimoObrigatorio() {
		System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
		
		//Tenta enviar o formulário sem dados, para validar valor mínimo e campo obrigatório
		
		driver.findElement(By.cssSelector(".btnSimular")).click();
		   Assert.assertEquals("Valor mínimo de 20.00", driver.findElement(By.id("valorAplicar-error")).getText());
		   Assert.assertEquals("Valor mínimo de 20.00", driver.findElement(By.id("valorInvestir-error")).getText());
		   Assert.assertEquals("Obrigatório", driver.findElement(By.id("tempo-error")).getText());
		 
		driver.quit();   
		 		
	}
	
	 @Test
	  public void testePerfilParaVoceMeses() {
		System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
	    driver.findElement(By.id("valorAplicar")).sendKeys("5.000,00");
	    driver.findElement(By.id("valorInvestir")).sendKeys("300,00");
	    driver.findElement(By.id("tempo")).sendKeys("48");
	    driver.findElement(By.cssSelector(".btnSimular")).click();
	    
	    	Assert.assertEquals("48 meses", driver.findElement(By.cssSelector("strong:nth-child(1)")).getText());
	    	Assert.assertEquals("R$ 20.085", driver.findElement(By.cssSelector(".valor")).getText());
	    driver.quit();
	   
	  }
	 
	 @Test
	  public void testePerfilParaVoceAnos() {
		System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
	    driver.findElement(By.id("valorAplicar")).sendKeys("5.000,00");
	    driver.findElement(By.id("valorInvestir")).sendKeys("300,00");
	    driver.findElement(By.id("tempo")).sendKeys("2");
	    driver.findElement(By.cssSelector(".btn > .seta")).click();
	    driver.findElement(By.linkText("Anos")).click();
	    driver.findElement(By.cssSelector(".btnSimular")).click();
	    
	    	Assert.assertEquals("24 meses", driver.findElement(By.cssSelector("strong:nth-child(1)")).getText());
	    	Assert.assertEquals("R$ 12.438", driver.findElement(By.cssSelector(".valor")).getText());
	    driver.quit();
	   
	  }
	 
	 @Test
	  public void testePerfilParaEmpresaMeses() {
		 System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
		driver.findElements(By.name("perfil")).get(1).click();
		driver.findElement(By.id("valorAplicar")).sendKeys("5.000,00");
		driver.findElement(By.id("valorInvestir")).sendKeys("300,00");
		driver.findElement(By.id("tempo")).sendKeys("48");
		driver.findElement(By.cssSelector(".btnSimular")).click();
		    
		    Assert.assertEquals("48 meses", driver.findElement(By.cssSelector("strong:nth-child(1)")).getText());
		    Assert.assertEquals("R$ 20.085", driver.findElement(By.cssSelector(".valor")).getText());
		driver.quit();
	   
	  }
	 
	 @Test
	  public void testePerfilEmpresaAnos() {
		System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
		driver.findElements(By.name("perfil")).get(1).click();
	    driver.findElement(By.id("valorAplicar")).sendKeys("5.000,00");
	    driver.findElement(By.id("valorInvestir")).sendKeys("300,00");
	    driver.findElement(By.id("tempo")).sendKeys("2");
	    driver.findElement(By.cssSelector(".btn > .seta")).click();
	    driver.findElement(By.linkText("Anos")).click();
	    driver.findElement(By.cssSelector(".btnSimular")).click();
	    
	    	Assert.assertEquals("24 meses", driver.findElement(By.cssSelector("strong:nth-child(1)")).getText());
	    	Assert.assertEquals("R$ 12.438", driver.findElement(By.cssSelector(".valor")).getText());
	    driver.quit();
	   
	  }
	 
	 @Test
	  public void testeLimparFormulario() {
		System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
	    driver.findElement(By.id("valorAplicar")).sendKeys("5.000,00");
	    driver.findElement(By.id("valorInvestir")).sendKeys("300,00");
	    driver.findElement(By.id("tempo")).sendKeys("48");
	    	    
	    	Assert.assertEquals("5.000,00", driver.findElement(By.id("valorAplicar")).getAttribute("value"));
	    	Assert.assertEquals("300,00", driver.findElement(By.id("valorInvestir")).getAttribute("value"));
	    	Assert.assertEquals("48", driver.findElement(By.id("tempo")).getAttribute("value"));
	    	
	    driver.findElement(By.cssSelector(".btnLimpar")).click();
	    	Assert.assertTrue(driver.findElement(By.id("valorAplicar")).getText().isEmpty());
	    	Assert.assertTrue(driver.findElement(By.id("valorInvestir")).getText().isEmpty());
	    	Assert.assertTrue(driver.findElement(By.id("tempo")).getText().isEmpty());
	    
	    driver.quit();
	   
	  }
	 
	 @Test
	  public void testeRefazerSimulacao() {
		System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
	    driver.findElement(By.id("valorAplicar")).sendKeys("5.000,00");
	    driver.findElement(By.id("valorInvestir")).sendKeys("300,00");
	    driver.findElement(By.id("tempo")).sendKeys("48");
	    driver.findElement(By.cssSelector(".btnSimular")).click();
	    
	    	Assert.assertEquals("48 meses", driver.findElement(By.cssSelector("strong:nth-child(1)")).getText());
	    	Assert.assertEquals("R$ 20.085", driver.findElement(By.cssSelector(".valor")).getText());
	    	
	    driver.findElement(By.cssSelector(".btnRefazer")).click();
	    	Assert.assertTrue(driver.findElement(By.id("valorAplicar")).getText().isEmpty());
	    	Assert.assertTrue(driver.findElement(By.id("valorInvestir")).getText().isEmpty());
	    	Assert.assertTrue(driver.findElement(By.id("tempo")).getText().isEmpty());
	    	    	
	    driver.quit();
	   
	  }
	 
	
	 @Test
		public void validacaoValorMaximo() {
			System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.sicredi.com.br/html/ferramenta/simulador-investimento-poupanca/");
			
			
			
			driver.findElement(By.id("valorAplicar")).sendKeys("9.999.999.99");
		    driver.findElement(By.id("valorInvestir")).sendKeys("9.999.999.99");
		    driver.findElement(By.id("tempo")).sendKeys("48");
			
			driver.findElement(By.cssSelector(".btnSimular")).click();
			   Assert.assertEquals("Máximo de 9999999.00", driver.findElement(By.id("valorAplicar-error")).getText());
			   Assert.assertEquals("Máximo de 9999999.00", driver.findElement(By.id("valorInvestir-error")).getText());
			   
			 
			driver.quit();   
			 		
		}
	  
	
	
	

	
		
		

	
}


