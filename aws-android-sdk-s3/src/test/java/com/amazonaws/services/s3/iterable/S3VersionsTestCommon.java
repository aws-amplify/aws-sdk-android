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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ListVersionsRequest;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.VersionListing;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class S3VersionsTestCommon {

    protected S3Versions s3Versions;
    protected AmazonS3 s3;

    private VersionListing versionListing;
    private S3VersionSummary firstSummary;
    private S3VersionSummary secondSummary;

    public S3VersionsTestCommon() {
        super();
    }

    @Before
    public void setUpSharedTests() throws Exception {
        s3 = mock(AmazonS3.class);
        versionListing = mock(VersionListing.class);
        firstSummary = mock(S3VersionSummary.class);
        secondSummary = mock(S3VersionSummary.class);

        when(s3.listVersions(any(ListVersionsRequest.class))).thenReturn(versionListing);

        when(versionListing.getVersionSummaries()).thenReturn(new ArrayList<S3VersionSummary>());
    }

    // needed so that pagination tests can work with forKey(...)
    protected void setSummaryKey(String key) {
        when(firstSummary.getKey()).thenReturn(key);
        when(secondSummary.getKey()).thenReturn(key);
        when(versionListing.getNextKeyMarker()).thenReturn(key);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveNotSupported() throws Exception {
        s3Versions.iterator().remove();
    }

    @Test
    public void testListsVersions() throws Exception {
        s3Versions.iterator().hasNext();

        ArgumentCaptor<ListVersionsRequest> listCaptor = ArgumentCaptor
                .forClass(ListVersionsRequest.class);
        verify(s3).listVersions(listCaptor.capture());
        assertEquals(s3Versions.getBucketName(), listCaptor.getValue().getBucketName());
        assertNull(listCaptor.getValue().getMaxResults());
    }

    @Test
    public void testUsesBatchSizeForMaxResults() throws Exception {
        s3Versions.withBatchSize(12).iterator().hasNext();

        ArgumentCaptor<ListVersionsRequest> listCaptor = ArgumentCaptor
                .forClass(ListVersionsRequest.class);
        verify(s3).listVersions(listCaptor.capture());
        assertEquals((Integer) 12, listCaptor.getValue().getMaxResults());
    }

    @Test
    public void testReturnsVersionsFromTheFirstPage() throws Exception {
        when(versionListing.getVersionSummaries()).thenReturn(
                Arrays.asList(firstSummary, secondSummary));

        Iterator<S3VersionSummary> iter = s3Versions.iterator();
        assertTrue(iter.hasNext());
        assertSame(firstSummary, iter.next());
        assertTrue(iter.hasNext());
        assertSame(secondSummary, iter.next());
        assertFalse(iter.hasNext());
    }

    @Test
    public void testGetsNextPageIfFirstPageIsTruncated() throws Exception {
        when(versionListing.isTruncated()).thenReturn(true);
        VersionListing secondPage = mock(VersionListing.class);
        when(s3.listNextBatchOfVersions(versionListing)).thenReturn(secondPage);

        s3Versions.iterator().hasNext();

        verify(s3).listNextBatchOfVersions(versionListing);
    }
}
