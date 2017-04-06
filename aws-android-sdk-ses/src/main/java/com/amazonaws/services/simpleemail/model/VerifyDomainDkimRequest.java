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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Returns a set of DKIM tokens for a domain. DKIM <i>tokens</i> are character
 * strings that represent your domain's identity. Using these tokens, you will
 * need to create DNS CNAME records that point to DKIM public keys hosted by
 * Amazon SES. Amazon Web Services will eventually detect that you have updated
 * your DNS records; this detection process may take up to 72 hours. Upon
 * successful detection, Amazon SES will be able to DKIM-sign email originating
 * from that domain.
 * </p>
 * <p>
 * This action is throttled at one request per second.
 * </p>
 * <p>
 * To enable or disable Easy DKIM signing for a domain, use the
 * <code>SetIdentityDkimEnabled</code> action.
 * </p>
 * <p>
 * For more information about creating DNS records using DKIM tokens, go to the
 * <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/easy-dkim-dns-records.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class VerifyDomainDkimRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the domain to be verified for Easy DKIM signing.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * The name of the domain to be verified for Easy DKIM signing.
     * </p>
     *
     * @return <p>
     *         The name of the domain to be verified for Easy DKIM signing.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The name of the domain to be verified for Easy DKIM signing.
     * </p>
     *
     * @param domain <p>
     *            The name of the domain to be verified for Easy DKIM signing.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain to be verified for Easy DKIM signing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domain <p>
     *            The name of the domain to be verified for Easy DKIM signing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VerifyDomainDkimRequest withDomain(String domain) {
        this.domain = domain;
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
            sb.append("Domain: " + getDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyDomainDkimRequest == false)
            return false;
        VerifyDomainDkimRequest other = (VerifyDomainDkimRequest) obj;

        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        return true;
    }
}
