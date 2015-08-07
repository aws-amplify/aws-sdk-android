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

package com.amazonaws.services.s3.metrics;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.MetricCollector;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.metrics.ServiceMetricCollector;
import com.amazonaws.metrics.ServiceMetricType;
import com.amazonaws.metrics.ThroughputMetricType;
import com.amazonaws.metrics.internal.ServiceMetricTypeGuesser;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.PutObjectRequest;

import org.junit.Test;

/**
 * This test ensures the {@link ServiceMetricTypeGuesser} behaves consistently
 * with the {@link S3ServiceMetric}.
 */
public class S3ServiceMetricTest {
    @Test
    public void ensuresConsistentBehavior() {
        PutObjectRequest orig = new PutObjectRequest("", "", "");
        final String expectedServiceName = AmazonS3Client.S3_SERVICE_NAME;
        Request<?> req = new DefaultRequest<PutObjectRequest>(orig, expectedServiceName);
        for (S3ServiceMetric expectedType : S3ServiceMetric.values()) {
            final String expectedTypeName = expectedType.name();
            final String suffix = expectedTypeName.substring(2);
            if (expectedType instanceof ThroughputMetricType) {
                ThroughputMetricType expectedThroughputType = (ThroughputMetricType) expectedType;
                ServiceMetricType expectedByteCountType = expectedThroughputType
                        .getByteCountMetricType();
                final String expectedByteCountTypeName = expectedByteCountType.name();
                final String byteCountTypeNameSuffix = expectedByteCountTypeName.substring(2);
                ThroughputMetricType actualType = ServiceMetricTypeGuesser
                        .guessThroughputMetricType(req, suffix, byteCountTypeNameSuffix);
                // by default the metrics is disabled
                if (!AwsSdkMetrics.isMetricsEnabled()) {
                    assertNull(actualType);
                    // set to a custom collector, so now considered enabled
                    AwsSdkMetrics.setMetricCollector(new MetricCollector() {
                        @Override
                        public boolean start() {
                            return true;
                        }

                        @Override
                        public boolean stop() {
                            return false;
                        }

                        @Override
                        public boolean isEnabled() {
                            return true;
                        }

                        @Override
                        public RequestMetricCollector getRequestMetricCollector() {
                            return RequestMetricCollector.NONE;
                        }

                        @Override
                        public ServiceMetricCollector getServiceMetricCollector() {
                            return ServiceMetricCollector.NONE;
                        }
                    });
                    actualType = ServiceMetricTypeGuesser
                            .guessThroughputMetricType(req, suffix, byteCountTypeNameSuffix);
                }
                String actualTypeName = actualType.name();
                final ServiceMetricType actualByteCountType = actualType.getByteCountMetricType();
                assertEquals(expectedServiceName, actualType.getServiceName());
                assertEquals(expectedServiceName, actualByteCountType.getServiceName());
                assertEquals(actualTypeName, expectedType, actualType);
                final String actualByteCountTypeName = actualByteCountType.name();
                assertEquals(actualByteCountTypeName, expectedByteCountType, actualByteCountType);
                assertFalse(actualTypeName, actualType.equals(expectedByteCountType));
                S3ServiceMetric.valueOf(actualByteCountTypeName);
                S3ServiceMetric.valueOf(actualTypeName);
            }
        }
    }
}
