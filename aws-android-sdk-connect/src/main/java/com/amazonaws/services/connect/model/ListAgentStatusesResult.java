/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class ListAgentStatusesResult implements Serializable {
    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A summary of agent statuses.
     * </p>
     */
    private java.util.List<AgentStatusSummary> agentStatusSummaryList;

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
    public ListAgentStatusesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * A summary of agent statuses.
     * </p>
     *
     * @return <p>
     *         A summary of agent statuses.
     *         </p>
     */
    public java.util.List<AgentStatusSummary> getAgentStatusSummaryList() {
        return agentStatusSummaryList;
    }

    /**
     * <p>
     * A summary of agent statuses.
     * </p>
     *
     * @param agentStatusSummaryList <p>
     *            A summary of agent statuses.
     *            </p>
     */
    public void setAgentStatusSummaryList(
            java.util.Collection<AgentStatusSummary> agentStatusSummaryList) {
        if (agentStatusSummaryList == null) {
            this.agentStatusSummaryList = null;
            return;
        }

        this.agentStatusSummaryList = new java.util.ArrayList<AgentStatusSummary>(
                agentStatusSummaryList);
    }

    /**
     * <p>
     * A summary of agent statuses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentStatusSummaryList <p>
     *            A summary of agent statuses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAgentStatusesResult withAgentStatusSummaryList(
            AgentStatusSummary... agentStatusSummaryList) {
        if (getAgentStatusSummaryList() == null) {
            this.agentStatusSummaryList = new java.util.ArrayList<AgentStatusSummary>(
                    agentStatusSummaryList.length);
        }
        for (AgentStatusSummary value : agentStatusSummaryList) {
            this.agentStatusSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A summary of agent statuses.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param agentStatusSummaryList <p>
     *            A summary of agent statuses.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAgentStatusesResult withAgentStatusSummaryList(
            java.util.Collection<AgentStatusSummary> agentStatusSummaryList) {
        setAgentStatusSummaryList(agentStatusSummaryList);
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
        if (getAgentStatusSummaryList() != null)
            sb.append("AgentStatusSummaryList: " + getAgentStatusSummaryList());
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
                + ((getAgentStatusSummaryList() == null) ? 0 : getAgentStatusSummaryList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAgentStatusesResult == false)
            return false;
        ListAgentStatusesResult other = (ListAgentStatusesResult) obj;

        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getAgentStatusSummaryList() == null ^ this.getAgentStatusSummaryList() == null)
            return false;
        if (other.getAgentStatusSummaryList() != null
                && other.getAgentStatusSummaryList().equals(this.getAgentStatusSummaryList()) == false)
            return false;
        return true;
    }
}
