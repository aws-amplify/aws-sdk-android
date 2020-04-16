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
 * Settings for video outputs
 */
public class VideoDescription implements Serializable {
    /**
     * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert
     * AFD signaling (AfdSignaling) to specify whether the service includes AFD
     * values in the output video data and what those values are. * Choose None
     * to remove all AFD values from this output. * Choose Fixed to ignore input
     * AFD values and instead encode the value specified in the job. * Choose
     * Auto to calculate output AFD values based on the input AFD scaler data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, FIXED
     */
    private String afdSignaling;

    /**
     * The anti-alias filter is automatically applied to all outputs. The
     * service no longer accepts the value DISABLED for AntiAlias. If you
     * specify that in your job, the service will ignore the setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String antiAlias;

    /**
     * Video codec settings, (CodecSettings) under (VideoDescription), contains
     * the group of settings related to video encoding. The settings in this
     * group vary depending on the value that you choose for Video codec
     * (Codec). For each codec enum that you choose, define the corresponding
     * settings object. The following lists the codec enum, settings object
     * pairs. * FRAME_CAPTURE, FrameCaptureSettings * AV1, Av1Settings * H_264,
     * H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES,
     * ProresSettings
     */
    private VideoCodecSettings codecSettings;

    /**
     * Choose Insert (INSERT) for this setting to include color metadata in this
     * output. Choose Ignore (IGNORE) to exclude color metadata from this
     * output. If you don't specify a value, the service sets this to Insert by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     */
    private String colorMetadata;

    /**
     * Use Cropping selection (crop) to specify the video area that the service
     * will include in the output video frame.
     */
    private Rectangle crop;

    /**
     * Applies only to 29.97 fps outputs. When this feature is enabled, the
     * service will use drop-frame timecode on outputs. If it is not possible to
     * use drop-frame timecode, the system will fall back to non-drop-frame.
     * This setting is enabled by default when Timecode insertion
     * (TimecodeInsertion) is enabled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     */
    private String dropFrameTimecode;

    /**
     * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use
     * Fixed (FixedAfd) to specify a four-bit AFD value which the service will
     * write on all frames of this video output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     */
    private Integer fixedAfd;

    /**
     * Use the Height (Height) setting to define the video resolution height for
     * this output. Specify in pixels. If you don't provide a value here, the
     * service will use the input height.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8192<br/>
     */
    private Integer height;

    /**
     * Use Selection placement (position) to define the video area in your
     * output frame. The area outside of the rectangle that you specify here is
     * black.
     */
    private Rectangle position;

    /**
     * Use Respond to AFD (RespondToAfd) to specify how the service changes the
     * video itself in response to AFD values in the input. * Choose Respond to
     * clip the input video frame according to the AFD value, input display
     * aspect ratio, and output display aspect ratio. * Choose Passthrough to
     * include the input AFD values. Do not choose this when AfdSignaling is set
     * to (NONE). A preferred implementation of this workflow is to set
     * RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to
     * remove all input AFD values from this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESPOND, PASSTHROUGH
     */
    private String respondToAfd;

    /**
     * Specify how the service handles outputs that have a different aspect
     * ratio from the input aspect ratio. Choose Stretch to output
     * (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit.
     * Keep the setting Default (DEFAULT) to have the service letterbox your
     * video instead. This setting overrides any value that you specify for the
     * setting Selection placement (position) in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     */
    private String scalingBehavior;

    /**
     * Use Sharpness (Sharpness) setting to specify the strength of
     * anti-aliasing. This setting changes the width of the anti-alias filter
     * kernel used for scaling. Sharpness only applies if your output resolution
     * is different from your input resolution. 0 is the softest setting, 100
     * the sharpest, and 50 recommended for most content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer sharpness;

    /**
     * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable
     * Timecode insertion when the input frame rate is identical to the output
     * frame rate. To include timecodes in this output, set Timecode insertion
     * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to
     * DISABLED. Default is DISABLED. When the service inserts timecodes in an
     * output, by default, it uses any embedded timecodes from the input. If
     * none are present, the service will set the timecode for the first output
     * frame to zero. To change this default behavior, adjust the settings under
     * Timecode configuration (TimecodeConfig). In the console, these settings
     * are located under Job > Job settings > Timecode configuration. Note -
     * Timecode source under input settings (InputTimecodeSource) does not
     * affect the timecodes that are inserted in the output. Source under Job
     * settings > Timecode configuration (TimecodeSource) does.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     */
    private String timecodeInsertion;

    /**
     * Find additional transcoding features under Preprocessors
     * (VideoPreprocessors). Enable the features at each output individually.
     * These features are disabled by default.
     */
    private VideoPreprocessor videoPreprocessors;

    /**
     * Use Width (Width) to define the video resolution width, in pixels, for
     * this output. If you don't provide a value here, the service will use the
     * input width.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8192<br/>
     */
    private Integer width;

    /**
     * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert
     * AFD signaling (AfdSignaling) to specify whether the service includes AFD
     * values in the output video data and what those values are. * Choose None
     * to remove all AFD values from this output. * Choose Fixed to ignore input
     * AFD values and instead encode the value specified in the job. * Choose
     * Auto to calculate output AFD values based on the input AFD scaler data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, FIXED
     *
     * @return This setting only applies to H.264, H.265, and MPEG2 outputs. Use
     *         Insert AFD signaling (AfdSignaling) to specify whether the
     *         service includes AFD values in the output video data and what
     *         those values are. * Choose None to remove all AFD values from
     *         this output. * Choose Fixed to ignore input AFD values and
     *         instead encode the value specified in the job. * Choose Auto to
     *         calculate output AFD values based on the input AFD scaler data.
     * @see AfdSignaling
     */
    public String getAfdSignaling() {
        return afdSignaling;
    }

    /**
     * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert
     * AFD signaling (AfdSignaling) to specify whether the service includes AFD
     * values in the output video data and what those values are. * Choose None
     * to remove all AFD values from this output. * Choose Fixed to ignore input
     * AFD values and instead encode the value specified in the job. * Choose
     * Auto to calculate output AFD values based on the input AFD scaler data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, FIXED
     *
     * @param afdSignaling This setting only applies to H.264, H.265, and MPEG2
     *            outputs. Use Insert AFD signaling (AfdSignaling) to specify
     *            whether the service includes AFD values in the output video
     *            data and what those values are. * Choose None to remove all
     *            AFD values from this output. * Choose Fixed to ignore input
     *            AFD values and instead encode the value specified in the job.
     *            * Choose Auto to calculate output AFD values based on the
     *            input AFD scaler data.
     * @see AfdSignaling
     */
    public void setAfdSignaling(String afdSignaling) {
        this.afdSignaling = afdSignaling;
    }

    /**
     * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert
     * AFD signaling (AfdSignaling) to specify whether the service includes AFD
     * values in the output video data and what those values are. * Choose None
     * to remove all AFD values from this output. * Choose Fixed to ignore input
     * AFD values and instead encode the value specified in the job. * Choose
     * Auto to calculate output AFD values based on the input AFD scaler data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, FIXED
     *
     * @param afdSignaling This setting only applies to H.264, H.265, and MPEG2
     *            outputs. Use Insert AFD signaling (AfdSignaling) to specify
     *            whether the service includes AFD values in the output video
     *            data and what those values are. * Choose None to remove all
     *            AFD values from this output. * Choose Fixed to ignore input
     *            AFD values and instead encode the value specified in the job.
     *            * Choose Auto to calculate output AFD values based on the
     *            input AFD scaler data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AfdSignaling
     */
    public VideoDescription withAfdSignaling(String afdSignaling) {
        this.afdSignaling = afdSignaling;
        return this;
    }

    /**
     * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert
     * AFD signaling (AfdSignaling) to specify whether the service includes AFD
     * values in the output video data and what those values are. * Choose None
     * to remove all AFD values from this output. * Choose Fixed to ignore input
     * AFD values and instead encode the value specified in the job. * Choose
     * Auto to calculate output AFD values based on the input AFD scaler data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, FIXED
     *
     * @param afdSignaling This setting only applies to H.264, H.265, and MPEG2
     *            outputs. Use Insert AFD signaling (AfdSignaling) to specify
     *            whether the service includes AFD values in the output video
     *            data and what those values are. * Choose None to remove all
     *            AFD values from this output. * Choose Fixed to ignore input
     *            AFD values and instead encode the value specified in the job.
     *            * Choose Auto to calculate output AFD values based on the
     *            input AFD scaler data.
     * @see AfdSignaling
     */
    public void setAfdSignaling(AfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
    }

    /**
     * This setting only applies to H.264, H.265, and MPEG2 outputs. Use Insert
     * AFD signaling (AfdSignaling) to specify whether the service includes AFD
     * values in the output video data and what those values are. * Choose None
     * to remove all AFD values from this output. * Choose Fixed to ignore input
     * AFD values and instead encode the value specified in the job. * Choose
     * Auto to calculate output AFD values based on the input AFD scaler data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, AUTO, FIXED
     *
     * @param afdSignaling This setting only applies to H.264, H.265, and MPEG2
     *            outputs. Use Insert AFD signaling (AfdSignaling) to specify
     *            whether the service includes AFD values in the output video
     *            data and what those values are. * Choose None to remove all
     *            AFD values from this output. * Choose Fixed to ignore input
     *            AFD values and instead encode the value specified in the job.
     *            * Choose Auto to calculate output AFD values based on the
     *            input AFD scaler data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AfdSignaling
     */
    public VideoDescription withAfdSignaling(AfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
        return this;
    }

    /**
     * The anti-alias filter is automatically applied to all outputs. The
     * service no longer accepts the value DISABLED for AntiAlias. If you
     * specify that in your job, the service will ignore the setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return The anti-alias filter is automatically applied to all outputs.
     *         The service no longer accepts the value DISABLED for AntiAlias.
     *         If you specify that in your job, the service will ignore the
     *         setting.
     * @see AntiAlias
     */
    public String getAntiAlias() {
        return antiAlias;
    }

    /**
     * The anti-alias filter is automatically applied to all outputs. The
     * service no longer accepts the value DISABLED for AntiAlias. If you
     * specify that in your job, the service will ignore the setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param antiAlias The anti-alias filter is automatically applied to all
     *            outputs. The service no longer accepts the value DISABLED for
     *            AntiAlias. If you specify that in your job, the service will
     *            ignore the setting.
     * @see AntiAlias
     */
    public void setAntiAlias(String antiAlias) {
        this.antiAlias = antiAlias;
    }

    /**
     * The anti-alias filter is automatically applied to all outputs. The
     * service no longer accepts the value DISABLED for AntiAlias. If you
     * specify that in your job, the service will ignore the setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param antiAlias The anti-alias filter is automatically applied to all
     *            outputs. The service no longer accepts the value DISABLED for
     *            AntiAlias. If you specify that in your job, the service will
     *            ignore the setting.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AntiAlias
     */
    public VideoDescription withAntiAlias(String antiAlias) {
        this.antiAlias = antiAlias;
        return this;
    }

    /**
     * The anti-alias filter is automatically applied to all outputs. The
     * service no longer accepts the value DISABLED for AntiAlias. If you
     * specify that in your job, the service will ignore the setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param antiAlias The anti-alias filter is automatically applied to all
     *            outputs. The service no longer accepts the value DISABLED for
     *            AntiAlias. If you specify that in your job, the service will
     *            ignore the setting.
     * @see AntiAlias
     */
    public void setAntiAlias(AntiAlias antiAlias) {
        this.antiAlias = antiAlias.toString();
    }

    /**
     * The anti-alias filter is automatically applied to all outputs. The
     * service no longer accepts the value DISABLED for AntiAlias. If you
     * specify that in your job, the service will ignore the setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param antiAlias The anti-alias filter is automatically applied to all
     *            outputs. The service no longer accepts the value DISABLED for
     *            AntiAlias. If you specify that in your job, the service will
     *            ignore the setting.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AntiAlias
     */
    public VideoDescription withAntiAlias(AntiAlias antiAlias) {
        this.antiAlias = antiAlias.toString();
        return this;
    }

    /**
     * Video codec settings, (CodecSettings) under (VideoDescription), contains
     * the group of settings related to video encoding. The settings in this
     * group vary depending on the value that you choose for Video codec
     * (Codec). For each codec enum that you choose, define the corresponding
     * settings object. The following lists the codec enum, settings object
     * pairs. * FRAME_CAPTURE, FrameCaptureSettings * AV1, Av1Settings * H_264,
     * H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES,
     * ProresSettings
     *
     * @return Video codec settings, (CodecSettings) under (VideoDescription),
     *         contains the group of settings related to video encoding. The
     *         settings in this group vary depending on the value that you
     *         choose for Video codec (Codec). For each codec enum that you
     *         choose, define the corresponding settings object. The following
     *         lists the codec enum, settings object pairs. * FRAME_CAPTURE,
     *         FrameCaptureSettings * AV1, Av1Settings * H_264, H264Settings *
     *         H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES,
     *         ProresSettings
     */
    public VideoCodecSettings getCodecSettings() {
        return codecSettings;
    }

    /**
     * Video codec settings, (CodecSettings) under (VideoDescription), contains
     * the group of settings related to video encoding. The settings in this
     * group vary depending on the value that you choose for Video codec
     * (Codec). For each codec enum that you choose, define the corresponding
     * settings object. The following lists the codec enum, settings object
     * pairs. * FRAME_CAPTURE, FrameCaptureSettings * AV1, Av1Settings * H_264,
     * H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES,
     * ProresSettings
     *
     * @param codecSettings Video codec settings, (CodecSettings) under
     *            (VideoDescription), contains the group of settings related to
     *            video encoding. The settings in this group vary depending on
     *            the value that you choose for Video codec (Codec). For each
     *            codec enum that you choose, define the corresponding settings
     *            object. The following lists the codec enum, settings object
     *            pairs. * FRAME_CAPTURE, FrameCaptureSettings * AV1,
     *            Av1Settings * H_264, H264Settings * H_265, H265Settings *
     *            MPEG2, Mpeg2Settings * PRORES, ProresSettings
     */
    public void setCodecSettings(VideoCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
    }

    /**
     * Video codec settings, (CodecSettings) under (VideoDescription), contains
     * the group of settings related to video encoding. The settings in this
     * group vary depending on the value that you choose for Video codec
     * (Codec). For each codec enum that you choose, define the corresponding
     * settings object. The following lists the codec enum, settings object
     * pairs. * FRAME_CAPTURE, FrameCaptureSettings * AV1, Av1Settings * H_264,
     * H264Settings * H_265, H265Settings * MPEG2, Mpeg2Settings * PRORES,
     * ProresSettings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codecSettings Video codec settings, (CodecSettings) under
     *            (VideoDescription), contains the group of settings related to
     *            video encoding. The settings in this group vary depending on
     *            the value that you choose for Video codec (Codec). For each
     *            codec enum that you choose, define the corresponding settings
     *            object. The following lists the codec enum, settings object
     *            pairs. * FRAME_CAPTURE, FrameCaptureSettings * AV1,
     *            Av1Settings * H_264, H264Settings * H_265, H265Settings *
     *            MPEG2, Mpeg2Settings * PRORES, ProresSettings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withCodecSettings(VideoCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
        return this;
    }

    /**
     * Choose Insert (INSERT) for this setting to include color metadata in this
     * output. Choose Ignore (IGNORE) to exclude color metadata from this
     * output. If you don't specify a value, the service sets this to Insert by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     *
     * @return Choose Insert (INSERT) for this setting to include color metadata
     *         in this output. Choose Ignore (IGNORE) to exclude color metadata
     *         from this output. If you don't specify a value, the service sets
     *         this to Insert by default.
     * @see ColorMetadata
     */
    public String getColorMetadata() {
        return colorMetadata;
    }

    /**
     * Choose Insert (INSERT) for this setting to include color metadata in this
     * output. Choose Ignore (IGNORE) to exclude color metadata from this
     * output. If you don't specify a value, the service sets this to Insert by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     *
     * @param colorMetadata Choose Insert (INSERT) for this setting to include
     *            color metadata in this output. Choose Ignore (IGNORE) to
     *            exclude color metadata from this output. If you don't specify
     *            a value, the service sets this to Insert by default.
     * @see ColorMetadata
     */
    public void setColorMetadata(String colorMetadata) {
        this.colorMetadata = colorMetadata;
    }

    /**
     * Choose Insert (INSERT) for this setting to include color metadata in this
     * output. Choose Ignore (IGNORE) to exclude color metadata from this
     * output. If you don't specify a value, the service sets this to Insert by
     * default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     *
     * @param colorMetadata Choose Insert (INSERT) for this setting to include
     *            color metadata in this output. Choose Ignore (IGNORE) to
     *            exclude color metadata from this output. If you don't specify
     *            a value, the service sets this to Insert by default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColorMetadata
     */
    public VideoDescription withColorMetadata(String colorMetadata) {
        this.colorMetadata = colorMetadata;
        return this;
    }

    /**
     * Choose Insert (INSERT) for this setting to include color metadata in this
     * output. Choose Ignore (IGNORE) to exclude color metadata from this
     * output. If you don't specify a value, the service sets this to Insert by
     * default.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     *
     * @param colorMetadata Choose Insert (INSERT) for this setting to include
     *            color metadata in this output. Choose Ignore (IGNORE) to
     *            exclude color metadata from this output. If you don't specify
     *            a value, the service sets this to Insert by default.
     * @see ColorMetadata
     */
    public void setColorMetadata(ColorMetadata colorMetadata) {
        this.colorMetadata = colorMetadata.toString();
    }

    /**
     * Choose Insert (INSERT) for this setting to include color metadata in this
     * output. Choose Ignore (IGNORE) to exclude color metadata from this
     * output. If you don't specify a value, the service sets this to Insert by
     * default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IGNORE, INSERT
     *
     * @param colorMetadata Choose Insert (INSERT) for this setting to include
     *            color metadata in this output. Choose Ignore (IGNORE) to
     *            exclude color metadata from this output. If you don't specify
     *            a value, the service sets this to Insert by default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ColorMetadata
     */
    public VideoDescription withColorMetadata(ColorMetadata colorMetadata) {
        this.colorMetadata = colorMetadata.toString();
        return this;
    }

    /**
     * Use Cropping selection (crop) to specify the video area that the service
     * will include in the output video frame.
     *
     * @return Use Cropping selection (crop) to specify the video area that the
     *         service will include in the output video frame.
     */
    public Rectangle getCrop() {
        return crop;
    }

    /**
     * Use Cropping selection (crop) to specify the video area that the service
     * will include in the output video frame.
     *
     * @param crop Use Cropping selection (crop) to specify the video area that
     *            the service will include in the output video frame.
     */
    public void setCrop(Rectangle crop) {
        this.crop = crop;
    }

    /**
     * Use Cropping selection (crop) to specify the video area that the service
     * will include in the output video frame.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param crop Use Cropping selection (crop) to specify the video area that
     *            the service will include in the output video frame.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withCrop(Rectangle crop) {
        this.crop = crop;
        return this;
    }

    /**
     * Applies only to 29.97 fps outputs. When this feature is enabled, the
     * service will use drop-frame timecode on outputs. If it is not possible to
     * use drop-frame timecode, the system will fall back to non-drop-frame.
     * This setting is enabled by default when Timecode insertion
     * (TimecodeInsertion) is enabled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @return Applies only to 29.97 fps outputs. When this feature is enabled,
     *         the service will use drop-frame timecode on outputs. If it is not
     *         possible to use drop-frame timecode, the system will fall back to
     *         non-drop-frame. This setting is enabled by default when Timecode
     *         insertion (TimecodeInsertion) is enabled.
     * @see DropFrameTimecode
     */
    public String getDropFrameTimecode() {
        return dropFrameTimecode;
    }

    /**
     * Applies only to 29.97 fps outputs. When this feature is enabled, the
     * service will use drop-frame timecode on outputs. If it is not possible to
     * use drop-frame timecode, the system will fall back to non-drop-frame.
     * This setting is enabled by default when Timecode insertion
     * (TimecodeInsertion) is enabled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param dropFrameTimecode Applies only to 29.97 fps outputs. When this
     *            feature is enabled, the service will use drop-frame timecode
     *            on outputs. If it is not possible to use drop-frame timecode,
     *            the system will fall back to non-drop-frame. This setting is
     *            enabled by default when Timecode insertion (TimecodeInsertion)
     *            is enabled.
     * @see DropFrameTimecode
     */
    public void setDropFrameTimecode(String dropFrameTimecode) {
        this.dropFrameTimecode = dropFrameTimecode;
    }

    /**
     * Applies only to 29.97 fps outputs. When this feature is enabled, the
     * service will use drop-frame timecode on outputs. If it is not possible to
     * use drop-frame timecode, the system will fall back to non-drop-frame.
     * This setting is enabled by default when Timecode insertion
     * (TimecodeInsertion) is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param dropFrameTimecode Applies only to 29.97 fps outputs. When this
     *            feature is enabled, the service will use drop-frame timecode
     *            on outputs. If it is not possible to use drop-frame timecode,
     *            the system will fall back to non-drop-frame. This setting is
     *            enabled by default when Timecode insertion (TimecodeInsertion)
     *            is enabled.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DropFrameTimecode
     */
    public VideoDescription withDropFrameTimecode(String dropFrameTimecode) {
        this.dropFrameTimecode = dropFrameTimecode;
        return this;
    }

    /**
     * Applies only to 29.97 fps outputs. When this feature is enabled, the
     * service will use drop-frame timecode on outputs. If it is not possible to
     * use drop-frame timecode, the system will fall back to non-drop-frame.
     * This setting is enabled by default when Timecode insertion
     * (TimecodeInsertion) is enabled.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param dropFrameTimecode Applies only to 29.97 fps outputs. When this
     *            feature is enabled, the service will use drop-frame timecode
     *            on outputs. If it is not possible to use drop-frame timecode,
     *            the system will fall back to non-drop-frame. This setting is
     *            enabled by default when Timecode insertion (TimecodeInsertion)
     *            is enabled.
     * @see DropFrameTimecode
     */
    public void setDropFrameTimecode(DropFrameTimecode dropFrameTimecode) {
        this.dropFrameTimecode = dropFrameTimecode.toString();
    }

    /**
     * Applies only to 29.97 fps outputs. When this feature is enabled, the
     * service will use drop-frame timecode on outputs. If it is not possible to
     * use drop-frame timecode, the system will fall back to non-drop-frame.
     * This setting is enabled by default when Timecode insertion
     * (TimecodeInsertion) is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, ENABLED
     *
     * @param dropFrameTimecode Applies only to 29.97 fps outputs. When this
     *            feature is enabled, the service will use drop-frame timecode
     *            on outputs. If it is not possible to use drop-frame timecode,
     *            the system will fall back to non-drop-frame. This setting is
     *            enabled by default when Timecode insertion (TimecodeInsertion)
     *            is enabled.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DropFrameTimecode
     */
    public VideoDescription withDropFrameTimecode(DropFrameTimecode dropFrameTimecode) {
        this.dropFrameTimecode = dropFrameTimecode.toString();
        return this;
    }

    /**
     * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use
     * Fixed (FixedAfd) to specify a four-bit AFD value which the service will
     * write on all frames of this video output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     *
     * @return Applies only if you set AFD Signaling(AfdSignaling) to Fixed
     *         (FIXED). Use Fixed (FixedAfd) to specify a four-bit AFD value
     *         which the service will write on all frames of this video output.
     */
    public Integer getFixedAfd() {
        return fixedAfd;
    }

    /**
     * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use
     * Fixed (FixedAfd) to specify a four-bit AFD value which the service will
     * write on all frames of this video output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     *
     * @param fixedAfd Applies only if you set AFD Signaling(AfdSignaling) to
     *            Fixed (FIXED). Use Fixed (FixedAfd) to specify a four-bit AFD
     *            value which the service will write on all frames of this video
     *            output.
     */
    public void setFixedAfd(Integer fixedAfd) {
        this.fixedAfd = fixedAfd;
    }

    /**
     * Applies only if you set AFD Signaling(AfdSignaling) to Fixed (FIXED). Use
     * Fixed (FixedAfd) to specify a four-bit AFD value which the service will
     * write on all frames of this video output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 15<br/>
     *
     * @param fixedAfd Applies only if you set AFD Signaling(AfdSignaling) to
     *            Fixed (FIXED). Use Fixed (FixedAfd) to specify a four-bit AFD
     *            value which the service will write on all frames of this video
     *            output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withFixedAfd(Integer fixedAfd) {
        this.fixedAfd = fixedAfd;
        return this;
    }

    /**
     * Use the Height (Height) setting to define the video resolution height for
     * this output. Specify in pixels. If you don't provide a value here, the
     * service will use the input height.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8192<br/>
     *
     * @return Use the Height (Height) setting to define the video resolution
     *         height for this output. Specify in pixels. If you don't provide a
     *         value here, the service will use the input height.
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Use the Height (Height) setting to define the video resolution height for
     * this output. Specify in pixels. If you don't provide a value here, the
     * service will use the input height.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8192<br/>
     *
     * @param height Use the Height (Height) setting to define the video
     *            resolution height for this output. Specify in pixels. If you
     *            don't provide a value here, the service will use the input
     *            height.
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Use the Height (Height) setting to define the video resolution height for
     * this output. Specify in pixels. If you don't provide a value here, the
     * service will use the input height.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8192<br/>
     *
     * @param height Use the Height (Height) setting to define the video
     *            resolution height for this output. Specify in pixels. If you
     *            don't provide a value here, the service will use the input
     *            height.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * Use Selection placement (position) to define the video area in your
     * output frame. The area outside of the rectangle that you specify here is
     * black.
     *
     * @return Use Selection placement (position) to define the video area in
     *         your output frame. The area outside of the rectangle that you
     *         specify here is black.
     */
    public Rectangle getPosition() {
        return position;
    }

    /**
     * Use Selection placement (position) to define the video area in your
     * output frame. The area outside of the rectangle that you specify here is
     * black.
     *
     * @param position Use Selection placement (position) to define the video
     *            area in your output frame. The area outside of the rectangle
     *            that you specify here is black.
     */
    public void setPosition(Rectangle position) {
        this.position = position;
    }

    /**
     * Use Selection placement (position) to define the video area in your
     * output frame. The area outside of the rectangle that you specify here is
     * black.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param position Use Selection placement (position) to define the video
     *            area in your output frame. The area outside of the rectangle
     *            that you specify here is black.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withPosition(Rectangle position) {
        this.position = position;
        return this;
    }

    /**
     * Use Respond to AFD (RespondToAfd) to specify how the service changes the
     * video itself in response to AFD values in the input. * Choose Respond to
     * clip the input video frame according to the AFD value, input display
     * aspect ratio, and output display aspect ratio. * Choose Passthrough to
     * include the input AFD values. Do not choose this when AfdSignaling is set
     * to (NONE). A preferred implementation of this workflow is to set
     * RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to
     * remove all input AFD values from this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESPOND, PASSTHROUGH
     *
     * @return Use Respond to AFD (RespondToAfd) to specify how the service
     *         changes the video itself in response to AFD values in the input.
     *         * Choose Respond to clip the input video frame according to the
     *         AFD value, input display aspect ratio, and output display aspect
     *         ratio. * Choose Passthrough to include the input AFD values. Do
     *         not choose this when AfdSignaling is set to (NONE). A preferred
     *         implementation of this workflow is to set RespondToAfd to (NONE)
     *         and set AfdSignaling to (AUTO). * Choose None to remove all input
     *         AFD values from this output.
     * @see RespondToAfd
     */
    public String getRespondToAfd() {
        return respondToAfd;
    }

    /**
     * Use Respond to AFD (RespondToAfd) to specify how the service changes the
     * video itself in response to AFD values in the input. * Choose Respond to
     * clip the input video frame according to the AFD value, input display
     * aspect ratio, and output display aspect ratio. * Choose Passthrough to
     * include the input AFD values. Do not choose this when AfdSignaling is set
     * to (NONE). A preferred implementation of this workflow is to set
     * RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to
     * remove all input AFD values from this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESPOND, PASSTHROUGH
     *
     * @param respondToAfd Use Respond to AFD (RespondToAfd) to specify how the
     *            service changes the video itself in response to AFD values in
     *            the input. * Choose Respond to clip the input video frame
     *            according to the AFD value, input display aspect ratio, and
     *            output display aspect ratio. * Choose Passthrough to include
     *            the input AFD values. Do not choose this when AfdSignaling is
     *            set to (NONE). A preferred implementation of this workflow is
     *            to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO).
     *            * Choose None to remove all input AFD values from this output.
     * @see RespondToAfd
     */
    public void setRespondToAfd(String respondToAfd) {
        this.respondToAfd = respondToAfd;
    }

    /**
     * Use Respond to AFD (RespondToAfd) to specify how the service changes the
     * video itself in response to AFD values in the input. * Choose Respond to
     * clip the input video frame according to the AFD value, input display
     * aspect ratio, and output display aspect ratio. * Choose Passthrough to
     * include the input AFD values. Do not choose this when AfdSignaling is set
     * to (NONE). A preferred implementation of this workflow is to set
     * RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to
     * remove all input AFD values from this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESPOND, PASSTHROUGH
     *
     * @param respondToAfd Use Respond to AFD (RespondToAfd) to specify how the
     *            service changes the video itself in response to AFD values in
     *            the input. * Choose Respond to clip the input video frame
     *            according to the AFD value, input display aspect ratio, and
     *            output display aspect ratio. * Choose Passthrough to include
     *            the input AFD values. Do not choose this when AfdSignaling is
     *            set to (NONE). A preferred implementation of this workflow is
     *            to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO).
     *            * Choose None to remove all input AFD values from this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RespondToAfd
     */
    public VideoDescription withRespondToAfd(String respondToAfd) {
        this.respondToAfd = respondToAfd;
        return this;
    }

    /**
     * Use Respond to AFD (RespondToAfd) to specify how the service changes the
     * video itself in response to AFD values in the input. * Choose Respond to
     * clip the input video frame according to the AFD value, input display
     * aspect ratio, and output display aspect ratio. * Choose Passthrough to
     * include the input AFD values. Do not choose this when AfdSignaling is set
     * to (NONE). A preferred implementation of this workflow is to set
     * RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to
     * remove all input AFD values from this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESPOND, PASSTHROUGH
     *
     * @param respondToAfd Use Respond to AFD (RespondToAfd) to specify how the
     *            service changes the video itself in response to AFD values in
     *            the input. * Choose Respond to clip the input video frame
     *            according to the AFD value, input display aspect ratio, and
     *            output display aspect ratio. * Choose Passthrough to include
     *            the input AFD values. Do not choose this when AfdSignaling is
     *            set to (NONE). A preferred implementation of this workflow is
     *            to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO).
     *            * Choose None to remove all input AFD values from this output.
     * @see RespondToAfd
     */
    public void setRespondToAfd(RespondToAfd respondToAfd) {
        this.respondToAfd = respondToAfd.toString();
    }

    /**
     * Use Respond to AFD (RespondToAfd) to specify how the service changes the
     * video itself in response to AFD values in the input. * Choose Respond to
     * clip the input video frame according to the AFD value, input display
     * aspect ratio, and output display aspect ratio. * Choose Passthrough to
     * include the input AFD values. Do not choose this when AfdSignaling is set
     * to (NONE). A preferred implementation of this workflow is to set
     * RespondToAfd to (NONE) and set AfdSignaling to (AUTO). * Choose None to
     * remove all input AFD values from this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, RESPOND, PASSTHROUGH
     *
     * @param respondToAfd Use Respond to AFD (RespondToAfd) to specify how the
     *            service changes the video itself in response to AFD values in
     *            the input. * Choose Respond to clip the input video frame
     *            according to the AFD value, input display aspect ratio, and
     *            output display aspect ratio. * Choose Passthrough to include
     *            the input AFD values. Do not choose this when AfdSignaling is
     *            set to (NONE). A preferred implementation of this workflow is
     *            to set RespondToAfd to (NONE) and set AfdSignaling to (AUTO).
     *            * Choose None to remove all input AFD values from this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RespondToAfd
     */
    public VideoDescription withRespondToAfd(RespondToAfd respondToAfd) {
        this.respondToAfd = respondToAfd.toString();
        return this;
    }

    /**
     * Specify how the service handles outputs that have a different aspect
     * ratio from the input aspect ratio. Choose Stretch to output
     * (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit.
     * Keep the setting Default (DEFAULT) to have the service letterbox your
     * video instead. This setting overrides any value that you specify for the
     * setting Selection placement (position) in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     *
     * @return Specify how the service handles outputs that have a different
     *         aspect ratio from the input aspect ratio. Choose Stretch to
     *         output (STRETCH_TO_OUTPUT) to have the service stretch your video
     *         image to fit. Keep the setting Default (DEFAULT) to have the
     *         service letterbox your video instead. This setting overrides any
     *         value that you specify for the setting Selection placement
     *         (position) in this output.
     * @see ScalingBehavior
     */
    public String getScalingBehavior() {
        return scalingBehavior;
    }

    /**
     * Specify how the service handles outputs that have a different aspect
     * ratio from the input aspect ratio. Choose Stretch to output
     * (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit.
     * Keep the setting Default (DEFAULT) to have the service letterbox your
     * video instead. This setting overrides any value that you specify for the
     * setting Selection placement (position) in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     *
     * @param scalingBehavior Specify how the service handles outputs that have
     *            a different aspect ratio from the input aspect ratio. Choose
     *            Stretch to output (STRETCH_TO_OUTPUT) to have the service
     *            stretch your video image to fit. Keep the setting Default
     *            (DEFAULT) to have the service letterbox your video instead.
     *            This setting overrides any value that you specify for the
     *            setting Selection placement (position) in this output.
     * @see ScalingBehavior
     */
    public void setScalingBehavior(String scalingBehavior) {
        this.scalingBehavior = scalingBehavior;
    }

    /**
     * Specify how the service handles outputs that have a different aspect
     * ratio from the input aspect ratio. Choose Stretch to output
     * (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit.
     * Keep the setting Default (DEFAULT) to have the service letterbox your
     * video instead. This setting overrides any value that you specify for the
     * setting Selection placement (position) in this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     *
     * @param scalingBehavior Specify how the service handles outputs that have
     *            a different aspect ratio from the input aspect ratio. Choose
     *            Stretch to output (STRETCH_TO_OUTPUT) to have the service
     *            stretch your video image to fit. Keep the setting Default
     *            (DEFAULT) to have the service letterbox your video instead.
     *            This setting overrides any value that you specify for the
     *            setting Selection placement (position) in this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScalingBehavior
     */
    public VideoDescription withScalingBehavior(String scalingBehavior) {
        this.scalingBehavior = scalingBehavior;
        return this;
    }

    /**
     * Specify how the service handles outputs that have a different aspect
     * ratio from the input aspect ratio. Choose Stretch to output
     * (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit.
     * Keep the setting Default (DEFAULT) to have the service letterbox your
     * video instead. This setting overrides any value that you specify for the
     * setting Selection placement (position) in this output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     *
     * @param scalingBehavior Specify how the service handles outputs that have
     *            a different aspect ratio from the input aspect ratio. Choose
     *            Stretch to output (STRETCH_TO_OUTPUT) to have the service
     *            stretch your video image to fit. Keep the setting Default
     *            (DEFAULT) to have the service letterbox your video instead.
     *            This setting overrides any value that you specify for the
     *            setting Selection placement (position) in this output.
     * @see ScalingBehavior
     */
    public void setScalingBehavior(ScalingBehavior scalingBehavior) {
        this.scalingBehavior = scalingBehavior.toString();
    }

    /**
     * Specify how the service handles outputs that have a different aspect
     * ratio from the input aspect ratio. Choose Stretch to output
     * (STRETCH_TO_OUTPUT) to have the service stretch your video image to fit.
     * Keep the setting Default (DEFAULT) to have the service letterbox your
     * video instead. This setting overrides any value that you specify for the
     * setting Selection placement (position) in this output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     *
     * @param scalingBehavior Specify how the service handles outputs that have
     *            a different aspect ratio from the input aspect ratio. Choose
     *            Stretch to output (STRETCH_TO_OUTPUT) to have the service
     *            stretch your video image to fit. Keep the setting Default
     *            (DEFAULT) to have the service letterbox your video instead.
     *            This setting overrides any value that you specify for the
     *            setting Selection placement (position) in this output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScalingBehavior
     */
    public VideoDescription withScalingBehavior(ScalingBehavior scalingBehavior) {
        this.scalingBehavior = scalingBehavior.toString();
        return this;
    }

    /**
     * Use Sharpness (Sharpness) setting to specify the strength of
     * anti-aliasing. This setting changes the width of the anti-alias filter
     * kernel used for scaling. Sharpness only applies if your output resolution
     * is different from your input resolution. 0 is the softest setting, 100
     * the sharpest, and 50 recommended for most content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return Use Sharpness (Sharpness) setting to specify the strength of
     *         anti-aliasing. This setting changes the width of the anti-alias
     *         filter kernel used for scaling. Sharpness only applies if your
     *         output resolution is different from your input resolution. 0 is
     *         the softest setting, 100 the sharpest, and 50 recommended for
     *         most content.
     */
    public Integer getSharpness() {
        return sharpness;
    }

    /**
     * Use Sharpness (Sharpness) setting to specify the strength of
     * anti-aliasing. This setting changes the width of the anti-alias filter
     * kernel used for scaling. Sharpness only applies if your output resolution
     * is different from your input resolution. 0 is the softest setting, 100
     * the sharpest, and 50 recommended for most content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param sharpness Use Sharpness (Sharpness) setting to specify the
     *            strength of anti-aliasing. This setting changes the width of
     *            the anti-alias filter kernel used for scaling. Sharpness only
     *            applies if your output resolution is different from your input
     *            resolution. 0 is the softest setting, 100 the sharpest, and 50
     *            recommended for most content.
     */
    public void setSharpness(Integer sharpness) {
        this.sharpness = sharpness;
    }

    /**
     * Use Sharpness (Sharpness) setting to specify the strength of
     * anti-aliasing. This setting changes the width of the anti-alias filter
     * kernel used for scaling. Sharpness only applies if your output resolution
     * is different from your input resolution. 0 is the softest setting, 100
     * the sharpest, and 50 recommended for most content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param sharpness Use Sharpness (Sharpness) setting to specify the
     *            strength of anti-aliasing. This setting changes the width of
     *            the anti-alias filter kernel used for scaling. Sharpness only
     *            applies if your output resolution is different from your input
     *            resolution. 0 is the softest setting, 100 the sharpest, and 50
     *            recommended for most content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withSharpness(Integer sharpness) {
        this.sharpness = sharpness;
        return this;
    }

    /**
     * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable
     * Timecode insertion when the input frame rate is identical to the output
     * frame rate. To include timecodes in this output, set Timecode insertion
     * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to
     * DISABLED. Default is DISABLED. When the service inserts timecodes in an
     * output, by default, it uses any embedded timecodes from the input. If
     * none are present, the service will set the timecode for the first output
     * frame to zero. To change this default behavior, adjust the settings under
     * Timecode configuration (TimecodeConfig). In the console, these settings
     * are located under Job > Job settings > Timecode configuration. Note -
     * Timecode source under input settings (InputTimecodeSource) does not
     * affect the timecodes that are inserted in the output. Source under Job
     * settings > Timecode configuration (TimecodeSource) does.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     *
     * @return Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only
     *         enable Timecode insertion when the input frame rate is identical
     *         to the output frame rate. To include timecodes in this output,
     *         set Timecode insertion (VideoTimecodeInsertion) to
     *         PIC_TIMING_SEI. To leave them out, set it to DISABLED. Default is
     *         DISABLED. When the service inserts timecodes in an output, by
     *         default, it uses any embedded timecodes from the input. If none
     *         are present, the service will set the timecode for the first
     *         output frame to zero. To change this default behavior, adjust the
     *         settings under Timecode configuration (TimecodeConfig). In the
     *         console, these settings are located under Job > Job settings >
     *         Timecode configuration. Note - Timecode source under input
     *         settings (InputTimecodeSource) does not affect the timecodes that
     *         are inserted in the output. Source under Job settings > Timecode
     *         configuration (TimecodeSource) does.
     * @see VideoTimecodeInsertion
     */
    public String getTimecodeInsertion() {
        return timecodeInsertion;
    }

    /**
     * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable
     * Timecode insertion when the input frame rate is identical to the output
     * frame rate. To include timecodes in this output, set Timecode insertion
     * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to
     * DISABLED. Default is DISABLED. When the service inserts timecodes in an
     * output, by default, it uses any embedded timecodes from the input. If
     * none are present, the service will set the timecode for the first output
     * frame to zero. To change this default behavior, adjust the settings under
     * Timecode configuration (TimecodeConfig). In the console, these settings
     * are located under Job > Job settings > Timecode configuration. Note -
     * Timecode source under input settings (InputTimecodeSource) does not
     * affect the timecodes that are inserted in the output. Source under Job
     * settings > Timecode configuration (TimecodeSource) does.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     *
     * @param timecodeInsertion Applies only to H.264, H.265, MPEG2, and ProRes
     *            outputs. Only enable Timecode insertion when the input frame
     *            rate is identical to the output frame rate. To include
     *            timecodes in this output, set Timecode insertion
     *            (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out,
     *            set it to DISABLED. Default is DISABLED. When the service
     *            inserts timecodes in an output, by default, it uses any
     *            embedded timecodes from the input. If none are present, the
     *            service will set the timecode for the first output frame to
     *            zero. To change this default behavior, adjust the settings
     *            under Timecode configuration (TimecodeConfig). In the console,
     *            these settings are located under Job > Job settings > Timecode
     *            configuration. Note - Timecode source under input settings
     *            (InputTimecodeSource) does not affect the timecodes that are
     *            inserted in the output. Source under Job settings > Timecode
     *            configuration (TimecodeSource) does.
     * @see VideoTimecodeInsertion
     */
    public void setTimecodeInsertion(String timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion;
    }

    /**
     * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable
     * Timecode insertion when the input frame rate is identical to the output
     * frame rate. To include timecodes in this output, set Timecode insertion
     * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to
     * DISABLED. Default is DISABLED. When the service inserts timecodes in an
     * output, by default, it uses any embedded timecodes from the input. If
     * none are present, the service will set the timecode for the first output
     * frame to zero. To change this default behavior, adjust the settings under
     * Timecode configuration (TimecodeConfig). In the console, these settings
     * are located under Job > Job settings > Timecode configuration. Note -
     * Timecode source under input settings (InputTimecodeSource) does not
     * affect the timecodes that are inserted in the output. Source under Job
     * settings > Timecode configuration (TimecodeSource) does.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     *
     * @param timecodeInsertion Applies only to H.264, H.265, MPEG2, and ProRes
     *            outputs. Only enable Timecode insertion when the input frame
     *            rate is identical to the output frame rate. To include
     *            timecodes in this output, set Timecode insertion
     *            (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out,
     *            set it to DISABLED. Default is DISABLED. When the service
     *            inserts timecodes in an output, by default, it uses any
     *            embedded timecodes from the input. If none are present, the
     *            service will set the timecode for the first output frame to
     *            zero. To change this default behavior, adjust the settings
     *            under Timecode configuration (TimecodeConfig). In the console,
     *            these settings are located under Job > Job settings > Timecode
     *            configuration. Note - Timecode source under input settings
     *            (InputTimecodeSource) does not affect the timecodes that are
     *            inserted in the output. Source under Job settings > Timecode
     *            configuration (TimecodeSource) does.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoTimecodeInsertion
     */
    public VideoDescription withTimecodeInsertion(String timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion;
        return this;
    }

    /**
     * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable
     * Timecode insertion when the input frame rate is identical to the output
     * frame rate. To include timecodes in this output, set Timecode insertion
     * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to
     * DISABLED. Default is DISABLED. When the service inserts timecodes in an
     * output, by default, it uses any embedded timecodes from the input. If
     * none are present, the service will set the timecode for the first output
     * frame to zero. To change this default behavior, adjust the settings under
     * Timecode configuration (TimecodeConfig). In the console, these settings
     * are located under Job > Job settings > Timecode configuration. Note -
     * Timecode source under input settings (InputTimecodeSource) does not
     * affect the timecodes that are inserted in the output. Source under Job
     * settings > Timecode configuration (TimecodeSource) does.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     *
     * @param timecodeInsertion Applies only to H.264, H.265, MPEG2, and ProRes
     *            outputs. Only enable Timecode insertion when the input frame
     *            rate is identical to the output frame rate. To include
     *            timecodes in this output, set Timecode insertion
     *            (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out,
     *            set it to DISABLED. Default is DISABLED. When the service
     *            inserts timecodes in an output, by default, it uses any
     *            embedded timecodes from the input. If none are present, the
     *            service will set the timecode for the first output frame to
     *            zero. To change this default behavior, adjust the settings
     *            under Timecode configuration (TimecodeConfig). In the console,
     *            these settings are located under Job > Job settings > Timecode
     *            configuration. Note - Timecode source under input settings
     *            (InputTimecodeSource) does not affect the timecodes that are
     *            inserted in the output. Source under Job settings > Timecode
     *            configuration (TimecodeSource) does.
     * @see VideoTimecodeInsertion
     */
    public void setTimecodeInsertion(VideoTimecodeInsertion timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion.toString();
    }

    /**
     * Applies only to H.264, H.265, MPEG2, and ProRes outputs. Only enable
     * Timecode insertion when the input frame rate is identical to the output
     * frame rate. To include timecodes in this output, set Timecode insertion
     * (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out, set it to
     * DISABLED. Default is DISABLED. When the service inserts timecodes in an
     * output, by default, it uses any embedded timecodes from the input. If
     * none are present, the service will set the timecode for the first output
     * frame to zero. To change this default behavior, adjust the settings under
     * Timecode configuration (TimecodeConfig). In the console, these settings
     * are located under Job > Job settings > Timecode configuration. Note -
     * Timecode source under input settings (InputTimecodeSource) does not
     * affect the timecodes that are inserted in the output. Source under Job
     * settings > Timecode configuration (TimecodeSource) does.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, PIC_TIMING_SEI
     *
     * @param timecodeInsertion Applies only to H.264, H.265, MPEG2, and ProRes
     *            outputs. Only enable Timecode insertion when the input frame
     *            rate is identical to the output frame rate. To include
     *            timecodes in this output, set Timecode insertion
     *            (VideoTimecodeInsertion) to PIC_TIMING_SEI. To leave them out,
     *            set it to DISABLED. Default is DISABLED. When the service
     *            inserts timecodes in an output, by default, it uses any
     *            embedded timecodes from the input. If none are present, the
     *            service will set the timecode for the first output frame to
     *            zero. To change this default behavior, adjust the settings
     *            under Timecode configuration (TimecodeConfig). In the console,
     *            these settings are located under Job > Job settings > Timecode
     *            configuration. Note - Timecode source under input settings
     *            (InputTimecodeSource) does not affect the timecodes that are
     *            inserted in the output. Source under Job settings > Timecode
     *            configuration (TimecodeSource) does.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoTimecodeInsertion
     */
    public VideoDescription withTimecodeInsertion(VideoTimecodeInsertion timecodeInsertion) {
        this.timecodeInsertion = timecodeInsertion.toString();
        return this;
    }

    /**
     * Find additional transcoding features under Preprocessors
     * (VideoPreprocessors). Enable the features at each output individually.
     * These features are disabled by default.
     *
     * @return Find additional transcoding features under Preprocessors
     *         (VideoPreprocessors). Enable the features at each output
     *         individually. These features are disabled by default.
     */
    public VideoPreprocessor getVideoPreprocessors() {
        return videoPreprocessors;
    }

    /**
     * Find additional transcoding features under Preprocessors
     * (VideoPreprocessors). Enable the features at each output individually.
     * These features are disabled by default.
     *
     * @param videoPreprocessors Find additional transcoding features under
     *            Preprocessors (VideoPreprocessors). Enable the features at
     *            each output individually. These features are disabled by
     *            default.
     */
    public void setVideoPreprocessors(VideoPreprocessor videoPreprocessors) {
        this.videoPreprocessors = videoPreprocessors;
    }

    /**
     * Find additional transcoding features under Preprocessors
     * (VideoPreprocessors). Enable the features at each output individually.
     * These features are disabled by default.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param videoPreprocessors Find additional transcoding features under
     *            Preprocessors (VideoPreprocessors). Enable the features at
     *            each output individually. These features are disabled by
     *            default.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withVideoPreprocessors(VideoPreprocessor videoPreprocessors) {
        this.videoPreprocessors = videoPreprocessors;
        return this;
    }

    /**
     * Use Width (Width) to define the video resolution width, in pixels, for
     * this output. If you don't provide a value here, the service will use the
     * input width.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8192<br/>
     *
     * @return Use Width (Width) to define the video resolution width, in
     *         pixels, for this output. If you don't provide a value here, the
     *         service will use the input width.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Use Width (Width) to define the video resolution width, in pixels, for
     * this output. If you don't provide a value here, the service will use the
     * input width.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8192<br/>
     *
     * @param width Use Width (Width) to define the video resolution width, in
     *            pixels, for this output. If you don't provide a value here,
     *            the service will use the input width.
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Use Width (Width) to define the video resolution width, in pixels, for
     * this output. If you don't provide a value here, the service will use the
     * input width.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>32 - 8192<br/>
     *
     * @param width Use Width (Width) to define the video resolution width, in
     *            pixels, for this output. If you don't provide a value here,
     *            the service will use the input width.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withWidth(Integer width) {
        this.width = width;
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
        if (getAfdSignaling() != null)
            sb.append("AfdSignaling: " + getAfdSignaling() + ",");
        if (getAntiAlias() != null)
            sb.append("AntiAlias: " + getAntiAlias() + ",");
        if (getCodecSettings() != null)
            sb.append("CodecSettings: " + getCodecSettings() + ",");
        if (getColorMetadata() != null)
            sb.append("ColorMetadata: " + getColorMetadata() + ",");
        if (getCrop() != null)
            sb.append("Crop: " + getCrop() + ",");
        if (getDropFrameTimecode() != null)
            sb.append("DropFrameTimecode: " + getDropFrameTimecode() + ",");
        if (getFixedAfd() != null)
            sb.append("FixedAfd: " + getFixedAfd() + ",");
        if (getHeight() != null)
            sb.append("Height: " + getHeight() + ",");
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getRespondToAfd() != null)
            sb.append("RespondToAfd: " + getRespondToAfd() + ",");
        if (getScalingBehavior() != null)
            sb.append("ScalingBehavior: " + getScalingBehavior() + ",");
        if (getSharpness() != null)
            sb.append("Sharpness: " + getSharpness() + ",");
        if (getTimecodeInsertion() != null)
            sb.append("TimecodeInsertion: " + getTimecodeInsertion() + ",");
        if (getVideoPreprocessors() != null)
            sb.append("VideoPreprocessors: " + getVideoPreprocessors() + ",");
        if (getWidth() != null)
            sb.append("Width: " + getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAfdSignaling() == null) ? 0 : getAfdSignaling().hashCode());
        hashCode = prime * hashCode + ((getAntiAlias() == null) ? 0 : getAntiAlias().hashCode());
        hashCode = prime * hashCode
                + ((getCodecSettings() == null) ? 0 : getCodecSettings().hashCode());
        hashCode = prime * hashCode
                + ((getColorMetadata() == null) ? 0 : getColorMetadata().hashCode());
        hashCode = prime * hashCode + ((getCrop() == null) ? 0 : getCrop().hashCode());
        hashCode = prime * hashCode
                + ((getDropFrameTimecode() == null) ? 0 : getDropFrameTimecode().hashCode());
        hashCode = prime * hashCode + ((getFixedAfd() == null) ? 0 : getFixedAfd().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode
                + ((getRespondToAfd() == null) ? 0 : getRespondToAfd().hashCode());
        hashCode = prime * hashCode
                + ((getScalingBehavior() == null) ? 0 : getScalingBehavior().hashCode());
        hashCode = prime * hashCode + ((getSharpness() == null) ? 0 : getSharpness().hashCode());
        hashCode = prime * hashCode
                + ((getTimecodeInsertion() == null) ? 0 : getTimecodeInsertion().hashCode());
        hashCode = prime * hashCode
                + ((getVideoPreprocessors() == null) ? 0 : getVideoPreprocessors().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoDescription == false)
            return false;
        VideoDescription other = (VideoDescription) obj;

        if (other.getAfdSignaling() == null ^ this.getAfdSignaling() == null)
            return false;
        if (other.getAfdSignaling() != null
                && other.getAfdSignaling().equals(this.getAfdSignaling()) == false)
            return false;
        if (other.getAntiAlias() == null ^ this.getAntiAlias() == null)
            return false;
        if (other.getAntiAlias() != null
                && other.getAntiAlias().equals(this.getAntiAlias()) == false)
            return false;
        if (other.getCodecSettings() == null ^ this.getCodecSettings() == null)
            return false;
        if (other.getCodecSettings() != null
                && other.getCodecSettings().equals(this.getCodecSettings()) == false)
            return false;
        if (other.getColorMetadata() == null ^ this.getColorMetadata() == null)
            return false;
        if (other.getColorMetadata() != null
                && other.getColorMetadata().equals(this.getColorMetadata()) == false)
            return false;
        if (other.getCrop() == null ^ this.getCrop() == null)
            return false;
        if (other.getCrop() != null && other.getCrop().equals(this.getCrop()) == false)
            return false;
        if (other.getDropFrameTimecode() == null ^ this.getDropFrameTimecode() == null)
            return false;
        if (other.getDropFrameTimecode() != null
                && other.getDropFrameTimecode().equals(this.getDropFrameTimecode()) == false)
            return false;
        if (other.getFixedAfd() == null ^ this.getFixedAfd() == null)
            return false;
        if (other.getFixedAfd() != null && other.getFixedAfd().equals(this.getFixedAfd()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getRespondToAfd() == null ^ this.getRespondToAfd() == null)
            return false;
        if (other.getRespondToAfd() != null
                && other.getRespondToAfd().equals(this.getRespondToAfd()) == false)
            return false;
        if (other.getScalingBehavior() == null ^ this.getScalingBehavior() == null)
            return false;
        if (other.getScalingBehavior() != null
                && other.getScalingBehavior().equals(this.getScalingBehavior()) == false)
            return false;
        if (other.getSharpness() == null ^ this.getSharpness() == null)
            return false;
        if (other.getSharpness() != null
                && other.getSharpness().equals(this.getSharpness()) == false)
            return false;
        if (other.getTimecodeInsertion() == null ^ this.getTimecodeInsertion() == null)
            return false;
        if (other.getTimecodeInsertion() != null
                && other.getTimecodeInsertion().equals(this.getTimecodeInsertion()) == false)
            return false;
        if (other.getVideoPreprocessors() == null ^ this.getVideoPreprocessors() == null)
            return false;
        if (other.getVideoPreprocessors() != null
                && other.getVideoPreprocessors().equals(this.getVideoPreprocessors()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }
}
