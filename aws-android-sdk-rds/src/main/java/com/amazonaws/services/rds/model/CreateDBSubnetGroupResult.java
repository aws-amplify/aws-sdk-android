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

public class CreateDBSubnetGroupResult implements Serializable {
    /**
     * <p>
     * Contains the details of an Amazon RDS DB subnet group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSubnetGroups</code> action.
     * </p>
     */
    private DBSubnetGroup dBSubnetGroup;

    /**
     * <p>
     * Contains the details of an Amazon RDS DB subnet group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSubnetGroups</code> action.
     * </p>
     *
     * @return <p>
     *         Contains the details of an Amazon RDS DB subnet group.
     *         </p>
     *         <p>
     *         This data type is used as a response element in the
     *         <code>DescribeDBSubnetGroups</code> action.
     *         </p>
     */
    public DBSubnetGroup getDBSubnetGroup() {
        return dBSubnetGroup;
    }

    /**
     * <p>
     * Contains the details of an Amazon RDS DB subnet group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSubnetGroups</code> action.
     * </p>
     *
     * @param dBSubnetGroup <p>
     *            Contains the details of an Amazon RDS DB subnet group.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBSubnetGroups</code> action.
     *            </p>
     */
    public void setDBSubnetGroup(DBSubnetGroup dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
    }

    /**
     * <p>
     * Contains the details of an Amazon RDS DB subnet group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSubnetGroups</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroup <p>
     *            Contains the details of an Amazon RDS DB subnet group.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBSubnetGroups</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBSubnetGroupResult withDBSubnetGroup(DBSubnetGroup dBSubnetGroup) {
        this.dBSubnetGroup = dBSubnetGroup;
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
        if (getDBSubnetGroup() != null)
            sb.append("DBSubnetGroup: " + getDBSubnetGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBSubnetGroup() == null) ? 0 : getDBSubnetGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBSubnetGroupResult == false)
            return false;
        CreateDBSubnetGroupResult other = (CreateDBSubnetGroupResult) obj;

        if (other.getDBSubnetGroup() == null ^ this.getDBSubnetGroup() == null)
            return false;
        if (other.getDBSubnetGroup() != null
                && other.getDBSubnetGroup().equals(this.getDBSubnetGroup()) == false)
            return false;
        return true;
    }
}
