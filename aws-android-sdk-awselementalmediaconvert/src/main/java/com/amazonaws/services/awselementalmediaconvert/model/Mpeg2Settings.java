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
 * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the
 * value MPEG2.
 */
public class Mpeg2Settings implements Serializable {
    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH
     */
    private String adaptiveQuantization;

    /**
     * Specify the average bitrate in bits per second. Required for VBR and CBR.
     * For MS Smooth outputs, bitrates must be unique when rounded down to the
     * nearest multiple of 1000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 288000000<br/>
     */
    private Integer bitrate;

    /**
     * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LOW, MAIN, HIGH1440, HIGH
     */
    private String codecLevel;

    /**
     * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, PROFILE_422
     */
    private String codecProfile;

    /**
     * Choose Adaptive to improve subjective video quality for high-motion
     * content. This will cause the service to use fewer B-frames (which infer
     * information based on other frames) for high-motion portions of the video
     * and more B-frames for low-motion portions. The maximum number of B-frames
     * is limited by the value you provide for the setting B frames between
     * reference frames (numberBFramesBetweenReferenceFrames).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADAPTIVE, STATIC
     */
    private String dynamicSubGop;

    /**
     * If you are using the console, use the Framerate setting to specify the
     * frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate
     * conversion, choose a frame rate from the dropdown list or choose Custom.
     * The framerates shown in the dropdown list are decimal approximations of
     * fractions. If you choose Custom, specify your frame rate as a fraction.
     * If you are creating your transcoding job sepecification as a JSON file
     * without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose
     * INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from
     * the input. Choose SPECIFIED if you want the service to use the frame rate
     * you specify in the settings FramerateNumerator and FramerateDenominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     */
    private String framerateControl;

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate
     * conversion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     */
    private String framerateConversionAlgorithm;

    /**
     * Frame rate denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1001<br/>
     */
    private Integer framerateDenominator;

    /**
     * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 =
     * 23.976 fps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 60000<br/>
     */
    private Integer framerateNumerator;

    /**
     * Frequency of closed GOPs. In streaming applications, it is recommended
     * that this be set to 1 so a decoder joining mid-stream will receive an IDR
     * frame as quickly as possible. Setting this value to 0 will break output
     * segmenting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer gopClosedCadence;

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than
     * zero.
     */
    private Double gopSize;

    /**
     * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If
     * seconds the system will convert the GOP Size into a frame count at run
     * time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     */
    private String gopSizeUnits;

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer
     * model).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer hrdBufferInitialFillPercentage;

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five
     * megabits as 5000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 47185920<br/>
     */
    private Integer hrdBufferSize;

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the
     * output. * Top Field First (TOP_FIELD) and Bottom Field First
     * (BOTTOM_FIELD) produce interlaced output with the entire output having
     * the same field polarity (top or bottom first). * Follow, Default Top
     * (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use
     * the same field polarity as the source. Therefore, behavior depends on the
     * input scan type. - If the source is interlaced, the output will be
     * interlaced with the same polarity as the source (it will follow the
     * source). The output could therefore be a mix of "top field first" and
     * "bottom field first". - If the source is progressive, the output will be
     * interlaced with "top field first" or "bottom field first" polarity,
     * depending on which of the Follow options you chose.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD,
     * FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD
     */
    private String interlaceMode;

    /**
     * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization
     * precision for intra-block DC coefficients. If you choose the value auto,
     * the service will automatically select the precision based on the
     * per-frame compression ratio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9,
     * INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11
     */
    private String intraDcPrecision;

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per
     * second as 5000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 300000000<br/>
     */
    private Integer maxBitrate;

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames
     * inserted by Scene Change Detection. If a scene change I-frame is within
     * I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     * stretched to the scene change I-frame. GOP stretch requires enabling
     * lookahead as well as setting I-interval. The normal cadence resumes for
     * the next GOP. This setting is only used when Scene Change Detect is
     * enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30<br/>
     */
    private Integer minIInterval;

    /**
     * Number of B-frames between reference frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     */
    private Integer numberBFramesBetweenReferenceFrames;

    /**
     * Using the API, enable ParFollowSource if you want the service to use the
     * pixel aspect ratio from the input. Using the console, do this by choosing
     * Follow source for Pixel aspect ratio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     */
    private String parControl;

    /**
     * Pixel Aspect Ratio denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer parDenominator;

    /**
     * Pixel Aspect Ratio numerator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer parNumerator;

    /**
     * Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy whether to
     * use single-pass or multipass video encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, MULTI_PASS
     */
    private String qualityTuningLevel;

    /**
     * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the
     * bitrate is variable (vbr) or constant (cbr).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     */
    private String rateControlMode;

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String sceneChangeDetect;

    /**
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled
     * as 25fps, and audio is sped up correspondingly.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String slowPal;

    /**
     * Softness. Selects quantizer matrix, larger values reduce high-frequency
     * content in the encoded image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 128<br/>
     */
    private Integer softness;

    /**
     * Adjust quantization within each frame based on spatial variation of
     * content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String spatialAdaptiveQuantization;

    /**
     * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, D_10
     */
    private String syntax;

    /**
     * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SOFT, HARD
     */
    private String telecine;

    /**
     * Adjust quantization within each frame based on temporal variation of
     * content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String temporalAdaptiveQuantization;

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH
     *
     * @return Adaptive quantization. Allows intra-frame quantizers to vary to
     *         improve visual quality.
     * @see Mpeg2AdaptiveQuantization
     */
    public String getAdaptiveQuantization() {
        return adaptiveQuantization;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH
     *
     * @param adaptiveQuantization Adaptive quantization. Allows intra-frame
     *            quantizers to vary to improve visual quality.
     * @see Mpeg2AdaptiveQuantization
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
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH
     *
     * @param adaptiveQuantization Adaptive quantization. Allows intra-frame
     *            quantizers to vary to improve visual quality.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2AdaptiveQuantization
     */
    public Mpeg2Settings withAdaptiveQuantization(String adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization;
        return this;
    }

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH
     *
     * @param adaptiveQuantization Adaptive quantization. Allows intra-frame
     *            quantizers to vary to improve visual quality.
     * @see Mpeg2AdaptiveQuantization
     */
    public void setAdaptiveQuantization(Mpeg2AdaptiveQuantization adaptiveQuantization) {
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
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH
     *
     * @param adaptiveQuantization Adaptive quantization. Allows intra-frame
     *            quantizers to vary to improve visual quality.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2AdaptiveQuantization
     */
    public Mpeg2Settings withAdaptiveQuantization(Mpeg2AdaptiveQuantization adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization.toString();
        return this;
    }

    /**
     * Specify the average bitrate in bits per second. Required for VBR and CBR.
     * For MS Smooth outputs, bitrates must be unique when rounded down to the
     * nearest multiple of 1000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 288000000<br/>
     *
     * @return Specify the average bitrate in bits per second. Required for VBR
     *         and CBR. For MS Smooth outputs, bitrates must be unique when
     *         rounded down to the nearest multiple of 1000.
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. Required for VBR and CBR.
     * For MS Smooth outputs, bitrates must be unique when rounded down to the
     * nearest multiple of 1000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 288000000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second. Required
     *            for VBR and CBR. For MS Smooth outputs, bitrates must be
     *            unique when rounded down to the nearest multiple of 1000.
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Specify the average bitrate in bits per second. Required for VBR and CBR.
     * For MS Smooth outputs, bitrates must be unique when rounded down to the
     * nearest multiple of 1000.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 288000000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second. Required
     *            for VBR and CBR. For MS Smooth outputs, bitrates must be
     *            unique when rounded down to the nearest multiple of 1000.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LOW, MAIN, HIGH1440, HIGH
     *
     * @return Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video
     *         output.
     * @see Mpeg2CodecLevel
     */
    public String getCodecLevel() {
        return codecLevel;
    }

    /**
     * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LOW, MAIN, HIGH1440, HIGH
     *
     * @param codecLevel Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for
     *            the video output.
     * @see Mpeg2CodecLevel
     */
    public void setCodecLevel(String codecLevel) {
        this.codecLevel = codecLevel;
    }

    /**
     * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LOW, MAIN, HIGH1440, HIGH
     *
     * @param codecLevel Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for
     *            the video output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2CodecLevel
     */
    public Mpeg2Settings withCodecLevel(String codecLevel) {
        this.codecLevel = codecLevel;
        return this;
    }

    /**
     * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LOW, MAIN, HIGH1440, HIGH
     *
     * @param codecLevel Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for
     *            the video output.
     * @see Mpeg2CodecLevel
     */
    public void setCodecLevel(Mpeg2CodecLevel codecLevel) {
        this.codecLevel = codecLevel.toString();
    }

    /**
     * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LOW, MAIN, HIGH1440, HIGH
     *
     * @param codecLevel Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for
     *            the video output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2CodecLevel
     */
    public Mpeg2Settings withCodecLevel(Mpeg2CodecLevel codecLevel) {
        this.codecLevel = codecLevel.toString();
        return this;
    }

    /**
     * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, PROFILE_422
     *
     * @return Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the
     *         video output.
     * @see Mpeg2CodecProfile
     */
    public String getCodecProfile() {
        return codecProfile;
    }

    /**
     * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, PROFILE_422
     *
     * @param codecProfile Use Profile (Mpeg2CodecProfile) to set the MPEG-2
     *            profile for the video output.
     * @see Mpeg2CodecProfile
     */
    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, PROFILE_422
     *
     * @param codecProfile Use Profile (Mpeg2CodecProfile) to set the MPEG-2
     *            profile for the video output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2CodecProfile
     */
    public Mpeg2Settings withCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
        return this;
    }

    /**
     * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video
     * output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, PROFILE_422
     *
     * @param codecProfile Use Profile (Mpeg2CodecProfile) to set the MPEG-2
     *            profile for the video output.
     * @see Mpeg2CodecProfile
     */
    public void setCodecProfile(Mpeg2CodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
    }

    /**
     * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video
     * output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MAIN, PROFILE_422
     *
     * @param codecProfile Use Profile (Mpeg2CodecProfile) to set the MPEG-2
     *            profile for the video output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2CodecProfile
     */
    public Mpeg2Settings withCodecProfile(Mpeg2CodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
        return this;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion
     * content. This will cause the service to use fewer B-frames (which infer
     * information based on other frames) for high-motion portions of the video
     * and more B-frames for low-motion portions. The maximum number of B-frames
     * is limited by the value you provide for the setting B frames between
     * reference frames (numberBFramesBetweenReferenceFrames).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADAPTIVE, STATIC
     *
     * @return Choose Adaptive to improve subjective video quality for
     *         high-motion content. This will cause the service to use fewer
     *         B-frames (which infer information based on other frames) for
     *         high-motion portions of the video and more B-frames for
     *         low-motion portions. The maximum number of B-frames is limited by
     *         the value you provide for the setting B frames between reference
     *         frames (numberBFramesBetweenReferenceFrames).
     * @see Mpeg2DynamicSubGop
     */
    public String getDynamicSubGop() {
        return dynamicSubGop;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion
     * content. This will cause the service to use fewer B-frames (which infer
     * information based on other frames) for high-motion portions of the video
     * and more B-frames for low-motion portions. The maximum number of B-frames
     * is limited by the value you provide for the setting B frames between
     * reference frames (numberBFramesBetweenReferenceFrames).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADAPTIVE, STATIC
     *
     * @param dynamicSubGop Choose Adaptive to improve subjective video quality
     *            for high-motion content. This will cause the service to use
     *            fewer B-frames (which infer information based on other frames)
     *            for high-motion portions of the video and more B-frames for
     *            low-motion portions. The maximum number of B-frames is limited
     *            by the value you provide for the setting B frames between
     *            reference frames (numberBFramesBetweenReferenceFrames).
     * @see Mpeg2DynamicSubGop
     */
    public void setDynamicSubGop(String dynamicSubGop) {
        this.dynamicSubGop = dynamicSubGop;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion
     * content. This will cause the service to use fewer B-frames (which infer
     * information based on other frames) for high-motion portions of the video
     * and more B-frames for low-motion portions. The maximum number of B-frames
     * is limited by the value you provide for the setting B frames between
     * reference frames (numberBFramesBetweenReferenceFrames).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADAPTIVE, STATIC
     *
     * @param dynamicSubGop Choose Adaptive to improve subjective video quality
     *            for high-motion content. This will cause the service to use
     *            fewer B-frames (which infer information based on other frames)
     *            for high-motion portions of the video and more B-frames for
     *            low-motion portions. The maximum number of B-frames is limited
     *            by the value you provide for the setting B frames between
     *            reference frames (numberBFramesBetweenReferenceFrames).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2DynamicSubGop
     */
    public Mpeg2Settings withDynamicSubGop(String dynamicSubGop) {
        this.dynamicSubGop = dynamicSubGop;
        return this;
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion
     * content. This will cause the service to use fewer B-frames (which infer
     * information based on other frames) for high-motion portions of the video
     * and more B-frames for low-motion portions. The maximum number of B-frames
     * is limited by the value you provide for the setting B frames between
     * reference frames (numberBFramesBetweenReferenceFrames).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADAPTIVE, STATIC
     *
     * @param dynamicSubGop Choose Adaptive to improve subjective video quality
     *            for high-motion content. This will cause the service to use
     *            fewer B-frames (which infer information based on other frames)
     *            for high-motion portions of the video and more B-frames for
     *            low-motion portions. The maximum number of B-frames is limited
     *            by the value you provide for the setting B frames between
     *            reference frames (numberBFramesBetweenReferenceFrames).
     * @see Mpeg2DynamicSubGop
     */
    public void setDynamicSubGop(Mpeg2DynamicSubGop dynamicSubGop) {
        this.dynamicSubGop = dynamicSubGop.toString();
    }

    /**
     * Choose Adaptive to improve subjective video quality for high-motion
     * content. This will cause the service to use fewer B-frames (which infer
     * information based on other frames) for high-motion portions of the video
     * and more B-frames for low-motion portions. The maximum number of B-frames
     * is limited by the value you provide for the setting B frames between
     * reference frames (numberBFramesBetweenReferenceFrames).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADAPTIVE, STATIC
     *
     * @param dynamicSubGop Choose Adaptive to improve subjective video quality
     *            for high-motion content. This will cause the service to use
     *            fewer B-frames (which infer information based on other frames)
     *            for high-motion portions of the video and more B-frames for
     *            low-motion portions. The maximum number of B-frames is limited
     *            by the value you provide for the setting B frames between
     *            reference frames (numberBFramesBetweenReferenceFrames).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2DynamicSubGop
     */
    public Mpeg2Settings withDynamicSubGop(Mpeg2DynamicSubGop dynamicSubGop) {
        this.dynamicSubGop = dynamicSubGop.toString();
        return this;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the
     * frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate
     * conversion, choose a frame rate from the dropdown list or choose Custom.
     * The framerates shown in the dropdown list are decimal approximations of
     * fractions. If you choose Custom, specify your frame rate as a fraction.
     * If you are creating your transcoding job sepecification as a JSON file
     * without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose
     * INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from
     * the input. Choose SPECIFIED if you want the service to use the frame rate
     * you specify in the settings FramerateNumerator and FramerateDenominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @return If you are using the console, use the Framerate setting to
     *         specify the frame rate for this output. If you want to keep the
     *         same frame rate as the input video, choose Follow source. If you
     *         want to do frame rate conversion, choose a frame rate from the
     *         dropdown list or choose Custom. The framerates shown in the
     *         dropdown list are decimal approximations of fractions. If you
     *         choose Custom, specify your frame rate as a fraction. If you are
     *         creating your transcoding job sepecification as a JSON file
     *         without the console, use FramerateControl to specify which value
     *         the service uses for the frame rate for this output. Choose
     *         INITIALIZE_FROM_SOURCE if you want the service to use the frame
     *         rate from the input. Choose SPECIFIED if you want the service to
     *         use the frame rate you specify in the settings FramerateNumerator
     *         and FramerateDenominator.
     * @see Mpeg2FramerateControl
     */
    public String getFramerateControl() {
        return framerateControl;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the
     * frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate
     * conversion, choose a frame rate from the dropdown list or choose Custom.
     * The framerates shown in the dropdown list are decimal approximations of
     * fractions. If you choose Custom, specify your frame rate as a fraction.
     * If you are creating your transcoding job sepecification as a JSON file
     * without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose
     * INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from
     * the input. Choose SPECIFIED if you want the service to use the frame rate
     * you specify in the settings FramerateNumerator and FramerateDenominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param framerateControl If you are using the console, use the Framerate
     *            setting to specify the frame rate for this output. If you want
     *            to keep the same frame rate as the input video, choose Follow
     *            source. If you want to do frame rate conversion, choose a
     *            frame rate from the dropdown list or choose Custom. The
     *            framerates shown in the dropdown list are decimal
     *            approximations of fractions. If you choose Custom, specify
     *            your frame rate as a fraction. If you are creating your
     *            transcoding job sepecification as a JSON file without the
     *            console, use FramerateControl to specify which value the
     *            service uses for the frame rate for this output. Choose
     *            INITIALIZE_FROM_SOURCE if you want the service to use the
     *            frame rate from the input. Choose SPECIFIED if you want the
     *            service to use the frame rate you specify in the settings
     *            FramerateNumerator and FramerateDenominator.
     * @see Mpeg2FramerateControl
     */
    public void setFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the
     * frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate
     * conversion, choose a frame rate from the dropdown list or choose Custom.
     * The framerates shown in the dropdown list are decimal approximations of
     * fractions. If you choose Custom, specify your frame rate as a fraction.
     * If you are creating your transcoding job sepecification as a JSON file
     * without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose
     * INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from
     * the input. Choose SPECIFIED if you want the service to use the frame rate
     * you specify in the settings FramerateNumerator and FramerateDenominator.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param framerateControl If you are using the console, use the Framerate
     *            setting to specify the frame rate for this output. If you want
     *            to keep the same frame rate as the input video, choose Follow
     *            source. If you want to do frame rate conversion, choose a
     *            frame rate from the dropdown list or choose Custom. The
     *            framerates shown in the dropdown list are decimal
     *            approximations of fractions. If you choose Custom, specify
     *            your frame rate as a fraction. If you are creating your
     *            transcoding job sepecification as a JSON file without the
     *            console, use FramerateControl to specify which value the
     *            service uses for the frame rate for this output. Choose
     *            INITIALIZE_FROM_SOURCE if you want the service to use the
     *            frame rate from the input. Choose SPECIFIED if you want the
     *            service to use the frame rate you specify in the settings
     *            FramerateNumerator and FramerateDenominator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2FramerateControl
     */
    public Mpeg2Settings withFramerateControl(String framerateControl) {
        this.framerateControl = framerateControl;
        return this;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the
     * frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate
     * conversion, choose a frame rate from the dropdown list or choose Custom.
     * The framerates shown in the dropdown list are decimal approximations of
     * fractions. If you choose Custom, specify your frame rate as a fraction.
     * If you are creating your transcoding job sepecification as a JSON file
     * without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose
     * INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from
     * the input. Choose SPECIFIED if you want the service to use the frame rate
     * you specify in the settings FramerateNumerator and FramerateDenominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param framerateControl If you are using the console, use the Framerate
     *            setting to specify the frame rate for this output. If you want
     *            to keep the same frame rate as the input video, choose Follow
     *            source. If you want to do frame rate conversion, choose a
     *            frame rate from the dropdown list or choose Custom. The
     *            framerates shown in the dropdown list are decimal
     *            approximations of fractions. If you choose Custom, specify
     *            your frame rate as a fraction. If you are creating your
     *            transcoding job sepecification as a JSON file without the
     *            console, use FramerateControl to specify which value the
     *            service uses for the frame rate for this output. Choose
     *            INITIALIZE_FROM_SOURCE if you want the service to use the
     *            frame rate from the input. Choose SPECIFIED if you want the
     *            service to use the frame rate you specify in the settings
     *            FramerateNumerator and FramerateDenominator.
     * @see Mpeg2FramerateControl
     */
    public void setFramerateControl(Mpeg2FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
    }

    /**
     * If you are using the console, use the Framerate setting to specify the
     * frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate
     * conversion, choose a frame rate from the dropdown list or choose Custom.
     * The framerates shown in the dropdown list are decimal approximations of
     * fractions. If you choose Custom, specify your frame rate as a fraction.
     * If you are creating your transcoding job sepecification as a JSON file
     * without the console, use FramerateControl to specify which value the
     * service uses for the frame rate for this output. Choose
     * INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from
     * the input. Choose SPECIFIED if you want the service to use the frame rate
     * you specify in the settings FramerateNumerator and FramerateDenominator.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param framerateControl If you are using the console, use the Framerate
     *            setting to specify the frame rate for this output. If you want
     *            to keep the same frame rate as the input video, choose Follow
     *            source. If you want to do frame rate conversion, choose a
     *            frame rate from the dropdown list or choose Custom. The
     *            framerates shown in the dropdown list are decimal
     *            approximations of fractions. If you choose Custom, specify
     *            your frame rate as a fraction. If you are creating your
     *            transcoding job sepecification as a JSON file without the
     *            console, use FramerateControl to specify which value the
     *            service uses for the frame rate for this output. Choose
     *            INITIALIZE_FROM_SOURCE if you want the service to use the
     *            frame rate from the input. Choose SPECIFIED if you want the
     *            service to use the frame rate you specify in the settings
     *            FramerateNumerator and FramerateDenominator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2FramerateControl
     */
    public Mpeg2Settings withFramerateControl(Mpeg2FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
        return this;
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate
     * conversion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @return When set to INTERPOLATE, produces smoother motion during frame
     *         rate conversion.
     * @see Mpeg2FramerateConversionAlgorithm
     */
    public String getFramerateConversionAlgorithm() {
        return framerateConversionAlgorithm;
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate
     * conversion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm When set to INTERPOLATE, produces
     *            smoother motion during frame rate conversion.
     * @see Mpeg2FramerateConversionAlgorithm
     */
    public void setFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate
     * conversion.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm When set to INTERPOLATE, produces
     *            smoother motion during frame rate conversion.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2FramerateConversionAlgorithm
     */
    public Mpeg2Settings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
        return this;
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate
     * conversion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm When set to INTERPOLATE, produces
     *            smoother motion during frame rate conversion.
     * @see Mpeg2FramerateConversionAlgorithm
     */
    public void setFramerateConversionAlgorithm(
            Mpeg2FramerateConversionAlgorithm framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm.toString();
    }

    /**
     * When set to INTERPOLATE, produces smoother motion during frame rate
     * conversion.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm When set to INTERPOLATE, produces
     *            smoother motion during frame rate conversion.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2FramerateConversionAlgorithm
     */
    public Mpeg2Settings withFramerateConversionAlgorithm(
            Mpeg2FramerateConversionAlgorithm framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm.toString();
        return this;
    }

    /**
     * Frame rate denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1001<br/>
     *
     * @return Frame rate denominator.
     */
    public Integer getFramerateDenominator() {
        return framerateDenominator;
    }

    /**
     * Frame rate denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1001<br/>
     *
     * @param framerateDenominator Frame rate denominator.
     */
    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * Frame rate denominator.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1001<br/>
     *
     * @param framerateDenominator Frame rate denominator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
        return this;
    }

    /**
     * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 =
     * 23.976 fps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 60000<br/>
     *
     * @return Frame rate numerator - frame rate is a fraction, e.g. 24000 /
     *         1001 = 23.976 fps.
     */
    public Integer getFramerateNumerator() {
        return framerateNumerator;
    }

    /**
     * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 =
     * 23.976 fps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 60000<br/>
     *
     * @param framerateNumerator Frame rate numerator - frame rate is a
     *            fraction, e.g. 24000 / 1001 = 23.976 fps.
     */
    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 =
     * 23.976 fps.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>24 - 60000<br/>
     *
     * @param framerateNumerator Frame rate numerator - frame rate is a
     *            fraction, e.g. 24000 / 1001 = 23.976 fps.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withFramerateNumerator(Integer framerateNumerator) {
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
     * <b>Range: </b>0 - 2147483647<br/>
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
     * <b>Range: </b>0 - 2147483647<br/>
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
     * <b>Range: </b>0 - 2147483647<br/>
     *
     * @param gopClosedCadence Frequency of closed GOPs. In streaming
     *            applications, it is recommended that this be set to 1 so a
     *            decoder joining mid-stream will receive an IDR frame as
     *            quickly as possible. Setting this value to 0 will break output
     *            segmenting.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withGopClosedCadence(Integer gopClosedCadence) {
        this.gopClosedCadence = gopClosedCadence;
        return this;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than
     * zero.
     *
     * @return GOP Length (keyframe interval) in frames or seconds. Must be
     *         greater than zero.
     */
    public Double getGopSize() {
        return gopSize;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than
     * zero.
     *
     * @param gopSize GOP Length (keyframe interval) in frames or seconds. Must
     *            be greater than zero.
     */
    public void setGopSize(Double gopSize) {
        this.gopSize = gopSize;
    }

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than
     * zero.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gopSize GOP Length (keyframe interval) in frames or seconds. Must
     *            be greater than zero.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withGopSize(Double gopSize) {
        this.gopSize = gopSize;
        return this;
    }

    /**
     * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If
     * seconds the system will convert the GOP Size into a frame count at run
     * time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @return Indicates if the GOP Size in MPEG2 is specified in frames or
     *         seconds. If seconds the system will convert the GOP Size into a
     *         frame count at run time.
     * @see Mpeg2GopSizeUnits
     */
    public String getGopSizeUnits() {
        return gopSizeUnits;
    }

    /**
     * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If
     * seconds the system will convert the GOP Size into a frame count at run
     * time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the GOP Size in MPEG2 is specified in
     *            frames or seconds. If seconds the system will convert the GOP
     *            Size into a frame count at run time.
     * @see Mpeg2GopSizeUnits
     */
    public void setGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
    }

    /**
     * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If
     * seconds the system will convert the GOP Size into a frame count at run
     * time.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the GOP Size in MPEG2 is specified in
     *            frames or seconds. If seconds the system will convert the GOP
     *            Size into a frame count at run time.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2GopSizeUnits
     */
    public Mpeg2Settings withGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
        return this;
    }

    /**
     * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If
     * seconds the system will convert the GOP Size into a frame count at run
     * time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the GOP Size in MPEG2 is specified in
     *            frames or seconds. If seconds the system will convert the GOP
     *            Size into a frame count at run time.
     * @see Mpeg2GopSizeUnits
     */
    public void setGopSizeUnits(Mpeg2GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
    }

    /**
     * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If
     * seconds the system will convert the GOP Size into a frame count at run
     * time.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the GOP Size in MPEG2 is specified in
     *            frames or seconds. If seconds the system will convert the GOP
     *            Size into a frame count at run time.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2GopSizeUnits
     */
    public Mpeg2Settings withGopSizeUnits(Mpeg2GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
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
    public Integer getHrdBufferInitialFillPercentage() {
        return hrdBufferInitialFillPercentage;
    }

    /**
     * Percentage of the buffer that should initially be filled (HRD buffer
     * model).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param hrdBufferInitialFillPercentage Percentage of the buffer that
     *            should initially be filled (HRD buffer model).
     */
    public void setHrdBufferInitialFillPercentage(Integer hrdBufferInitialFillPercentage) {
        this.hrdBufferInitialFillPercentage = hrdBufferInitialFillPercentage;
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
     * @param hrdBufferInitialFillPercentage Percentage of the buffer that
     *            should initially be filled (HRD buffer model).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withHrdBufferInitialFillPercentage(Integer hrdBufferInitialFillPercentage) {
        this.hrdBufferInitialFillPercentage = hrdBufferInitialFillPercentage;
        return this;
    }

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five
     * megabits as 5000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 47185920<br/>
     *
     * @return Size of buffer (HRD buffer model) in bits. For example, enter
     *         five megabits as 5000000.
     */
    public Integer getHrdBufferSize() {
        return hrdBufferSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five
     * megabits as 5000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 47185920<br/>
     *
     * @param hrdBufferSize Size of buffer (HRD buffer model) in bits. For
     *            example, enter five megabits as 5000000.
     */
    public void setHrdBufferSize(Integer hrdBufferSize) {
        this.hrdBufferSize = hrdBufferSize;
    }

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five
     * megabits as 5000000.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 47185920<br/>
     *
     * @param hrdBufferSize Size of buffer (HRD buffer model) in bits. For
     *            example, enter five megabits as 5000000.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withHrdBufferSize(Integer hrdBufferSize) {
        this.hrdBufferSize = hrdBufferSize;
        return this;
    }

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the
     * output. * Top Field First (TOP_FIELD) and Bottom Field First
     * (BOTTOM_FIELD) produce interlaced output with the entire output having
     * the same field polarity (top or bottom first). * Follow, Default Top
     * (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use
     * the same field polarity as the source. Therefore, behavior depends on the
     * input scan type. - If the source is interlaced, the output will be
     * interlaced with the same polarity as the source (it will follow the
     * source). The output could therefore be a mix of "top field first" and
     * "bottom field first". - If the source is progressive, the output will be
     * interlaced with "top field first" or "bottom field first" polarity,
     * depending on which of the Follow options you chose.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD,
     * FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD
     *
     * @return Use Interlace mode (InterlaceMode) to choose the scan line type
     *         for the output. * Top Field First (TOP_FIELD) and Bottom Field
     *         First (BOTTOM_FIELD) produce interlaced output with the entire
     *         output having the same field polarity (top or bottom first). *
     *         Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom
     *         (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source.
     *         Therefore, behavior depends on the input scan type. - If the
     *         source is interlaced, the output will be interlaced with the same
     *         polarity as the source (it will follow the source). The output
     *         could therefore be a mix of "top field first" and
     *         "bottom field first". - If the source is progressive, the output
     *         will be interlaced with "top field first" or "bottom field first"
     *         polarity, depending on which of the Follow options you chose.
     * @see Mpeg2InterlaceMode
     */
    public String getInterlaceMode() {
        return interlaceMode;
    }

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the
     * output. * Top Field First (TOP_FIELD) and Bottom Field First
     * (BOTTOM_FIELD) produce interlaced output with the entire output having
     * the same field polarity (top or bottom first). * Follow, Default Top
     * (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use
     * the same field polarity as the source. Therefore, behavior depends on the
     * input scan type. - If the source is interlaced, the output will be
     * interlaced with the same polarity as the source (it will follow the
     * source). The output could therefore be a mix of "top field first" and
     * "bottom field first". - If the source is progressive, the output will be
     * interlaced with "top field first" or "bottom field first" polarity,
     * depending on which of the Follow options you chose.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD,
     * FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD
     *
     * @param interlaceMode Use Interlace mode (InterlaceMode) to choose the
     *            scan line type for the output. * Top Field First (TOP_FIELD)
     *            and Bottom Field First (BOTTOM_FIELD) produce interlaced
     *            output with the entire output having the same field polarity
     *            (top or bottom first). * Follow, Default Top
     *            (FOLLOW_TOP_FIELD) and Follow, Default Bottom
     *            (FOLLOW_BOTTOM_FIELD) use the same field polarity as the
     *            source. Therefore, behavior depends on the input scan type. -
     *            If the source is interlaced, the output will be interlaced
     *            with the same polarity as the source (it will follow the
     *            source). The output could therefore be a mix of
     *            "top field first" and "bottom field first". - If the source is
     *            progressive, the output will be interlaced with
     *            "top field first" or "bottom field first" polarity, depending
     *            on which of the Follow options you chose.
     * @see Mpeg2InterlaceMode
     */
    public void setInterlaceMode(String interlaceMode) {
        this.interlaceMode = interlaceMode;
    }

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the
     * output. * Top Field First (TOP_FIELD) and Bottom Field First
     * (BOTTOM_FIELD) produce interlaced output with the entire output having
     * the same field polarity (top or bottom first). * Follow, Default Top
     * (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use
     * the same field polarity as the source. Therefore, behavior depends on the
     * input scan type. - If the source is interlaced, the output will be
     * interlaced with the same polarity as the source (it will follow the
     * source). The output could therefore be a mix of "top field first" and
     * "bottom field first". - If the source is progressive, the output will be
     * interlaced with "top field first" or "bottom field first" polarity,
     * depending on which of the Follow options you chose.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD,
     * FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD
     *
     * @param interlaceMode Use Interlace mode (InterlaceMode) to choose the
     *            scan line type for the output. * Top Field First (TOP_FIELD)
     *            and Bottom Field First (BOTTOM_FIELD) produce interlaced
     *            output with the entire output having the same field polarity
     *            (top or bottom first). * Follow, Default Top
     *            (FOLLOW_TOP_FIELD) and Follow, Default Bottom
     *            (FOLLOW_BOTTOM_FIELD) use the same field polarity as the
     *            source. Therefore, behavior depends on the input scan type. -
     *            If the source is interlaced, the output will be interlaced
     *            with the same polarity as the source (it will follow the
     *            source). The output could therefore be a mix of
     *            "top field first" and "bottom field first". - If the source is
     *            progressive, the output will be interlaced with
     *            "top field first" or "bottom field first" polarity, depending
     *            on which of the Follow options you chose.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2InterlaceMode
     */
    public Mpeg2Settings withInterlaceMode(String interlaceMode) {
        this.interlaceMode = interlaceMode;
        return this;
    }

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the
     * output. * Top Field First (TOP_FIELD) and Bottom Field First
     * (BOTTOM_FIELD) produce interlaced output with the entire output having
     * the same field polarity (top or bottom first). * Follow, Default Top
     * (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use
     * the same field polarity as the source. Therefore, behavior depends on the
     * input scan type. - If the source is interlaced, the output will be
     * interlaced with the same polarity as the source (it will follow the
     * source). The output could therefore be a mix of "top field first" and
     * "bottom field first". - If the source is progressive, the output will be
     * interlaced with "top field first" or "bottom field first" polarity,
     * depending on which of the Follow options you chose.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD,
     * FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD
     *
     * @param interlaceMode Use Interlace mode (InterlaceMode) to choose the
     *            scan line type for the output. * Top Field First (TOP_FIELD)
     *            and Bottom Field First (BOTTOM_FIELD) produce interlaced
     *            output with the entire output having the same field polarity
     *            (top or bottom first). * Follow, Default Top
     *            (FOLLOW_TOP_FIELD) and Follow, Default Bottom
     *            (FOLLOW_BOTTOM_FIELD) use the same field polarity as the
     *            source. Therefore, behavior depends on the input scan type. -
     *            If the source is interlaced, the output will be interlaced
     *            with the same polarity as the source (it will follow the
     *            source). The output could therefore be a mix of
     *            "top field first" and "bottom field first". - If the source is
     *            progressive, the output will be interlaced with
     *            "top field first" or "bottom field first" polarity, depending
     *            on which of the Follow options you chose.
     * @see Mpeg2InterlaceMode
     */
    public void setInterlaceMode(Mpeg2InterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
    }

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the
     * output. * Top Field First (TOP_FIELD) and Bottom Field First
     * (BOTTOM_FIELD) produce interlaced output with the entire output having
     * the same field polarity (top or bottom first). * Follow, Default Top
     * (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use
     * the same field polarity as the source. Therefore, behavior depends on the
     * input scan type. - If the source is interlaced, the output will be
     * interlaced with the same polarity as the source (it will follow the
     * source). The output could therefore be a mix of "top field first" and
     * "bottom field first". - If the source is progressive, the output will be
     * interlaced with "top field first" or "bottom field first" polarity,
     * depending on which of the Follow options you chose.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROGRESSIVE, TOP_FIELD, BOTTOM_FIELD,
     * FOLLOW_TOP_FIELD, FOLLOW_BOTTOM_FIELD
     *
     * @param interlaceMode Use Interlace mode (InterlaceMode) to choose the
     *            scan line type for the output. * Top Field First (TOP_FIELD)
     *            and Bottom Field First (BOTTOM_FIELD) produce interlaced
     *            output with the entire output having the same field polarity
     *            (top or bottom first). * Follow, Default Top
     *            (FOLLOW_TOP_FIELD) and Follow, Default Bottom
     *            (FOLLOW_BOTTOM_FIELD) use the same field polarity as the
     *            source. Therefore, behavior depends on the input scan type. -
     *            If the source is interlaced, the output will be interlaced
     *            with the same polarity as the source (it will follow the
     *            source). The output could therefore be a mix of
     *            "top field first" and "bottom field first". - If the source is
     *            progressive, the output will be interlaced with
     *            "top field first" or "bottom field first" polarity, depending
     *            on which of the Follow options you chose.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2InterlaceMode
     */
    public Mpeg2Settings withInterlaceMode(Mpeg2InterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
        return this;
    }

    /**
     * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization
     * precision for intra-block DC coefficients. If you choose the value auto,
     * the service will automatically select the precision based on the
     * per-frame compression ratio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9,
     * INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11
     *
     * @return Use Intra DC precision (Mpeg2IntraDcPrecision) to set
     *         quantization precision for intra-block DC coefficients. If you
     *         choose the value auto, the service will automatically select the
     *         precision based on the per-frame compression ratio.
     * @see Mpeg2IntraDcPrecision
     */
    public String getIntraDcPrecision() {
        return intraDcPrecision;
    }

    /**
     * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization
     * precision for intra-block DC coefficients. If you choose the value auto,
     * the service will automatically select the precision based on the
     * per-frame compression ratio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9,
     * INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11
     *
     * @param intraDcPrecision Use Intra DC precision (Mpeg2IntraDcPrecision) to
     *            set quantization precision for intra-block DC coefficients. If
     *            you choose the value auto, the service will automatically
     *            select the precision based on the per-frame compression ratio.
     * @see Mpeg2IntraDcPrecision
     */
    public void setIntraDcPrecision(String intraDcPrecision) {
        this.intraDcPrecision = intraDcPrecision;
    }

    /**
     * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization
     * precision for intra-block DC coefficients. If you choose the value auto,
     * the service will automatically select the precision based on the
     * per-frame compression ratio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9,
     * INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11
     *
     * @param intraDcPrecision Use Intra DC precision (Mpeg2IntraDcPrecision) to
     *            set quantization precision for intra-block DC coefficients. If
     *            you choose the value auto, the service will automatically
     *            select the precision based on the per-frame compression ratio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2IntraDcPrecision
     */
    public Mpeg2Settings withIntraDcPrecision(String intraDcPrecision) {
        this.intraDcPrecision = intraDcPrecision;
        return this;
    }

    /**
     * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization
     * precision for intra-block DC coefficients. If you choose the value auto,
     * the service will automatically select the precision based on the
     * per-frame compression ratio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9,
     * INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11
     *
     * @param intraDcPrecision Use Intra DC precision (Mpeg2IntraDcPrecision) to
     *            set quantization precision for intra-block DC coefficients. If
     *            you choose the value auto, the service will automatically
     *            select the precision based on the per-frame compression ratio.
     * @see Mpeg2IntraDcPrecision
     */
    public void setIntraDcPrecision(Mpeg2IntraDcPrecision intraDcPrecision) {
        this.intraDcPrecision = intraDcPrecision.toString();
    }

    /**
     * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization
     * precision for intra-block DC coefficients. If you choose the value auto,
     * the service will automatically select the precision based on the
     * per-frame compression ratio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, INTRA_DC_PRECISION_8, INTRA_DC_PRECISION_9,
     * INTRA_DC_PRECISION_10, INTRA_DC_PRECISION_11
     *
     * @param intraDcPrecision Use Intra DC precision (Mpeg2IntraDcPrecision) to
     *            set quantization precision for intra-block DC coefficients. If
     *            you choose the value auto, the service will automatically
     *            select the precision based on the per-frame compression ratio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2IntraDcPrecision
     */
    public Mpeg2Settings withIntraDcPrecision(Mpeg2IntraDcPrecision intraDcPrecision) {
        this.intraDcPrecision = intraDcPrecision.toString();
        return this;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per
     * second as 5000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 300000000<br/>
     *
     * @return Maximum bitrate in bits/second. For example, enter five megabits
     *         per second as 5000000.
     */
    public Integer getMaxBitrate() {
        return maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per
     * second as 5000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 300000000<br/>
     *
     * @param maxBitrate Maximum bitrate in bits/second. For example, enter five
     *            megabits per second as 5000000.
     */
    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per
     * second as 5000000.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 300000000<br/>
     *
     * @param maxBitrate Maximum bitrate in bits/second. For example, enter five
     *            megabits per second as 5000000.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
        return this;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames
     * inserted by Scene Change Detection. If a scene change I-frame is within
     * I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     * stretched to the scene change I-frame. GOP stretch requires enabling
     * lookahead as well as setting I-interval. The normal cadence resumes for
     * the next GOP. This setting is only used when Scene Change Detect is
     * enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30<br/>
     *
     * @return Enforces separation between repeated (cadence) I-frames and
     *         I-frames inserted by Scene Change Detection. If a scene change
     *         I-frame is within I-interval frames of a cadence I-frame, the GOP
     *         is shrunk and/or stretched to the scene change I-frame. GOP
     *         stretch requires enabling lookahead as well as setting
     *         I-interval. The normal cadence resumes for the next GOP. This
     *         setting is only used when Scene Change Detect is enabled. Note:
     *         Maximum GOP stretch = GOP size + Min-I-interval - 1
     */
    public Integer getMinIInterval() {
        return minIInterval;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames
     * inserted by Scene Change Detection. If a scene change I-frame is within
     * I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     * stretched to the scene change I-frame. GOP stretch requires enabling
     * lookahead as well as setting I-interval. The normal cadence resumes for
     * the next GOP. This setting is only used when Scene Change Detect is
     * enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30<br/>
     *
     * @param minIInterval Enforces separation between repeated (cadence)
     *            I-frames and I-frames inserted by Scene Change Detection. If a
     *            scene change I-frame is within I-interval frames of a cadence
     *            I-frame, the GOP is shrunk and/or stretched to the scene
     *            change I-frame. GOP stretch requires enabling lookahead as
     *            well as setting I-interval. The normal cadence resumes for the
     *            next GOP. This setting is only used when Scene Change Detect
     *            is enabled. Note: Maximum GOP stretch = GOP size +
     *            Min-I-interval - 1
     */
    public void setMinIInterval(Integer minIInterval) {
        this.minIInterval = minIInterval;
    }

    /**
     * Enforces separation between repeated (cadence) I-frames and I-frames
     * inserted by Scene Change Detection. If a scene change I-frame is within
     * I-interval frames of a cadence I-frame, the GOP is shrunk and/or
     * stretched to the scene change I-frame. GOP stretch requires enabling
     * lookahead as well as setting I-interval. The normal cadence resumes for
     * the next GOP. This setting is only used when Scene Change Detect is
     * enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 30<br/>
     *
     * @param minIInterval Enforces separation between repeated (cadence)
     *            I-frames and I-frames inserted by Scene Change Detection. If a
     *            scene change I-frame is within I-interval frames of a cadence
     *            I-frame, the GOP is shrunk and/or stretched to the scene
     *            change I-frame. GOP stretch requires enabling lookahead as
     *            well as setting I-interval. The normal cadence resumes for the
     *            next GOP. This setting is only used when Scene Change Detect
     *            is enabled. Note: Maximum GOP stretch = GOP size +
     *            Min-I-interval - 1
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withMinIInterval(Integer minIInterval) {
        this.minIInterval = minIInterval;
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
    public Integer getNumberBFramesBetweenReferenceFrames() {
        return numberBFramesBetweenReferenceFrames;
    }

    /**
     * Number of B-frames between reference frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @param numberBFramesBetweenReferenceFrames Number of B-frames between
     *            reference frames.
     */
    public void setNumberBFramesBetweenReferenceFrames(Integer numberBFramesBetweenReferenceFrames) {
        this.numberBFramesBetweenReferenceFrames = numberBFramesBetweenReferenceFrames;
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
     * @param numberBFramesBetweenReferenceFrames Number of B-frames between
     *            reference frames.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withNumberBFramesBetweenReferenceFrames(
            Integer numberBFramesBetweenReferenceFrames) {
        this.numberBFramesBetweenReferenceFrames = numberBFramesBetweenReferenceFrames;
        return this;
    }

    /**
     * Using the API, enable ParFollowSource if you want the service to use the
     * pixel aspect ratio from the input. Using the console, do this by choosing
     * Follow source for Pixel aspect ratio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @return Using the API, enable ParFollowSource if you want the service to
     *         use the pixel aspect ratio from the input. Using the console, do
     *         this by choosing Follow source for Pixel aspect ratio.
     * @see Mpeg2ParControl
     */
    public String getParControl() {
        return parControl;
    }

    /**
     * Using the API, enable ParFollowSource if you want the service to use the
     * pixel aspect ratio from the input. Using the console, do this by choosing
     * Follow source for Pixel aspect ratio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Using the API, enable ParFollowSource if you want the
     *            service to use the pixel aspect ratio from the input. Using
     *            the console, do this by choosing Follow source for Pixel
     *            aspect ratio.
     * @see Mpeg2ParControl
     */
    public void setParControl(String parControl) {
        this.parControl = parControl;
    }

    /**
     * Using the API, enable ParFollowSource if you want the service to use the
     * pixel aspect ratio from the input. Using the console, do this by choosing
     * Follow source for Pixel aspect ratio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Using the API, enable ParFollowSource if you want the
     *            service to use the pixel aspect ratio from the input. Using
     *            the console, do this by choosing Follow source for Pixel
     *            aspect ratio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2ParControl
     */
    public Mpeg2Settings withParControl(String parControl) {
        this.parControl = parControl;
        return this;
    }

    /**
     * Using the API, enable ParFollowSource if you want the service to use the
     * pixel aspect ratio from the input. Using the console, do this by choosing
     * Follow source for Pixel aspect ratio.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Using the API, enable ParFollowSource if you want the
     *            service to use the pixel aspect ratio from the input. Using
     *            the console, do this by choosing Follow source for Pixel
     *            aspect ratio.
     * @see Mpeg2ParControl
     */
    public void setParControl(Mpeg2ParControl parControl) {
        this.parControl = parControl.toString();
    }

    /**
     * Using the API, enable ParFollowSource if you want the service to use the
     * pixel aspect ratio from the input. Using the console, do this by choosing
     * Follow source for Pixel aspect ratio.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Using the API, enable ParFollowSource if you want the
     *            service to use the pixel aspect ratio from the input. Using
     *            the console, do this by choosing Follow source for Pixel
     *            aspect ratio.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2ParControl
     */
    public Mpeg2Settings withParControl(Mpeg2ParControl parControl) {
        this.parControl = parControl.toString();
        return this;
    }

    /**
     * Pixel Aspect Ratio denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
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
     * <b>Range: </b>1 - 2147483647<br/>
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
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param parDenominator Pixel Aspect Ratio denominator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withParDenominator(Integer parDenominator) {
        this.parDenominator = parDenominator;
        return this;
    }

    /**
     * Pixel Aspect Ratio numerator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
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
     * <b>Range: </b>1 - 2147483647<br/>
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
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param parNumerator Pixel Aspect Ratio numerator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Mpeg2Settings withParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
        return this;
    }

    /**
     * Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy whether to
     * use single-pass or multipass video encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, MULTI_PASS
     *
     * @return Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy
     *         whether to use single-pass or multipass video encoding.
     * @see Mpeg2QualityTuningLevel
     */
    public String getQualityTuningLevel() {
        return qualityTuningLevel;
    }

    /**
     * Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy whether to
     * use single-pass or multipass video encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, MULTI_PASS
     *
     * @param qualityTuningLevel Use Quality tuning level
     *            (Mpeg2QualityTuningLevel) to specifiy whether to use
     *            single-pass or multipass video encoding.
     * @see Mpeg2QualityTuningLevel
     */
    public void setQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
    }

    /**
     * Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy whether to
     * use single-pass or multipass video encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, MULTI_PASS
     *
     * @param qualityTuningLevel Use Quality tuning level
     *            (Mpeg2QualityTuningLevel) to specifiy whether to use
     *            single-pass or multipass video encoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2QualityTuningLevel
     */
    public Mpeg2Settings withQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
        return this;
    }

    /**
     * Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy whether to
     * use single-pass or multipass video encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, MULTI_PASS
     *
     * @param qualityTuningLevel Use Quality tuning level
     *            (Mpeg2QualityTuningLevel) to specifiy whether to use
     *            single-pass or multipass video encoding.
     * @see Mpeg2QualityTuningLevel
     */
    public void setQualityTuningLevel(Mpeg2QualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
    }

    /**
     * Use Quality tuning level (Mpeg2QualityTuningLevel) to specifiy whether to
     * use single-pass or multipass video encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, MULTI_PASS
     *
     * @param qualityTuningLevel Use Quality tuning level
     *            (Mpeg2QualityTuningLevel) to specifiy whether to use
     *            single-pass or multipass video encoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2QualityTuningLevel
     */
    public Mpeg2Settings withQualityTuningLevel(Mpeg2QualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
        return this;
    }

    /**
     * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the
     * bitrate is variable (vbr) or constant (cbr).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     *
     * @return Use Rate control mode (Mpeg2RateControlMode) to specifiy whether
     *         the bitrate is variable (vbr) or constant (cbr).
     * @see Mpeg2RateControlMode
     */
    public String getRateControlMode() {
        return rateControlMode;
    }

    /**
     * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the
     * bitrate is variable (vbr) or constant (cbr).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     *
     * @param rateControlMode Use Rate control mode (Mpeg2RateControlMode) to
     *            specifiy whether the bitrate is variable (vbr) or constant
     *            (cbr).
     * @see Mpeg2RateControlMode
     */
    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the
     * bitrate is variable (vbr) or constant (cbr).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     *
     * @param rateControlMode Use Rate control mode (Mpeg2RateControlMode) to
     *            specifiy whether the bitrate is variable (vbr) or constant
     *            (cbr).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2RateControlMode
     */
    public Mpeg2Settings withRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
        return this;
    }

    /**
     * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the
     * bitrate is variable (vbr) or constant (cbr).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     *
     * @param rateControlMode Use Rate control mode (Mpeg2RateControlMode) to
     *            specifiy whether the bitrate is variable (vbr) or constant
     *            (cbr).
     * @see Mpeg2RateControlMode
     */
    public void setRateControlMode(Mpeg2RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
    }

    /**
     * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the
     * bitrate is variable (vbr) or constant (cbr).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR
     *
     * @param rateControlMode Use Rate control mode (Mpeg2RateControlMode) to
     *            specifiy whether the bitrate is variable (vbr) or constant
     *            (cbr).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2RateControlMode
     */
    public Mpeg2Settings withRateControlMode(Mpeg2RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Enable this setting to insert I-frames at scene changes that the
     *         service automatically detects. This improves video quality and is
     *         enabled by default.
     * @see Mpeg2SceneChangeDetect
     */
    public String getSceneChangeDetect() {
        return sceneChangeDetect;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Enable this setting to insert I-frames at scene
     *            changes that the service automatically detects. This improves
     *            video quality and is enabled by default.
     * @see Mpeg2SceneChangeDetect
     */
    public void setSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Enable this setting to insert I-frames at scene
     *            changes that the service automatically detects. This improves
     *            video quality and is enabled by default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2SceneChangeDetect
     */
    public Mpeg2Settings withSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
        return this;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Enable this setting to insert I-frames at scene
     *            changes that the service automatically detects. This improves
     *            video quality and is enabled by default.
     * @see Mpeg2SceneChangeDetect
     */
    public void setSceneChangeDetect(Mpeg2SceneChangeDetect sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect.toString();
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param sceneChangeDetect Enable this setting to insert I-frames at scene
     *            changes that the service automatically detects. This improves
     *            video quality and is enabled by default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2SceneChangeDetect
     */
    public Mpeg2Settings withSceneChangeDetect(Mpeg2SceneChangeDetect sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect.toString();
        return this;
    }

    /**
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled
     * as 25fps, and audio is sped up correspondingly.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Enables Slow PAL rate conversion. 23.976fps and 24fps input is
     *         relabeled as 25fps, and audio is sped up correspondingly.
     * @see Mpeg2SlowPal
     */
    public String getSlowPal() {
        return slowPal;
    }

    /**
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled
     * as 25fps, and audio is sped up correspondingly.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param slowPal Enables Slow PAL rate conversion. 23.976fps and 24fps
     *            input is relabeled as 25fps, and audio is sped up
     *            correspondingly.
     * @see Mpeg2SlowPal
     */
    public void setSlowPal(String slowPal) {
        this.slowPal = slowPal;
    }

    /**
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled
     * as 25fps, and audio is sped up correspondingly.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param slowPal Enables Slow PAL rate conversion. 23.976fps and 24fps
     *            input is relabeled as 25fps, and audio is sped up
     *            correspondingly.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2SlowPal
     */
    public Mpeg2Settings withSlowPal(String slowPal) {
        this.slowPal = slowPal;
        return this;
    }

    /**
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled
     * as 25fps, and audio is sped up correspondingly.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param slowPal Enables Slow PAL rate conversion. 23.976fps and 24fps
     *            input is relabeled as 25fps, and audio is sped up
     *            correspondingly.
     * @see Mpeg2SlowPal
     */
    public void setSlowPal(Mpeg2SlowPal slowPal) {
        this.slowPal = slowPal.toString();
    }

    /**
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled
     * as 25fps, and audio is sped up correspondingly.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param slowPal Enables Slow PAL rate conversion. 23.976fps and 24fps
     *            input is relabeled as 25fps, and audio is sped up
     *            correspondingly.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2SlowPal
     */
    public Mpeg2Settings withSlowPal(Mpeg2SlowPal slowPal) {
        this.slowPal = slowPal.toString();
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
    public Mpeg2Settings withSoftness(Integer softness) {
        this.softness = softness;
        return this;
    }

    /**
     * Adjust quantization within each frame based on spatial variation of
     * content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Adjust quantization within each frame based on spatial variation
     *         of content complexity.
     * @see Mpeg2SpatialAdaptiveQuantization
     */
    public String getSpatialAdaptiveQuantization() {
        return spatialAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame based on spatial variation of
     * content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param spatialAdaptiveQuantization Adjust quantization within each frame
     *            based on spatial variation of content complexity.
     * @see Mpeg2SpatialAdaptiveQuantization
     */
    public void setSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame based on spatial variation of
     * content complexity.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param spatialAdaptiveQuantization Adjust quantization within each frame
     *            based on spatial variation of content complexity.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2SpatialAdaptiveQuantization
     */
    public Mpeg2Settings withSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization;
        return this;
    }

    /**
     * Adjust quantization within each frame based on spatial variation of
     * content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param spatialAdaptiveQuantization Adjust quantization within each frame
     *            based on spatial variation of content complexity.
     * @see Mpeg2SpatialAdaptiveQuantization
     */
    public void setSpatialAdaptiveQuantization(
            Mpeg2SpatialAdaptiveQuantization spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization.toString();
    }

    /**
     * Adjust quantization within each frame based on spatial variation of
     * content complexity.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param spatialAdaptiveQuantization Adjust quantization within each frame
     *            based on spatial variation of content complexity.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2SpatialAdaptiveQuantization
     */
    public Mpeg2Settings withSpatialAdaptiveQuantization(
            Mpeg2SpatialAdaptiveQuantization spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization.toString();
        return this;
    }

    /**
     * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, D_10
     *
     * @return Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
     * @see Mpeg2Syntax
     */
    public String getSyntax() {
        return syntax;
    }

    /**
     * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, D_10
     *
     * @param syntax Produces a Type D-10 compatible bitstream (SMPTE
     *            356M-2001).
     * @see Mpeg2Syntax
     */
    public void setSyntax(String syntax) {
        this.syntax = syntax;
    }

    /**
     * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, D_10
     *
     * @param syntax Produces a Type D-10 compatible bitstream (SMPTE
     *            356M-2001).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2Syntax
     */
    public Mpeg2Settings withSyntax(String syntax) {
        this.syntax = syntax;
        return this;
    }

    /**
     * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, D_10
     *
     * @param syntax Produces a Type D-10 compatible bitstream (SMPTE
     *            356M-2001).
     * @see Mpeg2Syntax
     */
    public void setSyntax(Mpeg2Syntax syntax) {
        this.syntax = syntax.toString();
    }

    /**
     * Produces a Type D-10 compatible bitstream (SMPTE 356M-2001).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, D_10
     *
     * @param syntax Produces a Type D-10 compatible bitstream (SMPTE
     *            356M-2001).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2Syntax
     */
    public Mpeg2Settings withSyntax(Mpeg2Syntax syntax) {
        this.syntax = syntax.toString();
        return this;
    }

    /**
     * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SOFT, HARD
     *
     * @return Only use Telecine (Mpeg2Telecine) when you set Framerate
     *         (Framerate) to 29.970. Set Telecine (Mpeg2Telecine) to Hard
     *         (hard) to produce a 29.97i output from a 23.976 input. Set it to
     *         Soft (soft) to produce 23.976 output and leave converstion to the
     *         player.
     * @see Mpeg2Telecine
     */
    public String getTelecine() {
        return telecine;
    }

    /**
     * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SOFT, HARD
     *
     * @param telecine Only use Telecine (Mpeg2Telecine) when you set Framerate
     *            (Framerate) to 29.970. Set Telecine (Mpeg2Telecine) to Hard
     *            (hard) to produce a 29.97i output from a 23.976 input. Set it
     *            to Soft (soft) to produce 23.976 output and leave converstion
     *            to the player.
     * @see Mpeg2Telecine
     */
    public void setTelecine(String telecine) {
        this.telecine = telecine;
    }

    /**
     * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SOFT, HARD
     *
     * @param telecine Only use Telecine (Mpeg2Telecine) when you set Framerate
     *            (Framerate) to 29.970. Set Telecine (Mpeg2Telecine) to Hard
     *            (hard) to produce a 29.97i output from a 23.976 input. Set it
     *            to Soft (soft) to produce 23.976 output and leave converstion
     *            to the player.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2Telecine
     */
    public Mpeg2Settings withTelecine(String telecine) {
        this.telecine = telecine;
        return this;
    }

    /**
     * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SOFT, HARD
     *
     * @param telecine Only use Telecine (Mpeg2Telecine) when you set Framerate
     *            (Framerate) to 29.970. Set Telecine (Mpeg2Telecine) to Hard
     *            (hard) to produce a 29.97i output from a 23.976 input. Set it
     *            to Soft (soft) to produce 23.976 output and leave converstion
     *            to the player.
     * @see Mpeg2Telecine
     */
    public void setTelecine(Mpeg2Telecine telecine) {
        this.telecine = telecine.toString();
    }

    /**
     * Only use Telecine (Mpeg2Telecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (Mpeg2Telecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SOFT, HARD
     *
     * @param telecine Only use Telecine (Mpeg2Telecine) when you set Framerate
     *            (Framerate) to 29.970. Set Telecine (Mpeg2Telecine) to Hard
     *            (hard) to produce a 29.97i output from a 23.976 input. Set it
     *            to Soft (soft) to produce 23.976 output and leave converstion
     *            to the player.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2Telecine
     */
    public Mpeg2Settings withTelecine(Mpeg2Telecine telecine) {
        this.telecine = telecine.toString();
        return this;
    }

    /**
     * Adjust quantization within each frame based on temporal variation of
     * content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Adjust quantization within each frame based on temporal variation
     *         of content complexity.
     * @see Mpeg2TemporalAdaptiveQuantization
     */
    public String getTemporalAdaptiveQuantization() {
        return temporalAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame based on temporal variation of
     * content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param temporalAdaptiveQuantization Adjust quantization within each frame
     *            based on temporal variation of content complexity.
     * @see Mpeg2TemporalAdaptiveQuantization
     */
    public void setTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame based on temporal variation of
     * content complexity.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param temporalAdaptiveQuantization Adjust quantization within each frame
     *            based on temporal variation of content complexity.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2TemporalAdaptiveQuantization
     */
    public Mpeg2Settings withTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization;
        return this;
    }

    /**
     * Adjust quantization within each frame based on temporal variation of
     * content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param temporalAdaptiveQuantization Adjust quantization within each frame
     *            based on temporal variation of content complexity.
     * @see Mpeg2TemporalAdaptiveQuantization
     */
    public void setTemporalAdaptiveQuantization(
            Mpeg2TemporalAdaptiveQuantization temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization.toString();
    }

    /**
     * Adjust quantization within each frame based on temporal variation of
     * content complexity.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param temporalAdaptiveQuantization Adjust quantization within each frame
     *            based on temporal variation of content complexity.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Mpeg2TemporalAdaptiveQuantization
     */
    public Mpeg2Settings withTemporalAdaptiveQuantization(
            Mpeg2TemporalAdaptiveQuantization temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization.toString();
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
        if (getBitrate() != null)
            sb.append("Bitrate: " + getBitrate() + ",");
        if (getCodecLevel() != null)
            sb.append("CodecLevel: " + getCodecLevel() + ",");
        if (getCodecProfile() != null)
            sb.append("CodecProfile: " + getCodecProfile() + ",");
        if (getDynamicSubGop() != null)
            sb.append("DynamicSubGop: " + getDynamicSubGop() + ",");
        if (getFramerateControl() != null)
            sb.append("FramerateControl: " + getFramerateControl() + ",");
        if (getFramerateConversionAlgorithm() != null)
            sb.append("FramerateConversionAlgorithm: " + getFramerateConversionAlgorithm() + ",");
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
        if (getHrdBufferInitialFillPercentage() != null)
            sb.append("HrdBufferInitialFillPercentage: " + getHrdBufferInitialFillPercentage()
                    + ",");
        if (getHrdBufferSize() != null)
            sb.append("HrdBufferSize: " + getHrdBufferSize() + ",");
        if (getInterlaceMode() != null)
            sb.append("InterlaceMode: " + getInterlaceMode() + ",");
        if (getIntraDcPrecision() != null)
            sb.append("IntraDcPrecision: " + getIntraDcPrecision() + ",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: " + getMaxBitrate() + ",");
        if (getMinIInterval() != null)
            sb.append("MinIInterval: " + getMinIInterval() + ",");
        if (getNumberBFramesBetweenReferenceFrames() != null)
            sb.append("NumberBFramesBetweenReferenceFrames: "
                    + getNumberBFramesBetweenReferenceFrames() + ",");
        if (getParControl() != null)
            sb.append("ParControl: " + getParControl() + ",");
        if (getParDenominator() != null)
            sb.append("ParDenominator: " + getParDenominator() + ",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: " + getParNumerator() + ",");
        if (getQualityTuningLevel() != null)
            sb.append("QualityTuningLevel: " + getQualityTuningLevel() + ",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: " + getRateControlMode() + ",");
        if (getSceneChangeDetect() != null)
            sb.append("SceneChangeDetect: " + getSceneChangeDetect() + ",");
        if (getSlowPal() != null)
            sb.append("SlowPal: " + getSlowPal() + ",");
        if (getSoftness() != null)
            sb.append("Softness: " + getSoftness() + ",");
        if (getSpatialAdaptiveQuantization() != null)
            sb.append("SpatialAdaptiveQuantization: " + getSpatialAdaptiveQuantization() + ",");
        if (getSyntax() != null)
            sb.append("Syntax: " + getSyntax() + ",");
        if (getTelecine() != null)
            sb.append("Telecine: " + getTelecine() + ",");
        if (getTemporalAdaptiveQuantization() != null)
            sb.append("TemporalAdaptiveQuantization: " + getTemporalAdaptiveQuantization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAdaptiveQuantization() == null) ? 0 : getAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
        hashCode = prime * hashCode + ((getCodecLevel() == null) ? 0 : getCodecLevel().hashCode());
        hashCode = prime * hashCode
                + ((getCodecProfile() == null) ? 0 : getCodecProfile().hashCode());
        hashCode = prime * hashCode
                + ((getDynamicSubGop() == null) ? 0 : getDynamicSubGop().hashCode());
        hashCode = prime * hashCode
                + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime
                * hashCode
                + ((getFramerateConversionAlgorithm() == null) ? 0
                        : getFramerateConversionAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode
                + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode
                + ((getGopClosedCadence() == null) ? 0 : getGopClosedCadence().hashCode());
        hashCode = prime * hashCode + ((getGopSize() == null) ? 0 : getGopSize().hashCode());
        hashCode = prime * hashCode
                + ((getGopSizeUnits() == null) ? 0 : getGopSizeUnits().hashCode());
        hashCode = prime
                * hashCode
                + ((getHrdBufferInitialFillPercentage() == null) ? 0
                        : getHrdBufferInitialFillPercentage().hashCode());
        hashCode = prime * hashCode
                + ((getHrdBufferSize() == null) ? 0 : getHrdBufferSize().hashCode());
        hashCode = prime * hashCode
                + ((getInterlaceMode() == null) ? 0 : getInterlaceMode().hashCode());
        hashCode = prime * hashCode
                + ((getIntraDcPrecision() == null) ? 0 : getIntraDcPrecision().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getMinIInterval() == null) ? 0 : getMinIInterval().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberBFramesBetweenReferenceFrames() == null) ? 0
                        : getNumberBFramesBetweenReferenceFrames().hashCode());
        hashCode = prime * hashCode + ((getParControl() == null) ? 0 : getParControl().hashCode());
        hashCode = prime * hashCode
                + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode
                + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode
                + ((getQualityTuningLevel() == null) ? 0 : getQualityTuningLevel().hashCode());
        hashCode = prime * hashCode
                + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode
                + ((getSceneChangeDetect() == null) ? 0 : getSceneChangeDetect().hashCode());
        hashCode = prime * hashCode + ((getSlowPal() == null) ? 0 : getSlowPal().hashCode());
        hashCode = prime * hashCode + ((getSoftness() == null) ? 0 : getSoftness().hashCode());
        hashCode = prime
                * hashCode
                + ((getSpatialAdaptiveQuantization() == null) ? 0
                        : getSpatialAdaptiveQuantization().hashCode());
        hashCode = prime * hashCode + ((getSyntax() == null) ? 0 : getSyntax().hashCode());
        hashCode = prime * hashCode + ((getTelecine() == null) ? 0 : getTelecine().hashCode());
        hashCode = prime
                * hashCode
                + ((getTemporalAdaptiveQuantization() == null) ? 0
                        : getTemporalAdaptiveQuantization().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Mpeg2Settings == false)
            return false;
        Mpeg2Settings other = (Mpeg2Settings) obj;

        if (other.getAdaptiveQuantization() == null ^ this.getAdaptiveQuantization() == null)
            return false;
        if (other.getAdaptiveQuantization() != null
                && other.getAdaptiveQuantization().equals(this.getAdaptiveQuantization()) == false)
            return false;
        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
            return false;
        if (other.getCodecLevel() == null ^ this.getCodecLevel() == null)
            return false;
        if (other.getCodecLevel() != null
                && other.getCodecLevel().equals(this.getCodecLevel()) == false)
            return false;
        if (other.getCodecProfile() == null ^ this.getCodecProfile() == null)
            return false;
        if (other.getCodecProfile() != null
                && other.getCodecProfile().equals(this.getCodecProfile()) == false)
            return false;
        if (other.getDynamicSubGop() == null ^ this.getDynamicSubGop() == null)
            return false;
        if (other.getDynamicSubGop() != null
                && other.getDynamicSubGop().equals(this.getDynamicSubGop()) == false)
            return false;
        if (other.getFramerateControl() == null ^ this.getFramerateControl() == null)
            return false;
        if (other.getFramerateControl() != null
                && other.getFramerateControl().equals(this.getFramerateControl()) == false)
            return false;
        if (other.getFramerateConversionAlgorithm() == null
                ^ this.getFramerateConversionAlgorithm() == null)
            return false;
        if (other.getFramerateConversionAlgorithm() != null
                && other.getFramerateConversionAlgorithm().equals(
                        this.getFramerateConversionAlgorithm()) == false)
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
        if (other.getHrdBufferInitialFillPercentage() == null
                ^ this.getHrdBufferInitialFillPercentage() == null)
            return false;
        if (other.getHrdBufferInitialFillPercentage() != null
                && other.getHrdBufferInitialFillPercentage().equals(
                        this.getHrdBufferInitialFillPercentage()) == false)
            return false;
        if (other.getHrdBufferSize() == null ^ this.getHrdBufferSize() == null)
            return false;
        if (other.getHrdBufferSize() != null
                && other.getHrdBufferSize().equals(this.getHrdBufferSize()) == false)
            return false;
        if (other.getInterlaceMode() == null ^ this.getInterlaceMode() == null)
            return false;
        if (other.getInterlaceMode() != null
                && other.getInterlaceMode().equals(this.getInterlaceMode()) == false)
            return false;
        if (other.getIntraDcPrecision() == null ^ this.getIntraDcPrecision() == null)
            return false;
        if (other.getIntraDcPrecision() != null
                && other.getIntraDcPrecision().equals(this.getIntraDcPrecision()) == false)
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
        if (other.getNumberBFramesBetweenReferenceFrames() == null
                ^ this.getNumberBFramesBetweenReferenceFrames() == null)
            return false;
        if (other.getNumberBFramesBetweenReferenceFrames() != null
                && other.getNumberBFramesBetweenReferenceFrames().equals(
                        this.getNumberBFramesBetweenReferenceFrames()) == false)
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
        if (other.getQualityTuningLevel() == null ^ this.getQualityTuningLevel() == null)
            return false;
        if (other.getQualityTuningLevel() != null
                && other.getQualityTuningLevel().equals(this.getQualityTuningLevel()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null
                && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getSceneChangeDetect() == null ^ this.getSceneChangeDetect() == null)
            return false;
        if (other.getSceneChangeDetect() != null
                && other.getSceneChangeDetect().equals(this.getSceneChangeDetect()) == false)
            return false;
        if (other.getSlowPal() == null ^ this.getSlowPal() == null)
            return false;
        if (other.getSlowPal() != null && other.getSlowPal().equals(this.getSlowPal()) == false)
            return false;
        if (other.getSoftness() == null ^ this.getSoftness() == null)
            return false;
        if (other.getSoftness() != null && other.getSoftness().equals(this.getSoftness()) == false)
            return false;
        if (other.getSpatialAdaptiveQuantization() == null
                ^ this.getSpatialAdaptiveQuantization() == null)
            return false;
        if (other.getSpatialAdaptiveQuantization() != null
                && other.getSpatialAdaptiveQuantization().equals(
                        this.getSpatialAdaptiveQuantization()) == false)
            return false;
        if (other.getSyntax() == null ^ this.getSyntax() == null)
            return false;
        if (other.getSyntax() != null && other.getSyntax().equals(this.getSyntax()) == false)
            return false;
        if (other.getTelecine() == null ^ this.getTelecine() == null)
            return false;
        if (other.getTelecine() != null && other.getTelecine().equals(this.getTelecine()) == false)
            return false;
        if (other.getTemporalAdaptiveQuantization() == null
                ^ this.getTemporalAdaptiveQuantization() == null)
            return false;
        if (other.getTemporalAdaptiveQuantization() != null
                && other.getTemporalAdaptiveQuantization().equals(
                        this.getTemporalAdaptiveQuantization()) == false)
            return false;
        return true;
    }
}
