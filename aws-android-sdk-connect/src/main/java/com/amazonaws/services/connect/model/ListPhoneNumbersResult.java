/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListPhoneNumbersResult implements Serializable {
    /**
     * <p>
     * Information about the phone numbers.
     * </p>
     */
    private java.util.List<PhoneNumberSummary> phoneNumberSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the phone numbers.
     * </p>
     *
     * @return <p>
     *         Information about the phone numbers.
     *         </p>
     */
    public java.util.List<PhoneNumberSummary> getPhoneNumberSummaryList() {
        return phoneNumberSummaryList;
    }

    /**
     * <p>
     * Information about the phone numbers.
     * </p>
     *
     * @param phoneNumberSummaryList <p>
     *            Information about the phone numbers.
     *            </p>
     */
    public void setPhoneNumberSummaryList(
            java.util.Collection<PhoneNumberSummary> phoneNumberSummaryList) {
        if (phoneNumberSummaryList == null) {
            this.phoneNumberSummaryList = null;
            return;
        }

        this.phoneNumberSummaryList = new java.util.ArrayList<PhoneNumberSummary>(
                phoneNumberSummaryList);
    }

    /**
     * <p>
     * Information about the phone numbers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberSummaryList <p>
     *            Information about the phone numbers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersResult withPhoneNumberSummaryList(
            PhoneNumberSummary... phoneNumberSummaryList) {
        if (getPhoneNumberSummaryList() == null) {
            this.phoneNumberSummaryList = new java.util.ArrayList<PhoneNumberSummary>(
                    phoneNumberSummaryList.length);
        }
        for (PhoneNumberSummary value : phoneNumberSummaryList) {
            this.phoneNumberSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the phone numbers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumberSummaryList <p>
     *            Information about the phone numbers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersResult withPhoneNumberSummaryList(
            java.util.Collection<PhoneNumberSummary> phoneNumberSummaryList) {
        setPhoneNumberSummaryList(phoneNumberSummaryList);
        return this;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @return <p>
     *         If there are additional results, this is the token for the next
     *         set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersResult withNextToken(String nextToken) {
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
        if (getPhoneNumberSummaryList() != null)
            sb.append("PhoneNumberSummaryList: " + getPhoneNumberSummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPhoneNumberSummaryList() == null) ? 0 : getPhoneNumberSummaryList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPhoneNumbersResult == false)
            return false;
        ListPhoneNumbersResult other = (ListPhoneNumbersResult) obj;

        if (other.getPhoneNumberSummaryList() == null ^ this.getPhoneNumberSummaryList() == null)
            return false;
        if (other.getPhoneNumberSummaryList() != null
                && other.getPhoneNumberSummaryList().equals(this.getPhoneNumberSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
