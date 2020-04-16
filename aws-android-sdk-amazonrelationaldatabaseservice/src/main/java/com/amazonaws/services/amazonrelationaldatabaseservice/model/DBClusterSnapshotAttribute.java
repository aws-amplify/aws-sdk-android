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
 * Contains the name and values of a manual DB cluster snapshot attribute.
 * </p>
 * <p>
 * Manual DB cluster snapshot attributes are used to authorize other AWS
 * accounts to restore a manual DB cluster snapshot. For more information, see
 * the <code>ModifyDBClusterSnapshotAttribute</code> API action.
 * </p>
 */
public class DBClusterSnapshotAttribute implements Serializable {
    /**
     * <p>
     * The name of the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS
     * accounts that have permission to copy or restore the manual DB cluster
     * snapshot. For more information, see the
     * <code>ModifyDBClusterSnapshotAttribute</code> API action.
     * </p>
     */
    private String attributeName;

    /**
     * <p>
     * The value(s) for the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>,
     * then this element returns a list of IDs of the AWS accounts that are
     * authorized to copy or restore the manual DB cluster snapshot. If a value
     * of <code>all</code> is in the list, then the manual DB cluster snapshot
     * is public and available for any AWS account to copy or restore.
     * </p>
     */
    private java.util.List<String> attributeValues;

    /**
     * <p>
     * The name of the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS
     * accounts that have permission to copy or restore the manual DB cluster
     * snapshot. For more information, see the
     * <code>ModifyDBClusterSnapshotAttribute</code> API action.
     * </p>
     *
     * @return <p>
     *         The name of the manual DB cluster snapshot attribute.
     *         </p>
     *         <p>
     *         The attribute named <code>restore</code> refers to the list of
     *         AWS accounts that have permission to copy or restore the manual
     *         DB cluster snapshot. For more information, see the
     *         <code>ModifyDBClusterSnapshotAttribute</code> API action.
     *         </p>
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * <p>
     * The name of the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS
     * accounts that have permission to copy or restore the manual DB cluster
     * snapshot. For more information, see the
     * <code>ModifyDBClusterSnapshotAttribute</code> API action.
     * </p>
     *
     * @param attributeName <p>
     *            The name of the manual DB cluster snapshot attribute.
     *            </p>
     *            <p>
     *            The attribute named <code>restore</code> refers to the list of
     *            AWS accounts that have permission to copy or restore the
     *            manual DB cluster snapshot. For more information, see the
     *            <code>ModifyDBClusterSnapshotAttribute</code> API action.
     *            </p>
     */
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    /**
     * <p>
     * The name of the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * The attribute named <code>restore</code> refers to the list of AWS
     * accounts that have permission to copy or restore the manual DB cluster
     * snapshot. For more information, see the
     * <code>ModifyDBClusterSnapshotAttribute</code> API action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeName <p>
     *            The name of the manual DB cluster snapshot attribute.
     *            </p>
     *            <p>
     *            The attribute named <code>restore</code> refers to the list of
     *            AWS accounts that have permission to copy or restore the
     *            manual DB cluster snapshot. For more information, see the
     *            <code>ModifyDBClusterSnapshotAttribute</code> API action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshotAttribute withAttributeName(String attributeName) {
        this.attributeName = attributeName;
        return this;
    }

    /**
     * <p>
     * The value(s) for the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>,
     * then this element returns a list of IDs of the AWS accounts that are
     * authorized to copy or restore the manual DB cluster snapshot. If a value
     * of <code>all</code> is in the list, then the manual DB cluster snapshot
     * is public and available for any AWS account to copy or restore.
     * </p>
     *
     * @return <p>
     *         The value(s) for the manual DB cluster snapshot attribute.
     *         </p>
     *         <p>
     *         If the <code>AttributeName</code> field is set to
     *         <code>restore</code>, then this element returns a list of IDs of
     *         the AWS accounts that are authorized to copy or restore the
     *         manual DB cluster snapshot. If a value of <code>all</code> is in
     *         the list, then the manual DB cluster snapshot is public and
     *         available for any AWS account to copy or restore.
     *         </p>
     */
    public java.util.List<String> getAttributeValues() {
        return attributeValues;
    }

    /**
     * <p>
     * The value(s) for the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>,
     * then this element returns a list of IDs of the AWS accounts that are
     * authorized to copy or restore the manual DB cluster snapshot. If a value
     * of <code>all</code> is in the list, then the manual DB cluster snapshot
     * is public and available for any AWS account to copy or restore.
     * </p>
     *
     * @param attributeValues <p>
     *            The value(s) for the manual DB cluster snapshot attribute.
     *            </p>
     *            <p>
     *            If the <code>AttributeName</code> field is set to
     *            <code>restore</code>, then this element returns a list of IDs
     *            of the AWS accounts that are authorized to copy or restore the
     *            manual DB cluster snapshot. If a value of <code>all</code> is
     *            in the list, then the manual DB cluster snapshot is public and
     *            available for any AWS account to copy or restore.
     *            </p>
     */
    public void setAttributeValues(java.util.Collection<String> attributeValues) {
        if (attributeValues == null) {
            this.attributeValues = null;
            return;
        }

        this.attributeValues = new java.util.ArrayList<String>(attributeValues);
    }

    /**
     * <p>
     * The value(s) for the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>,
     * then this element returns a list of IDs of the AWS accounts that are
     * authorized to copy or restore the manual DB cluster snapshot. If a value
     * of <code>all</code> is in the list, then the manual DB cluster snapshot
     * is public and available for any AWS account to copy or restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeValues <p>
     *            The value(s) for the manual DB cluster snapshot attribute.
     *            </p>
     *            <p>
     *            If the <code>AttributeName</code> field is set to
     *            <code>restore</code>, then this element returns a list of IDs
     *            of the AWS accounts that are authorized to copy or restore the
     *            manual DB cluster snapshot. If a value of <code>all</code> is
     *            in the list, then the manual DB cluster snapshot is public and
     *            available for any AWS account to copy or restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshotAttribute withAttributeValues(String... attributeValues) {
        if (getAttributeValues() == null) {
            this.attributeValues = new java.util.ArrayList<String>(attributeValues.length);
        }
        for (String value : attributeValues) {
            this.attributeValues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The value(s) for the manual DB cluster snapshot attribute.
     * </p>
     * <p>
     * If the <code>AttributeName</code> field is set to <code>restore</code>,
     * then this element returns a list of IDs of the AWS accounts that are
     * authorized to copy or restore the manual DB cluster snapshot. If a value
     * of <code>all</code> is in the list, then the manual DB cluster snapshot
     * is public and available for any AWS account to copy or restore.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeValues <p>
     *            The value(s) for the manual DB cluster snapshot attribute.
     *            </p>
     *            <p>
     *            If the <code>AttributeName</code> field is set to
     *            <code>restore</code>, then this element returns a list of IDs
     *            of the AWS accounts that are authorized to copy or restore the
     *            manual DB cluster snapshot. If a value of <code>all</code> is
     *            in the list, then the manual DB cluster snapshot is public and
     *            available for any AWS account to copy or restore.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshotAttribute withAttributeValues(
            java.util.Collection<String> attributeValues) {
        setAttributeValues(attributeValues);
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
        if (getAttributeName() != null)
            sb.append("AttributeName: " + getAttributeName() + ",");
        if (getAttributeValues() != null)
            sb.append("AttributeValues: " + getAttributeValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttributeName() == null) ? 0 : getAttributeName().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeValues() == null) ? 0 : getAttributeValues().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBClusterSnapshotAttribute == false)
            return false;
        DBClusterSnapshotAttribute other = (DBClusterSnapshotAttribute) obj;

        if (other.getAttributeName() == null ^ this.getAttributeName() == null)
            return false;
        if (other.getAttributeName() != null
                && other.getAttributeName().equals(this.getAttributeName()) == false)
            return false;
        if (other.getAttributeValues() == null ^ this.getAttributeValues() == null)
            return false;
        if (other.getAttributeValues() != null
                && other.getAttributeValues().equals(this.getAttributeValues()) == false)
            return false;
        return true;
    }
}
