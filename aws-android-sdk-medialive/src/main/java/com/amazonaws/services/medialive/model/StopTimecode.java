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
 * Settings to identify the end of the clip.
 */
public class StopTimecode implements Serializable {
    /**
     * If you specify a StopTimecode in an input (in order to clip the file),
     * you can specify if you want the clip to exclude (the default) or include
     * the frame specified by the timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE_LAST_FRAME, INCLUDE_LAST_FRAME
     */
    private String lastFrameClippingBehavior;

    /**
     * The timecode for the frame where you want to stop the clip. Optional; if
     * not specified, the clip continues to the end of the file. Enter the
     * timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     */
    private String timecode;

    /**
     * If you specify a StopTimecode in an input (in order to clip the file),
     * you can specify if you want the clip to exclude (the default) or include
     * the frame specified by the timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE_LAST_FRAME, INCLUDE_LAST_FRAME
     *
     * @return If you specify a StopTimecode in an input (in order to clip the
     *         file), you can specify if you want the clip to exclude (the
     *         default) or include the frame specified by the timecode.
     * @see LastFrameClippingBehavior
     */
    public String getLastFrameClippingBehavior() {
        return lastFrameClippingBehavior;
    }

    /**
     * If you specify a StopTimecode in an input (in order to clip the file),
     * you can specify if you want the clip to exclude (the default) or include
     * the frame specified by the timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE_LAST_FRAME, INCLUDE_LAST_FRAME
     *
     * @param lastFrameClippingBehavior If you specify a StopTimecode in an
     *            input (in order to clip the file), you can specify if you want
     *            the clip to exclude (the default) or include the frame
     *            specified by the timecode.
     * @see LastFrameClippingBehavior
     */
    public void setLastFrameClippingBehavior(String lastFrameClippingBehavior) {
        this.lastFrameClippingBehavior = lastFrameClippingBehavior;
    }

    /**
     * If you specify a StopTimecode in an input (in order to clip the file),
     * you can specify if you want the clip to exclude (the default) or include
     * the frame specified by the timecode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE_LAST_FRAME, INCLUDE_LAST_FRAME
     *
     * @param lastFrameClippingBehavior If you specify a StopTimecode in an
     *            input (in order to clip the file), you can specify if you want
     *            the clip to exclude (the default) or include the frame
     *            specified by the timecode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LastFrameClippingBehavior
     */
    public StopTimecode withLastFrameClippingBehavior(String lastFrameClippingBehavior) {
        this.lastFrameClippingBehavior = lastFrameClippingBehavior;
        return this;
    }

    /**
     * If you specify a StopTimecode in an input (in order to clip the file),
     * you can specify if you want the clip to exclude (the default) or include
     * the frame specified by the timecode.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE_LAST_FRAME, INCLUDE_LAST_FRAME
     *
     * @param lastFrameClippingBehavior If you specify a StopTimecode in an
     *            input (in order to clip the file), you can specify if you want
     *            the clip to exclude (the default) or include the frame
     *            specified by the timecode.
     * @see LastFrameClippingBehavior
     */
    public void setLastFrameClippingBehavior(LastFrameClippingBehavior lastFrameClippingBehavior) {
        this.lastFrameClippingBehavior = lastFrameClippingBehavior.toString();
    }

    /**
     * If you specify a StopTimecode in an input (in order to clip the file),
     * you can specify if you want the clip to exclude (the default) or include
     * the frame specified by the timecode.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXCLUDE_LAST_FRAME, INCLUDE_LAST_FRAME
     *
     * @param lastFrameClippingBehavior If you specify a StopTimecode in an
     *            input (in order to clip the file), you can specify if you want
     *            the clip to exclude (the default) or include the frame
     *            specified by the timecode.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LastFrameClippingBehavior
     */
    public StopTimecode withLastFrameClippingBehavior(
            LastFrameClippingBehavior lastFrameClippingBehavior) {
        this.lastFrameClippingBehavior = lastFrameClippingBehavior.toString();
        return this;
    }

    /**
     * The timecode for the frame where you want to stop the clip. Optional; if
     * not specified, the clip continues to the end of the file. Enter the
     * timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     *
     * @return The timecode for the frame where you want to stop the clip.
     *         Optional; if not specified, the clip continues to the end of the
     *         file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     */
    public String getTimecode() {
        return timecode;
    }

    /**
     * The timecode for the frame where you want to stop the clip. Optional; if
     * not specified, the clip continues to the end of the file. Enter the
     * timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     *
     * @param timecode The timecode for the frame where you want to stop the
     *            clip. Optional; if not specified, the clip continues to the
     *            end of the file. Enter the timecode as HH:MM:SS:FF or
     *            HH:MM:SS;FF.
     */
    public void setTimecode(String timecode) {
        this.timecode = timecode;
    }

    /**
     * The timecode for the frame where you want to stop the clip. Optional; if
     * not specified, the clip continues to the end of the file. Enter the
     * timecode as HH:MM:SS:FF or HH:MM:SS;FF.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timecode The timecode for the frame where you want to stop the
     *            clip. Optional; if not specified, the clip continues to the
     *            end of the file. Enter the timecode as HH:MM:SS:FF or
     *            HH:MM:SS;FF.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StopTimecode withTimecode(String timecode) {
        this.timecode = timecode;
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
        if (getLastFrameClippingBehavior() != null)
            sb.append("LastFrameClippingBehavior: " + getLastFrameClippingBehavior() + ",");
        if (getTimecode() != null)
            sb.append("Timecode: " + getTimecode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLastFrameClippingBehavior() == null) ? 0 : getLastFrameClippingBehavior()
                        .hashCode());
        hashCode = prime * hashCode + ((getTimecode() == null) ? 0 : getTimecode().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopTimecode == false)
            return false;
        StopTimecode other = (StopTimecode) obj;

        if (other.getLastFrameClippingBehavior() == null
                ^ this.getLastFrameClippingBehavior() == null)
            return false;
        if (other.getLastFrameClippingBehavior() != null
                && other.getLastFrameClippingBehavior().equals(this.getLastFrameClippingBehavior()) == false)
            return false;
        if (other.getTimecode() == null ^ this.getTimecode() == null)
            return false;
        if (other.getTimecode() != null && other.getTimecode().equals(this.getTimecode()) == false)
            return false;
        return true;
    }
}
