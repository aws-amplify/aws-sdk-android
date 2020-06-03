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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a Direct Connect gateway, which is an intermediate object that
 * enables you to connect a set of virtual interfaces and virtual private
 * gateways. A Direct Connect gateway is global and visible in any AWS Region
 * after it is created. The virtual interfaces and virtual private gateways that
 * are connected through a Direct Connect gateway can be in different AWS
 * Regions. This enables you to connect to a VPC in any Region, regardless of
 * the Region in which the virtual interfaces are located, and pass traffic
 * between them.
 * </p>
 */
public class CreateDirectConnectGatewayRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayName;

    /**
     * <p>
     * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to
     * be configured on the Amazon side of the connection. The ASN must be in
     * the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
     * The default is 64512.
     * </p>
     */
    private Long amazonSideAsn;

    /**
     * <p>
     * The name of the Direct Connect gateway.
     * </p>
     *
     * @return <p>
     *         The name of the Direct Connect gateway.
     *         </p>
     */
    public String getDirectConnectGatewayName() {
        return directConnectGatewayName;
    }

    /**
     * <p>
     * The name of the Direct Connect gateway.
     * </p>
     *
     * @param directConnectGatewayName <p>
     *            The name of the Direct Connect gateway.
     *            </p>
     */
    public void setDirectConnectGatewayName(String directConnectGatewayName) {
        this.directConnectGatewayName = directConnectGatewayName;
    }

    /**
     * <p>
     * The name of the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayName <p>
     *            The name of the Direct Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayRequest withDirectConnectGatewayName(
            String directConnectGatewayName) {
        this.directConnectGatewayName = directConnectGatewayName;
        return this;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to
     * be configured on the Amazon side of the connection. The ASN must be in
     * the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
     * The default is 64512.
     * </p>
     *
     * @return <p>
     *         The autonomous system number (ASN) for Border Gateway Protocol
     *         (BGP) to be configured on the Amazon side of the connection. The
     *         ASN must be in the private range of 64,512 to 65,534 or
     *         4,200,000,000 to 4,294,967,294. The default is 64512.
     *         </p>
     */
    public Long getAmazonSideAsn() {
        return amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to
     * be configured on the Amazon side of the connection. The ASN must be in
     * the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
     * The default is 64512.
     * </p>
     *
     * @param amazonSideAsn <p>
     *            The autonomous system number (ASN) for Border Gateway Protocol
     *            (BGP) to be configured on the Amazon side of the connection.
     *            The ASN must be in the private range of 64,512 to 65,534 or
     *            4,200,000,000 to 4,294,967,294. The default is 64512.
     *            </p>
     */
    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for Border Gateway Protocol (BGP) to
     * be configured on the Amazon side of the connection. The ASN must be in
     * the private range of 64,512 to 65,534 or 4,200,000,000 to 4,294,967,294.
     * The default is 64512.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amazonSideAsn <p>
     *            The autonomous system number (ASN) for Border Gateway Protocol
     *            (BGP) to be configured on the Amazon side of the connection.
     *            The ASN must be in the private range of 64,512 to 65,534 or
     *            4,200,000,000 to 4,294,967,294. The default is 64512.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDirectConnectGatewayRequest withAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
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
        if (getDirectConnectGatewayName() != null)
            sb.append("directConnectGatewayName: " + getDirectConnectGatewayName() + ",");
        if (getAmazonSideAsn() != null)
            sb.append("amazonSideAsn: " + getAmazonSideAsn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayName() == null) ? 0 : getDirectConnectGatewayName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDirectConnectGatewayRequest == false)
            return false;
        CreateDirectConnectGatewayRequest other = (CreateDirectConnectGatewayRequest) obj;

        if (other.getDirectConnectGatewayName() == null
                ^ this.getDirectConnectGatewayName() == null)
            return false;
        if (other.getDirectConnectGatewayName() != null
                && other.getDirectConnectGatewayName().equals(this.getDirectConnectGatewayName()) == false)
            return false;
        if (other.getAmazonSideAsn() == null ^ this.getAmazonSideAsn() == null)
            return false;
        if (other.getAmazonSideAsn() != null
                && other.getAmazonSideAsn().equals(this.getAmazonSideAsn()) == false)
            return false;
        return true;
    }
}
