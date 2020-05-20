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
 * Teletext Source Settings
 */
public class TeletextSourceSettings implements Serializable {
    /**
     * Specifies the teletext page number within the data stream from which to
     * extract captions. Range of 0x100 (256) to 0x8FF (2303). Unused for
     * passthrough. Should be specified as a hexadecimal string with no "0x"
     * prefix.
     */
    private String pageNumber;

    /**
     * Specifies the teletext page number within the data stream from which to
     * extract captions. Range of 0x100 (256) to 0x8FF (2303). Unused for
     * passthrough. Should be specified as a hexadecimal string with no "0x"
     * prefix.
     *
     * @return Specifies the teletext page number within the data stream from
     *         which to extract captions. Range of 0x100 (256) to 0x8FF (2303).
     *         Unused for passthrough. Should be specified as a hexadecimal
     *         string with no "0x" prefix.
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * Specifies the teletext page number within the data stream from which to
     * extract captions. Range of 0x100 (256) to 0x8FF (2303). Unused for
     * passthrough. Should be specified as a hexadecimal string with no "0x"
     * prefix.
     *
     * @param pageNumber Specifies the teletext page number within the data
     *            stream from which to extract captions. Range of 0x100 (256) to
     *            0x8FF (2303). Unused for passthrough. Should be specified as a
     *            hexadecimal string with no "0x" prefix.
     */
    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Specifies the teletext page number within the data stream from which to
     * extract captions. Range of 0x100 (256) to 0x8FF (2303). Unused for
     * passthrough. Should be specified as a hexadecimal string with no "0x"
     * prefix.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageNumber Specifies the teletext page number within the data
     *            stream from which to extract captions. Range of 0x100 (256) to
     *            0x8FF (2303). Unused for passthrough. Should be specified as a
     *            hexadecimal string with no "0x" prefix.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TeletextSourceSettings withPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
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
        if (getPageNumber() != null)
            sb.append("PageNumber: " + getPageNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TeletextSourceSettings == false)
            return false;
        TeletextSourceSettings other = (TeletextSourceSettings) obj;

        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null
                && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        return true;
    }
}
