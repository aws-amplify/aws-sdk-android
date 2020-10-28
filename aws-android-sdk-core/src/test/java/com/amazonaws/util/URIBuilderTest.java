/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.util;

import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.assertEquals;

/**
 * Tests that URI builder can construct URI as expected.
 */
public class URIBuilderTest {
    /**
     * Tests that URI fails to build if no component is provided.
     * @throws URISyntaxException if URI fails to build
     */
    @Test(expected = URISyntaxException.class)
    public void testEmptyBuildFromScratch() throws URISyntaxException {
        URIBuilder.builder().build();
    }

    /**
     * Tests that URI defaults to secure HTTPS protocol if no scheme
     * is provided.
     * @throws URISyntaxException if URI fails to build
     */
    @Test
    public void testSchemeDefaultsToHttps() throws URISyntaxException {
        URI uri = URIBuilder.builder()
                .host("amazon.com")
                .build();
        assertEquals(URI.create("https://amazon.com"), uri);
    }

    /**
     * Tests that URI correctly overrides default protocol if scheme
     * is provided.
     * @throws URISyntaxException if URI fails to build
     */
    @Test
    public void testSchemeOverride() throws URISyntaxException {
        URI uri = URIBuilder.builder()
                .scheme("http")
                .host("amazon.com")
                .build();
        assertEquals(URI.create("http://amazon.com"), uri);
    }

    /**
     * Tests that invalid URI causes URI build to fail.
     * @throws URISyntaxException if URI fails to build
     */
    @Test(expected = URISyntaxException.class)
    public void testInvalidBuildFromScratch() throws URISyntaxException {
        URIBuilder.builder().host("amazon..com").build();
    }

    /**
     * Tests that builder is configured with given URI.
     * @throws URISyntaxException if URI fails to build
     */
    @Test
    public void testURIPassThrough() throws URISyntaxException {
        URI oldUri = URI.create("https://www.amazon.com/");
        URI newUri = URIBuilder.builder(oldUri).build();
        assertEquals(oldUri, newUri);
    }

    /**
     * Tests that URI component can be replaced with a new value.
     * @throws URISyntaxException if URI fails to build
     */
    @Test
    public void testURIComponentReplacement() throws URISyntaxException {
        URI oldUri = URI.create("http://localhost:8888/foo/bar");
        URI newUri = URIBuilder.builder(oldUri)
                .host("127.0.0.1")
                .port(8000)
                .build();
        assertEquals(URI.create("http://127.0.0.1:8000/foo/bar"), newUri);
    }

    /**
     * Tests that URI component can be added.
     * @throws URISyntaxException if URI fails to build
     */
    @Test
    public void testURIComponentAddition() throws URISyntaxException {
        URI oldUri = URI.create("http://localhost/foo/bar");
        URI newUri = URIBuilder.builder(oldUri)
                .port(8000)
                .build();
        assertEquals(URI.create("http://localhost:8000/foo/bar"), newUri);
    }

    /**
     * Tests that URI components can be removed.
     * @throws URISyntaxException if URI fails to build
     */
    @Test
    public void testURIComponentRemoval() throws URISyntaxException {
        URI oldUri = URI.create("https://www.amazon.com/foo/bar?key=value");
        URI newUri = URIBuilder.builder(oldUri)
                .path(null)
                .build();
        assertEquals(URI.create("https://www.amazon.com?key=value"), newUri);
    }
}
