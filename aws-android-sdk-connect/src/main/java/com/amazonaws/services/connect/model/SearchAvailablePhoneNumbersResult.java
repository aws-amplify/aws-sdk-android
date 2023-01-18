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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class SearchAvailablePhoneNumbersResult implements Serializable {
    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of available phone numbers that you can claim to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     */
    private java.util.List<AvailableNumberSummary> availableNumbersList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100000<br/>
     *
     * @param nextToken <p>
     *            If there are additional results, this is the token for the
     *            next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A list of available phone numbers that you can claim to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     *
     * @return <p>
     *         A list of available phone numbers that you can claim to your
     *         Amazon Connect instance or traffic distribution group.
     *         </p>
     */
    public java.util.List<AvailableNumberSummary> getAvailableNumbersList() {
        return availableNumbersList;
    }

    /**
     * <p>
     * A list of available phone numbers that you can claim to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     *
     * @param availableNumbersList <p>
     *            A list of available phone numbers that you can claim to your
     *            Amazon Connect instance or traffic distribution group.
     *            </p>
     */
    public void setAvailableNumbersList(
            java.util.Collection<AvailableNumberSummary> availableNumbersList) {
        if (availableNumbersList == null) {
            this.availableNumbersList = null;
            return;
        }

        this.availableNumbersList = new java.util.ArrayList<AvailableNumberSummary>(
                availableNumbersList);
    }

    /**
     * <p>
     * A list of available phone numbers that you can claim to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableNumbersList <p>
     *            A list of available phone numbers that you can claim to your
     *            Amazon Connect instance or traffic distribution group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersResult withAvailableNumbersList(
            AvailableNumberSummary... availableNumbersList) {
        if (getAvailableNumbersList() == null) {
            this.availableNumbersList = new java.util.ArrayList<AvailableNumberSummary>(
                    availableNumbersList.length);
        }
        for (AvailableNumberSummary value : availableNumbersList) {
            this.availableNumbersList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of available phone numbers that you can claim to your Amazon
     * Connect instance or traffic distribution group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableNumbersList <p>
     *            A list of available phone numbers that you can claim to your
     *            Amazon Connect instance or traffic distribution group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchAvailablePhoneNumbersResult withAvailableNumbersList(
            java.util.Collection<AvailableNumberSummary> availableNumbersList) {
        setAvailableNumbersList(availableNumbersList);
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
        if (getAvailableNumbersList() != null)
            sb.append("AvailableNumbersList: " + getAvailableNumbersList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getAvailableNumbersList() == null) ? 0 : getAvailableNumbersList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchAvailablePhoneNumbersResult == false)
            return false;
        SearchAvailablePhoneNumbersResult other = (SearchAvailablePhoneNumbersResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAvailableNumbersList() == null ^ this.getAvailableNumbersList() == null)
            return false;
        if (other.getAvailableNumbersList() != null
                && other.getAvailableNumbersList().equals(this.getAvailableNumbersList()) == false)
            return false;
        return true;
    }
}
