/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * A structure of time range that you want to search results.
 * </p>
 */
public class SearchContactsTimeRange implements Serializable {
    /**
     * <p>
     * The type of timestamp to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP
     */
    private String type;

    /**
     * <p>
     * The start time of the time range.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The end time of the time range.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The type of timestamp to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP
     *
     * @return <p>
     *         The type of timestamp to search.
     *         </p>
     * @see SearchContactsTimeRangeType
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The type of timestamp to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP
     *
     * @param type <p>
     *            The type of timestamp to search.
     *            </p>
     * @see SearchContactsTimeRangeType
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of timestamp to search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP
     *
     * @param type <p>
     *            The type of timestamp to search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchContactsTimeRangeType
     */
    public SearchContactsTimeRange withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The type of timestamp to search.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP
     *
     * @param type <p>
     *            The type of timestamp to search.
     *            </p>
     * @see SearchContactsTimeRangeType
     */
    public void setType(SearchContactsTimeRangeType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of timestamp to search.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIATION_TIMESTAMP, SCHEDULED_TIMESTAMP,
     * CONNECTED_TO_AGENT_TIMESTAMP, DISCONNECT_TIMESTAMP
     *
     * @param type <p>
     *            The type of timestamp to search.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SearchContactsTimeRangeType
     */
    public SearchContactsTimeRange withType(SearchContactsTimeRangeType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The start time of the time range.
     * </p>
     *
     * @return <p>
     *         The start time of the time range.
     *         </p>
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * <p>
     * The start time of the time range.
     * </p>
     *
     * @param startTime <p>
     *            The start time of the time range.
     *            </p>
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the time range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTime <p>
     *            The start time of the time range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchContactsTimeRange withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * <p>
     * The end time of the time range.
     * </p>
     *
     * @return <p>
     *         The end time of the time range.
     *         </p>
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * <p>
     * The end time of the time range.
     * </p>
     *
     * @param endTime <p>
     *            The end time of the time range.
     *            </p>
     */
    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the time range.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param endTime <p>
     *            The end time of the time range.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SearchContactsTimeRange withEndTime(java.util.Date endTime) {
        this.endTime = endTime;
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
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchContactsTimeRange == false)
            return false;
        SearchContactsTimeRange other = (SearchContactsTimeRange) obj;

        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }
}
