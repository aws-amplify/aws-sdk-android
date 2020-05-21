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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the redirect behavior of all requests to a website endpoint of an
 * Amazon S3 bucket.
 * </p>
 */
public class RedirectAllRequestsTo implements Serializable {
    /**
     * <p>
     * Name of the host where requests are redirected.
     * </p>
     */
    private String hostName;

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     */
    private String protocol;

    /**
     * <p>
     * Name of the host where requests are redirected.
     * </p>
     *
     * @return <p>
     *         Name of the host where requests are redirected.
     *         </p>
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * <p>
     * Name of the host where requests are redirected.
     * </p>
     *
     * @param hostName <p>
     *            Name of the host where requests are redirected.
     *            </p>
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * <p>
     * Name of the host where requests are redirected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostName <p>
     *            Name of the host where requests are redirected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RedirectAllRequestsTo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @return <p>
     *         Protocol to use when redirecting requests. The default is the
     *         protocol that is used in the original request.
     *         </p>
     * @see Protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param protocol <p>
     *            Protocol to use when redirecting requests. The default is the
     *            protocol that is used in the original request.
     *            </p>
     * @see Protocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param protocol <p>
     *            Protocol to use when redirecting requests. The default is the
     *            protocol that is used in the original request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Protocol
     */
    public RedirectAllRequestsTo withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param protocol <p>
     *            Protocol to use when redirecting requests. The default is the
     *            protocol that is used in the original request.
     *            </p>
     * @see Protocol
     */
    public void setProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * Protocol to use when redirecting requests. The default is the protocol
     * that is used in the original request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>http, https
     *
     * @param protocol <p>
     *            Protocol to use when redirecting requests. The default is the
     *            protocol that is used in the original request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Protocol
     */
    public RedirectAllRequestsTo withProtocol(Protocol protocol) {
        this.protocol = protocol.toString();
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
        if (getHostName() != null)
            sb.append("HostName: " + getHostName() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostName() == null) ? 0 : getHostName().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedirectAllRequestsTo == false)
            return false;
        RedirectAllRequestsTo other = (RedirectAllRequestsTo) obj;

        if (other.getHostName() == null ^ this.getHostName() == null)
            return false;
        if (other.getHostName() != null && other.getHostName().equals(this.getHostName()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }
}
