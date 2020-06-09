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

package com.amazonaws.services.transfer.model;

import java.io.Serializable;

public class ListTagsForResourceResult implements Serializable {
    /**
     * <p>
     * The ARN you specified to list the tags of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     */
    private String arn;

    /**
     * <p>
     * When you can get additional results from the
     * <code>ListTagsForResource</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to
     * the <code>NextToken</code> parameter to continue listing additional tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     */
    private String nextToken;

    /**
     * <p>
     * Key-value pairs that are assigned to a resource, usually for the purpose
     * of grouping and searching for items. Tags are metadata that you define.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ARN you specified to list the tags of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @return <p>
     *         The ARN you specified to list the tags of.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The ARN you specified to list the tags of.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 1600<br/>
     * <b>Pattern: </b>arn:.*<br/>
     *
     * @param arn <p>
     *            The ARN you specified to list the tags of.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN you specified to list the tags of.
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
     *            The ARN you specified to list the tags of.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceResult withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * When you can get additional results from the
     * <code>ListTagsForResource</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to
     * the <code>NextToken</code> parameter to continue listing additional tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @return <p>
     *         When you can get additional results from the
     *         <code>ListTagsForResource</code> call, a <code>NextToken</code>
     *         parameter is returned in the output. You can then pass in a
     *         subsequent command to the <code>NextToken</code> parameter to
     *         continue listing additional tags.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the
     * <code>ListTagsForResource</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to
     * the <code>NextToken</code> parameter to continue listing additional tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param nextToken <p>
     *            When you can get additional results from the
     *            <code>ListTagsForResource</code> call, a
     *            <code>NextToken</code> parameter is returned in the output.
     *            You can then pass in a subsequent command to the
     *            <code>NextToken</code> parameter to continue listing
     *            additional tags.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you can get additional results from the
     * <code>ListTagsForResource</code> call, a <code>NextToken</code> parameter
     * is returned in the output. You can then pass in a subsequent command to
     * the <code>NextToken</code> parameter to continue listing additional tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6144<br/>
     *
     * @param nextToken <p>
     *            When you can get additional results from the
     *            <code>ListTagsForResource</code> call, a
     *            <code>NextToken</code> parameter is returned in the output.
     *            You can then pass in a subsequent command to the
     *            <code>NextToken</code> parameter to continue listing
     *            additional tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Key-value pairs that are assigned to a resource, usually for the purpose
     * of grouping and searching for items. Tags are metadata that you define.
     * </p>
     *
     * @return <p>
     *         Key-value pairs that are assigned to a resource, usually for the
     *         purpose of grouping and searching for items. Tags are metadata
     *         that you define.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Key-value pairs that are assigned to a resource, usually for the purpose
     * of grouping and searching for items. Tags are metadata that you define.
     * </p>
     *
     * @param tags <p>
     *            Key-value pairs that are assigned to a resource, usually for
     *            the purpose of grouping and searching for items. Tags are
     *            metadata that you define.
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
     * Key-value pairs that are assigned to a resource, usually for the purpose
     * of grouping and searching for items. Tags are metadata that you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Key-value pairs that are assigned to a resource, usually for
     *            the purpose of grouping and searching for items. Tags are
     *            metadata that you define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceResult withTags(Tag... tags) {
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
     * Key-value pairs that are assigned to a resource, usually for the purpose
     * of grouping and searching for items. Tags are metadata that you define.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Key-value pairs that are assigned to a resource, usually for
     *            the purpose of grouping and searching for items. Tags are
     *            metadata that you define.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTagsForResourceResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceResult == false)
            return false;
        ListTagsForResourceResult other = (ListTagsForResourceResult) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
