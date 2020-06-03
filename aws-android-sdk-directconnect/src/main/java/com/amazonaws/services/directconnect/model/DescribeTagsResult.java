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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

public class DescribeTagsResult implements Serializable {
    /**
     * <p>
     * Information about the tags.
     * </p>
     */
    private java.util.List<ResourceTag> resourceTags;

    /**
     * <p>
     * Information about the tags.
     * </p>
     *
     * @return <p>
     *         Information about the tags.
     *         </p>
     */
    public java.util.List<ResourceTag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * Information about the tags.
     * </p>
     *
     * @param resourceTags <p>
     *            Information about the tags.
     *            </p>
     */
    public void setResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<ResourceTag>(resourceTags);
    }

    /**
     * <p>
     * Information about the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTags <p>
     *            Information about the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsResult withResourceTags(ResourceTag... resourceTags) {
        if (getResourceTags() == null) {
            this.resourceTags = new java.util.ArrayList<ResourceTag>(resourceTags.length);
        }
        for (ResourceTag value : resourceTags) {
            this.resourceTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTags <p>
     *            Information about the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsResult withResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        setResourceTags(resourceTags);
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
        if (getResourceTags() != null)
            sb.append("resourceTags: " + getResourceTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTagsResult == false)
            return false;
        DescribeTagsResult other = (DescribeTagsResult) obj;

        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null
                && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        return true;
    }
}
