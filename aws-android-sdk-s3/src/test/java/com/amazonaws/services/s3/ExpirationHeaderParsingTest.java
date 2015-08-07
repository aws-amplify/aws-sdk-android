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

package com.amazonaws.services.s3;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler;
import com.amazonaws.services.s3.internal.ObjectExpirationResult;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class ExpirationHeaderParsingTest {

    @Test
    public void testParseEmptyExpirationHeader() {
        MockObjectExpirationResult result = new MockObjectExpirationResult();

        ObjectExpirationHeaderHandler<MockObjectExpirationResult> handler =
                new ObjectExpirationHeaderHandler<MockObjectExpirationResult>();

        HttpResponse response = HttpResponse.builder().build();

        handler.handle(result, response);

        Assert.assertNull(result.getExpirationTime());
        Assert.assertNull(result.getExpirationTimeRuleId());
    }

    @Test
    public void testParseExpirationHeader1() {
        MockObjectExpirationResult result = new MockObjectExpirationResult();

        ObjectExpirationHeaderHandler<MockObjectExpirationResult> handler =
                new ObjectExpirationHeaderHandler<MockObjectExpirationResult>();

        HttpResponse response = HttpResponse.builder()
                .header("x-amz-expiration",
                        "expiry-date=\"Tue, 01 Jan 2013 00:00:00 GMT\", rule-id=\"Test\"")
                .build();

        handler.handle(result, response);

        Assert.assertEquals(1356998400000L,
                result.getExpirationTime().getTime());
        Assert.assertEquals("Test", result.getExpirationTimeRuleId());
    }

    @Test
    public void testParseExpirationHeader2() {
        MockObjectExpirationResult result = new MockObjectExpirationResult();

        ObjectExpirationHeaderHandler<MockObjectExpirationResult> handler =
                new ObjectExpirationHeaderHandler<MockObjectExpirationResult>();

        HttpResponse response = HttpResponse.builder()
                .header("x-amz-expiration",
                        "rule-id=\"Test\", expiry-date=\"Tue, 01 Jan 2013 00:00:00 GMT\"")
                .build();

        handler.handle(result, response);

        Assert.assertEquals(1356998400000L,
                result.getExpirationTime().getTime());
        Assert.assertEquals("Test", result.getExpirationTimeRuleId());
    }

    private static class MockObjectExpirationResult
            implements ObjectExpirationResult {

        private Date expirationTime;
        private String expirationTimeRuleId;

        @Override
        public Date getExpirationTime() {
            return expirationTime;
        }

        @Override
        public void setExpirationTime(final Date value) {
            expirationTime = value;
        }

        @Override
        public String getExpirationTimeRuleId() {
            return expirationTimeRuleId;
        }

        @Override
        public void setExpirationTimeRuleId(final String value) {
            expirationTimeRuleId = value;
        }
    }
}
