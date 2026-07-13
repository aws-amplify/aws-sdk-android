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

public class ListFlowAssociationsResult implements Serializable {
    /**
     * <p>
     * Summary of flow associations.
     * </p>
     */
    private java.util.List<FlowAssociationSummary> flowAssociationSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary of flow associations.
     * </p>
     *
     * @return <p>
     *         Summary of flow associations.
     *         </p>
     */
    public java.util.List<FlowAssociationSummary> getFlowAssociationSummaryList() {
        return flowAssociationSummaryList;
    }

    /**
     * <p>
     * Summary of flow associations.
     * </p>
     *
     * @param flowAssociationSummaryList <p>
     *            Summary of flow associations.
     *            </p>
     */
    public void setFlowAssociationSummaryList(
            java.util.Collection<FlowAssociationSummary> flowAssociationSummaryList) {
        if (flowAssociationSummaryList == null) {
            this.flowAssociationSummaryList = null;
            return;
        }

        this.flowAssociationSummaryList = new java.util.ArrayList<FlowAssociationSummary>(
                flowAssociationSummaryList);
    }

    /**
     * <p>
     * Summary of flow associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowAssociationSummaryList <p>
     *            Summary of flow associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFlowAssociationsResult withFlowAssociationSummaryList(
            FlowAssociationSummary... flowAssociationSummaryList) {
        if (getFlowAssociationSummaryList() == null) {
            this.flowAssociationSummaryList = new java.util.ArrayList<FlowAssociationSummary>(
                    flowAssociationSummaryList.length);
        }
        for (FlowAssociationSummary value : flowAssociationSummaryList) {
            this.flowAssociationSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Summary of flow associations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowAssociationSummaryList <p>
     *            Summary of flow associations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListFlowAssociationsResult withFlowAssociationSummaryList(
            java.util.Collection<FlowAssociationSummary> flowAssociationSummaryList) {
        setFlowAssociationSummaryList(flowAssociationSummaryList);
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
    public ListFlowAssociationsResult withNextToken(String nextToken) {
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
        if (getFlowAssociationSummaryList() != null)
            sb.append("FlowAssociationSummaryList: " + getFlowAssociationSummaryList() + ",");
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
                + ((getFlowAssociationSummaryList() == null) ? 0 : getFlowAssociationSummaryList()
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

        if (obj instanceof ListFlowAssociationsResult == false)
            return false;
        ListFlowAssociationsResult other = (ListFlowAssociationsResult) obj;

        if (other.getFlowAssociationSummaryList() == null
                ^ this.getFlowAssociationSummaryList() == null)
            return false;
        if (other.getFlowAssociationSummaryList() != null
                && other.getFlowAssociationSummaryList().equals(
                        this.getFlowAssociationSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
