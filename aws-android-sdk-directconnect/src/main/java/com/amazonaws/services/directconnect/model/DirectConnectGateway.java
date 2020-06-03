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

/**
 * <p>
 * Information about a Direct Connect gateway, which enables you to connect
 * virtual interfaces and virtual private gateway or transit gateways.
 * </p>
 */
public class DirectConnectGateway implements Serializable {
    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayId;

    /**
     * <p>
     * The name of the Direct Connect gateway.
     * </p>
     */
    private String directConnectGatewayName;

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     */
    private Long amazonSideAsn;

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     */
    private String ownerAccount;

    /**
     * <p>
     * The state of the Direct Connect gateway. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The initial state after calling
     * <a>CreateDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The Direct Connect gateway is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The initial state after calling
     * <a>DeleteDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The Direct Connect gateway is deleted and cannot
     * pass traffic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     */
    private String directConnectGatewayState;

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     */
    private String stateChangeError;

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the Direct Connect gateway.
     *         </p>
     */
    public String getDirectConnectGatewayId() {
        return directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     *
     * @param directConnectGatewayId <p>
     *            The ID of the Direct Connect gateway.
     *            </p>
     */
    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directConnectGatewayId <p>
     *            The ID of the Direct Connect gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGateway withDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
        return this;
    }

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
    public DirectConnectGateway withDirectConnectGatewayName(String directConnectGatewayName) {
        this.directConnectGatewayName = directConnectGatewayName;
        return this;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     *
     * @return <p>
     *         The autonomous system number (ASN) for the Amazon side of the
     *         connection.
     *         </p>
     */
    public Long getAmazonSideAsn() {
        return amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     *
     * @param amazonSideAsn <p>
     *            The autonomous system number (ASN) for the Amazon side of the
     *            connection.
     *            </p>
     */
    public void setAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
    }

    /**
     * <p>
     * The autonomous system number (ASN) for the Amazon side of the connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amazonSideAsn <p>
     *            The autonomous system number (ASN) for the Amazon side of the
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGateway withAmazonSideAsn(Long amazonSideAsn) {
        this.amazonSideAsn = amazonSideAsn;
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the AWS account that owns the Direct Connect gateway.
     *         </p>
     */
    public String getOwnerAccount() {
        return ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the Direct Connect
     *            gateway.
     *            </p>
     */
    public void setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the Direct Connect gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerAccount <p>
     *            The ID of the AWS account that owns the Direct Connect
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGateway withOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }

    /**
     * <p>
     * The state of the Direct Connect gateway. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The initial state after calling
     * <a>CreateDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The Direct Connect gateway is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The initial state after calling
     * <a>DeleteDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The Direct Connect gateway is deleted and cannot
     * pass traffic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @return <p>
     *         The state of the Direct Connect gateway. The following are the
     *         possible values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>pending</code>: The initial state after calling
     *         <a>CreateDirectConnectGateway</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The Direct Connect gateway is ready for
     *         use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The initial state after calling
     *         <a>DeleteDirectConnectGateway</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The Direct Connect gateway is deleted and
     *         cannot pass traffic.
     *         </p>
     *         </li>
     *         </ul>
     * @see DirectConnectGatewayState
     */
    public String getDirectConnectGatewayState() {
        return directConnectGatewayState;
    }

    /**
     * <p>
     * The state of the Direct Connect gateway. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The initial state after calling
     * <a>CreateDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The Direct Connect gateway is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The initial state after calling
     * <a>DeleteDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The Direct Connect gateway is deleted and cannot
     * pass traffic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param directConnectGatewayState <p>
     *            The state of the Direct Connect gateway. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>pending</code>: The initial state after calling
     *            <a>CreateDirectConnectGateway</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The Direct Connect gateway is ready
     *            for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The initial state after calling
     *            <a>DeleteDirectConnectGateway</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The Direct Connect gateway is deleted
     *            and cannot pass traffic.
     *            </p>
     *            </li>
     *            </ul>
     * @see DirectConnectGatewayState
     */
    public void setDirectConnectGatewayState(String directConnectGatewayState) {
        this.directConnectGatewayState = directConnectGatewayState;
    }

    /**
     * <p>
     * The state of the Direct Connect gateway. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The initial state after calling
     * <a>CreateDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The Direct Connect gateway is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The initial state after calling
     * <a>DeleteDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The Direct Connect gateway is deleted and cannot
     * pass traffic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param directConnectGatewayState <p>
     *            The state of the Direct Connect gateway. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>pending</code>: The initial state after calling
     *            <a>CreateDirectConnectGateway</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The Direct Connect gateway is ready
     *            for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The initial state after calling
     *            <a>DeleteDirectConnectGateway</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The Direct Connect gateway is deleted
     *            and cannot pass traffic.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectConnectGatewayState
     */
    public DirectConnectGateway withDirectConnectGatewayState(String directConnectGatewayState) {
        this.directConnectGatewayState = directConnectGatewayState;
        return this;
    }

    /**
     * <p>
     * The state of the Direct Connect gateway. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The initial state after calling
     * <a>CreateDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The Direct Connect gateway is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The initial state after calling
     * <a>DeleteDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The Direct Connect gateway is deleted and cannot
     * pass traffic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param directConnectGatewayState <p>
     *            The state of the Direct Connect gateway. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>pending</code>: The initial state after calling
     *            <a>CreateDirectConnectGateway</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The Direct Connect gateway is ready
     *            for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The initial state after calling
     *            <a>DeleteDirectConnectGateway</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The Direct Connect gateway is deleted
     *            and cannot pass traffic.
     *            </p>
     *            </li>
     *            </ul>
     * @see DirectConnectGatewayState
     */
    public void setDirectConnectGatewayState(DirectConnectGatewayState directConnectGatewayState) {
        this.directConnectGatewayState = directConnectGatewayState.toString();
    }

    /**
     * <p>
     * The state of the Direct Connect gateway. The following are the possible
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>pending</code>: The initial state after calling
     * <a>CreateDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The Direct Connect gateway is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The initial state after calling
     * <a>DeleteDirectConnectGateway</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The Direct Connect gateway is deleted and cannot
     * pass traffic.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>pending, available, deleting, deleted
     *
     * @param directConnectGatewayState <p>
     *            The state of the Direct Connect gateway. The following are the
     *            possible values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>pending</code>: The initial state after calling
     *            <a>CreateDirectConnectGateway</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>available</code>: The Direct Connect gateway is ready
     *            for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleting</code>: The initial state after calling
     *            <a>DeleteDirectConnectGateway</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>deleted</code>: The Direct Connect gateway is deleted
     *            and cannot pass traffic.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DirectConnectGatewayState
     */
    public DirectConnectGateway withDirectConnectGatewayState(
            DirectConnectGatewayState directConnectGatewayState) {
        this.directConnectGatewayState = directConnectGatewayState.toString();
        return this;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     *
     * @return <p>
     *         The error message if the state of an object failed to advance.
     *         </p>
     */
    public String getStateChangeError() {
        return stateChangeError;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     *
     * @param stateChangeError <p>
     *            The error message if the state of an object failed to advance.
     *            </p>
     */
    public void setStateChangeError(String stateChangeError) {
        this.stateChangeError = stateChangeError;
    }

    /**
     * <p>
     * The error message if the state of an object failed to advance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stateChangeError <p>
     *            The error message if the state of an object failed to advance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DirectConnectGateway withStateChangeError(String stateChangeError) {
        this.stateChangeError = stateChangeError;
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
        if (getDirectConnectGatewayId() != null)
            sb.append("directConnectGatewayId: " + getDirectConnectGatewayId() + ",");
        if (getDirectConnectGatewayName() != null)
            sb.append("directConnectGatewayName: " + getDirectConnectGatewayName() + ",");
        if (getAmazonSideAsn() != null)
            sb.append("amazonSideAsn: " + getAmazonSideAsn() + ",");
        if (getOwnerAccount() != null)
            sb.append("ownerAccount: " + getOwnerAccount() + ",");
        if (getDirectConnectGatewayState() != null)
            sb.append("directConnectGatewayState: " + getDirectConnectGatewayState() + ",");
        if (getStateChangeError() != null)
            sb.append("stateChangeError: " + getStateChangeError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayName() == null) ? 0 : getDirectConnectGatewayName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAmazonSideAsn() == null) ? 0 : getAmazonSideAsn().hashCode());
        hashCode = prime * hashCode
                + ((getOwnerAccount() == null) ? 0 : getOwnerAccount().hashCode());
        hashCode = prime
                * hashCode
                + ((getDirectConnectGatewayState() == null) ? 0 : getDirectConnectGatewayState()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStateChangeError() == null) ? 0 : getStateChangeError().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DirectConnectGateway == false)
            return false;
        DirectConnectGateway other = (DirectConnectGateway) obj;

        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null
                && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
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
        if (other.getOwnerAccount() == null ^ this.getOwnerAccount() == null)
            return false;
        if (other.getOwnerAccount() != null
                && other.getOwnerAccount().equals(this.getOwnerAccount()) == false)
            return false;
        if (other.getDirectConnectGatewayState() == null
                ^ this.getDirectConnectGatewayState() == null)
            return false;
        if (other.getDirectConnectGatewayState() != null
                && other.getDirectConnectGatewayState().equals(this.getDirectConnectGatewayState()) == false)
            return false;
        if (other.getStateChangeError() == null ^ this.getStateChangeError() == null)
            return false;
        if (other.getStateChangeError() != null
                && other.getStateChangeError().equals(this.getStateChangeError()) == false)
            return false;
        return true;
    }
}
