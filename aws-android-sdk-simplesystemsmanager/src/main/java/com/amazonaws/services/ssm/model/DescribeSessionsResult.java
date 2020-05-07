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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

public class DescribeSessionsResult implements Serializable {
    /**
     * <p>
     * A list of sessions meeting the request parameters.
     * </p>
     */
    private java.util.List<Session> sessions;

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of sessions meeting the request parameters.
     * </p>
     *
     * @return <p>
     *         A list of sessions meeting the request parameters.
     *         </p>
     */
    public java.util.List<Session> getSessions() {
        return sessions;
    }

    /**
     * <p>
     * A list of sessions meeting the request parameters.
     * </p>
     *
     * @param sessions <p>
     *            A list of sessions meeting the request parameters.
     *            </p>
     */
    public void setSessions(java.util.Collection<Session> sessions) {
        if (sessions == null) {
            this.sessions = null;
            return;
        }

        this.sessions = new java.util.ArrayList<Session>(sessions);
    }

    /**
     * <p>
     * A list of sessions meeting the request parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessions <p>
     *            A list of sessions meeting the request parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSessionsResult withSessions(Session... sessions) {
        if (getSessions() == null) {
            this.sessions = new java.util.ArrayList<Session>(sessions.length);
        }
        for (Session value : sessions) {
            this.sessions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of sessions meeting the request parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sessions <p>
     *            A list of sessions meeting the request parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSessionsResult withSessions(java.util.Collection<Session> sessions) {
        setSessions(sessions);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     *
     * @return <p>
     *         The token for the next set of items to return. (You received this
     *         token from a previous call.)
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of items to return. (You received
     *            this token from a previous call.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSessionsResult withNextToken(String nextToken) {
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
        if (getSessions() != null)
            sb.append("Sessions: " + getSessions() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSessions() == null) ? 0 : getSessions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSessionsResult == false)
            return false;
        DescribeSessionsResult other = (DescribeSessionsResult) obj;

        if (other.getSessions() == null ^ this.getSessions() == null)
            return false;
        if (other.getSessions() != null && other.getSessions().equals(this.getSessions()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
