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

package com.amazonaws.services.fsx.model;

import java.io.Serializable;

/**
 * <p>
 * The configuration that Amazon FSx uses to join the Windows File Server
 * instance to your self-managed (including on-premises) Microsoft Active
 * Directory (AD) directory.
 * </p>
 */
public class SelfManagedActiveDirectoryConfiguration implements Serializable {
    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory, such as
     * <code>corp.example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^.{1,255}$<br/>
     */
    private String domainName;

    /**
     * <p>
     * (Optional) The fully qualified distinguished name of the organizational
     * unit within your self-managed AD directory that the Windows File Server
     * instance will join. Amazon FSx only accepts OU as the direct parent of
     * the file system. An example is
     * <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more, see <a
     * href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>. If none is
     * provided, the FSx file system is created in the default location of your
     * self-managed AD directory.
     * </p>
     * <important>
     * <p>
     * Only Organizational Unit (OU) objects can be the direct parent of the
     * file system that you're creating.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>^.{1,2000}$<br/>
     */
    private String organizationalUnitDistinguishedName;

    /**
     * <p>
     * (Optional) The name of the domain group whose members are granted
     * administrative privileges for the file system. Administrative privileges
     * include taking ownership of files and folders, setting audit controls
     * (audit ACLs) on files and folders, and administering the file system
     * remotely by using the FSx Remote PowerShell. The group that you specify
     * must already exist in your domain. If you don't provide one, your AD
     * domain's Domain Admins group is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     */
    private String fileSystemAdministratorsGroup;

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that
     * Amazon FSx will use to join to your AD domain. This account must have the
     * permission to join computers to the domain in the organizational unit
     * provided in <code>OrganizationalUnitDistinguishedName</code>, or in the
     * default location of your AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     */
    private String userName;

    /**
     * <p>
     * The password for the service account on your self-managed AD domain that
     * Amazon FSx will use to join to your AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     */
    private String password;

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in
     * the self-managed AD directory. The IP addresses need to be either in the
     * same VPC CIDR range as the one in which your Amazon FSx file system is
     * being created, or in the private IP version 4 (IPv4) address ranges, as
     * specified in <a href="http://www.faqs.org/rfcs/rfc1918.html">RFC
     * 1918</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 10.0.0.0 - 10.255.255.255 (10/8 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> dnsIps;

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory, such as
     * <code>corp.example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^.{1,255}$<br/>
     *
     * @return <p>
     *         The fully qualified domain name of the self-managed AD directory,
     *         such as <code>corp.example.com</code>.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory, such as
     * <code>corp.example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^.{1,255}$<br/>
     *
     * @param domainName <p>
     *            The fully qualified domain name of the self-managed AD
     *            directory, such as <code>corp.example.com</code>.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory, such as
     * <code>corp.example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^.{1,255}$<br/>
     *
     * @param domainName <p>
     *            The fully qualified domain name of the self-managed AD
     *            directory, such as <code>corp.example.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryConfiguration withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * (Optional) The fully qualified distinguished name of the organizational
     * unit within your self-managed AD directory that the Windows File Server
     * instance will join. Amazon FSx only accepts OU as the direct parent of
     * the file system. An example is
     * <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more, see <a
     * href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>. If none is
     * provided, the FSx file system is created in the default location of your
     * self-managed AD directory.
     * </p>
     * <important>
     * <p>
     * Only Organizational Unit (OU) objects can be the direct parent of the
     * file system that you're creating.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>^.{1,2000}$<br/>
     *
     * @return <p>
     *         (Optional) The fully qualified distinguished name of the
     *         organizational unit within your self-managed AD directory that
     *         the Windows File Server instance will join. Amazon FSx only
     *         accepts OU as the direct parent of the file system. An example is
     *         <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more,
     *         see <a href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>.
     *         If none is provided, the FSx file system is created in the
     *         default location of your self-managed AD directory.
     *         </p>
     *         <important>
     *         <p>
     *         Only Organizational Unit (OU) objects can be the direct parent of
     *         the file system that you're creating.
     *         </p>
     *         </important>
     */
    public String getOrganizationalUnitDistinguishedName() {
        return organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * (Optional) The fully qualified distinguished name of the organizational
     * unit within your self-managed AD directory that the Windows File Server
     * instance will join. Amazon FSx only accepts OU as the direct parent of
     * the file system. An example is
     * <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more, see <a
     * href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>. If none is
     * provided, the FSx file system is created in the default location of your
     * self-managed AD directory.
     * </p>
     * <important>
     * <p>
     * Only Organizational Unit (OU) objects can be the direct parent of the
     * file system that you're creating.
     * </p>
     * </important>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>^.{1,2000}$<br/>
     *
     * @param organizationalUnitDistinguishedName <p>
     *            (Optional) The fully qualified distinguished name of the
     *            organizational unit within your self-managed AD directory that
     *            the Windows File Server instance will join. Amazon FSx only
     *            accepts OU as the direct parent of the file system. An example
     *            is <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn
     *            more, see <a href="https://tools.ietf.org/html/rfc2253">RFC
     *            2253</a>. If none is provided, the FSx file system is created
     *            in the default location of your self-managed AD directory.
     *            </p>
     *            <important>
     *            <p>
     *            Only Organizational Unit (OU) objects can be the direct parent
     *            of the file system that you're creating.
     *            </p>
     *            </important>
     */
    public void setOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * (Optional) The fully qualified distinguished name of the organizational
     * unit within your self-managed AD directory that the Windows File Server
     * instance will join. Amazon FSx only accepts OU as the direct parent of
     * the file system. An example is
     * <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more, see <a
     * href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>. If none is
     * provided, the FSx file system is created in the default location of your
     * self-managed AD directory.
     * </p>
     * <important>
     * <p>
     * Only Organizational Unit (OU) objects can be the direct parent of the
     * file system that you're creating.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>^.{1,2000}$<br/>
     *
     * @param organizationalUnitDistinguishedName <p>
     *            (Optional) The fully qualified distinguished name of the
     *            organizational unit within your self-managed AD directory that
     *            the Windows File Server instance will join. Amazon FSx only
     *            accepts OU as the direct parent of the file system. An example
     *            is <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn
     *            more, see <a href="https://tools.ietf.org/html/rfc2253">RFC
     *            2253</a>. If none is provided, the FSx file system is created
     *            in the default location of your self-managed AD directory.
     *            </p>
     *            <important>
     *            <p>
     *            Only Organizational Unit (OU) objects can be the direct parent
     *            of the file system that you're creating.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryConfiguration withOrganizationalUnitDistinguishedName(
            String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
        return this;
    }

    /**
     * <p>
     * (Optional) The name of the domain group whose members are granted
     * administrative privileges for the file system. Administrative privileges
     * include taking ownership of files and folders, setting audit controls
     * (audit ACLs) on files and folders, and administering the file system
     * remotely by using the FSx Remote PowerShell. The group that you specify
     * must already exist in your domain. If you don't provide one, your AD
     * domain's Domain Admins group is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @return <p>
     *         (Optional) The name of the domain group whose members are granted
     *         administrative privileges for the file system. Administrative
     *         privileges include taking ownership of files and folders, setting
     *         audit controls (audit ACLs) on files and folders, and
     *         administering the file system remotely by using the FSx Remote
     *         PowerShell. The group that you specify must already exist in your
     *         domain. If you don't provide one, your AD domain's Domain Admins
     *         group is used.
     *         </p>
     */
    public String getFileSystemAdministratorsGroup() {
        return fileSystemAdministratorsGroup;
    }

    /**
     * <p>
     * (Optional) The name of the domain group whose members are granted
     * administrative privileges for the file system. Administrative privileges
     * include taking ownership of files and folders, setting audit controls
     * (audit ACLs) on files and folders, and administering the file system
     * remotely by using the FSx Remote PowerShell. The group that you specify
     * must already exist in your domain. If you don't provide one, your AD
     * domain's Domain Admins group is used.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @param fileSystemAdministratorsGroup <p>
     *            (Optional) The name of the domain group whose members are
     *            granted administrative privileges for the file system.
     *            Administrative privileges include taking ownership of files
     *            and folders, setting audit controls (audit ACLs) on files and
     *            folders, and administering the file system remotely by using
     *            the FSx Remote PowerShell. The group that you specify must
     *            already exist in your domain. If you don't provide one, your
     *            AD domain's Domain Admins group is used.
     *            </p>
     */
    public void setFileSystemAdministratorsGroup(String fileSystemAdministratorsGroup) {
        this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
    }

    /**
     * <p>
     * (Optional) The name of the domain group whose members are granted
     * administrative privileges for the file system. Administrative privileges
     * include taking ownership of files and folders, setting audit controls
     * (audit ACLs) on files and folders, and administering the file system
     * remotely by using the FSx Remote PowerShell. The group that you specify
     * must already exist in your domain. If you don't provide one, your AD
     * domain's Domain Admins group is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @param fileSystemAdministratorsGroup <p>
     *            (Optional) The name of the domain group whose members are
     *            granted administrative privileges for the file system.
     *            Administrative privileges include taking ownership of files
     *            and folders, setting audit controls (audit ACLs) on files and
     *            folders, and administering the file system remotely by using
     *            the FSx Remote PowerShell. The group that you specify must
     *            already exist in your domain. If you don't provide one, your
     *            AD domain's Domain Admins group is used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryConfiguration withFileSystemAdministratorsGroup(
            String fileSystemAdministratorsGroup) {
        this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
        return this;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that
     * Amazon FSx will use to join to your AD domain. This account must have the
     * permission to join computers to the domain in the organizational unit
     * provided in <code>OrganizationalUnitDistinguishedName</code>, or in the
     * default location of your AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @return <p>
     *         The user name for the service account on your self-managed AD
     *         domain that Amazon FSx will use to join to your AD domain. This
     *         account must have the permission to join computers to the domain
     *         in the organizational unit provided in
     *         <code>OrganizationalUnitDistinguishedName</code>, or in the
     *         default location of your AD domain.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that
     * Amazon FSx will use to join to your AD domain. This account must have the
     * permission to join computers to the domain in the organizational unit
     * provided in <code>OrganizationalUnitDistinguishedName</code>, or in the
     * default location of your AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @param userName <p>
     *            The user name for the service account on your self-managed AD
     *            domain that Amazon FSx will use to join to your AD domain.
     *            This account must have the permission to join computers to the
     *            domain in the organizational unit provided in
     *            <code>OrganizationalUnitDistinguishedName</code>, or in the
     *            default location of your AD domain.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that
     * Amazon FSx will use to join to your AD domain. This account must have the
     * permission to join computers to the domain in the organizational unit
     * provided in <code>OrganizationalUnitDistinguishedName</code>, or in the
     * default location of your AD domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @param userName <p>
     *            The user name for the service account on your self-managed AD
     *            domain that Amazon FSx will use to join to your AD domain.
     *            This account must have the permission to join computers to the
     *            domain in the organizational unit provided in
     *            <code>OrganizationalUnitDistinguishedName</code>, or in the
     *            default location of your AD domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryConfiguration withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * The password for the service account on your self-managed AD domain that
     * Amazon FSx will use to join to your AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @return <p>
     *         The password for the service account on your self-managed AD
     *         domain that Amazon FSx will use to join to your AD domain.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * The password for the service account on your self-managed AD domain that
     * Amazon FSx will use to join to your AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @param password <p>
     *            The password for the service account on your self-managed AD
     *            domain that Amazon FSx will use to join to your AD domain.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the service account on your self-managed AD domain that
     * Amazon FSx will use to join to your AD domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^.{1,256}$<br/>
     *
     * @param password <p>
     *            The password for the service account on your self-managed AD
     *            domain that Amazon FSx will use to join to your AD domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryConfiguration withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in
     * the self-managed AD directory. The IP addresses need to be either in the
     * same VPC CIDR range as the one in which your Amazon FSx file system is
     * being created, or in the private IP version 4 (IPv4) address ranges, as
     * specified in <a href="http://www.faqs.org/rfcs/rfc1918.html">RFC
     * 1918</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 10.0.0.0 - 10.255.255.255 (10/8 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A list of up to two IP addresses of DNS servers or domain
     *         controllers in the self-managed AD directory. The IP addresses
     *         need to be either in the same VPC CIDR range as the one in which
     *         your Amazon FSx file system is being created, or in the private
     *         IP version 4 (IPv4) address ranges, as specified in <a
     *         href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         10.0.0.0 - 10.255.255.255 (10/8 prefix)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<String> getDnsIps() {
        return dnsIps;
    }

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in
     * the self-managed AD directory. The IP addresses need to be either in the
     * same VPC CIDR range as the one in which your Amazon FSx file system is
     * being created, or in the private IP version 4 (IPv4) address ranges, as
     * specified in <a href="http://www.faqs.org/rfcs/rfc1918.html">RFC
     * 1918</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 10.0.0.0 - 10.255.255.255 (10/8 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     * </p>
     * </li>
     * </ul>
     *
     * @param dnsIps <p>
     *            A list of up to two IP addresses of DNS servers or domain
     *            controllers in the self-managed AD directory. The IP addresses
     *            need to be either in the same VPC CIDR range as the one in
     *            which your Amazon FSx file system is being created, or in the
     *            private IP version 4 (IPv4) address ranges, as specified in <a
     *            href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            10.0.0.0 - 10.255.255.255 (10/8 prefix)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDnsIps(java.util.Collection<String> dnsIps) {
        if (dnsIps == null) {
            this.dnsIps = null;
            return;
        }

        this.dnsIps = new java.util.ArrayList<String>(dnsIps);
    }

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in
     * the self-managed AD directory. The IP addresses need to be either in the
     * same VPC CIDR range as the one in which your Amazon FSx file system is
     * being created, or in the private IP version 4 (IPv4) address ranges, as
     * specified in <a href="http://www.faqs.org/rfcs/rfc1918.html">RFC
     * 1918</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 10.0.0.0 - 10.255.255.255 (10/8 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsIps <p>
     *            A list of up to two IP addresses of DNS servers or domain
     *            controllers in the self-managed AD directory. The IP addresses
     *            need to be either in the same VPC CIDR range as the one in
     *            which your Amazon FSx file system is being created, or in the
     *            private IP version 4 (IPv4) address ranges, as specified in <a
     *            href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            10.0.0.0 - 10.255.255.255 (10/8 prefix)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryConfiguration withDnsIps(String... dnsIps) {
        if (getDnsIps() == null) {
            this.dnsIps = new java.util.ArrayList<String>(dnsIps.length);
        }
        for (String value : dnsIps) {
            this.dnsIps.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in
     * the self-managed AD directory. The IP addresses need to be either in the
     * same VPC CIDR range as the one in which your Amazon FSx file system is
     * being created, or in the private IP version 4 (IPv4) address ranges, as
     * specified in <a href="http://www.faqs.org/rfcs/rfc1918.html">RFC
     * 1918</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 10.0.0.0 - 10.255.255.255 (10/8 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsIps <p>
     *            A list of up to two IP addresses of DNS servers or domain
     *            controllers in the self-managed AD directory. The IP addresses
     *            need to be either in the same VPC CIDR range as the one in
     *            which your Amazon FSx file system is being created, or in the
     *            private IP version 4 (IPv4) address ranges, as specified in <a
     *            href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            10.0.0.0 - 10.255.255.255 (10/8 prefix)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryConfiguration withDnsIps(java.util.Collection<String> dnsIps) {
        setDnsIps(dnsIps);
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getOrganizationalUnitDistinguishedName() != null)
            sb.append("OrganizationalUnitDistinguishedName: "
                    + getOrganizationalUnitDistinguishedName() + ",");
        if (getFileSystemAdministratorsGroup() != null)
            sb.append("FileSystemAdministratorsGroup: " + getFileSystemAdministratorsGroup() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getDnsIps() != null)
            sb.append("DnsIps: " + getDnsIps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOrganizationalUnitDistinguishedName() == null) ? 0
                        : getOrganizationalUnitDistinguishedName().hashCode());
        hashCode = prime
                * hashCode
                + ((getFileSystemAdministratorsGroup() == null) ? 0
                        : getFileSystemAdministratorsGroup().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getDnsIps() == null) ? 0 : getDnsIps().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelfManagedActiveDirectoryConfiguration == false)
            return false;
        SelfManagedActiveDirectoryConfiguration other = (SelfManagedActiveDirectoryConfiguration) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() == null
                ^ this.getOrganizationalUnitDistinguishedName() == null)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() != null
                && other.getOrganizationalUnitDistinguishedName().equals(
                        this.getOrganizationalUnitDistinguishedName()) == false)
            return false;
        if (other.getFileSystemAdministratorsGroup() == null
                ^ this.getFileSystemAdministratorsGroup() == null)
            return false;
        if (other.getFileSystemAdministratorsGroup() != null
                && other.getFileSystemAdministratorsGroup().equals(
                        this.getFileSystemAdministratorsGroup()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getDnsIps() == null ^ this.getDnsIps() == null)
            return false;
        if (other.getDnsIps() != null && other.getDnsIps().equals(this.getDnsIps()) == false)
            return false;
        return true;
    }
}
