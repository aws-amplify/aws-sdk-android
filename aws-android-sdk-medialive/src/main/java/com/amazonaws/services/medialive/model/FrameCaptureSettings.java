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
 * Frame Capture Settings
 */
public class FrameCaptureSettings implements Serializable {
    /**
     * The frequency at which to capture frames for inclusion in the output. May
     * be specified in either seconds or milliseconds, as specified by
     * captureIntervalUnits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600000<br/>
     */
    private Integer captureInterval;

    /**
     * Unit for the frame capture interval.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MILLISECONDS, SECONDS
     */
    private String captureIntervalUnits;

    /**
     * The frequency at which to capture frames for inclusion in the output. May
     * be specified in either seconds or milliseconds, as specified by
     * captureIntervalUnits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600000<br/>
     *
     * @return The frequency at which to capture frames for inclusion in the
     *         output. May be specified in either seconds or milliseconds, as
     *         specified by captureIntervalUnits.
     */
    public Integer getCaptureInterval() {
        return captureInterval;
    }

    /**
     * The frequency at which to capture frames for inclusion in the output. May
     * be specified in either seconds or milliseconds, as specified by
     * captureIntervalUnits.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600000<br/>
     *
     * @param captureInterval The frequency at which to capture frames for
     *            inclusion in the output. May be specified in either seconds or
     *            milliseconds, as specified by captureIntervalUnits.
     */
    public void setCaptureInterval(Integer captureInterval) {
        this.captureInterval = captureInterval;
    }

    /**
     * The frequency at which to capture frames for inclusion in the output. May
     * be specified in either seconds or milliseconds, as specified by
     * captureIntervalUnits.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600000<br/>
     *
     * @param captureInterval The frequency at which to capture frames for
     *            inclusion in the output. May be specified in either seconds or
     *            milliseconds, as specified by captureIntervalUnits.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FrameCaptureSettings withCaptureInterval(Integer captureInterval) {
        this.captureInterval = captureInterval;
        return this;
    }

    /**
     * Unit for the frame capture interval.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MILLISECONDS, SECONDS
     *
     * @return Unit for the frame capture interval.
     * @see FrameCaptureIntervalUnit
     */
    public String getCaptureIntervalUnits() {
        return captureIntervalUnits;
    }

    /**
     * Unit for the frame capture interval.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MILLISECONDS, SECONDS
     *
     * @param captureIntervalUnits Unit for the frame capture interval.
     * @see FrameCaptureIntervalUnit
     */
    public void setCaptureIntervalUnits(String captureIntervalUnits) {
        this.captureIntervalUnits = captureIntervalUnits;
    }

    /**
     * Unit for the frame capture interval.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MILLISECONDS, SECONDS
     *
     * @param captureIntervalUnits Unit for the frame capture interval.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FrameCaptureIntervalUnit
     */
    public FrameCaptureSettings withCaptureIntervalUnits(String captureIntervalUnits) {
        this.captureIntervalUnits = captureIntervalUnits;
        return this;
    }

    /**
     * Unit for the frame capture interval.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MILLISECONDS, SECONDS
     *
     * @param captureIntervalUnits Unit for the frame capture interval.
     * @see FrameCaptureIntervalUnit
     */
    public void setCaptureIntervalUnits(FrameCaptureIntervalUnit captureIntervalUnits) {
        this.captureIntervalUnits = captureIntervalUnits.toString();
    }

    /**
     * Unit for the frame capture interval.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MILLISECONDS, SECONDS
     *
     * @param captureIntervalUnits Unit for the frame capture interval.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FrameCaptureIntervalUnit
     */
    public FrameCaptureSettings withCaptureIntervalUnits(
            FrameCaptureIntervalUnit captureIntervalUnits) {
        this.captureIntervalUnits = captureIntervalUnits.toString();
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
        if (getCaptureInterval() != null)
            sb.append("CaptureInterval: " + getCaptureInterval() + ",");
        if (getCaptureIntervalUnits() != null)
            sb.append("CaptureIntervalUnits: " + getCaptureIntervalUnits());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCaptureInterval() == null) ? 0 : getCaptureInterval().hashCode());
        hashCode = prime * hashCode
                + ((getCaptureIntervalUnits() == null) ? 0 : getCaptureIntervalUnits().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrameCaptureSettings == false)
            return false;
        FrameCaptureSettings other = (FrameCaptureSettings) obj;

        if (other.getCaptureInterval() == null ^ this.getCaptureInterval() == null)
            return false;
        if (other.getCaptureInterval() != null
                && other.getCaptureInterval().equals(this.getCaptureInterval()) == false)
            return false;
        if (other.getCaptureIntervalUnits() == null ^ this.getCaptureIntervalUnits() == null)
            return false;
        if (other.getCaptureIntervalUnits() != null
                && other.getCaptureIntervalUnits().equals(this.getCaptureIntervalUnits()) == false)
            return false;
        return true;
    }
}
