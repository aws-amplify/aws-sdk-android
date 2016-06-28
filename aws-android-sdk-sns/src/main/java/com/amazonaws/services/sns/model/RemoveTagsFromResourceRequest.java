/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.sns.AmazonSNS#removeTagsFromResource(RemoveTagsFromResourceRequest) RemoveTagsFromResource operation}.
 * 
 *
 * @see com.amazonaws.services.sns.AmazonSNS#removeTagsFromResource(RemoveTagsFromResourceRequest)
 */
public class RemoveTagsFromResourceRequest extends AmazonWebServiceRequest implements Serializable {

    private String resourceArn;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tags;

    /**
     * Returns the value of the ResourceArn property for this object.
     *
     * @return The value of the ResourceArn property for this object.
     */
    public String getResourceArn() {
        return resourceArn;
    }
    
    /**
     * Sets the value of the ResourceArn property for this object.
     *
     * @param resourceArn The new value for the ResourceArn property for this object.
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }
    
    /**
     * Sets the value of the ResourceArn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceArn The new value for the ResourceArn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RemoveTagsFromResourceRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * Returns the value of the Tags property for this object.
     *
     * @return The value of the Tags property for this object.
     */
    public java.util.List<String> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     *
     * @param tags The new value for the Tags property for this object.
     */
    public void setTags(java.util.Collection<String> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The new value for the Tags property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RemoveTagsFromResourceRequest withTags(String... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<String>(tags.length));
        for (String value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The new value for the Tags property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RemoveTagsFromResourceRequest withTags(java.util.Collection<String> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

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
        if (getResourceArn() != null) sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false) return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest)obj;
        
        if (other.getResourceArn() == null ^ this.getResourceArn() == null) return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    