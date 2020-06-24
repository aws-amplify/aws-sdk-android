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
 * Replaces the body of a saved backup plan identified by its
 * <code>backupPlanId</code> with the input document in JSON format. The new
 * version is uniquely identified by a <code>VersionId</code>.
 * </p>
 */
public class UpdateBackupPlanRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     */
    private String backupPlanId;

    /**
     * <p>
     * Specifies the body of a backup plan. Includes a
     * <code>BackupPlanName</code> and one or more sets of <code>Rules</code>.
     * </p>
     */
    private BackupPlanInput backupPlan;

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies a backup plan.
     *         </p>
     */
    public String getBackupPlanId() {
        return backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     *
     * @param backupPlanId <p>
     *            Uniquely identifies a backup plan.
     *            </p>
     */
    public void setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
    }

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanId <p>
     *            Uniquely identifies a backup plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBackupPlanRequest withBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }

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
    public UpdateBackupPlanRequest withBackupPlan(BackupPlanInput backupPlan) {
        this.backupPlan = backupPlan;
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
        if (getBackupPlan() != null)
            sb.append("BackupPlan: " + getBackupPlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode + ((getBackupPlan() == null) ? 0 : getBackupPlan().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBackupPlanRequest == false)
            return false;
        UpdateBackupPlanRequest other = (UpdateBackupPlanRequest) obj;

        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null
                && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getBackupPlan() == null ^ this.getBackupPlan() == null)
            return false;
        if (other.getBackupPlan() != null
                && other.getBackupPlan().equals(this.getBackupPlan()) == false)
            return false;
        return true;
    }
}
