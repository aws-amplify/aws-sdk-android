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
 * Settings for a SCTE-35 return_to_network message.
 */
public class Scte35ReturnToNetworkScheduleActionSettings implements Serializable {
    /**
     * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     */
    private Long spliceEventId;

    /**
     * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @return The splice_event_id for the SCTE-35 splice_insert, as defined in
     *         SCTE-35.
     */
    public Long getSpliceEventId() {
        return spliceEventId;
    }

    /**
     * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param spliceEventId The splice_event_id for the SCTE-35 splice_insert,
     *            as defined in SCTE-35.
     */
    public void setSpliceEventId(Long spliceEventId) {
        this.spliceEventId = spliceEventId;
    }

    /**
     * The splice_event_id for the SCTE-35 splice_insert, as defined in SCTE-35.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 4294967295<br/>
     *
     * @param spliceEventId The splice_event_id for the SCTE-35 splice_insert,
     *            as defined in SCTE-35.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Scte35ReturnToNetworkScheduleActionSettings withSpliceEventId(Long spliceEventId) {
        this.spliceEventId = spliceEventId;
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
        if (getSpliceEventId() != null)
            sb.append("SpliceEventId: " + getSpliceEventId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSpliceEventId() == null) ? 0 : getSpliceEventId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte35ReturnToNetworkScheduleActionSettings == false)
            return false;
        Scte35ReturnToNetworkScheduleActionSettings other = (Scte35ReturnToNetworkScheduleActionSettings) obj;

        if (other.getSpliceEventId() == null ^ this.getSpliceEventId() == null)
            return false;
        if (other.getSpliceEventId() != null
                && other.getSpliceEventId().equals(this.getSpliceEventId()) == false)
            return false;
        return true;
    }
}
