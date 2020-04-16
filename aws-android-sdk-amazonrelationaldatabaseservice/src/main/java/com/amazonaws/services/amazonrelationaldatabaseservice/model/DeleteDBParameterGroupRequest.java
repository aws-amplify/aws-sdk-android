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
 * <p>
 * Deletes a specified DB parameter group. The DB parameter group to be deleted
 * can't be associated with any DB instances.
 * </p>
 */
public class DeleteDBParameterGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the name of an existing DB parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't delete a default DB parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be associated with any DB instances
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupName;

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the name of an existing DB parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't delete a default DB parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be associated with any DB instances
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the DB parameter group.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be the name of an existing DB parameter group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can't delete a default DB parameter group
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be associated with any DB instances
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the name of an existing DB parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't delete a default DB parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be associated with any DB instances
     * </p>
     * </li>
     * </ul>
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be the name of an existing DB parameter group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can't delete a default DB parameter group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be associated with any DB instances
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be the name of an existing DB parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * You can't delete a default DB parameter group
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be associated with any DB instances
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be the name of an existing DB parameter group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can't delete a default DB parameter group
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be associated with any DB instances
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
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
            sb.append("DBParameterGroupName: " + getDBParameterGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBParameterGroupRequest == false)
            return false;
        DeleteDBParameterGroupRequest other = (DeleteDBParameterGroupRequest) obj;

        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null
                && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        return true;
    }
}
