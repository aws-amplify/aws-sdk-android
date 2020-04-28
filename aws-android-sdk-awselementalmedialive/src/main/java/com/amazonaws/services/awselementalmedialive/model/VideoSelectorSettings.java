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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Video Selector Settings
 */
public class VideoSelectorSettings implements Serializable {
    /**
     * Video Selector Pid
     */
    private VideoSelectorPid videoSelectorPid;

    /**
     * Video Selector Program Id
     */
    private VideoSelectorProgramId videoSelectorProgramId;

    /**
     * Video Selector Pid
     *
     * @return Video Selector Pid
     */
    public VideoSelectorPid getVideoSelectorPid() {
        return videoSelectorPid;
    }

    /**
     * Video Selector Pid
     *
     * @param videoSelectorPid Video Selector Pid
     */
    public void setVideoSelectorPid(VideoSelectorPid videoSelectorPid) {
        this.videoSelectorPid = videoSelectorPid;
    }

    /**
     * Video Selector Pid
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoSelectorPid Video Selector Pid
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoSelectorSettings withVideoSelectorPid(VideoSelectorPid videoSelectorPid) {
        this.videoSelectorPid = videoSelectorPid;
        return this;
    }

    /**
     * Video Selector Program Id
     *
     * @return Video Selector Program Id
     */
    public VideoSelectorProgramId getVideoSelectorProgramId() {
        return videoSelectorProgramId;
    }

    /**
     * Video Selector Program Id
     *
     * @param videoSelectorProgramId Video Selector Program Id
     */
    public void setVideoSelectorProgramId(VideoSelectorProgramId videoSelectorProgramId) {
        this.videoSelectorProgramId = videoSelectorProgramId;
    }

    /**
     * Video Selector Program Id
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoSelectorProgramId Video Selector Program Id
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoSelectorSettings withVideoSelectorProgramId(
            VideoSelectorProgramId videoSelectorProgramId) {
        this.videoSelectorProgramId = videoSelectorProgramId;
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
        if (getVideoSelectorPid() != null)
            sb.append("VideoSelectorPid: " + getVideoSelectorPid() + ",");
        if (getVideoSelectorProgramId() != null)
            sb.append("VideoSelectorProgramId: " + getVideoSelectorProgramId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVideoSelectorPid() == null) ? 0 : getVideoSelectorPid().hashCode());
        hashCode = prime
                * hashCode
                + ((getVideoSelectorProgramId() == null) ? 0 : getVideoSelectorProgramId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoSelectorSettings == false)
            return false;
        VideoSelectorSettings other = (VideoSelectorSettings) obj;

        if (other.getVideoSelectorPid() == null ^ this.getVideoSelectorPid() == null)
            return false;
        if (other.getVideoSelectorPid() != null
                && other.getVideoSelectorPid().equals(this.getVideoSelectorPid()) == false)
            return false;
        if (other.getVideoSelectorProgramId() == null ^ this.getVideoSelectorProgramId() == null)
            return false;
        if (other.getVideoSelectorProgramId() != null
                && other.getVideoSelectorProgramId().equals(this.getVideoSelectorProgramId()) == false)
            return false;
        return true;
    }
}
