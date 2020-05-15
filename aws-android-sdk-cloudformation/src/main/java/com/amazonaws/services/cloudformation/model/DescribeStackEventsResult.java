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

/**
 * <p>
 * The output for a <a>DescribeStackEvents</a> action.
 * </p>
 */
public class DescribeStackEventsResult implements Serializable {
    /**
     * <p>
     * A list of <code>StackEvents</code> structures.
     * </p>
     */
    private java.util.List<StackEvent> stackEvents;

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next
     * page of events. If no additional page exists, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of <code>StackEvents</code> structures.
     * </p>
     *
     * @return <p>
     *         A list of <code>StackEvents</code> structures.
     *         </p>
     */
    public java.util.List<StackEvent> getStackEvents() {
        return stackEvents;
    }

    /**
     * <p>
     * A list of <code>StackEvents</code> structures.
     * </p>
     *
     * @param stackEvents <p>
     *            A list of <code>StackEvents</code> structures.
     *            </p>
     */
    public void setStackEvents(java.util.Collection<StackEvent> stackEvents) {
        if (stackEvents == null) {
            this.stackEvents = null;
            return;
        }

        this.stackEvents = new java.util.ArrayList<StackEvent>(stackEvents);
    }

    /**
     * <p>
     * A list of <code>StackEvents</code> structures.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackEvents <p>
     *            A list of <code>StackEvents</code> structures.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackEventsResult withStackEvents(StackEvent... stackEvents) {
        if (getStackEvents() == null) {
            this.stackEvents = new java.util.ArrayList<StackEvent>(stackEvents.length);
        }
        for (StackEvent value : stackEvents) {
            this.stackEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>StackEvents</code> structures.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackEvents <p>
     *            A list of <code>StackEvents</code> structures.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackEventsResult withStackEvents(java.util.Collection<StackEvent> stackEvents) {
        setStackEvents(stackEvents);
        return this;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next
     * page of events. If no additional page exists, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         If the output exceeds 1 MB in size, a string that identifies the
     *         next page of events. If no additional page exists, this value is
     *         null.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next
     * page of events. If no additional page exists, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the output exceeds 1 MB in size, a string that identifies
     *            the next page of events. If no additional page exists, this
     *            value is null.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next
     * page of events. If no additional page exists, this value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the output exceeds 1 MB in size, a string that identifies
     *            the next page of events. If no additional page exists, this
     *            value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeStackEventsResult withNextToken(String nextToken) {
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
        if (getStackEvents() != null)
            sb.append("StackEvents: " + getStackEvents() + ",");
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
                + ((getStackEvents() == null) ? 0 : getStackEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackEventsResult == false)
            return false;
        DescribeStackEventsResult other = (DescribeStackEventsResult) obj;

        if (other.getStackEvents() == null ^ this.getStackEvents() == null)
            return false;
        if (other.getStackEvents() != null
                && other.getStackEvents().equals(this.getStackEvents()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
