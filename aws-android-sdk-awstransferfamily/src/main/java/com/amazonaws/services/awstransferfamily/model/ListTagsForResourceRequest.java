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

package com.amazonaws.services.awstransferfamily.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists all of the tags associated with the Amazon Resource Number (ARN) you
 * specify. The resource can be a user, server, or role.
 * </p>
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Requests the tags associated with a particular Amazon Resource Name
     * (ARN). An ARN is an identifier for a specific AWS resource, such as a
     * server, user, or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     */
    private String arn;

    /**
     * <p>
     * Specifies the number of tags to return as a response to the
     * <code>ListTagsForResource</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * When you request additional results from the
     * <code>ListTagsForResource</code> operation, a <code>NextToken</code>
     * parameter is returned in the input. You can then pass in a subsequent
     * command to the <code>NextToken</code> parameter to continue listing
     * additional tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Requests the tags associated with a particular Amazon Resource Name
     * (ARN). An ARN is an identifier for a specific AWS resource, such as a
     * server, user, or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @return <p>
     *         Requests the tags associated with a particular Amazon Resource
     *         Name (ARN). An ARN is an identifier for a specific AWS resource,
     *         such as a server, user, or role.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * Requests the tags associated with a particular Amazon Resource Name
     * (ARN). An ARN is an identifier for a specific AWS resource, such as a
     * server, user, or role.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            Requests the tags associated with a particular Amazon Resource
     *            Name (ARN). An ARN is an identifier for a specific AWS
     *            resource, such as a server, user, or role.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Requests the tags associated with a particular Amazon Resource Name
     * (ARN). An ARN is an identifier for a specific AWS resource, such as a
     * server, user, or role.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            Requests the tags associated with a particular Amazon Resource
     *            Name (ARN). An ARN is an identifier for a specific AWS
     *            resource, such as a server, user, or role.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * Specifies the number of tags to return as a response to the
     * <code>ListTagsForResource</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         Specifies the number of tags to return as a response to the
     *         <code>ListTagsForResource</code> request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * Specifies the number of tags to return as a response to the
     * <code>ListTagsForResource</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            Specifies the number of tags to return as a response to the
     *            <code>ListTagsForResource</code> request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the number of tags to return as a response to the
     * <code>ListTagsForResource</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            Specifies the number of tags to return as a response to the
     *            <code>ListTagsForResource</code> request.
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
     * When you request additional results from the
     * <code>ListTagsForResource</code> operation, a <code>NextToken</code>
     * parameter is returned in the input. You can then pass in a subsequent
     * command to the <code>NextToken</code> parameter to continue listing
     * additional tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         When you request additional results from the
     *         <code>ListTagsForResource</code> operation, a
     *         <code>NextToken</code> parameter is returned in the input. You
     *         can then pass in a subsequent command to the
     *         <code>NextToken</code> parameter to continue listing additional
     *         tags.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * When you request additional results from the
     * <code>ListTagsForResource</code> operation, a <code>NextToken</code>
     * parameter is returned in the input. You can then pass in a subsequent
     * command to the <code>NextToken</code> parameter to continue listing
     * additional tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param nextToken <p>
     *            When you request additional results from the
     *            <code>ListTagsForResource</code> operation, a
     *            <code>NextToken</code> parameter is returned in the input. You
     *            can then pass in a subsequent command to the
     *            <code>NextToken</code> parameter to continue listing
     *            additional tags.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you request additional results from the
     * <code>ListTagsForResource</code> operation, a <code>NextToken</code>
     * parameter is returned in the input. You can then pass in a subsequent
     * command to the <code>NextToken</code> parameter to continue listing
     * additional tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param nextToken <p>
     *            When you request additional results from the
     *            <code>ListTagsForResource</code> operation, a
     *            <code>NextToken</code> parameter is returned in the input. You
     *            can then pass in a subsequent command to the
     *            <code>NextToken</code> parameter to continue listing
     *            additional tags.
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
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

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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
