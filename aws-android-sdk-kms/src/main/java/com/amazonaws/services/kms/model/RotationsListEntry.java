/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about completed key material rotations.
 * </p>
 */
public class RotationsListEntry implements Serializable {
    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     */
    private String keyId;

    /**
     * <p>
     * Date and time that the key material rotation completed. Formatted as Unix
     * time.
     * </p>
     */
    private java.util.Date rotationDate;

    /**
     * <p>
     * Identifies whether the key material rotation was a scheduled <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     * >automatic rotation</a> or an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     * >on-demand rotation</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, ON_DEMAND
     */
    private String rotationType;

    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @return <p>
     *         Unique identifier of the key.
     *         </p>
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Unique identifier of the key.
     *            </p>
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     *
     * @param keyId <p>
     *            Unique identifier of the key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RotationsListEntry withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * <p>
     * Date and time that the key material rotation completed. Formatted as Unix
     * time.
     * </p>
     *
     * @return <p>
     *         Date and time that the key material rotation completed. Formatted
     *         as Unix time.
     *         </p>
     */
    public java.util.Date getRotationDate() {
        return rotationDate;
    }

    /**
     * <p>
     * Date and time that the key material rotation completed. Formatted as Unix
     * time.
     * </p>
     *
     * @param rotationDate <p>
     *            Date and time that the key material rotation completed.
     *            Formatted as Unix time.
     *            </p>
     */
    public void setRotationDate(java.util.Date rotationDate) {
        this.rotationDate = rotationDate;
    }

    /**
     * <p>
     * Date and time that the key material rotation completed. Formatted as Unix
     * time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param rotationDate <p>
     *            Date and time that the key material rotation completed.
     *            Formatted as Unix time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RotationsListEntry withRotationDate(java.util.Date rotationDate) {
        this.rotationDate = rotationDate;
        return this;
    }

    /**
     * <p>
     * Identifies whether the key material rotation was a scheduled <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     * >automatic rotation</a> or an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     * >on-demand rotation</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, ON_DEMAND
     *
     * @return <p>
     *         Identifies whether the key material rotation was a scheduled <a
     *         href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     *         >automatic rotation</a> or an <a href=
     *         "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     *         >on-demand rotation</a>.
     *         </p>
     * @see RotationType
     */
    public String getRotationType() {
        return rotationType;
    }

    /**
     * <p>
     * Identifies whether the key material rotation was a scheduled <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     * >automatic rotation</a> or an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     * >on-demand rotation</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, ON_DEMAND
     *
     * @param rotationType <p>
     *            Identifies whether the key material rotation was a scheduled
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     *            >automatic rotation</a> or an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     *            >on-demand rotation</a>.
     *            </p>
     * @see RotationType
     */
    public void setRotationType(String rotationType) {
        this.rotationType = rotationType;
    }

    /**
     * <p>
     * Identifies whether the key material rotation was a scheduled <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     * >automatic rotation</a> or an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     * >on-demand rotation</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, ON_DEMAND
     *
     * @param rotationType <p>
     *            Identifies whether the key material rotation was a scheduled
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     *            >automatic rotation</a> or an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     *            >on-demand rotation</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RotationType
     */
    public RotationsListEntry withRotationType(String rotationType) {
        this.rotationType = rotationType;
        return this;
    }

    /**
     * <p>
     * Identifies whether the key material rotation was a scheduled <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     * >automatic rotation</a> or an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     * >on-demand rotation</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, ON_DEMAND
     *
     * @param rotationType <p>
     *            Identifies whether the key material rotation was a scheduled
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     *            >automatic rotation</a> or an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     *            >on-demand rotation</a>.
     *            </p>
     * @see RotationType
     */
    public void setRotationType(RotationType rotationType) {
        this.rotationType = rotationType.toString();
    }

    /**
     * <p>
     * Identifies whether the key material rotation was a scheduled <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     * >automatic rotation</a> or an <a href=
     * "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     * >on-demand rotation</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AUTOMATIC, ON_DEMAND
     *
     * @param rotationType <p>
     *            Identifies whether the key material rotation was a scheduled
     *            <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-enable-disable"
     *            >automatic rotation</a> or an <a href=
     *            "https://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html#rotating-keys-on-demand"
     *            >on-demand rotation</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RotationType
     */
    public RotationsListEntry withRotationType(RotationType rotationType) {
        this.rotationType = rotationType.toString();
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getRotationDate() != null)
            sb.append("RotationDate: " + getRotationDate() + ",");
        if (getRotationType() != null)
            sb.append("RotationType: " + getRotationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getRotationDate() == null) ? 0 : getRotationDate().hashCode());
        hashCode = prime * hashCode
                + ((getRotationType() == null) ? 0 : getRotationType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RotationsListEntry == false)
            return false;
        RotationsListEntry other = (RotationsListEntry) obj;

        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getRotationDate() == null ^ this.getRotationDate() == null)
            return false;
        if (other.getRotationDate() != null
                && other.getRotationDate().equals(this.getRotationDate()) == false)
            return false;
        if (other.getRotationType() == null ^ this.getRotationType() == null)
            return false;
        if (other.getRotationType() != null
                && other.getRotationType().equals(this.getRotationType()) == false)
            return false;
        return true;
    }
}
