/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the calling account's current verified and pending destination phone
 * numbers in the SMS sandbox.
 * </p>
 * <p>
 * When you start using Amazon SNS to send SMS messages, your account is in the
 * <i>SMS sandbox</i>. The SMS sandbox provides a safe environment for you to
 * try Amazon SNS features without risking your reputation as an SMS sender.
 * While your account is in the SMS sandbox, you can use all of the features of
 * Amazon SNS. However, you can send SMS messages only to verified destination
 * phone numbers. For more information, including how to move out of the sandbox
 * to send messages without restrictions, see <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">SMS
 * sandbox</a> in the <i>Amazon SNS Developer Guide</i>.
 * </p>
 */
public class ListSMSSandboxPhoneNumbersRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Token that the previous <code>ListSMSSandboxPhoneNumbersInput</code>
     * request returns.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of phone numbers to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * Token that the previous <code>ListSMSSandboxPhoneNumbersInput</code>
     * request returns.
     * </p>
     *
     * @return <p>
     *         Token that the previous
     *         <code>ListSMSSandboxPhoneNumbersInput</code> request returns.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Token that the previous <code>ListSMSSandboxPhoneNumbersInput</code>
     * request returns.
     * </p>
     *
     * @param nextToken <p>
     *            Token that the previous
     *            <code>ListSMSSandboxPhoneNumbersInput</code> request returns.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token that the previous <code>ListSMSSandboxPhoneNumbersInput</code>
     * request returns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            Token that the previous
     *            <code>ListSMSSandboxPhoneNumbersInput</code> request returns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSMSSandboxPhoneNumbersRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of phone numbers to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of phone numbers to return.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of phone numbers to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of phone numbers to return.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of phone numbers to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of phone numbers to return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSMSSandboxPhoneNumbersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSMSSandboxPhoneNumbersRequest == false)
            return false;
        ListSMSSandboxPhoneNumbersRequest other = (ListSMSSandboxPhoneNumbersRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
