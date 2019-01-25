/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the description of the backup created for the table.
 * </p>
 */
public class BackupDescription implements Serializable {
    /**
     * <p>
     * Contains the details of the backup created for the table.
     * </p>
     */
    private BackupDetails backupDetails;

    /**
     * <p>
     * Contains the details of the table when the backup was created.
     * </p>
     */
    private SourceTableDetails sourceTableDetails;

    /**
     * <p>
     * Contains the details of the features enabled on the table when the backup
     * was created. For example, LSIs, GSIs, streams, TTL.
     * </p>
     */
    private SourceTableFeatureDetails sourceTableFeatureDetails;

    /**
     * <p>
     * Contains the details of the backup created for the table.
     * </p>
     *
     * @return <p>
     *         Contains the details of the backup created for the table.
     *         </p>
     */
    public BackupDetails getBackupDetails() {
        return backupDetails;
    }

    /**
     * <p>
     * Contains the details of the backup created for the table.
     * </p>
     *
     * @param backupDetails <p>
     *            Contains the details of the backup created for the table.
     *            </p>
     */
    public void setBackupDetails(BackupDetails backupDetails) {
        this.backupDetails = backupDetails;
    }

    /**
     * <p>
     * Contains the details of the backup created for the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupDetails <p>
     *            Contains the details of the backup created for the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupDescription withBackupDetails(BackupDetails backupDetails) {
        this.backupDetails = backupDetails;
        return this;
    }

    /**
     * <p>
     * Contains the details of the table when the backup was created.
     * </p>
     *
     * @return <p>
     *         Contains the details of the table when the backup was created.
     *         </p>
     */
    public SourceTableDetails getSourceTableDetails() {
        return sourceTableDetails;
    }

    /**
     * <p>
     * Contains the details of the table when the backup was created.
     * </p>
     *
     * @param sourceTableDetails <p>
     *            Contains the details of the table when the backup was created.
     *            </p>
     */
    public void setSourceTableDetails(SourceTableDetails sourceTableDetails) {
        this.sourceTableDetails = sourceTableDetails;
    }

    /**
     * <p>
     * Contains the details of the table when the backup was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceTableDetails <p>
     *            Contains the details of the table when the backup was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupDescription withSourceTableDetails(SourceTableDetails sourceTableDetails) {
        this.sourceTableDetails = sourceTableDetails;
        return this;
    }

    /**
     * <p>
     * Contains the details of the features enabled on the table when the backup
     * was created. For example, LSIs, GSIs, streams, TTL.
     * </p>
     *
     * @return <p>
     *         Contains the details of the features enabled on the table when
     *         the backup was created. For example, LSIs, GSIs, streams, TTL.
     *         </p>
     */
    public SourceTableFeatureDetails getSourceTableFeatureDetails() {
        return sourceTableFeatureDetails;
    }

    /**
     * <p>
     * Contains the details of the features enabled on the table when the backup
     * was created. For example, LSIs, GSIs, streams, TTL.
     * </p>
     *
     * @param sourceTableFeatureDetails <p>
     *            Contains the details of the features enabled on the table when
     *            the backup was created. For example, LSIs, GSIs, streams, TTL.
     *            </p>
     */
    public void setSourceTableFeatureDetails(SourceTableFeatureDetails sourceTableFeatureDetails) {
        this.sourceTableFeatureDetails = sourceTableFeatureDetails;
    }

    /**
     * <p>
     * Contains the details of the features enabled on the table when the backup
     * was created. For example, LSIs, GSIs, streams, TTL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceTableFeatureDetails <p>
     *            Contains the details of the features enabled on the table when
     *            the backup was created. For example, LSIs, GSIs, streams, TTL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupDescription withSourceTableFeatureDetails(
            SourceTableFeatureDetails sourceTableFeatureDetails) {
        this.sourceTableFeatureDetails = sourceTableFeatureDetails;
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
        if (getBackupDetails() != null)
            sb.append("BackupDetails: " + getBackupDetails() + ",");
        if (getSourceTableDetails() != null)
            sb.append("SourceTableDetails: " + getSourceTableDetails() + ",");
        if (getSourceTableFeatureDetails() != null)
            sb.append("SourceTableFeatureDetails: " + getSourceTableFeatureDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupDetails() == null) ? 0 : getBackupDetails().hashCode());
        hashCode = prime * hashCode
                + ((getSourceTableDetails() == null) ? 0 : getSourceTableDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceTableFeatureDetails() == null) ? 0 : getSourceTableFeatureDetails()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupDescription == false)
            return false;
        BackupDescription other = (BackupDescription) obj;

        if (other.getBackupDetails() == null ^ this.getBackupDetails() == null)
            return false;
        if (other.getBackupDetails() != null
                && other.getBackupDetails().equals(this.getBackupDetails()) == false)
            return false;
        if (other.getSourceTableDetails() == null ^ this.getSourceTableDetails() == null)
            return false;
        if (other.getSourceTableDetails() != null
                && other.getSourceTableDetails().equals(this.getSourceTableDetails()) == false)
            return false;
        if (other.getSourceTableFeatureDetails() == null
                ^ this.getSourceTableFeatureDetails() == null)
            return false;
        if (other.getSourceTableFeatureDetails() != null
                && other.getSourceTableFeatureDetails().equals(this.getSourceTableFeatureDetails()) == false)
            return false;
        return true;
    }
}
