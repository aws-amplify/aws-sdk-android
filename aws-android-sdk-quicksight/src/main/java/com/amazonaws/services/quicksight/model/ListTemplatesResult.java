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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

public class ListTemplatesResult implements Serializable {
    /**
     * <p>
     * A structure containing information about the templates in the list.
     * </p>
     */
    private java.util.List<TemplateSummary> templateSummaryList;

    /**
     * <p>
     * The token for the next set of results, or null if there are no more
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     */
    private Integer status;

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     */
    private String requestId;

    /**
     * <p>
     * A structure containing information about the templates in the list.
     * </p>
     *
     * @return <p>
     *         A structure containing information about the templates in the
     *         list.
     *         </p>
     */
    public java.util.List<TemplateSummary> getTemplateSummaryList() {
        return templateSummaryList;
    }

    /**
     * <p>
     * A structure containing information about the templates in the list.
     * </p>
     *
     * @param templateSummaryList <p>
     *            A structure containing information about the templates in the
     *            list.
     *            </p>
     */
    public void setTemplateSummaryList(java.util.Collection<TemplateSummary> templateSummaryList) {
        if (templateSummaryList == null) {
            this.templateSummaryList = null;
            return;
        }

        this.templateSummaryList = new java.util.ArrayList<TemplateSummary>(templateSummaryList);
    }

    /**
     * <p>
     * A structure containing information about the templates in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateSummaryList <p>
     *            A structure containing information about the templates in the
     *            list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesResult withTemplateSummaryList(TemplateSummary... templateSummaryList) {
        if (getTemplateSummaryList() == null) {
            this.templateSummaryList = new java.util.ArrayList<TemplateSummary>(
                    templateSummaryList.length);
        }
        for (TemplateSummary value : templateSummaryList) {
            this.templateSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A structure containing information about the templates in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateSummaryList <p>
     *            A structure containing information about the templates in the
     *            list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesResult withTemplateSummaryList(
            java.util.Collection<TemplateSummary> templateSummaryList) {
        setTemplateSummaryList(templateSummaryList);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more
     * results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results, or null if there are no
     *         more results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more
     * results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            more results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no more
     * results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results, or null if there are no
     *            more results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     *
     * @return <p>
     *         The HTTP status of the request.
     *         </p>
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * <p>
     * The HTTP status of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The HTTP status of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesResult withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     *
     * @return <p>
     *         The AWS request ID for this operation.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     *
     * @param requestId <p>
     *            The AWS request ID for this operation.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The AWS request ID for this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requestId <p>
     *            The AWS request ID for this operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTemplatesResult withRequestId(String requestId) {
        this.requestId = requestId;
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
        if (getTemplateSummaryList() != null)
            sb.append("TemplateSummaryList: " + getTemplateSummaryList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getRequestId() != null)
            sb.append("RequestId: " + getRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplateSummaryList() == null) ? 0 : getTemplateSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTemplatesResult == false)
            return false;
        ListTemplatesResult other = (ListTemplatesResult) obj;

        if (other.getTemplateSummaryList() == null ^ this.getTemplateSummaryList() == null)
            return false;
        if (other.getTemplateSummaryList() != null
                && other.getTemplateSummaryList().equals(this.getTemplateSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        return true;
    }
}
