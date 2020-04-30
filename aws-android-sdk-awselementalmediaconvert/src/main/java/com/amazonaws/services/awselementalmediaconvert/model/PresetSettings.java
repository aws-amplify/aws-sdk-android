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
 * Settings for preset
 */
public class PresetSettings implements Serializable {
    /**
     * (AudioDescriptions) contains groups of audio encoding settings organized
     * by audio codec. Include one instance of (AudioDescriptions) per output.
     * (AudioDescriptions) can contain multiple groups of encoding settings.
     */
    private java.util.List<AudioDescription> audioDescriptions;

    /**
     * Caption settings for this preset. There can be multiple caption settings
     * in a single output.
     */
    private java.util.List<CaptionDescriptionPreset> captionDescriptions;

    /**
     * Container specific settings.
     */
    private ContainerSettings containerSettings;

    /**
     * (VideoDescription) contains a group of video encoding settings. The
     * specific video settings depend on the video codec that you choose when
     * you specify a value for Video codec (codec). Include one instance of
     * (VideoDescription) per output.
     */
    private VideoDescription videoDescription;

    /**
     * (AudioDescriptions) contains groups of audio encoding settings organized
     * by audio codec. Include one instance of (AudioDescriptions) per output.
     * (AudioDescriptions) can contain multiple groups of encoding settings.
     *
     * @return (AudioDescriptions) contains groups of audio encoding settings
     *         organized by audio codec. Include one instance of
     *         (AudioDescriptions) per output. (AudioDescriptions) can contain
     *         multiple groups of encoding settings.
     */
    public java.util.List<AudioDescription> getAudioDescriptions() {
        return audioDescriptions;
    }

    /**
     * (AudioDescriptions) contains groups of audio encoding settings organized
     * by audio codec. Include one instance of (AudioDescriptions) per output.
     * (AudioDescriptions) can contain multiple groups of encoding settings.
     *
     * @param audioDescriptions (AudioDescriptions) contains groups of audio
     *            encoding settings organized by audio codec. Include one
     *            instance of (AudioDescriptions) per output.
     *            (AudioDescriptions) can contain multiple groups of encoding
     *            settings.
     */
    public void setAudioDescriptions(java.util.Collection<AudioDescription> audioDescriptions) {
        if (audioDescriptions == null) {
            this.audioDescriptions = null;
            return;
        }

        this.audioDescriptions = new java.util.ArrayList<AudioDescription>(audioDescriptions);
    }

    /**
     * (AudioDescriptions) contains groups of audio encoding settings organized
     * by audio codec. Include one instance of (AudioDescriptions) per output.
     * (AudioDescriptions) can contain multiple groups of encoding settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioDescriptions (AudioDescriptions) contains groups of audio
     *            encoding settings organized by audio codec. Include one
     *            instance of (AudioDescriptions) per output.
     *            (AudioDescriptions) can contain multiple groups of encoding
     *            settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PresetSettings withAudioDescriptions(AudioDescription... audioDescriptions) {
        if (getAudioDescriptions() == null) {
            this.audioDescriptions = new java.util.ArrayList<AudioDescription>(
                    audioDescriptions.length);
        }
        for (AudioDescription value : audioDescriptions) {
            this.audioDescriptions.add(value);
        }
        return this;
    }

    /**
     * (AudioDescriptions) contains groups of audio encoding settings organized
     * by audio codec. Include one instance of (AudioDescriptions) per output.
     * (AudioDescriptions) can contain multiple groups of encoding settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioDescriptions (AudioDescriptions) contains groups of audio
     *            encoding settings organized by audio codec. Include one
     *            instance of (AudioDescriptions) per output.
     *            (AudioDescriptions) can contain multiple groups of encoding
     *            settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PresetSettings withAudioDescriptions(
            java.util.Collection<AudioDescription> audioDescriptions) {
        setAudioDescriptions(audioDescriptions);
        return this;
    }

    /**
     * Caption settings for this preset. There can be multiple caption settings
     * in a single output.
     *
     * @return Caption settings for this preset. There can be multiple caption
     *         settings in a single output.
     */
    public java.util.List<CaptionDescriptionPreset> getCaptionDescriptions() {
        return captionDescriptions;
    }

    /**
     * Caption settings for this preset. There can be multiple caption settings
     * in a single output.
     *
     * @param captionDescriptions Caption settings for this preset. There can be
     *            multiple caption settings in a single output.
     */
    public void setCaptionDescriptions(
            java.util.Collection<CaptionDescriptionPreset> captionDescriptions) {
        if (captionDescriptions == null) {
            this.captionDescriptions = null;
            return;
        }

        this.captionDescriptions = new java.util.ArrayList<CaptionDescriptionPreset>(
                captionDescriptions);
    }

    /**
     * Caption settings for this preset. There can be multiple caption settings
     * in a single output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionDescriptions Caption settings for this preset. There can be
     *            multiple caption settings in a single output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PresetSettings withCaptionDescriptions(CaptionDescriptionPreset... captionDescriptions) {
        if (getCaptionDescriptions() == null) {
            this.captionDescriptions = new java.util.ArrayList<CaptionDescriptionPreset>(
                    captionDescriptions.length);
        }
        for (CaptionDescriptionPreset value : captionDescriptions) {
            this.captionDescriptions.add(value);
        }
        return this;
    }

    /**
     * Caption settings for this preset. There can be multiple caption settings
     * in a single output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionDescriptions Caption settings for this preset. There can be
     *            multiple caption settings in a single output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PresetSettings withCaptionDescriptions(
            java.util.Collection<CaptionDescriptionPreset> captionDescriptions) {
        setCaptionDescriptions(captionDescriptions);
        return this;
    }

    /**
     * Container specific settings.
     *
     * @return Container specific settings.
     */
    public ContainerSettings getContainerSettings() {
        return containerSettings;
    }

    /**
     * Container specific settings.
     *
     * @param containerSettings Container specific settings.
     */
    public void setContainerSettings(ContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
    }

    /**
     * Container specific settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerSettings Container specific settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PresetSettings withContainerSettings(ContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * (VideoDescription) contains a group of video encoding settings. The
     * specific video settings depend on the video codec that you choose when
     * you specify a value for Video codec (codec). Include one instance of
     * (VideoDescription) per output.
     *
     * @return (VideoDescription) contains a group of video encoding settings.
     *         The specific video settings depend on the video codec that you
     *         choose when you specify a value for Video codec (codec). Include
     *         one instance of (VideoDescription) per output.
     */
    public VideoDescription getVideoDescription() {
        return videoDescription;
    }

    /**
     * (VideoDescription) contains a group of video encoding settings. The
     * specific video settings depend on the video codec that you choose when
     * you specify a value for Video codec (codec). Include one instance of
     * (VideoDescription) per output.
     *
     * @param videoDescription (VideoDescription) contains a group of video
     *            encoding settings. The specific video settings depend on the
     *            video codec that you choose when you specify a value for Video
     *            codec (codec). Include one instance of (VideoDescription) per
     *            output.
     */
    public void setVideoDescription(VideoDescription videoDescription) {
        this.videoDescription = videoDescription;
    }

    /**
     * (VideoDescription) contains a group of video encoding settings. The
     * specific video settings depend on the video codec that you choose when
     * you specify a value for Video codec (codec). Include one instance of
     * (VideoDescription) per output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoDescription (VideoDescription) contains a group of video
     *            encoding settings. The specific video settings depend on the
     *            video codec that you choose when you specify a value for Video
     *            codec (codec). Include one instance of (VideoDescription) per
     *            output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PresetSettings withVideoDescription(VideoDescription videoDescription) {
        this.videoDescription = videoDescription;
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
        if (getAudioDescriptions() != null)
            sb.append("AudioDescriptions: " + getAudioDescriptions() + ",");
        if (getCaptionDescriptions() != null)
            sb.append("CaptionDescriptions: " + getCaptionDescriptions() + ",");
        if (getContainerSettings() != null)
            sb.append("ContainerSettings: " + getContainerSettings() + ",");
        if (getVideoDescription() != null)
            sb.append("VideoDescription: " + getVideoDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAudioDescriptions() == null) ? 0 : getAudioDescriptions().hashCode());
        hashCode = prime * hashCode
                + ((getCaptionDescriptions() == null) ? 0 : getCaptionDescriptions().hashCode());
        hashCode = prime * hashCode
                + ((getContainerSettings() == null) ? 0 : getContainerSettings().hashCode());
        hashCode = prime * hashCode
                + ((getVideoDescription() == null) ? 0 : getVideoDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PresetSettings == false)
            return false;
        PresetSettings other = (PresetSettings) obj;

        if (other.getAudioDescriptions() == null ^ this.getAudioDescriptions() == null)
            return false;
        if (other.getAudioDescriptions() != null
                && other.getAudioDescriptions().equals(this.getAudioDescriptions()) == false)
            return false;
        if (other.getCaptionDescriptions() == null ^ this.getCaptionDescriptions() == null)
            return false;
        if (other.getCaptionDescriptions() != null
                && other.getCaptionDescriptions().equals(this.getCaptionDescriptions()) == false)
            return false;
        if (other.getContainerSettings() == null ^ this.getContainerSettings() == null)
            return false;
        if (other.getContainerSettings() != null
                && other.getContainerSettings().equals(this.getContainerSettings()) == false)
            return false;
        if (other.getVideoDescription() == null ^ this.getVideoDescription() == null)
            return false;
        if (other.getVideoDescription() != null
                && other.getVideoDescription().equals(this.getVideoDescription()) == false)
            return false;
        return true;
    }
}
