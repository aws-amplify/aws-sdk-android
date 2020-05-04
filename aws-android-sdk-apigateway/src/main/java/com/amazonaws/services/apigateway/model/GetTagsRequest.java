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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the <a>Tags</a> collection for a given resource.
 * </p>
 */
public class GetTagsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * [Required] The ARN of a resource that can be tagged.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * (Not currently supported) The current pagination position in the paged
     * result set.
     * </p>
     */
    private String position;

    /**
     * <p>
     * (Not currently supported) The maximum number of returned results per
     * page. The default value is 25 and the maximum value is 500.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * [Required] The ARN of a resource that can be tagged.
     * </p>
     *
     * @return <p>
     *         [Required] The ARN of a resource that can be tagged.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * [Required] The ARN of a resource that can be tagged.
     * </p>
     *
     * @param resourceArn <p>
     *            [Required] The ARN of a resource that can be tagged.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * [Required] The ARN of a resource that can be tagged.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceArn <p>
     *            [Required] The ARN of a resource that can be tagged.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTagsRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * (Not currently supported) The current pagination position in the paged
     * result set.
     * </p>
     *
     * @return <p>
     *         (Not currently supported) The current pagination position in the
     *         paged result set.
     *         </p>
     */
    public String getPosition() {
        return position;
    }

    /**
     * <p>
     * (Not currently supported) The current pagination position in the paged
     * result set.
     * </p>
     *
     * @param position <p>
     *            (Not currently supported) The current pagination position in
     *            the paged result set.
     *            </p>
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * <p>
     * (Not currently supported) The current pagination position in the paged
     * result set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position <p>
     *            (Not currently supported) The current pagination position in
     *            the paged result set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTagsRequest withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * <p>
     * (Not currently supported) The maximum number of returned results per
     * page. The default value is 25 and the maximum value is 500.
     * </p>
     *
     * @return <p>
     *         (Not currently supported) The maximum number of returned results
     *         per page. The default value is 25 and the maximum value is 500.
     *         </p>
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * <p>
     * (Not currently supported) The maximum number of returned results per
     * page. The default value is 25 and the maximum value is 500.
     * </p>
     *
     * @param limit <p>
     *            (Not currently supported) The maximum number of returned
     *            results per page. The default value is 25 and the maximum
     *            value is 500.
     *            </p>
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * (Not currently supported) The maximum number of returned results per
     * page. The default value is 25 and the maximum value is 500.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param limit <p>
     *            (Not currently supported) The maximum number of returned
     *            results per page. The default value is 25 and the maximum
     *            value is 500.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTagsRequest withLimit(Integer limit) {
        this.limit = limit;
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
            sb.append("resourceArn: " + getResourceArn() + ",");
        if (getPosition() != null)
            sb.append("position: " + getPosition() + ",");
        if (getLimit() != null)
            sb.append("limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTagsRequest == false)
            return false;
        GetTagsRequest other = (GetTagsRequest) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }
}
