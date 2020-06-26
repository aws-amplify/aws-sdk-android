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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

public class ListStackSetsResult implements Serializable {
    /**
     * <p>
     * A list of <code>StackSetSummary</code> structures that contain
     * information about the user's stack sets.
     * </p>
     */
    private java.util.List<StackSetSummary> summaries;

    /**
     * <p>
     * If the request doesn't return all of the remaining results,
     * <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call <code>ListStackInstances</code> again and assign that token
     * to the request object's <code>NextToken</code> parameter. If the request
     * returns all results, <code>NextToken</code> is set to <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>StackSetSummary</code> structures that contain
     * information about the user's stack sets.
     * </p>
     *
     * @return <p>
     *         A list of <code>StackSetSummary</code> structures that contain
     *         information about the user's stack sets.
     *         </p>
     */
    public java.util.List<StackSetSummary> getSummaries() {
        return summaries;
    }

    /**
     * <p>
     * A list of <code>StackSetSummary</code> structures that contain
     * information about the user's stack sets.
     * </p>
     *
     * @param summaries <p>
     *            A list of <code>StackSetSummary</code> structures that contain
     *            information about the user's stack sets.
     *            </p>
     */
    public void setSummaries(java.util.Collection<StackSetSummary> summaries) {
        if (summaries == null) {
            this.summaries = null;
            return;
        }

        this.summaries = new java.util.ArrayList<StackSetSummary>(summaries);
    }

    /**
     * <p>
     * A list of <code>StackSetSummary</code> structures that contain
     * information about the user's stack sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaries <p>
     *            A list of <code>StackSetSummary</code> structures that contain
     *            information about the user's stack sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackSetsResult withSummaries(StackSetSummary... summaries) {
        if (getSummaries() == null) {
            this.summaries = new java.util.ArrayList<StackSetSummary>(summaries.length);
        }
        for (StackSetSummary value : summaries) {
            this.summaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>StackSetSummary</code> structures that contain
     * information about the user's stack sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summaries <p>
     *            A list of <code>StackSetSummary</code> structures that contain
     *            information about the user's stack sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackSetsResult withSummaries(java.util.Collection<StackSetSummary> summaries) {
        setSummaries(summaries);
        return this;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results,
     * <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call <code>ListStackInstances</code> again and assign that token
     * to the request object's <code>NextToken</code> parameter. If the request
     * returns all results, <code>NextToken</code> is set to <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         If the request doesn't return all of the remaining results,
     *         <code>NextToken</code> is set to a token. To retrieve the next
     *         set of results, call <code>ListStackInstances</code> again and
     *         assign that token to the request object's <code>NextToken</code>
     *         parameter. If the request returns all results,
     *         <code>NextToken</code> is set to <code>null</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results,
     * <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call <code>ListStackInstances</code> again and assign that token
     * to the request object's <code>NextToken</code> parameter. If the request
     * returns all results, <code>NextToken</code> is set to <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the request doesn't return all of the remaining results,
     *            <code>NextToken</code> is set to a token. To retrieve the next
     *            set of results, call <code>ListStackInstances</code> again and
     *            assign that token to the request object's
     *            <code>NextToken</code> parameter. If the request returns all
     *            results, <code>NextToken</code> is set to <code>null</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the request doesn't return all of the remaining results,
     * <code>NextToken</code> is set to a token. To retrieve the next set of
     * results, call <code>ListStackInstances</code> again and assign that token
     * to the request object's <code>NextToken</code> parameter. If the request
     * returns all results, <code>NextToken</code> is set to <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the request doesn't return all of the remaining results,
     *            <code>NextToken</code> is set to a token. To retrieve the next
     *            set of results, call <code>ListStackInstances</code> again and
     *            assign that token to the request object's
     *            <code>NextToken</code> parameter. If the request returns all
     *            results, <code>NextToken</code> is set to <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStackSetsResult withNextToken(String nextToken) {
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
        if (getSummaries() != null)
            sb.append("Summaries: " + getSummaries() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummaries() == null) ? 0 : getSummaries().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStackSetsResult == false)
            return false;
        ListStackSetsResult other = (ListStackSetsResult) obj;

        if (other.getSummaries() == null ^ this.getSummaries() == null)
            return false;
        if (other.getSummaries() != null
                && other.getSummaries().equals(this.getSummaries()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
