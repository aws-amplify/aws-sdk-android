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

package com.amazonaws.services.amazonelasticfilesystem.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all tags for a top-level EFS resource. You must provide the ID of the
 * resource that you want to retrieve the tags for.
 * </p>
 * <p>
 * This operation requires permissions for the
 * <code>elasticfilesystem:DescribeAccessPoints</code> action.
 * </p>
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the EFS resource you want to retrieve tags for. You can
     * retrieve tags for EFS file systems and access points using this API
     * endpoint.
     * </p>
     */
    private String resourceId;

    /**
     * <p>
     * (Optional) Specifies the maximum number of tag objects to return in the
     * response. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * You can use <code>NextToken</code> in a subsequent request to fetch the
     * next page of access point descriptions if the response payload was
     * paginated.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the EFS resource you want to retrieve tags for. You can
     * retrieve tags for EFS file systems and access points using this API
     * endpoint.
     * </p>
     *
     * @return <p>
     *         Specifies the EFS resource you want to retrieve tags for. You can
     *         retrieve tags for EFS file systems and access points using this
     *         API endpoint.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * Specifies the EFS resource you want to retrieve tags for. You can
     * retrieve tags for EFS file systems and access points using this API
     * endpoint.
     * </p>
     *
     * @param resourceId <p>
     *            Specifies the EFS resource you want to retrieve tags for. You
     *            can retrieve tags for EFS file systems and access points using
     *            this API endpoint.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Specifies the EFS resource you want to retrieve tags for. You can
     * retrieve tags for EFS file systems and access points using this API
     * endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            Specifies the EFS resource you want to retrieve tags for. You
     *            can retrieve tags for EFS file systems and access points using
     *            this API endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies the maximum number of tag objects to return in the
     * response. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         (Optional) Specifies the maximum number of tag objects to return
     *         in the response. The default value is 100.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * (Optional) Specifies the maximum number of tag objects to return in the
     * response. The default value is 100.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            (Optional) Specifies the maximum number of tag objects to
     *            return in the response. The default value is 100.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) Specifies the maximum number of tag objects to return in the
     * response. The default value is 100.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxResults <p>
     *            (Optional) Specifies the maximum number of tag objects to
     *            return in the response. The default value is 100.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * You can use <code>NextToken</code> in a subsequent request to fetch the
     * next page of access point descriptions if the response payload was
     * paginated.
     * </p>
     *
     * @return <p>
     *         You can use <code>NextToken</code> in a subsequent request to
     *         fetch the next page of access point descriptions if the response
     *         payload was paginated.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * You can use <code>NextToken</code> in a subsequent request to fetch the
     * next page of access point descriptions if the response payload was
     * paginated.
     * </p>
     *
     * @param nextToken <p>
     *            You can use <code>NextToken</code> in a subsequent request to
     *            fetch the next page of access point descriptions if the
     *            response payload was paginated.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * You can use <code>NextToken</code> in a subsequent request to fetch the
     * next page of access point descriptions if the response payload was
     * paginated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            You can use <code>NextToken</code> in a subsequent request to
     *            fetch the next page of access point descriptions if the
     *            response payload was paginated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withNextToken(String nextToken) {
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
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
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

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;

        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
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
