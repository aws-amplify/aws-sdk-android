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
 * MXF settings
 */
public class MxfSettings implements Serializable {
    /**
     * Optional. When you have AFD signaling set up in your output video stream,
     * use this setting to choose whether to also include it in the MXF wrapper.
     * Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF
     * wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD
     * values from the video stream for this output to the MXF wrapper.
     * Regardless of which option you choose, the AFD values remain in the video
     * stream. Related settings: To set up your output to include or exclude AFD
     * values, see AfdSignaling, under VideoDescription. On the console, find
     * AFD signaling under the output's video encoding settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_COPY, COPY_FROM_VIDEO
     */
    private String afdSignaling;

    /**
     * Optional. When you have AFD signaling set up in your output video stream,
     * use this setting to choose whether to also include it in the MXF wrapper.
     * Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF
     * wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD
     * values from the video stream for this output to the MXF wrapper.
     * Regardless of which option you choose, the AFD values remain in the video
     * stream. Related settings: To set up your output to include or exclude AFD
     * values, see AfdSignaling, under VideoDescription. On the console, find
     * AFD signaling under the output's video encoding settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_COPY, COPY_FROM_VIDEO
     *
     * @return Optional. When you have AFD signaling set up in your output video
     *         stream, use this setting to choose whether to also include it in
     *         the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD
     *         signaling from the MXF wrapper. Choose Copy from video stream
     *         (COPY_FROM_VIDEO) to copy the AFD values from the video stream
     *         for this output to the MXF wrapper. Regardless of which option
     *         you choose, the AFD values remain in the video stream. Related
     *         settings: To set up your output to include or exclude AFD values,
     *         see AfdSignaling, under VideoDescription. On the console, find
     *         AFD signaling under the output's video encoding settings.
     * @see MxfAfdSignaling
     */
    public String getAfdSignaling() {
        return afdSignaling;
    }

    /**
     * Optional. When you have AFD signaling set up in your output video stream,
     * use this setting to choose whether to also include it in the MXF wrapper.
     * Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF
     * wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD
     * values from the video stream for this output to the MXF wrapper.
     * Regardless of which option you choose, the AFD values remain in the video
     * stream. Related settings: To set up your output to include or exclude AFD
     * values, see AfdSignaling, under VideoDescription. On the console, find
     * AFD signaling under the output's video encoding settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_COPY, COPY_FROM_VIDEO
     *
     * @param afdSignaling Optional. When you have AFD signaling set up in your
     *            output video stream, use this setting to choose whether to
     *            also include it in the MXF wrapper. Choose Don't copy
     *            (NO_COPY) to exclude AFD signaling from the MXF wrapper.
     *            Choose Copy from video stream (COPY_FROM_VIDEO) to copy the
     *            AFD values from the video stream for this output to the MXF
     *            wrapper. Regardless of which option you choose, the AFD values
     *            remain in the video stream. Related settings: To set up your
     *            output to include or exclude AFD values, see AfdSignaling,
     *            under VideoDescription. On the console, find AFD signaling
     *            under the output's video encoding settings.
     * @see MxfAfdSignaling
     */
    public void setAfdSignaling(String afdSignaling) {
        this.afdSignaling = afdSignaling;
    }

    /**
     * Optional. When you have AFD signaling set up in your output video stream,
     * use this setting to choose whether to also include it in the MXF wrapper.
     * Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF
     * wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD
     * values from the video stream for this output to the MXF wrapper.
     * Regardless of which option you choose, the AFD values remain in the video
     * stream. Related settings: To set up your output to include or exclude AFD
     * values, see AfdSignaling, under VideoDescription. On the console, find
     * AFD signaling under the output's video encoding settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_COPY, COPY_FROM_VIDEO
     *
     * @param afdSignaling Optional. When you have AFD signaling set up in your
     *            output video stream, use this setting to choose whether to
     *            also include it in the MXF wrapper. Choose Don't copy
     *            (NO_COPY) to exclude AFD signaling from the MXF wrapper.
     *            Choose Copy from video stream (COPY_FROM_VIDEO) to copy the
     *            AFD values from the video stream for this output to the MXF
     *            wrapper. Regardless of which option you choose, the AFD values
     *            remain in the video stream. Related settings: To set up your
     *            output to include or exclude AFD values, see AfdSignaling,
     *            under VideoDescription. On the console, find AFD signaling
     *            under the output's video encoding settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MxfAfdSignaling
     */
    public MxfSettings withAfdSignaling(String afdSignaling) {
        this.afdSignaling = afdSignaling;
        return this;
    }

    /**
     * Optional. When you have AFD signaling set up in your output video stream,
     * use this setting to choose whether to also include it in the MXF wrapper.
     * Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF
     * wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD
     * values from the video stream for this output to the MXF wrapper.
     * Regardless of which option you choose, the AFD values remain in the video
     * stream. Related settings: To set up your output to include or exclude AFD
     * values, see AfdSignaling, under VideoDescription. On the console, find
     * AFD signaling under the output's video encoding settings.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_COPY, COPY_FROM_VIDEO
     *
     * @param afdSignaling Optional. When you have AFD signaling set up in your
     *            output video stream, use this setting to choose whether to
     *            also include it in the MXF wrapper. Choose Don't copy
     *            (NO_COPY) to exclude AFD signaling from the MXF wrapper.
     *            Choose Copy from video stream (COPY_FROM_VIDEO) to copy the
     *            AFD values from the video stream for this output to the MXF
     *            wrapper. Regardless of which option you choose, the AFD values
     *            remain in the video stream. Related settings: To set up your
     *            output to include or exclude AFD values, see AfdSignaling,
     *            under VideoDescription. On the console, find AFD signaling
     *            under the output's video encoding settings.
     * @see MxfAfdSignaling
     */
    public void setAfdSignaling(MxfAfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
    }

    /**
     * Optional. When you have AFD signaling set up in your output video stream,
     * use this setting to choose whether to also include it in the MXF wrapper.
     * Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF
     * wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD
     * values from the video stream for this output to the MXF wrapper.
     * Regardless of which option you choose, the AFD values remain in the video
     * stream. Related settings: To set up your output to include or exclude AFD
     * values, see AfdSignaling, under VideoDescription. On the console, find
     * AFD signaling under the output's video encoding settings.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_COPY, COPY_FROM_VIDEO
     *
     * @param afdSignaling Optional. When you have AFD signaling set up in your
     *            output video stream, use this setting to choose whether to
     *            also include it in the MXF wrapper. Choose Don't copy
     *            (NO_COPY) to exclude AFD signaling from the MXF wrapper.
     *            Choose Copy from video stream (COPY_FROM_VIDEO) to copy the
     *            AFD values from the video stream for this output to the MXF
     *            wrapper. Regardless of which option you choose, the AFD values
     *            remain in the video stream. Related settings: To set up your
     *            output to include or exclude AFD values, see AfdSignaling,
     *            under VideoDescription. On the console, find AFD signaling
     *            under the output's video encoding settings.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MxfAfdSignaling
     */
    public MxfSettings withAfdSignaling(MxfAfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
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
            sb.append("AfdSignaling: " + getAfdSignaling());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAfdSignaling() == null) ? 0 : getAfdSignaling().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MxfSettings == false)
            return false;
        MxfSettings other = (MxfSettings) obj;

        if (other.getAfdSignaling() == null ^ this.getAfdSignaling() == null)
            return false;
        if (other.getAfdSignaling() != null
                && other.getAfdSignaling().equals(this.getAfdSignaling()) == false)
            return false;
        return true;
    }
}
