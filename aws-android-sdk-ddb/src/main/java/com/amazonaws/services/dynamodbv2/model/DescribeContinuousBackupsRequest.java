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
 * Checks the status of continuous backups and point in time recovery on the
 * specified table. Continuous backups are <code>ENABLED</code> on all tables at
 * table creation. If point in time recovery is enabled,
 * <code>PointInTimeRecoveryStatus</code> will be set to ENABLED.
 * </p>
 * <p>
 * Once continuous backups and point in time recovery are enabled, you can
 * restore to any point in time within <code>EarliestRestorableDateTime</code>
 * and <code>LatestRestorableDateTime</code>.
 * </p>
 * <p>
 * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
 * current time. You can restore your table to any point in time during the last
 * 35 days.
 * </p>
 * <p>
 * You can call <code>DescribeContinuousBackups</code> at a maximum rate of 10
 * times per second.
 * </p>
 */
public class DescribeContinuousBackupsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Name of the table for which the customer wants to check the continuous
     * backups and point in time recovery settings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * Name of the table for which the customer wants to check the continuous
     * backups and point in time recovery settings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         Name of the table for which the customer wants to check the
     *         continuous backups and point in time recovery settings.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * Name of the table for which the customer wants to check the continuous
     * backups and point in time recovery settings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            Name of the table for which the customer wants to check the
     *            continuous backups and point in time recovery settings.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Name of the table for which the customer wants to check the continuous
     * backups and point in time recovery settings.
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
     *            Name of the table for which the customer wants to check the
     *            continuous backups and point in time recovery settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeContinuousBackupsRequest withTableName(String tableName) {
        this.tableName = tableName;
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
            sb.append("TableName: " + getTableName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeContinuousBackupsRequest == false)
            return false;
        DescribeContinuousBackupsRequest other = (DescribeContinuousBackupsRequest) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        return true;
    }
}
