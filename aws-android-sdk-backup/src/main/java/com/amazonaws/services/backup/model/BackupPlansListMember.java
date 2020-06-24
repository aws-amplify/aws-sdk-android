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
 * Contains metadata about a backup plan.
 * </p>
 */
public class BackupPlansListMember implements Serializable {
    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     * .
     * </p>
     */
    private String backupPlanArn;

    /**
     * <p>
     * Uniquely identifies a backup plan.
     * </p>
     */
    private String backupPlanId;

    /**
     * <p>
     * The date and time a resource backup plan is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date and time a backup plan is deleted, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>DeletionDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date deletionDate;

    /**
     * <p>
     * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at
     * most 1,024 bytes long. Version IDs cannot be edited.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The display name of a saved backup plan.
     * </p>
     */
    private String backupPlanName;

    /**
     * <p>
     * A unique string that identifies the request and allows failed requests to
     * be retried without the risk of executing the operation twice.
     * </p>
     */
    private String creatorRequestId;

    /**
     * <p>
     * The last time a job to back up resources was executed with this rule. A
     * date and time, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastExecutionDate;

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     * .
     * </p>
     *
     * @return <p>
     *         An Amazon Resource Name (ARN) that uniquely identifies a backup
     *         plan; for example,
     *         <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     *         .
     *         </p>
     */
    public String getBackupPlanArn() {
        return backupPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     * .
     * </p>
     *
     * @param backupPlanArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            backup plan; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     *            .
     *            </p>
     */
    public void setBackupPlanArn(String backupPlanArn) {
        this.backupPlanArn = backupPlanArn;
    }

    /**
     * <p>
     * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for
     * example,
     * <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanArn <p>
     *            An Amazon Resource Name (ARN) that uniquely identifies a
     *            backup plan; for example,
     *            <code>arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50</code>
     *            .
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupPlansListMember withBackupPlanArn(String backupPlanArn) {
        this.backupPlanArn = backupPlanArn;
        return this;
    }

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
    public BackupPlansListMember withBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }

    /**
     * <p>
     * The date and time a resource backup plan is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time a resource backup plan is created, in Unix
     *         format and Coordinated Universal Time (UTC). The value of
     *         <code>CreationDate</code> is accurate to milliseconds. For
     *         example, the value 1516925490.087 represents Friday, January 26,
     *         2018 12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time a resource backup plan is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time a resource backup plan is created, in Unix
     *            format and Coordinated Universal Time (UTC). The value of
     *            <code>CreationDate</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time a resource backup plan is created, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>CreationDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time a resource backup plan is created, in Unix
     *            format and Coordinated Universal Time (UTC). The value of
     *            <code>CreationDate</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupPlansListMember withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date and time a backup plan is deleted, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>DeletionDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The date and time a backup plan is deleted, in Unix format and
     *         Coordinated Universal Time (UTC). The value of
     *         <code>DeletionDate</code> is accurate to milliseconds. For
     *         example, the value 1516925490.087 represents Friday, January 26,
     *         2018 12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getDeletionDate() {
        return deletionDate;
    }

    /**
     * <p>
     * The date and time a backup plan is deleted, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>DeletionDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     *
     * @param deletionDate <p>
     *            The date and time a backup plan is deleted, in Unix format and
     *            Coordinated Universal Time (UTC). The value of
     *            <code>DeletionDate</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>
     * The date and time a backup plan is deleted, in Unix format and
     * Coordinated Universal Time (UTC). The value of <code>DeletionDate</code>
     * is accurate to milliseconds. For example, the value 1516925490.087
     * represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deletionDate <p>
     *            The date and time a backup plan is deleted, in Unix format and
     *            Coordinated Universal Time (UTC). The value of
     *            <code>DeletionDate</code> is accurate to milliseconds. For
     *            example, the value 1516925490.087 represents Friday, January
     *            26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupPlansListMember withDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
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
    public BackupPlansListMember withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>
     * The display name of a saved backup plan.
     * </p>
     *
     * @return <p>
     *         The display name of a saved backup plan.
     *         </p>
     */
    public String getBackupPlanName() {
        return backupPlanName;
    }

    /**
     * <p>
     * The display name of a saved backup plan.
     * </p>
     *
     * @param backupPlanName <p>
     *            The display name of a saved backup plan.
     *            </p>
     */
    public void setBackupPlanName(String backupPlanName) {
        this.backupPlanName = backupPlanName;
    }

    /**
     * <p>
     * The display name of a saved backup plan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupPlanName <p>
     *            The display name of a saved backup plan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupPlansListMember withBackupPlanName(String backupPlanName) {
        this.backupPlanName = backupPlanName;
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
    public BackupPlansListMember withCreatorRequestId(String creatorRequestId) {
        this.creatorRequestId = creatorRequestId;
        return this;
    }

    /**
     * <p>
     * The last time a job to back up resources was executed with this rule. A
     * date and time, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     *
     * @return <p>
     *         The last time a job to back up resources was executed with this
     *         rule. A date and time, in Unix format and Coordinated Universal
     *         Time (UTC). The value of <code>LastExecutionDate</code> is
     *         accurate to milliseconds. For example, the value 1516925490.087
     *         represents Friday, January 26, 2018 12:11:30.087 AM.
     *         </p>
     */
    public java.util.Date getLastExecutionDate() {
        return lastExecutionDate;
    }

    /**
     * <p>
     * The last time a job to back up resources was executed with this rule. A
     * date and time, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     *
     * @param lastExecutionDate <p>
     *            The last time a job to back up resources was executed with
     *            this rule. A date and time, in Unix format and Coordinated
     *            Universal Time (UTC). The value of
     *            <code>LastExecutionDate</code> is accurate to milliseconds.
     *            For example, the value 1516925490.087 represents Friday,
     *            January 26, 2018 12:11:30.087 AM.
     *            </p>
     */
    public void setLastExecutionDate(java.util.Date lastExecutionDate) {
        this.lastExecutionDate = lastExecutionDate;
    }

    /**
     * <p>
     * The last time a job to back up resources was executed with this rule. A
     * date and time, in Unix format and Coordinated Universal Time (UTC). The
     * value of <code>LastExecutionDate</code> is accurate to milliseconds. For
     * example, the value 1516925490.087 represents Friday, January 26, 2018
     * 12:11:30.087 AM.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastExecutionDate <p>
     *            The last time a job to back up resources was executed with
     *            this rule. A date and time, in Unix format and Coordinated
     *            Universal Time (UTC). The value of
     *            <code>LastExecutionDate</code> is accurate to milliseconds.
     *            For example, the value 1516925490.087 represents Friday,
     *            January 26, 2018 12:11:30.087 AM.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupPlansListMember withLastExecutionDate(java.util.Date lastExecutionDate) {
        this.lastExecutionDate = lastExecutionDate;
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
        if (getBackupPlanArn() != null)
            sb.append("BackupPlanArn: " + getBackupPlanArn() + ",");
        if (getBackupPlanId() != null)
            sb.append("BackupPlanId: " + getBackupPlanId() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDeletionDate() != null)
            sb.append("DeletionDate: " + getDeletionDate() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getBackupPlanName() != null)
            sb.append("BackupPlanName: " + getBackupPlanName() + ",");
        if (getCreatorRequestId() != null)
            sb.append("CreatorRequestId: " + getCreatorRequestId() + ",");
        if (getLastExecutionDate() != null)
            sb.append("LastExecutionDate: " + getLastExecutionDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackupPlanArn() == null) ? 0 : getBackupPlanArn().hashCode());
        hashCode = prime * hashCode
                + ((getBackupPlanId() == null) ? 0 : getBackupPlanId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionDate() == null) ? 0 : getDeletionDate().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getBackupPlanName() == null) ? 0 : getBackupPlanName().hashCode());
        hashCode = prime * hashCode
                + ((getCreatorRequestId() == null) ? 0 : getCreatorRequestId().hashCode());
        hashCode = prime * hashCode
                + ((getLastExecutionDate() == null) ? 0 : getLastExecutionDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupPlansListMember == false)
            return false;
        BackupPlansListMember other = (BackupPlansListMember) obj;

        if (other.getBackupPlanArn() == null ^ this.getBackupPlanArn() == null)
            return false;
        if (other.getBackupPlanArn() != null
                && other.getBackupPlanArn().equals(this.getBackupPlanArn()) == false)
            return false;
        if (other.getBackupPlanId() == null ^ this.getBackupPlanId() == null)
            return false;
        if (other.getBackupPlanId() != null
                && other.getBackupPlanId().equals(this.getBackupPlanId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDeletionDate() == null ^ this.getDeletionDate() == null)
            return false;
        if (other.getDeletionDate() != null
                && other.getDeletionDate().equals(this.getDeletionDate()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getBackupPlanName() == null ^ this.getBackupPlanName() == null)
            return false;
        if (other.getBackupPlanName() != null
                && other.getBackupPlanName().equals(this.getBackupPlanName()) == false)
            return false;
        if (other.getCreatorRequestId() == null ^ this.getCreatorRequestId() == null)
            return false;
        if (other.getCreatorRequestId() != null
                && other.getCreatorRequestId().equals(this.getCreatorRequestId()) == false)
            return false;
        if (other.getLastExecutionDate() == null ^ this.getLastExecutionDate() == null)
            return false;
        if (other.getLastExecutionDate() != null
                && other.getLastExecutionDate().equals(this.getLastExecutionDate()) == false)
            return false;
        return true;
    }
}
