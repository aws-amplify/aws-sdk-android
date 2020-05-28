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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

public class ListClustersResult implements Serializable {
    /**
     * 
     <p>
     * Information on each of the MSK clusters in the response.
     * </p>
     */
    private java.util.List<ClusterInfo> clusterInfoList;

    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListClusters operation
     * is truncated, the call returns NextToken in the response. To get another
     * batch of clusters, provide this token in your next request.
     * </p>
     */
    private String nextToken;

    /**
     * 
     <p>
     * Information on each of the MSK clusters in the response.
     * </p>
     * 
     * @return <p>
     *         Information on each of the MSK clusters in the response.
     *         </p>
     */
    public java.util.List<ClusterInfo> getClusterInfoList() {
        return clusterInfoList;
    }

    /**
     * 
     <p>
     * Information on each of the MSK clusters in the response.
     * </p>
     * 
     * @param clusterInfoList <p>
     *            Information on each of the MSK clusters in the response.
     *            </p>
     */
    public void setClusterInfoList(java.util.Collection<ClusterInfo> clusterInfoList) {
        if (clusterInfoList == null) {
            this.clusterInfoList = null;
            return;
        }

        this.clusterInfoList = new java.util.ArrayList<ClusterInfo>(clusterInfoList);
    }

    /**
     * 
     <p>
     * Information on each of the MSK clusters in the response.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterInfoList <p>
     *            Information on each of the MSK clusters in the response.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersResult withClusterInfoList(ClusterInfo... clusterInfoList) {
        if (getClusterInfoList() == null) {
            this.clusterInfoList = new java.util.ArrayList<ClusterInfo>(clusterInfoList.length);
        }
        for (ClusterInfo value : clusterInfoList) {
            this.clusterInfoList.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * Information on each of the MSK clusters in the response.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterInfoList <p>
     *            Information on each of the MSK clusters in the response.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersResult withClusterInfoList(java.util.Collection<ClusterInfo> clusterInfoList) {
        setClusterInfoList(clusterInfoList);
        return this;
    }

    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListClusters operation
     * is truncated, the call returns NextToken in the response. To get another
     * batch of clusters, provide this token in your next request.
     * </p>
     * 
     * @return <p>
     *         The paginated results marker. When the result of a ListClusters
     *         operation is truncated, the call returns NextToken in the
     *         response. To get another batch of clusters, provide this token in
     *         your next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListClusters operation
     * is truncated, the call returns NextToken in the response. To get another
     * batch of clusters, provide this token in your next request.
     * </p>
     * 
     * @param nextToken <p>
     *            The paginated results marker. When the result of a
     *            ListClusters operation is truncated, the call returns
     *            NextToken in the response. To get another batch of clusters,
     *            provide this token in your next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * 
     <p>
     * The paginated results marker. When the result of a ListClusters operation
     * is truncated, the call returns NextToken in the response. To get another
     * batch of clusters, provide this token in your next request.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The paginated results marker. When the result of a
     *            ListClusters operation is truncated, the call returns
     *            NextToken in the response. To get another batch of clusters,
     *            provide this token in your next request.
     *            </p> @return A reference to this updated object so that method calls can be
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
        if (getClusterInfoList() != null)
            sb.append("ClusterInfoList: " + getClusterInfoList() + ",");
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
                + ((getClusterInfoList() == null) ? 0 : getClusterInfoList().hashCode());
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

        if (other.getClusterInfoList() == null ^ this.getClusterInfoList() == null)
            return false;
        if (other.getClusterInfoList() != null
                && other.getClusterInfoList().equals(this.getClusterInfoList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
