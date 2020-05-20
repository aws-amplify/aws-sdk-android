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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a list of tags for the resource identified by a specified Amazon
 * Resource Name (ARN). Tags are used to organize and categorize your CodeDeploy
 * resources.
 * </p>
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of a CodeDeploy resource. <code>ListTagsForResource</code>
     * returns all the tags associated with the resource that is identified by
     * the <code>ResourceArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * An identifier returned from the previous <code>ListTagsForResource</code>
     * call. It can be used to return the next set of applications in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of a CodeDeploy resource. <code>ListTagsForResource</code>
     * returns all the tags associated with the resource that is identified by
     * the <code>ResourceArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @return <p>
     *         The ARN of a CodeDeploy resource.
     *         <code>ListTagsForResource</code> returns all the tags associated
     *         with the resource that is identified by the
     *         <code>ResourceArn</code>.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of a CodeDeploy resource. <code>ListTagsForResource</code>
     * returns all the tags associated with the resource that is identified by
     * the <code>ResourceArn</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param resourceArn <p>
     *            The ARN of a CodeDeploy resource.
     *            <code>ListTagsForResource</code> returns all the tags
     *            associated with the resource that is identified by the
     *            <code>ResourceArn</code>.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of a CodeDeploy resource. <code>ListTagsForResource</code>
     * returns all the tags associated with the resource that is identified by
     * the <code>ResourceArn</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1011<br/>
     *
     * @param resourceArn <p>
     *            The ARN of a CodeDeploy resource.
     *            <code>ListTagsForResource</code> returns all the tags
     *            associated with the resource that is identified by the
     *            <code>ResourceArn</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * An identifier returned from the previous <code>ListTagsForResource</code>
     * call. It can be used to return the next set of applications in the list.
     * </p>
     *
     * @return <p>
     *         An identifier returned from the previous
     *         <code>ListTagsForResource</code> call. It can be used to return
     *         the next set of applications in the list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous <code>ListTagsForResource</code>
     * call. It can be used to return the next set of applications in the list.
     * </p>
     *
     * @param nextToken <p>
     *            An identifier returned from the previous
     *            <code>ListTagsForResource</code> call. It can be used to
     *            return the next set of applications in the list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An identifier returned from the previous <code>ListTagsForResource</code>
     * call. It can be used to return the next set of applications in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An identifier returned from the previous
     *            <code>ListTagsForResource</code> call. It can be used to
     *            return the next set of applications in the list.
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
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
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
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

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
