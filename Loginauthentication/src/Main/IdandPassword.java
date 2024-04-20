package Main;

import java.util.HashMap;

public class IdandPassword {
 HashMap<String,String> logininfo = new HashMap<String,String>();
 IdandPassword(){
	 logininfo.put("Priya", "Priya");
	 logininfo.put("Brometheus", "Password");
	 logininfo.put("brocode", "abc123");
	 
 }
 protected HashMap getLogininfo() {
	 return logininfo;
 }
}
