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
 * Returns a list of DB cluster snapshot attribute names and values for a manual
 * DB cluster snapshot.
 * </p>
 * <p>
 * When sharing snapshots with other AWS accounts,
 * <code>DescribeDBClusterSnapshotAttributes</code> returns the
 * <code>restore</code> attribute and a list of IDs for the AWS accounts that
 * are authorized to copy or restore the manual DB cluster snapshot. If
 * <code>all</code> is included in the list of values for the
 * <code>restore</code> attribute, then the manual DB cluster snapshot is public
 * and can be copied or restored by all AWS accounts.
 * </p>
 * <p>
 * To add or remove access for an AWS account to copy or restore a manual DB
 * cluster snapshot, or to make the manual DB cluster snapshot public or
 * private, use the <code>ModifyDBClusterSnapshotAttribute</code> API action.
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class DescribeDBClusterSnapshotAttributesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier for the DB cluster snapshot to describe the attributes
     * for.
     * </p>
     */
    private String dBClusterSnapshotIdentifier;

    /**
     * <p>
     * The identifier for the DB cluster snapshot to describe the attributes
     * for.
     * </p>
     *
     * @return <p>
     *         The identifier for the DB cluster snapshot to describe the
     *         attributes for.
     *         </p>
     */
    public String getDBClusterSnapshotIdentifier() {
        return dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB cluster snapshot to describe the attributes
     * for.
     * </p>
     *
     * @param dBClusterSnapshotIdentifier <p>
     *            The identifier for the DB cluster snapshot to describe the
     *            attributes for.
     *            </p>
     */
    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the DB cluster snapshot to describe the attributes
     * for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshotIdentifier <p>
     *            The identifier for the DB cluster snapshot to describe the
     *            attributes for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDBClusterSnapshotAttributesRequest withDBClusterSnapshotIdentifier(
            String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
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
            sb.append("DBClusterSnapshotIdentifier: " + getDBClusterSnapshotIdentifier());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBClusterSnapshotAttributesRequest == false)
            return false;
        DescribeDBClusterSnapshotAttributesRequest other = (DescribeDBClusterSnapshotAttributesRequest) obj;

        if (other.getDBClusterSnapshotIdentifier() == null
                ^ this.getDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDBClusterSnapshotIdentifier() != null
                && other.getDBClusterSnapshotIdentifier().equals(
                        this.getDBClusterSnapshotIdentifier()) == false)
            return false;
        return true;
    }
}
