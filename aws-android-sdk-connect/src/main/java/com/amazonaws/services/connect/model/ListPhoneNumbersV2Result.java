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

public class ListPhoneNumbersV2Result implements Serializable {
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
     * Information about phone numbers that have been claimed to your Amazon
     * Connect instances or traffic distribution groups.
     * </p>
     */
    private java.util.List<ListPhoneNumbersSummary> listPhoneNumbersSummaryList;

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
    public ListPhoneNumbersV2Result withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Information about phone numbers that have been claimed to your Amazon
     * Connect instances or traffic distribution groups.
     * </p>
     *
     * @return <p>
     *         Information about phone numbers that have been claimed to your
     *         Amazon Connect instances or traffic distribution groups.
     *         </p>
     */
    public java.util.List<ListPhoneNumbersSummary> getListPhoneNumbersSummaryList() {
        return listPhoneNumbersSummaryList;
    }

    /**
     * <p>
     * Information about phone numbers that have been claimed to your Amazon
     * Connect instances or traffic distribution groups.
     * </p>
     *
     * @param listPhoneNumbersSummaryList <p>
     *            Information about phone numbers that have been claimed to your
     *            Amazon Connect instances or traffic distribution groups.
     *            </p>
     */
    public void setListPhoneNumbersSummaryList(
            java.util.Collection<ListPhoneNumbersSummary> listPhoneNumbersSummaryList) {
        if (listPhoneNumbersSummaryList == null) {
            this.listPhoneNumbersSummaryList = null;
            return;
        }

        this.listPhoneNumbersSummaryList = new java.util.ArrayList<ListPhoneNumbersSummary>(
                listPhoneNumbersSummaryList);
    }

    /**
     * <p>
     * Information about phone numbers that have been claimed to your Amazon
     * Connect instances or traffic distribution groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listPhoneNumbersSummaryList <p>
     *            Information about phone numbers that have been claimed to your
     *            Amazon Connect instances or traffic distribution groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersV2Result withListPhoneNumbersSummaryList(
            ListPhoneNumbersSummary... listPhoneNumbersSummaryList) {
        if (getListPhoneNumbersSummaryList() == null) {
            this.listPhoneNumbersSummaryList = new java.util.ArrayList<ListPhoneNumbersSummary>(
                    listPhoneNumbersSummaryList.length);
        }
        for (ListPhoneNumbersSummary value : listPhoneNumbersSummaryList) {
            this.listPhoneNumbersSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about phone numbers that have been claimed to your Amazon
     * Connect instances or traffic distribution groups.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listPhoneNumbersSummaryList <p>
     *            Information about phone numbers that have been claimed to your
     *            Amazon Connect instances or traffic distribution groups.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPhoneNumbersV2Result withListPhoneNumbersSummaryList(
            java.util.Collection<ListPhoneNumbersSummary> listPhoneNumbersSummaryList) {
        setListPhoneNumbersSummaryList(listPhoneNumbersSummaryList);
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
        if (getListPhoneNumbersSummaryList() != null)
            sb.append("ListPhoneNumbersSummaryList: " + getListPhoneNumbersSummaryList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getListPhoneNumbersSummaryList() == null) ? 0
                        : getListPhoneNumbersSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPhoneNumbersV2Result == false)
            return false;
        ListPhoneNumbersV2Result other = (ListPhoneNumbersV2Result) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getListPhoneNumbersSummaryList() == null
                ^ this.getListPhoneNumbersSummaryList() == null)
            return false;
        if (other.getListPhoneNumbersSummaryList() != null
                && other.getListPhoneNumbersSummaryList().equals(
                        this.getListPhoneNumbersSummaryList()) == false)
            return false;
        return true;
    }
}
