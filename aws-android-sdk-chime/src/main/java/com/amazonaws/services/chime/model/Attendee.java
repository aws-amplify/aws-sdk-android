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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * An Amazon Chime SDK meeting attendee. Includes a unique
 * <code>AttendeeId</code> and <code>JoinToken</code>. The
 * <code>JoinToken</code> allows a client to authenticate and join as the
 * specified attendee. The <code>JoinToken</code> expires when the meeting ends
 * or when <a>DeleteAttendee</a> is called. After that, the attendee is unable
 * to join the meeting.
 * </p>
 * <p>
 * We recommend securely transferring each <code>JoinToken</code> from your
 * server application to the client so that no other client has access to the
 * token except for the one authorized to represent the attendee.
 * </p>
 */
public class Attendee implements Serializable {
    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     */
    private String externalUserId;

    /**
     * <p>
     * The Amazon Chime SDK attendee ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     */
    private String attendeeId;

    /**
     * <p>
     * The join token used by the Amazon Chime SDK attendee.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2048<br/>
     */
    private String joinToken;

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @return <p>
     *         The Amazon Chime SDK external user ID. Links the attendee to an
     *         identity managed by a builder application.
     *         </p>
     */
    public String getExternalUserId() {
        return externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @param externalUserId <p>
     *            The Amazon Chime SDK external user ID. Links the attendee to
     *            an identity managed by a builder application.
     *            </p>
     */
    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity
     * managed by a builder application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @param externalUserId <p>
     *            The Amazon Chime SDK external user ID. Links the attendee to
     *            an identity managed by a builder application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attendee withExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @return <p>
     *         The Amazon Chime SDK attendee ID.
     *         </p>
     */
    public String getAttendeeId() {
        return attendeeId;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @param attendeeId <p>
     *            The Amazon Chime SDK attendee ID.
     *            </p>
     */
    public void setAttendeeId(String attendeeId) {
        this.attendeeId = attendeeId;
    }

    /**
     * <p>
     * The Amazon Chime SDK attendee ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @param attendeeId <p>
     *            The Amazon Chime SDK attendee ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attendee withAttendeeId(String attendeeId) {
        this.attendeeId = attendeeId;
        return this;
    }

    /**
     * <p>
     * The join token used by the Amazon Chime SDK attendee.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2048<br/>
     *
     * @return <p>
     *         The join token used by the Amazon Chime SDK attendee.
     *         </p>
     */
    public String getJoinToken() {
        return joinToken;
    }

    /**
     * <p>
     * The join token used by the Amazon Chime SDK attendee.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2048<br/>
     *
     * @param joinToken <p>
     *            The join token used by the Amazon Chime SDK attendee.
     *            </p>
     */
    public void setJoinToken(String joinToken) {
        this.joinToken = joinToken;
    }

    /**
     * <p>
     * The join token used by the Amazon Chime SDK attendee.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2048<br/>
     *
     * @param joinToken <p>
     *            The join token used by the Amazon Chime SDK attendee.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attendee withJoinToken(String joinToken) {
        this.joinToken = joinToken;
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
        if (getExternalUserId() != null)
            sb.append("ExternalUserId: " + getExternalUserId() + ",");
        if (getAttendeeId() != null)
            sb.append("AttendeeId: " + getAttendeeId() + ",");
        if (getJoinToken() != null)
            sb.append("JoinToken: " + getJoinToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExternalUserId() == null) ? 0 : getExternalUserId().hashCode());
        hashCode = prime * hashCode + ((getAttendeeId() == null) ? 0 : getAttendeeId().hashCode());
        hashCode = prime * hashCode + ((getJoinToken() == null) ? 0 : getJoinToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attendee == false)
            return false;
        Attendee other = (Attendee) obj;

        if (other.getExternalUserId() == null ^ this.getExternalUserId() == null)
            return false;
        if (other.getExternalUserId() != null
                && other.getExternalUserId().equals(this.getExternalUserId()) == false)
            return false;
        if (other.getAttendeeId() == null ^ this.getAttendeeId() == null)
            return false;
        if (other.getAttendeeId() != null
                && other.getAttendeeId().equals(this.getAttendeeId()) == false)
            return false;
        if (other.getJoinToken() == null ^ this.getJoinToken() == null)
            return false;
        if (other.getJoinToken() != null
                && other.getJoinToken().equals(this.getJoinToken()) == false)
            return false;
        return true;
    }
}
