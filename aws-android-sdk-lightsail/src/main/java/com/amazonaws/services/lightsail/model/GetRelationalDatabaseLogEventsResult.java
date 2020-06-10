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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

public class GetRelationalDatabaseLogEventsResult implements Serializable {
    /**
     * <p>
     * An object describing the result of your get relational database log
     * events request.
     * </p>
     */
    private java.util.List<LogEvent> resourceLogEvents;

    /**
     * <p>
     * A token used for advancing to the previous page of results from your get
     * relational database log events request.
     * </p>
     */
    private String nextBackwardToken;

    /**
     * <p>
     * A token used for advancing to the next page of results from your get
     * relational database log events request.
     * </p>
     */
    private String nextForwardToken;

    /**
     * <p>
     * An object describing the result of your get relational database log
     * events request.
     * </p>
     *
     * @return <p>
     *         An object describing the result of your get relational database
     *         log events request.
     *         </p>
     */
    public java.util.List<LogEvent> getResourceLogEvents() {
        return resourceLogEvents;
    }

    /**
     * <p>
     * An object describing the result of your get relational database log
     * events request.
     * </p>
     *
     * @param resourceLogEvents <p>
     *            An object describing the result of your get relational
     *            database log events request.
     *            </p>
     */
    public void setResourceLogEvents(java.util.Collection<LogEvent> resourceLogEvents) {
        if (resourceLogEvents == null) {
            this.resourceLogEvents = null;
            return;
        }

        this.resourceLogEvents = new java.util.ArrayList<LogEvent>(resourceLogEvents);
    }

    /**
     * <p>
     * An object describing the result of your get relational database log
     * events request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceLogEvents <p>
     *            An object describing the result of your get relational
     *            database log events request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogEventsResult withResourceLogEvents(LogEvent... resourceLogEvents) {
        if (getResourceLogEvents() == null) {
            this.resourceLogEvents = new java.util.ArrayList<LogEvent>(resourceLogEvents.length);
        }
        for (LogEvent value : resourceLogEvents) {
            this.resourceLogEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An object describing the result of your get relational database log
     * events request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceLogEvents <p>
     *            An object describing the result of your get relational
     *            database log events request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogEventsResult withResourceLogEvents(
            java.util.Collection<LogEvent> resourceLogEvents) {
        setResourceLogEvents(resourceLogEvents);
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the previous page of results from your get
     * relational database log events request.
     * </p>
     *
     * @return <p>
     *         A token used for advancing to the previous page of results from
     *         your get relational database log events request.
     *         </p>
     */
    public String getNextBackwardToken() {
        return nextBackwardToken;
    }

    /**
     * <p>
     * A token used for advancing to the previous page of results from your get
     * relational database log events request.
     * </p>
     *
     * @param nextBackwardToken <p>
     *            A token used for advancing to the previous page of results
     *            from your get relational database log events request.
     *            </p>
     */
    public void setNextBackwardToken(String nextBackwardToken) {
        this.nextBackwardToken = nextBackwardToken;
    }

    /**
     * <p>
     * A token used for advancing to the previous page of results from your get
     * relational database log events request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextBackwardToken <p>
     *            A token used for advancing to the previous page of results
     *            from your get relational database log events request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogEventsResult withNextBackwardToken(String nextBackwardToken) {
        this.nextBackwardToken = nextBackwardToken;
        return this;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get
     * relational database log events request.
     * </p>
     *
     * @return <p>
     *         A token used for advancing to the next page of results from your
     *         get relational database log events request.
     *         </p>
     */
    public String getNextForwardToken() {
        return nextForwardToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get
     * relational database log events request.
     * </p>
     *
     * @param nextForwardToken <p>
     *            A token used for advancing to the next page of results from
     *            your get relational database log events request.
     *            </p>
     */
    public void setNextForwardToken(String nextForwardToken) {
        this.nextForwardToken = nextForwardToken;
    }

    /**
     * <p>
     * A token used for advancing to the next page of results from your get
     * relational database log events request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextForwardToken <p>
     *            A token used for advancing to the next page of results from
     *            your get relational database log events request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRelationalDatabaseLogEventsResult withNextForwardToken(String nextForwardToken) {
        this.nextForwardToken = nextForwardToken;
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
        if (getResourceLogEvents() != null)
            sb.append("resourceLogEvents: " + getResourceLogEvents() + ",");
        if (getNextBackwardToken() != null)
            sb.append("nextBackwardToken: " + getNextBackwardToken() + ",");
        if (getNextForwardToken() != null)
            sb.append("nextForwardToken: " + getNextForwardToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceLogEvents() == null) ? 0 : getResourceLogEvents().hashCode());
        hashCode = prime * hashCode
                + ((getNextBackwardToken() == null) ? 0 : getNextBackwardToken().hashCode());
        hashCode = prime * hashCode
                + ((getNextForwardToken() == null) ? 0 : getNextForwardToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRelationalDatabaseLogEventsResult == false)
            return false;
        GetRelationalDatabaseLogEventsResult other = (GetRelationalDatabaseLogEventsResult) obj;

        if (other.getResourceLogEvents() == null ^ this.getResourceLogEvents() == null)
            return false;
        if (other.getResourceLogEvents() != null
                && other.getResourceLogEvents().equals(this.getResourceLogEvents()) == false)
            return false;
        if (other.getNextBackwardToken() == null ^ this.getNextBackwardToken() == null)
            return false;
        if (other.getNextBackwardToken() != null
                && other.getNextBackwardToken().equals(this.getNextBackwardToken()) == false)
            return false;
        if (other.getNextForwardToken() == null ^ this.getNextForwardToken() == null)
            return false;
        if (other.getNextForwardToken() != null
                && other.getNextForwardToken().equals(this.getNextForwardToken()) == false)
            return false;
        return true;
    }
}
