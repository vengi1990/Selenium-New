package pom;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;


public class Mainclass extends Baseclass {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		getdriver("chrome");
 		url("http://automationpractice.com/index.php?controller=authentication&back=my-account");
 		// webelement call from profindby2
 		PageFactory.initElements(driver, Profindby2.class);
		sk(Profindby2.email,"demo307@gmail.com");
		sk(Profindby2.password,"Project@123");
		clicks(Profindby2.login);
		clicks(Profindby2.menu);
		mouseover(Profindby2.mouseover);
		mouseoverclick(Profindby2.addtocartbutton);
		//Thread.sleep(3000);
		mouseoverclick(Profindby2.addcart);
		clicks(Profindby2.column);
		clicks(Profindby2.button);
		clicks(Profindby2.agree);
		clicks(Profindby2.checkout);
		clicks(Profindby2.payment);
		clicks(Profindby2.confirm);
		javascript(Profindby2.news);
		ss();
		mouseoverclick(Profindby2.backtoorder);
		javascript(Profindby2.price);
		ss();
		driverclose();

	}

	

}
