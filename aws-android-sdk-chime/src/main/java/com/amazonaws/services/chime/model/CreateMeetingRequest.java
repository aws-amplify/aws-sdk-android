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
 * Creates a new Amazon Chime SDK meeting in the specified media Region with no
 * initial attendees. For more information about specifying media Regions, see
 * <a href=
 * "https://docs.aws.amazon.com/chime/latest/dg/chime-sdk-meetings-regions.html"
 * >Amazon Chime SDK Media Regions</a> in the <i>Amazon Chime Developer
 * Guide</i>. For more information about the Amazon Chime SDK, see <a
 * href="https://docs.aws.amazon.com/chime/latest/dg/meetings-sdk.html">Using
 * the Amazon Chime SDK</a> in the <i>Amazon Chime Developer Guide</i>.
 * </p>
 */
public class CreateMeetingRequest extends AmazonWebServiceRequest implements Serializable {
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
     * meeting and attendee events occur.
     * </p>
     */
    private MeetingNotificationConfiguration notificationsConfiguration;

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
    public CreateMeetingRequest withClientRequestToken(String clientRequestToken) {
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
    public CreateMeetingRequest withExternalMeetingId(String externalMeetingId) {
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
    public CreateMeetingRequest withMeetingHostId(String meetingHostId) {
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
    public CreateMeetingRequest withMediaRegion(String mediaRegion) {
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
    public CreateMeetingRequest withTags(Tag... tags) {
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
    public CreateMeetingRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when
     * meeting and attendee events occur.
     * </p>
     *
     * @return <p>
     *         The configuration for resource targets to receive notifications
     *         when meeting and attendee events occur.
     *         </p>
     */
    public MeetingNotificationConfiguration getNotificationsConfiguration() {
        return notificationsConfiguration;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when
     * meeting and attendee events occur.
     * </p>
     *
     * @param notificationsConfiguration <p>
     *            The configuration for resource targets to receive
     *            notifications when meeting and attendee events occur.
     *            </p>
     */
    public void setNotificationsConfiguration(
            MeetingNotificationConfiguration notificationsConfiguration) {
        this.notificationsConfiguration = notificationsConfiguration;
    }

    /**
     * <p>
     * The configuration for resource targets to receive notifications when
     * meeting and attendee events occur.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notificationsConfiguration <p>
     *            The configuration for resource targets to receive
     *            notifications when meeting and attendee events occur.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateMeetingRequest withNotificationsConfiguration(
            MeetingNotificationConfiguration notificationsConfiguration) {
        this.notificationsConfiguration = notificationsConfiguration;
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
            sb.append("NotificationsConfiguration: " + getNotificationsConfiguration());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMeetingRequest == false)
            return false;
        CreateMeetingRequest other = (CreateMeetingRequest) obj;

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
        return true;
    }
}
