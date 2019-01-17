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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output for DescribeTags.
 * </p>
 */
public class DescribeTagsResult implements Serializable {
    /**
     * <p>
     * Information about the tags.
     * </p>
     */
    private java.util.List<TagDescription> tagDescriptions = new java.util.ArrayList<TagDescription>();

    /**
     * <p>
     * Information about the tags.
     * </p>
     *
     * @return <p>
     *         Information about the tags.
     *         </p>
     */
    public java.util.List<TagDescription> getTagDescriptions() {
        return tagDescriptions;
    }

    /**
     * <p>
     * Information about the tags.
     * </p>
     *
     * @param tagDescriptions <p>
     *            Information about the tags.
     *            </p>
     */
    public void setTagDescriptions(java.util.Collection<TagDescription> tagDescriptions) {
        if (tagDescriptions == null) {
            this.tagDescriptions = null;
            return;
        }

        this.tagDescriptions = new java.util.ArrayList<TagDescription>(tagDescriptions);
    }

    /**
     * <p>
     * Information about the tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagDescriptions <p>
     *            Information about the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsResult withTagDescriptions(TagDescription... tagDescriptions) {
        if (getTagDescriptions() == null) {
            this.tagDescriptions = new java.util.ArrayList<TagDescription>(tagDescriptions.length);
        }
        for (TagDescription value : tagDescriptions) {
            this.tagDescriptions.add(value);
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
     * @param tagDescriptions <p>
     *            Information about the tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeTagsResult withTagDescriptions(
            java.util.Collection<TagDescription> tagDescriptions) {
        setTagDescriptions(tagDescriptions);
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
        if (getTagDescriptions() != null)
            sb.append("TagDescriptions: " + getTagDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTagDescriptions() == null) ? 0 : getTagDescriptions().hashCode());
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

        if (other.getTagDescriptions() == null ^ this.getTagDescriptions() == null)
            return false;
        if (other.getTagDescriptions() != null
                && other.getTagDescriptions().equals(this.getTagDescriptions()) == false)
            return false;
        return true;
    }
}
