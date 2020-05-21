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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Container for <code>TagSet</code> elements.
 * </p>
 */
public class Tagging implements Serializable {
    /**
     * <p>
     * A collection for a set of tags
     * </p>
     */
    private java.util.List<Tag> tagSet;

    /**
     * <p>
     * A collection for a set of tags
     * </p>
     *
     * @return <p>
     *         A collection for a set of tags
     *         </p>
     */
    public java.util.List<Tag> getTagSet() {
        return tagSet;
    }

    /**
     * <p>
     * A collection for a set of tags
     * </p>
     *
     * @param tagSet <p>
     *            A collection for a set of tags
     *            </p>
     */
    public void setTagSet(java.util.Collection<Tag> tagSet) {
        if (tagSet == null) {
            this.tagSet = null;
            return;
        }

        this.tagSet = new java.util.ArrayList<Tag>(tagSet);
    }

    /**
     * <p>
     * A collection for a set of tags
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSet <p>
     *            A collection for a set of tags
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tagging withTagSet(Tag... tagSet) {
        if (getTagSet() == null) {
            this.tagSet = new java.util.ArrayList<Tag>(tagSet.length);
        }
        for (Tag value : tagSet) {
            this.tagSet.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A collection for a set of tags
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSet <p>
     *            A collection for a set of tags
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Tagging withTagSet(java.util.Collection<Tag> tagSet) {
        setTagSet(tagSet);
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
        if (getTagSet() != null)
            sb.append("TagSet: " + getTagSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagSet() == null) ? 0 : getTagSet().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tagging == false)
            return false;
        Tagging other = (Tagging) obj;

        if (other.getTagSet() == null ^ this.getTagSet() == null)
            return false;
        if (other.getTagSet() != null && other.getTagSet().equals(this.getTagSet()) == false)
            return false;
        return true;
    }
}
