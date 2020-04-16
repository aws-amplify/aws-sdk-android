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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

public class DescribeActionTargetsResult implements Serializable {
    /**
     * <p>
     * A list of <code>ActionTarget</code> objects. Each object includes the
     * <code>ActionTargetArn</code>, <code>Description</code>, and
     * <code>Name</code> of a custom action target available in Security Hub.
     * </p>
     */
    private java.util.List<ActionTarget> actionTargets;

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>ActionTarget</code> objects. Each object includes the
     * <code>ActionTargetArn</code>, <code>Description</code>, and
     * <code>Name</code> of a custom action target available in Security Hub.
     * </p>
     *
     * @return <p>
     *         A list of <code>ActionTarget</code> objects. Each object includes
     *         the <code>ActionTargetArn</code>, <code>Description</code>, and
     *         <code>Name</code> of a custom action target available in Security
     *         Hub.
     *         </p>
     */
    public java.util.List<ActionTarget> getActionTargets() {
        return actionTargets;
    }

    /**
     * <p>
     * A list of <code>ActionTarget</code> objects. Each object includes the
     * <code>ActionTargetArn</code>, <code>Description</code>, and
     * <code>Name</code> of a custom action target available in Security Hub.
     * </p>
     *
     * @param actionTargets <p>
     *            A list of <code>ActionTarget</code> objects. Each object
     *            includes the <code>ActionTargetArn</code>,
     *            <code>Description</code>, and <code>Name</code> of a custom
     *            action target available in Security Hub.
     *            </p>
     */
    public void setActionTargets(java.util.Collection<ActionTarget> actionTargets) {
        if (actionTargets == null) {
            this.actionTargets = null;
            return;
        }

        this.actionTargets = new java.util.ArrayList<ActionTarget>(actionTargets);
    }

    /**
     * <p>
     * A list of <code>ActionTarget</code> objects. Each object includes the
     * <code>ActionTargetArn</code>, <code>Description</code>, and
     * <code>Name</code> of a custom action target available in Security Hub.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionTargets <p>
     *            A list of <code>ActionTarget</code> objects. Each object
     *            includes the <code>ActionTargetArn</code>,
     *            <code>Description</code>, and <code>Name</code> of a custom
     *            action target available in Security Hub.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeActionTargetsResult withActionTargets(ActionTarget... actionTargets) {
        if (getActionTargets() == null) {
            this.actionTargets = new java.util.ArrayList<ActionTarget>(actionTargets.length);
        }
        for (ActionTarget value : actionTargets) {
            this.actionTargets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ActionTarget</code> objects. Each object includes the
     * <code>ActionTargetArn</code>, <code>Description</code>, and
     * <code>Name</code> of a custom action target available in Security Hub.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actionTargets <p>
     *            A list of <code>ActionTarget</code> objects. Each object
     *            includes the <code>ActionTargetArn</code>,
     *            <code>Description</code>, and <code>Name</code> of a custom
     *            action target available in Security Hub.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeActionTargetsResult withActionTargets(
            java.util.Collection<ActionTarget> actionTargets) {
        setActionTargets(actionTargets);
        return this;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The pagination token to use to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token to use to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The pagination token to use to request the next page of
     *            results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeActionTargetsResult withNextToken(String nextToken) {
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
        if (getActionTargets() != null)
            sb.append("ActionTargets: " + getActionTargets() + ",");
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
                + ((getActionTargets() == null) ? 0 : getActionTargets().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeActionTargetsResult == false)
            return false;
        DescribeActionTargetsResult other = (DescribeActionTargetsResult) obj;

        if (other.getActionTargets() == null ^ this.getActionTargets() == null)
            return false;
        if (other.getActionTargets() != null
                && other.getActionTargets().equals(this.getActionTargets()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
