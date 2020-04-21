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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

/**
 * <p>
 * Nameserver includes the following elements.
 * </p>
 */
public class Nameserver implements Serializable {
    /**
     * <p>
     * The fully qualified host name of the name server.
     * </p>
     * <p>
     * Constraint: Maximum 255 characters
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     */
    private String name;

    /**
     * <p>
     * Glue IP address of a name server entry. Glue IP addresses are required
     * only when the name of the name server is a subdomain of the domain. For
     * example, if your domain is example.com and the name server for the domain
     * is ns.example.com, you need to specify the IP address for ns.example.com.
     * </p>
     * <p>
     * Constraints: The list can contain only one IPv4 and one IPv6 address.
     * </p>
     */
    private java.util.List<String> glueIps;

    /**
     * <p>
     * The fully qualified host name of the name server.
     * </p>
     * <p>
     * Constraint: Maximum 255 characters
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @return <p>
     *         The fully qualified host name of the name server.
     *         </p>
     *         <p>
     *         Constraint: Maximum 255 characters
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The fully qualified host name of the name server.
     * </p>
     * <p>
     * Constraint: Maximum 255 characters
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param name <p>
     *            The fully qualified host name of the name server.
     *            </p>
     *            <p>
     *            Constraint: Maximum 255 characters
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The fully qualified host name of the name server.
     * </p>
     * <p>
     * Constraint: Maximum 255 characters
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param name <p>
     *            The fully qualified host name of the name server.
     *            </p>
     *            <p>
     *            Constraint: Maximum 255 characters
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Nameserver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Glue IP address of a name server entry. Glue IP addresses are required
     * only when the name of the name server is a subdomain of the domain. For
     * example, if your domain is example.com and the name server for the domain
     * is ns.example.com, you need to specify the IP address for ns.example.com.
     * </p>
     * <p>
     * Constraints: The list can contain only one IPv4 and one IPv6 address.
     * </p>
     *
     * @return <p>
     *         Glue IP address of a name server entry. Glue IP addresses are
     *         required only when the name of the name server is a subdomain of
     *         the domain. For example, if your domain is example.com and the
     *         name server for the domain is ns.example.com, you need to specify
     *         the IP address for ns.example.com.
     *         </p>
     *         <p>
     *         Constraints: The list can contain only one IPv4 and one IPv6
     *         address.
     *         </p>
     */
    public java.util.List<String> getGlueIps() {
        return glueIps;
    }

    /**
     * <p>
     * Glue IP address of a name server entry. Glue IP addresses are required
     * only when the name of the name server is a subdomain of the domain. For
     * example, if your domain is example.com and the name server for the domain
     * is ns.example.com, you need to specify the IP address for ns.example.com.
     * </p>
     * <p>
     * Constraints: The list can contain only one IPv4 and one IPv6 address.
     * </p>
     *
     * @param glueIps <p>
     *            Glue IP address of a name server entry. Glue IP addresses are
     *            required only when the name of the name server is a subdomain
     *            of the domain. For example, if your domain is example.com and
     *            the name server for the domain is ns.example.com, you need to
     *            specify the IP address for ns.example.com.
     *            </p>
     *            <p>
     *            Constraints: The list can contain only one IPv4 and one IPv6
     *            address.
     *            </p>
     */
    public void setGlueIps(java.util.Collection<String> glueIps) {
        if (glueIps == null) {
            this.glueIps = null;
            return;
        }

        this.glueIps = new java.util.ArrayList<String>(glueIps);
    }

    /**
     * <p>
     * Glue IP address of a name server entry. Glue IP addresses are required
     * only when the name of the name server is a subdomain of the domain. For
     * example, if your domain is example.com and the name server for the domain
     * is ns.example.com, you need to specify the IP address for ns.example.com.
     * </p>
     * <p>
     * Constraints: The list can contain only one IPv4 and one IPv6 address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param glueIps <p>
     *            Glue IP address of a name server entry. Glue IP addresses are
     *            required only when the name of the name server is a subdomain
     *            of the domain. For example, if your domain is example.com and
     *            the name server for the domain is ns.example.com, you need to
     *            specify the IP address for ns.example.com.
     *            </p>
     *            <p>
     *            Constraints: The list can contain only one IPv4 and one IPv6
     *            address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Nameserver withGlueIps(String... glueIps) {
        if (getGlueIps() == null) {
            this.glueIps = new java.util.ArrayList<String>(glueIps.length);
        }
        for (String value : glueIps) {
            this.glueIps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Glue IP address of a name server entry. Glue IP addresses are required
     * only when the name of the name server is a subdomain of the domain. For
     * example, if your domain is example.com and the name server for the domain
     * is ns.example.com, you need to specify the IP address for ns.example.com.
     * </p>
     * <p>
     * Constraints: The list can contain only one IPv4 and one IPv6 address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param glueIps <p>
     *            Glue IP address of a name server entry. Glue IP addresses are
     *            required only when the name of the name server is a subdomain
     *            of the domain. For example, if your domain is example.com and
     *            the name server for the domain is ns.example.com, you need to
     *            specify the IP address for ns.example.com.
     *            </p>
     *            <p>
     *            Constraints: The list can contain only one IPv4 and one IPv6
     *            address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Nameserver withGlueIps(java.util.Collection<String> glueIps) {
        setGlueIps(glueIps);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getGlueIps() != null)
            sb.append("GlueIps: " + getGlueIps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getGlueIps() == null) ? 0 : getGlueIps().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Nameserver == false)
            return false;
        Nameserver other = (Nameserver) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGlueIps() == null ^ this.getGlueIps() == null)
            return false;
        if (other.getGlueIps() != null && other.getGlueIps().equals(this.getGlueIps()) == false)
            return false;
        return true;
    }
}
