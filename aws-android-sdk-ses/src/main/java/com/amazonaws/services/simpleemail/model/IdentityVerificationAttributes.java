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
 * Represents the verification attributes of a single identity.
 * </p>
 */
public class IdentityVerificationAttributes implements Serializable {
    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed",
     * or "TemporaryFailure".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     */
    private String verificationStatus;

    /**
     * <p>
     * The verification token for a domain identity. Null for email address
     * identities.
     * </p>
     */
    private String verificationToken;

    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed",
     * or "TemporaryFailure".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     *
     * @return <p>
     *         The verification status of the identity: "Pending", "Success",
     *         "Failed", or "TemporaryFailure".
     *         </p>
     * @see VerificationStatus
     */
    public String getVerificationStatus() {
        return verificationStatus;
    }

    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed",
     * or "TemporaryFailure".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     *
     * @param verificationStatus <p>
     *            The verification status of the identity: "Pending", "Success",
     *            "Failed", or "TemporaryFailure".
     *            </p>
     * @see VerificationStatus
     */
    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }

    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed",
     * or "TemporaryFailure".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     *
     * @param verificationStatus <p>
     *            The verification status of the identity: "Pending", "Success",
     *            "Failed", or "TemporaryFailure".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationStatus
     */
    public IdentityVerificationAttributes withVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
        return this;
    }

    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed",
     * or "TemporaryFailure".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     *
     * @param verificationStatus <p>
     *            The verification status of the identity: "Pending", "Success",
     *            "Failed", or "TemporaryFailure".
     *            </p>
     * @see VerificationStatus
     */
    public void setVerificationStatus(VerificationStatus verificationStatus) {
        this.verificationStatus = verificationStatus.toString();
    }

    /**
     * <p>
     * The verification status of the identity: "Pending", "Success", "Failed",
     * or "TemporaryFailure".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Pending, Success, Failed, TemporaryFailure,
     * NotStarted
     *
     * @param verificationStatus <p>
     *            The verification status of the identity: "Pending", "Success",
     *            "Failed", or "TemporaryFailure".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VerificationStatus
     */
    public IdentityVerificationAttributes withVerificationStatus(
            VerificationStatus verificationStatus) {
        this.verificationStatus = verificationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The verification token for a domain identity. Null for email address
     * identities.
     * </p>
     *
     * @return <p>
     *         The verification token for a domain identity. Null for email
     *         address identities.
     *         </p>
     */
    public String getVerificationToken() {
        return verificationToken;
    }

    /**
     * <p>
     * The verification token for a domain identity. Null for email address
     * identities.
     * </p>
     *
     * @param verificationToken <p>
     *            The verification token for a domain identity. Null for email
     *            address identities.
     *            </p>
     */
    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    /**
     * <p>
     * The verification token for a domain identity. Null for email address
     * identities.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param verificationToken <p>
     *            The verification token for a domain identity. Null for email
     *            address identities.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IdentityVerificationAttributes withVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
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
        if (getVerificationStatus() != null)
            sb.append("VerificationStatus: " + getVerificationStatus() + ",");
        if (getVerificationToken() != null)
            sb.append("VerificationToken: " + getVerificationToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVerificationStatus() == null) ? 0 : getVerificationStatus().hashCode());
        hashCode = prime * hashCode
                + ((getVerificationToken() == null) ? 0 : getVerificationToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityVerificationAttributes == false)
            return false;
        IdentityVerificationAttributes other = (IdentityVerificationAttributes) obj;

        if (other.getVerificationStatus() == null ^ this.getVerificationStatus() == null)
            return false;
        if (other.getVerificationStatus() != null
                && other.getVerificationStatus().equals(this.getVerificationStatus()) == false)
            return false;
        if (other.getVerificationToken() == null ^ this.getVerificationToken() == null)
            return false;
        if (other.getVerificationToken() != null
                && other.getVerificationToken().equals(this.getVerificationToken()) == false)
            return false;
        return true;
    }
}
