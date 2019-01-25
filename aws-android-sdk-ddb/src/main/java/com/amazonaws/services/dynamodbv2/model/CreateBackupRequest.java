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
 * Creates a backup for an existing table.
 * </p>
 * <p>
 * Each time you create an On-Demand Backup, the entire table data is backed up.
 * There is no limit to the number of on-demand backups that can be taken.
 * </p>
 * <p>
 * When you create an On-Demand Backup, a time marker of the request is
 * cataloged, and the backup is created asynchronously, by applying all changes
 * until the time of the request to the last full table snapshot. Backup
 * requests are processed instantaneously and become available for restore
 * within minutes.
 * </p>
 * <p>
 * You can call <code>CreateBackup</code> at a maximum rate of 50 times per
 * second.
 * </p>
 * <p>
 * All backups in DynamoDB work without consuming any provisioned throughput on
 * the table.
 * </p>
 * <p>
 * If you submit a backup request on 2018-12-14 at 14:25:00, the backup is
 * guaranteed to contain all data committed to the table up to 14:24:00, and
 * data committed after 14:26:00 will not be. The backup may or may not contain
 * data modifications made between 14:24:00 and 14:26:00. On-Demand Backup does
 * not support causal consistency.
 * </p>
 * <p>
 * Along with data, the following are also included on the backups:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Global secondary indexes (GSIs)
 * </p>
 * </li>
 * <li>
 * <p>
 * Local secondary indexes (LSIs)
 * </p>
 * </li>
 * <li>
 * <p>
 * Streams
 * </p>
 * </li>
 * <li>
 * <p>
 * Provisioned read and write capacity
 * </p>
 * </li>
 * </ul>
 */
public class CreateBackupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * Specified name for the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String backupName;

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * Specified name for the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         Specified name for the backup.
     *         </p>
     */
    public String getBackupName() {
        return backupName;
    }

    /**
     * <p>
     * Specified name for the backup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param backupName <p>
     *            Specified name for the backup.
     *            </p>
     */
    public void setBackupName(String backupName) {
        this.backupName = backupName;
    }

    /**
     * <p>
     * Specified name for the backup.
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
     *            Specified name for the backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateBackupRequest withBackupName(String backupName) {
        this.backupName = backupName;
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
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getBackupName() != null)
            sb.append("BackupName: " + getBackupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getBackupName() == null) ? 0 : getBackupName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackupRequest == false)
            return false;
        CreateBackupRequest other = (CreateBackupRequest) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getBackupName() == null ^ this.getBackupName() == null)
            return false;
        if (other.getBackupName() != null
                && other.getBackupName().equals(this.getBackupName()) == false)
            return false;
        return true;
    }
}
