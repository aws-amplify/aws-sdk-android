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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the health check policy for a virtual node's
 * listener.
 * </p>
 */
public class HealthCheckPolicy implements Serializable {
    /**
     * <p>
     * The number of consecutive successful health checks that must occur before
     * declaring listener healthy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     */
    private Integer healthyThreshold;

    /**
     * <p>
     * The time period in milliseconds between each health check execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5000 - 300000<br/>
     */
    private Long intervalMillis;

    /**
     * <p>
     * The destination path for the health check request. This value is only
     * used if the specified protocol is HTTP or HTTP/2. For any other protocol,
     * this value is ignored.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The destination port for the health check request. This port must match
     * the port defined in the <a>PortMapping</a> for the listener.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer port;

    /**
     * <p>
     * The protocol for the health check request. If you specify
     * <code>grpc</code>, then your service must conform to the <a
     * href="https://github.com/grpc/grpc/blob/master/doc/health-checking.md"
     * >GRPC Health Checking Protocol</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     */
    private String protocol;

    /**
     * <p>
     * The amount of time to wait when receiving a response from the health
     * check, in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2000 - 60000<br/>
     */
    private Long timeoutMillis;

    /**
     * <p>
     * The number of consecutive failed health checks that must occur before
     * declaring a virtual node unhealthy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     */
    private Integer unhealthyThreshold;

    /**
     * <p>
     * The number of consecutive successful health checks that must occur before
     * declaring listener healthy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return <p>
     *         The number of consecutive successful health checks that must
     *         occur before declaring listener healthy.
     *         </p>
     */
    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive successful health checks that must occur before
     * declaring listener healthy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param healthyThreshold <p>
     *            The number of consecutive successful health checks that must
     *            occur before declaring listener healthy.
     *            </p>
     */
    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive successful health checks that must occur before
     * declaring listener healthy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param healthyThreshold <p>
     *            The number of consecutive successful health checks that must
     *            occur before declaring listener healthy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheckPolicy withHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        return this;
    }

    /**
     * <p>
     * The time period in milliseconds between each health check execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5000 - 300000<br/>
     *
     * @return <p>
     *         The time period in milliseconds between each health check
     *         execution.
     *         </p>
     */
    public Long getIntervalMillis() {
        return intervalMillis;
    }

    /**
     * <p>
     * The time period in milliseconds between each health check execution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5000 - 300000<br/>
     *
     * @param intervalMillis <p>
     *            The time period in milliseconds between each health check
     *            execution.
     *            </p>
     */
    public void setIntervalMillis(Long intervalMillis) {
        this.intervalMillis = intervalMillis;
    }

    /**
     * <p>
     * The time period in milliseconds between each health check execution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5000 - 300000<br/>
     *
     * @param intervalMillis <p>
     *            The time period in milliseconds between each health check
     *            execution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheckPolicy withIntervalMillis(Long intervalMillis) {
        this.intervalMillis = intervalMillis;
        return this;
    }

    /**
     * <p>
     * The destination path for the health check request. This value is only
     * used if the specified protocol is HTTP or HTTP/2. For any other protocol,
     * this value is ignored.
     * </p>
     *
     * @return <p>
     *         The destination path for the health check request. This value is
     *         only used if the specified protocol is HTTP or HTTP/2. For any
     *         other protocol, this value is ignored.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The destination path for the health check request. This value is only
     * used if the specified protocol is HTTP or HTTP/2. For any other protocol,
     * this value is ignored.
     * </p>
     *
     * @param path <p>
     *            The destination path for the health check request. This value
     *            is only used if the specified protocol is HTTP or HTTP/2. For
     *            any other protocol, this value is ignored.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The destination path for the health check request. This value is only
     * used if the specified protocol is HTTP or HTTP/2. For any other protocol,
     * this value is ignored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The destination path for the health check request. This value
     *            is only used if the specified protocol is HTTP or HTTP/2. For
     *            any other protocol, this value is ignored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheckPolicy withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The destination port for the health check request. This port must match
     * the port defined in the <a>PortMapping</a> for the listener.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return <p>
     *         The destination port for the health check request. This port must
     *         match the port defined in the <a>PortMapping</a> for the
     *         listener.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The destination port for the health check request. This port must match
     * the port defined in the <a>PortMapping</a> for the listener.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param port <p>
     *            The destination port for the health check request. This port
     *            must match the port defined in the <a>PortMapping</a> for the
     *            listener.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The destination port for the health check request. This port must match
     * the port defined in the <a>PortMapping</a> for the listener.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param port <p>
     *            The destination port for the health check request. This port
     *            must match the port defined in the <a>PortMapping</a> for the
     *            listener.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheckPolicy withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The protocol for the health check request. If you specify
     * <code>grpc</code>, then your service must conform to the <a
     * href="https://github.com/grpc/grpc/blob/master/doc/health-checking.md"
     * >GRPC Health Checking Protocol</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     *
     * @return <p>
     *         The protocol for the health check request. If you specify
     *         <code>grpc</code>, then your service must conform to the <a
     *         href="https://github.com/grpc/grpc/blob/master/doc/health-checking.md"
     *         >GRPC Health Checking Protocol</a>.
     *         </p>
     * @see PortProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol for the health check request. If you specify
     * <code>grpc</code>, then your service must conform to the <a
     * href="https://github.com/grpc/grpc/blob/master/doc/health-checking.md"
     * >GRPC Health Checking Protocol</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     *
     * @param protocol <p>
     *            The protocol for the health check request. If you specify
     *            <code>grpc</code>, then your service must conform to the <a
     *            href=
     *            "https://github.com/grpc/grpc/blob/master/doc/health-checking.md"
     *            >GRPC Health Checking Protocol</a>.
     *            </p>
     * @see PortProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol for the health check request. If you specify
     * <code>grpc</code>, then your service must conform to the <a
     * href="https://github.com/grpc/grpc/blob/master/doc/health-checking.md"
     * >GRPC Health Checking Protocol</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     *
     * @param protocol <p>
     *            The protocol for the health check request. If you specify
     *            <code>grpc</code>, then your service must conform to the <a
     *            href=
     *            "https://github.com/grpc/grpc/blob/master/doc/health-checking.md"
     *            >GRPC Health Checking Protocol</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortProtocol
     */
    public HealthCheckPolicy withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol for the health check request. If you specify
     * <code>grpc</code>, then your service must conform to the <a
     * href="https://github.com/grpc/grpc/blob/master/doc/health-checking.md"
     * >GRPC Health Checking Protocol</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     *
     * @param protocol <p>
     *            The protocol for the health check request. If you specify
     *            <code>grpc</code>, then your service must conform to the <a
     *            href=
     *            "https://github.com/grpc/grpc/blob/master/doc/health-checking.md"
     *            >GRPC Health Checking Protocol</a>.
     *            </p>
     * @see PortProtocol
     */
    public void setProtocol(PortProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol for the health check request. If you specify
     * <code>grpc</code>, then your service must conform to the <a
     * href="https://github.com/grpc/grpc/blob/master/doc/health-checking.md"
     * >GRPC Health Checking Protocol</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>grpc, http, http2, tcp
     *
     * @param protocol <p>
     *            The protocol for the health check request. If you specify
     *            <code>grpc</code>, then your service must conform to the <a
     *            href=
     *            "https://github.com/grpc/grpc/blob/master/doc/health-checking.md"
     *            >GRPC Health Checking Protocol</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PortProtocol
     */
    public HealthCheckPolicy withProtocol(PortProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The amount of time to wait when receiving a response from the health
     * check, in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2000 - 60000<br/>
     *
     * @return <p>
     *         The amount of time to wait when receiving a response from the
     *         health check, in milliseconds.
     *         </p>
     */
    public Long getTimeoutMillis() {
        return timeoutMillis;
    }

    /**
     * <p>
     * The amount of time to wait when receiving a response from the health
     * check, in milliseconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2000 - 60000<br/>
     *
     * @param timeoutMillis <p>
     *            The amount of time to wait when receiving a response from the
     *            health check, in milliseconds.
     *            </p>
     */
    public void setTimeoutMillis(Long timeoutMillis) {
        this.timeoutMillis = timeoutMillis;
    }

    /**
     * <p>
     * The amount of time to wait when receiving a response from the health
     * check, in milliseconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2000 - 60000<br/>
     *
     * @param timeoutMillis <p>
     *            The amount of time to wait when receiving a response from the
     *            health check, in milliseconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheckPolicy withTimeoutMillis(Long timeoutMillis) {
        this.timeoutMillis = timeoutMillis;
        return this;
    }

    /**
     * <p>
     * The number of consecutive failed health checks that must occur before
     * declaring a virtual node unhealthy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return <p>
     *         The number of consecutive failed health checks that must occur
     *         before declaring a virtual node unhealthy.
     *         </p>
     */
    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive failed health checks that must occur before
     * declaring a virtual node unhealthy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param unhealthyThreshold <p>
     *            The number of consecutive failed health checks that must occur
     *            before declaring a virtual node unhealthy.
     *            </p>
     */
    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive failed health checks that must occur before
     * declaring a virtual node unhealthy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param unhealthyThreshold <p>
     *            The number of consecutive failed health checks that must occur
     *            before declaring a virtual node unhealthy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheckPolicy withUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
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
        if (getHealthyThreshold() != null)
            sb.append("healthyThreshold: " + getHealthyThreshold() + ",");
        if (getIntervalMillis() != null)
            sb.append("intervalMillis: " + getIntervalMillis() + ",");
        if (getPath() != null)
            sb.append("path: " + getPath() + ",");
        if (getPort() != null)
            sb.append("port: " + getPort() + ",");
        if (getProtocol() != null)
            sb.append("protocol: " + getProtocol() + ",");
        if (getTimeoutMillis() != null)
            sb.append("timeoutMillis: " + getTimeoutMillis() + ",");
        if (getUnhealthyThreshold() != null)
            sb.append("unhealthyThreshold: " + getUnhealthyThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHealthyThreshold() == null) ? 0 : getHealthyThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getIntervalMillis() == null) ? 0 : getIntervalMillis().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutMillis() == null) ? 0 : getTimeoutMillis().hashCode());
        hashCode = prime * hashCode
                + ((getUnhealthyThreshold() == null) ? 0 : getUnhealthyThreshold().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheckPolicy == false)
            return false;
        HealthCheckPolicy other = (HealthCheckPolicy) obj;

        if (other.getHealthyThreshold() == null ^ this.getHealthyThreshold() == null)
            return false;
        if (other.getHealthyThreshold() != null
                && other.getHealthyThreshold().equals(this.getHealthyThreshold()) == false)
            return false;
        if (other.getIntervalMillis() == null ^ this.getIntervalMillis() == null)
            return false;
        if (other.getIntervalMillis() != null
                && other.getIntervalMillis().equals(this.getIntervalMillis()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getTimeoutMillis() == null ^ this.getTimeoutMillis() == null)
            return false;
        if (other.getTimeoutMillis() != null
                && other.getTimeoutMillis().equals(this.getTimeoutMillis()) == false)
            return false;
        if (other.getUnhealthyThreshold() == null ^ this.getUnhealthyThreshold() == null)
            return false;
        if (other.getUnhealthyThreshold() != null
                && other.getUnhealthyThreshold().equals(this.getUnhealthyThreshold()) == false)
            return false;
        return true;
    }
}
