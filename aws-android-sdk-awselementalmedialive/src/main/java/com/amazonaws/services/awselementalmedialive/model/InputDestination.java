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
 * The settings for a PUSH type input.
 */
public class InputDestination implements Serializable {
    /**
     * The system-generated static IP address of endpoint. It remains fixed for
     * the lifetime of the input.
     */
    private String ip;

    /**
     * The port number for the input.
     */
    private String port;

    /**
     * This represents the endpoint that the customer stream will be pushed to.
     */
    private String url;

    /**
     * The properties for a VPC type input destination.
     */
    private InputDestinationVpc vpc;

    /**
     * The system-generated static IP address of endpoint. It remains fixed for
     * the lifetime of the input.
     * 
     * @return The system-generated static IP address of endpoint. It remains
     *         fixed for the lifetime of the input.
     */
    public String getIp() {
        return ip;
    }

    /**
     * The system-generated static IP address of endpoint. It remains fixed for
     * the lifetime of the input.
     * 
     * @param ip The system-generated static IP address of endpoint. It remains
     *            fixed for the lifetime of the input.
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * The system-generated static IP address of endpoint. It remains fixed for
     * the lifetime of the input. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ip The system-generated static IP address of endpoint. It remains
     *            fixed for the lifetime of the input. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDestination withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * The port number for the input.
     *
     * @return The port number for the input.
     */
    public String getPort() {
        return port;
    }

    /**
     * The port number for the input.
     *
     * @param port The port number for the input.
     */
    public void setPort(String port) {
        this.port = port;
    }

    /**
     * The port number for the input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port The port number for the input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDestination withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * This represents the endpoint that the customer stream will be pushed to.
     * 
     * @return This represents the endpoint that the customer stream will be
     *         pushed to.
     */
    public String getUrl() {
        return url;
    }

    /**
     * This represents the endpoint that the customer stream will be pushed to.
     * 
     * @param url This represents the endpoint that the customer stream will be
     *            pushed to.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This represents the endpoint that the customer stream will be pushed to. <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param url This represents the endpoint that the customer stream will be
     *            pushed to. @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDestination withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * The properties for a VPC type input destination.
     *
     * @return The properties for a VPC type input destination.
     */
    public InputDestinationVpc getVpc() {
        return vpc;
    }

    /**
     * The properties for a VPC type input destination.
     *
     * @param vpc The properties for a VPC type input destination.
     */
    public void setVpc(InputDestinationVpc vpc) {
        this.vpc = vpc;
    }

    /**
     * The properties for a VPC type input destination.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpc The properties for a VPC type input destination.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputDestination withVpc(InputDestinationVpc vpc) {
        this.vpc = vpc;
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
        if (getIp() != null)
            sb.append("Ip: " + getIp() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getUrl() != null)
            sb.append("Url: " + getUrl() + ",");
        if (getVpc() != null)
            sb.append("Vpc: " + getVpc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDestination == false)
            return false;
        InputDestination other = (InputDestination) obj;

        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        return true;
    }
}
