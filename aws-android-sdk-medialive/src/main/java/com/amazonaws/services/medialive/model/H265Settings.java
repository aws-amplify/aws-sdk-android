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
 * H265 Settings
 */
public class H265Settings implements Serializable {
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
     * Whether or not EML should insert an Alternative Transfer Function SEI
     * message to support backwards compatibility with non-HDR decoders and
     * displays.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT
     */
    private String alternativeTransferFunction;

    /**
     * Average bitrate in bits/second. Required when the rate control mode is
     * VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output
     * must have a unique value when its bitrate is rounded down to the nearest
     * multiple of 1000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 40000000<br/>
     */
    private Integer bitrate;

    /**
     * Size of buffer (HRD buffer model) in bits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 80000000<br/>
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
    private H265ColorSpaceSettings colorSpaceSettings;

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
     * Framerate denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3003<br/>
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
     * H.265 Level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H265_LEVEL_1, H265_LEVEL_2, H265_LEVEL_2_1,
     * H265_LEVEL_3, H265_LEVEL_3_1, H265_LEVEL_4, H265_LEVEL_4_1, H265_LEVEL_5,
     * H265_LEVEL_5_1, H265_LEVEL_5_2, H265_LEVEL_6, H265_LEVEL_6_1,
     * H265_LEVEL_6_2, H265_LEVEL_AUTO
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
     * For QVBR: See the tooltip for Quality level
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 40000000<br/>
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
     * Pixel Aspect Ratio denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer parDenominator;

    /**
     * Pixel Aspect Ratio numerator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer parNumerator;

    /**
     * H.265 Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, MAIN_10BIT
     */
    private String profile;

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
     * or your viewers pay for bandwidth. CBR: Quality varies, depending on the
     * video complexity. Recommended only if you distribute your assets to
     * devices that cannot handle variable bitrates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR
     */
    private String rateControlMode;

    /**
     * Sets the scan type of the output to progressive or top-field-first
     * interlaced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE
     */
    private String scanType;

    /**
     * Scene change detection.
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
     * <b>Range: </b>1 - 16<br/>
     */
    private Integer slices;

    /**
     * H.265 Tier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, MAIN
     */
    private String tier;

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
     * @see H265AdaptiveQuantization
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
     * @see H265AdaptiveQuantization
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
     * @see H265AdaptiveQuantization
     */
    public H265Settings withAdaptiveQuantization(String adaptiveQuantization) {
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
     * @see H265AdaptiveQuantization
     */
    public void setAdaptiveQuantization(H265AdaptiveQuantization adaptiveQuantization) {
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
     * @see H265AdaptiveQuantization
     */
    public H265Settings withAdaptiveQuantization(H265AdaptiveQuantization adaptiveQuantization) {
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
    public H265Settings withAfdSignaling(String afdSignaling) {
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
    public H265Settings withAfdSignaling(AfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
        return this;
    }

    /**
     * Whether or not EML should insert an Alternative Transfer Function SEI
     * message to support backwards compatibility with non-HDR decoders and
     * displays.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT
     *
     * @return Whether or not EML should insert an Alternative Transfer Function
     *         SEI message to support backwards compatibility with non-HDR
     *         decoders and displays.
     * @see H265AlternativeTransferFunction
     */
    public String getAlternativeTransferFunction() {
        return alternativeTransferFunction;
    }

    /**
     * Whether or not EML should insert an Alternative Transfer Function SEI
     * message to support backwards compatibility with non-HDR decoders and
     * displays.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT
     *
     * @param alternativeTransferFunction Whether or not EML should insert an
     *            Alternative Transfer Function SEI message to support backwards
     *            compatibility with non-HDR decoders and displays.
     * @see H265AlternativeTransferFunction
     */
    public void setAlternativeTransferFunction(String alternativeTransferFunction) {
        this.alternativeTransferFunction = alternativeTransferFunction;
    }

    /**
     * Whether or not EML should insert an Alternative Transfer Function SEI
     * message to support backwards compatibility with non-HDR decoders and
     * displays.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT
     *
     * @param alternativeTransferFunction Whether or not EML should insert an
     *            Alternative Transfer Function SEI message to support backwards
     *            compatibility with non-HDR decoders and displays.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265AlternativeTransferFunction
     */
    public H265Settings withAlternativeTransferFunction(String alternativeTransferFunction) {
        this.alternativeTransferFunction = alternativeTransferFunction;
        return this;
    }

    /**
     * Whether or not EML should insert an Alternative Transfer Function SEI
     * message to support backwards compatibility with non-HDR decoders and
     * displays.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT
     *
     * @param alternativeTransferFunction Whether or not EML should insert an
     *            Alternative Transfer Function SEI message to support backwards
     *            compatibility with non-HDR decoders and displays.
     * @see H265AlternativeTransferFunction
     */
    public void setAlternativeTransferFunction(
            H265AlternativeTransferFunction alternativeTransferFunction) {
        this.alternativeTransferFunction = alternativeTransferFunction.toString();
    }

    /**
     * Whether or not EML should insert an Alternative Transfer Function SEI
     * message to support backwards compatibility with non-HDR decoders and
     * displays.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INSERT, OMIT
     *
     * @param alternativeTransferFunction Whether or not EML should insert an
     *            Alternative Transfer Function SEI message to support backwards
     *            compatibility with non-HDR decoders and displays.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265AlternativeTransferFunction
     */
    public H265Settings withAlternativeTransferFunction(
            H265AlternativeTransferFunction alternativeTransferFunction) {
        this.alternativeTransferFunction = alternativeTransferFunction.toString();
        return this;
    }

    /**
     * Average bitrate in bits/second. Required when the rate control mode is
     * VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output
     * must have a unique value when its bitrate is rounded down to the nearest
     * multiple of 1000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 40000000<br/>
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
     * <b>Range: </b>100000 - 40000000<br/>
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
     * <b>Range: </b>100000 - 40000000<br/>
     *
     * @param bitrate Average bitrate in bits/second. Required when the rate
     *            control mode is VBR or CBR. Not used for QVBR. In an MS Smooth
     *            output group, each output must have a unique value when its
     *            bitrate is rounded down to the nearest multiple of 1000.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265Settings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Size of buffer (HRD buffer model) in bits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 80000000<br/>
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
     * <b>Range: </b>100000 - 80000000<br/>
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
     * <b>Range: </b>100000 - 80000000<br/>
     *
     * @param bufSize Size of buffer (HRD buffer model) in bits.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265Settings withBufSize(Integer bufSize) {
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
     * @see H265ColorMetadata
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
     * @see H265ColorMetadata
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
     * @see H265ColorMetadata
     */
    public H265Settings withColorMetadata(String colorMetadata) {
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
     * @see H265ColorMetadata
     */
    public void setColorMetadata(H265ColorMetadata colorMetadata) {
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
     * @see H265ColorMetadata
     */
    public H265Settings withColorMetadata(H265ColorMetadata colorMetadata) {
        this.colorMetadata = colorMetadata.toString();
        return this;
    }

    /**
     * Color Space settings
     *
     * @return Color Space settings
     */
    public H265ColorSpaceSettings getColorSpaceSettings() {
        return colorSpaceSettings;
    }

    /**
     * Color Space settings
     *
     * @param colorSpaceSettings Color Space settings
     */
    public void setColorSpaceSettings(H265ColorSpaceSettings colorSpaceSettings) {
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
    public H265Settings withColorSpaceSettings(H265ColorSpaceSettings colorSpaceSettings) {
        this.colorSpaceSettings = colorSpaceSettings;
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
    public H265Settings withFixedAfd(String fixedAfd) {
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
    public H265Settings withFixedAfd(FixedAfd fixedAfd) {
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
     * @see H265FlickerAq
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
     * @see H265FlickerAq
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
     * @see H265FlickerAq
     */
    public H265Settings withFlickerAq(String flickerAq) {
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
     * @see H265FlickerAq
     */
    public void setFlickerAq(H265FlickerAq flickerAq) {
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
     * @see H265FlickerAq
     */
    public H265Settings withFlickerAq(H265FlickerAq flickerAq) {
        this.flickerAq = flickerAq.toString();
        return this;
    }

    /**
     * Framerate denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3003<br/>
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
     * <b>Range: </b>1 - 3003<br/>
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
     * <b>Range: </b>1 - 3003<br/>
     *
     * @param framerateDenominator Framerate denominator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265Settings withFramerateDenominator(Integer framerateDenominator) {
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
    public H265Settings withFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
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
    public H265Settings withGopClosedCadence(Integer gopClosedCadence) {
        this.gopClosedCadence = gopClosedCadence;
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
    public H265Settings withGopSize(Double gopSize) {
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
     * @see H265GopSizeUnits
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
     * @see H265GopSizeUnits
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
     * @see H265GopSizeUnits
     */
    public H265Settings withGopSizeUnits(String gopSizeUnits) {
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
     * @see H265GopSizeUnits
     */
    public void setGopSizeUnits(H265GopSizeUnits gopSizeUnits) {
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
     * @see H265GopSizeUnits
     */
    public H265Settings withGopSizeUnits(H265GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
        return this;
    }

    /**
     * H.265 Level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H265_LEVEL_1, H265_LEVEL_2, H265_LEVEL_2_1,
     * H265_LEVEL_3, H265_LEVEL_3_1, H265_LEVEL_4, H265_LEVEL_4_1, H265_LEVEL_5,
     * H265_LEVEL_5_1, H265_LEVEL_5_2, H265_LEVEL_6, H265_LEVEL_6_1,
     * H265_LEVEL_6_2, H265_LEVEL_AUTO
     *
     * @return H.265 Level.
     * @see H265Level
     */
    public String getLevel() {
        return level;
    }

    /**
     * H.265 Level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H265_LEVEL_1, H265_LEVEL_2, H265_LEVEL_2_1,
     * H265_LEVEL_3, H265_LEVEL_3_1, H265_LEVEL_4, H265_LEVEL_4_1, H265_LEVEL_5,
     * H265_LEVEL_5_1, H265_LEVEL_5_2, H265_LEVEL_6, H265_LEVEL_6_1,
     * H265_LEVEL_6_2, H265_LEVEL_AUTO
     *
     * @param level H.265 Level.
     * @see H265Level
     */
    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * H.265 Level.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H265_LEVEL_1, H265_LEVEL_2, H265_LEVEL_2_1,
     * H265_LEVEL_3, H265_LEVEL_3_1, H265_LEVEL_4, H265_LEVEL_4_1, H265_LEVEL_5,
     * H265_LEVEL_5_1, H265_LEVEL_5_2, H265_LEVEL_6, H265_LEVEL_6_1,
     * H265_LEVEL_6_2, H265_LEVEL_AUTO
     *
     * @param level H.265 Level.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265Level
     */
    public H265Settings withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * H.265 Level.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H265_LEVEL_1, H265_LEVEL_2, H265_LEVEL_2_1,
     * H265_LEVEL_3, H265_LEVEL_3_1, H265_LEVEL_4, H265_LEVEL_4_1, H265_LEVEL_5,
     * H265_LEVEL_5_1, H265_LEVEL_5_2, H265_LEVEL_6, H265_LEVEL_6_1,
     * H265_LEVEL_6_2, H265_LEVEL_AUTO
     *
     * @param level H.265 Level.
     * @see H265Level
     */
    public void setLevel(H265Level level) {
        this.level = level.toString();
    }

    /**
     * H.265 Level.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>H265_LEVEL_1, H265_LEVEL_2, H265_LEVEL_2_1,
     * H265_LEVEL_3, H265_LEVEL_3_1, H265_LEVEL_4, H265_LEVEL_4_1, H265_LEVEL_5,
     * H265_LEVEL_5_1, H265_LEVEL_5_2, H265_LEVEL_6, H265_LEVEL_6_1,
     * H265_LEVEL_6_2, H265_LEVEL_AUTO
     *
     * @param level H.265 Level.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265Level
     */
    public H265Settings withLevel(H265Level level) {
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
     * @see H265LookAheadRateControl
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
     * @see H265LookAheadRateControl
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
     * @see H265LookAheadRateControl
     */
    public H265Settings withLookAheadRateControl(String lookAheadRateControl) {
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
     * @see H265LookAheadRateControl
     */
    public void setLookAheadRateControl(H265LookAheadRateControl lookAheadRateControl) {
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
     * @see H265LookAheadRateControl
     */
    public H265Settings withLookAheadRateControl(H265LookAheadRateControl lookAheadRateControl) {
        this.lookAheadRateControl = lookAheadRateControl.toString();
        return this;
    }

    /**
     * For QVBR: See the tooltip for Quality level
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 40000000<br/>
     *
     * @return For QVBR: See the tooltip for Quality level
     */
    public Integer getMaxBitrate() {
        return maxBitrate;
    }

    /**
     * For QVBR: See the tooltip for Quality level
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 40000000<br/>
     *
     * @param maxBitrate For QVBR: See the tooltip for Quality level
     */
    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * For QVBR: See the tooltip for Quality level
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 40000000<br/>
     *
     * @param maxBitrate For QVBR: See the tooltip for Quality level
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265Settings withMaxBitrate(Integer maxBitrate) {
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
    public H265Settings withMinIInterval(Integer minIInterval) {
        this.minIInterval = minIInterval;
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
    public H265Settings withParDenominator(Integer parDenominator) {
        this.parDenominator = parDenominator;
        return this;
    }

    /**
     * Pixel Aspect Ratio numerator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return Pixel Aspect Ratio numerator.
     */
    public Integer getParNumerator() {
        return parNumerator;
    }

    /**
     * Pixel Aspect Ratio numerator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param parNumerator Pixel Aspect Ratio numerator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H265Settings withParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
        return this;
    }

    /**
     * H.265 Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, MAIN_10BIT
     *
     * @return H.265 Profile.
     * @see H265Profile
     */
    public String getProfile() {
        return profile;
    }

    /**
     * H.265 Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, MAIN_10BIT
     *
     * @param profile H.265 Profile.
     * @see H265Profile
     */
    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * H.265 Profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, MAIN_10BIT
     *
     * @param profile H.265 Profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265Profile
     */
    public H265Settings withProfile(String profile) {
        this.profile = profile;
        return this;
    }

    /**
     * H.265 Profile.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, MAIN_10BIT
     *
     * @param profile H.265 Profile.
     * @see H265Profile
     */
    public void setProfile(H265Profile profile) {
        this.profile = profile.toString();
    }

    /**
     * H.265 Profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, MAIN_10BIT
     *
     * @param profile H.265 Profile.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265Profile
     */
    public H265Settings withProfile(H265Profile profile) {
        this.profile = profile.toString();
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
    public H265Settings withQvbrQualityLevel(Integer qvbrQualityLevel) {
        this.qvbrQualityLevel = qvbrQualityLevel;
        return this;
    }

    /**
     * Rate control mode. QVBR: Quality will match the specified quality level
     * except when it is constrained by the maximum bitrate. Recommended if you
     * or your viewers pay for bandwidth. CBR: Quality varies, depending on the
     * video complexity. Recommended only if you distribute your assets to
     * devices that cannot handle variable bitrates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR
     *
     * @return Rate control mode. QVBR: Quality will match the specified quality
     *         level except when it is constrained by the maximum bitrate.
     *         Recommended if you or your viewers pay for bandwidth. CBR:
     *         Quality varies, depending on the video complexity. Recommended
     *         only if you distribute your assets to devices that cannot handle
     *         variable bitrates.
     * @see H265RateControlMode
     */
    public String getRateControlMode() {
        return rateControlMode;
    }

    /**
     * Rate control mode. QVBR: Quality will match the specified quality level
     * except when it is constrained by the maximum bitrate. Recommended if you
     * or your viewers pay for bandwidth. CBR: Quality varies, depending on the
     * video complexity. Recommended only if you distribute your assets to
     * devices that cannot handle variable bitrates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR
     *
     * @param rateControlMode Rate control mode. QVBR: Quality will match the
     *            specified quality level except when it is constrained by the
     *            maximum bitrate. Recommended if you or your viewers pay for
     *            bandwidth. CBR: Quality varies, depending on the video
     *            complexity. Recommended only if you distribute your assets to
     *            devices that cannot handle variable bitrates.
     * @see H265RateControlMode
     */
    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Rate control mode. QVBR: Quality will match the specified quality level
     * except when it is constrained by the maximum bitrate. Recommended if you
     * or your viewers pay for bandwidth. CBR: Quality varies, depending on the
     * video complexity. Recommended only if you distribute your assets to
     * devices that cannot handle variable bitrates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR
     *
     * @param rateControlMode Rate control mode. QVBR: Quality will match the
     *            specified quality level except when it is constrained by the
     *            maximum bitrate. Recommended if you or your viewers pay for
     *            bandwidth. CBR: Quality varies, depending on the video
     *            complexity. Recommended only if you distribute your assets to
     *            devices that cannot handle variable bitrates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265RateControlMode
     */
    public H265Settings withRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
        return this;
    }

    /**
     * Rate control mode. QVBR: Quality will match the specified quality level
     * except when it is constrained by the maximum bitrate. Recommended if you
     * or your viewers pay for bandwidth. CBR: Quality varies, depending on the
     * video complexity. Recommended only if you distribute your assets to
     * devices that cannot handle variable bitrates.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR
     *
     * @param rateControlMode Rate control mode. QVBR: Quality will match the
     *            specified quality level except when it is constrained by the
     *            maximum bitrate. Recommended if you or your viewers pay for
     *            bandwidth. CBR: Quality varies, depending on the video
     *            complexity. Recommended only if you distribute your assets to
     *            devices that cannot handle variable bitrates.
     * @see H265RateControlMode
     */
    public void setRateControlMode(H265RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
    }

    /**
     * Rate control mode. QVBR: Quality will match the specified quality level
     * except when it is constrained by the maximum bitrate. Recommended if you
     * or your viewers pay for bandwidth. CBR: Quality varies, depending on the
     * video complexity. Recommended only if you distribute your assets to
     * devices that cannot handle variable bitrates.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CBR, MULTIPLEX, QVBR
     *
     * @param rateControlMode Rate control mode. QVBR: Quality will match the
     *            specified quality level except when it is constrained by the
     *            maximum bitrate. Recommended if you or your viewers pay for
     *            bandwidth. CBR: Quality varies, depending on the video
     *            complexity. Recommended only if you distribute your assets to
     *            devices that cannot handle variable bitrates.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265RateControlMode
     */
    public H265Settings withRateControlMode(H265RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first
     * interlaced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE
     *
     * @return Sets the scan type of the output to progressive or
     *         top-field-first interlaced.
     * @see H265ScanType
     */
    public String getScanType() {
        return scanType;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first
     * interlaced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE
     *
     * @param scanType Sets the scan type of the output to progressive or
     *            top-field-first interlaced.
     * @see H265ScanType
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
     * <b>Allowed Values: </b>PROGRESSIVE
     *
     * @param scanType Sets the scan type of the output to progressive or
     *            top-field-first interlaced.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265ScanType
     */
    public H265Settings withScanType(String scanType) {
        this.scanType = scanType;
        return this;
    }

    /**
     * Sets the scan type of the output to progressive or top-field-first
     * interlaced.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE
     *
     * @param scanType Sets the scan type of the output to progressive or
     *            top-field-first interlaced.
     * @see H265ScanType
     */
    public void setScanType(H265ScanType scanType) {
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
     * <b>Allowed Values: </b>PROGRESSIVE
     *
     * @param scanType Sets the scan type of the output to progressive or
     *            top-field-first interlaced.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265ScanType
     */
    public H265Settings withScanType(H265ScanType scanType) {
        this.scanType = scanType.toString();
        return this;
    }

    /**
     * Scene change detection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Scene change detection.
     * @see H265SceneChangeDetect
     */
    public String getSceneChangeDetect() {
        return sceneChangeDetect;
    }

    /**
     * Scene change detection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Scene change detection.
     * @see H265SceneChangeDetect
     */
    public void setSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
    }

    /**
     * Scene change detection.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Scene change detection.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265SceneChangeDetect
     */
    public H265Settings withSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
        return this;
    }

    /**
     * Scene change detection.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Scene change detection.
     * @see H265SceneChangeDetect
     */
    public void setSceneChangeDetect(H265SceneChangeDetect sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect.toString();
    }

    /**
     * Scene change detection.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Scene change detection.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265SceneChangeDetect
     */
    public H265Settings withSceneChangeDetect(H265SceneChangeDetect sceneChangeDetect) {
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
     * <b>Range: </b>1 - 16<br/>
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
     * <b>Range: </b>1 - 16<br/>
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
     * <b>Range: </b>1 - 16<br/>
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
    public H265Settings withSlices(Integer slices) {
        this.slices = slices;
        return this;
    }

    /**
     * H.265 Tier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, MAIN
     *
     * @return H.265 Tier.
     * @see H265Tier
     */
    public String getTier() {
        return tier;
    }

    /**
     * H.265 Tier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, MAIN
     *
     * @param tier H.265 Tier.
     * @see H265Tier
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * H.265 Tier.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, MAIN
     *
     * @param tier H.265 Tier.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265Tier
     */
    public H265Settings withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * H.265 Tier.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, MAIN
     *
     * @param tier H.265 Tier.
     * @see H265Tier
     */
    public void setTier(H265Tier tier) {
        this.tier = tier.toString();
    }

    /**
     * H.265 Tier.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>HIGH, MAIN
     *
     * @param tier H.265 Tier.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H265Tier
     */
    public H265Settings withTier(H265Tier tier) {
        this.tier = tier.toString();
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
     * @see H265TimecodeInsertionBehavior
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
     * @see H265TimecodeInsertionBehavior
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
     * @see H265TimecodeInsertionBehavior
     */
    public H265Settings withTimecodeInsertion(String timecodeInsertion) {
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
     * @see H265TimecodeInsertionBehavior
     */
    public void setTimecodeInsertion(H265TimecodeInsertionBehavior timecodeInsertion) {
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
     * @see H265TimecodeInsertionBehavior
     */
    public H265Settings withTimecodeInsertion(H265TimecodeInsertionBehavior timecodeInsertion) {
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
        if (getAlternativeTransferFunction() != null)
            sb.append("AlternativeTransferFunction: " + getAlternativeTransferFunction() + ",");
        if (getBitrate() != null)
            sb.append("Bitrate: " + getBitrate() + ",");
        if (getBufSize() != null)
            sb.append("BufSize: " + getBufSize() + ",");
        if (getColorMetadata() != null)
            sb.append("ColorMetadata: " + getColorMetadata() + ",");
        if (getColorSpaceSettings() != null)
            sb.append("ColorSpaceSettings: " + getColorSpaceSettings() + ",");
        if (getFixedAfd() != null)
            sb.append("FixedAfd: " + getFixedAfd() + ",");
        if (getFlickerAq() != null)
            sb.append("FlickerAq: " + getFlickerAq() + ",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: " + getFramerateDenominator() + ",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: " + getFramerateNumerator() + ",");
        if (getGopClosedCadence() != null)
            sb.append("GopClosedCadence: " + getGopClosedCadence() + ",");
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
        if (getParDenominator() != null)
            sb.append("ParDenominator: " + getParDenominator() + ",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: " + getParNumerator() + ",");
        if (getProfile() != null)
            sb.append("Profile: " + getProfile() + ",");
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
        if (getTier() != null)
            sb.append("Tier: " + getTier() + ",");
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
        hashCode = prime
                * hashCode
                + ((getAlternativeTransferFunction() == null) ? 0
                        : getAlternativeTransferFunction().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getBufSize() == null) ? 0 : getBufSize().hashCode());
        hashCode = prime * hashCode
                + ((getColorMetadata() == null) ? 0 : getColorMetadata().hashCode());
        hashCode = prime * hashCode
                + ((getColorSpaceSettings() == null) ? 0 : getColorSpaceSettings().hashCode());
        hashCode = prime * hashCode + ((getFixedAfd() == null) ? 0 : getFixedAfd().hashCode());
        hashCode = prime * hashCode + ((getFlickerAq() == null) ? 0 : getFlickerAq().hashCode());
        hashCode = prime * hashCode
                + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode
                + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode
                + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
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
                + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode
                + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        hashCode = prime * hashCode
                + ((getQvbrQualityLevel() == null) ? 0 : getQvbrQualityLevel().hashCode());
        hashCode = prime * hashCode
                + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getScanType() == null) ? 0 : getScanType().hashCode());
        hashCode = prime * hashCode
                + ((getSceneChangeDetect() == null) ? 0 : getSceneChangeDetect().hashCode());
        hashCode = prime * hashCode + ((getSlices() == null) ? 0 : getSlices().hashCode());
        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
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

        if (obj instanceof H265Settings == false)
            return false;
        H265Settings other = (H265Settings) obj;

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
        if (other.getAlternativeTransferFunction() == null
                ^ this.getAlternativeTransferFunction() == null)
            return false;
        if (other.getAlternativeTransferFunction() != null
                && other.getAlternativeTransferFunction().equals(
                        this.getAlternativeTransferFunction()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
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
        if (other.getFixedAfd() == null ^ this.getFixedAfd() == null)
            return false;
        if (other.getFixedAfd() != null && other.getFixedAfd().equals(this.getFixedAfd()) == false)
            return false;
        if (other.getFlickerAq() == null ^ this.getFlickerAq() == null)
            return false;
        if (other.getFlickerAq() != null
                && other.getFlickerAq().equals(this.getFlickerAq()) == false)
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
        if (other.getGopClosedCadence() == null ^ this.getGopClosedCadence() == null)
            return false;
        if (other.getGopClosedCadence() != null
                && other.getGopClosedCadence().equals(this.getGopClosedCadence()) == false)
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
        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        if (other.getTimecodeInsertion() == null ^ this.getTimecodeInsertion() == null)
            return false;
        if (other.getTimecodeInsertion() != null
                && other.getTimecodeInsertion().equals(this.getTimecodeInsertion()) == false)
            return false;
        return true;
    }
}
