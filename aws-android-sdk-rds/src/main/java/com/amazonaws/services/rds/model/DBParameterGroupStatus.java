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

/**
 * <p>
 * The status of the DB parameter group.
 * </p>
 * <p>
 * This data type is used as a response element in the following actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>CreateDBInstance</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>CreateDBInstanceReadReplica</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DeleteDBInstance</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>ModifyDBInstance</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RebootDBInstance</code>
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>RestoreDBInstanceFromDBSnapshot</code>
 * </p>
 * </li>
 * </ul>
 */
public class DBParameterGroupStatus implements Serializable {
    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     */
    private String dBParameterGroupName;

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     */
    private String parameterApplyStatus;

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     *
     * @return <p>
     *         The name of the DB parameter group.
     *         </p>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group.
     *            </p>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBParameterGroupStatus withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     *
     * @return <p>
     *         The status of parameter updates.
     *         </p>
     */
    public String getParameterApplyStatus() {
        return parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     *
     * @param parameterApplyStatus <p>
     *            The status of parameter updates.
     *            </p>
     */
    public void setParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
    }

    /**
     * <p>
     * The status of parameter updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterApplyStatus <p>
     *            The status of parameter updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBParameterGroupStatus withParameterApplyStatus(String parameterApplyStatus) {
        this.parameterApplyStatus = parameterApplyStatus;
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
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: " + getDBParameterGroupName() + ",");
        if (getParameterApplyStatus() != null)
            sb.append("ParameterApplyStatus: " + getParameterApplyStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getParameterApplyStatus() == null) ? 0 : getParameterApplyStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBParameterGroupStatus == false)
            return false;
        DBParameterGroupStatus other = (DBParameterGroupStatus) obj;

        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null
                && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getParameterApplyStatus() == null ^ this.getParameterApplyStatus() == null)
            return false;
        if (other.getParameterApplyStatus() != null
                && other.getParameterApplyStatus().equals(this.getParameterApplyStatus()) == false)
            return false;
        return true;
    }
}
