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

package com.amazonaws.services.polly.internal;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class ServiceUtilsTest {

    @Test
    public void testConvertRequestToURL() throws URISyntaxException, MalformedURLException {
        Request<String> req = new DefaultRequest<String>("AmazonPolly");

        req.setHttpMethod(HttpMethodName.GET);
        req.setEndpoint(new URI("https://polly.eu-west-1.amazonaws.com"));

        req.addParameter("Text", "Hello world!");
        req.addParameter("TextType", "ssml");
        req.addParameter("VoiceId", "Agnieszka");
        req.addParameter("SampleRate", "22050");
        req.addParameter("OutputFormat", "mp3");
        req.addParameter("LexiconName", "lex1");

        req.addParameter("X-Amz-Algorithm", "AWS4-HMAC-SHA256");
        req.addParameter("X-Amz-Credential", "TESTJDND73Z2EOXMTEST%2F20161115%2Feu-west-1%2Fpolly%2Faws4_request");
        req.addParameter("X-Amz-Date", "20161115T152228Z");
        req.addParameter("X-Amz-Expires", "900");
        req.addParameter("X-Amz-SignedHeaders", "host");
        req.addParameter("X-Amz-Signature", "73c30ade98d5aac2eb4eab02bf1734fffe030245804a6ec56a880f79a64089a3");

        URL craftedURL = ServiceUtils.convertRequestToUrl(req, true);

        Assert.assertEquals(
                craftedURL,
                new URL(
                        "https://polly.eu-west-1.amazonaws.com/?Text=Hello%20world%21&TextType=ssml&VoiceId=Agnieszka&" +
                                "SampleRate=22050&OutputFormat=mp3&LexiconName=lex1&X-Amz-Algorithm=AWS4-HMAC-SHA256&" +
                                "X-Amz-Credential=TESTJDND73Z2EOXMTEST%252F20161115%252Feu-west-1%252Fpolly%252Faws4_request&" +
                                "X-Amz-Date=20161115T152228Z&X-Amz-Expires=900&X-Amz-SignedHeaders=host&" +
                                "X-Amz-Signature=73c30ade98d5aac2eb4eab02bf1734fffe030245804a6ec56a880f79a64089a3")
                );
    }
}
