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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

/**
 * <p>
 * Provides information about the context in which temporary security
 * credentials were issued to an entity.
 * </p>
 */
public class SessionContextAttributes implements Serializable {
    /**
     * <p>
     * The date and time, in ISO 8601 format, when the credentials were issued.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * Specifies whether the credentials were authenticated with a multi-factor
     * authentication (MFA) device.
     * </p>
     */
    private Boolean mfaAuthenticated;

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the credentials were issued.
     * </p>
     *
     * @return <p>
     *         The date and time, in ISO 8601 format, when the credentials were
     *         issued.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the credentials were issued.
     * </p>
     *
     * @param creationDate <p>
     *            The date and time, in ISO 8601 format, when the credentials
     *            were issued.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the credentials were issued.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date and time, in ISO 8601 format, when the credentials
     *            were issued.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SessionContextAttributes withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * Specifies whether the credentials were authenticated with a multi-factor
     * authentication (MFA) device.
     * </p>
     *
     * @return <p>
     *         Specifies whether the credentials were authenticated with a
     *         multi-factor authentication (MFA) device.
     *         </p>
     */
    public Boolean isMfaAuthenticated() {
        return mfaAuthenticated;
    }

    /**
     * <p>
     * Specifies whether the credentials were authenticated with a multi-factor
     * authentication (MFA) device.
     * </p>
     *
     * @return <p>
     *         Specifies whether the credentials were authenticated with a
     *         multi-factor authentication (MFA) device.
     *         </p>
     */
    public Boolean getMfaAuthenticated() {
        return mfaAuthenticated;
    }

    /**
     * <p>
     * Specifies whether the credentials were authenticated with a multi-factor
     * authentication (MFA) device.
     * </p>
     *
     * @param mfaAuthenticated <p>
     *            Specifies whether the credentials were authenticated with a
     *            multi-factor authentication (MFA) device.
     *            </p>
     */
    public void setMfaAuthenticated(Boolean mfaAuthenticated) {
        this.mfaAuthenticated = mfaAuthenticated;
    }

    /**
     * <p>
     * Specifies whether the credentials were authenticated with a multi-factor
     * authentication (MFA) device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mfaAuthenticated <p>
     *            Specifies whether the credentials were authenticated with a
     *            multi-factor authentication (MFA) device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SessionContextAttributes withMfaAuthenticated(Boolean mfaAuthenticated) {
        this.mfaAuthenticated = mfaAuthenticated;
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
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getMfaAuthenticated() != null)
            sb.append("mfaAuthenticated: " + getMfaAuthenticated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getMfaAuthenticated() == null) ? 0 : getMfaAuthenticated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionContextAttributes == false)
            return false;
        SessionContextAttributes other = (SessionContextAttributes) obj;

        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getMfaAuthenticated() == null ^ this.getMfaAuthenticated() == null)
            return false;
        if (other.getMfaAuthenticated() != null
                && other.getMfaAuthenticated().equals(this.getMfaAuthenticated()) == false)
            return false;
        return true;
    }
}
