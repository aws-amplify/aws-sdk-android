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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 <p>
 * Updates the Apache Kafka version for the cluster.
 * </p>
 */
public class UpdateClusterKafkaVersionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     */
    private String clusterArn;

    /**
     * 
     <p>
     * The custom configuration that should be applied on the new version of
     * cluster.
     * </p>
     */
    private ConfigurationInfo configurationInfo;

    /**
     * 
     <p>
     * Current cluster version.
     * </p>
     */
    private String currentVersion;

    /**
     * 
     <p>
     * Target Kafka version.
     * </p>
     */
    private String targetKafkaVersion;

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) of the cluster to be updated.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p>
     * 
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) of the cluster to be updated.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) of the cluster to be updated.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) of the cluster to be updated.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClusterKafkaVersionRequest withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * 
     <p>
     * The custom configuration that should be applied on the new version of
     * cluster.
     * </p>
     * 
     * @return <p>
     *         The custom configuration that should be applied on the new
     *         version of cluster.
     *         </p>
     */
    public ConfigurationInfo getConfigurationInfo() {
        return configurationInfo;
    }

    /**
     * 
     <p>
     * The custom configuration that should be applied on the new version of
     * cluster.
     * </p>
     * 
     * @param configurationInfo <p>
     *            The custom configuration that should be applied on the new
     *            version of cluster.
     *            </p>
     */
    public void setConfigurationInfo(ConfigurationInfo configurationInfo) {
        this.configurationInfo = configurationInfo;
    }

    /**
     * 
     <p>
     * The custom configuration that should be applied on the new version of
     * cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationInfo <p>
     *            The custom configuration that should be applied on the new
     *            version of cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClusterKafkaVersionRequest withConfigurationInfo(
            ConfigurationInfo configurationInfo) {
        this.configurationInfo = configurationInfo;
        return this;
    }

    /**
     * 
     <p>
     * Current cluster version.
     * </p>
     * 
     * @return <p>
     *         Current cluster version.
     *         </p>
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * 
     <p>
     * Current cluster version.
     * </p>
     * 
     * @param currentVersion <p>
     *            Current cluster version.
     *            </p>
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * 
     <p>
     * Current cluster version.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentVersion <p>
     *            Current cluster version.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClusterKafkaVersionRequest withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * 
     <p>
     * Target Kafka version.
     * </p>
     * 
     * @return <p>
     *         Target Kafka version.
     *         </p>
     */
    public String getTargetKafkaVersion() {
        return targetKafkaVersion;
    }

    /**
     * 
     <p>
     * Target Kafka version.
     * </p>
     * 
     * @param targetKafkaVersion <p>
     *            Target Kafka version.
     *            </p>
     */
    public void setTargetKafkaVersion(String targetKafkaVersion) {
        this.targetKafkaVersion = targetKafkaVersion;
    }

    /**
     * 
     <p>
     * Target Kafka version.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetKafkaVersion <p>
     *            Target Kafka version.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateClusterKafkaVersionRequest withTargetKafkaVersion(String targetKafkaVersion) {
        this.targetKafkaVersion = targetKafkaVersion;
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getConfigurationInfo() != null)
            sb.append("ConfigurationInfo: " + getConfigurationInfo() + ",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: " + getCurrentVersion() + ",");
        if (getTargetKafkaVersion() != null)
            sb.append("TargetKafkaVersion: " + getTargetKafkaVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode
                + ((getConfigurationInfo() == null) ? 0 : getConfigurationInfo().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode
                + ((getTargetKafkaVersion() == null) ? 0 : getTargetKafkaVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateClusterKafkaVersionRequest == false)
            return false;
        UpdateClusterKafkaVersionRequest other = (UpdateClusterKafkaVersionRequest) obj;

        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getConfigurationInfo() == null ^ this.getConfigurationInfo() == null)
            return false;
        if (other.getConfigurationInfo() != null
                && other.getConfigurationInfo().equals(this.getConfigurationInfo()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null
                && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getTargetKafkaVersion() == null ^ this.getTargetKafkaVersion() == null)
            return false;
        if (other.getTargetKafkaVersion() != null
                && other.getTargetKafkaVersion().equals(this.getTargetKafkaVersion()) == false)
            return false;
        return true;
    }
}
