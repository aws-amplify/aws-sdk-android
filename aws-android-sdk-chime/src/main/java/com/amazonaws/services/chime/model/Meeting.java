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
 * A meeting created using the Amazon Chime SDK.
 * </p>
 */
public class Meeting implements Serializable {
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
     * The external meeting ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     */
    private String externalMeetingId;

    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     */
    private MediaPlacement mediaPlacement;

    /**
     * <p>
     * The Region in which to create the meeting. Available values:
     * <code>ap-northeast-1</code>, <code>ap-southeast-1</code>,
     * <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     * <code>eu-central-1</code>, <code>eu-north-1</code>,
     * <code>eu-west-1</code>, <code>eu-west-2</code>, <code>eu-west-3</code>,
     * <code>sa-east-1</code>, <code>us-east-1</code>, <code>us-east-2</code>,
     * <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     */
    private String mediaRegion;

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
    public Meeting withMeetingId(String meetingId) {
        this.meetingId = meetingId;
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
    public Meeting withExternalMeetingId(String externalMeetingId) {
        this.externalMeetingId = externalMeetingId;
        return this;
    }

    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     *
     * @return <p>
     *         The media placement for the meeting.
     *         </p>
     */
    public MediaPlacement getMediaPlacement() {
        return mediaPlacement;
    }

    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     *
     * @param mediaPlacement <p>
     *            The media placement for the meeting.
     *            </p>
     */
    public void setMediaPlacement(MediaPlacement mediaPlacement) {
        this.mediaPlacement = mediaPlacement;
    }

    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaPlacement <p>
     *            The media placement for the meeting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Meeting withMediaPlacement(MediaPlacement mediaPlacement) {
        this.mediaPlacement = mediaPlacement;
        return this;
    }

    /**
     * <p>
     * The Region in which to create the meeting. Available values:
     * <code>ap-northeast-1</code>, <code>ap-southeast-1</code>,
     * <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     * <code>eu-central-1</code>, <code>eu-north-1</code>,
     * <code>eu-west-1</code>, <code>eu-west-2</code>, <code>eu-west-3</code>,
     * <code>sa-east-1</code>, <code>us-east-1</code>, <code>us-east-2</code>,
     * <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     *
     * @return <p>
     *         The Region in which to create the meeting. Available values:
     *         <code>ap-northeast-1</code>, <code>ap-southeast-1</code>,
     *         <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     *         <code>eu-central-1</code>, <code>eu-north-1</code>,
     *         <code>eu-west-1</code>, <code>eu-west-2</code>,
     *         <code>eu-west-3</code>, <code>sa-east-1</code>,
     *         <code>us-east-1</code>, <code>us-east-2</code>,
     *         <code>us-west-1</code>, <code>us-west-2</code>.
     *         </p>
     */
    public String getMediaRegion() {
        return mediaRegion;
    }

    /**
     * <p>
     * The Region in which to create the meeting. Available values:
     * <code>ap-northeast-1</code>, <code>ap-southeast-1</code>,
     * <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     * <code>eu-central-1</code>, <code>eu-north-1</code>,
     * <code>eu-west-1</code>, <code>eu-west-2</code>, <code>eu-west-3</code>,
     * <code>sa-east-1</code>, <code>us-east-1</code>, <code>us-east-2</code>,
     * <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     *
     * @param mediaRegion <p>
     *            The Region in which to create the meeting. Available values:
     *            <code>ap-northeast-1</code>, <code>ap-southeast-1</code>,
     *            <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     *            <code>eu-central-1</code>, <code>eu-north-1</code>,
     *            <code>eu-west-1</code>, <code>eu-west-2</code>,
     *            <code>eu-west-3</code>, <code>sa-east-1</code>,
     *            <code>us-east-1</code>, <code>us-east-2</code>,
     *            <code>us-west-1</code>, <code>us-west-2</code>.
     *            </p>
     */
    public void setMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
    }

    /**
     * <p>
     * The Region in which to create the meeting. Available values:
     * <code>ap-northeast-1</code>, <code>ap-southeast-1</code>,
     * <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     * <code>eu-central-1</code>, <code>eu-north-1</code>,
     * <code>eu-west-1</code>, <code>eu-west-2</code>, <code>eu-west-3</code>,
     * <code>sa-east-1</code>, <code>us-east-1</code>, <code>us-east-2</code>,
     * <code>us-west-1</code>, <code>us-west-2</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaRegion <p>
     *            The Region in which to create the meeting. Available values:
     *            <code>ap-northeast-1</code>, <code>ap-southeast-1</code>,
     *            <code>ap-southeast-2</code>, <code>ca-central-1</code>,
     *            <code>eu-central-1</code>, <code>eu-north-1</code>,
     *            <code>eu-west-1</code>, <code>eu-west-2</code>,
     *            <code>eu-west-3</code>, <code>sa-east-1</code>,
     *            <code>us-east-1</code>, <code>us-east-2</code>,
     *            <code>us-west-1</code>, <code>us-west-2</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Meeting withMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
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
        if (getExternalMeetingId() != null)
            sb.append("ExternalMeetingId: " + getExternalMeetingId() + ",");
        if (getMediaPlacement() != null)
            sb.append("MediaPlacement: " + getMediaPlacement() + ",");
        if (getMediaRegion() != null)
            sb.append("MediaRegion: " + getMediaRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeetingId() == null) ? 0 : getMeetingId().hashCode());
        hashCode = prime * hashCode
                + ((getExternalMeetingId() == null) ? 0 : getExternalMeetingId().hashCode());
        hashCode = prime * hashCode
                + ((getMediaPlacement() == null) ? 0 : getMediaPlacement().hashCode());
        hashCode = prime * hashCode
                + ((getMediaRegion() == null) ? 0 : getMediaRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Meeting == false)
            return false;
        Meeting other = (Meeting) obj;

        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null
                && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        if (other.getExternalMeetingId() == null ^ this.getExternalMeetingId() == null)
            return false;
        if (other.getExternalMeetingId() != null
                && other.getExternalMeetingId().equals(this.getExternalMeetingId()) == false)
            return false;
        if (other.getMediaPlacement() == null ^ this.getMediaPlacement() == null)
            return false;
        if (other.getMediaPlacement() != null
                && other.getMediaPlacement().equals(this.getMediaPlacement()) == false)
            return false;
        if (other.getMediaRegion() == null ^ this.getMediaRegion() == null)
            return false;
        if (other.getMediaRegion() != null
                && other.getMediaRegion().equals(this.getMediaRegion()) == false)
            return false;
        return true;
    }
}
