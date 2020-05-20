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
 * Statmux rate control settings
 */
public class MultiplexStatmuxVideoSettings implements Serializable {
    /**
     * Maximum statmux bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     */
    private Integer maximumBitrate;

    /**
     * Minimum statmux bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     */
    private Integer minimumBitrate;

    /**
     * Maximum statmux bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     *
     * @return Maximum statmux bitrate.
     */
    public Integer getMaximumBitrate() {
        return maximumBitrate;
    }

    /**
     * Maximum statmux bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     *
     * @param maximumBitrate Maximum statmux bitrate.
     */
    public void setMaximumBitrate(Integer maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
    }

    /**
     * Maximum statmux bitrate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     *
     * @param maximumBitrate Maximum statmux bitrate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexStatmuxVideoSettings withMaximumBitrate(Integer maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
        return this;
    }

    /**
     * Minimum statmux bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     *
     * @return Minimum statmux bitrate.
     */
    public Integer getMinimumBitrate() {
        return minimumBitrate;
    }

    /**
     * Minimum statmux bitrate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     *
     * @param minimumBitrate Minimum statmux bitrate.
     */
    public void setMinimumBitrate(Integer minimumBitrate) {
        this.minimumBitrate = minimumBitrate;
    }

    /**
     * Minimum statmux bitrate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>100000 - 100000000<br/>
     *
     * @param minimumBitrate Minimum statmux bitrate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexStatmuxVideoSettings withMinimumBitrate(Integer minimumBitrate) {
        this.minimumBitrate = minimumBitrate;
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
        if (getMaximumBitrate() != null)
            sb.append("MaximumBitrate: " + getMaximumBitrate() + ",");
        if (getMinimumBitrate() != null)
            sb.append("MinimumBitrate: " + getMinimumBitrate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaximumBitrate() == null) ? 0 : getMaximumBitrate().hashCode());
        hashCode = prime * hashCode
                + ((getMinimumBitrate() == null) ? 0 : getMinimumBitrate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexStatmuxVideoSettings == false)
            return false;
        MultiplexStatmuxVideoSettings other = (MultiplexStatmuxVideoSettings) obj;

        if (other.getMaximumBitrate() == null ^ this.getMaximumBitrate() == null)
            return false;
        if (other.getMaximumBitrate() != null
                && other.getMaximumBitrate().equals(this.getMaximumBitrate()) == false)
            return false;
        if (other.getMinimumBitrate() == null ^ this.getMinimumBitrate() == null)
            return false;
        if (other.getMinimumBitrate() != null
                && other.getMinimumBitrate().equals(this.getMinimumBitrate()) == false)
            return false;
        return true;
    }
}
