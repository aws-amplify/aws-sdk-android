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

public class ListClusterOperationsResult implements Serializable {
    /**
     * 
     <p>
     * An array of cluster operation information objects.
     * </p>
     */
    private java.util.List<ClusterOperationInfo> clusterOperationInfoList;

    /**
     * 
     <p>
     * If the response of ListClusterOperations is truncated, it returns a
     * NextToken in the response. This Nexttoken should be sent in the
     * subsequent request to ListClusterOperations.
     * </p>
     */
    private String nextToken;

    /**
     * 
     <p>
     * An array of cluster operation information objects.
     * </p>
     * 
     * @return <p>
     *         An array of cluster operation information objects.
     *         </p>
     */
    public java.util.List<ClusterOperationInfo> getClusterOperationInfoList() {
        return clusterOperationInfoList;
    }

    /**
     * 
     <p>
     * An array of cluster operation information objects.
     * </p>
     * 
     * @param clusterOperationInfoList <p>
     *            An array of cluster operation information objects.
     *            </p>
     */
    public void setClusterOperationInfoList(
            java.util.Collection<ClusterOperationInfo> clusterOperationInfoList) {
        if (clusterOperationInfoList == null) {
            this.clusterOperationInfoList = null;
            return;
        }

        this.clusterOperationInfoList = new java.util.ArrayList<ClusterOperationInfo>(
                clusterOperationInfoList);
    }

    /**
     * 
     <p>
     * An array of cluster operation information objects.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterOperationInfoList <p>
     *            An array of cluster operation information objects.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClusterOperationsResult withClusterOperationInfoList(
            ClusterOperationInfo... clusterOperationInfoList) {
        if (getClusterOperationInfoList() == null) {
            this.clusterOperationInfoList = new java.util.ArrayList<ClusterOperationInfo>(
                    clusterOperationInfoList.length);
        }
        for (ClusterOperationInfo value : clusterOperationInfoList) {
            this.clusterOperationInfoList.add(value);
        }
        return this;
    }

    /**
     * 
     <p>
     * An array of cluster operation information objects.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterOperationInfoList <p>
     *            An array of cluster operation information objects.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClusterOperationsResult withClusterOperationInfoList(
            java.util.Collection<ClusterOperationInfo> clusterOperationInfoList) {
        setClusterOperationInfoList(clusterOperationInfoList);
        return this;
    }

    /**
     * 
     <p>
     * If the response of ListClusterOperations is truncated, it returns a
     * NextToken in the response. This Nexttoken should be sent in the
     * subsequent request to ListClusterOperations.
     * </p>
     * 
     * @return <p>
     *         If the response of ListClusterOperations is truncated, it returns
     *         a NextToken in the response. This Nexttoken should be sent in the
     *         subsequent request to ListClusterOperations.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * 
     <p>
     * If the response of ListClusterOperations is truncated, it returns a
     * NextToken in the response. This Nexttoken should be sent in the
     * subsequent request to ListClusterOperations.
     * </p>
     * 
     * @param nextToken <p>
     *            If the response of ListClusterOperations is truncated, it
     *            returns a NextToken in the response. This Nexttoken should be
     *            sent in the subsequent request to ListClusterOperations.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * 
     <p>
     * If the response of ListClusterOperations is truncated, it returns a
     * NextToken in the response. This Nexttoken should be sent in the
     * subsequent request to ListClusterOperations.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If the response of ListClusterOperations is truncated, it
     *            returns a NextToken in the response. This Nexttoken should be
     *            sent in the subsequent request to ListClusterOperations.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClusterOperationsResult withNextToken(String nextToken) {
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
        if (getClusterOperationInfoList() != null)
            sb.append("ClusterOperationInfoList: " + getClusterOperationInfoList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClusterOperationInfoList() == null) ? 0 : getClusterOperationInfoList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClusterOperationsResult == false)
            return false;
        ListClusterOperationsResult other = (ListClusterOperationsResult) obj;

        if (other.getClusterOperationInfoList() == null
                ^ this.getClusterOperationInfoList() == null)
            return false;
        if (other.getClusterOperationInfoList() != null
                && other.getClusterOperationInfoList().equals(this.getClusterOperationInfoList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
