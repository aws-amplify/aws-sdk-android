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
package com.amazonaws.services.mediapackage-vod.model;

import java.io.Serializable;


/**
 * A StreamSelection configuration.
 */
public class StreamSelection implements Serializable {
    /**
     * The maximum video bitrate (bps) to include in output.
     */
    private Integer maxVideoBitsPerSecond;

    /**
     * The minimum video bitrate (bps) to include in output.
     */
    private Integer minVideoBitsPerSecond;

    /**
     * A directive that determines the order of streams in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING
     */
    private String streamOrder;

    /**
     * The maximum video bitrate (bps) to include in output.
     *
     * @return The maximum video bitrate (bps) to include in output.
     */
    public Integer getMaxVideoBitsPerSecond() {
        return maxVideoBitsPerSecond;
    }

    /**
     * The maximum video bitrate (bps) to include in output.
     *
     * @param maxVideoBitsPerSecond The maximum video bitrate (bps) to include in output.
     */
    public void setMaxVideoBitsPerSecond(Integer maxVideoBitsPerSecond) {
        this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
    }

    /**
     * The maximum video bitrate (bps) to include in output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxVideoBitsPerSecond The maximum video bitrate (bps) to include in output.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StreamSelection withMaxVideoBitsPerSecond(Integer maxVideoBitsPerSecond) {
        this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
        return this;
    }

    /**
     * The minimum video bitrate (bps) to include in output.
     *
     * @return The minimum video bitrate (bps) to include in output.
     */
    public Integer getMinVideoBitsPerSecond() {
        return minVideoBitsPerSecond;
    }

    /**
     * The minimum video bitrate (bps) to include in output.
     *
     * @param minVideoBitsPerSecond The minimum video bitrate (bps) to include in output.
     */
    public void setMinVideoBitsPerSecond(Integer minVideoBitsPerSecond) {
        this.minVideoBitsPerSecond = minVideoBitsPerSecond;
    }

    /**
     * The minimum video bitrate (bps) to include in output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param minVideoBitsPerSecond The minimum video bitrate (bps) to include in output.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public StreamSelection withMinVideoBitsPerSecond(Integer minVideoBitsPerSecond) {
        this.minVideoBitsPerSecond = minVideoBitsPerSecond;
        return this;
    }

    /**
     * A directive that determines the order of streams in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING
     *
     * @return A directive that determines the order of streams in the output.
     *
     * @see StreamOrder
     */
    public String getStreamOrder() {
        return streamOrder;
    }

    /**
     * A directive that determines the order of streams in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING
     *
     * @param streamOrder A directive that determines the order of streams in the output.
     *
     * @see StreamOrder
     */
    public void setStreamOrder(String streamOrder) {
        this.streamOrder = streamOrder;
    }

    /**
     * A directive that determines the order of streams in the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING
     *
     * @param streamOrder A directive that determines the order of streams in the output.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see StreamOrder
     */
    public StreamSelection withStreamOrder(String streamOrder) {
        this.streamOrder = streamOrder;
        return this;
    }

    /**
     * A directive that determines the order of streams in the output.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING
     *
     * @param streamOrder A directive that determines the order of streams in the output.
     *
     * @see StreamOrder
     */
    public void setStreamOrder(StreamOrder streamOrder) {
        this.streamOrder = streamOrder.toString();
    }

    /**
     * A directive that determines the order of streams in the output.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ORIGINAL, VIDEO_BITRATE_ASCENDING, VIDEO_BITRATE_DESCENDING
     *
     * @param streamOrder A directive that determines the order of streams in the output.
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see StreamOrder
     */
    public StreamSelection withStreamOrder(StreamOrder streamOrder) {
        this.streamOrder = streamOrder.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMaxVideoBitsPerSecond() != null) sb.append("MaxVideoBitsPerSecond: " + getMaxVideoBitsPerSecond() + ",");
        if (getMinVideoBitsPerSecond() != null) sb.append("MinVideoBitsPerSecond: " + getMinVideoBitsPerSecond() + ",");
        if (getStreamOrder() != null) sb.append("StreamOrder: " + getStreamOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxVideoBitsPerSecond() == null) ? 0 : getMaxVideoBitsPerSecond().hashCode());
        hashCode = prime * hashCode + ((getMinVideoBitsPerSecond() == null) ? 0 : getMinVideoBitsPerSecond().hashCode());
        hashCode = prime * hashCode + ((getStreamOrder() == null) ? 0 : getStreamOrder().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StreamSelection == false) return false;
        StreamSelection other = (StreamSelection)obj;

        if (other.getMaxVideoBitsPerSecond() == null ^ this.getMaxVideoBitsPerSecond() == null) return false;
        if (other.getMaxVideoBitsPerSecond() != null && other.getMaxVideoBitsPerSecond().equals(this.getMaxVideoBitsPerSecond()) == false) return false;
        if (other.getMinVideoBitsPerSecond() == null ^ this.getMinVideoBitsPerSecond() == null) return false;
        if (other.getMinVideoBitsPerSecond() != null && other.getMinVideoBitsPerSecond().equals(this.getMinVideoBitsPerSecond()) == false) return false;
        if (other.getStreamOrder() == null ^ this.getStreamOrder() == null) return false;
        if (other.getStreamOrder() != null && other.getStreamOrder().equals(this.getStreamOrder()) == false) return false;
        return true;
    }
}
