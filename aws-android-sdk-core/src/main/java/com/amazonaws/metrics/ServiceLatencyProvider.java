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

package com.amazonaws.metrics;

import com.amazonaws.util.TimingInfo;

import com.amazonaws.logging.LogFactory;

/**
 * Latency metric information provider.
 */
public class ServiceLatencyProvider {
    private final long startNano = System.nanoTime();
    private long endNano = startNano;
    private final ServiceMetricType serviceMetricType;

    /**
     * Constructor.
     * @param type the service metric type.
     */
    public ServiceLatencyProvider(ServiceMetricType type) {
        this.serviceMetricType = type;
    }

    /**
     * Constructor.
     * @return the service metric type.
     */
    public ServiceMetricType getServiceMetricType() {
        return serviceMetricType;
    }

    /**
     * Ends the timing. Must not be called more than once.
     * @return the service latency provider.
     */
    public ServiceLatencyProvider endTiming() {
        if (endNano != startNano) {
            throw new IllegalStateException();
        }
        endNano = System.nanoTime();
        return this;
    }

    /**
     * @return the duration in milliseconds.
     */
    public double getDurationMilli() {
        if (endNano == startNano) {
            LogFactory.getLog(getClass()).debug(
                    "Likely to be a missing invocation of endTiming().");
        }
        return TimingInfo.durationMilliOf(startNano, endNano);
    }

    /**
     * @return the provider id.
     */
    public String getProviderId() {
        return super.toString();
    }

    @Override
    public String toString() {
        return String.format(
                "providerId=%s, serviceMetricType=%s, startNano=%d, endNano=%d",
                getProviderId(), serviceMetricType, startNano, endNano);
    }
}
