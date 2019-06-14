/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the receipt rule sets that exist under your AWS account in the current
 * AWS Region. If there are additional receipt rule sets to be retrieved, you
 * will receive a <code>NextToken</code> that you can provide to the next call
 * to <code>ListReceiptRuleSets</code> to retrieve the additional entries.
 * </p>
 * <p>
 * For information about managing receipt rule sets, see the <a href=
 * "https://docs.aws.amazon.com/ses/latest/DeveloperGuide/receiving-email-managing-receipt-rule-sets.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class ListReceiptRuleSetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A token returned from a previous call to <code>ListReceiptRuleSets</code>
     * to indicate the position in the receipt rule set list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A token returned from a previous call to <code>ListReceiptRuleSets</code>
     * to indicate the position in the receipt rule set list.
     * </p>
     *
     * @return <p>
     *         A token returned from a previous call to
     *         <code>ListReceiptRuleSets</code> to indicate the position in the
     *         receipt rule set list.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListReceiptRuleSets</code>
     * to indicate the position in the receipt rule set list.
     * </p>
     *
     * @param nextToken <p>
     *            A token returned from a previous call to
     *            <code>ListReceiptRuleSets</code> to indicate the position in
     *            the receipt rule set list.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from a previous call to <code>ListReceiptRuleSets</code>
     * to indicate the position in the receipt rule set list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token returned from a previous call to
     *            <code>ListReceiptRuleSets</code> to indicate the position in
     *            the receipt rule set list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReceiptRuleSetsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReceiptRuleSetsRequest == false)
            return false;
        ListReceiptRuleSetsRequest other = (ListReceiptRuleSetsRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
