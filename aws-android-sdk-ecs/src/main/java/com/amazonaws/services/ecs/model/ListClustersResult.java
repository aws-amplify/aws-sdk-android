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

package com.amazonaws.services.ecs.model;

import java.io.Serializable;

public class ListClustersResult implements Serializable {
    /**
     * <p>
     * The list of full Amazon Resource Name (ARN) entries for each cluster
     * associated with your account.
     * </p>
     */
    private java.util.List<String> clusterArns;

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListClusters</code> request. When the results of a
     * <code>ListClusters</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of full Amazon Resource Name (ARN) entries for each cluster
     * associated with your account.
     * </p>
     *
     * @return <p>
     *         The list of full Amazon Resource Name (ARN) entries for each
     *         cluster associated with your account.
     *         </p>
     */
    public java.util.List<String> getClusterArns() {
        return clusterArns;
    }

    /**
     * <p>
     * The list of full Amazon Resource Name (ARN) entries for each cluster
     * associated with your account.
     * </p>
     *
     * @param clusterArns <p>
     *            The list of full Amazon Resource Name (ARN) entries for each
     *            cluster associated with your account.
     *            </p>
     */
    public void setClusterArns(java.util.Collection<String> clusterArns) {
        if (clusterArns == null) {
            this.clusterArns = null;
            return;
        }

        this.clusterArns = new java.util.ArrayList<String>(clusterArns);
    }

    /**
     * <p>
     * The list of full Amazon Resource Name (ARN) entries for each cluster
     * associated with your account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArns <p>
     *            The list of full Amazon Resource Name (ARN) entries for each
     *            cluster associated with your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersResult withClusterArns(String... clusterArns) {
        if (getClusterArns() == null) {
            this.clusterArns = new java.util.ArrayList<String>(clusterArns.length);
        }
        for (String value : clusterArns) {
            this.clusterArns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of full Amazon Resource Name (ARN) entries for each cluster
     * associated with your account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterArns <p>
     *            The list of full Amazon Resource Name (ARN) entries for each
     *            cluster associated with your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClustersResult withClusterArns(java.util.Collection<String> clusterArns) {
        setClusterArns(clusterArns);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListClusters</code> request. When the results of a
     * <code>ListClusters</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The <code>nextToken</code> value to include in a future
     *         <code>ListClusters</code> request. When the results of a
     *         <code>ListClusters</code> request exceed <code>maxResults</code>,
     *         this value can be used to retrieve the next page of results. This
     *         value is <code>null</code> when there are no more results to
     *         return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListClusters</code> request. When the results of a
     * <code>ListClusters</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListClusters</code> request. When the results of a
     *            <code>ListClusters</code> request exceed
     *            <code>maxResults</code>, this value can be used to retrieve
     *            the next page of results. This value is <code>null</code> when
     *            there are no more results to return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> value to include in a future
     * <code>ListClusters</code> request. When the results of a
     * <code>ListClusters</code> request exceed <code>maxResults</code>, this
     * value can be used to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The <code>nextToken</code> value to include in a future
     *            <code>ListClusters</code> request. When the results of a
     *            <code>ListClusters</code> request exceed
     *            <code>maxResults</code>, this value can be used to retrieve
     *            the next page of results. This value is <code>null</code> when
     *            there are no more results to return.
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
        if (getClusterArns() != null)
            sb.append("clusterArns: " + getClusterArns() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClusterArns() == null) ? 0 : getClusterArns().hashCode());
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

        if (other.getClusterArns() == null ^ this.getClusterArns() == null)
            return false;
        if (other.getClusterArns() != null
                && other.getClusterArns().equals(this.getClusterArns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
