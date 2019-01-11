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
 * Contains the details of the backup created for the table.
 * </p>
 */
public class BackupDetails implements Serializable {
    /**
     * <p>
     * ARN associated with the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     */
    private String backupArn;

    /**
     * <p>
     * Name of the requested backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String backupName;

    /**
     * <p>
     * Size of the backup in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long backupSizeBytes;

    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETED, AVAILABLE
     */
    private String backupStatus;

    /**
     * <p>
     * BackupType:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - On-demand backup created by you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM
     */
    private String backupType;

    /**
     * <p>
     * Time at which the backup was created. This is the request time of the
     * backup.
     * </p>
     */
    private java.util.Date backupCreationDateTime;

    /**
     * <p>
     * Time at which the automatic on-demand backup created by DynamoDB will
     * expire. This <code>SYSTEM</code> on-demand backup expires automatically
     * 35 days after its creation.
     * </p>
     */
    private java.util.Date backupExpiryDateTime;

    /**
     * <p>
     * ARN associated with the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @return <p>
     *         ARN associated with the backup.
     *         </p>
     */
    public String getBackupArn() {
        return backupArn;
    }

    /**
     * <p>
     * ARN associated with the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param backupArn <p>
     *            ARN associated with the backup.
     *            </p>
     */
    public void setBackupArn(String backupArn) {
        this.backupArn = backupArn;
    }

    /**
     * <p>
     * ARN associated with the backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param backupArn <p>
     *            ARN associated with the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupDetails withBackupArn(String backupArn) {
        this.backupArn = backupArn;
        return this;
    }

    /**
     * <p>
     * Name of the requested backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         Name of the requested backup.
     *         </p>
     */
    public String getBackupName() {
        return backupName;
    }

    /**
     * <p>
     * Name of the requested backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param backupName <p>
     *            Name of the requested backup.
     *            </p>
     */
    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    /**
     * <p>
     * Name of the requested backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param backupName <p>
     *            Name of the requested backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupDetails withBackupName(String backupName) {
        this.backupName = backupName;
        return this;
    }

    /**
     * <p>
     * Size of the backup in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         Size of the backup in bytes.
     *         </p>
     */
    public Long getBackupSizeBytes() {
        return backupSizeBytes;
    }

    /**
     * <p>
     * Size of the backup in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param backupSizeBytes <p>
     *            Size of the backup in bytes.
     *            </p>
     */
    public void setBackupSizeBytes(Long backupSizeBytes) {
        this.backupSizeBytes = backupSizeBytes;
    }

    /**
     * <p>
     * Size of the backup in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param backupSizeBytes <p>
     *            Size of the backup in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupDetails withBackupSizeBytes(Long backupSizeBytes) {
        this.backupSizeBytes = backupSizeBytes;
        return this;
    }

    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETED, AVAILABLE
     *
     * @return <p>
     *         Backup can be in one of the following states: CREATING, ACTIVE,
     *         DELETED.
     *         </p>
     * @see BackupStatus
     */
    public String getBackupStatus() {
        return backupStatus;
    }

    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETED, AVAILABLE
     *
     * @param backupStatus <p>
     *            Backup can be in one of the following states: CREATING,
     *            ACTIVE, DELETED.
     *            </p>
     * @see BackupStatus
     */
    public void setBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
    }

    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETED, AVAILABLE
     *
     * @param backupStatus <p>
     *            Backup can be in one of the following states: CREATING,
     *            ACTIVE, DELETED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupStatus
     */
    public BackupDetails withBackupStatus(String backupStatus) {
        this.backupStatus = backupStatus;
        return this;
    }

    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETED, AVAILABLE
     *
     * @param backupStatus <p>
     *            Backup can be in one of the following states: CREATING,
     *            ACTIVE, DELETED.
     *            </p>
     * @see BackupStatus
     */
    public void setBackupStatus(BackupStatus backupStatus) {
        this.backupStatus = backupStatus.toString();
    }

    /**
     * <p>
     * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATING, DELETED, AVAILABLE
     *
     * @param backupStatus <p>
     *            Backup can be in one of the following states: CREATING,
     *            ACTIVE, DELETED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupStatus
     */
    public BackupDetails withBackupStatus(BackupStatus backupStatus) {
        this.backupStatus = backupStatus.toString();
        return this;
    }

    /**
     * <p>
     * BackupType:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - On-demand backup created by you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM
     *
     * @return <p>
     *         BackupType:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>USER</code> - On-demand backup created by you.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SYSTEM</code> - On-demand backup automatically created by
     *         DynamoDB.
     *         </p>
     *         </li>
     *         </ul>
     * @see BackupType
     */
    public String getBackupType() {
        return backupType;
    }

    /**
     * <p>
     * BackupType:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - On-demand backup created by you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM
     *
     * @param backupType <p>
     *            BackupType:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>USER</code> - On-demand backup created by you.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SYSTEM</code> - On-demand backup automatically created
     *            by DynamoDB.
     *            </p>
     *            </li>
     *            </ul>
     * @see BackupType
     */
    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    /**
     * <p>
     * BackupType:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - On-demand backup created by you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM
     *
     * @param backupType <p>
     *            BackupType:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>USER</code> - On-demand backup created by you.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SYSTEM</code> - On-demand backup automatically created
     *            by DynamoDB.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupType
     */
    public BackupDetails withBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * <p>
     * BackupType:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - On-demand backup created by you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM
     *
     * @param backupType <p>
     *            BackupType:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>USER</code> - On-demand backup created by you.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SYSTEM</code> - On-demand backup automatically created
     *            by DynamoDB.
     *            </p>
     *            </li>
     *            </ul>
     * @see BackupType
     */
    public void setBackupType(BackupType backupType) {
        this.backupType = backupType.toString();
    }

    /**
     * <p>
     * BackupType:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>USER</code> - On-demand backup created by you.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM
     *
     * @param backupType <p>
     *            BackupType:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>USER</code> - On-demand backup created by you.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SYSTEM</code> - On-demand backup automatically created
     *            by DynamoDB.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupType
     */
    public BackupDetails withBackupType(BackupType backupType) {
        this.backupType = backupType.toString();
        return this;
    }

    /**
     * <p>
     * Time at which the backup was created. This is the request time of the
     * backup.
     * </p>
     *
     * @return <p>
     *         Time at which the backup was created. This is the request time of
     *         the backup.
     *         </p>
     */
    public java.util.Date getBackupCreationDateTime() {
        return backupCreationDateTime;
    }

    /**
     * <p>
     * Time at which the backup was created. This is the request time of the
     * backup.
     * </p>
     *
     * @param backupCreationDateTime <p>
     *            Time at which the backup was created. This is the request time
     *            of the backup.
     *            </p>
     */
    public void setBackupCreationDateTime(java.util.Date backupCreationDateTime) {
        this.backupCreationDateTime = backupCreationDateTime;
    }

    /**
     * <p>
     * Time at which the backup was created. This is the request time of the
     * backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupCreationDateTime <p>
     *            Time at which the backup was created. This is the request time
     *            of the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupDetails withBackupCreationDateTime(java.util.Date backupCreationDateTime) {
        this.backupCreationDateTime = backupCreationDateTime;
        return this;
    }

    /**
     * <p>
     * Time at which the automatic on-demand backup created by DynamoDB will
     * expire. This <code>SYSTEM</code> on-demand backup expires automatically
     * 35 days after its creation.
     * </p>
     *
     * @return <p>
     *         Time at which the automatic on-demand backup created by DynamoDB
     *         will expire. This <code>SYSTEM</code> on-demand backup expires
     *         automatically 35 days after its creation.
     *         </p>
     */
    public java.util.Date getBackupExpiryDateTime() {
        return backupExpiryDateTime;
    }

    /**
     * <p>
     * Time at which the automatic on-demand backup created by DynamoDB will
     * expire. This <code>SYSTEM</code> on-demand backup expires automatically
     * 35 days after its creation.
     * </p>
     *
     * @param backupExpiryDateTime <p>
     *            Time at which the automatic on-demand backup created by
     *            DynamoDB will expire. This <code>SYSTEM</code> on-demand
     *            backup expires automatically 35 days after its creation.
     *            </p>
     */
    public void setBackupExpiryDateTime(java.util.Date backupExpiryDateTime) {
        this.backupExpiryDateTime = backupExpiryDateTime;
    }

    /**
     * <p>
     * Time at which the automatic on-demand backup created by DynamoDB will
     * expire. This <code>SYSTEM</code> on-demand backup expires automatically
     * 35 days after its creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupExpiryDateTime <p>
     *            Time at which the automatic on-demand backup created by
     *            DynamoDB will expire. This <code>SYSTEM</code> on-demand
     *            backup expires automatically 35 days after its creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BackupDetails withBackupExpiryDateTime(java.util.Date backupExpiryDateTime) {
        this.backupExpiryDateTime = backupExpiryDateTime;
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
        if (getBackupArn() != null)
            sb.append("BackupArn: " + getBackupArn() + ",");
        if (getBackupName() != null)
            sb.append("BackupName: " + getBackupName() + ",");
        if (getBackupSizeBytes() != null)
            sb.append("BackupSizeBytes: " + getBackupSizeBytes() + ",");
        if (getBackupStatus() != null)
            sb.append("BackupStatus: " + getBackupStatus() + ",");
        if (getBackupType() != null)
            sb.append("BackupType: " + getBackupType() + ",");
        if (getBackupCreationDateTime() != null)
            sb.append("BackupCreationDateTime: " + getBackupCreationDateTime() + ",");
        if (getBackupExpiryDateTime() != null)
            sb.append("BackupExpiryDateTime: " + getBackupExpiryDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBackupArn() == null) ? 0 : getBackupArn().hashCode());
        hashCode = prime * hashCode + ((getBackupName() == null) ? 0 : getBackupName().hashCode());
        hashCode = prime * hashCode
                + ((getBackupSizeBytes() == null) ? 0 : getBackupSizeBytes().hashCode());
        hashCode = prime * hashCode
                + ((getBackupStatus() == null) ? 0 : getBackupStatus().hashCode());
        hashCode = prime * hashCode + ((getBackupType() == null) ? 0 : getBackupType().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupCreationDateTime() == null) ? 0 : getBackupCreationDateTime()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getBackupExpiryDateTime() == null) ? 0 : getBackupExpiryDateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BackupDetails == false)
            return false;
        BackupDetails other = (BackupDetails) obj;

        if (other.getBackupArn() == null ^ this.getBackupArn() == null)
            return false;
        if (other.getBackupArn() != null
                && other.getBackupArn().equals(this.getBackupArn()) == false)
            return false;
        if (other.getBackupName() == null ^ this.getBackupName() == null)
            return false;
        if (other.getBackupName() != null
                && other.getBackupName().equals(this.getBackupName()) == false)
            return false;
        if (other.getBackupSizeBytes() == null ^ this.getBackupSizeBytes() == null)
            return false;
        if (other.getBackupSizeBytes() != null
                && other.getBackupSizeBytes().equals(this.getBackupSizeBytes()) == false)
            return false;
        if (other.getBackupStatus() == null ^ this.getBackupStatus() == null)
            return false;
        if (other.getBackupStatus() != null
                && other.getBackupStatus().equals(this.getBackupStatus()) == false)
            return false;
        if (other.getBackupType() == null ^ this.getBackupType() == null)
            return false;
        if (other.getBackupType() != null
                && other.getBackupType().equals(this.getBackupType()) == false)
            return false;
        if (other.getBackupCreationDateTime() == null ^ this.getBackupCreationDateTime() == null)
            return false;
        if (other.getBackupCreationDateTime() != null
                && other.getBackupCreationDateTime().equals(this.getBackupCreationDateTime()) == false)
            return false;
        if (other.getBackupExpiryDateTime() == null ^ this.getBackupExpiryDateTime() == null)
            return false;
        if (other.getBackupExpiryDateTime() != null
                && other.getBackupExpiryDateTime().equals(this.getBackupExpiryDateTime()) == false)
            return false;
        return true;
    }
}
