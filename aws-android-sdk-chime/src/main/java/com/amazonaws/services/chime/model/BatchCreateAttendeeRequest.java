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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates up to 100 new attendees for an active Amazon Chime SDK meeting. For
 * more information about the Amazon Chime SDK, see <a
 * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using
 * the Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
 * </p>
 */
public class BatchCreateAttendeeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     */
    private String meetingId;

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     */
    private java.util.List<CreateAttendeeRequestItem> attendees;

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @return <p>
     *         The Amazon Chime SDK meeting ID.
     *         </p>
     */
    public String getMeetingId() {
        return meetingId;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @param meetingId <p>
     *            The Amazon Chime SDK meeting ID.
     *            </p>
     */
    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-fA-F0-9]{8}(?:-[a-fA-F0-9]{4}){3}-[a-fA-F0-9]{12}<br/>
     *
     * @param meetingId <p>
     *            The Amazon Chime SDK meeting ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateAttendeeRequest withMeetingId(String meetingId) {
        this.meetingId = meetingId;
        return this;
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     *
     * @return <p>
     *         The request containing the attendees to create.
     *         </p>
     */
    public java.util.List<CreateAttendeeRequestItem> getAttendees() {
        return attendees;
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     *
     * @param attendees <p>
     *            The request containing the attendees to create.
     *            </p>
     */
    public void setAttendees(java.util.Collection<CreateAttendeeRequestItem> attendees) {
        if (attendees == null) {
            this.attendees = null;
            return;
        }

        this.attendees = new java.util.ArrayList<CreateAttendeeRequestItem>(attendees);
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attendees <p>
     *            The request containing the attendees to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateAttendeeRequest withAttendees(CreateAttendeeRequestItem... attendees) {
        if (getAttendees() == null) {
            this.attendees = new java.util.ArrayList<CreateAttendeeRequestItem>(attendees.length);
        }
        for (CreateAttendeeRequestItem value : attendees) {
            this.attendees.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attendees <p>
     *            The request containing the attendees to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchCreateAttendeeRequest withAttendees(
            java.util.Collection<CreateAttendeeRequestItem> attendees) {
        setAttendees(attendees);
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
        if (getMeetingId() != null)
            sb.append("MeetingId: " + getMeetingId() + ",");
        if (getAttendees() != null)
            sb.append("Attendees: " + getAttendees());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeetingId() == null) ? 0 : getMeetingId().hashCode());
        hashCode = prime * hashCode + ((getAttendees() == null) ? 0 : getAttendees().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchCreateAttendeeRequest == false)
            return false;
        BatchCreateAttendeeRequest other = (BatchCreateAttendeeRequest) obj;

        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null
                && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        if (other.getAttendees() == null ^ this.getAttendees() == null)
            return false;
        if (other.getAttendees() != null
                && other.getAttendees().equals(this.getAttendees()) == false)
            return false;
        return true;
    }
}
