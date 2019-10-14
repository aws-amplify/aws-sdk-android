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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about a session.
 * </p>
 */
public class Session implements Serializable {
    /**
     * <p>
     * The duration of the session, in milliseconds.
     * </p>
     */
    private Integer duration;

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The date and time when the session began.
     * </p>
     */
    private String startTimestamp;

    /**
     * <p>
     * The date and time when the session ended.
     * </p>
     */
    private String stopTimestamp;

    /**
     * <p>
     * The duration of the session, in milliseconds.
     * </p>
     *
     * @return <p>
     *         The duration of the session, in milliseconds.
     *         </p>
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration of the session, in milliseconds.
     * </p>
     *
     * @param duration <p>
     *            The duration of the session, in milliseconds.
     *            </p>
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the session, in milliseconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration of the session, in milliseconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the session.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     *
     * @param id <p>
     *            The unique identifier for the session.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The unique identifier for the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The date and time when the session began.
     * </p>
     *
     * @return <p>
     *         The date and time when the session began.
     *         </p>
     */
    public String getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * <p>
     * The date and time when the session began.
     * </p>
     *
     * @param startTimestamp <p>
     *            The date and time when the session began.
     *            </p>
     */
    public void setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The date and time when the session began.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimestamp <p>
     *            The date and time when the session began.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * <p>
     * The date and time when the session ended.
     * </p>
     *
     * @return <p>
     *         The date and time when the session ended.
     *         </p>
     */
    public String getStopTimestamp() {
        return stopTimestamp;
    }

    /**
     * <p>
     * The date and time when the session ended.
     * </p>
     *
     * @param stopTimestamp <p>
     *            The date and time when the session ended.
     *            </p>
     */
    public void setStopTimestamp(String stopTimestamp) {
        this.stopTimestamp = stopTimestamp;
    }

    /**
     * <p>
     * The date and time when the session ended.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stopTimestamp <p>
     *            The date and time when the session ended.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withStopTimestamp(String stopTimestamp) {
        this.stopTimestamp = stopTimestamp;
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
        if (getDuration() != null)
            sb.append("Duration: " + getDuration() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getStartTimestamp() != null)
            sb.append("StartTimestamp: " + getStartTimestamp() + ",");
        if (getStopTimestamp() != null)
            sb.append("StopTimestamp: " + getStopTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getStartTimestamp() == null) ? 0 : getStartTimestamp().hashCode());
        hashCode = prime * hashCode
                + ((getStopTimestamp() == null) ? 0 : getStopTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Session == false)
            return false;
        Session other = (Session) obj;

        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getStartTimestamp() == null ^ this.getStartTimestamp() == null)
            return false;
        if (other.getStartTimestamp() != null
                && other.getStartTimestamp().equals(this.getStartTimestamp()) == false)
            return false;
        if (other.getStopTimestamp() == null ^ this.getStopTimestamp() == null)
            return false;
        if (other.getStopTimestamp() != null
                && other.getStopTimestamp().equals(this.getStopTimestamp()) == false)
            return false;
        return true;
    }
}
