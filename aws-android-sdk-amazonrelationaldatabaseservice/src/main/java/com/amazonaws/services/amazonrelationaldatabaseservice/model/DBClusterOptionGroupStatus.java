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
 * <p>
 * Contains status information for a DB cluster option group.
 * </p>
 */
public class DBClusterOptionGroupStatus implements Serializable {
    /**
     * <p>
     * Specifies the name of the DB cluster option group.
     * </p>
     */
    private String dBClusterOptionGroupName;

    /**
     * <p>
     * Specifies the status of the DB cluster option group.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies the name of the DB cluster option group.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the DB cluster option group.
     *         </p>
     */
    public String getDBClusterOptionGroupName() {
        return dBClusterOptionGroupName;
    }

    /**
     * <p>
     * Specifies the name of the DB cluster option group.
     * </p>
     *
     * @param dBClusterOptionGroupName <p>
     *            Specifies the name of the DB cluster option group.
     *            </p>
     */
    public void setDBClusterOptionGroupName(String dBClusterOptionGroupName) {
        this.dBClusterOptionGroupName = dBClusterOptionGroupName;
    }

    /**
     * <p>
     * Specifies the name of the DB cluster option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterOptionGroupName <p>
     *            Specifies the name of the DB cluster option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterOptionGroupStatus withDBClusterOptionGroupName(String dBClusterOptionGroupName) {
        this.dBClusterOptionGroupName = dBClusterOptionGroupName;
        return this;
    }

    /**
     * <p>
     * Specifies the status of the DB cluster option group.
     * </p>
     *
     * @return <p>
     *         Specifies the status of the DB cluster option group.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the status of the DB cluster option group.
     * </p>
     *
     * @param status <p>
     *            Specifies the status of the DB cluster option group.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the DB cluster option group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Specifies the status of the DB cluster option group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterOptionGroupStatus withStatus(String status) {
        this.status = status;
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
        if (getDBClusterOptionGroupName() != null)
            sb.append("DBClusterOptionGroupName: " + getDBClusterOptionGroupName() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterOptionGroupName() == null) ? 0 : getDBClusterOptionGroupName()
                        .hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterOptionGroupStatus == false)
            return false;
        DBClusterOptionGroupStatus other = (DBClusterOptionGroupStatus) obj;

        if (other.getDBClusterOptionGroupName() == null
                ^ this.getDBClusterOptionGroupName() == null)
            return false;
        if (other.getDBClusterOptionGroupName() != null
                && other.getDBClusterOptionGroupName().equals(this.getDBClusterOptionGroupName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
