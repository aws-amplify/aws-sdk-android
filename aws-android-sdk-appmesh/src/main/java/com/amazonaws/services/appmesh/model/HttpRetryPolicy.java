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
 * An object that represents a retry policy. Specify at least one value for at
 * least one of the types of <code>RetryEvents</code>, a value for
 * <code>maxRetries</code>, and a value for <code>perRetryTimeout</code>.
 * </p>
 */
public class HttpRetryPolicy implements Serializable {
    /**
     * <p>
     * Specify at least one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505,
     * 506, 507, 508, 510, and 511
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>client-error</b> – HTTP status code 409
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>stream-error</b> – Retry on refused stream
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> httpRetryEvents;

    /**
     * <p>
     * The maximum number of retry attempts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Long maxRetries;

    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     */
    private Duration perRetryTimeout;

    /**
     * <p>
     * Specify a valid value.
     * </p>
     */
    private java.util.List<String> tcpRetryEvents;

    /**
     * <p>
     * Specify at least one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505,
     * 506, 507, 508, 510, and 511
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>client-error</b> – HTTP status code 409
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>stream-error</b> – Retry on refused stream
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Specify at least one of the following values.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504,
     *         505, 506, 507, 508, 510, and 511
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>client-error</b> – HTTP status code 409
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>stream-error</b> – Retry on refused stream
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getHttpRetryEvents() {
        return httpRetryEvents;
    }

    /**
     * <p>
     * Specify at least one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505,
     * 506, 507, 508, 510, and 511
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>client-error</b> – HTTP status code 409
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>stream-error</b> – Retry on refused stream
     * </p>
     * </li>
     * </ul>
     *
     * @param httpRetryEvents <p>
     *            Specify at least one of the following values.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>server-error</b> – HTTP status codes 500, 501, 502, 503,
     *            504, 505, 506, 507, 508, 510, and 511
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>client-error</b> – HTTP status code 409
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>stream-error</b> – Retry on refused stream
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setHttpRetryEvents(java.util.Collection<String> httpRetryEvents) {
        if (httpRetryEvents == null) {
            this.httpRetryEvents = null;
            return;
        }

        this.httpRetryEvents = new java.util.ArrayList<String>(httpRetryEvents);
    }

    /**
     * <p>
     * Specify at least one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505,
     * 506, 507, 508, 510, and 511
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>client-error</b> – HTTP status code 409
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>stream-error</b> – Retry on refused stream
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpRetryEvents <p>
     *            Specify at least one of the following values.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>server-error</b> – HTTP status codes 500, 501, 502, 503,
     *            504, 505, 506, 507, 508, 510, and 511
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>client-error</b> – HTTP status code 409
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>stream-error</b> – Retry on refused stream
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRetryPolicy withHttpRetryEvents(String... httpRetryEvents) {
        if (getHttpRetryEvents() == null) {
            this.httpRetryEvents = new java.util.ArrayList<String>(httpRetryEvents.length);
        }
        for (String value : httpRetryEvents) {
            this.httpRetryEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specify at least one of the following values.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>server-error</b> – HTTP status codes 500, 501, 502, 503, 504, 505,
     * 506, 507, 508, 510, and 511
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>client-error</b> – HTTP status code 409
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>stream-error</b> – Retry on refused stream
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpRetryEvents <p>
     *            Specify at least one of the following values.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>server-error</b> – HTTP status codes 500, 501, 502, 503,
     *            504, 505, 506, 507, 508, 510, and 511
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>gateway-error</b> – HTTP status codes 502, 503, and 504
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>client-error</b> – HTTP status code 409
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>stream-error</b> – Retry on refused stream
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRetryPolicy withHttpRetryEvents(java.util.Collection<String> httpRetryEvents) {
        setHttpRetryEvents(httpRetryEvents);
        return this;
    }

    /**
     * <p>
     * The maximum number of retry attempts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The maximum number of retry attempts.
     *         </p>
     */
    public Long getMaxRetries() {
        return maxRetries;
    }

    /**
     * <p>
     * The maximum number of retry attempts.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxRetries <p>
     *            The maximum number of retry attempts.
     *            </p>
     */
    public void setMaxRetries(Long maxRetries) {
        this.maxRetries = maxRetries;
    }

    /**
     * <p>
     * The maximum number of retry attempts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param maxRetries <p>
     *            The maximum number of retry attempts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRetryPolicy withMaxRetries(Long maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     *
     * @return <p>
     *         An object that represents a duration of time.
     *         </p>
     */
    public Duration getPerRetryTimeout() {
        return perRetryTimeout;
    }

    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     *
     * @param perRetryTimeout <p>
     *            An object that represents a duration of time.
     *            </p>
     */
    public void setPerRetryTimeout(Duration perRetryTimeout) {
        this.perRetryTimeout = perRetryTimeout;
    }

    /**
     * <p>
     * An object that represents a duration of time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param perRetryTimeout <p>
     *            An object that represents a duration of time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRetryPolicy withPerRetryTimeout(Duration perRetryTimeout) {
        this.perRetryTimeout = perRetryTimeout;
        return this;
    }

    /**
     * <p>
     * Specify a valid value.
     * </p>
     *
     * @return <p>
     *         Specify a valid value.
     *         </p>
     */
    public java.util.List<String> getTcpRetryEvents() {
        return tcpRetryEvents;
    }

    /**
     * <p>
     * Specify a valid value.
     * </p>
     *
     * @param tcpRetryEvents <p>
     *            Specify a valid value.
     *            </p>
     */
    public void setTcpRetryEvents(java.util.Collection<String> tcpRetryEvents) {
        if (tcpRetryEvents == null) {
            this.tcpRetryEvents = null;
            return;
        }

        this.tcpRetryEvents = new java.util.ArrayList<String>(tcpRetryEvents);
    }

    /**
     * <p>
     * Specify a valid value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tcpRetryEvents <p>
     *            Specify a valid value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRetryPolicy withTcpRetryEvents(String... tcpRetryEvents) {
        if (getTcpRetryEvents() == null) {
            this.tcpRetryEvents = new java.util.ArrayList<String>(tcpRetryEvents.length);
        }
        for (String value : tcpRetryEvents) {
            this.tcpRetryEvents.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specify a valid value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tcpRetryEvents <p>
     *            Specify a valid value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HttpRetryPolicy withTcpRetryEvents(java.util.Collection<String> tcpRetryEvents) {
        setTcpRetryEvents(tcpRetryEvents);
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
        if (getHttpRetryEvents() != null)
            sb.append("httpRetryEvents: " + getHttpRetryEvents() + ",");
        if (getMaxRetries() != null)
            sb.append("maxRetries: " + getMaxRetries() + ",");
        if (getPerRetryTimeout() != null)
            sb.append("perRetryTimeout: " + getPerRetryTimeout() + ",");
        if (getTcpRetryEvents() != null)
            sb.append("tcpRetryEvents: " + getTcpRetryEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHttpRetryEvents() == null) ? 0 : getHttpRetryEvents().hashCode());
        hashCode = prime * hashCode + ((getMaxRetries() == null) ? 0 : getMaxRetries().hashCode());
        hashCode = prime * hashCode
                + ((getPerRetryTimeout() == null) ? 0 : getPerRetryTimeout().hashCode());
        hashCode = prime * hashCode
                + ((getTcpRetryEvents() == null) ? 0 : getTcpRetryEvents().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpRetryPolicy == false)
            return false;
        HttpRetryPolicy other = (HttpRetryPolicy) obj;

        if (other.getHttpRetryEvents() == null ^ this.getHttpRetryEvents() == null)
            return false;
        if (other.getHttpRetryEvents() != null
                && other.getHttpRetryEvents().equals(this.getHttpRetryEvents()) == false)
            return false;
        if (other.getMaxRetries() == null ^ this.getMaxRetries() == null)
            return false;
        if (other.getMaxRetries() != null
                && other.getMaxRetries().equals(this.getMaxRetries()) == false)
            return false;
        if (other.getPerRetryTimeout() == null ^ this.getPerRetryTimeout() == null)
            return false;
        if (other.getPerRetryTimeout() != null
                && other.getPerRetryTimeout().equals(this.getPerRetryTimeout()) == false)
            return false;
        if (other.getTcpRetryEvents() == null ^ this.getTcpRetryEvents() == null)
            return false;
        if (other.getTcpRetryEvents() != null
                && other.getTcpRetryEvents().equals(this.getTcpRetryEvents()) == false)
            return false;
        return true;
    }
}
