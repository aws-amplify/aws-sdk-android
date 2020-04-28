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
 * Scte20 Source Settings
 */
public class Scte20SourceSettings implements Serializable {
    /**
     * If upconvert, 608 data is both passed through via the
     * "608 compatibility bytes" fields of the 708 wrapper as well as translated
     * into 708. 708 data present in the source content will be discarded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, UPCONVERT
     */
    private String convert608To708;

    /**
     * Specifies the 608/708 channel number within the video track from which to
     * extract captions. Unused for passthrough.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     */
    private Integer source608ChannelNumber;

    /**
     * If upconvert, 608 data is both passed through via the
     * "608 compatibility bytes" fields of the 708 wrapper as well as translated
     * into 708. 708 data present in the source content will be discarded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, UPCONVERT
     *
     * @return If upconvert, 608 data is both passed through via the
     *         "608 compatibility bytes" fields of the 708 wrapper as well as
     *         translated into 708. 708 data present in the source content will
     *         be discarded.
     * @see Scte20Convert608To708
     */
    public String getConvert608To708() {
        return convert608To708;
    }

    /**
     * If upconvert, 608 data is both passed through via the
     * "608 compatibility bytes" fields of the 708 wrapper as well as translated
     * into 708. 708 data present in the source content will be discarded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, UPCONVERT
     *
     * @param convert608To708 If upconvert, 608 data is both passed through via
     *            the "608 compatibility bytes" fields of the 708 wrapper as
     *            well as translated into 708. 708 data present in the source
     *            content will be discarded.
     * @see Scte20Convert608To708
     */
    public void setConvert608To708(String convert608To708) {
        this.convert608To708 = convert608To708;
    }

    /**
     * If upconvert, 608 data is both passed through via the
     * "608 compatibility bytes" fields of the 708 wrapper as well as translated
     * into 708. 708 data present in the source content will be discarded.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, UPCONVERT
     *
     * @param convert608To708 If upconvert, 608 data is both passed through via
     *            the "608 compatibility bytes" fields of the 708 wrapper as
     *            well as translated into 708. 708 data present in the source
     *            content will be discarded.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte20Convert608To708
     */
    public Scte20SourceSettings withConvert608To708(String convert608To708) {
        this.convert608To708 = convert608To708;
        return this;
    }

    /**
     * If upconvert, 608 data is both passed through via the
     * "608 compatibility bytes" fields of the 708 wrapper as well as translated
     * into 708. 708 data present in the source content will be discarded.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, UPCONVERT
     *
     * @param convert608To708 If upconvert, 608 data is both passed through via
     *            the "608 compatibility bytes" fields of the 708 wrapper as
     *            well as translated into 708. 708 data present in the source
     *            content will be discarded.
     * @see Scte20Convert608To708
     */
    public void setConvert608To708(Scte20Convert608To708 convert608To708) {
        this.convert608To708 = convert608To708.toString();
    }

    /**
     * If upconvert, 608 data is both passed through via the
     * "608 compatibility bytes" fields of the 708 wrapper as well as translated
     * into 708. 708 data present in the source content will be discarded.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DISABLED, UPCONVERT
     *
     * @param convert608To708 If upconvert, 608 data is both passed through via
     *            the "608 compatibility bytes" fields of the 708 wrapper as
     *            well as translated into 708. 708 data present in the source
     *            content will be discarded.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Scte20Convert608To708
     */
    public Scte20SourceSettings withConvert608To708(Scte20Convert608To708 convert608To708) {
        this.convert608To708 = convert608To708.toString();
        return this;
    }

    /**
     * Specifies the 608/708 channel number within the video track from which to
     * extract captions. Unused for passthrough.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     *
     * @return Specifies the 608/708 channel number within the video track from
     *         which to extract captions. Unused for passthrough.
     */
    public Integer getSource608ChannelNumber() {
        return source608ChannelNumber;
    }

    /**
     * Specifies the 608/708 channel number within the video track from which to
     * extract captions. Unused for passthrough.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     *
     * @param source608ChannelNumber Specifies the 608/708 channel number within
     *            the video track from which to extract captions. Unused for
     *            passthrough.
     */
    public void setSource608ChannelNumber(Integer source608ChannelNumber) {
        this.source608ChannelNumber = source608ChannelNumber;
    }

    /**
     * Specifies the 608/708 channel number within the video track from which to
     * extract captions. Unused for passthrough.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     *
     * @param source608ChannelNumber Specifies the 608/708 channel number within
     *            the video track from which to extract captions. Unused for
     *            passthrough.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte20SourceSettings withSource608ChannelNumber(Integer source608ChannelNumber) {
        this.source608ChannelNumber = source608ChannelNumber;
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
        if (getConvert608To708() != null)
            sb.append("Convert608To708: " + getConvert608To708() + ",");
        if (getSource608ChannelNumber() != null)
            sb.append("Source608ChannelNumber: " + getSource608ChannelNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConvert608To708() == null) ? 0 : getConvert608To708().hashCode());
        hashCode = prime
                * hashCode
                + ((getSource608ChannelNumber() == null) ? 0 : getSource608ChannelNumber()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte20SourceSettings == false)
            return false;
        Scte20SourceSettings other = (Scte20SourceSettings) obj;

        if (other.getConvert608To708() == null ^ this.getConvert608To708() == null)
            return false;
        if (other.getConvert608To708() != null
                && other.getConvert608To708().equals(this.getConvert608To708()) == false)
            return false;
        if (other.getSource608ChannelNumber() == null ^ this.getSource608ChannelNumber() == null)
            return false;
        if (other.getSource608ChannelNumber() != null
                && other.getSource608ChannelNumber().equals(this.getSource608ChannelNumber()) == false)
            return false;
        return true;
    }
}
