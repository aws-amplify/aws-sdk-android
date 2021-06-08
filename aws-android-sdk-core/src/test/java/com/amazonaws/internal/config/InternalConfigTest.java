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

package com.amazonaws.internal.config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import com.amazonaws.regions.Regions;

import org.junit.Test;

public class InternalConfigTest {
    @Test
    public void s3() throws Exception {
        InternalConfig config = new InternalConfig();
        s3Assertions(config);
    }

    private void s3Assertions(InternalConfig config) {
        // S3
        SignerConfig signer = config.getSignerConfig("s3");
        assertEquals("AWSS3V4SignerType", signer.getSignerType());
        // S3 BJS
        signer = config.getSignerConfig("s3", "cn-north-1");
        assertEquals("AWSS3V4SignerType", signer.getSignerType());
        // S3 us-east-1
        signer = config.getSignerConfig("s3", Regions.US_EAST_1.name());
        assertEquals("AWSS3V4SignerType", signer.getSignerType());
    }

    @Test
    public void lex() throws Exception {
        InternalConfig config = new InternalConfig();
        lexAssertions(config);
    }

    private void lexAssertions(InternalConfig config) {
        // lex
        SignerConfig signer = config.getSignerConfig("lex");
        assertEquals("AmazonLexV4Signer", signer.getSignerType());
        // lex EU
        signer = config.getSignerConfig("lex", "eu-central-1");
        assertEquals("AmazonLexV4Signer", signer.getSignerType());
        // lex us-east-1
        signer = config.getSignerConfig("lex", Regions.US_EAST_1.name());
        assertEquals("AmazonLexV4Signer", signer.getSignerType());
    }

    @Test
    public void cloudfront() throws Exception {
        InternalConfig config = new InternalConfig();
        cloudfrontAssertions(config);
    }

    private void cloudfrontAssertions(InternalConfig config) {
        SignerConfig signer = config.getSignerConfig("cloudfront");
        assertEquals("AWS4SignerType", signer.getSignerType());
    }

    @Test
    public void ec2() throws Exception {
        InternalConfig config = new InternalConfig();
        ec2Assertions(config);
    }

    private void ec2Assertions(InternalConfig config) {
        SignerConfig signer = config.getSignerConfig("ec2");
        assertEquals("QueryStringSignerType", signer.getSignerType());
        // EC2 BJS
        signer = config.getSignerConfig("ec2", "cn-north-1");
        assertEquals("AWS4SignerType", signer.getSignerType());
        // EC2 us-east-1
        signer = config.getSignerConfig("ec2", Regions.US_EAST_1.name());
        assertEquals("QueryStringSignerType", signer.getSignerType());
    }

    @Test
    public void dynamoDB() throws Exception {
        InternalConfig config = new InternalConfig();
        dynamoDBAssertions(config);
    }

    private void dynamoDBAssertions(InternalConfig config) {
        SignerConfig signer = config.getSignerConfig("dynamodb");
        assertEquals("AWS4SignerType", signer.getSignerType());
        // DynamoDB BJS
        signer = config.getSignerConfig("dynamodb", "cn-north-1");
        assertEquals("AWS4SignerType", signer.getSignerType());
        // DynamoDB us-east-1
        signer = config.getSignerConfig("dynamodb", Regions.US_EAST_1.name());
        assertEquals("AWS4SignerType", signer.getSignerType());
    }

    @Test
    public void factory() throws Exception {
        InternalConfig config = InternalConfig.Factory.getInternalConfig();
        assertSame(config, InternalConfig.Factory.getInternalConfig());
        assertNotNull(config);
        s3Assertions(config);
        cloudfrontAssertions(config);
        ec2Assertions(config);
        dynamoDBAssertions(config);
    }
}
