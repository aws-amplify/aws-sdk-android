/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class DescribeTargetedSentimentDetectionJobResult implements Serializable {
    /**
     * <p>
     * An object that contains the properties associated with a targeted
     * sentiment detection job.
     * </p>
     */
    private TargetedSentimentDetectionJobProperties targetedSentimentDetectionJobProperties;

    /**
     * <p>
     * An object that contains the properties associated with a targeted
     * sentiment detection job.
     * </p>
     *
     * @return <p>
     *         An object that contains the properties associated with a targeted
     *         sentiment detection job.
     *         </p>
     */
    public TargetedSentimentDetectionJobProperties getTargetedSentimentDetectionJobProperties() {
        return targetedSentimentDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a targeted
     * sentiment detection job.
     * </p>
     *
     * @param targetedSentimentDetectionJobProperties <p>
     *            An object that contains the properties associated with a
     *            targeted sentiment detection job.
     *            </p>
     */
    public void setTargetedSentimentDetectionJobProperties(
            TargetedSentimentDetectionJobProperties targetedSentimentDetectionJobProperties) {
        this.targetedSentimentDetectionJobProperties = targetedSentimentDetectionJobProperties;
    }

    /**
     * <p>
     * An object that contains the properties associated with a targeted
     * sentiment detection job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetedSentimentDetectionJobProperties <p>
     *            An object that contains the properties associated with a
     *            targeted sentiment detection job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTargetedSentimentDetectionJobResult withTargetedSentimentDetectionJobProperties(
            TargetedSentimentDetectionJobProperties targetedSentimentDetectionJobProperties) {
        this.targetedSentimentDetectionJobProperties = targetedSentimentDetectionJobProperties;
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
        if (getTargetedSentimentDetectionJobProperties() != null)
            sb.append("TargetedSentimentDetectionJobProperties: "
                    + getTargetedSentimentDetectionJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTargetedSentimentDetectionJobProperties() == null) ? 0
                        : getTargetedSentimentDetectionJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTargetedSentimentDetectionJobResult == false)
            return false;
        DescribeTargetedSentimentDetectionJobResult other = (DescribeTargetedSentimentDetectionJobResult) obj;

        if (other.getTargetedSentimentDetectionJobProperties() == null
                ^ this.getTargetedSentimentDetectionJobProperties() == null)
            return false;
        if (other.getTargetedSentimentDetectionJobProperties() != null
                && other.getTargetedSentimentDetectionJobProperties().equals(
                        this.getTargetedSentimentDetectionJobProperties()) == false)
            return false;
        return true;
    }
}
