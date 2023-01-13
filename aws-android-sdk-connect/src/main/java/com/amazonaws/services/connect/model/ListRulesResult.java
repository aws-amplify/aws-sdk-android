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

public class ListRulesResult implements Serializable {
    /**
     * <p>
     * Summary information about a rule.
     * </p>
     */
    private java.util.List<RuleSummary> ruleSummaryList;

    /**
     * <p>
     * If there are additional results, this is the token for the next set of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Summary information about a rule.
     * </p>
     *
     * @return <p>
     *         Summary information about a rule.
     *         </p>
     */
    public java.util.List<RuleSummary> getRuleSummaryList() {
        return ruleSummaryList;
    }

    /**
     * <p>
     * Summary information about a rule.
     * </p>
     *
     * @param ruleSummaryList <p>
     *            Summary information about a rule.
     *            </p>
     */
    public void setRuleSummaryList(java.util.Collection<RuleSummary> ruleSummaryList) {
        if (ruleSummaryList == null) {
            this.ruleSummaryList = null;
            return;
        }

        this.ruleSummaryList = new java.util.ArrayList<RuleSummary>(ruleSummaryList);
    }

    /**
     * <p>
     * Summary information about a rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleSummaryList <p>
     *            Summary information about a rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRulesResult withRuleSummaryList(RuleSummary... ruleSummaryList) {
        if (getRuleSummaryList() == null) {
            this.ruleSummaryList = new java.util.ArrayList<RuleSummary>(ruleSummaryList.length);
        }
        for (RuleSummary value : ruleSummaryList) {
            this.ruleSummaryList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Summary information about a rule.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ruleSummaryList <p>
     *            Summary information about a rule.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListRulesResult withRuleSummaryList(java.util.Collection<RuleSummary> ruleSummaryList) {
        setRuleSummaryList(ruleSummaryList);
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
    public ListRulesResult withNextToken(String nextToken) {
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
        if (getRuleSummaryList() != null)
            sb.append("RuleSummaryList: " + getRuleSummaryList() + ",");
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
                + ((getRuleSummaryList() == null) ? 0 : getRuleSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRulesResult == false)
            return false;
        ListRulesResult other = (ListRulesResult) obj;

        if (other.getRuleSummaryList() == null ^ this.getRuleSummaryList() == null)
            return false;
        if (other.getRuleSummaryList() != null
                && other.getRuleSummaryList().equals(this.getRuleSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
