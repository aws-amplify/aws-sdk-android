package com.amazonaws.util;


import org.junit.Assert;
import org.junit.Test;

public class EncodingSchemeEnumTests {

    @Test
    public void encodingScheme() {
        Assert.assertEquals("dGVzdHN0cmluZw==",
                EncodingSchemeEnum.BASE64.encodeAsString("teststring".getBytes(StringUtils.UTF8)));
        Assert.assertEquals("teststring",
                new String(EncodingSchemeEnum.BASE64.decode("dGVzdHN0cmluZw==")));

        Assert.assertEquals("ORSXG5DTORZGS3TH",
                EncodingSchemeEnum.BASE32.encodeAsString("teststring".getBytes(StringUtils.UTF8)));
        Assert.assertEquals("teststring",
                new String(EncodingSchemeEnum.BASE32.decode("ORSXG5DTORZGS3TH")));

        Assert.assertEquals("74657374737472696E67",
                EncodingSchemeEnum.BASE16.encodeAsString("teststring".getBytes(StringUtils.UTF8)));
        Assert.assertEquals("teststring",
                new String(EncodingSchemeEnum.BASE16.decode("74657374737472696E67")));

    }

}
