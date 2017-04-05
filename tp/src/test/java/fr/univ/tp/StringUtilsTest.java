package fr.univ.tp;

import java.util.logging.Logger;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
	private static Logger log = Logger.getLogger(MyFirstTest.class.getSimpleName());
	private StringUtils su = new StringUtils();
	
	@Test
	public void reserverStringTest() {
		log.info("Mon deuxième test");
		
		Assert.assertEquals("tset", su.reverseString("test"));
	}

}
