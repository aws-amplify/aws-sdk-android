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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class ListEventTrackersResult implements Serializable {
    /**
     * <p>
     * A list of event trackers.
     * </p>
     */
    private java.util.List<EventTrackerSummary> eventTrackers;

    /**
     * <p>
     * A token for getting the next set of event trackers (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of event trackers.
     * </p>
     *
     * @return <p>
     *         A list of event trackers.
     *         </p>
     */
    public java.util.List<EventTrackerSummary> getEventTrackers() {
        return eventTrackers;
    }

    /**
     * <p>
     * A list of event trackers.
     * </p>
     *
     * @param eventTrackers <p>
     *            A list of event trackers.
     *            </p>
     */
    public void setEventTrackers(java.util.Collection<EventTrackerSummary> eventTrackers) {
        if (eventTrackers == null) {
            this.eventTrackers = null;
            return;
        }

        this.eventTrackers = new java.util.ArrayList<EventTrackerSummary>(eventTrackers);
    }

    /**
     * <p>
     * A list of event trackers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTrackers <p>
     *            A list of event trackers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEventTrackersResult withEventTrackers(EventTrackerSummary... eventTrackers) {
        if (getEventTrackers() == null) {
            this.eventTrackers = new java.util.ArrayList<EventTrackerSummary>(eventTrackers.length);
        }
        for (EventTrackerSummary value : eventTrackers) {
            this.eventTrackers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of event trackers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param eventTrackers <p>
     *            A list of event trackers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEventTrackersResult withEventTrackers(
            java.util.Collection<EventTrackerSummary> eventTrackers) {
        setEventTrackers(eventTrackers);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of event trackers (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @return <p>
     *         A token for getting the next set of event trackers (if they
     *         exist).
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of event trackers (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of event trackers (if they
     *            exist).
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of event trackers (if they exist).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of event trackers (if they
     *            exist).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListEventTrackersResult withNextToken(String nextToken) {
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
        if (getEventTrackers() != null)
            sb.append("eventTrackers: " + getEventTrackers() + ",");
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
                + ((getEventTrackers() == null) ? 0 : getEventTrackers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEventTrackersResult == false)
            return false;
        ListEventTrackersResult other = (ListEventTrackersResult) obj;

        if (other.getEventTrackers() == null ^ this.getEventTrackers() == null)
            return false;
        if (other.getEventTrackers() != null
                && other.getEventTrackers().equals(this.getEventTrackers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
