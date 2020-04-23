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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

/**
 * <p>
 * JoinDomainOutput
 * </p>
 */
public class JoinDomainResult implements Serializable {
    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the gateway that joined the
     * domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * Indicates the status of the gateway as a member of the Active Directory
     * domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation
     * failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * DETACHED: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINED: Indicates that the gateway has successfully joined a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINING: Indicates that a <code>JoinDomain</code> operation is in
     * progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed
     * due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed
     * because the operation didn't complete within the allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation
     * failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, DETACHED, JOINED, JOINING,
     * NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR
     */
    private String activeDirectoryStatus;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the gateway that joined the
     * domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The unique Amazon Resource Name (ARN) of the gateway that joined
     *         the domain.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the gateway that joined the
     * domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The unique Amazon Resource Name (ARN) of the gateway that
     *            joined the domain.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the gateway that joined the
     * domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The unique Amazon Resource Name (ARN) of the gateway that
     *            joined the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinDomainResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * Indicates the status of the gateway as a member of the Active Directory
     * domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation
     * failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * DETACHED: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINED: Indicates that the gateway has successfully joined a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINING: Indicates that a <code>JoinDomain</code> operation is in
     * progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed
     * due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed
     * because the operation didn't complete within the allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation
     * failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, DETACHED, JOINED, JOINING,
     * NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR
     *
     * @return <p>
     *         Indicates the status of the gateway as a member of the Active
     *         Directory domain.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         ACCESS_DENIED: Indicates that the <code>JoinDomain</code>
     *         operation failed due to an authentication error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DETACHED: Indicates that gateway is not joined to a domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         JOINED: Indicates that the gateway has successfully joined a
     *         domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         JOINING: Indicates that a <code>JoinDomain</code> operation is in
     *         progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation
     *         failed due to a network or connectivity error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TIMEOUT: Indicates that the <code>JoinDomain</code> operation
     *         failed because the operation didn't complete within the allotted
     *         time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code>
     *         operation failed due to another type of error.
     *         </p>
     *         </li>
     *         </ul>
     * @see ActiveDirectoryStatus
     */
    public String getActiveDirectoryStatus() {
        return activeDirectoryStatus;
    }

    /**
     * <p>
     * Indicates the status of the gateway as a member of the Active Directory
     * domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation
     * failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * DETACHED: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINED: Indicates that the gateway has successfully joined a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINING: Indicates that a <code>JoinDomain</code> operation is in
     * progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed
     * due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed
     * because the operation didn't complete within the allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation
     * failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, DETACHED, JOINED, JOINING,
     * NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR
     *
     * @param activeDirectoryStatus <p>
     *            Indicates the status of the gateway as a member of the Active
     *            Directory domain.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ACCESS_DENIED: Indicates that the <code>JoinDomain</code>
     *            operation failed due to an authentication error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DETACHED: Indicates that gateway is not joined to a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            JOINED: Indicates that the gateway has successfully joined a
     *            domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            JOINING: Indicates that a <code>JoinDomain</code> operation is
     *            in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NETWORK_ERROR: Indicates that <code>JoinDomain</code>
     *            operation failed due to a network or connectivity error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TIMEOUT: Indicates that the <code>JoinDomain</code> operation
     *            failed because the operation didn't complete within the
     *            allotted time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code>
     *            operation failed due to another type of error.
     *            </p>
     *            </li>
     *            </ul>
     * @see ActiveDirectoryStatus
     */
    public void setActiveDirectoryStatus(String activeDirectoryStatus) {
        this.activeDirectoryStatus = activeDirectoryStatus;
    }

    /**
     * <p>
     * Indicates the status of the gateway as a member of the Active Directory
     * domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation
     * failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * DETACHED: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINED: Indicates that the gateway has successfully joined a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINING: Indicates that a <code>JoinDomain</code> operation is in
     * progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed
     * due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed
     * because the operation didn't complete within the allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation
     * failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, DETACHED, JOINED, JOINING,
     * NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR
     *
     * @param activeDirectoryStatus <p>
     *            Indicates the status of the gateway as a member of the Active
     *            Directory domain.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ACCESS_DENIED: Indicates that the <code>JoinDomain</code>
     *            operation failed due to an authentication error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DETACHED: Indicates that gateway is not joined to a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            JOINED: Indicates that the gateway has successfully joined a
     *            domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            JOINING: Indicates that a <code>JoinDomain</code> operation is
     *            in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NETWORK_ERROR: Indicates that <code>JoinDomain</code>
     *            operation failed due to a network or connectivity error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TIMEOUT: Indicates that the <code>JoinDomain</code> operation
     *            failed because the operation didn't complete within the
     *            allotted time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code>
     *            operation failed due to another type of error.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActiveDirectoryStatus
     */
    public JoinDomainResult withActiveDirectoryStatus(String activeDirectoryStatus) {
        this.activeDirectoryStatus = activeDirectoryStatus;
        return this;
    }

    /**
     * <p>
     * Indicates the status of the gateway as a member of the Active Directory
     * domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation
     * failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * DETACHED: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINED: Indicates that the gateway has successfully joined a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINING: Indicates that a <code>JoinDomain</code> operation is in
     * progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed
     * due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed
     * because the operation didn't complete within the allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation
     * failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, DETACHED, JOINED, JOINING,
     * NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR
     *
     * @param activeDirectoryStatus <p>
     *            Indicates the status of the gateway as a member of the Active
     *            Directory domain.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ACCESS_DENIED: Indicates that the <code>JoinDomain</code>
     *            operation failed due to an authentication error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DETACHED: Indicates that gateway is not joined to a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            JOINED: Indicates that the gateway has successfully joined a
     *            domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            JOINING: Indicates that a <code>JoinDomain</code> operation is
     *            in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NETWORK_ERROR: Indicates that <code>JoinDomain</code>
     *            operation failed due to a network or connectivity error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TIMEOUT: Indicates that the <code>JoinDomain</code> operation
     *            failed because the operation didn't complete within the
     *            allotted time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code>
     *            operation failed due to another type of error.
     *            </p>
     *            </li>
     *            </ul>
     * @see ActiveDirectoryStatus
     */
    public void setActiveDirectoryStatus(ActiveDirectoryStatus activeDirectoryStatus) {
        this.activeDirectoryStatus = activeDirectoryStatus.toString();
    }

    /**
     * <p>
     * Indicates the status of the gateway as a member of the Active Directory
     * domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ACCESS_DENIED: Indicates that the <code>JoinDomain</code> operation
     * failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * DETACHED: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINED: Indicates that the gateway has successfully joined a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * JOINING: Indicates that a <code>JoinDomain</code> operation is in
     * progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * NETWORK_ERROR: Indicates that <code>JoinDomain</code> operation failed
     * due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * TIMEOUT: Indicates that the <code>JoinDomain</code> operation failed
     * because the operation didn't complete within the allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code> operation
     * failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, DETACHED, JOINED, JOINING,
     * NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR
     *
     * @param activeDirectoryStatus <p>
     *            Indicates the status of the gateway as a member of the Active
     *            Directory domain.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            ACCESS_DENIED: Indicates that the <code>JoinDomain</code>
     *            operation failed due to an authentication error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            DETACHED: Indicates that gateway is not joined to a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            JOINED: Indicates that the gateway has successfully joined a
     *            domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            JOINING: Indicates that a <code>JoinDomain</code> operation is
     *            in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            NETWORK_ERROR: Indicates that <code>JoinDomain</code>
     *            operation failed due to a network or connectivity error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            TIMEOUT: Indicates that the <code>JoinDomain</code> operation
     *            failed because the operation didn't complete within the
     *            allotted time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UNKNOWN_ERROR: Indicates that the <code>JoinDomain</code>
     *            operation failed due to another type of error.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActiveDirectoryStatus
     */
    public JoinDomainResult withActiveDirectoryStatus(ActiveDirectoryStatus activeDirectoryStatus) {
        this.activeDirectoryStatus = activeDirectoryStatus.toString();
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getActiveDirectoryStatus() != null)
            sb.append("ActiveDirectoryStatus: " + getActiveDirectoryStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getActiveDirectoryStatus() == null) ? 0 : getActiveDirectoryStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JoinDomainResult == false)
            return false;
        JoinDomainResult other = (JoinDomainResult) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getActiveDirectoryStatus() == null ^ this.getActiveDirectoryStatus() == null)
            return false;
        if (other.getActiveDirectoryStatus() != null
                && other.getActiveDirectoryStatus().equals(this.getActiveDirectoryStatus()) == false)
            return false;
        return true;
    }
}
