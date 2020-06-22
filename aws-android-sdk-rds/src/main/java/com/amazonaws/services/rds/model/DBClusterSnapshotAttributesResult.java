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
 * Contains the results of a successful call to the
 * <code>DescribeDBClusterSnapshotAttributes</code> API action.
 * </p>
 * <p>
 * Manual DB cluster snapshot attributes are used to authorize other AWS
 * accounts to copy or restore a manual DB cluster snapshot. For more
 * information, see the <code>ModifyDBClusterSnapshotAttribute</code> API
 * action.
 * </p>
 */
public class DBClusterSnapshotAttributesResult implements Serializable {
    /**
     * <p>
     * The identifier of the manual DB cluster snapshot that the attributes
     * apply to.
     * </p>
     */
    private String dBClusterSnapshotIdentifier;

    /**
     * <p>
     * The list of attributes and values for the manual DB cluster snapshot.
     * </p>
     */
    private java.util.List<DBClusterSnapshotAttribute> dBClusterSnapshotAttributes;

    /**
     * <p>
     * The identifier of the manual DB cluster snapshot that the attributes
     * apply to.
     * </p>
     *
     * @return <p>
     *         The identifier of the manual DB cluster snapshot that the
     *         attributes apply to.
     *         </p>
     */
    public String getDBClusterSnapshotIdentifier() {
        return dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the manual DB cluster snapshot that the attributes
     * apply to.
     * </p>
     *
     * @param dBClusterSnapshotIdentifier <p>
     *            The identifier of the manual DB cluster snapshot that the
     *            attributes apply to.
     *            </p>
     */
    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the manual DB cluster snapshot that the attributes
     * apply to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshotIdentifier <p>
     *            The identifier of the manual DB cluster snapshot that the
     *            attributes apply to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshotAttributesResult withDBClusterSnapshotIdentifier(
            String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB cluster snapshot.
     * </p>
     *
     * @return <p>
     *         The list of attributes and values for the manual DB cluster
     *         snapshot.
     *         </p>
     */
    public java.util.List<DBClusterSnapshotAttribute> getDBClusterSnapshotAttributes() {
        return dBClusterSnapshotAttributes;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB cluster snapshot.
     * </p>
     *
     * @param dBClusterSnapshotAttributes <p>
     *            The list of attributes and values for the manual DB cluster
     *            snapshot.
     *            </p>
     */
    public void setDBClusterSnapshotAttributes(
            java.util.Collection<DBClusterSnapshotAttribute> dBClusterSnapshotAttributes) {
        if (dBClusterSnapshotAttributes == null) {
            this.dBClusterSnapshotAttributes = null;
            return;
        }

        this.dBClusterSnapshotAttributes = new java.util.ArrayList<DBClusterSnapshotAttribute>(
                dBClusterSnapshotAttributes);
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshotAttributes <p>
     *            The list of attributes and values for the manual DB cluster
     *            snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshotAttributesResult withDBClusterSnapshotAttributes(
            DBClusterSnapshotAttribute... dBClusterSnapshotAttributes) {
        if (getDBClusterSnapshotAttributes() == null) {
            this.dBClusterSnapshotAttributes = new java.util.ArrayList<DBClusterSnapshotAttribute>(
                    dBClusterSnapshotAttributes.length);
        }
        for (DBClusterSnapshotAttribute value : dBClusterSnapshotAttributes) {
            this.dBClusterSnapshotAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshotAttributes <p>
     *            The list of attributes and values for the manual DB cluster
     *            snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshotAttributesResult withDBClusterSnapshotAttributes(
            java.util.Collection<DBClusterSnapshotAttribute> dBClusterSnapshotAttributes) {
        setDBClusterSnapshotAttributes(dBClusterSnapshotAttributes);
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
        if (getDBClusterSnapshotIdentifier() != null)
            sb.append("DBClusterSnapshotIdentifier: " + getDBClusterSnapshotIdentifier() + ",");
        if (getDBClusterSnapshotAttributes() != null)
            sb.append("DBClusterSnapshotAttributes: " + getDBClusterSnapshotAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDBClusterSnapshotIdentifier() == null) ? 0
                        : getDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterSnapshotAttributes() == null) ? 0
                        : getDBClusterSnapshotAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterSnapshotAttributesResult == false)
            return false;
        DBClusterSnapshotAttributesResult other = (DBClusterSnapshotAttributesResult) obj;

        if (other.getDBClusterSnapshotIdentifier() == null
                ^ this.getDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDBClusterSnapshotIdentifier() != null
                && other.getDBClusterSnapshotIdentifier().equals(
                        this.getDBClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getDBClusterSnapshotAttributes() == null
                ^ this.getDBClusterSnapshotAttributes() == null)
            return false;
        if (other.getDBClusterSnapshotAttributes() != null
                && other.getDBClusterSnapshotAttributes().equals(
                        this.getDBClusterSnapshotAttributes()) == false)
            return false;
        return true;
    }
}
