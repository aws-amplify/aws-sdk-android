package com.amazonaws.mobileconnectors.iot;

import org.junit.Test;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;

import static org.junit.Assert.*;

public class Asn1ObjectTest {

    private static final byte DER_CONSTRUCTED = 0x20;

    @Test
    public void testCreationDerConstructed() throws Exception {
        byte[] testValue = {0x00, 0x01, 0x02, 0x03, 0x04};
        Asn1Object asn1Object = new Asn1Object(DerParser.NUMERIC_STRING | DER_CONSTRUCTED, 5, testValue);
        assertEquals(DerParser.NUMERIC_STRING, asn1Object.getType());
        assertEquals(5, asn1Object.getLength());
        assertEquals(testValue, asn1Object.getValue());
        assertTrue(asn1Object.isConstructed());
    }

    @Test
    public void testCreationDerNotConstructed() throws Exception {
        byte[] testValue = {0x00, 0x01, 0x02, 0x03, 0x04};
        Asn1Object asn1Object = new Asn1Object(DerParser.NUMERIC_STRING, 5, testValue);
        assertEquals(DerParser.NUMERIC_STRING, asn1Object.getType());
        assertEquals(5, asn1Object.getLength());
        assertEquals(testValue, asn1Object.getValue());
        assertFalse(asn1Object.isConstructed());
    }

    @Test
    public void testGetParser() throws Exception {
        byte[] testValue = {0x00, 0x01, 0x02, 0x03, 0x04};
        Asn1Object asn1Object = new Asn1Object(DerParser.NUMERIC_STRING | DER_CONSTRUCTED, 5, testValue);

        assertTrue(asn1Object.getParser() instanceof DerParser);
    }

    @Test(expected=IOException.class)
    public void testGetParserNotConstructed() throws Exception {
        byte[] testValue = {0x00, 0x01, 0x02, 0x03, 0x04};
        Asn1Object asn1Object = new Asn1Object(DerParser.NUMERIC_STRING, 5, testValue);

        asn1Object.getParser();
    }

    @Test
    public void testGetInteger() throws Exception {
        byte[] testValue = {0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        Asn1Object asn1Object = new Asn1Object(DerParser.INTEGER, 8, testValue);

        BigInteger testBigInteger = asn1Object.getInteger();
        assertTrue(Arrays.equals(testValue, testBigInteger.toByteArray()));
    }

    @Test(expected=IOException.class)
    public void testGetIntegerNotInteger() throws Exception {
        byte[] testValue = {0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};
        Asn1Object asn1Object = new Asn1Object(DerParser.GENERAL_STRING, 8, testValue);

        BigInteger testBigInteger = asn1Object.getInteger();
    }

    @Test
    public void testGetStringType1() throws Exception {
        final String TEST_STRING = "my fancy test string";

        Asn1Object asn1Object = new Asn1Object(DerParser.GENERAL_STRING, TEST_STRING.length(), TEST_STRING.getBytes("ISO-8859-1"));

        assertEquals(TEST_STRING, asn1Object.getString());
    }

    @Test
    public void testGetStringType2() throws Exception {
        final String TEST_STRING = "my fancy test string";

        Asn1Object asn1Object = new Asn1Object(DerParser.BMP_STRING, TEST_STRING.length(), TEST_STRING.getBytes("UTF-16BE"));

        assertEquals(TEST_STRING, asn1Object.getString());
    }

    @Test
    public void testGetStringType3() throws Exception {
        final String TEST_STRING = "my fancy test string";

        Asn1Object asn1Object = new Asn1Object(DerParser.UTF8_STRING, TEST_STRING.length(), TEST_STRING.getBytes("UTF-8"));

        assertEquals(TEST_STRING, asn1Object.getString());
    }

    @Test(expected=IOException.class)
    public void testGetStringBad1() throws Exception {
        final String TEST_STRING = "my fancy test string";

        Asn1Object asn1Object = new Asn1Object(DerParser.UNIVERSAL_STRING, TEST_STRING.length(), TEST_STRING.getBytes());

        asn1Object.getString();
    }

    @Test(expected=IOException.class)
    public void testGetStringBad2() throws Exception {
        final String TEST_STRING = "my fancy test string";

        Asn1Object asn1Object = new Asn1Object(DerParser.INTEGER, TEST_STRING.length(), TEST_STRING.getBytes());

        asn1Object.getString();
    }
}