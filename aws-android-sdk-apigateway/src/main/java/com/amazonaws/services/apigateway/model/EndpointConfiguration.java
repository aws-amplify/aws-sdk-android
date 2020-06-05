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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * The endpoint configuration to indicate the types of endpoints an API
 * (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>) has.
 * </p>
 */
public class EndpointConfiguration implements Serializable {
    /**
     * <p>
     * A list of endpoint types of an API (<a>RestApi</a>) or its custom domain
     * name (<a>DomainName</a>). For an edge-optimized API and its custom domain
     * name, the endpoint type is <code>"EDGE"</code>. For a regional API and
     * its custom domain name, the endpoint type is <code>REGIONAL</code>. For a
     * private API, the endpoint type is <code>PRIVATE</code>.
     * </p>
     */
    private java.util.List<String> types;

    /**
     * <p>
     * A list of VpcEndpointIds of an API (<a>RestApi</a>) against which to
     * create Route53 ALIASes. It is only supported for <code>PRIVATE</code>
     * endpoint type.
     * </p>
     */
    private java.util.List<String> vpcEndpointIds;

    /**
     * <p>
     * A list of endpoint types of an API (<a>RestApi</a>) or its custom domain
     * name (<a>DomainName</a>). For an edge-optimized API and its custom domain
     * name, the endpoint type is <code>"EDGE"</code>. For a regional API and
     * its custom domain name, the endpoint type is <code>REGIONAL</code>. For a
     * private API, the endpoint type is <code>PRIVATE</code>.
     * </p>
     *
     * @return <p>
     *         A list of endpoint types of an API (<a>RestApi</a>) or its custom
     *         domain name (<a>DomainName</a>). For an edge-optimized API and
     *         its custom domain name, the endpoint type is <code>"EDGE"</code>.
     *         For a regional API and its custom domain name, the endpoint type
     *         is <code>REGIONAL</code>. For a private API, the endpoint type is
     *         <code>PRIVATE</code>.
     *         </p>
     */
    public java.util.List<String> getTypes() {
        return types;
    }

    /**
     * <p>
     * A list of endpoint types of an API (<a>RestApi</a>) or its custom domain
     * name (<a>DomainName</a>). For an edge-optimized API and its custom domain
     * name, the endpoint type is <code>"EDGE"</code>. For a regional API and
     * its custom domain name, the endpoint type is <code>REGIONAL</code>. For a
     * private API, the endpoint type is <code>PRIVATE</code>.
     * </p>
     *
     * @param types <p>
     *            A list of endpoint types of an API (<a>RestApi</a>) or its
     *            custom domain name (<a>DomainName</a>). For an edge-optimized
     *            API and its custom domain name, the endpoint type is
     *            <code>"EDGE"</code>. For a regional API and its custom domain
     *            name, the endpoint type is <code>REGIONAL</code>. For a
     *            private API, the endpoint type is <code>PRIVATE</code>.
     *            </p>
     */
    public void setTypes(java.util.Collection<String> types) {
        if (types == null) {
            this.types = null;
            return;
        }

        this.types = new java.util.ArrayList<String>(types);
    }

    /**
     * <p>
     * A list of endpoint types of an API (<a>RestApi</a>) or its custom domain
     * name (<a>DomainName</a>). For an edge-optimized API and its custom domain
     * name, the endpoint type is <code>"EDGE"</code>. For a regional API and
     * its custom domain name, the endpoint type is <code>REGIONAL</code>. For a
     * private API, the endpoint type is <code>PRIVATE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param types <p>
     *            A list of endpoint types of an API (<a>RestApi</a>) or its
     *            custom domain name (<a>DomainName</a>). For an edge-optimized
     *            API and its custom domain name, the endpoint type is
     *            <code>"EDGE"</code>. For a regional API and its custom domain
     *            name, the endpoint type is <code>REGIONAL</code>. For a
     *            private API, the endpoint type is <code>PRIVATE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointConfiguration withTypes(String... types) {
        if (getTypes() == null) {
            this.types = new java.util.ArrayList<String>(types.length);
        }
        for (String value : types) {
            this.types.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of endpoint types of an API (<a>RestApi</a>) or its custom domain
     * name (<a>DomainName</a>). For an edge-optimized API and its custom domain
     * name, the endpoint type is <code>"EDGE"</code>. For a regional API and
     * its custom domain name, the endpoint type is <code>REGIONAL</code>. For a
     * private API, the endpoint type is <code>PRIVATE</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param types <p>
     *            A list of endpoint types of an API (<a>RestApi</a>) or its
     *            custom domain name (<a>DomainName</a>). For an edge-optimized
     *            API and its custom domain name, the endpoint type is
     *            <code>"EDGE"</code>. For a regional API and its custom domain
     *            name, the endpoint type is <code>REGIONAL</code>. For a
     *            private API, the endpoint type is <code>PRIVATE</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointConfiguration withTypes(java.util.Collection<String> types) {
        setTypes(types);
        return this;
    }

    /**
     * <p>
     * A list of VpcEndpointIds of an API (<a>RestApi</a>) against which to
     * create Route53 ALIASes. It is only supported for <code>PRIVATE</code>
     * endpoint type.
     * </p>
     *
     * @return <p>
     *         A list of VpcEndpointIds of an API (<a>RestApi</a>) against which
     *         to create Route53 ALIASes. It is only supported for
     *         <code>PRIVATE</code> endpoint type.
     *         </p>
     */
    public java.util.List<String> getVpcEndpointIds() {
        return vpcEndpointIds;
    }

    /**
     * <p>
     * A list of VpcEndpointIds of an API (<a>RestApi</a>) against which to
     * create Route53 ALIASes. It is only supported for <code>PRIVATE</code>
     * endpoint type.
     * </p>
     *
     * @param vpcEndpointIds <p>
     *            A list of VpcEndpointIds of an API (<a>RestApi</a>) against
     *            which to create Route53 ALIASes. It is only supported for
     *            <code>PRIVATE</code> endpoint type.
     *            </p>
     */
    public void setVpcEndpointIds(java.util.Collection<String> vpcEndpointIds) {
        if (vpcEndpointIds == null) {
            this.vpcEndpointIds = null;
            return;
        }

        this.vpcEndpointIds = new java.util.ArrayList<String>(vpcEndpointIds);
    }

    /**
     * <p>
     * A list of VpcEndpointIds of an API (<a>RestApi</a>) against which to
     * create Route53 ALIASes. It is only supported for <code>PRIVATE</code>
     * endpoint type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointIds <p>
     *            A list of VpcEndpointIds of an API (<a>RestApi</a>) against
     *            which to create Route53 ALIASes. It is only supported for
     *            <code>PRIVATE</code> endpoint type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointConfiguration withVpcEndpointIds(String... vpcEndpointIds) {
        if (getVpcEndpointIds() == null) {
            this.vpcEndpointIds = new java.util.ArrayList<String>(vpcEndpointIds.length);
        }
        for (String value : vpcEndpointIds) {
            this.vpcEndpointIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of VpcEndpointIds of an API (<a>RestApi</a>) against which to
     * create Route53 ALIASes. It is only supported for <code>PRIVATE</code>
     * endpoint type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcEndpointIds <p>
     *            A list of VpcEndpointIds of an API (<a>RestApi</a>) against
     *            which to create Route53 ALIASes. It is only supported for
     *            <code>PRIVATE</code> endpoint type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EndpointConfiguration withVpcEndpointIds(java.util.Collection<String> vpcEndpointIds) {
        setVpcEndpointIds(vpcEndpointIds);
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
        if (getTypes() != null)
            sb.append("types: " + getTypes() + ",");
        if (getVpcEndpointIds() != null)
            sb.append("vpcEndpointIds: " + getVpcEndpointIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypes() == null) ? 0 : getTypes().hashCode());
        hashCode = prime * hashCode
                + ((getVpcEndpointIds() == null) ? 0 : getVpcEndpointIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointConfiguration == false)
            return false;
        EndpointConfiguration other = (EndpointConfiguration) obj;

        if (other.getTypes() == null ^ this.getTypes() == null)
            return false;
        if (other.getTypes() != null && other.getTypes().equals(this.getTypes()) == false)
            return false;
        if (other.getVpcEndpointIds() == null ^ this.getVpcEndpointIds() == null)
            return false;
        if (other.getVpcEndpointIds() != null
                && other.getVpcEndpointIds().equals(this.getVpcEndpointIds()) == false)
            return false;
        return true;
    }
}
