/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.s3.metrics;

import com.amazonaws.metrics.ServiceMetricType;
import com.amazonaws.metrics.SimpleMetricType;
import com.amazonaws.metrics.ThroughputMetricType;
import com.amazonaws.services.s3.internal.Constants;

/**
 * S3 specific service metrics in the form of "simulated enum". The name of
 * every enum literal defined in this class must all start with "S3" in order
 * for the default AWS SDK metric collection system to recognize it as a
 * predefined S3 metrics.
 */
@SuppressWarnings("checkstyle:finalclass")
public class S3ServiceMetric extends SimpleMetricType implements ServiceMetricType {
    static final String SERVICE_NAME_PREFIX = "S3";

    /**
     * Returns a metric name by concatenating the service name prefix with the
     * given suffix.
     */
    private static final String metricName(String suffix) {
        return SERVICE_NAME_PREFIX + suffix;
    }

    /**
     * The S3 throughput metric for download.
     */
    public static final S3ThroughputMetric S3_DOWLOAD_THROUGHPUT = new S3ThroughputMetric(
            metricName(DOWNLOAD_THROUGHPUT_NAME_SUFFIX)) {
        @Override
        public ServiceMetricType getByteCountMetricType() {
            return S3_DOWNLOAD_BYTE_COUNT;
        }
    };

    /**
     * The S3 service metric for download.
     */
    public static final S3ServiceMetric S3_DOWNLOAD_BYTE_COUNT = new S3ServiceMetric(
            metricName(DOWNLOAD_BYTE_COUNT_NAME_SUFFIX));

    /**
     * The S3 throughput metric for upload.
     */
    public static final S3ThroughputMetric S3_UPLOAD_THROUGHPUT = new S3ThroughputMetric(
            metricName(UPLOAD_THROUGHPUT_NAME_SUFFIX)) {
        @Override
        public ServiceMetricType getByteCountMetricType() {
            return S3_UPLOAD_BYTE_COUNT;
        }
    };

    /**
     * The S3 service metric for upload.
     */
    public static final S3ServiceMetric S3_UPLOAD_BYTE_COUNT = new S3ServiceMetric(
            metricName(UPLOAD_BYTE_COUNT_NAME_SUFFIX));

    private static final S3ServiceMetric[] VALUES = {
        S3_DOWLOAD_THROUGHPUT,
        S3_DOWNLOAD_BYTE_COUNT,
        S3_UPLOAD_THROUGHPUT,
        S3_UPLOAD_BYTE_COUNT
    };

    private final String name;

    private S3ServiceMetric(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String getServiceName() {
        return Constants.S3_SERVICE_DISPLAY_NAME;
    }

    private abstract static class S3ThroughputMetric extends S3ServiceMetric
            implements ThroughputMetricType {
        private S3ThroughputMetric(String name) {
            super(name);
        }
    };

    /**
     * @return array of S3ServiceMetric values.
     */
    public static S3ServiceMetric[] values() {
        return VALUES.clone();
    }

    /**
     * @param name the value name.
     * @return the value corresponding to the specified name.
     */
    public static S3ServiceMetric valueOf(String name) {
        for (final S3ServiceMetric e : values()) {
            if (e.name().equals(name)) {
                return e;
            }
        }
        throw new IllegalArgumentException("No S3ServiceMetric defined for the name " + name);
    }
}
