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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

public class CreateTagOptionResult implements Serializable {
    /**
     * <p>
     * Information about the TagOption.
     * </p>
     */
    private TagOptionDetail tagOptionDetail;

    /**
     * <p>
     * Information about the TagOption.
     * </p>
     *
     * @return <p>
     *         Information about the TagOption.
     *         </p>
     */
    public TagOptionDetail getTagOptionDetail() {
        return tagOptionDetail;
    }

    /**
     * <p>
     * Information about the TagOption.
     * </p>
     *
     * @param tagOptionDetail <p>
     *            Information about the TagOption.
     *            </p>
     */
    public void setTagOptionDetail(TagOptionDetail tagOptionDetail) {
        this.tagOptionDetail = tagOptionDetail;
    }

    /**
     * <p>
     * Information about the TagOption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagOptionDetail <p>
     *            Information about the TagOption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTagOptionResult withTagOptionDetail(TagOptionDetail tagOptionDetail) {
        this.tagOptionDetail = tagOptionDetail;
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
        if (getTagOptionDetail() != null)
            sb.append("TagOptionDetail: " + getTagOptionDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTagOptionDetail() == null) ? 0 : getTagOptionDetail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTagOptionResult == false)
            return false;
        CreateTagOptionResult other = (CreateTagOptionResult) obj;

        if (other.getTagOptionDetail() == null ^ this.getTagOptionDetail() == null)
            return false;
        if (other.getTagOptionDetail() != null
                && other.getTagOptionDetail().equals(this.getTagOptionDetail()) == false)
            return false;
        return true;
    }
}
