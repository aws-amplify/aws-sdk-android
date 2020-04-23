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
 * Contains the results of a successful call to the
 * <code>DescribeDBSnapshotAttributes</code> API action.
 * </p>
 * <p>
 * Manual DB snapshot attributes are used to authorize other AWS accounts to
 * copy or restore a manual DB snapshot. For more information, see the
 * <code>ModifyDBSnapshotAttribute</code> API action.
 * </p>
 */
public class DBSnapshotAttributesResult implements Serializable {
    /**
     * <p>
     * The identifier of the manual DB snapshot that the attributes apply to.
     * </p>
     */
    private String dBSnapshotIdentifier;

    /**
     * <p>
     * The list of attributes and values for the manual DB snapshot.
     * </p>
     */
    private java.util.List<DBSnapshotAttribute> dBSnapshotAttributes;

    /**
     * <p>
     * The identifier of the manual DB snapshot that the attributes apply to.
     * </p>
     *
     * @return <p>
     *         The identifier of the manual DB snapshot that the attributes
     *         apply to.
     *         </p>
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the manual DB snapshot that the attributes apply to.
     * </p>
     *
     * @param dBSnapshotIdentifier <p>
     *            The identifier of the manual DB snapshot that the attributes
     *            apply to.
     *            </p>
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the manual DB snapshot that the attributes apply to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshotIdentifier <p>
     *            The identifier of the manual DB snapshot that the attributes
     *            apply to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshotAttributesResult withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB snapshot.
     * </p>
     *
     * @return <p>
     *         The list of attributes and values for the manual DB snapshot.
     *         </p>
     */
    public java.util.List<DBSnapshotAttribute> getDBSnapshotAttributes() {
        return dBSnapshotAttributes;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB snapshot.
     * </p>
     *
     * @param dBSnapshotAttributes <p>
     *            The list of attributes and values for the manual DB snapshot.
     *            </p>
     */
    public void setDBSnapshotAttributes(
            java.util.Collection<DBSnapshotAttribute> dBSnapshotAttributes) {
        if (dBSnapshotAttributes == null) {
            this.dBSnapshotAttributes = null;
            return;
        }

        this.dBSnapshotAttributes = new java.util.ArrayList<DBSnapshotAttribute>(
                dBSnapshotAttributes);
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshotAttributes <p>
     *            The list of attributes and values for the manual DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshotAttributesResult withDBSnapshotAttributes(
            DBSnapshotAttribute... dBSnapshotAttributes) {
        if (getDBSnapshotAttributes() == null) {
            this.dBSnapshotAttributes = new java.util.ArrayList<DBSnapshotAttribute>(
                    dBSnapshotAttributes.length);
        }
        for (DBSnapshotAttribute value : dBSnapshotAttributes) {
            this.dBSnapshotAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of attributes and values for the manual DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshotAttributes <p>
     *            The list of attributes and values for the manual DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshotAttributesResult withDBSnapshotAttributes(
            java.util.Collection<DBSnapshotAttribute> dBSnapshotAttributes) {
        setDBSnapshotAttributes(dBSnapshotAttributes);
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
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() + ",");
        if (getDBSnapshotAttributes() != null)
            sb.append("DBSnapshotAttributes: " + getDBSnapshotAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDBSnapshotAttributes() == null) ? 0 : getDBSnapshotAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBSnapshotAttributesResult == false)
            return false;
        DBSnapshotAttributesResult other = (DBSnapshotAttributesResult) obj;

        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null
                && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getDBSnapshotAttributes() == null ^ this.getDBSnapshotAttributes() == null)
            return false;
        if (other.getDBSnapshotAttributes() != null
                && other.getDBSnapshotAttributes().equals(this.getDBSnapshotAttributes()) == false)
            return false;
        return true;
    }
}
