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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * The subdomain for the domain association.
 * </p>
 */
public class SubDomain implements Serializable {
    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     */
    private SubDomainSetting subDomainSetting;

    /**
     * <p>
     * The verified status of the subdomain
     * </p>
     */
    private Boolean verified;

    /**
     * <p>
     * The DNS record for the subdomain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     */
    private String dnsRecord;

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     *
     * @return <p>
     *         Describes the settings for the subdomain.
     *         </p>
     */
    public SubDomainSetting getSubDomainSetting() {
        return subDomainSetting;
    }

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     *
     * @param subDomainSetting <p>
     *            Describes the settings for the subdomain.
     *            </p>
     */
    public void setSubDomainSetting(SubDomainSetting subDomainSetting) {
        this.subDomainSetting = subDomainSetting;
    }

    /**
     * <p>
     * Describes the settings for the subdomain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param subDomainSetting <p>
     *            Describes the settings for the subdomain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubDomain withSubDomainSetting(SubDomainSetting subDomainSetting) {
        this.subDomainSetting = subDomainSetting;
        return this;
    }

    /**
     * <p>
     * The verified status of the subdomain
     * </p>
     *
     * @return <p>
     *         The verified status of the subdomain
     *         </p>
     */
    public Boolean isVerified() {
        return verified;
    }

    /**
     * <p>
     * The verified status of the subdomain
     * </p>
     *
     * @return <p>
     *         The verified status of the subdomain
     *         </p>
     */
    public Boolean getVerified() {
        return verified;
    }

    /**
     * <p>
     * The verified status of the subdomain
     * </p>
     *
     * @param verified <p>
     *            The verified status of the subdomain
     *            </p>
     */
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * <p>
     * The verified status of the subdomain
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param verified <p>
     *            The verified status of the subdomain
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubDomain withVerified(Boolean verified) {
        this.verified = verified;
        return this;
    }

    /**
     * <p>
     * The DNS record for the subdomain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @return <p>
     *         The DNS record for the subdomain.
     *         </p>
     */
    public String getDnsRecord() {
        return dnsRecord;
    }

    /**
     * <p>
     * The DNS record for the subdomain.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param dnsRecord <p>
     *            The DNS record for the subdomain.
     *            </p>
     */
    public void setDnsRecord(String dnsRecord) {
        this.dnsRecord = dnsRecord;
    }

    /**
     * <p>
     * The DNS record for the subdomain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1000<br/>
     *
     * @param dnsRecord <p>
     *            The DNS record for the subdomain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SubDomain withDnsRecord(String dnsRecord) {
        this.dnsRecord = dnsRecord;
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
        if (getSubDomainSetting() != null)
            sb.append("subDomainSetting: " + getSubDomainSetting() + ",");
        if (getVerified() != null)
            sb.append("verified: " + getVerified() + ",");
        if (getDnsRecord() != null)
            sb.append("dnsRecord: " + getDnsRecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSubDomainSetting() == null) ? 0 : getSubDomainSetting().hashCode());
        hashCode = prime * hashCode + ((getVerified() == null) ? 0 : getVerified().hashCode());
        hashCode = prime * hashCode + ((getDnsRecord() == null) ? 0 : getDnsRecord().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubDomain == false)
            return false;
        SubDomain other = (SubDomain) obj;

        if (other.getSubDomainSetting() == null ^ this.getSubDomainSetting() == null)
            return false;
        if (other.getSubDomainSetting() != null
                && other.getSubDomainSetting().equals(this.getSubDomainSetting()) == false)
            return false;
        if (other.getVerified() == null ^ this.getVerified() == null)
            return false;
        if (other.getVerified() != null && other.getVerified().equals(this.getVerified()) == false)
            return false;
        if (other.getDnsRecord() == null ^ this.getDnsRecord() == null)
            return false;
        if (other.getDnsRecord() != null
                && other.getDnsRecord().equals(this.getDnsRecord()) == false)
            return false;
        return true;
    }
}
