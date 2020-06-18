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
 * Settings for ancillary captions source.
 */
public class AncillarySourceSettings implements Serializable {
    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     */
    private String convert608To708;

    /**
     * Specifies the 608 channel number in the ancillary data track from which
     * to extract captions. Unused for passthrough.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     */
    private Integer sourceAncillaryChannelNumber;

    /**
     * By default, the service terminates any unterminated captions at the end
     * of each input. If you want the caption to continue onto your next input,
     * disable this setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END_OF_INPUT, DISABLED
     */
    private String terminateCaptions;

    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     *
     * @return Specify whether this set of input captions appears in your
     *         outputs in both 608 and 708 format. If you choose Upconvert
     *         (UPCONVERT), MediaConvert includes the captions data in two ways:
     *         it passes the 608 data through using the 608 compatibility bytes
     *         fields of the 708 wrapper, and it also translates the 608 data
     *         into 708.
     * @see AncillaryConvert608To708
     */
    public String getConvert608To708() {
        return convert608To708;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     *
     * @param convert608To708 Specify whether this set of input captions appears
     *            in your outputs in both 608 and 708 format. If you choose
     *            Upconvert (UPCONVERT), MediaConvert includes the captions data
     *            in two ways: it passes the 608 data through using the 608
     *            compatibility bytes fields of the 708 wrapper, and it also
     *            translates the 608 data into 708.
     * @see AncillaryConvert608To708
     */
    public void setConvert608To708(String convert608To708) {
        this.convert608To708 = convert608To708;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     *
     * @param convert608To708 Specify whether this set of input captions appears
     *            in your outputs in both 608 and 708 format. If you choose
     *            Upconvert (UPCONVERT), MediaConvert includes the captions data
     *            in two ways: it passes the 608 data through using the 608
     *            compatibility bytes fields of the 708 wrapper, and it also
     *            translates the 608 data into 708.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AncillaryConvert608To708
     */
    public AncillarySourceSettings withConvert608To708(String convert608To708) {
        this.convert608To708 = convert608To708;
        return this;
    }

    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     *
     * @param convert608To708 Specify whether this set of input captions appears
     *            in your outputs in both 608 and 708 format. If you choose
     *            Upconvert (UPCONVERT), MediaConvert includes the captions data
     *            in two ways: it passes the 608 data through using the 608
     *            compatibility bytes fields of the 708 wrapper, and it also
     *            translates the 608 data into 708.
     * @see AncillaryConvert608To708
     */
    public void setConvert608To708(AncillaryConvert608To708 convert608To708) {
        this.convert608To708 = convert608To708.toString();
    }

    /**
     * Specify whether this set of input captions appears in your outputs in
     * both 608 and 708 format. If you choose Upconvert (UPCONVERT),
     * MediaConvert includes the captions data in two ways: it passes the 608
     * data through using the 608 compatibility bytes fields of the 708 wrapper,
     * and it also translates the 608 data into 708.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UPCONVERT, DISABLED
     *
     * @param convert608To708 Specify whether this set of input captions appears
     *            in your outputs in both 608 and 708 format. If you choose
     *            Upconvert (UPCONVERT), MediaConvert includes the captions data
     *            in two ways: it passes the 608 data through using the 608
     *            compatibility bytes fields of the 708 wrapper, and it also
     *            translates the 608 data into 708.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AncillaryConvert608To708
     */
    public AncillarySourceSettings withConvert608To708(AncillaryConvert608To708 convert608To708) {
        this.convert608To708 = convert608To708.toString();
        return this;
    }

    /**
     * Specifies the 608 channel number in the ancillary data track from which
     * to extract captions. Unused for passthrough.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     *
     * @return Specifies the 608 channel number in the ancillary data track from
     *         which to extract captions. Unused for passthrough.
     */
    public Integer getSourceAncillaryChannelNumber() {
        return sourceAncillaryChannelNumber;
    }

    /**
     * Specifies the 608 channel number in the ancillary data track from which
     * to extract captions. Unused for passthrough.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     *
     * @param sourceAncillaryChannelNumber Specifies the 608 channel number in
     *            the ancillary data track from which to extract captions.
     *            Unused for passthrough.
     */
    public void setSourceAncillaryChannelNumber(Integer sourceAncillaryChannelNumber) {
        this.sourceAncillaryChannelNumber = sourceAncillaryChannelNumber;
    }

    /**
     * Specifies the 608 channel number in the ancillary data track from which
     * to extract captions. Unused for passthrough.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 4<br/>
     *
     * @param sourceAncillaryChannelNumber Specifies the 608 channel number in
     *            the ancillary data track from which to extract captions.
     *            Unused for passthrough.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AncillarySourceSettings withSourceAncillaryChannelNumber(
            Integer sourceAncillaryChannelNumber) {
        this.sourceAncillaryChannelNumber = sourceAncillaryChannelNumber;
        return this;
    }

    /**
     * By default, the service terminates any unterminated captions at the end
     * of each input. If you want the caption to continue onto your next input,
     * disable this setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END_OF_INPUT, DISABLED
     *
     * @return By default, the service terminates any unterminated captions at
     *         the end of each input. If you want the caption to continue onto
     *         your next input, disable this setting.
     * @see AncillaryTerminateCaptions
     */
    public String getTerminateCaptions() {
        return terminateCaptions;
    }

    /**
     * By default, the service terminates any unterminated captions at the end
     * of each input. If you want the caption to continue onto your next input,
     * disable this setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END_OF_INPUT, DISABLED
     *
     * @param terminateCaptions By default, the service terminates any
     *            unterminated captions at the end of each input. If you want
     *            the caption to continue onto your next input, disable this
     *            setting.
     * @see AncillaryTerminateCaptions
     */
    public void setTerminateCaptions(String terminateCaptions) {
        this.terminateCaptions = terminateCaptions;
    }

    /**
     * By default, the service terminates any unterminated captions at the end
     * of each input. If you want the caption to continue onto your next input,
     * disable this setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END_OF_INPUT, DISABLED
     *
     * @param terminateCaptions By default, the service terminates any
     *            unterminated captions at the end of each input. If you want
     *            the caption to continue onto your next input, disable this
     *            setting.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AncillaryTerminateCaptions
     */
    public AncillarySourceSettings withTerminateCaptions(String terminateCaptions) {
        this.terminateCaptions = terminateCaptions;
        return this;
    }

    /**
     * By default, the service terminates any unterminated captions at the end
     * of each input. If you want the caption to continue onto your next input,
     * disable this setting.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END_OF_INPUT, DISABLED
     *
     * @param terminateCaptions By default, the service terminates any
     *            unterminated captions at the end of each input. If you want
     *            the caption to continue onto your next input, disable this
     *            setting.
     * @see AncillaryTerminateCaptions
     */
    public void setTerminateCaptions(AncillaryTerminateCaptions terminateCaptions) {
        this.terminateCaptions = terminateCaptions.toString();
    }

    /**
     * By default, the service terminates any unterminated captions at the end
     * of each input. If you want the caption to continue onto your next input,
     * disable this setting.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END_OF_INPUT, DISABLED
     *
     * @param terminateCaptions By default, the service terminates any
     *            unterminated captions at the end of each input. If you want
     *            the caption to continue onto your next input, disable this
     *            setting.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AncillaryTerminateCaptions
     */
    public AncillarySourceSettings withTerminateCaptions(
            AncillaryTerminateCaptions terminateCaptions) {
        this.terminateCaptions = terminateCaptions.toString();
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
        if (getSourceAncillaryChannelNumber() != null)
            sb.append("SourceAncillaryChannelNumber: " + getSourceAncillaryChannelNumber() + ",");
        if (getTerminateCaptions() != null)
            sb.append("TerminateCaptions: " + getTerminateCaptions());
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
                + ((getSourceAncillaryChannelNumber() == null) ? 0
                        : getSourceAncillaryChannelNumber().hashCode());
        hashCode = prime * hashCode
                + ((getTerminateCaptions() == null) ? 0 : getTerminateCaptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AncillarySourceSettings == false)
            return false;
        AncillarySourceSettings other = (AncillarySourceSettings) obj;

        if (other.getConvert608To708() == null ^ this.getConvert608To708() == null)
            return false;
        if (other.getConvert608To708() != null
                && other.getConvert608To708().equals(this.getConvert608To708()) == false)
            return false;
        if (other.getSourceAncillaryChannelNumber() == null
                ^ this.getSourceAncillaryChannelNumber() == null)
            return false;
        if (other.getSourceAncillaryChannelNumber() != null
                && other.getSourceAncillaryChannelNumber().equals(
                        this.getSourceAncillaryChannelNumber()) == false)
            return false;
        if (other.getTerminateCaptions() == null ^ this.getTerminateCaptions() == null)
            return false;
        if (other.getTerminateCaptions() != null
                && other.getTerminateCaptions().equals(this.getTerminateCaptions()) == false)
            return false;
        return true;
    }
}
