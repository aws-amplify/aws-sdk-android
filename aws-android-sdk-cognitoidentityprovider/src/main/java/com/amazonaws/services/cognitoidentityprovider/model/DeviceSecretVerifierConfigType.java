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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The device verifier against which it will be authenticated.
 * </p>
 */
public class DeviceSecretVerifierConfigType implements Serializable {
    /**
     * <p>
     * The password verifier.
     * </p>
     */
    private String passwordVerifier;

    /**
     * <p>
     * The salt.
     * </p>
     */
    private String salt;

    /**
     * <p>
     * The password verifier.
     * </p>
     *
     * @return <p>
     *         The password verifier.
     *         </p>
     */
    public String getPasswordVerifier() {
        return passwordVerifier;
    }

    /**
     * <p>
     * The password verifier.
     * </p>
     *
     * @param passwordVerifier <p>
     *            The password verifier.
     *            </p>
     */
    public void setPasswordVerifier(String passwordVerifier) {
        this.passwordVerifier = passwordVerifier;
    }

    /**
     * <p>
     * The password verifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param passwordVerifier <p>
     *            The password verifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceSecretVerifierConfigType withPasswordVerifier(String passwordVerifier) {
        this.passwordVerifier = passwordVerifier;
        return this;
    }

    /**
     * <p>
     * The salt.
     * </p>
     *
     * @return <p>
     *         The salt.
     *         </p>
     */
    public String getSalt() {
        return salt;
    }

    /**
     * <p>
     * The salt.
     * </p>
     *
     * @param salt <p>
     *            The salt.
     *            </p>
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * <p>
     * The salt.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param salt <p>
     *            The salt.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceSecretVerifierConfigType withSalt(String salt) {
        this.salt = salt;
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
        if (getPasswordVerifier() != null)
            sb.append("PasswordVerifier: " + getPasswordVerifier() + ",");
        if (getSalt() != null)
            sb.append("Salt: " + getSalt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPasswordVerifier() == null) ? 0 : getPasswordVerifier().hashCode());
        hashCode = prime * hashCode + ((getSalt() == null) ? 0 : getSalt().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceSecretVerifierConfigType == false)
            return false;
        DeviceSecretVerifierConfigType other = (DeviceSecretVerifierConfigType) obj;

        if (other.getPasswordVerifier() == null ^ this.getPasswordVerifier() == null)
            return false;
        if (other.getPasswordVerifier() != null
                && other.getPasswordVerifier().equals(this.getPasswordVerifier()) == false)
            return false;
        if (other.getSalt() == null ^ this.getSalt() == null)
            return false;
        if (other.getSalt() != null && other.getSalt().equals(this.getSalt()) == false)
            return false;
        return true;
    }
}
