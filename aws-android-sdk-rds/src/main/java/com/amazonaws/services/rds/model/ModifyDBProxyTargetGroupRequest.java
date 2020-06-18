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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in
 * preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Modifies the properties of a <code>DBProxyTargetGroup</code>.
 * </p>
 */
public class ModifyDBProxyTargetGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the new target group to assign to the proxy.
     * </p>
     */
    private String targetGroupName;

    /**
     * <p>
     * The name of the new proxy to which to assign the target group.
     * </p>
     */
    private String dBProxyName;

    /**
     * <p>
     * The settings that determine the size and behavior of the connection pool
     * for the target group.
     * </p>
     */
    private ConnectionPoolConfiguration connectionPoolConfig;

    /**
     * <p>
     * The new name for the modified <code>DBProxyTarget</code>. An identifier
     * must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String newName;

    /**
     * <p>
     * The name of the new target group to assign to the proxy.
     * </p>
     *
     * @return <p>
     *         The name of the new target group to assign to the proxy.
     *         </p>
     */
    public String getTargetGroupName() {
        return targetGroupName;
    }

    /**
     * <p>
     * The name of the new target group to assign to the proxy.
     * </p>
     *
     * @param targetGroupName <p>
     *            The name of the new target group to assign to the proxy.
     *            </p>
     */
    public void setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
    }

    /**
     * <p>
     * The name of the new target group to assign to the proxy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupName <p>
     *            The name of the new target group to assign to the proxy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBProxyTargetGroupRequest withTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the new proxy to which to assign the target group.
     * </p>
     *
     * @return <p>
     *         The name of the new proxy to which to assign the target group.
     *         </p>
     */
    public String getDBProxyName() {
        return dBProxyName;
    }

    /**
     * <p>
     * The name of the new proxy to which to assign the target group.
     * </p>
     *
     * @param dBProxyName <p>
     *            The name of the new proxy to which to assign the target group.
     *            </p>
     */
    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The name of the new proxy to which to assign the target group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxyName <p>
     *            The name of the new proxy to which to assign the target group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBProxyTargetGroupRequest withDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
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
    public ConnectionPoolConfiguration getConnectionPoolConfig() {
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
    public void setConnectionPoolConfig(ConnectionPoolConfiguration connectionPoolConfig) {
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
    public ModifyDBProxyTargetGroupRequest withConnectionPoolConfig(
            ConnectionPoolConfiguration connectionPoolConfig) {
        this.connectionPoolConfig = connectionPoolConfig;
        return this;
    }

    /**
     * <p>
     * The new name for the modified <code>DBProxyTarget</code>. An identifier
     * must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @return <p>
     *         The new name for the modified <code>DBProxyTarget</code>. An
     *         identifier must begin with a letter and must contain only ASCII
     *         letters, digits, and hyphens; it can't end with a hyphen or
     *         contain two consecutive hyphens.
     *         </p>
     */
    public String getNewName() {
        return newName;
    }

    /**
     * <p>
     * The new name for the modified <code>DBProxyTarget</code>. An identifier
     * must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     *
     * @param newName <p>
     *            The new name for the modified <code>DBProxyTarget</code>. An
     *            identifier must begin with a letter and must contain only
     *            ASCII letters, digits, and hyphens; it can't end with a hyphen
     *            or contain two consecutive hyphens.
     *            </p>
     */
    public void setNewName(String newName) {
        this.newName = newName;
    }

    /**
     * <p>
     * The new name for the modified <code>DBProxyTarget</code>. An identifier
     * must begin with a letter and must contain only ASCII letters, digits, and
     * hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newName <p>
     *            The new name for the modified <code>DBProxyTarget</code>. An
     *            identifier must begin with a letter and must contain only
     *            ASCII letters, digits, and hyphens; it can't end with a hyphen
     *            or contain two consecutive hyphens.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBProxyTargetGroupRequest withNewName(String newName) {
        this.newName = newName;
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
        if (getTargetGroupName() != null)
            sb.append("TargetGroupName: " + getTargetGroupName() + ",");
        if (getDBProxyName() != null)
            sb.append("DBProxyName: " + getDBProxyName() + ",");
        if (getConnectionPoolConfig() != null)
            sb.append("ConnectionPoolConfig: " + getConnectionPoolConfig() + ",");
        if (getNewName() != null)
            sb.append("NewName: " + getNewName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTargetGroupName() == null) ? 0 : getTargetGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getDBProxyName() == null) ? 0 : getDBProxyName().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionPoolConfig() == null) ? 0 : getConnectionPoolConfig().hashCode());
        hashCode = prime * hashCode + ((getNewName() == null) ? 0 : getNewName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBProxyTargetGroupRequest == false)
            return false;
        ModifyDBProxyTargetGroupRequest other = (ModifyDBProxyTargetGroupRequest) obj;

        if (other.getTargetGroupName() == null ^ this.getTargetGroupName() == null)
            return false;
        if (other.getTargetGroupName() != null
                && other.getTargetGroupName().equals(this.getTargetGroupName()) == false)
            return false;
        if (other.getDBProxyName() == null ^ this.getDBProxyName() == null)
            return false;
        if (other.getDBProxyName() != null
                && other.getDBProxyName().equals(this.getDBProxyName()) == false)
            return false;
        if (other.getConnectionPoolConfig() == null ^ this.getConnectionPoolConfig() == null)
            return false;
        if (other.getConnectionPoolConfig() != null
                && other.getConnectionPoolConfig().equals(this.getConnectionPoolConfig()) == false)
            return false;
        if (other.getNewName() == null ^ this.getNewName() == null)
            return false;
        if (other.getNewName() != null && other.getNewName().equals(this.getNewName()) == false)
            return false;
        return true;
    }
}
