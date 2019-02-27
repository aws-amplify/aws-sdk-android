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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.amazonaws.services.s3.model.BucketWebsiteConfiguration;
import com.amazonaws.services.s3.model.RedirectRule;
import com.amazonaws.services.s3.model.RoutingRule;
import com.amazonaws.services.s3.model.RoutingRuleCondition;

import org.junit.After;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Integration tests for S3 bucket website configuration.
 */
public class BucketWebsiteIntegrationTest extends S3IntegrationTestBase {

    private static final String ERROR_DOCUMENT = "/errors/error.html";
    private static final String INDEX_DOCUMENT_SUFFIX = "index.html";
    private static final String bucketName = "java-sdk-website-test-" + System.currentTimeMillis();
    private static final String PREFIX = "user-profiles\\";
    private static final String ERROR_CODE = "404";
    private static final String PROTOCOL = "https";
    private static final String HOST_NAME = "ec2.nicome.com";
    private static final String NEW_PREFIX = "generate-user-profile\\";
    private static final String REDIRECT_CODE = "307";
    private static final String NEW_KEY = "new-profile\\";

    /** Releases all resources created by this test. */
    @After
    public void tearDown() throws Exception {
        super.deleteBucketAndAllContents(bucketName);
    }

    /** Tests that we can get, set, and delete a bucket's website configuration. */
    @Test
    public void testBucketWebsites() throws Exception {

        // create a test bucket
        s3.createBucket(bucketName);

        // get website bucketWebsiteConfiguration for new bucket
        BucketWebsiteConfiguration bucketWebsiteConfiguration = s3
                .getBucketWebsiteConfiguration(bucketName);
        System.out.println("bucketWebsiteConfiguration: " + bucketWebsiteConfiguration);

        // set website configuration
        bucketWebsiteConfiguration = new BucketWebsiteConfiguration(INDEX_DOCUMENT_SUFFIX,
                ERROR_DOCUMENT);
        List<RoutingRule> rules = new LinkedList<RoutingRule>();
        RoutingRule rule = new RoutingRule();
        rule.setCondition(new RoutingRuleCondition().withKeyPrefixEquals(PREFIX)
                .withHttpErrorCodeReturnedEquals(ERROR_CODE));
        rule.setRedirect(new RedirectRule().withProtocol(PROTOCOL).withHostName(HOST_NAME)
                .withHttpRedirectCode(REDIRECT_CODE)
                .withReplaceKeyPrefixWith(NEW_PREFIX));
        rules.add(rule);
        rule = new RoutingRule();
        rule.setRedirect(new RedirectRule().withHostName(HOST_NAME));
        rules.add(rule);
        rule = new RoutingRule();
        rule.setCondition(new RoutingRuleCondition().withHttpErrorCodeReturnedEquals(ERROR_CODE));
        rule.setRedirect(new RedirectRule().withReplaceKeyWith(NEW_KEY));
        rules.add(rule);
        bucketWebsiteConfiguration.setRoutingRules(rules);
        s3.setBucketWebsiteConfiguration(bucketName, bucketWebsiteConfiguration);

        // get again
        bucketWebsiteConfiguration = s3.getBucketWebsiteConfiguration(bucketName);
        assertEquals(INDEX_DOCUMENT_SUFFIX, bucketWebsiteConfiguration.getIndexDocumentSuffix());
        assertEquals(ERROR_DOCUMENT, bucketWebsiteConfiguration.getErrorDocument());
        assertEquals(3, bucketWebsiteConfiguration.getRoutingRules().size());
        assertEquals(bucketWebsiteConfiguration.getRoutingRules().get(0).getCondition()
                .getKeyPrefixEquals(), PREFIX);
        assertEquals(bucketWebsiteConfiguration.getRoutingRules().get(0).getCondition()
                .getHttpErrorCodeReturnedEquals(), ERROR_CODE);
        assertEquals(bucketWebsiteConfiguration.getRoutingRules().get(0).getRedirect()
                .getprotocol(), PROTOCOL);
        assertEquals(bucketWebsiteConfiguration.getRoutingRules().get(0).getRedirect()
                .getHostName(), HOST_NAME);
        assertEquals(bucketWebsiteConfiguration.getRoutingRules().get(0).getRedirect()
                .getHttpRedirectCode(), REDIRECT_CODE);
        assertEquals(bucketWebsiteConfiguration.getRoutingRules().get(0).getRedirect()
                .getReplaceKeyPrefixWith(), NEW_PREFIX);
        assertNull(bucketWebsiteConfiguration.getRoutingRules().get(1).getCondition());
        assertEquals(HOST_NAME, bucketWebsiteConfiguration.getRoutingRules().get(1).getRedirect()
                .getHostName());
        assertEquals("", bucketWebsiteConfiguration.getRoutingRules().get(2).getCondition()
                .getKeyPrefixEquals());
        assertEquals(NEW_KEY, bucketWebsiteConfiguration.getRoutingRules().get(2).getRedirect()
                .getReplaceKeyWith());

        // Test RedirectAllRequestsTo
        bucketWebsiteConfiguration = new BucketWebsiteConfiguration();
        bucketWebsiteConfiguration.setRedirectAllRequestsTo(new RedirectRule().withHostName(
                HOST_NAME).withProtocol(PROTOCOL));
        s3.setBucketWebsiteConfiguration(bucketName, bucketWebsiteConfiguration);
        bucketWebsiteConfiguration = s3.getBucketWebsiteConfiguration(bucketName);
        assertNotNull(bucketWebsiteConfiguration.getRedirectAllRequestsTo());
        assertEquals(HOST_NAME, bucketWebsiteConfiguration.getRedirectAllRequestsTo().getHostName());
        assertEquals(PROTOCOL, bucketWebsiteConfiguration.getRedirectAllRequestsTo().getprotocol());

        // delete
        s3.deleteBucketWebsiteConfiguration(bucketName);
        Thread.sleep(1000 * 60 * 1);

        // get again
        bucketWebsiteConfiguration = s3.getBucketWebsiteConfiguration(bucketName);
        assertNull(bucketWebsiteConfiguration);
    }
}
