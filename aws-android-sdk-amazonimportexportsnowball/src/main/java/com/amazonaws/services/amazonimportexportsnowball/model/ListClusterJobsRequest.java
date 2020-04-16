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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns an array of <code>JobListEntry</code> objects of the specified
 * length. Each <code>JobListEntry</code> object is for a job in the specified
 * cluster and contains a job's state, a job's ID, and other information.
 * </p>
 */
public class ListClusterJobsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>CID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     */
    private String clusterId;

    /**
     * <p>
     * The number of <code>JobListEntry</code> objects to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the
     * list of <code>JobListEntry</code> objects, you have the option of
     * specifying <code>NextToken</code> as the starting point for your returned
     * list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>CID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @return <p>
     *         The 39-character ID for the cluster that you want to list, for
     *         example <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>CID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param clusterId <p>
     *            The 39-character ID for the cluster that you want to list, for
     *            example <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The 39-character ID for the cluster that you want to list, for example
     * <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>39 - 39<br/>
     * <b>Pattern:
     * </b>CID[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}<br/>
     *
     * @param clusterId <p>
     *            The 39-character ID for the cluster that you want to list, for
     *            example <code>CID123e4567-e89b-12d3-a456-426655440000</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClusterJobsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * The number of <code>JobListEntry</code> objects to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The number of <code>JobListEntry</code> objects to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The number of <code>JobListEntry</code> objects to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param maxResults <p>
     *            The number of <code>JobListEntry</code> objects to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of <code>JobListEntry</code> objects to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param maxResults <p>
     *            The number of <code>JobListEntry</code> objects to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClusterJobsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the
     * list of <code>JobListEntry</code> objects, you have the option of
     * specifying <code>NextToken</code> as the starting point for your returned
     * list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         HTTP requests are stateless. To identify what object comes "next"
     *         in the list of <code>JobListEntry</code> objects, you have the
     *         option of specifying <code>NextToken</code> as the starting point
     *         for your returned list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the
     * list of <code>JobListEntry</code> objects, you have the option of
     * specifying <code>NextToken</code> as the starting point for your returned
     * list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            HTTP requests are stateless. To identify what object comes
     *            "next" in the list of <code>JobListEntry</code> objects, you
     *            have the option of specifying <code>NextToken</code> as the
     *            starting point for your returned list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * HTTP requests are stateless. To identify what object comes "next" in the
     * list of <code>JobListEntry</code> objects, you have the option of
     * specifying <code>NextToken</code> as the starting point for your returned
     * list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            HTTP requests are stateless. To identify what object comes
     *            "next" in the list of <code>JobListEntry</code> objects, you
     *            have the option of specifying <code>NextToken</code> as the
     *            starting point for your returned list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListClusterJobsRequest withNextToken(String nextToken) {
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
        if (getClusterId() != null)
            sb.append("ClusterId: " + getClusterId() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListClusterJobsRequest == false)
            return false;
        ListClusterJobsRequest other = (ListClusterJobsRequest) obj;

        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
