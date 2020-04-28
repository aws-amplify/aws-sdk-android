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
 * Encoder Settings
 */
public class EncoderSettings implements Serializable {
    /**
     * Placeholder documentation for __listOfAudioDescription
     */
    private java.util.List<AudioDescription> audioDescriptions;

    /**
     * Settings for ad avail blanking.
     */
    private AvailBlanking availBlanking;

    /**
     * Event-wide configuration settings for ad avail insertion.
     */
    private AvailConfiguration availConfiguration;

    /**
     * Settings for blackout slate.
     */
    private BlackoutSlate blackoutSlate;

    /**
     * Settings for caption decriptions
     */
    private java.util.List<CaptionDescription> captionDescriptions;

    /**
     * Configuration settings that apply to the event as a whole.
     */
    private GlobalConfiguration globalConfiguration;

    /**
     * Nielsen configuration settings.
     */
    private NielsenConfiguration nielsenConfiguration;

    /**
     * Placeholder documentation for __listOfOutputGroup
     */
    private java.util.List<OutputGroup> outputGroups;

    /**
     * Contains settings used to acquire and adjust timecode information from
     * inputs.
     */
    private TimecodeConfig timecodeConfig;

    /**
     * Placeholder documentation for __listOfVideoDescription
     */
    private java.util.List<VideoDescription> videoDescriptions;

    /**
     * Placeholder documentation for __listOfAudioDescription
     *
     * @return Placeholder documentation for __listOfAudioDescription
     */
    public java.util.List<AudioDescription> getAudioDescriptions() {
        return audioDescriptions;
    }

    /**
     * Placeholder documentation for __listOfAudioDescription
     *
     * @param audioDescriptions Placeholder documentation for
     *            __listOfAudioDescription
     */
    public void setAudioDescriptions(java.util.Collection<AudioDescription> audioDescriptions) {
        if (audioDescriptions == null) {
            this.audioDescriptions = null;
            return;
        }

        this.audioDescriptions = new java.util.ArrayList<AudioDescription>(audioDescriptions);
    }

    /**
     * Placeholder documentation for __listOfAudioDescription
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioDescriptions Placeholder documentation for
     *            __listOfAudioDescription
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withAudioDescriptions(AudioDescription... audioDescriptions) {
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
     * Placeholder documentation for __listOfAudioDescription
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioDescriptions Placeholder documentation for
     *            __listOfAudioDescription
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withAudioDescriptions(
            java.util.Collection<AudioDescription> audioDescriptions) {
        setAudioDescriptions(audioDescriptions);
        return this;
    }

    /**
     * Settings for ad avail blanking.
     *
     * @return Settings for ad avail blanking.
     */
    public AvailBlanking getAvailBlanking() {
        return availBlanking;
    }

    /**
     * Settings for ad avail blanking.
     *
     * @param availBlanking Settings for ad avail blanking.
     */
    public void setAvailBlanking(AvailBlanking availBlanking) {
        this.availBlanking = availBlanking;
    }

    /**
     * Settings for ad avail blanking.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availBlanking Settings for ad avail blanking.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withAvailBlanking(AvailBlanking availBlanking) {
        this.availBlanking = availBlanking;
        return this;
    }

    /**
     * Event-wide configuration settings for ad avail insertion.
     *
     * @return Event-wide configuration settings for ad avail insertion.
     */
    public AvailConfiguration getAvailConfiguration() {
        return availConfiguration;
    }

    /**
     * Event-wide configuration settings for ad avail insertion.
     *
     * @param availConfiguration Event-wide configuration settings for ad avail
     *            insertion.
     */
    public void setAvailConfiguration(AvailConfiguration availConfiguration) {
        this.availConfiguration = availConfiguration;
    }

    /**
     * Event-wide configuration settings for ad avail insertion.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availConfiguration Event-wide configuration settings for ad avail
     *            insertion.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withAvailConfiguration(AvailConfiguration availConfiguration) {
        this.availConfiguration = availConfiguration;
        return this;
    }

    /**
     * Settings for blackout slate.
     *
     * @return Settings for blackout slate.
     */
    public BlackoutSlate getBlackoutSlate() {
        return blackoutSlate;
    }

    /**
     * Settings for blackout slate.
     *
     * @param blackoutSlate Settings for blackout slate.
     */
    public void setBlackoutSlate(BlackoutSlate blackoutSlate) {
        this.blackoutSlate = blackoutSlate;
    }

    /**
     * Settings for blackout slate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param blackoutSlate Settings for blackout slate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withBlackoutSlate(BlackoutSlate blackoutSlate) {
        this.blackoutSlate = blackoutSlate;
        return this;
    }

    /**
     * Settings for caption decriptions
     *
     * @return Settings for caption decriptions
     */
    public java.util.List<CaptionDescription> getCaptionDescriptions() {
        return captionDescriptions;
    }

    /**
     * Settings for caption decriptions
     *
     * @param captionDescriptions Settings for caption decriptions
     */
    public void setCaptionDescriptions(java.util.Collection<CaptionDescription> captionDescriptions) {
        if (captionDescriptions == null) {
            this.captionDescriptions = null;
            return;
        }

        this.captionDescriptions = new java.util.ArrayList<CaptionDescription>(captionDescriptions);
    }

    /**
     * Settings for caption decriptions
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionDescriptions Settings for caption decriptions
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withCaptionDescriptions(CaptionDescription... captionDescriptions) {
        if (getCaptionDescriptions() == null) {
            this.captionDescriptions = new java.util.ArrayList<CaptionDescription>(
                    captionDescriptions.length);
        }
        for (CaptionDescription value : captionDescriptions) {
            this.captionDescriptions.add(value);
        }
        return this;
    }

    /**
     * Settings for caption decriptions
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionDescriptions Settings for caption decriptions
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withCaptionDescriptions(
            java.util.Collection<CaptionDescription> captionDescriptions) {
        setCaptionDescriptions(captionDescriptions);
        return this;
    }

    /**
     * Configuration settings that apply to the event as a whole.
     *
     * @return Configuration settings that apply to the event as a whole.
     */
    public GlobalConfiguration getGlobalConfiguration() {
        return globalConfiguration;
    }

    /**
     * Configuration settings that apply to the event as a whole.
     *
     * @param globalConfiguration Configuration settings that apply to the event
     *            as a whole.
     */
    public void setGlobalConfiguration(GlobalConfiguration globalConfiguration) {
        this.globalConfiguration = globalConfiguration;
    }

    /**
     * Configuration settings that apply to the event as a whole.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param globalConfiguration Configuration settings that apply to the event
     *            as a whole.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withGlobalConfiguration(GlobalConfiguration globalConfiguration) {
        this.globalConfiguration = globalConfiguration;
        return this;
    }

    /**
     * Nielsen configuration settings.
     *
     * @return Nielsen configuration settings.
     */
    public NielsenConfiguration getNielsenConfiguration() {
        return nielsenConfiguration;
    }

    /**
     * Nielsen configuration settings.
     *
     * @param nielsenConfiguration Nielsen configuration settings.
     */
    public void setNielsenConfiguration(NielsenConfiguration nielsenConfiguration) {
        this.nielsenConfiguration = nielsenConfiguration;
    }

    /**
     * Nielsen configuration settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nielsenConfiguration Nielsen configuration settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withNielsenConfiguration(NielsenConfiguration nielsenConfiguration) {
        this.nielsenConfiguration = nielsenConfiguration;
        return this;
    }

    /**
     * Placeholder documentation for __listOfOutputGroup
     *
     * @return Placeholder documentation for __listOfOutputGroup
     */
    public java.util.List<OutputGroup> getOutputGroups() {
        return outputGroups;
    }

    /**
     * Placeholder documentation for __listOfOutputGroup
     *
     * @param outputGroups Placeholder documentation for __listOfOutputGroup
     */
    public void setOutputGroups(java.util.Collection<OutputGroup> outputGroups) {
        if (outputGroups == null) {
            this.outputGroups = null;
            return;
        }

        this.outputGroups = new java.util.ArrayList<OutputGroup>(outputGroups);
    }

    /**
     * Placeholder documentation for __listOfOutputGroup
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputGroups Placeholder documentation for __listOfOutputGroup
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withOutputGroups(OutputGroup... outputGroups) {
        if (getOutputGroups() == null) {
            this.outputGroups = new java.util.ArrayList<OutputGroup>(outputGroups.length);
        }
        for (OutputGroup value : outputGroups) {
            this.outputGroups.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOfOutputGroup
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputGroups Placeholder documentation for __listOfOutputGroup
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withOutputGroups(java.util.Collection<OutputGroup> outputGroups) {
        setOutputGroups(outputGroups);
        return this;
    }

    /**
     * Contains settings used to acquire and adjust timecode information from
     * inputs.
     *
     * @return Contains settings used to acquire and adjust timecode information
     *         from inputs.
     */
    public TimecodeConfig getTimecodeConfig() {
        return timecodeConfig;
    }

    /**
     * Contains settings used to acquire and adjust timecode information from
     * inputs.
     *
     * @param timecodeConfig Contains settings used to acquire and adjust
     *            timecode information from inputs.
     */
    public void setTimecodeConfig(TimecodeConfig timecodeConfig) {
        this.timecodeConfig = timecodeConfig;
    }

    /**
     * Contains settings used to acquire and adjust timecode information from
     * inputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timecodeConfig Contains settings used to acquire and adjust
     *            timecode information from inputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withTimecodeConfig(TimecodeConfig timecodeConfig) {
        this.timecodeConfig = timecodeConfig;
        return this;
    }

    /**
     * Placeholder documentation for __listOfVideoDescription
     *
     * @return Placeholder documentation for __listOfVideoDescription
     */
    public java.util.List<VideoDescription> getVideoDescriptions() {
        return videoDescriptions;
    }

    /**
     * Placeholder documentation for __listOfVideoDescription
     *
     * @param videoDescriptions Placeholder documentation for
     *            __listOfVideoDescription
     */
    public void setVideoDescriptions(java.util.Collection<VideoDescription> videoDescriptions) {
        if (videoDescriptions == null) {
            this.videoDescriptions = null;
            return;
        }

        this.videoDescriptions = new java.util.ArrayList<VideoDescription>(videoDescriptions);
    }

    /**
     * Placeholder documentation for __listOfVideoDescription
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoDescriptions Placeholder documentation for
     *            __listOfVideoDescription
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withVideoDescriptions(VideoDescription... videoDescriptions) {
        if (getVideoDescriptions() == null) {
            this.videoDescriptions = new java.util.ArrayList<VideoDescription>(
                    videoDescriptions.length);
        }
        for (VideoDescription value : videoDescriptions) {
            this.videoDescriptions.add(value);
        }
        return this;
    }

    /**
     * Placeholder documentation for __listOfVideoDescription
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoDescriptions Placeholder documentation for
     *            __listOfVideoDescription
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EncoderSettings withVideoDescriptions(
            java.util.Collection<VideoDescription> videoDescriptions) {
        setVideoDescriptions(videoDescriptions);
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
        if (getAvailBlanking() != null)
            sb.append("AvailBlanking: " + getAvailBlanking() + ",");
        if (getAvailConfiguration() != null)
            sb.append("AvailConfiguration: " + getAvailConfiguration() + ",");
        if (getBlackoutSlate() != null)
            sb.append("BlackoutSlate: " + getBlackoutSlate() + ",");
        if (getCaptionDescriptions() != null)
            sb.append("CaptionDescriptions: " + getCaptionDescriptions() + ",");
        if (getGlobalConfiguration() != null)
            sb.append("GlobalConfiguration: " + getGlobalConfiguration() + ",");
        if (getNielsenConfiguration() != null)
            sb.append("NielsenConfiguration: " + getNielsenConfiguration() + ",");
        if (getOutputGroups() != null)
            sb.append("OutputGroups: " + getOutputGroups() + ",");
        if (getTimecodeConfig() != null)
            sb.append("TimecodeConfig: " + getTimecodeConfig() + ",");
        if (getVideoDescriptions() != null)
            sb.append("VideoDescriptions: " + getVideoDescriptions());
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
                + ((getAvailBlanking() == null) ? 0 : getAvailBlanking().hashCode());
        hashCode = prime * hashCode
                + ((getAvailConfiguration() == null) ? 0 : getAvailConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getBlackoutSlate() == null) ? 0 : getBlackoutSlate().hashCode());
        hashCode = prime * hashCode
                + ((getCaptionDescriptions() == null) ? 0 : getCaptionDescriptions().hashCode());
        hashCode = prime * hashCode
                + ((getGlobalConfiguration() == null) ? 0 : getGlobalConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getNielsenConfiguration() == null) ? 0 : getNielsenConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getOutputGroups() == null) ? 0 : getOutputGroups().hashCode());
        hashCode = prime * hashCode
                + ((getTimecodeConfig() == null) ? 0 : getTimecodeConfig().hashCode());
        hashCode = prime * hashCode
                + ((getVideoDescriptions() == null) ? 0 : getVideoDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EncoderSettings == false)
            return false;
        EncoderSettings other = (EncoderSettings) obj;

        if (other.getAudioDescriptions() == null ^ this.getAudioDescriptions() == null)
            return false;
        if (other.getAudioDescriptions() != null
                && other.getAudioDescriptions().equals(this.getAudioDescriptions()) == false)
            return false;
        if (other.getAvailBlanking() == null ^ this.getAvailBlanking() == null)
            return false;
        if (other.getAvailBlanking() != null
                && other.getAvailBlanking().equals(this.getAvailBlanking()) == false)
            return false;
        if (other.getAvailConfiguration() == null ^ this.getAvailConfiguration() == null)
            return false;
        if (other.getAvailConfiguration() != null
                && other.getAvailConfiguration().equals(this.getAvailConfiguration()) == false)
            return false;
        if (other.getBlackoutSlate() == null ^ this.getBlackoutSlate() == null)
            return false;
        if (other.getBlackoutSlate() != null
                && other.getBlackoutSlate().equals(this.getBlackoutSlate()) == false)
            return false;
        if (other.getCaptionDescriptions() == null ^ this.getCaptionDescriptions() == null)
            return false;
        if (other.getCaptionDescriptions() != null
                && other.getCaptionDescriptions().equals(this.getCaptionDescriptions()) == false)
            return false;
        if (other.getGlobalConfiguration() == null ^ this.getGlobalConfiguration() == null)
            return false;
        if (other.getGlobalConfiguration() != null
                && other.getGlobalConfiguration().equals(this.getGlobalConfiguration()) == false)
            return false;
        if (other.getNielsenConfiguration() == null ^ this.getNielsenConfiguration() == null)
            return false;
        if (other.getNielsenConfiguration() != null
                && other.getNielsenConfiguration().equals(this.getNielsenConfiguration()) == false)
            return false;
        if (other.getOutputGroups() == null ^ this.getOutputGroups() == null)
            return false;
        if (other.getOutputGroups() != null
                && other.getOutputGroups().equals(this.getOutputGroups()) == false)
            return false;
        if (other.getTimecodeConfig() == null ^ this.getTimecodeConfig() == null)
            return false;
        if (other.getTimecodeConfig() != null
                && other.getTimecodeConfig().equals(this.getTimecodeConfig()) == false)
            return false;
        if (other.getVideoDescriptions() == null ^ this.getVideoDescriptions() == null)
            return false;
        if (other.getVideoDescriptions() != null
                && other.getVideoDescriptions().equals(this.getVideoDescriptions()) == false)
            return false;
        return true;
    }
}
