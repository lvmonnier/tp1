package fr.univ.tp;

public class StringUtils {
	
	public String reverseString(String se) {
		String ss;
		StringBuilder lettersBuff = new StringBuilder(se);
		 
	    // inverser la chaîne
		ss = lettersBuff.reverse().toString();
	 
		return ss;
	}

}
