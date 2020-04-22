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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

/**
 * <p>
 * Describes cluster attributes that are in a pending state. A change to one or
 * more the attributes was requested and is in progress or will be applied.
 * </p>
 */
public class PendingModifiedValues implements Serializable {
    /**
     * <p>
     * The pending or in-progress change of the master user password for the
     * cluster.
     * </p>
     */
    private String masterUserPassword;

    /**
     * <p>
     * The pending or in-progress change of the cluster's node type.
     * </p>
     */
    private String nodeType;

    /**
     * <p>
     * The pending or in-progress change of the number of nodes in the cluster.
     * </p>
     */
    private Integer numberOfNodes;

    /**
     * <p>
     * The pending or in-progress change of the cluster type.
     * </p>
     */
    private String clusterType;

    /**
     * <p>
     * The pending or in-progress change of the service version.
     * </p>
     */
    private String clusterVersion;

    /**
     * <p>
     * The pending or in-progress change of the automated snapshot retention
     * period.
     * </p>
     */
    private Integer automatedSnapshotRetentionPeriod;

    /**
     * <p>
     * The pending or in-progress change of the new identifier for the cluster.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The pending or in-progress change of the ability to connect to the
     * cluster from the public network.
     * </p>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC
     * routing enabled. To create a cluster that uses enhanced VPC routing, the
     * cluster must be in a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     * >Enhanced VPC Routing</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     */
    private Boolean enhancedVpcRouting;

    /**
     * <p>
     * The name of the maintenance track that the cluster will change to during
     * the next maintenance window.
     * </p>
     */
    private String maintenanceTrackName;

    /**
     * <p>
     * The encryption type for a cluster. Possible values are: KMS and None. For
     * the China region the possible values are None, and Legacy.
     * </p>
     */
    private String encryptionType;

    /**
     * <p>
     * The pending or in-progress change of the master user password for the
     * cluster.
     * </p>
     *
     * @return <p>
     *         The pending or in-progress change of the master user password for
     *         the cluster.
     *         </p>
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * <p>
     * The pending or in-progress change of the master user password for the
     * cluster.
     * </p>
     *
     * @param masterUserPassword <p>
     *            The pending or in-progress change of the master user password
     *            for the cluster.
     *            </p>
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The pending or in-progress change of the master user password for the
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUserPassword <p>
     *            The pending or in-progress change of the master user password
     *            for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster's node type.
     * </p>
     *
     * @return <p>
     *         The pending or in-progress change of the cluster's node type.
     *         </p>
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster's node type.
     * </p>
     *
     * @param nodeType <p>
     *            The pending or in-progress change of the cluster's node type.
     *            </p>
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster's node type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeType <p>
     *            The pending or in-progress change of the cluster's node type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the number of nodes in the cluster.
     * </p>
     *
     * @return <p>
     *         The pending or in-progress change of the number of nodes in the
     *         cluster.
     *         </p>
     */
    public Integer getNumberOfNodes() {
        return numberOfNodes;
    }

    /**
     * <p>
     * The pending or in-progress change of the number of nodes in the cluster.
     * </p>
     *
     * @param numberOfNodes <p>
     *            The pending or in-progress change of the number of nodes in
     *            the cluster.
     *            </p>
     */
    public void setNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
    }

    /**
     * <p>
     * The pending or in-progress change of the number of nodes in the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfNodes <p>
     *            The pending or in-progress change of the number of nodes in
     *            the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withNumberOfNodes(Integer numberOfNodes) {
        this.numberOfNodes = numberOfNodes;
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster type.
     * </p>
     *
     * @return <p>
     *         The pending or in-progress change of the cluster type.
     *         </p>
     */
    public String getClusterType() {
        return clusterType;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster type.
     * </p>
     *
     * @param clusterType <p>
     *            The pending or in-progress change of the cluster type.
     *            </p>
     */
    public void setClusterType(String clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * <p>
     * The pending or in-progress change of the cluster type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterType <p>
     *            The pending or in-progress change of the cluster type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the service version.
     * </p>
     *
     * @return <p>
     *         The pending or in-progress change of the service version.
     *         </p>
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    /**
     * <p>
     * The pending or in-progress change of the service version.
     * </p>
     *
     * @param clusterVersion <p>
     *            The pending or in-progress change of the service version.
     *            </p>
     */
    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    /**
     * <p>
     * The pending or in-progress change of the service version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterVersion <p>
     *            The pending or in-progress change of the service version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the automated snapshot retention
     * period.
     * </p>
     *
     * @return <p>
     *         The pending or in-progress change of the automated snapshot
     *         retention period.
     *         </p>
     */
    public Integer getAutomatedSnapshotRetentionPeriod() {
        return automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The pending or in-progress change of the automated snapshot retention
     * period.
     * </p>
     *
     * @param automatedSnapshotRetentionPeriod <p>
     *            The pending or in-progress change of the automated snapshot
     *            retention period.
     *            </p>
     */
    public void setAutomatedSnapshotRetentionPeriod(Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
    }

    /**
     * <p>
     * The pending or in-progress change of the automated snapshot retention
     * period.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param automatedSnapshotRetentionPeriod <p>
     *            The pending or in-progress change of the automated snapshot
     *            retention period.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withAutomatedSnapshotRetentionPeriod(
            Integer automatedSnapshotRetentionPeriod) {
        this.automatedSnapshotRetentionPeriod = automatedSnapshotRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the new identifier for the cluster.
     * </p>
     *
     * @return <p>
     *         The pending or in-progress change of the new identifier for the
     *         cluster.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The pending or in-progress change of the new identifier for the cluster.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The pending or in-progress change of the new identifier for
     *            the cluster.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The pending or in-progress change of the new identifier for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The pending or in-progress change of the new identifier for
     *            the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The pending or in-progress change of the ability to connect to the
     * cluster from the public network.
     * </p>
     *
     * @return <p>
     *         The pending or in-progress change of the ability to connect to
     *         the cluster from the public network.
     *         </p>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * The pending or in-progress change of the ability to connect to the
     * cluster from the public network.
     * </p>
     *
     * @return <p>
     *         The pending or in-progress change of the ability to connect to
     *         the cluster from the public network.
     *         </p>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * The pending or in-progress change of the ability to connect to the
     * cluster from the public network.
     * </p>
     *
     * @param publiclyAccessible <p>
     *            The pending or in-progress change of the ability to connect to
     *            the cluster from the public network.
     *            </p>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * The pending or in-progress change of the ability to connect to the
     * cluster from the public network.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            The pending or in-progress change of the ability to connect to
     *            the cluster from the public network.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC
     * routing enabled. To create a cluster that uses enhanced VPC routing, the
     * cluster must be in a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     * >Enhanced VPC Routing</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     *
     * @return <p>
     *         An option that specifies whether to create the cluster with
     *         enhanced VPC routing enabled. To create a cluster that uses
     *         enhanced VPC routing, the cluster must be in a VPC. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     *         >Enhanced VPC Routing</a> in the Amazon Redshift Cluster
     *         Management Guide.
     *         </p>
     *         <p>
     *         If this option is <code>true</code>, enhanced VPC routing is
     *         enabled.
     *         </p>
     *         <p>
     *         Default: false
     *         </p>
     */
    public Boolean isEnhancedVpcRouting() {
        return enhancedVpcRouting;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC
     * routing enabled. To create a cluster that uses enhanced VPC routing, the
     * cluster must be in a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     * >Enhanced VPC Routing</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     *
     * @return <p>
     *         An option that specifies whether to create the cluster with
     *         enhanced VPC routing enabled. To create a cluster that uses
     *         enhanced VPC routing, the cluster must be in a VPC. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     *         >Enhanced VPC Routing</a> in the Amazon Redshift Cluster
     *         Management Guide.
     *         </p>
     *         <p>
     *         If this option is <code>true</code>, enhanced VPC routing is
     *         enabled.
     *         </p>
     *         <p>
     *         Default: false
     *         </p>
     */
    public Boolean getEnhancedVpcRouting() {
        return enhancedVpcRouting;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC
     * routing enabled. To create a cluster that uses enhanced VPC routing, the
     * cluster must be in a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     * >Enhanced VPC Routing</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     *
     * @param enhancedVpcRouting <p>
     *            An option that specifies whether to create the cluster with
     *            enhanced VPC routing enabled. To create a cluster that uses
     *            enhanced VPC routing, the cluster must be in a VPC. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     *            >Enhanced VPC Routing</a> in the Amazon Redshift Cluster
     *            Management Guide.
     *            </p>
     *            <p>
     *            If this option is <code>true</code>, enhanced VPC routing is
     *            enabled.
     *            </p>
     *            <p>
     *            Default: false
     *            </p>
     */
    public void setEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        this.enhancedVpcRouting = enhancedVpcRouting;
    }

    /**
     * <p>
     * An option that specifies whether to create the cluster with enhanced VPC
     * routing enabled. To create a cluster that uses enhanced VPC routing, the
     * cluster must be in a VPC. For more information, see <a href=
     * "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     * >Enhanced VPC Routing</a> in the Amazon Redshift Cluster Management
     * Guide.
     * </p>
     * <p>
     * If this option is <code>true</code>, enhanced VPC routing is enabled.
     * </p>
     * <p>
     * Default: false
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enhancedVpcRouting <p>
     *            An option that specifies whether to create the cluster with
     *            enhanced VPC routing enabled. To create a cluster that uses
     *            enhanced VPC routing, the cluster must be in a VPC. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/redshift/latest/mgmt/enhanced-vpc-routing.html"
     *            >Enhanced VPC Routing</a> in the Amazon Redshift Cluster
     *            Management Guide.
     *            </p>
     *            <p>
     *            If this option is <code>true</code>, enhanced VPC routing is
     *            enabled.
     *            </p>
     *            <p>
     *            Default: false
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withEnhancedVpcRouting(Boolean enhancedVpcRouting) {
        this.enhancedVpcRouting = enhancedVpcRouting;
        return this;
    }

    /**
     * <p>
     * The name of the maintenance track that the cluster will change to during
     * the next maintenance window.
     * </p>
     *
     * @return <p>
     *         The name of the maintenance track that the cluster will change to
     *         during the next maintenance window.
     *         </p>
     */
    public String getMaintenanceTrackName() {
        return maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track that the cluster will change to during
     * the next maintenance window.
     * </p>
     *
     * @param maintenanceTrackName <p>
     *            The name of the maintenance track that the cluster will change
     *            to during the next maintenance window.
     *            </p>
     */
    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track that the cluster will change to during
     * the next maintenance window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maintenanceTrackName <p>
     *            The name of the maintenance track that the cluster will change
     *            to during the next maintenance window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
        return this;
    }

    /**
     * <p>
     * The encryption type for a cluster. Possible values are: KMS and None. For
     * the China region the possible values are None, and Legacy.
     * </p>
     *
     * @return <p>
     *         The encryption type for a cluster. Possible values are: KMS and
     *         None. For the China region the possible values are None, and
     *         Legacy.
     *         </p>
     */
    public String getEncryptionType() {
        return encryptionType;
    }

    /**
     * <p>
     * The encryption type for a cluster. Possible values are: KMS and None. For
     * the China region the possible values are None, and Legacy.
     * </p>
     *
     * @param encryptionType <p>
     *            The encryption type for a cluster. Possible values are: KMS
     *            and None. For the China region the possible values are None,
     *            and Legacy.
     *            </p>
     */
    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The encryption type for a cluster. Possible values are: KMS and None. For
     * the China region the possible values are None, and Legacy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encryptionType <p>
     *            The encryption type for a cluster. Possible values are: KMS
     *            and None. For the China region the possible values are None,
     *            and Legacy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
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
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getNodeType() != null)
            sb.append("NodeType: " + getNodeType() + ",");
        if (getNumberOfNodes() != null)
            sb.append("NumberOfNodes: " + getNumberOfNodes() + ",");
        if (getClusterType() != null)
            sb.append("ClusterType: " + getClusterType() + ",");
        if (getClusterVersion() != null)
            sb.append("ClusterVersion: " + getClusterVersion() + ",");
        if (getAutomatedSnapshotRetentionPeriod() != null)
            sb.append("AutomatedSnapshotRetentionPeriod: " + getAutomatedSnapshotRetentionPeriod()
                    + ",");
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getEnhancedVpcRouting() != null)
            sb.append("EnhancedVpcRouting: " + getEnhancedVpcRouting() + ",");
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: " + getMaintenanceTrackName() + ",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: " + getEncryptionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode
                + ((getNumberOfNodes() == null) ? 0 : getNumberOfNodes().hashCode());
        hashCode = prime * hashCode
                + ((getClusterType() == null) ? 0 : getClusterType().hashCode());
        hashCode = prime * hashCode
                + ((getClusterVersion() == null) ? 0 : getClusterVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutomatedSnapshotRetentionPeriod() == null) ? 0
                        : getAutomatedSnapshotRetentionPeriod().hashCode());
        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode
                + ((getEnhancedVpcRouting() == null) ? 0 : getEnhancedVpcRouting().hashCode());
        hashCode = prime * hashCode
                + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime * hashCode
                + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingModifiedValues == false)
            return false;
        PendingModifiedValues other = (PendingModifiedValues) obj;

        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null
                && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getNumberOfNodes() == null ^ this.getNumberOfNodes() == null)
            return false;
        if (other.getNumberOfNodes() != null
                && other.getNumberOfNodes().equals(this.getNumberOfNodes()) == false)
            return false;
        if (other.getClusterType() == null ^ this.getClusterType() == null)
            return false;
        if (other.getClusterType() != null
                && other.getClusterType().equals(this.getClusterType()) == false)
            return false;
        if (other.getClusterVersion() == null ^ this.getClusterVersion() == null)
            return false;
        if (other.getClusterVersion() != null
                && other.getClusterVersion().equals(this.getClusterVersion()) == false)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() == null
                ^ this.getAutomatedSnapshotRetentionPeriod() == null)
            return false;
        if (other.getAutomatedSnapshotRetentionPeriod() != null
                && other.getAutomatedSnapshotRetentionPeriod().equals(
                        this.getAutomatedSnapshotRetentionPeriod()) == false)
            return false;
        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null
                && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getEnhancedVpcRouting() == null ^ this.getEnhancedVpcRouting() == null)
            return false;
        if (other.getEnhancedVpcRouting() != null
                && other.getEnhancedVpcRouting().equals(this.getEnhancedVpcRouting()) == false)
            return false;
        if (other.getMaintenanceTrackName() == null ^ this.getMaintenanceTrackName() == null)
            return false;
        if (other.getMaintenanceTrackName() != null
                && other.getMaintenanceTrackName().equals(this.getMaintenanceTrackName()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null
                && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        return true;
    }
}
