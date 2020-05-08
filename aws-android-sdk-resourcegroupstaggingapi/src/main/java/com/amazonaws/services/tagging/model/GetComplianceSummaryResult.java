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

package com.amazonaws.services.tagging.model;

import java.io.Serializable;

public class GetComplianceSummaryResult implements Serializable {
    /**
     * <p>
     * A table that shows counts of noncompliant resources.
     * </p>
     */
    private java.util.List<Summary> summaryList;

    /**
     * <p>
     * A string that indicates that the response contains more data than can be
     * returned in a single response. To receive additional data, specify this
     * string for the <code>PaginationToken</code> value in a subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String paginationToken;

    /**
     * <p>
     * A table that shows counts of noncompliant resources.
     * </p>
     *
     * @return <p>
     *         A table that shows counts of noncompliant resources.
     *         </p>
     */
    public java.util.List<Summary> getSummaryList() {
        return summaryList;
    }

    /**
     * <p>
     * A table that shows counts of noncompliant resources.
     * </p>
     *
     * @param summaryList <p>
     *            A table that shows counts of noncompliant resources.
     *            </p>
     */
    public void setSummaryList(java.util.Collection<Summary> summaryList) {
        if (summaryList == null) {
            this.summaryList = null;
            return;
        }

        this.summaryList = new java.util.ArrayList<Summary>(summaryList);
    }

    /**
     * <p>
     * A table that shows counts of noncompliant resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaryList <p>
     *            A table that shows counts of noncompliant resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryResult withSummaryList(Summary... summaryList) {
        if (getSummaryList() == null) {
            this.summaryList = new java.util.ArrayList<Summary>(summaryList.length);
        }
        for (Summary value : summaryList) {
            this.summaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A table that shows counts of noncompliant resources.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaryList <p>
     *            A table that shows counts of noncompliant resources.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryResult withSummaryList(java.util.Collection<Summary> summaryList) {
        setSummaryList(summaryList);
        return this;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be
     * returned in a single response. To receive additional data, specify this
     * string for the <code>PaginationToken</code> value in a subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @return <p>
     *         A string that indicates that the response contains more data than
     *         can be returned in a single response. To receive additional data,
     *         specify this string for the <code>PaginationToken</code> value in
     *         a subsequent request.
     *         </p>
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be
     * returned in a single response. To receive additional data, specify this
     * string for the <code>PaginationToken</code> value in a subsequent
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param paginationToken <p>
     *            A string that indicates that the response contains more data
     *            than can be returned in a single response. To receive
     *            additional data, specify this string for the
     *            <code>PaginationToken</code> value in a subsequent request.
     *            </p>
     */
    public void setPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more data than can be
     * returned in a single response. To receive additional data, specify this
     * string for the <code>PaginationToken</code> value in a subsequent
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     *
     * @param paginationToken <p>
     *            A string that indicates that the response contains more data
     *            than can be returned in a single response. To receive
     *            additional data, specify this string for the
     *            <code>PaginationToken</code> value in a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetComplianceSummaryResult withPaginationToken(String paginationToken) {
        this.paginationToken = paginationToken;
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
        if (getSummaryList() != null)
            sb.append("SummaryList: " + getSummaryList() + ",");
        if (getPaginationToken() != null)
            sb.append("PaginationToken: " + getPaginationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSummaryList() == null) ? 0 : getSummaryList().hashCode());
        hashCode = prime * hashCode
                + ((getPaginationToken() == null) ? 0 : getPaginationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComplianceSummaryResult == false)
            return false;
        GetComplianceSummaryResult other = (GetComplianceSummaryResult) obj;

        if (other.getSummaryList() == null ^ this.getSummaryList() == null)
            return false;
        if (other.getSummaryList() != null
                && other.getSummaryList().equals(this.getSummaryList()) == false)
            return false;
        if (other.getPaginationToken() == null ^ this.getPaginationToken() == null)
            return false;
        if (other.getPaginationToken() != null
                && other.getPaginationToken().equals(this.getPaginationToken()) == false)
            return false;
        return true;
    }
}
