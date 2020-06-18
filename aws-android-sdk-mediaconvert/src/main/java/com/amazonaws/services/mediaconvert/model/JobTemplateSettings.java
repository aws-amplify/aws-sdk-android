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
 * JobTemplateSettings contains all the transcode settings saved in the template
 * that will be applied to jobs created from it.
 */
public class JobTemplateSettings implements Serializable {
    /**
     * When specified, this offset (in milliseconds) is added to the input Ad
     * Avail PTS time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000 - 1000<br/>
     */
    private Integer adAvailOffset;

    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an
     * image, and audio muted during SCTE-35 triggered ad avails.
     */
    private AvailBlanking availBlanking;

    /**
     * Settings for Event Signaling And Messaging (ESAM).
     */
    private EsamSettings esam;

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job.
     * There can only be one input in a job template. Using the API, you can
     * include multiple inputs when referencing a job template.
     */
    private java.util.List<InputTemplate> inputs;

    /**
     * Overlay motion graphics on top of your video. The motion graphics that
     * you specify here appear on all outputs in all output groups.
     */
    private MotionImageInserter motionImageInserter;

    /**
     * Settings for your Nielsen configuration. If you don't do Nielsen
     * measurement and analytics, ignore these settings. When you enable Nielsen
     * configuration (nielsenConfiguration), MediaConvert enables PCM to ID3
     * tagging for all outputs in the job. To enable Nielsen configuration
     * programmatically, include an instance of nielsenConfiguration in your
     * JSON job specification. Even if you don't include any children of
     * nielsenConfiguration, you still enable the setting.
     */
    private NielsenConfiguration nielsenConfiguration;

    /**
     * (OutputGroups) contains one group of settings for each set of outputs
     * that share a common package type. All unpackaged files (MPEG-4, MPEG-2
     * TS, Quicktime, MXF, and no container) are grouped in a single output
     * group as well. Required in (OutputGroups) is a group of settings that
     * apply to the whole group. This required object depends on the value you
     * set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings
     * object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings *
     * HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS,
     * DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     */
    private java.util.List<OutputGroup> outputGroups;

    /**
     * Contains settings used to acquire and adjust timecode information from
     * inputs.
     */
    private TimecodeConfig timecodeConfig;

    /**
     * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3
     * tags in your job. To include timed metadata, you must enable it here,
     * enable it in each output container, and specify tags and timecodes in ID3
     * insertion (Id3Insertion) objects.
     */
    private TimedMetadataInsertion timedMetadataInsertion;

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad
     * Avail PTS time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000 - 1000<br/>
     *
     * @return When specified, this offset (in milliseconds) is added to the
     *         input Ad Avail PTS time.
     */
    public Integer getAdAvailOffset() {
        return adAvailOffset;
    }

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad
     * Avail PTS time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000 - 1000<br/>
     *
     * @param adAvailOffset When specified, this offset (in milliseconds) is
     *            added to the input Ad Avail PTS time.
     */
    public void setAdAvailOffset(Integer adAvailOffset) {
        this.adAvailOffset = adAvailOffset;
    }

    /**
     * When specified, this offset (in milliseconds) is added to the input Ad
     * Avail PTS time.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-1000 - 1000<br/>
     *
     * @param adAvailOffset When specified, this offset (in milliseconds) is
     *            added to the input Ad Avail PTS time.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSettings withAdAvailOffset(Integer adAvailOffset) {
        this.adAvailOffset = adAvailOffset;
        return this;
    }

    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an
     * image, and audio muted during SCTE-35 triggered ad avails.
     *
     * @return Settings for ad avail blanking. Video can be blanked or overlaid
     *         with an image, and audio muted during SCTE-35 triggered ad
     *         avails.
     */
    public AvailBlanking getAvailBlanking() {
        return availBlanking;
    }

    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an
     * image, and audio muted during SCTE-35 triggered ad avails.
     *
     * @param availBlanking Settings for ad avail blanking. Video can be blanked
     *            or overlaid with an image, and audio muted during SCTE-35
     *            triggered ad avails.
     */
    public void setAvailBlanking(AvailBlanking availBlanking) {
        this.availBlanking = availBlanking;
    }

    /**
     * Settings for ad avail blanking. Video can be blanked or overlaid with an
     * image, and audio muted during SCTE-35 triggered ad avails.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availBlanking Settings for ad avail blanking. Video can be blanked
     *            or overlaid with an image, and audio muted during SCTE-35
     *            triggered ad avails.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSettings withAvailBlanking(AvailBlanking availBlanking) {
        this.availBlanking = availBlanking;
        return this;
    }

    /**
     * Settings for Event Signaling And Messaging (ESAM).
     *
     * @return Settings for Event Signaling And Messaging (ESAM).
     */
    public EsamSettings getEsam() {
        return esam;
    }

    /**
     * Settings for Event Signaling And Messaging (ESAM).
     *
     * @param esam Settings for Event Signaling And Messaging (ESAM).
     */
    public void setEsam(EsamSettings esam) {
        this.esam = esam;
    }

    /**
     * Settings for Event Signaling And Messaging (ESAM).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param esam Settings for Event Signaling And Messaging (ESAM).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSettings withEsam(EsamSettings esam) {
        this.esam = esam;
        return this;
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job.
     * There can only be one input in a job template. Using the API, you can
     * include multiple inputs when referencing a job template.
     *
     * @return Use Inputs (inputs) to define the source file used in the
     *         transcode job. There can only be one input in a job template.
     *         Using the API, you can include multiple inputs when referencing a
     *         job template.
     */
    public java.util.List<InputTemplate> getInputs() {
        return inputs;
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job.
     * There can only be one input in a job template. Using the API, you can
     * include multiple inputs when referencing a job template.
     *
     * @param inputs Use Inputs (inputs) to define the source file used in the
     *            transcode job. There can only be one input in a job template.
     *            Using the API, you can include multiple inputs when
     *            referencing a job template.
     */
    public void setInputs(java.util.Collection<InputTemplate> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<InputTemplate>(inputs);
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job.
     * There can only be one input in a job template. Using the API, you can
     * include multiple inputs when referencing a job template.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputs Use Inputs (inputs) to define the source file used in the
     *            transcode job. There can only be one input in a job template.
     *            Using the API, you can include multiple inputs when
     *            referencing a job template.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSettings withInputs(InputTemplate... inputs) {
        if (getInputs() == null) {
            this.inputs = new java.util.ArrayList<InputTemplate>(inputs.length);
        }
        for (InputTemplate value : inputs) {
            this.inputs.add(value);
        }
        return this;
    }

    /**
     * Use Inputs (inputs) to define the source file used in the transcode job.
     * There can only be one input in a job template. Using the API, you can
     * include multiple inputs when referencing a job template.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputs Use Inputs (inputs) to define the source file used in the
     *            transcode job. There can only be one input in a job template.
     *            Using the API, you can include multiple inputs when
     *            referencing a job template.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSettings withInputs(java.util.Collection<InputTemplate> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * Overlay motion graphics on top of your video. The motion graphics that
     * you specify here appear on all outputs in all output groups.
     *
     * @return Overlay motion graphics on top of your video. The motion graphics
     *         that you specify here appear on all outputs in all output groups.
     */
    public MotionImageInserter getMotionImageInserter() {
        return motionImageInserter;
    }

    /**
     * Overlay motion graphics on top of your video. The motion graphics that
     * you specify here appear on all outputs in all output groups.
     *
     * @param motionImageInserter Overlay motion graphics on top of your video.
     *            The motion graphics that you specify here appear on all
     *            outputs in all output groups.
     */
    public void setMotionImageInserter(MotionImageInserter motionImageInserter) {
        this.motionImageInserter = motionImageInserter;
    }

    /**
     * Overlay motion graphics on top of your video. The motion graphics that
     * you specify here appear on all outputs in all output groups.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param motionImageInserter Overlay motion graphics on top of your video.
     *            The motion graphics that you specify here appear on all
     *            outputs in all output groups.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSettings withMotionImageInserter(MotionImageInserter motionImageInserter) {
        this.motionImageInserter = motionImageInserter;
        return this;
    }

    /**
     * Settings for your Nielsen configuration. If you don't do Nielsen
     * measurement and analytics, ignore these settings. When you enable Nielsen
     * configuration (nielsenConfiguration), MediaConvert enables PCM to ID3
     * tagging for all outputs in the job. To enable Nielsen configuration
     * programmatically, include an instance of nielsenConfiguration in your
     * JSON job specification. Even if you don't include any children of
     * nielsenConfiguration, you still enable the setting.
     *
     * @return Settings for your Nielsen configuration. If you don't do Nielsen
     *         measurement and analytics, ignore these settings. When you enable
     *         Nielsen configuration (nielsenConfiguration), MediaConvert
     *         enables PCM to ID3 tagging for all outputs in the job. To enable
     *         Nielsen configuration programmatically, include an instance of
     *         nielsenConfiguration in your JSON job specification. Even if you
     *         don't include any children of nielsenConfiguration, you still
     *         enable the setting.
     */
    public NielsenConfiguration getNielsenConfiguration() {
        return nielsenConfiguration;
    }

    /**
     * Settings for your Nielsen configuration. If you don't do Nielsen
     * measurement and analytics, ignore these settings. When you enable Nielsen
     * configuration (nielsenConfiguration), MediaConvert enables PCM to ID3
     * tagging for all outputs in the job. To enable Nielsen configuration
     * programmatically, include an instance of nielsenConfiguration in your
     * JSON job specification. Even if you don't include any children of
     * nielsenConfiguration, you still enable the setting.
     *
     * @param nielsenConfiguration Settings for your Nielsen configuration. If
     *            you don't do Nielsen measurement and analytics, ignore these
     *            settings. When you enable Nielsen configuration
     *            (nielsenConfiguration), MediaConvert enables PCM to ID3
     *            tagging for all outputs in the job. To enable Nielsen
     *            configuration programmatically, include an instance of
     *            nielsenConfiguration in your JSON job specification. Even if
     *            you don't include any children of nielsenConfiguration, you
     *            still enable the setting.
     */
    public void setNielsenConfiguration(NielsenConfiguration nielsenConfiguration) {
        this.nielsenConfiguration = nielsenConfiguration;
    }

    /**
     * Settings for your Nielsen configuration. If you don't do Nielsen
     * measurement and analytics, ignore these settings. When you enable Nielsen
     * configuration (nielsenConfiguration), MediaConvert enables PCM to ID3
     * tagging for all outputs in the job. To enable Nielsen configuration
     * programmatically, include an instance of nielsenConfiguration in your
     * JSON job specification. Even if you don't include any children of
     * nielsenConfiguration, you still enable the setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nielsenConfiguration Settings for your Nielsen configuration. If
     *            you don't do Nielsen measurement and analytics, ignore these
     *            settings. When you enable Nielsen configuration
     *            (nielsenConfiguration), MediaConvert enables PCM to ID3
     *            tagging for all outputs in the job. To enable Nielsen
     *            configuration programmatically, include an instance of
     *            nielsenConfiguration in your JSON job specification. Even if
     *            you don't include any children of nielsenConfiguration, you
     *            still enable the setting.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSettings withNielsenConfiguration(NielsenConfiguration nielsenConfiguration) {
        this.nielsenConfiguration = nielsenConfiguration;
        return this;
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs
     * that share a common package type. All unpackaged files (MPEG-4, MPEG-2
     * TS, Quicktime, MXF, and no container) are grouped in a single output
     * group as well. Required in (OutputGroups) is a group of settings that
     * apply to the whole group. This required object depends on the value you
     * set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings
     * object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings *
     * HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS,
     * DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     *
     * @return (OutputGroups) contains one group of settings for each set of
     *         outputs that share a common package type. All unpackaged files
     *         (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no container) are grouped
     *         in a single output group as well. Required in (OutputGroups) is a
     *         group of settings that apply to the whole group. This required
     *         object depends on the value you set for (Type) under
     *         (OutputGroups)>(OutputGroupSettings). Type, settings object pairs
     *         are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings *
     *         HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS,
     *         DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *         MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     */
    public java.util.List<OutputGroup> getOutputGroups() {
        return outputGroups;
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs
     * that share a common package type. All unpackaged files (MPEG-4, MPEG-2
     * TS, Quicktime, MXF, and no container) are grouped in a single output
     * group as well. Required in (OutputGroups) is a group of settings that
     * apply to the whole group. This required object depends on the value you
     * set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings
     * object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings *
     * HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS,
     * DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     *
     * @param outputGroups (OutputGroups) contains one group of settings for
     *            each set of outputs that share a common package type. All
     *            unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no
     *            container) are grouped in a single output group as well.
     *            Required in (OutputGroups) is a group of settings that apply
     *            to the whole group. This required object depends on the value
     *            you set for (Type) under (OutputGroups)>(OutputGroupSettings).
     *            Type, settings object pairs are as follows. *
     *            FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS,
     *            HlsGroupSettings * DASH_ISO_GROUP_SETTINGS,
     *            DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *            MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     */
    public void setOutputGroups(java.util.Collection<OutputGroup> outputGroups) {
        if (outputGroups == null) {
            this.outputGroups = null;
            return;
        }

        this.outputGroups = new java.util.ArrayList<OutputGroup>(outputGroups);
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs
     * that share a common package type. All unpackaged files (MPEG-4, MPEG-2
     * TS, Quicktime, MXF, and no container) are grouped in a single output
     * group as well. Required in (OutputGroups) is a group of settings that
     * apply to the whole group. This required object depends on the value you
     * set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings
     * object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings *
     * HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS,
     * DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputGroups (OutputGroups) contains one group of settings for
     *            each set of outputs that share a common package type. All
     *            unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no
     *            container) are grouped in a single output group as well.
     *            Required in (OutputGroups) is a group of settings that apply
     *            to the whole group. This required object depends on the value
     *            you set for (Type) under (OutputGroups)>(OutputGroupSettings).
     *            Type, settings object pairs are as follows. *
     *            FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS,
     *            HlsGroupSettings * DASH_ISO_GROUP_SETTINGS,
     *            DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *            MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSettings withOutputGroups(OutputGroup... outputGroups) {
        if (getOutputGroups() == null) {
            this.outputGroups = new java.util.ArrayList<OutputGroup>(outputGroups.length);
        }
        for (OutputGroup value : outputGroups) {
            this.outputGroups.add(value);
        }
        return this;
    }

    /**
     * (OutputGroups) contains one group of settings for each set of outputs
     * that share a common package type. All unpackaged files (MPEG-4, MPEG-2
     * TS, Quicktime, MXF, and no container) are grouped in a single output
     * group as well. Required in (OutputGroups) is a group of settings that
     * apply to the whole group. This required object depends on the value you
     * set for (Type) under (OutputGroups)>(OutputGroupSettings). Type, settings
     * object pairs are as follows. * FILE_GROUP_SETTINGS, FileGroupSettings *
     * HLS_GROUP_SETTINGS, HlsGroupSettings * DASH_ISO_GROUP_SETTINGS,
     * DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS, MsSmoothGroupSettings *
     * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputGroups (OutputGroups) contains one group of settings for
     *            each set of outputs that share a common package type. All
     *            unpackaged files (MPEG-4, MPEG-2 TS, Quicktime, MXF, and no
     *            container) are grouped in a single output group as well.
     *            Required in (OutputGroups) is a group of settings that apply
     *            to the whole group. This required object depends on the value
     *            you set for (Type) under (OutputGroups)>(OutputGroupSettings).
     *            Type, settings object pairs are as follows. *
     *            FILE_GROUP_SETTINGS, FileGroupSettings * HLS_GROUP_SETTINGS,
     *            HlsGroupSettings * DASH_ISO_GROUP_SETTINGS,
     *            DashIsoGroupSettings * MS_SMOOTH_GROUP_SETTINGS,
     *            MsSmoothGroupSettings * CMAF_GROUP_SETTINGS, CmafGroupSettings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSettings withOutputGroups(java.util.Collection<OutputGroup> outputGroups) {
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
    public JobTemplateSettings withTimecodeConfig(TimecodeConfig timecodeConfig) {
        this.timecodeConfig = timecodeConfig;
        return this;
    }

    /**
     * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3
     * tags in your job. To include timed metadata, you must enable it here,
     * enable it in each output container, and specify tags and timecodes in ID3
     * insertion (Id3Insertion) objects.
     *
     * @return Enable Timed metadata insertion (TimedMetadataInsertion) to
     *         include ID3 tags in your job. To include timed metadata, you must
     *         enable it here, enable it in each output container, and specify
     *         tags and timecodes in ID3 insertion (Id3Insertion) objects.
     */
    public TimedMetadataInsertion getTimedMetadataInsertion() {
        return timedMetadataInsertion;
    }

    /**
     * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3
     * tags in your job. To include timed metadata, you must enable it here,
     * enable it in each output container, and specify tags and timecodes in ID3
     * insertion (Id3Insertion) objects.
     *
     * @param timedMetadataInsertion Enable Timed metadata insertion
     *            (TimedMetadataInsertion) to include ID3 tags in your job. To
     *            include timed metadata, you must enable it here, enable it in
     *            each output container, and specify tags and timecodes in ID3
     *            insertion (Id3Insertion) objects.
     */
    public void setTimedMetadataInsertion(TimedMetadataInsertion timedMetadataInsertion) {
        this.timedMetadataInsertion = timedMetadataInsertion;
    }

    /**
     * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3
     * tags in your job. To include timed metadata, you must enable it here,
     * enable it in each output container, and specify tags and timecodes in ID3
     * insertion (Id3Insertion) objects.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timedMetadataInsertion Enable Timed metadata insertion
     *            (TimedMetadataInsertion) to include ID3 tags in your job. To
     *            include timed metadata, you must enable it here, enable it in
     *            each output container, and specify tags and timecodes in ID3
     *            insertion (Id3Insertion) objects.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JobTemplateSettings withTimedMetadataInsertion(
            TimedMetadataInsertion timedMetadataInsertion) {
        this.timedMetadataInsertion = timedMetadataInsertion;
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
        if (getAdAvailOffset() != null)
            sb.append("AdAvailOffset: " + getAdAvailOffset() + ",");
        if (getAvailBlanking() != null)
            sb.append("AvailBlanking: " + getAvailBlanking() + ",");
        if (getEsam() != null)
            sb.append("Esam: " + getEsam() + ",");
        if (getInputs() != null)
            sb.append("Inputs: " + getInputs() + ",");
        if (getMotionImageInserter() != null)
            sb.append("MotionImageInserter: " + getMotionImageInserter() + ",");
        if (getNielsenConfiguration() != null)
            sb.append("NielsenConfiguration: " + getNielsenConfiguration() + ",");
        if (getOutputGroups() != null)
            sb.append("OutputGroups: " + getOutputGroups() + ",");
        if (getTimecodeConfig() != null)
            sb.append("TimecodeConfig: " + getTimecodeConfig() + ",");
        if (getTimedMetadataInsertion() != null)
            sb.append("TimedMetadataInsertion: " + getTimedMetadataInsertion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdAvailOffset() == null) ? 0 : getAdAvailOffset().hashCode());
        hashCode = prime * hashCode
                + ((getAvailBlanking() == null) ? 0 : getAvailBlanking().hashCode());
        hashCode = prime * hashCode + ((getEsam() == null) ? 0 : getEsam().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode
                + ((getMotionImageInserter() == null) ? 0 : getMotionImageInserter().hashCode());
        hashCode = prime * hashCode
                + ((getNielsenConfiguration() == null) ? 0 : getNielsenConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getOutputGroups() == null) ? 0 : getOutputGroups().hashCode());
        hashCode = prime * hashCode
                + ((getTimecodeConfig() == null) ? 0 : getTimecodeConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getTimedMetadataInsertion() == null) ? 0 : getTimedMetadataInsertion()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobTemplateSettings == false)
            return false;
        JobTemplateSettings other = (JobTemplateSettings) obj;

        if (other.getAdAvailOffset() == null ^ this.getAdAvailOffset() == null)
            return false;
        if (other.getAdAvailOffset() != null
                && other.getAdAvailOffset().equals(this.getAdAvailOffset()) == false)
            return false;
        if (other.getAvailBlanking() == null ^ this.getAvailBlanking() == null)
            return false;
        if (other.getAvailBlanking() != null
                && other.getAvailBlanking().equals(this.getAvailBlanking()) == false)
            return false;
        if (other.getEsam() == null ^ this.getEsam() == null)
            return false;
        if (other.getEsam() != null && other.getEsam().equals(this.getEsam()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getMotionImageInserter() == null ^ this.getMotionImageInserter() == null)
            return false;
        if (other.getMotionImageInserter() != null
                && other.getMotionImageInserter().equals(this.getMotionImageInserter()) == false)
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
        if (other.getTimedMetadataInsertion() == null ^ this.getTimedMetadataInsertion() == null)
            return false;
        if (other.getTimedMetadataInsertion() != null
                && other.getTimedMetadataInsertion().equals(this.getTimedMetadataInsertion()) == false)
            return false;
        return true;
    }
}
