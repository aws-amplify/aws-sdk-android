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
 * Contains summary configuration for a Multiplex event.
 */
public class MultiplexSettingsSummary implements Serializable {
    /**
     * Transport stream bit rate.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1000000 - 100000000<br/>
     */
    private Integer transportStreamBitrate;

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
    public MultiplexSettingsSummary withTransportStreamBitrate(Integer transportStreamBitrate) {
        this.transportStreamBitrate = transportStreamBitrate;
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
        if (getTransportStreamBitrate() != null)
            sb.append("TransportStreamBitrate: " + getTransportStreamBitrate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTransportStreamBitrate() == null) ? 0 : getTransportStreamBitrate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiplexSettingsSummary == false)
            return false;
        MultiplexSettingsSummary other = (MultiplexSettingsSummary) obj;

        if (other.getTransportStreamBitrate() == null ^ this.getTransportStreamBitrate() == null)
            return false;
        if (other.getTransportStreamBitrate() != null
                && other.getTransportStreamBitrate().equals(this.getTransportStreamBitrate()) == false)
            return false;
        return true;
    }
}
