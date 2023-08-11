/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Enables or disables Easy DKIM signing of email sent from an identity. If Easy
 * DKIM signing is enabled for a domain, then Amazon SES uses DKIM to sign all
 * email that it sends from addresses on that domain. If Easy DKIM signing is
 * enabled for an email address, then Amazon SES uses DKIM to sign all email it
 * sends from that address.
 * </p>
 * <note>
 * <p>
 * For email addresses (for example, <code>user@example.com</code>), you can
 * only enable DKIM signing if the corresponding domain (in this case,
 * <code>example.com</code>) has been set up to use Easy DKIM.
 * </p>
 * </note>
 * <p>
 * You can enable DKIM signing for an identity at any time after you start the
 * verification process for the identity, even if the verification process isn't
 * complete.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 * <p>
 * For more information about Easy DKIM signing, go to the <a href=
 * "https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 */
public class SetIdentityDkimEnabledRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identity for which DKIM signing should be enabled or disabled.
     * </p>
     */
    private String identity;

    /**
     * <p>
     * Sets whether DKIM signing is enabled for an identity. Set to
     * <code>true</code> to enable DKIM signing for this identity;
     * <code>false</code> to disable it.
     * </p>
     */
    private Boolean dkimEnabled;

    /**
     * <p>
     * The identity for which DKIM signing should be enabled or disabled.
     * </p>
     *
     * @return <p>
     *         The identity for which DKIM signing should be enabled or
     *         disabled.
     *         </p>
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * <p>
     * The identity for which DKIM signing should be enabled or disabled.
     * </p>
     *
     * @param identity <p>
     *            The identity for which DKIM signing should be enabled or
     *            disabled.
     *            </p>
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity for which DKIM signing should be enabled or disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identity <p>
     *            The identity for which DKIM signing should be enabled or
     *            disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetIdentityDkimEnabledRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * <p>
     * Sets whether DKIM signing is enabled for an identity. Set to
     * <code>true</code> to enable DKIM signing for this identity;
     * <code>false</code> to disable it.
     * </p>
     *
     * @return <p>
     *         Sets whether DKIM signing is enabled for an identity. Set to
     *         <code>true</code> to enable DKIM signing for this identity;
     *         <code>false</code> to disable it.
     *         </p>
     */
    public Boolean isDkimEnabled() {
        return dkimEnabled;
    }

    /**
     * <p>
     * Sets whether DKIM signing is enabled for an identity. Set to
     * <code>true</code> to enable DKIM signing for this identity;
     * <code>false</code> to disable it.
     * </p>
     *
     * @return <p>
     *         Sets whether DKIM signing is enabled for an identity. Set to
     *         <code>true</code> to enable DKIM signing for this identity;
     *         <code>false</code> to disable it.
     *         </p>
     */
    public Boolean getDkimEnabled() {
        return dkimEnabled;
    }

    /**
     * <p>
     * Sets whether DKIM signing is enabled for an identity. Set to
     * <code>true</code> to enable DKIM signing for this identity;
     * <code>false</code> to disable it.
     * </p>
     *
     * @param dkimEnabled <p>
     *            Sets whether DKIM signing is enabled for an identity. Set to
     *            <code>true</code> to enable DKIM signing for this identity;
     *            <code>false</code> to disable it.
     *            </p>
     */
    public void setDkimEnabled(Boolean dkimEnabled) {
        this.dkimEnabled = dkimEnabled;
    }

    /**
     * <p>
     * Sets whether DKIM signing is enabled for an identity. Set to
     * <code>true</code> to enable DKIM signing for this identity;
     * <code>false</code> to disable it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dkimEnabled <p>
     *            Sets whether DKIM signing is enabled for an identity. Set to
     *            <code>true</code> to enable DKIM signing for this identity;
     *            <code>false</code> to disable it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SetIdentityDkimEnabledRequest withDkimEnabled(Boolean dkimEnabled) {
        this.dkimEnabled = dkimEnabled;
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
        if (getIdentity() != null)
            sb.append("Identity: " + getIdentity() + ",");
        if (getDkimEnabled() != null)
            sb.append("DkimEnabled: " + getDkimEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode
                + ((getDkimEnabled() == null) ? 0 : getDkimEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetIdentityDkimEnabledRequest == false)
            return false;
        SetIdentityDkimEnabledRequest other = (SetIdentityDkimEnabledRequest) obj;

        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getDkimEnabled() == null ^ this.getDkimEnabled() == null)
            return false;
        if (other.getDkimEnabled() != null
                && other.getDkimEnabled().equals(this.getDkimEnabled()) == false)
            return false;
        return true;
    }
}
