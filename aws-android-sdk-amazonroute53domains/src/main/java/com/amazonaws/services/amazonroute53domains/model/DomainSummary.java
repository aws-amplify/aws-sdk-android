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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

/**
 * <p>
 * Summary information about one domain.
 * </p>
 */
public class DomainSummary implements Serializable {
    /**
     * <p>
     * The name of the domain that the summary information applies to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     */
    private Boolean autoRenew;

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to
     * another party.
     * </p>
     */
    private Boolean transferLock;

    /**
     * <p>
     * Expiration date of the domain in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     */
    private java.util.Date expiry;

    /**
     * <p>
     * The name of the domain that the summary information applies to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain that the summary information applies to.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that the summary information applies to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that the summary information applies
     *            to.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that the summary information applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that the summary information applies
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainSummary withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     *
     * @return <p>
     *         Indicates whether the domain is automatically renewed upon
     *         expiration.
     *         </p>
     */
    public Boolean isAutoRenew() {
        return autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     *
     * @return <p>
     *         Indicates whether the domain is automatically renewed upon
     *         expiration.
     *         </p>
     */
    public Boolean getAutoRenew() {
        return autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     *
     * @param autoRenew <p>
     *            Indicates whether the domain is automatically renewed upon
     *            expiration.
     *            </p>
     */
    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain is automatically renewed upon expiration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoRenew <p>
     *            Indicates whether the domain is automatically renewed upon
     *            expiration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainSummary withAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to
     * another party.
     * </p>
     *
     * @return <p>
     *         Indicates whether a domain is locked from unauthorized transfer
     *         to another party.
     *         </p>
     */
    public Boolean isTransferLock() {
        return transferLock;
    }

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to
     * another party.
     * </p>
     *
     * @return <p>
     *         Indicates whether a domain is locked from unauthorized transfer
     *         to another party.
     *         </p>
     */
    public Boolean getTransferLock() {
        return transferLock;
    }

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to
     * another party.
     * </p>
     *
     * @param transferLock <p>
     *            Indicates whether a domain is locked from unauthorized
     *            transfer to another party.
     *            </p>
     */
    public void setTransferLock(Boolean transferLock) {
        this.transferLock = transferLock;
    }

    /**
     * <p>
     * Indicates whether a domain is locked from unauthorized transfer to
     * another party.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transferLock <p>
     *            Indicates whether a domain is locked from unauthorized
     *            transfer to another party.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainSummary withTransferLock(Boolean transferLock) {
        this.transferLock = transferLock;
        return this;
    }

    /**
     * <p>
     * Expiration date of the domain in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     *
     * @return <p>
     *         Expiration date of the domain in Unix time format and Coordinated
     *         Universal Time (UTC).
     *         </p>
     */
    public java.util.Date getExpiry() {
        return expiry;
    }

    /**
     * <p>
     * Expiration date of the domain in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     *
     * @param expiry <p>
     *            Expiration date of the domain in Unix time format and
     *            Coordinated Universal Time (UTC).
     *            </p>
     */
    public void setExpiry(java.util.Date expiry) {
        this.expiry = expiry;
    }

    /**
     * <p>
     * Expiration date of the domain in Unix time format and Coordinated
     * Universal Time (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiry <p>
     *            Expiration date of the domain in Unix time format and
     *            Coordinated Universal Time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainSummary withExpiry(java.util.Date expiry) {
        this.expiry = expiry;
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
        if (getAutoRenew() != null)
            sb.append("AutoRenew: " + getAutoRenew() + ",");
        if (getTransferLock() != null)
            sb.append("TransferLock: " + getTransferLock() + ",");
        if (getExpiry() != null)
            sb.append("Expiry: " + getExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime * hashCode
                + ((getTransferLock() == null) ? 0 : getTransferLock().hashCode());
        hashCode = prime * hashCode + ((getExpiry() == null) ? 0 : getExpiry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainSummary == false)
            return false;
        DomainSummary other = (DomainSummary) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null
                && other.getAutoRenew().equals(this.getAutoRenew()) == false)
            return false;
        if (other.getTransferLock() == null ^ this.getTransferLock() == null)
            return false;
        if (other.getTransferLock() != null
                && other.getTransferLock().equals(this.getTransferLock()) == false)
            return false;
        if (other.getExpiry() == null ^ this.getExpiry() == null)
            return false;
        if (other.getExpiry() != null && other.getExpiry().equals(this.getExpiry()) == false)
            return false;
        return true;
    }
}
