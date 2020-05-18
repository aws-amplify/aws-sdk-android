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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the settings for the specified user, such as phone number settings.
 * </p>
 */
public class UpdateUserSettingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * The user ID.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The user settings to update.
     * </p>
     */
    private UserSettings userSettings;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime account ID.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountId <p>
     *            The Amazon Chime account ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserSettingsRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     *
     * @return <p>
     *         The user ID.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     *
     * @param userId <p>
     *            The user ID.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userId <p>
     *            The user ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserSettingsRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * <p>
     * The user settings to update.
     * </p>
     *
     * @return <p>
     *         The user settings to update.
     *         </p>
     */
    public UserSettings getUserSettings() {
        return userSettings;
    }

    /**
     * <p>
     * The user settings to update.
     * </p>
     *
     * @param userSettings <p>
     *            The user settings to update.
     *            </p>
     */
    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    /**
     * <p>
     * The user settings to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userSettings <p>
     *            The user settings to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserSettingsRequest withUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId() + ",");
        if (getUserSettings() != null)
            sb.append("UserSettings: " + getUserSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode
                + ((getUserSettings() == null) ? 0 : getUserSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserSettingsRequest == false)
            return false;
        UpdateUserSettingsRequest other = (UpdateUserSettingsRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserSettings() == null ^ this.getUserSettings() == null)
            return false;
        if (other.getUserSettings() != null
                && other.getUserSettings().equals(this.getUserSettings()) == false)
            return false;
        return true;
    }
}
