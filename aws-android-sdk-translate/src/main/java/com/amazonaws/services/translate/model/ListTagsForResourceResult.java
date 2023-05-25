/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

public class ListTagsForResourceResult implements Serializable {
    /**
     * <p>
     * Tags associated with the Amazon Translate resource being queried. A tag
     * is a key-value pair that adds as a metadata to a resource used by Amazon
     * Translate. For example, a tag with "Sales" as the key might be added to a
     * resource to indicate its use by the sales department.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Tags associated with the Amazon Translate resource being queried. A tag
     * is a key-value pair that adds as a metadata to a resource used by Amazon
     * Translate. For example, a tag with "Sales" as the key might be added to a
     * resource to indicate its use by the sales department.
     * </p>
     *
     * @return <p>
     *         Tags associated with the Amazon Translate resource being queried.
     *         A tag is a key-value pair that adds as a metadata to a resource
     *         used by Amazon Translate. For example, a tag with "Sales" as the
     *         key might be added to a resource to indicate its use by the sales
     *         department.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags associated with the Amazon Translate resource being queried. A tag
     * is a key-value pair that adds as a metadata to a resource used by Amazon
     * Translate. For example, a tag with "Sales" as the key might be added to a
     * resource to indicate its use by the sales department.
     * </p>
     *
     * @param tags <p>
     *            Tags associated with the Amazon Translate resource being
     *            queried. A tag is a key-value pair that adds as a metadata to
     *            a resource used by Amazon Translate. For example, a tag with
     *            "Sales" as the key might be added to a resource to indicate
     *            its use by the sales department.
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
     * Tags associated with the Amazon Translate resource being queried. A tag
     * is a key-value pair that adds as a metadata to a resource used by Amazon
     * Translate. For example, a tag with "Sales" as the key might be added to a
     * resource to indicate its use by the sales department.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags associated with the Amazon Translate resource being
     *            queried. A tag is a key-value pair that adds as a metadata to
     *            a resource used by Amazon Translate. For example, a tag with
     *            "Sales" as the key might be added to a resource to indicate
     *            its use by the sales department.
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
     * Tags associated with the Amazon Translate resource being queried. A tag
     * is a key-value pair that adds as a metadata to a resource used by Amazon
     * Translate. For example, a tag with "Sales" as the key might be added to a
     * resource to indicate its use by the sales department.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags associated with the Amazon Translate resource being
     *            queried. A tag is a key-value pair that adds as a metadata to
     *            a resource used by Amazon Translate. For example, a tag with
     *            "Sales" as the key might be added to a resource to indicate
     *            its use by the sales department.
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
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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

        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
