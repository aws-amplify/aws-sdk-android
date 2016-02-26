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

import static org.junit.Assert.assertTrue;

import com.amazonaws.mobileconnectors.s3.transfermanager.internal.TransferManagerUtils;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.ObjectMetadata;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.util.StringUtils;

import org.junit.Test;

import java.io.ByteArrayInputStream;

public class TransferManagerUtilsTest {

    /**
     * Tests that we correctly calculate an upload's part size, and don't return
     * a part size that would result in breaking the upload into more than the
     * maximum allowed number of individual parts.
     */
    @Test
    public void testCalculateOptimalPartSize() throws Exception {
        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(120 * Constants.GB);
        PutObjectRequest request = new PutObjectRequest("bucketName", "key",
                new ByteArrayInputStream("foo".getBytes(StringUtils.UTF8)), metadata);

        long partSize = TransferManagerUtils.calculateOptimalPartSize(request,
                new TransferManagerConfiguration());
        double totalParts = (double) metadata.getContentLength() / (double) partSize;

        assertTrue(totalParts <= Constants.MAXIMUM_UPLOAD_PARTS);
    }
}
