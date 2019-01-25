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
 * Restores the specified table to the specified point in time within
 * <code>EarliestRestorableDateTime</code> and
 * <code>LatestRestorableDateTime</code>. You can restore your table to any
 * point in time during the last 35 days. Any number of users can execute up to
 * 4 concurrent restores (any type of restore) in a given account.
 * </p>
 * <p>
 * When you restore using point in time recovery, DynamoDB restores your table
 * data to the state based on the selected date and time
 * (day:hour:minute:second) to a new table.
 * </p>
 * <p>
 * Along with data, the following are also included on the new restored table
 * using point in time recovery:
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
 * Provisioned read and write capacity
 * </p>
 * </li>
 * <li>
 * <p>
 * Encryption settings
 * </p>
 * <important>
 * <p>
 * All these settings come from the current settings of the source table at the
 * time of restore.
 * </p>
 * </important></li>
 * </ul>
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
 * <li>
 * <p>
 * Point in time recovery settings
 * </p>
 * </li>
 * </ul>
 */
public class RestoreTableToPointInTimeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String sourceTableName;

    /**
     * <p>
     * The name of the new table to which it must be restored to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String targetTableName;

    /**
     * <p>
     * Restore the table to the latest possible time.
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     */
    private Boolean useLatestRestorableTime;

    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     */
    private java.util.Date restoreDateTime;

    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         Name of the source table that is being restored.
     *         </p>
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param sourceTableName <p>
     *            Name of the source table that is being restored.
     *            </p>
     */
    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    /**
     * <p>
     * Name of the source table that is being restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param sourceTableName <p>
     *            Name of the source table that is being restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableToPointInTimeRequest withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * <p>
     * The name of the new table to which it must be restored to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the new table to which it must be restored to.
     *         </p>
     */
    public String getTargetTableName() {
        return targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which it must be restored to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param targetTableName <p>
     *            The name of the new table to which it must be restored to.
     *            </p>
     */
    public void setTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
    }

    /**
     * <p>
     * The name of the new table to which it must be restored to.
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
     *            The name of the new table to which it must be restored to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableToPointInTimeRequest withTargetTableName(String targetTableName) {
        this.targetTableName = targetTableName;
        return this;
    }

    /**
     * <p>
     * Restore the table to the latest possible time.
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     *
     * @return <p>
     *         Restore the table to the latest possible time.
     *         <code>LatestRestorableDateTime</code> is typically 5 minutes
     *         before the current time.
     *         </p>
     */
    public Boolean isUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }

    /**
     * <p>
     * Restore the table to the latest possible time.
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     *
     * @return <p>
     *         Restore the table to the latest possible time.
     *         <code>LatestRestorableDateTime</code> is typically 5 minutes
     *         before the current time.
     *         </p>
     */
    public Boolean getUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }

    /**
     * <p>
     * Restore the table to the latest possible time.
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     *
     * @param useLatestRestorableTime <p>
     *            Restore the table to the latest possible time.
     *            <code>LatestRestorableDateTime</code> is typically 5 minutes
     *            before the current time.
     *            </p>
     */
    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * <p>
     * Restore the table to the latest possible time.
     * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
     * current time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useLatestRestorableTime <p>
     *            Restore the table to the latest possible time.
     *            <code>LatestRestorableDateTime</code> is typically 5 minutes
     *            before the current time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableToPointInTimeRequest withUseLatestRestorableTime(
            Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
        return this;
    }

    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     *
     * @return <p>
     *         Time in the past to restore the table to.
     *         </p>
     */
    public java.util.Date getRestoreDateTime() {
        return restoreDateTime;
    }

    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     *
     * @param restoreDateTime <p>
     *            Time in the past to restore the table to.
     *            </p>
     */
    public void setRestoreDateTime(java.util.Date restoreDateTime) {
        this.restoreDateTime = restoreDateTime;
    }

    /**
     * <p>
     * Time in the past to restore the table to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreDateTime <p>
     *            Time in the past to restore the table to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreTableToPointInTimeRequest withRestoreDateTime(java.util.Date restoreDateTime) {
        this.restoreDateTime = restoreDateTime;
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
        if (getSourceTableName() != null)
            sb.append("SourceTableName: " + getSourceTableName() + ",");
        if (getTargetTableName() != null)
            sb.append("TargetTableName: " + getTargetTableName() + ",");
        if (getUseLatestRestorableTime() != null)
            sb.append("UseLatestRestorableTime: " + getUseLatestRestorableTime() + ",");
        if (getRestoreDateTime() != null)
            sb.append("RestoreDateTime: " + getRestoreDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceTableName() == null) ? 0 : getSourceTableName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetTableName() == null) ? 0 : getTargetTableName().hashCode());
        hashCode = prime
                * hashCode
                + ((getUseLatestRestorableTime() == null) ? 0 : getUseLatestRestorableTime()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRestoreDateTime() == null) ? 0 : getRestoreDateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreTableToPointInTimeRequest == false)
            return false;
        RestoreTableToPointInTimeRequest other = (RestoreTableToPointInTimeRequest) obj;

        if (other.getSourceTableName() == null ^ this.getSourceTableName() == null)
            return false;
        if (other.getSourceTableName() != null
                && other.getSourceTableName().equals(this.getSourceTableName()) == false)
            return false;
        if (other.getTargetTableName() == null ^ this.getTargetTableName() == null)
            return false;
        if (other.getTargetTableName() != null
                && other.getTargetTableName().equals(this.getTargetTableName()) == false)
            return false;
        if (other.getUseLatestRestorableTime() == null ^ this.getUseLatestRestorableTime() == null)
            return false;
        if (other.getUseLatestRestorableTime() != null
                && other.getUseLatestRestorableTime().equals(this.getUseLatestRestorableTime()) == false)
            return false;
        if (other.getRestoreDateTime() == null ^ this.getRestoreDateTime() == null)
            return false;
        if (other.getRestoreDateTime() != null
                && other.getRestoreDateTime().equals(this.getRestoreDateTime()) == false)
            return false;
        return true;
    }
}
