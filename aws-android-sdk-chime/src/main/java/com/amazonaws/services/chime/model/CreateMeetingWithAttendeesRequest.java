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
 * Creates a new Amazon Chime SDK meeting in the specified media Region, with
 * attendees. For more information about specifying media Regions, see <a href=
 * "https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html"
 * >Amazon Chime SDK Media Regions</a> in the <i>Amazon Chime Developer
 * Guide</i>. For more information about the Amazon Chime SDK, see <a
 * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using
 * the Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
 * </p>
 */
public class CreateMeetingWithAttendeesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier for the client request. Use a different token for
     * different meetings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     */
    private String externalMeetingId;

    /**
     * <p>
     * Reserved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     */
    private String meetingHostId;

    /**
     * <p>
     * The Region in which to create the meeting. Default:
     * <code>us-east-1</code>.
     * </p>
     * <p>
     * Available values: <code>ap-northeast-1</code>,
     * <code>ap-southeast-1</code>, <code>ap-southeast-2</code>,
     * <code>ca-central-1</code>, <code>eu-central-1</code>,
     * <code>eu-north-1</code>, <code>eu-west-1</code>, <code>eu-west-2</code>,
     * <code>eu-west-3</code>, <code>sa-east-1</code>, <code>us-east-1</code>,
     * <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     */
    private String mediaRegion;

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The configuration for resource targets to receive notifications when
     * Amazon Chime SDK meeting and attendee events occur. The Amazon Chime SDK
     * supports resource targets located in the US East (N. Virginia) AWS Region
     * (<code>us-east-1</code>).
     * </p>
     */
    private MeetingNotificationConfiguration notificationsConfiguration;

    /**
     * <p>
     * The request containing the attendees to create.
     * </p>
     */
    private java.util.List<CreateAttendeeRequestItem> attendees;

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for
     * different meetings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The unique identifier for the client request. Use a different
     *         token for different meetings.
     *         </p>
     */
    public String getClientRequestToken() {
        return clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for
     * different meetings.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            The unique identifier for the client request. Use a different
     *            token for different meetings.
     *            </p>
     */
    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the client request. Use a different token for
     * different meetings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[-_a-zA-Z0-9]*<br/>
     *
     * @param clientRequestToken <p>
     *            The unique identifier for the client request. Use a different
     *            token for different meetings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingWithAttendeesRequest withClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
        return this;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @return <p>
     *         The external meeting ID.
     *         </p>
     */
    public String getExternalMeetingId() {
        return externalMeetingId;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @param externalMeetingId <p>
     *            The external meeting ID.
     *            </p>
     */
    public void setExternalMeetingId(String externalMeetingId) {
        this.externalMeetingId = externalMeetingId;
    }

    /**
     * <p>
     * The external meeting ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @param externalMeetingId <p>
     *            The external meeting ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingWithAttendeesRequest withExternalMeetingId(String externalMeetingId) {
        this.externalMeetingId = externalMeetingId;
        return this;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @return <p>
     *         Reserved.
     *         </p>
     */
    public String getMeetingHostId() {
        return meetingHostId;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @param meetingHostId <p>
     *            Reserved.
     *            </p>
     */
    public void setMeetingHostId(String meetingHostId) {
        this.meetingHostId = meetingHostId;
    }

    /**
     * <p>
     * Reserved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     *
     * @param meetingHostId <p>
     *            Reserved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingWithAttendeesRequest withMeetingHostId(String meetingHostId) {
        this.meetingHostId = meetingHostId;
        return this;
    }

    /**
     * <p>
     * The Region in which to create the meeting. Default:
     * <code>us-east-1</code>.
     * </p>
     * <p>
     * Available values: <code>ap-northeast-1</code>,
     * <code>ap-southeast-1</code>, <code>ap-southeast-2</code>,
     * <code>ca-central-1</code>, <code>eu-central-1</code>,
     * <code>eu-north-1</code>, <code>eu-west-1</code>, <code>eu-west-2</code>,
     * <code>eu-west-3</code>, <code>sa-east-1</code>, <code>us-east-1</code>,
     * <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     *
     * @return <p>
     *         The Region in which to create the meeting. Default:
     *         <code>us-east-1</code>.
     *         </p>
     *         <p>
     *         Available values: <code>ap-northeast-1</code>,
     *         <code>ap-southeast-1</code>, <code>ap-southeast-2</code>,
     *         <code>ca-central-1</code>, <code>eu-central-1</code>,
     *         <code>eu-north-1</code>, <code>eu-west-1</code>,
     *         <code>eu-west-2</code>, <code>eu-west-3</code>,
     *         <code>sa-east-1</code>, <code>us-east-1</code>,
     *         <code>us-east-2</code>, <code>us-west-1</code>,
     *         <code>us-west-2</code>.
     *         </p>
     */
    public String getMediaRegion() {
        return mediaRegion;
    }

    /**
     * <p>
     * The Region in which to create the meeting. Default:
     * <code>us-east-1</code>.
     * </p>
     * <p>
     * Available values: <code>ap-northeast-1</code>,
     * <code>ap-southeast-1</code>, <code>ap-southeast-2</code>,
     * <code>ca-central-1</code>, <code>eu-central-1</code>,
     * <code>eu-north-1</code>, <code>eu-west-1</code>, <code>eu-west-2</code>,
     * <code>eu-west-3</code>, <code>sa-east-1</code>, <code>us-east-1</code>,
     * <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     *
     * @param mediaRegion <p>
     *            The Region in which to create the meeting. Default:
     *            <code>us-east-1</code>.
     *            </p>
     *            <p>
     *            Available values: <code>ap-northeast-1</code>,
     *            <code>ap-southeast-1</code>, <code>ap-southeast-2</code>,
     *            <code>ca-central-1</code>, <code>eu-central-1</code>,
     *            <code>eu-north-1</code>, <code>eu-west-1</code>,
     *            <code>eu-west-2</code>, <code>eu-west-3</code>,
     *            <code>sa-east-1</code>, <code>us-east-1</code>,
     *            <code>us-east-2</code>, <code>us-west-1</code>,
     *            <code>us-west-2</code>.
     *            </p>
     */
    public void setMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
    }

    /**
     * <p>
     * The Region in which to create the meeting. Default:
     * <code>us-east-1</code>.
     * </p>
     * <p>
     * Available values: <code>ap-northeast-1</code>,
     * <code>ap-southeast-1</code>, <code>ap-southeast-2</code>,
     * <code>ca-central-1</code>, <code>eu-central-1</code>,
     * <code>eu-north-1</code>, <code>eu-west-1</code>, <code>eu-west-2</code>,
     * <code>eu-west-3</code>, <code>sa-east-1</code>, <code>us-east-1</code>,
     * <code>us-east-2</code>, <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaRegion <p>
     *            The Region in which to create the meeting. Default:
     *            <code>us-east-1</code>.
     *            </p>
     *            <p>
     *            Available values: <code>ap-northeast-1</code>,
     *            <code>ap-southeast-1</code>, <code>ap-southeast-2</code>,
     *            <code>ca-central-1</code>, <code>eu-central-1</code>,
     *            <code>eu-north-1</code>, <code>eu-west-1</code>,
     *            <code>eu-west-2</code>, <code>eu-west-3</code>,
     *            <code>sa-east-1</code>, <code>us-east-1</code>,
     *            <code>us-east-2</code>, <code>us-west-1</code>,
     *            <code>us-west-2</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingWithAttendeesRequest withMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
        return this;
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     *
     * @return <p>
     *         The tag key-value pairs.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     *
     * @param tags <p>
     *            The tag key-value pairs.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag key-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingWithAttendeesRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tag key-value pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tag key-value pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingWithAttendeesRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when
     * Amazon Chime SDK meeting and attendee events occur. The Amazon Chime SDK
     * supports resource targets located in the US East (N. Virginia) AWS Region
     * (<code>us-east-1</code>).
     * </p>
     *
     * @return <p>
     *         The configuration for resource targets to receive notifications
     *         when Amazon Chime SDK meeting and attendee events occur. The
     *         Amazon Chime SDK supports resource targets located in the US East
     *         (N. Virginia) AWS Region (<code>us-east-1</code>).
     *         </p>
     */
    public MeetingNotificationConfiguration getNotificationsConfiguration() {
        return notificationsConfiguration;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when
     * Amazon Chime SDK meeting and attendee events occur. The Amazon Chime SDK
     * supports resource targets located in the US East (N. Virginia) AWS Region
     * (<code>us-east-1</code>).
     * </p>
     *
     * @param notificationsConfiguration <p>
     *            The configuration for resource targets to receive
     *            notifications when Amazon Chime SDK meeting and attendee
     *            events occur. The Amazon Chime SDK supports resource targets
     *            located in the US East (N. Virginia) AWS Region (
     *            <code>us-east-1</code>).
     *            </p>
     */
    public void setNotificationsConfiguration(
            MeetingNotificationConfiguration notificationsConfiguration) {
        this.notificationsConfiguration = notificationsConfiguration;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when
     * Amazon Chime SDK meeting and attendee events occur. The Amazon Chime SDK
     * supports resource targets located in the US East (N. Virginia) AWS Region
     * (<code>us-east-1</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationsConfiguration <p>
     *            The configuration for resource targets to receive
     *            notifications when Amazon Chime SDK meeting and attendee
     *            events occur. The Amazon Chime SDK supports resource targets
     *            located in the US East (N. Virginia) AWS Region (
     *            <code>us-east-1</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingWithAttendeesRequest withNotificationsConfiguration(
            MeetingNotificationConfiguration notificationsConfiguration) {
        this.notificationsConfiguration = notificationsConfiguration;
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
    public CreateMeetingWithAttendeesRequest withAttendees(CreateAttendeeRequestItem... attendees) {
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
    public CreateMeetingWithAttendeesRequest withAttendees(
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: " + getClientRequestToken() + ",");
        if (getExternalMeetingId() != null)
            sb.append("ExternalMeetingId: " + getExternalMeetingId() + ",");
        if (getMeetingHostId() != null)
            sb.append("MeetingHostId: " + getMeetingHostId() + ",");
        if (getMediaRegion() != null)
            sb.append("MediaRegion: " + getMediaRegion() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getNotificationsConfiguration() != null)
            sb.append("NotificationsConfiguration: " + getNotificationsConfiguration() + ",");
        if (getAttendees() != null)
            sb.append("Attendees: " + getAttendees());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode
                + ((getExternalMeetingId() == null) ? 0 : getExternalMeetingId().hashCode());
        hashCode = prime * hashCode
                + ((getMeetingHostId() == null) ? 0 : getMeetingHostId().hashCode());
        hashCode = prime * hashCode
                + ((getMediaRegion() == null) ? 0 : getMediaRegion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getNotificationsConfiguration() == null) ? 0 : getNotificationsConfiguration()
                        .hashCode());
        hashCode = prime * hashCode + ((getAttendees() == null) ? 0 : getAttendees().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMeetingWithAttendeesRequest == false)
            return false;
        CreateMeetingWithAttendeesRequest other = (CreateMeetingWithAttendeesRequest) obj;

        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null
                && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getExternalMeetingId() == null ^ this.getExternalMeetingId() == null)
            return false;
        if (other.getExternalMeetingId() != null
                && other.getExternalMeetingId().equals(this.getExternalMeetingId()) == false)
            return false;
        if (other.getMeetingHostId() == null ^ this.getMeetingHostId() == null)
            return false;
        if (other.getMeetingHostId() != null
                && other.getMeetingHostId().equals(this.getMeetingHostId()) == false)
            return false;
        if (other.getMediaRegion() == null ^ this.getMediaRegion() == null)
            return false;
        if (other.getMediaRegion() != null
                && other.getMediaRegion().equals(this.getMediaRegion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNotificationsConfiguration() == null
                ^ this.getNotificationsConfiguration() == null)
            return false;
        if (other.getNotificationsConfiguration() != null
                && other.getNotificationsConfiguration().equals(
                        this.getNotificationsConfiguration()) == false)
            return false;
        if (other.getAttendees() == null ^ this.getAttendees() == null)
            return false;
        if (other.getAttendees() != null
                && other.getAttendees().equals(this.getAttendees()) == false)
            return false;
        return true;
    }
}
