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
 * Specifies a particular video stream within an input source. An input may have
 * only a single video selector.
 */
public class VideoSelector implements Serializable {
    /**
     * Specifies the color space of an input. This setting works in tandem with
     * colorSpaceUsage and a video description's colorSpaceSettingsChoice to
     * determine if any conversion will be performed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, REC_601, REC_709
     */
    private String colorSpace;

    /**
     * Applies only if colorSpace is a value other than follow. This field
     * controls how the value in the colorSpace field will be used. fallback
     * means that when the input does include color space data, that data will
     * be used, but when the input has no color space data, the value in
     * colorSpace will be used. Choose fallback if your input is sometimes
     * missing color space data, but when it does have color space data, that
     * data is correct. force means to always use the value in colorSpace.
     * Choose force if your input usually has no color space data or might have
     * unreliable color space data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALLBACK, FORCE
     */
    private String colorSpaceUsage;

    /**
     * The video selector settings.
     */
    private VideoSelectorSettings selectorSettings;

    /**
     * Specifies the color space of an input. This setting works in tandem with
     * colorSpaceUsage and a video description's colorSpaceSettingsChoice to
     * determine if any conversion will be performed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, REC_601, REC_709
     *
     * @return Specifies the color space of an input. This setting works in
     *         tandem with colorSpaceUsage and a video description's
     *         colorSpaceSettingsChoice to determine if any conversion will be
     *         performed.
     * @see VideoSelectorColorSpace
     */
    public String getColorSpace() {
        return colorSpace;
    }

    /**
     * Specifies the color space of an input. This setting works in tandem with
     * colorSpaceUsage and a video description's colorSpaceSettingsChoice to
     * determine if any conversion will be performed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, REC_601, REC_709
     *
     * @param colorSpace Specifies the color space of an input. This setting
     *            works in tandem with colorSpaceUsage and a video description's
     *            colorSpaceSettingsChoice to determine if any conversion will
     *            be performed.
     * @see VideoSelectorColorSpace
     */
    public void setColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
    }

    /**
     * Specifies the color space of an input. This setting works in tandem with
     * colorSpaceUsage and a video description's colorSpaceSettingsChoice to
     * determine if any conversion will be performed.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, REC_601, REC_709
     *
     * @param colorSpace Specifies the color space of an input. This setting
     *            works in tandem with colorSpaceUsage and a video description's
     *            colorSpaceSettingsChoice to determine if any conversion will
     *            be performed.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoSelectorColorSpace
     */
    public VideoSelector withColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
        return this;
    }

    /**
     * Specifies the color space of an input. This setting works in tandem with
     * colorSpaceUsage and a video description's colorSpaceSettingsChoice to
     * determine if any conversion will be performed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, REC_601, REC_709
     *
     * @param colorSpace Specifies the color space of an input. This setting
     *            works in tandem with colorSpaceUsage and a video description's
     *            colorSpaceSettingsChoice to determine if any conversion will
     *            be performed.
     * @see VideoSelectorColorSpace
     */
    public void setColorSpace(VideoSelectorColorSpace colorSpace) {
        this.colorSpace = colorSpace.toString();
    }

    /**
     * Specifies the color space of an input. This setting works in tandem with
     * colorSpaceUsage and a video description's colorSpaceSettingsChoice to
     * determine if any conversion will be performed.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FOLLOW, REC_601, REC_709
     *
     * @param colorSpace Specifies the color space of an input. This setting
     *            works in tandem with colorSpaceUsage and a video description's
     *            colorSpaceSettingsChoice to determine if any conversion will
     *            be performed.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoSelectorColorSpace
     */
    public VideoSelector withColorSpace(VideoSelectorColorSpace colorSpace) {
        this.colorSpace = colorSpace.toString();
        return this;
    }

    /**
     * Applies only if colorSpace is a value other than follow. This field
     * controls how the value in the colorSpace field will be used. fallback
     * means that when the input does include color space data, that data will
     * be used, but when the input has no color space data, the value in
     * colorSpace will be used. Choose fallback if your input is sometimes
     * missing color space data, but when it does have color space data, that
     * data is correct. force means to always use the value in colorSpace.
     * Choose force if your input usually has no color space data or might have
     * unreliable color space data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALLBACK, FORCE
     *
     * @return Applies only if colorSpace is a value other than follow. This
     *         field controls how the value in the colorSpace field will be
     *         used. fallback means that when the input does include color space
     *         data, that data will be used, but when the input has no color
     *         space data, the value in colorSpace will be used. Choose fallback
     *         if your input is sometimes missing color space data, but when it
     *         does have color space data, that data is correct. force means to
     *         always use the value in colorSpace. Choose force if your input
     *         usually has no color space data or might have unreliable color
     *         space data.
     * @see VideoSelectorColorSpaceUsage
     */
    public String getColorSpaceUsage() {
        return colorSpaceUsage;
    }

    /**
     * Applies only if colorSpace is a value other than follow. This field
     * controls how the value in the colorSpace field will be used. fallback
     * means that when the input does include color space data, that data will
     * be used, but when the input has no color space data, the value in
     * colorSpace will be used. Choose fallback if your input is sometimes
     * missing color space data, but when it does have color space data, that
     * data is correct. force means to always use the value in colorSpace.
     * Choose force if your input usually has no color space data or might have
     * unreliable color space data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALLBACK, FORCE
     *
     * @param colorSpaceUsage Applies only if colorSpace is a value other than
     *            follow. This field controls how the value in the colorSpace
     *            field will be used. fallback means that when the input does
     *            include color space data, that data will be used, but when the
     *            input has no color space data, the value in colorSpace will be
     *            used. Choose fallback if your input is sometimes missing color
     *            space data, but when it does have color space data, that data
     *            is correct. force means to always use the value in colorSpace.
     *            Choose force if your input usually has no color space data or
     *            might have unreliable color space data.
     * @see VideoSelectorColorSpaceUsage
     */
    public void setColorSpaceUsage(String colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage;
    }

    /**
     * Applies only if colorSpace is a value other than follow. This field
     * controls how the value in the colorSpace field will be used. fallback
     * means that when the input does include color space data, that data will
     * be used, but when the input has no color space data, the value in
     * colorSpace will be used. Choose fallback if your input is sometimes
     * missing color space data, but when it does have color space data, that
     * data is correct. force means to always use the value in colorSpace.
     * Choose force if your input usually has no color space data or might have
     * unreliable color space data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALLBACK, FORCE
     *
     * @param colorSpaceUsage Applies only if colorSpace is a value other than
     *            follow. This field controls how the value in the colorSpace
     *            field will be used. fallback means that when the input does
     *            include color space data, that data will be used, but when the
     *            input has no color space data, the value in colorSpace will be
     *            used. Choose fallback if your input is sometimes missing color
     *            space data, but when it does have color space data, that data
     *            is correct. force means to always use the value in colorSpace.
     *            Choose force if your input usually has no color space data or
     *            might have unreliable color space data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoSelectorColorSpaceUsage
     */
    public VideoSelector withColorSpaceUsage(String colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage;
        return this;
    }

    /**
     * Applies only if colorSpace is a value other than follow. This field
     * controls how the value in the colorSpace field will be used. fallback
     * means that when the input does include color space data, that data will
     * be used, but when the input has no color space data, the value in
     * colorSpace will be used. Choose fallback if your input is sometimes
     * missing color space data, but when it does have color space data, that
     * data is correct. force means to always use the value in colorSpace.
     * Choose force if your input usually has no color space data or might have
     * unreliable color space data.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALLBACK, FORCE
     *
     * @param colorSpaceUsage Applies only if colorSpace is a value other than
     *            follow. This field controls how the value in the colorSpace
     *            field will be used. fallback means that when the input does
     *            include color space data, that data will be used, but when the
     *            input has no color space data, the value in colorSpace will be
     *            used. Choose fallback if your input is sometimes missing color
     *            space data, but when it does have color space data, that data
     *            is correct. force means to always use the value in colorSpace.
     *            Choose force if your input usually has no color space data or
     *            might have unreliable color space data.
     * @see VideoSelectorColorSpaceUsage
     */
    public void setColorSpaceUsage(VideoSelectorColorSpaceUsage colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage.toString();
    }

    /**
     * Applies only if colorSpace is a value other than follow. This field
     * controls how the value in the colorSpace field will be used. fallback
     * means that when the input does include color space data, that data will
     * be used, but when the input has no color space data, the value in
     * colorSpace will be used. Choose fallback if your input is sometimes
     * missing color space data, but when it does have color space data, that
     * data is correct. force means to always use the value in colorSpace.
     * Choose force if your input usually has no color space data or might have
     * unreliable color space data.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FALLBACK, FORCE
     *
     * @param colorSpaceUsage Applies only if colorSpace is a value other than
     *            follow. This field controls how the value in the colorSpace
     *            field will be used. fallback means that when the input does
     *            include color space data, that data will be used, but when the
     *            input has no color space data, the value in colorSpace will be
     *            used. Choose fallback if your input is sometimes missing color
     *            space data, but when it does have color space data, that data
     *            is correct. force means to always use the value in colorSpace.
     *            Choose force if your input usually has no color space data or
     *            might have unreliable color space data.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VideoSelectorColorSpaceUsage
     */
    public VideoSelector withColorSpaceUsage(VideoSelectorColorSpaceUsage colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage.toString();
        return this;
    }

    /**
     * The video selector settings.
     *
     * @return The video selector settings.
     */
    public VideoSelectorSettings getSelectorSettings() {
        return selectorSettings;
    }

    /**
     * The video selector settings.
     *
     * @param selectorSettings The video selector settings.
     */
    public void setSelectorSettings(VideoSelectorSettings selectorSettings) {
        this.selectorSettings = selectorSettings;
    }

    /**
     * The video selector settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selectorSettings The video selector settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VideoSelector withSelectorSettings(VideoSelectorSettings selectorSettings) {
        this.selectorSettings = selectorSettings;
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
        if (getColorSpace() != null)
            sb.append("ColorSpace: " + getColorSpace() + ",");
        if (getColorSpaceUsage() != null)
            sb.append("ColorSpaceUsage: " + getColorSpaceUsage() + ",");
        if (getSelectorSettings() != null)
            sb.append("SelectorSettings: " + getSelectorSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColorSpace() == null) ? 0 : getColorSpace().hashCode());
        hashCode = prime * hashCode
                + ((getColorSpaceUsage() == null) ? 0 : getColorSpaceUsage().hashCode());
        hashCode = prime * hashCode
                + ((getSelectorSettings() == null) ? 0 : getSelectorSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoSelector == false)
            return false;
        VideoSelector other = (VideoSelector) obj;

        if (other.getColorSpace() == null ^ this.getColorSpace() == null)
            return false;
        if (other.getColorSpace() != null
                && other.getColorSpace().equals(this.getColorSpace()) == false)
            return false;
        if (other.getColorSpaceUsage() == null ^ this.getColorSpaceUsage() == null)
            return false;
        if (other.getColorSpaceUsage() != null
                && other.getColorSpaceUsage().equals(this.getColorSpaceUsage()) == false)
            return false;
        if (other.getSelectorSettings() == null ^ this.getSelectorSettings() == null)
            return false;
        if (other.getSelectorSettings() != null
                && other.getSelectorSettings().equals(this.getSelectorSettings()) == false)
            return false;
        return true;
    }
}
