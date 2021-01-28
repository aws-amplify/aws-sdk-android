/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The Timestream rule action writes attributes (measures) from an MQTT message
 * into an Amazon Timestream table. For more information, see the <a href=
 * "https://docs.aws.amazon.com/iot/latest/developerguide/timestream-rule-action.html"
 * >Timestream</a> topic rule action documentation.
 * </p>
 */
public class TimestreamAction implements Serializable {
    /**
     * <p>
     * The ARN of the role that grants permission to write to the Amazon
     * Timestream database table.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of an Amazon Timestream database.
     * </p>
     */
    private String databaseName;

    /**
     * <p>
     * The name of the database table into which to write the measure records.
     * </p>
     */
    private String tableName;

    /**
     * <p>
     * Metadata attributes of the time series that are written in each measure
     * record.
     * </p>
     */
    private java.util.List<TimestreamDimension> dimensions;

    /**
     * <p>
     * Specifies an application-defined value to replace the default value
     * assigned to the Timestream record's timestamp in the <code>time</code>
     * column.
     * </p>
     * <p>
     * You can use this property to specify the value and the precision of the
     * Timestream record's timestamp. You can specify a value from the message
     * payload or a value computed by a substitution template.
     * </p>
     * <p>
     * If omitted, the topic rule action assigns the timestamp, in milliseconds,
     * at the time it processed the rule.
     * </p>
     */
    private TimestreamTimestamp timestamp;

    /**
     * <p>
     * The ARN of the role that grants permission to write to the Amazon
     * Timestream database table.
     * </p>
     *
     * @return <p>
     *         The ARN of the role that grants permission to write to the Amazon
     *         Timestream database table.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to write to the Amazon
     * Timestream database table.
     * </p>
     *
     * @param roleArn <p>
     *            The ARN of the role that grants permission to write to the
     *            Amazon Timestream database table.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role that grants permission to write to the Amazon
     * Timestream database table.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param roleArn <p>
     *            The ARN of the role that grants permission to write to the
     *            Amazon Timestream database table.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimestreamAction withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The name of an Amazon Timestream database.
     * </p>
     *
     * @return <p>
     *         The name of an Amazon Timestream database.
     *         </p>
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * <p>
     * The name of an Amazon Timestream database.
     * </p>
     *
     * @param databaseName <p>
     *            The name of an Amazon Timestream database.
     *            </p>
     */
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of an Amazon Timestream database.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param databaseName <p>
     *            The name of an Amazon Timestream database.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimestreamAction withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * <p>
     * The name of the database table into which to write the measure records.
     * </p>
     *
     * @return <p>
     *         The name of the database table into which to write the measure
     *         records.
     *         </p>
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * <p>
     * The name of the database table into which to write the measure records.
     * </p>
     *
     * @param tableName <p>
     *            The name of the database table into which to write the measure
     *            records.
     *            </p>
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the database table into which to write the measure records.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tableName <p>
     *            The name of the database table into which to write the measure
     *            records.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimestreamAction withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * <p>
     * Metadata attributes of the time series that are written in each measure
     * record.
     * </p>
     *
     * @return <p>
     *         Metadata attributes of the time series that are written in each
     *         measure record.
     *         </p>
     */
    public java.util.List<TimestreamDimension> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * Metadata attributes of the time series that are written in each measure
     * record.
     * </p>
     *
     * @param dimensions <p>
     *            Metadata attributes of the time series that are written in
     *            each measure record.
     *            </p>
     */
    public void setDimensions(java.util.Collection<TimestreamDimension> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<TimestreamDimension>(dimensions);
    }

    /**
     * <p>
     * Metadata attributes of the time series that are written in each measure
     * record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            Metadata attributes of the time series that are written in
     *            each measure record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimestreamAction withDimensions(TimestreamDimension... dimensions) {
        if (getDimensions() == null) {
            this.dimensions = new java.util.ArrayList<TimestreamDimension>(dimensions.length);
        }
        for (TimestreamDimension value : dimensions) {
            this.dimensions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata attributes of the time series that are written in each measure
     * record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dimensions <p>
     *            Metadata attributes of the time series that are written in
     *            each measure record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimestreamAction withDimensions(java.util.Collection<TimestreamDimension> dimensions) {
        setDimensions(dimensions);
        return this;
    }

    /**
     * <p>
     * Specifies an application-defined value to replace the default value
     * assigned to the Timestream record's timestamp in the <code>time</code>
     * column.
     * </p>
     * <p>
     * You can use this property to specify the value and the precision of the
     * Timestream record's timestamp. You can specify a value from the message
     * payload or a value computed by a substitution template.
     * </p>
     * <p>
     * If omitted, the topic rule action assigns the timestamp, in milliseconds,
     * at the time it processed the rule.
     * </p>
     *
     * @return <p>
     *         Specifies an application-defined value to replace the default
     *         value assigned to the Timestream record's timestamp in the
     *         <code>time</code> column.
     *         </p>
     *         <p>
     *         You can use this property to specify the value and the precision
     *         of the Timestream record's timestamp. You can specify a value
     *         from the message payload or a value computed by a substitution
     *         template.
     *         </p>
     *         <p>
     *         If omitted, the topic rule action assigns the timestamp, in
     *         milliseconds, at the time it processed the rule.
     *         </p>
     */
    public TimestreamTimestamp getTimestamp() {
        return timestamp;
    }

    /**
     * <p>
     * Specifies an application-defined value to replace the default value
     * assigned to the Timestream record's timestamp in the <code>time</code>
     * column.
     * </p>
     * <p>
     * You can use this property to specify the value and the precision of the
     * Timestream record's timestamp. You can specify a value from the message
     * payload or a value computed by a substitution template.
     * </p>
     * <p>
     * If omitted, the topic rule action assigns the timestamp, in milliseconds,
     * at the time it processed the rule.
     * </p>
     *
     * @param timestamp <p>
     *            Specifies an application-defined value to replace the default
     *            value assigned to the Timestream record's timestamp in the
     *            <code>time</code> column.
     *            </p>
     *            <p>
     *            You can use this property to specify the value and the
     *            precision of the Timestream record's timestamp. You can
     *            specify a value from the message payload or a value computed
     *            by a substitution template.
     *            </p>
     *            <p>
     *            If omitted, the topic rule action assigns the timestamp, in
     *            milliseconds, at the time it processed the rule.
     *            </p>
     */
    public void setTimestamp(TimestreamTimestamp timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Specifies an application-defined value to replace the default value
     * assigned to the Timestream record's timestamp in the <code>time</code>
     * column.
     * </p>
     * <p>
     * You can use this property to specify the value and the precision of the
     * Timestream record's timestamp. You can specify a value from the message
     * payload or a value computed by a substitution template.
     * </p>
     * <p>
     * If omitted, the topic rule action assigns the timestamp, in milliseconds,
     * at the time it processed the rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timestamp <p>
     *            Specifies an application-defined value to replace the default
     *            value assigned to the Timestream record's timestamp in the
     *            <code>time</code> column.
     *            </p>
     *            <p>
     *            You can use this property to specify the value and the
     *            precision of the Timestream record's timestamp. You can
     *            specify a value from the message payload or a value computed
     *            by a substitution template.
     *            </p>
     *            <p>
     *            If omitted, the topic rule action assigns the timestamp, in
     *            milliseconds, at the time it processed the rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimestreamAction withTimestamp(TimestreamTimestamp timestamp) {
        this.timestamp = timestamp;
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
        if (getRoleArn() != null)
            sb.append("roleArn: " + getRoleArn() + ",");
        if (getDatabaseName() != null)
            sb.append("databaseName: " + getDatabaseName() + ",");
        if (getTableName() != null)
            sb.append("tableName: " + getTableName() + ",");
        if (getDimensions() != null)
            sb.append("dimensions: " + getDimensions() + ",");
        if (getTimestamp() != null)
            sb.append("timestamp: " + getTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimestreamAction == false)
            return false;
        TimestreamAction other = (TimestreamAction) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null
                && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null
                && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null
                && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        return true;
    }
}
