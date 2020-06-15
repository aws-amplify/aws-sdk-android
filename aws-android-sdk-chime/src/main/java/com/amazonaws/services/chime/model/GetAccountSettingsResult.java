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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

public class GetAccountSettingsResult implements Serializable {
    /**
     * <p>
     * The Amazon Chime account settings.
     * </p>
     */
    private AccountSettings accountSettings;

    /**
     * <p>
     * The Amazon Chime account settings.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime account settings.
     *         </p>
     */
    public AccountSettings getAccountSettings() {
        return accountSettings;
    }

    /**
     * <p>
     * The Amazon Chime account settings.
     * </p>
     *
     * @param accountSettings <p>
     *            The Amazon Chime account settings.
     *            </p>
     */
    public void setAccountSettings(AccountSettings accountSettings) {
        this.accountSettings = accountSettings;
    }

    /**
     * <p>
     * The Amazon Chime account settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountSettings <p>
     *            The Amazon Chime account settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAccountSettingsResult withAccountSettings(AccountSettings accountSettings) {
        this.accountSettings = accountSettings;
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
        if (getAccountSettings() != null)
            sb.append("AccountSettings: " + getAccountSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAccountSettings() == null) ? 0 : getAccountSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountSettingsResult == false)
            return false;
        GetAccountSettingsResult other = (GetAccountSettingsResult) obj;

        if (other.getAccountSettings() == null ^ this.getAccountSettings() == null)
            return false;
        if (other.getAccountSettings() != null
                && other.getAccountSettings().equals(this.getAccountSettings()) == false)
            return false;
        return true;
    }
}
