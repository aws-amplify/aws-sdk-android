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

public class GetBackupPlanFromJSONResult implements Serializable {
    /**
     * <p>
     * Specifies the body of a backup plan. Includes a
     * <code>BackupPlanName</code> and one or more sets of <code>Rules</code>.
     * </p>
     */
    private BackupPlan backupPlan;

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
    public BackupPlan getBackupPlan() {
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
    public void setBackupPlan(BackupPlan backupPlan) {
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
    public GetBackupPlanFromJSONResult withBackupPlan(BackupPlan backupPlan) {
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
        if (getBackupPlan() != null)
            sb.append("BackupPlan: " + getBackupPlan());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupPlan() == null) ? 0 : getBackupPlan().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackupPlanFromJSONResult == false)
            return false;
        GetBackupPlanFromJSONResult other = (GetBackupPlanFromJSONResult) obj;

        if (other.getBackupPlan() == null ^ this.getBackupPlan() == null)
            return false;
        if (other.getBackupPlan() != null
                && other.getBackupPlan().equals(this.getBackupPlan()) == false)
            return false;
        return true;
    }
}
