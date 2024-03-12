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
 * A meeting created using the Amazon Chime SDK.
 * </p>
 */
public class Meeting implements Serializable {
    /**
     * <p>
     * The Amazon Web Services Region in which you create the meeting.
     * </p>
     */
    private String mediaRegion;

    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     */
    private MediaPlacement mediaPlacement;

    /**
     * <p>
     * The configuration settings of the features available to a meeting.
     * </p>
     */
    private MeetingFeaturesConfiguration meetingFeatures;

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     */
    private String meetingId;

    /**
     * <p>
     * The Amazon Web Services Region in which you create the meeting.
     * </p>
     *
     * @return <p>
     *         The Amazon Web Services Region in which you create the meeting.
     *         </p>
     */
    public String getMediaRegion() {
        return mediaRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which you create the meeting.
     * </p>
     *
     * @param mediaRegion <p>
     *            The Amazon Web Services Region in which you create the
     *            meeting.
     *            </p>
     */
    public void setMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which you create the meeting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaRegion <p>
     *            The Amazon Web Services Region in which you create the
     *            meeting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Meeting withMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
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
     * The configuration settings of the features available to a meeting.
     * </p>
     *
     * @return <p>
     *         The configuration settings of the features available to a
     *         meeting.
     *         </p>
     */
    public MeetingFeaturesConfiguration getMeetingFeatures() {
        return meetingFeatures;
    }

    /**
     * <p>
     * The configuration settings of the features available to a meeting.
     * </p>
     *
     * @param meetingFeatures <p>
     *            The configuration settings of the features available to a
     *            meeting.
     *            </p>
     */
    public void setMeetingFeatures(MeetingFeaturesConfiguration meetingFeatures) {
        this.meetingFeatures = meetingFeatures;
    }

    /**
     * <p>
     * The configuration settings of the features available to a meeting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param meetingFeatures <p>
     *            The configuration settings of the features available to a
     *            meeting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Meeting withMeetingFeatures(MeetingFeaturesConfiguration meetingFeatures) {
        this.meetingFeatures = meetingFeatures;
        return this;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
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
        if (getMediaRegion() != null)
            sb.append("MediaRegion: " + getMediaRegion() + ",");
        if (getMediaPlacement() != null)
            sb.append("MediaPlacement: " + getMediaPlacement() + ",");
        if (getMeetingFeatures() != null)
            sb.append("MeetingFeatures: " + getMeetingFeatures() + ",");
        if (getMeetingId() != null)
            sb.append("MeetingId: " + getMeetingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMediaRegion() == null) ? 0 : getMediaRegion().hashCode());
        hashCode = prime * hashCode
                + ((getMediaPlacement() == null) ? 0 : getMediaPlacement().hashCode());
        hashCode = prime * hashCode
                + ((getMeetingFeatures() == null) ? 0 : getMeetingFeatures().hashCode());
        hashCode = prime * hashCode + ((getMeetingId() == null) ? 0 : getMeetingId().hashCode());
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

        if (other.getMediaRegion() == null ^ this.getMediaRegion() == null)
            return false;
        if (other.getMediaRegion() != null
                && other.getMediaRegion().equals(this.getMediaRegion()) == false)
            return false;
        if (other.getMediaPlacement() == null ^ this.getMediaPlacement() == null)
            return false;
        if (other.getMediaPlacement() != null
                && other.getMediaPlacement().equals(this.getMediaPlacement()) == false)
            return false;
        if (other.getMeetingFeatures() == null ^ this.getMeetingFeatures() == null)
            return false;
        if (other.getMeetingFeatures() != null
                && other.getMeetingFeatures().equals(this.getMeetingFeatures()) == false)
            return false;
        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null
                && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        return true;
    }
}
