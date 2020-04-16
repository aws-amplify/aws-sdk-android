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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration for monitoring constraints and monitoring statistics. These
 * baseline resources are compared against the results of the current job from
 * the series of jobs scheduled to collect data periodically.
 * </p>
 */
public class MonitoringBaselineConfig implements Serializable {
    /**
     * <p>
     * The baseline constraint file in Amazon S3 that the current monitoring job
     * should validated against.
     * </p>
     */
    private MonitoringConstraintsResource constraintsResource;

    /**
     * <p>
     * The baseline statistics file in Amazon S3 that the current monitoring job
     * should be validated against.
     * </p>
     */
    private MonitoringStatisticsResource statisticsResource;

    /**
     * <p>
     * The baseline constraint file in Amazon S3 that the current monitoring job
     * should validated against.
     * </p>
     *
     * @return <p>
     *         The baseline constraint file in Amazon S3 that the current
     *         monitoring job should validated against.
     *         </p>
     */
    public MonitoringConstraintsResource getConstraintsResource() {
        return constraintsResource;
    }

    /**
     * <p>
     * The baseline constraint file in Amazon S3 that the current monitoring job
     * should validated against.
     * </p>
     *
     * @param constraintsResource <p>
     *            The baseline constraint file in Amazon S3 that the current
     *            monitoring job should validated against.
     *            </p>
     */
    public void setConstraintsResource(MonitoringConstraintsResource constraintsResource) {
        this.constraintsResource = constraintsResource;
    }

    /**
     * <p>
     * The baseline constraint file in Amazon S3 that the current monitoring job
     * should validated against.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param constraintsResource <p>
     *            The baseline constraint file in Amazon S3 that the current
     *            monitoring job should validated against.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringBaselineConfig withConstraintsResource(
            MonitoringConstraintsResource constraintsResource) {
        this.constraintsResource = constraintsResource;
        return this;
    }

    /**
     * <p>
     * The baseline statistics file in Amazon S3 that the current monitoring job
     * should be validated against.
     * </p>
     *
     * @return <p>
     *         The baseline statistics file in Amazon S3 that the current
     *         monitoring job should be validated against.
     *         </p>
     */
    public MonitoringStatisticsResource getStatisticsResource() {
        return statisticsResource;
    }

    /**
     * <p>
     * The baseline statistics file in Amazon S3 that the current monitoring job
     * should be validated against.
     * </p>
     *
     * @param statisticsResource <p>
     *            The baseline statistics file in Amazon S3 that the current
     *            monitoring job should be validated against.
     *            </p>
     */
    public void setStatisticsResource(MonitoringStatisticsResource statisticsResource) {
        this.statisticsResource = statisticsResource;
    }

    /**
     * <p>
     * The baseline statistics file in Amazon S3 that the current monitoring job
     * should be validated against.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statisticsResource <p>
     *            The baseline statistics file in Amazon S3 that the current
     *            monitoring job should be validated against.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringBaselineConfig withStatisticsResource(
            MonitoringStatisticsResource statisticsResource) {
        this.statisticsResource = statisticsResource;
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
        if (getConstraintsResource() != null)
            sb.append("ConstraintsResource: " + getConstraintsResource() + ",");
        if (getStatisticsResource() != null)
            sb.append("StatisticsResource: " + getStatisticsResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConstraintsResource() == null) ? 0 : getConstraintsResource().hashCode());
        hashCode = prime * hashCode
                + ((getStatisticsResource() == null) ? 0 : getStatisticsResource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringBaselineConfig == false)
            return false;
        MonitoringBaselineConfig other = (MonitoringBaselineConfig) obj;

        if (other.getConstraintsResource() == null ^ this.getConstraintsResource() == null)
            return false;
        if (other.getConstraintsResource() != null
                && other.getConstraintsResource().equals(this.getConstraintsResource()) == false)
            return false;
        if (other.getStatisticsResource() == null ^ this.getStatisticsResource() == null)
            return false;
        if (other.getStatisticsResource() != null
                && other.getStatisticsResource().equals(this.getStatisticsResource()) == false)
            return false;
        return true;
    }
}
