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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the pages of a document, defined by logical
 * boundary.
 * </p>
 */
public class SplitDocument implements Serializable {
    /**
     * <p>
     * The index for a given document in a DocumentGroup of a specific Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer index;

    /**
     * <p>
     * An array of page numbers for a for a given document, ordered by logical
     * boundary.
     * </p>
     */
    private java.util.List<Integer> pages;

    /**
     * <p>
     * The index for a given document in a DocumentGroup of a specific Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The index for a given document in a DocumentGroup of a specific
     *         Type.
     *         </p>
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * <p>
     * The index for a given document in a DocumentGroup of a specific Type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param index <p>
     *            The index for a given document in a DocumentGroup of a
     *            specific Type.
     *            </p>
     */
    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * <p>
     * The index for a given document in a DocumentGroup of a specific Type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param index <p>
     *            The index for a given document in a DocumentGroup of a
     *            specific Type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SplitDocument withIndex(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * <p>
     * An array of page numbers for a for a given document, ordered by logical
     * boundary.
     * </p>
     *
     * @return <p>
     *         An array of page numbers for a for a given document, ordered by
     *         logical boundary.
     *         </p>
     */
    public java.util.List<Integer> getPages() {
        return pages;
    }

    /**
     * <p>
     * An array of page numbers for a for a given document, ordered by logical
     * boundary.
     * </p>
     *
     * @param pages <p>
     *            An array of page numbers for a for a given document, ordered
     *            by logical boundary.
     *            </p>
     */
    public void setPages(java.util.Collection<Integer> pages) {
        if (pages == null) {
            this.pages = null;
            return;
        }

        this.pages = new java.util.ArrayList<Integer>(pages);
    }

    /**
     * <p>
     * An array of page numbers for a for a given document, ordered by logical
     * boundary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pages <p>
     *            An array of page numbers for a for a given document, ordered
     *            by logical boundary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SplitDocument withPages(Integer... pages) {
        if (getPages() == null) {
            this.pages = new java.util.ArrayList<Integer>(pages.length);
        }
        for (Integer value : pages) {
            this.pages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of page numbers for a for a given document, ordered by logical
     * boundary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pages <p>
     *            An array of page numbers for a for a given document, ordered
     *            by logical boundary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SplitDocument withPages(java.util.Collection<Integer> pages) {
        setPages(pages);
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
        if (getIndex() != null)
            sb.append("Index: " + getIndex() + ",");
        if (getPages() != null)
            sb.append("Pages: " + getPages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndex() == null) ? 0 : getIndex().hashCode());
        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SplitDocument == false)
            return false;
        SplitDocument other = (SplitDocument) obj;

        if (other.getIndex() == null ^ this.getIndex() == null)
            return false;
        if (other.getIndex() != null && other.getIndex().equals(this.getIndex()) == false)
            return false;
        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
            return false;
        return true;
    }
}
