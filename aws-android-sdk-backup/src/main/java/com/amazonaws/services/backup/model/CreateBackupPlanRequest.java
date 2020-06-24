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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Backup plans are documents that contain information that AWS Backup uses to
 * schedule tasks that create recovery points of resources.
 * </p>
 * <p>
 * If you call <code>CreateBackupPlan</code> with a plan that already exists, an
 * <code>AlreadyExistsException</code> is returned.
 * </p>
 */
public class CreateBackupPlanRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the body of a backup plan. Includes a
     * <code>BackupPlanName</code> and one or more sets of <code>Rules</code>.
     * </p>
     */
    private BackupPlanInput backupPlan;

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the
     * resources that you create. Each tag is a key-value pair. The specified
     * tags are assigned to all backups created with this plan.
     * </p>
     */
    private java.util.Map<String, String> backupPlanTags;

    /**
     * <p>
     * Identifies the request and allows failed requests to be retried without
     * the risk of executing the operation twice. If the request includes a
     * <code>CreatorRequestId</code> that matches an existing backup plan, that
     * plan is returned. This parameter is optional.
     * </p>
     */
    private String creatorRequestId;

    /**
     * <p>
     * Specifies the body of a backup plan. Includes a
     * <code>BackupPlanName</code> and one or more sets of <code>Rules</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the body of a backup plan. Includes a
     *         <code>BackupPlanName</code> and one or more sets of
     *         <code>Rules</code>.
     *         </p>
     */
    public BackupPlanInput getBackupPlan() {
        return backupPlan;
    }

    /**
     * <p>
     * Specifies the body of a backup plan. Includes a
     * <code>BackupPlanName</code> and one or more sets of <code>Rules</code>.
     * </p>
     *
     * @param backupPlan <p>
     *            Specifies the body of a backup plan. Includes a
     *            <code>BackupPlanName</code> and one or more sets of
     *            <code>Rules</code>.
     *            </p>
     */
    public void setBackupPlan(BackupPlanInput backupPlan) {
        this.backupPlan = backupPlan;
    }

    /**
     * <p>
     * Specifies the body of a backup plan. Includes a
     * <code>BackupPlanName</code> and one or more sets of <code>Rules</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlan <p>
     *            Specifies the body of a backup plan. Includes a
     *            <code>BackupPlanName</code> and one or more sets of
     *            <code>Rules</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupPlanRequest withBackupPlan(BackupPlanInput backupPlan) {
        this.backupPlan = backupPlan;
        return this;
    }

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the
     * resources that you create. Each tag is a key-value pair. The specified
     * tags are assigned to all backups created with this plan.
     * </p>
     *
     * @return <p>
     *         To help organize your resources, you can assign your own metadata
     *         to the resources that you create. Each tag is a key-value pair.
     *         The specified tags are assigned to all backups created with this
     *         plan.
     *         </p>
     */
    public java.util.Map<String, String> getBackupPlanTags() {
        return backupPlanTags;
    }

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the
     * resources that you create. Each tag is a key-value pair. The specified
     * tags are assigned to all backups created with this plan.
     * </p>
     *
     * @param backupPlanTags <p>
     *            To help organize your resources, you can assign your own
     *            metadata to the resources that you create. Each tag is a
     *            key-value pair. The specified tags are assigned to all backups
     *            created with this plan.
     *            </p>
     */
    public void setBackupPlanTags(java.util.Map<String, String> backupPlanTags) {
        this.backupPlanTags = backupPlanTags;
    }

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the
     * resources that you create. Each tag is a key-value pair. The specified
     * tags are assigned to all backups created with this plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanTags <p>
     *            To help organize your resources, you can assign your own
     *            metadata to the resources that you create. Each tag is a
     *            key-value pair. The specified tags are assigned to all backups
     *            created with this plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupPlanRequest withBackupPlanTags(java.util.Map<String, String> backupPlanTags) {
        this.backupPlanTags = backupPlanTags;
        return this;
    }

    /**
     * <p>
     * To help organize your resources, you can assign your own metadata to the
     * resources that you create. Each tag is a key-value pair. The specified
     * tags are assigned to all backups created with this plan.
     * </p>
     * <p>
     * The method adds a new key-value pair into BackupPlanTags parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into BackupPlanTags.
     * @param value The corresponding value of the entry to be added into
     *            BackupPlanTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupPlanRequest addBackupPlanTagsEntry(String key, String value) {
        if (null == this.backupPlanTags) {
            this.backupPlanTags = new java.util.HashMap<String, String>();
        }
        if (this.backupPlanTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.backupPlanTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into BackupPlanTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateBackupPlanRequest clearBackupPlanTagsEntries() {
        this.backupPlanTags = null;
        return this;
    }

    /**
     * <p>
     * Identifies the request and allows failed requests to be retried without
     * the risk of executing the operation twice. If the request includes a
     * <code>CreatorRequestId</code> that matches an existing backup plan, that
     * plan is returned. This parameter is optional.
     * </p>
     *
     * @return <p>
     *         Identifies the request and allows failed requests to be retried
     *         without the risk of executing the operation twice. If the request
     *         includes a <code>CreatorRequestId</code> that matches an existing
     *         backup plan, that plan is returned. This parameter is optional.
     *         </p>
     */
    public String getCreatorRequestId() {
        return creatorRequestId;
    }

    /**
     * <p>
     * Identifies the request and allows failed requests to be retried without
     * the risk of executing the operation twice. If the request includes a
     * <code>CreatorRequestId</code> that matches an existing backup plan, that
     * plan is returned. This parameter is optional.
     * </p>
     *
     * @param creatorRequestId <p>
     *            Identifies the request and allows failed requests to be
     *            retried without the risk of executing the operation twice. If
     *            the request includes a <code>CreatorRequestId</code> that
     *            matches an existing backup plan, that plan is returned. This
     *            parameter is optional.
     *            </p>
     */
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * Identifies the request and allows failed requests to be retried without
     * the risk of executing the operation twice. If the request includes a
     * <code>CreatorRequestId</code> that matches an existing backup plan, that
     * plan is returned. This parameter is optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creatorRequestId <p>
     *            Identifies the request and allows failed requests to be
     *            retried without the risk of executing the operation twice. If
     *            the request includes a <code>CreatorRequestId</code> that
     *            matches an existing backup plan, that plan is returned. This
     *            parameter is optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupPlanRequest withCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
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
        if (getBackupPlan() != null)
            sb.append("BackupPlan: " + getBackupPlan() + ",");
        if (getBackupPlanTags() != null)
            sb.append("BackupPlanTags: " + getBackupPlanTags() + ",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: " + getCreatorRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlan() == null) ? 0 : getBackupPlan().hashCode());
        hashCode = prime * hashCode
                + ((getBackupPlanTags() == null) ? 0 : getBackupPlanTags().hashCode());
        hashCode = prime * hashCode
                + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackupPlanRequest == false)
            return false;
        CreateBackupPlanRequest other = (CreateBackupPlanRequest) obj;

        if (other.getBackupPlan() == null ^ this.getBackupPlan() == null)
            return false;
        if (other.getBackupPlan() != null
                && other.getBackupPlan().equals(this.getBackupPlan()) == false)
            return false;
        if (other.getBackupPlanTags() == null ^ this.getBackupPlanTags() == null)
            return false;
        if (other.getBackupPlanTags() != null
                && other.getBackupPlanTags().equals(this.getBackupPlanTags()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null
                && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        return true;
    }
}
