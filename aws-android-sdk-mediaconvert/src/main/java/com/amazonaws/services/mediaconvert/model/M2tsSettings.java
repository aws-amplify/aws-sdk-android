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
 * MPEG-2 TS container settings. These apply to outputs in a File output group
 * when the output's container (ContainerType) is MPEG-2 Transport Stream
 * (M2TS). In these assets, data is organized by the program map table (PMT).
 * Each transport stream program contains subsets of data, including audio,
 * video, and metadata. Each of these subsets of data has a numerical label
 * called a packet identifier (PID). Each transport stream program corresponds
 * to one MediaConvert output. The PMT lists the types of data in a program
 * along with their PID. Downstream systems and players use the program map
 * table to look up the PID for each type of data it accesses and then uses the
 * PIDs to locate specific data within the asset.
 */
public class M2tsSettings implements Serializable {
    /**
     * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DVB, ATSC
     */
    private String audioBufferModel;

    /**
     * The number of audio frames to insert for each PES packet.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer audioFramesPerPes;

    /**
     * Specify the packet identifiers (PIDs) for any elementary audio streams
     * you include in this output. Specify multiple PIDs as a JSON array.
     * Default is the range 482-492.
     */
    private java.util.List<Integer> audioPids;

    /**
     * Specify the output bitrate of the transport stream in bits per second.
     * Setting to 0 lets the muxer automatically determine the appropriate
     * bitrate. Other common values are 3750000, 7500000, and 15000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer bitrate;

    /**
     * Controls what buffer model to use for accurate interleaving. If set to
     * MULTIPLEX, use multiplex buffer model. If set to NONE, this can lead to
     * lower latency, but low-memory devices may not be able to play back the
     * stream without interruptions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTIPLEX, NONE
     */
    private String bufferModel;

    /**
     * Inserts DVB Network Information Table (NIT) at the specified table
     * repetition interval.
     */
    private DvbNitSettings dvbNitSettings;

    /**
     * Inserts DVB Service Description Table (NIT) at the specified table
     * repetition interval.
     */
    private DvbSdtSettings dvbSdtSettings;

    /**
     * Specify the packet identifiers (PIDs) for DVB subtitle data included in
     * this output. Specify multiple PIDs as a JSON array. Default is the range
     * 460-479.
     */
    private java.util.List<Integer> dvbSubPids;

    /**
     * Inserts DVB Time and Date Table (TDT) at the specified table repetition
     * interval.
     */
    private DvbTdtSettings dvbTdtSettings;

    /**
     * Specify the packet identifier (PID) for DVB teletext data you include in
     * this output. Default is 499.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer dvbTeletextPid;

    /**
     * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to
     * partitions 3 and 4. The interval between these additional markers will be
     * fixed, and will be slightly shorter than the video EBP marker interval.
     * When set to VIDEO_INTERVAL, these additional markers will not be
     * inserted. Only applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL
     */
    private String ebpAudioInterval;

    /**
     * Selects which PIDs to place EBP markers on. They can either be placed
     * only on the video PID, or on both the video PID and all audio PIDs. Only
     * applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_AUDIO_PIDS, VIDEO_PID
     */
    private String ebpPlacement;

    /**
     * Controls whether to include the ES Rate field in the PES header.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     */
    private String esRateInPes;

    /**
     * Keep the default value (DEFAULT) unless you know that your audio EBP
     * markers are incorrectly appearing before your video EBP markers. To
     * correct this problem, set this value to Force (FORCE).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE, DEFAULT
     */
    private String forceTsVideoEbpOrder;

    /**
     * The length, in seconds, of each fragment. Only used with EBP markers.
     */
    private Double fragmentTime;

    /**
     * Specify the maximum time, in milliseconds, between Program Clock
     * References (PCRs) inserted into the transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 500<br/>
     */
    private Integer maxPcrInterval;

    /**
     * When set, enforces that Encoder Boundary Points do not come within the
     * specified time interval of each other by looking ahead at input video. If
     * another EBP is going to come in within the specified time interval, the
     * current EBP is not emitted, and the segment is "stretched" to the next
     * marker. The lookahead value does not add latency to the system. The Live
     * Event must be configured elsewhere to create sufficient latency to make
     * the lookahead accurate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     */
    private Integer minEbpInterval;

    /**
     * If INSERT, Nielsen inaudible tones for media tracking will be detected in
     * the input audio and an equivalent ID3 tag will be inserted in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, NONE
     */
    private String nielsenId3;

    /**
     * Value in bits per second of extra null packets to insert into the
     * transport stream. This can be used if a downstream encryption system
     * requires periodic null packets.
     */
    private Double nullPacketBitrate;

    /**
     * The number of milliseconds between instances of this table in the output
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer patInterval;

    /**
     * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This is
     * effective only when the PCR PID is the same as the video or audio
     * elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     */
    private String pcrControl;

    /**
     * Specify the packet identifier (PID) for the program clock reference (PCR)
     * in this output. If you do not specify a value, the service will use the
     * value for Video PID (VideoPid).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer pcrPid;

    /**
     * Specify the number of milliseconds between instances of the program map
     * table (PMT) in the output transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     */
    private Integer pmtInterval;

    /**
     * Specify the packet identifier (PID) for the program map table (PMT)
     * itself. Default is 480.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer pmtPid;

    /**
     * Specify the packet identifier (PID) of the private metadata stream.
     * Default is 503.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer privateMetadataPid;

    /**
     * Use Program number (programNumber) to specify the program number used in
     * the program map table (PMT) for this output. Default is 1. Program
     * numbers and program map tables are parts of MPEG-2 transport stream
     * containers, used for organizing data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer programNumber;

    /**
     * When set to CBR, inserts null packets into transport stream to fill
     * specified bitrate. When set to VBR, the bitrate setting acts as the
     * maximum bitrate, but the output will not be padded up to that bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     */
    private String rateMode;

    /**
     * Include this in your job settings to put SCTE-35 markers in your HLS and
     * transport stream outputs at the insertion points that you specify in an
     * ESAM XML document. Provide the document in the setting SCC XML (sccXml).
     */
    private M2tsScte35Esam scte35Esam;

    /**
     * Specify the packet identifier (PID) of the SCTE-35 stream in the
     * transport stream.
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
     * (NONE). Also provide the ESAM XML as a string in the setting Signal
     * processing notification XML (sccXml). Also enable ESAM SCTE-35 (include
     * the property scte35Esam).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     */
    private String scte35Source;

    /**
     * Inserts segmentation markers at each segmentation_time period.
     * rai_segstart sets the Random Access Indicator bit in the adaptation
     * field. rai_adapt sets the RAI bit and adds the current timecode in the
     * private data bytes. psi_segstart inserts PAT and PMT tables at the start
     * of segments. ebp adds Encoder Boundary Point information to the
     * adaptation field as per OpenCable specification OC-SP-EBP-I01-130118.
     * ebp_legacy adds Encoder Boundary Point information to the adaptation
     * field using a legacy proprietary format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP,
     * EBP_LEGACY
     */
    private String segmentationMarkers;

    /**
     * The segmentation style parameter controls how segmentation markers are
     * inserted into the transport stream. With avails, it is possible that
     * segments may be truncated, which can influence where future segmentation
     * markers are inserted. When a segmentation style of "reset_cadence" is
     * selected and a segment is truncated due to an avail, we will reset the
     * segmentation cadence. This means the subsequent segment will have a
     * duration of of $segmentation_time seconds. When a segmentation style of
     * "maintain_cadence" is selected and a segment is truncated due to an
     * avail, we will not reset the segmentation cadence. This means the
     * subsequent segment will likely be truncated as well. However, all
     * segments after that will have a duration of $segmentation_time seconds.
     * Note that EBP lookahead is a slight exception to this rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAINTAIN_CADENCE, RESET_CADENCE
     */
    private String segmentationStyle;

    /**
     * Specify the length, in seconds, of each segment. Required unless markers
     * is set to _none_.
     */
    private Double segmentationTime;

    /**
     * Specify the packet identifier (PID) for timed metadata in this output.
     * Default is 502.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer timedMetadataPid;

    /**
     * Specify the ID for the transport stream itself in the program map table
     * for this output. Transport stream IDs and program map tables are parts of
     * MPEG-2 transport stream containers, used for organizing data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer transportStreamId;

    /**
     * Specify the packet identifier (PID) of the elementary video stream in the
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     */
    private Integer videoPid;

    /**
     * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DVB, ATSC
     *
     * @return Selects between the DVB and ATSC buffer models for Dolby Digital
     *         audio.
     * @see M2tsAudioBufferModel
     */
    public String getAudioBufferModel() {
        return audioBufferModel;
    }

    /**
     * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DVB, ATSC
     *
     * @param audioBufferModel Selects between the DVB and ATSC buffer models
     *            for Dolby Digital audio.
     * @see M2tsAudioBufferModel
     */
    public void setAudioBufferModel(String audioBufferModel) {
        this.audioBufferModel = audioBufferModel;
    }

    /**
     * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DVB, ATSC
     *
     * @param audioBufferModel Selects between the DVB and ATSC buffer models
     *            for Dolby Digital audio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsAudioBufferModel
     */
    public M2tsSettings withAudioBufferModel(String audioBufferModel) {
        this.audioBufferModel = audioBufferModel;
        return this;
    }

    /**
     * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DVB, ATSC
     *
     * @param audioBufferModel Selects between the DVB and ATSC buffer models
     *            for Dolby Digital audio.
     * @see M2tsAudioBufferModel
     */
    public void setAudioBufferModel(M2tsAudioBufferModel audioBufferModel) {
        this.audioBufferModel = audioBufferModel.toString();
    }

    /**
     * Selects between the DVB and ATSC buffer models for Dolby Digital audio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DVB, ATSC
     *
     * @param audioBufferModel Selects between the DVB and ATSC buffer models
     *            for Dolby Digital audio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsAudioBufferModel
     */
    public M2tsSettings withAudioBufferModel(M2tsAudioBufferModel audioBufferModel) {
        this.audioBufferModel = audioBufferModel.toString();
        return this;
    }

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
    public M2tsSettings withAudioFramesPerPes(Integer audioFramesPerPes) {
        this.audioFramesPerPes = audioFramesPerPes;
        return this;
    }

    /**
     * Specify the packet identifiers (PIDs) for any elementary audio streams
     * you include in this output. Specify multiple PIDs as a JSON array.
     * Default is the range 482-492.
     *
     * @return Specify the packet identifiers (PIDs) for any elementary audio
     *         streams you include in this output. Specify multiple PIDs as a
     *         JSON array. Default is the range 482-492.
     */
    public java.util.List<Integer> getAudioPids() {
        return audioPids;
    }

    /**
     * Specify the packet identifiers (PIDs) for any elementary audio streams
     * you include in this output. Specify multiple PIDs as a JSON array.
     * Default is the range 482-492.
     *
     * @param audioPids Specify the packet identifiers (PIDs) for any elementary
     *            audio streams you include in this output. Specify multiple
     *            PIDs as a JSON array. Default is the range 482-492.
     */
    public void setAudioPids(java.util.Collection<Integer> audioPids) {
        if (audioPids == null) {
            this.audioPids = null;
            return;
        }

        this.audioPids = new java.util.ArrayList<Integer>(audioPids);
    }

    /**
     * Specify the packet identifiers (PIDs) for any elementary audio streams
     * you include in this output. Specify multiple PIDs as a JSON array.
     * Default is the range 482-492.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioPids Specify the packet identifiers (PIDs) for any elementary
     *            audio streams you include in this output. Specify multiple
     *            PIDs as a JSON array. Default is the range 482-492.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withAudioPids(Integer... audioPids) {
        if (getAudioPids() == null) {
            this.audioPids = new java.util.ArrayList<Integer>(audioPids.length);
        }
        for (Integer value : audioPids) {
            this.audioPids.add(value);
        }
        return this;
    }

    /**
     * Specify the packet identifiers (PIDs) for any elementary audio streams
     * you include in this output. Specify multiple PIDs as a JSON array.
     * Default is the range 482-492.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param audioPids Specify the packet identifiers (PIDs) for any elementary
     *            audio streams you include in this output. Specify multiple
     *            PIDs as a JSON array. Default is the range 482-492.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withAudioPids(java.util.Collection<Integer> audioPids) {
        setAudioPids(audioPids);
        return this;
    }

    /**
     * Specify the output bitrate of the transport stream in bits per second.
     * Setting to 0 lets the muxer automatically determine the appropriate
     * bitrate. Other common values are 3750000, 7500000, and 15000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @return Specify the output bitrate of the transport stream in bits per
     *         second. Setting to 0 lets the muxer automatically determine the
     *         appropriate bitrate. Other common values are 3750000, 7500000,
     *         and 15000000.
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Specify the output bitrate of the transport stream in bits per second.
     * Setting to 0 lets the muxer automatically determine the appropriate
     * bitrate. Other common values are 3750000, 7500000, and 15000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param bitrate Specify the output bitrate of the transport stream in bits
     *            per second. Setting to 0 lets the muxer automatically
     *            determine the appropriate bitrate. Other common values are
     *            3750000, 7500000, and 15000000.
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Specify the output bitrate of the transport stream in bits per second.
     * Setting to 0 lets the muxer automatically determine the appropriate
     * bitrate. Other common values are 3750000, 7500000, and 15000000.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param bitrate Specify the output bitrate of the transport stream in bits
     *            per second. Setting to 0 lets the muxer automatically
     *            determine the appropriate bitrate. Other common values are
     *            3750000, 7500000, and 15000000.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Controls what buffer model to use for accurate interleaving. If set to
     * MULTIPLEX, use multiplex buffer model. If set to NONE, this can lead to
     * lower latency, but low-memory devices may not be able to play back the
     * stream without interruptions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTIPLEX, NONE
     *
     * @return Controls what buffer model to use for accurate interleaving. If
     *         set to MULTIPLEX, use multiplex buffer model. If set to NONE,
     *         this can lead to lower latency, but low-memory devices may not be
     *         able to play back the stream without interruptions.
     * @see M2tsBufferModel
     */
    public String getBufferModel() {
        return bufferModel;
    }

    /**
     * Controls what buffer model to use for accurate interleaving. If set to
     * MULTIPLEX, use multiplex buffer model. If set to NONE, this can lead to
     * lower latency, but low-memory devices may not be able to play back the
     * stream without interruptions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTIPLEX, NONE
     *
     * @param bufferModel Controls what buffer model to use for accurate
     *            interleaving. If set to MULTIPLEX, use multiplex buffer model.
     *            If set to NONE, this can lead to lower latency, but low-memory
     *            devices may not be able to play back the stream without
     *            interruptions.
     * @see M2tsBufferModel
     */
    public void setBufferModel(String bufferModel) {
        this.bufferModel = bufferModel;
    }

    /**
     * Controls what buffer model to use for accurate interleaving. If set to
     * MULTIPLEX, use multiplex buffer model. If set to NONE, this can lead to
     * lower latency, but low-memory devices may not be able to play back the
     * stream without interruptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTIPLEX, NONE
     *
     * @param bufferModel Controls what buffer model to use for accurate
     *            interleaving. If set to MULTIPLEX, use multiplex buffer model.
     *            If set to NONE, this can lead to lower latency, but low-memory
     *            devices may not be able to play back the stream without
     *            interruptions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsBufferModel
     */
    public M2tsSettings withBufferModel(String bufferModel) {
        this.bufferModel = bufferModel;
        return this;
    }

    /**
     * Controls what buffer model to use for accurate interleaving. If set to
     * MULTIPLEX, use multiplex buffer model. If set to NONE, this can lead to
     * lower latency, but low-memory devices may not be able to play back the
     * stream without interruptions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTIPLEX, NONE
     *
     * @param bufferModel Controls what buffer model to use for accurate
     *            interleaving. If set to MULTIPLEX, use multiplex buffer model.
     *            If set to NONE, this can lead to lower latency, but low-memory
     *            devices may not be able to play back the stream without
     *            interruptions.
     * @see M2tsBufferModel
     */
    public void setBufferModel(M2tsBufferModel bufferModel) {
        this.bufferModel = bufferModel.toString();
    }

    /**
     * Controls what buffer model to use for accurate interleaving. If set to
     * MULTIPLEX, use multiplex buffer model. If set to NONE, this can lead to
     * lower latency, but low-memory devices may not be able to play back the
     * stream without interruptions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTIPLEX, NONE
     *
     * @param bufferModel Controls what buffer model to use for accurate
     *            interleaving. If set to MULTIPLEX, use multiplex buffer model.
     *            If set to NONE, this can lead to lower latency, but low-memory
     *            devices may not be able to play back the stream without
     *            interruptions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsBufferModel
     */
    public M2tsSettings withBufferModel(M2tsBufferModel bufferModel) {
        this.bufferModel = bufferModel.toString();
        return this;
    }

    /**
     * Inserts DVB Network Information Table (NIT) at the specified table
     * repetition interval.
     *
     * @return Inserts DVB Network Information Table (NIT) at the specified
     *         table repetition interval.
     */
    public DvbNitSettings getDvbNitSettings() {
        return dvbNitSettings;
    }

    /**
     * Inserts DVB Network Information Table (NIT) at the specified table
     * repetition interval.
     *
     * @param dvbNitSettings Inserts DVB Network Information Table (NIT) at the
     *            specified table repetition interval.
     */
    public void setDvbNitSettings(DvbNitSettings dvbNitSettings) {
        this.dvbNitSettings = dvbNitSettings;
    }

    /**
     * Inserts DVB Network Information Table (NIT) at the specified table
     * repetition interval.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbNitSettings Inserts DVB Network Information Table (NIT) at the
     *            specified table repetition interval.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withDvbNitSettings(DvbNitSettings dvbNitSettings) {
        this.dvbNitSettings = dvbNitSettings;
        return this;
    }

    /**
     * Inserts DVB Service Description Table (NIT) at the specified table
     * repetition interval.
     *
     * @return Inserts DVB Service Description Table (NIT) at the specified
     *         table repetition interval.
     */
    public DvbSdtSettings getDvbSdtSettings() {
        return dvbSdtSettings;
    }

    /**
     * Inserts DVB Service Description Table (NIT) at the specified table
     * repetition interval.
     *
     * @param dvbSdtSettings Inserts DVB Service Description Table (NIT) at the
     *            specified table repetition interval.
     */
    public void setDvbSdtSettings(DvbSdtSettings dvbSdtSettings) {
        this.dvbSdtSettings = dvbSdtSettings;
    }

    /**
     * Inserts DVB Service Description Table (NIT) at the specified table
     * repetition interval.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbSdtSettings Inserts DVB Service Description Table (NIT) at the
     *            specified table repetition interval.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withDvbSdtSettings(DvbSdtSettings dvbSdtSettings) {
        this.dvbSdtSettings = dvbSdtSettings;
        return this;
    }

    /**
     * Specify the packet identifiers (PIDs) for DVB subtitle data included in
     * this output. Specify multiple PIDs as a JSON array. Default is the range
     * 460-479.
     *
     * @return Specify the packet identifiers (PIDs) for DVB subtitle data
     *         included in this output. Specify multiple PIDs as a JSON array.
     *         Default is the range 460-479.
     */
    public java.util.List<Integer> getDvbSubPids() {
        return dvbSubPids;
    }

    /**
     * Specify the packet identifiers (PIDs) for DVB subtitle data included in
     * this output. Specify multiple PIDs as a JSON array. Default is the range
     * 460-479.
     *
     * @param dvbSubPids Specify the packet identifiers (PIDs) for DVB subtitle
     *            data included in this output. Specify multiple PIDs as a JSON
     *            array. Default is the range 460-479.
     */
    public void setDvbSubPids(java.util.Collection<Integer> dvbSubPids) {
        if (dvbSubPids == null) {
            this.dvbSubPids = null;
            return;
        }

        this.dvbSubPids = new java.util.ArrayList<Integer>(dvbSubPids);
    }

    /**
     * Specify the packet identifiers (PIDs) for DVB subtitle data included in
     * this output. Specify multiple PIDs as a JSON array. Default is the range
     * 460-479.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbSubPids Specify the packet identifiers (PIDs) for DVB subtitle
     *            data included in this output. Specify multiple PIDs as a JSON
     *            array. Default is the range 460-479.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withDvbSubPids(Integer... dvbSubPids) {
        if (getDvbSubPids() == null) {
            this.dvbSubPids = new java.util.ArrayList<Integer>(dvbSubPids.length);
        }
        for (Integer value : dvbSubPids) {
            this.dvbSubPids.add(value);
        }
        return this;
    }

    /**
     * Specify the packet identifiers (PIDs) for DVB subtitle data included in
     * this output. Specify multiple PIDs as a JSON array. Default is the range
     * 460-479.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbSubPids Specify the packet identifiers (PIDs) for DVB subtitle
     *            data included in this output. Specify multiple PIDs as a JSON
     *            array. Default is the range 460-479.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withDvbSubPids(java.util.Collection<Integer> dvbSubPids) {
        setDvbSubPids(dvbSubPids);
        return this;
    }

    /**
     * Inserts DVB Time and Date Table (TDT) at the specified table repetition
     * interval.
     *
     * @return Inserts DVB Time and Date Table (TDT) at the specified table
     *         repetition interval.
     */
    public DvbTdtSettings getDvbTdtSettings() {
        return dvbTdtSettings;
    }

    /**
     * Inserts DVB Time and Date Table (TDT) at the specified table repetition
     * interval.
     *
     * @param dvbTdtSettings Inserts DVB Time and Date Table (TDT) at the
     *            specified table repetition interval.
     */
    public void setDvbTdtSettings(DvbTdtSettings dvbTdtSettings) {
        this.dvbTdtSettings = dvbTdtSettings;
    }

    /**
     * Inserts DVB Time and Date Table (TDT) at the specified table repetition
     * interval.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dvbTdtSettings Inserts DVB Time and Date Table (TDT) at the
     *            specified table repetition interval.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withDvbTdtSettings(DvbTdtSettings dvbTdtSettings) {
        this.dvbTdtSettings = dvbTdtSettings;
        return this;
    }

    /**
     * Specify the packet identifier (PID) for DVB teletext data you include in
     * this output. Default is 499.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Specify the packet identifier (PID) for DVB teletext data you
     *         include in this output. Default is 499.
     */
    public Integer getDvbTeletextPid() {
        return dvbTeletextPid;
    }

    /**
     * Specify the packet identifier (PID) for DVB teletext data you include in
     * this output. Default is 499.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param dvbTeletextPid Specify the packet identifier (PID) for DVB
     *            teletext data you include in this output. Default is 499.
     */
    public void setDvbTeletextPid(Integer dvbTeletextPid) {
        this.dvbTeletextPid = dvbTeletextPid;
    }

    /**
     * Specify the packet identifier (PID) for DVB teletext data you include in
     * this output. Default is 499.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param dvbTeletextPid Specify the packet identifier (PID) for DVB
     *            teletext data you include in this output. Default is 499.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withDvbTeletextPid(Integer dvbTeletextPid) {
        this.dvbTeletextPid = dvbTeletextPid;
        return this;
    }

    /**
     * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to
     * partitions 3 and 4. The interval between these additional markers will be
     * fixed, and will be slightly shorter than the video EBP marker interval.
     * When set to VIDEO_INTERVAL, these additional markers will not be
     * inserted. Only applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL
     *
     * @return When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be
     *         added to partitions 3 and 4. The interval between these
     *         additional markers will be fixed, and will be slightly shorter
     *         than the video EBP marker interval. When set to VIDEO_INTERVAL,
     *         these additional markers will not be inserted. Only applicable
     *         when EBP segmentation markers are is selected
     *         (segmentationMarkers is EBP or EBP_LEGACY).
     * @see M2tsEbpAudioInterval
     */
    public String getEbpAudioInterval() {
        return ebpAudioInterval;
    }

    /**
     * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to
     * partitions 3 and 4. The interval between these additional markers will be
     * fixed, and will be slightly shorter than the video EBP marker interval.
     * When set to VIDEO_INTERVAL, these additional markers will not be
     * inserted. Only applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL
     *
     * @param ebpAudioInterval When set to VIDEO_AND_FIXED_INTERVALS, audio EBP
     *            markers will be added to partitions 3 and 4. The interval
     *            between these additional markers will be fixed, and will be
     *            slightly shorter than the video EBP marker interval. When set
     *            to VIDEO_INTERVAL, these additional markers will not be
     *            inserted. Only applicable when EBP segmentation markers are is
     *            selected (segmentationMarkers is EBP or EBP_LEGACY).
     * @see M2tsEbpAudioInterval
     */
    public void setEbpAudioInterval(String ebpAudioInterval) {
        this.ebpAudioInterval = ebpAudioInterval;
    }

    /**
     * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to
     * partitions 3 and 4. The interval between these additional markers will be
     * fixed, and will be slightly shorter than the video EBP marker interval.
     * When set to VIDEO_INTERVAL, these additional markers will not be
     * inserted. Only applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL
     *
     * @param ebpAudioInterval When set to VIDEO_AND_FIXED_INTERVALS, audio EBP
     *            markers will be added to partitions 3 and 4. The interval
     *            between these additional markers will be fixed, and will be
     *            slightly shorter than the video EBP marker interval. When set
     *            to VIDEO_INTERVAL, these additional markers will not be
     *            inserted. Only applicable when EBP segmentation markers are is
     *            selected (segmentationMarkers is EBP or EBP_LEGACY).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsEbpAudioInterval
     */
    public M2tsSettings withEbpAudioInterval(String ebpAudioInterval) {
        this.ebpAudioInterval = ebpAudioInterval;
        return this;
    }

    /**
     * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to
     * partitions 3 and 4. The interval between these additional markers will be
     * fixed, and will be slightly shorter than the video EBP marker interval.
     * When set to VIDEO_INTERVAL, these additional markers will not be
     * inserted. Only applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL
     *
     * @param ebpAudioInterval When set to VIDEO_AND_FIXED_INTERVALS, audio EBP
     *            markers will be added to partitions 3 and 4. The interval
     *            between these additional markers will be fixed, and will be
     *            slightly shorter than the video EBP marker interval. When set
     *            to VIDEO_INTERVAL, these additional markers will not be
     *            inserted. Only applicable when EBP segmentation markers are is
     *            selected (segmentationMarkers is EBP or EBP_LEGACY).
     * @see M2tsEbpAudioInterval
     */
    public void setEbpAudioInterval(M2tsEbpAudioInterval ebpAudioInterval) {
        this.ebpAudioInterval = ebpAudioInterval.toString();
    }

    /**
     * When set to VIDEO_AND_FIXED_INTERVALS, audio EBP markers will be added to
     * partitions 3 and 4. The interval between these additional markers will be
     * fixed, and will be slightly shorter than the video EBP marker interval.
     * When set to VIDEO_INTERVAL, these additional markers will not be
     * inserted. Only applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_FIXED_INTERVALS, VIDEO_INTERVAL
     *
     * @param ebpAudioInterval When set to VIDEO_AND_FIXED_INTERVALS, audio EBP
     *            markers will be added to partitions 3 and 4. The interval
     *            between these additional markers will be fixed, and will be
     *            slightly shorter than the video EBP marker interval. When set
     *            to VIDEO_INTERVAL, these additional markers will not be
     *            inserted. Only applicable when EBP segmentation markers are is
     *            selected (segmentationMarkers is EBP or EBP_LEGACY).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsEbpAudioInterval
     */
    public M2tsSettings withEbpAudioInterval(M2tsEbpAudioInterval ebpAudioInterval) {
        this.ebpAudioInterval = ebpAudioInterval.toString();
        return this;
    }

    /**
     * Selects which PIDs to place EBP markers on. They can either be placed
     * only on the video PID, or on both the video PID and all audio PIDs. Only
     * applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_AUDIO_PIDS, VIDEO_PID
     *
     * @return Selects which PIDs to place EBP markers on. They can either be
     *         placed only on the video PID, or on both the video PID and all
     *         audio PIDs. Only applicable when EBP segmentation markers are is
     *         selected (segmentationMarkers is EBP or EBP_LEGACY).
     * @see M2tsEbpPlacement
     */
    public String getEbpPlacement() {
        return ebpPlacement;
    }

    /**
     * Selects which PIDs to place EBP markers on. They can either be placed
     * only on the video PID, or on both the video PID and all audio PIDs. Only
     * applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_AUDIO_PIDS, VIDEO_PID
     *
     * @param ebpPlacement Selects which PIDs to place EBP markers on. They can
     *            either be placed only on the video PID, or on both the video
     *            PID and all audio PIDs. Only applicable when EBP segmentation
     *            markers are is selected (segmentationMarkers is EBP or
     *            EBP_LEGACY).
     * @see M2tsEbpPlacement
     */
    public void setEbpPlacement(String ebpPlacement) {
        this.ebpPlacement = ebpPlacement;
    }

    /**
     * Selects which PIDs to place EBP markers on. They can either be placed
     * only on the video PID, or on both the video PID and all audio PIDs. Only
     * applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_AUDIO_PIDS, VIDEO_PID
     *
     * @param ebpPlacement Selects which PIDs to place EBP markers on. They can
     *            either be placed only on the video PID, or on both the video
     *            PID and all audio PIDs. Only applicable when EBP segmentation
     *            markers are is selected (segmentationMarkers is EBP or
     *            EBP_LEGACY).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsEbpPlacement
     */
    public M2tsSettings withEbpPlacement(String ebpPlacement) {
        this.ebpPlacement = ebpPlacement;
        return this;
    }

    /**
     * Selects which PIDs to place EBP markers on. They can either be placed
     * only on the video PID, or on both the video PID and all audio PIDs. Only
     * applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_AUDIO_PIDS, VIDEO_PID
     *
     * @param ebpPlacement Selects which PIDs to place EBP markers on. They can
     *            either be placed only on the video PID, or on both the video
     *            PID and all audio PIDs. Only applicable when EBP segmentation
     *            markers are is selected (segmentationMarkers is EBP or
     *            EBP_LEGACY).
     * @see M2tsEbpPlacement
     */
    public void setEbpPlacement(M2tsEbpPlacement ebpPlacement) {
        this.ebpPlacement = ebpPlacement.toString();
    }

    /**
     * Selects which PIDs to place EBP markers on. They can either be placed
     * only on the video PID, or on both the video PID and all audio PIDs. Only
     * applicable when EBP segmentation markers are is selected
     * (segmentationMarkers is EBP or EBP_LEGACY).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VIDEO_AND_AUDIO_PIDS, VIDEO_PID
     *
     * @param ebpPlacement Selects which PIDs to place EBP markers on. They can
     *            either be placed only on the video PID, or on both the video
     *            PID and all audio PIDs. Only applicable when EBP segmentation
     *            markers are is selected (segmentationMarkers is EBP or
     *            EBP_LEGACY).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsEbpPlacement
     */
    public M2tsSettings withEbpPlacement(M2tsEbpPlacement ebpPlacement) {
        this.ebpPlacement = ebpPlacement.toString();
        return this;
    }

    /**
     * Controls whether to include the ES Rate field in the PES header.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @return Controls whether to include the ES Rate field in the PES header.
     * @see M2tsEsRateInPes
     */
    public String getEsRateInPes() {
        return esRateInPes;
    }

    /**
     * Controls whether to include the ES Rate field in the PES header.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param esRateInPes Controls whether to include the ES Rate field in the
     *            PES header.
     * @see M2tsEsRateInPes
     */
    public void setEsRateInPes(String esRateInPes) {
        this.esRateInPes = esRateInPes;
    }

    /**
     * Controls whether to include the ES Rate field in the PES header.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param esRateInPes Controls whether to include the ES Rate field in the
     *            PES header.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsEsRateInPes
     */
    public M2tsSettings withEsRateInPes(String esRateInPes) {
        this.esRateInPes = esRateInPes;
        return this;
    }

    /**
     * Controls whether to include the ES Rate field in the PES header.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param esRateInPes Controls whether to include the ES Rate field in the
     *            PES header.
     * @see M2tsEsRateInPes
     */
    public void setEsRateInPes(M2tsEsRateInPes esRateInPes) {
        this.esRateInPes = esRateInPes.toString();
    }

    /**
     * Controls whether to include the ES Rate field in the PES header.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param esRateInPes Controls whether to include the ES Rate field in the
     *            PES header.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsEsRateInPes
     */
    public M2tsSettings withEsRateInPes(M2tsEsRateInPes esRateInPes) {
        this.esRateInPes = esRateInPes.toString();
        return this;
    }

    /**
     * Keep the default value (DEFAULT) unless you know that your audio EBP
     * markers are incorrectly appearing before your video EBP markers. To
     * correct this problem, set this value to Force (FORCE).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE, DEFAULT
     *
     * @return Keep the default value (DEFAULT) unless you know that your audio
     *         EBP markers are incorrectly appearing before your video EBP
     *         markers. To correct this problem, set this value to Force
     *         (FORCE).
     * @see M2tsForceTsVideoEbpOrder
     */
    public String getForceTsVideoEbpOrder() {
        return forceTsVideoEbpOrder;
    }

    /**
     * Keep the default value (DEFAULT) unless you know that your audio EBP
     * markers are incorrectly appearing before your video EBP markers. To
     * correct this problem, set this value to Force (FORCE).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE, DEFAULT
     *
     * @param forceTsVideoEbpOrder Keep the default value (DEFAULT) unless you
     *            know that your audio EBP markers are incorrectly appearing
     *            before your video EBP markers. To correct this problem, set
     *            this value to Force (FORCE).
     * @see M2tsForceTsVideoEbpOrder
     */
    public void setForceTsVideoEbpOrder(String forceTsVideoEbpOrder) {
        this.forceTsVideoEbpOrder = forceTsVideoEbpOrder;
    }

    /**
     * Keep the default value (DEFAULT) unless you know that your audio EBP
     * markers are incorrectly appearing before your video EBP markers. To
     * correct this problem, set this value to Force (FORCE).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE, DEFAULT
     *
     * @param forceTsVideoEbpOrder Keep the default value (DEFAULT) unless you
     *            know that your audio EBP markers are incorrectly appearing
     *            before your video EBP markers. To correct this problem, set
     *            this value to Force (FORCE).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsForceTsVideoEbpOrder
     */
    public M2tsSettings withForceTsVideoEbpOrder(String forceTsVideoEbpOrder) {
        this.forceTsVideoEbpOrder = forceTsVideoEbpOrder;
        return this;
    }

    /**
     * Keep the default value (DEFAULT) unless you know that your audio EBP
     * markers are incorrectly appearing before your video EBP markers. To
     * correct this problem, set this value to Force (FORCE).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE, DEFAULT
     *
     * @param forceTsVideoEbpOrder Keep the default value (DEFAULT) unless you
     *            know that your audio EBP markers are incorrectly appearing
     *            before your video EBP markers. To correct this problem, set
     *            this value to Force (FORCE).
     * @see M2tsForceTsVideoEbpOrder
     */
    public void setForceTsVideoEbpOrder(M2tsForceTsVideoEbpOrder forceTsVideoEbpOrder) {
        this.forceTsVideoEbpOrder = forceTsVideoEbpOrder.toString();
    }

    /**
     * Keep the default value (DEFAULT) unless you know that your audio EBP
     * markers are incorrectly appearing before your video EBP markers. To
     * correct this problem, set this value to Force (FORCE).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE, DEFAULT
     *
     * @param forceTsVideoEbpOrder Keep the default value (DEFAULT) unless you
     *            know that your audio EBP markers are incorrectly appearing
     *            before your video EBP markers. To correct this problem, set
     *            this value to Force (FORCE).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsForceTsVideoEbpOrder
     */
    public M2tsSettings withForceTsVideoEbpOrder(M2tsForceTsVideoEbpOrder forceTsVideoEbpOrder) {
        this.forceTsVideoEbpOrder = forceTsVideoEbpOrder.toString();
        return this;
    }

    /**
     * The length, in seconds, of each fragment. Only used with EBP markers.
     *
     * @return The length, in seconds, of each fragment. Only used with EBP
     *         markers.
     */
    public Double getFragmentTime() {
        return fragmentTime;
    }

    /**
     * The length, in seconds, of each fragment. Only used with EBP markers.
     *
     * @param fragmentTime The length, in seconds, of each fragment. Only used
     *            with EBP markers.
     */
    public void setFragmentTime(Double fragmentTime) {
        this.fragmentTime = fragmentTime;
    }

    /**
     * The length, in seconds, of each fragment. Only used with EBP markers.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fragmentTime The length, in seconds, of each fragment. Only used
     *            with EBP markers.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withFragmentTime(Double fragmentTime) {
        this.fragmentTime = fragmentTime;
        return this;
    }

    /**
     * Specify the maximum time, in milliseconds, between Program Clock
     * References (PCRs) inserted into the transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 500<br/>
     *
     * @return Specify the maximum time, in milliseconds, between Program Clock
     *         References (PCRs) inserted into the transport stream.
     */
    public Integer getMaxPcrInterval() {
        return maxPcrInterval;
    }

    /**
     * Specify the maximum time, in milliseconds, between Program Clock
     * References (PCRs) inserted into the transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 500<br/>
     *
     * @param maxPcrInterval Specify the maximum time, in milliseconds, between
     *            Program Clock References (PCRs) inserted into the transport
     *            stream.
     */
    public void setMaxPcrInterval(Integer maxPcrInterval) {
        this.maxPcrInterval = maxPcrInterval;
    }

    /**
     * Specify the maximum time, in milliseconds, between Program Clock
     * References (PCRs) inserted into the transport stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 500<br/>
     *
     * @param maxPcrInterval Specify the maximum time, in milliseconds, between
     *            Program Clock References (PCRs) inserted into the transport
     *            stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withMaxPcrInterval(Integer maxPcrInterval) {
        this.maxPcrInterval = maxPcrInterval;
        return this;
    }

    /**
     * When set, enforces that Encoder Boundary Points do not come within the
     * specified time interval of each other by looking ahead at input video. If
     * another EBP is going to come in within the specified time interval, the
     * current EBP is not emitted, and the segment is "stretched" to the next
     * marker. The lookahead value does not add latency to the system. The Live
     * Event must be configured elsewhere to create sufficient latency to make
     * the lookahead accurate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @return When set, enforces that Encoder Boundary Points do not come
     *         within the specified time interval of each other by looking ahead
     *         at input video. If another EBP is going to come in within the
     *         specified time interval, the current EBP is not emitted, and the
     *         segment is "stretched" to the next marker. The lookahead value
     *         does not add latency to the system. The Live Event must be
     *         configured elsewhere to create sufficient latency to make the
     *         lookahead accurate.
     */
    public Integer getMinEbpInterval() {
        return minEbpInterval;
    }

    /**
     * When set, enforces that Encoder Boundary Points do not come within the
     * specified time interval of each other by looking ahead at input video. If
     * another EBP is going to come in within the specified time interval, the
     * current EBP is not emitted, and the segment is "stretched" to the next
     * marker. The lookahead value does not add latency to the system. The Live
     * Event must be configured elsewhere to create sufficient latency to make
     * the lookahead accurate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @param minEbpInterval When set, enforces that Encoder Boundary Points do
     *            not come within the specified time interval of each other by
     *            looking ahead at input video. If another EBP is going to come
     *            in within the specified time interval, the current EBP is not
     *            emitted, and the segment is "stretched" to the next marker.
     *            The lookahead value does not add latency to the system. The
     *            Live Event must be configured elsewhere to create sufficient
     *            latency to make the lookahead accurate.
     */
    public void setMinEbpInterval(Integer minEbpInterval) {
        this.minEbpInterval = minEbpInterval;
    }

    /**
     * When set, enforces that Encoder Boundary Points do not come within the
     * specified time interval of each other by looking ahead at input video. If
     * another EBP is going to come in within the specified time interval, the
     * current EBP is not emitted, and the segment is "stretched" to the next
     * marker. The lookahead value does not add latency to the system. The Live
     * Event must be configured elsewhere to create sufficient latency to make
     * the lookahead accurate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @param minEbpInterval When set, enforces that Encoder Boundary Points do
     *            not come within the specified time interval of each other by
     *            looking ahead at input video. If another EBP is going to come
     *            in within the specified time interval, the current EBP is not
     *            emitted, and the segment is "stretched" to the next marker.
     *            The lookahead value does not add latency to the system. The
     *            Live Event must be configured elsewhere to create sufficient
     *            latency to make the lookahead accurate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withMinEbpInterval(Integer minEbpInterval) {
        this.minEbpInterval = minEbpInterval;
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
     * @see M2tsNielsenId3
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
     * @see M2tsNielsenId3
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
     * @see M2tsNielsenId3
     */
    public M2tsSettings withNielsenId3(String nielsenId3) {
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
     * @see M2tsNielsenId3
     */
    public void setNielsenId3(M2tsNielsenId3 nielsenId3) {
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
     * @see M2tsNielsenId3
     */
    public M2tsSettings withNielsenId3(M2tsNielsenId3 nielsenId3) {
        this.nielsenId3 = nielsenId3.toString();
        return this;
    }

    /**
     * Value in bits per second of extra null packets to insert into the
     * transport stream. This can be used if a downstream encryption system
     * requires periodic null packets.
     *
     * @return Value in bits per second of extra null packets to insert into the
     *         transport stream. This can be used if a downstream encryption
     *         system requires periodic null packets.
     */
    public Double getNullPacketBitrate() {
        return nullPacketBitrate;
    }

    /**
     * Value in bits per second of extra null packets to insert into the
     * transport stream. This can be used if a downstream encryption system
     * requires periodic null packets.
     *
     * @param nullPacketBitrate Value in bits per second of extra null packets
     *            to insert into the transport stream. This can be used if a
     *            downstream encryption system requires periodic null packets.
     */
    public void setNullPacketBitrate(Double nullPacketBitrate) {
        this.nullPacketBitrate = nullPacketBitrate;
    }

    /**
     * Value in bits per second of extra null packets to insert into the
     * transport stream. This can be used if a downstream encryption system
     * requires periodic null packets.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nullPacketBitrate Value in bits per second of extra null packets
     *            to insert into the transport stream. This can be used if a
     *            downstream encryption system requires periodic null packets.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withNullPacketBitrate(Double nullPacketBitrate) {
        this.nullPacketBitrate = nullPacketBitrate;
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
    public M2tsSettings withPatInterval(Integer patInterval) {
        this.patInterval = patInterval;
        return this;
    }

    /**
     * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This is
     * effective only when the PCR PID is the same as the video or audio
     * elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     *
     * @return When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value
     *         is inserted for every Packetized Elementary Stream (PES) header.
     *         This is effective only when the PCR PID is the same as the video
     *         or audio elementary stream.
     * @see M2tsPcrControl
     */
    public String getPcrControl() {
        return pcrControl;
    }

    /**
     * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This is
     * effective only when the PCR PID is the same as the video or audio
     * elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     *
     * @param pcrControl When set to PCR_EVERY_PES_PACKET, a Program Clock
     *            Reference value is inserted for every Packetized Elementary
     *            Stream (PES) header. This is effective only when the PCR PID
     *            is the same as the video or audio elementary stream.
     * @see M2tsPcrControl
     */
    public void setPcrControl(String pcrControl) {
        this.pcrControl = pcrControl;
    }

    /**
     * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This is
     * effective only when the PCR PID is the same as the video or audio
     * elementary stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     *
     * @param pcrControl When set to PCR_EVERY_PES_PACKET, a Program Clock
     *            Reference value is inserted for every Packetized Elementary
     *            Stream (PES) header. This is effective only when the PCR PID
     *            is the same as the video or audio elementary stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsPcrControl
     */
    public M2tsSettings withPcrControl(String pcrControl) {
        this.pcrControl = pcrControl;
        return this;
    }

    /**
     * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This is
     * effective only when the PCR PID is the same as the video or audio
     * elementary stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     *
     * @param pcrControl When set to PCR_EVERY_PES_PACKET, a Program Clock
     *            Reference value is inserted for every Packetized Elementary
     *            Stream (PES) header. This is effective only when the PCR PID
     *            is the same as the video or audio elementary stream.
     * @see M2tsPcrControl
     */
    public void setPcrControl(M2tsPcrControl pcrControl) {
        this.pcrControl = pcrControl.toString();
    }

    /**
     * When set to PCR_EVERY_PES_PACKET, a Program Clock Reference value is
     * inserted for every Packetized Elementary Stream (PES) header. This is
     * effective only when the PCR PID is the same as the video or audio
     * elementary stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PCR_EVERY_PES_PACKET, CONFIGURED_PCR_PERIOD
     *
     * @param pcrControl When set to PCR_EVERY_PES_PACKET, a Program Clock
     *            Reference value is inserted for every Packetized Elementary
     *            Stream (PES) header. This is effective only when the PCR PID
     *            is the same as the video or audio elementary stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsPcrControl
     */
    public M2tsSettings withPcrControl(M2tsPcrControl pcrControl) {
        this.pcrControl = pcrControl.toString();
        return this;
    }

    /**
     * Specify the packet identifier (PID) for the program clock reference (PCR)
     * in this output. If you do not specify a value, the service will use the
     * value for Video PID (VideoPid).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Specify the packet identifier (PID) for the program clock
     *         reference (PCR) in this output. If you do not specify a value,
     *         the service will use the value for Video PID (VideoPid).
     */
    public Integer getPcrPid() {
        return pcrPid;
    }

    /**
     * Specify the packet identifier (PID) for the program clock reference (PCR)
     * in this output. If you do not specify a value, the service will use the
     * value for Video PID (VideoPid).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param pcrPid Specify the packet identifier (PID) for the program clock
     *            reference (PCR) in this output. If you do not specify a value,
     *            the service will use the value for Video PID (VideoPid).
     */
    public void setPcrPid(Integer pcrPid) {
        this.pcrPid = pcrPid;
    }

    /**
     * Specify the packet identifier (PID) for the program clock reference (PCR)
     * in this output. If you do not specify a value, the service will use the
     * value for Video PID (VideoPid).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param pcrPid Specify the packet identifier (PID) for the program clock
     *            reference (PCR) in this output. If you do not specify a value,
     *            the service will use the value for Video PID (VideoPid).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withPcrPid(Integer pcrPid) {
        this.pcrPid = pcrPid;
        return this;
    }

    /**
     * Specify the number of milliseconds between instances of the program map
     * table (PMT) in the output transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @return Specify the number of milliseconds between instances of the
     *         program map table (PMT) in the output transport stream.
     */
    public Integer getPmtInterval() {
        return pmtInterval;
    }

    /**
     * Specify the number of milliseconds between instances of the program map
     * table (PMT) in the output transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param pmtInterval Specify the number of milliseconds between instances
     *            of the program map table (PMT) in the output transport stream.
     */
    public void setPmtInterval(Integer pmtInterval) {
        this.pmtInterval = pmtInterval;
    }

    /**
     * Specify the number of milliseconds between instances of the program map
     * table (PMT) in the output transport stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000<br/>
     *
     * @param pmtInterval Specify the number of milliseconds between instances
     *            of the program map table (PMT) in the output transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withPmtInterval(Integer pmtInterval) {
        this.pmtInterval = pmtInterval;
        return this;
    }

    /**
     * Specify the packet identifier (PID) for the program map table (PMT)
     * itself. Default is 480.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Specify the packet identifier (PID) for the program map table
     *         (PMT) itself. Default is 480.
     */
    public Integer getPmtPid() {
        return pmtPid;
    }

    /**
     * Specify the packet identifier (PID) for the program map table (PMT)
     * itself. Default is 480.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param pmtPid Specify the packet identifier (PID) for the program map
     *            table (PMT) itself. Default is 480.
     */
    public void setPmtPid(Integer pmtPid) {
        this.pmtPid = pmtPid;
    }

    /**
     * Specify the packet identifier (PID) for the program map table (PMT)
     * itself. Default is 480.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param pmtPid Specify the packet identifier (PID) for the program map
     *            table (PMT) itself. Default is 480.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withPmtPid(Integer pmtPid) {
        this.pmtPid = pmtPid;
        return this;
    }

    /**
     * Specify the packet identifier (PID) of the private metadata stream.
     * Default is 503.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Specify the packet identifier (PID) of the private metadata
     *         stream. Default is 503.
     */
    public Integer getPrivateMetadataPid() {
        return privateMetadataPid;
    }

    /**
     * Specify the packet identifier (PID) of the private metadata stream.
     * Default is 503.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param privateMetadataPid Specify the packet identifier (PID) of the
     *            private metadata stream. Default is 503.
     */
    public void setPrivateMetadataPid(Integer privateMetadataPid) {
        this.privateMetadataPid = privateMetadataPid;
    }

    /**
     * Specify the packet identifier (PID) of the private metadata stream.
     * Default is 503.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param privateMetadataPid Specify the packet identifier (PID) of the
     *            private metadata stream. Default is 503.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withPrivateMetadataPid(Integer privateMetadataPid) {
        this.privateMetadataPid = privateMetadataPid;
        return this;
    }

    /**
     * Use Program number (programNumber) to specify the program number used in
     * the program map table (PMT) for this output. Default is 1. Program
     * numbers and program map tables are parts of MPEG-2 transport stream
     * containers, used for organizing data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return Use Program number (programNumber) to specify the program number
     *         used in the program map table (PMT) for this output. Default is
     *         1. Program numbers and program map tables are parts of MPEG-2
     *         transport stream containers, used for organizing data.
     */
    public Integer getProgramNumber() {
        return programNumber;
    }

    /**
     * Use Program number (programNumber) to specify the program number used in
     * the program map table (PMT) for this output. Default is 1. Program
     * numbers and program map tables are parts of MPEG-2 transport stream
     * containers, used for organizing data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param programNumber Use Program number (programNumber) to specify the
     *            program number used in the program map table (PMT) for this
     *            output. Default is 1. Program numbers and program map tables
     *            are parts of MPEG-2 transport stream containers, used for
     *            organizing data.
     */
    public void setProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
    }

    /**
     * Use Program number (programNumber) to specify the program number used in
     * the program map table (PMT) for this output. Default is 1. Program
     * numbers and program map tables are parts of MPEG-2 transport stream
     * containers, used for organizing data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param programNumber Use Program number (programNumber) to specify the
     *            program number used in the program map table (PMT) for this
     *            output. Default is 1. Program numbers and program map tables
     *            are parts of MPEG-2 transport stream containers, used for
     *            organizing data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
        return this;
    }

    /**
     * When set to CBR, inserts null packets into transport stream to fill
     * specified bitrate. When set to VBR, the bitrate setting acts as the
     * maximum bitrate, but the output will not be padded up to that bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     *
     * @return When set to CBR, inserts null packets into transport stream to
     *         fill specified bitrate. When set to VBR, the bitrate setting acts
     *         as the maximum bitrate, but the output will not be padded up to
     *         that bitrate.
     * @see M2tsRateMode
     */
    public String getRateMode() {
        return rateMode;
    }

    /**
     * When set to CBR, inserts null packets into transport stream to fill
     * specified bitrate. When set to VBR, the bitrate setting acts as the
     * maximum bitrate, but the output will not be padded up to that bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     *
     * @param rateMode When set to CBR, inserts null packets into transport
     *            stream to fill specified bitrate. When set to VBR, the bitrate
     *            setting acts as the maximum bitrate, but the output will not
     *            be padded up to that bitrate.
     * @see M2tsRateMode
     */
    public void setRateMode(String rateMode) {
        this.rateMode = rateMode;
    }

    /**
     * When set to CBR, inserts null packets into transport stream to fill
     * specified bitrate. When set to VBR, the bitrate setting acts as the
     * maximum bitrate, but the output will not be padded up to that bitrate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     *
     * @param rateMode When set to CBR, inserts null packets into transport
     *            stream to fill specified bitrate. When set to VBR, the bitrate
     *            setting acts as the maximum bitrate, but the output will not
     *            be padded up to that bitrate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsRateMode
     */
    public M2tsSettings withRateMode(String rateMode) {
        this.rateMode = rateMode;
        return this;
    }

    /**
     * When set to CBR, inserts null packets into transport stream to fill
     * specified bitrate. When set to VBR, the bitrate setting acts as the
     * maximum bitrate, but the output will not be padded up to that bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     *
     * @param rateMode When set to CBR, inserts null packets into transport
     *            stream to fill specified bitrate. When set to VBR, the bitrate
     *            setting acts as the maximum bitrate, but the output will not
     *            be padded up to that bitrate.
     * @see M2tsRateMode
     */
    public void setRateMode(M2tsRateMode rateMode) {
        this.rateMode = rateMode.toString();
    }

    /**
     * When set to CBR, inserts null packets into transport stream to fill
     * specified bitrate. When set to VBR, the bitrate setting acts as the
     * maximum bitrate, but the output will not be padded up to that bitrate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     *
     * @param rateMode When set to CBR, inserts null packets into transport
     *            stream to fill specified bitrate. When set to VBR, the bitrate
     *            setting acts as the maximum bitrate, but the output will not
     *            be padded up to that bitrate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsRateMode
     */
    public M2tsSettings withRateMode(M2tsRateMode rateMode) {
        this.rateMode = rateMode.toString();
        return this;
    }

    /**
     * Include this in your job settings to put SCTE-35 markers in your HLS and
     * transport stream outputs at the insertion points that you specify in an
     * ESAM XML document. Provide the document in the setting SCC XML (sccXml).
     *
     * @return Include this in your job settings to put SCTE-35 markers in your
     *         HLS and transport stream outputs at the insertion points that you
     *         specify in an ESAM XML document. Provide the document in the
     *         setting SCC XML (sccXml).
     */
    public M2tsScte35Esam getScte35Esam() {
        return scte35Esam;
    }

    /**
     * Include this in your job settings to put SCTE-35 markers in your HLS and
     * transport stream outputs at the insertion points that you specify in an
     * ESAM XML document. Provide the document in the setting SCC XML (sccXml).
     *
     * @param scte35Esam Include this in your job settings to put SCTE-35
     *            markers in your HLS and transport stream outputs at the
     *            insertion points that you specify in an ESAM XML document.
     *            Provide the document in the setting SCC XML (sccXml).
     */
    public void setScte35Esam(M2tsScte35Esam scte35Esam) {
        this.scte35Esam = scte35Esam;
    }

    /**
     * Include this in your job settings to put SCTE-35 markers in your HLS and
     * transport stream outputs at the insertion points that you specify in an
     * ESAM XML document. Provide the document in the setting SCC XML (sccXml).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scte35Esam Include this in your job settings to put SCTE-35
     *            markers in your HLS and transport stream outputs at the
     *            insertion points that you specify in an ESAM XML document.
     *            Provide the document in the setting SCC XML (sccXml).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withScte35Esam(M2tsScte35Esam scte35Esam) {
        this.scte35Esam = scte35Esam;
        return this;
    }

    /**
     * Specify the packet identifier (PID) of the SCTE-35 stream in the
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Specify the packet identifier (PID) of the SCTE-35 stream in the
     *         transport stream.
     */
    public Integer getScte35Pid() {
        return scte35Pid;
    }

    /**
     * Specify the packet identifier (PID) of the SCTE-35 stream in the
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param scte35Pid Specify the packet identifier (PID) of the SCTE-35
     *            stream in the transport stream.
     */
    public void setScte35Pid(Integer scte35Pid) {
        this.scte35Pid = scte35Pid;
    }

    /**
     * Specify the packet identifier (PID) of the SCTE-35 stream in the
     * transport stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param scte35Pid Specify the packet identifier (PID) of the SCTE-35
     *            stream in the transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withScte35Pid(Integer scte35Pid) {
        this.scte35Pid = scte35Pid;
        return this;
    }

    /**
     * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this
     * output. Choose None (NONE) if you don't want SCTE-35 markers in this
     * output. For SCTE-35 markers from an ESAM XML document-- Choose None
     * (NONE). Also provide the ESAM XML as a string in the setting Signal
     * processing notification XML (sccXml). Also enable ESAM SCTE-35 (include
     * the property scte35Esam).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @return For SCTE-35 markers from your input-- Choose Passthrough
     *         (PASSTHROUGH) if you want SCTE-35 markers that appear in your
     *         input to also appear in this output. Choose None (NONE) if you
     *         don't want SCTE-35 markers in this output. For SCTE-35 markers
     *         from an ESAM XML document-- Choose None (NONE). Also provide the
     *         ESAM XML as a string in the setting Signal processing
     *         notification XML (sccXml). Also enable ESAM SCTE-35 (include the
     *         property scte35Esam).
     * @see M2tsScte35Source
     */
    public String getScte35Source() {
        return scte35Source;
    }

    /**
     * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this
     * output. Choose None (NONE) if you don't want SCTE-35 markers in this
     * output. For SCTE-35 markers from an ESAM XML document-- Choose None
     * (NONE). Also provide the ESAM XML as a string in the setting Signal
     * processing notification XML (sccXml). Also enable ESAM SCTE-35 (include
     * the property scte35Esam).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param scte35Source For SCTE-35 markers from your input-- Choose
     *            Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     *            appear in your input to also appear in this output. Choose
     *            None (NONE) if you don't want SCTE-35 markers in this output.
     *            For SCTE-35 markers from an ESAM XML document-- Choose None
     *            (NONE). Also provide the ESAM XML as a string in the setting
     *            Signal processing notification XML (sccXml). Also enable ESAM
     *            SCTE-35 (include the property scte35Esam).
     * @see M2tsScte35Source
     */
    public void setScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
    }

    /**
     * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this
     * output. Choose None (NONE) if you don't want SCTE-35 markers in this
     * output. For SCTE-35 markers from an ESAM XML document-- Choose None
     * (NONE). Also provide the ESAM XML as a string in the setting Signal
     * processing notification XML (sccXml). Also enable ESAM SCTE-35 (include
     * the property scte35Esam).
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
     *            (NONE). Also provide the ESAM XML as a string in the setting
     *            Signal processing notification XML (sccXml). Also enable ESAM
     *            SCTE-35 (include the property scte35Esam).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsScte35Source
     */
    public M2tsSettings withScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
        return this;
    }

    /**
     * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this
     * output. Choose None (NONE) if you don't want SCTE-35 markers in this
     * output. For SCTE-35 markers from an ESAM XML document-- Choose None
     * (NONE). Also provide the ESAM XML as a string in the setting Signal
     * processing notification XML (sccXml). Also enable ESAM SCTE-35 (include
     * the property scte35Esam).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, NONE
     *
     * @param scte35Source For SCTE-35 markers from your input-- Choose
     *            Passthrough (PASSTHROUGH) if you want SCTE-35 markers that
     *            appear in your input to also appear in this output. Choose
     *            None (NONE) if you don't want SCTE-35 markers in this output.
     *            For SCTE-35 markers from an ESAM XML document-- Choose None
     *            (NONE). Also provide the ESAM XML as a string in the setting
     *            Signal processing notification XML (sccXml). Also enable ESAM
     *            SCTE-35 (include the property scte35Esam).
     * @see M2tsScte35Source
     */
    public void setScte35Source(M2tsScte35Source scte35Source) {
        this.scte35Source = scte35Source.toString();
    }

    /**
     * For SCTE-35 markers from your input-- Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this
     * output. Choose None (NONE) if you don't want SCTE-35 markers in this
     * output. For SCTE-35 markers from an ESAM XML document-- Choose None
     * (NONE). Also provide the ESAM XML as a string in the setting Signal
     * processing notification XML (sccXml). Also enable ESAM SCTE-35 (include
     * the property scte35Esam).
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
     *            (NONE). Also provide the ESAM XML as a string in the setting
     *            Signal processing notification XML (sccXml). Also enable ESAM
     *            SCTE-35 (include the property scte35Esam).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsScte35Source
     */
    public M2tsSettings withScte35Source(M2tsScte35Source scte35Source) {
        this.scte35Source = scte35Source.toString();
        return this;
    }

    /**
     * Inserts segmentation markers at each segmentation_time period.
     * rai_segstart sets the Random Access Indicator bit in the adaptation
     * field. rai_adapt sets the RAI bit and adds the current timecode in the
     * private data bytes. psi_segstart inserts PAT and PMT tables at the start
     * of segments. ebp adds Encoder Boundary Point information to the
     * adaptation field as per OpenCable specification OC-SP-EBP-I01-130118.
     * ebp_legacy adds Encoder Boundary Point information to the adaptation
     * field using a legacy proprietary format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP,
     * EBP_LEGACY
     *
     * @return Inserts segmentation markers at each segmentation_time period.
     *         rai_segstart sets the Random Access Indicator bit in the
     *         adaptation field. rai_adapt sets the RAI bit and adds the current
     *         timecode in the private data bytes. psi_segstart inserts PAT and
     *         PMT tables at the start of segments. ebp adds Encoder Boundary
     *         Point information to the adaptation field as per OpenCable
     *         specification OC-SP-EBP-I01-130118. ebp_legacy adds Encoder
     *         Boundary Point information to the adaptation field using a legacy
     *         proprietary format.
     * @see M2tsSegmentationMarkers
     */
    public String getSegmentationMarkers() {
        return segmentationMarkers;
    }

    /**
     * Inserts segmentation markers at each segmentation_time period.
     * rai_segstart sets the Random Access Indicator bit in the adaptation
     * field. rai_adapt sets the RAI bit and adds the current timecode in the
     * private data bytes. psi_segstart inserts PAT and PMT tables at the start
     * of segments. ebp adds Encoder Boundary Point information to the
     * adaptation field as per OpenCable specification OC-SP-EBP-I01-130118.
     * ebp_legacy adds Encoder Boundary Point information to the adaptation
     * field using a legacy proprietary format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP,
     * EBP_LEGACY
     *
     * @param segmentationMarkers Inserts segmentation markers at each
     *            segmentation_time period. rai_segstart sets the Random Access
     *            Indicator bit in the adaptation field. rai_adapt sets the RAI
     *            bit and adds the current timecode in the private data bytes.
     *            psi_segstart inserts PAT and PMT tables at the start of
     *            segments. ebp adds Encoder Boundary Point information to the
     *            adaptation field as per OpenCable specification
     *            OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point
     *            information to the adaptation field using a legacy proprietary
     *            format.
     * @see M2tsSegmentationMarkers
     */
    public void setSegmentationMarkers(String segmentationMarkers) {
        this.segmentationMarkers = segmentationMarkers;
    }

    /**
     * Inserts segmentation markers at each segmentation_time period.
     * rai_segstart sets the Random Access Indicator bit in the adaptation
     * field. rai_adapt sets the RAI bit and adds the current timecode in the
     * private data bytes. psi_segstart inserts PAT and PMT tables at the start
     * of segments. ebp adds Encoder Boundary Point information to the
     * adaptation field as per OpenCable specification OC-SP-EBP-I01-130118.
     * ebp_legacy adds Encoder Boundary Point information to the adaptation
     * field using a legacy proprietary format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP,
     * EBP_LEGACY
     *
     * @param segmentationMarkers Inserts segmentation markers at each
     *            segmentation_time period. rai_segstart sets the Random Access
     *            Indicator bit in the adaptation field. rai_adapt sets the RAI
     *            bit and adds the current timecode in the private data bytes.
     *            psi_segstart inserts PAT and PMT tables at the start of
     *            segments. ebp adds Encoder Boundary Point information to the
     *            adaptation field as per OpenCable specification
     *            OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point
     *            information to the adaptation field using a legacy proprietary
     *            format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsSegmentationMarkers
     */
    public M2tsSettings withSegmentationMarkers(String segmentationMarkers) {
        this.segmentationMarkers = segmentationMarkers;
        return this;
    }

    /**
     * Inserts segmentation markers at each segmentation_time period.
     * rai_segstart sets the Random Access Indicator bit in the adaptation
     * field. rai_adapt sets the RAI bit and adds the current timecode in the
     * private data bytes. psi_segstart inserts PAT and PMT tables at the start
     * of segments. ebp adds Encoder Boundary Point information to the
     * adaptation field as per OpenCable specification OC-SP-EBP-I01-130118.
     * ebp_legacy adds Encoder Boundary Point information to the adaptation
     * field using a legacy proprietary format.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP,
     * EBP_LEGACY
     *
     * @param segmentationMarkers Inserts segmentation markers at each
     *            segmentation_time period. rai_segstart sets the Random Access
     *            Indicator bit in the adaptation field. rai_adapt sets the RAI
     *            bit and adds the current timecode in the private data bytes.
     *            psi_segstart inserts PAT and PMT tables at the start of
     *            segments. ebp adds Encoder Boundary Point information to the
     *            adaptation field as per OpenCable specification
     *            OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point
     *            information to the adaptation field using a legacy proprietary
     *            format.
     * @see M2tsSegmentationMarkers
     */
    public void setSegmentationMarkers(M2tsSegmentationMarkers segmentationMarkers) {
        this.segmentationMarkers = segmentationMarkers.toString();
    }

    /**
     * Inserts segmentation markers at each segmentation_time period.
     * rai_segstart sets the Random Access Indicator bit in the adaptation
     * field. rai_adapt sets the RAI bit and adds the current timecode in the
     * private data bytes. psi_segstart inserts PAT and PMT tables at the start
     * of segments. ebp adds Encoder Boundary Point information to the
     * adaptation field as per OpenCable specification OC-SP-EBP-I01-130118.
     * ebp_legacy adds Encoder Boundary Point information to the adaptation
     * field using a legacy proprietary format.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RAI_SEGSTART, RAI_ADAPT, PSI_SEGSTART, EBP,
     * EBP_LEGACY
     *
     * @param segmentationMarkers Inserts segmentation markers at each
     *            segmentation_time period. rai_segstart sets the Random Access
     *            Indicator bit in the adaptation field. rai_adapt sets the RAI
     *            bit and adds the current timecode in the private data bytes.
     *            psi_segstart inserts PAT and PMT tables at the start of
     *            segments. ebp adds Encoder Boundary Point information to the
     *            adaptation field as per OpenCable specification
     *            OC-SP-EBP-I01-130118. ebp_legacy adds Encoder Boundary Point
     *            information to the adaptation field using a legacy proprietary
     *            format.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsSegmentationMarkers
     */
    public M2tsSettings withSegmentationMarkers(M2tsSegmentationMarkers segmentationMarkers) {
        this.segmentationMarkers = segmentationMarkers.toString();
        return this;
    }

    /**
     * The segmentation style parameter controls how segmentation markers are
     * inserted into the transport stream. With avails, it is possible that
     * segments may be truncated, which can influence where future segmentation
     * markers are inserted. When a segmentation style of "reset_cadence" is
     * selected and a segment is truncated due to an avail, we will reset the
     * segmentation cadence. This means the subsequent segment will have a
     * duration of of $segmentation_time seconds. When a segmentation style of
     * "maintain_cadence" is selected and a segment is truncated due to an
     * avail, we will not reset the segmentation cadence. This means the
     * subsequent segment will likely be truncated as well. However, all
     * segments after that will have a duration of $segmentation_time seconds.
     * Note that EBP lookahead is a slight exception to this rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAINTAIN_CADENCE, RESET_CADENCE
     *
     * @return The segmentation style parameter controls how segmentation
     *         markers are inserted into the transport stream. With avails, it
     *         is possible that segments may be truncated, which can influence
     *         where future segmentation markers are inserted. When a
     *         segmentation style of "reset_cadence" is selected and a segment
     *         is truncated due to an avail, we will reset the segmentation
     *         cadence. This means the subsequent segment will have a duration
     *         of of $segmentation_time seconds. When a segmentation style of
     *         "maintain_cadence" is selected and a segment is truncated due to
     *         an avail, we will not reset the segmentation cadence. This means
     *         the subsequent segment will likely be truncated as well. However,
     *         all segments after that will have a duration of
     *         $segmentation_time seconds. Note that EBP lookahead is a slight
     *         exception to this rule.
     * @see M2tsSegmentationStyle
     */
    public String getSegmentationStyle() {
        return segmentationStyle;
    }

    /**
     * The segmentation style parameter controls how segmentation markers are
     * inserted into the transport stream. With avails, it is possible that
     * segments may be truncated, which can influence where future segmentation
     * markers are inserted. When a segmentation style of "reset_cadence" is
     * selected and a segment is truncated due to an avail, we will reset the
     * segmentation cadence. This means the subsequent segment will have a
     * duration of of $segmentation_time seconds. When a segmentation style of
     * "maintain_cadence" is selected and a segment is truncated due to an
     * avail, we will not reset the segmentation cadence. This means the
     * subsequent segment will likely be truncated as well. However, all
     * segments after that will have a duration of $segmentation_time seconds.
     * Note that EBP lookahead is a slight exception to this rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAINTAIN_CADENCE, RESET_CADENCE
     *
     * @param segmentationStyle The segmentation style parameter controls how
     *            segmentation markers are inserted into the transport stream.
     *            With avails, it is possible that segments may be truncated,
     *            which can influence where future segmentation markers are
     *            inserted. When a segmentation style of "reset_cadence" is
     *            selected and a segment is truncated due to an avail, we will
     *            reset the segmentation cadence. This means the subsequent
     *            segment will have a duration of of $segmentation_time seconds.
     *            When a segmentation style of "maintain_cadence" is selected
     *            and a segment is truncated due to an avail, we will not reset
     *            the segmentation cadence. This means the subsequent segment
     *            will likely be truncated as well. However, all segments after
     *            that will have a duration of $segmentation_time seconds. Note
     *            that EBP lookahead is a slight exception to this rule.
     * @see M2tsSegmentationStyle
     */
    public void setSegmentationStyle(String segmentationStyle) {
        this.segmentationStyle = segmentationStyle;
    }

    /**
     * The segmentation style parameter controls how segmentation markers are
     * inserted into the transport stream. With avails, it is possible that
     * segments may be truncated, which can influence where future segmentation
     * markers are inserted. When a segmentation style of "reset_cadence" is
     * selected and a segment is truncated due to an avail, we will reset the
     * segmentation cadence. This means the subsequent segment will have a
     * duration of of $segmentation_time seconds. When a segmentation style of
     * "maintain_cadence" is selected and a segment is truncated due to an
     * avail, we will not reset the segmentation cadence. This means the
     * subsequent segment will likely be truncated as well. However, all
     * segments after that will have a duration of $segmentation_time seconds.
     * Note that EBP lookahead is a slight exception to this rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAINTAIN_CADENCE, RESET_CADENCE
     *
     * @param segmentationStyle The segmentation style parameter controls how
     *            segmentation markers are inserted into the transport stream.
     *            With avails, it is possible that segments may be truncated,
     *            which can influence where future segmentation markers are
     *            inserted. When a segmentation style of "reset_cadence" is
     *            selected and a segment is truncated due to an avail, we will
     *            reset the segmentation cadence. This means the subsequent
     *            segment will have a duration of of $segmentation_time seconds.
     *            When a segmentation style of "maintain_cadence" is selected
     *            and a segment is truncated due to an avail, we will not reset
     *            the segmentation cadence. This means the subsequent segment
     *            will likely be truncated as well. However, all segments after
     *            that will have a duration of $segmentation_time seconds. Note
     *            that EBP lookahead is a slight exception to this rule.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsSegmentationStyle
     */
    public M2tsSettings withSegmentationStyle(String segmentationStyle) {
        this.segmentationStyle = segmentationStyle;
        return this;
    }

    /**
     * The segmentation style parameter controls how segmentation markers are
     * inserted into the transport stream. With avails, it is possible that
     * segments may be truncated, which can influence where future segmentation
     * markers are inserted. When a segmentation style of "reset_cadence" is
     * selected and a segment is truncated due to an avail, we will reset the
     * segmentation cadence. This means the subsequent segment will have a
     * duration of of $segmentation_time seconds. When a segmentation style of
     * "maintain_cadence" is selected and a segment is truncated due to an
     * avail, we will not reset the segmentation cadence. This means the
     * subsequent segment will likely be truncated as well. However, all
     * segments after that will have a duration of $segmentation_time seconds.
     * Note that EBP lookahead is a slight exception to this rule.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAINTAIN_CADENCE, RESET_CADENCE
     *
     * @param segmentationStyle The segmentation style parameter controls how
     *            segmentation markers are inserted into the transport stream.
     *            With avails, it is possible that segments may be truncated,
     *            which can influence where future segmentation markers are
     *            inserted. When a segmentation style of "reset_cadence" is
     *            selected and a segment is truncated due to an avail, we will
     *            reset the segmentation cadence. This means the subsequent
     *            segment will have a duration of of $segmentation_time seconds.
     *            When a segmentation style of "maintain_cadence" is selected
     *            and a segment is truncated due to an avail, we will not reset
     *            the segmentation cadence. This means the subsequent segment
     *            will likely be truncated as well. However, all segments after
     *            that will have a duration of $segmentation_time seconds. Note
     *            that EBP lookahead is a slight exception to this rule.
     * @see M2tsSegmentationStyle
     */
    public void setSegmentationStyle(M2tsSegmentationStyle segmentationStyle) {
        this.segmentationStyle = segmentationStyle.toString();
    }

    /**
     * The segmentation style parameter controls how segmentation markers are
     * inserted into the transport stream. With avails, it is possible that
     * segments may be truncated, which can influence where future segmentation
     * markers are inserted. When a segmentation style of "reset_cadence" is
     * selected and a segment is truncated due to an avail, we will reset the
     * segmentation cadence. This means the subsequent segment will have a
     * duration of of $segmentation_time seconds. When a segmentation style of
     * "maintain_cadence" is selected and a segment is truncated due to an
     * avail, we will not reset the segmentation cadence. This means the
     * subsequent segment will likely be truncated as well. However, all
     * segments after that will have a duration of $segmentation_time seconds.
     * Note that EBP lookahead is a slight exception to this rule.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAINTAIN_CADENCE, RESET_CADENCE
     *
     * @param segmentationStyle The segmentation style parameter controls how
     *            segmentation markers are inserted into the transport stream.
     *            With avails, it is possible that segments may be truncated,
     *            which can influence where future segmentation markers are
     *            inserted. When a segmentation style of "reset_cadence" is
     *            selected and a segment is truncated due to an avail, we will
     *            reset the segmentation cadence. This means the subsequent
     *            segment will have a duration of of $segmentation_time seconds.
     *            When a segmentation style of "maintain_cadence" is selected
     *            and a segment is truncated due to an avail, we will not reset
     *            the segmentation cadence. This means the subsequent segment
     *            will likely be truncated as well. However, all segments after
     *            that will have a duration of $segmentation_time seconds. Note
     *            that EBP lookahead is a slight exception to this rule.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see M2tsSegmentationStyle
     */
    public M2tsSettings withSegmentationStyle(M2tsSegmentationStyle segmentationStyle) {
        this.segmentationStyle = segmentationStyle.toString();
        return this;
    }

    /**
     * Specify the length, in seconds, of each segment. Required unless markers
     * is set to _none_.
     *
     * @return Specify the length, in seconds, of each segment. Required unless
     *         markers is set to _none_.
     */
    public Double getSegmentationTime() {
        return segmentationTime;
    }

    /**
     * Specify the length, in seconds, of each segment. Required unless markers
     * is set to _none_.
     *
     * @param segmentationTime Specify the length, in seconds, of each segment.
     *            Required unless markers is set to _none_.
     */
    public void setSegmentationTime(Double segmentationTime) {
        this.segmentationTime = segmentationTime;
    }

    /**
     * Specify the length, in seconds, of each segment. Required unless markers
     * is set to _none_.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param segmentationTime Specify the length, in seconds, of each segment.
     *            Required unless markers is set to _none_.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withSegmentationTime(Double segmentationTime) {
        this.segmentationTime = segmentationTime;
        return this;
    }

    /**
     * Specify the packet identifier (PID) for timed metadata in this output.
     * Default is 502.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Specify the packet identifier (PID) for timed metadata in this
     *         output. Default is 502.
     */
    public Integer getTimedMetadataPid() {
        return timedMetadataPid;
    }

    /**
     * Specify the packet identifier (PID) for timed metadata in this output.
     * Default is 502.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param timedMetadataPid Specify the packet identifier (PID) for timed
     *            metadata in this output. Default is 502.
     */
    public void setTimedMetadataPid(Integer timedMetadataPid) {
        this.timedMetadataPid = timedMetadataPid;
    }

    /**
     * Specify the packet identifier (PID) for timed metadata in this output.
     * Default is 502.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param timedMetadataPid Specify the packet identifier (PID) for timed
     *            metadata in this output. Default is 502.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withTimedMetadataPid(Integer timedMetadataPid) {
        this.timedMetadataPid = timedMetadataPid;
        return this;
    }

    /**
     * Specify the ID for the transport stream itself in the program map table
     * for this output. Transport stream IDs and program map tables are parts of
     * MPEG-2 transport stream containers, used for organizing data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return Specify the ID for the transport stream itself in the program map
     *         table for this output. Transport stream IDs and program map
     *         tables are parts of MPEG-2 transport stream containers, used for
     *         organizing data.
     */
    public Integer getTransportStreamId() {
        return transportStreamId;
    }

    /**
     * Specify the ID for the transport stream itself in the program map table
     * for this output. Transport stream IDs and program map tables are parts of
     * MPEG-2 transport stream containers, used for organizing data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param transportStreamId Specify the ID for the transport stream itself
     *            in the program map table for this output. Transport stream IDs
     *            and program map tables are parts of MPEG-2 transport stream
     *            containers, used for organizing data.
     */
    public void setTransportStreamId(Integer transportStreamId) {
        this.transportStreamId = transportStreamId;
    }

    /**
     * Specify the ID for the transport stream itself in the program map table
     * for this output. Transport stream IDs and program map tables are parts of
     * MPEG-2 transport stream containers, used for organizing data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param transportStreamId Specify the ID for the transport stream itself
     *            in the program map table for this output. Transport stream IDs
     *            and program map tables are parts of MPEG-2 transport stream
     *            containers, used for organizing data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withTransportStreamId(Integer transportStreamId) {
        this.transportStreamId = transportStreamId;
        return this;
    }

    /**
     * Specify the packet identifier (PID) of the elementary video stream in the
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @return Specify the packet identifier (PID) of the elementary video
     *         stream in the transport stream.
     */
    public Integer getVideoPid() {
        return videoPid;
    }

    /**
     * Specify the packet identifier (PID) of the elementary video stream in the
     * transport stream.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param videoPid Specify the packet identifier (PID) of the elementary
     *            video stream in the transport stream.
     */
    public void setVideoPid(Integer videoPid) {
        this.videoPid = videoPid;
    }

    /**
     * Specify the packet identifier (PID) of the elementary video stream in the
     * transport stream.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8182<br/>
     *
     * @param videoPid Specify the packet identifier (PID) of the elementary
     *            video stream in the transport stream.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public M2tsSettings withVideoPid(Integer videoPid) {
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
        if (getAudioBufferModel() != null)
            sb.append("AudioBufferModel: " + getAudioBufferModel() + ",");
        if (getAudioFramesPerPes() != null)
            sb.append("AudioFramesPerPes: " + getAudioFramesPerPes() + ",");
        if (getAudioPids() != null)
            sb.append("AudioPids: " + getAudioPids() + ",");
        if (getBitrate() != null)
            sb.append("Bitrate: " + getBitrate() + ",");
        if (getBufferModel() != null)
            sb.append("BufferModel: " + getBufferModel() + ",");
        if (getDvbNitSettings() != null)
            sb.append("DvbNitSettings: " + getDvbNitSettings() + ",");
        if (getDvbSdtSettings() != null)
            sb.append("DvbSdtSettings: " + getDvbSdtSettings() + ",");
        if (getDvbSubPids() != null)
            sb.append("DvbSubPids: " + getDvbSubPids() + ",");
        if (getDvbTdtSettings() != null)
            sb.append("DvbTdtSettings: " + getDvbTdtSettings() + ",");
        if (getDvbTeletextPid() != null)
            sb.append("DvbTeletextPid: " + getDvbTeletextPid() + ",");
        if (getEbpAudioInterval() != null)
            sb.append("EbpAudioInterval: " + getEbpAudioInterval() + ",");
        if (getEbpPlacement() != null)
            sb.append("EbpPlacement: " + getEbpPlacement() + ",");
        if (getEsRateInPes() != null)
            sb.append("EsRateInPes: " + getEsRateInPes() + ",");
        if (getForceTsVideoEbpOrder() != null)
            sb.append("ForceTsVideoEbpOrder: " + getForceTsVideoEbpOrder() + ",");
        if (getFragmentTime() != null)
            sb.append("FragmentTime: " + getFragmentTime() + ",");
        if (getMaxPcrInterval() != null)
            sb.append("MaxPcrInterval: " + getMaxPcrInterval() + ",");
        if (getMinEbpInterval() != null)
            sb.append("MinEbpInterval: " + getMinEbpInterval() + ",");
        if (getNielsenId3() != null)
            sb.append("NielsenId3: " + getNielsenId3() + ",");
        if (getNullPacketBitrate() != null)
            sb.append("NullPacketBitrate: " + getNullPacketBitrate() + ",");
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
        if (getRateMode() != null)
            sb.append("RateMode: " + getRateMode() + ",");
        if (getScte35Esam() != null)
            sb.append("Scte35Esam: " + getScte35Esam() + ",");
        if (getScte35Pid() != null)
            sb.append("Scte35Pid: " + getScte35Pid() + ",");
        if (getScte35Source() != null)
            sb.append("Scte35Source: " + getScte35Source() + ",");
        if (getSegmentationMarkers() != null)
            sb.append("SegmentationMarkers: " + getSegmentationMarkers() + ",");
        if (getSegmentationStyle() != null)
            sb.append("SegmentationStyle: " + getSegmentationStyle() + ",");
        if (getSegmentationTime() != null)
            sb.append("SegmentationTime: " + getSegmentationTime() + ",");
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
                + ((getAudioBufferModel() == null) ? 0 : getAudioBufferModel().hashCode());
        hashCode = prime * hashCode
                + ((getAudioFramesPerPes() == null) ? 0 : getAudioFramesPerPes().hashCode());
        hashCode = prime * hashCode + ((getAudioPids() == null) ? 0 : getAudioPids().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getBufferModel() == null) ? 0 : getBufferModel().hashCode());
        hashCode = prime * hashCode
                + ((getDvbNitSettings() == null) ? 0 : getDvbNitSettings().hashCode());
        hashCode = prime * hashCode
                + ((getDvbSdtSettings() == null) ? 0 : getDvbSdtSettings().hashCode());
        hashCode = prime * hashCode + ((getDvbSubPids() == null) ? 0 : getDvbSubPids().hashCode());
        hashCode = prime * hashCode
                + ((getDvbTdtSettings() == null) ? 0 : getDvbTdtSettings().hashCode());
        hashCode = prime * hashCode
                + ((getDvbTeletextPid() == null) ? 0 : getDvbTeletextPid().hashCode());
        hashCode = prime * hashCode
                + ((getEbpAudioInterval() == null) ? 0 : getEbpAudioInterval().hashCode());
        hashCode = prime * hashCode
                + ((getEbpPlacement() == null) ? 0 : getEbpPlacement().hashCode());
        hashCode = prime * hashCode
                + ((getEsRateInPes() == null) ? 0 : getEsRateInPes().hashCode());
        hashCode = prime * hashCode
                + ((getForceTsVideoEbpOrder() == null) ? 0 : getForceTsVideoEbpOrder().hashCode());
        hashCode = prime * hashCode
                + ((getFragmentTime() == null) ? 0 : getFragmentTime().hashCode());
        hashCode = prime * hashCode
                + ((getMaxPcrInterval() == null) ? 0 : getMaxPcrInterval().hashCode());
        hashCode = prime * hashCode
                + ((getMinEbpInterval() == null) ? 0 : getMinEbpInterval().hashCode());
        hashCode = prime * hashCode + ((getNielsenId3() == null) ? 0 : getNielsenId3().hashCode());
        hashCode = prime * hashCode
                + ((getNullPacketBitrate() == null) ? 0 : getNullPacketBitrate().hashCode());
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
        hashCode = prime * hashCode + ((getRateMode() == null) ? 0 : getRateMode().hashCode());
        hashCode = prime * hashCode + ((getScte35Esam() == null) ? 0 : getScte35Esam().hashCode());
        hashCode = prime * hashCode + ((getScte35Pid() == null) ? 0 : getScte35Pid().hashCode());
        hashCode = prime * hashCode
                + ((getScte35Source() == null) ? 0 : getScte35Source().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentationMarkers() == null) ? 0 : getSegmentationMarkers().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentationStyle() == null) ? 0 : getSegmentationStyle().hashCode());
        hashCode = prime * hashCode
                + ((getSegmentationTime() == null) ? 0 : getSegmentationTime().hashCode());
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

        if (obj instanceof M2tsSettings == false)
            return false;
        M2tsSettings other = (M2tsSettings) obj;

        if (other.getAudioBufferModel() == null ^ this.getAudioBufferModel() == null)
            return false;
        if (other.getAudioBufferModel() != null
                && other.getAudioBufferModel().equals(this.getAudioBufferModel()) == false)
            return false;
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
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getBufferModel() == null ^ this.getBufferModel() == null)
            return false;
        if (other.getBufferModel() != null
                && other.getBufferModel().equals(this.getBufferModel()) == false)
            return false;
        if (other.getDvbNitSettings() == null ^ this.getDvbNitSettings() == null)
            return false;
        if (other.getDvbNitSettings() != null
                && other.getDvbNitSettings().equals(this.getDvbNitSettings()) == false)
            return false;
        if (other.getDvbSdtSettings() == null ^ this.getDvbSdtSettings() == null)
            return false;
        if (other.getDvbSdtSettings() != null
                && other.getDvbSdtSettings().equals(this.getDvbSdtSettings()) == false)
            return false;
        if (other.getDvbSubPids() == null ^ this.getDvbSubPids() == null)
            return false;
        if (other.getDvbSubPids() != null
                && other.getDvbSubPids().equals(this.getDvbSubPids()) == false)
            return false;
        if (other.getDvbTdtSettings() == null ^ this.getDvbTdtSettings() == null)
            return false;
        if (other.getDvbTdtSettings() != null
                && other.getDvbTdtSettings().equals(this.getDvbTdtSettings()) == false)
            return false;
        if (other.getDvbTeletextPid() == null ^ this.getDvbTeletextPid() == null)
            return false;
        if (other.getDvbTeletextPid() != null
                && other.getDvbTeletextPid().equals(this.getDvbTeletextPid()) == false)
            return false;
        if (other.getEbpAudioInterval() == null ^ this.getEbpAudioInterval() == null)
            return false;
        if (other.getEbpAudioInterval() != null
                && other.getEbpAudioInterval().equals(this.getEbpAudioInterval()) == false)
            return false;
        if (other.getEbpPlacement() == null ^ this.getEbpPlacement() == null)
            return false;
        if (other.getEbpPlacement() != null
                && other.getEbpPlacement().equals(this.getEbpPlacement()) == false)
            return false;
        if (other.getEsRateInPes() == null ^ this.getEsRateInPes() == null)
            return false;
        if (other.getEsRateInPes() != null
                && other.getEsRateInPes().equals(this.getEsRateInPes()) == false)
            return false;
        if (other.getForceTsVideoEbpOrder() == null ^ this.getForceTsVideoEbpOrder() == null)
            return false;
        if (other.getForceTsVideoEbpOrder() != null
                && other.getForceTsVideoEbpOrder().equals(this.getForceTsVideoEbpOrder()) == false)
            return false;
        if (other.getFragmentTime() == null ^ this.getFragmentTime() == null)
            return false;
        if (other.getFragmentTime() != null
                && other.getFragmentTime().equals(this.getFragmentTime()) == false)
            return false;
        if (other.getMaxPcrInterval() == null ^ this.getMaxPcrInterval() == null)
            return false;
        if (other.getMaxPcrInterval() != null
                && other.getMaxPcrInterval().equals(this.getMaxPcrInterval()) == false)
            return false;
        if (other.getMinEbpInterval() == null ^ this.getMinEbpInterval() == null)
            return false;
        if (other.getMinEbpInterval() != null
                && other.getMinEbpInterval().equals(this.getMinEbpInterval()) == false)
            return false;
        if (other.getNielsenId3() == null ^ this.getNielsenId3() == null)
            return false;
        if (other.getNielsenId3() != null
                && other.getNielsenId3().equals(this.getNielsenId3()) == false)
            return false;
        if (other.getNullPacketBitrate() == null ^ this.getNullPacketBitrate() == null)
            return false;
        if (other.getNullPacketBitrate() != null
                && other.getNullPacketBitrate().equals(this.getNullPacketBitrate()) == false)
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
        if (other.getRateMode() == null ^ this.getRateMode() == null)
            return false;
        if (other.getRateMode() != null && other.getRateMode().equals(this.getRateMode()) == false)
            return false;
        if (other.getScte35Esam() == null ^ this.getScte35Esam() == null)
            return false;
        if (other.getScte35Esam() != null
                && other.getScte35Esam().equals(this.getScte35Esam()) == false)
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
        if (other.getSegmentationMarkers() == null ^ this.getSegmentationMarkers() == null)
            return false;
        if (other.getSegmentationMarkers() != null
                && other.getSegmentationMarkers().equals(this.getSegmentationMarkers()) == false)
            return false;
        if (other.getSegmentationStyle() == null ^ this.getSegmentationStyle() == null)
            return false;
        if (other.getSegmentationStyle() != null
                && other.getSegmentationStyle().equals(this.getSegmentationStyle()) == false)
            return false;
        if (other.getSegmentationTime() == null ^ this.getSegmentationTime() == null)
            return false;
        if (other.getSegmentationTime() != null
                && other.getSegmentationTime().equals(this.getSegmentationTime()) == false)
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
