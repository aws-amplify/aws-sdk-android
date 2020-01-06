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

package com.amazonaws.services.kinesisvideosignaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets the Interactive Connectivity Establishment (ICE) server configuration
 * information, including URIs, username, and password which can be used to
 * configure the WebRTC connection. The ICE component uses this configuration
 * information to setup the WebRTC connection, including authenticating with the
 * Traversal Using Relays around NAT (TURN) relay server.
 * </p>
 * <p>
 * TURN is a protocol that is used to improve the connectivity of peer-to-peer
 * applications. By providing a cloud-based relay service, TURN ensures that a
 * connection can be established even when one or more peers are incapable of a
 * direct peer-to-peer connection. For more information, see <a
 * href="https://tools.ietf.org/html/draft-uberti-rtcweb-turn-rest-00">A REST
 * API For Access To TURN Services</a>.
 * </p>
 * <p>
 * You can invoke this API to establish a fallback mechanism in case either of
 * the peers is unable to establish a direct peer-to-peer connection over a
 * signaling channel. You must specify either a signaling channel ARN or the
 * client ID in order to invoke this API.
 * </p>
 */
public class GetIceServerConfigRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the signaling channel to be used for the peer-to-peer
     * connection between configured peers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     */
    private String channelARN;

    /**
     * <p>
     * Unique identifier for the viewer. Must be unique within the signaling
     * channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String clientId;

    /**
     * <p>
     * Specifies the desired service. Currently, <code>TURN</code> is the only
     * valid value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TURN
     */
    private String service;

    /**
     * <p>
     * An optional user ID to be associated with the credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String username;

    /**
     * <p>
     * The ARN of the signaling channel to be used for the peer-to-peer
     * connection between configured peers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @return <p>
     *         The ARN of the signaling channel to be used for the peer-to-peer
     *         connection between configured peers.
     *         </p>
     */
    public String getChannelARN() {
        return channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel to be used for the peer-to-peer
     * connection between configured peers.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param channelARN <p>
     *            The ARN of the signaling channel to be used for the
     *            peer-to-peer connection between configured peers.
     *            </p>
     */
    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The ARN of the signaling channel to be used for the peer-to-peer
     * connection between configured peers.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:aws:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-Z0-9_.-]+/[0-9]+
     * <br/>
     *
     * @param channelARN <p>
     *            The ARN of the signaling channel to be used for the
     *            peer-to-peer connection between configured peers.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIceServerConfigRequest withChannelARN(String channelARN) {
        this.channelARN = channelARN;
        return this;
    }

    /**
     * <p>
     * Unique identifier for the viewer. Must be unique within the signaling
     * channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         Unique identifier for the viewer. Must be unique within the
     *         signaling channel.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * Unique identifier for the viewer. Must be unique within the signaling
     * channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param clientId <p>
     *            Unique identifier for the viewer. Must be unique within the
     *            signaling channel.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * Unique identifier for the viewer. Must be unique within the signaling
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param clientId <p>
     *            Unique identifier for the viewer. Must be unique within the
     *            signaling channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIceServerConfigRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * <p>
     * Specifies the desired service. Currently, <code>TURN</code> is the only
     * valid value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TURN
     *
     * @return <p>
     *         Specifies the desired service. Currently, <code>TURN</code> is
     *         the only valid value.
     *         </p>
     * @see Service
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * Specifies the desired service. Currently, <code>TURN</code> is the only
     * valid value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TURN
     *
     * @param service <p>
     *            Specifies the desired service. Currently, <code>TURN</code> is
     *            the only valid value.
     *            </p>
     * @see Service
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * Specifies the desired service. Currently, <code>TURN</code> is the only
     * valid value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TURN
     *
     * @param service <p>
     *            Specifies the desired service. Currently, <code>TURN</code> is
     *            the only valid value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Service
     */
    public GetIceServerConfigRequest withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * <p>
     * Specifies the desired service. Currently, <code>TURN</code> is the only
     * valid value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TURN
     *
     * @param service <p>
     *            Specifies the desired service. Currently, <code>TURN</code> is
     *            the only valid value.
     *            </p>
     * @see Service
     */
    public void setService(Service service) {
        this.service = service.toString();
    }

    /**
     * <p>
     * Specifies the desired service. Currently, <code>TURN</code> is the only
     * valid value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TURN
     *
     * @param service <p>
     *            Specifies the desired service. Currently, <code>TURN</code> is
     *            the only valid value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Service
     */
    public GetIceServerConfigRequest withService(Service service) {
        this.service = service.toString();
        return this;
    }

    /**
     * <p>
     * An optional user ID to be associated with the credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         An optional user ID to be associated with the credentials.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * An optional user ID to be associated with the credentials.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param username <p>
     *            An optional user ID to be associated with the credentials.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * An optional user ID to be associated with the credentials.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param username <p>
     *            An optional user ID to be associated with the credentials.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIceServerConfigRequest withUsername(String username) {
        this.username = username;
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
        if (getChannelARN() != null)
            sb.append("ChannelARN: " + getChannelARN() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getService() != null)
            sb.append("Service: " + getService() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIceServerConfigRequest == false)
            return false;
        GetIceServerConfigRequest other = (GetIceServerConfigRequest) obj;

        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null
                && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }
}
