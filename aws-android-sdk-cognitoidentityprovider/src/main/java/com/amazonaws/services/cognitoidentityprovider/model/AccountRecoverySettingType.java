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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

/**
 * <p>
 * The data type for <code>AccountRecoverySetting</code>.
 * </p>
 */
public class AccountRecoverySettingType implements Serializable {
    /**
     * <p>
     * The list of <code>RecoveryOptionTypes</code>.
     * </p>
     */
    private java.util.List<RecoveryOptionType> recoveryMechanisms;

    /**
     * <p>
     * The list of <code>RecoveryOptionTypes</code>.
     * </p>
     *
     * @return <p>
     *         The list of <code>RecoveryOptionTypes</code>.
     *         </p>
     */
    public java.util.List<RecoveryOptionType> getRecoveryMechanisms() {
        return recoveryMechanisms;
    }

    /**
     * <p>
     * The list of <code>RecoveryOptionTypes</code>.
     * </p>
     *
     * @param recoveryMechanisms <p>
     *            The list of <code>RecoveryOptionTypes</code>.
     *            </p>
     */
    public void setRecoveryMechanisms(java.util.Collection<RecoveryOptionType> recoveryMechanisms) {
        if (recoveryMechanisms == null) {
            this.recoveryMechanisms = null;
            return;
        }

        this.recoveryMechanisms = new java.util.ArrayList<RecoveryOptionType>(recoveryMechanisms);
    }

    /**
     * <p>
     * The list of <code>RecoveryOptionTypes</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recoveryMechanisms <p>
     *            The list of <code>RecoveryOptionTypes</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountRecoverySettingType withRecoveryMechanisms(
            RecoveryOptionType... recoveryMechanisms) {
        if (getRecoveryMechanisms() == null) {
            this.recoveryMechanisms = new java.util.ArrayList<RecoveryOptionType>(
                    recoveryMechanisms.length);
        }
        for (RecoveryOptionType value : recoveryMechanisms) {
            this.recoveryMechanisms.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>RecoveryOptionTypes</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recoveryMechanisms <p>
     *            The list of <code>RecoveryOptionTypes</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountRecoverySettingType withRecoveryMechanisms(
            java.util.Collection<RecoveryOptionType> recoveryMechanisms) {
        setRecoveryMechanisms(recoveryMechanisms);
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
        if (getRecoveryMechanisms() != null)
            sb.append("RecoveryMechanisms: " + getRecoveryMechanisms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecoveryMechanisms() == null) ? 0 : getRecoveryMechanisms().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountRecoverySettingType == false)
            return false;
        AccountRecoverySettingType other = (AccountRecoverySettingType) obj;

        if (other.getRecoveryMechanisms() == null ^ this.getRecoveryMechanisms() == null)
            return false;
        if (other.getRecoveryMechanisms() != null
                && other.getRecoveryMechanisms().equals(this.getRecoveryMechanisms()) == false)
            return false;
        return true;
    }
}
