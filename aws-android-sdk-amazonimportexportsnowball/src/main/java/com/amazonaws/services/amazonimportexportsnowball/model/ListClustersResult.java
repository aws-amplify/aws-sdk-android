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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.io.Serializable;

public class ListClustersResult implements Serializable {
    /**
     * <p>
     * Each <code>ClusterListEntry</code> object contains a cluster's state, a
     * cluster's ID, and other important status information.
     * </p>
     */
    private java.util.List<ClusterListEntry> clusterListEntries;

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>ClusterListEntry</code>
     * call, your list of returned clusters will start from this point in the
     * array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * Each <code>ClusterListEntry</code> object contains a cluster's state, a
     * cluster's ID, and other important status information.
     * </p>
     *
     * @return <p>
     *         Each <code>ClusterListEntry</code> object contains a cluster's
     *         state, a cluster's ID, and other important status information.
     *         </p>
     */
    public java.util.List<ClusterListEntry> getClusterListEntries() {
        return clusterListEntries;
    }

    /**
     * <p>
     * Each <code>ClusterListEntry</code> object contains a cluster's state, a
     * cluster's ID, and other important status information.
     * </p>
     *
     * @param clusterListEntries <p>
     *            Each <code>ClusterListEntry</code> object contains a cluster's
     *            state, a cluster's ID, and other important status information.
     *            </p>
     */
    public void setClusterListEntries(java.util.Collection<ClusterListEntry> clusterListEntries) {
        if (clusterListEntries == null) {
            this.clusterListEntries = null;
            return;
        }

        this.clusterListEntries = new java.util.ArrayList<ClusterListEntry>(clusterListEntries);
    }

    /**
     * <p>
     * Each <code>ClusterListEntry</code> object contains a cluster's state, a
     * cluster's ID, and other important status information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterListEntries <p>
     *            Each <code>ClusterListEntry</code> object contains a cluster's
     *            state, a cluster's ID, and other important status information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersResult withClusterListEntries(ClusterListEntry... clusterListEntries) {
        if (getClusterListEntries() == null) {
            this.clusterListEntries = new java.util.ArrayList<ClusterListEntry>(
                    clusterListEntries.length);
        }
        for (ClusterListEntry value : clusterListEntries) {
            this.clusterListEntries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Each <code>ClusterListEntry</code> object contains a cluster's state, a
     * cluster's ID, and other important status information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterListEntries <p>
     *            Each <code>ClusterListEntry</code> object contains a cluster's
     *            state, a cluster's ID, and other important status information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersResult withClusterListEntries(
            java.util.Collection<ClusterListEntry> clusterListEntries) {
        setClusterListEntries(clusterListEntries);
        return this;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>ClusterListEntry</code>
     * call, your list of returned clusters will start from this point in the
     * array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         HTTP requests are stateless. If you use the automatically
     *         generated <code>NextToken</code> value in your next
     *         <code>ClusterListEntry</code> call, your list of returned
     *         clusters will start from this point in the array.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>ClusterListEntry</code>
     * call, your list of returned clusters will start from this point in the
     * array.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            HTTP requests are stateless. If you use the automatically
     *            generated <code>NextToken</code> value in your next
     *            <code>ClusterListEntry</code> call, your list of returned
     *            clusters will start from this point in the array.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. If you use the automatically generated
     * <code>NextToken</code> value in your next <code>ClusterListEntry</code>
     * call, your list of returned clusters will start from this point in the
     * array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            HTTP requests are stateless. If you use the automatically
     *            generated <code>NextToken</code> value in your next
     *            <code>ClusterListEntry</code> call, your list of returned
     *            clusters will start from this point in the array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getClusterListEntries() != null)
            sb.append("ClusterListEntries: " + getClusterListEntries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterListEntries() == null) ? 0 : getClusterListEntries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClustersResult == false)
            return false;
        ListClustersResult other = (ListClustersResult) obj;

        if (other.getClusterListEntries() == null ^ this.getClusterListEntries() == null)
            return false;
        if (other.getClusterListEntries() != null
                && other.getClusterListEntries().equals(this.getClusterListEntries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
