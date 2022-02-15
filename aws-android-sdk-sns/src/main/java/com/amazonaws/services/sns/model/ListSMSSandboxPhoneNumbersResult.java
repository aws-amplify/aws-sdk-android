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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

public class ListSMSSandboxPhoneNumbersResult implements Serializable {
    /**
     * <p>
     * A list of the calling account's pending and verified phone numbers.
     * </p>
     */
    private java.util.List<SMSSandboxPhoneNumber> phoneNumbers = new java.util.ArrayList<SMSSandboxPhoneNumber>();

    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the
     * <code>ListSMSSandboxPhoneNumbersInput</code> operation if additional
     * pages of records are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the calling account's pending and verified phone numbers.
     * </p>
     *
     * @return <p>
     *         A list of the calling account's pending and verified phone
     *         numbers.
     *         </p>
     */
    public java.util.List<SMSSandboxPhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * <p>
     * A list of the calling account's pending and verified phone numbers.
     * </p>
     *
     * @param phoneNumbers <p>
     *            A list of the calling account's pending and verified phone
     *            numbers.
     *            </p>
     */
    public void setPhoneNumbers(java.util.Collection<SMSSandboxPhoneNumber> phoneNumbers) {
        if (phoneNumbers == null) {
            this.phoneNumbers = null;
            return;
        }

        this.phoneNumbers = new java.util.ArrayList<SMSSandboxPhoneNumber>(phoneNumbers);
    }

    /**
     * <p>
     * A list of the calling account's pending and verified phone numbers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumbers <p>
     *            A list of the calling account's pending and verified phone
     *            numbers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSMSSandboxPhoneNumbersResult withPhoneNumbers(SMSSandboxPhoneNumber... phoneNumbers) {
        if (getPhoneNumbers() == null) {
            this.phoneNumbers = new java.util.ArrayList<SMSSandboxPhoneNumber>(phoneNumbers.length);
        }
        for (SMSSandboxPhoneNumber value : phoneNumbers) {
            this.phoneNumbers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the calling account's pending and verified phone numbers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneNumbers <p>
     *            A list of the calling account's pending and verified phone
     *            numbers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSMSSandboxPhoneNumbersResult withPhoneNumbers(
            java.util.Collection<SMSSandboxPhoneNumber> phoneNumbers) {
        setPhoneNumbers(phoneNumbers);
        return this;
    }

    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the
     * <code>ListSMSSandboxPhoneNumbersInput</code> operation if additional
     * pages of records are available.
     * </p>
     *
     * @return <p>
     *         A <code>NextToken</code> string is returned when you call the
     *         <code>ListSMSSandboxPhoneNumbersInput</code> operation if
     *         additional pages of records are available.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the
     * <code>ListSMSSandboxPhoneNumbersInput</code> operation if additional
     * pages of records are available.
     * </p>
     *
     * @param nextToken <p>
     *            A <code>NextToken</code> string is returned when you call the
     *            <code>ListSMSSandboxPhoneNumbersInput</code> operation if
     *            additional pages of records are available.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A <code>NextToken</code> string is returned when you call the
     * <code>ListSMSSandboxPhoneNumbersInput</code> operation if additional
     * pages of records are available.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A <code>NextToken</code> string is returned when you call the
     *            <code>ListSMSSandboxPhoneNumbersInput</code> operation if
     *            additional pages of records are available.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListSMSSandboxPhoneNumbersResult withNextToken(String nextToken) {
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
        if (getPhoneNumbers() != null)
            sb.append("PhoneNumbers: " + getPhoneNumbers() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPhoneNumbers() == null) ? 0 : getPhoneNumbers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSMSSandboxPhoneNumbersResult == false)
            return false;
        ListSMSSandboxPhoneNumbersResult other = (ListSMSSandboxPhoneNumbersResult) obj;

        if (other.getPhoneNumbers() == null ^ this.getPhoneNumbers() == null)
            return false;
        if (other.getPhoneNumbers() != null
                && other.getPhoneNumbers().equals(this.getPhoneNumbers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
