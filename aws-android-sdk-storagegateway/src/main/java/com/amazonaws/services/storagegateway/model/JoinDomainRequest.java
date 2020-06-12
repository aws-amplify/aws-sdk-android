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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds a file gateway to an Active Directory domain. This operation is only
 * supported for file gateways that support the SMB file protocol.
 * </p>
 */
public class JoinDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <code>ListGateways</code> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * The name of the domain that you want the gateway to join.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([a-z0-9]+(-[a-z0-9]+)*\.)+[a-z]{2,}$<br/>
     */
    private String domainName;

    /**
     * <p>
     * The organizational unit (OU) is a container in an Active Directory that
     * can hold users, groups, computers, and other OUs and this parameter
     * specifies the OU that the gateway will join within the AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String organizationalUnit;

    /**
     * <p>
     * List of IPv4 addresses, NetBIOS names, or host names of your domain
     * server. If you need to specify the port number include it after the colon
     * (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * </p>
     */
    private java.util.List<String> domainControllers;

    /**
     * <p>
     * Specifies the time in seconds, in which the <code>JoinDomain</code>
     * operation must complete. The default is 20 seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     */
    private Integer timeoutInSeconds;

    /**
     * <p>
     * Sets the user name of user who has permission to add the gateway to the
     * Active Directory domain. The domain user account should be enabled to
     * join computers to the domain. For example, you can use the domain
     * administrator account or an account with delegated permissions to join
     * computers to the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^\w[\w\.\- ]*$<br/>
     */
    private String userName;

    /**
     * <p>
     * Sets the password of the user who has permission to add the gateway to
     * the Active Directory domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[ -~]+$<br/>
     */
    private String password;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <code>ListGateways</code> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <code>ListGateways</code> operation to return a list of gateways
     *         for your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <code>ListGateways</code> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <code>ListGateways</code> operation to return a list of
     *            gateways for your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <code>ListGateways</code> operation to return a list of gateways for your
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
     *            <code>ListGateways</code> operation to return a list of
     *            gateways for your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinDomainRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The name of the domain that you want the gateway to join.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([a-z0-9]+(-[a-z0-9]+)*\.)+[a-z]{2,}$<br/>
     *
     * @return <p>
     *         The name of the domain that you want the gateway to join.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that you want the gateway to join.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^([a-z0-9]+(-[a-z0-9]+)*\.)+[a-z]{2,}$<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want the gateway to join.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want the gateway to join.
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
     *            The name of the domain that you want the gateway to join.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinDomainRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The organizational unit (OU) is a container in an Active Directory that
     * can hold users, groups, computers, and other OUs and this parameter
     * specifies the OU that the gateway will join within the AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The organizational unit (OU) is a container in an Active
     *         Directory that can hold users, groups, computers, and other OUs
     *         and this parameter specifies the OU that the gateway will join
     *         within the AD domain.
     *         </p>
     */
    public String getOrganizationalUnit() {
        return organizationalUnit;
    }

    /**
     * <p>
     * The organizational unit (OU) is a container in an Active Directory that
     * can hold users, groups, computers, and other OUs and this parameter
     * specifies the OU that the gateway will join within the AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param organizationalUnit <p>
     *            The organizational unit (OU) is a container in an Active
     *            Directory that can hold users, groups, computers, and other
     *            OUs and this parameter specifies the OU that the gateway will
     *            join within the AD domain.
     *            </p>
     */
    public void setOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
    }

    /**
     * <p>
     * The organizational unit (OU) is a container in an Active Directory that
     * can hold users, groups, computers, and other OUs and this parameter
     * specifies the OU that the gateway will join within the AD domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param organizationalUnit <p>
     *            The organizational unit (OU) is a container in an Active
     *            Directory that can hold users, groups, computers, and other
     *            OUs and this parameter specifies the OU that the gateway will
     *            join within the AD domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinDomainRequest withOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }

    /**
     * <p>
     * List of IPv4 addresses, NetBIOS names, or host names of your domain
     * server. If you need to specify the port number include it after the colon
     * (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * </p>
     *
     * @return <p>
     *         List of IPv4 addresses, NetBIOS names, or host names of your
     *         domain server. If you need to specify the port number include it
     *         after the colon (“:”). For example,
     *         <code>mydc.mydomain.com:389</code>.
     *         </p>
     */
    public java.util.List<String> getDomainControllers() {
        return domainControllers;
    }

    /**
     * <p>
     * List of IPv4 addresses, NetBIOS names, or host names of your domain
     * server. If you need to specify the port number include it after the colon
     * (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * </p>
     *
     * @param domainControllers <p>
     *            List of IPv4 addresses, NetBIOS names, or host names of your
     *            domain server. If you need to specify the port number include
     *            it after the colon (“:”). For example,
     *            <code>mydc.mydomain.com:389</code>.
     *            </p>
     */
    public void setDomainControllers(java.util.Collection<String> domainControllers) {
        if (domainControllers == null) {
            this.domainControllers = null;
            return;
        }

        this.domainControllers = new java.util.ArrayList<String>(domainControllers);
    }

    /**
     * <p>
     * List of IPv4 addresses, NetBIOS names, or host names of your domain
     * server. If you need to specify the port number include it after the colon
     * (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainControllers <p>
     *            List of IPv4 addresses, NetBIOS names, or host names of your
     *            domain server. If you need to specify the port number include
     *            it after the colon (“:”). For example,
     *            <code>mydc.mydomain.com:389</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinDomainRequest withDomainControllers(String... domainControllers) {
        if (getDomainControllers() == null) {
            this.domainControllers = new java.util.ArrayList<String>(domainControllers.length);
        }
        for (String value : domainControllers) {
            this.domainControllers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * List of IPv4 addresses, NetBIOS names, or host names of your domain
     * server. If you need to specify the port number include it after the colon
     * (“:”). For example, <code>mydc.mydomain.com:389</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainControllers <p>
     *            List of IPv4 addresses, NetBIOS names, or host names of your
     *            domain server. If you need to specify the port number include
     *            it after the colon (“:”). For example,
     *            <code>mydc.mydomain.com:389</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinDomainRequest withDomainControllers(java.util.Collection<String> domainControllers) {
        setDomainControllers(domainControllers);
        return this;
    }

    /**
     * <p>
     * Specifies the time in seconds, in which the <code>JoinDomain</code>
     * operation must complete. The default is 20 seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     *
     * @return <p>
     *         Specifies the time in seconds, in which the
     *         <code>JoinDomain</code> operation must complete. The default is
     *         20 seconds.
     *         </p>
     */
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * <p>
     * Specifies the time in seconds, in which the <code>JoinDomain</code>
     * operation must complete. The default is 20 seconds.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     *
     * @param timeoutInSeconds <p>
     *            Specifies the time in seconds, in which the
     *            <code>JoinDomain</code> operation must complete. The default
     *            is 20 seconds.
     *            </p>
     */
    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * Specifies the time in seconds, in which the <code>JoinDomain</code>
     * operation must complete. The default is 20 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3600<br/>
     *
     * @param timeoutInSeconds <p>
     *            Specifies the time in seconds, in which the
     *            <code>JoinDomain</code> operation must complete. The default
     *            is 20 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinDomainRequest withTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }

    /**
     * <p>
     * Sets the user name of user who has permission to add the gateway to the
     * Active Directory domain. The domain user account should be enabled to
     * join computers to the domain. For example, you can use the domain
     * administrator account or an account with delegated permissions to join
     * computers to the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^\w[\w\.\- ]*$<br/>
     *
     * @return <p>
     *         Sets the user name of user who has permission to add the gateway
     *         to the Active Directory domain. The domain user account should be
     *         enabled to join computers to the domain. For example, you can use
     *         the domain administrator account or an account with delegated
     *         permissions to join computers to the domain.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * Sets the user name of user who has permission to add the gateway to the
     * Active Directory domain. The domain user account should be enabled to
     * join computers to the domain. For example, you can use the domain
     * administrator account or an account with delegated permissions to join
     * computers to the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^\w[\w\.\- ]*$<br/>
     *
     * @param userName <p>
     *            Sets the user name of user who has permission to add the
     *            gateway to the Active Directory domain. The domain user
     *            account should be enabled to join computers to the domain. For
     *            example, you can use the domain administrator account or an
     *            account with delegated permissions to join computers to the
     *            domain.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * Sets the user name of user who has permission to add the gateway to the
     * Active Directory domain. The domain user account should be enabled to
     * join computers to the domain. For example, you can use the domain
     * administrator account or an account with delegated permissions to join
     * computers to the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^\w[\w\.\- ]*$<br/>
     *
     * @param userName <p>
     *            Sets the user name of user who has permission to add the
     *            gateway to the Active Directory domain. The domain user
     *            account should be enabled to join computers to the domain. For
     *            example, you can use the domain administrator account or an
     *            account with delegated permissions to join computers to the
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinDomainRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * Sets the password of the user who has permission to add the gateway to
     * the Active Directory domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[ -~]+$<br/>
     *
     * @return <p>
     *         Sets the password of the user who has permission to add the
     *         gateway to the Active Directory domain.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * Sets the password of the user who has permission to add the gateway to
     * the Active Directory domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[ -~]+$<br/>
     *
     * @param password <p>
     *            Sets the password of the user who has permission to add the
     *            gateway to the Active Directory domain.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * Sets the password of the user who has permission to add the gateway to
     * the Active Directory domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>^[ -~]+$<br/>
     *
     * @param password <p>
     *            Sets the password of the user who has permission to add the
     *            gateway to the Active Directory domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public JoinDomainRequest withPassword(String password) {
        this.password = password;
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
        if (getOrganizationalUnit() != null)
            sb.append("OrganizationalUnit: " + getOrganizationalUnit() + ",");
        if (getDomainControllers() != null)
            sb.append("DomainControllers: " + getDomainControllers() + ",");
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: " + getTimeoutInSeconds() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getOrganizationalUnit() == null) ? 0 : getOrganizationalUnit().hashCode());
        hashCode = prime * hashCode
                + ((getDomainControllers() == null) ? 0 : getDomainControllers().hashCode());
        hashCode = prime * hashCode
                + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JoinDomainRequest == false)
            return false;
        JoinDomainRequest other = (JoinDomainRequest) obj;

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
        if (other.getOrganizationalUnit() == null ^ this.getOrganizationalUnit() == null)
            return false;
        if (other.getOrganizationalUnit() != null
                && other.getOrganizationalUnit().equals(this.getOrganizationalUnit()) == false)
            return false;
        if (other.getDomainControllers() == null ^ this.getDomainControllers() == null)
            return false;
        if (other.getDomainControllers() != null
                && other.getDomainControllers().equals(this.getDomainControllers()) == false)
            return false;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null
                && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }
}
