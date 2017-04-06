/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the DKIM attributes of a verified email address or a domain.
 * </p>
 */
public class IdentityDkimAttributes implements Serializable {
    /**
     * <p>
     * True if DKIM signing is enabled for email sent from the identity; false
     * otherwise.
     * </p>
     */
    private Boolean dkimEnabled;

    /**
     * <p>
     * Describes whether Amazon SES has successfully verified the DKIM DNS
     * records (tokens) published in the domain name's DNS. (This only applies
     * to domain identities, not email address identities.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     */
    private String dkimVerificationStatus;

    /**
     * <p>
     * A set of character strings that represent the domain's identity. Using
     * these tokens, you will need to create DNS CNAME records that point to
     * DKIM public keys hosted by Amazon SES. Amazon Web Services will
     * eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES
     * will be able to DKIM-sign email originating from that domain. (This only
     * applies to domain identities, not email address identities.)
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     */
    private java.util.List<String> dkimTokens = new java.util.ArrayList<String>();

    /**
     * <p>
     * True if DKIM signing is enabled for email sent from the identity; false
     * otherwise.
     * </p>
     *
     * @return <p>
     *         True if DKIM signing is enabled for email sent from the identity;
     *         false otherwise.
     *         </p>
     */
    public Boolean isDkimEnabled() {
        return dkimEnabled;
    }

    /**
     * <p>
     * True if DKIM signing is enabled for email sent from the identity; false
     * otherwise.
     * </p>
     *
     * @return <p>
     *         True if DKIM signing is enabled for email sent from the identity;
     *         false otherwise.
     *         </p>
     */
    public Boolean getDkimEnabled() {
        return dkimEnabled;
    }

    /**
     * <p>
     * True if DKIM signing is enabled for email sent from the identity; false
     * otherwise.
     * </p>
     *
     * @param dkimEnabled <p>
     *            True if DKIM signing is enabled for email sent from the
     *            identity; false otherwise.
     *            </p>
     */
    public void setDkimEnabled(Boolean dkimEnabled) {
        this.dkimEnabled = dkimEnabled;
    }

    /**
     * <p>
     * True if DKIM signing is enabled for email sent from the identity; false
     * otherwise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dkimEnabled <p>
     *            True if DKIM signing is enabled for email sent from the
     *            identity; false otherwise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityDkimAttributes withDkimEnabled(Boolean dkimEnabled) {
        this.dkimEnabled = dkimEnabled;
        return this;
    }

    /**
     * <p>
     * Describes whether Amazon SES has successfully verified the DKIM DNS
     * records (tokens) published in the domain name's DNS. (This only applies
     * to domain identities, not email address identities.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     *
     * @return <p>
     *         Describes whether Amazon SES has successfully verified the DKIM
     *         DNS records (tokens) published in the domain name's DNS. (This
     *         only applies to domain identities, not email address identities.)
     *         </p>
     * @see VerificationStatus
     */
    public String getDkimVerificationStatus() {
        return dkimVerificationStatus;
    }

    /**
     * <p>
     * Describes whether Amazon SES has successfully verified the DKIM DNS
     * records (tokens) published in the domain name's DNS. (This only applies
     * to domain identities, not email address identities.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     *
     * @param dkimVerificationStatus <p>
     *            Describes whether Amazon SES has successfully verified the
     *            DKIM DNS records (tokens) published in the domain name's DNS.
     *            (This only applies to domain identities, not email address
     *            identities.)
     *            </p>
     * @see VerificationStatus
     */
    public void setDkimVerificationStatus(String dkimVerificationStatus) {
        this.dkimVerificationStatus = dkimVerificationStatus;
    }

    /**
     * <p>
     * Describes whether Amazon SES has successfully verified the DKIM DNS
     * records (tokens) published in the domain name's DNS. (This only applies
     * to domain identities, not email address identities.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     *
     * @param dkimVerificationStatus <p>
     *            Describes whether Amazon SES has successfully verified the
     *            DKIM DNS records (tokens) published in the domain name's DNS.
     *            (This only applies to domain identities, not email address
     *            identities.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationStatus
     */
    public IdentityDkimAttributes withDkimVerificationStatus(String dkimVerificationStatus) {
        this.dkimVerificationStatus = dkimVerificationStatus;
        return this;
    }

    /**
     * <p>
     * Describes whether Amazon SES has successfully verified the DKIM DNS
     * records (tokens) published in the domain name's DNS. (This only applies
     * to domain identities, not email address identities.)
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     *
     * @param dkimVerificationStatus <p>
     *            Describes whether Amazon SES has successfully verified the
     *            DKIM DNS records (tokens) published in the domain name's DNS.
     *            (This only applies to domain identities, not email address
     *            identities.)
     *            </p>
     * @see VerificationStatus
     */
    public void setDkimVerificationStatus(VerificationStatus dkimVerificationStatus) {
        this.dkimVerificationStatus = dkimVerificationStatus.toString();
    }

    /**
     * <p>
     * Describes whether Amazon SES has successfully verified the DKIM DNS
     * records (tokens) published in the domain name's DNS. (This only applies
     * to domain identities, not email address identities.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     *
     * @param dkimVerificationStatus <p>
     *            Describes whether Amazon SES has successfully verified the
     *            DKIM DNS records (tokens) published in the domain name's DNS.
     *            (This only applies to domain identities, not email address
     *            identities.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationStatus
     */
    public IdentityDkimAttributes withDkimVerificationStatus(
            VerificationStatus dkimVerificationStatus) {
        this.dkimVerificationStatus = dkimVerificationStatus.toString();
        return this;
    }

    /**
     * <p>
     * A set of character strings that represent the domain's identity. Using
     * these tokens, you will need to create DNS CNAME records that point to
     * DKIM public keys hosted by Amazon SES. Amazon Web Services will
     * eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES
     * will be able to DKIM-sign email originating from that domain. (This only
     * applies to domain identities, not email address identities.)
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     *
     * @return <p>
     *         A set of character strings that represent the domain's identity.
     *         Using these tokens, you will need to create DNS CNAME records
     *         that point to DKIM public keys hosted by Amazon SES. Amazon Web
     *         Services will eventually detect that you have updated your DNS
     *         records; this detection process may take up to 72 hours. Upon
     *         successful detection, Amazon SES will be able to DKIM-sign email
     *         originating from that domain. (This only applies to domain
     *         identities, not email address identities.)
     *         </p>
     *         <p>
     *         For more information about creating DNS records using DKIM
     *         tokens, go to the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     */
    public java.util.List<String> getDkimTokens() {
        return dkimTokens;
    }

    /**
     * <p>
     * A set of character strings that represent the domain's identity. Using
     * these tokens, you will need to create DNS CNAME records that point to
     * DKIM public keys hosted by Amazon SES. Amazon Web Services will
     * eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES
     * will be able to DKIM-sign email originating from that domain. (This only
     * applies to domain identities, not email address identities.)
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     *
     * @param dkimTokens <p>
     *            A set of character strings that represent the domain's
     *            identity. Using these tokens, you will need to create DNS
     *            CNAME records that point to DKIM public keys hosted by Amazon
     *            SES. Amazon Web Services will eventually detect that you have
     *            updated your DNS records; this detection process may take up
     *            to 72 hours. Upon successful detection, Amazon SES will be
     *            able to DKIM-sign email originating from that domain. (This
     *            only applies to domain identities, not email address
     *            identities.)
     *            </p>
     *            <p>
     *            For more information about creating DNS records using DKIM
     *            tokens, go to the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     */
    public void setDkimTokens(java.util.Collection<String> dkimTokens) {
        if (dkimTokens == null) {
            this.dkimTokens = null;
            return;
        }

        this.dkimTokens = new java.util.ArrayList<String>(dkimTokens);
    }

    /**
     * <p>
     * A set of character strings that represent the domain's identity. Using
     * these tokens, you will need to create DNS CNAME records that point to
     * DKIM public keys hosted by Amazon SES. Amazon Web Services will
     * eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES
     * will be able to DKIM-sign email originating from that domain. (This only
     * applies to domain identities, not email address identities.)
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dkimTokens <p>
     *            A set of character strings that represent the domain's
     *            identity. Using these tokens, you will need to create DNS
     *            CNAME records that point to DKIM public keys hosted by Amazon
     *            SES. Amazon Web Services will eventually detect that you have
     *            updated your DNS records; this detection process may take up
     *            to 72 hours. Upon successful detection, Amazon SES will be
     *            able to DKIM-sign email originating from that domain. (This
     *            only applies to domain identities, not email address
     *            identities.)
     *            </p>
     *            <p>
     *            For more information about creating DNS records using DKIM
     *            tokens, go to the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityDkimAttributes withDkimTokens(String... dkimTokens) {
        if (getDkimTokens() == null) {
            this.dkimTokens = new java.util.ArrayList<String>(dkimTokens.length);
        }
        for (String value : dkimTokens) {
            this.dkimTokens.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A set of character strings that represent the domain's identity. Using
     * these tokens, you will need to create DNS CNAME records that point to
     * DKIM public keys hosted by Amazon SES. Amazon Web Services will
     * eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES
     * will be able to DKIM-sign email originating from that domain. (This only
     * applies to domain identities, not email address identities.)
     * </p>
     * <p>
     * For more information about creating DNS records using DKIM tokens, go to
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dkimTokens <p>
     *            A set of character strings that represent the domain's
     *            identity. Using these tokens, you will need to create DNS
     *            CNAME records that point to DKIM public keys hosted by Amazon
     *            SES. Amazon Web Services will eventually detect that you have
     *            updated your DNS records; this detection process may take up
     *            to 72 hours. Upon successful detection, Amazon SES will be
     *            able to DKIM-sign email originating from that domain. (This
     *            only applies to domain identities, not email address
     *            identities.)
     *            </p>
     *            <p>
     *            For more information about creating DNS records using DKIM
     *            tokens, go to the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityDkimAttributes withDkimTokens(java.util.Collection<String> dkimTokens) {
        setDkimTokens(dkimTokens);
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
        if (getDkimEnabled() != null)
            sb.append("DkimEnabled: " + getDkimEnabled() + ",");
        if (getDkimVerificationStatus() != null)
            sb.append("DkimVerificationStatus: " + getDkimVerificationStatus() + ",");
        if (getDkimTokens() != null)
            sb.append("DkimTokens: " + getDkimTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDkimEnabled() == null) ? 0 : getDkimEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getDkimVerificationStatus() == null) ? 0 : getDkimVerificationStatus()
                        .hashCode());
        hashCode = prime * hashCode + ((getDkimTokens() == null) ? 0 : getDkimTokens().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityDkimAttributes == false)
            return false;
        IdentityDkimAttributes other = (IdentityDkimAttributes) obj;

        if (other.getDkimEnabled() == null ^ this.getDkimEnabled() == null)
            return false;
        if (other.getDkimEnabled() != null
                && other.getDkimEnabled().equals(this.getDkimEnabled()) == false)
            return false;
        if (other.getDkimVerificationStatus() == null ^ this.getDkimVerificationStatus() == null)
            return false;
        if (other.getDkimVerificationStatus() != null
                && other.getDkimVerificationStatus().equals(this.getDkimVerificationStatus()) == false)
            return false;
        if (other.getDkimTokens() == null ^ this.getDkimTokens() == null)
            return false;
        if (other.getDkimTokens() != null
                && other.getDkimTokens().equals(this.getDkimTokens()) == false)
            return false;
        return true;
    }
}
