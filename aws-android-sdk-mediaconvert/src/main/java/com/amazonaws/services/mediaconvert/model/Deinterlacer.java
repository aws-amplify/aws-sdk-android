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
 * Settings for deinterlacer
 */
public class Deinterlacer implements Serializable {
    /**
     * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace
     * (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate
     * (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces
     * smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your
     * source file includes a ticker, such as a scrolling headline at the bottom
     * of the frame.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERPOLATE, INTERPOLATE_TICKER, BLEND,
     * BLEND_TICKER
     */
    private String algorithm;

    /**
     * - When set to NORMAL (default), the deinterlacer does not convert frames
     * that are tagged in metadata as progressive. It will only convert those
     * that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the
     * deinterlacer converts every frame to progressive - even those that are
     * already tagged as progressive. Turn Force mode on only if there is a good
     * chance that the metadata has tagged frames as progressive when they are
     * not progressive. Do not turn on otherwise; processing frames that are
     * already progressive into progressive will probably result in lower
     * quality video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE_ALL_FRAMES, NORMAL
     */
    private String control;

    /**
     * Use Deinterlacer (DeinterlaceMode) to choose how the service will do
     * deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced
     * to progressive. - Inverse telecine converts Hard Telecine 29.97i to
     * progressive 23.976p. - Adaptive auto-detects and converts to progressive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEINTERLACE, INVERSE_TELECINE, ADAPTIVE
     */
    private String mode;

    /**
     * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace
     * (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate
     * (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces
     * smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your
     * source file includes a ticker, such as a scrolling headline at the bottom
     * of the frame.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERPOLATE, INTERPOLATE_TICKER, BLEND,
     * BLEND_TICKER
     *
     * @return Only applies when you set Deinterlacer (DeinterlaceMode) to
     *         Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive
     *         interpolate (INTERPOLATE) produces sharper pictures, while blend
     *         (BLEND) produces smoother motion. Use (INTERPOLATE_TICKER) OR
     *         (BLEND_TICKER) if your source file includes a ticker, such as a
     *         scrolling headline at the bottom of the frame.
     * @see DeinterlaceAlgorithm
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace
     * (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate
     * (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces
     * smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your
     * source file includes a ticker, such as a scrolling headline at the bottom
     * of the frame.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERPOLATE, INTERPOLATE_TICKER, BLEND,
     * BLEND_TICKER
     *
     * @param algorithm Only applies when you set Deinterlacer (DeinterlaceMode)
     *            to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion
     *            adaptive interpolate (INTERPOLATE) produces sharper pictures,
     *            while blend (BLEND) produces smoother motion. Use
     *            (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file
     *            includes a ticker, such as a scrolling headline at the bottom
     *            of the frame.
     * @see DeinterlaceAlgorithm
     */
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace
     * (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate
     * (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces
     * smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your
     * source file includes a ticker, such as a scrolling headline at the bottom
     * of the frame.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERPOLATE, INTERPOLATE_TICKER, BLEND,
     * BLEND_TICKER
     *
     * @param algorithm Only applies when you set Deinterlacer (DeinterlaceMode)
     *            to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion
     *            adaptive interpolate (INTERPOLATE) produces sharper pictures,
     *            while blend (BLEND) produces smoother motion. Use
     *            (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file
     *            includes a ticker, such as a scrolling headline at the bottom
     *            of the frame.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeinterlaceAlgorithm
     */
    public Deinterlacer withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }

    /**
     * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace
     * (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate
     * (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces
     * smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your
     * source file includes a ticker, such as a scrolling headline at the bottom
     * of the frame.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERPOLATE, INTERPOLATE_TICKER, BLEND,
     * BLEND_TICKER
     *
     * @param algorithm Only applies when you set Deinterlacer (DeinterlaceMode)
     *            to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion
     *            adaptive interpolate (INTERPOLATE) produces sharper pictures,
     *            while blend (BLEND) produces smoother motion. Use
     *            (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file
     *            includes a ticker, such as a scrolling headline at the bottom
     *            of the frame.
     * @see DeinterlaceAlgorithm
     */
    public void setAlgorithm(DeinterlaceAlgorithm algorithm) {
        this.algorithm = algorithm.toString();
    }

    /**
     * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace
     * (DEINTERLACE) or Adaptive (ADAPTIVE). Motion adaptive interpolate
     * (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces
     * smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your
     * source file includes a ticker, such as a scrolling headline at the bottom
     * of the frame.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INTERPOLATE, INTERPOLATE_TICKER, BLEND,
     * BLEND_TICKER
     *
     * @param algorithm Only applies when you set Deinterlacer (DeinterlaceMode)
     *            to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE). Motion
     *            adaptive interpolate (INTERPOLATE) produces sharper pictures,
     *            while blend (BLEND) produces smoother motion. Use
     *            (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file
     *            includes a ticker, such as a scrolling headline at the bottom
     *            of the frame.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeinterlaceAlgorithm
     */
    public Deinterlacer withAlgorithm(DeinterlaceAlgorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * - When set to NORMAL (default), the deinterlacer does not convert frames
     * that are tagged in metadata as progressive. It will only convert those
     * that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the
     * deinterlacer converts every frame to progressive - even those that are
     * already tagged as progressive. Turn Force mode on only if there is a good
     * chance that the metadata has tagged frames as progressive when they are
     * not progressive. Do not turn on otherwise; processing frames that are
     * already progressive into progressive will probably result in lower
     * quality video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE_ALL_FRAMES, NORMAL
     *
     * @return - When set to NORMAL (default), the deinterlacer does not convert
     *         frames that are tagged in metadata as progressive. It will only
     *         convert those that are tagged as some other type. - When set to
     *         FORCE_ALL_FRAMES, the deinterlacer converts every frame to
     *         progressive - even those that are already tagged as progressive.
     *         Turn Force mode on only if there is a good chance that the
     *         metadata has tagged frames as progressive when they are not
     *         progressive. Do not turn on otherwise; processing frames that are
     *         already progressive into progressive will probably result in
     *         lower quality video.
     * @see DeinterlacerControl
     */
    public String getControl() {
        return control;
    }

    /**
     * - When set to NORMAL (default), the deinterlacer does not convert frames
     * that are tagged in metadata as progressive. It will only convert those
     * that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the
     * deinterlacer converts every frame to progressive - even those that are
     * already tagged as progressive. Turn Force mode on only if there is a good
     * chance that the metadata has tagged frames as progressive when they are
     * not progressive. Do not turn on otherwise; processing frames that are
     * already progressive into progressive will probably result in lower
     * quality video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE_ALL_FRAMES, NORMAL
     *
     * @param control - When set to NORMAL (default), the deinterlacer does not
     *            convert frames that are tagged in metadata as progressive. It
     *            will only convert those that are tagged as some other type. -
     *            When set to FORCE_ALL_FRAMES, the deinterlacer converts every
     *            frame to progressive - even those that are already tagged as
     *            progressive. Turn Force mode on only if there is a good chance
     *            that the metadata has tagged frames as progressive when they
     *            are not progressive. Do not turn on otherwise; processing
     *            frames that are already progressive into progressive will
     *            probably result in lower quality video.
     * @see DeinterlacerControl
     */
    public void setControl(String control) {
        this.control = control;
    }

    /**
     * - When set to NORMAL (default), the deinterlacer does not convert frames
     * that are tagged in metadata as progressive. It will only convert those
     * that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the
     * deinterlacer converts every frame to progressive - even those that are
     * already tagged as progressive. Turn Force mode on only if there is a good
     * chance that the metadata has tagged frames as progressive when they are
     * not progressive. Do not turn on otherwise; processing frames that are
     * already progressive into progressive will probably result in lower
     * quality video.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE_ALL_FRAMES, NORMAL
     *
     * @param control - When set to NORMAL (default), the deinterlacer does not
     *            convert frames that are tagged in metadata as progressive. It
     *            will only convert those that are tagged as some other type. -
     *            When set to FORCE_ALL_FRAMES, the deinterlacer converts every
     *            frame to progressive - even those that are already tagged as
     *            progressive. Turn Force mode on only if there is a good chance
     *            that the metadata has tagged frames as progressive when they
     *            are not progressive. Do not turn on otherwise; processing
     *            frames that are already progressive into progressive will
     *            probably result in lower quality video.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeinterlacerControl
     */
    public Deinterlacer withControl(String control) {
        this.control = control;
        return this;
    }

    /**
     * - When set to NORMAL (default), the deinterlacer does not convert frames
     * that are tagged in metadata as progressive. It will only convert those
     * that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the
     * deinterlacer converts every frame to progressive - even those that are
     * already tagged as progressive. Turn Force mode on only if there is a good
     * chance that the metadata has tagged frames as progressive when they are
     * not progressive. Do not turn on otherwise; processing frames that are
     * already progressive into progressive will probably result in lower
     * quality video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE_ALL_FRAMES, NORMAL
     *
     * @param control - When set to NORMAL (default), the deinterlacer does not
     *            convert frames that are tagged in metadata as progressive. It
     *            will only convert those that are tagged as some other type. -
     *            When set to FORCE_ALL_FRAMES, the deinterlacer converts every
     *            frame to progressive - even those that are already tagged as
     *            progressive. Turn Force mode on only if there is a good chance
     *            that the metadata has tagged frames as progressive when they
     *            are not progressive. Do not turn on otherwise; processing
     *            frames that are already progressive into progressive will
     *            probably result in lower quality video.
     * @see DeinterlacerControl
     */
    public void setControl(DeinterlacerControl control) {
        this.control = control.toString();
    }

    /**
     * - When set to NORMAL (default), the deinterlacer does not convert frames
     * that are tagged in metadata as progressive. It will only convert those
     * that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the
     * deinterlacer converts every frame to progressive - even those that are
     * already tagged as progressive. Turn Force mode on only if there is a good
     * chance that the metadata has tagged frames as progressive when they are
     * not progressive. Do not turn on otherwise; processing frames that are
     * already progressive into progressive will probably result in lower
     * quality video.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FORCE_ALL_FRAMES, NORMAL
     *
     * @param control - When set to NORMAL (default), the deinterlacer does not
     *            convert frames that are tagged in metadata as progressive. It
     *            will only convert those that are tagged as some other type. -
     *            When set to FORCE_ALL_FRAMES, the deinterlacer converts every
     *            frame to progressive - even those that are already tagged as
     *            progressive. Turn Force mode on only if there is a good chance
     *            that the metadata has tagged frames as progressive when they
     *            are not progressive. Do not turn on otherwise; processing
     *            frames that are already progressive into progressive will
     *            probably result in lower quality video.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeinterlacerControl
     */
    public Deinterlacer withControl(DeinterlacerControl control) {
        this.control = control.toString();
        return this;
    }

    /**
     * Use Deinterlacer (DeinterlaceMode) to choose how the service will do
     * deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced
     * to progressive. - Inverse telecine converts Hard Telecine 29.97i to
     * progressive 23.976p. - Adaptive auto-detects and converts to progressive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEINTERLACE, INVERSE_TELECINE, ADAPTIVE
     *
     * @return Use Deinterlacer (DeinterlaceMode) to choose how the service will
     *         do deinterlacing. Default is Deinterlace. - Deinterlace converts
     *         interlaced to progressive. - Inverse telecine converts Hard
     *         Telecine 29.97i to progressive 23.976p. - Adaptive auto-detects
     *         and converts to progressive.
     * @see DeinterlacerMode
     */
    public String getMode() {
        return mode;
    }

    /**
     * Use Deinterlacer (DeinterlaceMode) to choose how the service will do
     * deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced
     * to progressive. - Inverse telecine converts Hard Telecine 29.97i to
     * progressive 23.976p. - Adaptive auto-detects and converts to progressive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEINTERLACE, INVERSE_TELECINE, ADAPTIVE
     *
     * @param mode Use Deinterlacer (DeinterlaceMode) to choose how the service
     *            will do deinterlacing. Default is Deinterlace. - Deinterlace
     *            converts interlaced to progressive. - Inverse telecine
     *            converts Hard Telecine 29.97i to progressive 23.976p. -
     *            Adaptive auto-detects and converts to progressive.
     * @see DeinterlacerMode
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Use Deinterlacer (DeinterlaceMode) to choose how the service will do
     * deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced
     * to progressive. - Inverse telecine converts Hard Telecine 29.97i to
     * progressive 23.976p. - Adaptive auto-detects and converts to progressive.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEINTERLACE, INVERSE_TELECINE, ADAPTIVE
     *
     * @param mode Use Deinterlacer (DeinterlaceMode) to choose how the service
     *            will do deinterlacing. Default is Deinterlace. - Deinterlace
     *            converts interlaced to progressive. - Inverse telecine
     *            converts Hard Telecine 29.97i to progressive 23.976p. -
     *            Adaptive auto-detects and converts to progressive.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeinterlacerMode
     */
    public Deinterlacer withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Use Deinterlacer (DeinterlaceMode) to choose how the service will do
     * deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced
     * to progressive. - Inverse telecine converts Hard Telecine 29.97i to
     * progressive 23.976p. - Adaptive auto-detects and converts to progressive.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEINTERLACE, INVERSE_TELECINE, ADAPTIVE
     *
     * @param mode Use Deinterlacer (DeinterlaceMode) to choose how the service
     *            will do deinterlacing. Default is Deinterlace. - Deinterlace
     *            converts interlaced to progressive. - Inverse telecine
     *            converts Hard Telecine 29.97i to progressive 23.976p. -
     *            Adaptive auto-detects and converts to progressive.
     * @see DeinterlacerMode
     */
    public void setMode(DeinterlacerMode mode) {
        this.mode = mode.toString();
    }

    /**
     * Use Deinterlacer (DeinterlaceMode) to choose how the service will do
     * deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced
     * to progressive. - Inverse telecine converts Hard Telecine 29.97i to
     * progressive 23.976p. - Adaptive auto-detects and converts to progressive.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEINTERLACE, INVERSE_TELECINE, ADAPTIVE
     *
     * @param mode Use Deinterlacer (DeinterlaceMode) to choose how the service
     *            will do deinterlacing. Default is Deinterlace. - Deinterlace
     *            converts interlaced to progressive. - Inverse telecine
     *            converts Hard Telecine 29.97i to progressive 23.976p. -
     *            Adaptive auto-detects and converts to progressive.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DeinterlacerMode
     */
    public Deinterlacer withMode(DeinterlacerMode mode) {
        this.mode = mode.toString();
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: " + getAlgorithm() + ",");
        if (getControl() != null)
            sb.append("Control: " + getControl() + ",");
        if (getMode() != null)
            sb.append("Mode: " + getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Deinterlacer == false)
            return false;
        Deinterlacer other = (Deinterlacer) obj;

        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null
                && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }
}
