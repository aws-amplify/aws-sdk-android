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
 * Settings for TS segments in HLS
 */
public class M3u8Settings implements Serializable {
    /**
     * The number of audio frames to insert for each PES packet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer audioFramesPerPes;

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the
     * transport stream. Multiple values are accepted, and can be entered in
     * ranges and/or by comma separation.
     */
    private java.util.List<Integer> audioPids;

    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in
     * the input audio and an equivalent ID3 tag will be inserted in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     */
    private String nielsenId3;

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer patInterval;

    /**
     * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     */
    private String pcrControl;

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the
     * transport stream. When no value is given, the encoder will assign the
     * same value as the Video PID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer pcrPid;

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer pmtInterval;

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer pmtPid;

    /**
     * Packet Identifier (PID) of the private metadata stream in the transport
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer privateMetadataPid;

    /**
     * The value of the program number field in the Program Map Table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer programNumber;

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer scte35Pid;

    /**
     * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this
     * output. Choose None (NONE) if you don't want SCTE-35 markers in this
     * output. For SCTE-35 markers from an ESAM XML document-- Choose None
     * (NONE) if you don't want manifest conditioning. Choose Passthrough
     * (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest
     * conditioning. In both cases, also provide the ESAM XML as a string in the
     * setting Signal processing notification XML (sccXml).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     */
    private String scte35Source;

    /**
     * Applies only to HLS outputs. Use this setting to specify whether the
     * service inserts the ID3 timed metadata from the input in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     */
    private String timedMetadata;

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer timedMetadataPid;

    /**
     * The value of the transport stream ID field in the Program Map Table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer transportStreamId;

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer videoPid;

    /**
     * The number of audio frames to insert for each PES packet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
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
     * <b>Range: </b>0 - 2147483647<br/>
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
     * <b>Range: </b>0 - 2147483647<br/>
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
     * ranges and/or by comma separation.
     *
     * @return Packet Identifier (PID) of the elementary audio stream(s) in the
     *         transport stream. Multiple values are accepted, and can be
     *         entered in ranges and/or by comma separation.
     */
    public java.util.List<Integer> getAudioPids() {
        return audioPids;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the
     * transport stream. Multiple values are accepted, and can be entered in
     * ranges and/or by comma separation.
     *
     * @param audioPids Packet Identifier (PID) of the elementary audio
     *            stream(s) in the transport stream. Multiple values are
     *            accepted, and can be entered in ranges and/or by comma
     *            separation.
     */
    public void setAudioPids(java.util.Collection<Integer> audioPids) {
        if (audioPids == null) {
            this.audioPids = null;
            return;
        }

        this.audioPids = new java.util.ArrayList<Integer>(audioPids);
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the
     * transport stream. Multiple values are accepted, and can be entered in
     * ranges and/or by comma separation.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioPids Packet Identifier (PID) of the elementary audio
     *            stream(s) in the transport stream. Multiple values are
     *            accepted, and can be entered in ranges and/or by comma
     *            separation.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withAudioPids(Integer... audioPids) {
        if (getAudioPids() == null) {
            this.audioPids = new java.util.ArrayList<Integer>(audioPids.length);
        }
        for (Integer value : audioPids) {
            this.audioPids.add(value);
        }
        return this;
    }

    /**
     * Packet Identifier (PID) of the elementary audio stream(s) in the
     * transport stream. Multiple values are accepted, and can be entered in
     * ranges and/or by comma separation.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioPids Packet Identifier (PID) of the elementary audio
     *            stream(s) in the transport stream. Multiple values are
     *            accepted, and can be entered in ranges and/or by comma
     *            separation.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withAudioPids(java.util.Collection<Integer> audioPids) {
        setAudioPids(audioPids);
        return this;
    }

    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in
     * the input audio and an equivalent ID3 tag will be inserted in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     *
     * @return If INSERT, Nielsen inaudible tones for media tracking will be
     *         detected in the input audio and an equivalent ID3 tag will be
     *         inserted in the output.
     * @see M3u8NielsenId3
     */
    public String getNielsenId3() {
        return nielsenId3;
    }

    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in
     * the input audio and an equivalent ID3 tag will be inserted in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     *
     * @param nielsenId3 If INSERT, Nielsen inaudible tones for media tracking
     *            will be detected in the input audio and an equivalent ID3 tag
     *            will be inserted in the output.
     * @see M3u8NielsenId3
     */
    public void setNielsenId3(String nielsenId3) {
        this.nielsenId3 = nielsenId3;
    }

    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in
     * the input audio and an equivalent ID3 tag will be inserted in the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     *
     * @param nielsenId3 If INSERT, Nielsen inaudible tones for media tracking
     *            will be detected in the input audio and an equivalent ID3 tag
     *            will be inserted in the output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8NielsenId3
     */
    public M3u8Settings withNielsenId3(String nielsenId3) {
        this.nielsenId3 = nielsenId3;
        return this;
    }

    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in
     * the input audio and an equivalent ID3 tag will be inserted in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     *
     * @param nielsenId3 If INSERT, Nielsen inaudible tones for media tracking
     *            will be detected in the input audio and an equivalent ID3 tag
     *            will be inserted in the output.
     * @see M3u8NielsenId3
     */
    public void setNielsenId3(M3u8NielsenId3 nielsenId3) {
        this.nielsenId3 = nielsenId3.toString();
    }

    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in
     * the input audio and an equivalent ID3 tag will be inserted in the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     *
     * @param nielsenId3 If INSERT, Nielsen inaudible tones for media tracking
     *            will be detected in the input audio and an equivalent ID3 tag
     *            will be inserted in the output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8NielsenId3
     */
    public M3u8Settings withNielsenId3(M3u8NielsenId3 nielsenId3) {
        this.nielsenId3 = nielsenId3.toString();
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return The number of milliseconds between instances of this table in the
     *         output transport stream.
     */
    public Integer getPatInterval() {
        return patInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param patInterval The number of milliseconds between instances of this
     *            table in the output transport stream.
     */
    public void setPatInterval(Integer patInterval) {
        this.patInterval = patInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param patInterval The number of milliseconds between instances of this
     *            table in the output transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withPatInterval(Integer patInterval) {
        this.patInterval = patInterval;
        return this;
    }

    /**
     * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     *
     * @return When set to PCR_EVERY_PES_PACKET a Program Clock Reference value
     *         is inserted for every Packetized Elementary Stream (PES) header.
     *         This parameter is effective only when the PCR PID is the same as
     *         the video or audio elementary stream.
     * @see M3u8PcrControl
     */
    public String getPcrControl() {
        return pcrControl;
    }

    /**
     * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     *
     * @param pcrControl When set to PCR_EVERY_PES_PACKET a Program Clock
     *            Reference value is inserted for every Packetized Elementary
     *            Stream (PES) header. This parameter is effective only when the
     *            PCR PID is the same as the video or audio elementary stream.
     * @see M3u8PcrControl
     */
    public void setPcrControl(String pcrControl) {
        this.pcrControl = pcrControl;
    }

    /**
     * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     *
     * @param pcrControl When set to PCR_EVERY_PES_PACKET a Program Clock
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
     * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     *
     * @param pcrControl When set to PCR_EVERY_PES_PACKET a Program Clock
     *            Reference value is inserted for every Packetized Elementary
     *            Stream (PES) header. This parameter is effective only when the
     *            PCR PID is the same as the video or audio elementary stream.
     * @see M3u8PcrControl
     */
    public void setPcrControl(M3u8PcrControl pcrControl) {
        this.pcrControl = pcrControl.toString();
    }

    /**
     * When set to PCR_EVERY_PES_PACKET a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This
     * parameter is effective only when the PCR PID is the same as the video or
     * audio elementary stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     *
     * @param pcrControl When set to PCR_EVERY_PES_PACKET a Program Clock
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
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the
     * transport stream. When no value is given, the encoder will assign the
     * same value as the Video PID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Packet Identifier (PID) of the Program Clock Reference (PCR) in
     *         the transport stream. When no value is given, the encoder will
     *         assign the same value as the Video PID.
     */
    public Integer getPcrPid() {
        return pcrPid;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the
     * transport stream. When no value is given, the encoder will assign the
     * same value as the Video PID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param pcrPid Packet Identifier (PID) of the Program Clock Reference
     *            (PCR) in the transport stream. When no value is given, the
     *            encoder will assign the same value as the Video PID.
     */
    public void setPcrPid(Integer pcrPid) {
        this.pcrPid = pcrPid;
    }

    /**
     * Packet Identifier (PID) of the Program Clock Reference (PCR) in the
     * transport stream. When no value is given, the encoder will assign the
     * same value as the Video PID.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param pcrPid Packet Identifier (PID) of the Program Clock Reference
     *            (PCR) in the transport stream. When no value is given, the
     *            encoder will assign the same value as the Video PID.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withPcrPid(Integer pcrPid) {
        this.pcrPid = pcrPid;
        return this;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return The number of milliseconds between instances of this table in the
     *         output transport stream.
     */
    public Integer getPmtInterval() {
        return pmtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param pmtInterval The number of milliseconds between instances of this
     *            table in the output transport stream.
     */
    public void setPmtInterval(Integer pmtInterval) {
        this.pmtInterval = pmtInterval;
    }

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param pmtInterval The number of milliseconds between instances of this
     *            table in the output transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withPmtInterval(Integer pmtInterval) {
        this.pmtInterval = pmtInterval;
        return this;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Packet Identifier (PID) for the Program Map Table (PMT) in the
     *         transport stream.
     */
    public Integer getPmtPid() {
        return pmtPid;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param pmtPid Packet Identifier (PID) for the Program Map Table (PMT) in
     *            the transport stream.
     */
    public void setPmtPid(Integer pmtPid) {
        this.pmtPid = pmtPid;
    }

    /**
     * Packet Identifier (PID) for the Program Map Table (PMT) in the transport
     * stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param pmtPid Packet Identifier (PID) for the Program Map Table (PMT) in
     *            the transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withPmtPid(Integer pmtPid) {
        this.pmtPid = pmtPid;
        return this;
    }

    /**
     * Packet Identifier (PID) of the private metadata stream in the transport
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Packet Identifier (PID) of the private metadata stream in the
     *         transport stream.
     */
    public Integer getPrivateMetadataPid() {
        return privateMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the private metadata stream in the transport
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param privateMetadataPid Packet Identifier (PID) of the private metadata
     *            stream in the transport stream.
     */
    public void setPrivateMetadataPid(Integer privateMetadataPid) {
        this.privateMetadataPid = privateMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the private metadata stream in the transport
     * stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param privateMetadataPid Packet Identifier (PID) of the private metadata
     *            stream in the transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withPrivateMetadataPid(Integer privateMetadataPid) {
        this.privateMetadataPid = privateMetadataPid;
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
    public Integer getProgramNumber() {
        return programNumber;
    }

    /**
     * The value of the program number field in the Program Map Table.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param programNumber The value of the program number field in the Program
     *            Map Table.
     */
    public void setProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
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
     * @param programNumber The value of the program number field in the Program
     *            Map Table.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
        return this;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Packet Identifier (PID) of the SCTE-35 stream in the transport
     *         stream.
     */
    public Integer getScte35Pid() {
        return scte35Pid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param scte35Pid Packet Identifier (PID) of the SCTE-35 stream in the
     *            transport stream.
     */
    public void setScte35Pid(Integer scte35Pid) {
        this.scte35Pid = scte35Pid;
    }

    /**
     * Packet Identifier (PID) of the SCTE-35 stream in the transport stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param scte35Pid Packet Identifier (PID) of the SCTE-35 stream in the
     *            transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withScte35Pid(Integer scte35Pid) {
        this.scte35Pid = scte35Pid;
        return this;
    }

    /**
     * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this
     * output. Choose None (NONE) if you don't want SCTE-35 markers in this
     * output. For SCTE-35 markers from an ESAM XML document-- Choose None
     * (NONE) if you don't want manifest conditioning. Choose Passthrough
     * (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest
     * conditioning. In both cases, also provide the ESAM XML as a string in the
     * setting Signal processing notification XML (sccXml).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @return For SCTE-35 markers from your input-- Choose Passthrough
     *         (PASSTHROUGH) if you want SCTE-35 markers that appear in your
     *         input to also appear in this output. Choose None (NONE) if you
     *         don't want SCTE-35 markers in this output. For SCTE-35 markers
     *         from an ESAM XML document-- Choose None (NONE) if you don't want
     *         manifest conditioning. Choose Passthrough (PASSTHROUGH) and
     *         choose Ad markers (adMarkers) if you do want manifest
     *         conditioning. In both cases, also provide the ESAM XML as a
     *         string in the setting Signal processing notification XML
     *         (sccXml).
     * @see M3u8Scte35Source
     */
    public String getScte35Source() {
        return scte35Source;
    }

    /**
     * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this
     * output. Choose None (NONE) if you don't want SCTE-35 markers in this
     * output. For SCTE-35 markers from an ESAM XML document-- Choose None
     * (NONE) if you don't want manifest conditioning. Choose Passthrough
     * (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest
     * conditioning. In both cases, also provide the ESAM XML as a string in the
     * setting Signal processing notification XML (sccXml).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param scte35Source For SCTE-35 markers from your input-- Choose
     *            Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     *            appear in your input to also appear in this output. Choose
     *            None (NONE) if you don't want SCTE-35 markers in this output.
     *            For SCTE-35 markers from an ESAM XML document-- Choose None
     *            (NONE) if you don't want manifest conditioning. Choose
     *            Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if
     *            you do want manifest conditioning. In both cases, also provide
     *            the ESAM XML as a string in the setting Signal processing
     *            notification XML (sccXml).
     * @see M3u8Scte35Source
     */
    public void setScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
    }

    /**
     * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this
     * output. Choose None (NONE) if you don't want SCTE-35 markers in this
     * output. For SCTE-35 markers from an ESAM XML document-- Choose None
     * (NONE) if you don't want manifest conditioning. Choose Passthrough
     * (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest
     * conditioning. In both cases, also provide the ESAM XML as a string in the
     * setting Signal processing notification XML (sccXml).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param scte35Source For SCTE-35 markers from your input-- Choose
     *            Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     *            appear in your input to also appear in this output. Choose
     *            None (NONE) if you don't want SCTE-35 markers in this output.
     *            For SCTE-35 markers from an ESAM XML document-- Choose None
     *            (NONE) if you don't want manifest conditioning. Choose
     *            Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if
     *            you do want manifest conditioning. In both cases, also provide
     *            the ESAM XML as a string in the setting Signal processing
     *            notification XML (sccXml).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8Scte35Source
     */
    public M3u8Settings withScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
        return this;
    }

    /**
     * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this
     * output. Choose None (NONE) if you don't want SCTE-35 markers in this
     * output. For SCTE-35 markers from an ESAM XML document-- Choose None
     * (NONE) if you don't want manifest conditioning. Choose Passthrough
     * (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest
     * conditioning. In both cases, also provide the ESAM XML as a string in the
     * setting Signal processing notification XML (sccXml).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param scte35Source For SCTE-35 markers from your input-- Choose
     *            Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     *            appear in your input to also appear in this output. Choose
     *            None (NONE) if you don't want SCTE-35 markers in this output.
     *            For SCTE-35 markers from an ESAM XML document-- Choose None
     *            (NONE) if you don't want manifest conditioning. Choose
     *            Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if
     *            you do want manifest conditioning. In both cases, also provide
     *            the ESAM XML as a string in the setting Signal processing
     *            notification XML (sccXml).
     * @see M3u8Scte35Source
     */
    public void setScte35Source(M3u8Scte35Source scte35Source) {
        this.scte35Source = scte35Source.toString();
    }

    /**
     * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this
     * output. Choose None (NONE) if you don't want SCTE-35 markers in this
     * output. For SCTE-35 markers from an ESAM XML document-- Choose None
     * (NONE) if you don't want manifest conditioning. Choose Passthrough
     * (PASSTHROUGH) and choose Ad markers (adMarkers) if you do want manifest
     * conditioning. In both cases, also provide the ESAM XML as a string in the
     * setting Signal processing notification XML (sccXml).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param scte35Source For SCTE-35 markers from your input-- Choose
     *            Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     *            appear in your input to also appear in this output. Choose
     *            None (NONE) if you don't want SCTE-35 markers in this output.
     *            For SCTE-35 markers from an ESAM XML document-- Choose None
     *            (NONE) if you don't want manifest conditioning. Choose
     *            Passthrough (PASSTHROUGH) and choose Ad markers (adMarkers) if
     *            you do want manifest conditioning. In both cases, also provide
     *            the ESAM XML as a string in the setting Signal processing
     *            notification XML (sccXml).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M3u8Scte35Source
     */
    public M3u8Settings withScte35Source(M3u8Scte35Source scte35Source) {
        this.scte35Source = scte35Source.toString();
        return this;
    }

    /**
     * Applies only to HLS outputs. Use this setting to specify whether the
     * service inserts the ID3 timed metadata from the input in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @return Applies only to HLS outputs. Use this setting to specify whether
     *         the service inserts the ID3 timed metadata from the input in this
     *         output.
     * @see TimedMetadata
     */
    public String getTimedMetadata() {
        return timedMetadata;
    }

    /**
     * Applies only to HLS outputs. Use this setting to specify whether the
     * service inserts the ID3 timed metadata from the input in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param timedMetadata Applies only to HLS outputs. Use this setting to
     *            specify whether the service inserts the ID3 timed metadata
     *            from the input in this output.
     * @see TimedMetadata
     */
    public void setTimedMetadata(String timedMetadata) {
        this.timedMetadata = timedMetadata;
    }

    /**
     * Applies only to HLS outputs. Use this setting to specify whether the
     * service inserts the ID3 timed metadata from the input in this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param timedMetadata Applies only to HLS outputs. Use this setting to
     *            specify whether the service inserts the ID3 timed metadata
     *            from the input in this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimedMetadata
     */
    public M3u8Settings withTimedMetadata(String timedMetadata) {
        this.timedMetadata = timedMetadata;
        return this;
    }

    /**
     * Applies only to HLS outputs. Use this setting to specify whether the
     * service inserts the ID3 timed metadata from the input in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param timedMetadata Applies only to HLS outputs. Use this setting to
     *            specify whether the service inserts the ID3 timed metadata
     *            from the input in this output.
     * @see TimedMetadata
     */
    public void setTimedMetadata(TimedMetadata timedMetadata) {
        this.timedMetadata = timedMetadata.toString();
    }

    /**
     * Applies only to HLS outputs. Use this setting to specify whether the
     * service inserts the ID3 timed metadata from the input in this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param timedMetadata Applies only to HLS outputs. Use this setting to
     *            specify whether the service inserts the ID3 timed metadata
     *            from the input in this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimedMetadata
     */
    public M3u8Settings withTimedMetadata(TimedMetadata timedMetadata) {
        this.timedMetadata = timedMetadata.toString();
        return this;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Packet Identifier (PID) of the timed metadata stream in the
     *         transport stream.
     */
    public Integer getTimedMetadataPid() {
        return timedMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param timedMetadataPid Packet Identifier (PID) of the timed metadata
     *            stream in the transport stream.
     */
    public void setTimedMetadataPid(Integer timedMetadataPid) {
        this.timedMetadataPid = timedMetadataPid;
    }

    /**
     * Packet Identifier (PID) of the timed metadata stream in the transport
     * stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param timedMetadataPid Packet Identifier (PID) of the timed metadata
     *            stream in the transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withTimedMetadataPid(Integer timedMetadataPid) {
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
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Packet Identifier (PID) of the elementary video stream in the
     *         transport stream.
     */
    public Integer getVideoPid() {
        return videoPid;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport
     * stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param videoPid Packet Identifier (PID) of the elementary video stream in
     *            the transport stream.
     */
    public void setVideoPid(Integer videoPid) {
        this.videoPid = videoPid;
    }

    /**
     * Packet Identifier (PID) of the elementary video stream in the transport
     * stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param videoPid Packet Identifier (PID) of the elementary video stream in
     *            the transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M3u8Settings withVideoPid(Integer videoPid) {
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
        if (getNielsenId3() != null)
            sb.append("NielsenId3: " + getNielsenId3() + ",");
        if (getPatInterval() != null)
            sb.append("PatInterval: " + getPatInterval() + ",");
        if (getPcrControl() != null)
            sb.append("PcrControl: " + getPcrControl() + ",");
        if (getPcrPid() != null)
            sb.append("PcrPid: " + getPcrPid() + ",");
        if (getPmtInterval() != null)
            sb.append("PmtInterval: " + getPmtInterval() + ",");
        if (getPmtPid() != null)
            sb.append("PmtPid: " + getPmtPid() + ",");
        if (getPrivateMetadataPid() != null)
            sb.append("PrivateMetadataPid: " + getPrivateMetadataPid() + ",");
        if (getProgramNumber() != null)
            sb.append("ProgramNumber: " + getProgramNumber() + ",");
        if (getScte35Pid() != null)
            sb.append("Scte35Pid: " + getScte35Pid() + ",");
        if (getScte35Source() != null)
            sb.append("Scte35Source: " + getScte35Source() + ",");
        if (getTimedMetadata() != null)
            sb.append("TimedMetadata: " + getTimedMetadata() + ",");
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
        hashCode = prime * hashCode + ((getNielsenId3() == null) ? 0 : getNielsenId3().hashCode());
        hashCode = prime * hashCode
                + ((getPatInterval() == null) ? 0 : getPatInterval().hashCode());
        hashCode = prime * hashCode + ((getPcrControl() == null) ? 0 : getPcrControl().hashCode());
        hashCode = prime * hashCode + ((getPcrPid() == null) ? 0 : getPcrPid().hashCode());
        hashCode = prime * hashCode
                + ((getPmtInterval() == null) ? 0 : getPmtInterval().hashCode());
        hashCode = prime * hashCode + ((getPmtPid() == null) ? 0 : getPmtPid().hashCode());
        hashCode = prime * hashCode
                + ((getPrivateMetadataPid() == null) ? 0 : getPrivateMetadataPid().hashCode());
        hashCode = prime * hashCode
                + ((getProgramNumber() == null) ? 0 : getProgramNumber().hashCode());
        hashCode = prime * hashCode + ((getScte35Pid() == null) ? 0 : getScte35Pid().hashCode());
        hashCode = prime * hashCode
                + ((getScte35Source() == null) ? 0 : getScte35Source().hashCode());
        hashCode = prime * hashCode
                + ((getTimedMetadata() == null) ? 0 : getTimedMetadata().hashCode());
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
        if (other.getNielsenId3() == null ^ this.getNielsenId3() == null)
            return false;
        if (other.getNielsenId3() != null
                && other.getNielsenId3().equals(this.getNielsenId3()) == false)
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
        if (other.getPrivateMetadataPid() == null ^ this.getPrivateMetadataPid() == null)
            return false;
        if (other.getPrivateMetadataPid() != null
                && other.getPrivateMetadataPid().equals(this.getPrivateMetadataPid()) == false)
            return false;
        if (other.getProgramNumber() == null ^ this.getProgramNumber() == null)
            return false;
        if (other.getProgramNumber() != null
                && other.getProgramNumber().equals(this.getProgramNumber()) == false)
            return false;
        if (other.getScte35Pid() == null ^ this.getScte35Pid() == null)
            return false;
        if (other.getScte35Pid() != null
                && other.getScte35Pid().equals(this.getScte35Pid()) == false)
            return false;
        if (other.getScte35Source() == null ^ this.getScte35Source() == null)
            return false;
        if (other.getScte35Source() != null
                && other.getScte35Source().equals(this.getScte35Source()) == false)
            return false;
        if (other.getTimedMetadata() == null ^ this.getTimedMetadata() == null)
            return false;
        if (other.getTimedMetadata() != null
                && other.getTimedMetadata().equals(this.getTimedMetadata()) == false)
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
