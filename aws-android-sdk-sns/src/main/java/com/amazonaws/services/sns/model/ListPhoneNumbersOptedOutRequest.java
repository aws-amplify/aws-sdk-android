/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Returns a list of phone numbers that are opted out, meaning you cannot send
 * SMS messages to them.
 * </p>
 * <p>
 * The results for <code>ListPhoneNumbersOptedOut</code> are paginated, and each
 * page returns up to 100 phone numbers. If additional phone numbers are
 * available after the first page of results, then a <code>NextToken</code>
 * string will be returned. To receive the next page, you call
 * <code>ListPhoneNumbersOptedOut</code> again using the <code>NextToken</code>
 * string received from the previous call. When there are no more records to
 * return, <code>NextToken</code> will be null.
 * </p>
 */
public class ListPhoneNumbersOptedOutRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A <code>NextToken</code> string is used when you call the
     * <code>ListPhoneNumbersOptedOut</code> action to retrieve additional
     * records that are available after the first page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A <code>NextToken</code> string is used when you call the
     * <code>ListPhoneNumbersOptedOut</code> action to retrieve additional
     * records that are available after the first page of results.
     * </p>
     *
     * @return <p>
     *         A <code>NextToken</code> string is used when you call the
     *         <code>ListPhoneNumbersOptedOut</code> action to retrieve
     *         additional records that are available after the first page of
     *         results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A <code>NextToken</code> string is used when you call the
     * <code>ListPhoneNumbersOptedOut</code> action to retrieve additional
     * records that are available after the first page of results.
     * </p>
     *
     * @param nextToken <p>
     *            A <code>NextToken</code> string is used when you call the
     *            <code>ListPhoneNumbersOptedOut</code> action to retrieve
     *            additional records that are available after the first page of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A <code>NextToken</code> string is used when you call the
     * <code>ListPhoneNumbersOptedOut</code> action to retrieve additional
     * records that are available after the first page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A <code>NextToken</code> string is used when you call the
     *            <code>ListPhoneNumbersOptedOut</code> action to retrieve
     *            additional records that are available after the first page of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersOptedOutRequest withNextToken(String nextToken) {
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
            sb.append("nextToken: " + getNextToken());
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

        if (obj instanceof ListPhoneNumbersOptedOutRequest == false)
            return false;
        ListPhoneNumbersOptedOutRequest other = (ListPhoneNumbersOptedOutRequest) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
