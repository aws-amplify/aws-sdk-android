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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

public class AdminListUserAuthEventsResult implements Serializable {
    /**
     * <p>
     * The response object. It includes the <code>EventID</code>,
     * <code>EventType</code>, <code>CreationDate</code>, <code>EventRisk</code>
     * , and <code>EventResponse</code>.
     * </p>
     */
    private java.util.List<AuthEventType> authEvents;

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The response object. It includes the <code>EventID</code>,
     * <code>EventType</code>, <code>CreationDate</code>, <code>EventRisk</code>
     * , and <code>EventResponse</code>.
     * </p>
     *
     * @return <p>
     *         The response object. It includes the <code>EventID</code>,
     *         <code>EventType</code>, <code>CreationDate</code>,
     *         <code>EventRisk</code>, and <code>EventResponse</code>.
     *         </p>
     */
    public java.util.List<AuthEventType> getAuthEvents() {
        return authEvents;
    }

    /**
     * <p>
     * The response object. It includes the <code>EventID</code>,
     * <code>EventType</code>, <code>CreationDate</code>, <code>EventRisk</code>
     * , and <code>EventResponse</code>.
     * </p>
     *
     * @param authEvents <p>
     *            The response object. It includes the <code>EventID</code>,
     *            <code>EventType</code>, <code>CreationDate</code>,
     *            <code>EventRisk</code>, and <code>EventResponse</code>.
     *            </p>
     */
    public void setAuthEvents(java.util.Collection<AuthEventType> authEvents) {
        if (authEvents == null) {
            this.authEvents = null;
            return;
        }

        this.authEvents = new java.util.ArrayList<AuthEventType>(authEvents);
    }

    /**
     * <p>
     * The response object. It includes the <code>EventID</code>,
     * <code>EventType</code>, <code>CreationDate</code>, <code>EventRisk</code>
     * , and <code>EventResponse</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authEvents <p>
     *            The response object. It includes the <code>EventID</code>,
     *            <code>EventType</code>, <code>CreationDate</code>,
     *            <code>EventRisk</code>, and <code>EventResponse</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminListUserAuthEventsResult withAuthEvents(AuthEventType... authEvents) {
        if (getAuthEvents() == null) {
            this.authEvents = new java.util.ArrayList<AuthEventType>(authEvents.length);
        }
        for (AuthEventType value : authEvents) {
            this.authEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The response object. It includes the <code>EventID</code>,
     * <code>EventType</code>, <code>CreationDate</code>, <code>EventRisk</code>
     * , and <code>EventResponse</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param authEvents <p>
     *            The response object. It includes the <code>EventID</code>,
     *            <code>EventType</code>, <code>CreationDate</code>,
     *            <code>EventRisk</code>, and <code>EventResponse</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminListUserAuthEventsResult withAuthEvents(
            java.util.Collection<AuthEventType> authEvents) {
        setAuthEvents(authEvents);
        return this;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         A pagination token.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken <p>
     *            A pagination token.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param nextToken <p>
     *            A pagination token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminListUserAuthEventsResult withNextToken(String nextToken) {
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
        if (getAuthEvents() != null)
            sb.append("AuthEvents: " + getAuthEvents() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthEvents() == null) ? 0 : getAuthEvents().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminListUserAuthEventsResult == false)
            return false;
        AdminListUserAuthEventsResult other = (AdminListUserAuthEventsResult) obj;

        if (other.getAuthEvents() == null ^ this.getAuthEvents() == null)
            return false;
        if (other.getAuthEvents() != null
                && other.getAuthEvents().equals(this.getAuthEvents()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
