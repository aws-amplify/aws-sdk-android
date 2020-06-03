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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * An output object describes the settings for a single output file or stream in
 * an output group.
 */
public class Output implements Serializable {
    /**
     * (AudioDescriptions) contains groups of audio encoding settings organized
     * by audio codec. Include one instance of (AudioDescriptions) per output.
     * (AudioDescriptions) can contain multiple groups of encoding settings.
     */
    private java.util.List<AudioDescription> audioDescriptions;

    /**
     * (CaptionDescriptions) contains groups of captions settings. For each
     * output that has captions, include one instance of (CaptionDescriptions).
     * (CaptionDescriptions) can contain multiple groups of captions settings.
     */
    private java.util.List<CaptionDescription> captionDescriptions;

    /**
     * Container specific settings.
     */
    private ContainerSettings containerSettings;

    /**
     * Use Extension (Extension) to specify the file extension for outputs in
     * File output groups. If you do not specify a value, the service will use
     * default extensions by container type as follows * MPEG-2 transport
     * stream, m2ts * Quicktime, mov * MXF container, mxf * MPEG-4 container,
     * mp4 * WebM container, webm * No Container, the service will use codec
     * extensions (e.g. AAC, H265, H265, AC3)
     */
    private String extension;

    /**
     * Use Name modifier (NameModifier) to have the service add a string to the
     * end of each output filename. You specify the base filename as part of
     * your destination URI. When you create multiple outputs in the same output
     * group, Name modifier (NameModifier) is required. Name modifier also
     * accepts format identifiers. For DASH ISO outputs, if you use the format
     * identifiers $Number$ or $Time$ in one output, you must use them in the
     * same way in all outputs of the output group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nameModifier;

    /**
     * Specific settings for this type of output.
     */
    private OutputSettings outputSettings;

    /**
     * Use Preset (Preset) to specifiy a preset for your transcoding settings.
     * Provide the system or custom preset name. You can specify either Preset
     * (Preset) or Container settings (ContainerSettings), but not both.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     */
    private String preset;

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
    public Output withAudioDescriptions(AudioDescription... audioDescriptions) {
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
    public Output withAudioDescriptions(java.util.Collection<AudioDescription> audioDescriptions) {
        setAudioDescriptions(audioDescriptions);
        return this;
    }

    /**
     * (CaptionDescriptions) contains groups of captions settings. For each
     * output that has captions, include one instance of (CaptionDescriptions).
     * (CaptionDescriptions) can contain multiple groups of captions settings.
     *
     * @return (CaptionDescriptions) contains groups of captions settings. For
     *         each output that has captions, include one instance of
     *         (CaptionDescriptions). (CaptionDescriptions) can contain multiple
     *         groups of captions settings.
     */
    public java.util.List<CaptionDescription> getCaptionDescriptions() {
        return captionDescriptions;
    }

    /**
     * (CaptionDescriptions) contains groups of captions settings. For each
     * output that has captions, include one instance of (CaptionDescriptions).
     * (CaptionDescriptions) can contain multiple groups of captions settings.
     *
     * @param captionDescriptions (CaptionDescriptions) contains groups of
     *            captions settings. For each output that has captions, include
     *            one instance of (CaptionDescriptions). (CaptionDescriptions)
     *            can contain multiple groups of captions settings.
     */
    public void setCaptionDescriptions(java.util.Collection<CaptionDescription> captionDescriptions) {
        if (captionDescriptions == null) {
            this.captionDescriptions = null;
            return;
        }

        this.captionDescriptions = new java.util.ArrayList<CaptionDescription>(captionDescriptions);
    }

    /**
     * (CaptionDescriptions) contains groups of captions settings. For each
     * output that has captions, include one instance of (CaptionDescriptions).
     * (CaptionDescriptions) can contain multiple groups of captions settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionDescriptions (CaptionDescriptions) contains groups of
     *            captions settings. For each output that has captions, include
     *            one instance of (CaptionDescriptions). (CaptionDescriptions)
     *            can contain multiple groups of captions settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Output withCaptionDescriptions(CaptionDescription... captionDescriptions) {
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
     * (CaptionDescriptions) contains groups of captions settings. For each
     * output that has captions, include one instance of (CaptionDescriptions).
     * (CaptionDescriptions) can contain multiple groups of captions settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param captionDescriptions (CaptionDescriptions) contains groups of
     *            captions settings. For each output that has captions, include
     *            one instance of (CaptionDescriptions). (CaptionDescriptions)
     *            can contain multiple groups of captions settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Output withCaptionDescriptions(
            java.util.Collection<CaptionDescription> captionDescriptions) {
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
    public Output withContainerSettings(ContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Use Extension (Extension) to specify the file extension for outputs in
     * File output groups. If you do not specify a value, the service will use
     * default extensions by container type as follows * MPEG-2 transport
     * stream, m2ts * Quicktime, mov * MXF container, mxf * MPEG-4 container,
     * mp4 * WebM container, webm * No Container, the service will use codec
     * extensions (e.g. AAC, H265, H265, AC3)
     *
     * @return Use Extension (Extension) to specify the file extension for
     *         outputs in File output groups. If you do not specify a value, the
     *         service will use default extensions by container type as follows
     *         * MPEG-2 transport stream, m2ts * Quicktime, mov * MXF container,
     *         mxf * MPEG-4 container, mp4 * WebM container, webm * No
     *         Container, the service will use codec extensions (e.g. AAC, H265,
     *         H265, AC3)
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Use Extension (Extension) to specify the file extension for outputs in
     * File output groups. If you do not specify a value, the service will use
     * default extensions by container type as follows * MPEG-2 transport
     * stream, m2ts * Quicktime, mov * MXF container, mxf * MPEG-4 container,
     * mp4 * WebM container, webm * No Container, the service will use codec
     * extensions (e.g. AAC, H265, H265, AC3)
     *
     * @param extension Use Extension (Extension) to specify the file extension
     *            for outputs in File output groups. If you do not specify a
     *            value, the service will use default extensions by container
     *            type as follows * MPEG-2 transport stream, m2ts * Quicktime,
     *            mov * MXF container, mxf * MPEG-4 container, mp4 * WebM
     *            container, webm * No Container, the service will use codec
     *            extensions (e.g. AAC, H265, H265, AC3)
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

    /**
     * Use Extension (Extension) to specify the file extension for outputs in
     * File output groups. If you do not specify a value, the service will use
     * default extensions by container type as follows * MPEG-2 transport
     * stream, m2ts * Quicktime, mov * MXF container, mxf * MPEG-4 container,
     * mp4 * WebM container, webm * No Container, the service will use codec
     * extensions (e.g. AAC, H265, H265, AC3)
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param extension Use Extension (Extension) to specify the file extension
     *            for outputs in File output groups. If you do not specify a
     *            value, the service will use default extensions by container
     *            type as follows * MPEG-2 transport stream, m2ts * Quicktime,
     *            mov * MXF container, mxf * MPEG-4 container, mp4 * WebM
     *            container, webm * No Container, the service will use codec
     *            extensions (e.g. AAC, H265, H265, AC3)
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Output withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * Use Name modifier (NameModifier) to have the service add a string to the
     * end of each output filename. You specify the base filename as part of
     * your destination URI. When you create multiple outputs in the same output
     * group, Name modifier (NameModifier) is required. Name modifier also
     * accepts format identifiers. For DASH ISO outputs, if you use the format
     * identifiers $Number$ or $Time$ in one output, you must use them in the
     * same way in all outputs of the output group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Use Name modifier (NameModifier) to have the service add a string
     *         to the end of each output filename. You specify the base filename
     *         as part of your destination URI. When you create multiple outputs
     *         in the same output group, Name modifier (NameModifier) is
     *         required. Name modifier also accepts format identifiers. For DASH
     *         ISO outputs, if you use the format identifiers $Number$ or $Time$
     *         in one output, you must use them in the same way in all outputs
     *         of the output group.
     */
    public String getNameModifier() {
        return nameModifier;
    }

    /**
     * Use Name modifier (NameModifier) to have the service add a string to the
     * end of each output filename. You specify the base filename as part of
     * your destination URI. When you create multiple outputs in the same output
     * group, Name modifier (NameModifier) is required. Name modifier also
     * accepts format identifiers. For DASH ISO outputs, if you use the format
     * identifiers $Number$ or $Time$ in one output, you must use them in the
     * same way in all outputs of the output group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nameModifier Use Name modifier (NameModifier) to have the service
     *            add a string to the end of each output filename. You specify
     *            the base filename as part of your destination URI. When you
     *            create multiple outputs in the same output group, Name
     *            modifier (NameModifier) is required. Name modifier also
     *            accepts format identifiers. For DASH ISO outputs, if you use
     *            the format identifiers $Number$ or $Time$ in one output, you
     *            must use them in the same way in all outputs of the output
     *            group.
     */
    public void setNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
    }

    /**
     * Use Name modifier (NameModifier) to have the service add a string to the
     * end of each output filename. You specify the base filename as part of
     * your destination URI. When you create multiple outputs in the same output
     * group, Name modifier (NameModifier) is required. Name modifier also
     * accepts format identifiers. For DASH ISO outputs, if you use the format
     * identifiers $Number$ or $Time$ in one output, you must use them in the
     * same way in all outputs of the output group.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nameModifier Use Name modifier (NameModifier) to have the service
     *            add a string to the end of each output filename. You specify
     *            the base filename as part of your destination URI. When you
     *            create multiple outputs in the same output group, Name
     *            modifier (NameModifier) is required. Name modifier also
     *            accepts format identifiers. For DASH ISO outputs, if you use
     *            the format identifiers $Number$ or $Time$ in one output, you
     *            must use them in the same way in all outputs of the output
     *            group.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Output withNameModifier(String nameModifier) {
        this.nameModifier = nameModifier;
        return this;
    }

    /**
     * Specific settings for this type of output.
     *
     * @return Specific settings for this type of output.
     */
    public OutputSettings getOutputSettings() {
        return outputSettings;
    }

    /**
     * Specific settings for this type of output.
     *
     * @param outputSettings Specific settings for this type of output.
     */
    public void setOutputSettings(OutputSettings outputSettings) {
        this.outputSettings = outputSettings;
    }

    /**
     * Specific settings for this type of output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputSettings Specific settings for this type of output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Output withOutputSettings(OutputSettings outputSettings) {
        this.outputSettings = outputSettings;
        return this;
    }

    /**
     * Use Preset (Preset) to specifiy a preset for your transcoding settings.
     * Provide the system or custom preset name. You can specify either Preset
     * (Preset) or Container settings (ContainerSettings), but not both.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @return Use Preset (Preset) to specifiy a preset for your transcoding
     *         settings. Provide the system or custom preset name. You can
     *         specify either Preset (Preset) or Container settings
     *         (ContainerSettings), but not both.
     */
    public String getPreset() {
        return preset;
    }

    /**
     * Use Preset (Preset) to specifiy a preset for your transcoding settings.
     * Provide the system or custom preset name. You can specify either Preset
     * (Preset) or Container settings (ContainerSettings), but not both.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param preset Use Preset (Preset) to specifiy a preset for your
     *            transcoding settings. Provide the system or custom preset
     *            name. You can specify either Preset (Preset) or Container
     *            settings (ContainerSettings), but not both.
     */
    public void setPreset(String preset) {
        this.preset = preset;
    }

    /**
     * Use Preset (Preset) to specifiy a preset for your transcoding settings.
     * Provide the system or custom preset name. You can specify either Preset
     * (Preset) or Container settings (ContainerSettings), but not both.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - <br/>
     *
     * @param preset Use Preset (Preset) to specifiy a preset for your
     *            transcoding settings. Provide the system or custom preset
     *            name. You can specify either Preset (Preset) or Container
     *            settings (ContainerSettings), but not both.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Output withPreset(String preset) {
        this.preset = preset;
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
    public Output withVideoDescription(VideoDescription videoDescription) {
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
        if (getExtension() != null)
            sb.append("Extension: " + getExtension() + ",");
        if (getNameModifier() != null)
            sb.append("NameModifier: " + getNameModifier() + ",");
        if (getOutputSettings() != null)
            sb.append("OutputSettings: " + getOutputSettings() + ",");
        if (getPreset() != null)
            sb.append("Preset: " + getPreset() + ",");
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
        hashCode = prime * hashCode + ((getExtension() == null) ? 0 : getExtension().hashCode());
        hashCode = prime * hashCode
                + ((getNameModifier() == null) ? 0 : getNameModifier().hashCode());
        hashCode = prime * hashCode
                + ((getOutputSettings() == null) ? 0 : getOutputSettings().hashCode());
        hashCode = prime * hashCode + ((getPreset() == null) ? 0 : getPreset().hashCode());
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

        if (obj instanceof Output == false)
            return false;
        Output other = (Output) obj;

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
        if (other.getExtension() == null ^ this.getExtension() == null)
            return false;
        if (other.getExtension() != null
                && other.getExtension().equals(this.getExtension()) == false)
            return false;
        if (other.getNameModifier() == null ^ this.getNameModifier() == null)
            return false;
        if (other.getNameModifier() != null
                && other.getNameModifier().equals(this.getNameModifier()) == false)
            return false;
        if (other.getOutputSettings() == null ^ this.getOutputSettings() == null)
            return false;
        if (other.getOutputSettings() != null
                && other.getOutputSettings().equals(this.getOutputSettings()) == false)
            return false;
        if (other.getPreset() == null ^ this.getPreset() == null)
            return false;
        if (other.getPreset() != null && other.getPreset().equals(this.getPreset()) == false)
            return false;
        if (other.getVideoDescription() == null ^ this.getVideoDescription() == null)
            return false;
        if (other.getVideoDescription() != null
                && other.getVideoDescription().equals(this.getVideoDescription()) == false)
            return false;
        return true;
    }
}
