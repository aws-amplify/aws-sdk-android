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

package com.amazonaws.services.session.qldb.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the page that was fetched.
 * </p>
 */
public class FetchPageResult implements Serializable {
    /**
     * <p>
     * Contains details of the fetched page.
     * </p>
     */
    private Page page;

    /**
     * <p>
     * Contains details of the fetched page.
     * </p>
     *
     * @return <p>
     *         Contains details of the fetched page.
     *         </p>
     */
    public Page getPage() {
        return page;
    }

    /**
     * <p>
     * Contains details of the fetched page.
     * </p>
     *
     * @param page <p>
     *            Contains details of the fetched page.
     *            </p>
     */
    public void setPage(Page page) {
        this.page = page;
    }

    /**
     * <p>
     * Contains details of the fetched page.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param page <p>
     *            Contains details of the fetched page.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FetchPageResult withPage(Page page) {
        this.page = page;
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
            sb.append("Page: " + getPage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FetchPageResult == false)
            return false;
        FetchPageResult other = (FetchPageResult) obj;

        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        return true;
    }
}
