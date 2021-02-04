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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class ListDetectMitigationActionsExecutionsResult implements Serializable {
    /**
     * <p>
     * List of actions executions.
     * </p>
     */
    private java.util.List<DetectMitigationActionExecution> actionsExecutions;

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * List of actions executions.
     * </p>
     *
     * @return <p>
     *         List of actions executions.
     *         </p>
     */
    public java.util.List<DetectMitigationActionExecution> getActionsExecutions() {
        return actionsExecutions;
    }

    /**
     * <p>
     * List of actions executions.
     * </p>
     *
     * @param actionsExecutions <p>
     *            List of actions executions.
     *            </p>
     */
    public void setActionsExecutions(
            java.util.Collection<DetectMitigationActionExecution> actionsExecutions) {
        if (actionsExecutions == null) {
            this.actionsExecutions = null;
            return;
        }

        this.actionsExecutions = new java.util.ArrayList<DetectMitigationActionExecution>(
                actionsExecutions);
    }

    /**
     * <p>
     * List of actions executions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionsExecutions <p>
     *            List of actions executions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectMitigationActionsExecutionsResult withActionsExecutions(
            DetectMitigationActionExecution... actionsExecutions) {
        if (getActionsExecutions() == null) {
            this.actionsExecutions = new java.util.ArrayList<DetectMitigationActionExecution>(
                    actionsExecutions.length);
        }
        for (DetectMitigationActionExecution value : actionsExecutions) {
            this.actionsExecutions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of actions executions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionsExecutions <p>
     *            List of actions executions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectMitigationActionsExecutionsResult withActionsExecutions(
            java.util.Collection<DetectMitigationActionExecution> actionsExecutions) {
        setActionsExecutions(actionsExecutions);
        return this;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @return <p>
     *         A token that can be used to retrieve the next set of results, or
     *         <code>null</code> if there are no additional results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that can be used to retrieve the next set of results, or
     * <code>null</code> if there are no additional results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A token that can be used to retrieve the next set of results,
     *            or <code>null</code> if there are no additional results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDetectMitigationActionsExecutionsResult withNextToken(String nextToken) {
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
        if (getActionsExecutions() != null)
            sb.append("actionsExecutions: " + getActionsExecutions() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActionsExecutions() == null) ? 0 : getActionsExecutions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDetectMitigationActionsExecutionsResult == false)
            return false;
        ListDetectMitigationActionsExecutionsResult other = (ListDetectMitigationActionsExecutionsResult) obj;

        if (other.getActionsExecutions() == null ^ this.getActionsExecutions() == null)
            return false;
        if (other.getActionsExecutions() != null
                && other.getActionsExecutions().equals(this.getActionsExecutions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
