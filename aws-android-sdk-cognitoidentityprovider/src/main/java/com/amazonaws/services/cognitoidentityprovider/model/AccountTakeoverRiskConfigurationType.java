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
 * Configuration for mitigation actions and notification for different levels of
 * risk detected for a potential account takeover.
 * </p>
 */
public class AccountTakeoverRiskConfigurationType implements Serializable {
    /**
     * <p>
     * The notify configuration used to construct email notifications.
     * </p>
     */
    private NotifyConfigurationType notifyConfiguration;

    /**
     * <p>
     * Account takeover risk configuration actions
     * </p>
     */
    private AccountTakeoverActionsType actions;

    /**
     * <p>
     * The notify configuration used to construct email notifications.
     * </p>
     *
     * @return <p>
     *         The notify configuration used to construct email notifications.
     *         </p>
     */
    public NotifyConfigurationType getNotifyConfiguration() {
        return notifyConfiguration;
    }

    /**
     * <p>
     * The notify configuration used to construct email notifications.
     * </p>
     *
     * @param notifyConfiguration <p>
     *            The notify configuration used to construct email
     *            notifications.
     *            </p>
     */
    public void setNotifyConfiguration(NotifyConfigurationType notifyConfiguration) {
        this.notifyConfiguration = notifyConfiguration;
    }

    /**
     * <p>
     * The notify configuration used to construct email notifications.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param notifyConfiguration <p>
     *            The notify configuration used to construct email
     *            notifications.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountTakeoverRiskConfigurationType withNotifyConfiguration(
            NotifyConfigurationType notifyConfiguration) {
        this.notifyConfiguration = notifyConfiguration;
        return this;
    }

    /**
     * <p>
     * Account takeover risk configuration actions
     * </p>
     *
     * @return <p>
     *         Account takeover risk configuration actions
     *         </p>
     */
    public AccountTakeoverActionsType getActions() {
        return actions;
    }

    /**
     * <p>
     * Account takeover risk configuration actions
     * </p>
     *
     * @param actions <p>
     *            Account takeover risk configuration actions
     *            </p>
     */
    public void setActions(AccountTakeoverActionsType actions) {
        this.actions = actions;
    }

    /**
     * <p>
     * Account takeover risk configuration actions
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param actions <p>
     *            Account takeover risk configuration actions
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AccountTakeoverRiskConfigurationType withActions(AccountTakeoverActionsType actions) {
        this.actions = actions;
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
        if (getNotifyConfiguration() != null)
            sb.append("NotifyConfiguration: " + getNotifyConfiguration() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNotifyConfiguration() == null) ? 0 : getNotifyConfiguration().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountTakeoverRiskConfigurationType == false)
            return false;
        AccountTakeoverRiskConfigurationType other = (AccountTakeoverRiskConfigurationType) obj;

        if (other.getNotifyConfiguration() == null ^ this.getNotifyConfiguration() == null)
            return false;
        if (other.getNotifyConfiguration() != null
                && other.getNotifyConfiguration().equals(this.getNotifyConfiguration()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        return true;
    }
}
