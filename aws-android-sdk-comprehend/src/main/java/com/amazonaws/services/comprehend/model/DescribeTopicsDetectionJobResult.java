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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class DescribeTopicsDetectionJobResult implements Serializable {
    /**
     * <p>
     * The list of properties for the requested job.
     * </p>
     */
    private TopicsDetectionJobProperties topicsDetectionJobProperties;

    /**
     * <p>
     * The list of properties for the requested job.
     * </p>
     *
     * @return <p>
     *         The list of properties for the requested job.
     *         </p>
     */
    public TopicsDetectionJobProperties getTopicsDetectionJobProperties() {
        return topicsDetectionJobProperties;
    }

    /**
     * <p>
     * The list of properties for the requested job.
     * </p>
     *
     * @param topicsDetectionJobProperties <p>
     *            The list of properties for the requested job.
     *            </p>
     */
    public void setTopicsDetectionJobProperties(
            TopicsDetectionJobProperties topicsDetectionJobProperties) {
        this.topicsDetectionJobProperties = topicsDetectionJobProperties;
    }

    /**
     * <p>
     * The list of properties for the requested job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param topicsDetectionJobProperties <p>
     *            The list of properties for the requested job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTopicsDetectionJobResult withTopicsDetectionJobProperties(
            TopicsDetectionJobProperties topicsDetectionJobProperties) {
        this.topicsDetectionJobProperties = topicsDetectionJobProperties;
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
        if (getTopicsDetectionJobProperties() != null)
            sb.append("TopicsDetectionJobProperties: " + getTopicsDetectionJobProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTopicsDetectionJobProperties() == null) ? 0
                        : getTopicsDetectionJobProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTopicsDetectionJobResult == false)
            return false;
        DescribeTopicsDetectionJobResult other = (DescribeTopicsDetectionJobResult) obj;

        if (other.getTopicsDetectionJobProperties() == null
                ^ this.getTopicsDetectionJobProperties() == null)
            return false;
        if (other.getTopicsDetectionJobProperties() != null
                && other.getTopicsDetectionJobProperties().equals(
                        this.getTopicsDetectionJobProperties()) == false)
            return false;
        return true;
    }
}
