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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the private DNS name for the service endpoint. For more
 * information about these parameters, see <a href=
 * "https://docs.aws.amazon.com/vpc/latest/userguide/ndpoint-services-dns-validation.html"
 * >VPC Endpoint Service Private DNS Name Verification</a> in the <i>Amazon
 * Virtual Private Cloud User Guide</i>.
 * </p>
 */
public class PrivateDnsNameConfiguration implements Serializable {
    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * &gt;Consumers of the endpoint service can use the private name only when
     * the state is <code>verified</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     */
    private String state;

    /**
     * <p>
     * The endpoint service verification type, for example TXT.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The value the service provider adds to the private DNS name domain record
     * before verification.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The name of the record subdomain the service provider needs to create.
     * The service provider adds the <code>value</code> text to the
     * <code>name</code>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * &gt;Consumers of the endpoint service can use the private name only when
     * the state is <code>verified</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     *
     * @return <p>
     *         The verification state of the VPC endpoint service.
     *         </p>
     *         <p>
     *         &gt;Consumers of the endpoint service can use the private name
     *         only when the state is <code>verified</code>.
     *         </p>
     * @see DnsNameState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * &gt;Consumers of the endpoint service can use the private name only when
     * the state is <code>verified</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     *
     * @param state <p>
     *            The verification state of the VPC endpoint service.
     *            </p>
     *            <p>
     *            &gt;Consumers of the endpoint service can use the private name
     *            only when the state is <code>verified</code>.
     *            </p>
     * @see DnsNameState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * &gt;Consumers of the endpoint service can use the private name only when
     * the state is <code>verified</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     *
     * @param state <p>
     *            The verification state of the VPC endpoint service.
     *            </p>
     *            <p>
     *            &gt;Consumers of the endpoint service can use the private name
     *            only when the state is <code>verified</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DnsNameState
     */
    public PrivateDnsNameConfiguration withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * &gt;Consumers of the endpoint service can use the private name only when
     * the state is <code>verified</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     *
     * @param state <p>
     *            The verification state of the VPC endpoint service.
     *            </p>
     *            <p>
     *            &gt;Consumers of the endpoint service can use the private name
     *            only when the state is <code>verified</code>.
     *            </p>
     * @see DnsNameState
     */
    public void setState(DnsNameState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The verification state of the VPC endpoint service.
     * </p>
     * <p>
     * &gt;Consumers of the endpoint service can use the private name only when
     * the state is <code>verified</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pendingVerification, verified, failed
     *
     * @param state <p>
     *            The verification state of the VPC endpoint service.
     *            </p>
     *            <p>
     *            &gt;Consumers of the endpoint service can use the private name
     *            only when the state is <code>verified</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DnsNameState
     */
    public PrivateDnsNameConfiguration withState(DnsNameState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint service verification type, for example TXT.
     * </p>
     *
     * @return <p>
     *         The endpoint service verification type, for example TXT.
     *         </p>
     */
    public String getType() {
        return type;
    }

    /**
     * <p>
     * The endpoint service verification type, for example TXT.
     * </p>
     *
     * @param type <p>
     *            The endpoint service verification type, for example TXT.
     *            </p>
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The endpoint service verification type, for example TXT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param type <p>
     *            The endpoint service verification type, for example TXT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrivateDnsNameConfiguration withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * <p>
     * The value the service provider adds to the private DNS name domain record
     * before verification.
     * </p>
     *
     * @return <p>
     *         The value the service provider adds to the private DNS name
     *         domain record before verification.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The value the service provider adds to the private DNS name domain record
     * before verification.
     * </p>
     *
     * @param value <p>
     *            The value the service provider adds to the private DNS name
     *            domain record before verification.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value the service provider adds to the private DNS name domain record
     * before verification.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The value the service provider adds to the private DNS name
     *            domain record before verification.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrivateDnsNameConfiguration withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * <p>
     * The name of the record subdomain the service provider needs to create.
     * The service provider adds the <code>value</code> text to the
     * <code>name</code>.
     * </p>
     *
     * @return <p>
     *         The name of the record subdomain the service provider needs to
     *         create. The service provider adds the <code>value</code> text to
     *         the <code>name</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the record subdomain the service provider needs to create.
     * The service provider adds the <code>value</code> text to the
     * <code>name</code>.
     * </p>
     *
     * @param name <p>
     *            The name of the record subdomain the service provider needs to
     *            create. The service provider adds the <code>value</code> text
     *            to the <code>name</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the record subdomain the service provider needs to create.
     * The service provider adds the <code>value</code> text to the
     * <code>name</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the record subdomain the service provider needs to
     *            create. The service provider adds the <code>value</code> text
     *            to the <code>name</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrivateDnsNameConfiguration withName(String name) {
        this.name = name;
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrivateDnsNameConfiguration == false)
            return false;
        PrivateDnsNameConfiguration other = (PrivateDnsNameConfiguration) obj;

        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
