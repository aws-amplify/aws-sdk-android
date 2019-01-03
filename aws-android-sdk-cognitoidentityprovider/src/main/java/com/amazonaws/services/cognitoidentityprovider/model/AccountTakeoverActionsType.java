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
 * Account takeover actions type.
 * </p>
 */
public class AccountTakeoverActionsType implements Serializable {
    /**
     * <p>
     * Action to take for a low risk.
     * </p>
     */
    private AccountTakeoverActionType lowAction;

    /**
     * <p>
     * Action to take for a medium risk.
     * </p>
     */
    private AccountTakeoverActionType mediumAction;

    /**
     * <p>
     * Action to take for a high risk.
     * </p>
     */
    private AccountTakeoverActionType highAction;

    /**
     * <p>
     * Action to take for a low risk.
     * </p>
     *
     * @return <p>
     *         Action to take for a low risk.
     *         </p>
     */
    public AccountTakeoverActionType getLowAction() {
        return lowAction;
    }

    /**
     * <p>
     * Action to take for a low risk.
     * </p>
     *
     * @param lowAction <p>
     *            Action to take for a low risk.
     *            </p>
     */
    public void setLowAction(AccountTakeoverActionType lowAction) {
        this.lowAction = lowAction;
    }

    /**
     * <p>
     * Action to take for a low risk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lowAction <p>
     *            Action to take for a low risk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountTakeoverActionsType withLowAction(AccountTakeoverActionType lowAction) {
        this.lowAction = lowAction;
        return this;
    }

    /**
     * <p>
     * Action to take for a medium risk.
     * </p>
     *
     * @return <p>
     *         Action to take for a medium risk.
     *         </p>
     */
    public AccountTakeoverActionType getMediumAction() {
        return mediumAction;
    }

    /**
     * <p>
     * Action to take for a medium risk.
     * </p>
     *
     * @param mediumAction <p>
     *            Action to take for a medium risk.
     *            </p>
     */
    public void setMediumAction(AccountTakeoverActionType mediumAction) {
        this.mediumAction = mediumAction;
    }

    /**
     * <p>
     * Action to take for a medium risk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediumAction <p>
     *            Action to take for a medium risk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountTakeoverActionsType withMediumAction(AccountTakeoverActionType mediumAction) {
        this.mediumAction = mediumAction;
        return this;
    }

    /**
     * <p>
     * Action to take for a high risk.
     * </p>
     *
     * @return <p>
     *         Action to take for a high risk.
     *         </p>
     */
    public AccountTakeoverActionType getHighAction() {
        return highAction;
    }

    /**
     * <p>
     * Action to take for a high risk.
     * </p>
     *
     * @param highAction <p>
     *            Action to take for a high risk.
     *            </p>
     */
    public void setHighAction(AccountTakeoverActionType highAction) {
        this.highAction = highAction;
    }

    /**
     * <p>
     * Action to take for a high risk.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param highAction <p>
     *            Action to take for a high risk.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountTakeoverActionsType withHighAction(AccountTakeoverActionType highAction) {
        this.highAction = highAction;
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
        if (getLowAction() != null)
            sb.append("LowAction: " + getLowAction() + ",");
        if (getMediumAction() != null)
            sb.append("MediumAction: " + getMediumAction() + ",");
        if (getHighAction() != null)
            sb.append("HighAction: " + getHighAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLowAction() == null) ? 0 : getLowAction().hashCode());
        hashCode = prime * hashCode
                + ((getMediumAction() == null) ? 0 : getMediumAction().hashCode());
        hashCode = prime * hashCode + ((getHighAction() == null) ? 0 : getHighAction().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountTakeoverActionsType == false)
            return false;
        AccountTakeoverActionsType other = (AccountTakeoverActionsType) obj;

        if (other.getLowAction() == null ^ this.getLowAction() == null)
            return false;
        if (other.getLowAction() != null
                && other.getLowAction().equals(this.getLowAction()) == false)
            return false;
        if (other.getMediumAction() == null ^ this.getMediumAction() == null)
            return false;
        if (other.getMediumAction() != null
                && other.getMediumAction().equals(this.getMediumAction()) == false)
            return false;
        if (other.getHighAction() == null ^ this.getHighAction() == null)
            return false;
        if (other.getHighAction() != null
                && other.getHighAction().equals(this.getHighAction()) == false)
            return false;
        return true;
    }
}
