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

package com.amazonaws.services.awscloudmap.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information that is specific to the namespace
 * type.
 * </p>
 */
public class NamespaceProperties implements Serializable {
    /**
     * <p>
     * A complex type that contains the ID for the Route 53 hosted zone that AWS
     * Cloud Map creates when you create a namespace.
     * </p>
     */
    private DnsProperties dnsProperties;

    /**
     * <p>
     * A complex type that contains the name of an HTTP namespace.
     * </p>
     */
    private HttpProperties httpProperties;

    /**
     * <p>
     * A complex type that contains the ID for the Route 53 hosted zone that AWS
     * Cloud Map creates when you create a namespace.
     * </p>
     *
     * @return <p>
     *         A complex type that contains the ID for the Route 53 hosted zone
     *         that AWS Cloud Map creates when you create a namespace.
     *         </p>
     */
    public DnsProperties getDnsProperties() {
        return dnsProperties;
    }

    /**
     * <p>
     * A complex type that contains the ID for the Route 53 hosted zone that AWS
     * Cloud Map creates when you create a namespace.
     * </p>
     *
     * @param dnsProperties <p>
     *            A complex type that contains the ID for the Route 53 hosted
     *            zone that AWS Cloud Map creates when you create a namespace.
     *            </p>
     */
    public void setDnsProperties(DnsProperties dnsProperties) {
        this.dnsProperties = dnsProperties;
    }

    /**
     * <p>
     * A complex type that contains the ID for the Route 53 hosted zone that AWS
     * Cloud Map creates when you create a namespace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsProperties <p>
     *            A complex type that contains the ID for the Route 53 hosted
     *            zone that AWS Cloud Map creates when you create a namespace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NamespaceProperties withDnsProperties(DnsProperties dnsProperties) {
        this.dnsProperties = dnsProperties;
        return this;
    }

    /**
     * <p>
     * A complex type that contains the name of an HTTP namespace.
     * </p>
     *
     * @return <p>
     *         A complex type that contains the name of an HTTP namespace.
     *         </p>
     */
    public HttpProperties getHttpProperties() {
        return httpProperties;
    }

    /**
     * <p>
     * A complex type that contains the name of an HTTP namespace.
     * </p>
     *
     * @param httpProperties <p>
     *            A complex type that contains the name of an HTTP namespace.
     *            </p>
     */
    public void setHttpProperties(HttpProperties httpProperties) {
        this.httpProperties = httpProperties;
    }

    /**
     * <p>
     * A complex type that contains the name of an HTTP namespace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param httpProperties <p>
     *            A complex type that contains the name of an HTTP namespace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NamespaceProperties withHttpProperties(HttpProperties httpProperties) {
        this.httpProperties = httpProperties;
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
        if (getDnsProperties() != null)
            sb.append("DnsProperties: " + getDnsProperties() + ",");
        if (getHttpProperties() != null)
            sb.append("HttpProperties: " + getHttpProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDnsProperties() == null) ? 0 : getDnsProperties().hashCode());
        hashCode = prime * hashCode
                + ((getHttpProperties() == null) ? 0 : getHttpProperties().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NamespaceProperties == false)
            return false;
        NamespaceProperties other = (NamespaceProperties) obj;

        if (other.getDnsProperties() == null ^ this.getDnsProperties() == null)
            return false;
        if (other.getDnsProperties() != null
                && other.getDnsProperties().equals(this.getDnsProperties()) == false)
            return false;
        if (other.getHttpProperties() == null ^ this.getHttpProperties() == null)
            return false;
        if (other.getHttpProperties() != null
                && other.getHttpProperties().equals(this.getHttpProperties()) == false)
            return false;
        return true;
    }
}
