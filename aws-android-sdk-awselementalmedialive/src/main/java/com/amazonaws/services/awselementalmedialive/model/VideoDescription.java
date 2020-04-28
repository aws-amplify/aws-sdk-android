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
 * Video settings for this stream.
 */
public class VideoDescription implements Serializable {
    /**
     * Video codec settings.
     */
    private VideoCodecSettings codecSettings;

    /**
     * Output video height, in pixels. Must be an even number. For most codecs,
     * you can leave this field and width blank in order to use the height and
     * width (resolution) from the source. Note, however, that leaving blank is
     * not recommended. For the Frame Capture codec, height and width are
     * required.
     */
    private Integer height;

    /**
     * The name of this VideoDescription. Outputs will use this name to uniquely
     * identify this Description. Description names should be unique within this
     * Live Event.
     */
    private String name;

    /**
     * Indicates how to respond to the AFD values in the input stream. RESPOND
     * causes input video to be clipped, depending on the AFD value, input
     * display aspect ratio, and output display aspect ratio, and (except for
     * FRAMECAPTURE codec) includes the values in the output. PASSTHROUGH (does
     * not apply to FRAMECAPTURE codec) ignores the AFD values and includes the
     * values in the output, so input video is not clipped. NONE ignores the AFD
     * values and does not include the values through to the output, so input
     * video is not clipped.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PASSTHROUGH, RESPOND
     */
    private String respondToAfd;

    /**
     * STRETCHTOOUTPUT configures the output position to stretch the video to
     * the specified output resolution (height and width). This option will
     * override any position value. DEFAULT may insert black boxes (pillar boxes
     * or letter boxes) around the video to provide the specified output
     * resolution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     */
    private String scalingBehavior;

    /**
     * Changes the strength of the anti-alias filter used for scaling. 0 is the
     * softest setting, 100 is the sharpest. A setting of 50 is recommended for
     * most content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer sharpness;

    /**
     * Output video width, in pixels. Must be an even number. For most codecs,
     * you can leave this field and height blank in order to use the height and
     * width (resolution) from the source. Note, however, that leaving blank is
     * not recommended. For the Frame Capture codec, height and width are
     * required.
     */
    private Integer width;

    /**
     * Video codec settings.
     *
     * @return Video codec settings.
     */
    public VideoCodecSettings getCodecSettings() {
        return codecSettings;
    }

    /**
     * Video codec settings.
     *
     * @param codecSettings Video codec settings.
     */
    public void setCodecSettings(VideoCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
    }

    /**
     * Video codec settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codecSettings Video codec settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withCodecSettings(VideoCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
        return this;
    }

    /**
     * Output video height, in pixels. Must be an even number. For most codecs,
     * you can leave this field and width blank in order to use the height and
     * width (resolution) from the source. Note, however, that leaving blank is
     * not recommended. For the Frame Capture codec, height and width are
     * required.
     *
     * @return Output video height, in pixels. Must be an even number. For most
     *         codecs, you can leave this field and width blank in order to use
     *         the height and width (resolution) from the source. Note, however,
     *         that leaving blank is not recommended. For the Frame Capture
     *         codec, height and width are required.
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Output video height, in pixels. Must be an even number. For most codecs,
     * you can leave this field and width blank in order to use the height and
     * width (resolution) from the source. Note, however, that leaving blank is
     * not recommended. For the Frame Capture codec, height and width are
     * required.
     *
     * @param height Output video height, in pixels. Must be an even number. For
     *            most codecs, you can leave this field and width blank in order
     *            to use the height and width (resolution) from the source.
     *            Note, however, that leaving blank is not recommended. For the
     *            Frame Capture codec, height and width are required.
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Output video height, in pixels. Must be an even number. For most codecs,
     * you can leave this field and width blank in order to use the height and
     * width (resolution) from the source. Note, however, that leaving blank is
     * not recommended. For the Frame Capture codec, height and width are
     * required.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param height Output video height, in pixels. Must be an even number. For
     *            most codecs, you can leave this field and width blank in order
     *            to use the height and width (resolution) from the source.
     *            Note, however, that leaving blank is not recommended. For the
     *            Frame Capture codec, height and width are required.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * The name of this VideoDescription. Outputs will use this name to uniquely
     * identify this Description. Description names should be unique within this
     * Live Event.
     *
     * @return The name of this VideoDescription. Outputs will use this name to
     *         uniquely identify this Description. Description names should be
     *         unique within this Live Event.
     */
    public String getName() {
        return name;
    }

    /**
     * The name of this VideoDescription. Outputs will use this name to uniquely
     * identify this Description. Description names should be unique within this
     * Live Event.
     *
     * @param name The name of this VideoDescription. Outputs will use this name
     *            to uniquely identify this Description. Description names
     *            should be unique within this Live Event.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of this VideoDescription. Outputs will use this name to uniquely
     * identify this Description. Description names should be unique within this
     * Live Event.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The name of this VideoDescription. Outputs will use this name
     *            to uniquely identify this Description. Description names
     *            should be unique within this Live Event.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Indicates how to respond to the AFD values in the input stream. RESPOND
     * causes input video to be clipped, depending on the AFD value, input
     * display aspect ratio, and output display aspect ratio, and (except for
     * FRAMECAPTURE codec) includes the values in the output. PASSTHROUGH (does
     * not apply to FRAMECAPTURE codec) ignores the AFD values and includes the
     * values in the output, so input video is not clipped. NONE ignores the AFD
     * values and does not include the values through to the output, so input
     * video is not clipped.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PASSTHROUGH, RESPOND
     *
     * @return Indicates how to respond to the AFD values in the input stream.
     *         RESPOND causes input video to be clipped, depending on the AFD
     *         value, input display aspect ratio, and output display aspect
     *         ratio, and (except for FRAMECAPTURE codec) includes the values in
     *         the output. PASSTHROUGH (does not apply to FRAMECAPTURE codec)
     *         ignores the AFD values and includes the values in the output, so
     *         input video is not clipped. NONE ignores the AFD values and does
     *         not include the values through to the output, so input video is
     *         not clipped.
     * @see VideoDescriptionRespondToAfd
     */
    public String getRespondToAfd() {
        return respondToAfd;
    }

    /**
     * Indicates how to respond to the AFD values in the input stream. RESPOND
     * causes input video to be clipped, depending on the AFD value, input
     * display aspect ratio, and output display aspect ratio, and (except for
     * FRAMECAPTURE codec) includes the values in the output. PASSTHROUGH (does
     * not apply to FRAMECAPTURE codec) ignores the AFD values and includes the
     * values in the output, so input video is not clipped. NONE ignores the AFD
     * values and does not include the values through to the output, so input
     * video is not clipped.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PASSTHROUGH, RESPOND
     *
     * @param respondToAfd Indicates how to respond to the AFD values in the
     *            input stream. RESPOND causes input video to be clipped,
     *            depending on the AFD value, input display aspect ratio, and
     *            output display aspect ratio, and (except for FRAMECAPTURE
     *            codec) includes the values in the output. PASSTHROUGH (does
     *            not apply to FRAMECAPTURE codec) ignores the AFD values and
     *            includes the values in the output, so input video is not
     *            clipped. NONE ignores the AFD values and does not include the
     *            values through to the output, so input video is not clipped.
     * @see VideoDescriptionRespondToAfd
     */
    public void setRespondToAfd(String respondToAfd) {
        this.respondToAfd = respondToAfd;
    }

    /**
     * Indicates how to respond to the AFD values in the input stream. RESPOND
     * causes input video to be clipped, depending on the AFD value, input
     * display aspect ratio, and output display aspect ratio, and (except for
     * FRAMECAPTURE codec) includes the values in the output. PASSTHROUGH (does
     * not apply to FRAMECAPTURE codec) ignores the AFD values and includes the
     * values in the output, so input video is not clipped. NONE ignores the AFD
     * values and does not include the values through to the output, so input
     * video is not clipped.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PASSTHROUGH, RESPOND
     *
     * @param respondToAfd Indicates how to respond to the AFD values in the
     *            input stream. RESPOND causes input video to be clipped,
     *            depending on the AFD value, input display aspect ratio, and
     *            output display aspect ratio, and (except for FRAMECAPTURE
     *            codec) includes the values in the output. PASSTHROUGH (does
     *            not apply to FRAMECAPTURE codec) ignores the AFD values and
     *            includes the values in the output, so input video is not
     *            clipped. NONE ignores the AFD values and does not include the
     *            values through to the output, so input video is not clipped.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoDescriptionRespondToAfd
     */
    public VideoDescription withRespondToAfd(String respondToAfd) {
        this.respondToAfd = respondToAfd;
        return this;
    }

    /**
     * Indicates how to respond to the AFD values in the input stream. RESPOND
     * causes input video to be clipped, depending on the AFD value, input
     * display aspect ratio, and output display aspect ratio, and (except for
     * FRAMECAPTURE codec) includes the values in the output. PASSTHROUGH (does
     * not apply to FRAMECAPTURE codec) ignores the AFD values and includes the
     * values in the output, so input video is not clipped. NONE ignores the AFD
     * values and does not include the values through to the output, so input
     * video is not clipped.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PASSTHROUGH, RESPOND
     *
     * @param respondToAfd Indicates how to respond to the AFD values in the
     *            input stream. RESPOND causes input video to be clipped,
     *            depending on the AFD value, input display aspect ratio, and
     *            output display aspect ratio, and (except for FRAMECAPTURE
     *            codec) includes the values in the output. PASSTHROUGH (does
     *            not apply to FRAMECAPTURE codec) ignores the AFD values and
     *            includes the values in the output, so input video is not
     *            clipped. NONE ignores the AFD values and does not include the
     *            values through to the output, so input video is not clipped.
     * @see VideoDescriptionRespondToAfd
     */
    public void setRespondToAfd(VideoDescriptionRespondToAfd respondToAfd) {
        this.respondToAfd = respondToAfd.toString();
    }

    /**
     * Indicates how to respond to the AFD values in the input stream. RESPOND
     * causes input video to be clipped, depending on the AFD value, input
     * display aspect ratio, and output display aspect ratio, and (except for
     * FRAMECAPTURE codec) includes the values in the output. PASSTHROUGH (does
     * not apply to FRAMECAPTURE codec) ignores the AFD values and includes the
     * values in the output, so input video is not clipped. NONE ignores the AFD
     * values and does not include the values through to the output, so input
     * video is not clipped.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, PASSTHROUGH, RESPOND
     *
     * @param respondToAfd Indicates how to respond to the AFD values in the
     *            input stream. RESPOND causes input video to be clipped,
     *            depending on the AFD value, input display aspect ratio, and
     *            output display aspect ratio, and (except for FRAMECAPTURE
     *            codec) includes the values in the output. PASSTHROUGH (does
     *            not apply to FRAMECAPTURE codec) ignores the AFD values and
     *            includes the values in the output, so input video is not
     *            clipped. NONE ignores the AFD values and does not include the
     *            values through to the output, so input video is not clipped.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoDescriptionRespondToAfd
     */
    public VideoDescription withRespondToAfd(VideoDescriptionRespondToAfd respondToAfd) {
        this.respondToAfd = respondToAfd.toString();
        return this;
    }

    /**
     * STRETCHTOOUTPUT configures the output position to stretch the video to
     * the specified output resolution (height and width). This option will
     * override any position value. DEFAULT may insert black boxes (pillar boxes
     * or letter boxes) around the video to provide the specified output
     * resolution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     *
     * @return STRETCHTOOUTPUT configures the output position to stretch the
     *         video to the specified output resolution (height and width). This
     *         option will override any position value. DEFAULT may insert black
     *         boxes (pillar boxes or letter boxes) around the video to provide
     *         the specified output resolution.
     * @see VideoDescriptionScalingBehavior
     */
    public String getScalingBehavior() {
        return scalingBehavior;
    }

    /**
     * STRETCHTOOUTPUT configures the output position to stretch the video to
     * the specified output resolution (height and width). This option will
     * override any position value. DEFAULT may insert black boxes (pillar boxes
     * or letter boxes) around the video to provide the specified output
     * resolution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     *
     * @param scalingBehavior STRETCHTOOUTPUT configures the output position to
     *            stretch the video to the specified output resolution (height
     *            and width). This option will override any position value.
     *            DEFAULT may insert black boxes (pillar boxes or letter boxes)
     *            around the video to provide the specified output resolution.
     * @see VideoDescriptionScalingBehavior
     */
    public void setScalingBehavior(String scalingBehavior) {
        this.scalingBehavior = scalingBehavior;
    }

    /**
     * STRETCHTOOUTPUT configures the output position to stretch the video to
     * the specified output resolution (height and width). This option will
     * override any position value. DEFAULT may insert black boxes (pillar boxes
     * or letter boxes) around the video to provide the specified output
     * resolution.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     *
     * @param scalingBehavior STRETCHTOOUTPUT configures the output position to
     *            stretch the video to the specified output resolution (height
     *            and width). This option will override any position value.
     *            DEFAULT may insert black boxes (pillar boxes or letter boxes)
     *            around the video to provide the specified output resolution.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoDescriptionScalingBehavior
     */
    public VideoDescription withScalingBehavior(String scalingBehavior) {
        this.scalingBehavior = scalingBehavior;
        return this;
    }

    /**
     * STRETCHTOOUTPUT configures the output position to stretch the video to
     * the specified output resolution (height and width). This option will
     * override any position value. DEFAULT may insert black boxes (pillar boxes
     * or letter boxes) around the video to provide the specified output
     * resolution.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     *
     * @param scalingBehavior STRETCHTOOUTPUT configures the output position to
     *            stretch the video to the specified output resolution (height
     *            and width). This option will override any position value.
     *            DEFAULT may insert black boxes (pillar boxes or letter boxes)
     *            around the video to provide the specified output resolution.
     * @see VideoDescriptionScalingBehavior
     */
    public void setScalingBehavior(VideoDescriptionScalingBehavior scalingBehavior) {
        this.scalingBehavior = scalingBehavior.toString();
    }

    /**
     * STRETCHTOOUTPUT configures the output position to stretch the video to
     * the specified output resolution (height and width). This option will
     * override any position value. DEFAULT may insert black boxes (pillar boxes
     * or letter boxes) around the video to provide the specified output
     * resolution.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, STRETCH_TO_OUTPUT
     *
     * @param scalingBehavior STRETCHTOOUTPUT configures the output position to
     *            stretch the video to the specified output resolution (height
     *            and width). This option will override any position value.
     *            DEFAULT may insert black boxes (pillar boxes or letter boxes)
     *            around the video to provide the specified output resolution.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoDescriptionScalingBehavior
     */
    public VideoDescription withScalingBehavior(VideoDescriptionScalingBehavior scalingBehavior) {
        this.scalingBehavior = scalingBehavior.toString();
        return this;
    }

    /**
     * Changes the strength of the anti-alias filter used for scaling. 0 is the
     * softest setting, 100 is the sharpest. A setting of 50 is recommended for
     * most content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return Changes the strength of the anti-alias filter used for scaling. 0
     *         is the softest setting, 100 is the sharpest. A setting of 50 is
     *         recommended for most content.
     */
    public Integer getSharpness() {
        return sharpness;
    }

    /**
     * Changes the strength of the anti-alias filter used for scaling. 0 is the
     * softest setting, 100 is the sharpest. A setting of 50 is recommended for
     * most content.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param sharpness Changes the strength of the anti-alias filter used for
     *            scaling. 0 is the softest setting, 100 is the sharpest. A
     *            setting of 50 is recommended for most content.
     */
    public void setSharpness(Integer sharpness) {
        this.sharpness = sharpness;
    }

    /**
     * Changes the strength of the anti-alias filter used for scaling. 0 is the
     * softest setting, 100 is the sharpest. A setting of 50 is recommended for
     * most content.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param sharpness Changes the strength of the anti-alias filter used for
     *            scaling. 0 is the softest setting, 100 is the sharpest. A
     *            setting of 50 is recommended for most content.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoDescription withSharpness(Integer sharpness) {
        this.sharpness = sharpness;
        return this;
    }

    /**
     * Output video width, in pixels. Must be an even number. For most codecs,
     * you can leave this field and height blank in order to use the height and
     * width (resolution) from the source. Note, however, that leaving blank is
     * not recommended. For the Frame Capture codec, height and width are
     * required.
     *
     * @return Output video width, in pixels. Must be an even number. For most
     *         codecs, you can leave this field and height blank in order to use
     *         the height and width (resolution) from the source. Note, however,
     *         that leaving blank is not recommended. For the Frame Capture
     *         codec, height and width are required.
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Output video width, in pixels. Must be an even number. For most codecs,
     * you can leave this field and height blank in order to use the height and
     * width (resolution) from the source. Note, however, that leaving blank is
     * not recommended. For the Frame Capture codec, height and width are
     * required.
     *
     * @param width Output video width, in pixels. Must be an even number. For
     *            most codecs, you can leave this field and height blank in
     *            order to use the height and width (resolution) from the
     *            source. Note, however, that leaving blank is not recommended.
     *            For the Frame Capture codec, height and width are required.
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Output video width, in pixels. Must be an even number. For most codecs,
     * you can leave this field and height blank in order to use the height and
     * width (resolution) from the source. Note, however, that leaving blank is
     * not recommended. For the Frame Capture codec, height and width are
     * required.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param width Output video width, in pixels. Must be an even number. For
     *            most codecs, you can leave this field and height blank in
     *            order to use the height and width (resolution) from the
     *            source. Note, however, that leaving blank is not recommended.
     *            For the Frame Capture codec, height and width are required.
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
        if (getCodecSettings() != null)
            sb.append("CodecSettings: " + getCodecSettings() + ",");
        if (getHeight() != null)
            sb.append("Height: " + getHeight() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getRespondToAfd() != null)
            sb.append("RespondToAfd: " + getRespondToAfd() + ",");
        if (getScalingBehavior() != null)
            sb.append("ScalingBehavior: " + getScalingBehavior() + ",");
        if (getSharpness() != null)
            sb.append("Sharpness: " + getSharpness() + ",");
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
                + ((getCodecSettings() == null) ? 0 : getCodecSettings().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getRespondToAfd() == null) ? 0 : getRespondToAfd().hashCode());
        hashCode = prime * hashCode
                + ((getScalingBehavior() == null) ? 0 : getScalingBehavior().hashCode());
        hashCode = prime * hashCode + ((getSharpness() == null) ? 0 : getSharpness().hashCode());
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

        if (other.getCodecSettings() == null ^ this.getCodecSettings() == null)
            return false;
        if (other.getCodecSettings() != null
                && other.getCodecSettings().equals(this.getCodecSettings()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }
}
