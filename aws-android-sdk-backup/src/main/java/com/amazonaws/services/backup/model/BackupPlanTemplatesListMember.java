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

/**
 * <p>
 * An object specifying metadata associated with a backup plan template.
 * </p>
 */
public class BackupPlanTemplatesListMember implements Serializable {
    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     */
    private String backupPlanTemplateId;

    /**
     * <p>
     * The optional display name of a backup plan template.
     * </p>
     */
    private String backupPlanTemplateName;

    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     *
     * @return <p>
     *         Uniquely identifies a stored backup plan template.
     *         </p>
     */
    public String getBackupPlanTemplateId() {
        return backupPlanTemplateId;
    }

    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     *
     * @param backupPlanTemplateId <p>
     *            Uniquely identifies a stored backup plan template.
     *            </p>
     */
    public void setBackupPlanTemplateId(String backupPlanTemplateId) {
        this.backupPlanTemplateId = backupPlanTemplateId;
    }

    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanTemplateId <p>
     *            Uniquely identifies a stored backup plan template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupPlanTemplatesListMember withBackupPlanTemplateId(String backupPlanTemplateId) {
        this.backupPlanTemplateId = backupPlanTemplateId;
        return this;
    }

    /**
     * <p>
     * The optional display name of a backup plan template.
     * </p>
     *
     * @return <p>
     *         The optional display name of a backup plan template.
     *         </p>
     */
    public String getBackupPlanTemplateName() {
        return backupPlanTemplateName;
    }

    /**
     * <p>
     * The optional display name of a backup plan template.
     * </p>
     *
     * @param backupPlanTemplateName <p>
     *            The optional display name of a backup plan template.
     *            </p>
     */
    public void setBackupPlanTemplateName(String backupPlanTemplateName) {
        this.backupPlanTemplateName = backupPlanTemplateName;
    }

    /**
     * <p>
     * The optional display name of a backup plan template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanTemplateName <p>
     *            The optional display name of a backup plan template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupPlanTemplatesListMember withBackupPlanTemplateName(String backupPlanTemplateName) {
        this.backupPlanTemplateName = backupPlanTemplateName;
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
        if (getBackupPlanTemplateId() != null)
            sb.append("BackupPlanTemplateId: " + getBackupPlanTemplateId() + ",");
        if (getBackupPlanTemplateName() != null)
            sb.append("BackupPlanTemplateName: " + getBackupPlanTemplateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupPlanTemplateId() == null) ? 0 : getBackupPlanTemplateId().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupPlanTemplateName() == null) ? 0 : getBackupPlanTemplateName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupPlanTemplatesListMember == false)
            return false;
        BackupPlanTemplatesListMember other = (BackupPlanTemplatesListMember) obj;

        if (other.getBackupPlanTemplateId() == null ^ this.getBackupPlanTemplateId() == null)
            return false;
        if (other.getBackupPlanTemplateId() != null
                && other.getBackupPlanTemplateId().equals(this.getBackupPlanTemplateId()) == false)
            return false;
        if (other.getBackupPlanTemplateName() == null ^ this.getBackupPlanTemplateName() == null)
            return false;
        if (other.getBackupPlanTemplateName() != null
                && other.getBackupPlanTemplateName().equals(this.getBackupPlanTemplateName()) == false)
            return false;
        return true;
    }
}
