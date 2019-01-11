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
 * List backups associated with an AWS account. To list backups for a given
 * table, specify <code>TableName</code>. <code>ListBackups</code> returns a
 * paginated list of results with at most 1MB worth of items in a page. You can
 * also specify a limit for the maximum number of entries to be returned in a
 * page.
 * </p>
 * <p>
 * In the request, start time is inclusive but end time is exclusive. Note that
 * these limits are for the time at which the original backup was requested.
 * </p>
 * <p>
 * You can call <code>ListBackups</code> a maximum of 5 times per second.
 * </p>
 */
public class ListBackupsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The backups from the table specified by <code>TableName</code> are
     * listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * Maximum number of backups to return at once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer limit;

    /**
     * <p>
     * Only backups created after this time are listed.
     * <code>TimeRangeLowerBound</code> is inclusive.
     * </p>
     */
    private java.util.Date timeRangeLowerBound;

    /**
     * <p>
     * Only backups created before this time are listed.
     * <code>TimeRangeUpperBound</code> is exclusive.
     * </p>
     */
    private java.util.Date timeRangeUpperBound;

    /**
     * <p>
     * <code>LastEvaluatedBackupArn</code> is the ARN of the backup last
     * evaluated when the current page of results was returned, inclusive of the
     * current page of results. This value may be specified as the
     * <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code>
     * operation in order to fetch the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     */
    private String exclusiveStartBackupArn;

    /**
     * <p>
     * The backups from the table specified by <code>BackupType</code> are
     * listed.
     * </p>
     * <p>
     * Where <code>BackupType</code> can be:
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
     * <li>
     * <p>
     * <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM, ALL
     */
    private String backupType;

    /**
     * <p>
     * The backups from the table specified by <code>TableName</code> are
     * listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The backups from the table specified by <code>TableName</code>
     *         are listed.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The backups from the table specified by <code>TableName</code> are
     * listed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The backups from the table specified by <code>TableName</code>
     *            are listed.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The backups from the table specified by <code>TableName</code> are
     * listed.
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
     *            The backups from the table specified by <code>TableName</code>
     *            are listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupsRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * Maximum number of backups to return at once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         Maximum number of backups to return at once.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * Maximum number of backups to return at once.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param limit <p>
     *            Maximum number of backups to return at once.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of backups to return at once.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param limit <p>
     *            Maximum number of backups to return at once.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * <p>
     * Only backups created after this time are listed.
     * <code>TimeRangeLowerBound</code> is inclusive.
     * </p>
     *
     * @return <p>
     *         Only backups created after this time are listed.
     *         <code>TimeRangeLowerBound</code> is inclusive.
     *         </p>
     */
    public java.util.Date getTimeRangeLowerBound() {
        return timeRangeLowerBound;
    }

    /**
     * <p>
     * Only backups created after this time are listed.
     * <code>TimeRangeLowerBound</code> is inclusive.
     * </p>
     *
     * @param timeRangeLowerBound <p>
     *            Only backups created after this time are listed.
     *            <code>TimeRangeLowerBound</code> is inclusive.
     *            </p>
     */
    public void setTimeRangeLowerBound(java.util.Date timeRangeLowerBound) {
        this.timeRangeLowerBound = timeRangeLowerBound;
    }

    /**
     * <p>
     * Only backups created after this time are listed.
     * <code>TimeRangeLowerBound</code> is inclusive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeRangeLowerBound <p>
     *            Only backups created after this time are listed.
     *            <code>TimeRangeLowerBound</code> is inclusive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupsRequest withTimeRangeLowerBound(java.util.Date timeRangeLowerBound) {
        this.timeRangeLowerBound = timeRangeLowerBound;
        return this;
    }

    /**
     * <p>
     * Only backups created before this time are listed.
     * <code>TimeRangeUpperBound</code> is exclusive.
     * </p>
     *
     * @return <p>
     *         Only backups created before this time are listed.
     *         <code>TimeRangeUpperBound</code> is exclusive.
     *         </p>
     */
    public java.util.Date getTimeRangeUpperBound() {
        return timeRangeUpperBound;
    }

    /**
     * <p>
     * Only backups created before this time are listed.
     * <code>TimeRangeUpperBound</code> is exclusive.
     * </p>
     *
     * @param timeRangeUpperBound <p>
     *            Only backups created before this time are listed.
     *            <code>TimeRangeUpperBound</code> is exclusive.
     *            </p>
     */
    public void setTimeRangeUpperBound(java.util.Date timeRangeUpperBound) {
        this.timeRangeUpperBound = timeRangeUpperBound;
    }

    /**
     * <p>
     * Only backups created before this time are listed.
     * <code>TimeRangeUpperBound</code> is exclusive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeRangeUpperBound <p>
     *            Only backups created before this time are listed.
     *            <code>TimeRangeUpperBound</code> is exclusive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupsRequest withTimeRangeUpperBound(java.util.Date timeRangeUpperBound) {
        this.timeRangeUpperBound = timeRangeUpperBound;
        return this;
    }

    /**
     * <p>
     * <code>LastEvaluatedBackupArn</code> is the ARN of the backup last
     * evaluated when the current page of results was returned, inclusive of the
     * current page of results. This value may be specified as the
     * <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code>
     * operation in order to fetch the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @return <p>
     *         <code>LastEvaluatedBackupArn</code> is the ARN of the backup last
     *         evaluated when the current page of results was returned,
     *         inclusive of the current page of results. This value may be
     *         specified as the <code>ExclusiveStartBackupArn</code> of a new
     *         <code>ListBackups</code> operation in order to fetch the next
     *         page of results.
     *         </p>
     */
    public String getExclusiveStartBackupArn() {
        return exclusiveStartBackupArn;
    }

    /**
     * <p>
     * <code>LastEvaluatedBackupArn</code> is the ARN of the backup last
     * evaluated when the current page of results was returned, inclusive of the
     * current page of results. This value may be specified as the
     * <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code>
     * operation in order to fetch the next page of results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param exclusiveStartBackupArn <p>
     *            <code>LastEvaluatedBackupArn</code> is the ARN of the backup
     *            last evaluated when the current page of results was returned,
     *            inclusive of the current page of results. This value may be
     *            specified as the <code>ExclusiveStartBackupArn</code> of a new
     *            <code>ListBackups</code> operation in order to fetch the next
     *            page of results.
     *            </p>
     */
    public void setExclusiveStartBackupArn(String exclusiveStartBackupArn) {
        this.exclusiveStartBackupArn = exclusiveStartBackupArn;
    }

    /**
     * <p>
     * <code>LastEvaluatedBackupArn</code> is the ARN of the backup last
     * evaluated when the current page of results was returned, inclusive of the
     * current page of results. This value may be specified as the
     * <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code>
     * operation in order to fetch the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>37 - 1024<br/>
     *
     * @param exclusiveStartBackupArn <p>
     *            <code>LastEvaluatedBackupArn</code> is the ARN of the backup
     *            last evaluated when the current page of results was returned,
     *            inclusive of the current page of results. This value may be
     *            specified as the <code>ExclusiveStartBackupArn</code> of a new
     *            <code>ListBackups</code> operation in order to fetch the next
     *            page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListBackupsRequest withExclusiveStartBackupArn(String exclusiveStartBackupArn) {
        this.exclusiveStartBackupArn = exclusiveStartBackupArn;
        return this;
    }

    /**
     * <p>
     * The backups from the table specified by <code>BackupType</code> are
     * listed.
     * </p>
     * <p>
     * Where <code>BackupType</code> can be:
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
     * <li>
     * <p>
     * <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM, ALL
     *
     * @return <p>
     *         The backups from the table specified by <code>BackupType</code>
     *         are listed.
     *         </p>
     *         <p>
     *         Where <code>BackupType</code> can be:
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
     *         <li>
     *         <p>
     *         <code>ALL</code> - All types of on-demand backups (USER and
     *         SYSTEM).
     *         </p>
     *         </li>
     *         </ul>
     * @see BackupTypeFilter
     */
    public String getBackupType() {
        return backupType;
    }

    /**
     * <p>
     * The backups from the table specified by <code>BackupType</code> are
     * listed.
     * </p>
     * <p>
     * Where <code>BackupType</code> can be:
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
     * <li>
     * <p>
     * <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM, ALL
     *
     * @param backupType <p>
     *            The backups from the table specified by
     *            <code>BackupType</code> are listed.
     *            </p>
     *            <p>
     *            Where <code>BackupType</code> can be:
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
     *            <li>
     *            <p>
     *            <code>ALL</code> - All types of on-demand backups (USER and
     *            SYSTEM).
     *            </p>
     *            </li>
     *            </ul>
     * @see BackupTypeFilter
     */
    public void setBackupType(String backupType) {
        this.backupType = backupType;
    }

    /**
     * <p>
     * The backups from the table specified by <code>BackupType</code> are
     * listed.
     * </p>
     * <p>
     * Where <code>BackupType</code> can be:
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
     * <li>
     * <p>
     * <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM, ALL
     *
     * @param backupType <p>
     *            The backups from the table specified by
     *            <code>BackupType</code> are listed.
     *            </p>
     *            <p>
     *            Where <code>BackupType</code> can be:
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
     *            <li>
     *            <p>
     *            <code>ALL</code> - All types of on-demand backups (USER and
     *            SYSTEM).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupTypeFilter
     */
    public ListBackupsRequest withBackupType(String backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * <p>
     * The backups from the table specified by <code>BackupType</code> are
     * listed.
     * </p>
     * <p>
     * Where <code>BackupType</code> can be:
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
     * <li>
     * <p>
     * <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM, ALL
     *
     * @param backupType <p>
     *            The backups from the table specified by
     *            <code>BackupType</code> are listed.
     *            </p>
     *            <p>
     *            Where <code>BackupType</code> can be:
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
     *            <li>
     *            <p>
     *            <code>ALL</code> - All types of on-demand backups (USER and
     *            SYSTEM).
     *            </p>
     *            </li>
     *            </ul>
     * @see BackupTypeFilter
     */
    public void setBackupType(BackupTypeFilter backupType) {
        this.backupType = backupType.toString();
    }

    /**
     * <p>
     * The backups from the table specified by <code>BackupType</code> are
     * listed.
     * </p>
     * <p>
     * Where <code>BackupType</code> can be:
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
     * <li>
     * <p>
     * <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>USER, SYSTEM, ALL
     *
     * @param backupType <p>
     *            The backups from the table specified by
     *            <code>BackupType</code> are listed.
     *            </p>
     *            <p>
     *            Where <code>BackupType</code> can be:
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
     *            <li>
     *            <p>
     *            <code>ALL</code> - All types of on-demand backups (USER and
     *            SYSTEM).
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BackupTypeFilter
     */
    public ListBackupsRequest withBackupType(BackupTypeFilter backupType) {
        this.backupType = backupType.toString();
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
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getTimeRangeLowerBound() != null)
            sb.append("TimeRangeLowerBound: " + getTimeRangeLowerBound() + ",");
        if (getTimeRangeUpperBound() != null)
            sb.append("TimeRangeUpperBound: " + getTimeRangeUpperBound() + ",");
        if (getExclusiveStartBackupArn() != null)
            sb.append("ExclusiveStartBackupArn: " + getExclusiveStartBackupArn() + ",");
        if (getBackupType() != null)
            sb.append("BackupType: " + getBackupType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getTimeRangeLowerBound() == null) ? 0 : getTimeRangeLowerBound().hashCode());
        hashCode = prime * hashCode
                + ((getTimeRangeUpperBound() == null) ? 0 : getTimeRangeUpperBound().hashCode());
        hashCode = prime
                * hashCode
                + ((getExclusiveStartBackupArn() == null) ? 0 : getExclusiveStartBackupArn()
                        .hashCode());
        hashCode = prime * hashCode + ((getBackupType() == null) ? 0 : getBackupType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBackupsRequest == false)
            return false;
        ListBackupsRequest other = (ListBackupsRequest) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getTimeRangeLowerBound() == null ^ this.getTimeRangeLowerBound() == null)
            return false;
        if (other.getTimeRangeLowerBound() != null
                && other.getTimeRangeLowerBound().equals(this.getTimeRangeLowerBound()) == false)
            return false;
        if (other.getTimeRangeUpperBound() == null ^ this.getTimeRangeUpperBound() == null)
            return false;
        if (other.getTimeRangeUpperBound() != null
                && other.getTimeRangeUpperBound().equals(this.getTimeRangeUpperBound()) == false)
            return false;
        if (other.getExclusiveStartBackupArn() == null ^ this.getExclusiveStartBackupArn() == null)
            return false;
        if (other.getExclusiveStartBackupArn() != null
                && other.getExclusiveStartBackupArn().equals(this.getExclusiveStartBackupArn()) == false)
            return false;
        if (other.getBackupType() == null ^ this.getBackupType() == null)
            return false;
        if (other.getBackupType() != null
                && other.getBackupType().equals(this.getBackupType()) == false)
            return false;
        return true;
    }
}
