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
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class S3ObjectsTestCommon {

    protected S3Objects s3Objects;
    protected AmazonS3 s3;

    private ObjectListing objectListing;
    private S3ObjectSummary firstSummary;
    private S3ObjectSummary secondSummary;

    public S3ObjectsTestCommon() {
        super();
    }

    @Before
    public void setUpSharedTests() throws Exception {
        objectListing = mock(ObjectListing.class);
        when(objectListing.getObjectSummaries()).thenReturn(
                new ArrayList<S3ObjectSummary>());
        when(objectListing.isTruncated()).thenReturn(false);

        s3 = mock(AmazonS3.class);
        when(s3.listObjects(any(ListObjectsRequest.class))).thenReturn(
                objectListing);

        firstSummary = mock(S3ObjectSummary.class);
        secondSummary = mock(S3ObjectSummary.class);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveNotSupported() throws Exception {
        s3Objects.iterator().remove();
    }

    @Test
    public void testCallsListObjects() throws Exception {
        s3Objects.iterator().hasNext();

        ArgumentCaptor<ListObjectsRequest> listCaptor = ArgumentCaptor
                .forClass(ListObjectsRequest.class);
        verify(s3).listObjects(listCaptor.capture());
        assertEquals(s3Objects.getBucketName(), listCaptor.getValue().getBucketName());
        assertEquals(s3Objects.getPrefix(), listCaptor.getValue().getPrefix());
        assertNull(listCaptor.getValue().getMaxKeys());
    }

    @Test
    public void testUsesBatchSizeForMaxKeys() throws Exception {
        s3Objects.withBatchSize(12).iterator().hasNext();

        ArgumentCaptor<ListObjectsRequest> listCaptor = ArgumentCaptor
                .forClass(ListObjectsRequest.class);
        verify(s3).listObjects(listCaptor.capture());
        assertEquals((Integer) 12, listCaptor.getValue().getMaxKeys());
    }

    @Test
    public void testReturnsObjectSummariesFromFirstPage() throws Exception {
        when(objectListing.getObjectSummaries()).thenReturn(
                Arrays.asList(firstSummary, secondSummary));

        Iterator<S3ObjectSummary> iter = s3Objects.iterator();
        assertTrue(iter.hasNext());
        assertSame(firstSummary, iter.next());
        assertTrue(iter.hasNext());
        assertSame(secondSummary, iter.next());
        assertFalse(iter.hasNext());

        verify(s3, times(1)).listObjects(any(ListObjectsRequest.class));
    }

    @Test
    public void testGetsNextPageWithParamsFromFirstPage() throws Exception {
        when(objectListing.isTruncated()).thenReturn(true);

        ObjectListing secondPage = mock(ObjectListing.class);
        when(secondPage.isTruncated()).thenReturn(false);
        when(s3.listNextBatchOfObjects(objectListing)).thenReturn(secondPage);

        s3Objects.iterator().hasNext();

        verify(s3).listNextBatchOfObjects(objectListing);
    }

    @Test
    public void testReturnsObjectSummariesFromMultiplePages() throws Exception {
        when(objectListing.isTruncated()).thenReturn(true);
        when(objectListing.getObjectSummaries()).thenReturn(
                Arrays.asList(firstSummary));

        ObjectListing secondPage = mock(ObjectListing.class);
        when(secondPage.isTruncated()).thenReturn(true);
        when(secondPage.getObjectSummaries()).thenReturn(
                new ArrayList<S3ObjectSummary>());
        when(s3.listNextBatchOfObjects(objectListing)).thenReturn(secondPage);

        ObjectListing thirdPage = mock(ObjectListing.class);
        when(thirdPage.isTruncated()).thenReturn(false);
        when(thirdPage.getObjectSummaries()).thenReturn(
                Arrays.asList(secondSummary));
        when(s3.listNextBatchOfObjects(secondPage)).thenReturn(thirdPage);

        Iterator<S3ObjectSummary> iter = s3Objects.iterator();
        assertTrue(iter.hasNext());
        assertSame(firstSummary, iter.next());
        assertTrue(iter.hasNext());
        assertSame(secondSummary, iter.next());
        assertFalse(iter.hasNext());
    }

}
