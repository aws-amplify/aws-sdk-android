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

public class CreateNatGatewayResult implements Serializable {
    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the
     * request. Only returned if a client token was provided in the request.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * Information about the NAT gateway.
     * </p>
     */
    private NatGateway natGateway;

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the
     * request. Only returned if a client token was provided in the request.
     * </p>
     *
     * @return <p>
     *         Unique, case-sensitive identifier to ensure the idempotency of
     *         the request. Only returned if a client token was provided in the
     *         request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the
     * request. Only returned if a client token was provided in the request.
     * </p>
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier to ensure the idempotency of
     *            the request. Only returned if a client token was provided in
     *            the request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier to ensure the idempotency of the
     * request. Only returned if a client token was provided in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientToken <p>
     *            Unique, case-sensitive identifier to ensure the idempotency of
     *            the request. Only returned if a client token was provided in
     *            the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNatGatewayResult withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * Information about the NAT gateway.
     * </p>
     *
     * @return <p>
     *         Information about the NAT gateway.
     *         </p>
     */
    public NatGateway getNatGateway() {
        return natGateway;
    }

    /**
     * <p>
     * Information about the NAT gateway.
     * </p>
     *
     * @param natGateway <p>
     *            Information about the NAT gateway.
     *            </p>
     */
    public void setNatGateway(NatGateway natGateway) {
        this.natGateway = natGateway;
    }

    /**
     * <p>
     * Information about the NAT gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param natGateway <p>
     *            Information about the NAT gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNatGatewayResult withNatGateway(NatGateway natGateway) {
        this.natGateway = natGateway;
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getNatGateway() != null)
            sb.append("NatGateway: " + getNatGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getNatGateway() == null) ? 0 : getNatGateway().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNatGatewayResult == false)
            return false;
        CreateNatGatewayResult other = (CreateNatGatewayResult) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getNatGateway() == null ^ this.getNatGateway() == null)
            return false;
        if (other.getNatGateway() != null
                && other.getNatGateway().equals(this.getNatGateway()) == false)
            return false;
        return true;
    }
}
