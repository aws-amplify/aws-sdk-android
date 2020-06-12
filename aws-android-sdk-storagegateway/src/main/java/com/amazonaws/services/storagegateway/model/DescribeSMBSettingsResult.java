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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

public class DescribeSMBSettingsResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * The name of the domain that the gateway is joined to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([a-z0-9]+(-[a-z0-9]+)*\.)+[a-z]{2,}$<br/>
     */
    private String domainName;

    /**
     * <p>
     * Indicates the status of a gateway that is a member of the Active
     * Directory domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETACHED</code>: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINED</code>: Indicates that the gateway has successfully joined a
     * domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINING</code>: Indicates that a <code>JoinDomain</code> operation
     * is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERROR</code>: Indicates that <code>JoinDomain</code>
     * operation failed due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMEOUT</code>: Indicates that the <code>JoinDomain</code>
     * operation failed because the operation didn't complete within the
     * allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN_ERROR</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to another type of error.
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
     * This value is <code>true</code> if a password for the guest user
     * <code>smbguest</code> is set, otherwise <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean sMBGuestPasswordSet;

    /**
     * <p>
     * The type of security strategy that was specified for file gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ClientSpecified</code>: If you use this option, requests are
     * established based on what is negotiated by the client. This option is
     * recommended when you want to maximize compatibility across different
     * clients in your environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatorySigning</code>: If you use this option, file gateway only
     * allows connections from SMBv2 or SMBv3 clients that have signing enabled.
     * This option works with SMB clients on Microsoft Windows Vista, Windows
     * Server 2008 or newer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatoryEncryption</code>: If you use this option, file gateway
     * only allows connections from SMBv3 clients that have encryption enabled.
     * This option is highly recommended for environments that handle sensitive
     * data. This option works with SMB clients on Microsoft Windows 8, Windows
     * Server 2012 or newer.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     */
    private String sMBSecurityStrategy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSMBSettingsResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The name of the domain that the gateway is joined to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([a-z0-9]+(-[a-z0-9]+)*\.)+[a-z]{2,}$<br/>
     *
     * @return <p>
     *         The name of the domain that the gateway is joined to.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that the gateway is joined to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([a-z0-9]+(-[a-z0-9]+)*\.)+[a-z]{2,}$<br/>
     *
     * @param domainName <p>
     *            The name of the domain that the gateway is joined to.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that the gateway is joined to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([a-z0-9]+(-[a-z0-9]+)*\.)+[a-z]{2,}$<br/>
     *
     * @param domainName <p>
     *            The name of the domain that the gateway is joined to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSMBSettingsResult withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * Indicates the status of a gateway that is a member of the Active
     * Directory domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETACHED</code>: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINED</code>: Indicates that the gateway has successfully joined a
     * domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINING</code>: Indicates that a <code>JoinDomain</code> operation
     * is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERROR</code>: Indicates that <code>JoinDomain</code>
     * operation failed due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMEOUT</code>: Indicates that the <code>JoinDomain</code>
     * operation failed because the operation didn't complete within the
     * allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN_ERROR</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, DETACHED, JOINED, JOINING,
     * NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR
     *
     * @return <p>
     *         Indicates the status of a gateway that is a member of the Active
     *         Directory domain.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACCESS_DENIED</code>: Indicates that the
     *         <code>JoinDomain</code> operation failed due to an authentication
     *         error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DETACHED</code>: Indicates that gateway is not joined to a
     *         domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JOINED</code>: Indicates that the gateway has successfully
     *         joined a domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JOINING</code>: Indicates that a <code>JoinDomain</code>
     *         operation is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NETWORK_ERROR</code>: Indicates that
     *         <code>JoinDomain</code> operation failed due to a network or
     *         connectivity error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TIMEOUT</code>: Indicates that the <code>JoinDomain</code>
     *         operation failed because the operation didn't complete within the
     *         allotted time.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNKNOWN_ERROR</code>: Indicates that the
     *         <code>JoinDomain</code> operation failed due to another type of
     *         error.
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
     * Indicates the status of a gateway that is a member of the Active
     * Directory domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETACHED</code>: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINED</code>: Indicates that the gateway has successfully joined a
     * domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINING</code>: Indicates that a <code>JoinDomain</code> operation
     * is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERROR</code>: Indicates that <code>JoinDomain</code>
     * operation failed due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMEOUT</code>: Indicates that the <code>JoinDomain</code>
     * operation failed because the operation didn't complete within the
     * allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN_ERROR</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, DETACHED, JOINED, JOINING,
     * NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR
     *
     * @param activeDirectoryStatus <p>
     *            Indicates the status of a gateway that is a member of the
     *            Active Directory domain.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACCESS_DENIED</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed due to an
     *            authentication error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETACHED</code>: Indicates that gateway is not joined to
     *            a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JOINED</code>: Indicates that the gateway has
     *            successfully joined a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JOINING</code>: Indicates that a <code>JoinDomain</code>
     *            operation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NETWORK_ERROR</code>: Indicates that
     *            <code>JoinDomain</code> operation failed due to a network or
     *            connectivity error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMEOUT</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed because the operation
     *            didn't complete within the allotted time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN_ERROR</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed due to another type
     *            of error.
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
     * Indicates the status of a gateway that is a member of the Active
     * Directory domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETACHED</code>: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINED</code>: Indicates that the gateway has successfully joined a
     * domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINING</code>: Indicates that a <code>JoinDomain</code> operation
     * is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERROR</code>: Indicates that <code>JoinDomain</code>
     * operation failed due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMEOUT</code>: Indicates that the <code>JoinDomain</code>
     * operation failed because the operation didn't complete within the
     * allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN_ERROR</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to another type of error.
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
     *            Indicates the status of a gateway that is a member of the
     *            Active Directory domain.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACCESS_DENIED</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed due to an
     *            authentication error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETACHED</code>: Indicates that gateway is not joined to
     *            a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JOINED</code>: Indicates that the gateway has
     *            successfully joined a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JOINING</code>: Indicates that a <code>JoinDomain</code>
     *            operation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NETWORK_ERROR</code>: Indicates that
     *            <code>JoinDomain</code> operation failed due to a network or
     *            connectivity error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMEOUT</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed because the operation
     *            didn't complete within the allotted time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN_ERROR</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed due to another type
     *            of error.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActiveDirectoryStatus
     */
    public DescribeSMBSettingsResult withActiveDirectoryStatus(String activeDirectoryStatus) {
        this.activeDirectoryStatus = activeDirectoryStatus;
        return this;
    }

    /**
     * <p>
     * Indicates the status of a gateway that is a member of the Active
     * Directory domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETACHED</code>: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINED</code>: Indicates that the gateway has successfully joined a
     * domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINING</code>: Indicates that a <code>JoinDomain</code> operation
     * is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERROR</code>: Indicates that <code>JoinDomain</code>
     * operation failed due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMEOUT</code>: Indicates that the <code>JoinDomain</code>
     * operation failed because the operation didn't complete within the
     * allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN_ERROR</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to another type of error.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ACCESS_DENIED, DETACHED, JOINED, JOINING,
     * NETWORK_ERROR, TIMEOUT, UNKNOWN_ERROR
     *
     * @param activeDirectoryStatus <p>
     *            Indicates the status of a gateway that is a member of the
     *            Active Directory domain.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACCESS_DENIED</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed due to an
     *            authentication error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETACHED</code>: Indicates that gateway is not joined to
     *            a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JOINED</code>: Indicates that the gateway has
     *            successfully joined a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JOINING</code>: Indicates that a <code>JoinDomain</code>
     *            operation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NETWORK_ERROR</code>: Indicates that
     *            <code>JoinDomain</code> operation failed due to a network or
     *            connectivity error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMEOUT</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed because the operation
     *            didn't complete within the allotted time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN_ERROR</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed due to another type
     *            of error.
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
     * Indicates the status of a gateway that is a member of the Active
     * Directory domain.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to an authentication error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DETACHED</code>: Indicates that gateway is not joined to a domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINED</code>: Indicates that the gateway has successfully joined a
     * domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JOINING</code>: Indicates that a <code>JoinDomain</code> operation
     * is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_ERROR</code>: Indicates that <code>JoinDomain</code>
     * operation failed due to a network or connectivity error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMEOUT</code>: Indicates that the <code>JoinDomain</code>
     * operation failed because the operation didn't complete within the
     * allotted time.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNKNOWN_ERROR</code>: Indicates that the <code>JoinDomain</code>
     * operation failed due to another type of error.
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
     *            Indicates the status of a gateway that is a member of the
     *            Active Directory domain.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ACCESS_DENIED</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed due to an
     *            authentication error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DETACHED</code>: Indicates that gateway is not joined to
     *            a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JOINED</code>: Indicates that the gateway has
     *            successfully joined a domain.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>JOINING</code>: Indicates that a <code>JoinDomain</code>
     *            operation is in progress.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NETWORK_ERROR</code>: Indicates that
     *            <code>JoinDomain</code> operation failed due to a network or
     *            connectivity error.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>TIMEOUT</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed because the operation
     *            didn't complete within the allotted time.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>UNKNOWN_ERROR</code>: Indicates that the
     *            <code>JoinDomain</code> operation failed due to another type
     *            of error.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActiveDirectoryStatus
     */
    public DescribeSMBSettingsResult withActiveDirectoryStatus(
            ActiveDirectoryStatus activeDirectoryStatus) {
        this.activeDirectoryStatus = activeDirectoryStatus.toString();
        return this;
    }

    /**
     * <p>
     * This value is <code>true</code> if a password for the guest user
     * <code>smbguest</code> is set, otherwise <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         This value is <code>true</code> if a password for the guest user
     *         <code>smbguest</code> is set, otherwise <code>false</code>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean isSMBGuestPasswordSet() {
        return sMBGuestPasswordSet;
    }

    /**
     * <p>
     * This value is <code>true</code> if a password for the guest user
     * <code>smbguest</code> is set, otherwise <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         This value is <code>true</code> if a password for the guest user
     *         <code>smbguest</code> is set, otherwise <code>false</code>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean getSMBGuestPasswordSet() {
        return sMBGuestPasswordSet;
    }

    /**
     * <p>
     * This value is <code>true</code> if a password for the guest user
     * <code>smbguest</code> is set, otherwise <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @param sMBGuestPasswordSet <p>
     *            This value is <code>true</code> if a password for the guest
     *            user <code>smbguest</code> is set, otherwise
     *            <code>false</code>.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     */
    public void setSMBGuestPasswordSet(Boolean sMBGuestPasswordSet) {
        this.sMBGuestPasswordSet = sMBGuestPasswordSet;
    }

    /**
     * <p>
     * This value is <code>true</code> if a password for the guest user
     * <code>smbguest</code> is set, otherwise <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMBGuestPasswordSet <p>
     *            This value is <code>true</code> if a password for the guest
     *            user <code>smbguest</code> is set, otherwise
     *            <code>false</code>.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeSMBSettingsResult withSMBGuestPasswordSet(Boolean sMBGuestPasswordSet) {
        this.sMBGuestPasswordSet = sMBGuestPasswordSet;
        return this;
    }

    /**
     * <p>
     * The type of security strategy that was specified for file gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ClientSpecified</code>: If you use this option, requests are
     * established based on what is negotiated by the client. This option is
     * recommended when you want to maximize compatibility across different
     * clients in your environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatorySigning</code>: If you use this option, file gateway only
     * allows connections from SMBv2 or SMBv3 clients that have signing enabled.
     * This option works with SMB clients on Microsoft Windows Vista, Windows
     * Server 2008 or newer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatoryEncryption</code>: If you use this option, file gateway
     * only allows connections from SMBv3 clients that have encryption enabled.
     * This option is highly recommended for environments that handle sensitive
     * data. This option works with SMB clients on Microsoft Windows 8, Windows
     * Server 2012 or newer.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     *
     * @return <p>
     *         The type of security strategy that was specified for file
     *         gateway.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ClientSpecified</code>: If you use this option, requests
     *         are established based on what is negotiated by the client. This
     *         option is recommended when you want to maximize compatibility
     *         across different clients in your environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MandatorySigning</code>: If you use this option, file
     *         gateway only allows connections from SMBv2 or SMBv3 clients that
     *         have signing enabled. This option works with SMB clients on
     *         Microsoft Windows Vista, Windows Server 2008 or newer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MandatoryEncryption</code>: If you use this option, file
     *         gateway only allows connections from SMBv3 clients that have
     *         encryption enabled. This option is highly recommended for
     *         environments that handle sensitive data. This option works with
     *         SMB clients on Microsoft Windows 8, Windows Server 2012 or newer.
     *         </p>
     *         </li>
     *         </ul>
     * @see SMBSecurityStrategy
     */
    public String getSMBSecurityStrategy() {
        return sMBSecurityStrategy;
    }

    /**
     * <p>
     * The type of security strategy that was specified for file gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ClientSpecified</code>: If you use this option, requests are
     * established based on what is negotiated by the client. This option is
     * recommended when you want to maximize compatibility across different
     * clients in your environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatorySigning</code>: If you use this option, file gateway only
     * allows connections from SMBv2 or SMBv3 clients that have signing enabled.
     * This option works with SMB clients on Microsoft Windows Vista, Windows
     * Server 2008 or newer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatoryEncryption</code>: If you use this option, file gateway
     * only allows connections from SMBv3 clients that have encryption enabled.
     * This option is highly recommended for environments that handle sensitive
     * data. This option works with SMB clients on Microsoft Windows 8, Windows
     * Server 2012 or newer.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     *
     * @param sMBSecurityStrategy <p>
     *            The type of security strategy that was specified for file
     *            gateway.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ClientSpecified</code>: If you use this option, requests
     *            are established based on what is negotiated by the client.
     *            This option is recommended when you want to maximize
     *            compatibility across different clients in your environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MandatorySigning</code>: If you use this option, file
     *            gateway only allows connections from SMBv2 or SMBv3 clients
     *            that have signing enabled. This option works with SMB clients
     *            on Microsoft Windows Vista, Windows Server 2008 or newer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MandatoryEncryption</code>: If you use this option, file
     *            gateway only allows connections from SMBv3 clients that have
     *            encryption enabled. This option is highly recommended for
     *            environments that handle sensitive data. This option works
     *            with SMB clients on Microsoft Windows 8, Windows Server 2012
     *            or newer.
     *            </p>
     *            </li>
     *            </ul>
     * @see SMBSecurityStrategy
     */
    public void setSMBSecurityStrategy(String sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy;
    }

    /**
     * <p>
     * The type of security strategy that was specified for file gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ClientSpecified</code>: If you use this option, requests are
     * established based on what is negotiated by the client. This option is
     * recommended when you want to maximize compatibility across different
     * clients in your environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatorySigning</code>: If you use this option, file gateway only
     * allows connections from SMBv2 or SMBv3 clients that have signing enabled.
     * This option works with SMB clients on Microsoft Windows Vista, Windows
     * Server 2008 or newer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatoryEncryption</code>: If you use this option, file gateway
     * only allows connections from SMBv3 clients that have encryption enabled.
     * This option is highly recommended for environments that handle sensitive
     * data. This option works with SMB clients on Microsoft Windows 8, Windows
     * Server 2012 or newer.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     *
     * @param sMBSecurityStrategy <p>
     *            The type of security strategy that was specified for file
     *            gateway.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ClientSpecified</code>: If you use this option, requests
     *            are established based on what is negotiated by the client.
     *            This option is recommended when you want to maximize
     *            compatibility across different clients in your environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MandatorySigning</code>: If you use this option, file
     *            gateway only allows connections from SMBv2 or SMBv3 clients
     *            that have signing enabled. This option works with SMB clients
     *            on Microsoft Windows Vista, Windows Server 2008 or newer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MandatoryEncryption</code>: If you use this option, file
     *            gateway only allows connections from SMBv3 clients that have
     *            encryption enabled. This option is highly recommended for
     *            environments that handle sensitive data. This option works
     *            with SMB clients on Microsoft Windows 8, Windows Server 2012
     *            or newer.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SMBSecurityStrategy
     */
    public DescribeSMBSettingsResult withSMBSecurityStrategy(String sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy;
        return this;
    }

    /**
     * <p>
     * The type of security strategy that was specified for file gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ClientSpecified</code>: If you use this option, requests are
     * established based on what is negotiated by the client. This option is
     * recommended when you want to maximize compatibility across different
     * clients in your environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatorySigning</code>: If you use this option, file gateway only
     * allows connections from SMBv2 or SMBv3 clients that have signing enabled.
     * This option works with SMB clients on Microsoft Windows Vista, Windows
     * Server 2008 or newer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatoryEncryption</code>: If you use this option, file gateway
     * only allows connections from SMBv3 clients that have encryption enabled.
     * This option is highly recommended for environments that handle sensitive
     * data. This option works with SMB clients on Microsoft Windows 8, Windows
     * Server 2012 or newer.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     *
     * @param sMBSecurityStrategy <p>
     *            The type of security strategy that was specified for file
     *            gateway.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ClientSpecified</code>: If you use this option, requests
     *            are established based on what is negotiated by the client.
     *            This option is recommended when you want to maximize
     *            compatibility across different clients in your environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MandatorySigning</code>: If you use this option, file
     *            gateway only allows connections from SMBv2 or SMBv3 clients
     *            that have signing enabled. This option works with SMB clients
     *            on Microsoft Windows Vista, Windows Server 2008 or newer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MandatoryEncryption</code>: If you use this option, file
     *            gateway only allows connections from SMBv3 clients that have
     *            encryption enabled. This option is highly recommended for
     *            environments that handle sensitive data. This option works
     *            with SMB clients on Microsoft Windows 8, Windows Server 2012
     *            or newer.
     *            </p>
     *            </li>
     *            </ul>
     * @see SMBSecurityStrategy
     */
    public void setSMBSecurityStrategy(SMBSecurityStrategy sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy.toString();
    }

    /**
     * <p>
     * The type of security strategy that was specified for file gateway.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ClientSpecified</code>: If you use this option, requests are
     * established based on what is negotiated by the client. This option is
     * recommended when you want to maximize compatibility across different
     * clients in your environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatorySigning</code>: If you use this option, file gateway only
     * allows connections from SMBv2 or SMBv3 clients that have signing enabled.
     * This option works with SMB clients on Microsoft Windows Vista, Windows
     * Server 2008 or newer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MandatoryEncryption</code>: If you use this option, file gateway
     * only allows connections from SMBv3 clients that have encryption enabled.
     * This option is highly recommended for environments that handle sensitive
     * data. This option works with SMB clients on Microsoft Windows 8, Windows
     * Server 2012 or newer.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ClientSpecified, MandatorySigning,
     * MandatoryEncryption
     *
     * @param sMBSecurityStrategy <p>
     *            The type of security strategy that was specified for file
     *            gateway.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ClientSpecified</code>: If you use this option, requests
     *            are established based on what is negotiated by the client.
     *            This option is recommended when you want to maximize
     *            compatibility across different clients in your environment.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MandatorySigning</code>: If you use this option, file
     *            gateway only allows connections from SMBv2 or SMBv3 clients
     *            that have signing enabled. This option works with SMB clients
     *            on Microsoft Windows Vista, Windows Server 2008 or newer.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MandatoryEncryption</code>: If you use this option, file
     *            gateway only allows connections from SMBv3 clients that have
     *            encryption enabled. This option is highly recommended for
     *            environments that handle sensitive data. This option works
     *            with SMB clients on Microsoft Windows 8, Windows Server 2012
     *            or newer.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SMBSecurityStrategy
     */
    public DescribeSMBSettingsResult withSMBSecurityStrategy(SMBSecurityStrategy sMBSecurityStrategy) {
        this.sMBSecurityStrategy = sMBSecurityStrategy.toString();
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getActiveDirectoryStatus() != null)
            sb.append("ActiveDirectoryStatus: " + getActiveDirectoryStatus() + ",");
        if (getSMBGuestPasswordSet() != null)
            sb.append("SMBGuestPasswordSet: " + getSMBGuestPasswordSet() + ",");
        if (getSMBSecurityStrategy() != null)
            sb.append("SMBSecurityStrategy: " + getSMBSecurityStrategy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getActiveDirectoryStatus() == null) ? 0 : getActiveDirectoryStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSMBGuestPasswordSet() == null) ? 0 : getSMBGuestPasswordSet().hashCode());
        hashCode = prime * hashCode
                + ((getSMBSecurityStrategy() == null) ? 0 : getSMBSecurityStrategy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSMBSettingsResult == false)
            return false;
        DescribeSMBSettingsResult other = (DescribeSMBSettingsResult) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getActiveDirectoryStatus() == null ^ this.getActiveDirectoryStatus() == null)
            return false;
        if (other.getActiveDirectoryStatus() != null
                && other.getActiveDirectoryStatus().equals(this.getActiveDirectoryStatus()) == false)
            return false;
        if (other.getSMBGuestPasswordSet() == null ^ this.getSMBGuestPasswordSet() == null)
            return false;
        if (other.getSMBGuestPasswordSet() != null
                && other.getSMBGuestPasswordSet().equals(this.getSMBGuestPasswordSet()) == false)
            return false;
        if (other.getSMBSecurityStrategy() == null ^ this.getSMBSecurityStrategy() == null)
            return false;
        if (other.getSMBSecurityStrategy() != null
                && other.getSMBSecurityStrategy().equals(this.getSMBSecurityStrategy()) == false)
            return false;
        return true;
    }
}
