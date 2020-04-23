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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in
 * preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Represents a set of RDS DB instances, Aurora DB clusters, or both that a
 * proxy can connect to. Currently, each target group is associated with exactly
 * one RDS DB instance or Aurora DB cluster.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBProxyTargetGroups</code> action.
 * </p>
 */
public class DBProxyTargetGroup implements Serializable {
    /**
     * <p>
     * The identifier for the RDS proxy associated with this target group.
     * </p>
     */
    private String dBProxyName;

    /**
     * <p>
     * The identifier for the target group. This name must be unique for all
     * target groups owned by your AWS account in the specified AWS Region.
     * </p>
     */
    private String targetGroupName;

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the target group.
     * </p>
     */
    private String targetGroupArn;

    /**
     * <p>
     * Whether this target group is the first one used for connection requests
     * by the associated proxy. Because each proxy is currently associated with
     * a single target group, currently this setting is always <code>true</code>
     * .
     * </p>
     */
    private Boolean isDefault;

    /**
     * <p>
     * The current status of this target group. A status of
     * <code>available</code> means the target group is correctly associated
     * with a database. Other values indicate that you must wait for the target
     * group to be ready, or take some action to resolve an issue.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The settings that determine the size and behavior of the connection pool
     * for the target group.
     * </p>
     */
    private ConnectionPoolConfigurationInfo connectionPoolConfig;

    /**
     * <p>
     * The date and time when the target group was first created.
     * </p>
     */
    private java.util.Date createdDate;

    /**
     * <p>
     * The date and time when the target group was last updated.
     * </p>
     */
    private java.util.Date updatedDate;

    /**
     * <p>
     * The identifier for the RDS proxy associated with this target group.
     * </p>
     *
     * @return <p>
     *         The identifier for the RDS proxy associated with this target
     *         group.
     *         </p>
     */
    public String getDBProxyName() {
        return dBProxyName;
    }

    /**
     * <p>
     * The identifier for the RDS proxy associated with this target group.
     * </p>
     *
     * @param dBProxyName <p>
     *            The identifier for the RDS proxy associated with this target
     *            group.
     *            </p>
     */
    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier for the RDS proxy associated with this target group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxyName <p>
     *            The identifier for the RDS proxy associated with this target
     *            group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTargetGroup withDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
        return this;
    }

    /**
     * <p>
     * The identifier for the target group. This name must be unique for all
     * target groups owned by your AWS account in the specified AWS Region.
     * </p>
     *
     * @return <p>
     *         The identifier for the target group. This name must be unique for
     *         all target groups owned by your AWS account in the specified AWS
     *         Region.
     *         </p>
     */
    public String getTargetGroupName() {
        return targetGroupName;
    }

    /**
     * <p>
     * The identifier for the target group. This name must be unique for all
     * target groups owned by your AWS account in the specified AWS Region.
     * </p>
     *
     * @param targetGroupName <p>
     *            The identifier for the target group. This name must be unique
     *            for all target groups owned by your AWS account in the
     *            specified AWS Region.
     *            </p>
     */
    public void setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
    }

    /**
     * <p>
     * The identifier for the target group. This name must be unique for all
     * target groups owned by your AWS account in the specified AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupName <p>
     *            The identifier for the target group. This name must be unique
     *            for all target groups owned by your AWS account in the
     *            specified AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTargetGroup withTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the target group.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) representing the target group.
     *         </p>
     */
    public String getTargetGroupArn() {
        return targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the target group.
     * </p>
     *
     * @param targetGroupArn <p>
     *            The Amazon Resource Name (ARN) representing the target group.
     *            </p>
     */
    public void setTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) representing the target group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupArn <p>
     *            The Amazon Resource Name (ARN) representing the target group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTargetGroup withTargetGroupArn(String targetGroupArn) {
        this.targetGroupArn = targetGroupArn;
        return this;
    }

    /**
     * <p>
     * Whether this target group is the first one used for connection requests
     * by the associated proxy. Because each proxy is currently associated with
     * a single target group, currently this setting is always <code>true</code>
     * .
     * </p>
     *
     * @return <p>
     *         Whether this target group is the first one used for connection
     *         requests by the associated proxy. Because each proxy is currently
     *         associated with a single target group, currently this setting is
     *         always <code>true</code>.
     *         </p>
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Whether this target group is the first one used for connection requests
     * by the associated proxy. Because each proxy is currently associated with
     * a single target group, currently this setting is always <code>true</code>
     * .
     * </p>
     *
     * @return <p>
     *         Whether this target group is the first one used for connection
     *         requests by the associated proxy. Because each proxy is currently
     *         associated with a single target group, currently this setting is
     *         always <code>true</code>.
     *         </p>
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * <p>
     * Whether this target group is the first one used for connection requests
     * by the associated proxy. Because each proxy is currently associated with
     * a single target group, currently this setting is always <code>true</code>
     * .
     * </p>
     *
     * @param isDefault <p>
     *            Whether this target group is the first one used for connection
     *            requests by the associated proxy. Because each proxy is
     *            currently associated with a single target group, currently
     *            this setting is always <code>true</code>.
     *            </p>
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Whether this target group is the first one used for connection requests
     * by the associated proxy. Because each proxy is currently associated with
     * a single target group, currently this setting is always <code>true</code>
     * .
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefault <p>
     *            Whether this target group is the first one used for connection
     *            requests by the associated proxy. Because each proxy is
     *            currently associated with a single target group, currently
     *            this setting is always <code>true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTargetGroup withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * <p>
     * The current status of this target group. A status of
     * <code>available</code> means the target group is correctly associated
     * with a database. Other values indicate that you must wait for the target
     * group to be ready, or take some action to resolve an issue.
     * </p>
     *
     * @return <p>
     *         The current status of this target group. A status of
     *         <code>available</code> means the target group is correctly
     *         associated with a database. Other values indicate that you must
     *         wait for the target group to be ready, or take some action to
     *         resolve an issue.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current status of this target group. A status of
     * <code>available</code> means the target group is correctly associated
     * with a database. Other values indicate that you must wait for the target
     * group to be ready, or take some action to resolve an issue.
     * </p>
     *
     * @param status <p>
     *            The current status of this target group. A status of
     *            <code>available</code> means the target group is correctly
     *            associated with a database. Other values indicate that you
     *            must wait for the target group to be ready, or take some
     *            action to resolve an issue.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of this target group. A status of
     * <code>available</code> means the target group is correctly associated
     * with a database. Other values indicate that you must wait for the target
     * group to be ready, or take some action to resolve an issue.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The current status of this target group. A status of
     *            <code>available</code> means the target group is correctly
     *            associated with a database. Other values indicate that you
     *            must wait for the target group to be ready, or take some
     *            action to resolve an issue.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTargetGroup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The settings that determine the size and behavior of the connection pool
     * for the target group.
     * </p>
     *
     * @return <p>
     *         The settings that determine the size and behavior of the
     *         connection pool for the target group.
     *         </p>
     */
    public ConnectionPoolConfigurationInfo getConnectionPoolConfig() {
        return connectionPoolConfig;
    }

    /**
     * <p>
     * The settings that determine the size and behavior of the connection pool
     * for the target group.
     * </p>
     *
     * @param connectionPoolConfig <p>
     *            The settings that determine the size and behavior of the
     *            connection pool for the target group.
     *            </p>
     */
    public void setConnectionPoolConfig(ConnectionPoolConfigurationInfo connectionPoolConfig) {
        this.connectionPoolConfig = connectionPoolConfig;
    }

    /**
     * <p>
     * The settings that determine the size and behavior of the connection pool
     * for the target group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionPoolConfig <p>
     *            The settings that determine the size and behavior of the
     *            connection pool for the target group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTargetGroup withConnectionPoolConfig(
            ConnectionPoolConfigurationInfo connectionPoolConfig) {
        this.connectionPoolConfig = connectionPoolConfig;
        return this;
    }

    /**
     * <p>
     * The date and time when the target group was first created.
     * </p>
     *
     * @return <p>
     *         The date and time when the target group was first created.
     *         </p>
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }

    /**
     * <p>
     * The date and time when the target group was first created.
     * </p>
     *
     * @param createdDate <p>
     *            The date and time when the target group was first created.
     *            </p>
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date and time when the target group was first created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdDate <p>
     *            The date and time when the target group was first created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTargetGroup withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * <p>
     * The date and time when the target group was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time when the target group was last updated.
     *         </p>
     */
    public java.util.Date getUpdatedDate() {
        return updatedDate;
    }

    /**
     * <p>
     * The date and time when the target group was last updated.
     * </p>
     *
     * @param updatedDate <p>
     *            The date and time when the target group was last updated.
     *            </p>
     */
    public void setUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * <p>
     * The date and time when the target group was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updatedDate <p>
     *            The date and time when the target group was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBProxyTargetGroup withUpdatedDate(java.util.Date updatedDate) {
        this.updatedDate = updatedDate;
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
        if (getDBProxyName() != null)
            sb.append("DBProxyName: " + getDBProxyName() + ",");
        if (getTargetGroupName() != null)
            sb.append("TargetGroupName: " + getTargetGroupName() + ",");
        if (getTargetGroupArn() != null)
            sb.append("TargetGroupArn: " + getTargetGroupArn() + ",");
        if (getIsDefault() != null)
            sb.append("IsDefault: " + getIsDefault() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getConnectionPoolConfig() != null)
            sb.append("ConnectionPoolConfig: " + getConnectionPoolConfig() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getUpdatedDate() != null)
            sb.append("UpdatedDate: " + getUpdatedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetGroupName() == null) ? 0 : getTargetGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetGroupArn() == null) ? 0 : getTargetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionPoolConfig() == null) ? 0 : getConnectionPoolConfig().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBProxyTargetGroup == false)
            return false;
        DBProxyTargetGroup other = (DBProxyTargetGroup) obj;

        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null
                && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getTargetGroupName() == null ^ this.getTargetGroupName() == null)
            return false;
        if (other.getTargetGroupName() != null
                && other.getTargetGroupName().equals(this.getTargetGroupName()) == false)
            return false;
        if (other.getTargetGroupArn() == null ^ this.getTargetGroupArn() == null)
            return false;
        if (other.getTargetGroupArn() != null
                && other.getTargetGroupArn().equals(this.getTargetGroupArn()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null
                && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getConnectionPoolConfig() == null ^ this.getConnectionPoolConfig() == null)
            return false;
        if (other.getConnectionPoolConfig() != null
                && other.getConnectionPoolConfig().equals(this.getConnectionPoolConfig()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getUpdatedDate() == null ^ this.getUpdatedDate() == null)
            return false;
        if (other.getUpdatedDate() != null
                && other.getUpdatedDate().equals(this.getUpdatedDate()) == false)
            return false;
        return true;
    }
}
