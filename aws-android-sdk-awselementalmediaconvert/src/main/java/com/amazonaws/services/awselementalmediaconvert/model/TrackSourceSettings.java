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
 * Settings specific to caption sources that are specified by track number.
 * Currently, this is only IMSC captions in an IMF package. If your caption
 * source is IMSC 1.1 in a separate xml file, use FileSourceSettings instead of
 * TrackSourceSettings.
 */
public class TrackSourceSettings implements Serializable {
    /**
     * Use this setting to select a single captions track from a source. Track
     * numbers correspond to the order in the captions source file. For IMF
     * sources, track numbering is based on the order that the captions appear
     * in the CPL. For example, use 1 to select the captions asset that is
     * listed first in the CPL. To include more than one captions track in your
     * job outputs, create multiple input captions selectors. Specify one track
     * per selector.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     */
    private Integer trackNumber;

    /**
     * Use this setting to select a single captions track from a source. Track
     * numbers correspond to the order in the captions source file. For IMF
     * sources, track numbering is based on the order that the captions appear
     * in the CPL. For example, use 1 to select the captions asset that is
     * listed first in the CPL. To include more than one captions track in your
     * job outputs, create multiple input captions selectors. Specify one track
     * per selector.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @return Use this setting to select a single captions track from a source.
     *         Track numbers correspond to the order in the captions source
     *         file. For IMF sources, track numbering is based on the order that
     *         the captions appear in the CPL. For example, use 1 to select the
     *         captions asset that is listed first in the CPL. To include more
     *         than one captions track in your job outputs, create multiple
     *         input captions selectors. Specify one track per selector.
     */
    public Integer getTrackNumber() {
        return trackNumber;
    }

    /**
     * Use this setting to select a single captions track from a source. Track
     * numbers correspond to the order in the captions source file. For IMF
     * sources, track numbering is based on the order that the captions appear
     * in the CPL. For example, use 1 to select the captions asset that is
     * listed first in the CPL. To include more than one captions track in your
     * job outputs, create multiple input captions selectors. Specify one track
     * per selector.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param trackNumber Use this setting to select a single captions track
     *            from a source. Track numbers correspond to the order in the
     *            captions source file. For IMF sources, track numbering is
     *            based on the order that the captions appear in the CPL. For
     *            example, use 1 to select the captions asset that is listed
     *            first in the CPL. To include more than one captions track in
     *            your job outputs, create multiple input captions selectors.
     *            Specify one track per selector.
     */
    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    /**
     * Use this setting to select a single captions track from a source. Track
     * numbers correspond to the order in the captions source file. For IMF
     * sources, track numbering is based on the order that the captions appear
     * in the CPL. For example, use 1 to select the captions asset that is
     * listed first in the CPL. To include more than one captions track in your
     * job outputs, create multiple input captions selectors. Specify one track
     * per selector.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 2147483647<br/>
     *
     * @param trackNumber Use this setting to select a single captions track
     *            from a source. Track numbers correspond to the order in the
     *            captions source file. For IMF sources, track numbering is
     *            based on the order that the captions appear in the CPL. For
     *            example, use 1 to select the captions asset that is listed
     *            first in the CPL. To include more than one captions track in
     *            your job outputs, create multiple input captions selectors.
     *            Specify one track per selector.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrackSourceSettings withTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
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
        if (getTrackNumber() != null)
            sb.append("TrackNumber: " + getTrackNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTrackNumber() == null) ? 0 : getTrackNumber().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrackSourceSettings == false)
            return false;
        TrackSourceSettings other = (TrackSourceSettings) obj;

        if (other.getTrackNumber() == null ^ this.getTrackNumber() == null)
            return false;
        if (other.getTrackNumber() != null
                && other.getTrackNumber().equals(this.getTrackNumber()) == false)
            return false;
        return true;
    }
}
