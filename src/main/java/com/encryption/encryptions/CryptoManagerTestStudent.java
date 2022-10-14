package com.encryption.encryptions;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

/*
 * Class: CMSC203
 * Instructor:
 * Description: This is a test class that tests the encryption and decryption of a phrase using two
 * different approaches: Caesar Cipher and Bellaso Cipher
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
   Print your Name here: __________
*/

public class CryptoManagerTestStudent {
	CryptoManager cryptoManager;

	@Test
	public void testStringInBounds() {
		assertFalse(CryptoManager.isStringInBounds("java2022"));
		assertTrue(CryptoManager.isStringInBounds("TEST"));
		assertFalse(CryptoManager.isStringInBounds("FAIL{"));
		assertTrue(CryptoManager.isStringInBounds("\"TITLE\""));
		assertTrue(CryptoManager.isStringInBounds("0123ZXC"));
	}

	@Test
	public void testEncryptCaesar() {
		assertEquals("The selected string is not in bounds, Try again.", CryptoManager.caesarEncryption("hello", 12));
		assertEquals("&,Z", CryptoManager.caesarEncryption("QWE", 21));
		assertEquals(",-.", CryptoManager.caesarEncryption("123", 123));
		assertEquals("9:;6;:9", CryptoManager.caesarEncryption("123.321", 456));
		assertEquals("VYQ\"YQTFU", CryptoManager.caesarEncryption("TWO WORDS", 2));
	}

	@Test
	public void testDecryptCaesar() {
		assertEquals("ABCDE123", CryptoManager.caesarDecryption("./012^_ ", 45));
		assertEquals("ORIGAMI", CryptoManager.caesarDecryption("\\_VTNZV", 333));
		assertEquals("W8 4 ME", CryptoManager.caesarDecryption("A\"J^J7/", 234));
		assertEquals("WELL PLAYED", CryptoManager.caesarDecryption(")W^^2\"^S+WV", 1234));
	}

	@Test
	public void testEncryptBellaso() {
		assertEquals("$TRRF,1G+ IE'", CryptoManager.bellasoEncryption("MONDAY-FRIDAY", "WEDNESDAY"));
		assertEquals("X&T5R?&ZP", CryptoManager.bellasoEncryption("GOOD LUCK", "QWE123"));
		assertEquals("_W]Y43XS\"YSQH%", CryptoManager.bellasoEncryption("SHORT SENTENCE", "LONG SENTENCE WITH 5 WORDS"));

	}

	@Test
	public void testDecryptBellaso() {
		assertEquals("DECRYPT ME", CryptoManager.bellasoDecryption("OJ\\)(\"X+R^", "KEYWORD"));
		assertEquals("BYE", CryptoManager.bellasoDecryption("J^Q", "HELLO"));
		assertEquals("LAST TEST", CryptoManager.bellasoDecryption(" IX4,UX'(", "THE LAST"));

	}

}
