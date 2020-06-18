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

public class CreateDBSecurityGroupResult implements Serializable {
    /**
     * <p>
     * Contains the details for an Amazon RDS DB security group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSecurityGroups</code> action.
     * </p>
     */
    private DBSecurityGroup dBSecurityGroup;

    /**
     * <p>
     * Contains the details for an Amazon RDS DB security group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSecurityGroups</code> action.
     * </p>
     *
     * @return <p>
     *         Contains the details for an Amazon RDS DB security group.
     *         </p>
     *         <p>
     *         This data type is used as a response element in the
     *         <code>DescribeDBSecurityGroups</code> action.
     *         </p>
     */
    public DBSecurityGroup getDBSecurityGroup() {
        return dBSecurityGroup;
    }

    /**
     * <p>
     * Contains the details for an Amazon RDS DB security group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSecurityGroups</code> action.
     * </p>
     *
     * @param dBSecurityGroup <p>
     *            Contains the details for an Amazon RDS DB security group.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBSecurityGroups</code> action.
     *            </p>
     */
    public void setDBSecurityGroup(DBSecurityGroup dBSecurityGroup) {
        this.dBSecurityGroup = dBSecurityGroup;
    }

    /**
     * <p>
     * Contains the details for an Amazon RDS DB security group.
     * </p>
     * <p>
     * This data type is used as a response element in the
     * <code>DescribeDBSecurityGroups</code> action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSecurityGroup <p>
     *            Contains the details for an Amazon RDS DB security group.
     *            </p>
     *            <p>
     *            This data type is used as a response element in the
     *            <code>DescribeDBSecurityGroups</code> action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBSecurityGroupResult withDBSecurityGroup(DBSecurityGroup dBSecurityGroup) {
        this.dBSecurityGroup = dBSecurityGroup;
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
        if (getDBSecurityGroup() != null)
            sb.append("DBSecurityGroup: " + getDBSecurityGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBSecurityGroup() == null) ? 0 : getDBSecurityGroup().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBSecurityGroupResult == false)
            return false;
        CreateDBSecurityGroupResult other = (CreateDBSecurityGroupResult) obj;

        if (other.getDBSecurityGroup() == null ^ this.getDBSecurityGroup() == null)
            return false;
        if (other.getDBSecurityGroup() != null
                && other.getDBSecurityGroup().equals(this.getDBSecurityGroup()) == false)
            return false;
        return true;
    }
}
