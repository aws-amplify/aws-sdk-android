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
 * Identifies the resources to deploy for a monitoring job.
 * </p>
 */
public class MonitoringResources implements Serializable {
    /**
     * <p>
     * The configuration for the cluster resources used to run the processing
     * job.
     * </p>
     */
    private MonitoringClusterConfig clusterConfig;

    /**
     * <p>
     * The configuration for the cluster resources used to run the processing
     * job.
     * </p>
     *
     * @return <p>
     *         The configuration for the cluster resources used to run the
     *         processing job.
     *         </p>
     */
    public MonitoringClusterConfig getClusterConfig() {
        return clusterConfig;
    }

    /**
     * <p>
     * The configuration for the cluster resources used to run the processing
     * job.
     * </p>
     *
     * @param clusterConfig <p>
     *            The configuration for the cluster resources used to run the
     *            processing job.
     *            </p>
     */
    public void setClusterConfig(MonitoringClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * <p>
     * The configuration for the cluster resources used to run the processing
     * job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterConfig <p>
     *            The configuration for the cluster resources used to run the
     *            processing job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringResources withClusterConfig(MonitoringClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
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
        if (getClusterConfig() != null)
            sb.append("ClusterConfig: " + getClusterConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterConfig() == null) ? 0 : getClusterConfig().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringResources == false)
            return false;
        MonitoringResources other = (MonitoringResources) obj;

        if (other.getClusterConfig() == null ^ this.getClusterConfig() == null)
            return false;
        if (other.getClusterConfig() != null
                && other.getClusterConfig().equals(this.getClusterConfig()) == false)
            return false;
        return true;
    }
}
