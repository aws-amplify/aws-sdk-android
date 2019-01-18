/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Given a list of identities (email addresses and/or domains), returns the
 * verification status and (for domain identities) the verification token for
 * each identity.
 * </p>
 * <p>
 * The verification status of an email address is "Pending" until the email
 * address owner clicks the link within the verification email that Amazon SES
 * sent to that address. If the email address owner clicks the link within 24
 * hours, the verification status of the email address changes to "Success". If
 * the link is not clicked within 24 hours, the verification status changes to
 * "Failed." In that case, if you still want to verify the email address, you
 * must restart the verification process from the beginning.
 * </p>
 * <p>
 * For domain identities, the domain's verification status is "Pending" as
 * Amazon SES searches for the required TXT record in the DNS settings of the
 * domain. When Amazon SES detects the record, the domain's verification status
 * changes to "Success". If Amazon SES is unable to detect the record within 72
 * hours, the domain's verification status changes to "Failed." In that case, if
 * you still want to verify the domain, you must restart the verification
 * process from the beginning.
 * </p>
 * <p>
 * This operation is throttled at one request per second and can only get
 * verification attributes for up to 100 identities at a time.
 * </p>
 */
public class GetIdentityVerificationAttributesRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * A list of identities.
     * </p>
     */
    private java.util.List<String> identities = new java.util.ArrayList<String>();

    /**
     * <p>
     * A list of identities.
     * </p>
     *
     * @return <p>
     *         A list of identities.
     *         </p>
     */
    public java.util.List<String> getIdentities() {
        return identities;
    }

    /**
     * <p>
     * A list of identities.
     * </p>
     *
     * @param identities <p>
     *            A list of identities.
     *            </p>
     */
    public void setIdentities(java.util.Collection<String> identities) {
        if (identities == null) {
            this.identities = null;
            return;
        }

        this.identities = new java.util.ArrayList<String>(identities);
    }

    /**
     * <p>
     * A list of identities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identities <p>
     *            A list of identities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityVerificationAttributesRequest withIdentities(String... identities) {
        if (getIdentities() == null) {
            this.identities = new java.util.ArrayList<String>(identities.length);
        }
        for (String value : identities) {
            this.identities.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of identities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identities <p>
     *            A list of identities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIdentityVerificationAttributesRequest withIdentities(
            java.util.Collection<String> identities) {
        setIdentities(identities);
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
        if (getIdentities() != null)
            sb.append("Identities: " + getIdentities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentities() == null) ? 0 : getIdentities().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIdentityVerificationAttributesRequest == false)
            return false;
        GetIdentityVerificationAttributesRequest other = (GetIdentityVerificationAttributesRequest) obj;

        if (other.getIdentities() == null ^ this.getIdentities() == null)
            return false;
        if (other.getIdentities() != null
                && other.getIdentities().equals(this.getIdentities()) == false)
            return false;
        return true;
    }
}
