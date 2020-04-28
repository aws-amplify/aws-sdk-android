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
 * Ttml Destination Settings
 */
public class TtmlDestinationSettings implements Serializable {
    /**
     * When set to passthrough, passes through style and position information
     * from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT
     * output or TTML output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED
     */
    private String styleControl;

    /**
     * When set to passthrough, passes through style and position information
     * from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT
     * output or TTML output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED
     *
     * @return When set to passthrough, passes through style and position
     *         information from a TTML-like input source (TTML, SMPTE-TT,
     *         CFF-TT) to the CFF-TT output or TTML output.
     * @see TtmlDestinationStyleControl
     */
    public String getStyleControl() {
        return styleControl;
    }

    /**
     * When set to passthrough, passes through style and position information
     * from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT
     * output or TTML output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED
     *
     * @param styleControl When set to passthrough, passes through style and
     *            position information from a TTML-like input source (TTML,
     *            SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * @see TtmlDestinationStyleControl
     */
    public void setStyleControl(String styleControl) {
        this.styleControl = styleControl;
    }

    /**
     * When set to passthrough, passes through style and position information
     * from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT
     * output or TTML output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED
     *
     * @param styleControl When set to passthrough, passes through style and
     *            position information from a TTML-like input source (TTML,
     *            SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TtmlDestinationStyleControl
     */
    public TtmlDestinationSettings withStyleControl(String styleControl) {
        this.styleControl = styleControl;
        return this;
    }

    /**
     * When set to passthrough, passes through style and position information
     * from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT
     * output or TTML output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED
     *
     * @param styleControl When set to passthrough, passes through style and
     *            position information from a TTML-like input source (TTML,
     *            SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * @see TtmlDestinationStyleControl
     */
    public void setStyleControl(TtmlDestinationStyleControl styleControl) {
        this.styleControl = styleControl.toString();
    }

    /**
     * When set to passthrough, passes through style and position information
     * from a TTML-like input source (TTML, SMPTE-TT, CFF-TT) to the CFF-TT
     * output or TTML output.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PASSTHROUGH, USE_CONFIGURED
     *
     * @param styleControl When set to passthrough, passes through style and
     *            position information from a TTML-like input source (TTML,
     *            SMPTE-TT, CFF-TT) to the CFF-TT output or TTML output.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TtmlDestinationStyleControl
     */
    public TtmlDestinationSettings withStyleControl(TtmlDestinationStyleControl styleControl) {
        this.styleControl = styleControl.toString();
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
        if (getStyleControl() != null)
            sb.append("StyleControl: " + getStyleControl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStyleControl() == null) ? 0 : getStyleControl().hashCode());
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

        if (other.getStyleControl() == null ^ this.getStyleControl() == null)
            return false;
        if (other.getStyleControl() != null
                && other.getStyleControl().equals(this.getStyleControl()) == false)
            return false;
        return true;
    }
}
