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

public class ListTagsOfResourceResult implements Serializable {
    /**
     * <p>
     * The tags currently associated with the Amazon DynamoDB resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * If this value is returned, there are additional results to be displayed.
     * To retrieve them, call ListTagsOfResource again, with NextToken set to
     * this value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The tags currently associated with the Amazon DynamoDB resource.
     * </p>
     *
     * @return <p>
     *         The tags currently associated with the Amazon DynamoDB resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags currently associated with the Amazon DynamoDB resource.
     * </p>
     *
     * @param tags <p>
     *            The tags currently associated with the Amazon DynamoDB
     *            resource.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags currently associated with the Amazon DynamoDB resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags currently associated with the Amazon DynamoDB
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsOfResourceResult withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags currently associated with the Amazon DynamoDB resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags currently associated with the Amazon DynamoDB
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsOfResourceResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * If this value is returned, there are additional results to be displayed.
     * To retrieve them, call ListTagsOfResource again, with NextToken set to
     * this value.
     * </p>
     *
     * @return <p>
     *         If this value is returned, there are additional results to be
     *         displayed. To retrieve them, call ListTagsOfResource again, with
     *         NextToken set to this value.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If this value is returned, there are additional results to be displayed.
     * To retrieve them, call ListTagsOfResource again, with NextToken set to
     * this value.
     * </p>
     *
     * @param nextToken <p>
     *            If this value is returned, there are additional results to be
     *            displayed. To retrieve them, call ListTagsOfResource again,
     *            with NextToken set to this value.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If this value is returned, there are additional results to be displayed.
     * To retrieve them, call ListTagsOfResource again, with NextToken set to
     * this value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If this value is returned, there are additional results to be
     *            displayed. To retrieve them, call ListTagsOfResource again,
     *            with NextToken set to this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsOfResourceResult withNextToken(String nextToken) {
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
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsOfResourceResult == false)
            return false;
        ListTagsOfResourceResult other = (ListTagsOfResourceResult) obj;

        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
