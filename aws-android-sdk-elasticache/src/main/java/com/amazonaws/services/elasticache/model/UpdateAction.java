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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

/**
 * <p>
 * The status of the service update for a specific replication group
 * </p>
 */
public class UpdateAction implements Serializable {
    /**
     * <p>
     * The ID of the replication group
     * </p>
     */
    private String replicationGroupId;

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     */
    private String cacheClusterId;

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     */
    private String serviceUpdateName;

    /**
     * <p>
     * The date the update is first available
     * </p>
     */
    private java.util.Date serviceUpdateReleaseDate;

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     */
    private String serviceUpdateSeverity;

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     */
    private String serviceUpdateStatus;

    /**
     * <p>
     * The recommended date to apply the service update to ensure compliance.
     * For information on compliance, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     */
    private java.util.Date serviceUpdateRecommendedApplyByDate;

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     */
    private String serviceUpdateType;

    /**
     * <p>
     * The date that the service update is available to a replication group
     * </p>
     */
    private java.util.Date updateActionAvailableDate;

    /**
     * <p>
     * The status of the update action
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     */
    private String updateActionStatus;

    /**
     * <p>
     * The progress of the service update on the replication group
     * </p>
     */
    private String nodesUpdated;

    /**
     * <p>
     * The date when the UpdateActionStatus was last modified
     * </p>
     */
    private java.util.Date updateActionStatusModifiedDate;

    /**
     * <p>
     * If yes, all nodes in the replication group have been updated by the
     * recommended apply-by date. If no, at least one node in the replication
     * group have not been updated by the recommended apply-by date. If N/A, the
     * replication group was created after the recommended apply-by date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>yes, no, n/a
     */
    private String slaMet;

    /**
     * <p>
     * The status of the service update on the node group
     * </p>
     */
    private java.util.List<NodeGroupUpdateStatus> nodeGroupUpdateStatus;

    /**
     * <p>
     * The status of the service update on the cache node
     * </p>
     */
    private java.util.List<CacheNodeUpdateStatus> cacheNodeUpdateStatus;

    /**
     * <p>
     * The estimated length of time for the update to complete
     * </p>
     */
    private String estimatedUpdateTime;

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The ID of the replication group
     * </p>
     *
     * @return <p>
     *         The ID of the replication group
     *         </p>
     */
    public String getReplicationGroupId() {
        return replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group
     * </p>
     *
     * @param replicationGroupId <p>
     *            The ID of the replication group
     *            </p>
     */
    public void setReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
    }

    /**
     * <p>
     * The ID of the replication group
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param replicationGroupId <p>
     *            The ID of the replication group
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withReplicationGroupId(String replicationGroupId) {
        this.replicationGroupId = replicationGroupId;
        return this;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     *
     * @return <p>
     *         The ID of the cache cluster
     *         </p>
     */
    public String getCacheClusterId() {
        return cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     *
     * @param cacheClusterId <p>
     *            The ID of the cache cluster
     *            </p>
     */
    public void setCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
    }

    /**
     * <p>
     * The ID of the cache cluster
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheClusterId <p>
     *            The ID of the cache cluster
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withCacheClusterId(String cacheClusterId) {
        this.cacheClusterId = cacheClusterId;
        return this;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     *
     * @return <p>
     *         The unique ID of the service update
     *         </p>
     */
    public String getServiceUpdateName() {
        return serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     *
     * @param serviceUpdateName <p>
     *            The unique ID of the service update
     *            </p>
     */
    public void setServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
    }

    /**
     * <p>
     * The unique ID of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateName <p>
     *            The unique ID of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withServiceUpdateName(String serviceUpdateName) {
        this.serviceUpdateName = serviceUpdateName;
        return this;
    }

    /**
     * <p>
     * The date the update is first available
     * </p>
     *
     * @return <p>
     *         The date the update is first available
     *         </p>
     */
    public java.util.Date getServiceUpdateReleaseDate() {
        return serviceUpdateReleaseDate;
    }

    /**
     * <p>
     * The date the update is first available
     * </p>
     *
     * @param serviceUpdateReleaseDate <p>
     *            The date the update is first available
     *            </p>
     */
    public void setServiceUpdateReleaseDate(java.util.Date serviceUpdateReleaseDate) {
        this.serviceUpdateReleaseDate = serviceUpdateReleaseDate;
    }

    /**
     * <p>
     * The date the update is first available
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateReleaseDate <p>
     *            The date the update is first available
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withServiceUpdateReleaseDate(java.util.Date serviceUpdateReleaseDate) {
        this.serviceUpdateReleaseDate = serviceUpdateReleaseDate;
        return this;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     *
     * @return <p>
     *         The severity of the service update
     *         </p>
     * @see ServiceUpdateSeverity
     */
    public String getServiceUpdateSeverity() {
        return serviceUpdateSeverity;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     *
     * @param serviceUpdateSeverity <p>
     *            The severity of the service update
     *            </p>
     * @see ServiceUpdateSeverity
     */
    public void setServiceUpdateSeverity(String serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     *
     * @param serviceUpdateSeverity <p>
     *            The severity of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateSeverity
     */
    public UpdateAction withServiceUpdateSeverity(String serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity;
        return this;
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     *
     * @param serviceUpdateSeverity <p>
     *            The severity of the service update
     *            </p>
     * @see ServiceUpdateSeverity
     */
    public void setServiceUpdateSeverity(ServiceUpdateSeverity serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity.toString();
    }

    /**
     * <p>
     * The severity of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>critical, important, medium, low
     *
     * @param serviceUpdateSeverity <p>
     *            The severity of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateSeverity
     */
    public UpdateAction withServiceUpdateSeverity(ServiceUpdateSeverity serviceUpdateSeverity) {
        this.serviceUpdateSeverity = serviceUpdateSeverity.toString();
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     *
     * @return <p>
     *         The status of the service update
     *         </p>
     * @see ServiceUpdateStatus
     */
    public String getServiceUpdateStatus() {
        return serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @see ServiceUpdateStatus
     */
    public void setServiceUpdateStatus(String serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateStatus
     */
    public UpdateAction withServiceUpdateStatus(String serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus;
        return this;
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @see ServiceUpdateStatus
     */
    public void setServiceUpdateStatus(ServiceUpdateStatus serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus.toString();
    }

    /**
     * <p>
     * The status of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, cancelled, expired
     *
     * @param serviceUpdateStatus <p>
     *            The status of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateStatus
     */
    public UpdateAction withServiceUpdateStatus(ServiceUpdateStatus serviceUpdateStatus) {
        this.serviceUpdateStatus = serviceUpdateStatus.toString();
        return this;
    }

    /**
     * <p>
     * The recommended date to apply the service update to ensure compliance.
     * For information on compliance, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     *
     * @return <p>
     *         The recommended date to apply the service update to ensure
     *         compliance. For information on compliance, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *         >Self-Service Security Updates for Compliance</a>.
     *         </p>
     */
    public java.util.Date getServiceUpdateRecommendedApplyByDate() {
        return serviceUpdateRecommendedApplyByDate;
    }

    /**
     * <p>
     * The recommended date to apply the service update to ensure compliance.
     * For information on compliance, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     *
     * @param serviceUpdateRecommendedApplyByDate <p>
     *            The recommended date to apply the service update to ensure
     *            compliance. For information on compliance, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *            >Self-Service Security Updates for Compliance</a>.
     *            </p>
     */
    public void setServiceUpdateRecommendedApplyByDate(
            java.util.Date serviceUpdateRecommendedApplyByDate) {
        this.serviceUpdateRecommendedApplyByDate = serviceUpdateRecommendedApplyByDate;
    }

    /**
     * <p>
     * The recommended date to apply the service update to ensure compliance.
     * For information on compliance, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     * >Self-Service Security Updates for Compliance</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param serviceUpdateRecommendedApplyByDate <p>
     *            The recommended date to apply the service update to ensure
     *            compliance. For information on compliance, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/elasticache-compliance.html#elasticache-compliance-self-service"
     *            >Self-Service Security Updates for Compliance</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withServiceUpdateRecommendedApplyByDate(
            java.util.Date serviceUpdateRecommendedApplyByDate) {
        this.serviceUpdateRecommendedApplyByDate = serviceUpdateRecommendedApplyByDate;
        return this;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     *
     * @return <p>
     *         Reflects the nature of the service update
     *         </p>
     * @see ServiceUpdateType
     */
    public String getServiceUpdateType() {
        return serviceUpdateType;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     *
     * @param serviceUpdateType <p>
     *            Reflects the nature of the service update
     *            </p>
     * @see ServiceUpdateType
     */
    public void setServiceUpdateType(String serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     *
     * @param serviceUpdateType <p>
     *            Reflects the nature of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateType
     */
    public UpdateAction withServiceUpdateType(String serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType;
        return this;
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     *
     * @param serviceUpdateType <p>
     *            Reflects the nature of the service update
     *            </p>
     * @see ServiceUpdateType
     */
    public void setServiceUpdateType(ServiceUpdateType serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType.toString();
    }

    /**
     * <p>
     * Reflects the nature of the service update
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>security-update
     *
     * @param serviceUpdateType <p>
     *            Reflects the nature of the service update
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ServiceUpdateType
     */
    public UpdateAction withServiceUpdateType(ServiceUpdateType serviceUpdateType) {
        this.serviceUpdateType = serviceUpdateType.toString();
        return this;
    }

    /**
     * <p>
     * The date that the service update is available to a replication group
     * </p>
     *
     * @return <p>
     *         The date that the service update is available to a replication
     *         group
     *         </p>
     */
    public java.util.Date getUpdateActionAvailableDate() {
        return updateActionAvailableDate;
    }

    /**
     * <p>
     * The date that the service update is available to a replication group
     * </p>
     *
     * @param updateActionAvailableDate <p>
     *            The date that the service update is available to a replication
     *            group
     *            </p>
     */
    public void setUpdateActionAvailableDate(java.util.Date updateActionAvailableDate) {
        this.updateActionAvailableDate = updateActionAvailableDate;
    }

    /**
     * <p>
     * The date that the service update is available to a replication group
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateActionAvailableDate <p>
     *            The date that the service update is available to a replication
     *            group
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withUpdateActionAvailableDate(java.util.Date updateActionAvailableDate) {
        this.updateActionAvailableDate = updateActionAvailableDate;
        return this;
    }

    /**
     * <p>
     * The status of the update action
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     *
     * @return <p>
     *         The status of the update action
     *         </p>
     * @see UpdateActionStatus
     */
    public String getUpdateActionStatus() {
        return updateActionStatus;
    }

    /**
     * <p>
     * The status of the update action
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     *
     * @param updateActionStatus <p>
     *            The status of the update action
     *            </p>
     * @see UpdateActionStatus
     */
    public void setUpdateActionStatus(String updateActionStatus) {
        this.updateActionStatus = updateActionStatus;
    }

    /**
     * <p>
     * The status of the update action
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     *
     * @param updateActionStatus <p>
     *            The status of the update action
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpdateActionStatus
     */
    public UpdateAction withUpdateActionStatus(String updateActionStatus) {
        this.updateActionStatus = updateActionStatus;
        return this;
    }

    /**
     * <p>
     * The status of the update action
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     *
     * @param updateActionStatus <p>
     *            The status of the update action
     *            </p>
     * @see UpdateActionStatus
     */
    public void setUpdateActionStatus(UpdateActionStatus updateActionStatus) {
        this.updateActionStatus = updateActionStatus.toString();
    }

    /**
     * <p>
     * The status of the update action
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>not-applied, waiting-to-start, in-progress,
     * stopping, stopped, complete, scheduling, scheduled, not-applicable
     *
     * @param updateActionStatus <p>
     *            The status of the update action
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UpdateActionStatus
     */
    public UpdateAction withUpdateActionStatus(UpdateActionStatus updateActionStatus) {
        this.updateActionStatus = updateActionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The progress of the service update on the replication group
     * </p>
     *
     * @return <p>
     *         The progress of the service update on the replication group
     *         </p>
     */
    public String getNodesUpdated() {
        return nodesUpdated;
    }

    /**
     * <p>
     * The progress of the service update on the replication group
     * </p>
     *
     * @param nodesUpdated <p>
     *            The progress of the service update on the replication group
     *            </p>
     */
    public void setNodesUpdated(String nodesUpdated) {
        this.nodesUpdated = nodesUpdated;
    }

    /**
     * <p>
     * The progress of the service update on the replication group
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodesUpdated <p>
     *            The progress of the service update on the replication group
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withNodesUpdated(String nodesUpdated) {
        this.nodesUpdated = nodesUpdated;
        return this;
    }

    /**
     * <p>
     * The date when the UpdateActionStatus was last modified
     * </p>
     *
     * @return <p>
     *         The date when the UpdateActionStatus was last modified
     *         </p>
     */
    public java.util.Date getUpdateActionStatusModifiedDate() {
        return updateActionStatusModifiedDate;
    }

    /**
     * <p>
     * The date when the UpdateActionStatus was last modified
     * </p>
     *
     * @param updateActionStatusModifiedDate <p>
     *            The date when the UpdateActionStatus was last modified
     *            </p>
     */
    public void setUpdateActionStatusModifiedDate(java.util.Date updateActionStatusModifiedDate) {
        this.updateActionStatusModifiedDate = updateActionStatusModifiedDate;
    }

    /**
     * <p>
     * The date when the UpdateActionStatus was last modified
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateActionStatusModifiedDate <p>
     *            The date when the UpdateActionStatus was last modified
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withUpdateActionStatusModifiedDate(
            java.util.Date updateActionStatusModifiedDate) {
        this.updateActionStatusModifiedDate = updateActionStatusModifiedDate;
        return this;
    }

    /**
     * <p>
     * If yes, all nodes in the replication group have been updated by the
     * recommended apply-by date. If no, at least one node in the replication
     * group have not been updated by the recommended apply-by date. If N/A, the
     * replication group was created after the recommended apply-by date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>yes, no, n/a
     *
     * @return <p>
     *         If yes, all nodes in the replication group have been updated by
     *         the recommended apply-by date. If no, at least one node in the
     *         replication group have not been updated by the recommended
     *         apply-by date. If N/A, the replication group was created after
     *         the recommended apply-by date.
     *         </p>
     * @see SlaMet
     */
    public String getSlaMet() {
        return slaMet;
    }

    /**
     * <p>
     * If yes, all nodes in the replication group have been updated by the
     * recommended apply-by date. If no, at least one node in the replication
     * group have not been updated by the recommended apply-by date. If N/A, the
     * replication group was created after the recommended apply-by date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>yes, no, n/a
     *
     * @param slaMet <p>
     *            If yes, all nodes in the replication group have been updated
     *            by the recommended apply-by date. If no, at least one node in
     *            the replication group have not been updated by the recommended
     *            apply-by date. If N/A, the replication group was created after
     *            the recommended apply-by date.
     *            </p>
     * @see SlaMet
     */
    public void setSlaMet(String slaMet) {
        this.slaMet = slaMet;
    }

    /**
     * <p>
     * If yes, all nodes in the replication group have been updated by the
     * recommended apply-by date. If no, at least one node in the replication
     * group have not been updated by the recommended apply-by date. If N/A, the
     * replication group was created after the recommended apply-by date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>yes, no, n/a
     *
     * @param slaMet <p>
     *            If yes, all nodes in the replication group have been updated
     *            by the recommended apply-by date. If no, at least one node in
     *            the replication group have not been updated by the recommended
     *            apply-by date. If N/A, the replication group was created after
     *            the recommended apply-by date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SlaMet
     */
    public UpdateAction withSlaMet(String slaMet) {
        this.slaMet = slaMet;
        return this;
    }

    /**
     * <p>
     * If yes, all nodes in the replication group have been updated by the
     * recommended apply-by date. If no, at least one node in the replication
     * group have not been updated by the recommended apply-by date. If N/A, the
     * replication group was created after the recommended apply-by date.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>yes, no, n/a
     *
     * @param slaMet <p>
     *            If yes, all nodes in the replication group have been updated
     *            by the recommended apply-by date. If no, at least one node in
     *            the replication group have not been updated by the recommended
     *            apply-by date. If N/A, the replication group was created after
     *            the recommended apply-by date.
     *            </p>
     * @see SlaMet
     */
    public void setSlaMet(SlaMet slaMet) {
        this.slaMet = slaMet.toString();
    }

    /**
     * <p>
     * If yes, all nodes in the replication group have been updated by the
     * recommended apply-by date. If no, at least one node in the replication
     * group have not been updated by the recommended apply-by date. If N/A, the
     * replication group was created after the recommended apply-by date.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>yes, no, n/a
     *
     * @param slaMet <p>
     *            If yes, all nodes in the replication group have been updated
     *            by the recommended apply-by date. If no, at least one node in
     *            the replication group have not been updated by the recommended
     *            apply-by date. If N/A, the replication group was created after
     *            the recommended apply-by date.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SlaMet
     */
    public UpdateAction withSlaMet(SlaMet slaMet) {
        this.slaMet = slaMet.toString();
        return this;
    }

    /**
     * <p>
     * The status of the service update on the node group
     * </p>
     *
     * @return <p>
     *         The status of the service update on the node group
     *         </p>
     */
    public java.util.List<NodeGroupUpdateStatus> getNodeGroupUpdateStatus() {
        return nodeGroupUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update on the node group
     * </p>
     *
     * @param nodeGroupUpdateStatus <p>
     *            The status of the service update on the node group
     *            </p>
     */
    public void setNodeGroupUpdateStatus(
            java.util.Collection<NodeGroupUpdateStatus> nodeGroupUpdateStatus) {
        if (nodeGroupUpdateStatus == null) {
            this.nodeGroupUpdateStatus = null;
            return;
        }

        this.nodeGroupUpdateStatus = new java.util.ArrayList<NodeGroupUpdateStatus>(
                nodeGroupUpdateStatus);
    }

    /**
     * <p>
     * The status of the service update on the node group
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupUpdateStatus <p>
     *            The status of the service update on the node group
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withNodeGroupUpdateStatus(NodeGroupUpdateStatus... nodeGroupUpdateStatus) {
        if (getNodeGroupUpdateStatus() == null) {
            this.nodeGroupUpdateStatus = new java.util.ArrayList<NodeGroupUpdateStatus>(
                    nodeGroupUpdateStatus.length);
        }
        for (NodeGroupUpdateStatus value : nodeGroupUpdateStatus) {
            this.nodeGroupUpdateStatus.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status of the service update on the node group
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeGroupUpdateStatus <p>
     *            The status of the service update on the node group
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withNodeGroupUpdateStatus(
            java.util.Collection<NodeGroupUpdateStatus> nodeGroupUpdateStatus) {
        setNodeGroupUpdateStatus(nodeGroupUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the service update on the cache node
     * </p>
     *
     * @return <p>
     *         The status of the service update on the cache node
     *         </p>
     */
    public java.util.List<CacheNodeUpdateStatus> getCacheNodeUpdateStatus() {
        return cacheNodeUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update on the cache node
     * </p>
     *
     * @param cacheNodeUpdateStatus <p>
     *            The status of the service update on the cache node
     *            </p>
     */
    public void setCacheNodeUpdateStatus(
            java.util.Collection<CacheNodeUpdateStatus> cacheNodeUpdateStatus) {
        if (cacheNodeUpdateStatus == null) {
            this.cacheNodeUpdateStatus = null;
            return;
        }

        this.cacheNodeUpdateStatus = new java.util.ArrayList<CacheNodeUpdateStatus>(
                cacheNodeUpdateStatus);
    }

    /**
     * <p>
     * The status of the service update on the cache node
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeUpdateStatus <p>
     *            The status of the service update on the cache node
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withCacheNodeUpdateStatus(CacheNodeUpdateStatus... cacheNodeUpdateStatus) {
        if (getCacheNodeUpdateStatus() == null) {
            this.cacheNodeUpdateStatus = new java.util.ArrayList<CacheNodeUpdateStatus>(
                    cacheNodeUpdateStatus.length);
        }
        for (CacheNodeUpdateStatus value : cacheNodeUpdateStatus) {
            this.cacheNodeUpdateStatus.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The status of the service update on the cache node
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cacheNodeUpdateStatus <p>
     *            The status of the service update on the cache node
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withCacheNodeUpdateStatus(
            java.util.Collection<CacheNodeUpdateStatus> cacheNodeUpdateStatus) {
        setCacheNodeUpdateStatus(cacheNodeUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The estimated length of time for the update to complete
     * </p>
     *
     * @return <p>
     *         The estimated length of time for the update to complete
     *         </p>
     */
    public String getEstimatedUpdateTime() {
        return estimatedUpdateTime;
    }

    /**
     * <p>
     * The estimated length of time for the update to complete
     * </p>
     *
     * @param estimatedUpdateTime <p>
     *            The estimated length of time for the update to complete
     *            </p>
     */
    public void setEstimatedUpdateTime(String estimatedUpdateTime) {
        this.estimatedUpdateTime = estimatedUpdateTime;
    }

    /**
     * <p>
     * The estimated length of time for the update to complete
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedUpdateTime <p>
     *            The estimated length of time for the update to complete
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withEstimatedUpdateTime(String estimatedUpdateTime) {
        this.estimatedUpdateTime = estimatedUpdateTime;
        return this;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     *
     * @return <p>
     *         The Elasticache engine to which the update applies. Either Redis
     *         or Memcached
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     *
     * @param engine <p>
     *            The Elasticache engine to which the update applies. Either
     *            Redis or Memcached
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The Elasticache engine to which the update applies. Either Redis or
     * Memcached
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The Elasticache engine to which the update applies. Either
     *            Redis or Memcached
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAction withEngine(String engine) {
        this.engine = engine;
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
        if (getReplicationGroupId() != null)
            sb.append("ReplicationGroupId: " + getReplicationGroupId() + ",");
        if (getCacheClusterId() != null)
            sb.append("CacheClusterId: " + getCacheClusterId() + ",");
        if (getServiceUpdateName() != null)
            sb.append("ServiceUpdateName: " + getServiceUpdateName() + ",");
        if (getServiceUpdateReleaseDate() != null)
            sb.append("ServiceUpdateReleaseDate: " + getServiceUpdateReleaseDate() + ",");
        if (getServiceUpdateSeverity() != null)
            sb.append("ServiceUpdateSeverity: " + getServiceUpdateSeverity() + ",");
        if (getServiceUpdateStatus() != null)
            sb.append("ServiceUpdateStatus: " + getServiceUpdateStatus() + ",");
        if (getServiceUpdateRecommendedApplyByDate() != null)
            sb.append("ServiceUpdateRecommendedApplyByDate: "
                    + getServiceUpdateRecommendedApplyByDate() + ",");
        if (getServiceUpdateType() != null)
            sb.append("ServiceUpdateType: " + getServiceUpdateType() + ",");
        if (getUpdateActionAvailableDate() != null)
            sb.append("UpdateActionAvailableDate: " + getUpdateActionAvailableDate() + ",");
        if (getUpdateActionStatus() != null)
            sb.append("UpdateActionStatus: " + getUpdateActionStatus() + ",");
        if (getNodesUpdated() != null)
            sb.append("NodesUpdated: " + getNodesUpdated() + ",");
        if (getUpdateActionStatusModifiedDate() != null)
            sb.append("UpdateActionStatusModifiedDate: " + getUpdateActionStatusModifiedDate()
                    + ",");
        if (getSlaMet() != null)
            sb.append("SlaMet: " + getSlaMet() + ",");
        if (getNodeGroupUpdateStatus() != null)
            sb.append("NodeGroupUpdateStatus: " + getNodeGroupUpdateStatus() + ",");
        if (getCacheNodeUpdateStatus() != null)
            sb.append("CacheNodeUpdateStatus: " + getCacheNodeUpdateStatus() + ",");
        if (getEstimatedUpdateTime() != null)
            sb.append("EstimatedUpdateTime: " + getEstimatedUpdateTime() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReplicationGroupId() == null) ? 0 : getReplicationGroupId().hashCode());
        hashCode = prime * hashCode
                + ((getCacheClusterId() == null) ? 0 : getCacheClusterId().hashCode());
        hashCode = prime * hashCode
                + ((getServiceUpdateName() == null) ? 0 : getServiceUpdateName().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceUpdateReleaseDate() == null) ? 0 : getServiceUpdateReleaseDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceUpdateSeverity() == null) ? 0 : getServiceUpdateSeverity().hashCode());
        hashCode = prime * hashCode
                + ((getServiceUpdateStatus() == null) ? 0 : getServiceUpdateStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceUpdateRecommendedApplyByDate() == null) ? 0
                        : getServiceUpdateRecommendedApplyByDate().hashCode());
        hashCode = prime * hashCode
                + ((getServiceUpdateType() == null) ? 0 : getServiceUpdateType().hashCode());
        hashCode = prime
                * hashCode
                + ((getUpdateActionAvailableDate() == null) ? 0 : getUpdateActionAvailableDate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getUpdateActionStatus() == null) ? 0 : getUpdateActionStatus().hashCode());
        hashCode = prime * hashCode
                + ((getNodesUpdated() == null) ? 0 : getNodesUpdated().hashCode());
        hashCode = prime
                * hashCode
                + ((getUpdateActionStatusModifiedDate() == null) ? 0
                        : getUpdateActionStatusModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getSlaMet() == null) ? 0 : getSlaMet().hashCode());
        hashCode = prime
                * hashCode
                + ((getNodeGroupUpdateStatus() == null) ? 0 : getNodeGroupUpdateStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheNodeUpdateStatus() == null) ? 0 : getCacheNodeUpdateStatus().hashCode());
        hashCode = prime * hashCode
                + ((getEstimatedUpdateTime() == null) ? 0 : getEstimatedUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAction == false)
            return false;
        UpdateAction other = (UpdateAction) obj;

        if (other.getReplicationGroupId() == null ^ this.getReplicationGroupId() == null)
            return false;
        if (other.getReplicationGroupId() != null
                && other.getReplicationGroupId().equals(this.getReplicationGroupId()) == false)
            return false;
        if (other.getCacheClusterId() == null ^ this.getCacheClusterId() == null)
            return false;
        if (other.getCacheClusterId() != null
                && other.getCacheClusterId().equals(this.getCacheClusterId()) == false)
            return false;
        if (other.getServiceUpdateName() == null ^ this.getServiceUpdateName() == null)
            return false;
        if (other.getServiceUpdateName() != null
                && other.getServiceUpdateName().equals(this.getServiceUpdateName()) == false)
            return false;
        if (other.getServiceUpdateReleaseDate() == null
                ^ this.getServiceUpdateReleaseDate() == null)
            return false;
        if (other.getServiceUpdateReleaseDate() != null
                && other.getServiceUpdateReleaseDate().equals(this.getServiceUpdateReleaseDate()) == false)
            return false;
        if (other.getServiceUpdateSeverity() == null ^ this.getServiceUpdateSeverity() == null)
            return false;
        if (other.getServiceUpdateSeverity() != null
                && other.getServiceUpdateSeverity().equals(this.getServiceUpdateSeverity()) == false)
            return false;
        if (other.getServiceUpdateStatus() == null ^ this.getServiceUpdateStatus() == null)
            return false;
        if (other.getServiceUpdateStatus() != null
                && other.getServiceUpdateStatus().equals(this.getServiceUpdateStatus()) == false)
            return false;
        if (other.getServiceUpdateRecommendedApplyByDate() == null
                ^ this.getServiceUpdateRecommendedApplyByDate() == null)
            return false;
        if (other.getServiceUpdateRecommendedApplyByDate() != null
                && other.getServiceUpdateRecommendedApplyByDate().equals(
                        this.getServiceUpdateRecommendedApplyByDate()) == false)
            return false;
        if (other.getServiceUpdateType() == null ^ this.getServiceUpdateType() == null)
            return false;
        if (other.getServiceUpdateType() != null
                && other.getServiceUpdateType().equals(this.getServiceUpdateType()) == false)
            return false;
        if (other.getUpdateActionAvailableDate() == null
                ^ this.getUpdateActionAvailableDate() == null)
            return false;
        if (other.getUpdateActionAvailableDate() != null
                && other.getUpdateActionAvailableDate().equals(this.getUpdateActionAvailableDate()) == false)
            return false;
        if (other.getUpdateActionStatus() == null ^ this.getUpdateActionStatus() == null)
            return false;
        if (other.getUpdateActionStatus() != null
                && other.getUpdateActionStatus().equals(this.getUpdateActionStatus()) == false)
            return false;
        if (other.getNodesUpdated() == null ^ this.getNodesUpdated() == null)
            return false;
        if (other.getNodesUpdated() != null
                && other.getNodesUpdated().equals(this.getNodesUpdated()) == false)
            return false;
        if (other.getUpdateActionStatusModifiedDate() == null
                ^ this.getUpdateActionStatusModifiedDate() == null)
            return false;
        if (other.getUpdateActionStatusModifiedDate() != null
                && other.getUpdateActionStatusModifiedDate().equals(
                        this.getUpdateActionStatusModifiedDate()) == false)
            return false;
        if (other.getSlaMet() == null ^ this.getSlaMet() == null)
            return false;
        if (other.getSlaMet() != null && other.getSlaMet().equals(this.getSlaMet()) == false)
            return false;
        if (other.getNodeGroupUpdateStatus() == null ^ this.getNodeGroupUpdateStatus() == null)
            return false;
        if (other.getNodeGroupUpdateStatus() != null
                && other.getNodeGroupUpdateStatus().equals(this.getNodeGroupUpdateStatus()) == false)
            return false;
        if (other.getCacheNodeUpdateStatus() == null ^ this.getCacheNodeUpdateStatus() == null)
            return false;
        if (other.getCacheNodeUpdateStatus() != null
                && other.getCacheNodeUpdateStatus().equals(this.getCacheNodeUpdateStatus()) == false)
            return false;
        if (other.getEstimatedUpdateTime() == null ^ this.getEstimatedUpdateTime() == null)
            return false;
        if (other.getEstimatedUpdateTime() != null
                && other.getEstimatedUpdateTime().equals(this.getEstimatedUpdateTime()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        return true;
    }
}
