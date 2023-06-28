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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides an endpoint for the specified signaling channel to send and receive
 * messages. This API uses the
 * <code>SingleMasterChannelEndpointConfiguration</code> input parameter, which
 * consists of the <code>Protocols</code> and <code>Role</code> properties.
 * </p>
 * <p>
 * <code>Protocols</code> is used to determine the communication mechanism. For
 * example, if you specify <code>WSS</code> as the protocol, this API produces a
 * secure websocket endpoint. If you specify <code>HTTPS</code> as the protocol,
 * this API generates an HTTPS endpoint.
 * </p>
 * <p>
 * <code>Role</code> determines the messaging permissions. A <code>MASTER</code>
 * role results in this API generating an endpoint that a client can use to
 * communicate with any of the viewers on the channel. A <code>VIEWER</code>
 * role results in this API generating an endpoint that a client can use to
 * communicate only with a <code>MASTER</code>.
 * </p>
 */
public class GetSignalingChannelEndpointRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signalling channel for which you
     * want to get an endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     */
    private String channelARN;

    /**
     * <p>
     * A structure containing the endpoint configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     */
    private SingleMasterChannelEndpointConfiguration singleMasterChannelEndpointConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signalling channel for which you
     * want to get an endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the signalling channel for
     *         which you want to get an endpoint.
     *         </p>
     */
    public String getChannelARN() {
        return channelARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signalling channel for which you
     * want to get an endpoint.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param channelARN <p>
     *            The Amazon Resource Name (ARN) of the signalling channel for
     *            which you want to get an endpoint.
     *            </p>
     */
    public void setChannelARN(String channelARN) {
        this.channelARN = channelARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the signalling channel for which you
     * want to get an endpoint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern:
     * </b>arn:[a-z\d-]+:kinesisvideo:[a-z0-9-]+:[0-9]+:[a-z]+/[a-zA-
     * Z0-9_.-]+/[0-9]+<br/>
     *
     * @param channelARN <p>
     *            The Amazon Resource Name (ARN) of the signalling channel for
     *            which you want to get an endpoint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSignalingChannelEndpointRequest withChannelARN(String channelARN) {
        this.channelARN = channelARN;
        return this;
    }

    /**
     * <p>
     * A structure containing the endpoint configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     *
     * @return <p>
     *         A structure containing the endpoint configuration for the
     *         <code>SINGLE_MASTER</code> channel type.
     *         </p>
     */
    public SingleMasterChannelEndpointConfiguration getSingleMasterChannelEndpointConfiguration() {
        return singleMasterChannelEndpointConfiguration;
    }

    /**
     * <p>
     * A structure containing the endpoint configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     *
     * @param singleMasterChannelEndpointConfiguration <p>
     *            A structure containing the endpoint configuration for the
     *            <code>SINGLE_MASTER</code> channel type.
     *            </p>
     */
    public void setSingleMasterChannelEndpointConfiguration(
            SingleMasterChannelEndpointConfiguration singleMasterChannelEndpointConfiguration) {
        this.singleMasterChannelEndpointConfiguration = singleMasterChannelEndpointConfiguration;
    }

    /**
     * <p>
     * A structure containing the endpoint configuration for the
     * <code>SINGLE_MASTER</code> channel type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param singleMasterChannelEndpointConfiguration <p>
     *            A structure containing the endpoint configuration for the
     *            <code>SINGLE_MASTER</code> channel type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSignalingChannelEndpointRequest withSingleMasterChannelEndpointConfiguration(
            SingleMasterChannelEndpointConfiguration singleMasterChannelEndpointConfiguration) {
        this.singleMasterChannelEndpointConfiguration = singleMasterChannelEndpointConfiguration;
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
        if (getSingleMasterChannelEndpointConfiguration() != null)
            sb.append("SingleMasterChannelEndpointConfiguration: "
                    + getSingleMasterChannelEndpointConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelARN() == null) ? 0 : getChannelARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getSingleMasterChannelEndpointConfiguration() == null) ? 0
                        : getSingleMasterChannelEndpointConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSignalingChannelEndpointRequest == false)
            return false;
        GetSignalingChannelEndpointRequest other = (GetSignalingChannelEndpointRequest) obj;

        if (other.getChannelARN() == null ^ this.getChannelARN() == null)
            return false;
        if (other.getChannelARN() != null
                && other.getChannelARN().equals(this.getChannelARN()) == false)
            return false;
        if (other.getSingleMasterChannelEndpointConfiguration() == null
                ^ this.getSingleMasterChannelEndpointConfiguration() == null)
            return false;
        if (other.getSingleMasterChannelEndpointConfiguration() != null
                && other.getSingleMasterChannelEndpointConfiguration().equals(
                        this.getSingleMasterChannelEndpointConfiguration()) == false)
            return false;
        return true;
    }
}
