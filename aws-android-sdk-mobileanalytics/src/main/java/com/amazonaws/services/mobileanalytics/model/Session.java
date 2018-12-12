/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.mobileanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the session. Session information is required on ALL events.
 * </p>
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class Session implements Serializable {
    /**
     * <p>
     * A unique identifier for the session
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private String id;

    /**
     * <p>
     * The duration of the session.
     * </p>
     */
    private Long duration;

    /**
     * <p>
     * The time the event started in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     */
    private String startTimestamp;

    /**
     * <p>
     * The time the event terminated in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     */
    private String stopTimestamp;

    /**
     * <p>
     * A unique identifier for the session
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return <p>
     *         A unique identifier for the session
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * A unique identifier for the session
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param id <p>
     *            A unique identifier for the session
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * A unique identifier for the session
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param id <p>
     *            A unique identifier for the session
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
     * The duration of the session.
     * </p>
     *
     * @return <p>
     *         The duration of the session.
     *         </p>
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * <p>
     * The duration of the session.
     * </p>
     *
     * @param duration <p>
     *            The duration of the session.
     *            </p>
     */
    public void setDuration(Long duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The duration of the session.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param duration <p>
     *            The duration of the session.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Session withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * <p>
     * The time the event started in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     *
     * @return <p>
     *         The time the event started in ISO 8601 standard date time format.
     *         For example, 2014-06-30T19:07:47.885Z
     *         </p>
     */
    public String getStartTimestamp() {
        return startTimestamp;
    }

    /**
     * <p>
     * The time the event started in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     *
     * @param startTimestamp <p>
     *            The time the event started in ISO 8601 standard date time
     *            format. For example, 2014-06-30T19:07:47.885Z
     *            </p>
     */
    public void setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    /**
     * <p>
     * The time the event started in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param startTimestamp <p>
     *            The time the event started in ISO 8601 standard date time
     *            format. For example, 2014-06-30T19:07:47.885Z
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
     * The time the event terminated in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     *
     * @return <p>
     *         The time the event terminated in ISO 8601 standard date time
     *         format. For example, 2014-06-30T19:07:47.885Z
     *         </p>
     */
    public String getStopTimestamp() {
        return stopTimestamp;
    }

    /**
     * <p>
     * The time the event terminated in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     *
     * @param stopTimestamp <p>
     *            The time the event terminated in ISO 8601 standard date time
     *            format. For example, 2014-06-30T19:07:47.885Z
     *            </p>
     */
    public void setStopTimestamp(String stopTimestamp) {
        this.stopTimestamp = stopTimestamp;
    }

    /**
     * <p>
     * The time the event terminated in ISO 8601 standard date time format. For
     * example, 2014-06-30T19:07:47.885Z
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stopTimestamp <p>
     *            The time the event terminated in ISO 8601 standard date time
     *            format. For example, 2014-06-30T19:07:47.885Z
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getDuration() != null)
            sb.append("duration: " + getDuration() + ",");
        if (getStartTimestamp() != null)
            sb.append("startTimestamp: " + getStartTimestamp() + ",");
        if (getStopTimestamp() != null)
            sb.append("stopTimestamp: " + getStopTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
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

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
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
