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

package com.amazonaws.services.athena.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the tags associated with an Athena workgroup or data catalog resource.
 * </p>
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Lists the tags for the resource with the specified ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     */
    private String resourceARN;

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results for this request, where the request lists the tags for the
     * resource with the specified ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to be returned per request that lists the
     * tags for the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>75 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Lists the tags for the resource with the specified ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @return <p>
     *         Lists the tags for the resource with the specified ARN.
     *         </p>
     */
    public String getResourceARN() {
        return resourceARN;
    }

    /**
     * <p>
     * Lists the tags for the resource with the specified ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param resourceARN <p>
     *            Lists the tags for the resource with the specified ARN.
     *            </p>
     */
    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * Lists the tags for the resource with the specified ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param resourceARN <p>
     *            Lists the tags for the resource with the specified ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results for this request, where the request lists the tags for the
     * resource with the specified ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The token for the next set of results, or null if there are no
     *         additional results for this request, where the request lists the
     *         tags for the resource with the specified ARN.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results for this request, where the request lists the tags for the
     * resource with the specified ARN.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            additional results for this request, where the request lists
     *            the tags for the resource with the specified ARN.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional
     * results for this request, where the request lists the tags for the
     * resource with the specified ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            additional results for this request, where the request lists
     *            the tags for the resource with the specified ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request that lists the
     * tags for the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>75 - <br/>
     *
     * @return <p>
     *         The maximum number of results to be returned per request that
     *         lists the tags for the resource.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request that lists the
     * tags for the resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>75 - <br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned per request that
     *            lists the tags for the resource.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request that lists the
     * tags for the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>75 - <br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to be returned per request that
     *            lists the tags for the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: " + getResourceARN() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;

        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null
                && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
