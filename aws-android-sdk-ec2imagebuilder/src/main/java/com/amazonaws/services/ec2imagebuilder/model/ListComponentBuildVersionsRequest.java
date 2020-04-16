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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns the list of component build versions for the specified semantic
 * version.
 * </p>
 */
public class ListComponentBuildVersionsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The component version Amazon Resource Name (ARN) whose versions you want
     * to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     */
    private String componentVersionArn;

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The component version Amazon Resource Name (ARN) whose versions you want
     * to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     *
     * @return <p>
     *         The component version Amazon Resource Name (ARN) whose versions
     *         you want to list.
     *         </p>
     */
    public String getComponentVersionArn() {
        return componentVersionArn;
    }

    /**
     * <p>
     * The component version Amazon Resource Name (ARN) whose versions you want
     * to list.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     *
     * @param componentVersionArn <p>
     *            The component version Amazon Resource Name (ARN) whose
     *            versions you want to list.
     *            </p>
     */
    public void setComponentVersionArn(String componentVersionArn) {
        this.componentVersionArn = componentVersionArn;
    }

    /**
     * <p>
     * The component version Amazon Resource Name (ARN) whose versions you want
     * to list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+$<br/>
     *
     * @param componentVersionArn <p>
     *            The component version Amazon Resource Name (ARN) whose
     *            versions you want to list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComponentBuildVersionsRequest withComponentVersionArn(String componentVersionArn) {
        this.componentVersionArn = componentVersionArn;
        return this;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @return <p>
     *         The maximum items to return in a request.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param maxResults <p>
     *            The maximum items to return in a request.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum items to return in a request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 25<br/>
     *
     * @param maxResults <p>
     *            The maximum items to return in a request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComponentBuildVersionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         A token to specify where to start paginating. This is the
     *         NextToken from a previously truncated response.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A token to specify where to start paginating. This is the
     *            NextToken from a previously truncated response.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to specify where to start paginating. This is the NextToken from
     * a previously truncated response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            A token to specify where to start paginating. This is the
     *            NextToken from a previously truncated response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComponentBuildVersionsRequest withNextToken(String nextToken) {
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
        if (getComponentVersionArn() != null)
            sb.append("componentVersionArn: " + getComponentVersionArn() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults() + ",");
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
                + ((getComponentVersionArn() == null) ? 0 : getComponentVersionArn().hashCode());
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

        if (obj instanceof ListComponentBuildVersionsRequest == false)
            return false;
        ListComponentBuildVersionsRequest other = (ListComponentBuildVersionsRequest) obj;

        if (other.getComponentVersionArn() == null ^ this.getComponentVersionArn() == null)
            return false;
        if (other.getComponentVersionArn() != null
                && other.getComponentVersionArn().equals(this.getComponentVersionArn()) == false)
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
