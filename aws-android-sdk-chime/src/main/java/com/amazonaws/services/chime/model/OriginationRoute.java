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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

/**
 * <p>
 * Origination routes define call distribution properties for your SIP hosts to
 * receive inbound calls using your Amazon Chime Voice Connector. Limit: Ten
 * origination routes for each Amazon Chime Voice Connector.
 * </p>
 */
public class OriginationRoute implements Serializable {
    /**
     * <p>
     * The FQDN or IP address to contact for origination traffic.
     * </p>
     */
    private String host;

    /**
     * <p>
     * The designated origination route port. Defaults to 5060.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     */
    private Integer port;

    /**
     * <p>
     * The protocol to use for the origination route. Encryption-enabled Amazon
     * Chime Voice Connectors use TCP protocol by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TCP, UDP
     */
    private String protocol;

    /**
     * <p>
     * The priority associated with the host, with 1 being the highest priority.
     * Higher priority hosts are attempted first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer priority;

    /**
     * <p>
     * The weight associated with the host. If hosts are equal in priority,
     * calls are distributed among them based on their relative weight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer weight;

    /**
     * <p>
     * The FQDN or IP address to contact for origination traffic.
     * </p>
     *
     * @return <p>
     *         The FQDN or IP address to contact for origination traffic.
     *         </p>
     */
    public String getHost() {
        return host;
    }

    /**
     * <p>
     * The FQDN or IP address to contact for origination traffic.
     * </p>
     *
     * @param host <p>
     *            The FQDN or IP address to contact for origination traffic.
     *            </p>
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * <p>
     * The FQDN or IP address to contact for origination traffic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param host <p>
     *            The FQDN or IP address to contact for origination traffic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginationRoute withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * <p>
     * The designated origination route port. Defaults to 5060.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @return <p>
     *         The designated origination route port. Defaults to 5060.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The designated origination route port. Defaults to 5060.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param port <p>
     *            The designated origination route port. Defaults to 5060.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The designated origination route port. Defaults to 5060.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 65535<br/>
     *
     * @param port <p>
     *            The designated origination route port. Defaults to 5060.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginationRoute withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The protocol to use for the origination route. Encryption-enabled Amazon
     * Chime Voice Connectors use TCP protocol by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TCP, UDP
     *
     * @return <p>
     *         The protocol to use for the origination route. Encryption-enabled
     *         Amazon Chime Voice Connectors use TCP protocol by default.
     *         </p>
     * @see OriginationRouteProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol to use for the origination route. Encryption-enabled Amazon
     * Chime Voice Connectors use TCP protocol by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TCP, UDP
     *
     * @param protocol <p>
     *            The protocol to use for the origination route.
     *            Encryption-enabled Amazon Chime Voice Connectors use TCP
     *            protocol by default.
     *            </p>
     * @see OriginationRouteProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use for the origination route. Encryption-enabled Amazon
     * Chime Voice Connectors use TCP protocol by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TCP, UDP
     *
     * @param protocol <p>
     *            The protocol to use for the origination route.
     *            Encryption-enabled Amazon Chime Voice Connectors use TCP
     *            protocol by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginationRouteProtocol
     */
    public OriginationRoute withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol to use for the origination route. Encryption-enabled Amazon
     * Chime Voice Connectors use TCP protocol by default.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TCP, UDP
     *
     * @param protocol <p>
     *            The protocol to use for the origination route.
     *            Encryption-enabled Amazon Chime Voice Connectors use TCP
     *            protocol by default.
     *            </p>
     * @see OriginationRouteProtocol
     */
    public void setProtocol(OriginationRouteProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol to use for the origination route. Encryption-enabled Amazon
     * Chime Voice Connectors use TCP protocol by default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TCP, UDP
     *
     * @param protocol <p>
     *            The protocol to use for the origination route.
     *            Encryption-enabled Amazon Chime Voice Connectors use TCP
     *            protocol by default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OriginationRouteProtocol
     */
    public OriginationRoute withProtocol(OriginationRouteProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The priority associated with the host, with 1 being the highest priority.
     * Higher priority hosts are attempted first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The priority associated with the host, with 1 being the highest
     *         priority. Higher priority hosts are attempted first.
     *         </p>
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * <p>
     * The priority associated with the host, with 1 being the highest priority.
     * Higher priority hosts are attempted first.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param priority <p>
     *            The priority associated with the host, with 1 being the
     *            highest priority. Higher priority hosts are attempted first.
     *            </p>
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * The priority associated with the host, with 1 being the highest priority.
     * Higher priority hosts are attempted first.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param priority <p>
     *            The priority associated with the host, with 1 being the
     *            highest priority. Higher priority hosts are attempted first.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginationRoute withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * <p>
     * The weight associated with the host. If hosts are equal in priority,
     * calls are distributed among them based on their relative weight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The weight associated with the host. If hosts are equal in
     *         priority, calls are distributed among them based on their
     *         relative weight.
     *         </p>
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * <p>
     * The weight associated with the host. If hosts are equal in priority,
     * calls are distributed among them based on their relative weight.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param weight <p>
     *            The weight associated with the host. If hosts are equal in
     *            priority, calls are distributed among them based on their
     *            relative weight.
     *            </p>
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * <p>
     * The weight associated with the host. If hosts are equal in priority,
     * calls are distributed among them based on their relative weight.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param weight <p>
     *            The weight associated with the host. If hosts are equal in
     *            priority, calls are distributed among them based on their
     *            relative weight.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OriginationRoute withWeight(Integer weight) {
        this.weight = weight;
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
        if (getHost() != null)
            sb.append("Host: " + getHost() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getPriority() != null)
            sb.append("Priority: " + getPriority() + ",");
        if (getWeight() != null)
            sb.append("Weight: " + getWeight());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getWeight() == null) ? 0 : getWeight().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OriginationRoute == false)
            return false;
        OriginationRoute other = (OriginationRoute) obj;

        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getWeight() == null ^ this.getWeight() == null)
            return false;
        if (other.getWeight() != null && other.getWeight().equals(this.getWeight()) == false)
            return false;
        return true;
    }
}
