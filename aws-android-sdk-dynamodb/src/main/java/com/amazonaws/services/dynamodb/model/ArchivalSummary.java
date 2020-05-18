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

package com.amazonaws.services.dynamodb.model;

import java.io.Serializable;

/**
 * <p>
 * Contains details of a table archival operation.
 * </p>
 */
public class ArchivalSummary implements Serializable {
    /**
     * <p>
     * The date and time when table archival was initiated by DynamoDB, in UNIX
     * epoch time format.
     * </p>
     */
    private java.util.Date archivalDateTime;

    /**
     * <p>
     * The reason DynamoDB archived the table. Currently, the only possible
     * value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived
     * due to the table's AWS KMS key being inaccessible for more than seven
     * days. An On-Demand backup was created at the archival time.
     * </p>
     * </li>
     * </ul>
     */
    private String archivalReason;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the backup the table was archived to,
     * when applicable in the archival reason. If you wish to restore this
     * backup to the same table name, you will need to delete the original
     * table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     */
    private String archivalBackupArn;

    /**
     * <p>
     * The date and time when table archival was initiated by DynamoDB, in UNIX
     * epoch time format.
     * </p>
     *
     * @return <p>
     *         The date and time when table archival was initiated by DynamoDB,
     *         in UNIX epoch time format.
     *         </p>
     */
    public java.util.Date getArchivalDateTime() {
        return archivalDateTime;
    }

    /**
     * <p>
     * The date and time when table archival was initiated by DynamoDB, in UNIX
     * epoch time format.
     * </p>
     *
     * @param archivalDateTime <p>
     *            The date and time when table archival was initiated by
     *            DynamoDB, in UNIX epoch time format.
     *            </p>
     */
    public void setArchivalDateTime(java.util.Date archivalDateTime) {
        this.archivalDateTime = archivalDateTime;
    }

    /**
     * <p>
     * The date and time when table archival was initiated by DynamoDB, in UNIX
     * epoch time format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param archivalDateTime <p>
     *            The date and time when table archival was initiated by
     *            DynamoDB, in UNIX epoch time format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchivalSummary withArchivalDateTime(java.util.Date archivalDateTime) {
        this.archivalDateTime = archivalDateTime;
        return this;
    }

    /**
     * <p>
     * The reason DynamoDB archived the table. Currently, the only possible
     * value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived
     * due to the table's AWS KMS key being inaccessible for more than seven
     * days. An On-Demand backup was created at the archival time.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The reason DynamoDB archived the table. Currently, the only
     *         possible value is:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was
     *         archived due to the table's AWS KMS key being inaccessible for
     *         more than seven days. An On-Demand backup was created at the
     *         archival time.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getArchivalReason() {
        return archivalReason;
    }

    /**
     * <p>
     * The reason DynamoDB archived the table. Currently, the only possible
     * value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived
     * due to the table's AWS KMS key being inaccessible for more than seven
     * days. An On-Demand backup was created at the archival time.
     * </p>
     * </li>
     * </ul>
     *
     * @param archivalReason <p>
     *            The reason DynamoDB archived the table. Currently, the only
     *            possible value is:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table
     *            was archived due to the table's AWS KMS key being inaccessible
     *            for more than seven days. An On-Demand backup was created at
     *            the archival time.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setArchivalReason(String archivalReason) {
        this.archivalReason = archivalReason;
    }

    /**
     * <p>
     * The reason DynamoDB archived the table. Currently, the only possible
     * value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived
     * due to the table's AWS KMS key being inaccessible for more than seven
     * days. An On-Demand backup was created at the archival time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param archivalReason <p>
     *            The reason DynamoDB archived the table. Currently, the only
     *            possible value is:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table
     *            was archived due to the table's AWS KMS key being inaccessible
     *            for more than seven days. An On-Demand backup was created at
     *            the archival time.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchivalSummary withArchivalReason(String archivalReason) {
        this.archivalReason = archivalReason;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the backup the table was archived to,
     * when applicable in the archival reason. If you wish to restore this
     * backup to the same table name, you will need to delete the original
     * table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the backup the table was
     *         archived to, when applicable in the archival reason. If you wish
     *         to restore this backup to the same table name, you will need to
     *         delete the original table.
     *         </p>
     */
    public String getArchivalBackupArn() {
        return archivalBackupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the backup the table was archived to,
     * when applicable in the archival reason. If you wish to restore this
     * backup to the same table name, you will need to delete the original
     * table.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param archivalBackupArn <p>
     *            The Amazon Resource Name (ARN) of the backup the table was
     *            archived to, when applicable in the archival reason. If you
     *            wish to restore this backup to the same table name, you will
     *            need to delete the original table.
     *            </p>
     */
    public void setArchivalBackupArn(String archivalBackupArn) {
        this.archivalBackupArn = archivalBackupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the backup the table was archived to,
     * when applicable in the archival reason. If you wish to restore this
     * backup to the same table name, you will need to delete the original
     * table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param archivalBackupArn <p>
     *            The Amazon Resource Name (ARN) of the backup the table was
     *            archived to, when applicable in the archival reason. If you
     *            wish to restore this backup to the same table name, you will
     *            need to delete the original table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ArchivalSummary withArchivalBackupArn(String archivalBackupArn) {
        this.archivalBackupArn = archivalBackupArn;
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
        if (getArchivalDateTime() != null)
            sb.append("ArchivalDateTime: " + getArchivalDateTime() + ",");
        if (getArchivalReason() != null)
            sb.append("ArchivalReason: " + getArchivalReason() + ",");
        if (getArchivalBackupArn() != null)
            sb.append("ArchivalBackupArn: " + getArchivalBackupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getArchivalDateTime() == null) ? 0 : getArchivalDateTime().hashCode());
        hashCode = prime * hashCode
                + ((getArchivalReason() == null) ? 0 : getArchivalReason().hashCode());
        hashCode = prime * hashCode
                + ((getArchivalBackupArn() == null) ? 0 : getArchivalBackupArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchivalSummary == false)
            return false;
        ArchivalSummary other = (ArchivalSummary) obj;

        if (other.getArchivalDateTime() == null ^ this.getArchivalDateTime() == null)
            return false;
        if (other.getArchivalDateTime() != null
                && other.getArchivalDateTime().equals(this.getArchivalDateTime()) == false)
            return false;
        if (other.getArchivalReason() == null ^ this.getArchivalReason() == null)
            return false;
        if (other.getArchivalReason() != null
                && other.getArchivalReason().equals(this.getArchivalReason()) == false)
            return false;
        if (other.getArchivalBackupArn() == null ^ this.getArchivalBackupArn() == null)
            return false;
        if (other.getArchivalBackupArn() != null
                && other.getArchivalBackupArn().equals(this.getArchivalBackupArn()) == false)
            return false;
        return true;
    }
}
