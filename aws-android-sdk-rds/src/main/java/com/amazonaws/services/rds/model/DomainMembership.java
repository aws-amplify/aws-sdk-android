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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

/**
 * <p>
 * An Active Directory Domain membership record associated with the DB instance
 * or cluster.
 * </p>
 */
public class DomainMembership implements Serializable {
    /**
     * <p>
     * The identifier of the Active Directory Domain.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance
     * or cluster. Values include joined, pending-join, failed, and so on.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The fully qualified domain name of the Active Directory Domain.
     * </p>
     */
    private String fQDN;

    /**
     * <p>
     * The name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     */
    private String iAMRoleName;

    /**
     * <p>
     * The identifier of the Active Directory Domain.
     * </p>
     *
     * @return <p>
     *         The identifier of the Active Directory Domain.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The identifier of the Active Directory Domain.
     * </p>
     *
     * @param domain <p>
     *            The identifier of the Active Directory Domain.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The identifier of the Active Directory Domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domain <p>
     *            The identifier of the Active Directory Domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainMembership withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance
     * or cluster. Values include joined, pending-join, failed, and so on.
     * </p>
     *
     * @return <p>
     *         The status of the Active Directory Domain membership for the DB
     *         instance or cluster. Values include joined, pending-join, failed,
     *         and so on.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance
     * or cluster. Values include joined, pending-join, failed, and so on.
     * </p>
     *
     * @param status <p>
     *            The status of the Active Directory Domain membership for the
     *            DB instance or cluster. Values include joined, pending-join,
     *            failed, and so on.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance
     * or cluster. Values include joined, pending-join, failed, and so on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the Active Directory Domain membership for the
     *            DB instance or cluster. Values include joined, pending-join,
     *            failed, and so on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainMembership withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name of the Active Directory Domain.
     * </p>
     *
     * @return <p>
     *         The fully qualified domain name of the Active Directory Domain.
     *         </p>
     */
    public String getFQDN() {
        return fQDN;
    }

    /**
     * <p>
     * The fully qualified domain name of the Active Directory Domain.
     * </p>
     *
     * @param fQDN <p>
     *            The fully qualified domain name of the Active Directory
     *            Domain.
     *            </p>
     */
    public void setFQDN(String fQDN) {
        this.fQDN = fQDN;
    }

    /**
     * <p>
     * The fully qualified domain name of the Active Directory Domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fQDN <p>
     *            The fully qualified domain name of the Active Directory
     *            Domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainMembership withFQDN(String fQDN) {
        this.fQDN = fQDN;
        return this;
    }

    /**
     * <p>
     * The name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     *
     * @return <p>
     *         The name of the IAM role to be used when making API calls to the
     *         Directory Service.
     *         </p>
     */
    public String getIAMRoleName() {
        return iAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     *
     * @param iAMRoleName <p>
     *            The name of the IAM role to be used when making API calls to
     *            the Directory Service.
     *            </p>
     */
    public void setIAMRoleName(String iAMRoleName) {
        this.iAMRoleName = iAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iAMRoleName <p>
     *            The name of the IAM role to be used when making API calls to
     *            the Directory Service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainMembership withIAMRoleName(String iAMRoleName) {
        this.iAMRoleName = iAMRoleName;
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
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getFQDN() != null)
            sb.append("FQDN: " + getFQDN() + ",");
        if (getIAMRoleName() != null)
            sb.append("IAMRoleName: " + getIAMRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFQDN() == null) ? 0 : getFQDN().hashCode());
        hashCode = prime * hashCode
                + ((getIAMRoleName() == null) ? 0 : getIAMRoleName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainMembership == false)
            return false;
        DomainMembership other = (DomainMembership) obj;

        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFQDN() == null ^ this.getFQDN() == null)
            return false;
        if (other.getFQDN() != null && other.getFQDN().equals(this.getFQDN()) == false)
            return false;
        if (other.getIAMRoleName() == null ^ this.getIAMRoleName() == null)
            return false;
        if (other.getIAMRoleName() != null
                && other.getIAMRoleName().equals(this.getIAMRoleName()) == false)
            return false;
        return true;
    }
}
