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
 * H264 Settings
 */
public class H264Settings implements Serializable {
    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, HIGHER, LOW, MAX, MEDIUM, OFF
     */
    private String adaptiveQuantization;

    /**
     * Indicates that AFD values will be written into the output stream. If
     * afdSignaling is "auto", the system will try to preserve the input AFD
     * value (in cases where multiple AFD values are valid). If set to "fixed",
     * the AFD value will be the value configured in the fixedAfd parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, FIXED, NONE
     */
    private String afdSignaling;

    /**
     * Average bitrate in bits/second. Required when the rate control mode is
     * VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output
     * must have a unique value when its bitrate is rounded down to the nearest
     * multiple of 1000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - <br/>
     */
    private Integer bitrate;

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer
     * model).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer bufFillPct;

    /**
     * Size of buffer (HRD buffer model) in bits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer bufSize;

    /**
     * Includes colorspace metadata in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     */
    private String colorMetadata;

    /**
     * Color Space settings
     */
    private H264ColorSpaceSettings colorSpaceSettings;

    /**
     * Entropy encoding mode. Use cabac (must be in Main or High profile) or
     * cavlc.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     */
    private String entropyEncoding;

    /**
     * Settings associated with the specified filter.
     */
    private H264FilterSettings filterSettings;

    /**
     * Four bit AFD value to write on all frames of video in the output stream.
     * Only valid when afdSignaling is set to 'Fixed'.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFD_0000, AFD_0010, AFD_0011, AFD_0100, AFD_1000,
     * AFD_1001, AFD_1010, AFD_1011, AFD_1101, AFD_1110, AFD_1111
     */
    private String fixedAfd;

    /**
     * If set to enabled, adjust quantization within each frame to reduce
     * flicker or 'pop' on I-frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String flickerAq;

    /**
     * This setting applies only when scan type is "interlaced." It controls
     * whether coding is performed on a field basis or on a frame basis. (When
     * the video is progressive, the coding is always performed on a frame
     * basis.) enabled: Force MediaLive to code on a field basis, so that odd
     * and even sets of fields are coded separately. disabled: Code the two sets
     * of fields separately (on a field basis) or together (on a frame basis
     * using PAFF), depending on what is most appropriate for the content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String forceFieldPictures;

    /**
     * This field indicates how the output video frame rate is specified. If
     * "specified" is selected then the output video frame rate is determined by
     * framerateNumerator and framerateDenominator, else if
     * "initializeFromSource" is selected then the output video frame rate will
     * be set equal to the input video frame rate of the first input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     */
    private String framerateControl;

    /**
     * Framerate denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer framerateDenominator;

    /**
     * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976
     * fps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer framerateNumerator;

    /**
     * Documentation update needed
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String gopBReference;

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended
     * that this be set to 1 so a decoder joining mid-stream will receive an IDR
     * frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer gopClosedCadence;

    /**
     * Number of B-frames between reference frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     */
    private Integer gopNumBFrames;

    /**
     * GOP size (keyframe interval) in units of either frames or seconds per
     * gopSizeUnits. If gopSizeUnits is frames, gopSize must be an integer and
     * must be greater than or equal to 1. If gopSizeUnits is seconds, gopSize
     * must be greater than 0, but need not be an integer.
     */
    private Double gopSize;

    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds
     * the system will convert the gopSize into a frame count at run time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     */
    private String gopSizeUnits;

    /**
     * H.264 Level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H264_LEVEL_1, H264_LEVEL_1_1, H264_LEVEL_1_2,
     * H264_LEVEL_1_3, H264_LEVEL_2, H264_LEVEL_2_1, H264_LEVEL_2_2,
     * H264_LEVEL_3, H264_LEVEL_3_1, H264_LEVEL_3_2, H264_LEVEL_4,
     * H264_LEVEL_4_1, H264_LEVEL_4_2, H264_LEVEL_5, H264_LEVEL_5_1,
     * H264_LEVEL_5_2, H264_LEVEL_AUTO
     */
    private String level;

    /**
     * Amount of lookahead. A value of low can decrease latency and memory
     * usage, while high can produce better quality for certain content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM
     */
    private String lookAheadRateControl;

    /**
     * For QVBR: See the tooltip for Quality level For VBR: Set the maximum
     * bitrate in order to accommodate expected spikes in the complexity of the
     * video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - <br/>
     */
    private Integer maxBitrate;

    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if
     * multiplex rate control is used. Enforces separation between repeated
     * (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame,
     * the GOP is shrunk and/or stretched to the scene change I-frame. GOP
     * stretch requires enabling lookahead as well as setting I-interval. The
     * normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP
     * size + Min-I-interval - 1
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30<br/>
     */
    private Integer minIInterval;

    /**
     * Number of reference frames to use. The encoder may use more than
     * requested if using B-frames and/or interlaced encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     */
    private Integer numRefFrames;

    /**
     * This field indicates how the output pixel aspect ratio is specified. If
     * "specified" is selected then the output video pixel aspect ratio is
     * determined by parNumerator and parDenominator, else if
     * "initializeFromSource" is selected then the output pixsel aspect ratio
     * will be set equal to the input video pixel aspect ratio of the first
     * input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     */
    private String parControl;

    /**
     * Pixel Aspect Ratio denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer parDenominator;

    /**
     * Pixel Aspect Ratio numerator.
     */
    private Integer parNumerator;

    /**
     * H.264 Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
     */
    private String profile;

    /**
     * If set to "ENHANCEDQUALITY," improves visual quality at an increased
     * output cost. If this video is being delivered to a MediaLive Multiplex,
     * "ENHANCEDQUALITY" is always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENHANCED_QUALITY, STANDARD_QUALITY
     */
    private String qualityLevel;

    /**
     * Controls the target quality for the video encode. Applies only when the
     * rate control mode is QVBR. Set values for the QVBR quality level field
     * and Max bitrate field that suit your most important viewing devices.
     * Recommended values are: - Primary screen: Quality level: 8 to 10. Max
     * bitrate: 4M - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M -
     * Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer qvbrQualityLevel;

    /**
     * Rate control mode. QVBR: Quality will match the specified quality level
     * except when it is constrained by the maximum bitrate. Recommended if you
     * or your viewers pay for bandwidth. VBR: Quality and bitrate vary,
     * depending on the video complexity. Recommended instead of QVBR if you
     * want to maintain a specific average bitrate over the duration of the
     * channel. CBR: Quality varies, depending on the video complexity.
     * Recommended only if you distribute your assets to devices that cannot
     * handle variable bitrates. Multiplex: This rate control mode is only
     * supported (and is required) when the video is being delivered to a
     * MediaLive Multiplex in which case the rate control configuration is
     * controlled by the properties within the Multiplex Program.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR, VBR
     */
    private String rateControlMode;

    /**
     * Sets the scan type of the output to progressive or top-field-first
     * interlaced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     */
    private String scanType;

    /**
     * Scene change detection. - On: inserts I-frames when scene change is
     * detected. - Off: does not force an I-frame when scene change is detected.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String sceneChangeDetect;

    /**
     * Number of slices per picture. Must be less than or equal to the number of
     * macroblock rows for progressive pictures, and less than or equal to half
     * the number of macroblock rows for interlaced pictures. This field is
     * optional; when no value is specified the encoder will choose the number
     * of slices based on encode resolution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 32<br/>
     */
    private Integer slices;

    /**
     * Softness. Selects quantizer matrix, larger values reduce high-frequency
     * content in the encoded image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 128<br/>
     */
    private Integer softness;

    /**
     * If set to enabled, adjust quantization within each frame based on spatial
     * variation of content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String spatialAq;

    /**
     * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to
     * dynamic, optimize the number of B-frames used for each sub-GOP to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DYNAMIC, FIXED
     */
    private String subgopLength;

    /**
     * Produces a bitstream compliant with SMPTE RP-2027.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, RP2027
     */
    private String syntax;

    /**
     * If set to enabled, adjust quantization within each frame based on
     * temporal variation of content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String temporalAq;

    /**
     * Determines how timecodes should be inserted into the video elementary
     * stream. - 'disabled': Do not include timecodes - 'picTimingSei': Pass
     * through picture timing SEI messages from the source specified in Timecode
     * Config
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     */
    private String timecodeInsertion;

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, HIGHER, LOW, MAX, MEDIUM, OFF
     *
     * @return Adaptive quantization. Allows intra-frame quantizers to vary to
     *         improve visual quality.
     * @see H264AdaptiveQuantization
     */
    public String getAdaptiveQuantization() {
        return adaptiveQuantization;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, HIGHER, LOW, MAX, MEDIUM, OFF
     *
     * @param adaptiveQuantization Adaptive quantization. Allows intra-frame
     *            quantizers to vary to improve visual quality.
     * @see H264AdaptiveQuantization
     */
    public void setAdaptiveQuantization(String adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, HIGHER, LOW, MAX, MEDIUM, OFF
     *
     * @param adaptiveQuantization Adaptive quantization. Allows intra-frame
     *            quantizers to vary to improve visual quality.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264AdaptiveQuantization
     */
    public H264Settings withAdaptiveQuantization(String adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization;
        return this;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, HIGHER, LOW, MAX, MEDIUM, OFF
     *
     * @param adaptiveQuantization Adaptive quantization. Allows intra-frame
     *            quantizers to vary to improve visual quality.
     * @see H264AdaptiveQuantization
     */
    public void setAdaptiveQuantization(H264AdaptiveQuantization adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization.toString();
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, HIGHER, LOW, MAX, MEDIUM, OFF
     *
     * @param adaptiveQuantization Adaptive quantization. Allows intra-frame
     *            quantizers to vary to improve visual quality.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264AdaptiveQuantization
     */
    public H264Settings withAdaptiveQuantization(H264AdaptiveQuantization adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization.toString();
        return this;
    }

    /**
     * Indicates that AFD values will be written into the output stream. If
     * afdSignaling is "auto", the system will try to preserve the input AFD
     * value (in cases where multiple AFD values are valid). If set to "fixed",
     * the AFD value will be the value configured in the fixedAfd parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, FIXED, NONE
     *
     * @return Indicates that AFD values will be written into the output stream.
     *         If afdSignaling is "auto", the system will try to preserve the
     *         input AFD value (in cases where multiple AFD values are valid).
     *         If set to "fixed", the AFD value will be the value configured in
     *         the fixedAfd parameter.
     * @see AfdSignaling
     */
    public String getAfdSignaling() {
        return afdSignaling;
    }

    /**
     * Indicates that AFD values will be written into the output stream. If
     * afdSignaling is "auto", the system will try to preserve the input AFD
     * value (in cases where multiple AFD values are valid). If set to "fixed",
     * the AFD value will be the value configured in the fixedAfd parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, FIXED, NONE
     *
     * @param afdSignaling Indicates that AFD values will be written into the
     *            output stream. If afdSignaling is "auto", the system will try
     *            to preserve the input AFD value (in cases where multiple AFD
     *            values are valid). If set to "fixed", the AFD value will be
     *            the value configured in the fixedAfd parameter.
     * @see AfdSignaling
     */
    public void setAfdSignaling(String afdSignaling) {
        this.afdSignaling = afdSignaling;
    }

    /**
     * Indicates that AFD values will be written into the output stream. If
     * afdSignaling is "auto", the system will try to preserve the input AFD
     * value (in cases where multiple AFD values are valid). If set to "fixed",
     * the AFD value will be the value configured in the fixedAfd parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, FIXED, NONE
     *
     * @param afdSignaling Indicates that AFD values will be written into the
     *            output stream. If afdSignaling is "auto", the system will try
     *            to preserve the input AFD value (in cases where multiple AFD
     *            values are valid). If set to "fixed", the AFD value will be
     *            the value configured in the fixedAfd parameter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AfdSignaling
     */
    public H264Settings withAfdSignaling(String afdSignaling) {
        this.afdSignaling = afdSignaling;
        return this;
    }

    /**
     * Indicates that AFD values will be written into the output stream. If
     * afdSignaling is "auto", the system will try to preserve the input AFD
     * value (in cases where multiple AFD values are valid). If set to "fixed",
     * the AFD value will be the value configured in the fixedAfd parameter.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, FIXED, NONE
     *
     * @param afdSignaling Indicates that AFD values will be written into the
     *            output stream. If afdSignaling is "auto", the system will try
     *            to preserve the input AFD value (in cases where multiple AFD
     *            values are valid). If set to "fixed", the AFD value will be
     *            the value configured in the fixedAfd parameter.
     * @see AfdSignaling
     */
    public void setAfdSignaling(AfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
    }

    /**
     * Indicates that AFD values will be written into the output stream. If
     * afdSignaling is "auto", the system will try to preserve the input AFD
     * value (in cases where multiple AFD values are valid). If set to "fixed",
     * the AFD value will be the value configured in the fixedAfd parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, FIXED, NONE
     *
     * @param afdSignaling Indicates that AFD values will be written into the
     *            output stream. If afdSignaling is "auto", the system will try
     *            to preserve the input AFD value (in cases where multiple AFD
     *            values are valid). If set to "fixed", the AFD value will be
     *            the value configured in the fixedAfd parameter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AfdSignaling
     */
    public H264Settings withAfdSignaling(AfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
        return this;
    }

    /**
     * Average bitrate in bits/second. Required when the rate control mode is
     * VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output
     * must have a unique value when its bitrate is rounded down to the nearest
     * multiple of 1000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - <br/>
     *
     * @return Average bitrate in bits/second. Required when the rate control
     *         mode is VBR or CBR. Not used for QVBR. In an MS Smooth output
     *         group, each output must have a unique value when its bitrate is
     *         rounded down to the nearest multiple of 1000.
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Average bitrate in bits/second. Required when the rate control mode is
     * VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output
     * must have a unique value when its bitrate is rounded down to the nearest
     * multiple of 1000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - <br/>
     *
     * @param bitrate Average bitrate in bits/second. Required when the rate
     *            control mode is VBR or CBR. Not used for QVBR. In an MS Smooth
     *            output group, each output must have a unique value when its
     *            bitrate is rounded down to the nearest multiple of 1000.
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Average bitrate in bits/second. Required when the rate control mode is
     * VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output
     * must have a unique value when its bitrate is rounded down to the nearest
     * multiple of 1000.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - <br/>
     *
     * @param bitrate Average bitrate in bits/second. Required when the rate
     *            control mode is VBR or CBR. Not used for QVBR. In an MS Smooth
     *            output group, each output must have a unique value when its
     *            bitrate is rounded down to the nearest multiple of 1000.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer
     * model).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return Percentage of the buffer that should initially be filled (HRD
     *         buffer model).
     */
    public Integer getBufFillPct() {
        return bufFillPct;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer
     * model).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param bufFillPct Percentage of the buffer that should initially be
     *            filled (HRD buffer model).
     */
    public void setBufFillPct(Integer bufFillPct) {
        this.bufFillPct = bufFillPct;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer
     * model).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param bufFillPct Percentage of the buffer that should initially be
     *            filled (HRD buffer model).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withBufFillPct(Integer bufFillPct) {
        this.bufFillPct = bufFillPct;
        return this;
    }

    /**
     * Size of buffer (HRD buffer model) in bits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Size of buffer (HRD buffer model) in bits.
     */
    public Integer getBufSize() {
        return bufSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param bufSize Size of buffer (HRD buffer model) in bits.
     */
    public void setBufSize(Integer bufSize) {
        this.bufSize = bufSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param bufSize Size of buffer (HRD buffer model) in bits.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withBufSize(Integer bufSize) {
        this.bufSize = bufSize;
        return this;
    }

    /**
     * Includes colorspace metadata in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     *
     * @return Includes colorspace metadata in the output.
     * @see H264ColorMetadata
     */
    public String getColorMetadata() {
        return colorMetadata;
    }

    /**
     * Includes colorspace metadata in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     *
     * @param colorMetadata Includes colorspace metadata in the output.
     * @see H264ColorMetadata
     */
    public void setColorMetadata(String colorMetadata) {
        this.colorMetadata = colorMetadata;
    }

    /**
     * Includes colorspace metadata in the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     *
     * @param colorMetadata Includes colorspace metadata in the output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264ColorMetadata
     */
    public H264Settings withColorMetadata(String colorMetadata) {
        this.colorMetadata = colorMetadata;
        return this;
    }

    /**
     * Includes colorspace metadata in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     *
     * @param colorMetadata Includes colorspace metadata in the output.
     * @see H264ColorMetadata
     */
    public void setColorMetadata(H264ColorMetadata colorMetadata) {
        this.colorMetadata = colorMetadata.toString();
    }

    /**
     * Includes colorspace metadata in the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     *
     * @param colorMetadata Includes colorspace metadata in the output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264ColorMetadata
     */
    public H264Settings withColorMetadata(H264ColorMetadata colorMetadata) {
        this.colorMetadata = colorMetadata.toString();
        return this;
    }

    /**
     * Color Space settings
     *
     * @return Color Space settings
     */
    public H264ColorSpaceSettings getColorSpaceSettings() {
        return colorSpaceSettings;
    }

    /**
     * Color Space settings
     *
     * @param colorSpaceSettings Color Space settings
     */
    public void setColorSpaceSettings(H264ColorSpaceSettings colorSpaceSettings) {
        this.colorSpaceSettings = colorSpaceSettings;
    }

    /**
     * Color Space settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param colorSpaceSettings Color Space settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withColorSpaceSettings(H264ColorSpaceSettings colorSpaceSettings) {
        this.colorSpaceSettings = colorSpaceSettings;
        return this;
    }

    /**
     * Entropy encoding mode. Use cabac (must be in Main or High profile) or
     * cavlc.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     *
     * @return Entropy encoding mode. Use cabac (must be in Main or High
     *         profile) or cavlc.
     * @see H264EntropyEncoding
     */
    public String getEntropyEncoding() {
        return entropyEncoding;
    }

    /**
     * Entropy encoding mode. Use cabac (must be in Main or High profile) or
     * cavlc.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     *
     * @param entropyEncoding Entropy encoding mode. Use cabac (must be in Main
     *            or High profile) or cavlc.
     * @see H264EntropyEncoding
     */
    public void setEntropyEncoding(String entropyEncoding) {
        this.entropyEncoding = entropyEncoding;
    }

    /**
     * Entropy encoding mode. Use cabac (must be in Main or High profile) or
     * cavlc.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     *
     * @param entropyEncoding Entropy encoding mode. Use cabac (must be in Main
     *            or High profile) or cavlc.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264EntropyEncoding
     */
    public H264Settings withEntropyEncoding(String entropyEncoding) {
        this.entropyEncoding = entropyEncoding;
        return this;
    }

    /**
     * Entropy encoding mode. Use cabac (must be in Main or High profile) or
     * cavlc.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     *
     * @param entropyEncoding Entropy encoding mode. Use cabac (must be in Main
     *            or High profile) or cavlc.
     * @see H264EntropyEncoding
     */
    public void setEntropyEncoding(H264EntropyEncoding entropyEncoding) {
        this.entropyEncoding = entropyEncoding.toString();
    }

    /**
     * Entropy encoding mode. Use cabac (must be in Main or High profile) or
     * cavlc.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     *
     * @param entropyEncoding Entropy encoding mode. Use cabac (must be in Main
     *            or High profile) or cavlc.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264EntropyEncoding
     */
    public H264Settings withEntropyEncoding(H264EntropyEncoding entropyEncoding) {
        this.entropyEncoding = entropyEncoding.toString();
        return this;
    }

    /**
     * Settings associated with the specified filter.
     *
     * @return Settings associated with the specified filter.
     */
    public H264FilterSettings getFilterSettings() {
        return filterSettings;
    }

    /**
     * Settings associated with the specified filter.
     *
     * @param filterSettings Settings associated with the specified filter.
     */
    public void setFilterSettings(H264FilterSettings filterSettings) {
        this.filterSettings = filterSettings;
    }

    /**
     * Settings associated with the specified filter.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterSettings Settings associated with the specified filter.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withFilterSettings(H264FilterSettings filterSettings) {
        this.filterSettings = filterSettings;
        return this;
    }

    /**
     * Four bit AFD value to write on all frames of video in the output stream.
     * Only valid when afdSignaling is set to 'Fixed'.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFD_0000, AFD_0010, AFD_0011, AFD_0100, AFD_1000,
     * AFD_1001, AFD_1010, AFD_1011, AFD_1101, AFD_1110, AFD_1111
     *
     * @return Four bit AFD value to write on all frames of video in the output
     *         stream. Only valid when afdSignaling is set to 'Fixed'.
     * @see FixedAfd
     */
    public String getFixedAfd() {
        return fixedAfd;
    }

    /**
     * Four bit AFD value to write on all frames of video in the output stream.
     * Only valid when afdSignaling is set to 'Fixed'.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFD_0000, AFD_0010, AFD_0011, AFD_0100, AFD_1000,
     * AFD_1001, AFD_1010, AFD_1011, AFD_1101, AFD_1110, AFD_1111
     *
     * @param fixedAfd Four bit AFD value to write on all frames of video in the
     *            output stream. Only valid when afdSignaling is set to 'Fixed'.
     * @see FixedAfd
     */
    public void setFixedAfd(String fixedAfd) {
        this.fixedAfd = fixedAfd;
    }

    /**
     * Four bit AFD value to write on all frames of video in the output stream.
     * Only valid when afdSignaling is set to 'Fixed'.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFD_0000, AFD_0010, AFD_0011, AFD_0100, AFD_1000,
     * AFD_1001, AFD_1010, AFD_1011, AFD_1101, AFD_1110, AFD_1111
     *
     * @param fixedAfd Four bit AFD value to write on all frames of video in the
     *            output stream. Only valid when afdSignaling is set to 'Fixed'.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FixedAfd
     */
    public H264Settings withFixedAfd(String fixedAfd) {
        this.fixedAfd = fixedAfd;
        return this;
    }

    /**
     * Four bit AFD value to write on all frames of video in the output stream.
     * Only valid when afdSignaling is set to 'Fixed'.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFD_0000, AFD_0010, AFD_0011, AFD_0100, AFD_1000,
     * AFD_1001, AFD_1010, AFD_1011, AFD_1101, AFD_1110, AFD_1111
     *
     * @param fixedAfd Four bit AFD value to write on all frames of video in the
     *            output stream. Only valid when afdSignaling is set to 'Fixed'.
     * @see FixedAfd
     */
    public void setFixedAfd(FixedAfd fixedAfd) {
        this.fixedAfd = fixedAfd.toString();
    }

    /**
     * Four bit AFD value to write on all frames of video in the output stream.
     * Only valid when afdSignaling is set to 'Fixed'.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AFD_0000, AFD_0010, AFD_0011, AFD_0100, AFD_1000,
     * AFD_1001, AFD_1010, AFD_1011, AFD_1101, AFD_1110, AFD_1111
     *
     * @param fixedAfd Four bit AFD value to write on all frames of video in the
     *            output stream. Only valid when afdSignaling is set to 'Fixed'.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FixedAfd
     */
    public H264Settings withFixedAfd(FixedAfd fixedAfd) {
        this.fixedAfd = fixedAfd.toString();
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce
     * flicker or 'pop' on I-frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return If set to enabled, adjust quantization within each frame to
     *         reduce flicker or 'pop' on I-frames.
     * @see H264FlickerAq
     */
    public String getFlickerAq() {
        return flickerAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce
     * flicker or 'pop' on I-frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param flickerAq If set to enabled, adjust quantization within each frame
     *            to reduce flicker or 'pop' on I-frames.
     * @see H264FlickerAq
     */
    public void setFlickerAq(String flickerAq) {
        this.flickerAq = flickerAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce
     * flicker or 'pop' on I-frames.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param flickerAq If set to enabled, adjust quantization within each frame
     *            to reduce flicker or 'pop' on I-frames.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FlickerAq
     */
    public H264Settings withFlickerAq(String flickerAq) {
        this.flickerAq = flickerAq;
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce
     * flicker or 'pop' on I-frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param flickerAq If set to enabled, adjust quantization within each frame
     *            to reduce flicker or 'pop' on I-frames.
     * @see H264FlickerAq
     */
    public void setFlickerAq(H264FlickerAq flickerAq) {
        this.flickerAq = flickerAq.toString();
    }

    /**
     * If set to enabled, adjust quantization within each frame to reduce
     * flicker or 'pop' on I-frames.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param flickerAq If set to enabled, adjust quantization within each frame
     *            to reduce flicker or 'pop' on I-frames.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FlickerAq
     */
    public H264Settings withFlickerAq(H264FlickerAq flickerAq) {
        this.flickerAq = flickerAq.toString();
        return this;
    }

    /**
     * This setting applies only when scan type is "interlaced." It controls
     * whether coding is performed on a field basis or on a frame basis. (When
     * the video is progressive, the coding is always performed on a frame
     * basis.) enabled: Force MediaLive to code on a field basis, so that odd
     * and even sets of fields are coded separately. disabled: Code the two sets
     * of fields separately (on a field basis) or together (on a frame basis
     * using PAFF), depending on what is most appropriate for the content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return This setting applies only when scan type is "interlaced." It
     *         controls whether coding is performed on a field basis or on a
     *         frame basis. (When the video is progressive, the coding is always
     *         performed on a frame basis.) enabled: Force MediaLive to code on
     *         a field basis, so that odd and even sets of fields are coded
     *         separately. disabled: Code the two sets of fields separately (on
     *         a field basis) or together (on a frame basis using PAFF),
     *         depending on what is most appropriate for the content.
     * @see H264ForceFieldPictures
     */
    public String getForceFieldPictures() {
        return forceFieldPictures;
    }

    /**
     * This setting applies only when scan type is "interlaced." It controls
     * whether coding is performed on a field basis or on a frame basis. (When
     * the video is progressive, the coding is always performed on a frame
     * basis.) enabled: Force MediaLive to code on a field basis, so that odd
     * and even sets of fields are coded separately. disabled: Code the two sets
     * of fields separately (on a field basis) or together (on a frame basis
     * using PAFF), depending on what is most appropriate for the content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param forceFieldPictures This setting applies only when scan type is
     *            "interlaced." It controls whether coding is performed on a
     *            field basis or on a frame basis. (When the video is
     *            progressive, the coding is always performed on a frame basis.)
     *            enabled: Force MediaLive to code on a field basis, so that odd
     *            and even sets of fields are coded separately. disabled: Code
     *            the two sets of fields separately (on a field basis) or
     *            together (on a frame basis using PAFF), depending on what is
     *            most appropriate for the content.
     * @see H264ForceFieldPictures
     */
    public void setForceFieldPictures(String forceFieldPictures) {
        this.forceFieldPictures = forceFieldPictures;
    }

    /**
     * This setting applies only when scan type is "interlaced." It controls
     * whether coding is performed on a field basis or on a frame basis. (When
     * the video is progressive, the coding is always performed on a frame
     * basis.) enabled: Force MediaLive to code on a field basis, so that odd
     * and even sets of fields are coded separately. disabled: Code the two sets
     * of fields separately (on a field basis) or together (on a frame basis
     * using PAFF), depending on what is most appropriate for the content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param forceFieldPictures This setting applies only when scan type is
     *            "interlaced." It controls whether coding is performed on a
     *            field basis or on a frame basis. (When the video is
     *            progressive, the coding is always performed on a frame basis.)
     *            enabled: Force MediaLive to code on a field basis, so that odd
     *            and even sets of fields are coded separately. disabled: Code
     *            the two sets of fields separately (on a field basis) or
     *            together (on a frame basis using PAFF), depending on what is
     *            most appropriate for the content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264ForceFieldPictures
     */
    public H264Settings withForceFieldPictures(String forceFieldPictures) {
        this.forceFieldPictures = forceFieldPictures;
        return this;
    }

    /**
     * This setting applies only when scan type is "interlaced." It controls
     * whether coding is performed on a field basis or on a frame basis. (When
     * the video is progressive, the coding is always performed on a frame
     * basis.) enabled: Force MediaLive to code on a field basis, so that odd
     * and even sets of fields are coded separately. disabled: Code the two sets
     * of fields separately (on a field basis) or together (on a frame basis
     * using PAFF), depending on what is most appropriate for the content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param forceFieldPictures This setting applies only when scan type is
     *            "interlaced." It controls whether coding is performed on a
     *            field basis or on a frame basis. (When the video is
     *            progressive, the coding is always performed on a frame basis.)
     *            enabled: Force MediaLive to code on a field basis, so that odd
     *            and even sets of fields are coded separately. disabled: Code
     *            the two sets of fields separately (on a field basis) or
     *            together (on a frame basis using PAFF), depending on what is
     *            most appropriate for the content.
     * @see H264ForceFieldPictures
     */
    public void setForceFieldPictures(H264ForceFieldPictures forceFieldPictures) {
        this.forceFieldPictures = forceFieldPictures.toString();
    }

    /**
     * This setting applies only when scan type is "interlaced." It controls
     * whether coding is performed on a field basis or on a frame basis. (When
     * the video is progressive, the coding is always performed on a frame
     * basis.) enabled: Force MediaLive to code on a field basis, so that odd
     * and even sets of fields are coded separately. disabled: Code the two sets
     * of fields separately (on a field basis) or together (on a frame basis
     * using PAFF), depending on what is most appropriate for the content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param forceFieldPictures This setting applies only when scan type is
     *            "interlaced." It controls whether coding is performed on a
     *            field basis or on a frame basis. (When the video is
     *            progressive, the coding is always performed on a frame basis.)
     *            enabled: Force MediaLive to code on a field basis, so that odd
     *            and even sets of fields are coded separately. disabled: Code
     *            the two sets of fields separately (on a field basis) or
     *            together (on a frame basis using PAFF), depending on what is
     *            most appropriate for the content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264ForceFieldPictures
     */
    public H264Settings withForceFieldPictures(H264ForceFieldPictures forceFieldPictures) {
        this.forceFieldPictures = forceFieldPictures.toString();
        return this;
    }

    /**
     * This field indicates how the output video frame rate is specified. If
     * "specified" is selected then the output video frame rate is determined by
     * framerateNumerator and framerateDenominator, else if
     * "initializeFromSource" is selected then the output video frame rate will
     * be set equal to the input video frame rate of the first input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @return This field indicates how the output video frame rate is
     *         specified. If "specified" is selected then the output video frame
     *         rate is determined by framerateNumerator and
     *         framerateDenominator, else if "initializeFromSource" is selected
     *         then the output video frame rate will be set equal to the input
     *         video frame rate of the first input.
     * @see H264FramerateControl
     */
    public String getFramerateControl() {
        return framerateControl;
    }

    /**
     * This field indicates how the output video frame rate is specified. If
     * "specified" is selected then the output video frame rate is determined by
     * framerateNumerator and framerateDenominator, else if
     * "initializeFromSource" is selected then the output video frame rate will
     * be set equal to the input video frame rate of the first input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param framerateControl This field indicates how the output video frame
     *            rate is specified. If "specified" is selected then the output
     *            video frame rate is determined by framerateNumerator and
     *            framerateDenominator, else if "initializeFromSource" is
     *            selected then the output video frame rate will be set equal to
     *            the input video frame rate of the first input.
     * @see H264FramerateControl
     */
    public void setFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
    }

    /**
     * This field indicates how the output video frame rate is specified. If
     * "specified" is selected then the output video frame rate is determined by
     * framerateNumerator and framerateDenominator, else if
     * "initializeFromSource" is selected then the output video frame rate will
     * be set equal to the input video frame rate of the first input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param framerateControl This field indicates how the output video frame
     *            rate is specified. If "specified" is selected then the output
     *            video frame rate is determined by framerateNumerator and
     *            framerateDenominator, else if "initializeFromSource" is
     *            selected then the output video frame rate will be set equal to
     *            the input video frame rate of the first input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FramerateControl
     */
    public H264Settings withFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
        return this;
    }

    /**
     * This field indicates how the output video frame rate is specified. If
     * "specified" is selected then the output video frame rate is determined by
     * framerateNumerator and framerateDenominator, else if
     * "initializeFromSource" is selected then the output video frame rate will
     * be set equal to the input video frame rate of the first input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param framerateControl This field indicates how the output video frame
     *            rate is specified. If "specified" is selected then the output
     *            video frame rate is determined by framerateNumerator and
     *            framerateDenominator, else if "initializeFromSource" is
     *            selected then the output video frame rate will be set equal to
     *            the input video frame rate of the first input.
     * @see H264FramerateControl
     */
    public void setFramerateControl(H264FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
    }

    /**
     * This field indicates how the output video frame rate is specified. If
     * "specified" is selected then the output video frame rate is determined by
     * framerateNumerator and framerateDenominator, else if
     * "initializeFromSource" is selected then the output video frame rate will
     * be set equal to the input video frame rate of the first input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param framerateControl This field indicates how the output video frame
     *            rate is specified. If "specified" is selected then the output
     *            video frame rate is determined by framerateNumerator and
     *            framerateDenominator, else if "initializeFromSource" is
     *            selected then the output video frame rate will be set equal to
     *            the input video frame rate of the first input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FramerateControl
     */
    public H264Settings withFramerateControl(H264FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
        return this;
    }

    /**
     * Framerate denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Framerate denominator.
     */
    public Integer getFramerateDenominator() {
        return framerateDenominator;
    }

    /**
     * Framerate denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param framerateDenominator Framerate denominator.
     */
    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * Framerate denominator.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param framerateDenominator Framerate denominator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
        return this;
    }

    /**
     * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976
     * fps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Framerate numerator - framerate is a fraction, e.g. 24000 / 1001
     *         = 23.976 fps.
     */
    public Integer getFramerateNumerator() {
        return framerateNumerator;
    }

    /**
     * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976
     * fps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param framerateNumerator Framerate numerator - framerate is a fraction,
     *            e.g. 24000 / 1001 = 23.976 fps.
     */
    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976
     * fps.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param framerateNumerator Framerate numerator - framerate is a fraction,
     *            e.g. 24000 / 1001 = 23.976 fps.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
        return this;
    }

    /**
     * Documentation update needed
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Documentation update needed
     * @see H264GopBReference
     */
    public String getGopBReference() {
        return gopBReference;
    }

    /**
     * Documentation update needed
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param gopBReference Documentation update needed
     * @see H264GopBReference
     */
    public void setGopBReference(String gopBReference) {
        this.gopBReference = gopBReference;
    }

    /**
     * Documentation update needed
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param gopBReference Documentation update needed
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264GopBReference
     */
    public H264Settings withGopBReference(String gopBReference) {
        this.gopBReference = gopBReference;
        return this;
    }

    /**
     * Documentation update needed
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param gopBReference Documentation update needed
     * @see H264GopBReference
     */
    public void setGopBReference(H264GopBReference gopBReference) {
        this.gopBReference = gopBReference.toString();
    }

    /**
     * Documentation update needed
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param gopBReference Documentation update needed
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264GopBReference
     */
    public H264Settings withGopBReference(H264GopBReference gopBReference) {
        this.gopBReference = gopBReference.toString();
        return this;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended
     * that this be set to 1 so a decoder joining mid-stream will receive an IDR
     * frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return Frequency of closed GOPs. In streaming applications, it is
     *         recommended that this be set to 1 so a decoder joining mid-stream
     *         will receive an IDR frame as quickly as possible. Setting this
     *         value to 0 will break output segmenting.
     */
    public Integer getGopClosedCadence() {
        return gopClosedCadence;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended
     * that this be set to 1 so a decoder joining mid-stream will receive an IDR
     * frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param gopClosedCadence Frequency of closed GOPs. In streaming
     *            applications, it is recommended that this be set to 1 so a
     *            decoder joining mid-stream will receive an IDR frame as
     *            quickly as possible. Setting this value to 0 will break output
     *            segmenting.
     */
    public void setGopClosedCadence(Integer gopClosedCadence) {
        this.gopClosedCadence = gopClosedCadence;
    }

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended
     * that this be set to 1 so a decoder joining mid-stream will receive an IDR
     * frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param gopClosedCadence Frequency of closed GOPs. In streaming
     *            applications, it is recommended that this be set to 1 so a
     *            decoder joining mid-stream will receive an IDR frame as
     *            quickly as possible. Setting this value to 0 will break output
     *            segmenting.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withGopClosedCadence(Integer gopClosedCadence) {
        this.gopClosedCadence = gopClosedCadence;
        return this;
    }

    /**
     * Number of B-frames between reference frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @return Number of B-frames between reference frames.
     */
    public Integer getGopNumBFrames() {
        return gopNumBFrames;
    }

    /**
     * Number of B-frames between reference frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @param gopNumBFrames Number of B-frames between reference frames.
     */
    public void setGopNumBFrames(Integer gopNumBFrames) {
        this.gopNumBFrames = gopNumBFrames;
    }

    /**
     * Number of B-frames between reference frames.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @param gopNumBFrames Number of B-frames between reference frames.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withGopNumBFrames(Integer gopNumBFrames) {
        this.gopNumBFrames = gopNumBFrames;
        return this;
    }

    /**
     * GOP size (keyframe interval) in units of either frames or seconds per
     * gopSizeUnits. If gopSizeUnits is frames, gopSize must be an integer and
     * must be greater than or equal to 1. If gopSizeUnits is seconds, gopSize
     * must be greater than 0, but need not be an integer.
     *
     * @return GOP size (keyframe interval) in units of either frames or seconds
     *         per gopSizeUnits. If gopSizeUnits is frames, gopSize must be an
     *         integer and must be greater than or equal to 1. If gopSizeUnits
     *         is seconds, gopSize must be greater than 0, but need not be an
     *         integer.
     */
    public Double getGopSize() {
        return gopSize;
    }

    /**
     * GOP size (keyframe interval) in units of either frames or seconds per
     * gopSizeUnits. If gopSizeUnits is frames, gopSize must be an integer and
     * must be greater than or equal to 1. If gopSizeUnits is seconds, gopSize
     * must be greater than 0, but need not be an integer.
     *
     * @param gopSize GOP size (keyframe interval) in units of either frames or
     *            seconds per gopSizeUnits. If gopSizeUnits is frames, gopSize
     *            must be an integer and must be greater than or equal to 1. If
     *            gopSizeUnits is seconds, gopSize must be greater than 0, but
     *            need not be an integer.
     */
    public void setGopSize(Double gopSize) {
        this.gopSize = gopSize;
    }

    /**
     * GOP size (keyframe interval) in units of either frames or seconds per
     * gopSizeUnits. If gopSizeUnits is frames, gopSize must be an integer and
     * must be greater than or equal to 1. If gopSizeUnits is seconds, gopSize
     * must be greater than 0, but need not be an integer.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gopSize GOP size (keyframe interval) in units of either frames or
     *            seconds per gopSizeUnits. If gopSizeUnits is frames, gopSize
     *            must be an integer and must be greater than or equal to 1. If
     *            gopSizeUnits is seconds, gopSize must be greater than 0, but
     *            need not be an integer.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withGopSize(Double gopSize) {
        this.gopSize = gopSize;
        return this;
    }

    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds
     * the system will convert the gopSize into a frame count at run time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @return Indicates if the gopSize is specified in frames or seconds. If
     *         seconds the system will convert the gopSize into a frame count at
     *         run time.
     * @see H264GopSizeUnits
     */
    public String getGopSizeUnits() {
        return gopSizeUnits;
    }

    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds
     * the system will convert the gopSize into a frame count at run time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the gopSize is specified in frames or
     *            seconds. If seconds the system will convert the gopSize into a
     *            frame count at run time.
     * @see H264GopSizeUnits
     */
    public void setGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
    }

    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds
     * the system will convert the gopSize into a frame count at run time.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the gopSize is specified in frames or
     *            seconds. If seconds the system will convert the gopSize into a
     *            frame count at run time.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264GopSizeUnits
     */
    public H264Settings withGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
        return this;
    }

    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds
     * the system will convert the gopSize into a frame count at run time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the gopSize is specified in frames or
     *            seconds. If seconds the system will convert the gopSize into a
     *            frame count at run time.
     * @see H264GopSizeUnits
     */
    public void setGopSizeUnits(H264GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
    }

    /**
     * Indicates if the gopSize is specified in frames or seconds. If seconds
     * the system will convert the gopSize into a frame count at run time.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the gopSize is specified in frames or
     *            seconds. If seconds the system will convert the gopSize into a
     *            frame count at run time.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264GopSizeUnits
     */
    public H264Settings withGopSizeUnits(H264GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
        return this;
    }

    /**
     * H.264 Level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H264_LEVEL_1, H264_LEVEL_1_1, H264_LEVEL_1_2,
     * H264_LEVEL_1_3, H264_LEVEL_2, H264_LEVEL_2_1, H264_LEVEL_2_2,
     * H264_LEVEL_3, H264_LEVEL_3_1, H264_LEVEL_3_2, H264_LEVEL_4,
     * H264_LEVEL_4_1, H264_LEVEL_4_2, H264_LEVEL_5, H264_LEVEL_5_1,
     * H264_LEVEL_5_2, H264_LEVEL_AUTO
     *
     * @return H.264 Level.
     * @see H264Level
     */
    public String getLevel() {
        return level;
    }

    /**
     * H.264 Level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H264_LEVEL_1, H264_LEVEL_1_1, H264_LEVEL_1_2,
     * H264_LEVEL_1_3, H264_LEVEL_2, H264_LEVEL_2_1, H264_LEVEL_2_2,
     * H264_LEVEL_3, H264_LEVEL_3_1, H264_LEVEL_3_2, H264_LEVEL_4,
     * H264_LEVEL_4_1, H264_LEVEL_4_2, H264_LEVEL_5, H264_LEVEL_5_1,
     * H264_LEVEL_5_2, H264_LEVEL_AUTO
     *
     * @param level H.264 Level.
     * @see H264Level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * H.264 Level.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H264_LEVEL_1, H264_LEVEL_1_1, H264_LEVEL_1_2,
     * H264_LEVEL_1_3, H264_LEVEL_2, H264_LEVEL_2_1, H264_LEVEL_2_2,
     * H264_LEVEL_3, H264_LEVEL_3_1, H264_LEVEL_3_2, H264_LEVEL_4,
     * H264_LEVEL_4_1, H264_LEVEL_4_2, H264_LEVEL_5, H264_LEVEL_5_1,
     * H264_LEVEL_5_2, H264_LEVEL_AUTO
     *
     * @param level H.264 Level.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264Level
     */
    public H264Settings withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * H.264 Level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H264_LEVEL_1, H264_LEVEL_1_1, H264_LEVEL_1_2,
     * H264_LEVEL_1_3, H264_LEVEL_2, H264_LEVEL_2_1, H264_LEVEL_2_2,
     * H264_LEVEL_3, H264_LEVEL_3_1, H264_LEVEL_3_2, H264_LEVEL_4,
     * H264_LEVEL_4_1, H264_LEVEL_4_2, H264_LEVEL_5, H264_LEVEL_5_1,
     * H264_LEVEL_5_2, H264_LEVEL_AUTO
     *
     * @param level H.264 Level.
     * @see H264Level
     */
    public void setLevel(H264Level level) {
        this.level = level.toString();
    }

    /**
     * H.264 Level.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H264_LEVEL_1, H264_LEVEL_1_1, H264_LEVEL_1_2,
     * H264_LEVEL_1_3, H264_LEVEL_2, H264_LEVEL_2_1, H264_LEVEL_2_2,
     * H264_LEVEL_3, H264_LEVEL_3_1, H264_LEVEL_3_2, H264_LEVEL_4,
     * H264_LEVEL_4_1, H264_LEVEL_4_2, H264_LEVEL_5, H264_LEVEL_5_1,
     * H264_LEVEL_5_2, H264_LEVEL_AUTO
     *
     * @param level H.264 Level.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264Level
     */
    public H264Settings withLevel(H264Level level) {
        this.level = level.toString();
        return this;
    }

    /**
     * Amount of lookahead. A value of low can decrease latency and memory
     * usage, while high can produce better quality for certain content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM
     *
     * @return Amount of lookahead. A value of low can decrease latency and
     *         memory usage, while high can produce better quality for certain
     *         content.
     * @see H264LookAheadRateControl
     */
    public String getLookAheadRateControl() {
        return lookAheadRateControl;
    }

    /**
     * Amount of lookahead. A value of low can decrease latency and memory
     * usage, while high can produce better quality for certain content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM
     *
     * @param lookAheadRateControl Amount of lookahead. A value of low can
     *            decrease latency and memory usage, while high can produce
     *            better quality for certain content.
     * @see H264LookAheadRateControl
     */
    public void setLookAheadRateControl(String lookAheadRateControl) {
        this.lookAheadRateControl = lookAheadRateControl;
    }

    /**
     * Amount of lookahead. A value of low can decrease latency and memory
     * usage, while high can produce better quality for certain content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM
     *
     * @param lookAheadRateControl Amount of lookahead. A value of low can
     *            decrease latency and memory usage, while high can produce
     *            better quality for certain content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264LookAheadRateControl
     */
    public H264Settings withLookAheadRateControl(String lookAheadRateControl) {
        this.lookAheadRateControl = lookAheadRateControl;
        return this;
    }

    /**
     * Amount of lookahead. A value of low can decrease latency and memory
     * usage, while high can produce better quality for certain content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM
     *
     * @param lookAheadRateControl Amount of lookahead. A value of low can
     *            decrease latency and memory usage, while high can produce
     *            better quality for certain content.
     * @see H264LookAheadRateControl
     */
    public void setLookAheadRateControl(H264LookAheadRateControl lookAheadRateControl) {
        this.lookAheadRateControl = lookAheadRateControl.toString();
    }

    /**
     * Amount of lookahead. A value of low can decrease latency and memory
     * usage, while high can produce better quality for certain content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, LOW, MEDIUM
     *
     * @param lookAheadRateControl Amount of lookahead. A value of low can
     *            decrease latency and memory usage, while high can produce
     *            better quality for certain content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264LookAheadRateControl
     */
    public H264Settings withLookAheadRateControl(H264LookAheadRateControl lookAheadRateControl) {
        this.lookAheadRateControl = lookAheadRateControl.toString();
        return this;
    }

    /**
     * For QVBR: See the tooltip for Quality level For VBR: Set the maximum
     * bitrate in order to accommodate expected spikes in the complexity of the
     * video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - <br/>
     *
     * @return For QVBR: See the tooltip for Quality level For VBR: Set the
     *         maximum bitrate in order to accommodate expected spikes in the
     *         complexity of the video.
     */
    public Integer getMaxBitrate() {
        return maxBitrate;
    }

    /**
     * For QVBR: See the tooltip for Quality level For VBR: Set the maximum
     * bitrate in order to accommodate expected spikes in the complexity of the
     * video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - <br/>
     *
     * @param maxBitrate For QVBR: See the tooltip for Quality level For VBR:
     *            Set the maximum bitrate in order to accommodate expected
     *            spikes in the complexity of the video.
     */
    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * For QVBR: See the tooltip for Quality level For VBR: Set the maximum
     * bitrate in order to accommodate expected spikes in the complexity of the
     * video.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - <br/>
     *
     * @param maxBitrate For QVBR: See the tooltip for Quality level For VBR:
     *            Set the maximum bitrate in order to accommodate expected
     *            spikes in the complexity of the video.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
        return this;
    }

    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if
     * multiplex rate control is used. Enforces separation between repeated
     * (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame,
     * the GOP is shrunk and/or stretched to the scene change I-frame. GOP
     * stretch requires enabling lookahead as well as setting I-interval. The
     * normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP
     * size + Min-I-interval - 1
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30<br/>
     *
     * @return Only meaningful if sceneChangeDetect is set to enabled. Defaults
     *         to 5 if multiplex rate control is used. Enforces separation
     *         between repeated (cadence) I-frames and I-frames inserted by
     *         Scene Change Detection. If a scene change I-frame is within
     *         I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     *         stretched to the scene change I-frame. GOP stretch requires
     *         enabling lookahead as well as setting I-interval. The normal
     *         cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP
     *         size + Min-I-interval - 1
     */
    public Integer getMinIInterval() {
        return minIInterval;
    }

    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if
     * multiplex rate control is used. Enforces separation between repeated
     * (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame,
     * the GOP is shrunk and/or stretched to the scene change I-frame. GOP
     * stretch requires enabling lookahead as well as setting I-interval. The
     * normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP
     * size + Min-I-interval - 1
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30<br/>
     *
     * @param minIInterval Only meaningful if sceneChangeDetect is set to
     *            enabled. Defaults to 5 if multiplex rate control is used.
     *            Enforces separation between repeated (cadence) I-frames and
     *            I-frames inserted by Scene Change Detection. If a scene change
     *            I-frame is within I-interval frames of a cadence I-frame, the
     *            GOP is shrunk and/or stretched to the scene change I-frame.
     *            GOP stretch requires enabling lookahead as well as setting
     *            I-interval. The normal cadence resumes for the next GOP. Note:
     *            Maximum GOP stretch = GOP size + Min-I-interval - 1
     */
    public void setMinIInterval(Integer minIInterval) {
        this.minIInterval = minIInterval;
    }

    /**
     * Only meaningful if sceneChangeDetect is set to enabled. Defaults to 5 if
     * multiplex rate control is used. Enforces separation between repeated
     * (cadence) I-frames and I-frames inserted by Scene Change Detection. If a
     * scene change I-frame is within I-interval frames of a cadence I-frame,
     * the GOP is shrunk and/or stretched to the scene change I-frame. GOP
     * stretch requires enabling lookahead as well as setting I-interval. The
     * normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP
     * size + Min-I-interval - 1
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30<br/>
     *
     * @param minIInterval Only meaningful if sceneChangeDetect is set to
     *            enabled. Defaults to 5 if multiplex rate control is used.
     *            Enforces separation between repeated (cadence) I-frames and
     *            I-frames inserted by Scene Change Detection. If a scene change
     *            I-frame is within I-interval frames of a cadence I-frame, the
     *            GOP is shrunk and/or stretched to the scene change I-frame.
     *            GOP stretch requires enabling lookahead as well as setting
     *            I-interval. The normal cadence resumes for the next GOP. Note:
     *            Maximum GOP stretch = GOP size + Min-I-interval - 1
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withMinIInterval(Integer minIInterval) {
        this.minIInterval = minIInterval;
        return this;
    }

    /**
     * Number of reference frames to use. The encoder may use more than
     * requested if using B-frames and/or interlaced encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @return Number of reference frames to use. The encoder may use more than
     *         requested if using B-frames and/or interlaced encoding.
     */
    public Integer getNumRefFrames() {
        return numRefFrames;
    }

    /**
     * Number of reference frames to use. The encoder may use more than
     * requested if using B-frames and/or interlaced encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @param numRefFrames Number of reference frames to use. The encoder may
     *            use more than requested if using B-frames and/or interlaced
     *            encoding.
     */
    public void setNumRefFrames(Integer numRefFrames) {
        this.numRefFrames = numRefFrames;
    }

    /**
     * Number of reference frames to use. The encoder may use more than
     * requested if using B-frames and/or interlaced encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @param numRefFrames Number of reference frames to use. The encoder may
     *            use more than requested if using B-frames and/or interlaced
     *            encoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withNumRefFrames(Integer numRefFrames) {
        this.numRefFrames = numRefFrames;
        return this;
    }

    /**
     * This field indicates how the output pixel aspect ratio is specified. If
     * "specified" is selected then the output video pixel aspect ratio is
     * determined by parNumerator and parDenominator, else if
     * "initializeFromSource" is selected then the output pixsel aspect ratio
     * will be set equal to the input video pixel aspect ratio of the first
     * input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @return This field indicates how the output pixel aspect ratio is
     *         specified. If "specified" is selected then the output video pixel
     *         aspect ratio is determined by parNumerator and parDenominator,
     *         else if "initializeFromSource" is selected then the output pixsel
     *         aspect ratio will be set equal to the input video pixel aspect
     *         ratio of the first input.
     * @see H264ParControl
     */
    public String getParControl() {
        return parControl;
    }

    /**
     * This field indicates how the output pixel aspect ratio is specified. If
     * "specified" is selected then the output video pixel aspect ratio is
     * determined by parNumerator and parDenominator, else if
     * "initializeFromSource" is selected then the output pixsel aspect ratio
     * will be set equal to the input video pixel aspect ratio of the first
     * input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl This field indicates how the output pixel aspect ratio
     *            is specified. If "specified" is selected then the output video
     *            pixel aspect ratio is determined by parNumerator and
     *            parDenominator, else if "initializeFromSource" is selected
     *            then the output pixsel aspect ratio will be set equal to the
     *            input video pixel aspect ratio of the first input.
     * @see H264ParControl
     */
    public void setParControl(String parControl) {
        this.parControl = parControl;
    }

    /**
     * This field indicates how the output pixel aspect ratio is specified. If
     * "specified" is selected then the output video pixel aspect ratio is
     * determined by parNumerator and parDenominator, else if
     * "initializeFromSource" is selected then the output pixsel aspect ratio
     * will be set equal to the input video pixel aspect ratio of the first
     * input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl This field indicates how the output pixel aspect ratio
     *            is specified. If "specified" is selected then the output video
     *            pixel aspect ratio is determined by parNumerator and
     *            parDenominator, else if "initializeFromSource" is selected
     *            then the output pixsel aspect ratio will be set equal to the
     *            input video pixel aspect ratio of the first input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264ParControl
     */
    public H264Settings withParControl(String parControl) {
        this.parControl = parControl;
        return this;
    }

    /**
     * This field indicates how the output pixel aspect ratio is specified. If
     * "specified" is selected then the output video pixel aspect ratio is
     * determined by parNumerator and parDenominator, else if
     * "initializeFromSource" is selected then the output pixsel aspect ratio
     * will be set equal to the input video pixel aspect ratio of the first
     * input.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl This field indicates how the output pixel aspect ratio
     *            is specified. If "specified" is selected then the output video
     *            pixel aspect ratio is determined by parNumerator and
     *            parDenominator, else if "initializeFromSource" is selected
     *            then the output pixsel aspect ratio will be set equal to the
     *            input video pixel aspect ratio of the first input.
     * @see H264ParControl
     */
    public void setParControl(H264ParControl parControl) {
        this.parControl = parControl.toString();
    }

    /**
     * This field indicates how the output pixel aspect ratio is specified. If
     * "specified" is selected then the output video pixel aspect ratio is
     * determined by parNumerator and parDenominator, else if
     * "initializeFromSource" is selected then the output pixsel aspect ratio
     * will be set equal to the input video pixel aspect ratio of the first
     * input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl This field indicates how the output pixel aspect ratio
     *            is specified. If "specified" is selected then the output video
     *            pixel aspect ratio is determined by parNumerator and
     *            parDenominator, else if "initializeFromSource" is selected
     *            then the output pixsel aspect ratio will be set equal to the
     *            input video pixel aspect ratio of the first input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264ParControl
     */
    public H264Settings withParControl(H264ParControl parControl) {
        this.parControl = parControl.toString();
        return this;
    }

    /**
     * Pixel Aspect Ratio denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Pixel Aspect Ratio denominator.
     */
    public Integer getParDenominator() {
        return parDenominator;
    }

    /**
     * Pixel Aspect Ratio denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param parDenominator Pixel Aspect Ratio denominator.
     */
    public void setParDenominator(Integer parDenominator) {
        this.parDenominator = parDenominator;
    }

    /**
     * Pixel Aspect Ratio denominator.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param parDenominator Pixel Aspect Ratio denominator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withParDenominator(Integer parDenominator) {
        this.parDenominator = parDenominator;
        return this;
    }

    /**
     * Pixel Aspect Ratio numerator.
     *
     * @return Pixel Aspect Ratio numerator.
     */
    public Integer getParNumerator() {
        return parNumerator;
    }

    /**
     * Pixel Aspect Ratio numerator.
     *
     * @param parNumerator Pixel Aspect Ratio numerator.
     */
    public void setParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
    }

    /**
     * Pixel Aspect Ratio numerator.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parNumerator Pixel Aspect Ratio numerator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
        return this;
    }

    /**
     * H.264 Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
     *
     * @return H.264 Profile.
     * @see H264Profile
     */
    public String getProfile() {
        return profile;
    }

    /**
     * H.264 Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
     *
     * @param profile H.264 Profile.
     * @see H264Profile
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * H.264 Profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
     *
     * @param profile H.264 Profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264Profile
     */
    public H264Settings withProfile(String profile) {
        this.profile = profile;
        return this;
    }

    /**
     * H.264 Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
     *
     * @param profile H.264 Profile.
     * @see H264Profile
     */
    public void setProfile(H264Profile profile) {
        this.profile = profile.toString();
    }

    /**
     * H.264 Profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
     *
     * @param profile H.264 Profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264Profile
     */
    public H264Settings withProfile(H264Profile profile) {
        this.profile = profile.toString();
        return this;
    }

    /**
     * If set to "ENHANCEDQUALITY," improves visual quality at an increased
     * output cost. If this video is being delivered to a MediaLive Multiplex,
     * "ENHANCEDQUALITY" is always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENHANCED_QUALITY, STANDARD_QUALITY
     *
     * @return If set to "ENHANCEDQUALITY," improves visual quality at an
     *         increased output cost. If this video is being delivered to a
     *         MediaLive Multiplex, "ENHANCEDQUALITY" is always used.
     * @see H264QualityLevel
     */
    public String getQualityLevel() {
        return qualityLevel;
    }

    /**
     * If set to "ENHANCEDQUALITY," improves visual quality at an increased
     * output cost. If this video is being delivered to a MediaLive Multiplex,
     * "ENHANCEDQUALITY" is always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENHANCED_QUALITY, STANDARD_QUALITY
     *
     * @param qualityLevel If set to "ENHANCEDQUALITY," improves visual quality
     *            at an increased output cost. If this video is being delivered
     *            to a MediaLive Multiplex, "ENHANCEDQUALITY" is always used.
     * @see H264QualityLevel
     */
    public void setQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    /**
     * If set to "ENHANCEDQUALITY," improves visual quality at an increased
     * output cost. If this video is being delivered to a MediaLive Multiplex,
     * "ENHANCEDQUALITY" is always used.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENHANCED_QUALITY, STANDARD_QUALITY
     *
     * @param qualityLevel If set to "ENHANCEDQUALITY," improves visual quality
     *            at an increased output cost. If this video is being delivered
     *            to a MediaLive Multiplex, "ENHANCEDQUALITY" is always used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264QualityLevel
     */
    public H264Settings withQualityLevel(String qualityLevel) {
        this.qualityLevel = qualityLevel;
        return this;
    }

    /**
     * If set to "ENHANCEDQUALITY," improves visual quality at an increased
     * output cost. If this video is being delivered to a MediaLive Multiplex,
     * "ENHANCEDQUALITY" is always used.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENHANCED_QUALITY, STANDARD_QUALITY
     *
     * @param qualityLevel If set to "ENHANCEDQUALITY," improves visual quality
     *            at an increased output cost. If this video is being delivered
     *            to a MediaLive Multiplex, "ENHANCEDQUALITY" is always used.
     * @see H264QualityLevel
     */
    public void setQualityLevel(H264QualityLevel qualityLevel) {
        this.qualityLevel = qualityLevel.toString();
    }

    /**
     * If set to "ENHANCEDQUALITY," improves visual quality at an increased
     * output cost. If this video is being delivered to a MediaLive Multiplex,
     * "ENHANCEDQUALITY" is always used.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENHANCED_QUALITY, STANDARD_QUALITY
     *
     * @param qualityLevel If set to "ENHANCEDQUALITY," improves visual quality
     *            at an increased output cost. If this video is being delivered
     *            to a MediaLive Multiplex, "ENHANCEDQUALITY" is always used.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264QualityLevel
     */
    public H264Settings withQualityLevel(H264QualityLevel qualityLevel) {
        this.qualityLevel = qualityLevel.toString();
        return this;
    }

    /**
     * Controls the target quality for the video encode. Applies only when the
     * rate control mode is QVBR. Set values for the QVBR quality level field
     * and Max bitrate field that suit your most important viewing devices.
     * Recommended values are: - Primary screen: Quality level: 8 to 10. Max
     * bitrate: 4M - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M -
     * Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return Controls the target quality for the video encode. Applies only
     *         when the rate control mode is QVBR. Set values for the QVBR
     *         quality level field and Max bitrate field that suit your most
     *         important viewing devices. Recommended values are: - Primary
     *         screen: Quality level: 8 to 10. Max bitrate: 4M - PC or tablet:
     *         Quality level: 7. Max bitrate: 1.5M to 3M - Smartphone: Quality
     *         level: 6. Max bitrate: 1M to 1.5M
     */
    public Integer getQvbrQualityLevel() {
        return qvbrQualityLevel;
    }

    /**
     * Controls the target quality for the video encode. Applies only when the
     * rate control mode is QVBR. Set values for the QVBR quality level field
     * and Max bitrate field that suit your most important viewing devices.
     * Recommended values are: - Primary screen: Quality level: 8 to 10. Max
     * bitrate: 4M - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M -
     * Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param qvbrQualityLevel Controls the target quality for the video encode.
     *            Applies only when the rate control mode is QVBR. Set values
     *            for the QVBR quality level field and Max bitrate field that
     *            suit your most important viewing devices. Recommended values
     *            are: - Primary screen: Quality level: 8 to 10. Max bitrate: 4M
     *            - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M -
     *            Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     */
    public void setQvbrQualityLevel(Integer qvbrQualityLevel) {
        this.qvbrQualityLevel = qvbrQualityLevel;
    }

    /**
     * Controls the target quality for the video encode. Applies only when the
     * rate control mode is QVBR. Set values for the QVBR quality level field
     * and Max bitrate field that suit your most important viewing devices.
     * Recommended values are: - Primary screen: Quality level: 8 to 10. Max
     * bitrate: 4M - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M -
     * Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param qvbrQualityLevel Controls the target quality for the video encode.
     *            Applies only when the rate control mode is QVBR. Set values
     *            for the QVBR quality level field and Max bitrate field that
     *            suit your most important viewing devices. Recommended values
     *            are: - Primary screen: Quality level: 8 to 10. Max bitrate: 4M
     *            - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M -
     *            Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withQvbrQualityLevel(Integer qvbrQualityLevel) {
        this.qvbrQualityLevel = qvbrQualityLevel;
        return this;
    }

    /**
     * Rate control mode. QVBR: Quality will match the specified quality level
     * except when it is constrained by the maximum bitrate. Recommended if you
     * or your viewers pay for bandwidth. VBR: Quality and bitrate vary,
     * depending on the video complexity. Recommended instead of QVBR if you
     * want to maintain a specific average bitrate over the duration of the
     * channel. CBR: Quality varies, depending on the video complexity.
     * Recommended only if you distribute your assets to devices that cannot
     * handle variable bitrates. Multiplex: This rate control mode is only
     * supported (and is required) when the video is being delivered to a
     * MediaLive Multiplex in which case the rate control configuration is
     * controlled by the properties within the Multiplex Program.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR, VBR
     *
     * @return Rate control mode. QVBR: Quality will match the specified quality
     *         level except when it is constrained by the maximum bitrate.
     *         Recommended if you or your viewers pay for bandwidth. VBR:
     *         Quality and bitrate vary, depending on the video complexity.
     *         Recommended instead of QVBR if you want to maintain a specific
     *         average bitrate over the duration of the channel. CBR: Quality
     *         varies, depending on the video complexity. Recommended only if
     *         you distribute your assets to devices that cannot handle variable
     *         bitrates. Multiplex: This rate control mode is only supported
     *         (and is required) when the video is being delivered to a
     *         MediaLive Multiplex in which case the rate control configuration
     *         is controlled by the properties within the Multiplex Program.
     * @see H264RateControlMode
     */
    public String getRateControlMode() {
        return rateControlMode;
    }

    /**
     * Rate control mode. QVBR: Quality will match the specified quality level
     * except when it is constrained by the maximum bitrate. Recommended if you
     * or your viewers pay for bandwidth. VBR: Quality and bitrate vary,
     * depending on the video complexity. Recommended instead of QVBR if you
     * want to maintain a specific average bitrate over the duration of the
     * channel. CBR: Quality varies, depending on the video complexity.
     * Recommended only if you distribute your assets to devices that cannot
     * handle variable bitrates. Multiplex: This rate control mode is only
     * supported (and is required) when the video is being delivered to a
     * MediaLive Multiplex in which case the rate control configuration is
     * controlled by the properties within the Multiplex Program.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR, VBR
     *
     * @param rateControlMode Rate control mode. QVBR: Quality will match the
     *            specified quality level except when it is constrained by the
     *            maximum bitrate. Recommended if you or your viewers pay for
     *            bandwidth. VBR: Quality and bitrate vary, depending on the
     *            video complexity. Recommended instead of QVBR if you want to
     *            maintain a specific average bitrate over the duration of the
     *            channel. CBR: Quality varies, depending on the video
     *            complexity. Recommended only if you distribute your assets to
     *            devices that cannot handle variable bitrates. Multiplex: This
     *            rate control mode is only supported (and is required) when the
     *            video is being delivered to a MediaLive Multiplex in which
     *            case the rate control configuration is controlled by the
     *            properties within the Multiplex Program.
     * @see H264RateControlMode
     */
    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Rate control mode. QVBR: Quality will match the specified quality level
     * except when it is constrained by the maximum bitrate. Recommended if you
     * or your viewers pay for bandwidth. VBR: Quality and bitrate vary,
     * depending on the video complexity. Recommended instead of QVBR if you
     * want to maintain a specific average bitrate over the duration of the
     * channel. CBR: Quality varies, depending on the video complexity.
     * Recommended only if you distribute your assets to devices that cannot
     * handle variable bitrates. Multiplex: This rate control mode is only
     * supported (and is required) when the video is being delivered to a
     * MediaLive Multiplex in which case the rate control configuration is
     * controlled by the properties within the Multiplex Program.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR, VBR
     *
     * @param rateControlMode Rate control mode. QVBR: Quality will match the
     *            specified quality level except when it is constrained by the
     *            maximum bitrate. Recommended if you or your viewers pay for
     *            bandwidth. VBR: Quality and bitrate vary, depending on the
     *            video complexity. Recommended instead of QVBR if you want to
     *            maintain a specific average bitrate over the duration of the
     *            channel. CBR: Quality varies, depending on the video
     *            complexity. Recommended only if you distribute your assets to
     *            devices that cannot handle variable bitrates. Multiplex: This
     *            rate control mode is only supported (and is required) when the
     *            video is being delivered to a MediaLive Multiplex in which
     *            case the rate control configuration is controlled by the
     *            properties within the Multiplex Program.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264RateControlMode
     */
    public H264Settings withRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
        return this;
    }

    /**
     * Rate control mode. QVBR: Quality will match the specified quality level
     * except when it is constrained by the maximum bitrate. Recommended if you
     * or your viewers pay for bandwidth. VBR: Quality and bitrate vary,
     * depending on the video complexity. Recommended instead of QVBR if you
     * want to maintain a specific average bitrate over the duration of the
     * channel. CBR: Quality varies, depending on the video complexity.
     * Recommended only if you distribute your assets to devices that cannot
     * handle variable bitrates. Multiplex: This rate control mode is only
     * supported (and is required) when the video is being delivered to a
     * MediaLive Multiplex in which case the rate control configuration is
     * controlled by the properties within the Multiplex Program.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR, VBR
     *
     * @param rateControlMode Rate control mode. QVBR: Quality will match the
     *            specified quality level except when it is constrained by the
     *            maximum bitrate. Recommended if you or your viewers pay for
     *            bandwidth. VBR: Quality and bitrate vary, depending on the
     *            video complexity. Recommended instead of QVBR if you want to
     *            maintain a specific average bitrate over the duration of the
     *            channel. CBR: Quality varies, depending on the video
     *            complexity. Recommended only if you distribute your assets to
     *            devices that cannot handle variable bitrates. Multiplex: This
     *            rate control mode is only supported (and is required) when the
     *            video is being delivered to a MediaLive Multiplex in which
     *            case the rate control configuration is controlled by the
     *            properties within the Multiplex Program.
     * @see H264RateControlMode
     */
    public void setRateControlMode(H264RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
    }

    /**
     * Rate control mode. QVBR: Quality will match the specified quality level
     * except when it is constrained by the maximum bitrate. Recommended if you
     * or your viewers pay for bandwidth. VBR: Quality and bitrate vary,
     * depending on the video complexity. Recommended instead of QVBR if you
     * want to maintain a specific average bitrate over the duration of the
     * channel. CBR: Quality varies, depending on the video complexity.
     * Recommended only if you distribute your assets to devices that cannot
     * handle variable bitrates. Multiplex: This rate control mode is only
     * supported (and is required) when the video is being delivered to a
     * MediaLive Multiplex in which case the rate control configuration is
     * controlled by the properties within the Multiplex Program.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR, VBR
     *
     * @param rateControlMode Rate control mode. QVBR: Quality will match the
     *            specified quality level except when it is constrained by the
     *            maximum bitrate. Recommended if you or your viewers pay for
     *            bandwidth. VBR: Quality and bitrate vary, depending on the
     *            video complexity. Recommended instead of QVBR if you want to
     *            maintain a specific average bitrate over the duration of the
     *            channel. CBR: Quality varies, depending on the video
     *            complexity. Recommended only if you distribute your assets to
     *            devices that cannot handle variable bitrates. Multiplex: This
     *            rate control mode is only supported (and is required) when the
     *            video is being delivered to a MediaLive Multiplex in which
     *            case the rate control configuration is controlled by the
     *            properties within the Multiplex Program.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264RateControlMode
     */
    public H264Settings withRateControlMode(H264RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first
     * interlaced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     *
     * @return Sets the scan type of the output to progressive or
     *         top-field-first interlaced.
     * @see H264ScanType
     */
    public String getScanType() {
        return scanType;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first
     * interlaced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     *
     * @param scanType Sets the scan type of the output to progressive or
     *            top-field-first interlaced.
     * @see H264ScanType
     */
    public void setScanType(String scanType) {
        this.scanType = scanType;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first
     * interlaced.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     *
     * @param scanType Sets the scan type of the output to progressive or
     *            top-field-first interlaced.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264ScanType
     */
    public H264Settings withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first
     * interlaced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     *
     * @param scanType Sets the scan type of the output to progressive or
     *            top-field-first interlaced.
     * @see H264ScanType
     */
    public void setScanType(H264ScanType scanType) {
        this.scanType = scanType.toString();
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first
     * interlaced.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERLACED, PROGRESSIVE
     *
     * @param scanType Sets the scan type of the output to progressive or
     *            top-field-first interlaced.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264ScanType
     */
    public H264Settings withScanType(H264ScanType scanType) {
        this.scanType = scanType.toString();
        return this;
    }

    /**
     * Scene change detection. - On: inserts I-frames when scene change is
     * detected. - Off: does not force an I-frame when scene change is detected.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Scene change detection. - On: inserts I-frames when scene change
     *         is detected. - Off: does not force an I-frame when scene change
     *         is detected.
     * @see H264SceneChangeDetect
     */
    public String getSceneChangeDetect() {
        return sceneChangeDetect;
    }

    /**
     * Scene change detection. - On: inserts I-frames when scene change is
     * detected. - Off: does not force an I-frame when scene change is detected.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Scene change detection. - On: inserts I-frames
     *            when scene change is detected. - Off: does not force an
     *            I-frame when scene change is detected.
     * @see H264SceneChangeDetect
     */
    public void setSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
    }

    /**
     * Scene change detection. - On: inserts I-frames when scene change is
     * detected. - Off: does not force an I-frame when scene change is detected.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Scene change detection. - On: inserts I-frames
     *            when scene change is detected. - Off: does not force an
     *            I-frame when scene change is detected.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264SceneChangeDetect
     */
    public H264Settings withSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
        return this;
    }

    /**
     * Scene change detection. - On: inserts I-frames when scene change is
     * detected. - Off: does not force an I-frame when scene change is detected.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Scene change detection. - On: inserts I-frames
     *            when scene change is detected. - Off: does not force an
     *            I-frame when scene change is detected.
     * @see H264SceneChangeDetect
     */
    public void setSceneChangeDetect(H264SceneChangeDetect sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect.toString();
    }

    /**
     * Scene change detection. - On: inserts I-frames when scene change is
     * detected. - Off: does not force an I-frame when scene change is detected.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Scene change detection. - On: inserts I-frames
     *            when scene change is detected. - Off: does not force an
     *            I-frame when scene change is detected.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264SceneChangeDetect
     */
    public H264Settings withSceneChangeDetect(H264SceneChangeDetect sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect.toString();
        return this;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of
     * macroblock rows for progressive pictures, and less than or equal to half
     * the number of macroblock rows for interlaced pictures. This field is
     * optional; when no value is specified the encoder will choose the number
     * of slices based on encode resolution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 32<br/>
     *
     * @return Number of slices per picture. Must be less than or equal to the
     *         number of macroblock rows for progressive pictures, and less than
     *         or equal to half the number of macroblock rows for interlaced
     *         pictures. This field is optional; when no value is specified the
     *         encoder will choose the number of slices based on encode
     *         resolution.
     */
    public Integer getSlices() {
        return slices;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of
     * macroblock rows for progressive pictures, and less than or equal to half
     * the number of macroblock rows for interlaced pictures. This field is
     * optional; when no value is specified the encoder will choose the number
     * of slices based on encode resolution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 32<br/>
     *
     * @param slices Number of slices per picture. Must be less than or equal to
     *            the number of macroblock rows for progressive pictures, and
     *            less than or equal to half the number of macroblock rows for
     *            interlaced pictures. This field is optional; when no value is
     *            specified the encoder will choose the number of slices based
     *            on encode resolution.
     */
    public void setSlices(Integer slices) {
        this.slices = slices;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of
     * macroblock rows for progressive pictures, and less than or equal to half
     * the number of macroblock rows for interlaced pictures. This field is
     * optional; when no value is specified the encoder will choose the number
     * of slices based on encode resolution.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 32<br/>
     *
     * @param slices Number of slices per picture. Must be less than or equal to
     *            the number of macroblock rows for progressive pictures, and
     *            less than or equal to half the number of macroblock rows for
     *            interlaced pictures. This field is optional; when no value is
     *            specified the encoder will choose the number of slices based
     *            on encode resolution.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withSlices(Integer slices) {
        this.slices = slices;
        return this;
    }

    /**
     * Softness. Selects quantizer matrix, larger values reduce high-frequency
     * content in the encoded image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 128<br/>
     *
     * @return Softness. Selects quantizer matrix, larger values reduce
     *         high-frequency content in the encoded image.
     */
    public Integer getSoftness() {
        return softness;
    }

    /**
     * Softness. Selects quantizer matrix, larger values reduce high-frequency
     * content in the encoded image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 128<br/>
     *
     * @param softness Softness. Selects quantizer matrix, larger values reduce
     *            high-frequency content in the encoded image.
     */
    public void setSoftness(Integer softness) {
        this.softness = softness;
    }

    /**
     * Softness. Selects quantizer matrix, larger values reduce high-frequency
     * content in the encoded image.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 128<br/>
     *
     * @param softness Softness. Selects quantizer matrix, larger values reduce
     *            high-frequency content in the encoded image.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withSoftness(Integer softness) {
        this.softness = softness;
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on spatial
     * variation of content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return If set to enabled, adjust quantization within each frame based on
     *         spatial variation of content complexity.
     * @see H264SpatialAq
     */
    public String getSpatialAq() {
        return spatialAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on spatial
     * variation of content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param spatialAq If set to enabled, adjust quantization within each frame
     *            based on spatial variation of content complexity.
     * @see H264SpatialAq
     */
    public void setSpatialAq(String spatialAq) {
        this.spatialAq = spatialAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on spatial
     * variation of content complexity.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param spatialAq If set to enabled, adjust quantization within each frame
     *            based on spatial variation of content complexity.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264SpatialAq
     */
    public H264Settings withSpatialAq(String spatialAq) {
        this.spatialAq = spatialAq;
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on spatial
     * variation of content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param spatialAq If set to enabled, adjust quantization within each frame
     *            based on spatial variation of content complexity.
     * @see H264SpatialAq
     */
    public void setSpatialAq(H264SpatialAq spatialAq) {
        this.spatialAq = spatialAq.toString();
    }

    /**
     * If set to enabled, adjust quantization within each frame based on spatial
     * variation of content complexity.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param spatialAq If set to enabled, adjust quantization within each frame
     *            based on spatial variation of content complexity.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264SpatialAq
     */
    public H264Settings withSpatialAq(H264SpatialAq spatialAq) {
        this.spatialAq = spatialAq.toString();
        return this;
    }

    /**
     * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to
     * dynamic, optimize the number of B-frames used for each sub-GOP to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DYNAMIC, FIXED
     *
     * @return If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set
     *         to dynamic, optimize the number of B-frames used for each sub-GOP
     *         to improve visual quality.
     * @see H264SubGopLength
     */
    public String getSubgopLength() {
        return subgopLength;
    }

    /**
     * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to
     * dynamic, optimize the number of B-frames used for each sub-GOP to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DYNAMIC, FIXED
     *
     * @param subgopLength If set to fixed, use gopNumBFrames B-frames per
     *            sub-GOP. If set to dynamic, optimize the number of B-frames
     *            used for each sub-GOP to improve visual quality.
     * @see H264SubGopLength
     */
    public void setSubgopLength(String subgopLength) {
        this.subgopLength = subgopLength;
    }

    /**
     * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to
     * dynamic, optimize the number of B-frames used for each sub-GOP to improve
     * visual quality.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DYNAMIC, FIXED
     *
     * @param subgopLength If set to fixed, use gopNumBFrames B-frames per
     *            sub-GOP. If set to dynamic, optimize the number of B-frames
     *            used for each sub-GOP to improve visual quality.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264SubGopLength
     */
    public H264Settings withSubgopLength(String subgopLength) {
        this.subgopLength = subgopLength;
        return this;
    }

    /**
     * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to
     * dynamic, optimize the number of B-frames used for each sub-GOP to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DYNAMIC, FIXED
     *
     * @param subgopLength If set to fixed, use gopNumBFrames B-frames per
     *            sub-GOP. If set to dynamic, optimize the number of B-frames
     *            used for each sub-GOP to improve visual quality.
     * @see H264SubGopLength
     */
    public void setSubgopLength(H264SubGopLength subgopLength) {
        this.subgopLength = subgopLength.toString();
    }

    /**
     * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to
     * dynamic, optimize the number of B-frames used for each sub-GOP to improve
     * visual quality.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DYNAMIC, FIXED
     *
     * @param subgopLength If set to fixed, use gopNumBFrames B-frames per
     *            sub-GOP. If set to dynamic, optimize the number of B-frames
     *            used for each sub-GOP to improve visual quality.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264SubGopLength
     */
    public H264Settings withSubgopLength(H264SubGopLength subgopLength) {
        this.subgopLength = subgopLength.toString();
        return this;
    }

    /**
     * Produces a bitstream compliant with SMPTE RP-2027.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, RP2027
     *
     * @return Produces a bitstream compliant with SMPTE RP-2027.
     * @see H264Syntax
     */
    public String getSyntax() {
        return syntax;
    }

    /**
     * Produces a bitstream compliant with SMPTE RP-2027.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, RP2027
     *
     * @param syntax Produces a bitstream compliant with SMPTE RP-2027.
     * @see H264Syntax
     */
    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    /**
     * Produces a bitstream compliant with SMPTE RP-2027.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, RP2027
     *
     * @param syntax Produces a bitstream compliant with SMPTE RP-2027.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264Syntax
     */
    public H264Settings withSyntax(String syntax) {
        this.syntax = syntax;
        return this;
    }

    /**
     * Produces a bitstream compliant with SMPTE RP-2027.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, RP2027
     *
     * @param syntax Produces a bitstream compliant with SMPTE RP-2027.
     * @see H264Syntax
     */
    public void setSyntax(H264Syntax syntax) {
        this.syntax = syntax.toString();
    }

    /**
     * Produces a bitstream compliant with SMPTE RP-2027.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, RP2027
     *
     * @param syntax Produces a bitstream compliant with SMPTE RP-2027.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264Syntax
     */
    public H264Settings withSyntax(H264Syntax syntax) {
        this.syntax = syntax.toString();
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on
     * temporal variation of content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return If set to enabled, adjust quantization within each frame based on
     *         temporal variation of content complexity.
     * @see H264TemporalAq
     */
    public String getTemporalAq() {
        return temporalAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on
     * temporal variation of content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param temporalAq If set to enabled, adjust quantization within each
     *            frame based on temporal variation of content complexity.
     * @see H264TemporalAq
     */
    public void setTemporalAq(String temporalAq) {
        this.temporalAq = temporalAq;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on
     * temporal variation of content complexity.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param temporalAq If set to enabled, adjust quantization within each
     *            frame based on temporal variation of content complexity.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264TemporalAq
     */
    public H264Settings withTemporalAq(String temporalAq) {
        this.temporalAq = temporalAq;
        return this;
    }

    /**
     * If set to enabled, adjust quantization within each frame based on
     * temporal variation of content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param temporalAq If set to enabled, adjust quantization within each
     *            frame based on temporal variation of content complexity.
     * @see H264TemporalAq
     */
    public void setTemporalAq(H264TemporalAq temporalAq) {
        this.temporalAq = temporalAq.toString();
    }

    /**
     * If set to enabled, adjust quantization within each frame based on
     * temporal variation of content complexity.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param temporalAq If set to enabled, adjust quantization within each
     *            frame based on temporal variation of content complexity.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264TemporalAq
     */
    public H264Settings withTemporalAq(H264TemporalAq temporalAq) {
        this.temporalAq = temporalAq.toString();
        return this;
    }

    /**
     * Determines how timecodes should be inserted into the video elementary
     * stream. - 'disabled': Do not include timecodes - 'picTimingSei': Pass
     * through picture timing SEI messages from the source specified in Timecode
     * Config
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     *
     * @return Determines how timecodes should be inserted into the video
     *         elementary stream. - 'disabled': Do not include timecodes -
     *         'picTimingSei': Pass through picture timing SEI messages from the
     *         source specified in Timecode Config
     * @see H264TimecodeInsertionBehavior
     */
    public String getTimecodeInsertion() {
        return timecodeInsertion;
    }

    /**
     * Determines how timecodes should be inserted into the video elementary
     * stream. - 'disabled': Do not include timecodes - 'picTimingSei': Pass
     * through picture timing SEI messages from the source specified in Timecode
     * Config
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     *
     * @param timecodeInsertion Determines how timecodes should be inserted into
     *            the video elementary stream. - 'disabled': Do not include
     *            timecodes - 'picTimingSei': Pass through picture timing SEI
     *            messages from the source specified in Timecode Config
     * @see H264TimecodeInsertionBehavior
     */
    public void setTimecodeInsertion(String timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion;
    }

    /**
     * Determines how timecodes should be inserted into the video elementary
     * stream. - 'disabled': Do not include timecodes - 'picTimingSei': Pass
     * through picture timing SEI messages from the source specified in Timecode
     * Config
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     *
     * @param timecodeInsertion Determines how timecodes should be inserted into
     *            the video elementary stream. - 'disabled': Do not include
     *            timecodes - 'picTimingSei': Pass through picture timing SEI
     *            messages from the source specified in Timecode Config
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264TimecodeInsertionBehavior
     */
    public H264Settings withTimecodeInsertion(String timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion;
        return this;
    }

    /**
     * Determines how timecodes should be inserted into the video elementary
     * stream. - 'disabled': Do not include timecodes - 'picTimingSei': Pass
     * through picture timing SEI messages from the source specified in Timecode
     * Config
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     *
     * @param timecodeInsertion Determines how timecodes should be inserted into
     *            the video elementary stream. - 'disabled': Do not include
     *            timecodes - 'picTimingSei': Pass through picture timing SEI
     *            messages from the source specified in Timecode Config
     * @see H264TimecodeInsertionBehavior
     */
    public void setTimecodeInsertion(H264TimecodeInsertionBehavior timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion.toString();
    }

    /**
     * Determines how timecodes should be inserted into the video elementary
     * stream. - 'disabled': Do not include timecodes - 'picTimingSei': Pass
     * through picture timing SEI messages from the source specified in Timecode
     * Config
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     *
     * @param timecodeInsertion Determines how timecodes should be inserted into
     *            the video elementary stream. - 'disabled': Do not include
     *            timecodes - 'picTimingSei': Pass through picture timing SEI
     *            messages from the source specified in Timecode Config
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264TimecodeInsertionBehavior
     */
    public H264Settings withTimecodeInsertion(H264TimecodeInsertionBehavior timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion.toString();
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
        if (getAdaptiveQuantization() != null)
            sb.append("AdaptiveQuantization: " + getAdaptiveQuantization() + ",");
        if (getAfdSignaling() != null)
            sb.append("AfdSignaling: " + getAfdSignaling() + ",");
        if (getBitrate() != null)
            sb.append("Bitrate: " + getBitrate() + ",");
        if (getBufFillPct() != null)
            sb.append("BufFillPct: " + getBufFillPct() + ",");
        if (getBufSize() != null)
            sb.append("BufSize: " + getBufSize() + ",");
        if (getColorMetadata() != null)
            sb.append("ColorMetadata: " + getColorMetadata() + ",");
        if (getColorSpaceSettings() != null)
            sb.append("ColorSpaceSettings: " + getColorSpaceSettings() + ",");
        if (getEntropyEncoding() != null)
            sb.append("EntropyEncoding: " + getEntropyEncoding() + ",");
        if (getFilterSettings() != null)
            sb.append("FilterSettings: " + getFilterSettings() + ",");
        if (getFixedAfd() != null)
            sb.append("FixedAfd: " + getFixedAfd() + ",");
        if (getFlickerAq() != null)
            sb.append("FlickerAq: " + getFlickerAq() + ",");
        if (getForceFieldPictures() != null)
            sb.append("ForceFieldPictures: " + getForceFieldPictures() + ",");
        if (getFramerateControl() != null)
            sb.append("FramerateControl: " + getFramerateControl() + ",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: " + getFramerateDenominator() + ",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: " + getFramerateNumerator() + ",");
        if (getGopBReference() != null)
            sb.append("GopBReference: " + getGopBReference() + ",");
        if (getGopClosedCadence() != null)
            sb.append("GopClosedCadence: " + getGopClosedCadence() + ",");
        if (getGopNumBFrames() != null)
            sb.append("GopNumBFrames: " + getGopNumBFrames() + ",");
        if (getGopSize() != null)
            sb.append("GopSize: " + getGopSize() + ",");
        if (getGopSizeUnits() != null)
            sb.append("GopSizeUnits: " + getGopSizeUnits() + ",");
        if (getLevel() != null)
            sb.append("Level: " + getLevel() + ",");
        if (getLookAheadRateControl() != null)
            sb.append("LookAheadRateControl: " + getLookAheadRateControl() + ",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: " + getMaxBitrate() + ",");
        if (getMinIInterval() != null)
            sb.append("MinIInterval: " + getMinIInterval() + ",");
        if (getNumRefFrames() != null)
            sb.append("NumRefFrames: " + getNumRefFrames() + ",");
        if (getParControl() != null)
            sb.append("ParControl: " + getParControl() + ",");
        if (getParDenominator() != null)
            sb.append("ParDenominator: " + getParDenominator() + ",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: " + getParNumerator() + ",");
        if (getProfile() != null)
            sb.append("Profile: " + getProfile() + ",");
        if (getQualityLevel() != null)
            sb.append("QualityLevel: " + getQualityLevel() + ",");
        if (getQvbrQualityLevel() != null)
            sb.append("QvbrQualityLevel: " + getQvbrQualityLevel() + ",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: " + getRateControlMode() + ",");
        if (getScanType() != null)
            sb.append("ScanType: " + getScanType() + ",");
        if (getSceneChangeDetect() != null)
            sb.append("SceneChangeDetect: " + getSceneChangeDetect() + ",");
        if (getSlices() != null)
            sb.append("Slices: " + getSlices() + ",");
        if (getSoftness() != null)
            sb.append("Softness: " + getSoftness() + ",");
        if (getSpatialAq() != null)
            sb.append("SpatialAq: " + getSpatialAq() + ",");
        if (getSubgopLength() != null)
            sb.append("SubgopLength: " + getSubgopLength() + ",");
        if (getSyntax() != null)
            sb.append("Syntax: " + getSyntax() + ",");
        if (getTemporalAq() != null)
            sb.append("TemporalAq: " + getTemporalAq() + ",");
        if (getTimecodeInsertion() != null)
            sb.append("TimecodeInsertion: " + getTimecodeInsertion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdaptiveQuantization() == null) ? 0 : getAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode
                + ((getAfdSignaling() == null) ? 0 : getAfdSignaling().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getBufFillPct() == null) ? 0 : getBufFillPct().hashCode());
        hashCode = prime * hashCode + ((getBufSize() == null) ? 0 : getBufSize().hashCode());
        hashCode = prime * hashCode
                + ((getColorMetadata() == null) ? 0 : getColorMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getColorSpaceSettings() == null) ? 0 : getColorSpaceSettings().hashCode());
        hashCode = prime * hashCode
                + ((getEntropyEncoding() == null) ? 0 : getEntropyEncoding().hashCode());
        hashCode = prime * hashCode
                + ((getFilterSettings() == null) ? 0 : getFilterSettings().hashCode());
        hashCode = prime * hashCode + ((getFixedAfd() == null) ? 0 : getFixedAfd().hashCode());
        hashCode = prime * hashCode + ((getFlickerAq() == null) ? 0 : getFlickerAq().hashCode());
        hashCode = prime * hashCode
                + ((getForceFieldPictures() == null) ? 0 : getForceFieldPictures().hashCode());
        hashCode = prime * hashCode
                + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime * hashCode
                + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode
                + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode
                + ((getGopBReference() == null) ? 0 : getGopBReference().hashCode());
        hashCode = prime * hashCode
                + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
        hashCode = prime * hashCode
                + ((getGopNumBFrames() == null) ? 0 : getGopNumBFrames().hashCode());
        hashCode = prime * hashCode + ((getGopSize() == null) ? 0 : getGopSize().hashCode());
        hashCode = prime * hashCode
                + ((getGopSizeUnits() == null) ? 0 : getGopSizeUnits().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode
                + ((getLookAheadRateControl() == null) ? 0 : getLookAheadRateControl().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getMinIInterval() == null) ? 0 : getMinIInterval().hashCode());
        hashCode = prime * hashCode
                + ((getNumRefFrames() == null) ? 0 : getNumRefFrames().hashCode());
        hashCode = prime * hashCode + ((getParControl() == null) ? 0 : getParControl().hashCode());
        hashCode = prime * hashCode
                + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode
                + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        hashCode = prime * hashCode
                + ((getQualityLevel() == null) ? 0 : getQualityLevel().hashCode());
        hashCode = prime * hashCode
                + ((getQvbrQualityLevel() == null) ? 0 : getQvbrQualityLevel().hashCode());
        hashCode = prime * hashCode
                + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        hashCode = prime * hashCode
                + ((getSceneChangeDetect() == null) ? 0 : getSceneChangeDetect().hashCode());
        hashCode = prime * hashCode + ((getSlices() == null) ? 0 : getSlices().hashCode());
        hashCode = prime * hashCode + ((getSoftness() == null) ? 0 : getSoftness().hashCode());
        hashCode = prime * hashCode + ((getSpatialAq() == null) ? 0 : getSpatialAq().hashCode());
        hashCode = prime * hashCode
                + ((getSubgopLength() == null) ? 0 : getSubgopLength().hashCode());
        hashCode = prime * hashCode + ((getSyntax() == null) ? 0 : getSyntax().hashCode());
        hashCode = prime * hashCode + ((getTemporalAq() == null) ? 0 : getTemporalAq().hashCode());
        hashCode = prime * hashCode
                + ((getTimecodeInsertion() == null) ? 0 : getTimecodeInsertion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof H264Settings == false)
            return false;
        H264Settings other = (H264Settings) obj;

        if (other.getAdaptiveQuantization() == null ^ this.getAdaptiveQuantization() == null)
            return false;
        if (other.getAdaptiveQuantization() != null
                && other.getAdaptiveQuantization().equals(this.getAdaptiveQuantization()) == false)
            return false;
        if (other.getAfdSignaling() == null ^ this.getAfdSignaling() == null)
            return false;
        if (other.getAfdSignaling() != null
                && other.getAfdSignaling().equals(this.getAfdSignaling()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getBufFillPct() == null ^ this.getBufFillPct() == null)
            return false;
        if (other.getBufFillPct() != null
                && other.getBufFillPct().equals(this.getBufFillPct()) == false)
            return false;
        if (other.getBufSize() == null ^ this.getBufSize() == null)
            return false;
        if (other.getBufSize() != null && other.getBufSize().equals(this.getBufSize()) == false)
            return false;
        if (other.getColorMetadata() == null ^ this.getColorMetadata() == null)
            return false;
        if (other.getColorMetadata() != null
                && other.getColorMetadata().equals(this.getColorMetadata()) == false)
            return false;
        if (other.getColorSpaceSettings() == null ^ this.getColorSpaceSettings() == null)
            return false;
        if (other.getColorSpaceSettings() != null
                && other.getColorSpaceSettings().equals(this.getColorSpaceSettings()) == false)
            return false;
        if (other.getEntropyEncoding() == null ^ this.getEntropyEncoding() == null)
            return false;
        if (other.getEntropyEncoding() != null
                && other.getEntropyEncoding().equals(this.getEntropyEncoding()) == false)
            return false;
        if (other.getFilterSettings() == null ^ this.getFilterSettings() == null)
            return false;
        if (other.getFilterSettings() != null
                && other.getFilterSettings().equals(this.getFilterSettings()) == false)
            return false;
        if (other.getFixedAfd() == null ^ this.getFixedAfd() == null)
            return false;
        if (other.getFixedAfd() != null && other.getFixedAfd().equals(this.getFixedAfd()) == false)
            return false;
        if (other.getFlickerAq() == null ^ this.getFlickerAq() == null)
            return false;
        if (other.getFlickerAq() != null
                && other.getFlickerAq().equals(this.getFlickerAq()) == false)
            return false;
        if (other.getForceFieldPictures() == null ^ this.getForceFieldPictures() == null)
            return false;
        if (other.getForceFieldPictures() != null
                && other.getForceFieldPictures().equals(this.getForceFieldPictures()) == false)
            return false;
        if (other.getFramerateControl() == null ^ this.getFramerateControl() == null)
            return false;
        if (other.getFramerateControl() != null
                && other.getFramerateControl().equals(this.getFramerateControl()) == false)
            return false;
        if (other.getFramerateDenominator() == null ^ this.getFramerateDenominator() == null)
            return false;
        if (other.getFramerateDenominator() != null
                && other.getFramerateDenominator().equals(this.getFramerateDenominator()) == false)
            return false;
        if (other.getFramerateNumerator() == null ^ this.getFramerateNumerator() == null)
            return false;
        if (other.getFramerateNumerator() != null
                && other.getFramerateNumerator().equals(this.getFramerateNumerator()) == false)
            return false;
        if (other.getGopBReference() == null ^ this.getGopBReference() == null)
            return false;
        if (other.getGopBReference() != null
                && other.getGopBReference().equals(this.getGopBReference()) == false)
            return false;
        if (other.getGopClosedCadence() == null ^ this.getGopClosedCadence() == null)
            return false;
        if (other.getGopClosedCadence() != null
                && other.getGopClosedCadence().equals(this.getGopClosedCadence()) == false)
            return false;
        if (other.getGopNumBFrames() == null ^ this.getGopNumBFrames() == null)
            return false;
        if (other.getGopNumBFrames() != null
                && other.getGopNumBFrames().equals(this.getGopNumBFrames()) == false)
            return false;
        if (other.getGopSize() == null ^ this.getGopSize() == null)
            return false;
        if (other.getGopSize() != null && other.getGopSize().equals(this.getGopSize()) == false)
            return false;
        if (other.getGopSizeUnits() == null ^ this.getGopSizeUnits() == null)
            return false;
        if (other.getGopSizeUnits() != null
                && other.getGopSizeUnits().equals(this.getGopSizeUnits()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getLookAheadRateControl() == null ^ this.getLookAheadRateControl() == null)
            return false;
        if (other.getLookAheadRateControl() != null
                && other.getLookAheadRateControl().equals(this.getLookAheadRateControl()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null
                && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        if (other.getMinIInterval() == null ^ this.getMinIInterval() == null)
            return false;
        if (other.getMinIInterval() != null
                && other.getMinIInterval().equals(this.getMinIInterval()) == false)
            return false;
        if (other.getNumRefFrames() == null ^ this.getNumRefFrames() == null)
            return false;
        if (other.getNumRefFrames() != null
                && other.getNumRefFrames().equals(this.getNumRefFrames()) == false)
            return false;
        if (other.getParControl() == null ^ this.getParControl() == null)
            return false;
        if (other.getParControl() != null
                && other.getParControl().equals(this.getParControl()) == false)
            return false;
        if (other.getParDenominator() == null ^ this.getParDenominator() == null)
            return false;
        if (other.getParDenominator() != null
                && other.getParDenominator().equals(this.getParDenominator()) == false)
            return false;
        if (other.getParNumerator() == null ^ this.getParNumerator() == null)
            return false;
        if (other.getParNumerator() != null
                && other.getParNumerator().equals(this.getParNumerator()) == false)
            return false;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        if (other.getQualityLevel() == null ^ this.getQualityLevel() == null)
            return false;
        if (other.getQualityLevel() != null
                && other.getQualityLevel().equals(this.getQualityLevel()) == false)
            return false;
        if (other.getQvbrQualityLevel() == null ^ this.getQvbrQualityLevel() == null)
            return false;
        if (other.getQvbrQualityLevel() != null
                && other.getQvbrQualityLevel().equals(this.getQvbrQualityLevel()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null
                && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getScanType() == null ^ this.getScanType() == null)
            return false;
        if (other.getScanType() != null && other.getScanType().equals(this.getScanType()) == false)
            return false;
        if (other.getSceneChangeDetect() == null ^ this.getSceneChangeDetect() == null)
            return false;
        if (other.getSceneChangeDetect() != null
                && other.getSceneChangeDetect().equals(this.getSceneChangeDetect()) == false)
            return false;
        if (other.getSlices() == null ^ this.getSlices() == null)
            return false;
        if (other.getSlices() != null && other.getSlices().equals(this.getSlices()) == false)
            return false;
        if (other.getSoftness() == null ^ this.getSoftness() == null)
            return false;
        if (other.getSoftness() != null && other.getSoftness().equals(this.getSoftness()) == false)
            return false;
        if (other.getSpatialAq() == null ^ this.getSpatialAq() == null)
            return false;
        if (other.getSpatialAq() != null
                && other.getSpatialAq().equals(this.getSpatialAq()) == false)
            return false;
        if (other.getSubgopLength() == null ^ this.getSubgopLength() == null)
            return false;
        if (other.getSubgopLength() != null
                && other.getSubgopLength().equals(this.getSubgopLength()) == false)
            return false;
        if (other.getSyntax() == null ^ this.getSyntax() == null)
            return false;
        if (other.getSyntax() != null && other.getSyntax().equals(this.getSyntax()) == false)
            return false;
        if (other.getTemporalAq() == null ^ this.getTemporalAq() == null)
            return false;
        if (other.getTemporalAq() != null
                && other.getTemporalAq().equals(this.getTemporalAq()) == false)
            return false;
        if (other.getTimecodeInsertion() == null ^ this.getTimecodeInsertion() == null)
            return false;
        if (other.getTimecodeInsertion() != null
                && other.getTimecodeInsertion().equals(this.getTimecodeInsertion()) == false)
            return false;
        return true;
    }
}
