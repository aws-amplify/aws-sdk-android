/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * An object that describes the endpoint of the signaling channel returned by
 * the <code>GetSignalingChannelEndpoint</code> API.
 * </p>
 * <p>
 * The media server endpoint will correspond to the <code>WEBRTC</code>
 * Protocol.
 * </p>
 */
public class ResourceEndpointListItem implements Serializable {
    /**
     * <p>
     * The protocol of the signaling channel returned by the
     * <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WSS, HTTPS, WEBRTC
     */
    private String protocol;

    /**
     * <p>
     * The endpoint of the signaling channel returned by the
     * <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     */
    private String resourceEndpoint;

    /**
     * <p>
     * The protocol of the signaling channel returned by the
     * <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WSS, HTTPS, WEBRTC
     *
     * @return <p>
     *         The protocol of the signaling channel returned by the
     *         <code>GetSignalingChannelEndpoint</code> API.
     *         </p>
     * @see ChannelProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol of the signaling channel returned by the
     * <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WSS, HTTPS, WEBRTC
     *
     * @param protocol <p>
     *            The protocol of the signaling channel returned by the
     *            <code>GetSignalingChannelEndpoint</code> API.
     *            </p>
     * @see ChannelProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol of the signaling channel returned by the
     * <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WSS, HTTPS, WEBRTC
     *
     * @param protocol <p>
     *            The protocol of the signaling channel returned by the
     *            <code>GetSignalingChannelEndpoint</code> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelProtocol
     */
    public ResourceEndpointListItem withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol of the signaling channel returned by the
     * <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WSS, HTTPS, WEBRTC
     *
     * @param protocol <p>
     *            The protocol of the signaling channel returned by the
     *            <code>GetSignalingChannelEndpoint</code> API.
     *            </p>
     * @see ChannelProtocol
     */
    public void setProtocol(ChannelProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol of the signaling channel returned by the
     * <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>WSS, HTTPS, WEBRTC
     *
     * @param protocol <p>
     *            The protocol of the signaling channel returned by the
     *            <code>GetSignalingChannelEndpoint</code> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelProtocol
     */
    public ResourceEndpointListItem withProtocol(ChannelProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint of the signaling channel returned by the
     * <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     *
     * @return <p>
     *         The endpoint of the signaling channel returned by the
     *         <code>GetSignalingChannelEndpoint</code> API.
     *         </p>
     */
    public String getResourceEndpoint() {
        return resourceEndpoint;
    }

    /**
     * <p>
     * The endpoint of the signaling channel returned by the
     * <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     *
     * @param resourceEndpoint <p>
     *            The endpoint of the signaling channel returned by the
     *            <code>GetSignalingChannelEndpoint</code> API.
     *            </p>
     */
    public void setResourceEndpoint(String resourceEndpoint) {
        this.resourceEndpoint = resourceEndpoint;
    }

    /**
     * <p>
     * The endpoint of the signaling channel returned by the
     * <code>GetSignalingChannelEndpoint</code> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceEndpoint <p>
     *            The endpoint of the signaling channel returned by the
     *            <code>GetSignalingChannelEndpoint</code> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResourceEndpointListItem withResourceEndpoint(String resourceEndpoint) {
        this.resourceEndpoint = resourceEndpoint;
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
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getResourceEndpoint() != null)
            sb.append("ResourceEndpoint: " + getResourceEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode
                + ((getResourceEndpoint() == null) ? 0 : getResourceEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceEndpointListItem == false)
            return false;
        ResourceEndpointListItem other = (ResourceEndpointListItem) obj;

        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getResourceEndpoint() == null ^ this.getResourceEndpoint() == null)
            return false;
        if (other.getResourceEndpoint() != null
                && other.getResourceEndpoint().equals(this.getResourceEndpoint()) == false)
            return false;
        return true;
    }
}
