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
 * value VP9.
 */
public class Vp9Settings implements Serializable {
    /**
     * Target bitrate in bits/second. For example, enter five megabits per
     * second as 5000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 480000000<br/>
     */
    private Integer bitrate;

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
     * default behavior is to use Drop duplicate (DUPLICATE_DROP) conversion.
     * When you choose Interpolate (INTERPOLATE) instead, the conversion
     * produces smoother motion.
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
     * GOP Length (keyframe interval) in frames. Must be greater than zero.
     */
    private Double gopSize;

    /**
     * Size of buffer (HRD buffer model) in bits. For example, enter five
     * megabits as 5000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 47185920<br/>
     */
    private Integer hrdBufferSize;

    /**
     * Ignore this setting unless you set qualityTuningLevel to MULTI_PASS.
     * Optional. Specify the maximum bitrate in bits/second. For example, enter
     * five megabits per second as 5000000. The default behavior uses twice the
     * target bitrate as the maximum bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 480000000<br/>
     */
    private Integer maxBitrate;

    /**
     * Optional. Specify how the service determines the pixel aspect ratio for
     * this output. The default behavior is to use the same pixel aspect ratio
     * as your input video.
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
     * behavior is faster, lower quality, multi-pass encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_PASS, MULTI_PASS_HQ
     */
    private String qualityTuningLevel;

    /**
     * With the VP9 codec, you can use only the variable bitrate (VBR) rate
     * control mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR
     */
    private String rateControlMode;

    /**
     * Target bitrate in bits/second. For example, enter five megabits per
     * second as 5000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 480000000<br/>
     *
     * @return Target bitrate in bits/second. For example, enter five megabits
     *         per second as 5000000.
     */
    public Integer getBitrate() {
        return bitrate;
    }

    /**
     * Target bitrate in bits/second. For example, enter five megabits per
     * second as 5000000.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 480000000<br/>
     *
     * @param bitrate Target bitrate in bits/second. For example, enter five
     *            megabits per second as 5000000.
     */
    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    /**
     * Target bitrate in bits/second. For example, enter five megabits per
     * second as 5000000.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 480000000<br/>
     *
     * @param bitrate Target bitrate in bits/second. For example, enter five
     *            megabits per second as 5000000.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vp9Settings withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
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
     * @see Vp9FramerateControl
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
     * @see Vp9FramerateControl
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
     * @see Vp9FramerateControl
     */
    public Vp9Settings withFramerateControl(String framerateControl) {
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
     * @see Vp9FramerateControl
     */
    public void setFramerateControl(Vp9FramerateControl framerateControl) {
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
     * @see Vp9FramerateControl
     */
    public Vp9Settings withFramerateControl(Vp9FramerateControl framerateControl) {
        this.framerateControl = framerateControl.toString();
        return this;
    }

    /**
     * Optional. Specify how the transcoder performs framerate conversion. The
     * default behavior is to use Drop duplicate (DUPLICATE_DROP) conversion.
     * When you choose Interpolate (INTERPOLATE) instead, the conversion
     * produces smoother motion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @return Optional. Specify how the transcoder performs framerate
     *         conversion. The default behavior is to use Drop duplicate
     *         (DUPLICATE_DROP) conversion. When you choose Interpolate
     *         (INTERPOLATE) instead, the conversion produces smoother motion.
     * @see Vp9FramerateConversionAlgorithm
     */
    public String getFramerateConversionAlgorithm() {
        return framerateConversionAlgorithm;
    }

    /**
     * Optional. Specify how the transcoder performs framerate conversion. The
     * default behavior is to use Drop duplicate (DUPLICATE_DROP) conversion.
     * When you choose Interpolate (INTERPOLATE) instead, the conversion
     * produces smoother motion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm Optional. Specify how the transcoder
     *            performs framerate conversion. The default behavior is to use
     *            Drop duplicate (DUPLICATE_DROP) conversion. When you choose
     *            Interpolate (INTERPOLATE) instead, the conversion produces
     *            smoother motion.
     * @see Vp9FramerateConversionAlgorithm
     */
    public void setFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
    }

    /**
     * Optional. Specify how the transcoder performs framerate conversion. The
     * default behavior is to use Drop duplicate (DUPLICATE_DROP) conversion.
     * When you choose Interpolate (INTERPOLATE) instead, the conversion
     * produces smoother motion.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm Optional. Specify how the transcoder
     *            performs framerate conversion. The default behavior is to use
     *            Drop duplicate (DUPLICATE_DROP) conversion. When you choose
     *            Interpolate (INTERPOLATE) instead, the conversion produces
     *            smoother motion.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Vp9FramerateConversionAlgorithm
     */
    public Vp9Settings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm;
        return this;
    }

    /**
     * Optional. Specify how the transcoder performs framerate conversion. The
     * default behavior is to use Drop duplicate (DUPLICATE_DROP) conversion.
     * When you choose Interpolate (INTERPOLATE) instead, the conversion
     * produces smoother motion.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm Optional. Specify how the transcoder
     *            performs framerate conversion. The default behavior is to use
     *            Drop duplicate (DUPLICATE_DROP) conversion. When you choose
     *            Interpolate (INTERPOLATE) instead, the conversion produces
     *            smoother motion.
     * @see Vp9FramerateConversionAlgorithm
     */
    public void setFramerateConversionAlgorithm(
            Vp9FramerateConversionAlgorithm framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm.toString();
    }

    /**
     * Optional. Specify how the transcoder performs framerate conversion. The
     * default behavior is to use Drop duplicate (DUPLICATE_DROP) conversion.
     * When you choose Interpolate (INTERPOLATE) instead, the conversion
     * produces smoother motion.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DUPLICATE_DROP, INTERPOLATE
     *
     * @param framerateConversionAlgorithm Optional. Specify how the transcoder
     *            performs framerate conversion. The default behavior is to use
     *            Drop duplicate (DUPLICATE_DROP) conversion. When you choose
     *            Interpolate (INTERPOLATE) instead, the conversion produces
     *            smoother motion.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Vp9FramerateConversionAlgorithm
     */
    public Vp9Settings withFramerateConversionAlgorithm(
            Vp9FramerateConversionAlgorithm framerateConversionAlgorithm) {
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
    public Vp9Settings withFramerateDenominator(Integer framerateDenominator) {
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
    public Vp9Settings withFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
        return this;
    }

    /**
     * GOP Length (keyframe interval) in frames. Must be greater than zero.
     *
     * @return GOP Length (keyframe interval) in frames. Must be greater than
     *         zero.
     */
    public Double getGopSize() {
        return gopSize;
    }

    /**
     * GOP Length (keyframe interval) in frames. Must be greater than zero.
     *
     * @param gopSize GOP Length (keyframe interval) in frames. Must be greater
     *            than zero.
     */
    public void setGopSize(Double gopSize) {
        this.gopSize = gopSize;
    }

    /**
     * GOP Length (keyframe interval) in frames. Must be greater than zero.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gopSize GOP Length (keyframe interval) in frames. Must be greater
     *            than zero.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vp9Settings withGopSize(Double gopSize) {
        this.gopSize = gopSize;
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
    public Vp9Settings withHrdBufferSize(Integer hrdBufferSize) {
        this.hrdBufferSize = hrdBufferSize;
        return this;
    }

    /**
     * Ignore this setting unless you set qualityTuningLevel to MULTI_PASS.
     * Optional. Specify the maximum bitrate in bits/second. For example, enter
     * five megabits per second as 5000000. The default behavior uses twice the
     * target bitrate as the maximum bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 480000000<br/>
     *
     * @return Ignore this setting unless you set qualityTuningLevel to
     *         MULTI_PASS. Optional. Specify the maximum bitrate in bits/second.
     *         For example, enter five megabits per second as 5000000. The
     *         default behavior uses twice the target bitrate as the maximum
     *         bitrate.
     */
    public Integer getMaxBitrate() {
        return maxBitrate;
    }

    /**
     * Ignore this setting unless you set qualityTuningLevel to MULTI_PASS.
     * Optional. Specify the maximum bitrate in bits/second. For example, enter
     * five megabits per second as 5000000. The default behavior uses twice the
     * target bitrate as the maximum bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 480000000<br/>
     *
     * @param maxBitrate Ignore this setting unless you set qualityTuningLevel
     *            to MULTI_PASS. Optional. Specify the maximum bitrate in
     *            bits/second. For example, enter five megabits per second as
     *            5000000. The default behavior uses twice the target bitrate as
     *            the maximum bitrate.
     */
    public void setMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
    }

    /**
     * Ignore this setting unless you set qualityTuningLevel to MULTI_PASS.
     * Optional. Specify the maximum bitrate in bits/second. For example, enter
     * five megabits per second as 5000000. The default behavior uses twice the
     * target bitrate as the maximum bitrate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 480000000<br/>
     *
     * @param maxBitrate Ignore this setting unless you set qualityTuningLevel
     *            to MULTI_PASS. Optional. Specify the maximum bitrate in
     *            bits/second. For example, enter five megabits per second as
     *            5000000. The default behavior uses twice the target bitrate as
     *            the maximum bitrate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Vp9Settings withMaxBitrate(Integer maxBitrate) {
        this.maxBitrate = maxBitrate;
        return this;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio for
     * this output. The default behavior is to use the same pixel aspect ratio
     * as your input video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @return Optional. Specify how the service determines the pixel aspect
     *         ratio for this output. The default behavior is to use the same
     *         pixel aspect ratio as your input video.
     * @see Vp9ParControl
     */
    public String getParControl() {
        return parControl;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio for
     * this output. The default behavior is to use the same pixel aspect ratio
     * as your input video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Optional. Specify how the service determines the pixel
     *            aspect ratio for this output. The default behavior is to use
     *            the same pixel aspect ratio as your input video.
     * @see Vp9ParControl
     */
    public void setParControl(String parControl) {
        this.parControl = parControl;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio for
     * this output. The default behavior is to use the same pixel aspect ratio
     * as your input video.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Optional. Specify how the service determines the pixel
     *            aspect ratio for this output. The default behavior is to use
     *            the same pixel aspect ratio as your input video.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Vp9ParControl
     */
    public Vp9Settings withParControl(String parControl) {
        this.parControl = parControl;
        return this;
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio for
     * this output. The default behavior is to use the same pixel aspect ratio
     * as your input video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Optional. Specify how the service determines the pixel
     *            aspect ratio for this output. The default behavior is to use
     *            the same pixel aspect ratio as your input video.
     * @see Vp9ParControl
     */
    public void setParControl(Vp9ParControl parControl) {
        this.parControl = parControl.toString();
    }

    /**
     * Optional. Specify how the service determines the pixel aspect ratio for
     * this output. The default behavior is to use the same pixel aspect ratio
     * as your input video.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Optional. Specify how the service determines the pixel
     *            aspect ratio for this output. The default behavior is to use
     *            the same pixel aspect ratio as your input video.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Vp9ParControl
     */
    public Vp9Settings withParControl(Vp9ParControl parControl) {
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
    public Vp9Settings withParDenominator(Integer parDenominator) {
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
    public Vp9Settings withParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
        return this;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
     * want to trade off encoding speed for output video quality. The default
     * behavior is faster, lower quality, multi-pass encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_PASS, MULTI_PASS_HQ
     *
     * @return Optional. Use Quality tuning level (qualityTuningLevel) to choose
     *         how you want to trade off encoding speed for output video
     *         quality. The default behavior is faster, lower quality,
     *         multi-pass encoding.
     * @see Vp9QualityTuningLevel
     */
    public String getQualityTuningLevel() {
        return qualityTuningLevel;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
     * want to trade off encoding speed for output video quality. The default
     * behavior is faster, lower quality, multi-pass encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_PASS, MULTI_PASS_HQ
     *
     * @param qualityTuningLevel Optional. Use Quality tuning level
     *            (qualityTuningLevel) to choose how you want to trade off
     *            encoding speed for output video quality. The default behavior
     *            is faster, lower quality, multi-pass encoding.
     * @see Vp9QualityTuningLevel
     */
    public void setQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
     * want to trade off encoding speed for output video quality. The default
     * behavior is faster, lower quality, multi-pass encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_PASS, MULTI_PASS_HQ
     *
     * @param qualityTuningLevel Optional. Use Quality tuning level
     *            (qualityTuningLevel) to choose how you want to trade off
     *            encoding speed for output video quality. The default behavior
     *            is faster, lower quality, multi-pass encoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Vp9QualityTuningLevel
     */
    public Vp9Settings withQualityTuningLevel(String qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel;
        return this;
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
     * want to trade off encoding speed for output video quality. The default
     * behavior is faster, lower quality, multi-pass encoding.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_PASS, MULTI_PASS_HQ
     *
     * @param qualityTuningLevel Optional. Use Quality tuning level
     *            (qualityTuningLevel) to choose how you want to trade off
     *            encoding speed for output video quality. The default behavior
     *            is faster, lower quality, multi-pass encoding.
     * @see Vp9QualityTuningLevel
     */
    public void setQualityTuningLevel(Vp9QualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
    }

    /**
     * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you
     * want to trade off encoding speed for output video quality. The default
     * behavior is faster, lower quality, multi-pass encoding.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MULTI_PASS, MULTI_PASS_HQ
     *
     * @param qualityTuningLevel Optional. Use Quality tuning level
     *            (qualityTuningLevel) to choose how you want to trade off
     *            encoding speed for output video quality. The default behavior
     *            is faster, lower quality, multi-pass encoding.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Vp9QualityTuningLevel
     */
    public Vp9Settings withQualityTuningLevel(Vp9QualityTuningLevel qualityTuningLevel) {
        this.qualityTuningLevel = qualityTuningLevel.toString();
        return this;
    }

    /**
     * With the VP9 codec, you can use only the variable bitrate (VBR) rate
     * control mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR
     *
     * @return With the VP9 codec, you can use only the variable bitrate (VBR)
     *         rate control mode.
     * @see Vp9RateControlMode
     */
    public String getRateControlMode() {
        return rateControlMode;
    }

    /**
     * With the VP9 codec, you can use only the variable bitrate (VBR) rate
     * control mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR
     *
     * @param rateControlMode With the VP9 codec, you can use only the variable
     *            bitrate (VBR) rate control mode.
     * @see Vp9RateControlMode
     */
    public void setRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
    }

    /**
     * With the VP9 codec, you can use only the variable bitrate (VBR) rate
     * control mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR
     *
     * @param rateControlMode With the VP9 codec, you can use only the variable
     *            bitrate (VBR) rate control mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Vp9RateControlMode
     */
    public Vp9Settings withRateControlMode(String rateControlMode) {
        this.rateControlMode = rateControlMode;
        return this;
    }

    /**
     * With the VP9 codec, you can use only the variable bitrate (VBR) rate
     * control mode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR
     *
     * @param rateControlMode With the VP9 codec, you can use only the variable
     *            bitrate (VBR) rate control mode.
     * @see Vp9RateControlMode
     */
    public void setRateControlMode(Vp9RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
    }

    /**
     * With the VP9 codec, you can use only the variable bitrate (VBR) rate
     * control mode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VBR
     *
     * @param rateControlMode With the VP9 codec, you can use only the variable
     *            bitrate (VBR) rate control mode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Vp9RateControlMode
     */
    public Vp9Settings withRateControlMode(Vp9RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode.toString();
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
        if (getBitrate() != null)
            sb.append("Bitrate: " + getBitrate() + ",");
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
        if (getHrdBufferSize() != null)
            sb.append("HrdBufferSize: " + getHrdBufferSize() + ",");
        if (getMaxBitrate() != null)
            sb.append("MaxBitrate: " + getMaxBitrate() + ",");
        if (getParControl() != null)
            sb.append("ParControl: " + getParControl() + ",");
        if (getParDenominator() != null)
            sb.append("ParDenominator: " + getParDenominator() + ",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: " + getParNumerator() + ",");
        if (getQualityTuningLevel() != null)
            sb.append("QualityTuningLevel: " + getQualityTuningLevel() + ",");
        if (getRateControlMode() != null)
            sb.append("RateControlMode: " + getRateControlMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBitrate() == null) ? 0 : getBitrate().hashCode());
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
        hashCode = prime * hashCode
                + ((getHrdBufferSize() == null) ? 0 : getHrdBufferSize().hashCode());
        hashCode = prime * hashCode + ((getMaxBitrate() == null) ? 0 : getMaxBitrate().hashCode());
        hashCode = prime * hashCode + ((getParControl() == null) ? 0 : getParControl().hashCode());
        hashCode = prime * hashCode
                + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode
                + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode
                + ((getQualityTuningLevel() == null) ? 0 : getQualityTuningLevel().hashCode());
        hashCode = prime * hashCode
                + ((getRateControlMode() == null) ? 0 : getRateControlMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Vp9Settings == false)
            return false;
        Vp9Settings other = (Vp9Settings) obj;

        if (other.getBitrate() == null ^ this.getBitrate() == null)
            return false;
        if (other.getBitrate() != null && other.getBitrate().equals(this.getBitrate()) == false)
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
        if (other.getHrdBufferSize() == null ^ this.getHrdBufferSize() == null)
            return false;
        if (other.getHrdBufferSize() != null
                && other.getHrdBufferSize().equals(this.getHrdBufferSize()) == false)
            return false;
        if (other.getMaxBitrate() == null ^ this.getMaxBitrate() == null)
            return false;
        if (other.getMaxBitrate() != null
                && other.getMaxBitrate().equals(this.getMaxBitrate()) == false)
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
        return true;
    }
}
