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
 * Required when you set (Codec) under (VideoDescription)>(CodecSettings) to the
 * value H_264.
 */
public class H264Settings implements Serializable {
    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH, HIGHER, MAX
     */
    private String adaptiveQuantization;

    /**
     * Specify the average bitrate in bits per second. Required for VBR and CBR.
     * For MS Smooth outputs, bitrates must be unique when rounded down to the
     * nearest multiple of 1000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 1152000000<br/>
     */
    private Integer bitrate;

    /**
     * Specify an H.264 level that is consistent with your output video
     * settings. If you aren't sure what level to specify, choose Auto (AUTO).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LEVEL_1, LEVEL_1_1, LEVEL_1_2, LEVEL_1_3,
     * LEVEL_2, LEVEL_2_1, LEVEL_2_2, LEVEL_3, LEVEL_3_1, LEVEL_3_2, LEVEL_4,
     * LEVEL_4_1, LEVEL_4_2, LEVEL_5, LEVEL_5_1, LEVEL_5_2
     */
    private String codecLevel;

    /**
     * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the
     * AVC-I License.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
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
     * Entropy encoding mode. Use CABAC (must be in Main or High profile) or
     * CAVLC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     */
    private String entropyEncoding;

    /**
     * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAFF, FORCE_FIELD
     */
    private String fieldEncoding;

    /**
     * Adjust quantization within each frame to reduce flicker or 'pop' on
     * I-frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String flickerAdaptiveQuantization;

    /**
     * If you are using the console, use the Framerate setting to specify the
     * frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate
     * conversion, choose a frame rate from the dropdown list or choose Custom.
     * The framerates shown in the dropdown list are decimal approximations of
     * fractions. If you choose Custom, specify your frame rate as a fraction.
     * If you are creating your transcoding job specification as a JSON file
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
     * Optional. Specify how the transcoder performs framerate conversion. The
     * default behavior is to use duplicate drop conversion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     */
    private String framerateConversionAlgorithm;

    /**
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateDenominator to specify the denominator of this
     * fraction. In this example, use 1001 for the value of
     * FramerateDenominator. When you use the console for transcode jobs that
     * use frame rate conversion, provide the value as a decimal number for
     * Framerate. In this example, specify 23.976.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer framerateDenominator;

    /**
     * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 =
     * 23.976 fps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer framerateNumerator;

    /**
     * If enable, use reference B frames for GOP structures that have B frames >
     * 1.
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
     * <b>Range: </b>0 - 2147483647<br/>
     */
    private Integer gopClosedCadence;

    /**
     * GOP Length (keyframe interval) in frames or seconds. Must be greater than
     * zero.
     */
    private Double gopSize;

    /**
     * Indicates if the GOP Size in H264 is specified in frames or seconds. If
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
     * <b>Range: </b>0 - 1152000000<br/>
     */
    private Integer hrdBufferSize;

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the
     * output. * Top Field First (TOP_FIELD) and Bottom Field First
     * (BOTTOM_FIELD) produce interlaced output with the entire output having
     * the same field polarity (top or bottom first). * Follow, Default Top
     * (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use
     * the same field polarity as the source. Therefore, behavior depends on the
     * input scan type, as follows. - If the source is interlaced, the output
     * will be interlaced with the same polarity as the source (it will follow
     * the source). The output could therefore be a mix of "top field first" and
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
     * Maximum bitrate in bits/second. For example, enter five megabits per
     * second as 5000000. Required when Rate control mode is QVBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 1152000000<br/>
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
     * Number of reference frames to use. The encoder may use more than
     * requested if using B-frames and/or interlaced encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     */
    private Integer numberReferenceFrames;

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR)
     * for this output. The default behavior, Follow source
     * (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your
     * output. To specify a different PAR in the console, choose any value other
     * than Follow source. To specify a different PAR by editing the JSON job
     * specification, choose SPECIFIED. When you choose SPECIFIED for this
     * setting, you must also specify values for the parNumerator and
     * parDenominator settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     */
    private String parControl;

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On
     * the console, this corresponds to any value other than Follow source. When
     * you specify an output pixel aspect ratio (PAR) that is different from
     * your input video PAR, provide your output PAR as a ratio. For example,
     * for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this
     * example, the value for parDenominator is 33.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer parDenominator;

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On
     * the console, this corresponds to any value other than Follow source. When
     * you specify an output pixel aspect ratio (PAR) that is different from
     * your input video PAR, provide your output PAR as a ratio. For example,
     * for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this
     * example, the value for parNumerator is 40.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer parNumerator;

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
     * want to trade off encoding speed for output video quality. The default
     * behavior is faster, lower quality, single-pass encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ
     */
    private String qualityTuningLevel;

    /**
     * Settings for quality-defined variable bitrate encoding with the H.264
     * codec. Required when you set Rate control mode to QVBR. Not valid when
     * you set Rate control mode to a value other than QVBR, or when you don't
     * define Rate control mode.
     */
    private H264QvbrSettings qvbrSettings;

    /**
     * Use this setting to specify whether this output has a variable bitrate
     * (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR, QVBR
     */
    private String rateControlMode;

    /**
     * Places a PPS header on each encoded picture, even if repeated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String repeatPps;

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default. If this output uses QVBR, choose Transition detection
     * (TRANSITION_DETECTION) for further video quality improvement. For more
     * information about QVBR, see
     * https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, TRANSITION_DETECTION
     */
    private String sceneChangeDetect;

    /**
     * Number of slices per picture. Must be less than or equal to the number of
     * macroblock rows for progressive pictures, and less than or equal to half
     * the number of macroblock rows for interlaced pictures.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 32<br/>
     */
    private Integer slices;

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
     * Produces a bitstream compliant with SMPTE RP-2027.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, RP2027
     */
    private String syntax;

    /**
     * This field applies only if the Streams > Advanced > Framerate (framerate)
     * field is set to 29.970. This field works with the Streams > Advanced >
     * Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
     * Advanced > Interlaced Mode field (interlace_mode) to identify the scan
     * type for the output: Progressive, Interlaced, Hard Telecine or Soft
     * Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft:
     * produces 23.976; the player converts this output to 29.97i.
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
     * Inserts timecode for each frame as 4 bytes of an unregistered SEI
     * message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String unregisteredSeiTimecode;

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH, HIGHER, MAX
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
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH, HIGHER, MAX
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
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH, HIGHER, MAX
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
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH, HIGHER, MAX
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
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH, HIGHER, MAX
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
     * Specify the average bitrate in bits per second. Required for VBR and CBR.
     * For MS Smooth outputs, bitrates must be unique when rounded down to the
     * nearest multiple of 1000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 1152000000<br/>
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
     * <b>Range: </b>1000 - 1152000000<br/>
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
     * <b>Range: </b>1000 - 1152000000<br/>
     *
     * @param bitrate Specify the average bitrate in bits per second. Required
     *            for VBR and CBR. For MS Smooth outputs, bitrates must be
     *            unique when rounded down to the nearest multiple of 1000.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * Specify an H.264 level that is consistent with your output video
     * settings. If you aren't sure what level to specify, choose Auto (AUTO).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LEVEL_1, LEVEL_1_1, LEVEL_1_2, LEVEL_1_3,
     * LEVEL_2, LEVEL_2_1, LEVEL_2_2, LEVEL_3, LEVEL_3_1, LEVEL_3_2, LEVEL_4,
     * LEVEL_4_1, LEVEL_4_2, LEVEL_5, LEVEL_5_1, LEVEL_5_2
     *
     * @return Specify an H.264 level that is consistent with your output video
     *         settings. If you aren't sure what level to specify, choose Auto
     *         (AUTO).
     * @see H264CodecLevel
     */
    public String getCodecLevel() {
        return codecLevel;
    }

    /**
     * Specify an H.264 level that is consistent with your output video
     * settings. If you aren't sure what level to specify, choose Auto (AUTO).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LEVEL_1, LEVEL_1_1, LEVEL_1_2, LEVEL_1_3,
     * LEVEL_2, LEVEL_2_1, LEVEL_2_2, LEVEL_3, LEVEL_3_1, LEVEL_3_2, LEVEL_4,
     * LEVEL_4_1, LEVEL_4_2, LEVEL_5, LEVEL_5_1, LEVEL_5_2
     *
     * @param codecLevel Specify an H.264 level that is consistent with your
     *            output video settings. If you aren't sure what level to
     *            specify, choose Auto (AUTO).
     * @see H264CodecLevel
     */
    public void setCodecLevel(String codecLevel) {
        this.codecLevel = codecLevel;
    }

    /**
     * Specify an H.264 level that is consistent with your output video
     * settings. If you aren't sure what level to specify, choose Auto (AUTO).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LEVEL_1, LEVEL_1_1, LEVEL_1_2, LEVEL_1_3,
     * LEVEL_2, LEVEL_2_1, LEVEL_2_2, LEVEL_3, LEVEL_3_1, LEVEL_3_2, LEVEL_4,
     * LEVEL_4_1, LEVEL_4_2, LEVEL_5, LEVEL_5_1, LEVEL_5_2
     *
     * @param codecLevel Specify an H.264 level that is consistent with your
     *            output video settings. If you aren't sure what level to
     *            specify, choose Auto (AUTO).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264CodecLevel
     */
    public H264Settings withCodecLevel(String codecLevel) {
        this.codecLevel = codecLevel;
        return this;
    }

    /**
     * Specify an H.264 level that is consistent with your output video
     * settings. If you aren't sure what level to specify, choose Auto (AUTO).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LEVEL_1, LEVEL_1_1, LEVEL_1_2, LEVEL_1_3,
     * LEVEL_2, LEVEL_2_1, LEVEL_2_2, LEVEL_3, LEVEL_3_1, LEVEL_3_2, LEVEL_4,
     * LEVEL_4_1, LEVEL_4_2, LEVEL_5, LEVEL_5_1, LEVEL_5_2
     *
     * @param codecLevel Specify an H.264 level that is consistent with your
     *            output video settings. If you aren't sure what level to
     *            specify, choose Auto (AUTO).
     * @see H264CodecLevel
     */
    public void setCodecLevel(H264CodecLevel codecLevel) {
        this.codecLevel = codecLevel.toString();
    }

    /**
     * Specify an H.264 level that is consistent with your output video
     * settings. If you aren't sure what level to specify, choose Auto (AUTO).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTO, LEVEL_1, LEVEL_1_1, LEVEL_1_2, LEVEL_1_3,
     * LEVEL_2, LEVEL_2_1, LEVEL_2_2, LEVEL_3, LEVEL_3_1, LEVEL_3_2, LEVEL_4,
     * LEVEL_4_1, LEVEL_4_2, LEVEL_5, LEVEL_5_1, LEVEL_5_2
     *
     * @param codecLevel Specify an H.264 level that is consistent with your
     *            output video settings. If you aren't sure what level to
     *            specify, choose Auto (AUTO).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264CodecLevel
     */
    public H264Settings withCodecLevel(H264CodecLevel codecLevel) {
        this.codecLevel = codecLevel.toString();
        return this;
    }

    /**
     * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the
     * AVC-I License.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
     *
     * @return H.264 Profile. High 4:2:2 and 10-bit profiles are only available
     *         with the AVC-I License.
     * @see H264CodecProfile
     */
    public String getCodecProfile() {
        return codecProfile;
    }

    /**
     * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the
     * AVC-I License.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
     *
     * @param codecProfile H.264 Profile. High 4:2:2 and 10-bit profiles are
     *            only available with the AVC-I License.
     * @see H264CodecProfile
     */
    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the
     * AVC-I License.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
     *
     * @param codecProfile H.264 Profile. High 4:2:2 and 10-bit profiles are
     *            only available with the AVC-I License.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264CodecProfile
     */
    public H264Settings withCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
        return this;
    }

    /**
     * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the
     * AVC-I License.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
     *
     * @param codecProfile H.264 Profile. High 4:2:2 and 10-bit profiles are
     *            only available with the AVC-I License.
     * @see H264CodecProfile
     */
    public void setCodecProfile(H264CodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
    }

    /**
     * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the
     * AVC-I License.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BASELINE, HIGH, HIGH_10BIT, HIGH_422,
     * HIGH_422_10BIT, MAIN
     *
     * @param codecProfile H.264 Profile. High 4:2:2 and 10-bit profiles are
     *            only available with the AVC-I License.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264CodecProfile
     */
    public H264Settings withCodecProfile(H264CodecProfile codecProfile) {
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
     * @see H264DynamicSubGop
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
     * @see H264DynamicSubGop
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
     * @see H264DynamicSubGop
     */
    public H264Settings withDynamicSubGop(String dynamicSubGop) {
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
     * @see H264DynamicSubGop
     */
    public void setDynamicSubGop(H264DynamicSubGop dynamicSubGop) {
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
     * @see H264DynamicSubGop
     */
    public H264Settings withDynamicSubGop(H264DynamicSubGop dynamicSubGop) {
        this.dynamicSubGop = dynamicSubGop.toString();
        return this;
    }

    /**
     * Entropy encoding mode. Use CABAC (must be in Main or High profile) or
     * CAVLC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     *
     * @return Entropy encoding mode. Use CABAC (must be in Main or High
     *         profile) or CAVLC.
     * @see H264EntropyEncoding
     */
    public String getEntropyEncoding() {
        return entropyEncoding;
    }

    /**
     * Entropy encoding mode. Use CABAC (must be in Main or High profile) or
     * CAVLC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     *
     * @param entropyEncoding Entropy encoding mode. Use CABAC (must be in Main
     *            or High profile) or CAVLC.
     * @see H264EntropyEncoding
     */
    public void setEntropyEncoding(String entropyEncoding) {
        this.entropyEncoding = entropyEncoding;
    }

    /**
     * Entropy encoding mode. Use CABAC (must be in Main or High profile) or
     * CAVLC.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     *
     * @param entropyEncoding Entropy encoding mode. Use CABAC (must be in Main
     *            or High profile) or CAVLC.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264EntropyEncoding
     */
    public H264Settings withEntropyEncoding(String entropyEncoding) {
        this.entropyEncoding = entropyEncoding;
        return this;
    }

    /**
     * Entropy encoding mode. Use CABAC (must be in Main or High profile) or
     * CAVLC.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     *
     * @param entropyEncoding Entropy encoding mode. Use CABAC (must be in Main
     *            or High profile) or CAVLC.
     * @see H264EntropyEncoding
     */
    public void setEntropyEncoding(H264EntropyEncoding entropyEncoding) {
        this.entropyEncoding = entropyEncoding.toString();
    }

    /**
     * Entropy encoding mode. Use CABAC (must be in Main or High profile) or
     * CAVLC.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CABAC, CAVLC
     *
     * @param entropyEncoding Entropy encoding mode. Use CABAC (must be in Main
     *            or High profile) or CAVLC.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264EntropyEncoding
     */
    public H264Settings withEntropyEncoding(H264EntropyEncoding entropyEncoding) {
        this.entropyEncoding = entropyEncoding.toString();
        return this;
    }

    /**
     * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAFF, FORCE_FIELD
     *
     * @return Choosing FORCE_FIELD disables PAFF encoding for interlaced
     *         outputs.
     * @see H264FieldEncoding
     */
    public String getFieldEncoding() {
        return fieldEncoding;
    }

    /**
     * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAFF, FORCE_FIELD
     *
     * @param fieldEncoding Choosing FORCE_FIELD disables PAFF encoding for
     *            interlaced outputs.
     * @see H264FieldEncoding
     */
    public void setFieldEncoding(String fieldEncoding) {
        this.fieldEncoding = fieldEncoding;
    }

    /**
     * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAFF, FORCE_FIELD
     *
     * @param fieldEncoding Choosing FORCE_FIELD disables PAFF encoding for
     *            interlaced outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FieldEncoding
     */
    public H264Settings withFieldEncoding(String fieldEncoding) {
        this.fieldEncoding = fieldEncoding;
        return this;
    }

    /**
     * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAFF, FORCE_FIELD
     *
     * @param fieldEncoding Choosing FORCE_FIELD disables PAFF encoding for
     *            interlaced outputs.
     * @see H264FieldEncoding
     */
    public void setFieldEncoding(H264FieldEncoding fieldEncoding) {
        this.fieldEncoding = fieldEncoding.toString();
    }

    /**
     * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PAFF, FORCE_FIELD
     *
     * @param fieldEncoding Choosing FORCE_FIELD disables PAFF encoding for
     *            interlaced outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FieldEncoding
     */
    public H264Settings withFieldEncoding(H264FieldEncoding fieldEncoding) {
        this.fieldEncoding = fieldEncoding.toString();
        return this;
    }

    /**
     * Adjust quantization within each frame to reduce flicker or 'pop' on
     * I-frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Adjust quantization within each frame to reduce flicker or 'pop'
     *         on I-frames.
     * @see H264FlickerAdaptiveQuantization
     */
    public String getFlickerAdaptiveQuantization() {
        return flickerAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame to reduce flicker or 'pop' on
     * I-frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param flickerAdaptiveQuantization Adjust quantization within each frame
     *            to reduce flicker or 'pop' on I-frames.
     * @see H264FlickerAdaptiveQuantization
     */
    public void setFlickerAdaptiveQuantization(String flickerAdaptiveQuantization) {
        this.flickerAdaptiveQuantization = flickerAdaptiveQuantization;
    }

    /**
     * Adjust quantization within each frame to reduce flicker or 'pop' on
     * I-frames.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param flickerAdaptiveQuantization Adjust quantization within each frame
     *            to reduce flicker or 'pop' on I-frames.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FlickerAdaptiveQuantization
     */
    public H264Settings withFlickerAdaptiveQuantization(String flickerAdaptiveQuantization) {
        this.flickerAdaptiveQuantization = flickerAdaptiveQuantization;
        return this;
    }

    /**
     * Adjust quantization within each frame to reduce flicker or 'pop' on
     * I-frames.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param flickerAdaptiveQuantization Adjust quantization within each frame
     *            to reduce flicker or 'pop' on I-frames.
     * @see H264FlickerAdaptiveQuantization
     */
    public void setFlickerAdaptiveQuantization(
            H264FlickerAdaptiveQuantization flickerAdaptiveQuantization) {
        this.flickerAdaptiveQuantization = flickerAdaptiveQuantization.toString();
    }

    /**
     * Adjust quantization within each frame to reduce flicker or 'pop' on
     * I-frames.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param flickerAdaptiveQuantization Adjust quantization within each frame
     *            to reduce flicker or 'pop' on I-frames.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FlickerAdaptiveQuantization
     */
    public H264Settings withFlickerAdaptiveQuantization(
            H264FlickerAdaptiveQuantization flickerAdaptiveQuantization) {
        this.flickerAdaptiveQuantization = flickerAdaptiveQuantization.toString();
        return this;
    }

    /**
     * If you are using the console, use the Framerate setting to specify the
     * frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate
     * conversion, choose a frame rate from the dropdown list or choose Custom.
     * The framerates shown in the dropdown list are decimal approximations of
     * fractions. If you choose Custom, specify your frame rate as a fraction.
     * If you are creating your transcoding job specification as a JSON file
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
     *         creating your transcoding job specification as a JSON file
     *         without the console, use FramerateControl to specify which value
     *         the service uses for the frame rate for this output. Choose
     *         INITIALIZE_FROM_SOURCE if you want the service to use the frame
     *         rate from the input. Choose SPECIFIED if you want the service to
     *         use the frame rate you specify in the settings FramerateNumerator
     *         and FramerateDenominator.
     * @see H264FramerateControl
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
     * If you are creating your transcoding job specification as a JSON file
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
     *            transcoding job specification as a JSON file without the
     *            console, use FramerateControl to specify which value the
     *            service uses for the frame rate for this output. Choose
     *            INITIALIZE_FROM_SOURCE if you want the service to use the
     *            frame rate from the input. Choose SPECIFIED if you want the
     *            service to use the frame rate you specify in the settings
     *            FramerateNumerator and FramerateDenominator.
     * @see H264FramerateControl
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
     * If you are creating your transcoding job specification as a JSON file
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
     *            transcoding job specification as a JSON file without the
     *            console, use FramerateControl to specify which value the
     *            service uses for the frame rate for this output. Choose
     *            INITIALIZE_FROM_SOURCE if you want the service to use the
     *            frame rate from the input. Choose SPECIFIED if you want the
     *            service to use the frame rate you specify in the settings
     *            FramerateNumerator and FramerateDenominator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FramerateControl
     */
    public H264Settings withFramerateControl(String framerateControl) {
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
     * If you are creating your transcoding job specification as a JSON file
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
     *            transcoding job specification as a JSON file without the
     *            console, use FramerateControl to specify which value the
     *            service uses for the frame rate for this output. Choose
     *            INITIALIZE_FROM_SOURCE if you want the service to use the
     *            frame rate from the input. Choose SPECIFIED if you want the
     *            service to use the frame rate you specify in the settings
     *            FramerateNumerator and FramerateDenominator.
     * @see H264FramerateControl
     */
    public void setFramerateControl(H264FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
    }

    /**
     * If you are using the console, use the Framerate setting to specify the
     * frame rate for this output. If you want to keep the same frame rate as
     * the input video, choose Follow source. If you want to do frame rate
     * conversion, choose a frame rate from the dropdown list or choose Custom.
     * The framerates shown in the dropdown list are decimal approximations of
     * fractions. If you choose Custom, specify your frame rate as a fraction.
     * If you are creating your transcoding job specification as a JSON file
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
     *            transcoding job specification as a JSON file without the
     *            console, use FramerateControl to specify which value the
     *            service uses for the frame rate for this output. Choose
     *            INITIALIZE_FROM_SOURCE if you want the service to use the
     *            frame rate from the input. Choose SPECIFIED if you want the
     *            service to use the frame rate you specify in the settings
     *            FramerateNumerator and FramerateDenominator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FramerateControl
     */
    public H264Settings withFramerateControl(H264FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
        return this;
    }

    /**
     * Optional. Specify how the transcoder performs framerate conversion. The
     * default behavior is to use duplicate drop conversion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @return Optional. Specify how the transcoder performs framerate
     *         conversion. The default behavior is to use duplicate drop
     *         conversion.
     * @see H264FramerateConversionAlgorithm
     */
    public String getFramerateConversionAlgorithm() {
        return framerateConversionAlgorithm;
    }

    /**
     * Optional. Specify how the transcoder performs framerate conversion. The
     * default behavior is to use duplicate drop conversion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm Optional. Specify how the transcoder
     *            performs framerate conversion. The default behavior is to use
     *            duplicate drop conversion.
     * @see H264FramerateConversionAlgorithm
     */
    public void setFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
    }

    /**
     * Optional. Specify how the transcoder performs framerate conversion. The
     * default behavior is to use duplicate drop conversion.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm Optional. Specify how the transcoder
     *            performs framerate conversion. The default behavior is to use
     *            duplicate drop conversion.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FramerateConversionAlgorithm
     */
    public H264Settings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
        return this;
    }

    /**
     * Optional. Specify how the transcoder performs framerate conversion. The
     * default behavior is to use duplicate drop conversion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm Optional. Specify how the transcoder
     *            performs framerate conversion. The default behavior is to use
     *            duplicate drop conversion.
     * @see H264FramerateConversionAlgorithm
     */
    public void setFramerateConversionAlgorithm(
            H264FramerateConversionAlgorithm framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm.toString();
    }

    /**
     * Optional. Specify how the transcoder performs framerate conversion. The
     * default behavior is to use duplicate drop conversion.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm Optional. Specify how the transcoder
     *            performs framerate conversion. The default behavior is to use
     *            duplicate drop conversion.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264FramerateConversionAlgorithm
     */
    public H264Settings withFramerateConversionAlgorithm(
            H264FramerateConversionAlgorithm framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm.toString();
        return this;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateDenominator to specify the denominator of this
     * fraction. In this example, use 1001 for the value of
     * FramerateDenominator. When you use the console for transcode jobs that
     * use frame rate conversion, provide the value as a decimal number for
     * Framerate. In this example, specify 23.976.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return When you use the API for transcode jobs that use frame rate
     *         conversion, specify the frame rate as a fraction. For example,
     *         24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify
     *         the denominator of this fraction. In this example, use 1001 for
     *         the value of FramerateDenominator. When you use the console for
     *         transcode jobs that use frame rate conversion, provide the value
     *         as a decimal number for Framerate. In this example, specify
     *         23.976.
     */
    public Integer getFramerateDenominator() {
        return framerateDenominator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateDenominator to specify the denominator of this
     * fraction. In this example, use 1001 for the value of
     * FramerateDenominator. When you use the console for transcode jobs that
     * use frame rate conversion, provide the value as a decimal number for
     * Framerate. In this example, specify 23.976.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param framerateDenominator When you use the API for transcode jobs that
     *            use frame rate conversion, specify the frame rate as a
     *            fraction. For example, 24000 / 1001 = 23.976 fps. Use
     *            FramerateDenominator to specify the denominator of this
     *            fraction. In this example, use 1001 for the value of
     *            FramerateDenominator. When you use the console for transcode
     *            jobs that use frame rate conversion, provide the value as a
     *            decimal number for Framerate. In this example, specify 23.976.
     */
    public void setFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateDenominator to specify the denominator of this
     * fraction. In this example, use 1001 for the value of
     * FramerateDenominator. When you use the console for transcode jobs that
     * use frame rate conversion, provide the value as a decimal number for
     * Framerate. In this example, specify 23.976.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param framerateDenominator When you use the API for transcode jobs that
     *            use frame rate conversion, specify the frame rate as a
     *            fraction. For example, 24000 / 1001 = 23.976 fps. Use
     *            FramerateDenominator to specify the denominator of this
     *            fraction. In this example, use 1001 for the value of
     *            FramerateDenominator. When you use the console for transcode
     *            jobs that use frame rate conversion, provide the value as a
     *            decimal number for Framerate. In this example, specify 23.976.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
        return this;
    }

    /**
     * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 =
     * 23.976 fps.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
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
     * <b>Range: </b>1 - 2147483647<br/>
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
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param framerateNumerator Frame rate numerator - frame rate is a
     *            fraction, e.g. 24000 / 1001 = 23.976 fps.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
        return this;
    }

    /**
     * If enable, use reference B frames for GOP structures that have B frames >
     * 1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return If enable, use reference B frames for GOP structures that have B
     *         frames > 1.
     * @see H264GopBReference
     */
    public String getGopBReference() {
        return gopBReference;
    }

    /**
     * If enable, use reference B frames for GOP structures that have B frames >
     * 1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param gopBReference If enable, use reference B frames for GOP structures
     *            that have B frames > 1.
     * @see H264GopBReference
     */
    public void setGopBReference(String gopBReference) {
        this.gopBReference = gopBReference;
    }

    /**
     * If enable, use reference B frames for GOP structures that have B frames >
     * 1.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param gopBReference If enable, use reference B frames for GOP structures
     *            that have B frames > 1.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264GopBReference
     */
    public H264Settings withGopBReference(String gopBReference) {
        this.gopBReference = gopBReference;
        return this;
    }

    /**
     * If enable, use reference B frames for GOP structures that have B frames >
     * 1.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param gopBReference If enable, use reference B frames for GOP structures
     *            that have B frames > 1.
     * @see H264GopBReference
     */
    public void setGopBReference(H264GopBReference gopBReference) {
        this.gopBReference = gopBReference.toString();
    }

    /**
     * If enable, use reference B frames for GOP structures that have B frames >
     * 1.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param gopBReference If enable, use reference B frames for GOP structures
     *            that have B frames > 1.
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
    public H264Settings withGopClosedCadence(Integer gopClosedCadence) {
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
    public H264Settings withGopSize(Double gopSize) {
        this.gopSize = gopSize;
        return this;
    }

    /**
     * Indicates if the GOP Size in H264 is specified in frames or seconds. If
     * seconds the system will convert the GOP Size into a frame count at run
     * time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @return Indicates if the GOP Size in H264 is specified in frames or
     *         seconds. If seconds the system will convert the GOP Size into a
     *         frame count at run time.
     * @see H264GopSizeUnits
     */
    public String getGopSizeUnits() {
        return gopSizeUnits;
    }

    /**
     * Indicates if the GOP Size in H264 is specified in frames or seconds. If
     * seconds the system will convert the GOP Size into a frame count at run
     * time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the GOP Size in H264 is specified in
     *            frames or seconds. If seconds the system will convert the GOP
     *            Size into a frame count at run time.
     * @see H264GopSizeUnits
     */
    public void setGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
    }

    /**
     * Indicates if the GOP Size in H264 is specified in frames or seconds. If
     * seconds the system will convert the GOP Size into a frame count at run
     * time.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the GOP Size in H264 is specified in
     *            frames or seconds. If seconds the system will convert the GOP
     *            Size into a frame count at run time.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264GopSizeUnits
     */
    public H264Settings withGopSizeUnits(String gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits;
        return this;
    }

    /**
     * Indicates if the GOP Size in H264 is specified in frames or seconds. If
     * seconds the system will convert the GOP Size into a frame count at run
     * time.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the GOP Size in H264 is specified in
     *            frames or seconds. If seconds the system will convert the GOP
     *            Size into a frame count at run time.
     * @see H264GopSizeUnits
     */
    public void setGopSizeUnits(H264GopSizeUnits gopSizeUnits) {
        this.gopSizeUnits = gopSizeUnits.toString();
    }

    /**
     * Indicates if the GOP Size in H264 is specified in frames or seconds. If
     * seconds the system will convert the GOP Size into a frame count at run
     * time.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FRAMES, SECONDS
     *
     * @param gopSizeUnits Indicates if the GOP Size in H264 is specified in
     *            frames or seconds. If seconds the system will convert the GOP
     *            Size into a frame count at run time.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264GopSizeUnits
     */
    public H264Settings withGopSizeUnits(H264GopSizeUnits gopSizeUnits) {
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
    public H264Settings withHrdBufferInitialFillPercentage(Integer hrdBufferInitialFillPercentage) {
        this.hrdBufferInitialFillPercentage = hrdBufferInitialFillPercentage;
        return this;
    }

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five
     * megabits as 5000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1152000000<br/>
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
     * <b>Range: </b>0 - 1152000000<br/>
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
     * <b>Range: </b>0 - 1152000000<br/>
     *
     * @param hrdBufferSize Size of buffer (HRD buffer model) in bits. For
     *            example, enter five megabits as 5000000.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withHrdBufferSize(Integer hrdBufferSize) {
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
     * input scan type, as follows. - If the source is interlaced, the output
     * will be interlaced with the same polarity as the source (it will follow
     * the source). The output could therefore be a mix of "top field first" and
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
     *         Therefore, behavior depends on the input scan type, as follows. -
     *         If the source is interlaced, the output will be interlaced with
     *         the same polarity as the source (it will follow the source). The
     *         output could therefore be a mix of "top field first" and
     *         "bottom field first". - If the source is progressive, the output
     *         will be interlaced with "top field first" or "bottom field first"
     *         polarity, depending on which of the Follow options you chose.
     * @see H264InterlaceMode
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
     * input scan type, as follows. - If the source is interlaced, the output
     * will be interlaced with the same polarity as the source (it will follow
     * the source). The output could therefore be a mix of "top field first" and
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
     *            source. Therefore, behavior depends on the input scan type, as
     *            follows. - If the source is interlaced, the output will be
     *            interlaced with the same polarity as the source (it will
     *            follow the source). The output could therefore be a mix of
     *            "top field first" and "bottom field first". - If the source is
     *            progressive, the output will be interlaced with
     *            "top field first" or "bottom field first" polarity, depending
     *            on which of the Follow options you chose.
     * @see H264InterlaceMode
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
     * input scan type, as follows. - If the source is interlaced, the output
     * will be interlaced with the same polarity as the source (it will follow
     * the source). The output could therefore be a mix of "top field first" and
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
     *            source. Therefore, behavior depends on the input scan type, as
     *            follows. - If the source is interlaced, the output will be
     *            interlaced with the same polarity as the source (it will
     *            follow the source). The output could therefore be a mix of
     *            "top field first" and "bottom field first". - If the source is
     *            progressive, the output will be interlaced with
     *            "top field first" or "bottom field first" polarity, depending
     *            on which of the Follow options you chose.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264InterlaceMode
     */
    public H264Settings withInterlaceMode(String interlaceMode) {
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
     * input scan type, as follows. - If the source is interlaced, the output
     * will be interlaced with the same polarity as the source (it will follow
     * the source). The output could therefore be a mix of "top field first" and
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
     *            source. Therefore, behavior depends on the input scan type, as
     *            follows. - If the source is interlaced, the output will be
     *            interlaced with the same polarity as the source (it will
     *            follow the source). The output could therefore be a mix of
     *            "top field first" and "bottom field first". - If the source is
     *            progressive, the output will be interlaced with
     *            "top field first" or "bottom field first" polarity, depending
     *            on which of the Follow options you chose.
     * @see H264InterlaceMode
     */
    public void setInterlaceMode(H264InterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
    }

    /**
     * Use Interlace mode (InterlaceMode) to choose the scan line type for the
     * output. * Top Field First (TOP_FIELD) and Bottom Field First
     * (BOTTOM_FIELD) produce interlaced output with the entire output having
     * the same field polarity (top or bottom first). * Follow, Default Top
     * (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use
     * the same field polarity as the source. Therefore, behavior depends on the
     * input scan type, as follows. - If the source is interlaced, the output
     * will be interlaced with the same polarity as the source (it will follow
     * the source). The output could therefore be a mix of "top field first" and
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
     *            source. Therefore, behavior depends on the input scan type, as
     *            follows. - If the source is interlaced, the output will be
     *            interlaced with the same polarity as the source (it will
     *            follow the source). The output could therefore be a mix of
     *            "top field first" and "bottom field first". - If the source is
     *            progressive, the output will be interlaced with
     *            "top field first" or "bottom field first" polarity, depending
     *            on which of the Follow options you chose.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264InterlaceMode
     */
    public H264Settings withInterlaceMode(H264InterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
        return this;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per
     * second as 5000000. Required when Rate control mode is QVBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 1152000000<br/>
     *
     * @return Maximum bitrate in bits/second. For example, enter five megabits
     *         per second as 5000000. Required when Rate control mode is QVBR.
     */
    public Integer getMaxBitrate() {
        return maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per
     * second as 5000000. Required when Rate control mode is QVBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 1152000000<br/>
     *
     * @param maxBitrate Maximum bitrate in bits/second. For example, enter five
     *            megabits per second as 5000000. Required when Rate control
     *            mode is QVBR.
     */
    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per
     * second as 5000000. Required when Rate control mode is QVBR.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 1152000000<br/>
     *
     * @param maxBitrate Maximum bitrate in bits/second. For example, enter five
     *            megabits per second as 5000000. Required when Rate control
     *            mode is QVBR.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withMaxBitrate(Integer maxBitrate) {
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
    public H264Settings withMinIInterval(Integer minIInterval) {
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
    public H264Settings withNumberBFramesBetweenReferenceFrames(
            Integer numberBFramesBetweenReferenceFrames) {
        this.numberBFramesBetweenReferenceFrames = numberBFramesBetweenReferenceFrames;
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
    public Integer getNumberReferenceFrames() {
        return numberReferenceFrames;
    }

    /**
     * Number of reference frames to use. The encoder may use more than
     * requested if using B-frames and/or interlaced encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 6<br/>
     *
     * @param numberReferenceFrames Number of reference frames to use. The
     *            encoder may use more than requested if using B-frames and/or
     *            interlaced encoding.
     */
    public void setNumberReferenceFrames(Integer numberReferenceFrames) {
        this.numberReferenceFrames = numberReferenceFrames;
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
     * @param numberReferenceFrames Number of reference frames to use. The
     *            encoder may use more than requested if using B-frames and/or
     *            interlaced encoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withNumberReferenceFrames(Integer numberReferenceFrames) {
        this.numberReferenceFrames = numberReferenceFrames;
        return this;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR)
     * for this output. The default behavior, Follow source
     * (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your
     * output. To specify a different PAR in the console, choose any value other
     * than Follow source. To specify a different PAR by editing the JSON job
     * specification, choose SPECIFIED. When you choose SPECIFIED for this
     * setting, you must also specify values for the parNumerator and
     * parDenominator settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @return Optional. Specify how the service determines the pixel aspect
     *         ratio (PAR) for this output. The default behavior, Follow source
     *         (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for
     *         your output. To specify a different PAR in the console, choose
     *         any value other than Follow source. To specify a different PAR by
     *         editing the JSON job specification, choose SPECIFIED. When you
     *         choose SPECIFIED for this setting, you must also specify values
     *         for the parNumerator and parDenominator settings.
     * @see H264ParControl
     */
    public String getParControl() {
        return parControl;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR)
     * for this output. The default behavior, Follow source
     * (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your
     * output. To specify a different PAR in the console, choose any value other
     * than Follow source. To specify a different PAR by editing the JSON job
     * specification, choose SPECIFIED. When you choose SPECIFIED for this
     * setting, you must also specify values for the parNumerator and
     * parDenominator settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Optional. Specify how the service determines the pixel
     *            aspect ratio (PAR) for this output. The default behavior,
     *            Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your
     *            input video for your output. To specify a different PAR in the
     *            console, choose any value other than Follow source. To specify
     *            a different PAR by editing the JSON job specification, choose
     *            SPECIFIED. When you choose SPECIFIED for this setting, you
     *            must also specify values for the parNumerator and
     *            parDenominator settings.
     * @see H264ParControl
     */
    public void setParControl(String parControl) {
        this.parControl = parControl;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR)
     * for this output. The default behavior, Follow source
     * (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your
     * output. To specify a different PAR in the console, choose any value other
     * than Follow source. To specify a different PAR by editing the JSON job
     * specification, choose SPECIFIED. When you choose SPECIFIED for this
     * setting, you must also specify values for the parNumerator and
     * parDenominator settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Optional. Specify how the service determines the pixel
     *            aspect ratio (PAR) for this output. The default behavior,
     *            Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your
     *            input video for your output. To specify a different PAR in the
     *            console, choose any value other than Follow source. To specify
     *            a different PAR by editing the JSON job specification, choose
     *            SPECIFIED. When you choose SPECIFIED for this setting, you
     *            must also specify values for the parNumerator and
     *            parDenominator settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264ParControl
     */
    public H264Settings withParControl(String parControl) {
        this.parControl = parControl;
        return this;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR)
     * for this output. The default behavior, Follow source
     * (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your
     * output. To specify a different PAR in the console, choose any value other
     * than Follow source. To specify a different PAR by editing the JSON job
     * specification, choose SPECIFIED. When you choose SPECIFIED for this
     * setting, you must also specify values for the parNumerator and
     * parDenominator settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Optional. Specify how the service determines the pixel
     *            aspect ratio (PAR) for this output. The default behavior,
     *            Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your
     *            input video for your output. To specify a different PAR in the
     *            console, choose any value other than Follow source. To specify
     *            a different PAR by editing the JSON job specification, choose
     *            SPECIFIED. When you choose SPECIFIED for this setting, you
     *            must also specify values for the parNumerator and
     *            parDenominator settings.
     * @see H264ParControl
     */
    public void setParControl(H264ParControl parControl) {
        this.parControl = parControl.toString();
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio (PAR)
     * for this output. The default behavior, Follow source
     * (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your
     * output. To specify a different PAR in the console, choose any value other
     * than Follow source. To specify a different PAR by editing the JSON job
     * specification, choose SPECIFIED. When you choose SPECIFIED for this
     * setting, you must also specify values for the parNumerator and
     * parDenominator settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Optional. Specify how the service determines the pixel
     *            aspect ratio (PAR) for this output. The default behavior,
     *            Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your
     *            input video for your output. To specify a different PAR in the
     *            console, choose any value other than Follow source. To specify
     *            a different PAR by editing the JSON job specification, choose
     *            SPECIFIED. When you choose SPECIFIED for this setting, you
     *            must also specify values for the parNumerator and
     *            parDenominator settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264ParControl
     */
    public H264Settings withParControl(H264ParControl parControl) {
        this.parControl = parControl.toString();
        return this;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On
     * the console, this corresponds to any value other than Follow source. When
     * you specify an output pixel aspect ratio (PAR) that is different from
     * your input video PAR, provide your output PAR as a ratio. For example,
     * for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this
     * example, the value for parDenominator is 33.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return Required when you set Pixel aspect ratio (parControl) to
     *         SPECIFIED. On the console, this corresponds to any value other
     *         than Follow source. When you specify an output pixel aspect ratio
     *         (PAR) that is different from your input video PAR, provide your
     *         output PAR as a ratio. For example, for D1/DV NTSC widescreen,
     *         you would specify the ratio 40:33. In this example, the value for
     *         parDenominator is 33.
     */
    public Integer getParDenominator() {
        return parDenominator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On
     * the console, this corresponds to any value other than Follow source. When
     * you specify an output pixel aspect ratio (PAR) that is different from
     * your input video PAR, provide your output PAR as a ratio. For example,
     * for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this
     * example, the value for parDenominator is 33.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param parDenominator Required when you set Pixel aspect ratio
     *            (parControl) to SPECIFIED. On the console, this corresponds to
     *            any value other than Follow source. When you specify an output
     *            pixel aspect ratio (PAR) that is different from your input
     *            video PAR, provide your output PAR as a ratio. For example,
     *            for D1/DV NTSC widescreen, you would specify the ratio 40:33.
     *            In this example, the value for parDenominator is 33.
     */
    public void setParDenominator(Integer parDenominator) {
        this.parDenominator = parDenominator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On
     * the console, this corresponds to any value other than Follow source. When
     * you specify an output pixel aspect ratio (PAR) that is different from
     * your input video PAR, provide your output PAR as a ratio. For example,
     * for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this
     * example, the value for parDenominator is 33.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param parDenominator Required when you set Pixel aspect ratio
     *            (parControl) to SPECIFIED. On the console, this corresponds to
     *            any value other than Follow source. When you specify an output
     *            pixel aspect ratio (PAR) that is different from your input
     *            video PAR, provide your output PAR as a ratio. For example,
     *            for D1/DV NTSC widescreen, you would specify the ratio 40:33.
     *            In this example, the value for parDenominator is 33.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withParDenominator(Integer parDenominator) {
        this.parDenominator = parDenominator;
        return this;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On
     * the console, this corresponds to any value other than Follow source. When
     * you specify an output pixel aspect ratio (PAR) that is different from
     * your input video PAR, provide your output PAR as a ratio. For example,
     * for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this
     * example, the value for parNumerator is 40.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return Required when you set Pixel aspect ratio (parControl) to
     *         SPECIFIED. On the console, this corresponds to any value other
     *         than Follow source. When you specify an output pixel aspect ratio
     *         (PAR) that is different from your input video PAR, provide your
     *         output PAR as a ratio. For example, for D1/DV NTSC widescreen,
     *         you would specify the ratio 40:33. In this example, the value for
     *         parNumerator is 40.
     */
    public Integer getParNumerator() {
        return parNumerator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On
     * the console, this corresponds to any value other than Follow source. When
     * you specify an output pixel aspect ratio (PAR) that is different from
     * your input video PAR, provide your output PAR as a ratio. For example,
     * for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this
     * example, the value for parNumerator is 40.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param parNumerator Required when you set Pixel aspect ratio (parControl)
     *            to SPECIFIED. On the console, this corresponds to any value
     *            other than Follow source. When you specify an output pixel
     *            aspect ratio (PAR) that is different from your input video
     *            PAR, provide your output PAR as a ratio. For example, for
     *            D1/DV NTSC widescreen, you would specify the ratio 40:33. In
     *            this example, the value for parNumerator is 40.
     */
    public void setParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
    }

    /**
     * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On
     * the console, this corresponds to any value other than Follow source. When
     * you specify an output pixel aspect ratio (PAR) that is different from
     * your input video PAR, provide your output PAR as a ratio. For example,
     * for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this
     * example, the value for parNumerator is 40.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param parNumerator Required when you set Pixel aspect ratio (parControl)
     *            to SPECIFIED. On the console, this corresponds to any value
     *            other than Follow source. When you specify an output pixel
     *            aspect ratio (PAR) that is different from your input video
     *            PAR, provide your output PAR as a ratio. For example, for
     *            D1/DV NTSC widescreen, you would specify the ratio 40:33. In
     *            this example, the value for parNumerator is 40.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
        return this;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
     * want to trade off encoding speed for output video quality. The default
     * behavior is faster, lower quality, single-pass encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ
     *
     * @return Optional. Use Quality tuning level (qualityTuningLevel) to choose
     *         how you want to trade off encoding speed for output video
     *         quality. The default behavior is faster, lower quality,
     *         single-pass encoding.
     * @see H264QualityTuningLevel
     */
    public String getQualityTuningLevel() {
        return qualityTuningLevel;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
     * want to trade off encoding speed for output video quality. The default
     * behavior is faster, lower quality, single-pass encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ
     *
     * @param qualityTuningLevel Optional. Use Quality tuning level
     *            (qualityTuningLevel) to choose how you want to trade off
     *            encoding speed for output video quality. The default behavior
     *            is faster, lower quality, single-pass encoding.
     * @see H264QualityTuningLevel
     */
    public void setQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
     * want to trade off encoding speed for output video quality. The default
     * behavior is faster, lower quality, single-pass encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ
     *
     * @param qualityTuningLevel Optional. Use Quality tuning level
     *            (qualityTuningLevel) to choose how you want to trade off
     *            encoding speed for output video quality. The default behavior
     *            is faster, lower quality, single-pass encoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264QualityTuningLevel
     */
    public H264Settings withQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
        return this;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
     * want to trade off encoding speed for output video quality. The default
     * behavior is faster, lower quality, single-pass encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ
     *
     * @param qualityTuningLevel Optional. Use Quality tuning level
     *            (qualityTuningLevel) to choose how you want to trade off
     *            encoding speed for output video quality. The default behavior
     *            is faster, lower quality, single-pass encoding.
     * @see H264QualityTuningLevel
     */
    public void setQualityTuningLevel(H264QualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
     * want to trade off encoding speed for output video quality. The default
     * behavior is faster, lower quality, single-pass encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SINGLE_PASS, SINGLE_PASS_HQ, MULTI_PASS_HQ
     *
     * @param qualityTuningLevel Optional. Use Quality tuning level
     *            (qualityTuningLevel) to choose how you want to trade off
     *            encoding speed for output video quality. The default behavior
     *            is faster, lower quality, single-pass encoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264QualityTuningLevel
     */
    public H264Settings withQualityTuningLevel(H264QualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
        return this;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the H.264
     * codec. Required when you set Rate control mode to QVBR. Not valid when
     * you set Rate control mode to a value other than QVBR, or when you don't
     * define Rate control mode.
     *
     * @return Settings for quality-defined variable bitrate encoding with the
     *         H.264 codec. Required when you set Rate control mode to QVBR. Not
     *         valid when you set Rate control mode to a value other than QVBR,
     *         or when you don't define Rate control mode.
     */
    public H264QvbrSettings getQvbrSettings() {
        return qvbrSettings;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the H.264
     * codec. Required when you set Rate control mode to QVBR. Not valid when
     * you set Rate control mode to a value other than QVBR, or when you don't
     * define Rate control mode.
     *
     * @param qvbrSettings Settings for quality-defined variable bitrate
     *            encoding with the H.264 codec. Required when you set Rate
     *            control mode to QVBR. Not valid when you set Rate control mode
     *            to a value other than QVBR, or when you don't define Rate
     *            control mode.
     */
    public void setQvbrSettings(H264QvbrSettings qvbrSettings) {
        this.qvbrSettings = qvbrSettings;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the H.264
     * codec. Required when you set Rate control mode to QVBR. Not valid when
     * you set Rate control mode to a value other than QVBR, or when you don't
     * define Rate control mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param qvbrSettings Settings for quality-defined variable bitrate
     *            encoding with the H.264 codec. Required when you set Rate
     *            control mode to QVBR. Not valid when you set Rate control mode
     *            to a value other than QVBR, or when you don't define Rate
     *            control mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withQvbrSettings(H264QvbrSettings qvbrSettings) {
        this.qvbrSettings = qvbrSettings;
        return this;
    }

    /**
     * Use this setting to specify whether this output has a variable bitrate
     * (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR, QVBR
     *
     * @return Use this setting to specify whether this output has a variable
     *         bitrate (VBR), constant bitrate (CBR) or quality-defined variable
     *         bitrate (QVBR).
     * @see H264RateControlMode
     */
    public String getRateControlMode() {
        return rateControlMode;
    }

    /**
     * Use this setting to specify whether this output has a variable bitrate
     * (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR, QVBR
     *
     * @param rateControlMode Use this setting to specify whether this output
     *            has a variable bitrate (VBR), constant bitrate (CBR) or
     *            quality-defined variable bitrate (QVBR).
     * @see H264RateControlMode
     */
    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * Use this setting to specify whether this output has a variable bitrate
     * (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR, QVBR
     *
     * @param rateControlMode Use this setting to specify whether this output
     *            has a variable bitrate (VBR), constant bitrate (CBR) or
     *            quality-defined variable bitrate (QVBR).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264RateControlMode
     */
    public H264Settings withRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
        return this;
    }

    /**
     * Use this setting to specify whether this output has a variable bitrate
     * (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR, QVBR
     *
     * @param rateControlMode Use this setting to specify whether this output
     *            has a variable bitrate (VBR), constant bitrate (CBR) or
     *            quality-defined variable bitrate (QVBR).
     * @see H264RateControlMode
     */
    public void setRateControlMode(H264RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
    }

    /**
     * Use this setting to specify whether this output has a variable bitrate
     * (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR, CBR, QVBR
     *
     * @param rateControlMode Use this setting to specify whether this output
     *            has a variable bitrate (VBR), constant bitrate (CBR) or
     *            quality-defined variable bitrate (QVBR).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264RateControlMode
     */
    public H264Settings withRateControlMode(H264RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Places a PPS header on each encoded picture, even if repeated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Places a PPS header on each encoded picture, even if repeated.
     * @see H264RepeatPps
     */
    public String getRepeatPps() {
        return repeatPps;
    }

    /**
     * Places a PPS header on each encoded picture, even if repeated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param repeatPps Places a PPS header on each encoded picture, even if
     *            repeated.
     * @see H264RepeatPps
     */
    public void setRepeatPps(String repeatPps) {
        this.repeatPps = repeatPps;
    }

    /**
     * Places a PPS header on each encoded picture, even if repeated.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param repeatPps Places a PPS header on each encoded picture, even if
     *            repeated.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264RepeatPps
     */
    public H264Settings withRepeatPps(String repeatPps) {
        this.repeatPps = repeatPps;
        return this;
    }

    /**
     * Places a PPS header on each encoded picture, even if repeated.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param repeatPps Places a PPS header on each encoded picture, even if
     *            repeated.
     * @see H264RepeatPps
     */
    public void setRepeatPps(H264RepeatPps repeatPps) {
        this.repeatPps = repeatPps.toString();
    }

    /**
     * Places a PPS header on each encoded picture, even if repeated.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param repeatPps Places a PPS header on each encoded picture, even if
     *            repeated.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264RepeatPps
     */
    public H264Settings withRepeatPps(H264RepeatPps repeatPps) {
        this.repeatPps = repeatPps.toString();
        return this;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default. If this output uses QVBR, choose Transition detection
     * (TRANSITION_DETECTION) for further video quality improvement. For more
     * information about QVBR, see
     * https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, TRANSITION_DETECTION
     *
     * @return Enable this setting to insert I-frames at scene changes that the
     *         service automatically detects. This improves video quality and is
     *         enabled by default. If this output uses QVBR, choose Transition
     *         detection (TRANSITION_DETECTION) for further video quality
     *         improvement. For more information about QVBR, see
     *         https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
     * @see H264SceneChangeDetect
     */
    public String getSceneChangeDetect() {
        return sceneChangeDetect;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default. If this output uses QVBR, choose Transition detection
     * (TRANSITION_DETECTION) for further video quality improvement. For more
     * information about QVBR, see
     * https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, TRANSITION_DETECTION
     *
     * @param sceneChangeDetect Enable this setting to insert I-frames at scene
     *            changes that the service automatically detects. This improves
     *            video quality and is enabled by default. If this output uses
     *            QVBR, choose Transition detection (TRANSITION_DETECTION) for
     *            further video quality improvement. For more information about
     *            QVBR, see
     *            https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
     * @see H264SceneChangeDetect
     */
    public void setSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default. If this output uses QVBR, choose Transition detection
     * (TRANSITION_DETECTION) for further video quality improvement. For more
     * information about QVBR, see
     * https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, TRANSITION_DETECTION
     *
     * @param sceneChangeDetect Enable this setting to insert I-frames at scene
     *            changes that the service automatically detects. This improves
     *            video quality and is enabled by default. If this output uses
     *            QVBR, choose Transition detection (TRANSITION_DETECTION) for
     *            further video quality improvement. For more information about
     *            QVBR, see
     *            https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264SceneChangeDetect
     */
    public H264Settings withSceneChangeDetect(String sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect;
        return this;
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default. If this output uses QVBR, choose Transition detection
     * (TRANSITION_DETECTION) for further video quality improvement. For more
     * information about QVBR, see
     * https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, TRANSITION_DETECTION
     *
     * @param sceneChangeDetect Enable this setting to insert I-frames at scene
     *            changes that the service automatically detects. This improves
     *            video quality and is enabled by default. If this output uses
     *            QVBR, choose Transition detection (TRANSITION_DETECTION) for
     *            further video quality improvement. For more information about
     *            QVBR, see
     *            https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
     * @see H264SceneChangeDetect
     */
    public void setSceneChangeDetect(H264SceneChangeDetect sceneChangeDetect) {
        this.sceneChangeDetect = sceneChangeDetect.toString();
    }

    /**
     * Enable this setting to insert I-frames at scene changes that the service
     * automatically detects. This improves video quality and is enabled by
     * default. If this output uses QVBR, choose Transition detection
     * (TRANSITION_DETECTION) for further video quality improvement. For more
     * information about QVBR, see
     * https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED, TRANSITION_DETECTION
     *
     * @param sceneChangeDetect Enable this setting to insert I-frames at scene
     *            changes that the service automatically detects. This improves
     *            video quality and is enabled by default. If this output uses
     *            QVBR, choose Transition detection (TRANSITION_DETECTION) for
     *            further video quality improvement. For more information about
     *            QVBR, see
     *            https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
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
     * the number of macroblock rows for interlaced pictures.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 32<br/>
     *
     * @return Number of slices per picture. Must be less than or equal to the
     *         number of macroblock rows for progressive pictures, and less than
     *         or equal to half the number of macroblock rows for interlaced
     *         pictures.
     */
    public Integer getSlices() {
        return slices;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of
     * macroblock rows for progressive pictures, and less than or equal to half
     * the number of macroblock rows for interlaced pictures.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 32<br/>
     *
     * @param slices Number of slices per picture. Must be less than or equal to
     *            the number of macroblock rows for progressive pictures, and
     *            less than or equal to half the number of macroblock rows for
     *            interlaced pictures.
     */
    public void setSlices(Integer slices) {
        this.slices = slices;
    }

    /**
     * Number of slices per picture. Must be less than or equal to the number of
     * macroblock rows for progressive pictures, and less than or equal to half
     * the number of macroblock rows for interlaced pictures.
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
     *            interlaced pictures.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public H264Settings withSlices(Integer slices) {
        this.slices = slices;
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
     * @see H264SlowPal
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
     * @see H264SlowPal
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
     * @see H264SlowPal
     */
    public H264Settings withSlowPal(String slowPal) {
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
     * @see H264SlowPal
     */
    public void setSlowPal(H264SlowPal slowPal) {
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
     * @see H264SlowPal
     */
    public H264Settings withSlowPal(H264SlowPal slowPal) {
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
    public H264Settings withSoftness(Integer softness) {
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
     * @see H264SpatialAdaptiveQuantization
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
     * @see H264SpatialAdaptiveQuantization
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
     * @see H264SpatialAdaptiveQuantization
     */
    public H264Settings withSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
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
     * @see H264SpatialAdaptiveQuantization
     */
    public void setSpatialAdaptiveQuantization(
            H264SpatialAdaptiveQuantization spatialAdaptiveQuantization) {
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
     * @see H264SpatialAdaptiveQuantization
     */
    public H264Settings withSpatialAdaptiveQuantization(
            H264SpatialAdaptiveQuantization spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization.toString();
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
     * This field applies only if the Streams > Advanced > Framerate (framerate)
     * field is set to 29.970. This field works with the Streams > Advanced >
     * Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
     * Advanced > Interlaced Mode field (interlace_mode) to identify the scan
     * type for the output: Progressive, Interlaced, Hard Telecine or Soft
     * Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft:
     * produces 23.976; the player converts this output to 29.97i.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SOFT, HARD
     *
     * @return This field applies only if the Streams > Advanced > Framerate
     *         (framerate) field is set to 29.970. This field works with the
     *         Streams > Advanced > Preprocessors > Deinterlacer field
     *         (deinterlace_mode) and the Streams > Advanced > Interlaced Mode
     *         field (interlace_mode) to identify the scan type for the output:
     *         Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard:
     *         produces 29.97i output from 23.976 input. - Soft: produces
     *         23.976; the player converts this output to 29.97i.
     * @see H264Telecine
     */
    public String getTelecine() {
        return telecine;
    }

    /**
     * This field applies only if the Streams > Advanced > Framerate (framerate)
     * field is set to 29.970. This field works with the Streams > Advanced >
     * Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
     * Advanced > Interlaced Mode field (interlace_mode) to identify the scan
     * type for the output: Progressive, Interlaced, Hard Telecine or Soft
     * Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft:
     * produces 23.976; the player converts this output to 29.97i.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SOFT, HARD
     *
     * @param telecine This field applies only if the Streams > Advanced >
     *            Framerate (framerate) field is set to 29.970. This field works
     *            with the Streams > Advanced > Preprocessors > Deinterlacer
     *            field (deinterlace_mode) and the Streams > Advanced >
     *            Interlaced Mode field (interlace_mode) to identify the scan
     *            type for the output: Progressive, Interlaced, Hard Telecine or
     *            Soft Telecine. - Hard: produces 29.97i output from 23.976
     *            input. - Soft: produces 23.976; the player converts this
     *            output to 29.97i.
     * @see H264Telecine
     */
    public void setTelecine(String telecine) {
        this.telecine = telecine;
    }

    /**
     * This field applies only if the Streams > Advanced > Framerate (framerate)
     * field is set to 29.970. This field works with the Streams > Advanced >
     * Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
     * Advanced > Interlaced Mode field (interlace_mode) to identify the scan
     * type for the output: Progressive, Interlaced, Hard Telecine or Soft
     * Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft:
     * produces 23.976; the player converts this output to 29.97i.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SOFT, HARD
     *
     * @param telecine This field applies only if the Streams > Advanced >
     *            Framerate (framerate) field is set to 29.970. This field works
     *            with the Streams > Advanced > Preprocessors > Deinterlacer
     *            field (deinterlace_mode) and the Streams > Advanced >
     *            Interlaced Mode field (interlace_mode) to identify the scan
     *            type for the output: Progressive, Interlaced, Hard Telecine or
     *            Soft Telecine. - Hard: produces 29.97i output from 23.976
     *            input. - Soft: produces 23.976; the player converts this
     *            output to 29.97i.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264Telecine
     */
    public H264Settings withTelecine(String telecine) {
        this.telecine = telecine;
        return this;
    }

    /**
     * This field applies only if the Streams > Advanced > Framerate (framerate)
     * field is set to 29.970. This field works with the Streams > Advanced >
     * Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
     * Advanced > Interlaced Mode field (interlace_mode) to identify the scan
     * type for the output: Progressive, Interlaced, Hard Telecine or Soft
     * Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft:
     * produces 23.976; the player converts this output to 29.97i.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SOFT, HARD
     *
     * @param telecine This field applies only if the Streams > Advanced >
     *            Framerate (framerate) field is set to 29.970. This field works
     *            with the Streams > Advanced > Preprocessors > Deinterlacer
     *            field (deinterlace_mode) and the Streams > Advanced >
     *            Interlaced Mode field (interlace_mode) to identify the scan
     *            type for the output: Progressive, Interlaced, Hard Telecine or
     *            Soft Telecine. - Hard: produces 29.97i output from 23.976
     *            input. - Soft: produces 23.976; the player converts this
     *            output to 29.97i.
     * @see H264Telecine
     */
    public void setTelecine(H264Telecine telecine) {
        this.telecine = telecine.toString();
    }

    /**
     * This field applies only if the Streams > Advanced > Framerate (framerate)
     * field is set to 29.970. This field works with the Streams > Advanced >
     * Preprocessors > Deinterlacer field (deinterlace_mode) and the Streams >
     * Advanced > Interlaced Mode field (interlace_mode) to identify the scan
     * type for the output: Progressive, Interlaced, Hard Telecine or Soft
     * Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft:
     * produces 23.976; the player converts this output to 29.97i.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, SOFT, HARD
     *
     * @param telecine This field applies only if the Streams > Advanced >
     *            Framerate (framerate) field is set to 29.970. This field works
     *            with the Streams > Advanced > Preprocessors > Deinterlacer
     *            field (deinterlace_mode) and the Streams > Advanced >
     *            Interlaced Mode field (interlace_mode) to identify the scan
     *            type for the output: Progressive, Interlaced, Hard Telecine or
     *            Soft Telecine. - Hard: produces 29.97i output from 23.976
     *            input. - Soft: produces 23.976; the player converts this
     *            output to 29.97i.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264Telecine
     */
    public H264Settings withTelecine(H264Telecine telecine) {
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
     * @see H264TemporalAdaptiveQuantization
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
     * @see H264TemporalAdaptiveQuantization
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
     * @see H264TemporalAdaptiveQuantization
     */
    public H264Settings withTemporalAdaptiveQuantization(String temporalAdaptiveQuantization) {
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
     * @see H264TemporalAdaptiveQuantization
     */
    public void setTemporalAdaptiveQuantization(
            H264TemporalAdaptiveQuantization temporalAdaptiveQuantization) {
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
     * @see H264TemporalAdaptiveQuantization
     */
    public H264Settings withTemporalAdaptiveQuantization(
            H264TemporalAdaptiveQuantization temporalAdaptiveQuantization) {
        this.temporalAdaptiveQuantization = temporalAdaptiveQuantization.toString();
        return this;
    }

    /**
     * Inserts timecode for each frame as 4 bytes of an unregistered SEI
     * message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Inserts timecode for each frame as 4 bytes of an unregistered SEI
     *         message.
     * @see H264UnregisteredSeiTimecode
     */
    public String getUnregisteredSeiTimecode() {
        return unregisteredSeiTimecode;
    }

    /**
     * Inserts timecode for each frame as 4 bytes of an unregistered SEI
     * message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param unregisteredSeiTimecode Inserts timecode for each frame as 4 bytes
     *            of an unregistered SEI message.
     * @see H264UnregisteredSeiTimecode
     */
    public void setUnregisteredSeiTimecode(String unregisteredSeiTimecode) {
        this.unregisteredSeiTimecode = unregisteredSeiTimecode;
    }

    /**
     * Inserts timecode for each frame as 4 bytes of an unregistered SEI
     * message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param unregisteredSeiTimecode Inserts timecode for each frame as 4 bytes
     *            of an unregistered SEI message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264UnregisteredSeiTimecode
     */
    public H264Settings withUnregisteredSeiTimecode(String unregisteredSeiTimecode) {
        this.unregisteredSeiTimecode = unregisteredSeiTimecode;
        return this;
    }

    /**
     * Inserts timecode for each frame as 4 bytes of an unregistered SEI
     * message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param unregisteredSeiTimecode Inserts timecode for each frame as 4 bytes
     *            of an unregistered SEI message.
     * @see H264UnregisteredSeiTimecode
     */
    public void setUnregisteredSeiTimecode(H264UnregisteredSeiTimecode unregisteredSeiTimecode) {
        this.unregisteredSeiTimecode = unregisteredSeiTimecode.toString();
    }

    /**
     * Inserts timecode for each frame as 4 bytes of an unregistered SEI
     * message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param unregisteredSeiTimecode Inserts timecode for each frame as 4 bytes
     *            of an unregistered SEI message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see H264UnregisteredSeiTimecode
     */
    public H264Settings withUnregisteredSeiTimecode(
            H264UnregisteredSeiTimecode unregisteredSeiTimecode) {
        this.unregisteredSeiTimecode = unregisteredSeiTimecode.toString();
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
        if (getEntropyEncoding() != null)
            sb.append("EntropyEncoding: " + getEntropyEncoding() + ",");
        if (getFieldEncoding() != null)
            sb.append("FieldEncoding: " + getFieldEncoding() + ",");
        if (getFlickerAdaptiveQuantization() != null)
            sb.append("FlickerAdaptiveQuantization: " + getFlickerAdaptiveQuantization() + ",");
        if (getFramerateControl() != null)
            sb.append("FramerateControl: " + getFramerateControl() + ",");
        if (getFramerateConversionAlgorithm() != null)
            sb.append("FramerateConversionAlgorithm: " + getFramerateConversionAlgorithm() + ",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: " + getFramerateDenominator() + ",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: " + getFramerateNumerator() + ",");
        if (getGopBReference() != null)
            sb.append("GopBReference: " + getGopBReference() + ",");
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
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: " + getMaxBitrate() + ",");
        if (getMinIInterval() != null)
            sb.append("MinIInterval: " + getMinIInterval() + ",");
        if (getNumberBFramesBetweenReferenceFrames() != null)
            sb.append("NumberBFramesBetweenReferenceFrames: "
                    + getNumberBFramesBetweenReferenceFrames() + ",");
        if (getNumberReferenceFrames() != null)
            sb.append("NumberReferenceFrames: " + getNumberReferenceFrames() + ",");
        if (getParControl() != null)
            sb.append("ParControl: " + getParControl() + ",");
        if (getParDenominator() != null)
            sb.append("ParDenominator: " + getParDenominator() + ",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: " + getParNumerator() + ",");
        if (getQualityTuningLevel() != null)
            sb.append("QualityTuningLevel: " + getQualityTuningLevel() + ",");
        if (getQvbrSettings() != null)
            sb.append("QvbrSettings: " + getQvbrSettings() + ",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: " + getRateControlMode() + ",");
        if (getRepeatPps() != null)
            sb.append("RepeatPps: " + getRepeatPps() + ",");
        if (getSceneChangeDetect() != null)
            sb.append("SceneChangeDetect: " + getSceneChangeDetect() + ",");
        if (getSlices() != null)
            sb.append("Slices: " + getSlices() + ",");
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
            sb.append("TemporalAdaptiveQuantization: " + getTemporalAdaptiveQuantization() + ",");
        if (getUnregisteredSeiTimecode() != null)
            sb.append("UnregisteredSeiTimecode: " + getUnregisteredSeiTimecode());
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
                + ((getEntropyEncoding() == null) ? 0 : getEntropyEncoding().hashCode());
        hashCode = prime * hashCode
                + ((getFieldEncoding() == null) ? 0 : getFieldEncoding().hashCode());
        hashCode = prime
                * hashCode
                + ((getFlickerAdaptiveQuantization() == null) ? 0
                        : getFlickerAdaptiveQuantization().hashCode());
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
                + ((getGopBReference() == null) ? 0 : getGopBReference().hashCode());
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
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getMinIInterval() == null) ? 0 : getMinIInterval().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberBFramesBetweenReferenceFrames() == null) ? 0
                        : getNumberBFramesBetweenReferenceFrames().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberReferenceFrames() == null) ? 0 : getNumberReferenceFrames().hashCode());
        hashCode = prime * hashCode + ((getParControl() == null) ? 0 : getParControl().hashCode());
        hashCode = prime * hashCode
                + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode
                + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode
                + ((getQualityTuningLevel() == null) ? 0 : getQualityTuningLevel().hashCode());
        hashCode = prime * hashCode
                + ((getQvbrSettings() == null) ? 0 : getQvbrSettings().hashCode());
        hashCode = prime * hashCode
                + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getRepeatPps() == null) ? 0 : getRepeatPps().hashCode());
        hashCode = prime * hashCode
                + ((getSceneChangeDetect() == null) ? 0 : getSceneChangeDetect().hashCode());
        hashCode = prime * hashCode + ((getSlices() == null) ? 0 : getSlices().hashCode());
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
        hashCode = prime
                * hashCode
                + ((getUnregisteredSeiTimecode() == null) ? 0 : getUnregisteredSeiTimecode()
                        .hashCode());
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
        if (other.getEntropyEncoding() == null ^ this.getEntropyEncoding() == null)
            return false;
        if (other.getEntropyEncoding() != null
                && other.getEntropyEncoding().equals(this.getEntropyEncoding()) == false)
            return false;
        if (other.getFieldEncoding() == null ^ this.getFieldEncoding() == null)
            return false;
        if (other.getFieldEncoding() != null
                && other.getFieldEncoding().equals(this.getFieldEncoding()) == false)
            return false;
        if (other.getFlickerAdaptiveQuantization() == null
                ^ this.getFlickerAdaptiveQuantization() == null)
            return false;
        if (other.getFlickerAdaptiveQuantization() != null
                && other.getFlickerAdaptiveQuantization().equals(
                        this.getFlickerAdaptiveQuantization()) == false)
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
        if (other.getNumberReferenceFrames() == null ^ this.getNumberReferenceFrames() == null)
            return false;
        if (other.getNumberReferenceFrames() != null
                && other.getNumberReferenceFrames().equals(this.getNumberReferenceFrames()) == false)
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
        if (other.getQvbrSettings() == null ^ this.getQvbrSettings() == null)
            return false;
        if (other.getQvbrSettings() != null
                && other.getQvbrSettings().equals(this.getQvbrSettings()) == false)
            return false;
        if (other.getRateControlMode() == null ^ this.getRateControlMode() == null)
            return false;
        if (other.getRateControlMode() != null
                && other.getRateControlMode().equals(this.getRateControlMode()) == false)
            return false;
        if (other.getRepeatPps() == null ^ this.getRepeatPps() == null)
            return false;
        if (other.getRepeatPps() != null
                && other.getRepeatPps().equals(this.getRepeatPps()) == false)
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
        if (other.getUnregisteredSeiTimecode() == null ^ this.getUnregisteredSeiTimecode() == null)
            return false;
        if (other.getUnregisteredSeiTimecode() != null
                && other.getUnregisteredSeiTimecode().equals(this.getUnregisteredSeiTimecode()) == false)
            return false;
        return true;
    }
}
