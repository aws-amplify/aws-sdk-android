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
 * Provides information about the number of documents and the number of
 * questions and answers in an index.
 * </p>
 */
public class IndexStatistics implements Serializable {
    /**
     * <p>
     * The number of question and answer topics in the index.
     * </p>
     */
    private FaqStatistics faqStatistics;

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     */
    private TextDocumentStatistics textDocumentStatistics;

    /**
     * <p>
     * The number of question and answer topics in the index.
     * </p>
     *
     * @return <p>
     *         The number of question and answer topics in the index.
     *         </p>
     */
    public FaqStatistics getFaqStatistics() {
        return faqStatistics;
    }

    /**
     * <p>
     * The number of question and answer topics in the index.
     * </p>
     *
     * @param faqStatistics <p>
     *            The number of question and answer topics in the index.
     *            </p>
     */
    public void setFaqStatistics(FaqStatistics faqStatistics) {
        this.faqStatistics = faqStatistics;
    }

    /**
     * <p>
     * The number of question and answer topics in the index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faqStatistics <p>
     *            The number of question and answer topics in the index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexStatistics withFaqStatistics(FaqStatistics faqStatistics) {
        this.faqStatistics = faqStatistics;
        return this;
    }

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     *
     * @return <p>
     *         The number of text documents indexed.
     *         </p>
     */
    public TextDocumentStatistics getTextDocumentStatistics() {
        return textDocumentStatistics;
    }

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     *
     * @param textDocumentStatistics <p>
     *            The number of text documents indexed.
     *            </p>
     */
    public void setTextDocumentStatistics(TextDocumentStatistics textDocumentStatistics) {
        this.textDocumentStatistics = textDocumentStatistics;
    }

    /**
     * <p>
     * The number of text documents indexed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param textDocumentStatistics <p>
     *            The number of text documents indexed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexStatistics withTextDocumentStatistics(TextDocumentStatistics textDocumentStatistics) {
        this.textDocumentStatistics = textDocumentStatistics;
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
        if (getFaqStatistics() != null)
            sb.append("FaqStatistics: " + getFaqStatistics() + ",");
        if (getTextDocumentStatistics() != null)
            sb.append("TextDocumentStatistics: " + getTextDocumentStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFaqStatistics() == null) ? 0 : getFaqStatistics().hashCode());
        hashCode = prime
                * hashCode
                + ((getTextDocumentStatistics() == null) ? 0 : getTextDocumentStatistics()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexStatistics == false)
            return false;
        IndexStatistics other = (IndexStatistics) obj;

        if (other.getFaqStatistics() == null ^ this.getFaqStatistics() == null)
            return false;
        if (other.getFaqStatistics() != null
                && other.getFaqStatistics().equals(this.getFaqStatistics()) == false)
            return false;
        if (other.getTextDocumentStatistics() == null ^ this.getTextDocumentStatistics() == null)
            return false;
        if (other.getTextDocumentStatistics() != null
                && other.getTextDocumentStatistics().equals(this.getTextDocumentStatistics()) == false)
            return false;
        return true;
    }
}
