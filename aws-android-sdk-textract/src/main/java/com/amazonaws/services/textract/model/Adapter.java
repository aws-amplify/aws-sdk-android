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
 * An adapter selected for use when analyzing documents. Contains an adapter ID
 * and a version number. Contains information on pages selected for analysis
 * when analyzing documents asychronously.
 * </p>
 */
public class Adapter implements Serializable {
    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     */
    private String adapterId;

    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply
     * an adapter to. The following is a list of rules for using this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a page is not specified, it is set to <code>["1"]</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following characters are allowed in the parameter's string:
     * <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No whitespace is allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * When using * to indicate all pages, it must be the only element in the
     * list.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>.
     * Where <code>*</code> indicates last page of document.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified pages must be greater than 0 and less than or equal to the
     * number of pages in the document.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> pages;

    /**
     * <p>
     * A string that identifies the version of the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String version;

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @return <p>
     *         A unique identifier for the adapter resource.
     *         </p>
     */
    public String getAdapterId() {
        return adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A unique identifier for the adapter resource.
     *            </p>
     */
    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A unique identifier for the adapter resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 1011<br/>
     *
     * @param adapterId <p>
     *            A unique identifier for the adapter resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Adapter withAdapterId(String adapterId) {
        this.adapterId = adapterId;
        return this;
    }

    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply
     * an adapter to. The following is a list of rules for using this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a page is not specified, it is set to <code>["1"]</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following characters are allowed in the parameter's string:
     * <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No whitespace is allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * When using * to indicate all pages, it must be the only element in the
     * list.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>.
     * Where <code>*</code> indicates last page of document.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified pages must be greater than 0 and less than or equal to the
     * number of pages in the document.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Pages is a parameter that the user inputs to specify which pages
     *         to apply an adapter to. The following is a list of rules for
     *         using this parameter.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If a page is not specified, it is set to <code>["1"]</code> by
     *         default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The following characters are allowed in the parameter's string:
     *         <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No whitespace is allowed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When using * to indicate all pages, it must be the only element
     *         in the list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         You can use page intervals, such as
     *         <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code>
     *         indicates last page of document.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified pages must be greater than 0 and less than or equal to
     *         the number of pages in the document.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getPages() {
        return pages;
    }

    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply
     * an adapter to. The following is a list of rules for using this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a page is not specified, it is set to <code>["1"]</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following characters are allowed in the parameter's string:
     * <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No whitespace is allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * When using * to indicate all pages, it must be the only element in the
     * list.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>.
     * Where <code>*</code> indicates last page of document.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified pages must be greater than 0 and less than or equal to the
     * number of pages in the document.
     * </p>
     * </li>
     * </ul>
     *
     * @param pages <p>
     *            Pages is a parameter that the user inputs to specify which
     *            pages to apply an adapter to. The following is a list of rules
     *            for using this parameter.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If a page is not specified, it is set to <code>["1"]</code> by
     *            default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The following characters are allowed in the parameter's
     *            string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No whitespace is
     *            allowed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When using * to indicate all pages, it must be the only
     *            element in the list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can use page intervals, such as
     *            <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code>
     *            indicates last page of document.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified pages must be greater than 0 and less than or equal
     *            to the number of pages in the document.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPages(java.util.Collection<String> pages) {
        if (pages == null) {
            this.pages = null;
            return;
        }

        this.pages = new java.util.ArrayList<String>(pages);
    }

    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply
     * an adapter to. The following is a list of rules for using this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a page is not specified, it is set to <code>["1"]</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following characters are allowed in the parameter's string:
     * <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No whitespace is allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * When using * to indicate all pages, it must be the only element in the
     * list.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>.
     * Where <code>*</code> indicates last page of document.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified pages must be greater than 0 and less than or equal to the
     * number of pages in the document.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pages <p>
     *            Pages is a parameter that the user inputs to specify which
     *            pages to apply an adapter to. The following is a list of rules
     *            for using this parameter.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If a page is not specified, it is set to <code>["1"]</code> by
     *            default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The following characters are allowed in the parameter's
     *            string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No whitespace is
     *            allowed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When using * to indicate all pages, it must be the only
     *            element in the list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can use page intervals, such as
     *            <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code>
     *            indicates last page of document.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified pages must be greater than 0 and less than or equal
     *            to the number of pages in the document.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Adapter withPages(String... pages) {
        if (getPages() == null) {
            this.pages = new java.util.ArrayList<String>(pages.length);
        }
        for (String value : pages) {
            this.pages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply
     * an adapter to. The following is a list of rules for using this parameter.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If a page is not specified, it is set to <code>["1"]</code> by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * The following characters are allowed in the parameter's string:
     * <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No whitespace is allowed.
     * </p>
     * </li>
     * <li>
     * <p>
     * When using * to indicate all pages, it must be the only element in the
     * list.
     * </p>
     * </li>
     * <li>
     * <p>
     * You can use page intervals, such as <code>["1-3", "1-1", "4-*"]</code>.
     * Where <code>*</code> indicates last page of document.
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified pages must be greater than 0 and less than or equal to the
     * number of pages in the document.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pages <p>
     *            Pages is a parameter that the user inputs to specify which
     *            pages to apply an adapter to. The following is a list of rules
     *            for using this parameter.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If a page is not specified, it is set to <code>["1"]</code> by
     *            default.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The following characters are allowed in the parameter's
     *            string: <code>0 1 2 3 4 5 6 7 8 9 - *</code>. No whitespace is
     *            allowed.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            When using * to indicate all pages, it must be the only
     *            element in the list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            You can use page intervals, such as
     *            <code>["1-3", "1-1", "4-*"]</code>. Where <code>*</code>
     *            indicates last page of document.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Specified pages must be greater than 0 and less than or equal
     *            to the number of pages in the document.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Adapter withPages(java.util.Collection<String> pages) {
        setPages(pages);
        return this;
    }

    /**
     * <p>
     * A string that identifies the version of the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         A string that identifies the version of the adapter.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * A string that identifies the version of the adapter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param version <p>
     *            A string that identifies the version of the adapter.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * A string that identifies the version of the adapter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param version <p>
     *            A string that identifies the version of the adapter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Adapter withVersion(String version) {
        this.version = version;
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
        if (getAdapterId() != null)
            sb.append("AdapterId: " + getAdapterId() + ",");
        if (getPages() != null)
            sb.append("Pages: " + getPages() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdapterId() == null) ? 0 : getAdapterId().hashCode());
        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Adapter == false)
            return false;
        Adapter other = (Adapter) obj;

        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null
                && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
