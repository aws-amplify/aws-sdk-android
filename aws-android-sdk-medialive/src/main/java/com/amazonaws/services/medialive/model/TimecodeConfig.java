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
 * Timecode Config
 */
public class TimecodeConfig implements Serializable {
    /**
     * Identifies the source for the timecode that will be associated with the
     * events outputs. -Embedded (embedded): Initialize the output timecode with
     * timecode from the the source. If no embedded timecode is detected in the
     * source, the system falls back to using "Start at 0" (zerobased). -System
     * Clock (systemclock): Use the UTC time. -Start at 0 (zerobased): The time
     * of the first frame of the event will be 00:00:00:00.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, SYSTEMCLOCK, ZEROBASED
     */
    private String source;

    /**
     * Threshold in frames beyond which output timecode is resynchronized to the
     * input timecode. Discrepancies below this threshold are permitted to avoid
     * unnecessary discontinuities in the output timecode. No timecode sync when
     * this is not specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000000<br/>
     */
    private Integer syncThreshold;

    /**
     * Identifies the source for the timecode that will be associated with the
     * events outputs. -Embedded (embedded): Initialize the output timecode with
     * timecode from the the source. If no embedded timecode is detected in the
     * source, the system falls back to using "Start at 0" (zerobased). -System
     * Clock (systemclock): Use the UTC time. -Start at 0 (zerobased): The time
     * of the first frame of the event will be 00:00:00:00.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, SYSTEMCLOCK, ZEROBASED
     *
     * @return Identifies the source for the timecode that will be associated
     *         with the events outputs. -Embedded (embedded): Initialize the
     *         output timecode with timecode from the the source. If no embedded
     *         timecode is detected in the source, the system falls back to
     *         using "Start at 0" (zerobased). -System Clock (systemclock): Use
     *         the UTC time. -Start at 0 (zerobased): The time of the first
     *         frame of the event will be 00:00:00:00.
     * @see TimecodeConfigSource
     */
    public String getSource() {
        return source;
    }

    /**
     * Identifies the source for the timecode that will be associated with the
     * events outputs. -Embedded (embedded): Initialize the output timecode with
     * timecode from the the source. If no embedded timecode is detected in the
     * source, the system falls back to using "Start at 0" (zerobased). -System
     * Clock (systemclock): Use the UTC time. -Start at 0 (zerobased): The time
     * of the first frame of the event will be 00:00:00:00.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, SYSTEMCLOCK, ZEROBASED
     *
     * @param source Identifies the source for the timecode that will be
     *            associated with the events outputs. -Embedded (embedded):
     *            Initialize the output timecode with timecode from the the
     *            source. If no embedded timecode is detected in the source, the
     *            system falls back to using "Start at 0" (zerobased). -System
     *            Clock (systemclock): Use the UTC time. -Start at 0
     *            (zerobased): The time of the first frame of the event will be
     *            00:00:00:00.
     * @see TimecodeConfigSource
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * Identifies the source for the timecode that will be associated with the
     * events outputs. -Embedded (embedded): Initialize the output timecode with
     * timecode from the the source. If no embedded timecode is detected in the
     * source, the system falls back to using "Start at 0" (zerobased). -System
     * Clock (systemclock): Use the UTC time. -Start at 0 (zerobased): The time
     * of the first frame of the event will be 00:00:00:00.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, SYSTEMCLOCK, ZEROBASED
     *
     * @param source Identifies the source for the timecode that will be
     *            associated with the events outputs. -Embedded (embedded):
     *            Initialize the output timecode with timecode from the the
     *            source. If no embedded timecode is detected in the source, the
     *            system falls back to using "Start at 0" (zerobased). -System
     *            Clock (systemclock): Use the UTC time. -Start at 0
     *            (zerobased): The time of the first frame of the event will be
     *            00:00:00:00.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimecodeConfigSource
     */
    public TimecodeConfig withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Identifies the source for the timecode that will be associated with the
     * events outputs. -Embedded (embedded): Initialize the output timecode with
     * timecode from the the source. If no embedded timecode is detected in the
     * source, the system falls back to using "Start at 0" (zerobased). -System
     * Clock (systemclock): Use the UTC time. -Start at 0 (zerobased): The time
     * of the first frame of the event will be 00:00:00:00.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, SYSTEMCLOCK, ZEROBASED
     *
     * @param source Identifies the source for the timecode that will be
     *            associated with the events outputs. -Embedded (embedded):
     *            Initialize the output timecode with timecode from the the
     *            source. If no embedded timecode is detected in the source, the
     *            system falls back to using "Start at 0" (zerobased). -System
     *            Clock (systemclock): Use the UTC time. -Start at 0
     *            (zerobased): The time of the first frame of the event will be
     *            00:00:00:00.
     * @see TimecodeConfigSource
     */
    public void setSource(TimecodeConfigSource source) {
        this.source = source.toString();
    }

    /**
     * Identifies the source for the timecode that will be associated with the
     * events outputs. -Embedded (embedded): Initialize the output timecode with
     * timecode from the the source. If no embedded timecode is detected in the
     * source, the system falls back to using "Start at 0" (zerobased). -System
     * Clock (systemclock): Use the UTC time. -Start at 0 (zerobased): The time
     * of the first frame of the event will be 00:00:00:00.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EMBEDDED, SYSTEMCLOCK, ZEROBASED
     *
     * @param source Identifies the source for the timecode that will be
     *            associated with the events outputs. -Embedded (embedded):
     *            Initialize the output timecode with timecode from the the
     *            source. If no embedded timecode is detected in the source, the
     *            system falls back to using "Start at 0" (zerobased). -System
     *            Clock (systemclock): Use the UTC time. -Start at 0
     *            (zerobased): The time of the first frame of the event will be
     *            00:00:00:00.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TimecodeConfigSource
     */
    public TimecodeConfig withSource(TimecodeConfigSource source) {
        this.source = source.toString();
        return this;
    }

    /**
     * Threshold in frames beyond which output timecode is resynchronized to the
     * input timecode. Discrepancies below this threshold are permitted to avoid
     * unnecessary discontinuities in the output timecode. No timecode sync when
     * this is not specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000000<br/>
     *
     * @return Threshold in frames beyond which output timecode is
     *         resynchronized to the input timecode. Discrepancies below this
     *         threshold are permitted to avoid unnecessary discontinuities in
     *         the output timecode. No timecode sync when this is not specified.
     */
    public Integer getSyncThreshold() {
        return syncThreshold;
    }

    /**
     * Threshold in frames beyond which output timecode is resynchronized to the
     * input timecode. Discrepancies below this threshold are permitted to avoid
     * unnecessary discontinuities in the output timecode. No timecode sync when
     * this is not specified.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000000<br/>
     *
     * @param syncThreshold Threshold in frames beyond which output timecode is
     *            resynchronized to the input timecode. Discrepancies below this
     *            threshold are permitted to avoid unnecessary discontinuities
     *            in the output timecode. No timecode sync when this is not
     *            specified.
     */
    public void setSyncThreshold(Integer syncThreshold) {
        this.syncThreshold = syncThreshold;
    }

    /**
     * Threshold in frames beyond which output timecode is resynchronized to the
     * input timecode. Discrepancies below this threshold are permitted to avoid
     * unnecessary discontinuities in the output timecode. No timecode sync when
     * this is not specified.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000000<br/>
     *
     * @param syncThreshold Threshold in frames beyond which output timecode is
     *            resynchronized to the input timecode. Discrepancies below this
     *            threshold are permitted to avoid unnecessary discontinuities
     *            in the output timecode. No timecode sync when this is not
     *            specified.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TimecodeConfig withSyncThreshold(Integer syncThreshold) {
        this.syncThreshold = syncThreshold;
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
        if (getSource() != null)
            sb.append("Source: " + getSource() + ",");
        if (getSyncThreshold() != null)
            sb.append("SyncThreshold: " + getSyncThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode
                + ((getSyncThreshold() == null) ? 0 : getSyncThreshold().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimecodeConfig == false)
            return false;
        TimecodeConfig other = (TimecodeConfig) obj;

        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getSyncThreshold() == null ^ this.getSyncThreshold() == null)
            return false;
        if (other.getSyncThreshold() != null
                && other.getSyncThreshold().equals(this.getSyncThreshold()) == false)
            return false;
        return true;
    }
}
