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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

public class GetLogEventsResult implements Serializable {
    /**
     * <p>
     * The events.
     * </p>
     */
    private java.util.List<OutputLogEvent> events;

    /**
     * <p>
     * The token for the next set of items in the forward direction. The token
     * expires after 24 hours. If you have reached the end of the stream, it
     * will return the same token you passed in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextForwardToken;

    /**
     * <p>
     * The token for the next set of items in the backward direction. The token
     * expires after 24 hours. This token will never be null. If you have
     * reached the end of the stream, it will return the same token you passed
     * in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextBackwardToken;

    /**
     * <p>
     * The events.
     * </p>
     *
     * @return <p>
     *         The events.
     *         </p>
     */
    public java.util.List<OutputLogEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * The events.
     * </p>
     *
     * @param events <p>
     *            The events.
     *            </p>
     */
    public void setEvents(java.util.Collection<OutputLogEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<OutputLogEvent>(events);
    }

    /**
     * <p>
     * The events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogEventsResult withEvents(OutputLogEvent... events) {
        if (getEvents() == null) {
            this.events = new java.util.ArrayList<OutputLogEvent>(events.length);
        }
        for (OutputLogEvent value : events) {
            this.events.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param events <p>
     *            The events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogEventsResult withEvents(java.util.Collection<OutputLogEvent> events) {
        setEvents(events);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items in the forward direction. The token
     * expires after 24 hours. If you have reached the end of the stream, it
     * will return the same token you passed in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The token for the next set of items in the forward direction. The
     *         token expires after 24 hours. If you have reached the end of the
     *         stream, it will return the same token you passed in.
     *         </p>
     */
    public String getNextForwardToken() {
        return nextForwardToken;
    }

    /**
     * <p>
     * The token for the next set of items in the forward direction. The token
     * expires after 24 hours. If you have reached the end of the stream, it
     * will return the same token you passed in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextForwardToken <p>
     *            The token for the next set of items in the forward direction.
     *            The token expires after 24 hours. If you have reached the end
     *            of the stream, it will return the same token you passed in.
     *            </p>
     */
    public void setNextForwardToken(String nextForwardToken) {
        this.nextForwardToken = nextForwardToken;
    }

    /**
     * <p>
     * The token for the next set of items in the forward direction. The token
     * expires after 24 hours. If you have reached the end of the stream, it
     * will return the same token you passed in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextForwardToken <p>
     *            The token for the next set of items in the forward direction.
     *            The token expires after 24 hours. If you have reached the end
     *            of the stream, it will return the same token you passed in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogEventsResult withNextForwardToken(String nextForwardToken) {
        this.nextForwardToken = nextForwardToken;
        return this;
    }

    /**
     * <p>
     * The token for the next set of items in the backward direction. The token
     * expires after 24 hours. This token will never be null. If you have
     * reached the end of the stream, it will return the same token you passed
     * in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The token for the next set of items in the backward direction.
     *         The token expires after 24 hours. This token will never be null.
     *         If you have reached the end of the stream, it will return the
     *         same token you passed in.
     *         </p>
     */
    public String getNextBackwardToken() {
        return nextBackwardToken;
    }

    /**
     * <p>
     * The token for the next set of items in the backward direction. The token
     * expires after 24 hours. This token will never be null. If you have
     * reached the end of the stream, it will return the same token you passed
     * in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextBackwardToken <p>
     *            The token for the next set of items in the backward direction.
     *            The token expires after 24 hours. This token will never be
     *            null. If you have reached the end of the stream, it will
     *            return the same token you passed in.
     *            </p>
     */
    public void setNextBackwardToken(String nextBackwardToken) {
        this.nextBackwardToken = nextBackwardToken;
    }

    /**
     * <p>
     * The token for the next set of items in the backward direction. The token
     * expires after 24 hours. This token will never be null. If you have
     * reached the end of the stream, it will return the same token you passed
     * in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextBackwardToken <p>
     *            The token for the next set of items in the backward direction.
     *            The token expires after 24 hours. This token will never be
     *            null. If you have reached the end of the stream, it will
     *            return the same token you passed in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetLogEventsResult withNextBackwardToken(String nextBackwardToken) {
        this.nextBackwardToken = nextBackwardToken;
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
        if (getEvents() != null)
            sb.append("events: " + getEvents() + ",");
        if (getNextForwardToken() != null)
            sb.append("nextForwardToken: " + getNextForwardToken() + ",");
        if (getNextBackwardToken() != null)
            sb.append("nextBackwardToken: " + getNextBackwardToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        hashCode = prime * hashCode
                + ((getNextForwardToken() == null) ? 0 : getNextForwardToken().hashCode());
        hashCode = prime * hashCode
                + ((getNextBackwardToken() == null) ? 0 : getNextBackwardToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetLogEventsResult == false)
            return false;
        GetLogEventsResult other = (GetLogEventsResult) obj;

        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        if (other.getNextForwardToken() == null ^ this.getNextForwardToken() == null)
            return false;
        if (other.getNextForwardToken() != null
                && other.getNextForwardToken().equals(this.getNextForwardToken()) == false)
            return false;
        if (other.getNextBackwardToken() == null ^ this.getNextBackwardToken() == null)
            return false;
        if (other.getNextBackwardToken() != null
                && other.getNextBackwardToken().equals(this.getNextBackwardToken()) == false)
            return false;
        return true;
    }
}
