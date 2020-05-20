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
 * Settings for the action to insert a user-defined ID3 tag in each HLS segment
 */
public class HlsId3SegmentTaggingScheduleActionSettings implements Serializable {
    /**
     * ID3 tag to insert into each segment. Supports special keyword identifiers
     * to substitute in segment-related values.\nSupported keyword identifiers:
     * https
     * ://docs.aws.amazon.com/medialive/latest/ug/variable-data-identifiers.html
     */
    private String tag;

    /**
     * ID3 tag to insert into each segment. Supports special keyword identifiers
     * to substitute in segment-related values.\nSupported keyword identifiers:
     * https
     * ://docs.aws.amazon.com/medialive/latest/ug/variable-data-identifiers.html
     *
     * @return ID3 tag to insert into each segment. Supports special keyword
     *         identifiers to substitute in segment-related values.\nSupported
     *         keyword identifiers:
     *         https://docs.aws.amazon.com/medialive/latest/
     *         ug/variable-data-identifiers.html
     */
    public String getTag() {
        return tag;
    }

    /**
     * ID3 tag to insert into each segment. Supports special keyword identifiers
     * to substitute in segment-related values.\nSupported keyword identifiers:
     * https
     * ://docs.aws.amazon.com/medialive/latest/ug/variable-data-identifiers.html
     *
     * @param tag ID3 tag to insert into each segment. Supports special keyword
     *            identifiers to substitute in segment-related
     *            values.\nSupported keyword identifiers:
     *            https://docs.aws.amazon
     *            .com/medialive/latest/ug/variable-data-identifiers.html
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * ID3 tag to insert into each segment. Supports special keyword identifiers
     * to substitute in segment-related values.\nSupported keyword identifiers:
     * https
     * ://docs.aws.amazon.com/medialive/latest/ug/variable-data-identifiers.html
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tag ID3 tag to insert into each segment. Supports special keyword
     *            identifiers to substitute in segment-related
     *            values.\nSupported keyword identifiers:
     *            https://docs.aws.amazon
     *            .com/medialive/latest/ug/variable-data-identifiers.html
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HlsId3SegmentTaggingScheduleActionSettings withTag(String tag) {
        this.tag = tag;
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
        if (getTag() != null)
            sb.append("Tag: " + getTag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTag() == null) ? 0 : getTag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsId3SegmentTaggingScheduleActionSettings == false)
            return false;
        HlsId3SegmentTaggingScheduleActionSettings other = (HlsId3SegmentTaggingScheduleActionSettings) obj;

        if (other.getTag() == null ^ this.getTag() == null)
            return false;
        if (other.getTag() != null && other.getTag().equals(this.getTag()) == false)
            return false;
        return true;
    }
}
