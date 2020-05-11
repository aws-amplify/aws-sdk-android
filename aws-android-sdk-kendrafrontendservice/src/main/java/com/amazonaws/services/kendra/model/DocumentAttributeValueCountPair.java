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

package com.amazonaws.services.kendra.model;

import java.io.Serializable;

/**
 * <p>
 * Provides the count of documents that match a particular attribute when doing
 * a faceted search.
 * </p>
 */
public class DocumentAttributeValueCountPair implements Serializable {
    /**
     * <p>
     * The value of the attribute. For example, "HR."
     * </p>
     */
    private DocumentAttributeValue documentAttributeValue;

    /**
     * <p>
     * The number of documents in the response that have the attribute value for
     * the key.
     * </p>
     */
    private Integer count;

    /**
     * <p>
     * The value of the attribute. For example, "HR."
     * </p>
     *
     * @return <p>
     *         The value of the attribute. For example, "HR."
     *         </p>
     */
    public DocumentAttributeValue getDocumentAttributeValue() {
        return documentAttributeValue;
    }

    /**
     * <p>
     * The value of the attribute. For example, "HR."
     * </p>
     *
     * @param documentAttributeValue <p>
     *            The value of the attribute. For example, "HR."
     *            </p>
     */
    public void setDocumentAttributeValue(DocumentAttributeValue documentAttributeValue) {
        this.documentAttributeValue = documentAttributeValue;
    }

    /**
     * <p>
     * The value of the attribute. For example, "HR."
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentAttributeValue <p>
     *            The value of the attribute. For example, "HR."
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentAttributeValueCountPair withDocumentAttributeValue(
            DocumentAttributeValue documentAttributeValue) {
        this.documentAttributeValue = documentAttributeValue;
        return this;
    }

    /**
     * <p>
     * The number of documents in the response that have the attribute value for
     * the key.
     * </p>
     *
     * @return <p>
     *         The number of documents in the response that have the attribute
     *         value for the key.
     *         </p>
     */
    public Integer getCount() {
        return count;
    }

    /**
     * <p>
     * The number of documents in the response that have the attribute value for
     * the key.
     * </p>
     *
     * @param count <p>
     *            The number of documents in the response that have the
     *            attribute value for the key.
     *            </p>
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of documents in the response that have the attribute value for
     * the key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param count <p>
     *            The number of documents in the response that have the
     *            attribute value for the key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DocumentAttributeValueCountPair withCount(Integer count) {
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
        if (getDocumentAttributeValue() != null)
            sb.append("DocumentAttributeValue: " + getDocumentAttributeValue() + ",");
        if (getCount() != null)
            sb.append("Count: " + getCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDocumentAttributeValue() == null) ? 0 : getDocumentAttributeValue()
                        .hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentAttributeValueCountPair == false)
            return false;
        DocumentAttributeValueCountPair other = (DocumentAttributeValueCountPair) obj;

        if (other.getDocumentAttributeValue() == null ^ this.getDocumentAttributeValue() == null)
            return false;
        if (other.getDocumentAttributeValue() != null
                && other.getDocumentAttributeValue().equals(this.getDocumentAttributeValue()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        return true;
    }
}
