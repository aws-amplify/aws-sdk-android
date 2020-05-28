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
 * Updates the EBS storage associated with MSK brokers.
 * </p>
 */
public class UpdateBrokerStorageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     */
    private String clusterArn;

    /**
     * 
     <p>
     * The version of cluster to update from. A successful operation will then
     * generate a new version.
     * </p>
     */
    private String currentVersion;

    /**
     * 
     <p>
     * Describes the target volume size and the ID of the broker to apply the
     * update to.
     * </p>
     */
    private java.util.List<BrokerEBSVolumeInfo> targetBrokerEBSVolumeInfo;

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @return <p>
     *         The Amazon Resource Name (ARN) that uniquely identifies the
     *         cluster.
     *         </p>
     */
    public String getClusterArn() {
        return clusterArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p>
     * 
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies the
     *            cluster.
     *            </p>
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * 
     <p>
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArn <p>
     *            The Amazon Resource Name (ARN) that uniquely identifies the
     *            cluster.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBrokerStorageRequest withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
        return this;
    }

    /**
     * 
     <p>
     * The version of cluster to update from. A successful operation will then
     * generate a new version.
     * </p>
     * 
     * @return <p>
     *         The version of cluster to update from. A successful operation
     *         will then generate a new version.
     *         </p>
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * 
     <p>
     * The version of cluster to update from. A successful operation will then
     * generate a new version.
     * </p>
     * 
     * @param currentVersion <p>
     *            The version of cluster to update from. A successful operation
     *            will then generate a new version.
     *            </p>
     */
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * 
     <p>
     * The version of cluster to update from. A successful operation will then
     * generate a new version.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param currentVersion <p>
     *            The version of cluster to update from. A successful operation
     *            will then generate a new version.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBrokerStorageRequest withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * 
     <p>
     * Describes the target volume size and the ID of the broker to apply the
     * update to.
     * </p>
     * 
     * @return <p>
     *         Describes the target volume size and the ID of the broker to
     *         apply the update to.
     *         </p>
     */
    public java.util.List<BrokerEBSVolumeInfo> getTargetBrokerEBSVolumeInfo() {
        return targetBrokerEBSVolumeInfo;
    }

    /**
     * 
     <p>
     * Describes the target volume size and the ID of the broker to apply the
     * update to.
     * </p>
     * 
     * @param targetBrokerEBSVolumeInfo <p>
     *            Describes the target volume size and the ID of the broker to
     *            apply the update to.
     *            </p>
     */
    public void setTargetBrokerEBSVolumeInfo(
            java.util.Collection<BrokerEBSVolumeInfo> targetBrokerEBSVolumeInfo) {
        if (targetBrokerEBSVolumeInfo == null) {
            this.targetBrokerEBSVolumeInfo = null;
            return;
        }

        this.targetBrokerEBSVolumeInfo = new java.util.ArrayList<BrokerEBSVolumeInfo>(
                targetBrokerEBSVolumeInfo);
    }

    /**
     * 
     <p>
     * Describes the target volume size and the ID of the broker to apply the
     * update to.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetBrokerEBSVolumeInfo <p>
     *            Describes the target volume size and the ID of the broker to
     *            apply the update to.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBrokerStorageRequest withTargetBrokerEBSVolumeInfo(
            BrokerEBSVolumeInfo... targetBrokerEBSVolumeInfo) {
        if (getTargetBrokerEBSVolumeInfo() == null) {
            this.targetBrokerEBSVolumeInfo = new java.util.ArrayList<BrokerEBSVolumeInfo>(
                    targetBrokerEBSVolumeInfo.length);
        }
        for (BrokerEBSVolumeInfo value : targetBrokerEBSVolumeInfo) {
            this.targetBrokerEBSVolumeInfo.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * Describes the target volume size and the ID of the broker to apply the
     * update to.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetBrokerEBSVolumeInfo <p>
     *            Describes the target volume size and the ID of the broker to
     *            apply the update to.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBrokerStorageRequest withTargetBrokerEBSVolumeInfo(
            java.util.Collection<BrokerEBSVolumeInfo> targetBrokerEBSVolumeInfo) {
        setTargetBrokerEBSVolumeInfo(targetBrokerEBSVolumeInfo);
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
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: " + getCurrentVersion() + ",");
        if (getTargetBrokerEBSVolumeInfo() != null)
            sb.append("TargetBrokerEBSVolumeInfo: " + getTargetBrokerEBSVolumeInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode
                + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetBrokerEBSVolumeInfo() == null) ? 0 : getTargetBrokerEBSVolumeInfo()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBrokerStorageRequest == false)
            return false;
        UpdateBrokerStorageRequest other = (UpdateBrokerStorageRequest) obj;

        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null
                && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null
                && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getTargetBrokerEBSVolumeInfo() == null
                ^ this.getTargetBrokerEBSVolumeInfo() == null)
            return false;
        if (other.getTargetBrokerEBSVolumeInfo() != null
                && other.getTargetBrokerEBSVolumeInfo().equals(this.getTargetBrokerEBSVolumeInfo()) == false)
            return false;
        return true;
    }
}
