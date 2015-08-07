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
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.amazonaws.services.s3.model.ListVersionsRequest;
import com.amazonaws.services.s3.model.S3VersionSummary;
import com.amazonaws.services.s3.model.VersionListing;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.Arrays;
import java.util.Iterator;

public class S3VersionsForKeyTest extends S3VersionsTestCommon {

    @Before
    public void setUp() throws Exception {
        s3Versions = S3Versions.forKey(s3, "my-bucket", "the-key");
        setSummaryKey("the-key");
    }

    @Test
    public void testSetsBucket() throws Exception {
        assertEquals("my-bucket", s3Versions.getBucketName());
    }

    @Test
    public void testUsesNullPrefix() throws Exception {
        assertNull(s3Versions.getPrefix());
    }

    @Test
    public void testSetsKey() throws Exception {
        assertEquals("the-key", s3Versions.getKey());
    }

    @Test
    public void testStopsAtNonMatchingKey() throws Exception {
        VersionListing listing = mock(VersionListing.class);
        S3VersionSummary matchingSummary = mock(S3VersionSummary.class);
        S3VersionSummary nonMatchingSummary = mock(S3VersionSummary.class);

        when(listing.getVersionSummaries()).thenReturn(
                Arrays.asList(matchingSummary, nonMatchingSummary, matchingSummary));
        when(matchingSummary.getKey()).thenReturn("the-key");
        when(nonMatchingSummary.getKey()).thenReturn("the-other-key");
        when(s3.listVersions(any(ListVersionsRequest.class))).thenReturn(listing);

        Iterator<S3VersionSummary> iter = s3Versions.iterator();
        assertTrue(iter.hasNext());
        assertSame(matchingSummary, iter.next());
        assertFalse(iter.hasNext());
    }

    @Test
    public void testDoesNotRequestNextPageIfNonMatchingKeyWasFound() throws Exception {
        VersionListing listing = mock(VersionListing.class);
        S3VersionSummary matchingSummary = mock(S3VersionSummary.class);
        S3VersionSummary nonMatchingSummary = mock(S3VersionSummary.class);

        when(listing.getVersionSummaries()).thenReturn(
                Arrays.asList(matchingSummary, nonMatchingSummary));
        when(listing.isTruncated()).thenReturn(true);
        when(matchingSummary.getKey()).thenReturn("the-key");
        when(nonMatchingSummary.getKey()).thenReturn("the-other-key");
        when(s3.listVersions(any(ListVersionsRequest.class))).thenReturn(listing);

        Iterator<S3VersionSummary> iter = s3Versions.iterator();
        assertTrue(iter.hasNext());
        assertSame(matchingSummary, iter.next());
        assertFalse(iter.hasNext());

        verify(s3, never()).listNextBatchOfVersions(listing);
    }

    @Test
    public void testSetsKeyAsPrefixOnRequest() throws Exception {
        s3Versions.iterator().hasNext();

        ArgumentCaptor<ListVersionsRequest> listCaptor = ArgumentCaptor
                .forClass(ListVersionsRequest.class);
        verify(s3).listVersions(listCaptor.capture());
        assertEquals("the-key", listCaptor.getValue().getPrefix());
    }

}
