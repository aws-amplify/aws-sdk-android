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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Settings for SCC caption output.
 */
public class SccDestinationSettings implements Serializable {
    /**
     * Set Framerate (SccDestinationFramerate) to make sure that the captions
     * and the video are synchronized in the output. Specify a frame rate that
     * matches the frame rate of the associated video. If the video frame rate
     * is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the
     * video has video_insertion=true and drop_frame_timecode=true; otherwise,
     * choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_25,
     * FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME
     */
    private String framerate;

    /**
     * Set Framerate (SccDestinationFramerate) to make sure that the captions
     * and the video are synchronized in the output. Specify a frame rate that
     * matches the frame rate of the associated video. If the video frame rate
     * is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the
     * video has video_insertion=true and drop_frame_timecode=true; otherwise,
     * choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_25,
     * FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME
     *
     * @return Set Framerate (SccDestinationFramerate) to make sure that the
     *         captions and the video are synchronized in the output. Specify a
     *         frame rate that matches the frame rate of the associated video.
     *         If the video frame rate is 29.97, choose 29.97 dropframe
     *         (FRAMERATE_29_97_DROPFRAME) only if the video has
     *         video_insertion=true and drop_frame_timecode=true; otherwise,
     *         choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
     * @see SccDestinationFramerate
     */
    public String getFramerate() {
        return framerate;
    }

    /**
     * Set Framerate (SccDestinationFramerate) to make sure that the captions
     * and the video are synchronized in the output. Specify a frame rate that
     * matches the frame rate of the associated video. If the video frame rate
     * is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the
     * video has video_insertion=true and drop_frame_timecode=true; otherwise,
     * choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_25,
     * FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME
     *
     * @param framerate Set Framerate (SccDestinationFramerate) to make sure
     *            that the captions and the video are synchronized in the
     *            output. Specify a frame rate that matches the frame rate of
     *            the associated video. If the video frame rate is 29.97, choose
     *            29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video
     *            has video_insertion=true and drop_frame_timecode=true;
     *            otherwise, choose 29.97 non-dropframe
     *            (FRAMERATE_29_97_NON_DROPFRAME).
     * @see SccDestinationFramerate
     */
    public void setFramerate(String framerate) {
        this.framerate = framerate;
    }

    /**
     * Set Framerate (SccDestinationFramerate) to make sure that the captions
     * and the video are synchronized in the output. Specify a frame rate that
     * matches the frame rate of the associated video. If the video frame rate
     * is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the
     * video has video_insertion=true and drop_frame_timecode=true; otherwise,
     * choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_25,
     * FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME
     *
     * @param framerate Set Framerate (SccDestinationFramerate) to make sure
     *            that the captions and the video are synchronized in the
     *            output. Specify a frame rate that matches the frame rate of
     *            the associated video. If the video frame rate is 29.97, choose
     *            29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video
     *            has video_insertion=true and drop_frame_timecode=true;
     *            otherwise, choose 29.97 non-dropframe
     *            (FRAMERATE_29_97_NON_DROPFRAME).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SccDestinationFramerate
     */
    public SccDestinationSettings withFramerate(String framerate) {
        this.framerate = framerate;
        return this;
    }

    /**
     * Set Framerate (SccDestinationFramerate) to make sure that the captions
     * and the video are synchronized in the output. Specify a frame rate that
     * matches the frame rate of the associated video. If the video frame rate
     * is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the
     * video has video_insertion=true and drop_frame_timecode=true; otherwise,
     * choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_25,
     * FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME
     *
     * @param framerate Set Framerate (SccDestinationFramerate) to make sure
     *            that the captions and the video are synchronized in the
     *            output. Specify a frame rate that matches the frame rate of
     *            the associated video. If the video frame rate is 29.97, choose
     *            29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video
     *            has video_insertion=true and drop_frame_timecode=true;
     *            otherwise, choose 29.97 non-dropframe
     *            (FRAMERATE_29_97_NON_DROPFRAME).
     * @see SccDestinationFramerate
     */
    public void setFramerate(SccDestinationFramerate framerate) {
        this.framerate = framerate.toString();
    }

    /**
     * Set Framerate (SccDestinationFramerate) to make sure that the captions
     * and the video are synchronized in the output. Specify a frame rate that
     * matches the frame rate of the associated video. If the video frame rate
     * is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the
     * video has video_insertion=true and drop_frame_timecode=true; otherwise,
     * choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMERATE_23_97, FRAMERATE_24, FRAMERATE_25,
     * FRAMERATE_29_97_DROPFRAME, FRAMERATE_29_97_NON_DROPFRAME
     *
     * @param framerate Set Framerate (SccDestinationFramerate) to make sure
     *            that the captions and the video are synchronized in the
     *            output. Specify a frame rate that matches the frame rate of
     *            the associated video. If the video frame rate is 29.97, choose
     *            29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video
     *            has video_insertion=true and drop_frame_timecode=true;
     *            otherwise, choose 29.97 non-dropframe
     *            (FRAMERATE_29_97_NON_DROPFRAME).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SccDestinationFramerate
     */
    public SccDestinationSettings withFramerate(SccDestinationFramerate framerate) {
        this.framerate = framerate.toString();
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
        if (getFramerate() != null)
            sb.append("Framerate: " + getFramerate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFramerate() == null) ? 0 : getFramerate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SccDestinationSettings == false)
            return false;
        SccDestinationSettings other = (SccDestinationSettings) obj;

        if (other.getFramerate() == null ^ this.getFramerate() == null)
            return false;
        if (other.getFramerate() != null
                && other.getFramerate().equals(this.getFramerate()) == false)
            return false;
        return true;
    }
}
