/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

public class DescribeScheduledActionsResult implements Serializable {
    /**
     * <p>
     * The scheduled actions.
     * </p>
     */
    private java.util.List<ScheduledUpdateGroupAction> scheduledUpdateGroupActions = new java.util.ArrayList<ScheduledUpdateGroupAction>();

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String nextToken;

    /**
     * <p>
     * The scheduled actions.
     * </p>
     *
     * @return <p>
     *         The scheduled actions.
     *         </p>
     */
    public java.util.List<ScheduledUpdateGroupAction> getScheduledUpdateGroupActions() {
        return scheduledUpdateGroupActions;
    }

    /**
     * <p>
     * The scheduled actions.
     * </p>
     *
     * @param scheduledUpdateGroupActions <p>
     *            The scheduled actions.
     *            </p>
     */
    public void setScheduledUpdateGroupActions(
            java.util.Collection<ScheduledUpdateGroupAction> scheduledUpdateGroupActions) {
        if (scheduledUpdateGroupActions == null) {
            this.scheduledUpdateGroupActions = null;
            return;
        }

        this.scheduledUpdateGroupActions = new java.util.ArrayList<ScheduledUpdateGroupAction>(
                scheduledUpdateGroupActions);
    }

    /**
     * <p>
     * The scheduled actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledUpdateGroupActions <p>
     *            The scheduled actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledActionsResult withScheduledUpdateGroupActions(
            ScheduledUpdateGroupAction... scheduledUpdateGroupActions) {
        if (getScheduledUpdateGroupActions() == null) {
            this.scheduledUpdateGroupActions = new java.util.ArrayList<ScheduledUpdateGroupAction>(
                    scheduledUpdateGroupActions.length);
        }
        for (ScheduledUpdateGroupAction value : scheduledUpdateGroupActions) {
            this.scheduledUpdateGroupActions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The scheduled actions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scheduledUpdateGroupActions <p>
     *            The scheduled actions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledActionsResult withScheduledUpdateGroupActions(
            java.util.Collection<ScheduledUpdateGroupAction> scheduledUpdateGroupActions) {
        setScheduledUpdateGroupActions(scheduledUpdateGroupActions);
        return this;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         A string that indicates that the response contains more items
     *         than can be returned in a single response. To receive additional
     *         items, specify this string for the <code>NextToken</code> value
     *         when requesting the next set of items. This value is null when
     *         there are no more items to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            A string that indicates that the response contains more items
     *            than can be returned in a single response. To receive
     *            additional items, specify this string for the
     *            <code>NextToken</code> value when requesting the next set of
     *            items. This value is null when there are no more items to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be
     * returned in a single response. To receive additional items, specify this
     * string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param nextToken <p>
     *            A string that indicates that the response contains more items
     *            than can be returned in a single response. To receive
     *            additional items, specify this string for the
     *            <code>NextToken</code> value when requesting the next set of
     *            items. This value is null when there are no more items to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeScheduledActionsResult withNextToken(String nextToken) {
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
        if (getScheduledUpdateGroupActions() != null)
            sb.append("ScheduledUpdateGroupActions: " + getScheduledUpdateGroupActions() + ",");
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
                + ((getScheduledUpdateGroupActions() == null) ? 0
                        : getScheduledUpdateGroupActions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeScheduledActionsResult == false)
            return false;
        DescribeScheduledActionsResult other = (DescribeScheduledActionsResult) obj;

        if (other.getScheduledUpdateGroupActions() == null
                ^ this.getScheduledUpdateGroupActions() == null)
            return false;
        if (other.getScheduledUpdateGroupActions() != null
                && other.getScheduledUpdateGroupActions().equals(
                        this.getScheduledUpdateGroupActions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
