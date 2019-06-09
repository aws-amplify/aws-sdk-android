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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information associated with an Amazon CloudWatch event destination
 * to which email sending events are published.
 * </p>
 * <p>
 * Event destinations, such as Amazon CloudWatch, are associated with
 * configuration sets, which enable you to publish email sending events. For
 * information about using configuration sets, see the <a href=
 * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/monitor-sending-activity.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class CloudWatchDestination implements Serializable {
    /**
     * <p>
     * A list of dimensions upon which to categorize your emails when you
     * publish email sending events to Amazon CloudWatch.
     * </p>
     */
    private java.util.List<CloudWatchDimensionConfiguration> dimensionConfigurations = new java.util.ArrayList<CloudWatchDimensionConfiguration>();

    /**
     * <p>
     * A list of dimensions upon which to categorize your emails when you
     * publish email sending events to Amazon CloudWatch.
     * </p>
     *
     * @return <p>
     *         A list of dimensions upon which to categorize your emails when
     *         you publish email sending events to Amazon CloudWatch.
     *         </p>
     */
    public java.util.List<CloudWatchDimensionConfiguration> getDimensionConfigurations() {
        return dimensionConfigurations;
    }

    /**
     * <p>
     * A list of dimensions upon which to categorize your emails when you
     * publish email sending events to Amazon CloudWatch.
     * </p>
     *
     * @param dimensionConfigurations <p>
     *            A list of dimensions upon which to categorize your emails when
     *            you publish email sending events to Amazon CloudWatch.
     *            </p>
     */
    public void setDimensionConfigurations(
            java.util.Collection<CloudWatchDimensionConfiguration> dimensionConfigurations) {
        if (dimensionConfigurations == null) {
            this.dimensionConfigurations = null;
            return;
        }

        this.dimensionConfigurations = new java.util.ArrayList<CloudWatchDimensionConfiguration>(
                dimensionConfigurations);
    }

    /**
     * <p>
     * A list of dimensions upon which to categorize your emails when you
     * publish email sending events to Amazon CloudWatch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensionConfigurations <p>
     *            A list of dimensions upon which to categorize your emails when
     *            you publish email sending events to Amazon CloudWatch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchDestination withDimensionConfigurations(
            CloudWatchDimensionConfiguration... dimensionConfigurations) {
        if (getDimensionConfigurations() == null) {
            this.dimensionConfigurations = new java.util.ArrayList<CloudWatchDimensionConfiguration>(
                    dimensionConfigurations.length);
        }
        for (CloudWatchDimensionConfiguration value : dimensionConfigurations) {
            this.dimensionConfigurations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of dimensions upon which to categorize your emails when you
     * publish email sending events to Amazon CloudWatch.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensionConfigurations <p>
     *            A list of dimensions upon which to categorize your emails when
     *            you publish email sending events to Amazon CloudWatch.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CloudWatchDestination withDimensionConfigurations(
            java.util.Collection<CloudWatchDimensionConfiguration> dimensionConfigurations) {
        setDimensionConfigurations(dimensionConfigurations);
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
        if (getDimensionConfigurations() != null)
            sb.append("DimensionConfigurations: " + getDimensionConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDimensionConfigurations() == null) ? 0 : getDimensionConfigurations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloudWatchDestination == false)
            return false;
        CloudWatchDestination other = (CloudWatchDestination) obj;

        if (other.getDimensionConfigurations() == null ^ this.getDimensionConfigurations() == null)
            return false;
        if (other.getDimensionConfigurations() != null
                && other.getDimensionConfigurations().equals(this.getDimensionConfigurations()) == false)
            return false;
        return true;
    }
}
