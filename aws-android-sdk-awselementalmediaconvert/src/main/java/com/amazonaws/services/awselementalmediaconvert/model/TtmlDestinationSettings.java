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
 * Settings specific to TTML caption outputs, including Pass style information
 * (TtmlStylePassthrough).
 */
public class TtmlDestinationSettings implements Serializable {
    /**
     * Pass through style and position information from a TTML-like input source
     * (TTML, SMPTE-TT) to the TTML output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String stylePassthrough;

    /**
     * Pass through style and position information from a TTML-like input source
     * (TTML, SMPTE-TT) to the TTML output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return Pass through style and position information from a TTML-like
     *         input source (TTML, SMPTE-TT) to the TTML output.
     * @see TtmlStylePassthrough
     */
    public String getStylePassthrough() {
        return stylePassthrough;
    }

    /**
     * Pass through style and position information from a TTML-like input source
     * (TTML, SMPTE-TT) to the TTML output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param stylePassthrough Pass through style and position information from
     *            a TTML-like input source (TTML, SMPTE-TT) to the TTML output.
     * @see TtmlStylePassthrough
     */
    public void setStylePassthrough(String stylePassthrough) {
        this.stylePassthrough = stylePassthrough;
    }

    /**
     * Pass through style and position information from a TTML-like input source
     * (TTML, SMPTE-TT) to the TTML output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param stylePassthrough Pass through style and position information from
     *            a TTML-like input source (TTML, SMPTE-TT) to the TTML output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TtmlStylePassthrough
     */
    public TtmlDestinationSettings withStylePassthrough(String stylePassthrough) {
        this.stylePassthrough = stylePassthrough;
        return this;
    }

    /**
     * Pass through style and position information from a TTML-like input source
     * (TTML, SMPTE-TT) to the TTML output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param stylePassthrough Pass through style and position information from
     *            a TTML-like input source (TTML, SMPTE-TT) to the TTML output.
     * @see TtmlStylePassthrough
     */
    public void setStylePassthrough(TtmlStylePassthrough stylePassthrough) {
        this.stylePassthrough = stylePassthrough.toString();
    }

    /**
     * Pass through style and position information from a TTML-like input source
     * (TTML, SMPTE-TT) to the TTML output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param stylePassthrough Pass through style and position information from
     *            a TTML-like input source (TTML, SMPTE-TT) to the TTML output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TtmlStylePassthrough
     */
    public TtmlDestinationSettings withStylePassthrough(TtmlStylePassthrough stylePassthrough) {
        this.stylePassthrough = stylePassthrough.toString();
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
        if (getStylePassthrough() != null)
            sb.append("StylePassthrough: " + getStylePassthrough());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStylePassthrough() == null) ? 0 : getStylePassthrough().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TtmlDestinationSettings == false)
            return false;
        TtmlDestinationSettings other = (TtmlDestinationSettings) obj;

        if (other.getStylePassthrough() == null ^ this.getStylePassthrough() == null)
            return false;
        if (other.getStylePassthrough() != null
                && other.getStylePassthrough().equals(this.getStylePassthrough()) == false)
            return false;
        return true;
    }
}
