/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.S3ResponseMetadata;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.StorageClass;

import org.junit.Test;

public class AbstractS3ResponseHandlerTest {

    @Test
    public void testNeedConnectionLeftOpen() {
        assertFalse(new TClass().needsConnectionLeftOpen());
    }

    @Test
    public void testParseResponseMetadata() {
        HttpResponse response = new HttpResponse.Builder()
                .header(Headers.REQUEST_ID, "testId")
                .header(Headers.EXTENDED_REQUEST_ID, "extendedId")
                .build();

        TClass handler = new TClass();

        AmazonWebServiceResponse<String> result = handler.parseResponseMetadata(response);
        assertEquals(result.getResponseMetadata().getRequestId(), "testId");
        assertEquals(((S3ResponseMetadata) result.getResponseMetadata()).getHostId(), "extendedId");
    }

    @Test
    public void testPopulateObjectMetadata() {
        HttpResponse response = new HttpResponse.Builder()
                .header(Headers.REQUEST_ID, "testId")
                .header(Headers.EXTENDED_REQUEST_ID, "extendedId")
                .header(Headers.S3_USER_METADATA_PREFIX + "userKey", "userValue")
                .header(Headers.LAST_MODIFIED, "Sun, 1 Jan 2006 12:00:00 GMT")
                .header(Headers.CONTENT_LENGTH, "5")
                .header(Headers.ETAG, "Etag")
                .header(Headers.EXPIRES, "Sun, 1 Jan 2006 12:00:00 GMT")
                .header(Headers.EXPIRATION,
                        "expiry-date=\"Fri, 21 Dec 2012 00:00:00 GMT\", rule-id=\"Rule for testfile.txt\"")
                .header(Headers.RESTORE,
                        "ongoing-request=\"false\", expiry-date=\"Wed, 07 Nov 2012 00:00:00 GMT\"")
                .header("UndefinedKey", "UndefinedValue")
                .header(Headers.STORAGE_CLASS, "STANDARD_IA")
                .build();

        ObjectMetadata om = new ObjectMetadata();

        TClass handler = new TClass();
        handler.populateObjectMetadata(response, om);

        assertNull(om.getRawMetadataValue(Headers.REQUEST_ID));
        assertNull(om.getRawMetadataValue(Headers.EXTENDED_REQUEST_ID));
        assertEquals(om.getUserMetaDataOf("userKey"), "userValue");
        assertEquals(1136116800000L, om.getLastModified().getTime());
        assertEquals(om.getContentLength(), 5);
        assertEquals(om.getETag(), "Etag");
        assertEquals(1356048000000L, om.getExpirationTime().getTime());
        assertEquals(1136116800000L, om.getHttpExpiresDate().getTime());
        assertEquals("Rule for testfile.txt", om.getExpirationTimeRuleId());
        assertEquals(1352246400000L, om.getRestoreExpirationTime().getTime());
        assertFalse(om.getOngoingRestore());
        assertEquals(om.getStorageClass(), StorageClass.StandardInfrequentAccess.toString());
    }

    private class TClass extends AbstractS3ResponseHandler<String> {

        @Override
        public AmazonWebServiceResponse<String> handle(HttpResponse response) throws Exception {
            return null;
        }

    }
}
