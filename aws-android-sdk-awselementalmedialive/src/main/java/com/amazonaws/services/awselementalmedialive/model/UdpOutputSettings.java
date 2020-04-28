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
 * Udp Output Settings
 */
public class UdpOutputSettings implements Serializable {
    /**
     * UDP output buffering in milliseconds. Larger values increase latency
     * through the transcoder but simultaneously assist the transcoder in
     * maintaining a constant, low-jitter UDP/RTP output while accommodating
     * clock recovery, input switching, input disruptions, picture reordering,
     * etc.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     */
    private Integer bufferMsec;

    /**
     * Udp Container Settings
     */
    private UdpContainerSettings containerSettings;

    /**
     * Destination address and port number for RTP or UDP packets. Can be
     * unicast or multicast RTP or UDP (eg. rtp://239.10.10.10:5001 or
     * udp://10.100.100.100:5002).
     */
    private OutputLocationRef destination;

    /**
     * Settings for enabling and adjusting Forward Error Correction on UDP
     * outputs.
     */
    private FecOutputSettings fecOutputSettings;

    /**
     * UDP output buffering in milliseconds. Larger values increase latency
     * through the transcoder but simultaneously assist the transcoder in
     * maintaining a constant, low-jitter UDP/RTP output while accommodating
     * clock recovery, input switching, input disruptions, picture reordering,
     * etc.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @return UDP output buffering in milliseconds. Larger values increase
     *         latency through the transcoder but simultaneously assist the
     *         transcoder in maintaining a constant, low-jitter UDP/RTP output
     *         while accommodating clock recovery, input switching, input
     *         disruptions, picture reordering, etc.
     */
    public Integer getBufferMsec() {
        return bufferMsec;
    }

    /**
     * UDP output buffering in milliseconds. Larger values increase latency
     * through the transcoder but simultaneously assist the transcoder in
     * maintaining a constant, low-jitter UDP/RTP output while accommodating
     * clock recovery, input switching, input disruptions, picture reordering,
     * etc.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @param bufferMsec UDP output buffering in milliseconds. Larger values
     *            increase latency through the transcoder but simultaneously
     *            assist the transcoder in maintaining a constant, low-jitter
     *            UDP/RTP output while accommodating clock recovery, input
     *            switching, input disruptions, picture reordering, etc.
     */
    public void setBufferMsec(Integer bufferMsec) {
        this.bufferMsec = bufferMsec;
    }

    /**
     * UDP output buffering in milliseconds. Larger values increase latency
     * through the transcoder but simultaneously assist the transcoder in
     * maintaining a constant, low-jitter UDP/RTP output while accommodating
     * clock recovery, input switching, input disruptions, picture reordering,
     * etc.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 10000<br/>
     *
     * @param bufferMsec UDP output buffering in milliseconds. Larger values
     *            increase latency through the transcoder but simultaneously
     *            assist the transcoder in maintaining a constant, low-jitter
     *            UDP/RTP output while accommodating clock recovery, input
     *            switching, input disruptions, picture reordering, etc.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UdpOutputSettings withBufferMsec(Integer bufferMsec) {
        this.bufferMsec = bufferMsec;
        return this;
    }

    /**
     * Udp Container Settings
     *
     * @return Udp Container Settings
     */
    public UdpContainerSettings getContainerSettings() {
        return containerSettings;
    }

    /**
     * Udp Container Settings
     *
     * @param containerSettings Udp Container Settings
     */
    public void setContainerSettings(UdpContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
    }

    /**
     * Udp Container Settings
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param containerSettings Udp Container Settings
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UdpOutputSettings withContainerSettings(UdpContainerSettings containerSettings) {
        this.containerSettings = containerSettings;
        return this;
    }

    /**
     * Destination address and port number for RTP or UDP packets. Can be
     * unicast or multicast RTP or UDP (eg. rtp://239.10.10.10:5001 or
     * udp://10.100.100.100:5002).
     *
     * @return Destination address and port number for RTP or UDP packets. Can
     *         be unicast or multicast RTP or UDP (eg. rtp://239.10.10.10:5001
     *         or udp://10.100.100.100:5002).
     */
    public OutputLocationRef getDestination() {
        return destination;
    }

    /**
     * Destination address and port number for RTP or UDP packets. Can be
     * unicast or multicast RTP or UDP (eg. rtp://239.10.10.10:5001 or
     * udp://10.100.100.100:5002).
     *
     * @param destination Destination address and port number for RTP or UDP
     *            packets. Can be unicast or multicast RTP or UDP (eg.
     *            rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
     */
    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * Destination address and port number for RTP or UDP packets. Can be
     * unicast or multicast RTP or UDP (eg. rtp://239.10.10.10:5001 or
     * udp://10.100.100.100:5002).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination Destination address and port number for RTP or UDP
     *            packets. Can be unicast or multicast RTP or UDP (eg.
     *            rtp://239.10.10.10:5001 or udp://10.100.100.100:5002).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UdpOutputSettings withDestination(OutputLocationRef destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Settings for enabling and adjusting Forward Error Correction on UDP
     * outputs.
     *
     * @return Settings for enabling and adjusting Forward Error Correction on
     *         UDP outputs.
     */
    public FecOutputSettings getFecOutputSettings() {
        return fecOutputSettings;
    }

    /**
     * Settings for enabling and adjusting Forward Error Correction on UDP
     * outputs.
     *
     * @param fecOutputSettings Settings for enabling and adjusting Forward
     *            Error Correction on UDP outputs.
     */
    public void setFecOutputSettings(FecOutputSettings fecOutputSettings) {
        this.fecOutputSettings = fecOutputSettings;
    }

    /**
     * Settings for enabling and adjusting Forward Error Correction on UDP
     * outputs.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fecOutputSettings Settings for enabling and adjusting Forward
     *            Error Correction on UDP outputs.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UdpOutputSettings withFecOutputSettings(FecOutputSettings fecOutputSettings) {
        this.fecOutputSettings = fecOutputSettings;
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
        if (getBufferMsec() != null)
            sb.append("BufferMsec: " + getBufferMsec() + ",");
        if (getContainerSettings() != null)
            sb.append("ContainerSettings: " + getContainerSettings() + ",");
        if (getDestination() != null)
            sb.append("Destination: " + getDestination() + ",");
        if (getFecOutputSettings() != null)
            sb.append("FecOutputSettings: " + getFecOutputSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBufferMsec() == null) ? 0 : getBufferMsec().hashCode());
        hashCode = prime * hashCode
                + ((getContainerSettings() == null) ? 0 : getContainerSettings().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode
                + ((getFecOutputSettings() == null) ? 0 : getFecOutputSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UdpOutputSettings == false)
            return false;
        UdpOutputSettings other = (UdpOutputSettings) obj;

        if (other.getBufferMsec() == null ^ this.getBufferMsec() == null)
            return false;
        if (other.getBufferMsec() != null
                && other.getBufferMsec().equals(this.getBufferMsec()) == false)
            return false;
        if (other.getContainerSettings() == null ^ this.getContainerSettings() == null)
            return false;
        if (other.getContainerSettings() != null
                && other.getContainerSettings().equals(this.getContainerSettings()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getFecOutputSettings() == null ^ this.getFecOutputSettings() == null)
            return false;
        if (other.getFecOutputSettings() != null
                && other.getFecOutputSettings().equals(this.getFecOutputSettings()) == false)
            return false;
        return true;
    }
}
