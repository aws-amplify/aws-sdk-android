/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.services.s3.internal;

import static org.junit.Assert.assertEquals;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ServiceUtilsTest {

    @Test
    public void testConvertRequestToURL() throws URISyntaxException, MalformedURLException {
        /**
         * Request which generates this presigned URL Request: GET
         * https://test-bucket1234.s3.amazonaws.com /TestFile.txt Parameters:
         * (AWSAccessKeyId: TESTJDND73Z2EOXMTEST, Expires: 1430878121,
         * Signature: SxXP9iKzsnIeCjYBKFS8iW/9Bus=, ) 05-05 18:08:41.265:
         * I/System.out(28304): URL:
         * https://test-bucket1234.s3.amazonaws.com/TestFile
         * .txt?AWSAccessKeyId=TESTJDND73Z2EOXMTEST
         * &Expires=1430878121&Signature=SxXP9iKzsnIeCjYBKFS8iW%2F9Bus%3D
         */
        Request<String> req = new DefaultRequest<String>("s3");
        req.setHttpMethod(HttpMethodName.GET);
        req.setEndpoint(new URI("https://test-bucket1234.s3.amazonaws.com"));
        req.setResourcePath("/TestFile.txt");
        req.withParameter("AWSAccessKeyId", "TESTJDND73Z2EOXMTEST");
        req.withParameter("Expires", "1430878121");
        req.withParameter("Signature", "SxXP9iKzsnIeCjYBKFS8iW/9Bus=");

        URL craftedURL = ServiceUtils.convertRequestToUrl(req, true);
        assertEquals(
                new URL(
                        "https://test-bucket1234.s3.amazonaws.com/TestFile.txt?AWSAccessKeyId=TESTJDND73Z2EOXMTEST&Expires=1430878121&Signature=SxXP9iKzsnIeCjYBKFS8iW%2F9Bus%3D"),
                craftedURL);
    }

    @Test
    public void testJoin() {
        List<String> list = new ArrayList<String>();
        String one = "1";
        list.add(one);
        assertEquals("1", ServiceUtils.join(list));
        String two = "2";
        list.add(two);
        assertEquals("1, 2", ServiceUtils.join(list));
        String three = "3";
        list.add(three);
        assertEquals("1, 2, 3", ServiceUtils.join(list));
    }

    @Test
    public void removeQuotes() {
        String noQuote = "noQuote";
        assertEquals("noQuote", ServiceUtils.removeQuotes(noQuote));
        String quotes = "\"quotes\"";
        assertEquals("quotes", ServiceUtils.removeQuotes(quotes));
    }

}
