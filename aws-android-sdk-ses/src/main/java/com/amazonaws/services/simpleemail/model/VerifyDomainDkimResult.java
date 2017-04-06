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
 * Returns CNAME records that you must publish to the DNS server of your domain
 * to set up Easy DKIM with Amazon SES.
 * </p>
 */
public class VerifyDomainDkimResult implements Serializable {
    /**
     * <p>
     * A set of character strings that represent the domain's identity. If the
     * identity is an email address, the tokens represent the domain of that
     * address.
     * </p>
     * <p>
     * Using these tokens, you will need to create DNS CNAME records that point
     * to DKIM public keys hosted by Amazon SES. Amazon Web Services will
     * eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES
     * will be able to DKIM-sign emails originating from that domain.
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
     * A set of character strings that represent the domain's identity. If the
     * identity is an email address, the tokens represent the domain of that
     * address.
     * </p>
     * <p>
     * Using these tokens, you will need to create DNS CNAME records that point
     * to DKIM public keys hosted by Amazon SES. Amazon Web Services will
     * eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES
     * will be able to DKIM-sign emails originating from that domain.
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
     *         If the identity is an email address, the tokens represent the
     *         domain of that address.
     *         </p>
     *         <p>
     *         Using these tokens, you will need to create DNS CNAME records
     *         that point to DKIM public keys hosted by Amazon SES. Amazon Web
     *         Services will eventually detect that you have updated your DNS
     *         records; this detection process may take up to 72 hours. Upon
     *         successful detection, Amazon SES will be able to DKIM-sign emails
     *         originating from that domain.
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
     * A set of character strings that represent the domain's identity. If the
     * identity is an email address, the tokens represent the domain of that
     * address.
     * </p>
     * <p>
     * Using these tokens, you will need to create DNS CNAME records that point
     * to DKIM public keys hosted by Amazon SES. Amazon Web Services will
     * eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES
     * will be able to DKIM-sign emails originating from that domain.
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
     *            identity. If the identity is an email address, the tokens
     *            represent the domain of that address.
     *            </p>
     *            <p>
     *            Using these tokens, you will need to create DNS CNAME records
     *            that point to DKIM public keys hosted by Amazon SES. Amazon
     *            Web Services will eventually detect that you have updated your
     *            DNS records; this detection process may take up to 72 hours.
     *            Upon successful detection, Amazon SES will be able to
     *            DKIM-sign emails originating from that domain.
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
     * A set of character strings that represent the domain's identity. If the
     * identity is an email address, the tokens represent the domain of that
     * address.
     * </p>
     * <p>
     * Using these tokens, you will need to create DNS CNAME records that point
     * to DKIM public keys hosted by Amazon SES. Amazon Web Services will
     * eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES
     * will be able to DKIM-sign emails originating from that domain.
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
     *            identity. If the identity is an email address, the tokens
     *            represent the domain of that address.
     *            </p>
     *            <p>
     *            Using these tokens, you will need to create DNS CNAME records
     *            that point to DKIM public keys hosted by Amazon SES. Amazon
     *            Web Services will eventually detect that you have updated your
     *            DNS records; this detection process may take up to 72 hours.
     *            Upon successful detection, Amazon SES will be able to
     *            DKIM-sign emails originating from that domain.
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
    public VerifyDomainDkimResult withDkimTokens(String... dkimTokens) {
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
     * A set of character strings that represent the domain's identity. If the
     * identity is an email address, the tokens represent the domain of that
     * address.
     * </p>
     * <p>
     * Using these tokens, you will need to create DNS CNAME records that point
     * to DKIM public keys hosted by Amazon SES. Amazon Web Services will
     * eventually detect that you have updated your DNS records; this detection
     * process may take up to 72 hours. Upon successful detection, Amazon SES
     * will be able to DKIM-sign emails originating from that domain.
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
     *            identity. If the identity is an email address, the tokens
     *            represent the domain of that address.
     *            </p>
     *            <p>
     *            Using these tokens, you will need to create DNS CNAME records
     *            that point to DKIM public keys hosted by Amazon SES. Amazon
     *            Web Services will eventually detect that you have updated your
     *            DNS records; this detection process may take up to 72 hours.
     *            Upon successful detection, Amazon SES will be able to
     *            DKIM-sign emails originating from that domain.
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
    public VerifyDomainDkimResult withDkimTokens(java.util.Collection<String> dkimTokens) {
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
        if (getDkimTokens() != null)
            sb.append("DkimTokens: " + getDkimTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDkimTokens() == null) ? 0 : getDkimTokens().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyDomainDkimResult == false)
            return false;
        VerifyDomainDkimResult other = (VerifyDomainDkimResult) obj;

        if (other.getDkimTokens() == null ^ this.getDkimTokens() == null)
            return false;
        if (other.getDkimTokens() != null
                && other.getDkimTokens().equals(this.getDkimTokens()) == false)
            return false;
        return true;
    }
}
