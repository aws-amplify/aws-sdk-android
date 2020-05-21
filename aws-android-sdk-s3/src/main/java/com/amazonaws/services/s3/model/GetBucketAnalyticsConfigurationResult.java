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

public class GetBucketAnalyticsConfigurationResult implements Serializable {
    /**
     * <p>
     * The configuration and any analyses for the analytics filter.
     * </p>
     */
    private AnalyticsConfiguration analyticsConfiguration;

    /**
     * <p>
     * The configuration and any analyses for the analytics filter.
     * </p>
     *
     * @return <p>
     *         The configuration and any analyses for the analytics filter.
     *         </p>
     */
    public AnalyticsConfiguration getAnalyticsConfiguration() {
        return analyticsConfiguration;
    }

    /**
     * <p>
     * The configuration and any analyses for the analytics filter.
     * </p>
     *
     * @param analyticsConfiguration <p>
     *            The configuration and any analyses for the analytics filter.
     *            </p>
     */
    public void setAnalyticsConfiguration(AnalyticsConfiguration analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
    }

    /**
     * <p>
     * The configuration and any analyses for the analytics filter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param analyticsConfiguration <p>
     *            The configuration and any analyses for the analytics filter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBucketAnalyticsConfigurationResult withAnalyticsConfiguration(
            AnalyticsConfiguration analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
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
        if (getAnalyticsConfiguration() != null)
            sb.append("AnalyticsConfiguration: " + getAnalyticsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAnalyticsConfiguration() == null) ? 0 : getAnalyticsConfiguration()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketAnalyticsConfigurationResult == false)
            return false;
        GetBucketAnalyticsConfigurationResult other = (GetBucketAnalyticsConfigurationResult) obj;

        if (other.getAnalyticsConfiguration() == null ^ this.getAnalyticsConfiguration() == null)
            return false;
        if (other.getAnalyticsConfiguration() != null
                && other.getAnalyticsConfiguration().equals(this.getAnalyticsConfiguration()) == false)
            return false;
        return true;
    }
}
