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
 * An object that contains the endpoint configuration for the
 * <code>SINGLE_MASTER</code> channel type.
 * </p>
 */
public class SingleMasterChannelEndpointConfiguration implements Serializable {
    /**
     * <p>
     * This property is used to determine the nature of communication over this
     * <code>SINGLE_MASTER</code> signaling channel. If <code>WSS</code> is
     * specified, this API returns a websocket endpoint. If <code>HTTPS</code>
     * is specified, this API returns an <code>HTTPS</code> endpoint.
     * </p>
     */
    private java.util.List<String> protocols = new java.util.ArrayList<String>();

    /**
     * <p>
     * This property is used to determine messaging permissions in this
     * <code>SINGLE_MASTER</code> signaling channel. If <code>MASTER</code> is
     * specified, this API returns an endpoint that a client can use to receive
     * offers from and send answers to any of the viewers on this signaling
     * channel. If <code>VIEWER</code> is specified, this API returns an
     * endpoint that a client can use only to send offers to another
     * <code>MASTER</code> client on this signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, VIEWER
     */
    private String role;

    /**
     * <p>
     * This property is used to determine the nature of communication over this
     * <code>SINGLE_MASTER</code> signaling channel. If <code>WSS</code> is
     * specified, this API returns a websocket endpoint. If <code>HTTPS</code>
     * is specified, this API returns an <code>HTTPS</code> endpoint.
     * </p>
     *
     * @return <p>
     *         This property is used to determine the nature of communication
     *         over this <code>SINGLE_MASTER</code> signaling channel. If
     *         <code>WSS</code> is specified, this API returns a websocket
     *         endpoint. If <code>HTTPS</code> is specified, this API returns an
     *         <code>HTTPS</code> endpoint.
     *         </p>
     */
    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * This property is used to determine the nature of communication over this
     * <code>SINGLE_MASTER</code> signaling channel. If <code>WSS</code> is
     * specified, this API returns a websocket endpoint. If <code>HTTPS</code>
     * is specified, this API returns an <code>HTTPS</code> endpoint.
     * </p>
     *
     * @param protocols <p>
     *            This property is used to determine the nature of communication
     *            over this <code>SINGLE_MASTER</code> signaling channel. If
     *            <code>WSS</code> is specified, this API returns a websocket
     *            endpoint. If <code>HTTPS</code> is specified, this API returns
     *            an <code>HTTPS</code> endpoint.
     *            </p>
     */
    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * This property is used to determine the nature of communication over this
     * <code>SINGLE_MASTER</code> signaling channel. If <code>WSS</code> is
     * specified, this API returns a websocket endpoint. If <code>HTTPS</code>
     * is specified, this API returns an <code>HTTPS</code> endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocols <p>
     *            This property is used to determine the nature of communication
     *            over this <code>SINGLE_MASTER</code> signaling channel. If
     *            <code>WSS</code> is specified, this API returns a websocket
     *            endpoint. If <code>HTTPS</code> is specified, this API returns
     *            an <code>HTTPS</code> endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleMasterChannelEndpointConfiguration withProtocols(String... protocols) {
        if (getProtocols() == null) {
            this.protocols = new java.util.ArrayList<String>(protocols.length);
        }
        for (String value : protocols) {
            this.protocols.add(value);
        }
        return this;
    }

    /**
     * <p>
     * This property is used to determine the nature of communication over this
     * <code>SINGLE_MASTER</code> signaling channel. If <code>WSS</code> is
     * specified, this API returns a websocket endpoint. If <code>HTTPS</code>
     * is specified, this API returns an <code>HTTPS</code> endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param protocols <p>
     *            This property is used to determine the nature of communication
     *            over this <code>SINGLE_MASTER</code> signaling channel. If
     *            <code>WSS</code> is specified, this API returns a websocket
     *            endpoint. If <code>HTTPS</code> is specified, this API returns
     *            an <code>HTTPS</code> endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SingleMasterChannelEndpointConfiguration withProtocols(
            java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * This property is used to determine messaging permissions in this
     * <code>SINGLE_MASTER</code> signaling channel. If <code>MASTER</code> is
     * specified, this API returns an endpoint that a client can use to receive
     * offers from and send answers to any of the viewers on this signaling
     * channel. If <code>VIEWER</code> is specified, this API returns an
     * endpoint that a client can use only to send offers to another
     * <code>MASTER</code> client on this signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, VIEWER
     *
     * @return <p>
     *         This property is used to determine messaging permissions in this
     *         <code>SINGLE_MASTER</code> signaling channel. If
     *         <code>MASTER</code> is specified, this API returns an endpoint
     *         that a client can use to receive offers from and send answers to
     *         any of the viewers on this signaling channel. If
     *         <code>VIEWER</code> is specified, this API returns an endpoint
     *         that a client can use only to send offers to another
     *         <code>MASTER</code> client on this signaling channel.
     *         </p>
     * @see ChannelRole
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * This property is used to determine messaging permissions in this
     * <code>SINGLE_MASTER</code> signaling channel. If <code>MASTER</code> is
     * specified, this API returns an endpoint that a client can use to receive
     * offers from and send answers to any of the viewers on this signaling
     * channel. If <code>VIEWER</code> is specified, this API returns an
     * endpoint that a client can use only to send offers to another
     * <code>MASTER</code> client on this signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, VIEWER
     *
     * @param role <p>
     *            This property is used to determine messaging permissions in
     *            this <code>SINGLE_MASTER</code> signaling channel. If
     *            <code>MASTER</code> is specified, this API returns an endpoint
     *            that a client can use to receive offers from and send answers
     *            to any of the viewers on this signaling channel. If
     *            <code>VIEWER</code> is specified, this API returns an endpoint
     *            that a client can use only to send offers to another
     *            <code>MASTER</code> client on this signaling channel.
     *            </p>
     * @see ChannelRole
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * This property is used to determine messaging permissions in this
     * <code>SINGLE_MASTER</code> signaling channel. If <code>MASTER</code> is
     * specified, this API returns an endpoint that a client can use to receive
     * offers from and send answers to any of the viewers on this signaling
     * channel. If <code>VIEWER</code> is specified, this API returns an
     * endpoint that a client can use only to send offers to another
     * <code>MASTER</code> client on this signaling channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, VIEWER
     *
     * @param role <p>
     *            This property is used to determine messaging permissions in
     *            this <code>SINGLE_MASTER</code> signaling channel. If
     *            <code>MASTER</code> is specified, this API returns an endpoint
     *            that a client can use to receive offers from and send answers
     *            to any of the viewers on this signaling channel. If
     *            <code>VIEWER</code> is specified, this API returns an endpoint
     *            that a client can use only to send offers to another
     *            <code>MASTER</code> client on this signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelRole
     */
    public SingleMasterChannelEndpointConfiguration withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * This property is used to determine messaging permissions in this
     * <code>SINGLE_MASTER</code> signaling channel. If <code>MASTER</code> is
     * specified, this API returns an endpoint that a client can use to receive
     * offers from and send answers to any of the viewers on this signaling
     * channel. If <code>VIEWER</code> is specified, this API returns an
     * endpoint that a client can use only to send offers to another
     * <code>MASTER</code> client on this signaling channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, VIEWER
     *
     * @param role <p>
     *            This property is used to determine messaging permissions in
     *            this <code>SINGLE_MASTER</code> signaling channel. If
     *            <code>MASTER</code> is specified, this API returns an endpoint
     *            that a client can use to receive offers from and send answers
     *            to any of the viewers on this signaling channel. If
     *            <code>VIEWER</code> is specified, this API returns an endpoint
     *            that a client can use only to send offers to another
     *            <code>MASTER</code> client on this signaling channel.
     *            </p>
     * @see ChannelRole
     */
    public void setRole(ChannelRole role) {
        this.role = role.toString();
    }

    /**
     * <p>
     * This property is used to determine messaging permissions in this
     * <code>SINGLE_MASTER</code> signaling channel. If <code>MASTER</code> is
     * specified, this API returns an endpoint that a client can use to receive
     * offers from and send answers to any of the viewers on this signaling
     * channel. If <code>VIEWER</code> is specified, this API returns an
     * endpoint that a client can use only to send offers to another
     * <code>MASTER</code> client on this signaling channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MASTER, VIEWER
     *
     * @param role <p>
     *            This property is used to determine messaging permissions in
     *            this <code>SINGLE_MASTER</code> signaling channel. If
     *            <code>MASTER</code> is specified, this API returns an endpoint
     *            that a client can use to receive offers from and send answers
     *            to any of the viewers on this signaling channel. If
     *            <code>VIEWER</code> is specified, this API returns an endpoint
     *            that a client can use only to send offers to another
     *            <code>MASTER</code> client on this signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChannelRole
     */
    public SingleMasterChannelEndpointConfiguration withRole(ChannelRole role) {
        this.role = role.toString();
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
        if (getProtocols() != null)
            sb.append("Protocols: " + getProtocols() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SingleMasterChannelEndpointConfiguration == false)
            return false;
        SingleMasterChannelEndpointConfiguration other = (SingleMasterChannelEndpointConfiguration) obj;

        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null
                && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        return true;
    }
}
