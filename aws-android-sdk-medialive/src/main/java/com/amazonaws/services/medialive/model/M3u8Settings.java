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
 * Settings information for the .m3u8 container
 */
public class M3u8Settings implements Serializable {
    /**
     * The number of audio frames to insert for each PES packet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer audioFramesPerPes;

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the
     * transport stream. Multiple values are accepted, and can be entered in
     * ranges and/or by comma separation. Can be entered as decimal or
     * hexadecimal values.
     */
    private String audioPids;

    /**
     * This parameter is unused and deprecated.
     */
    private String ecmPid;

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     */
    private String nielsenId3Behavior;

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream. A value of \"0\" writes out the PMT once per segment
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer patInterval;

    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET
     */
    private String pcrControl;

    /**
     * Maximum time in milliseconds between Program Clock References (PCRs)
     * inserted into the transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 500<br/>
     */
    private Integer pcrPeriod;

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the
     * transport stream. When no value is given, the encoder will assign the
     * same value as the Video PID. Can be entered as a decimal or hexadecimal
     * value.
     */
    private String pcrPid;

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream. A value of \"0\" writes out the PMT once per segment
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer pmtInterval;

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport
     * stream. Can be entered as a decimal or hexadecimal value.
     */
    private String pmtPid;

    /**
     * The value of the program number field in the Program Map Table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer programNum;

    /**
     * If set to passthrough, passes any SCTE-35 signals from the input source
     * to this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     */
    private String scte35Behavior;

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * Can be entered as a decimal or hexadecimal value.
     */
    private String scte35Pid;

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     */
    private String timedMetadataBehavior;

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport
     * stream. Can be entered as a decimal or hexadecimal value. Valid values
     * are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    private String timedMetadataPid;

    /**
     * The value of the transport stream ID field in the Program Map Table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer transportStreamId;

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport
     * stream. Can be entered as a decimal or hexadecimal value.
     */
    private String videoPid;

    /**
     * The number of audio frames to insert for each PES packet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The number of audio frames to insert for each PES packet.
     */
    public Integer getAudioFramesPerPes() {
        return audioFramesPerPes;
    }

    /**
     * The number of audio frames to insert for each PES packet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param audioFramesPerPes The number of audio frames to insert for each
     *            PES packet.
     */
    public void setAudioFramesPerPes(Integer audioFramesPerPes) {
        this.audioFramesPerPes = audioFramesPerPes;
    }

    /**
     * The number of audio frames to insert for each PES packet.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param audioFramesPerPes The number of audio frames to insert for each
     *            PES packet.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withAudioFramesPerPes(Integer audioFramesPerPes) {
        this.audioFramesPerPes = audioFramesPerPes;
        return this;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the
     * transport stream. Multiple values are accepted, and can be entered in
     * ranges and/or by comma separation. Can be entered as decimal or
     * hexadecimal values.
     *
     * @return Packet Identifier (PID) of the elementary audio stream(s) in the
     *         transport stream. Multiple values are accepted, and can be
     *         entered in ranges and/or by comma separation. Can be entered as
     *         decimal or hexadecimal values.
     */
    public String getAudioPids() {
        return audioPids;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the
     * transport stream. Multiple values are accepted, and can be entered in
     * ranges and/or by comma separation. Can be entered as decimal or
     * hexadecimal values.
     *
     * @param audioPids Packet Identifier (PID) of the elementary audio
     *            stream(s) in the transport stream. Multiple values are
     *            accepted, and can be entered in ranges and/or by comma
     *            separation. Can be entered as decimal or hexadecimal values.
     */
    public void setAudioPids(String audioPids) {
        this.audioPids = audioPids;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the
     * transport stream. Multiple values are accepted, and can be entered in
     * ranges and/or by comma separation. Can be entered as decimal or
     * hexadecimal values.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioPids Packet Identifier (PID) of the elementary audio
     *            stream(s) in the transport stream. Multiple values are
     *            accepted, and can be entered in ranges and/or by comma
     *            separation. Can be entered as decimal or hexadecimal values.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withAudioPids(String audioPids) {
        this.audioPids = audioPids;
        return this;
    }

    /**
     * This parameter is unused and deprecated.
     *
     * @return This parameter is unused and deprecated.
     */
    public String getEcmPid() {
        return ecmPid;
    }

    /**
     * This parameter is unused and deprecated.
     *
     * @param ecmPid This parameter is unused and deprecated.
     */
    public void setEcmPid(String ecmPid) {
        this.ecmPid = ecmPid;
    }

    /**
     * This parameter is unused and deprecated.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ecmPid This parameter is unused and deprecated.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withEcmPid(String ecmPid) {
        this.ecmPid = ecmPid;
        return this;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @return If set to passthrough, Nielsen inaudible tones for media tracking
     *         will be detected in the input audio and an equivalent ID3 tag
     *         will be inserted in the output.
     * @see M3u8NielsenId3Behavior
     */
    public String getNielsenId3Behavior() {
        return nielsenId3Behavior;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param nielsenId3Behavior If set to passthrough, Nielsen inaudible tones
     *            for media tracking will be detected in the input audio and an
     *            equivalent ID3 tag will be inserted in the output.
     * @see M3u8NielsenId3Behavior
     */
    public void setNielsenId3Behavior(String nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param nielsenId3Behavior If set to passthrough, Nielsen inaudible tones
     *            for media tracking will be detected in the input audio and an
     *            equivalent ID3 tag will be inserted in the output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8NielsenId3Behavior
     */
    public M3u8Settings withNielsenId3Behavior(String nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior;
        return this;
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param nielsenId3Behavior If set to passthrough, Nielsen inaudible tones
     *            for media tracking will be detected in the input audio and an
     *            equivalent ID3 tag will be inserted in the output.
     * @see M3u8NielsenId3Behavior
     */
    public void setNielsenId3Behavior(M3u8NielsenId3Behavior nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior.toString();
    }

    /**
     * If set to passthrough, Nielsen inaudible tones for media tracking will be
     * detected in the input audio and an equivalent ID3 tag will be inserted in
     * the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param nielsenId3Behavior If set to passthrough, Nielsen inaudible tones
     *            for media tracking will be detected in the input audio and an
     *            equivalent ID3 tag will be inserted in the output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8NielsenId3Behavior
     */
    public M3u8Settings withNielsenId3Behavior(M3u8NielsenId3Behavior nielsenId3Behavior) {
        this.nielsenId3Behavior = nielsenId3Behavior.toString();
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream. A value of \"0\" writes out the PMT once per segment
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return The number of milliseconds between instances of this table in the
     *         output transport stream. A value of \"0\" writes out the PMT once
     *         per segment file.
     */
    public Integer getPatInterval() {
        return patInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream. A value of \"0\" writes out the PMT once per segment
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param patInterval The number of milliseconds between instances of this
     *            table in the output transport stream. A value of \"0\" writes
     *            out the PMT once per segment file.
     */
    public void setPatInterval(Integer patInterval) {
        this.patInterval = patInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream. A value of \"0\" writes out the PMT once per segment
     * file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param patInterval The number of milliseconds between instances of this
     *            table in the output transport stream. A value of \"0\" writes
     *            out the PMT once per segment file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withPatInterval(Integer patInterval) {
        this.patInterval = patInterval;
        return this;
    }

    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET
     *
     * @return When set to pcrEveryPesPacket, a Program Clock Reference value is
     *         inserted for every Packetized Elementary Stream (PES) header.
     *         This parameter is effective only when the PCR PID is the same as
     *         the video or audio elementary stream.
     * @see M3u8PcrControl
     */
    public String getPcrControl() {
        return pcrControl;
    }

    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET
     *
     * @param pcrControl When set to pcrEveryPesPacket, a Program Clock
     *            Reference value is inserted for every Packetized Elementary
     *            Stream (PES) header. This parameter is effective only when the
     *            PCR PID is the same as the video or audio elementary stream.
     * @see M3u8PcrControl
     */
    public void setPcrControl(String pcrControl) {
        this.pcrControl = pcrControl;
    }

    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET
     *
     * @param pcrControl When set to pcrEveryPesPacket, a Program Clock
     *            Reference value is inserted for every Packetized Elementary
     *            Stream (PES) header. This parameter is effective only when the
     *            PCR PID is the same as the video or audio elementary stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8PcrControl
     */
    public M3u8Settings withPcrControl(String pcrControl) {
        this.pcrControl = pcrControl;
        return this;
    }

    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET
     *
     * @param pcrControl When set to pcrEveryPesPacket, a Program Clock
     *            Reference value is inserted for every Packetized Elementary
     *            Stream (PES) header. This parameter is effective only when the
     *            PCR PID is the same as the video or audio elementary stream.
     * @see M3u8PcrControl
     */
    public void setPcrControl(M3u8PcrControl pcrControl) {
        this.pcrControl = pcrControl.toString();
    }

    /**
     * When set to pcrEveryPesPacket, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CONFIGURED_PCR_PERIOD, PCR_EVERY_PES_PACKET
     *
     * @param pcrControl When set to pcrEveryPesPacket, a Program Clock
     *            Reference value is inserted for every Packetized Elementary
     *            Stream (PES) header. This parameter is effective only when the
     *            PCR PID is the same as the video or audio elementary stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8PcrControl
     */
    public M3u8Settings withPcrControl(M3u8PcrControl pcrControl) {
        this.pcrControl = pcrControl.toString();
        return this;
    }

    /**
     * Maximum time in milliseconds between Program Clock References (PCRs)
     * inserted into the transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 500<br/>
     *
     * @return Maximum time in milliseconds between Program Clock References
     *         (PCRs) inserted into the transport stream.
     */
    public Integer getPcrPeriod() {
        return pcrPeriod;
    }

    /**
     * Maximum time in milliseconds between Program Clock References (PCRs)
     * inserted into the transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 500<br/>
     *
     * @param pcrPeriod Maximum time in milliseconds between Program Clock
     *            References (PCRs) inserted into the transport stream.
     */
    public void setPcrPeriod(Integer pcrPeriod) {
        this.pcrPeriod = pcrPeriod;
    }

    /**
     * Maximum time in milliseconds between Program Clock References (PCRs)
     * inserted into the transport stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 500<br/>
     *
     * @param pcrPeriod Maximum time in milliseconds between Program Clock
     *            References (PCRs) inserted into the transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withPcrPeriod(Integer pcrPeriod) {
        this.pcrPeriod = pcrPeriod;
        return this;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the
     * transport stream. When no value is given, the encoder will assign the
     * same value as the Video PID. Can be entered as a decimal or hexadecimal
     * value.
     *
     * @return Packet Identifier (PID) of the Program Clock Reference (PCR) in
     *         the transport stream. When no value is given, the encoder will
     *         assign the same value as the Video PID. Can be entered as a
     *         decimal or hexadecimal value.
     */
    public String getPcrPid() {
        return pcrPid;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the
     * transport stream. When no value is given, the encoder will assign the
     * same value as the Video PID. Can be entered as a decimal or hexadecimal
     * value.
     *
     * @param pcrPid Packet Identifier (PID) of the Program Clock Reference
     *            (PCR) in the transport stream. When no value is given, the
     *            encoder will assign the same value as the Video PID. Can be
     *            entered as a decimal or hexadecimal value.
     */
    public void setPcrPid(String pcrPid) {
        this.pcrPid = pcrPid;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the
     * transport stream. When no value is given, the encoder will assign the
     * same value as the Video PID. Can be entered as a decimal or hexadecimal
     * value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pcrPid Packet Identifier (PID) of the Program Clock Reference
     *            (PCR) in the transport stream. When no value is given, the
     *            encoder will assign the same value as the Video PID. Can be
     *            entered as a decimal or hexadecimal value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withPcrPid(String pcrPid) {
        this.pcrPid = pcrPid;
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream. A value of \"0\" writes out the PMT once per segment
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return The number of milliseconds between instances of this table in the
     *         output transport stream. A value of \"0\" writes out the PMT once
     *         per segment file.
     */
    public Integer getPmtInterval() {
        return pmtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream. A value of \"0\" writes out the PMT once per segment
     * file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param pmtInterval The number of milliseconds between instances of this
     *            table in the output transport stream. A value of \"0\" writes
     *            out the PMT once per segment file.
     */
    public void setPmtInterval(Integer pmtInterval) {
        this.pmtInterval = pmtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream. A value of \"0\" writes out the PMT once per segment
     * file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param pmtInterval The number of milliseconds between instances of this
     *            table in the output transport stream. A value of \"0\" writes
     *            out the PMT once per segment file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withPmtInterval(Integer pmtInterval) {
        this.pmtInterval = pmtInterval;
        return this;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport
     * stream. Can be entered as a decimal or hexadecimal value.
     *
     * @return Packet Identifier (PID) for the Program Map Table (PMT) in the
     *         transport stream. Can be entered as a decimal or hexadecimal
     *         value.
     */
    public String getPmtPid() {
        return pmtPid;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport
     * stream. Can be entered as a decimal or hexadecimal value.
     *
     * @param pmtPid Packet Identifier (PID) for the Program Map Table (PMT) in
     *            the transport stream. Can be entered as a decimal or
     *            hexadecimal value.
     */
    public void setPmtPid(String pmtPid) {
        this.pmtPid = pmtPid;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport
     * stream. Can be entered as a decimal or hexadecimal value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pmtPid Packet Identifier (PID) for the Program Map Table (PMT) in
     *            the transport stream. Can be entered as a decimal or
     *            hexadecimal value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withPmtPid(String pmtPid) {
        this.pmtPid = pmtPid;
        return this;
    }

    /**
     * The value of the program number field in the Program Map Table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return The value of the program number field in the Program Map Table.
     */
    public Integer getProgramNum() {
        return programNum;
    }

    /**
     * The value of the program number field in the Program Map Table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param programNum The value of the program number field in the Program
     *            Map Table.
     */
    public void setProgramNum(Integer programNum) {
        this.programNum = programNum;
    }

    /**
     * The value of the program number field in the Program Map Table.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param programNum The value of the program number field in the Program
     *            Map Table.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withProgramNum(Integer programNum) {
        this.programNum = programNum;
        return this;
    }

    /**
     * If set to passthrough, passes any SCTE-35 signals from the input source
     * to this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @return If set to passthrough, passes any SCTE-35 signals from the input
     *         source to this output.
     * @see M3u8Scte35Behavior
     */
    public String getScte35Behavior() {
        return scte35Behavior;
    }

    /**
     * If set to passthrough, passes any SCTE-35 signals from the input source
     * to this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param scte35Behavior If set to passthrough, passes any SCTE-35 signals
     *            from the input source to this output.
     * @see M3u8Scte35Behavior
     */
    public void setScte35Behavior(String scte35Behavior) {
        this.scte35Behavior = scte35Behavior;
    }

    /**
     * If set to passthrough, passes any SCTE-35 signals from the input source
     * to this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param scte35Behavior If set to passthrough, passes any SCTE-35 signals
     *            from the input source to this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8Scte35Behavior
     */
    public M3u8Settings withScte35Behavior(String scte35Behavior) {
        this.scte35Behavior = scte35Behavior;
        return this;
    }

    /**
     * If set to passthrough, passes any SCTE-35 signals from the input source
     * to this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param scte35Behavior If set to passthrough, passes any SCTE-35 signals
     *            from the input source to this output.
     * @see M3u8Scte35Behavior
     */
    public void setScte35Behavior(M3u8Scte35Behavior scte35Behavior) {
        this.scte35Behavior = scte35Behavior.toString();
    }

    /**
     * If set to passthrough, passes any SCTE-35 signals from the input source
     * to this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param scte35Behavior If set to passthrough, passes any SCTE-35 signals
     *            from the input source to this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8Scte35Behavior
     */
    public M3u8Settings withScte35Behavior(M3u8Scte35Behavior scte35Behavior) {
        this.scte35Behavior = scte35Behavior.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * Can be entered as a decimal or hexadecimal value.
     *
     * @return Packet Identifier (PID) of the SCTE-35 stream in the transport
     *         stream. Can be entered as a decimal or hexadecimal value.
     */
    public String getScte35Pid() {
        return scte35Pid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * Can be entered as a decimal or hexadecimal value.
     *
     * @param scte35Pid Packet Identifier (PID) of the SCTE-35 stream in the
     *            transport stream. Can be entered as a decimal or hexadecimal
     *            value.
     */
    public void setScte35Pid(String scte35Pid) {
        this.scte35Pid = scte35Pid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * Can be entered as a decimal or hexadecimal value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte35Pid Packet Identifier (PID) of the SCTE-35 stream in the
     *            transport stream. Can be entered as a decimal or hexadecimal
     *            value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withScte35Pid(String scte35Pid) {
        this.scte35Pid = scte35Pid;
        return this;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @return When set to passthrough, timed metadata is passed through from
     *         input to output.
     * @see M3u8TimedMetadataBehavior
     */
    public String getTimedMetadataBehavior() {
        return timedMetadataBehavior;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param timedMetadataBehavior When set to passthrough, timed metadata is
     *            passed through from input to output.
     * @see M3u8TimedMetadataBehavior
     */
    public void setTimedMetadataBehavior(String timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param timedMetadataBehavior When set to passthrough, timed metadata is
     *            passed through from input to output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8TimedMetadataBehavior
     */
    public M3u8Settings withTimedMetadataBehavior(String timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior;
        return this;
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param timedMetadataBehavior When set to passthrough, timed metadata is
     *            passed through from input to output.
     * @see M3u8TimedMetadataBehavior
     */
    public void setTimedMetadataBehavior(M3u8TimedMetadataBehavior timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior.toString();
    }

    /**
     * When set to passthrough, timed metadata is passed through from input to
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_PASSTHROUGH, PASSTHROUGH
     *
     * @param timedMetadataBehavior When set to passthrough, timed metadata is
     *            passed through from input to output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8TimedMetadataBehavior
     */
    public M3u8Settings withTimedMetadataBehavior(M3u8TimedMetadataBehavior timedMetadataBehavior) {
        this.timedMetadataBehavior = timedMetadataBehavior.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport
     * stream. Can be entered as a decimal or hexadecimal value. Valid values
     * are 32 (or 0x20)..8182 (or 0x1ff6).
     *
     * @return Packet Identifier (PID) of the timed metadata stream in the
     *         transport stream. Can be entered as a decimal or hexadecimal
     *         value. Valid values are 32 (or 0x20)..8182 (or 0x1ff6).
     */
    public String getTimedMetadataPid() {
        return timedMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport
     * stream. Can be entered as a decimal or hexadecimal value. Valid values
     * are 32 (or 0x20)..8182 (or 0x1ff6).
     *
     * @param timedMetadataPid Packet Identifier (PID) of the timed metadata
     *            stream in the transport stream. Can be entered as a decimal or
     *            hexadecimal value. Valid values are 32 (or 0x20)..8182 (or
     *            0x1ff6).
     */
    public void setTimedMetadataPid(String timedMetadataPid) {
        this.timedMetadataPid = timedMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport
     * stream. Can be entered as a decimal or hexadecimal value. Valid values
     * are 32 (or 0x20)..8182 (or 0x1ff6).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timedMetadataPid Packet Identifier (PID) of the timed metadata
     *            stream in the transport stream. Can be entered as a decimal or
     *            hexadecimal value. Valid values are 32 (or 0x20)..8182 (or
     *            0x1ff6).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withTimedMetadataPid(String timedMetadataPid) {
        this.timedMetadataPid = timedMetadataPid;
        return this;
    }

    /**
     * The value of the transport stream ID field in the Program Map Table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return The value of the transport stream ID field in the Program Map
     *         Table.
     */
    public Integer getTransportStreamId() {
        return transportStreamId;
    }

    /**
     * The value of the transport stream ID field in the Program Map Table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param transportStreamId The value of the transport stream ID field in
     *            the Program Map Table.
     */
    public void setTransportStreamId(Integer transportStreamId) {
        this.transportStreamId = transportStreamId;
    }

    /**
     * The value of the transport stream ID field in the Program Map Table.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param transportStreamId The value of the transport stream ID field in
     *            the Program Map Table.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withTransportStreamId(Integer transportStreamId) {
        this.transportStreamId = transportStreamId;
        return this;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport
     * stream. Can be entered as a decimal or hexadecimal value.
     *
     * @return Packet Identifier (PID) of the elementary video stream in the
     *         transport stream. Can be entered as a decimal or hexadecimal
     *         value.
     */
    public String getVideoPid() {
        return videoPid;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport
     * stream. Can be entered as a decimal or hexadecimal value.
     *
     * @param videoPid Packet Identifier (PID) of the elementary video stream in
     *            the transport stream. Can be entered as a decimal or
     *            hexadecimal value.
     */
    public void setVideoPid(String videoPid) {
        this.videoPid = videoPid;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport
     * stream. Can be entered as a decimal or hexadecimal value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoPid Packet Identifier (PID) of the elementary video stream in
     *            the transport stream. Can be entered as a decimal or
     *            hexadecimal value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withVideoPid(String videoPid) {
        this.videoPid = videoPid;
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
        if (getAudioFramesPerPes() != null)
            sb.append("AudioFramesPerPes: " + getAudioFramesPerPes() + ",");
        if (getAudioPids() != null)
            sb.append("AudioPids: " + getAudioPids() + ",");
        if (getEcmPid() != null)
            sb.append("EcmPid: " + getEcmPid() + ",");
        if (getNielsenId3Behavior() != null)
            sb.append("NielsenId3Behavior: " + getNielsenId3Behavior() + ",");
        if (getPatInterval() != null)
            sb.append("PatInterval: " + getPatInterval() + ",");
        if (getPcrControl() != null)
            sb.append("PcrControl: " + getPcrControl() + ",");
        if (getPcrPeriod() != null)
            sb.append("PcrPeriod: " + getPcrPeriod() + ",");
        if (getPcrPid() != null)
            sb.append("PcrPid: " + getPcrPid() + ",");
        if (getPmtInterval() != null)
            sb.append("PmtInterval: " + getPmtInterval() + ",");
        if (getPmtPid() != null)
            sb.append("PmtPid: " + getPmtPid() + ",");
        if (getProgramNum() != null)
            sb.append("ProgramNum: " + getProgramNum() + ",");
        if (getScte35Behavior() != null)
            sb.append("Scte35Behavior: " + getScte35Behavior() + ",");
        if (getScte35Pid() != null)
            sb.append("Scte35Pid: " + getScte35Pid() + ",");
        if (getTimedMetadataBehavior() != null)
            sb.append("TimedMetadataBehavior: " + getTimedMetadataBehavior() + ",");
        if (getTimedMetadataPid() != null)
            sb.append("TimedMetadataPid: " + getTimedMetadataPid() + ",");
        if (getTransportStreamId() != null)
            sb.append("TransportStreamId: " + getTransportStreamId() + ",");
        if (getVideoPid() != null)
            sb.append("VideoPid: " + getVideoPid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAudioFramesPerPes() == null) ? 0 : getAudioFramesPerPes().hashCode());
        hashCode = prime * hashCode + ((getAudioPids() == null) ? 0 : getAudioPids().hashCode());
        hashCode = prime * hashCode + ((getEcmPid() == null) ? 0 : getEcmPid().hashCode());
        hashCode = prime * hashCode
                + ((getNielsenId3Behavior() == null) ? 0 : getNielsenId3Behavior().hashCode());
        hashCode = prime * hashCode
                + ((getPatInterval() == null) ? 0 : getPatInterval().hashCode());
        hashCode = prime * hashCode + ((getPcrControl() == null) ? 0 : getPcrControl().hashCode());
        hashCode = prime * hashCode + ((getPcrPeriod() == null) ? 0 : getPcrPeriod().hashCode());
        hashCode = prime * hashCode + ((getPcrPid() == null) ? 0 : getPcrPid().hashCode());
        hashCode = prime * hashCode
                + ((getPmtInterval() == null) ? 0 : getPmtInterval().hashCode());
        hashCode = prime * hashCode + ((getPmtPid() == null) ? 0 : getPmtPid().hashCode());
        hashCode = prime * hashCode + ((getProgramNum() == null) ? 0 : getProgramNum().hashCode());
        hashCode = prime * hashCode
                + ((getScte35Behavior() == null) ? 0 : getScte35Behavior().hashCode());
        hashCode = prime * hashCode + ((getScte35Pid() == null) ? 0 : getScte35Pid().hashCode());
        hashCode = prime
                * hashCode
                + ((getTimedMetadataBehavior() == null) ? 0 : getTimedMetadataBehavior().hashCode());
        hashCode = prime * hashCode
                + ((getTimedMetadataPid() == null) ? 0 : getTimedMetadataPid().hashCode());
        hashCode = prime * hashCode
                + ((getTransportStreamId() == null) ? 0 : getTransportStreamId().hashCode());
        hashCode = prime * hashCode + ((getVideoPid() == null) ? 0 : getVideoPid().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof M3u8Settings == false)
            return false;
        M3u8Settings other = (M3u8Settings) obj;

        if (other.getAudioFramesPerPes() == null ^ this.getAudioFramesPerPes() == null)
            return false;
        if (other.getAudioFramesPerPes() != null
                && other.getAudioFramesPerPes().equals(this.getAudioFramesPerPes()) == false)
            return false;
        if (other.getAudioPids() == null ^ this.getAudioPids() == null)
            return false;
        if (other.getAudioPids() != null
                && other.getAudioPids().equals(this.getAudioPids()) == false)
            return false;
        if (other.getEcmPid() == null ^ this.getEcmPid() == null)
            return false;
        if (other.getEcmPid() != null && other.getEcmPid().equals(this.getEcmPid()) == false)
            return false;
        if (other.getNielsenId3Behavior() == null ^ this.getNielsenId3Behavior() == null)
            return false;
        if (other.getNielsenId3Behavior() != null
                && other.getNielsenId3Behavior().equals(this.getNielsenId3Behavior()) == false)
            return false;
        if (other.getPatInterval() == null ^ this.getPatInterval() == null)
            return false;
        if (other.getPatInterval() != null
                && other.getPatInterval().equals(this.getPatInterval()) == false)
            return false;
        if (other.getPcrControl() == null ^ this.getPcrControl() == null)
            return false;
        if (other.getPcrControl() != null
                && other.getPcrControl().equals(this.getPcrControl()) == false)
            return false;
        if (other.getPcrPeriod() == null ^ this.getPcrPeriod() == null)
            return false;
        if (other.getPcrPeriod() != null
                && other.getPcrPeriod().equals(this.getPcrPeriod()) == false)
            return false;
        if (other.getPcrPid() == null ^ this.getPcrPid() == null)
            return false;
        if (other.getPcrPid() != null && other.getPcrPid().equals(this.getPcrPid()) == false)
            return false;
        if (other.getPmtInterval() == null ^ this.getPmtInterval() == null)
            return false;
        if (other.getPmtInterval() != null
                && other.getPmtInterval().equals(this.getPmtInterval()) == false)
            return false;
        if (other.getPmtPid() == null ^ this.getPmtPid() == null)
            return false;
        if (other.getPmtPid() != null && other.getPmtPid().equals(this.getPmtPid()) == false)
            return false;
        if (other.getProgramNum() == null ^ this.getProgramNum() == null)
            return false;
        if (other.getProgramNum() != null
                && other.getProgramNum().equals(this.getProgramNum()) == false)
            return false;
        if (other.getScte35Behavior() == null ^ this.getScte35Behavior() == null)
            return false;
        if (other.getScte35Behavior() != null
                && other.getScte35Behavior().equals(this.getScte35Behavior()) == false)
            return false;
        if (other.getScte35Pid() == null ^ this.getScte35Pid() == null)
            return false;
        if (other.getScte35Pid() != null
                && other.getScte35Pid().equals(this.getScte35Pid()) == false)
            return false;
        if (other.getTimedMetadataBehavior() == null ^ this.getTimedMetadataBehavior() == null)
            return false;
        if (other.getTimedMetadataBehavior() != null
                && other.getTimedMetadataBehavior().equals(this.getTimedMetadataBehavior()) == false)
            return false;
        if (other.getTimedMetadataPid() == null ^ this.getTimedMetadataPid() == null)
            return false;
        if (other.getTimedMetadataPid() != null
                && other.getTimedMetadataPid().equals(this.getTimedMetadataPid()) == false)
            return false;
        if (other.getTransportStreamId() == null ^ this.getTransportStreamId() == null)
            return false;
        if (other.getTransportStreamId() != null
                && other.getTransportStreamId().equals(this.getTransportStreamId()) == false)
            return false;
        if (other.getVideoPid() == null ^ this.getVideoPid() == null)
            return false;
        if (other.getVideoPid() != null && other.getVideoPid().equals(this.getVideoPid()) == false)
            return false;
        return true;
    }
}
