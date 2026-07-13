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
 * Information required to join the call.
 * </p>
 */
public class ConnectionData implements Serializable {
    /**
     * <p>
     * The attendee information, including attendee ID and join token.
     * </p>
     */
    private Attendee attendee;

    /**
     * <p>
     * A meeting created using the Amazon Chime SDK.
     * </p>
     */
    private Meeting meeting;

    /**
     * <p>
     * The attendee information, including attendee ID and join token.
     * </p>
     *
     * @return <p>
     *         The attendee information, including attendee ID and join token.
     *         </p>
     */
    public Attendee getAttendee() {
        return attendee;
    }

    /**
     * <p>
     * The attendee information, including attendee ID and join token.
     * </p>
     *
     * @param attendee <p>
     *            The attendee information, including attendee ID and join
     *            token.
     *            </p>
     */
    public void setAttendee(Attendee attendee) {
        this.attendee = attendee;
    }

    /**
     * <p>
     * The attendee information, including attendee ID and join token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attendee <p>
     *            The attendee information, including attendee ID and join
     *            token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionData withAttendee(Attendee attendee) {
        this.attendee = attendee;
        return this;
    }

    /**
     * <p>
     * A meeting created using the Amazon Chime SDK.
     * </p>
     *
     * @return <p>
     *         A meeting created using the Amazon Chime SDK.
     *         </p>
     */
    public Meeting getMeeting() {
        return meeting;
    }

    /**
     * <p>
     * A meeting created using the Amazon Chime SDK.
     * </p>
     *
     * @param meeting <p>
     *            A meeting created using the Amazon Chime SDK.
     *            </p>
     */
    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    /**
     * <p>
     * A meeting created using the Amazon Chime SDK.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meeting <p>
     *            A meeting created using the Amazon Chime SDK.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConnectionData withMeeting(Meeting meeting) {
        this.meeting = meeting;
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
        if (getAttendee() != null)
            sb.append("Attendee: " + getAttendee() + ",");
        if (getMeeting() != null)
            sb.append("Meeting: " + getMeeting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttendee() == null) ? 0 : getAttendee().hashCode());
        hashCode = prime * hashCode + ((getMeeting() == null) ? 0 : getMeeting().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectionData == false)
            return false;
        ConnectionData other = (ConnectionData) obj;

        if (other.getAttendee() == null ^ this.getAttendee() == null)
            return false;
        if (other.getAttendee() != null && other.getAttendee().equals(this.getAttendee()) == false)
            return false;
        if (other.getMeeting() == null ^ this.getMeeting() == null)
            return false;
        if (other.getMeeting() != null && other.getMeeting().equals(this.getMeeting()) == false)
            return false;
        return true;
    }
}
