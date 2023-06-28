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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The search criteria to be used to search tags.
 * </p>
 */
public class ResourceTagsSearchCriteria implements Serializable {
    /**
     * <p>
     * The search criteria to be used to return tags.
     * </p>
     */
    private TagSearchCondition tagSearchCondition;

    /**
     * <p>
     * The search criteria to be used to return tags.
     * </p>
     *
     * @return <p>
     *         The search criteria to be used to return tags.
     *         </p>
     */
    public TagSearchCondition getTagSearchCondition() {
        return tagSearchCondition;
    }

    /**
     * <p>
     * The search criteria to be used to return tags.
     * </p>
     *
     * @param tagSearchCondition <p>
     *            The search criteria to be used to return tags.
     *            </p>
     */
    public void setTagSearchCondition(TagSearchCondition tagSearchCondition) {
        this.tagSearchCondition = tagSearchCondition;
    }

    /**
     * <p>
     * The search criteria to be used to return tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagSearchCondition <p>
     *            The search criteria to be used to return tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceTagsSearchCriteria withTagSearchCondition(TagSearchCondition tagSearchCondition) {
        this.tagSearchCondition = tagSearchCondition;
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
        if (getTagSearchCondition() != null)
            sb.append("TagSearchCondition: " + getTagSearchCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTagSearchCondition() == null) ? 0 : getTagSearchCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceTagsSearchCriteria == false)
            return false;
        ResourceTagsSearchCriteria other = (ResourceTagsSearchCriteria) obj;

        if (other.getTagSearchCondition() == null ^ this.getTagSearchCondition() == null)
            return false;
        if (other.getTagSearchCondition() != null
                && other.getTagSearchCondition().equals(this.getTagSearchCondition()) == false)
            return false;
        return true;
    }
}
