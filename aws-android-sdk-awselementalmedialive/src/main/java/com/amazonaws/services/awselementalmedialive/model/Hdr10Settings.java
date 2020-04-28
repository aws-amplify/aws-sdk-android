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
 * Hdr10 Settings
 */
public class Hdr10Settings implements Serializable {
    /**
     * Maximum Content Light Level An integer metadata value defining the
     * maximum light level, in nits, of any single pixel within an encoded HDR
     * video stream or file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 32768<br/>
     */
    private Integer maxCll;

    /**
     * Maximum Frame Average Light Level An integer metadata value defining the
     * maximum average light level, in nits, for any single frame within an
     * encoded HDR video stream or file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 32768<br/>
     */
    private Integer maxFall;

    /**
     * Maximum Content Light Level An integer metadata value defining the
     * maximum light level, in nits, of any single pixel within an encoded HDR
     * video stream or file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 32768<br/>
     *
     * @return Maximum Content Light Level An integer metadata value defining
     *         the maximum light level, in nits, of any single pixel within an
     *         encoded HDR video stream or file.
     */
    public Integer getMaxCll() {
        return maxCll;
    }

    /**
     * Maximum Content Light Level An integer metadata value defining the
     * maximum light level, in nits, of any single pixel within an encoded HDR
     * video stream or file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 32768<br/>
     *
     * @param maxCll Maximum Content Light Level An integer metadata value
     *            defining the maximum light level, in nits, of any single pixel
     *            within an encoded HDR video stream or file.
     */
    public void setMaxCll(Integer maxCll) {
        this.maxCll = maxCll;
    }

    /**
     * Maximum Content Light Level An integer metadata value defining the
     * maximum light level, in nits, of any single pixel within an encoded HDR
     * video stream or file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 32768<br/>
     *
     * @param maxCll Maximum Content Light Level An integer metadata value
     *            defining the maximum light level, in nits, of any single pixel
     *            within an encoded HDR video stream or file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Settings withMaxCll(Integer maxCll) {
        this.maxCll = maxCll;
        return this;
    }

    /**
     * Maximum Frame Average Light Level An integer metadata value defining the
     * maximum average light level, in nits, for any single frame within an
     * encoded HDR video stream or file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 32768<br/>
     *
     * @return Maximum Frame Average Light Level An integer metadata value
     *         defining the maximum average light level, in nits, for any single
     *         frame within an encoded HDR video stream or file.
     */
    public Integer getMaxFall() {
        return maxFall;
    }

    /**
     * Maximum Frame Average Light Level An integer metadata value defining the
     * maximum average light level, in nits, for any single frame within an
     * encoded HDR video stream or file.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 32768<br/>
     *
     * @param maxFall Maximum Frame Average Light Level An integer metadata
     *            value defining the maximum average light level, in nits, for
     *            any single frame within an encoded HDR video stream or file.
     */
    public void setMaxFall(Integer maxFall) {
        this.maxFall = maxFall;
    }

    /**
     * Maximum Frame Average Light Level An integer metadata value defining the
     * maximum average light level, in nits, for any single frame within an
     * encoded HDR video stream or file.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 32768<br/>
     *
     * @param maxFall Maximum Frame Average Light Level An integer metadata
     *            value defining the maximum average light level, in nits, for
     *            any single frame within an encoded HDR video stream or file.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Hdr10Settings withMaxFall(Integer maxFall) {
        this.maxFall = maxFall;
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
        if (getMaxCll() != null)
            sb.append("MaxCll: " + getMaxCll() + ",");
        if (getMaxFall() != null)
            sb.append("MaxFall: " + getMaxFall());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxCll() == null) ? 0 : getMaxCll().hashCode());
        hashCode = prime * hashCode + ((getMaxFall() == null) ? 0 : getMaxFall().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Hdr10Settings == false)
            return false;
        Hdr10Settings other = (Hdr10Settings) obj;

        if (other.getMaxCll() == null ^ this.getMaxCll() == null)
            return false;
        if (other.getMaxCll() != null && other.getMaxCll().equals(this.getMaxCll()) == false)
            return false;
        if (other.getMaxFall() == null ^ this.getMaxFall() == null)
            return false;
        if (other.getMaxFall() != null && other.getMaxFall().equals(this.getMaxFall()) == false)
            return false;
        return true;
    }
}
