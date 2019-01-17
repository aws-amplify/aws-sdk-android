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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

public class ListTerminologiesResult implements Serializable {
    /**
     * <p>
     * The properties list of the custom terminologies returned on the list
     * request.
     * </p>
     */
    private java.util.List<TerminologyProperties> terminologyPropertiesList;

    /**
     * <p>
     * If the response to the ListTerminologies was truncated, the NextToken
     * fetches the next group of custom terminologies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The properties list of the custom terminologies returned on the list
     * request.
     * </p>
     *
     * @return <p>
     *         The properties list of the custom terminologies returned on the
     *         list request.
     *         </p>
     */
    public java.util.List<TerminologyProperties> getTerminologyPropertiesList() {
        return terminologyPropertiesList;
    }

    /**
     * <p>
     * The properties list of the custom terminologies returned on the list
     * request.
     * </p>
     *
     * @param terminologyPropertiesList <p>
     *            The properties list of the custom terminologies returned on
     *            the list request.
     *            </p>
     */
    public void setTerminologyPropertiesList(
            java.util.Collection<TerminologyProperties> terminologyPropertiesList) {
        if (terminologyPropertiesList == null) {
            this.terminologyPropertiesList = null;
            return;
        }

        this.terminologyPropertiesList = new java.util.ArrayList<TerminologyProperties>(
                terminologyPropertiesList);
    }

    /**
     * <p>
     * The properties list of the custom terminologies returned on the list
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyPropertiesList <p>
     *            The properties list of the custom terminologies returned on
     *            the list request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTerminologiesResult withTerminologyPropertiesList(
            TerminologyProperties... terminologyPropertiesList) {
        if (getTerminologyPropertiesList() == null) {
            this.terminologyPropertiesList = new java.util.ArrayList<TerminologyProperties>(
                    terminologyPropertiesList.length);
        }
        for (TerminologyProperties value : terminologyPropertiesList) {
            this.terminologyPropertiesList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The properties list of the custom terminologies returned on the list
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyPropertiesList <p>
     *            The properties list of the custom terminologies returned on
     *            the list request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTerminologiesResult withTerminologyPropertiesList(
            java.util.Collection<TerminologyProperties> terminologyPropertiesList) {
        setTerminologyPropertiesList(terminologyPropertiesList);
        return this;
    }

    /**
     * <p>
     * If the response to the ListTerminologies was truncated, the NextToken
     * fetches the next group of custom terminologies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @return <p>
     *         If the response to the ListTerminologies was truncated, the
     *         NextToken fetches the next group of custom terminologies.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the response to the ListTerminologies was truncated, the NextToken
     * fetches the next group of custom terminologies.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @param nextToken <p>
     *            If the response to the ListTerminologies was truncated, the
     *            NextToken fetches the next group of custom terminologies.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to the ListTerminologies was truncated, the NextToken
     * fetches the next group of custom terminologies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     * <b>Pattern: </b>\p{ASCII}{0,8192}<br/>
     *
     * @param nextToken <p>
     *            If the response to the ListTerminologies was truncated, the
     *            NextToken fetches the next group of custom terminologies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTerminologiesResult withNextToken(String nextToken) {
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
        if (getTerminologyPropertiesList() != null)
            sb.append("TerminologyPropertiesList: " + getTerminologyPropertiesList() + ",");
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
                + ((getTerminologyPropertiesList() == null) ? 0 : getTerminologyPropertiesList()
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

        if (obj instanceof ListTerminologiesResult == false)
            return false;
        ListTerminologiesResult other = (ListTerminologiesResult) obj;

        if (other.getTerminologyPropertiesList() == null
                ^ this.getTerminologyPropertiesList() == null)
            return false;
        if (other.getTerminologyPropertiesList() != null
                && other.getTerminologyPropertiesList().equals(this.getTerminologyPropertiesList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
