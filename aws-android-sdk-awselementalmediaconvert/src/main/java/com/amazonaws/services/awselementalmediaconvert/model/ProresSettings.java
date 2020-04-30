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
 * value PRORES.
 */
public class ProresSettings implements Serializable {
    /**
     * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes
     * codec to use for this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLE_PRORES_422, APPLE_PRORES_422_HQ,
     * APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY
     */
    private String codecProfile;

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
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer framerateDenominator;

    /**
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateNumerator to specify the numerator of this fraction. In
     * this example, use 24000 for the value of FramerateNumerator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer framerateNumerator;

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
     * Use (ProresParControl) to specify how the service determines the pixel
     * aspect ratio. Set to Follow source (INITIALIZE_FROM_SOURCE) to use the
     * pixel aspect ratio from the input. To specify a different pixel aspect
     * ratio: Using the console, choose it from the dropdown menu. Using the
     * API, set ProresParControl to (SPECIFIED) and provide for (ParNumerator)
     * and (ParDenominator).
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
     * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled
     * as 25fps, and audio is sped up correspondingly.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String slowPal;

    /**
     * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HARD
     */
    private String telecine;

    /**
     * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes
     * codec to use for this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLE_PRORES_422, APPLE_PRORES_422_HQ,
     * APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY
     *
     * @return Use Profile (ProResCodecProfile) to specifiy the type of Apple
     *         ProRes codec to use for this output.
     * @see ProresCodecProfile
     */
    public String getCodecProfile() {
        return codecProfile;
    }

    /**
     * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes
     * codec to use for this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLE_PRORES_422, APPLE_PRORES_422_HQ,
     * APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY
     *
     * @param codecProfile Use Profile (ProResCodecProfile) to specifiy the type
     *            of Apple ProRes codec to use for this output.
     * @see ProresCodecProfile
     */
    public void setCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
    }

    /**
     * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes
     * codec to use for this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLE_PRORES_422, APPLE_PRORES_422_HQ,
     * APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY
     *
     * @param codecProfile Use Profile (ProResCodecProfile) to specifiy the type
     *            of Apple ProRes codec to use for this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProresCodecProfile
     */
    public ProresSettings withCodecProfile(String codecProfile) {
        this.codecProfile = codecProfile;
        return this;
    }

    /**
     * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes
     * codec to use for this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLE_PRORES_422, APPLE_PRORES_422_HQ,
     * APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY
     *
     * @param codecProfile Use Profile (ProResCodecProfile) to specifiy the type
     *            of Apple ProRes codec to use for this output.
     * @see ProresCodecProfile
     */
    public void setCodecProfile(ProresCodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
    }

    /**
     * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes
     * codec to use for this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>APPLE_PRORES_422, APPLE_PRORES_422_HQ,
     * APPLE_PRORES_422_LT, APPLE_PRORES_422_PROXY
     *
     * @param codecProfile Use Profile (ProResCodecProfile) to specifiy the type
     *            of Apple ProRes codec to use for this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProresCodecProfile
     */
    public ProresSettings withCodecProfile(ProresCodecProfile codecProfile) {
        this.codecProfile = codecProfile.toString();
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
     * @see ProresFramerateControl
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
     * @see ProresFramerateControl
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
     * @see ProresFramerateControl
     */
    public ProresSettings withFramerateControl(String framerateControl) {
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
     * @see ProresFramerateControl
     */
    public void setFramerateControl(ProresFramerateControl framerateControl) {
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
     * @see ProresFramerateControl
     */
    public ProresSettings withFramerateControl(ProresFramerateControl framerateControl) {
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
     * @see ProresFramerateConversionAlgorithm
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
     * @see ProresFramerateConversionAlgorithm
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
     * @see ProresFramerateConversionAlgorithm
     */
    public ProresSettings withFramerateConversionAlgorithm(String framerateConversionAlgorithm) {
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
     * @see ProresFramerateConversionAlgorithm
     */
    public void setFramerateConversionAlgorithm(
            ProresFramerateConversionAlgorithm framerateConversionAlgorithm) {
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
     * @see ProresFramerateConversionAlgorithm
     */
    public ProresSettings withFramerateConversionAlgorithm(
            ProresFramerateConversionAlgorithm framerateConversionAlgorithm) {
        this.framerateConversionAlgorithm = framerateConversionAlgorithm.toString();
        return this;
    }

    /**
     * Frame rate denominator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
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
     * <b>Range: </b>1 - 2147483647<br/>
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
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param framerateDenominator Frame rate denominator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProresSettings withFramerateDenominator(Integer framerateDenominator) {
        this.framerateDenominator = framerateDenominator;
        return this;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateNumerator to specify the numerator of this fraction. In
     * this example, use 24000 for the value of FramerateNumerator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return When you use the API for transcode jobs that use frame rate
     *         conversion, specify the frame rate as a fraction. For example,
     *         24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the
     *         numerator of this fraction. In this example, use 24000 for the
     *         value of FramerateNumerator.
     */
    public Integer getFramerateNumerator() {
        return framerateNumerator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateNumerator to specify the numerator of this fraction. In
     * this example, use 24000 for the value of FramerateNumerator.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param framerateNumerator When you use the API for transcode jobs that
     *            use frame rate conversion, specify the frame rate as a
     *            fraction. For example, 24000 / 1001 = 23.976 fps. Use
     *            FramerateNumerator to specify the numerator of this fraction.
     *            In this example, use 24000 for the value of
     *            FramerateNumerator.
     */
    public void setFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
    }

    /**
     * When you use the API for transcode jobs that use frame rate conversion,
     * specify the frame rate as a fraction. For example, 24000 / 1001 = 23.976
     * fps. Use FramerateNumerator to specify the numerator of this fraction. In
     * this example, use 24000 for the value of FramerateNumerator.
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
     *            FramerateNumerator.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProresSettings withFramerateNumerator(Integer framerateNumerator) {
        this.framerateNumerator = framerateNumerator;
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
     * @see ProresInterlaceMode
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
     * @see ProresInterlaceMode
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
     * @see ProresInterlaceMode
     */
    public ProresSettings withInterlaceMode(String interlaceMode) {
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
     * @see ProresInterlaceMode
     */
    public void setInterlaceMode(ProresInterlaceMode interlaceMode) {
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
     * @see ProresInterlaceMode
     */
    public ProresSettings withInterlaceMode(ProresInterlaceMode interlaceMode) {
        this.interlaceMode = interlaceMode.toString();
        return this;
    }

    /**
     * Use (ProresParControl) to specify how the service determines the pixel
     * aspect ratio. Set to Follow source (INITIALIZE_FROM_SOURCE) to use the
     * pixel aspect ratio from the input. To specify a different pixel aspect
     * ratio: Using the console, choose it from the dropdown menu. Using the
     * API, set ProresParControl to (SPECIFIED) and provide for (ParNumerator)
     * and (ParDenominator).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @return Use (ProresParControl) to specify how the service determines the
     *         pixel aspect ratio. Set to Follow source (INITIALIZE_FROM_SOURCE)
     *         to use the pixel aspect ratio from the input. To specify a
     *         different pixel aspect ratio: Using the console, choose it from
     *         the dropdown menu. Using the API, set ProresParControl to
     *         (SPECIFIED) and provide for (ParNumerator) and (ParDenominator).
     * @see ProresParControl
     */
    public String getParControl() {
        return parControl;
    }

    /**
     * Use (ProresParControl) to specify how the service determines the pixel
     * aspect ratio. Set to Follow source (INITIALIZE_FROM_SOURCE) to use the
     * pixel aspect ratio from the input. To specify a different pixel aspect
     * ratio: Using the console, choose it from the dropdown menu. Using the
     * API, set ProresParControl to (SPECIFIED) and provide for (ParNumerator)
     * and (ParDenominator).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Use (ProresParControl) to specify how the service
     *            determines the pixel aspect ratio. Set to Follow source
     *            (INITIALIZE_FROM_SOURCE) to use the pixel aspect ratio from
     *            the input. To specify a different pixel aspect ratio: Using
     *            the console, choose it from the dropdown menu. Using the API,
     *            set ProresParControl to (SPECIFIED) and provide for
     *            (ParNumerator) and (ParDenominator).
     * @see ProresParControl
     */
    public void setParControl(String parControl) {
        this.parControl = parControl;
    }

    /**
     * Use (ProresParControl) to specify how the service determines the pixel
     * aspect ratio. Set to Follow source (INITIALIZE_FROM_SOURCE) to use the
     * pixel aspect ratio from the input. To specify a different pixel aspect
     * ratio: Using the console, choose it from the dropdown menu. Using the
     * API, set ProresParControl to (SPECIFIED) and provide for (ParNumerator)
     * and (ParDenominator).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Use (ProresParControl) to specify how the service
     *            determines the pixel aspect ratio. Set to Follow source
     *            (INITIALIZE_FROM_SOURCE) to use the pixel aspect ratio from
     *            the input. To specify a different pixel aspect ratio: Using
     *            the console, choose it from the dropdown menu. Using the API,
     *            set ProresParControl to (SPECIFIED) and provide for
     *            (ParNumerator) and (ParDenominator).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProresParControl
     */
    public ProresSettings withParControl(String parControl) {
        this.parControl = parControl;
        return this;
    }

    /**
     * Use (ProresParControl) to specify how the service determines the pixel
     * aspect ratio. Set to Follow source (INITIALIZE_FROM_SOURCE) to use the
     * pixel aspect ratio from the input. To specify a different pixel aspect
     * ratio: Using the console, choose it from the dropdown menu. Using the
     * API, set ProresParControl to (SPECIFIED) and provide for (ParNumerator)
     * and (ParDenominator).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Use (ProresParControl) to specify how the service
     *            determines the pixel aspect ratio. Set to Follow source
     *            (INITIALIZE_FROM_SOURCE) to use the pixel aspect ratio from
     *            the input. To specify a different pixel aspect ratio: Using
     *            the console, choose it from the dropdown menu. Using the API,
     *            set ProresParControl to (SPECIFIED) and provide for
     *            (ParNumerator) and (ParDenominator).
     * @see ProresParControl
     */
    public void setParControl(ProresParControl parControl) {
        this.parControl = parControl.toString();
    }

    /**
     * Use (ProresParControl) to specify how the service determines the pixel
     * aspect ratio. Set to Follow source (INITIALIZE_FROM_SOURCE) to use the
     * pixel aspect ratio from the input. To specify a different pixel aspect
     * ratio: Using the console, choose it from the dropdown menu. Using the
     * API, set ProresParControl to (SPECIFIED) and provide for (ParNumerator)
     * and (ParDenominator).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INITIALIZE_FROM_SOURCE, SPECIFIED
     *
     * @param parControl Use (ProresParControl) to specify how the service
     *            determines the pixel aspect ratio. Set to Follow source
     *            (INITIALIZE_FROM_SOURCE) to use the pixel aspect ratio from
     *            the input. To specify a different pixel aspect ratio: Using
     *            the console, choose it from the dropdown menu. Using the API,
     *            set ProresParControl to (SPECIFIED) and provide for
     *            (ParNumerator) and (ParDenominator).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProresParControl
     */
    public ProresSettings withParControl(ProresParControl parControl) {
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
    public ProresSettings withParDenominator(Integer parDenominator) {
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
    public ProresSettings withParNumerator(Integer parNumerator) {
        this.parNumerator = parNumerator;
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
     * @see ProresSlowPal
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
     * @see ProresSlowPal
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
     * @see ProresSlowPal
     */
    public ProresSettings withSlowPal(String slowPal) {
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
     * @see ProresSlowPal
     */
    public void setSlowPal(ProresSlowPal slowPal) {
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
     * @see ProresSlowPal
     */
    public ProresSettings withSlowPal(ProresSlowPal slowPal) {
        this.slowPal = slowPal.toString();
        return this;
    }

    /**
     * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HARD
     *
     * @return Only use Telecine (ProresTelecine) when you set Framerate
     *         (Framerate) to 29.970. Set Telecine (ProresTelecine) to Hard
     *         (hard) to produce a 29.97i output from a 23.976 input. Set it to
     *         Soft (soft) to produce 23.976 output and leave converstion to the
     *         player.
     * @see ProresTelecine
     */
    public String getTelecine() {
        return telecine;
    }

    /**
     * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HARD
     *
     * @param telecine Only use Telecine (ProresTelecine) when you set Framerate
     *            (Framerate) to 29.970. Set Telecine (ProresTelecine) to Hard
     *            (hard) to produce a 29.97i output from a 23.976 input. Set it
     *            to Soft (soft) to produce 23.976 output and leave converstion
     *            to the player.
     * @see ProresTelecine
     */
    public void setTelecine(String telecine) {
        this.telecine = telecine;
    }

    /**
     * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HARD
     *
     * @param telecine Only use Telecine (ProresTelecine) when you set Framerate
     *            (Framerate) to 29.970. Set Telecine (ProresTelecine) to Hard
     *            (hard) to produce a 29.97i output from a 23.976 input. Set it
     *            to Soft (soft) to produce 23.976 output and leave converstion
     *            to the player.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProresTelecine
     */
    public ProresSettings withTelecine(String telecine) {
        this.telecine = telecine;
        return this;
    }

    /**
     * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HARD
     *
     * @param telecine Only use Telecine (ProresTelecine) when you set Framerate
     *            (Framerate) to 29.970. Set Telecine (ProresTelecine) to Hard
     *            (hard) to produce a 29.97i output from a 23.976 input. Set it
     *            to Soft (soft) to produce 23.976 output and leave converstion
     *            to the player.
     * @see ProresTelecine
     */
    public void setTelecine(ProresTelecine telecine) {
        this.telecine = telecine.toString();
    }

    /**
     * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to
     * 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i
     * output from a 23.976 input. Set it to Soft (soft) to produce 23.976
     * output and leave converstion to the player.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, HARD
     *
     * @param telecine Only use Telecine (ProresTelecine) when you set Framerate
     *            (Framerate) to 29.970. Set Telecine (ProresTelecine) to Hard
     *            (hard) to produce a 29.97i output from a 23.976 input. Set it
     *            to Soft (soft) to produce 23.976 output and leave converstion
     *            to the player.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProresTelecine
     */
    public ProresSettings withTelecine(ProresTelecine telecine) {
        this.telecine = telecine.toString();
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
        if (getCodecProfile() != null)
            sb.append("CodecProfile: " + getCodecProfile() + ",");
        if (getFramerateControl() != null)
            sb.append("FramerateControl: " + getFramerateControl() + ",");
        if (getFramerateConversionAlgorithm() != null)
            sb.append("FramerateConversionAlgorithm: " + getFramerateConversionAlgorithm() + ",");
        if (getFramerateDenominator() != null)
            sb.append("FramerateDenominator: " + getFramerateDenominator() + ",");
        if (getFramerateNumerator() != null)
            sb.append("FramerateNumerator: " + getFramerateNumerator() + ",");
        if (getInterlaceMode() != null)
            sb.append("InterlaceMode: " + getInterlaceMode() + ",");
        if (getParControl() != null)
            sb.append("ParControl: " + getParControl() + ",");
        if (getParDenominator() != null)
            sb.append("ParDenominator: " + getParDenominator() + ",");
        if (getParNumerator() != null)
            sb.append("ParNumerator: " + getParNumerator() + ",");
        if (getSlowPal() != null)
            sb.append("SlowPal: " + getSlowPal() + ",");
        if (getTelecine() != null)
            sb.append("Telecine: " + getTelecine());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCodecProfile() == null) ? 0 : getCodecProfile().hashCode());
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
                + ((getInterlaceMode() == null) ? 0 : getInterlaceMode().hashCode());
        hashCode = prime * hashCode + ((getParControl() == null) ? 0 : getParControl().hashCode());
        hashCode = prime * hashCode
                + ((getParDenominator() == null) ? 0 : getParDenominator().hashCode());
        hashCode = prime * hashCode
                + ((getParNumerator() == null) ? 0 : getParNumerator().hashCode());
        hashCode = prime * hashCode + ((getSlowPal() == null) ? 0 : getSlowPal().hashCode());
        hashCode = prime * hashCode + ((getTelecine() == null) ? 0 : getTelecine().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProresSettings == false)
            return false;
        ProresSettings other = (ProresSettings) obj;

        if (other.getCodecProfile() == null ^ this.getCodecProfile() == null)
            return false;
        if (other.getCodecProfile() != null
                && other.getCodecProfile().equals(this.getCodecProfile()) == false)
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
        if (other.getInterlaceMode() == null ^ this.getInterlaceMode() == null)
            return false;
        if (other.getInterlaceMode() != null
                && other.getInterlaceMode().equals(this.getInterlaceMode()) == false)
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
        if (other.getSlowPal() == null ^ this.getSlowPal() == null)
            return false;
        if (other.getSlowPal() != null && other.getSlowPal().equals(this.getSlowPal()) == false)
            return false;
        if (other.getTelecine() == null ^ this.getTelecine() == null)
            return false;
        if (other.getTelecine() != null && other.getTelecine().equals(this.getTelecine()) == false)
            return false;
        return true;
    }
}
