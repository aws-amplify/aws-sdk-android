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
 * The UpdateTimeToLive method will enable or disable TTL for the specified
 * table. A successful <code>UpdateTimeToLive</code> call returns the current
 * <code>TimeToLiveSpecification</code>; it may take up to one hour for the
 * change to fully process. Any additional <code>UpdateTimeToLive</code> calls
 * for the same table during this one hour duration result in a
 * <code>ValidationException</code>.
 * </p>
 * <p>
 * TTL compares the current time in epoch time format to the time stored in the
 * TTL attribute of an item. If the epoch time value stored in the attribute is
 * less than the current time, the item is marked as expired and subsequently
 * deleted.
 * </p>
 * <note>
 * <p>
 * The epoch time format is the number of seconds elapsed since 12:00:00 AM
 * January 1st, 1970 UTC.
 * </p>
 * </note>
 * <p>
 * DynamoDB deletes expired items on a best-effort basis to ensure availability
 * of throughput for other data operations.
 * </p>
 * <important>
 * <p>
 * DynamoDB typically deletes expired items within two days of expiration. The
 * exact duration within which an item gets deleted after expiration is specific
 * to the nature of the workload. Items that have expired and not been deleted
 * will still show up in reads, queries, and scans.
 * </p>
 * </important>
 * <p>
 * As items are deleted, they are removed from any Local Secondary Index and
 * Global Secondary Index immediately in the same eventually consistent way as a
 * standard delete operation.
 * </p>
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/TTL.html"
 * >Time To Live</a> in the Amazon DynamoDB Developer Guide.
 * </p>
 */
public class UpdateTimeToLiveRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the table to be configured.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String tableName;

    /**
     * <p>
     * Represents the settings used to enable or disable Time to Live for the
     * specified table.
     * </p>
     */
    private TimeToLiveSpecification timeToLiveSpecification;

    /**
     * <p>
     * The name of the table to be configured.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         The name of the table to be configured.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the table to be configured.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param tableName <p>
     *            The name of the table to be configured.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table to be configured.
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
     *            The name of the table to be configured.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTimeToLiveRequest withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * Represents the settings used to enable or disable Time to Live for the
     * specified table.
     * </p>
     *
     * @return <p>
     *         Represents the settings used to enable or disable Time to Live
     *         for the specified table.
     *         </p>
     */
    public TimeToLiveSpecification getTimeToLiveSpecification() {
        return timeToLiveSpecification;
    }

    /**
     * <p>
     * Represents the settings used to enable or disable Time to Live for the
     * specified table.
     * </p>
     *
     * @param timeToLiveSpecification <p>
     *            Represents the settings used to enable or disable Time to Live
     *            for the specified table.
     *            </p>
     */
    public void setTimeToLiveSpecification(TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
    }

    /**
     * <p>
     * Represents the settings used to enable or disable Time to Live for the
     * specified table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeToLiveSpecification <p>
     *            Represents the settings used to enable or disable Time to Live
     *            for the specified table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTimeToLiveRequest withTimeToLiveSpecification(
            TimeToLiveSpecification timeToLiveSpecification) {
        this.timeToLiveSpecification = timeToLiveSpecification;
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
        if (getTimeToLiveSpecification() != null)
            sb.append("TimeToLiveSpecification: " + getTimeToLiveSpecification());
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
                + ((getTimeToLiveSpecification() == null) ? 0 : getTimeToLiveSpecification()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTimeToLiveRequest == false)
            return false;
        UpdateTimeToLiveRequest other = (UpdateTimeToLiveRequest) obj;

        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTimeToLiveSpecification() == null ^ this.getTimeToLiveSpecification() == null)
            return false;
        if (other.getTimeToLiveSpecification() != null
                && other.getTimeToLiveSpecification().equals(this.getTimeToLiveSpecification()) == false)
            return false;
        return true;
    }
}
