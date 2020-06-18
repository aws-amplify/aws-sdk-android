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
 * Settings for MOV Container.
 */
public class MovSettings implements Serializable {
    /**
     * When enabled, include 'clap' atom if appropriate for the video output
     * settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     */
    private String clapAtom;

    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     */
    private String cslgAtom;

    /**
     * When set to XDCAM, writes MPEG2 video streams into the QuickTime file
     * using XDCAM fourcc codes. This increases compatibility with Apple editors
     * and players, but may decrease compatibility with other players. Only
     * applicable when the video codec is MPEG2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>XDCAM, MPEG
     */
    private String mpeg2FourCCControl;

    /**
     * If set to OMNEON, inserts Omneon-compatible padding
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OMNEON, NONE
     */
    private String paddingControl;

    /**
     * Always keep the default value (SELF_CONTAINED) for this setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_CONTAINED, EXTERNAL
     */
    private String reference;

    /**
     * When enabled, include 'clap' atom if appropriate for the video output
     * settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @return When enabled, include 'clap' atom if appropriate for the video
     *         output settings.
     * @see MovClapAtom
     */
    public String getClapAtom() {
        return clapAtom;
    }

    /**
     * When enabled, include 'clap' atom if appropriate for the video output
     * settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param clapAtom When enabled, include 'clap' atom if appropriate for the
     *            video output settings.
     * @see MovClapAtom
     */
    public void setClapAtom(String clapAtom) {
        this.clapAtom = clapAtom;
    }

    /**
     * When enabled, include 'clap' atom if appropriate for the video output
     * settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param clapAtom When enabled, include 'clap' atom if appropriate for the
     *            video output settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MovClapAtom
     */
    public MovSettings withClapAtom(String clapAtom) {
        this.clapAtom = clapAtom;
        return this;
    }

    /**
     * When enabled, include 'clap' atom if appropriate for the video output
     * settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param clapAtom When enabled, include 'clap' atom if appropriate for the
     *            video output settings.
     * @see MovClapAtom
     */
    public void setClapAtom(MovClapAtom clapAtom) {
        this.clapAtom = clapAtom.toString();
    }

    /**
     * When enabled, include 'clap' atom if appropriate for the video output
     * settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param clapAtom When enabled, include 'clap' atom if appropriate for the
     *            video output settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MovClapAtom
     */
    public MovSettings withClapAtom(MovClapAtom clapAtom) {
        this.clapAtom = clapAtom.toString();
        return this;
    }

    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @return When enabled, file composition times will start at zero,
     *         composition times in the 'ctts' (composition time to sample) box
     *         for B-frames will be negative, and a 'cslg' (composition shift
     *         least greatest) box will be included per 14496-1 amendment 1.
     *         This improves compatibility with Apple players and tools.
     * @see MovCslgAtom
     */
    public String getCslgAtom() {
        return cslgAtom;
    }

    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param cslgAtom When enabled, file composition times will start at zero,
     *            composition times in the 'ctts' (composition time to sample)
     *            box for B-frames will be negative, and a 'cslg' (composition
     *            shift least greatest) box will be included per 14496-1
     *            amendment 1. This improves compatibility with Apple players
     *            and tools.
     * @see MovCslgAtom
     */
    public void setCslgAtom(String cslgAtom) {
        this.cslgAtom = cslgAtom;
    }

    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param cslgAtom When enabled, file composition times will start at zero,
     *            composition times in the 'ctts' (composition time to sample)
     *            box for B-frames will be negative, and a 'cslg' (composition
     *            shift least greatest) box will be included per 14496-1
     *            amendment 1. This improves compatibility with Apple players
     *            and tools.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MovCslgAtom
     */
    public MovSettings withCslgAtom(String cslgAtom) {
        this.cslgAtom = cslgAtom;
        return this;
    }

    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param cslgAtom When enabled, file composition times will start at zero,
     *            composition times in the 'ctts' (composition time to sample)
     *            box for B-frames will be negative, and a 'cslg' (composition
     *            shift least greatest) box will be included per 14496-1
     *            amendment 1. This improves compatibility with Apple players
     *            and tools.
     * @see MovCslgAtom
     */
    public void setCslgAtom(MovCslgAtom cslgAtom) {
        this.cslgAtom = cslgAtom.toString();
    }

    /**
     * When enabled, file composition times will start at zero, composition
     * times in the 'ctts' (composition time to sample) box for B-frames will be
     * negative, and a 'cslg' (composition shift least greatest) box will be
     * included per 14496-1 amendment 1. This improves compatibility with Apple
     * players and tools.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INCLUDE, EXCLUDE
     *
     * @param cslgAtom When enabled, file composition times will start at zero,
     *            composition times in the 'ctts' (composition time to sample)
     *            box for B-frames will be negative, and a 'cslg' (composition
     *            shift least greatest) box will be included per 14496-1
     *            amendment 1. This improves compatibility with Apple players
     *            and tools.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MovCslgAtom
     */
    public MovSettings withCslgAtom(MovCslgAtom cslgAtom) {
        this.cslgAtom = cslgAtom.toString();
        return this;
    }

    /**
     * When set to XDCAM, writes MPEG2 video streams into the QuickTime file
     * using XDCAM fourcc codes. This increases compatibility with Apple editors
     * and players, but may decrease compatibility with other players. Only
     * applicable when the video codec is MPEG2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>XDCAM, MPEG
     *
     * @return When set to XDCAM, writes MPEG2 video streams into the QuickTime
     *         file using XDCAM fourcc codes. This increases compatibility with
     *         Apple editors and players, but may decrease compatibility with
     *         other players. Only applicable when the video codec is MPEG2.
     * @see MovMpeg2FourCCControl
     */
    public String getMpeg2FourCCControl() {
        return mpeg2FourCCControl;
    }

    /**
     * When set to XDCAM, writes MPEG2 video streams into the QuickTime file
     * using XDCAM fourcc codes. This increases compatibility with Apple editors
     * and players, but may decrease compatibility with other players. Only
     * applicable when the video codec is MPEG2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>XDCAM, MPEG
     *
     * @param mpeg2FourCCControl When set to XDCAM, writes MPEG2 video streams
     *            into the QuickTime file using XDCAM fourcc codes. This
     *            increases compatibility with Apple editors and players, but
     *            may decrease compatibility with other players. Only applicable
     *            when the video codec is MPEG2.
     * @see MovMpeg2FourCCControl
     */
    public void setMpeg2FourCCControl(String mpeg2FourCCControl) {
        this.mpeg2FourCCControl = mpeg2FourCCControl;
    }

    /**
     * When set to XDCAM, writes MPEG2 video streams into the QuickTime file
     * using XDCAM fourcc codes. This increases compatibility with Apple editors
     * and players, but may decrease compatibility with other players. Only
     * applicable when the video codec is MPEG2.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>XDCAM, MPEG
     *
     * @param mpeg2FourCCControl When set to XDCAM, writes MPEG2 video streams
     *            into the QuickTime file using XDCAM fourcc codes. This
     *            increases compatibility with Apple editors and players, but
     *            may decrease compatibility with other players. Only applicable
     *            when the video codec is MPEG2.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MovMpeg2FourCCControl
     */
    public MovSettings withMpeg2FourCCControl(String mpeg2FourCCControl) {
        this.mpeg2FourCCControl = mpeg2FourCCControl;
        return this;
    }

    /**
     * When set to XDCAM, writes MPEG2 video streams into the QuickTime file
     * using XDCAM fourcc codes. This increases compatibility with Apple editors
     * and players, but may decrease compatibility with other players. Only
     * applicable when the video codec is MPEG2.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>XDCAM, MPEG
     *
     * @param mpeg2FourCCControl When set to XDCAM, writes MPEG2 video streams
     *            into the QuickTime file using XDCAM fourcc codes. This
     *            increases compatibility with Apple editors and players, but
     *            may decrease compatibility with other players. Only applicable
     *            when the video codec is MPEG2.
     * @see MovMpeg2FourCCControl
     */
    public void setMpeg2FourCCControl(MovMpeg2FourCCControl mpeg2FourCCControl) {
        this.mpeg2FourCCControl = mpeg2FourCCControl.toString();
    }

    /**
     * When set to XDCAM, writes MPEG2 video streams into the QuickTime file
     * using XDCAM fourcc codes. This increases compatibility with Apple editors
     * and players, but may decrease compatibility with other players. Only
     * applicable when the video codec is MPEG2.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>XDCAM, MPEG
     *
     * @param mpeg2FourCCControl When set to XDCAM, writes MPEG2 video streams
     *            into the QuickTime file using XDCAM fourcc codes. This
     *            increases compatibility with Apple editors and players, but
     *            may decrease compatibility with other players. Only applicable
     *            when the video codec is MPEG2.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MovMpeg2FourCCControl
     */
    public MovSettings withMpeg2FourCCControl(MovMpeg2FourCCControl mpeg2FourCCControl) {
        this.mpeg2FourCCControl = mpeg2FourCCControl.toString();
        return this;
    }

    /**
     * If set to OMNEON, inserts Omneon-compatible padding
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OMNEON, NONE
     *
     * @return If set to OMNEON, inserts Omneon-compatible padding
     * @see MovPaddingControl
     */
    public String getPaddingControl() {
        return paddingControl;
    }

    /**
     * If set to OMNEON, inserts Omneon-compatible padding
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OMNEON, NONE
     *
     * @param paddingControl If set to OMNEON, inserts Omneon-compatible padding
     * @see MovPaddingControl
     */
    public void setPaddingControl(String paddingControl) {
        this.paddingControl = paddingControl;
    }

    /**
     * If set to OMNEON, inserts Omneon-compatible padding
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OMNEON, NONE
     *
     * @param paddingControl If set to OMNEON, inserts Omneon-compatible padding
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MovPaddingControl
     */
    public MovSettings withPaddingControl(String paddingControl) {
        this.paddingControl = paddingControl;
        return this;
    }

    /**
     * If set to OMNEON, inserts Omneon-compatible padding
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OMNEON, NONE
     *
     * @param paddingControl If set to OMNEON, inserts Omneon-compatible padding
     * @see MovPaddingControl
     */
    public void setPaddingControl(MovPaddingControl paddingControl) {
        this.paddingControl = paddingControl.toString();
    }

    /**
     * If set to OMNEON, inserts Omneon-compatible padding
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OMNEON, NONE
     *
     * @param paddingControl If set to OMNEON, inserts Omneon-compatible padding
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MovPaddingControl
     */
    public MovSettings withPaddingControl(MovPaddingControl paddingControl) {
        this.paddingControl = paddingControl.toString();
        return this;
    }

    /**
     * Always keep the default value (SELF_CONTAINED) for this setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_CONTAINED, EXTERNAL
     *
     * @return Always keep the default value (SELF_CONTAINED) for this setting.
     * @see MovReference
     */
    public String getReference() {
        return reference;
    }

    /**
     * Always keep the default value (SELF_CONTAINED) for this setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_CONTAINED, EXTERNAL
     *
     * @param reference Always keep the default value (SELF_CONTAINED) for this
     *            setting.
     * @see MovReference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Always keep the default value (SELF_CONTAINED) for this setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_CONTAINED, EXTERNAL
     *
     * @param reference Always keep the default value (SELF_CONTAINED) for this
     *            setting.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MovReference
     */
    public MovSettings withReference(String reference) {
        this.reference = reference;
        return this;
    }

    /**
     * Always keep the default value (SELF_CONTAINED) for this setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_CONTAINED, EXTERNAL
     *
     * @param reference Always keep the default value (SELF_CONTAINED) for this
     *            setting.
     * @see MovReference
     */
    public void setReference(MovReference reference) {
        this.reference = reference.toString();
    }

    /**
     * Always keep the default value (SELF_CONTAINED) for this setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SELF_CONTAINED, EXTERNAL
     *
     * @param reference Always keep the default value (SELF_CONTAINED) for this
     *            setting.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MovReference
     */
    public MovSettings withReference(MovReference reference) {
        this.reference = reference.toString();
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
        if (getClapAtom() != null)
            sb.append("ClapAtom: " + getClapAtom() + ",");
        if (getCslgAtom() != null)
            sb.append("CslgAtom: " + getCslgAtom() + ",");
        if (getMpeg2FourCCControl() != null)
            sb.append("Mpeg2FourCCControl: " + getMpeg2FourCCControl() + ",");
        if (getPaddingControl() != null)
            sb.append("PaddingControl: " + getPaddingControl() + ",");
        if (getReference() != null)
            sb.append("Reference: " + getReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClapAtom() == null) ? 0 : getClapAtom().hashCode());
        hashCode = prime * hashCode + ((getCslgAtom() == null) ? 0 : getCslgAtom().hashCode());
        hashCode = prime * hashCode
                + ((getMpeg2FourCCControl() == null) ? 0 : getMpeg2FourCCControl().hashCode());
        hashCode = prime * hashCode
                + ((getPaddingControl() == null) ? 0 : getPaddingControl().hashCode());
        hashCode = prime * hashCode + ((getReference() == null) ? 0 : getReference().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MovSettings == false)
            return false;
        MovSettings other = (MovSettings) obj;

        if (other.getClapAtom() == null ^ this.getClapAtom() == null)
            return false;
        if (other.getClapAtom() != null && other.getClapAtom().equals(this.getClapAtom()) == false)
            return false;
        if (other.getCslgAtom() == null ^ this.getCslgAtom() == null)
            return false;
        if (other.getCslgAtom() != null && other.getCslgAtom().equals(this.getCslgAtom()) == false)
            return false;
        if (other.getMpeg2FourCCControl() == null ^ this.getMpeg2FourCCControl() == null)
            return false;
        if (other.getMpeg2FourCCControl() != null
                && other.getMpeg2FourCCControl().equals(this.getMpeg2FourCCControl()) == false)
            return false;
        if (other.getPaddingControl() == null ^ this.getPaddingControl() == null)
            return false;
        if (other.getPaddingControl() != null
                && other.getPaddingControl().equals(this.getPaddingControl()) == false)
            return false;
        if (other.getReference() == null ^ this.getReference() == null)
            return false;
        if (other.getReference() != null
                && other.getReference().equals(this.getReference()) == false)
            return false;
        return true;
    }
}
