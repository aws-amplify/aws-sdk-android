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
 * Deletes a DB subnet group.
 * </p>
 * <note>
 * <p>
 * The specified database subnet group must not be associated with any DB
 * instances.
 * </p>
 * </note>
 */
public class DeleteDBSubnetGroupRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the database subnet group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default subnet group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not
     * be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;

    /**
     * <p>
     * The name of the database subnet group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default subnet group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not
     * be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @return <p>
     *         The name of the database subnet group to delete.
     *         </p>
     *         <note>
     *         <p>
     *         You can't delete the default subnet group.
     *         </p>
     *         </note>
     *         <p>
     *         Constraints:
     *         </p>
     *         <p>
     *         Constraints: Must match the name of an existing DBSubnetGroup.
     *         Must not be default.
     *         </p>
     *         <p>
     *         Example: <code>mySubnetgroup</code>
     *         </p>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the database subnet group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default subnet group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not
     * be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @param dBSubnetGroupName <p>
     *            The name of the database subnet group to delete.
     *            </p>
     *            <note>
     *            <p>
     *            You can't delete the default subnet group.
     *            </p>
     *            </note>
     *            <p>
     *            Constraints:
     *            </p>
     *            <p>
     *            Constraints: Must match the name of an existing DBSubnetGroup.
     *            Must not be default.
     *            </p>
     *            <p>
     *            Example: <code>mySubnetgroup</code>
     *            </p>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The name of the database subnet group to delete.
     * </p>
     * <note>
     * <p>
     * You can't delete the default subnet group.
     * </p>
     * </note>
     * <p>
     * Constraints:
     * </p>
     * <p>
     * Constraints: Must match the name of an existing DBSubnetGroup. Must not
     * be default.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroupName <p>
     *            The name of the database subnet group to delete.
     *            </p>
     *            <note>
     *            <p>
     *            You can't delete the default subnet group.
     *            </p>
     *            </note>
     *            <p>
     *            Constraints:
     *            </p>
     *            <p>
     *            Constraints: Must match the name of an existing DBSubnetGroup.
     *            Must not be default.
     *            </p>
     *            <p>
     *            Example: <code>mySubnetgroup</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteDBSubnetGroupRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
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
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBSubnetGroupRequest == false)
            return false;
        DeleteDBSubnetGroupRequest other = (DeleteDBSubnetGroupRequest) obj;

        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null
                && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        return true;
    }
}
