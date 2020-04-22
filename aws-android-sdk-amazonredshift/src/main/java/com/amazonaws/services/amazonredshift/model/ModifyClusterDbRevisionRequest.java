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

package com.amazonaws.services.amazonredshift.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Modifies the database revision of a cluster. The database revision is a
 * unique revision of the database running in a cluster.
 * </p>
 */
public class ModifyClusterDbRevisionRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of a cluster whose database revision you want to
     * modify.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The identifier of the database revision. You can retrieve this value from
     * the response to the <a>DescribeClusterDbRevisions</a> request.
     * </p>
     */
    private String revisionTarget;

    /**
     * <p>
     * The unique identifier of a cluster whose database revision you want to
     * modify.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     *
     * @return <p>
     *         The unique identifier of a cluster whose database revision you
     *         want to modify.
     *         </p>
     *         <p>
     *         Example: <code>examplecluster</code>
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of a cluster whose database revision you want to
     * modify.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of a cluster whose database revision you
     *            want to modify.
     *            </p>
     *            <p>
     *            Example: <code>examplecluster</code>
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of a cluster whose database revision you want to
     * modify.
     * </p>
     * <p>
     * Example: <code>examplecluster</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of a cluster whose database revision you
     *            want to modify.
     *            </p>
     *            <p>
     *            Example: <code>examplecluster</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterDbRevisionRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the database revision. You can retrieve this value from
     * the response to the <a>DescribeClusterDbRevisions</a> request.
     * </p>
     *
     * @return <p>
     *         The identifier of the database revision. You can retrieve this
     *         value from the response to the <a>DescribeClusterDbRevisions</a>
     *         request.
     *         </p>
     */
    public String getRevisionTarget() {
        return revisionTarget;
    }

    /**
     * <p>
     * The identifier of the database revision. You can retrieve this value from
     * the response to the <a>DescribeClusterDbRevisions</a> request.
     * </p>
     *
     * @param revisionTarget <p>
     *            The identifier of the database revision. You can retrieve this
     *            value from the response to the
     *            <a>DescribeClusterDbRevisions</a> request.
     *            </p>
     */
    public void setRevisionTarget(String revisionTarget) {
        this.revisionTarget = revisionTarget;
    }

    /**
     * <p>
     * The identifier of the database revision. You can retrieve this value from
     * the response to the <a>DescribeClusterDbRevisions</a> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revisionTarget <p>
     *            The identifier of the database revision. You can retrieve this
     *            value from the response to the
     *            <a>DescribeClusterDbRevisions</a> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyClusterDbRevisionRequest withRevisionTarget(String revisionTarget) {
        this.revisionTarget = revisionTarget;
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
        if (getClusterIdentifier() != null)
            sb.append("ClusterIdentifier: " + getClusterIdentifier() + ",");
        if (getRevisionTarget() != null)
            sb.append("RevisionTarget: " + getRevisionTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getRevisionTarget() == null) ? 0 : getRevisionTarget().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyClusterDbRevisionRequest == false)
            return false;
        ModifyClusterDbRevisionRequest other = (ModifyClusterDbRevisionRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        if (other.getRevisionTarget() == null ^ this.getRevisionTarget() == null)
            return false;
        if (other.getRevisionTarget() != null
                && other.getRevisionTarget().equals(this.getRevisionTarget()) == false)
            return false;
        return true;
    }
}
