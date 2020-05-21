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

package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

public class ListReportsResult implements Serializable {
    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned
     * is the value specified in <code>maxResults</code>. If there more items in
     * the list, then a unique string called a <i>nextToken</i> is returned. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call. To get all of the items in the list,
     * keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of returned ARNs for the reports in the current AWS account.
     * </p>
     */
    private java.util.List<String> reports;

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned
     * is the value specified in <code>maxResults</code>. If there more items in
     * the list, then a unique string called a <i>nextToken</i> is returned. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call. To get all of the items in the list,
     * keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     *
     * @return <p>
     *         During a previous call, the maximum number of items that can be
     *         returned is the value specified in <code>maxResults</code>. If
     *         there more items in the list, then a unique string called a
     *         <i>nextToken</i> is returned. To get the next batch of items in
     *         the list, call this operation again, adding the next token to the
     *         call. To get all of the items in the list, keep calling this
     *         operation with each subsequent next token that is returned, until
     *         no more next tokens are returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned
     * is the value specified in <code>maxResults</code>. If there more items in
     * the list, then a unique string called a <i>nextToken</i> is returned. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call. To get all of the items in the list,
     * keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     *
     * @param nextToken <p>
     *            During a previous call, the maximum number of items that can
     *            be returned is the value specified in <code>maxResults</code>.
     *            If there more items in the list, then a unique string called a
     *            <i>nextToken</i> is returned. To get the next batch of items
     *            in the list, call this operation again, adding the next token
     *            to the call. To get all of the items in the list, keep calling
     *            this operation with each subsequent next token that is
     *            returned, until no more next tokens are returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * During a previous call, the maximum number of items that can be returned
     * is the value specified in <code>maxResults</code>. If there more items in
     * the list, then a unique string called a <i>nextToken</i> is returned. To
     * get the next batch of items in the list, call this operation again,
     * adding the next token to the call. To get all of the items in the list,
     * keep calling this operation with each subsequent next token that is
     * returned, until no more next tokens are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            During a previous call, the maximum number of items that can
     *            be returned is the value specified in <code>maxResults</code>.
     *            If there more items in the list, then a unique string called a
     *            <i>nextToken</i> is returned. To get the next batch of items
     *            in the list, call this operation again, adding the next token
     *            to the call. To get all of the items in the list, keep calling
     *            this operation with each subsequent next token that is
     *            returned, until no more next tokens are returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReportsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The list of returned ARNs for the reports in the current AWS account.
     * </p>
     *
     * @return <p>
     *         The list of returned ARNs for the reports in the current AWS
     *         account.
     *         </p>
     */
    public java.util.List<String> getReports() {
        return reports;
    }

    /**
     * <p>
     * The list of returned ARNs for the reports in the current AWS account.
     * </p>
     *
     * @param reports <p>
     *            The list of returned ARNs for the reports in the current AWS
     *            account.
     *            </p>
     */
    public void setReports(java.util.Collection<String> reports) {
        if (reports == null) {
            this.reports = null;
            return;
        }

        this.reports = new java.util.ArrayList<String>(reports);
    }

    /**
     * <p>
     * The list of returned ARNs for the reports in the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reports <p>
     *            The list of returned ARNs for the reports in the current AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReportsResult withReports(String... reports) {
        if (getReports() == null) {
            this.reports = new java.util.ArrayList<String>(reports.length);
        }
        for (String value : reports) {
            this.reports.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of returned ARNs for the reports in the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reports <p>
     *            The list of returned ARNs for the reports in the current AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListReportsResult withReports(java.util.Collection<String> reports) {
        setReports(reports);
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
            sb.append("nextToken: " + getNextToken() + ",");
        if (getReports() != null)
            sb.append("reports: " + getReports());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getReports() == null) ? 0 : getReports().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReportsResult == false)
            return false;
        ListReportsResult other = (ListReportsResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getReports() == null ^ this.getReports() == null)
            return false;
        if (other.getReports() != null && other.getReports().equals(this.getReports()) == false)
            return false;
        return true;
    }
}
