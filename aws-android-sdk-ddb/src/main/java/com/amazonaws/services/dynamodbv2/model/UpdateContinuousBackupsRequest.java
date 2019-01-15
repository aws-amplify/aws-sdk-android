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
 * <code>UpdateContinuousBackups</code> enables or disables point in time
 * recovery for the specified table. A successful
 * <code>UpdateContinuousBackups</code> call returns the current
 * <code>ContinuousBackupsDescription</code>. Continuous backups are
 * <code>ENABLED</code> on all tables at table creation. If point in time
 * recovery is enabled, <code>PointInTimeRecoveryStatus</code> will be set to
 * ENABLED.
 * </p>
 * <p>
 * Once continuous backups and point in time recovery are enabled, you can
 * restore to any point in time within <code>EarliestRestorableDateTime</code>
 * and <code>LatestRestorableDateTime</code>.
 * </p>
 * <p>
 * <code>LatestRestorableDateTime</code> is typically 5 minutes before the
 * current time. You can restore your table to any point in time during the last
 * 35 days..
 * </p>
 */
public class UpdateContinuousBackupsRequest extends AmazonWebServiceRequest implements Serializable {
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
     * Represents the settings used to enable point in time recovery.
     * </p>
     */
    private PointInTimeRecoverySpecification pointInTimeRecoverySpecification;

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
    public UpdateContinuousBackupsRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * Represents the settings used to enable point in time recovery.
     * </p>
     *
     * @return <p>
     *         Represents the settings used to enable point in time recovery.
     *         </p>
     */
    public PointInTimeRecoverySpecification getPointInTimeRecoverySpecification() {
        return pointInTimeRecoverySpecification;
    }

    /**
     * <p>
     * Represents the settings used to enable point in time recovery.
     * </p>
     *
     * @param pointInTimeRecoverySpecification <p>
     *            Represents the settings used to enable point in time recovery.
     *            </p>
     */
    public void setPointInTimeRecoverySpecification(
            PointInTimeRecoverySpecification pointInTimeRecoverySpecification) {
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
    }

    /**
     * <p>
     * Represents the settings used to enable point in time recovery.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pointInTimeRecoverySpecification <p>
     *            Represents the settings used to enable point in time recovery.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateContinuousBackupsRequest withPointInTimeRecoverySpecification(
            PointInTimeRecoverySpecification pointInTimeRecoverySpecification) {
        this.pointInTimeRecoverySpecification = pointInTimeRecoverySpecification;
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
        if (getPointInTimeRecoverySpecification() != null)
            sb.append("PointInTimeRecoverySpecification: " + getPointInTimeRecoverySpecification());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPointInTimeRecoverySpecification() == null) ? 0
                        : getPointInTimeRecoverySpecification().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateContinuousBackupsRequest == false)
            return false;
        UpdateContinuousBackupsRequest other = (UpdateContinuousBackupsRequest) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getPointInTimeRecoverySpecification() == null
                ^ this.getPointInTimeRecoverySpecification() == null)
            return false;
        if (other.getPointInTimeRecoverySpecification() != null
                && other.getPointInTimeRecoverySpecification().equals(
                        this.getPointInTimeRecoverySpecification()) == false)
            return false;
        return true;
    }
}
