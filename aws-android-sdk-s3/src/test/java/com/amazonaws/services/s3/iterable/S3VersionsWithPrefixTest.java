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

package com.amazonaws.services.s3.iterable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

import com.amazonaws.services.s3.model.ListVersionsRequest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

public class S3VersionsWithPrefixTest extends S3VersionsTestCommon {

    @Before
    public void setUp() throws Exception {
        s3Versions = S3Versions.withPrefix(s3, "my-bucket", "photos/");
    }

    @Test
    public void testSetsBucket() throws Exception {
        assertEquals("my-bucket", s3Versions.getBucketName());
    }

    @Test
    public void testSetsPrefix() throws Exception {
        assertEquals("photos/", s3Versions.getPrefix());
    }

    @Test
    public void testSetsS3Client() throws Exception {
        assertSame(s3, s3Versions.getS3());
    }

    @Test
    public void testSetsPrefixOnRequest() throws Exception {
        s3Versions.iterator().hasNext();

        ArgumentCaptor<ListVersionsRequest> listCaptor = ArgumentCaptor
                .forClass(ListVersionsRequest.class);
        verify(s3).listVersions(listCaptor.capture());
        assertEquals("photos/", listCaptor.getValue().getPrefix());
    }

}
