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

public class GetUserSettingsResult implements Serializable {
    /**
     * <p>
     * The user settings.
     * </p>
     */
    private UserSettings userSettings;

    /**
     * <p>
     * The user settings.
     * </p>
     *
     * @return <p>
     *         The user settings.
     *         </p>
     */
    public UserSettings getUserSettings() {
        return userSettings;
    }

    /**
     * <p>
     * The user settings.
     * </p>
     *
     * @param userSettings <p>
     *            The user settings.
     *            </p>
     */
    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    /**
     * <p>
     * The user settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userSettings <p>
     *            The user settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetUserSettingsResult withUserSettings(UserSettings userSettings) {
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
        if (getUserSettings() != null)
            sb.append("UserSettings: " + getUserSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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

        if (obj instanceof GetUserSettingsResult == false)
            return false;
        GetUserSettingsResult other = (GetUserSettingsResult) obj;

        if (other.getUserSettings() == null ^ this.getUserSettings() == null)
            return false;
        if (other.getUserSettings() != null
                && other.getUserSettings().equals(this.getUserSettings()) == false)
            return false;
        return true;
    }
}
