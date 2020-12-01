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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class ListUseCasesResult implements Serializable {
    /**
     * <p>
     * The use cases.
     * </p>
     */
    private java.util.List<UseCase> useCaseSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The use cases.
     * </p>
     *
     * @return <p>
     *         The use cases.
     *         </p>
     */
    public java.util.List<UseCase> getUseCaseSummaryList() {
        return useCaseSummaryList;
    }

    /**
     * <p>
     * The use cases.
     * </p>
     *
     * @param useCaseSummaryList <p>
     *            The use cases.
     *            </p>
     */
    public void setUseCaseSummaryList(java.util.Collection<UseCase> useCaseSummaryList) {
        if (useCaseSummaryList == null) {
            this.useCaseSummaryList = null;
            return;
        }

        this.useCaseSummaryList = new java.util.ArrayList<UseCase>(useCaseSummaryList);
    }

    /**
     * <p>
     * The use cases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useCaseSummaryList <p>
     *            The use cases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUseCasesResult withUseCaseSummaryList(UseCase... useCaseSummaryList) {
        if (getUseCaseSummaryList() == null) {
            this.useCaseSummaryList = new java.util.ArrayList<UseCase>(useCaseSummaryList.length);
        }
        for (UseCase value : useCaseSummaryList) {
            this.useCaseSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The use cases.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useCaseSummaryList <p>
     *            The use cases.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListUseCasesResult withUseCaseSummaryList(
            java.util.Collection<UseCase> useCaseSummaryList) {
        setUseCaseSummaryList(useCaseSummaryList);
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
    public ListUseCasesResult withNextToken(String nextToken) {
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
        if (getUseCaseSummaryList() != null)
            sb.append("UseCaseSummaryList: " + getUseCaseSummaryList() + ",");
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
                + ((getUseCaseSummaryList() == null) ? 0 : getUseCaseSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUseCasesResult == false)
            return false;
        ListUseCasesResult other = (ListUseCasesResult) obj;

        if (other.getUseCaseSummaryList() == null ^ this.getUseCaseSummaryList() == null)
            return false;
        if (other.getUseCaseSummaryList() != null
                && other.getUseCaseSummaryList().equals(this.getUseCaseSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
