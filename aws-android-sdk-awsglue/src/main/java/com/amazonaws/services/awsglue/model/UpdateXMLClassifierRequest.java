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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies an XML classifier to be updated.
 * </p>
 */
public class UpdateXMLClassifierRequest implements Serializable {
    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String name;

    /**
     * <p>
     * An identifier of the data format that the classifier matches.
     * </p>
     */
    private String classification;

    /**
     * <p>
     * The XML tag designating the element that contains each record in an XML
     * document being parsed. This cannot identify a self-closing element
     * (closed by <code>/&gt;</code>). An empty row element that contains only
     * attributes can be parsed as long as it ends with a closing tag (for
     * example, <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is
     * okay, but <code>&lt;row item_a="A" item_b="B" /&gt;</code> is not).
     * </p>
     */
    private String rowTag;

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The name of the classifier.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the classifier.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param name <p>
     *            The name of the classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateXMLClassifierRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * An identifier of the data format that the classifier matches.
     * </p>
     *
     * @return <p>
     *         An identifier of the data format that the classifier matches.
     *         </p>
     */
    public String getClassification() {
        return classification;
    }

    /**
     * <p>
     * An identifier of the data format that the classifier matches.
     * </p>
     *
     * @param classification <p>
     *            An identifier of the data format that the classifier matches.
     *            </p>
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * <p>
     * An identifier of the data format that the classifier matches.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param classification <p>
     *            An identifier of the data format that the classifier matches.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateXMLClassifierRequest withClassification(String classification) {
        this.classification = classification;
        return this;
    }

    /**
     * <p>
     * The XML tag designating the element that contains each record in an XML
     * document being parsed. This cannot identify a self-closing element
     * (closed by <code>/&gt;</code>). An empty row element that contains only
     * attributes can be parsed as long as it ends with a closing tag (for
     * example, <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is
     * okay, but <code>&lt;row item_a="A" item_b="B" /&gt;</code> is not).
     * </p>
     *
     * @return <p>
     *         The XML tag designating the element that contains each record in
     *         an XML document being parsed. This cannot identify a self-closing
     *         element (closed by <code>/&gt;</code>). An empty row element that
     *         contains only attributes can be parsed as long as it ends with a
     *         closing tag (for example,
     *         <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is
     *         okay, but <code>&lt;row item_a="A" item_b="B" /&gt;</code> is
     *         not).
     *         </p>
     */
    public String getRowTag() {
        return rowTag;
    }

    /**
     * <p>
     * The XML tag designating the element that contains each record in an XML
     * document being parsed. This cannot identify a self-closing element
     * (closed by <code>/&gt;</code>). An empty row element that contains only
     * attributes can be parsed as long as it ends with a closing tag (for
     * example, <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is
     * okay, but <code>&lt;row item_a="A" item_b="B" /&gt;</code> is not).
     * </p>
     *
     * @param rowTag <p>
     *            The XML tag designating the element that contains each record
     *            in an XML document being parsed. This cannot identify a
     *            self-closing element (closed by <code>/&gt;</code>). An empty
     *            row element that contains only attributes can be parsed as
     *            long as it ends with a closing tag (for example,
     *            <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is
     *            okay, but <code>&lt;row item_a="A" item_b="B" /&gt;</code> is
     *            not).
     *            </p>
     */
    public void setRowTag(String rowTag) {
        this.rowTag = rowTag;
    }

    /**
     * <p>
     * The XML tag designating the element that contains each record in an XML
     * document being parsed. This cannot identify a self-closing element
     * (closed by <code>/&gt;</code>). An empty row element that contains only
     * attributes can be parsed as long as it ends with a closing tag (for
     * example, <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is
     * okay, but <code>&lt;row item_a="A" item_b="B" /&gt;</code> is not).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rowTag <p>
     *            The XML tag designating the element that contains each record
     *            in an XML document being parsed. This cannot identify a
     *            self-closing element (closed by <code>/&gt;</code>). An empty
     *            row element that contains only attributes can be parsed as
     *            long as it ends with a closing tag (for example,
     *            <code>&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;</code> is
     *            okay, but <code>&lt;row item_a="A" item_b="B" /&gt;</code> is
     *            not).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateXMLClassifierRequest withRowTag(String rowTag) {
        this.rowTag = rowTag;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getClassification() != null)
            sb.append("Classification: " + getClassification() + ",");
        if (getRowTag() != null)
            sb.append("RowTag: " + getRowTag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getClassification() == null) ? 0 : getClassification().hashCode());
        hashCode = prime * hashCode + ((getRowTag() == null) ? 0 : getRowTag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateXMLClassifierRequest == false)
            return false;
        UpdateXMLClassifierRequest other = (UpdateXMLClassifierRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getClassification() == null ^ this.getClassification() == null)
            return false;
        if (other.getClassification() != null
                && other.getClassification().equals(this.getClassification()) == false)
            return false;
        if (other.getRowTag() == null ^ this.getRowTag() == null)
            return false;
        if (other.getRowTag() != null && other.getRowTag().equals(this.getRowTag()) == false)
            return false;
        return true;
    }
}
