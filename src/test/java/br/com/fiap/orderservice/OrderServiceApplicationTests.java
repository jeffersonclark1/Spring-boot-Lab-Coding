package br.com.fiap.orderservice;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.Normalizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootTest
class OrderServiceApplicationTests {

	@Test
	public void trueRotator(){
		Polin polin = new Polin();
		boolean result1 = polin.ehPalindromo("Rotator".toLowerCase());
		Assertions.assertTrue(result1);
	}
	@Test
		public void truebob(){
		Polin polin = new Polin();
		boolean result2 = polin.ehPalindromo("bob");
		Assertions.assertTrue(result2);
	}
	@Test
	public void truemadam(){
		Polin polin = new Polin();
		boolean result3 = polin.ehPalindromo("madam");
		Assertions.assertTrue(result3);
	}
	@Test
	public void truemAlAyAlam(){
		Polin polin = new Polin();
		boolean result4 = polin.ehPalindromo("mAlAyAlam".toLowerCase());
		Assertions.assertTrue(result4);
	}
	@Test
	public void true1(){
		Polin polin = new Polin();
		boolean result5 = polin.ehPalindromo("1");
		Assertions.assertTrue(result5);
	}
	@Test
	public void trueAblewasIereIsawElba(){
		Polin polin = new Polin();
		boolean result6 = polin.ehPalindromo(removerAcentos("Able was I, ere I saw Elba"));
		Assertions.assertTrue(result6);
	}
	@Test
	public void trueMadamImAdam(){
		Polin polin = new Polin();
		boolean result7 = polin.ehPalindromo(removerAcentos("Madam I'm Adam"));
		Assertions.assertTrue(result7);
	}
	@Test
	public void trueSteponnopets(){
		Polin polin = new Polin();
		boolean result8 = polin.ehPalindromo(removerAcentos("Step on no pets."));
		Assertions.assertTrue(result8);
		}
	@Test
	public void trueTopspot(){
		Polin polin = new Polin();
		boolean result9 = polin.ehPalindromo(removerAcentos("Top spot!"));
		Assertions.assertTrue(result9);
	}
	@Test
	public void true02022020(){
		Polin polin = new Polin();
		boolean result10 = polin.ehPalindromo(removerAcentos("02/02/2020"));
		Assertions.assertTrue(result10);
	}

	@Test
	public void falsexyz (){
		Polin polin = new Polin();
		boolean result = polin.ehPalindromo("xyz");
		Assertions.assertFalse(result);
	}
	@Test
	public void falseelephant (){
		Polin polin = new Polin();
		boolean result = polin.ehPalindromo("elephant");
		Assertions.assertFalse(result);
	}
	@Test
	public void falseCountry (){
		Polin polin = new Polin();
		boolean result = polin.ehPalindromo("Country");
		Assertions.assertFalse(result);
	}
	@Test
	public void falseToppost (){
		Polin polin = new Polin();
		boolean result = polin.ehPalindromo("Top . post!");
		Assertions.assertFalse(result);
	}
	@Test
	public void falseWonderfulfool (){
		Polin polin = new Polin();
		boolean result = polin.ehPalindromo("Wonderful-fool");
		Assertions.assertFalse(result);
	}
	@Test
	public void falseWildimagination (){
		Polin polin = new Polin();
		boolean result = polin.ehPalindromo("Wild imagination!");
		Assertions.assertFalse(result);
	}

	public static String removerAcentos(String str) {

		return str.replaceAll("/", "")
				.replaceAll("'", "")
				.replaceAll(",", "")
				.replaceAll(".", "")
				.replaceAll("!", "").toLowerCase();
	}
}
