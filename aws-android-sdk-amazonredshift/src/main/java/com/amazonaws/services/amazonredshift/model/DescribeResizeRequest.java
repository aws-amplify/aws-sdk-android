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
 * Returns information about the last resize operation for the specified
 * cluster. If no resize operation has ever been initiated for the specified
 * cluster, a <code>HTTP 404</code> error is returned. If a resize operation was
 * initiated and completed, the status of the resize remains as
 * <code>SUCCEEDED</code> until the next resize.
 * </p>
 * <p>
 * A resize operation can be requested using <a>ModifyCluster</a> and specifying
 * a different number or type of nodes for the cluster.
 * </p>
 */
public class DescribeResizeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier of a cluster whose resize progress you are
     * requesting. This parameter is case-sensitive.
     * </p>
     * <p>
     * By default, resize operations for all clusters defined for an AWS account
     * are returned.
     * </p>
     */
    private String clusterIdentifier;

    /**
     * <p>
     * The unique identifier of a cluster whose resize progress you are
     * requesting. This parameter is case-sensitive.
     * </p>
     * <p>
     * By default, resize operations for all clusters defined for an AWS account
     * are returned.
     * </p>
     *
     * @return <p>
     *         The unique identifier of a cluster whose resize progress you are
     *         requesting. This parameter is case-sensitive.
     *         </p>
     *         <p>
     *         By default, resize operations for all clusters defined for an AWS
     *         account are returned.
     *         </p>
     */
    public String getClusterIdentifier() {
        return clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of a cluster whose resize progress you are
     * requesting. This parameter is case-sensitive.
     * </p>
     * <p>
     * By default, resize operations for all clusters defined for an AWS account
     * are returned.
     * </p>
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of a cluster whose resize progress you
     *            are requesting. This parameter is case-sensitive.
     *            </p>
     *            <p>
     *            By default, resize operations for all clusters defined for an
     *            AWS account are returned.
     *            </p>
     */
    public void setClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
    }

    /**
     * <p>
     * The unique identifier of a cluster whose resize progress you are
     * requesting. This parameter is case-sensitive.
     * </p>
     * <p>
     * By default, resize operations for all clusters defined for an AWS account
     * are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterIdentifier <p>
     *            The unique identifier of a cluster whose resize progress you
     *            are requesting. This parameter is case-sensitive.
     *            </p>
     *            <p>
     *            By default, resize operations for all clusters defined for an
     *            AWS account are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeResizeRequest withClusterIdentifier(String clusterIdentifier) {
        this.clusterIdentifier = clusterIdentifier;
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
            sb.append("ClusterIdentifier: " + getClusterIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterIdentifier() == null) ? 0 : getClusterIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeResizeRequest == false)
            return false;
        DescribeResizeRequest other = (DescribeResizeRequest) obj;

        if (other.getClusterIdentifier() == null ^ this.getClusterIdentifier() == null)
            return false;
        if (other.getClusterIdentifier() != null
                && other.getClusterIdentifier().equals(this.getClusterIdentifier()) == false)
            return false;
        return true;
    }
}
