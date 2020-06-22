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

public class ModifyDBSnapshotAttributeResult implements Serializable {
    /**
     * <p>
     * Contains the results of a successful call to the
     * <code>DescribeDBSnapshotAttributes</code> API action.
     * </p>
     * <p>
     * Manual DB snapshot attributes are used to authorize other AWS accounts to
     * copy or restore a manual DB snapshot. For more information, see the
     * <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     */
    private DBSnapshotAttributesResult dBSnapshotAttributesResult;

    /**
     * <p>
     * Contains the results of a successful call to the
     * <code>DescribeDBSnapshotAttributes</code> API action.
     * </p>
     * <p>
     * Manual DB snapshot attributes are used to authorize other AWS accounts to
     * copy or restore a manual DB snapshot. For more information, see the
     * <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     *
     * @return <p>
     *         Contains the results of a successful call to the
     *         <code>DescribeDBSnapshotAttributes</code> API action.
     *         </p>
     *         <p>
     *         Manual DB snapshot attributes are used to authorize other AWS
     *         accounts to copy or restore a manual DB snapshot. For more
     *         information, see the <code>ModifyDBSnapshotAttribute</code> API
     *         action.
     *         </p>
     */
    public DBSnapshotAttributesResult getDBSnapshotAttributesResult() {
        return dBSnapshotAttributesResult;
    }

    /**
     * <p>
     * Contains the results of a successful call to the
     * <code>DescribeDBSnapshotAttributes</code> API action.
     * </p>
     * <p>
     * Manual DB snapshot attributes are used to authorize other AWS accounts to
     * copy or restore a manual DB snapshot. For more information, see the
     * <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     *
     * @param dBSnapshotAttributesResult <p>
     *            Contains the results of a successful call to the
     *            <code>DescribeDBSnapshotAttributes</code> API action.
     *            </p>
     *            <p>
     *            Manual DB snapshot attributes are used to authorize other AWS
     *            accounts to copy or restore a manual DB snapshot. For more
     *            information, see the <code>ModifyDBSnapshotAttribute</code>
     *            API action.
     *            </p>
     */
    public void setDBSnapshotAttributesResult(DBSnapshotAttributesResult dBSnapshotAttributesResult) {
        this.dBSnapshotAttributesResult = dBSnapshotAttributesResult;
    }

    /**
     * <p>
     * Contains the results of a successful call to the
     * <code>DescribeDBSnapshotAttributes</code> API action.
     * </p>
     * <p>
     * Manual DB snapshot attributes are used to authorize other AWS accounts to
     * copy or restore a manual DB snapshot. For more information, see the
     * <code>ModifyDBSnapshotAttribute</code> API action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshotAttributesResult <p>
     *            Contains the results of a successful call to the
     *            <code>DescribeDBSnapshotAttributes</code> API action.
     *            </p>
     *            <p>
     *            Manual DB snapshot attributes are used to authorize other AWS
     *            accounts to copy or restore a manual DB snapshot. For more
     *            information, see the <code>ModifyDBSnapshotAttribute</code>
     *            API action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBSnapshotAttributeResult withDBSnapshotAttributesResult(
            DBSnapshotAttributesResult dBSnapshotAttributesResult) {
        this.dBSnapshotAttributesResult = dBSnapshotAttributesResult;
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
        if (getDBSnapshotAttributesResult() != null)
            sb.append("DBSnapshotAttributesResult: " + getDBSnapshotAttributesResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBSnapshotAttributesResult() == null) ? 0 : getDBSnapshotAttributesResult()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBSnapshotAttributeResult == false)
            return false;
        ModifyDBSnapshotAttributeResult other = (ModifyDBSnapshotAttributeResult) obj;

        if (other.getDBSnapshotAttributesResult() == null
                ^ this.getDBSnapshotAttributesResult() == null)
            return false;
        if (other.getDBSnapshotAttributesResult() != null
                && other.getDBSnapshotAttributesResult().equals(
                        this.getDBSnapshotAttributesResult()) == false)
            return false;
        return true;
    }
}
