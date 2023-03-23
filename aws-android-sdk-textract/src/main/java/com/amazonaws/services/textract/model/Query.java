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
 * Each query contains the question you want to ask in the Text and the alias
 * you want to associate.
 * </p>
 */
public class Query implements Serializable {
    /**
     * <p>
     * Question that Amazon Textract will apply to the document. An example
     * would be "What is the customer's SSN?"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     */
    private String text;

    /**
     * <p>
     * Alias attached to the query, for ease of location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     */
    private String alias;

    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply
     * a query to. The following is a list of rules for using this parameter.
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
     * You can use page intervals, such as <code>[“1-3”, “1-1”, “4-*”]</code>.
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
     * Question that Amazon Textract will apply to the document. An example
     * would be "What is the customer's SSN?"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @return <p>
     *         Question that Amazon Textract will apply to the document. An
     *         example would be "What is the customer's SSN?"
     *         </p>
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * Question that Amazon Textract will apply to the document. An example
     * would be "What is the customer's SSN?"
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @param text <p>
     *            Question that Amazon Textract will apply to the document. An
     *            example would be "What is the customer's SSN?"
     *            </p>
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * Question that Amazon Textract will apply to the document. An example
     * would be "What is the customer's SSN?"
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @param text <p>
     *            Question that Amazon Textract will apply to the document. An
     *            example would be "What is the customer's SSN?"
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Query withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * <p>
     * Alias attached to the query, for ease of location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @return <p>
     *         Alias attached to the query, for ease of location.
     *         </p>
     */
    public String getAlias() {
        return alias;
    }

    /**
     * <p>
     * Alias attached to the query, for ease of location.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @param alias <p>
     *            Alias attached to the query, for ease of location.
     *            </p>
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * Alias attached to the query, for ease of location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern:
     * </b>^[a-zA-Z0-9\s!"\#\$%'&\(\)\*\+\,\-\./:;=\?@\[\\\]\^_`\{\|\}~><]+$
     * <br/>
     *
     * @param alias <p>
     *            Alias attached to the query, for ease of location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Query withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * <p>
     * Pages is a parameter that the user inputs to specify which pages to apply
     * a query to. The following is a list of rules for using this parameter.
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
     * You can use page intervals, such as <code>[“1-3”, “1-1”, “4-*”]</code>.
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
     *         to apply a query to. The following is a list of rules for using
     *         this parameter.
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
     *         <code>[“1-3”, “1-1”, “4-*”]</code>. Where <code>*</code>
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
     * a query to. The following is a list of rules for using this parameter.
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
     * You can use page intervals, such as <code>[“1-3”, “1-1”, “4-*”]</code>.
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
     *            pages to apply a query to. The following is a list of rules
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
     *            <code>[“1-3”, “1-1”, “4-*”]</code>. Where <code>*</code>
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
     * a query to. The following is a list of rules for using this parameter.
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
     * You can use page intervals, such as <code>[“1-3”, “1-1”, “4-*”]</code>.
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
     *            pages to apply a query to. The following is a list of rules
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
     *            <code>[“1-3”, “1-1”, “4-*”]</code>. Where <code>*</code>
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
    public Query withPages(String... pages) {
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
     * a query to. The following is a list of rules for using this parameter.
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
     * You can use page intervals, such as <code>[“1-3”, “1-1”, “4-*”]</code>.
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
     *            pages to apply a query to. The following is a list of rules
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
     *            <code>[“1-3”, “1-1”, “4-*”]</code>. Where <code>*</code>
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
    public Query withPages(java.util.Collection<String> pages) {
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
        if (getText() != null)
            sb.append("Text: " + getText() + ",");
        if (getAlias() != null)
            sb.append("Alias: " + getAlias() + ",");
        if (getPages() != null)
            sb.append("Pages: " + getPages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getText() == null) ? 0 : getText().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Query == false)
            return false;
        Query other = (Query) obj;

        if (other.getText() == null ^ this.getText() == null)
            return false;
        if (other.getText() != null && other.getText().equals(this.getText()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
            return false;
        return true;
    }
}
