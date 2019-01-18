/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a health check.
 * </p>
 */
public class HealthCheck implements Serializable {
    /**
     * <p>
     * The instance being checked. The protocol is either TCP, HTTP, HTTPS, or
     * SSL. The range of valid ports is one (1) through 65535.
     * </p>
     * <p>
     * TCP is the default, specified as a TCP: port pair, for example
     * "TCP:5000". In this case, a health check simply attempts to open a TCP
     * connection to the instance on the specified port. Failure to connect
     * within the configured timeout is considered unhealthy.
     * </p>
     * <p>
     * SSL is also specified as SSL: port pair, for example, SSL:5000.
     * </p>
     * <p>
     * For HTTP/HTTPS, you must include a ping path in the string. HTTP is
     * specified as a HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other than
     * "200 OK" within the timeout period is considered unhealthy.
     * </p>
     * <p>
     * The total length of the HTTP ping target must be 1024 16-bit Unicode
     * characters or less.
     * </p>
     */
    private String target;

    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an
     * individual instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     */
    private Integer interval;

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed
     * health check.
     * </p>
     * <p>
     * This value must be less than the <code>Interval</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 60<br/>
     */
    private Integer timeout;

    /**
     * <p>
     * The number of consecutive health check failures required before moving
     * the instance to the <code>Unhealthy</code> state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     */
    private Integer unhealthyThreshold;

    /**
     * <p>
     * The number of consecutive health checks successes required before moving
     * the instance to the <code>Healthy</code> state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     */
    private Integer healthyThreshold;

    /**
     * Default constructor for HealthCheck object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     */
    public HealthCheck() {
    }

    /**
     * Constructs a new HealthCheck object. Callers should use the setter or
     * fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param target <p>
     *            The instance being checked. The protocol is either TCP, HTTP,
     *            HTTPS, or SSL. The range of valid ports is one (1) through
     *            65535.
     *            </p>
     *            <p>
     *            TCP is the default, specified as a TCP: port pair, for example
     *            "TCP:5000". In this case, a health check simply attempts to
     *            open a TCP connection to the instance on the specified port.
     *            Failure to connect within the configured timeout is considered
     *            unhealthy.
     *            </p>
     *            <p>
     *            SSL is also specified as SSL: port pair, for example,
     *            SSL:5000.
     *            </p>
     *            <p>
     *            For HTTP/HTTPS, you must include a ping path in the string.
     *            HTTP is specified as a HTTP:port;/;PathToPing; grouping, for
     *            example "HTTP:80/weather/us/wa/seattle". In this case, a HTTP
     *            GET request is issued to the instance on the given port and
     *            path. Any answer other than "200 OK" within the timeout period
     *            is considered unhealthy.
     *            </p>
     *            <p>
     *            The total length of the HTTP ping target must be 1024 16-bit
     *            Unicode characters or less.
     *            </p>
     * @param interval <p>
     *            The approximate interval, in seconds, between health checks of
     *            an individual instance.
     *            </p>
     * @param timeout <p>
     *            The amount of time, in seconds, during which no response means
     *            a failed health check.
     *            </p>
     *            <p>
     *            This value must be less than the <code>Interval</code> value.
     *            </p>
     * @param unhealthyThreshold <p>
     *            The number of consecutive health check failures required
     *            before moving the instance to the <code>Unhealthy</code>
     *            state.
     *            </p>
     * @param healthyThreshold <p>
     *            The number of consecutive health checks successes required
     *            before moving the instance to the <code>Healthy</code> state.
     *            </p>
     */
    public HealthCheck(String target, Integer interval, Integer timeout,
            Integer unhealthyThreshold, Integer healthyThreshold) {
        setTarget(target);
        setInterval(interval);
        setTimeout(timeout);
        setUnhealthyThreshold(unhealthyThreshold);
        setHealthyThreshold(healthyThreshold);
    }

    /**
     * <p>
     * The instance being checked. The protocol is either TCP, HTTP, HTTPS, or
     * SSL. The range of valid ports is one (1) through 65535.
     * </p>
     * <p>
     * TCP is the default, specified as a TCP: port pair, for example
     * "TCP:5000". In this case, a health check simply attempts to open a TCP
     * connection to the instance on the specified port. Failure to connect
     * within the configured timeout is considered unhealthy.
     * </p>
     * <p>
     * SSL is also specified as SSL: port pair, for example, SSL:5000.
     * </p>
     * <p>
     * For HTTP/HTTPS, you must include a ping path in the string. HTTP is
     * specified as a HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other than
     * "200 OK" within the timeout period is considered unhealthy.
     * </p>
     * <p>
     * The total length of the HTTP ping target must be 1024 16-bit Unicode
     * characters or less.
     * </p>
     *
     * @return <p>
     *         The instance being checked. The protocol is either TCP, HTTP,
     *         HTTPS, or SSL. The range of valid ports is one (1) through 65535.
     *         </p>
     *         <p>
     *         TCP is the default, specified as a TCP: port pair, for example
     *         "TCP:5000". In this case, a health check simply attempts to open
     *         a TCP connection to the instance on the specified port. Failure
     *         to connect within the configured timeout is considered unhealthy.
     *         </p>
     *         <p>
     *         SSL is also specified as SSL: port pair, for example, SSL:5000.
     *         </p>
     *         <p>
     *         For HTTP/HTTPS, you must include a ping path in the string. HTTP
     *         is specified as a HTTP:port;/;PathToPing; grouping, for example
     *         "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request
     *         is issued to the instance on the given port and path. Any answer
     *         other than "200 OK" within the timeout period is considered
     *         unhealthy.
     *         </p>
     *         <p>
     *         The total length of the HTTP ping target must be 1024 16-bit
     *         Unicode characters or less.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The instance being checked. The protocol is either TCP, HTTP, HTTPS, or
     * SSL. The range of valid ports is one (1) through 65535.
     * </p>
     * <p>
     * TCP is the default, specified as a TCP: port pair, for example
     * "TCP:5000". In this case, a health check simply attempts to open a TCP
     * connection to the instance on the specified port. Failure to connect
     * within the configured timeout is considered unhealthy.
     * </p>
     * <p>
     * SSL is also specified as SSL: port pair, for example, SSL:5000.
     * </p>
     * <p>
     * For HTTP/HTTPS, you must include a ping path in the string. HTTP is
     * specified as a HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other than
     * "200 OK" within the timeout period is considered unhealthy.
     * </p>
     * <p>
     * The total length of the HTTP ping target must be 1024 16-bit Unicode
     * characters or less.
     * </p>
     *
     * @param target <p>
     *            The instance being checked. The protocol is either TCP, HTTP,
     *            HTTPS, or SSL. The range of valid ports is one (1) through
     *            65535.
     *            </p>
     *            <p>
     *            TCP is the default, specified as a TCP: port pair, for example
     *            "TCP:5000". In this case, a health check simply attempts to
     *            open a TCP connection to the instance on the specified port.
     *            Failure to connect within the configured timeout is considered
     *            unhealthy.
     *            </p>
     *            <p>
     *            SSL is also specified as SSL: port pair, for example,
     *            SSL:5000.
     *            </p>
     *            <p>
     *            For HTTP/HTTPS, you must include a ping path in the string.
     *            HTTP is specified as a HTTP:port;/;PathToPing; grouping, for
     *            example "HTTP:80/weather/us/wa/seattle". In this case, a HTTP
     *            GET request is issued to the instance on the given port and
     *            path. Any answer other than "200 OK" within the timeout period
     *            is considered unhealthy.
     *            </p>
     *            <p>
     *            The total length of the HTTP ping target must be 1024 16-bit
     *            Unicode characters or less.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The instance being checked. The protocol is either TCP, HTTP, HTTPS, or
     * SSL. The range of valid ports is one (1) through 65535.
     * </p>
     * <p>
     * TCP is the default, specified as a TCP: port pair, for example
     * "TCP:5000". In this case, a health check simply attempts to open a TCP
     * connection to the instance on the specified port. Failure to connect
     * within the configured timeout is considered unhealthy.
     * </p>
     * <p>
     * SSL is also specified as SSL: port pair, for example, SSL:5000.
     * </p>
     * <p>
     * For HTTP/HTTPS, you must include a ping path in the string. HTTP is
     * specified as a HTTP:port;/;PathToPing; grouping, for example
     * "HTTP:80/weather/us/wa/seattle". In this case, a HTTP GET request is
     * issued to the instance on the given port and path. Any answer other than
     * "200 OK" within the timeout period is considered unhealthy.
     * </p>
     * <p>
     * The total length of the HTTP ping target must be 1024 16-bit Unicode
     * characters or less.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            The instance being checked. The protocol is either TCP, HTTP,
     *            HTTPS, or SSL. The range of valid ports is one (1) through
     *            65535.
     *            </p>
     *            <p>
     *            TCP is the default, specified as a TCP: port pair, for example
     *            "TCP:5000". In this case, a health check simply attempts to
     *            open a TCP connection to the instance on the specified port.
     *            Failure to connect within the configured timeout is considered
     *            unhealthy.
     *            </p>
     *            <p>
     *            SSL is also specified as SSL: port pair, for example,
     *            SSL:5000.
     *            </p>
     *            <p>
     *            For HTTP/HTTPS, you must include a ping path in the string.
     *            HTTP is specified as a HTTP:port;/;PathToPing; grouping, for
     *            example "HTTP:80/weather/us/wa/seattle". In this case, a HTTP
     *            GET request is issued to the instance on the given port and
     *            path. Any answer other than "200 OK" within the timeout period
     *            is considered unhealthy.
     *            </p>
     *            <p>
     *            The total length of the HTTP ping target must be 1024 16-bit
     *            Unicode characters or less.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an
     * individual instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @return <p>
     *         The approximate interval, in seconds, between health checks of an
     *         individual instance.
     *         </p>
     */
    public Integer getInterval() {
        return interval;
    }

    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an
     * individual instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @param interval <p>
     *            The approximate interval, in seconds, between health checks of
     *            an individual instance.
     *            </p>
     */
    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The approximate interval, in seconds, between health checks of an
     * individual instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>5 - 300<br/>
     *
     * @param interval <p>
     *            The approximate interval, in seconds, between health checks of
     *            an individual instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed
     * health check.
     * </p>
     * <p>
     * This value must be less than the <code>Interval</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 60<br/>
     *
     * @return <p>
     *         The amount of time, in seconds, during which no response means a
     *         failed health check.
     *         </p>
     *         <p>
     *         This value must be less than the <code>Interval</code> value.
     *         </p>
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed
     * health check.
     * </p>
     * <p>
     * This value must be less than the <code>Interval</code> value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 60<br/>
     *
     * @param timeout <p>
     *            The amount of time, in seconds, during which no response means
     *            a failed health check.
     *            </p>
     *            <p>
     *            This value must be less than the <code>Interval</code> value.
     *            </p>
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * <p>
     * The amount of time, in seconds, during which no response means a failed
     * health check.
     * </p>
     * <p>
     * This value must be less than the <code>Interval</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 60<br/>
     *
     * @param timeout <p>
     *            The amount of time, in seconds, during which no response means
     *            a failed health check.
     *            </p>
     *            <p>
     *            This value must be less than the <code>Interval</code> value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before moving
     * the instance to the <code>Unhealthy</code> state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return <p>
     *         The number of consecutive health check failures required before
     *         moving the instance to the <code>Unhealthy</code> state.
     *         </p>
     */
    public Integer getUnhealthyThreshold() {
        return unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before moving
     * the instance to the <code>Unhealthy</code> state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param unhealthyThreshold <p>
     *            The number of consecutive health check failures required
     *            before moving the instance to the <code>Unhealthy</code>
     *            state.
     *            </p>
     */
    public void setUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health check failures required before moving
     * the instance to the <code>Unhealthy</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param unhealthyThreshold <p>
     *            The number of consecutive health check failures required
     *            before moving the instance to the <code>Unhealthy</code>
     *            state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before moving
     * the instance to the <code>Healthy</code> state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @return <p>
     *         The number of consecutive health checks successes required before
     *         moving the instance to the <code>Healthy</code> state.
     *         </p>
     */
    public Integer getHealthyThreshold() {
        return healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before moving
     * the instance to the <code>Healthy</code> state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param healthyThreshold <p>
     *            The number of consecutive health checks successes required
     *            before moving the instance to the <code>Healthy</code> state.
     *            </p>
     */
    public void setHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
    }

    /**
     * <p>
     * The number of consecutive health checks successes required before moving
     * the instance to the <code>Healthy</code> state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - 10<br/>
     *
     * @param healthyThreshold <p>
     *            The number of consecutive health checks successes required
     *            before moving the instance to the <code>Healthy</code> state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HealthCheck withHealthyThreshold(Integer healthyThreshold) {
        this.healthyThreshold = healthyThreshold;
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
        if (getTarget() != null)
            sb.append("Target: " + getTarget() + ",");
        if (getInterval() != null)
            sb.append("Interval: " + getInterval() + ",");
        if (getTimeout() != null)
            sb.append("Timeout: " + getTimeout() + ",");
        if (getUnhealthyThreshold() != null)
            sb.append("UnhealthyThreshold: " + getUnhealthyThreshold() + ",");
        if (getHealthyThreshold() != null)
            sb.append("HealthyThreshold: " + getHealthyThreshold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getUnhealthyThreshold() == null) ? 0 : getUnhealthyThreshold().hashCode());
        hashCode = prime * hashCode
                + ((getHealthyThreshold() == null) ? 0 : getHealthyThreshold().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HealthCheck == false)
            return false;
        HealthCheck other = (HealthCheck) obj;

        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getTimeout() == null ^ this.getTimeout() == null)
            return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false)
            return false;
        if (other.getUnhealthyThreshold() == null ^ this.getUnhealthyThreshold() == null)
            return false;
        if (other.getUnhealthyThreshold() != null
                && other.getUnhealthyThreshold().equals(this.getUnhealthyThreshold()) == false)
            return false;
        if (other.getHealthyThreshold() == null ^ this.getHealthyThreshold() == null)
            return false;
        if (other.getHealthyThreshold() != null
                && other.getHealthyThreshold().equals(this.getHealthyThreshold()) == false)
            return false;
        return true;
    }
}
