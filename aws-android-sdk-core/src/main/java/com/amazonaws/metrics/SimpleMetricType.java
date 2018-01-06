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
 * The simple metric type class.
 */
public abstract class SimpleMetricType implements MetricType {
    @Override
    public abstract String name();

    @Override
    public final int hashCode() {
        return name().hashCode();
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof MetricType))
            return false;
        MetricType that = (MetricType) o;
        return this.name().equals(that.name());
    }

    @Override
    public final String toString() {
        return name();
    }
}
