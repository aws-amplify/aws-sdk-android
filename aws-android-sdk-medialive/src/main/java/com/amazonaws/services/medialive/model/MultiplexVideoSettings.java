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
 * The video configuration for each program in a multiplex.
 */
public class MultiplexVideoSettings implements Serializable {
    /**
     * The constant bitrate configuration for the video encode. When this field
     * is defined, StatmuxSettings must be undefined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     */
    private Integer constantBitrate;

    /**
     * Statmux rate control settings. When this field is defined,
     * ConstantBitrate must be undefined.
     */
    private MultiplexStatmuxVideoSettings statmuxSettings;

    /**
     * The constant bitrate configuration for the video encode. When this field
     * is defined, StatmuxSettings must be undefined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     *
     * @return The constant bitrate configuration for the video encode. When
     *         this field is defined, StatmuxSettings must be undefined.
     */
    public Integer getConstantBitrate() {
        return constantBitrate;
    }

    /**
     * The constant bitrate configuration for the video encode. When this field
     * is defined, StatmuxSettings must be undefined.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     *
     * @param constantBitrate The constant bitrate configuration for the video
     *            encode. When this field is defined, StatmuxSettings must be
     *            undefined.
     */
    public void setConstantBitrate(Integer constantBitrate) {
        this.constantBitrate = constantBitrate;
    }

    /**
     * The constant bitrate configuration for the video encode. When this field
     * is defined, StatmuxSettings must be undefined.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     *
     * @param constantBitrate The constant bitrate configuration for the video
     *            encode. When this field is defined, StatmuxSettings must be
     *            undefined.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexVideoSettings withConstantBitrate(Integer constantBitrate) {
        this.constantBitrate = constantBitrate;
        return this;
    }

    /**
     * Statmux rate control settings. When this field is defined,
     * ConstantBitrate must be undefined.
     *
     * @return Statmux rate control settings. When this field is defined,
     *         ConstantBitrate must be undefined.
     */
    public MultiplexStatmuxVideoSettings getStatmuxSettings() {
        return statmuxSettings;
    }

    /**
     * Statmux rate control settings. When this field is defined,
     * ConstantBitrate must be undefined.
     *
     * @param statmuxSettings Statmux rate control settings. When this field is
     *            defined, ConstantBitrate must be undefined.
     */
    public void setStatmuxSettings(MultiplexStatmuxVideoSettings statmuxSettings) {
        this.statmuxSettings = statmuxSettings;
    }

    /**
     * Statmux rate control settings. When this field is defined,
     * ConstantBitrate must be undefined.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statmuxSettings Statmux rate control settings. When this field is
     *            defined, ConstantBitrate must be undefined.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexVideoSettings withStatmuxSettings(MultiplexStatmuxVideoSettings statmuxSettings) {
        this.statmuxSettings = statmuxSettings;
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
        if (getConstantBitrate() != null)
            sb.append("ConstantBitrate: " + getConstantBitrate() + ",");
        if (getStatmuxSettings() != null)
            sb.append("StatmuxSettings: " + getStatmuxSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConstantBitrate() == null) ? 0 : getConstantBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getStatmuxSettings() == null) ? 0 : getStatmuxSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexVideoSettings == false)
            return false;
        MultiplexVideoSettings other = (MultiplexVideoSettings) obj;

        if (other.getConstantBitrate() == null ^ this.getConstantBitrate() == null)
            return false;
        if (other.getConstantBitrate() != null
                && other.getConstantBitrate().equals(this.getConstantBitrate()) == false)
            return false;
        if (other.getStatmuxSettings() == null ^ this.getStatmuxSettings() == null)
            return false;
        if (other.getStatmuxSettings() != null
                && other.getStatmuxSettings().equals(this.getStatmuxSettings()) == false)
            return false;
        return true;
    }
}
