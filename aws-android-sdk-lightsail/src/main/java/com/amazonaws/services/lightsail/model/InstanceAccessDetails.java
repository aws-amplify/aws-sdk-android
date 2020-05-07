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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * The parameters for gaining temporary access to one of your Amazon Lightsail
 * instances.
 * </p>
 */
public class InstanceAccessDetails implements Serializable {
    /**
     * <p>
     * For SSH access, the public key to use when accessing your instance For
     * OpenSSH clients (e.g., command line SSH), you should save this value to
     * <code>tempkey-cert.pub</code>.
     * </p>
     */
    private String certKey;

    /**
     * <p>
     * For SSH access, the date on which the temporary keys expire.
     * </p>
     */
    private java.util.Date expiresAt;

    /**
     * <p>
     * The public IP address of the Amazon Lightsail instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     */
    private String ipAddress;

    /**
     * <p>
     * For RDP access, the password for your Amazon Lightsail instance. Password
     * will be an empty string if the password for your new instance is not
     * ready yet. When you create an instance, it can take up to 15 minutes for
     * the instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you create an instance using any key pair other than the default (
     * <code>LightsailDefaultKeyPair</code>), <code>password</code> will always
     * be an empty string.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will
     * continue to return the original password value. When accessing the
     * instance using RDP, you need to manually enter the Administrator password
     * after changing it from the default.
     * </p>
     * </note>
     */
    private String password;

    /**
     * <p>
     * For a Windows Server-based instance, an object with the data you can use
     * to retrieve your password. This is only needed if <code>password</code>
     * is empty and the instance is not new (and therefore the password is not
     * ready yet). When you create an instance, it can take up to 15 minutes for
     * the instance to be ready.
     * </p>
     */
    private PasswordData passwordData;

    /**
     * <p>
     * For SSH access, the temporary private key. For OpenSSH clients (e.g.,
     * command line SSH), you should save this value to <code>tempkey</code>).
     * </p>
     */
    private String privateKey;

    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     */
    private String protocol;

    /**
     * <p>
     * The name of this Amazon Lightsail instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String instanceName;

    /**
     * <p>
     * The user name to use when logging in to the Amazon Lightsail instance.
     * </p>
     */
    private String username;

    /**
     * <p>
     * Describes the public SSH host keys or the RDP certificate.
     * </p>
     */
    private java.util.List<HostKeyAttributes> hostKeys;

    /**
     * <p>
     * For SSH access, the public key to use when accessing your instance For
     * OpenSSH clients (e.g., command line SSH), you should save this value to
     * <code>tempkey-cert.pub</code>.
     * </p>
     *
     * @return <p>
     *         For SSH access, the public key to use when accessing your
     *         instance For OpenSSH clients (e.g., command line SSH), you should
     *         save this value to <code>tempkey-cert.pub</code>.
     *         </p>
     */
    public String getCertKey() {
        return certKey;
    }

    /**
     * <p>
     * For SSH access, the public key to use when accessing your instance For
     * OpenSSH clients (e.g., command line SSH), you should save this value to
     * <code>tempkey-cert.pub</code>.
     * </p>
     *
     * @param certKey <p>
     *            For SSH access, the public key to use when accessing your
     *            instance For OpenSSH clients (e.g., command line SSH), you
     *            should save this value to <code>tempkey-cert.pub</code>.
     *            </p>
     */
    public void setCertKey(String certKey) {
        this.certKey = certKey;
    }

    /**
     * <p>
     * For SSH access, the public key to use when accessing your instance For
     * OpenSSH clients (e.g., command line SSH), you should save this value to
     * <code>tempkey-cert.pub</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param certKey <p>
     *            For SSH access, the public key to use when accessing your
     *            instance For OpenSSH clients (e.g., command line SSH), you
     *            should save this value to <code>tempkey-cert.pub</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAccessDetails withCertKey(String certKey) {
        this.certKey = certKey;
        return this;
    }

    /**
     * <p>
     * For SSH access, the date on which the temporary keys expire.
     * </p>
     *
     * @return <p>
     *         For SSH access, the date on which the temporary keys expire.
     *         </p>
     */
    public java.util.Date getExpiresAt() {
        return expiresAt;
    }

    /**
     * <p>
     * For SSH access, the date on which the temporary keys expire.
     * </p>
     *
     * @param expiresAt <p>
     *            For SSH access, the date on which the temporary keys expire.
     *            </p>
     */
    public void setExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * <p>
     * For SSH access, the date on which the temporary keys expire.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiresAt <p>
     *            For SSH access, the date on which the temporary keys expire.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAccessDetails withExpiresAt(java.util.Date expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * <p>
     * The public IP address of the Amazon Lightsail instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     *
     * @return <p>
     *         The public IP address of the Amazon Lightsail instance.
     *         </p>
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * <p>
     * The public IP address of the Amazon Lightsail instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     *
     * @param ipAddress <p>
     *            The public IP address of the Amazon Lightsail instance.
     *            </p>
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The public IP address of the Amazon Lightsail instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>([0-9]{1,3}\.){3}[0-9]{1,3}<br/>
     *
     * @param ipAddress <p>
     *            The public IP address of the Amazon Lightsail instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAccessDetails withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * <p>
     * For RDP access, the password for your Amazon Lightsail instance. Password
     * will be an empty string if the password for your new instance is not
     * ready yet. When you create an instance, it can take up to 15 minutes for
     * the instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you create an instance using any key pair other than the default (
     * <code>LightsailDefaultKeyPair</code>), <code>password</code> will always
     * be an empty string.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will
     * continue to return the original password value. When accessing the
     * instance using RDP, you need to manually enter the Administrator password
     * after changing it from the default.
     * </p>
     * </note>
     *
     * @return <p>
     *         For RDP access, the password for your Amazon Lightsail instance.
     *         Password will be an empty string if the password for your new
     *         instance is not ready yet. When you create an instance, it can
     *         take up to 15 minutes for the instance to be ready.
     *         </p>
     *         <note>
     *         <p>
     *         If you create an instance using any key pair other than the
     *         default (<code>LightsailDefaultKeyPair</code>),
     *         <code>password</code> will always be an empty string.
     *         </p>
     *         <p>
     *         If you change the Administrator password on the instance,
     *         Lightsail will continue to return the original password value.
     *         When accessing the instance using RDP, you need to manually enter
     *         the Administrator password after changing it from the default.
     *         </p>
     *         </note>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * For RDP access, the password for your Amazon Lightsail instance. Password
     * will be an empty string if the password for your new instance is not
     * ready yet. When you create an instance, it can take up to 15 minutes for
     * the instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you create an instance using any key pair other than the default (
     * <code>LightsailDefaultKeyPair</code>), <code>password</code> will always
     * be an empty string.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will
     * continue to return the original password value. When accessing the
     * instance using RDP, you need to manually enter the Administrator password
     * after changing it from the default.
     * </p>
     * </note>
     *
     * @param password <p>
     *            For RDP access, the password for your Amazon Lightsail
     *            instance. Password will be an empty string if the password for
     *            your new instance is not ready yet. When you create an
     *            instance, it can take up to 15 minutes for the instance to be
     *            ready.
     *            </p>
     *            <note>
     *            <p>
     *            If you create an instance using any key pair other than the
     *            default (<code>LightsailDefaultKeyPair</code>),
     *            <code>password</code> will always be an empty string.
     *            </p>
     *            <p>
     *            If you change the Administrator password on the instance,
     *            Lightsail will continue to return the original password value.
     *            When accessing the instance using RDP, you need to manually
     *            enter the Administrator password after changing it from the
     *            default.
     *            </p>
     *            </note>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * For RDP access, the password for your Amazon Lightsail instance. Password
     * will be an empty string if the password for your new instance is not
     * ready yet. When you create an instance, it can take up to 15 minutes for
     * the instance to be ready.
     * </p>
     * <note>
     * <p>
     * If you create an instance using any key pair other than the default (
     * <code>LightsailDefaultKeyPair</code>), <code>password</code> will always
     * be an empty string.
     * </p>
     * <p>
     * If you change the Administrator password on the instance, Lightsail will
     * continue to return the original password value. When accessing the
     * instance using RDP, you need to manually enter the Administrator password
     * after changing it from the default.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param password <p>
     *            For RDP access, the password for your Amazon Lightsail
     *            instance. Password will be an empty string if the password for
     *            your new instance is not ready yet. When you create an
     *            instance, it can take up to 15 minutes for the instance to be
     *            ready.
     *            </p>
     *            <note>
     *            <p>
     *            If you create an instance using any key pair other than the
     *            default (<code>LightsailDefaultKeyPair</code>),
     *            <code>password</code> will always be an empty string.
     *            </p>
     *            <p>
     *            If you change the Administrator password on the instance,
     *            Lightsail will continue to return the original password value.
     *            When accessing the instance using RDP, you need to manually
     *            enter the Administrator password after changing it from the
     *            default.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAccessDetails withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * <p>
     * For a Windows Server-based instance, an object with the data you can use
     * to retrieve your password. This is only needed if <code>password</code>
     * is empty and the instance is not new (and therefore the password is not
     * ready yet). When you create an instance, it can take up to 15 minutes for
     * the instance to be ready.
     * </p>
     *
     * @return <p>
     *         For a Windows Server-based instance, an object with the data you
     *         can use to retrieve your password. This is only needed if
     *         <code>password</code> is empty and the instance is not new (and
     *         therefore the password is not ready yet). When you create an
     *         instance, it can take up to 15 minutes for the instance to be
     *         ready.
     *         </p>
     */
    public PasswordData getPasswordData() {
        return passwordData;
    }

    /**
     * <p>
     * For a Windows Server-based instance, an object with the data you can use
     * to retrieve your password. This is only needed if <code>password</code>
     * is empty and the instance is not new (and therefore the password is not
     * ready yet). When you create an instance, it can take up to 15 minutes for
     * the instance to be ready.
     * </p>
     *
     * @param passwordData <p>
     *            For a Windows Server-based instance, an object with the data
     *            you can use to retrieve your password. This is only needed if
     *            <code>password</code> is empty and the instance is not new
     *            (and therefore the password is not ready yet). When you create
     *            an instance, it can take up to 15 minutes for the instance to
     *            be ready.
     *            </p>
     */
    public void setPasswordData(PasswordData passwordData) {
        this.passwordData = passwordData;
    }

    /**
     * <p>
     * For a Windows Server-based instance, an object with the data you can use
     * to retrieve your password. This is only needed if <code>password</code>
     * is empty and the instance is not new (and therefore the password is not
     * ready yet). When you create an instance, it can take up to 15 minutes for
     * the instance to be ready.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param passwordData <p>
     *            For a Windows Server-based instance, an object with the data
     *            you can use to retrieve your password. This is only needed if
     *            <code>password</code> is empty and the instance is not new
     *            (and therefore the password is not ready yet). When you create
     *            an instance, it can take up to 15 minutes for the instance to
     *            be ready.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAccessDetails withPasswordData(PasswordData passwordData) {
        this.passwordData = passwordData;
        return this;
    }

    /**
     * <p>
     * For SSH access, the temporary private key. For OpenSSH clients (e.g.,
     * command line SSH), you should save this value to <code>tempkey</code>).
     * </p>
     *
     * @return <p>
     *         For SSH access, the temporary private key. For OpenSSH clients
     *         (e.g., command line SSH), you should save this value to
     *         <code>tempkey</code>).
     *         </p>
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * <p>
     * For SSH access, the temporary private key. For OpenSSH clients (e.g.,
     * command line SSH), you should save this value to <code>tempkey</code>).
     * </p>
     *
     * @param privateKey <p>
     *            For SSH access, the temporary private key. For OpenSSH clients
     *            (e.g., command line SSH), you should save this value to
     *            <code>tempkey</code>).
     *            </p>
     */
    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * For SSH access, the temporary private key. For OpenSSH clients (e.g.,
     * command line SSH), you should save this value to <code>tempkey</code>).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param privateKey <p>
     *            For SSH access, the temporary private key. For OpenSSH clients
     *            (e.g., command line SSH), you should save this value to
     *            <code>tempkey</code>).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAccessDetails withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     *
     * @return <p>
     *         The protocol for these Amazon Lightsail instance access details.
     *         </p>
     * @see InstanceAccessProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     *
     * @param protocol <p>
     *            The protocol for these Amazon Lightsail instance access
     *            details.
     *            </p>
     * @see InstanceAccessProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     *
     * @param protocol <p>
     *            The protocol for these Amazon Lightsail instance access
     *            details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAccessProtocol
     */
    public InstanceAccessDetails withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     *
     * @param protocol <p>
     *            The protocol for these Amazon Lightsail instance access
     *            details.
     *            </p>
     * @see InstanceAccessProtocol
     */
    public void setProtocol(InstanceAccessProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol for these Amazon Lightsail instance access details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     *
     * @param protocol <p>
     *            The protocol for these Amazon Lightsail instance access
     *            details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAccessProtocol
     */
    public InstanceAccessDetails withProtocol(InstanceAccessProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The name of this Amazon Lightsail instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of this Amazon Lightsail instance.
     *         </p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>
     * The name of this Amazon Lightsail instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of this Amazon Lightsail instance.
     *            </p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of this Amazon Lightsail instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of this Amazon Lightsail instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAccessDetails withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * <p>
     * The user name to use when logging in to the Amazon Lightsail instance.
     * </p>
     *
     * @return <p>
     *         The user name to use when logging in to the Amazon Lightsail
     *         instance.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name to use when logging in to the Amazon Lightsail instance.
     * </p>
     *
     * @param username <p>
     *            The user name to use when logging in to the Amazon Lightsail
     *            instance.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name to use when logging in to the Amazon Lightsail instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param username <p>
     *            The user name to use when logging in to the Amazon Lightsail
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAccessDetails withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * Describes the public SSH host keys or the RDP certificate.
     * </p>
     *
     * @return <p>
     *         Describes the public SSH host keys or the RDP certificate.
     *         </p>
     */
    public java.util.List<HostKeyAttributes> getHostKeys() {
        return hostKeys;
    }

    /**
     * <p>
     * Describes the public SSH host keys or the RDP certificate.
     * </p>
     *
     * @param hostKeys <p>
     *            Describes the public SSH host keys or the RDP certificate.
     *            </p>
     */
    public void setHostKeys(java.util.Collection<HostKeyAttributes> hostKeys) {
        if (hostKeys == null) {
            this.hostKeys = null;
            return;
        }

        this.hostKeys = new java.util.ArrayList<HostKeyAttributes>(hostKeys);
    }

    /**
     * <p>
     * Describes the public SSH host keys or the RDP certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostKeys <p>
     *            Describes the public SSH host keys or the RDP certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAccessDetails withHostKeys(HostKeyAttributes... hostKeys) {
        if (getHostKeys() == null) {
            this.hostKeys = new java.util.ArrayList<HostKeyAttributes>(hostKeys.length);
        }
        for (HostKeyAttributes value : hostKeys) {
            this.hostKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Describes the public SSH host keys or the RDP certificate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostKeys <p>
     *            Describes the public SSH host keys or the RDP certificate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceAccessDetails withHostKeys(java.util.Collection<HostKeyAttributes> hostKeys) {
        setHostKeys(hostKeys);
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
        if (getCertKey() != null)
            sb.append("certKey: " + getCertKey() + ",");
        if (getExpiresAt() != null)
            sb.append("expiresAt: " + getExpiresAt() + ",");
        if (getIpAddress() != null)
            sb.append("ipAddress: " + getIpAddress() + ",");
        if (getPassword() != null)
            sb.append("password: " + getPassword() + ",");
        if (getPasswordData() != null)
            sb.append("passwordData: " + getPasswordData() + ",");
        if (getPrivateKey() != null)
            sb.append("privateKey: " + getPrivateKey() + ",");
        if (getProtocol() != null)
            sb.append("protocol: " + getProtocol() + ",");
        if (getInstanceName() != null)
            sb.append("instanceName: " + getInstanceName() + ",");
        if (getUsername() != null)
            sb.append("username: " + getUsername() + ",");
        if (getHostKeys() != null)
            sb.append("hostKeys: " + getHostKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertKey() == null) ? 0 : getCertKey().hashCode());
        hashCode = prime * hashCode + ((getExpiresAt() == null) ? 0 : getExpiresAt().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode
                + ((getPasswordData() == null) ? 0 : getPasswordData().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getHostKeys() == null) ? 0 : getHostKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceAccessDetails == false)
            return false;
        InstanceAccessDetails other = (InstanceAccessDetails) obj;

        if (other.getCertKey() == null ^ this.getCertKey() == null)
            return false;
        if (other.getCertKey() != null && other.getCertKey().equals(this.getCertKey()) == false)
            return false;
        if (other.getExpiresAt() == null ^ this.getExpiresAt() == null)
            return false;
        if (other.getExpiresAt() != null
                && other.getExpiresAt().equals(this.getExpiresAt()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null
                && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getPasswordData() == null ^ this.getPasswordData() == null)
            return false;
        if (other.getPasswordData() != null
                && other.getPasswordData().equals(this.getPasswordData()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null
                && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null
                && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getHostKeys() == null ^ this.getHostKeys() == null)
            return false;
        if (other.getHostKeys() != null && other.getHostKeys().equals(this.getHostKeys()) == false)
            return false;
        return true;
    }
}
