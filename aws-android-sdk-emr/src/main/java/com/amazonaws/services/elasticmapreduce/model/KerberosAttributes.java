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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Attributes for Kerberos configuration when Kerberos authentication is enabled
 * using a security configuration. For more information see <a href=
 * "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-kerberos.html"
 * >Use Kerberos Authentication</a> in the <i>EMR Management Guide</i>.
 * </p>
 */
public class KerberosAttributes implements Serializable {
    /**
     * <p>
     * The name of the Kerberos realm to which all nodes in a cluster belong.
     * For example, <code>EC2.INTERNAL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String realm;

    /**
     * <p>
     * The password used within the cluster for the kadmin service on the
     * cluster-dedicated KDC, which maintains Kerberos principals, password
     * policies, and keytabs for the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String kdcAdminPassword;

    /**
     * <p>
     * Required only when establishing a cross-realm trust with a KDC in a
     * different realm. The cross-realm principal password, which must be
     * identical across realms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String crossRealmTrustPrincipalPassword;

    /**
     * <p>
     * Required only when establishing a cross-realm trust with an Active
     * Directory domain. A user with sufficient privileges to join resources to
     * the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String aDDomainJoinUser;

    /**
     * <p>
     * The Active Directory password for <code>ADDomainJoinUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String aDDomainJoinPassword;

    /**
     * <p>
     * The name of the Kerberos realm to which all nodes in a cluster belong.
     * For example, <code>EC2.INTERNAL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Kerberos realm to which all nodes in a cluster
     *         belong. For example, <code>EC2.INTERNAL</code>.
     *         </p>
     */
    public String getRealm() {
        return realm;
    }

    /**
     * <p>
     * The name of the Kerberos realm to which all nodes in a cluster belong.
     * For example, <code>EC2.INTERNAL</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param realm <p>
     *            The name of the Kerberos realm to which all nodes in a cluster
     *            belong. For example, <code>EC2.INTERNAL</code>.
     *            </p>
     */
    public void setRealm(String realm) {
        this.realm = realm;
    }

    /**
     * <p>
     * The name of the Kerberos realm to which all nodes in a cluster belong.
     * For example, <code>EC2.INTERNAL</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param realm <p>
     *            The name of the Kerberos realm to which all nodes in a cluster
     *            belong. For example, <code>EC2.INTERNAL</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KerberosAttributes withRealm(String realm) {
        this.realm = realm;
        return this;
    }

    /**
     * <p>
     * The password used within the cluster for the kadmin service on the
     * cluster-dedicated KDC, which maintains Kerberos principals, password
     * policies, and keytabs for the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The password used within the cluster for the kadmin service on
     *         the cluster-dedicated KDC, which maintains Kerberos principals,
     *         password policies, and keytabs for the cluster.
     *         </p>
     */
    public String getKdcAdminPassword() {
        return kdcAdminPassword;
    }

    /**
     * <p>
     * The password used within the cluster for the kadmin service on the
     * cluster-dedicated KDC, which maintains Kerberos principals, password
     * policies, and keytabs for the cluster.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param kdcAdminPassword <p>
     *            The password used within the cluster for the kadmin service on
     *            the cluster-dedicated KDC, which maintains Kerberos
     *            principals, password policies, and keytabs for the cluster.
     *            </p>
     */
    public void setKdcAdminPassword(String kdcAdminPassword) {
        this.kdcAdminPassword = kdcAdminPassword;
    }

    /**
     * <p>
     * The password used within the cluster for the kadmin service on the
     * cluster-dedicated KDC, which maintains Kerberos principals, password
     * policies, and keytabs for the cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param kdcAdminPassword <p>
     *            The password used within the cluster for the kadmin service on
     *            the cluster-dedicated KDC, which maintains Kerberos
     *            principals, password policies, and keytabs for the cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KerberosAttributes withKdcAdminPassword(String kdcAdminPassword) {
        this.kdcAdminPassword = kdcAdminPassword;
        return this;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with a KDC in a
     * different realm. The cross-realm principal password, which must be
     * identical across realms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Required only when establishing a cross-realm trust with a KDC in
     *         a different realm. The cross-realm principal password, which must
     *         be identical across realms.
     *         </p>
     */
    public String getCrossRealmTrustPrincipalPassword() {
        return crossRealmTrustPrincipalPassword;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with a KDC in a
     * different realm. The cross-realm principal password, which must be
     * identical across realms.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param crossRealmTrustPrincipalPassword <p>
     *            Required only when establishing a cross-realm trust with a KDC
     *            in a different realm. The cross-realm principal password,
     *            which must be identical across realms.
     *            </p>
     */
    public void setCrossRealmTrustPrincipalPassword(String crossRealmTrustPrincipalPassword) {
        this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with a KDC in a
     * different realm. The cross-realm principal password, which must be
     * identical across realms.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param crossRealmTrustPrincipalPassword <p>
     *            Required only when establishing a cross-realm trust with a KDC
     *            in a different realm. The cross-realm principal password,
     *            which must be identical across realms.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KerberosAttributes withCrossRealmTrustPrincipalPassword(
            String crossRealmTrustPrincipalPassword) {
        this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
        return this;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with an Active
     * Directory domain. A user with sufficient privileges to join resources to
     * the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         Required only when establishing a cross-realm trust with an
     *         Active Directory domain. A user with sufficient privileges to
     *         join resources to the domain.
     *         </p>
     */
    public String getADDomainJoinUser() {
        return aDDomainJoinUser;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with an Active
     * Directory domain. A user with sufficient privileges to join resources to
     * the domain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param aDDomainJoinUser <p>
     *            Required only when establishing a cross-realm trust with an
     *            Active Directory domain. A user with sufficient privileges to
     *            join resources to the domain.
     *            </p>
     */
    public void setADDomainJoinUser(String aDDomainJoinUser) {
        this.aDDomainJoinUser = aDDomainJoinUser;
    }

    /**
     * <p>
     * Required only when establishing a cross-realm trust with an Active
     * Directory domain. A user with sufficient privileges to join resources to
     * the domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param aDDomainJoinUser <p>
     *            Required only when establishing a cross-realm trust with an
     *            Active Directory domain. A user with sufficient privileges to
     *            join resources to the domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KerberosAttributes withADDomainJoinUser(String aDDomainJoinUser) {
        this.aDDomainJoinUser = aDDomainJoinUser;
        return this;
    }

    /**
     * <p>
     * The Active Directory password for <code>ADDomainJoinUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The Active Directory password for <code>ADDomainJoinUser</code>.
     *         </p>
     */
    public String getADDomainJoinPassword() {
        return aDDomainJoinPassword;
    }

    /**
     * <p>
     * The Active Directory password for <code>ADDomainJoinUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param aDDomainJoinPassword <p>
     *            The Active Directory password for
     *            <code>ADDomainJoinUser</code>.
     *            </p>
     */
    public void setADDomainJoinPassword(String aDDomainJoinPassword) {
        this.aDDomainJoinPassword = aDDomainJoinPassword;
    }

    /**
     * <p>
     * The Active Directory password for <code>ADDomainJoinUser</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param aDDomainJoinPassword <p>
     *            The Active Directory password for
     *            <code>ADDomainJoinUser</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public KerberosAttributes withADDomainJoinPassword(String aDDomainJoinPassword) {
        this.aDDomainJoinPassword = aDDomainJoinPassword;
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
        if (getRealm() != null)
            sb.append("Realm: " + getRealm() + ",");
        if (getKdcAdminPassword() != null)
            sb.append("KdcAdminPassword: " + getKdcAdminPassword() + ",");
        if (getCrossRealmTrustPrincipalPassword() != null)
            sb.append("CrossRealmTrustPrincipalPassword: " + getCrossRealmTrustPrincipalPassword()
                    + ",");
        if (getADDomainJoinUser() != null)
            sb.append("ADDomainJoinUser: " + getADDomainJoinUser() + ",");
        if (getADDomainJoinPassword() != null)
            sb.append("ADDomainJoinPassword: " + getADDomainJoinPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRealm() == null) ? 0 : getRealm().hashCode());
        hashCode = prime * hashCode
                + ((getKdcAdminPassword() == null) ? 0 : getKdcAdminPassword().hashCode());
        hashCode = prime
                * hashCode
                + ((getCrossRealmTrustPrincipalPassword() == null) ? 0
                        : getCrossRealmTrustPrincipalPassword().hashCode());
        hashCode = prime * hashCode
                + ((getADDomainJoinUser() == null) ? 0 : getADDomainJoinUser().hashCode());
        hashCode = prime * hashCode
                + ((getADDomainJoinPassword() == null) ? 0 : getADDomainJoinPassword().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KerberosAttributes == false)
            return false;
        KerberosAttributes other = (KerberosAttributes) obj;

        if (other.getRealm() == null ^ this.getRealm() == null)
            return false;
        if (other.getRealm() != null && other.getRealm().equals(this.getRealm()) == false)
            return false;
        if (other.getKdcAdminPassword() == null ^ this.getKdcAdminPassword() == null)
            return false;
        if (other.getKdcAdminPassword() != null
                && other.getKdcAdminPassword().equals(this.getKdcAdminPassword()) == false)
            return false;
        if (other.getCrossRealmTrustPrincipalPassword() == null
                ^ this.getCrossRealmTrustPrincipalPassword() == null)
            return false;
        if (other.getCrossRealmTrustPrincipalPassword() != null
                && other.getCrossRealmTrustPrincipalPassword().equals(
                        this.getCrossRealmTrustPrincipalPassword()) == false)
            return false;
        if (other.getADDomainJoinUser() == null ^ this.getADDomainJoinUser() == null)
            return false;
        if (other.getADDomainJoinUser() != null
                && other.getADDomainJoinUser().equals(this.getADDomainJoinUser()) == false)
            return false;
        if (other.getADDomainJoinPassword() == null ^ this.getADDomainJoinPassword() == null)
            return false;
        if (other.getADDomainJoinPassword() != null
                && other.getADDomainJoinPassword().equals(this.getADDomainJoinPassword()) == false)
            return false;
        return true;
    }
}
