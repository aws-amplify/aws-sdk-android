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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Holds the settings for a single schedule action.
 */
public class ScheduleActionSettings implements Serializable {
    /**
     * Action to insert HLS ID3 segment tagging
     */
    private HlsId3SegmentTaggingScheduleActionSettings hlsId3SegmentTaggingSettings;

    /**
     * Action to insert HLS metadata
     */
    private HlsTimedMetadataScheduleActionSettings hlsTimedMetadataSettings;

    /**
     * Action to switch the input
     */
    private InputSwitchScheduleActionSettings inputSwitchSettings;

    /**
     * Action to pause or unpause one or both channel pipelines
     */
    private PauseStateScheduleActionSettings pauseStateSettings;

    /**
     * Action to insert SCTE-35 return_to_network message
     */
    private Scte35ReturnToNetworkScheduleActionSettings scte35ReturnToNetworkSettings;

    /**
     * Action to insert SCTE-35 splice_insert message
     */
    private Scte35SpliceInsertScheduleActionSettings scte35SpliceInsertSettings;

    /**
     * Action to insert SCTE-35 time_signal message
     */
    private Scte35TimeSignalScheduleActionSettings scte35TimeSignalSettings;

    /**
     * Action to activate a static image overlay
     */
    private StaticImageActivateScheduleActionSettings staticImageActivateSettings;

    /**
     * Action to deactivate a static image overlay
     */
    private StaticImageDeactivateScheduleActionSettings staticImageDeactivateSettings;

    /**
     * Action to insert HLS ID3 segment tagging
     *
     * @return Action to insert HLS ID3 segment tagging
     */
    public HlsId3SegmentTaggingScheduleActionSettings getHlsId3SegmentTaggingSettings() {
        return hlsId3SegmentTaggingSettings;
    }

    /**
     * Action to insert HLS ID3 segment tagging
     *
     * @param hlsId3SegmentTaggingSettings Action to insert HLS ID3 segment
     *            tagging
     */
    public void setHlsId3SegmentTaggingSettings(
            HlsId3SegmentTaggingScheduleActionSettings hlsId3SegmentTaggingSettings) {
        this.hlsId3SegmentTaggingSettings = hlsId3SegmentTaggingSettings;
    }

    /**
     * Action to insert HLS ID3 segment tagging
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsId3SegmentTaggingSettings Action to insert HLS ID3 segment
     *            tagging
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleActionSettings withHlsId3SegmentTaggingSettings(
            HlsId3SegmentTaggingScheduleActionSettings hlsId3SegmentTaggingSettings) {
        this.hlsId3SegmentTaggingSettings = hlsId3SegmentTaggingSettings;
        return this;
    }

    /**
     * Action to insert HLS metadata
     *
     * @return Action to insert HLS metadata
     */
    public HlsTimedMetadataScheduleActionSettings getHlsTimedMetadataSettings() {
        return hlsTimedMetadataSettings;
    }

    /**
     * Action to insert HLS metadata
     *
     * @param hlsTimedMetadataSettings Action to insert HLS metadata
     */
    public void setHlsTimedMetadataSettings(
            HlsTimedMetadataScheduleActionSettings hlsTimedMetadataSettings) {
        this.hlsTimedMetadataSettings = hlsTimedMetadataSettings;
    }

    /**
     * Action to insert HLS metadata
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hlsTimedMetadataSettings Action to insert HLS metadata
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleActionSettings withHlsTimedMetadataSettings(
            HlsTimedMetadataScheduleActionSettings hlsTimedMetadataSettings) {
        this.hlsTimedMetadataSettings = hlsTimedMetadataSettings;
        return this;
    }

    /**
     * Action to switch the input
     *
     * @return Action to switch the input
     */
    public InputSwitchScheduleActionSettings getInputSwitchSettings() {
        return inputSwitchSettings;
    }

    /**
     * Action to switch the input
     *
     * @param inputSwitchSettings Action to switch the input
     */
    public void setInputSwitchSettings(InputSwitchScheduleActionSettings inputSwitchSettings) {
        this.inputSwitchSettings = inputSwitchSettings;
    }

    /**
     * Action to switch the input
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputSwitchSettings Action to switch the input
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleActionSettings withInputSwitchSettings(
            InputSwitchScheduleActionSettings inputSwitchSettings) {
        this.inputSwitchSettings = inputSwitchSettings;
        return this;
    }

    /**
     * Action to pause or unpause one or both channel pipelines
     *
     * @return Action to pause or unpause one or both channel pipelines
     */
    public PauseStateScheduleActionSettings getPauseStateSettings() {
        return pauseStateSettings;
    }

    /**
     * Action to pause or unpause one or both channel pipelines
     *
     * @param pauseStateSettings Action to pause or unpause one or both channel
     *            pipelines
     */
    public void setPauseStateSettings(PauseStateScheduleActionSettings pauseStateSettings) {
        this.pauseStateSettings = pauseStateSettings;
    }

    /**
     * Action to pause or unpause one or both channel pipelines
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pauseStateSettings Action to pause or unpause one or both channel
     *            pipelines
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleActionSettings withPauseStateSettings(
            PauseStateScheduleActionSettings pauseStateSettings) {
        this.pauseStateSettings = pauseStateSettings;
        return this;
    }

    /**
     * Action to insert SCTE-35 return_to_network message
     *
     * @return Action to insert SCTE-35 return_to_network message
     */
    public Scte35ReturnToNetworkScheduleActionSettings getScte35ReturnToNetworkSettings() {
        return scte35ReturnToNetworkSettings;
    }

    /**
     * Action to insert SCTE-35 return_to_network message
     *
     * @param scte35ReturnToNetworkSettings Action to insert SCTE-35
     *            return_to_network message
     */
    public void setScte35ReturnToNetworkSettings(
            Scte35ReturnToNetworkScheduleActionSettings scte35ReturnToNetworkSettings) {
        this.scte35ReturnToNetworkSettings = scte35ReturnToNetworkSettings;
    }

    /**
     * Action to insert SCTE-35 return_to_network message
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte35ReturnToNetworkSettings Action to insert SCTE-35
     *            return_to_network message
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleActionSettings withScte35ReturnToNetworkSettings(
            Scte35ReturnToNetworkScheduleActionSettings scte35ReturnToNetworkSettings) {
        this.scte35ReturnToNetworkSettings = scte35ReturnToNetworkSettings;
        return this;
    }

    /**
     * Action to insert SCTE-35 splice_insert message
     *
     * @return Action to insert SCTE-35 splice_insert message
     */
    public Scte35SpliceInsertScheduleActionSettings getScte35SpliceInsertSettings() {
        return scte35SpliceInsertSettings;
    }

    /**
     * Action to insert SCTE-35 splice_insert message
     *
     * @param scte35SpliceInsertSettings Action to insert SCTE-35 splice_insert
     *            message
     */
    public void setScte35SpliceInsertSettings(
            Scte35SpliceInsertScheduleActionSettings scte35SpliceInsertSettings) {
        this.scte35SpliceInsertSettings = scte35SpliceInsertSettings;
    }

    /**
     * Action to insert SCTE-35 splice_insert message
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte35SpliceInsertSettings Action to insert SCTE-35 splice_insert
     *            message
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleActionSettings withScte35SpliceInsertSettings(
            Scte35SpliceInsertScheduleActionSettings scte35SpliceInsertSettings) {
        this.scte35SpliceInsertSettings = scte35SpliceInsertSettings;
        return this;
    }

    /**
     * Action to insert SCTE-35 time_signal message
     *
     * @return Action to insert SCTE-35 time_signal message
     */
    public Scte35TimeSignalScheduleActionSettings getScte35TimeSignalSettings() {
        return scte35TimeSignalSettings;
    }

    /**
     * Action to insert SCTE-35 time_signal message
     *
     * @param scte35TimeSignalSettings Action to insert SCTE-35 time_signal
     *            message
     */
    public void setScte35TimeSignalSettings(
            Scte35TimeSignalScheduleActionSettings scte35TimeSignalSettings) {
        this.scte35TimeSignalSettings = scte35TimeSignalSettings;
    }

    /**
     * Action to insert SCTE-35 time_signal message
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte35TimeSignalSettings Action to insert SCTE-35 time_signal
     *            message
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleActionSettings withScte35TimeSignalSettings(
            Scte35TimeSignalScheduleActionSettings scte35TimeSignalSettings) {
        this.scte35TimeSignalSettings = scte35TimeSignalSettings;
        return this;
    }

    /**
     * Action to activate a static image overlay
     *
     * @return Action to activate a static image overlay
     */
    public StaticImageActivateScheduleActionSettings getStaticImageActivateSettings() {
        return staticImageActivateSettings;
    }

    /**
     * Action to activate a static image overlay
     *
     * @param staticImageActivateSettings Action to activate a static image
     *            overlay
     */
    public void setStaticImageActivateSettings(
            StaticImageActivateScheduleActionSettings staticImageActivateSettings) {
        this.staticImageActivateSettings = staticImageActivateSettings;
    }

    /**
     * Action to activate a static image overlay
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staticImageActivateSettings Action to activate a static image
     *            overlay
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleActionSettings withStaticImageActivateSettings(
            StaticImageActivateScheduleActionSettings staticImageActivateSettings) {
        this.staticImageActivateSettings = staticImageActivateSettings;
        return this;
    }

    /**
     * Action to deactivate a static image overlay
     *
     * @return Action to deactivate a static image overlay
     */
    public StaticImageDeactivateScheduleActionSettings getStaticImageDeactivateSettings() {
        return staticImageDeactivateSettings;
    }

    /**
     * Action to deactivate a static image overlay
     *
     * @param staticImageDeactivateSettings Action to deactivate a static image
     *            overlay
     */
    public void setStaticImageDeactivateSettings(
            StaticImageDeactivateScheduleActionSettings staticImageDeactivateSettings) {
        this.staticImageDeactivateSettings = staticImageDeactivateSettings;
    }

    /**
     * Action to deactivate a static image overlay
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param staticImageDeactivateSettings Action to deactivate a static image
     *            overlay
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ScheduleActionSettings withStaticImageDeactivateSettings(
            StaticImageDeactivateScheduleActionSettings staticImageDeactivateSettings) {
        this.staticImageDeactivateSettings = staticImageDeactivateSettings;
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
        if (getHlsId3SegmentTaggingSettings() != null)
            sb.append("HlsId3SegmentTaggingSettings: " + getHlsId3SegmentTaggingSettings() + ",");
        if (getHlsTimedMetadataSettings() != null)
            sb.append("HlsTimedMetadataSettings: " + getHlsTimedMetadataSettings() + ",");
        if (getInputSwitchSettings() != null)
            sb.append("InputSwitchSettings: " + getInputSwitchSettings() + ",");
        if (getPauseStateSettings() != null)
            sb.append("PauseStateSettings: " + getPauseStateSettings() + ",");
        if (getScte35ReturnToNetworkSettings() != null)
            sb.append("Scte35ReturnToNetworkSettings: " + getScte35ReturnToNetworkSettings() + ",");
        if (getScte35SpliceInsertSettings() != null)
            sb.append("Scte35SpliceInsertSettings: " + getScte35SpliceInsertSettings() + ",");
        if (getScte35TimeSignalSettings() != null)
            sb.append("Scte35TimeSignalSettings: " + getScte35TimeSignalSettings() + ",");
        if (getStaticImageActivateSettings() != null)
            sb.append("StaticImageActivateSettings: " + getStaticImageActivateSettings() + ",");
        if (getStaticImageDeactivateSettings() != null)
            sb.append("StaticImageDeactivateSettings: " + getStaticImageDeactivateSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHlsId3SegmentTaggingSettings() == null) ? 0
                        : getHlsId3SegmentTaggingSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getHlsTimedMetadataSettings() == null) ? 0 : getHlsTimedMetadataSettings()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getInputSwitchSettings() == null) ? 0 : getInputSwitchSettings().hashCode());
        hashCode = prime * hashCode
                + ((getPauseStateSettings() == null) ? 0 : getPauseStateSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getScte35ReturnToNetworkSettings() == null) ? 0
                        : getScte35ReturnToNetworkSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getScte35SpliceInsertSettings() == null) ? 0 : getScte35SpliceInsertSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getScte35TimeSignalSettings() == null) ? 0 : getScte35TimeSignalSettings()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getStaticImageActivateSettings() == null) ? 0
                        : getStaticImageActivateSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getStaticImageDeactivateSettings() == null) ? 0
                        : getStaticImageDeactivateSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleActionSettings == false)
            return false;
        ScheduleActionSettings other = (ScheduleActionSettings) obj;

        if (other.getHlsId3SegmentTaggingSettings() == null
                ^ this.getHlsId3SegmentTaggingSettings() == null)
            return false;
        if (other.getHlsId3SegmentTaggingSettings() != null
                && other.getHlsId3SegmentTaggingSettings().equals(
                        this.getHlsId3SegmentTaggingSettings()) == false)
            return false;
        if (other.getHlsTimedMetadataSettings() == null
                ^ this.getHlsTimedMetadataSettings() == null)
            return false;
        if (other.getHlsTimedMetadataSettings() != null
                && other.getHlsTimedMetadataSettings().equals(this.getHlsTimedMetadataSettings()) == false)
            return false;
        if (other.getInputSwitchSettings() == null ^ this.getInputSwitchSettings() == null)
            return false;
        if (other.getInputSwitchSettings() != null
                && other.getInputSwitchSettings().equals(this.getInputSwitchSettings()) == false)
            return false;
        if (other.getPauseStateSettings() == null ^ this.getPauseStateSettings() == null)
            return false;
        if (other.getPauseStateSettings() != null
                && other.getPauseStateSettings().equals(this.getPauseStateSettings()) == false)
            return false;
        if (other.getScte35ReturnToNetworkSettings() == null
                ^ this.getScte35ReturnToNetworkSettings() == null)
            return false;
        if (other.getScte35ReturnToNetworkSettings() != null
                && other.getScte35ReturnToNetworkSettings().equals(
                        this.getScte35ReturnToNetworkSettings()) == false)
            return false;
        if (other.getScte35SpliceInsertSettings() == null
                ^ this.getScte35SpliceInsertSettings() == null)
            return false;
        if (other.getScte35SpliceInsertSettings() != null
                && other.getScte35SpliceInsertSettings().equals(
                        this.getScte35SpliceInsertSettings()) == false)
            return false;
        if (other.getScte35TimeSignalSettings() == null
                ^ this.getScte35TimeSignalSettings() == null)
            return false;
        if (other.getScte35TimeSignalSettings() != null
                && other.getScte35TimeSignalSettings().equals(this.getScte35TimeSignalSettings()) == false)
            return false;
        if (other.getStaticImageActivateSettings() == null
                ^ this.getStaticImageActivateSettings() == null)
            return false;
        if (other.getStaticImageActivateSettings() != null
                && other.getStaticImageActivateSettings().equals(
                        this.getStaticImageActivateSettings()) == false)
            return false;
        if (other.getStaticImageDeactivateSettings() == null
                ^ this.getStaticImageDeactivateSettings() == null)
            return false;
        if (other.getStaticImageDeactivateSettings() != null
                && other.getStaticImageDeactivateSettings().equals(
                        this.getStaticImageDeactivateSettings()) == false)
            return false;
        return true;
    }
}
