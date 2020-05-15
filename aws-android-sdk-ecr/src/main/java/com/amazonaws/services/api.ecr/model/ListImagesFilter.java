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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

/**
 * <p>
 * An object representing a filter on a <a>ListImages</a> operation.
 * </p>
 */
public class ListImagesFilter implements Serializable {
    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You
     * can filter results based on whether they are <code>TAGGED</code> or
     * <code>UNTAGGED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAGGED, UNTAGGED, ANY
     */
    private String tagStatus;

    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You
     * can filter results based on whether they are <code>TAGGED</code> or
     * <code>UNTAGGED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAGGED, UNTAGGED, ANY
     *
     * @return <p>
     *         The tag status with which to filter your <a>ListImages</a>
     *         results. You can filter results based on whether they are
     *         <code>TAGGED</code> or <code>UNTAGGED</code>.
     *         </p>
     * @see TagStatus
     */
    public String getTagStatus() {
        return tagStatus;
    }

    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You
     * can filter results based on whether they are <code>TAGGED</code> or
     * <code>UNTAGGED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAGGED, UNTAGGED, ANY
     *
     * @param tagStatus <p>
     *            The tag status with which to filter your <a>ListImages</a>
     *            results. You can filter results based on whether they are
     *            <code>TAGGED</code> or <code>UNTAGGED</code>.
     *            </p>
     * @see TagStatus
     */
    public void setTagStatus(String tagStatus) {
        this.tagStatus = tagStatus;
    }

    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You
     * can filter results based on whether they are <code>TAGGED</code> or
     * <code>UNTAGGED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAGGED, UNTAGGED, ANY
     *
     * @param tagStatus <p>
     *            The tag status with which to filter your <a>ListImages</a>
     *            results. You can filter results based on whether they are
     *            <code>TAGGED</code> or <code>UNTAGGED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TagStatus
     */
    public ListImagesFilter withTagStatus(String tagStatus) {
        this.tagStatus = tagStatus;
        return this;
    }

    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You
     * can filter results based on whether they are <code>TAGGED</code> or
     * <code>UNTAGGED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAGGED, UNTAGGED, ANY
     *
     * @param tagStatus <p>
     *            The tag status with which to filter your <a>ListImages</a>
     *            results. You can filter results based on whether they are
     *            <code>TAGGED</code> or <code>UNTAGGED</code>.
     *            </p>
     * @see TagStatus
     */
    public void setTagStatus(TagStatus tagStatus) {
        this.tagStatus = tagStatus.toString();
    }

    /**
     * <p>
     * The tag status with which to filter your <a>ListImages</a> results. You
     * can filter results based on whether they are <code>TAGGED</code> or
     * <code>UNTAGGED</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TAGGED, UNTAGGED, ANY
     *
     * @param tagStatus <p>
     *            The tag status with which to filter your <a>ListImages</a>
     *            results. You can filter results based on whether they are
     *            <code>TAGGED</code> or <code>UNTAGGED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TagStatus
     */
    public ListImagesFilter withTagStatus(TagStatus tagStatus) {
        this.tagStatus = tagStatus.toString();
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
        if (getTagStatus() != null)
            sb.append("tagStatus: " + getTagStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagStatus() == null) ? 0 : getTagStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImagesFilter == false)
            return false;
        ListImagesFilter other = (ListImagesFilter) obj;

        if (other.getTagStatus() == null ^ this.getTagStatus() == null)
            return false;
        if (other.getTagStatus() != null
                && other.getTagStatus().equals(this.getTagStatus()) == false)
            return false;
        return true;
    }
}
