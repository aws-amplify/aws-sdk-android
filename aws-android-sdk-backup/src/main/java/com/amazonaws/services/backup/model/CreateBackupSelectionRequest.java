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
 * Creates a JSON document that specifies a set of resources to assign to a
 * backup plan. Resources can be included by specifying patterns for a
 * <code>ListOfTags</code> and selected <code>Resources</code>.
 * </p>
 * <p>
 * For example, consider the following patterns:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>Resources: "arn:aws:ec2:region:account-id:volume/volume-id"</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ConditionKey:"department"</code>
 * </p>
 * <p>
 * <code>ConditionValue:"finance"</code>
 * </p>
 * <p>
 * <code>ConditionType:"STRINGEQUALS"</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ConditionKey:"importance"</code>
 * </p>
 * <p>
 * <code>ConditionValue:"critical"</code>
 * </p>
 * <p>
 * <code>ConditionType:"STRINGEQUALS"</code>
 * </p>
 * </li>
 * </ul>
 * <p>
 * Using these patterns would back up all Amazon Elastic Block Store (Amazon
 * EBS) volumes that are tagged as <code>"department=finance"</code>,
 * <code>"importance=critical"</code>, in addition to an EBS volume with the
 * specified volume Id.
 * </p>
 * <p>
 * Resources and conditions are additive in that all resources that match the
 * pattern are selected. This shouldn't be confused with a logical AND, where
 * all conditions must match. The matching patterns are logically 'put together
 * using the OR operator. In other words, all patterns that match are selected
 * for backup.
 * </p>
 */
public class CreateBackupSelectionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection
     * of resources.
     * </p>
     */
    private String backupPlanId;

    /**
     * <p>
     * Specifies the body of a request to assign a set of resources to a backup
     * plan.
     * </p>
     */
    private BackupSelection backupSelection;

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to
     * be retried without the risk of executing the operation twice.
     * </p>
     */
    private String creatorRequestId;

    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection
     * of resources.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies the backup plan to be associated with the
     *         selection of resources.
     *         </p>
     */
    public String getBackupPlanId() {
        return backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection
     * of resources.
     * </p>
     *
     * @param backupPlanId <p>
     *            Uniquely identifies the backup plan to be associated with the
     *            selection of resources.
     *            </p>
     */
    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies the backup plan to be associated with the selection
     * of resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanId <p>
     *            Uniquely identifies the backup plan to be associated with the
     *            selection of resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupSelectionRequest withBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }

    /**
     * <p>
     * Specifies the body of a request to assign a set of resources to a backup
     * plan.
     * </p>
     *
     * @return <p>
     *         Specifies the body of a request to assign a set of resources to a
     *         backup plan.
     *         </p>
     */
    public BackupSelection getBackupSelection() {
        return backupSelection;
    }

    /**
     * <p>
     * Specifies the body of a request to assign a set of resources to a backup
     * plan.
     * </p>
     *
     * @param backupSelection <p>
     *            Specifies the body of a request to assign a set of resources
     *            to a backup plan.
     *            </p>
     */
    public void setBackupSelection(BackupSelection backupSelection) {
        this.backupSelection = backupSelection;
    }

    /**
     * <p>
     * Specifies the body of a request to assign a set of resources to a backup
     * plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupSelection <p>
     *            Specifies the body of a request to assign a set of resources
     *            to a backup plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupSelectionRequest withBackupSelection(BackupSelection backupSelection) {
        this.backupSelection = backupSelection;
        return this;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to
     * be retried without the risk of executing the operation twice.
     * </p>
     *
     * @return <p>
     *         A unique string that identifies the request and allows failed
     *         requests to be retried without the risk of executing the
     *         operation twice.
     *         </p>
     */
    public String getCreatorRequestId() {
        return creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to
     * be retried without the risk of executing the operation twice.
     * </p>
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and allows failed
     *            requests to be retried without the risk of executing the
     *            operation twice.
     *            </p>
     */
    public void setCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
    }

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to
     * be retried without the risk of executing the operation twice.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creatorRequestId <p>
     *            A unique string that identifies the request and allows failed
     *            requests to be retried without the risk of executing the
     *            operation twice.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupSelectionRequest withCreatorRequestId(String creatorRequestId) {
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
        if (getBackupPlanId() != null)
            sb.append("BackupPlanId: " + getBackupPlanId() + ",");
        if (getBackupSelection() != null)
            sb.append("BackupSelection: " + getBackupSelection() + ",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: " + getCreatorRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode
                + ((getBackupSelection() == null) ? 0 : getBackupSelection().hashCode());
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

        if (obj instanceof CreateBackupSelectionRequest == false)
            return false;
        CreateBackupSelectionRequest other = (CreateBackupSelectionRequest) obj;

        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null
                && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getBackupSelection() == null ^ this.getBackupSelection() == null)
            return false;
        if (other.getBackupSelection() != null
                && other.getBackupSelection().equals(this.getBackupSelection()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null
                && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        return true;
    }
}
