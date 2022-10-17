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

package com.amazonaws.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.net.URI;

/** Unit tests for the utility methods that parse information from AWS URLs. */
public class AwsHostNameUtilsTest {

    private static final URI IAM_ENDPOINT = URI.create("https://iam.amazonaws.com");
    private static final URI IAM_REGION_ENDPOINT = URI
            .create("https://iam.us-west-2.amazonaws.com");
    private static final URI EC2_REGION_ENDPOINT = URI
            .create("https://ec2.us-west-2.amazonaws.com");
    private static final URI S3_ENDPOINT = URI.create("https://s3.amazonaws.com");
    private static final URI S3_BUCKET_ENDPOINT = URI
            .create("https://bucket.name.with.periods.s3.amazonaws.com");
    private static final URI S3_REGION_ENDPOINT = URI.create("https://s3-eu-west-1.amazonaws.com");
    private static final URI S3_BUCKET_REGION_ENDPOINT = URI
            .create("https://bucket.name.with.periods.s3-eu-west-1.amazonaws.com");

    @Test
    public void testParseServiceName() {
        // Verify that parseServiceName keeps working the way it used to.
        assertEquals("iam", AwsHostNameUtils.parseServiceName(IAM_ENDPOINT));
        assertEquals("iam", AwsHostNameUtils.parseServiceName(IAM_REGION_ENDPOINT));
        assertEquals("ec2", AwsHostNameUtils.parseServiceName(EC2_REGION_ENDPOINT));
        assertEquals("s3", AwsHostNameUtils.parseServiceName(S3_ENDPOINT));
        assertEquals("s3", AwsHostNameUtils.parseServiceName(S3_BUCKET_ENDPOINT));
        assertEquals("s3", AwsHostNameUtils.parseServiceName(S3_REGION_ENDPOINT));
        assertEquals("s3", AwsHostNameUtils.parseServiceName(S3_BUCKET_REGION_ENDPOINT));
    }

    @Test
    public void testStandardNoHint() {
        // Verify that standard endpoints parse correctly without a service hint
        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("iam.amazonaws.com", null));
        assertEquals("us-west-2",
                AwsHostNameUtils.parseRegionName("iam.us-west-2.amazonaws.com", null));
        assertEquals("us-west-2",
                AwsHostNameUtils.parseRegionName("ec2.us-west-2.amazonaws.com", null));

        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("s3.amazonaws.com", null));
        assertEquals("us-east-1",
                AwsHostNameUtils.parseRegionName("bucket.name.s3.amazonaws.com", null));

        assertEquals("eu-west-1",
                AwsHostNameUtils.parseRegionName("s3-eu-west-1.amazonaws.com", null));
        assertEquals("eu-west-1",
                AwsHostNameUtils.parseRegionName("s3.eu-west-1.amazonaws.com", null));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName(
                "bucket.name.with.periods.s3-eu-west-1.amazonaws.com", null));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName(
                "bucket.name.with.periods.s3.eu-west-1.amazonaws.com", null));
    }

    @Test
    public void testStandard() {
        // Verify that standard endpoints parse correctly with a service hint
        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("iam.amazonaws.com", "iam"));
        assertEquals("us-west-2",
                AwsHostNameUtils.parseRegionName("iam.us-west-2.amazonaws.com", "iam"));
        assertEquals("us-west-2",
                AwsHostNameUtils.parseRegionName("ec2.us-west-2.amazonaws.com", "ec2"));

        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName("s3.amazonaws.com", "s3"));
        assertEquals("us-east-1",
                AwsHostNameUtils.parseRegionName("bucket.name.s3.amazonaws.com", "s3"));

        assertEquals("eu-west-1",
                AwsHostNameUtils.parseRegionName("s3-eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1",
                AwsHostNameUtils.parseRegionName("s3.eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName(
                "bucket.name.with.periods.s3-eu-west-1.amazonaws.com", "s3"));
        assertEquals("eu-west-1", AwsHostNameUtils.parseRegionName(
                "bucket.name.with.periods.s3.eu-west-1.amazonaws.com", "s3"));
    }

    @Test
    public void testVpcEndpoint() {
        assertEquals("us-west-2", AwsHostNameUtils.parseRegionName(
                "bucket.vpce-1234.s3.us-west-2.vpce.amazonaws.com", "s3"));
    }

    @Test
    public void testBJS() {
        // Verify that BJS endpoints parse correctly even though they're
        // non-standard.
        assertEquals("cn-north-1",
                AwsHostNameUtils.parseRegionName("iam.cn-north-1.amazonaws.com.cn", "iam"));
        assertEquals("cn-north-1",
                AwsHostNameUtils.parseRegionName("ec2.cn-north-1.amazonaws.com.cn", "ec2"));
        assertEquals("cn-north-1",
                AwsHostNameUtils.parseRegionName("s3.cn-north-1.amazonaws.com.cn", "s3"));
        assertEquals("cn-north-1", AwsHostNameUtils.parseRegionName(
                "bucket.name.with.periods.s3.cn-north-1.amazonaws.com.cn", "s3"));
    }

    @Test
    public void testS3SpecialRegions() {
        assertEquals("us-east-1",
                AwsHostNameUtils.parseRegionName("s3-external-1.amazonaws.com", null));
        assertEquals("us-east-1", AwsHostNameUtils.parseRegionName(
                "bucket.name.with.periods.s3-external-1.amazonaws.com", null));

        assertEquals("us-gov-west-1",
                AwsHostNameUtils.parseRegionName("s3-fips-us-gov-west-1.amazonaws.com", null));
        assertEquals("us-gov-west-1", AwsHostNameUtils.parseRegionName(
                "bucket.name.with.periods.s3-fips-us-gov-west-1.amazonaws.com", null));
    }

}
