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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new table from an existing backup. Any number of users can execute
 * up to 4 concurrent restores (any type of restore) in a given account.
 * </p>
 * <p>
 * You can call <code>RestoreTableFromBackup</code> at a maximum rate of 10
 * times per second.
 * </p>
 * <p>
 * You must manually set up the following on the restored table:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Auto scaling policies
 * </p>
 * </li>
 * <li>
 * <p>
 * IAM policies
 * </p>
 * </li>
 * <li>
 * <p>
 * Cloudwatch metrics and alarms
 * </p>
 * </li>
 * <li>
 * <p>
 * Tags
 * </p>
 * </li>
 * <li>
 * <p>
 * Stream settings
 * </p>
 * </li>
 * <li>
 * <p>
 * Time to Live (TTL) settings
 * </p>
 * </li>
 * </ul>
 */
public class RestoreTableFromBackupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String targetTableName;

    /**
     * <p>
     * The ARN associated with the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     */
    private String backupArn;

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the new table to which the backup must be restored.
     *         </p>
     */
    public String getTargetTableName() {
        return targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param targetTableName <p>
     *            The name of the new table to which the backup must be
     *            restored.
     *            </p>
     */
    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which the backup must be restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param targetTableName <p>
     *            The name of the new table to which the backup must be
     *            restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromBackupRequest withTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }

    /**
     * <p>
     * The ARN associated with the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @return <p>
     *         The ARN associated with the backup.
     *         </p>
     */
    public String getBackupArn() {
        return backupArn;
    }

    /**
     * <p>
     * The ARN associated with the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param backupArn <p>
     *            The ARN associated with the backup.
     *            </p>
     */
    public void setBackupArn(String backupArn) {
        this.backupArn = backupArn;
    }

    /**
     * <p>
     * The ARN associated with the backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param backupArn <p>
     *            The ARN associated with the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableFromBackupRequest withBackupArn(String backupArn) {
        this.backupArn = backupArn;
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
        if (getTargetTableName() != null)
            sb.append("TargetTableName: " + getTargetTableName() + ",");
        if (getBackupArn() != null)
            sb.append("BackupArn: " + getBackupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetTableName() == null) ? 0 : getTargetTableName().hashCode());
        hashCode = prime * hashCode + ((getBackupArn() == null) ? 0 : getBackupArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableFromBackupRequest == false)
            return false;
        RestoreTableFromBackupRequest other = (RestoreTableFromBackupRequest) obj;

        if (other.getTargetTableName() == null ^ this.getTargetTableName() == null)
            return false;
        if (other.getTargetTableName() != null
                && other.getTargetTableName().equals(this.getTargetTableName()) == false)
            return false;
        if (other.getBackupArn() == null ^ this.getBackupArn() == null)
            return false;
        if (other.getBackupArn() != null
                && other.getBackupArn().equals(this.getBackupArn()) == false)
            return false;
        return true;
    }
}
