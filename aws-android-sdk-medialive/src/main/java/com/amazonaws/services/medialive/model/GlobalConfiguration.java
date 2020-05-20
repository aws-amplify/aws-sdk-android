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
 * Global Configuration
 */
public class GlobalConfiguration implements Serializable {
    /**
     * Value to set the initial audio gain for the Live Event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-60 - 60<br/>
     */
    private Integer initialAudioGain;

    /**
     * Indicates the action to take when the current input completes (e.g.
     * end-of-file). When switchAndLoopInputs is configured the encoder will
     * restart at the beginning of the first input. When "none" is configured
     * the encoder will transcode either black, a solid color, or a user
     * specified slate images per the "Input Loss Behavior" configuration until
     * the next input switch occurs (which is controlled through the Channel
     * Schedule API).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SWITCH_AND_LOOP_INPUTS
     */
    private String inputEndAction;

    /**
     * Settings for system actions when input is lost.
     */
    private InputLossBehavior inputLossBehavior;

    /**
     * Indicates how MediaLive pipelines are synchronized. PIPELINE_LOCKING -
     * MediaLive will attempt to synchronize the output of each pipeline to the
     * other. EPOCH_LOCKING - MediaLive will attempt to synchronize the output
     * of each pipeline to the Unix epoch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EPOCH_LOCKING, PIPELINE_LOCKING
     */
    private String outputLockingMode;

    /**
     * Indicates whether the rate of frames emitted by the Live encoder should
     * be paced by its system clock (which optionally may be locked to another
     * source via NTP) or should be locked to the clock of the source that is
     * providing the input stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT_CLOCK, SYSTEM_CLOCK
     */
    private String outputTimingSource;

    /**
     * Adjusts video input buffer for streams with very low video framerates.
     * This is commonly set to enabled for music channels with less than one
     * video frame per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String supportLowFramerateInputs;

    /**
     * Value to set the initial audio gain for the Live Event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-60 - 60<br/>
     *
     * @return Value to set the initial audio gain for the Live Event.
     */
    public Integer getInitialAudioGain() {
        return initialAudioGain;
    }

    /**
     * Value to set the initial audio gain for the Live Event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-60 - 60<br/>
     *
     * @param initialAudioGain Value to set the initial audio gain for the Live
     *            Event.
     */
    public void setInitialAudioGain(Integer initialAudioGain) {
        this.initialAudioGain = initialAudioGain;
    }

    /**
     * Value to set the initial audio gain for the Live Event.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>-60 - 60<br/>
     *
     * @param initialAudioGain Value to set the initial audio gain for the Live
     *            Event.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalConfiguration withInitialAudioGain(Integer initialAudioGain) {
        this.initialAudioGain = initialAudioGain;
        return this;
    }

    /**
     * Indicates the action to take when the current input completes (e.g.
     * end-of-file). When switchAndLoopInputs is configured the encoder will
     * restart at the beginning of the first input. When "none" is configured
     * the encoder will transcode either black, a solid color, or a user
     * specified slate images per the "Input Loss Behavior" configuration until
     * the next input switch occurs (which is controlled through the Channel
     * Schedule API).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SWITCH_AND_LOOP_INPUTS
     *
     * @return Indicates the action to take when the current input completes
     *         (e.g. end-of-file). When switchAndLoopInputs is configured the
     *         encoder will restart at the beginning of the first input. When
     *         "none" is configured the encoder will transcode either black, a
     *         solid color, or a user specified slate images per the
     *         "Input Loss Behavior" configuration until the next input switch
     *         occurs (which is controlled through the Channel Schedule API).
     * @see GlobalConfigurationInputEndAction
     */
    public String getInputEndAction() {
        return inputEndAction;
    }

    /**
     * Indicates the action to take when the current input completes (e.g.
     * end-of-file). When switchAndLoopInputs is configured the encoder will
     * restart at the beginning of the first input. When "none" is configured
     * the encoder will transcode either black, a solid color, or a user
     * specified slate images per the "Input Loss Behavior" configuration until
     * the next input switch occurs (which is controlled through the Channel
     * Schedule API).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SWITCH_AND_LOOP_INPUTS
     *
     * @param inputEndAction Indicates the action to take when the current input
     *            completes (e.g. end-of-file). When switchAndLoopInputs is
     *            configured the encoder will restart at the beginning of the
     *            first input. When "none" is configured the encoder will
     *            transcode either black, a solid color, or a user specified
     *            slate images per the "Input Loss Behavior" configuration until
     *            the next input switch occurs (which is controlled through the
     *            Channel Schedule API).
     * @see GlobalConfigurationInputEndAction
     */
    public void setInputEndAction(String inputEndAction) {
        this.inputEndAction = inputEndAction;
    }

    /**
     * Indicates the action to take when the current input completes (e.g.
     * end-of-file). When switchAndLoopInputs is configured the encoder will
     * restart at the beginning of the first input. When "none" is configured
     * the encoder will transcode either black, a solid color, or a user
     * specified slate images per the "Input Loss Behavior" configuration until
     * the next input switch occurs (which is controlled through the Channel
     * Schedule API).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SWITCH_AND_LOOP_INPUTS
     *
     * @param inputEndAction Indicates the action to take when the current input
     *            completes (e.g. end-of-file). When switchAndLoopInputs is
     *            configured the encoder will restart at the beginning of the
     *            first input. When "none" is configured the encoder will
     *            transcode either black, a solid color, or a user specified
     *            slate images per the "Input Loss Behavior" configuration until
     *            the next input switch occurs (which is controlled through the
     *            Channel Schedule API).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalConfigurationInputEndAction
     */
    public GlobalConfiguration withInputEndAction(String inputEndAction) {
        this.inputEndAction = inputEndAction;
        return this;
    }

    /**
     * Indicates the action to take when the current input completes (e.g.
     * end-of-file). When switchAndLoopInputs is configured the encoder will
     * restart at the beginning of the first input. When "none" is configured
     * the encoder will transcode either black, a solid color, or a user
     * specified slate images per the "Input Loss Behavior" configuration until
     * the next input switch occurs (which is controlled through the Channel
     * Schedule API).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SWITCH_AND_LOOP_INPUTS
     *
     * @param inputEndAction Indicates the action to take when the current input
     *            completes (e.g. end-of-file). When switchAndLoopInputs is
     *            configured the encoder will restart at the beginning of the
     *            first input. When "none" is configured the encoder will
     *            transcode either black, a solid color, or a user specified
     *            slate images per the "Input Loss Behavior" configuration until
     *            the next input switch occurs (which is controlled through the
     *            Channel Schedule API).
     * @see GlobalConfigurationInputEndAction
     */
    public void setInputEndAction(GlobalConfigurationInputEndAction inputEndAction) {
        this.inputEndAction = inputEndAction.toString();
    }

    /**
     * Indicates the action to take when the current input completes (e.g.
     * end-of-file). When switchAndLoopInputs is configured the encoder will
     * restart at the beginning of the first input. When "none" is configured
     * the encoder will transcode either black, a solid color, or a user
     * specified slate images per the "Input Loss Behavior" configuration until
     * the next input switch occurs (which is controlled through the Channel
     * Schedule API).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SWITCH_AND_LOOP_INPUTS
     *
     * @param inputEndAction Indicates the action to take when the current input
     *            completes (e.g. end-of-file). When switchAndLoopInputs is
     *            configured the encoder will restart at the beginning of the
     *            first input. When "none" is configured the encoder will
     *            transcode either black, a solid color, or a user specified
     *            slate images per the "Input Loss Behavior" configuration until
     *            the next input switch occurs (which is controlled through the
     *            Channel Schedule API).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalConfigurationInputEndAction
     */
    public GlobalConfiguration withInputEndAction(GlobalConfigurationInputEndAction inputEndAction) {
        this.inputEndAction = inputEndAction.toString();
        return this;
    }

    /**
     * Settings for system actions when input is lost.
     *
     * @return Settings for system actions when input is lost.
     */
    public InputLossBehavior getInputLossBehavior() {
        return inputLossBehavior;
    }

    /**
     * Settings for system actions when input is lost.
     *
     * @param inputLossBehavior Settings for system actions when input is lost.
     */
    public void setInputLossBehavior(InputLossBehavior inputLossBehavior) {
        this.inputLossBehavior = inputLossBehavior;
    }

    /**
     * Settings for system actions when input is lost.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputLossBehavior Settings for system actions when input is lost.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GlobalConfiguration withInputLossBehavior(InputLossBehavior inputLossBehavior) {
        this.inputLossBehavior = inputLossBehavior;
        return this;
    }

    /**
     * Indicates how MediaLive pipelines are synchronized. PIPELINE_LOCKING -
     * MediaLive will attempt to synchronize the output of each pipeline to the
     * other. EPOCH_LOCKING - MediaLive will attempt to synchronize the output
     * of each pipeline to the Unix epoch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EPOCH_LOCKING, PIPELINE_LOCKING
     *
     * @return Indicates how MediaLive pipelines are synchronized.
     *         PIPELINE_LOCKING - MediaLive will attempt to synchronize the
     *         output of each pipeline to the other. EPOCH_LOCKING - MediaLive
     *         will attempt to synchronize the output of each pipeline to the
     *         Unix epoch.
     * @see GlobalConfigurationOutputLockingMode
     */
    public String getOutputLockingMode() {
        return outputLockingMode;
    }

    /**
     * Indicates how MediaLive pipelines are synchronized. PIPELINE_LOCKING -
     * MediaLive will attempt to synchronize the output of each pipeline to the
     * other. EPOCH_LOCKING - MediaLive will attempt to synchronize the output
     * of each pipeline to the Unix epoch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EPOCH_LOCKING, PIPELINE_LOCKING
     *
     * @param outputLockingMode Indicates how MediaLive pipelines are
     *            synchronized. PIPELINE_LOCKING - MediaLive will attempt to
     *            synchronize the output of each pipeline to the other.
     *            EPOCH_LOCKING - MediaLive will attempt to synchronize the
     *            output of each pipeline to the Unix epoch.
     * @see GlobalConfigurationOutputLockingMode
     */
    public void setOutputLockingMode(String outputLockingMode) {
        this.outputLockingMode = outputLockingMode;
    }

    /**
     * Indicates how MediaLive pipelines are synchronized. PIPELINE_LOCKING -
     * MediaLive will attempt to synchronize the output of each pipeline to the
     * other. EPOCH_LOCKING - MediaLive will attempt to synchronize the output
     * of each pipeline to the Unix epoch.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EPOCH_LOCKING, PIPELINE_LOCKING
     *
     * @param outputLockingMode Indicates how MediaLive pipelines are
     *            synchronized. PIPELINE_LOCKING - MediaLive will attempt to
     *            synchronize the output of each pipeline to the other.
     *            EPOCH_LOCKING - MediaLive will attempt to synchronize the
     *            output of each pipeline to the Unix epoch.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalConfigurationOutputLockingMode
     */
    public GlobalConfiguration withOutputLockingMode(String outputLockingMode) {
        this.outputLockingMode = outputLockingMode;
        return this;
    }

    /**
     * Indicates how MediaLive pipelines are synchronized. PIPELINE_LOCKING -
     * MediaLive will attempt to synchronize the output of each pipeline to the
     * other. EPOCH_LOCKING - MediaLive will attempt to synchronize the output
     * of each pipeline to the Unix epoch.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EPOCH_LOCKING, PIPELINE_LOCKING
     *
     * @param outputLockingMode Indicates how MediaLive pipelines are
     *            synchronized. PIPELINE_LOCKING - MediaLive will attempt to
     *            synchronize the output of each pipeline to the other.
     *            EPOCH_LOCKING - MediaLive will attempt to synchronize the
     *            output of each pipeline to the Unix epoch.
     * @see GlobalConfigurationOutputLockingMode
     */
    public void setOutputLockingMode(GlobalConfigurationOutputLockingMode outputLockingMode) {
        this.outputLockingMode = outputLockingMode.toString();
    }

    /**
     * Indicates how MediaLive pipelines are synchronized. PIPELINE_LOCKING -
     * MediaLive will attempt to synchronize the output of each pipeline to the
     * other. EPOCH_LOCKING - MediaLive will attempt to synchronize the output
     * of each pipeline to the Unix epoch.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EPOCH_LOCKING, PIPELINE_LOCKING
     *
     * @param outputLockingMode Indicates how MediaLive pipelines are
     *            synchronized. PIPELINE_LOCKING - MediaLive will attempt to
     *            synchronize the output of each pipeline to the other.
     *            EPOCH_LOCKING - MediaLive will attempt to synchronize the
     *            output of each pipeline to the Unix epoch.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalConfigurationOutputLockingMode
     */
    public GlobalConfiguration withOutputLockingMode(
            GlobalConfigurationOutputLockingMode outputLockingMode) {
        this.outputLockingMode = outputLockingMode.toString();
        return this;
    }

    /**
     * Indicates whether the rate of frames emitted by the Live encoder should
     * be paced by its system clock (which optionally may be locked to another
     * source via NTP) or should be locked to the clock of the source that is
     * providing the input stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT_CLOCK, SYSTEM_CLOCK
     *
     * @return Indicates whether the rate of frames emitted by the Live encoder
     *         should be paced by its system clock (which optionally may be
     *         locked to another source via NTP) or should be locked to the
     *         clock of the source that is providing the input stream.
     * @see GlobalConfigurationOutputTimingSource
     */
    public String getOutputTimingSource() {
        return outputTimingSource;
    }

    /**
     * Indicates whether the rate of frames emitted by the Live encoder should
     * be paced by its system clock (which optionally may be locked to another
     * source via NTP) or should be locked to the clock of the source that is
     * providing the input stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT_CLOCK, SYSTEM_CLOCK
     *
     * @param outputTimingSource Indicates whether the rate of frames emitted by
     *            the Live encoder should be paced by its system clock (which
     *            optionally may be locked to another source via NTP) or should
     *            be locked to the clock of the source that is providing the
     *            input stream.
     * @see GlobalConfigurationOutputTimingSource
     */
    public void setOutputTimingSource(String outputTimingSource) {
        this.outputTimingSource = outputTimingSource;
    }

    /**
     * Indicates whether the rate of frames emitted by the Live encoder should
     * be paced by its system clock (which optionally may be locked to another
     * source via NTP) or should be locked to the clock of the source that is
     * providing the input stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT_CLOCK, SYSTEM_CLOCK
     *
     * @param outputTimingSource Indicates whether the rate of frames emitted by
     *            the Live encoder should be paced by its system clock (which
     *            optionally may be locked to another source via NTP) or should
     *            be locked to the clock of the source that is providing the
     *            input stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalConfigurationOutputTimingSource
     */
    public GlobalConfiguration withOutputTimingSource(String outputTimingSource) {
        this.outputTimingSource = outputTimingSource;
        return this;
    }

    /**
     * Indicates whether the rate of frames emitted by the Live encoder should
     * be paced by its system clock (which optionally may be locked to another
     * source via NTP) or should be locked to the clock of the source that is
     * providing the input stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT_CLOCK, SYSTEM_CLOCK
     *
     * @param outputTimingSource Indicates whether the rate of frames emitted by
     *            the Live encoder should be paced by its system clock (which
     *            optionally may be locked to another source via NTP) or should
     *            be locked to the clock of the source that is providing the
     *            input stream.
     * @see GlobalConfigurationOutputTimingSource
     */
    public void setOutputTimingSource(GlobalConfigurationOutputTimingSource outputTimingSource) {
        this.outputTimingSource = outputTimingSource.toString();
    }

    /**
     * Indicates whether the rate of frames emitted by the Live encoder should
     * be paced by its system clock (which optionally may be locked to another
     * source via NTP) or should be locked to the clock of the source that is
     * providing the input stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INPUT_CLOCK, SYSTEM_CLOCK
     *
     * @param outputTimingSource Indicates whether the rate of frames emitted by
     *            the Live encoder should be paced by its system clock (which
     *            optionally may be locked to another source via NTP) or should
     *            be locked to the clock of the source that is providing the
     *            input stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalConfigurationOutputTimingSource
     */
    public GlobalConfiguration withOutputTimingSource(
            GlobalConfigurationOutputTimingSource outputTimingSource) {
        this.outputTimingSource = outputTimingSource.toString();
        return this;
    }

    /**
     * Adjusts video input buffer for streams with very low video framerates.
     * This is commonly set to enabled for music channels with less than one
     * video frame per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Adjusts video input buffer for streams with very low video
     *         framerates. This is commonly set to enabled for music channels
     *         with less than one video frame per second.
     * @see GlobalConfigurationLowFramerateInputs
     */
    public String getSupportLowFramerateInputs() {
        return supportLowFramerateInputs;
    }

    /**
     * Adjusts video input buffer for streams with very low video framerates.
     * This is commonly set to enabled for music channels with less than one
     * video frame per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param supportLowFramerateInputs Adjusts video input buffer for streams
     *            with very low video framerates. This is commonly set to
     *            enabled for music channels with less than one video frame per
     *            second.
     * @see GlobalConfigurationLowFramerateInputs
     */
    public void setSupportLowFramerateInputs(String supportLowFramerateInputs) {
        this.supportLowFramerateInputs = supportLowFramerateInputs;
    }

    /**
     * Adjusts video input buffer for streams with very low video framerates.
     * This is commonly set to enabled for music channels with less than one
     * video frame per second.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param supportLowFramerateInputs Adjusts video input buffer for streams
     *            with very low video framerates. This is commonly set to
     *            enabled for music channels with less than one video frame per
     *            second.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalConfigurationLowFramerateInputs
     */
    public GlobalConfiguration withSupportLowFramerateInputs(String supportLowFramerateInputs) {
        this.supportLowFramerateInputs = supportLowFramerateInputs;
        return this;
    }

    /**
     * Adjusts video input buffer for streams with very low video framerates.
     * This is commonly set to enabled for music channels with less than one
     * video frame per second.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param supportLowFramerateInputs Adjusts video input buffer for streams
     *            with very low video framerates. This is commonly set to
     *            enabled for music channels with less than one video frame per
     *            second.
     * @see GlobalConfigurationLowFramerateInputs
     */
    public void setSupportLowFramerateInputs(
            GlobalConfigurationLowFramerateInputs supportLowFramerateInputs) {
        this.supportLowFramerateInputs = supportLowFramerateInputs.toString();
    }

    /**
     * Adjusts video input buffer for streams with very low video framerates.
     * This is commonly set to enabled for music channels with less than one
     * video frame per second.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param supportLowFramerateInputs Adjusts video input buffer for streams
     *            with very low video framerates. This is commonly set to
     *            enabled for music channels with less than one video frame per
     *            second.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see GlobalConfigurationLowFramerateInputs
     */
    public GlobalConfiguration withSupportLowFramerateInputs(
            GlobalConfigurationLowFramerateInputs supportLowFramerateInputs) {
        this.supportLowFramerateInputs = supportLowFramerateInputs.toString();
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
        if (getInitialAudioGain() != null)
            sb.append("InitialAudioGain: " + getInitialAudioGain() + ",");
        if (getInputEndAction() != null)
            sb.append("InputEndAction: " + getInputEndAction() + ",");
        if (getInputLossBehavior() != null)
            sb.append("InputLossBehavior: " + getInputLossBehavior() + ",");
        if (getOutputLockingMode() != null)
            sb.append("OutputLockingMode: " + getOutputLockingMode() + ",");
        if (getOutputTimingSource() != null)
            sb.append("OutputTimingSource: " + getOutputTimingSource() + ",");
        if (getSupportLowFramerateInputs() != null)
            sb.append("SupportLowFramerateInputs: " + getSupportLowFramerateInputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInitialAudioGain() == null) ? 0 : getInitialAudioGain().hashCode());
        hashCode = prime * hashCode
                + ((getInputEndAction() == null) ? 0 : getInputEndAction().hashCode());
        hashCode = prime * hashCode
                + ((getInputLossBehavior() == null) ? 0 : getInputLossBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getOutputLockingMode() == null) ? 0 : getOutputLockingMode().hashCode());
        hashCode = prime * hashCode
                + ((getOutputTimingSource() == null) ? 0 : getOutputTimingSource().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportLowFramerateInputs() == null) ? 0 : getSupportLowFramerateInputs()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalConfiguration == false)
            return false;
        GlobalConfiguration other = (GlobalConfiguration) obj;

        if (other.getInitialAudioGain() == null ^ this.getInitialAudioGain() == null)
            return false;
        if (other.getInitialAudioGain() != null
                && other.getInitialAudioGain().equals(this.getInitialAudioGain()) == false)
            return false;
        if (other.getInputEndAction() == null ^ this.getInputEndAction() == null)
            return false;
        if (other.getInputEndAction() != null
                && other.getInputEndAction().equals(this.getInputEndAction()) == false)
            return false;
        if (other.getInputLossBehavior() == null ^ this.getInputLossBehavior() == null)
            return false;
        if (other.getInputLossBehavior() != null
                && other.getInputLossBehavior().equals(this.getInputLossBehavior()) == false)
            return false;
        if (other.getOutputLockingMode() == null ^ this.getOutputLockingMode() == null)
            return false;
        if (other.getOutputLockingMode() != null
                && other.getOutputLockingMode().equals(this.getOutputLockingMode()) == false)
            return false;
        if (other.getOutputTimingSource() == null ^ this.getOutputTimingSource() == null)
            return false;
        if (other.getOutputTimingSource() != null
                && other.getOutputTimingSource().equals(this.getOutputTimingSource()) == false)
            return false;
        if (other.getSupportLowFramerateInputs() == null
                ^ this.getSupportLowFramerateInputs() == null)
            return false;
        if (other.getSupportLowFramerateInputs() != null
                && other.getSupportLowFramerateInputs().equals(this.getSupportLowFramerateInputs()) == false)
            return false;
        return true;
    }
}
