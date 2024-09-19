package execuationPack;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import basepack.BaseClass;
import pageFact.LoginPage;

public class Exe extends BaseClass{
	
	Exe ex;
	
	@Before
	public void broserMessage() {
		System.out.println("browser opening");
	}
	
	
	@Test
	public void orngHRMSitTest() throws IOException {
		ex = new Exe();
		ex.browserLaunch();
		ex.sitUrl(ex.pro("url"));
		
		LoginPage lp = new LoginPage();
		
		ex.type(lp.getUserName(), ex.pro("userName"));
		ex.type(lp.getPassWord(), ex.pro("passWord"));
		ex.elementClick(lp.getLoginBtn());
		
	}
	
	@After
	public void browserClosedMessage() {
		ex.closeBorowser();
		System.out.println("browser Closed");
	}

}
