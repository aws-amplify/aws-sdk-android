/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ListPredefinedAttributesResult implements Serializable {
    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary of the predefined attributes.
     * </p>
     */
    private java.util.List<PredefinedAttributeSummary> predefinedAttributeSummaryList;

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
    public ListPredefinedAttributesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * Summary of the predefined attributes.
     * </p>
     *
     * @return <p>
     *         Summary of the predefined attributes.
     *         </p>
     */
    public java.util.List<PredefinedAttributeSummary> getPredefinedAttributeSummaryList() {
        return predefinedAttributeSummaryList;
    }

    /**
     * <p>
     * Summary of the predefined attributes.
     * </p>
     *
     * @param predefinedAttributeSummaryList <p>
     *            Summary of the predefined attributes.
     *            </p>
     */
    public void setPredefinedAttributeSummaryList(
            java.util.Collection<PredefinedAttributeSummary> predefinedAttributeSummaryList) {
        if (predefinedAttributeSummaryList == null) {
            this.predefinedAttributeSummaryList = null;
            return;
        }

        this.predefinedAttributeSummaryList = new java.util.ArrayList<PredefinedAttributeSummary>(
                predefinedAttributeSummaryList);
    }

    /**
     * <p>
     * Summary of the predefined attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predefinedAttributeSummaryList <p>
     *            Summary of the predefined attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPredefinedAttributesResult withPredefinedAttributeSummaryList(
            PredefinedAttributeSummary... predefinedAttributeSummaryList) {
        if (getPredefinedAttributeSummaryList() == null) {
            this.predefinedAttributeSummaryList = new java.util.ArrayList<PredefinedAttributeSummary>(
                    predefinedAttributeSummaryList.length);
        }
        for (PredefinedAttributeSummary value : predefinedAttributeSummaryList) {
            this.predefinedAttributeSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Summary of the predefined attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param predefinedAttributeSummaryList <p>
     *            Summary of the predefined attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPredefinedAttributesResult withPredefinedAttributeSummaryList(
            java.util.Collection<PredefinedAttributeSummary> predefinedAttributeSummaryList) {
        setPredefinedAttributeSummaryList(predefinedAttributeSummaryList);
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
        if (getPredefinedAttributeSummaryList() != null)
            sb.append("PredefinedAttributeSummaryList: " + getPredefinedAttributeSummaryList());
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
                + ((getPredefinedAttributeSummaryList() == null) ? 0
                        : getPredefinedAttributeSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPredefinedAttributesResult == false)
            return false;
        ListPredefinedAttributesResult other = (ListPredefinedAttributesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPredefinedAttributeSummaryList() == null
                ^ this.getPredefinedAttributeSummaryList() == null)
            return false;
        if (other.getPredefinedAttributeSummaryList() != null
                && other.getPredefinedAttributeSummaryList().equals(
                        this.getPredefinedAttributeSummaryList()) == false)
            return false;
        return true;
    }
}
