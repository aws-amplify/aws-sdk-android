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
 * Required when you set Codec, under VideoDescription>CodecSettings to the
 * value AV1.
 */
public class Av1Settings implements Serializable {
    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH, HIGHER, MAX
     */
    private String adaptiveQuantization;

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
     * When set to INTERPOLATE, produces smoother motion during frame rate
     * conversion.
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
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateNumerator to specify the numerator of this fraction. In
     * this example, use 24000 for the value of FramerateNumerator. When you use
     * the console for transcode jobs that use frame rate conversion, provide
     * the value as a decimal number for Framerate. In this example, specify
     * 23.976.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer framerateNumerator;

    /**
     * Specify the GOP length (keyframe interval) in frames. With AV1,
     * MediaConvert doesn't support GOP length in seconds. This value must be
     * greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x),
     * where x is an integer value.
     */
    private Double gopSize;

    /**
     * Maximum bitrate in bits/second. For example, enter five megabits per
     * second as 5000000. Required when Rate control mode is QVBR.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 1152000000<br/>
     */
    private Integer maxBitrate;

    /**
     * Specify the number of B-frames. With AV1, MediaConvert supports only 7 or
     * 15.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>7 - 15<br/>
     */
    private Integer numberBFramesBetweenReferenceFrames;

    /**
     * Settings for quality-defined variable bitrate encoding with the AV1
     * codec. Required when you set Rate control mode to QVBR. Not valid when
     * you set Rate control mode to a value other than QVBR, or when you don't
     * define Rate control mode.
     */
    private Av1QvbrSettings qvbrSettings;

    /**
     * 'With AV1 outputs, for rate control mode, MediaConvert supports only
     * quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QVBR
     */
    private String rateControlMode;

    /**
     * Specify the number of slices per picture. This value must be 1, 2, 4, 8,
     * 16, or 32. For progressive pictures, this value must be less than or
     * equal to the number of macroblock rows. For interlaced pictures, this
     * value must be less than or equal to half the number of macroblock rows.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 32<br/>
     */
    private Integer slices;

    /**
     * Adjust quantization within each frame based on spatial variation of
     * content complexity.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String spatialAdaptiveQuantization;

    /**
     * Adaptive quantization. Allows intra-frame quantizers to vary to improve
     * visual quality.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, LOW, MEDIUM, HIGH, HIGHER, MAX
     *
     * @return Adaptive quantization. Allows intra-frame quantizers to vary to
     *         improve visual quality.
     * @see Av1AdaptiveQuantization
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
     * @see Av1AdaptiveQuantization
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
     * @see Av1AdaptiveQuantization
     */
    public Av1Settings withAdaptiveQuantization(String adaptiveQuantization) {
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
     * @see Av1AdaptiveQuantization
     */
    public void setAdaptiveQuantization(Av1AdaptiveQuantization adaptiveQuantization) {
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
     * @see Av1AdaptiveQuantization
     */
    public Av1Settings withAdaptiveQuantization(Av1AdaptiveQuantization adaptiveQuantization) {
        this.adaptiveQuantization = adaptiveQuantization.toString();
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
     * @see Av1FramerateControl
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
     * @see Av1FramerateControl
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
     * @see Av1FramerateControl
     */
    public Av1Settings withFramerateControl(String framerateControl) {
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
     * @see Av1FramerateControl
     */
    public void setFramerateControl(Av1FramerateControl framerateControl) {
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
     * @see Av1FramerateControl
     */
    public Av1Settings withFramerateControl(Av1FramerateControl framerateControl) {
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
     * @see Av1FramerateConversionAlgorithm
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
     * @see Av1FramerateConversionAlgorithm
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
     * @see Av1FramerateConversionAlgorithm
     */
    public Av1Settings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
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
     * @see Av1FramerateConversionAlgorithm
     */
    public void setFramerateConversionAlgorithm(
            Av1FramerateConversionAlgorithm framerateConversionAlgorithm) {
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
     * @see Av1FramerateConversionAlgorithm
     */
    public Av1Settings withFramerateConversionAlgorithm(
            Av1FramerateConversionAlgorithm framerateConversionAlgorithm) {
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
    public Av1Settings withFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
        return this;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateNumerator to specify the numerator of this fraction. In
     * this example, use 24000 for the value of FramerateNumerator. When you use
     * the console for transcode jobs that use frame rate conversion, provide
     * the value as a decimal number for Framerate. In this example, specify
     * 23.976.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return When you use the API for transcode jobs that use frame rate
     *         conversion, specify the frame rate as a fraction. For example,
     *         24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the
     *         numerator of this fraction. In this example, use 24000 for the
     *         value of FramerateNumerator. When you use the console for
     *         transcode jobs that use frame rate conversion, provide the value
     *         as a decimal number for Framerate. In this example, specify
     *         23.976.
     */
    public Integer getFramerateNumerator() {
        return framerateNumerator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateNumerator to specify the numerator of this fraction. In
     * this example, use 24000 for the value of FramerateNumerator. When you use
     * the console for transcode jobs that use frame rate conversion, provide
     * the value as a decimal number for Framerate. In this example, specify
     * 23.976.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param framerateNumerator When you use the API for transcode jobs that
     *            use frame rate conversion, specify the frame rate as a
     *            fraction. For example, 24000 / 1001 = 23.976 fps. Use
     *            FramerateNumerator to specify the numerator of this fraction.
     *            In this example, use 24000 for the value of
     *            FramerateNumerator. When you use the console for transcode
     *            jobs that use frame rate conversion, provide the value as a
     *            decimal number for Framerate. In this example, specify 23.976.
     */
    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateNumerator to specify the numerator of this fraction. In
     * this example, use 24000 for the value of FramerateNumerator. When you use
     * the console for transcode jobs that use frame rate conversion, provide
     * the value as a decimal number for Framerate. In this example, specify
     * 23.976.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param framerateNumerator When you use the API for transcode jobs that
     *            use frame rate conversion, specify the frame rate as a
     *            fraction. For example, 24000 / 1001 = 23.976 fps. Use
     *            FramerateNumerator to specify the numerator of this fraction.
     *            In this example, use 24000 for the value of
     *            FramerateNumerator. When you use the console for transcode
     *            jobs that use frame rate conversion, provide the value as a
     *            decimal number for Framerate. In this example, specify 23.976.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Av1Settings withFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
        return this;
    }

    /**
     * Specify the GOP length (keyframe interval) in frames. With AV1,
     * MediaConvert doesn't support GOP length in seconds. This value must be
     * greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x),
     * where x is an integer value.
     *
     * @return Specify the GOP length (keyframe interval) in frames. With AV1,
     *         MediaConvert doesn't support GOP length in seconds. This value
     *         must be greater than zero and preferably equal to 1 +
     *         ((numberBFrames + 1) * x), where x is an integer value.
     */
    public Double getGopSize() {
        return gopSize;
    }

    /**
     * Specify the GOP length (keyframe interval) in frames. With AV1,
     * MediaConvert doesn't support GOP length in seconds. This value must be
     * greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x),
     * where x is an integer value.
     *
     * @param gopSize Specify the GOP length (keyframe interval) in frames. With
     *            AV1, MediaConvert doesn't support GOP length in seconds. This
     *            value must be greater than zero and preferably equal to 1 +
     *            ((numberBFrames + 1) * x), where x is an integer value.
     */
    public void setGopSize(Double gopSize) {
        this.gopSize = gopSize;
    }

    /**
     * Specify the GOP length (keyframe interval) in frames. With AV1,
     * MediaConvert doesn't support GOP length in seconds. This value must be
     * greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x),
     * where x is an integer value.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gopSize Specify the GOP length (keyframe interval) in frames. With
     *            AV1, MediaConvert doesn't support GOP length in seconds. This
     *            value must be greater than zero and preferably equal to 1 +
     *            ((numberBFrames + 1) * x), where x is an integer value.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Av1Settings withGopSize(Double gopSize) {
        this.gopSize = gopSize;
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
    public Av1Settings withMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
        return this;
    }

    /**
     * Specify the number of B-frames. With AV1, MediaConvert supports only 7 or
     * 15.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>7 - 15<br/>
     *
     * @return Specify the number of B-frames. With AV1, MediaConvert supports
     *         only 7 or 15.
     */
    public Integer getNumberBFramesBetweenReferenceFrames() {
        return numberBFramesBetweenReferenceFrames;
    }

    /**
     * Specify the number of B-frames. With AV1, MediaConvert supports only 7 or
     * 15.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>7 - 15<br/>
     *
     * @param numberBFramesBetweenReferenceFrames Specify the number of
     *            B-frames. With AV1, MediaConvert supports only 7 or 15.
     */
    public void setNumberBFramesBetweenReferenceFrames(Integer numberBFramesBetweenReferenceFrames) {
        this.numberBFramesBetweenReferenceFrames = numberBFramesBetweenReferenceFrames;
    }

    /**
     * Specify the number of B-frames. With AV1, MediaConvert supports only 7 or
     * 15.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>7 - 15<br/>
     *
     * @param numberBFramesBetweenReferenceFrames Specify the number of
     *            B-frames. With AV1, MediaConvert supports only 7 or 15.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Av1Settings withNumberBFramesBetweenReferenceFrames(
            Integer numberBFramesBetweenReferenceFrames) {
        this.numberBFramesBetweenReferenceFrames = numberBFramesBetweenReferenceFrames;
        return this;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the AV1
     * codec. Required when you set Rate control mode to QVBR. Not valid when
     * you set Rate control mode to a value other than QVBR, or when you don't
     * define Rate control mode.
     *
     * @return Settings for quality-defined variable bitrate encoding with the
     *         AV1 codec. Required when you set Rate control mode to QVBR. Not
     *         valid when you set Rate control mode to a value other than QVBR,
     *         or when you don't define Rate control mode.
     */
    public Av1QvbrSettings getQvbrSettings() {
        return qvbrSettings;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the AV1
     * codec. Required when you set Rate control mode to QVBR. Not valid when
     * you set Rate control mode to a value other than QVBR, or when you don't
     * define Rate control mode.
     *
     * @param qvbrSettings Settings for quality-defined variable bitrate
     *            encoding with the AV1 codec. Required when you set Rate
     *            control mode to QVBR. Not valid when you set Rate control mode
     *            to a value other than QVBR, or when you don't define Rate
     *            control mode.
     */
    public void setQvbrSettings(Av1QvbrSettings qvbrSettings) {
        this.qvbrSettings = qvbrSettings;
    }

    /**
     * Settings for quality-defined variable bitrate encoding with the AV1
     * codec. Required when you set Rate control mode to QVBR. Not valid when
     * you set Rate control mode to a value other than QVBR, or when you don't
     * define Rate control mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param qvbrSettings Settings for quality-defined variable bitrate
     *            encoding with the AV1 codec. Required when you set Rate
     *            control mode to QVBR. Not valid when you set Rate control mode
     *            to a value other than QVBR, or when you don't define Rate
     *            control mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Av1Settings withQvbrSettings(Av1QvbrSettings qvbrSettings) {
        this.qvbrSettings = qvbrSettings;
        return this;
    }

    /**
     * 'With AV1 outputs, for rate control mode, MediaConvert supports only
     * quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QVBR
     *
     * @return 'With AV1 outputs, for rate control mode, MediaConvert supports
     *         only quality-defined variable bitrate (QVBR). You can''t use CBR
     *         or VBR.'
     * @see Av1RateControlMode
     */
    public String getRateControlMode() {
        return rateControlMode;
    }

    /**
     * 'With AV1 outputs, for rate control mode, MediaConvert supports only
     * quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QVBR
     *
     * @param rateControlMode 'With AV1 outputs, for rate control mode,
     *            MediaConvert supports only quality-defined variable bitrate
     *            (QVBR). You can''t use CBR or VBR.'
     * @see Av1RateControlMode
     */
    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * 'With AV1 outputs, for rate control mode, MediaConvert supports only
     * quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QVBR
     *
     * @param rateControlMode 'With AV1 outputs, for rate control mode,
     *            MediaConvert supports only quality-defined variable bitrate
     *            (QVBR). You can''t use CBR or VBR.'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Av1RateControlMode
     */
    public Av1Settings withRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
        return this;
    }

    /**
     * 'With AV1 outputs, for rate control mode, MediaConvert supports only
     * quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QVBR
     *
     * @param rateControlMode 'With AV1 outputs, for rate control mode,
     *            MediaConvert supports only quality-defined variable bitrate
     *            (QVBR). You can''t use CBR or VBR.'
     * @see Av1RateControlMode
     */
    public void setRateControlMode(Av1RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
    }

    /**
     * 'With AV1 outputs, for rate control mode, MediaConvert supports only
     * quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>QVBR
     *
     * @param rateControlMode 'With AV1 outputs, for rate control mode,
     *            MediaConvert supports only quality-defined variable bitrate
     *            (QVBR). You can''t use CBR or VBR.'
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Av1RateControlMode
     */
    public Av1Settings withRateControlMode(Av1RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
        return this;
    }

    /**
     * Specify the number of slices per picture. This value must be 1, 2, 4, 8,
     * 16, or 32. For progressive pictures, this value must be less than or
     * equal to the number of macroblock rows. For interlaced pictures, this
     * value must be less than or equal to half the number of macroblock rows.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 32<br/>
     *
     * @return Specify the number of slices per picture. This value must be 1,
     *         2, 4, 8, 16, or 32. For progressive pictures, this value must be
     *         less than or equal to the number of macroblock rows. For
     *         interlaced pictures, this value must be less than or equal to
     *         half the number of macroblock rows.
     */
    public Integer getSlices() {
        return slices;
    }

    /**
     * Specify the number of slices per picture. This value must be 1, 2, 4, 8,
     * 16, or 32. For progressive pictures, this value must be less than or
     * equal to the number of macroblock rows. For interlaced pictures, this
     * value must be less than or equal to half the number of macroblock rows.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 32<br/>
     *
     * @param slices Specify the number of slices per picture. This value must
     *            be 1, 2, 4, 8, 16, or 32. For progressive pictures, this value
     *            must be less than or equal to the number of macroblock rows.
     *            For interlaced pictures, this value must be less than or equal
     *            to half the number of macroblock rows.
     */
    public void setSlices(Integer slices) {
        this.slices = slices;
    }

    /**
     * Specify the number of slices per picture. This value must be 1, 2, 4, 8,
     * 16, or 32. For progressive pictures, this value must be less than or
     * equal to the number of macroblock rows. For interlaced pictures, this
     * value must be less than or equal to half the number of macroblock rows.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 32<br/>
     *
     * @param slices Specify the number of slices per picture. This value must
     *            be 1, 2, 4, 8, 16, or 32. For progressive pictures, this value
     *            must be less than or equal to the number of macroblock rows.
     *            For interlaced pictures, this value must be less than or equal
     *            to half the number of macroblock rows.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Av1Settings withSlices(Integer slices) {
        this.slices = slices;
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
     * @see Av1SpatialAdaptiveQuantization
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
     * @see Av1SpatialAdaptiveQuantization
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
     * @see Av1SpatialAdaptiveQuantization
     */
    public Av1Settings withSpatialAdaptiveQuantization(String spatialAdaptiveQuantization) {
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
     * @see Av1SpatialAdaptiveQuantization
     */
    public void setSpatialAdaptiveQuantization(
            Av1SpatialAdaptiveQuantization spatialAdaptiveQuantization) {
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
     * @see Av1SpatialAdaptiveQuantization
     */
    public Av1Settings withSpatialAdaptiveQuantization(
            Av1SpatialAdaptiveQuantization spatialAdaptiveQuantization) {
        this.spatialAdaptiveQuantization = spatialAdaptiveQuantization.toString();
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
        if (getFramerateControl() != null)
            sb.append("FramerateControl: " + getFramerateControl() + ",");
        if (getFramerateConversionAlgorithm() != null)
            sb.append("FramerateConversionAlgorithm: " + getFramerateConversionAlgorithm() + ",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: " + getFramerateDenominator() + ",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: " + getFramerateNumerator() + ",");
        if (getGopSize() != null)
            sb.append("GopSize: " + getGopSize() + ",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: " + getMaxBitrate() + ",");
        if (getNumberBFramesBetweenReferenceFrames() != null)
            sb.append("NumberBFramesBetweenReferenceFrames: "
                    + getNumberBFramesBetweenReferenceFrames() + ",");
        if (getQvbrSettings() != null)
            sb.append("QvbrSettings: " + getQvbrSettings() + ",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: " + getRateControlMode() + ",");
        if (getSlices() != null)
            sb.append("Slices: " + getSlices() + ",");
        if (getSpatialAdaptiveQuantization() != null)
            sb.append("SpatialAdaptiveQuantization: " + getSpatialAdaptiveQuantization());
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
                + ((getFramerateControl() == null) ? 0 : getFramerateControl().hashCode());
        hashCode = prime
                * hashCode
                + ((getFramerateConversionAlgorithm() == null) ? 0
                        : getFramerateConversionAlgorithm().hashCode());
        hashCode = prime * hashCode
                + ((getFramerateDenominator() == null) ? 0 : getFramerateDenominator().hashCode());
        hashCode = prime * hashCode
                + ((getFramerateNumerator() == null) ? 0 : getFramerateNumerator().hashCode());
        hashCode = prime * hashCode + ((getGopSize() == null) ? 0 : getGopSize().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberBFramesBetweenReferenceFrames() == null) ? 0
                        : getNumberBFramesBetweenReferenceFrames().hashCode());
        hashCode = prime * hashCode
                + ((getQvbrSettings() == null) ? 0 : getQvbrSettings().hashCode());
        hashCode = prime * hashCode
                + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        hashCode = prime * hashCode + ((getSlices() == null) ? 0 : getSlices().hashCode());
        hashCode = prime
                * hashCode
                + ((getSpatialAdaptiveQuantization() == null) ? 0
                        : getSpatialAdaptiveQuantization().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Av1Settings == false)
            return false;
        Av1Settings other = (Av1Settings) obj;

        if (other.getAdaptiveQuantization() == null ^ this.getAdaptiveQuantization() == null)
            return false;
        if (other.getAdaptiveQuantization() != null
                && other.getAdaptiveQuantization().equals(this.getAdaptiveQuantization()) == false)
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
        if (other.getGopSize() == null ^ this.getGopSize() == null)
            return false;
        if (other.getGopSize() != null && other.getGopSize().equals(this.getGopSize()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null
                && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
            return false;
        if (other.getNumberBFramesBetweenReferenceFrames() == null
                ^ this.getNumberBFramesBetweenReferenceFrames() == null)
            return false;
        if (other.getNumberBFramesBetweenReferenceFrames() != null
                && other.getNumberBFramesBetweenReferenceFrames().equals(
                        this.getNumberBFramesBetweenReferenceFrames()) == false)
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
        if (other.getSlices() == null ^ this.getSlices() == null)
            return false;
        if (other.getSlices() != null && other.getSlices().equals(this.getSlices()) == false)
            return false;
        if (other.getSpatialAdaptiveQuantization() == null
                ^ this.getSpatialAdaptiveQuantization() == null)
            return false;
        if (other.getSpatialAdaptiveQuantization() != null
                && other.getSpatialAdaptiveQuantization().equals(
                        this.getSpatialAdaptiveQuantization()) == false)
            return false;
        return true;
    }
}
