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
 * instance to a self-managed Microsoft Active Directory (AD) directory.
 * </p>
 */
public class SelfManagedActiveDirectoryConfigurationUpdates implements Serializable {
    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that
     * Amazon FSx will use to join to your AD domain. This account must have the
     * permission to join computers to the domain in the organizational unit
     * provided in <code>OrganizationalUnitDistinguishedName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,256}$<br/>
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
     * the self-managed AD directory.
     * </p>
     */
    private java.util.List<String> dnsIps;

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that
     * Amazon FSx will use to join to your AD domain. This account must have the
     * permission to join computers to the domain in the organizational unit
     * provided in <code>OrganizationalUnitDistinguishedName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,256}$<br/>
     *
     * @return <p>
     *         The user name for the service account on your self-managed AD
     *         domain that Amazon FSx will use to join to your AD domain. This
     *         account must have the permission to join computers to the domain
     *         in the organizational unit provided in
     *         <code>OrganizationalUnitDistinguishedName</code>.
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
     * provided in <code>OrganizationalUnitDistinguishedName</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^[^\u0000\u0085\u2028\u2029\r\n]{1,256}$<br/>
     *
     * @param userName <p>
     *            The user name for the service account on your self-managed AD
     *            domain that Amazon FSx will use to join to your AD domain.
     *            This account must have the permission to join computers to the
     *            domain in the organizational unit provided in
     *            <code>OrganizationalUnitDistinguishedName</code>.
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
     * provided in <code>OrganizationalUnitDistinguishedName</code>.
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
     *            domain that Amazon FSx will use to join to your AD domain.
     *            This account must have the permission to join computers to the
     *            domain in the organizational unit provided in
     *            <code>OrganizationalUnitDistinguishedName</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SelfManagedActiveDirectoryConfigurationUpdates withUserName(String userName) {
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
    public SelfManagedActiveDirectoryConfigurationUpdates withPassword(String password) {
        this.password = password;
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
    public SelfManagedActiveDirectoryConfigurationUpdates withDnsIps(String... dnsIps) {
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
    public SelfManagedActiveDirectoryConfigurationUpdates withDnsIps(
            java.util.Collection<String> dnsIps) {
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

        if (obj instanceof SelfManagedActiveDirectoryConfigurationUpdates == false)
            return false;
        SelfManagedActiveDirectoryConfigurationUpdates other = (SelfManagedActiveDirectoryConfigurationUpdates) obj;

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
