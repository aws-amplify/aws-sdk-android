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

package com.amazonaws.mobileconnectors.s3.transfermanager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.amazonaws.services.s3.model.ResponseHeaderOverrides;

import org.junit.Test;

public class PersistableTransferTest {

    @Test
    public void testUpload() {
        PersistableUpload target = new PersistableUpload("bucketName", "key", "file",
                "multipartUploadId", 10, 1000);
        assertEquals("type", PersistableUpload.TYPE, target.getPauseType());

        String json = target.serialize();
        PersistableUpload upload = PersistableTransfer.deserializeFrom(json);
        assertEquals("type", target.getPauseType(), upload.getPauseType());
        assertEquals("bucketName", target.getBucketName(), upload.getBucketName());
        assertEquals("key", target.getKey(), upload.getKey());
        assertEquals("file", target.getFile(), upload.getFile());
        assertEquals("multipartUploadId", target.getMultipartUploadId(),
                upload.getMultipartUploadId());
        assertTrue("partSize", target.getPartSize() == upload.getPartSize());
        assertTrue("multipartUploadThreshold",
                target.getMutlipartUploadThreshold() == upload.getMutlipartUploadThreshold());
    }

    @Test
    public void testDownload() {
        long[] range = new long[] {
                0, 1000
        };
        ResponseHeaderOverrides responseHeaders = new ResponseHeaderOverrides();
        responseHeaders.setCacheControl("cacheControls");
        responseHeaders.setContentDisposition("contentDisposition");
        responseHeaders.setContentEncoding("contentEncoding");
        responseHeaders.setContentLanguage("contentLanguage");
        responseHeaders.setContentType("contentType");
        responseHeaders.setExpires("expires");

        PersistableDownload target = new PersistableDownload("bucketName", "key", "versionId",
                range, responseHeaders, true, "file");
        assertEquals("type", PersistableDownload.TYPE, target.getPauseType());

        String json = target.serialize();
        PersistableDownload download = PersistableTransfer.deserializeFrom(json);
        assertEquals("type", target.getPauseType(), download.getPauseType());
        assertEquals("bucketName", target.getBucketName(), download.getBucketName());
        assertEquals("key", target.getKey(), download.getKey());
        assertEquals("versionId", target.getVersionId(), download.getVersionId());
        assertTrue("range size", target.getRange().length == download.getRange().length);
        assertTrue(target.getRange()[0] == download.getRange()[0]);
        assertTrue(target.getRange()[1] == download.getRange()[1]);
        assertTrue("isRequesterPays", target.isRequesterPays() == download.isRequesterPays());
        assertEquals("file", target.getFile(), download.getFile());

        assertEquals("cacheControl", responseHeaders.getCacheControl(),
                download.getResponseHeaders().getCacheControl());
        assertEquals("contentDisposition", responseHeaders.getContentDisposition(),
                download.getResponseHeaders().getContentDisposition());
        assertEquals("contentEncoding", responseHeaders.getContentEncoding(),
                download.getResponseHeaders().getContentEncoding());
        assertEquals("contentLanguage", responseHeaders.getContentLanguage(),
                download.getResponseHeaders().getContentLanguage());
        assertEquals("contentType", responseHeaders.getContentType(),
                download.getResponseHeaders().getContentType());
        assertEquals("expires", responseHeaders.getExpires(),
                download.getResponseHeaders().getExpires());
    }

}
