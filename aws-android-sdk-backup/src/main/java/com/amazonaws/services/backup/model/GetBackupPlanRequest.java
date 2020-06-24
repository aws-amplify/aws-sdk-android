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
 * Returns the body of a backup plan in JSON format, in addition to plan
 * metadata.
 * </p>
 */
public class GetBackupPlanRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     */
    private String backupPlanId;

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at
     * most 1,024 bytes long. Version IDs cannot be edited.
     * </p>
     */
    private String versionId;

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
    public GetBackupPlanRequest withBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at
     * most 1,024 bytes long. Version IDs cannot be edited.
     * </p>
     *
     * @return <p>
     *         Unique, randomly generated, Unicode, UTF-8 encoded strings that
     *         are at most 1,024 bytes long. Version IDs cannot be edited.
     *         </p>
     */
    public String getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at
     * most 1,024 bytes long. Version IDs cannot be edited.
     * </p>
     *
     * @param versionId <p>
     *            Unique, randomly generated, Unicode, UTF-8 encoded strings
     *            that are at most 1,024 bytes long. Version IDs cannot be
     *            edited.
     *            </p>
     */
    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at
     * most 1,024 bytes long. Version IDs cannot be edited.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            Unique, randomly generated, Unicode, UTF-8 encoded strings
     *            that are at most 1,024 bytes long. Version IDs cannot be
     *            edited.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBackupPlanRequest withVersionId(String versionId) {
        this.versionId = versionId;
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
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackupPlanRequest == false)
            return false;
        GetBackupPlanRequest other = (GetBackupPlanRequest) obj;

        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null
                && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }
}
