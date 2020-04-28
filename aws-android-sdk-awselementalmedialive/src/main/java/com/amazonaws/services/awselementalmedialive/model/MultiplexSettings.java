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
 * Contains configuration for a Multiplex event
 */
public class MultiplexSettings implements Serializable {
    /**
     * Maximum video buffer delay in milliseconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 3000<br/>
     */
    private Integer maximumVideoBufferDelayMilliseconds;

    /**
     * Transport stream bit rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000000 - 100000000<br/>
     */
    private Integer transportStreamBitrate;

    /**
     * Transport stream ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer transportStreamId;

    /**
     * Transport stream reserved bit rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100000000<br/>
     */
    private Integer transportStreamReservedBitrate;

    /**
     * Maximum video buffer delay in milliseconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 3000<br/>
     *
     * @return Maximum video buffer delay in milliseconds.
     */
    public Integer getMaximumVideoBufferDelayMilliseconds() {
        return maximumVideoBufferDelayMilliseconds;
    }

    /**
     * Maximum video buffer delay in milliseconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 3000<br/>
     *
     * @param maximumVideoBufferDelayMilliseconds Maximum video buffer delay in
     *            milliseconds.
     */
    public void setMaximumVideoBufferDelayMilliseconds(Integer maximumVideoBufferDelayMilliseconds) {
        this.maximumVideoBufferDelayMilliseconds = maximumVideoBufferDelayMilliseconds;
    }

    /**
     * Maximum video buffer delay in milliseconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000 - 3000<br/>
     *
     * @param maximumVideoBufferDelayMilliseconds Maximum video buffer delay in
     *            milliseconds.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexSettings withMaximumVideoBufferDelayMilliseconds(
            Integer maximumVideoBufferDelayMilliseconds) {
        this.maximumVideoBufferDelayMilliseconds = maximumVideoBufferDelayMilliseconds;
        return this;
    }

    /**
     * Transport stream bit rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000000 - 100000000<br/>
     *
     * @return Transport stream bit rate.
     */
    public Integer getTransportStreamBitrate() {
        return transportStreamBitrate;
    }

    /**
     * Transport stream bit rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000000 - 100000000<br/>
     *
     * @param transportStreamBitrate Transport stream bit rate.
     */
    public void setTransportStreamBitrate(Integer transportStreamBitrate) {
        this.transportStreamBitrate = transportStreamBitrate;
    }

    /**
     * Transport stream bit rate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000000 - 100000000<br/>
     *
     * @param transportStreamBitrate Transport stream bit rate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexSettings withTransportStreamBitrate(Integer transportStreamBitrate) {
        this.transportStreamBitrate = transportStreamBitrate;
        return this;
    }

    /**
     * Transport stream ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return Transport stream ID.
     */
    public Integer getTransportStreamId() {
        return transportStreamId;
    }

    /**
     * Transport stream ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param transportStreamId Transport stream ID.
     */
    public void setTransportStreamId(Integer transportStreamId) {
        this.transportStreamId = transportStreamId;
    }

    /**
     * Transport stream ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param transportStreamId Transport stream ID.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexSettings withTransportStreamId(Integer transportStreamId) {
        this.transportStreamId = transportStreamId;
        return this;
    }

    /**
     * Transport stream reserved bit rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100000000<br/>
     *
     * @return Transport stream reserved bit rate.
     */
    public Integer getTransportStreamReservedBitrate() {
        return transportStreamReservedBitrate;
    }

    /**
     * Transport stream reserved bit rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100000000<br/>
     *
     * @param transportStreamReservedBitrate Transport stream reserved bit rate.
     */
    public void setTransportStreamReservedBitrate(Integer transportStreamReservedBitrate) {
        this.transportStreamReservedBitrate = transportStreamReservedBitrate;
    }

    /**
     * Transport stream reserved bit rate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100000000<br/>
     *
     * @param transportStreamReservedBitrate Transport stream reserved bit rate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MultiplexSettings withTransportStreamReservedBitrate(
            Integer transportStreamReservedBitrate) {
        this.transportStreamReservedBitrate = transportStreamReservedBitrate;
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
        if (getMaximumVideoBufferDelayMilliseconds() != null)
            sb.append("MaximumVideoBufferDelayMilliseconds: "
                    + getMaximumVideoBufferDelayMilliseconds() + ",");
        if (getTransportStreamBitrate() != null)
            sb.append("TransportStreamBitrate: " + getTransportStreamBitrate() + ",");
        if (getTransportStreamId() != null)
            sb.append("TransportStreamId: " + getTransportStreamId() + ",");
        if (getTransportStreamReservedBitrate() != null)
            sb.append("TransportStreamReservedBitrate: " + getTransportStreamReservedBitrate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMaximumVideoBufferDelayMilliseconds() == null) ? 0
                        : getMaximumVideoBufferDelayMilliseconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getTransportStreamBitrate() == null) ? 0 : getTransportStreamBitrate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTransportStreamId() == null) ? 0 : getTransportStreamId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTransportStreamReservedBitrate() == null) ? 0
                        : getTransportStreamReservedBitrate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexSettings == false)
            return false;
        MultiplexSettings other = (MultiplexSettings) obj;

        if (other.getMaximumVideoBufferDelayMilliseconds() == null
                ^ this.getMaximumVideoBufferDelayMilliseconds() == null)
            return false;
        if (other.getMaximumVideoBufferDelayMilliseconds() != null
                && other.getMaximumVideoBufferDelayMilliseconds().equals(
                        this.getMaximumVideoBufferDelayMilliseconds()) == false)
            return false;
        if (other.getTransportStreamBitrate() == null ^ this.getTransportStreamBitrate() == null)
            return false;
        if (other.getTransportStreamBitrate() != null
                && other.getTransportStreamBitrate().equals(this.getTransportStreamBitrate()) == false)
            return false;
        if (other.getTransportStreamId() == null ^ this.getTransportStreamId() == null)
            return false;
        if (other.getTransportStreamId() != null
                && other.getTransportStreamId().equals(this.getTransportStreamId()) == false)
            return false;
        if (other.getTransportStreamReservedBitrate() == null
                ^ this.getTransportStreamReservedBitrate() == null)
            return false;
        if (other.getTransportStreamReservedBitrate() != null
                && other.getTransportStreamReservedBitrate().equals(
                        this.getTransportStreamReservedBitrate()) == false)
            return false;
        return true;
    }
}
