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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <note>
 * <p>
 * This is prerelease documentation for the RDS Database Proxy feature in
 * preview release. It is subject to change.
 * </p>
 * </note>
 * <p>
 * Associate one or more <code>DBProxyTarget</code> data structures with a
 * <code>DBProxyTargetGroup</code>.
 * </p>
 */
public class RegisterDBProxyTargetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the <code>DBProxy</code> that is associated with the
     * <code>DBProxyTargetGroup</code>.
     * </p>
     */
    private String dBProxyName;

    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code>.
     * </p>
     */
    private String targetGroupName;

    /**
     * <p>
     * One or more DB instance identifiers.
     * </p>
     */
    private java.util.List<String> dBInstanceIdentifiers;

    /**
     * <p>
     * One or more DB cluster identifiers.
     * </p>
     */
    private java.util.List<String> dBClusterIdentifiers;

    /**
     * <p>
     * The identifier of the <code>DBProxy</code> that is associated with the
     * <code>DBProxyTargetGroup</code>.
     * </p>
     *
     * @return <p>
     *         The identifier of the <code>DBProxy</code> that is associated
     *         with the <code>DBProxyTargetGroup</code>.
     *         </p>
     */
    public String getDBProxyName() {
        return dBProxyName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxy</code> that is associated with the
     * <code>DBProxyTargetGroup</code>.
     * </p>
     *
     * @param dBProxyName <p>
     *            The identifier of the <code>DBProxy</code> that is associated
     *            with the <code>DBProxyTargetGroup</code>.
     *            </p>
     */
    public void setDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxy</code> that is associated with the
     * <code>DBProxyTargetGroup</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBProxyName <p>
     *            The identifier of the <code>DBProxy</code> that is associated
     *            with the <code>DBProxyTargetGroup</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDBProxyTargetsRequest withDBProxyName(String dBProxyName) {
        this.dBProxyName = dBProxyName;
        return this;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code>.
     * </p>
     *
     * @return <p>
     *         The identifier of the <code>DBProxyTargetGroup</code>.
     *         </p>
     */
    public String getTargetGroupName() {
        return targetGroupName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code>.
     * </p>
     *
     * @param targetGroupName <p>
     *            The identifier of the <code>DBProxyTargetGroup</code>.
     *            </p>
     */
    public void setTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
    }

    /**
     * <p>
     * The identifier of the <code>DBProxyTargetGroup</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetGroupName <p>
     *            The identifier of the <code>DBProxyTargetGroup</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDBProxyTargetsRequest withTargetGroupName(String targetGroupName) {
        this.targetGroupName = targetGroupName;
        return this;
    }

    /**
     * <p>
     * One or more DB instance identifiers.
     * </p>
     *
     * @return <p>
     *         One or more DB instance identifiers.
     *         </p>
     */
    public java.util.List<String> getDBInstanceIdentifiers() {
        return dBInstanceIdentifiers;
    }

    /**
     * <p>
     * One or more DB instance identifiers.
     * </p>
     *
     * @param dBInstanceIdentifiers <p>
     *            One or more DB instance identifiers.
     *            </p>
     */
    public void setDBInstanceIdentifiers(java.util.Collection<String> dBInstanceIdentifiers) {
        if (dBInstanceIdentifiers == null) {
            this.dBInstanceIdentifiers = null;
            return;
        }

        this.dBInstanceIdentifiers = new java.util.ArrayList<String>(dBInstanceIdentifiers);
    }

    /**
     * <p>
     * One or more DB instance identifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifiers <p>
     *            One or more DB instance identifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDBProxyTargetsRequest withDBInstanceIdentifiers(String... dBInstanceIdentifiers) {
        if (getDBInstanceIdentifiers() == null) {
            this.dBInstanceIdentifiers = new java.util.ArrayList<String>(
                    dBInstanceIdentifiers.length);
        }
        for (String value : dBInstanceIdentifiers) {
            this.dBInstanceIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more DB instance identifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifiers <p>
     *            One or more DB instance identifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDBProxyTargetsRequest withDBInstanceIdentifiers(
            java.util.Collection<String> dBInstanceIdentifiers) {
        setDBInstanceIdentifiers(dBInstanceIdentifiers);
        return this;
    }

    /**
     * <p>
     * One or more DB cluster identifiers.
     * </p>
     *
     * @return <p>
     *         One or more DB cluster identifiers.
     *         </p>
     */
    public java.util.List<String> getDBClusterIdentifiers() {
        return dBClusterIdentifiers;
    }

    /**
     * <p>
     * One or more DB cluster identifiers.
     * </p>
     *
     * @param dBClusterIdentifiers <p>
     *            One or more DB cluster identifiers.
     *            </p>
     */
    public void setDBClusterIdentifiers(java.util.Collection<String> dBClusterIdentifiers) {
        if (dBClusterIdentifiers == null) {
            this.dBClusterIdentifiers = null;
            return;
        }

        this.dBClusterIdentifiers = new java.util.ArrayList<String>(dBClusterIdentifiers);
    }

    /**
     * <p>
     * One or more DB cluster identifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifiers <p>
     *            One or more DB cluster identifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDBProxyTargetsRequest withDBClusterIdentifiers(String... dBClusterIdentifiers) {
        if (getDBClusterIdentifiers() == null) {
            this.dBClusterIdentifiers = new java.util.ArrayList<String>(dBClusterIdentifiers.length);
        }
        for (String value : dBClusterIdentifiers) {
            this.dBClusterIdentifiers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more DB cluster identifiers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifiers <p>
     *            One or more DB cluster identifiers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDBProxyTargetsRequest withDBClusterIdentifiers(
            java.util.Collection<String> dBClusterIdentifiers) {
        setDBClusterIdentifiers(dBClusterIdentifiers);
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
        if (getDBInstanceIdentifiers() != null)
            sb.append("DBInstanceIdentifiers: " + getDBInstanceIdentifiers() + ",");
        if (getDBClusterIdentifiers() != null)
            sb.append("DBClusterIdentifiers: " + getDBClusterIdentifiers());
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
        hashCode = prime
                * hashCode
                + ((getDBInstanceIdentifiers() == null) ? 0 : getDBInstanceIdentifiers().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterIdentifiers() == null) ? 0 : getDBClusterIdentifiers().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterDBProxyTargetsRequest == false)
            return false;
        RegisterDBProxyTargetsRequest other = (RegisterDBProxyTargetsRequest) obj;

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
        if (other.getDBInstanceIdentifiers() == null ^ this.getDBInstanceIdentifiers() == null)
            return false;
        if (other.getDBInstanceIdentifiers() != null
                && other.getDBInstanceIdentifiers().equals(this.getDBInstanceIdentifiers()) == false)
            return false;
        if (other.getDBClusterIdentifiers() == null ^ this.getDBClusterIdentifiers() == null)
            return false;
        if (other.getDBClusterIdentifiers() != null
                && other.getDBClusterIdentifiers().equals(this.getDBClusterIdentifiers()) == false)
            return false;
        return true;
    }
}
