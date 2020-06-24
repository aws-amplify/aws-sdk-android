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

public class GetBackupPlanFromTemplateResult implements Serializable {
    /**
     * <p>
     * Returns the body of a backup plan based on the target template, including
     * the name, rules, and backup vault of the plan.
     * </p>
     */
    private BackupPlan backupPlanDocument;

    /**
     * <p>
     * Returns the body of a backup plan based on the target template, including
     * the name, rules, and backup vault of the plan.
     * </p>
     *
     * @return <p>
     *         Returns the body of a backup plan based on the target template,
     *         including the name, rules, and backup vault of the plan.
     *         </p>
     */
    public BackupPlan getBackupPlanDocument() {
        return backupPlanDocument;
    }

    /**
     * <p>
     * Returns the body of a backup plan based on the target template, including
     * the name, rules, and backup vault of the plan.
     * </p>
     *
     * @param backupPlanDocument <p>
     *            Returns the body of a backup plan based on the target
     *            template, including the name, rules, and backup vault of the
     *            plan.
     *            </p>
     */
    public void setBackupPlanDocument(BackupPlan backupPlanDocument) {
        this.backupPlanDocument = backupPlanDocument;
    }

    /**
     * <p>
     * Returns the body of a backup plan based on the target template, including
     * the name, rules, and backup vault of the plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanDocument <p>
     *            Returns the body of a backup plan based on the target
     *            template, including the name, rules, and backup vault of the
     *            plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBackupPlanFromTemplateResult withBackupPlanDocument(BackupPlan backupPlanDocument) {
        this.backupPlanDocument = backupPlanDocument;
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
        if (getBackupPlanDocument() != null)
            sb.append("BackupPlanDocument: " + getBackupPlanDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupPlanDocument() == null) ? 0 : getBackupPlanDocument().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackupPlanFromTemplateResult == false)
            return false;
        GetBackupPlanFromTemplateResult other = (GetBackupPlanFromTemplateResult) obj;

        if (other.getBackupPlanDocument() == null ^ this.getBackupPlanDocument() == null)
            return false;
        if (other.getBackupPlanDocument() != null
                && other.getBackupPlanDocument().equals(this.getBackupPlanDocument()) == false)
            return false;
        return true;
    }
}
