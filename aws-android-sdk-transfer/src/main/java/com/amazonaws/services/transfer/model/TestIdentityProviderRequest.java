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

package com.amazonaws.services.transfer.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * If the <code>IdentityProviderType</code> of a file transfer protocol-enabled
 * server is <code>API_Gateway</code>, tests whether your API Gateway is set up
 * successfully. We highly recommend that you call this operation to test your
 * authentication method as soon as you create your server. By doing so, you can
 * troubleshoot issues with the API Gateway integration to ensure that your
 * users can successfully use the service.
 * </p>
 */
public class TestIdentityProviderRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A system-assigned identifier for a specific file transfer
     * protocol-enabled server. That server's user authentication method is
     * tested with a user name and password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     */
    private String serverId;

    /**
     * <p>
     * The type of file transfer protocol to be tested.
     * </p>
     * <p>
     * The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SFTP, FTP, FTPS
     */
    private String serverProtocol;

    /**
     * <p>
     * The source IP address of the user account to be tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$<br/>
     */
    private String sourceIp;

    /**
     * <p>
     * The name of the user account to be tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     */
    private String userName;

    /**
     * <p>
     * The password of the user account to be tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String userPassword;

    /**
     * <p>
     * A system-assigned identifier for a specific file transfer
     * protocol-enabled server. That server's user authentication method is
     * tested with a user name and password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @return <p>
     *         A system-assigned identifier for a specific file transfer
     *         protocol-enabled server. That server's user authentication method
     *         is tested with a user name and password.
     *         </p>
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * <p>
     * A system-assigned identifier for a specific file transfer
     * protocol-enabled server. That server's user authentication method is
     * tested with a user name and password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            A system-assigned identifier for a specific file transfer
     *            protocol-enabled server. That server's user authentication
     *            method is tested with a user name and password.
     *            </p>
     */
    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    /**
     * <p>
     * A system-assigned identifier for a specific file transfer
     * protocol-enabled server. That server's user authentication method is
     * tested with a user name and password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>19 - 19<br/>
     * <b>Pattern: </b>^s-([0-9a-f]{17})$<br/>
     *
     * @param serverId <p>
     *            A system-assigned identifier for a specific file transfer
     *            protocol-enabled server. That server's user authentication
     *            method is tested with a user name and password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestIdentityProviderRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * <p>
     * The type of file transfer protocol to be tested.
     * </p>
     * <p>
     * The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SFTP, FTP, FTPS
     *
     * @return <p>
     *         The type of file transfer protocol to be tested.
     *         </p>
     *         <p>
     *         The available protocols are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Secure Shell (SSH) File Transfer Protocol (SFTP)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         File Transfer Protocol Secure (FTPS)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         File Transfer Protocol (FTP)
     *         </p>
     *         </li>
     *         </ul>
     * @see Protocol
     */
    public String getServerProtocol() {
        return serverProtocol;
    }

    /**
     * <p>
     * The type of file transfer protocol to be tested.
     * </p>
     * <p>
     * The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SFTP, FTP, FTPS
     *
     * @param serverProtocol <p>
     *            The type of file transfer protocol to be tested.
     *            </p>
     *            <p>
     *            The available protocols are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Secure Shell (SSH) File Transfer Protocol (SFTP)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol Secure (FTPS)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol (FTP)
     *            </p>
     *            </li>
     *            </ul>
     * @see Protocol
     */
    public void setServerProtocol(String serverProtocol) {
        this.serverProtocol = serverProtocol;
    }

    /**
     * <p>
     * The type of file transfer protocol to be tested.
     * </p>
     * <p>
     * The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SFTP, FTP, FTPS
     *
     * @param serverProtocol <p>
     *            The type of file transfer protocol to be tested.
     *            </p>
     *            <p>
     *            The available protocols are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Secure Shell (SSH) File Transfer Protocol (SFTP)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol Secure (FTPS)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol (FTP)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Protocol
     */
    public TestIdentityProviderRequest withServerProtocol(String serverProtocol) {
        this.serverProtocol = serverProtocol;
        return this;
    }

    /**
     * <p>
     * The type of file transfer protocol to be tested.
     * </p>
     * <p>
     * The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SFTP, FTP, FTPS
     *
     * @param serverProtocol <p>
     *            The type of file transfer protocol to be tested.
     *            </p>
     *            <p>
     *            The available protocols are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Secure Shell (SSH) File Transfer Protocol (SFTP)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol Secure (FTPS)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol (FTP)
     *            </p>
     *            </li>
     *            </ul>
     * @see Protocol
     */
    public void setServerProtocol(Protocol serverProtocol) {
        this.serverProtocol = serverProtocol.toString();
    }

    /**
     * <p>
     * The type of file transfer protocol to be tested.
     * </p>
     * <p>
     * The available protocols are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Secure Shell (SSH) File Transfer Protocol (SFTP)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol Secure (FTPS)
     * </p>
     * </li>
     * <li>
     * <p>
     * File Transfer Protocol (FTP)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SFTP, FTP, FTPS
     *
     * @param serverProtocol <p>
     *            The type of file transfer protocol to be tested.
     *            </p>
     *            <p>
     *            The available protocols are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Secure Shell (SSH) File Transfer Protocol (SFTP)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol Secure (FTPS)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            File Transfer Protocol (FTP)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Protocol
     */
    public TestIdentityProviderRequest withServerProtocol(Protocol serverProtocol) {
        this.serverProtocol = serverProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The source IP address of the user account to be tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$<br/>
     *
     * @return <p>
     *         The source IP address of the user account to be tested.
     *         </p>
     */
    public String getSourceIp() {
        return sourceIp;
    }

    /**
     * <p>
     * The source IP address of the user account to be tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$<br/>
     *
     * @param sourceIp <p>
     *            The source IP address of the user account to be tested.
     *            </p>
     */
    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    /**
     * <p>
     * The source IP address of the user account to be tested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     * <b>Pattern: </b>^\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}$<br/>
     *
     * @param sourceIp <p>
     *            The source IP address of the user account to be tested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestIdentityProviderRequest withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * <p>
     * The name of the user account to be tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @return <p>
     *         The name of the user account to be tested.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The name of the user account to be tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @param userName <p>
     *            The name of the user account to be tested.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user account to be tested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 32<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_][a-zA-Z0-9_-]{2,31}$<br/>
     *
     * @param userName <p>
     *            The name of the user account to be tested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestIdentityProviderRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The password of the user account to be tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         The password of the user account to be tested.
     *         </p>
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * <p>
     * The password of the user account to be tested.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param userPassword <p>
     *            The password of the user account to be tested.
     *            </p>
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * <p>
     * The password of the user account to be tested.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param userPassword <p>
     *            The password of the user account to be tested.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestIdentityProviderRequest withUserPassword(String userPassword) {
        this.userPassword = userPassword;
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
        if (getServerId() != null)
            sb.append("ServerId: " + getServerId() + ",");
        if (getServerProtocol() != null)
            sb.append("ServerProtocol: " + getServerProtocol() + ",");
        if (getSourceIp() != null)
            sb.append("SourceIp: " + getSourceIp() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getUserPassword() != null)
            sb.append("UserPassword: " + getUserPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerId() == null) ? 0 : getServerId().hashCode());
        hashCode = prime * hashCode
                + ((getServerProtocol() == null) ? 0 : getServerProtocol().hashCode());
        hashCode = prime * hashCode + ((getSourceIp() == null) ? 0 : getSourceIp().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestIdentityProviderRequest == false)
            return false;
        TestIdentityProviderRequest other = (TestIdentityProviderRequest) obj;

        if (other.getServerId() == null ^ this.getServerId() == null)
            return false;
        if (other.getServerId() != null && other.getServerId().equals(this.getServerId()) == false)
            return false;
        if (other.getServerProtocol() == null ^ this.getServerProtocol() == null)
            return false;
        if (other.getServerProtocol() != null
                && other.getServerProtocol().equals(this.getServerProtocol()) == false)
            return false;
        if (other.getSourceIp() == null ^ this.getSourceIp() == null)
            return false;
        if (other.getSourceIp() != null && other.getSourceIp().equals(this.getSourceIp()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getUserPassword() == null ^ this.getUserPassword() == null)
            return false;
        if (other.getUserPassword() != null
                && other.getUserPassword().equals(this.getUserPassword()) == false)
            return false;
        return true;
    }
}
