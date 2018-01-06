/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribeTags.
 * </p>
 */
public class DescribeTagsResult implements Serializable {

    /**
     * A list of tags.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription> tags;

    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return..
     */
    private String nextToken;

    /**
     * A list of tags.
     *
     * @return A list of tags.
     */
    public java.util.List<TagDescription> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags.
     *
     * @param tags A list of tags.
     */
    public void setTags(java.util.Collection<TagDescription> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsResult withTags(TagDescription... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<TagDescription>(tags.length));
        for (TagDescription value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsResult withTags(java.util.Collection<TagDescription> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<TagDescription>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return..
     *
     * @return The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return..
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return..
     *
     * @param nextToken The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return..
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return..
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use to retrieve the next page of results. This value is
     *         <code>null</code> when there are no more results to return..
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeTagsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
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
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTagsResult == false) return false;
        DescribeTagsResult other = (DescribeTagsResult)obj;
        
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    