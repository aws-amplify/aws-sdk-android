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

public class CopyDBParameterGroupResult implements Serializable {
    /**
     * <p>
     * Contains the details of an Amazon RDS DB parameter group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBParameterGroups</code> action.
     * </p>
     */
    private DBParameterGroup dBParameterGroup;

    /**
     * <p>
     * Contains the details of an Amazon RDS DB parameter group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBParameterGroups</code> action.
     * </p>
     *
     * @return <p>
     *         Contains the details of an Amazon RDS DB parameter group.
     *         </p>
     *         <p>
     *         This data type is used as a response element in the
     *         <code>DescribeDBParameterGroups</code> action.
     *         </p>
     */
    public DBParameterGroup getDBParameterGroup() {
        return dBParameterGroup;
    }

    /**
     * <p>
     * Contains the details of an Amazon RDS DB parameter group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBParameterGroups</code> action.
     * </p>
     *
     * @param dBParameterGroup <p>
     *            Contains the details of an Amazon RDS DB parameter group.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBParameterGroups</code> action.
     *            </p>
     */
    public void setDBParameterGroup(DBParameterGroup dBParameterGroup) {
        this.dBParameterGroup = dBParameterGroup;
    }

    /**
     * <p>
     * Contains the details of an Amazon RDS DB parameter group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBParameterGroups</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroup <p>
     *            Contains the details of an Amazon RDS DB parameter group.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBParameterGroups</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBParameterGroupResult withDBParameterGroup(DBParameterGroup dBParameterGroup) {
        this.dBParameterGroup = dBParameterGroup;
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
        if (getDBParameterGroup() != null)
            sb.append("DBParameterGroup: " + getDBParameterGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBParameterGroup() == null) ? 0 : getDBParameterGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyDBParameterGroupResult == false)
            return false;
        CopyDBParameterGroupResult other = (CopyDBParameterGroupResult) obj;

        if (other.getDBParameterGroup() == null ^ this.getDBParameterGroup() == null)
            return false;
        if (other.getDBParameterGroup() != null
                && other.getDBParameterGroup().equals(this.getDBParameterGroup()) == false)
            return false;
        return true;
    }
}
