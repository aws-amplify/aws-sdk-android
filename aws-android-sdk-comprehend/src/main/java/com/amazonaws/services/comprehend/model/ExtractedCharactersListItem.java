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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Array of the number of characters extracted from each page.
 * </p>
 */
public class ExtractedCharactersListItem implements Serializable {
    /**
     * <p>
     * Page number.
     * </p>
     */
    private Integer page;

    /**
     * <p>
     * Number of characters extracted from each page.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * Page number.
     * </p>
     *
     * @return <p>
     *         Page number.
     *         </p>
     */
    public Integer getPage() {
        return page;
    }

    /**
     * <p>
     * Page number.
     * </p>
     *
     * @param page <p>
     *            Page number.
     *            </p>
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * Page number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param page <p>
     *            Page number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExtractedCharactersListItem withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * <p>
     * Number of characters extracted from each page.
     * </p>
     *
     * @return <p>
     *         Number of characters extracted from each page.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * Number of characters extracted from each page.
     * </p>
     *
     * @param count <p>
     *            Number of characters extracted from each page.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * Number of characters extracted from each page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            Number of characters extracted from each page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ExtractedCharactersListItem withCount(Integer count) {
        this.count = count;
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
        if (getPage() != null)
            sb.append("Page: " + getPage() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExtractedCharactersListItem == false)
            return false;
        ExtractedCharactersListItem other = (ExtractedCharactersListItem) obj;

        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }
}
