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
 * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified
 * prefix into the output.
 */
public class TimecodeBurnin implements Serializable {
    /**
     * Use Font Size (FontSize) to set the font size of any burned-in timecode.
     * Valid values are 10, 16, 32, 48.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 48<br/>
     */
    private Integer fontSize;

    /**
     * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to
     * specify the location the burned-in timecode on output video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOP_CENTER, TOP_LEFT, TOP_RIGHT, MIDDLE_LEFT,
     * MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT
     */
    private String position;

    /**
     * Use Prefix (Prefix) to place ASCII characters before any burned-in
     * timecode. For example, a prefix of "EZ-" will result in the timecode
     * "EZ-00:00:00:00". Provide either the characters themselves or the ASCII
     * code equivalents. The supported range of characters is 0x20 through 0x7e.
     * This includes letters, numbers, and all special characters represented on
     * a standard English keyboard.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[ -~]+$<br/>
     */
    private String prefix;

    /**
     * Use Font Size (FontSize) to set the font size of any burned-in timecode.
     * Valid values are 10, 16, 32, 48.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 48<br/>
     *
     * @return Use Font Size (FontSize) to set the font size of any burned-in
     *         timecode. Valid values are 10, 16, 32, 48.
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * Use Font Size (FontSize) to set the font size of any burned-in timecode.
     * Valid values are 10, 16, 32, 48.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 48<br/>
     *
     * @param fontSize Use Font Size (FontSize) to set the font size of any
     *            burned-in timecode. Valid values are 10, 16, 32, 48.
     */
    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * Use Font Size (FontSize) to set the font size of any burned-in timecode.
     * Valid values are 10, 16, 32, 48.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>10 - 48<br/>
     *
     * @param fontSize Use Font Size (FontSize) to set the font size of any
     *            burned-in timecode. Valid values are 10, 16, 32, 48.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimecodeBurnin withFontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    /**
     * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to
     * specify the location the burned-in timecode on output video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOP_CENTER, TOP_LEFT, TOP_RIGHT, MIDDLE_LEFT,
     * MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT
     *
     * @return Use Position (Position) under under Timecode burn-in
     *         (TimecodeBurnIn) to specify the location the burned-in timecode
     *         on output video.
     * @see TimecodeBurninPosition
     */
    public String getPosition() {
        return position;
    }

    /**
     * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to
     * specify the location the burned-in timecode on output video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOP_CENTER, TOP_LEFT, TOP_RIGHT, MIDDLE_LEFT,
     * MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT
     *
     * @param position Use Position (Position) under under Timecode burn-in
     *            (TimecodeBurnIn) to specify the location the burned-in
     *            timecode on output video.
     * @see TimecodeBurninPosition
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to
     * specify the location the burned-in timecode on output video.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOP_CENTER, TOP_LEFT, TOP_RIGHT, MIDDLE_LEFT,
     * MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT
     *
     * @param position Use Position (Position) under under Timecode burn-in
     *            (TimecodeBurnIn) to specify the location the burned-in
     *            timecode on output video.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimecodeBurninPosition
     */
    public TimecodeBurnin withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to
     * specify the location the burned-in timecode on output video.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOP_CENTER, TOP_LEFT, TOP_RIGHT, MIDDLE_LEFT,
     * MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT
     *
     * @param position Use Position (Position) under under Timecode burn-in
     *            (TimecodeBurnIn) to specify the location the burned-in
     *            timecode on output video.
     * @see TimecodeBurninPosition
     */
    public void setPosition(TimecodeBurninPosition position) {
        this.position = position.toString();
    }

    /**
     * Use Position (Position) under under Timecode burn-in (TimecodeBurnIn) to
     * specify the location the burned-in timecode on output video.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TOP_CENTER, TOP_LEFT, TOP_RIGHT, MIDDLE_LEFT,
     * MIDDLE_CENTER, MIDDLE_RIGHT, BOTTOM_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT
     *
     * @param position Use Position (Position) under under Timecode burn-in
     *            (TimecodeBurnIn) to specify the location the burned-in
     *            timecode on output video.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimecodeBurninPosition
     */
    public TimecodeBurnin withPosition(TimecodeBurninPosition position) {
        this.position = position.toString();
        return this;
    }

    /**
     * Use Prefix (Prefix) to place ASCII characters before any burned-in
     * timecode. For example, a prefix of "EZ-" will result in the timecode
     * "EZ-00:00:00:00". Provide either the characters themselves or the ASCII
     * code equivalents. The supported range of characters is 0x20 through 0x7e.
     * This includes letters, numbers, and all special characters represented on
     * a standard English keyboard.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[ -~]+$<br/>
     *
     * @return Use Prefix (Prefix) to place ASCII characters before any
     *         burned-in timecode. For example, a prefix of "EZ-" will result in
     *         the timecode "EZ-00:00:00:00". Provide either the characters
     *         themselves or the ASCII code equivalents. The supported range of
     *         characters is 0x20 through 0x7e. This includes letters, numbers,
     *         and all special characters represented on a standard English
     *         keyboard.
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Use Prefix (Prefix) to place ASCII characters before any burned-in
     * timecode. For example, a prefix of "EZ-" will result in the timecode
     * "EZ-00:00:00:00". Provide either the characters themselves or the ASCII
     * code equivalents. The supported range of characters is 0x20 through 0x7e.
     * This includes letters, numbers, and all special characters represented on
     * a standard English keyboard.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[ -~]+$<br/>
     *
     * @param prefix Use Prefix (Prefix) to place ASCII characters before any
     *            burned-in timecode. For example, a prefix of "EZ-" will result
     *            in the timecode "EZ-00:00:00:00". Provide either the
     *            characters themselves or the ASCII code equivalents. The
     *            supported range of characters is 0x20 through 0x7e. This
     *            includes letters, numbers, and all special characters
     *            represented on a standard English keyboard.
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * Use Prefix (Prefix) to place ASCII characters before any burned-in
     * timecode. For example, a prefix of "EZ-" will result in the timecode
     * "EZ-00:00:00:00". Provide either the characters themselves or the ASCII
     * code equivalents. The supported range of characters is 0x20 through 0x7e.
     * This includes letters, numbers, and all special characters represented on
     * a standard English keyboard.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[ -~]+$<br/>
     *
     * @param prefix Use Prefix (Prefix) to place ASCII characters before any
     *            burned-in timecode. For example, a prefix of "EZ-" will result
     *            in the timecode "EZ-00:00:00:00". Provide either the
     *            characters themselves or the ASCII code equivalents. The
     *            supported range of characters is 0x20 through 0x7e. This
     *            includes letters, numbers, and all special characters
     *            represented on a standard English keyboard.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimecodeBurnin withPrefix(String prefix) {
        this.prefix = prefix;
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
        if (getFontSize() != null)
            sb.append("FontSize: " + getFontSize() + ",");
        if (getPosition() != null)
            sb.append("Position: " + getPosition() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFontSize() == null) ? 0 : getFontSize().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimecodeBurnin == false)
            return false;
        TimecodeBurnin other = (TimecodeBurnin) obj;

        if (other.getFontSize() == null ^ this.getFontSize() == null)
            return false;
        if (other.getFontSize() != null && other.getFontSize().equals(this.getFontSize()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }
}
