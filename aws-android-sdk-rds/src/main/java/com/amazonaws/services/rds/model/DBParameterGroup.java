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
 * Contains the details of an Amazon RDS DB parameter group.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBParameterGroups</code> action.
 * </p>
 */
public class DBParameterGroup implements Serializable {
    /**
     * <p>
     * Provides the name of the DB parameter group.
     * </p>
     */
    private String dBParameterGroupName;

    /**
     * <p>
     * Provides the name of the DB parameter group family that this DB parameter
     * group is compatible with.
     * </p>
     */
    private String dBParameterGroupFamily;

    /**
     * <p>
     * Provides the customer-specified description for this DB parameter group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB parameter group.
     * </p>
     */
    private String dBParameterGroupArn;

    /**
     * <p>
     * Provides the name of the DB parameter group.
     * </p>
     *
     * @return <p>
     *         Provides the name of the DB parameter group.
     *         </p>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * <p>
     * Provides the name of the DB parameter group.
     * </p>
     *
     * @param dBParameterGroupName <p>
     *            Provides the name of the DB parameter group.
     *            </p>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * Provides the name of the DB parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupName <p>
     *            Provides the name of the DB parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBParameterGroup withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * <p>
     * Provides the name of the DB parameter group family that this DB parameter
     * group is compatible with.
     * </p>
     *
     * @return <p>
     *         Provides the name of the DB parameter group family that this DB
     *         parameter group is compatible with.
     *         </p>
     */
    public String getDBParameterGroupFamily() {
        return dBParameterGroupFamily;
    }

    /**
     * <p>
     * Provides the name of the DB parameter group family that this DB parameter
     * group is compatible with.
     * </p>
     *
     * @param dBParameterGroupFamily <p>
     *            Provides the name of the DB parameter group family that this
     *            DB parameter group is compatible with.
     *            </p>
     */
    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * Provides the name of the DB parameter group family that this DB parameter
     * group is compatible with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupFamily <p>
     *            Provides the name of the DB parameter group family that this
     *            DB parameter group is compatible with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBParameterGroup withDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
        return this;
    }

    /**
     * <p>
     * Provides the customer-specified description for this DB parameter group.
     * </p>
     *
     * @return <p>
     *         Provides the customer-specified description for this DB parameter
     *         group.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * Provides the customer-specified description for this DB parameter group.
     * </p>
     *
     * @param description <p>
     *            Provides the customer-specified description for this DB
     *            parameter group.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Provides the customer-specified description for this DB parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            Provides the customer-specified description for this DB
     *            parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBParameterGroup withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB parameter group.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the DB parameter group.
     *         </p>
     */
    public String getDBParameterGroupArn() {
        return dBParameterGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB parameter group.
     * </p>
     *
     * @param dBParameterGroupArn <p>
     *            The Amazon Resource Name (ARN) for the DB parameter group.
     *            </p>
     */
    public void setDBParameterGroupArn(String dBParameterGroupArn) {
        this.dBParameterGroupArn = dBParameterGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB parameter group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupArn <p>
     *            The Amazon Resource Name (ARN) for the DB parameter group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBParameterGroup withDBParameterGroupArn(String dBParameterGroupArn) {
        this.dBParameterGroupArn = dBParameterGroupArn;
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
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: " + getDBParameterGroupFamily() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getDBParameterGroupArn() != null)
            sb.append("DBParameterGroupArn: " + getDBParameterGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getDBParameterGroupArn() == null) ? 0 : getDBParameterGroupArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBParameterGroup == false)
            return false;
        DBParameterGroup other = (DBParameterGroup) obj;

        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null
                && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null
                && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDBParameterGroupArn() == null ^ this.getDBParameterGroupArn() == null)
            return false;
        if (other.getDBParameterGroupArn() != null
                && other.getDBParameterGroupArn().equals(this.getDBParameterGroupArn()) == false)
            return false;
        return true;
    }
}
