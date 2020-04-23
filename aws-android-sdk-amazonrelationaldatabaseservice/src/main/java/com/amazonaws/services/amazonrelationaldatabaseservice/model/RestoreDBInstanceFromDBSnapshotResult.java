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

public class RestoreDBInstanceFromDBSnapshotResult implements Serializable {
    /**
     * <p>
     * Contains the details of an Amazon RDS DB instance.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBInstances</code> action.
     * </p>
     */
    private DBInstance dBInstance;

    /**
     * <p>
     * Contains the details of an Amazon RDS DB instance.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBInstances</code> action.
     * </p>
     *
     * @return <p>
     *         Contains the details of an Amazon RDS DB instance.
     *         </p>
     *         <p>
     *         This data type is used as a response element in the
     *         <code>DescribeDBInstances</code> action.
     *         </p>
     */
    public DBInstance getDBInstance() {
        return dBInstance;
    }

    /**
     * <p>
     * Contains the details of an Amazon RDS DB instance.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBInstances</code> action.
     * </p>
     *
     * @param dBInstance <p>
     *            Contains the details of an Amazon RDS DB instance.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBInstances</code> action.
     *            </p>
     */
    public void setDBInstance(DBInstance dBInstance) {
        this.dBInstance = dBInstance;
    }

    /**
     * <p>
     * Contains the details of an Amazon RDS DB instance.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBInstances</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstance <p>
     *            Contains the details of an Amazon RDS DB instance.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBInstances</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBInstanceFromDBSnapshotResult withDBInstance(DBInstance dBInstance) {
        this.dBInstance = dBInstance;
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
        if (getDBInstance() != null)
            sb.append("DBInstance: " + getDBInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstance() == null) ? 0 : getDBInstance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreDBInstanceFromDBSnapshotResult == false)
            return false;
        RestoreDBInstanceFromDBSnapshotResult other = (RestoreDBInstanceFromDBSnapshotResult) obj;

        if (other.getDBInstance() == null ^ this.getDBInstance() == null)
            return false;
        if (other.getDBInstance() != null
                && other.getDBInstance().equals(this.getDBInstance()) == false)
            return false;
        return true;
    }
}
