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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class GetBucketMetricsConfigurationResult implements Serializable {
    /**
     * <p>
     * Specifies the metrics configuration.
     * </p>
     */
    private MetricsConfiguration metricsConfiguration;

    /**
     * <p>
     * Specifies the metrics configuration.
     * </p>
     *
     * @return <p>
     *         Specifies the metrics configuration.
     *         </p>
     */
    public MetricsConfiguration getMetricsConfiguration() {
        return metricsConfiguration;
    }

    /**
     * <p>
     * Specifies the metrics configuration.
     * </p>
     *
     * @param metricsConfiguration <p>
     *            Specifies the metrics configuration.
     *            </p>
     */
    public void setMetricsConfiguration(MetricsConfiguration metricsConfiguration) {
        this.metricsConfiguration = metricsConfiguration;
    }

    /**
     * <p>
     * Specifies the metrics configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metricsConfiguration <p>
     *            Specifies the metrics configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketMetricsConfigurationResult withMetricsConfiguration(
            MetricsConfiguration metricsConfiguration) {
        this.metricsConfiguration = metricsConfiguration;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMetricsConfiguration() != null)
            sb.append("MetricsConfiguration: " + getMetricsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMetricsConfiguration() == null) ? 0 : getMetricsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketMetricsConfigurationResult == false)
            return false;
        GetBucketMetricsConfigurationResult other = (GetBucketMetricsConfigurationResult) obj;

        if (other.getMetricsConfiguration() == null ^ this.getMetricsConfiguration() == null)
            return false;
        if (other.getMetricsConfiguration() != null
                && other.getMetricsConfiguration().equals(this.getMetricsConfiguration()) == false)
            return false;
        return true;
    }
}
