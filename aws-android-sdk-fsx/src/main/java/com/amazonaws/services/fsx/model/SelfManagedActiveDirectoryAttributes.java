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
 * The configuration of the self-managed Microsoft Active Directory (AD)
 * directory to which the Windows File Server instance is joined.
 * </p>
 */
public class SelfManagedActiveDirectoryAttributes implements Serializable {
    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,255}$<br/>
     */
    private String domainName;

    /**
     * <p>
     * The fully qualified distinguished name of the organizational unit within
     * the self-managed AD directory to which the Windows File Server instance
     * is joined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,2000}$<br/>
     */
    private String organizationalUnitDistinguishedName;

    /**
     * <p>
     * The name of the domain group whose members have administrative privileges
     * for the FSx file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,256}$<br/>
     */
    private String fileSystemAdministratorsGroup;

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that
     * FSx uses to join to your AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,256}$<br/>
     */
    private String userName;

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in
     * the self-managed AD directory.
     * </p>
     */
    private java.util.List<String> dnsIps;

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,255}$<br/>
     *
     * @return <p>
     *         The fully qualified domain name of the self-managed AD directory.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,255}$<br/>
     *
     * @param domainName <p>
     *            The fully qualified domain name of the self-managed AD
     *            directory.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,255}$<br/>
     *
     * @param domainName <p>
     *            The fully qualified domain name of the self-managed AD
     *            directory.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryAttributes withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The fully qualified distinguished name of the organizational unit within
     * the self-managed AD directory to which the Windows File Server instance
     * is joined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,2000}$<br/>
     *
     * @return <p>
     *         The fully qualified distinguished name of the organizational unit
     *         within the self-managed AD directory to which the Windows File
     *         Server instance is joined.
     *         </p>
     */
    public String getOrganizationalUnitDistinguishedName() {
        return organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The fully qualified distinguished name of the organizational unit within
     * the self-managed AD directory to which the Windows File Server instance
     * is joined.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,2000}$<br/>
     *
     * @param organizationalUnitDistinguishedName <p>
     *            The fully qualified distinguished name of the organizational
     *            unit within the self-managed AD directory to which the Windows
     *            File Server instance is joined.
     *            </p>
     */
    public void setOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The fully qualified distinguished name of the organizational unit within
     * the self-managed AD directory to which the Windows File Server instance
     * is joined.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,2000}$<br/>
     *
     * @param organizationalUnitDistinguishedName <p>
     *            The fully qualified distinguished name of the organizational
     *            unit within the self-managed AD directory to which the Windows
     *            File Server instance is joined.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryAttributes withOrganizationalUnitDistinguishedName(
            String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
        return this;
    }

    /**
     * <p>
     * The name of the domain group whose members have administrative privileges
     * for the FSx file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,256}$<br/>
     *
     * @return <p>
     *         The name of the domain group whose members have administrative
     *         privileges for the FSx file system.
     *         </p>
     */
    public String getFileSystemAdministratorsGroup() {
        return fileSystemAdministratorsGroup;
    }

    /**
     * <p>
     * The name of the domain group whose members have administrative privileges
     * for the FSx file system.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,256}$<br/>
     *
     * @param fileSystemAdministratorsGroup <p>
     *            The name of the domain group whose members have administrative
     *            privileges for the FSx file system.
     *            </p>
     */
    public void setFileSystemAdministratorsGroup(String fileSystemAdministratorsGroup) {
        this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
    }

    /**
     * <p>
     * The name of the domain group whose members have administrative privileges
     * for the FSx file system.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,256}$<br/>
     *
     * @param fileSystemAdministratorsGroup <p>
     *            The name of the domain group whose members have administrative
     *            privileges for the FSx file system.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryAttributes withFileSystemAdministratorsGroup(
            String fileSystemAdministratorsGroup) {
        this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
        return this;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that
     * FSx uses to join to your AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,256}$<br/>
     *
     * @return <p>
     *         The user name for the service account on your self-managed AD
     *         domain that FSx uses to join to your AD domain.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that
     * FSx uses to join to your AD domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,256}$<br/>
     *
     * @param userName <p>
     *            The user name for the service account on your self-managed AD
     *            domain that FSx uses to join to your AD domain.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that
     * FSx uses to join to your AD domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,256}$<br/>
     *
     * @param userName <p>
     *            The user name for the service account on your self-managed AD
     *            domain that FSx uses to join to your AD domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryAttributes withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in
     * the self-managed AD directory.
     * </p>
     *
     * @return <p>
     *         A list of up to two IP addresses of DNS servers or domain
     *         controllers in the self-managed AD directory.
     *         </p>
     */
    public java.util.List<String> getDnsIps() {
        return dnsIps;
    }

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in
     * the self-managed AD directory.
     * </p>
     *
     * @param dnsIps <p>
     *            A list of up to two IP addresses of DNS servers or domain
     *            controllers in the self-managed AD directory.
     *            </p>
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
     * the self-managed AD directory.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsIps <p>
     *            A list of up to two IP addresses of DNS servers or domain
     *            controllers in the self-managed AD directory.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryAttributes withDnsIps(String... dnsIps) {
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
     * the self-managed AD directory.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dnsIps <p>
     *            A list of up to two IP addresses of DNS servers or domain
     *            controllers in the self-managed AD directory.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryAttributes withDnsIps(java.util.Collection<String> dnsIps) {
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
        hashCode = prime * hashCode + ((getDnsIps() == null) ? 0 : getDnsIps().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelfManagedActiveDirectoryAttributes == false)
            return false;
        SelfManagedActiveDirectoryAttributes other = (SelfManagedActiveDirectoryAttributes) obj;

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
        if (other.getDnsIps() == null ^ this.getDnsIps() == null)
            return false;
        if (other.getDnsIps() != null && other.getDnsIps().equals(this.getDnsIps()) == false)
            return false;
        return true;
    }
}
