/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.metrics;

/**
 * Simple throughput metric type.
 */
public class SimpleThroughputMetricType extends SimpleServiceMetricType implements
        ThroughputMetricType {
    private final ServiceMetricType byteCountMetricType;

    /**
     * Constructor.
     * @param name the name of the simple throughput metric type.
     * @param serviceName the service name.
     * @param byteCountMetricName the byte count metric name.
     */
    public SimpleThroughputMetricType(String name, String serviceName, String byteCountMetricName) {
        super(name, serviceName);
        this.byteCountMetricType = new SimpleServiceMetricType(byteCountMetricName, serviceName);
    }

    @Override
    public ServiceMetricType getByteCountMetricType() {
        return byteCountMetricType;
    }
}
