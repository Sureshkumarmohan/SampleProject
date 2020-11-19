package org.maven;

import java.io.IOException;

import org.base.LibGlobal;
import org.pojopom.fblogin;

public class SampleBase extends LibGlobal {
	
	public static void main(String[] args) throws IOException{
		browserLaunch();
		
		enterUrl("https://www.facebook.com");
		
		fblogin log = new fblogin();
		enterValue(log.getTxtuser(),"Sureshkumar");
		enterValue(log.getTxtpass(),"123456");
		btnclick(log.getBtnlogin());
		
	}

}
