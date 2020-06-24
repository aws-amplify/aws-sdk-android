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
 * Returns the template specified by its <code>templateId</code> as a backup
 * plan.
 * </p>
 */
public class GetBackupPlanFromTemplateRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Uniquely identifies a stored backup plan template.
     * </p>
     */
    private String backupPlanTemplateId;

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
    public GetBackupPlanFromTemplateRequest withBackupPlanTemplateId(String backupPlanTemplateId) {
        this.backupPlanTemplateId = backupPlanTemplateId;
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
            sb.append("BackupPlanTemplateId: " + getBackupPlanTemplateId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupPlanTemplateId() == null) ? 0 : getBackupPlanTemplateId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackupPlanFromTemplateRequest == false)
            return false;
        GetBackupPlanFromTemplateRequest other = (GetBackupPlanFromTemplateRequest) obj;

        if (other.getBackupPlanTemplateId() == null ^ this.getBackupPlanTemplateId() == null)
            return false;
        if (other.getBackupPlanTemplateId() != null
                && other.getBackupPlanTemplateId().equals(this.getBackupPlanTemplateId()) == false)
            return false;
        return true;
    }
}
