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

public class ResendContactReachabilityEmailResult implements Serializable {
    /**
     * <p>
     * The domain name for which you requested a confirmation email.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * The email address for the registrant contact at the time that we sent the
     * verification email.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     */
    private String emailAddress;

    /**
     * <p>
     * <code>True</code> if the email address for the registrant contact has
     * already been verified, and <code>false</code> otherwise. If the email
     * address has already been verified, we don't send another confirmation
     * email.
     * </p>
     */
    private Boolean isAlreadyVerified;

    /**
     * <p>
     * The domain name for which you requested a confirmation email.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The domain name for which you requested a confirmation email.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The domain name for which you requested a confirmation email.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The domain name for which you requested a confirmation email.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name for which you requested a confirmation email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The domain name for which you requested a confirmation email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResendContactReachabilityEmailResult withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The email address for the registrant contact at the time that we sent the
     * verification email.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @return <p>
     *         The email address for the registrant contact at the time that we
     *         sent the verification email.
     *         </p>
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * <p>
     * The email address for the registrant contact at the time that we sent the
     * verification email.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param emailAddress <p>
     *            The email address for the registrant contact at the time that
     *            we sent the verification email.
     *            </p>
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * <p>
     * The email address for the registrant contact at the time that we sent the
     * verification email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 254<br/>
     *
     * @param emailAddress <p>
     *            The email address for the registrant contact at the time that
     *            we sent the verification email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResendContactReachabilityEmailResult withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * <p>
     * <code>True</code> if the email address for the registrant contact has
     * already been verified, and <code>false</code> otherwise. If the email
     * address has already been verified, we don't send another confirmation
     * email.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the email address for the registrant contact
     *         has already been verified, and <code>false</code> otherwise. If
     *         the email address has already been verified, we don't send
     *         another confirmation email.
     *         </p>
     */
    public Boolean isIsAlreadyVerified() {
        return isAlreadyVerified;
    }

    /**
     * <p>
     * <code>True</code> if the email address for the registrant contact has
     * already been verified, and <code>false</code> otherwise. If the email
     * address has already been verified, we don't send another confirmation
     * email.
     * </p>
     *
     * @return <p>
     *         <code>True</code> if the email address for the registrant contact
     *         has already been verified, and <code>false</code> otherwise. If
     *         the email address has already been verified, we don't send
     *         another confirmation email.
     *         </p>
     */
    public Boolean getIsAlreadyVerified() {
        return isAlreadyVerified;
    }

    /**
     * <p>
     * <code>True</code> if the email address for the registrant contact has
     * already been verified, and <code>false</code> otherwise. If the email
     * address has already been verified, we don't send another confirmation
     * email.
     * </p>
     *
     * @param isAlreadyVerified <p>
     *            <code>True</code> if the email address for the registrant
     *            contact has already been verified, and <code>false</code>
     *            otherwise. If the email address has already been verified, we
     *            don't send another confirmation email.
     *            </p>
     */
    public void setIsAlreadyVerified(Boolean isAlreadyVerified) {
        this.isAlreadyVerified = isAlreadyVerified;
    }

    /**
     * <p>
     * <code>True</code> if the email address for the registrant contact has
     * already been verified, and <code>false</code> otherwise. If the email
     * address has already been verified, we don't send another confirmation
     * email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isAlreadyVerified <p>
     *            <code>True</code> if the email address for the registrant
     *            contact has already been verified, and <code>false</code>
     *            otherwise. If the email address has already been verified, we
     *            don't send another confirmation email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ResendContactReachabilityEmailResult withIsAlreadyVerified(Boolean isAlreadyVerified) {
        this.isAlreadyVerified = isAlreadyVerified;
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
            sb.append("domainName: " + getDomainName() + ",");
        if (getEmailAddress() != null)
            sb.append("emailAddress: " + getEmailAddress() + ",");
        if (getIsAlreadyVerified() != null)
            sb.append("isAlreadyVerified: " + getIsAlreadyVerified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getEmailAddress() == null) ? 0 : getEmailAddress().hashCode());
        hashCode = prime * hashCode
                + ((getIsAlreadyVerified() == null) ? 0 : getIsAlreadyVerified().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResendContactReachabilityEmailResult == false)
            return false;
        ResendContactReachabilityEmailResult other = (ResendContactReachabilityEmailResult) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEmailAddress() == null ^ this.getEmailAddress() == null)
            return false;
        if (other.getEmailAddress() != null
                && other.getEmailAddress().equals(this.getEmailAddress()) == false)
            return false;
        if (other.getIsAlreadyVerified() == null ^ this.getIsAlreadyVerified() == null)
            return false;
        if (other.getIsAlreadyVerified() != null
                && other.getIsAlreadyVerified().equals(this.getIsAlreadyVerified()) == false)
            return false;
        return true;
    }
}
