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

public class ListFaqsResult implements Serializable {
    /**
     * <p>
     * The <code>ListFaqs</code> operation returns a page of FAQs at a time. The
     * maximum size of the page is set by the <code>MaxResults</code> parameter.
     * If there are more jobs in the list than the page size, Amazon Kendra
     * returns the <code>NextPage</code> token. Include the token in the next
     * request to the <code>ListFaqs</code> operation to return the next page of
     * FAQs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     */
    private String nextToken;

    /**
     * <p>
     * information about the FAQs associated with the specified index.
     * </p>
     */
    private java.util.List<FaqSummary> faqSummaryItems;

    /**
     * <p>
     * The <code>ListFaqs</code> operation returns a page of FAQs at a time. The
     * maximum size of the page is set by the <code>MaxResults</code> parameter.
     * If there are more jobs in the list than the page size, Amazon Kendra
     * returns the <code>NextPage</code> token. Include the token in the next
     * request to the <code>ListFaqs</code> operation to return the next page of
     * FAQs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @return <p>
     *         The <code>ListFaqs</code> operation returns a page of FAQs at a
     *         time. The maximum size of the page is set by the
     *         <code>MaxResults</code> parameter. If there are more jobs in the
     *         list than the page size, Amazon Kendra returns the
     *         <code>NextPage</code> token. Include the token in the next
     *         request to the <code>ListFaqs</code> operation to return the next
     *         page of FAQs.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The <code>ListFaqs</code> operation returns a page of FAQs at a time. The
     * maximum size of the page is set by the <code>MaxResults</code> parameter.
     * If there are more jobs in the list than the page size, Amazon Kendra
     * returns the <code>NextPage</code> token. Include the token in the next
     * request to the <code>ListFaqs</code> operation to return the next page of
     * FAQs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @param nextToken <p>
     *            The <code>ListFaqs</code> operation returns a page of FAQs at
     *            a time. The maximum size of the page is set by the
     *            <code>MaxResults</code> parameter. If there are more jobs in
     *            the list than the page size, Amazon Kendra returns the
     *            <code>NextPage</code> token. Include the token in the next
     *            request to the <code>ListFaqs</code> operation to return the
     *            next page of FAQs.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>ListFaqs</code> operation returns a page of FAQs at a time. The
     * maximum size of the page is set by the <code>MaxResults</code> parameter.
     * If there are more jobs in the list than the page size, Amazon Kendra
     * returns the <code>NextPage</code> token. Include the token in the next
     * request to the <code>ListFaqs</code> operation to return the next page of
     * FAQs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 800<br/>
     *
     * @param nextToken <p>
     *            The <code>ListFaqs</code> operation returns a page of FAQs at
     *            a time. The maximum size of the page is set by the
     *            <code>MaxResults</code> parameter. If there are more jobs in
     *            the list than the page size, Amazon Kendra returns the
     *            <code>NextPage</code> token. Include the token in the next
     *            request to the <code>ListFaqs</code> operation to return the
     *            next page of FAQs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFaqsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * information about the FAQs associated with the specified index.
     * </p>
     *
     * @return <p>
     *         information about the FAQs associated with the specified index.
     *         </p>
     */
    public java.util.List<FaqSummary> getFaqSummaryItems() {
        return faqSummaryItems;
    }

    /**
     * <p>
     * information about the FAQs associated with the specified index.
     * </p>
     *
     * @param faqSummaryItems <p>
     *            information about the FAQs associated with the specified
     *            index.
     *            </p>
     */
    public void setFaqSummaryItems(java.util.Collection<FaqSummary> faqSummaryItems) {
        if (faqSummaryItems == null) {
            this.faqSummaryItems = null;
            return;
        }

        this.faqSummaryItems = new java.util.ArrayList<FaqSummary>(faqSummaryItems);
    }

    /**
     * <p>
     * information about the FAQs associated with the specified index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faqSummaryItems <p>
     *            information about the FAQs associated with the specified
     *            index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFaqsResult withFaqSummaryItems(FaqSummary... faqSummaryItems) {
        if (getFaqSummaryItems() == null) {
            this.faqSummaryItems = new java.util.ArrayList<FaqSummary>(faqSummaryItems.length);
        }
        for (FaqSummary value : faqSummaryItems) {
            this.faqSummaryItems.add(value);
        }
        return this;
    }

    /**
     * <p>
     * information about the FAQs associated with the specified index.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faqSummaryItems <p>
     *            information about the FAQs associated with the specified
     *            index.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFaqsResult withFaqSummaryItems(java.util.Collection<FaqSummary> faqSummaryItems) {
        setFaqSummaryItems(faqSummaryItems);
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
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getFaqSummaryItems() != null)
            sb.append("FaqSummaryItems: " + getFaqSummaryItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getFaqSummaryItems() == null) ? 0 : getFaqSummaryItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListFaqsResult == false)
            return false;
        ListFaqsResult other = (ListFaqsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFaqSummaryItems() == null ^ this.getFaqSummaryItems() == null)
            return false;
        if (other.getFaqSummaryItems() != null
                && other.getFaqSummaryItems().equals(this.getFaqSummaryItems()) == false)
            return false;
        return true;
    }
}
