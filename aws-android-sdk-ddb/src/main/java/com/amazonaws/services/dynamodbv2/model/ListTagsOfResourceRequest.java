/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * List all tags on an Amazon DynamoDB resource. You can call ListTagsOfResource
 * up to 10 times per second, per account.
 * </p>
 * <p>
 * For an overview on tagging DynamoDB resources, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html"
 * >Tagging for DynamoDB</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 */
public class ListTagsOfResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon DynamoDB resource with tags to be listed. This value is an
     * Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a
     * previous call to ListTagOfResource. When provided in this manner, this
     * API fetches the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon DynamoDB resource with tags to be listed. This value is an
     * Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     *
     * @return <p>
     *         The Amazon DynamoDB resource with tags to be listed. This value
     *         is an Amazon Resource Name (ARN).
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon DynamoDB resource with tags to be listed. This value is an
     * Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     *
     * @param resourceArn <p>
     *            The Amazon DynamoDB resource with tags to be listed. This
     *            value is an Amazon Resource Name (ARN).
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon DynamoDB resource with tags to be listed. This value is an
     * Amazon Resource Name (ARN).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1283<br/>
     *
     * @param resourceArn <p>
     *            The Amazon DynamoDB resource with tags to be listed. This
     *            value is an Amazon Resource Name (ARN).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsOfResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a
     * previous call to ListTagOfResource. When provided in this manner, this
     * API fetches the next page of results.
     * </p>
     *
     * @return <p>
     *         An optional string that, if supplied, must be copied from the
     *         output of a previous call to ListTagOfResource. When provided in
     *         this manner, this API fetches the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a
     * previous call to ListTagOfResource. When provided in this manner, this
     * API fetches the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            An optional string that, if supplied, must be copied from the
     *            output of a previous call to ListTagOfResource. When provided
     *            in this manner, this API fetches the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional string that, if supplied, must be copied from the output of a
     * previous call to ListTagOfResource. When provided in this manner, this
     * API fetches the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            An optional string that, if supplied, must be copied from the
     *            output of a previous call to ListTagOfResource. When provided
     *            in this manner, this API fetches the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsOfResourceRequest withNextToken(String nextToken) {
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

        if (obj instanceof ListTagsOfResourceRequest == false)
            return false;
        ListTagsOfResourceRequest other = (ListTagsOfResourceRequest) obj;

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
