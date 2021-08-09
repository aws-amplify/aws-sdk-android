/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

public class PutAppInstanceRetentionSettingsResult implements Serializable {
    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     */
    private AppInstanceRetentionSettings appInstanceRetentionSettings;

    /**
     * <p>
     * The time at which the API deletes data.
     * </p>
     */
    private java.util.Date initiateDeletionTimestamp;

    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     *
     * @return <p>
     *         The time in days to retain data. Data type: number.
     *         </p>
     */
    public AppInstanceRetentionSettings getAppInstanceRetentionSettings() {
        return appInstanceRetentionSettings;
    }

    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     *
     * @param appInstanceRetentionSettings <p>
     *            The time in days to retain data. Data type: number.
     *            </p>
     */
    public void setAppInstanceRetentionSettings(
            AppInstanceRetentionSettings appInstanceRetentionSettings) {
        this.appInstanceRetentionSettings = appInstanceRetentionSettings;
    }

    /**
     * <p>
     * The time in days to retain data. Data type: number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstanceRetentionSettings <p>
     *            The time in days to retain data. Data type: number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAppInstanceRetentionSettingsResult withAppInstanceRetentionSettings(
            AppInstanceRetentionSettings appInstanceRetentionSettings) {
        this.appInstanceRetentionSettings = appInstanceRetentionSettings;
        return this;
    }

    /**
     * <p>
     * The time at which the API deletes data.
     * </p>
     *
     * @return <p>
     *         The time at which the API deletes data.
     *         </p>
     */
    public java.util.Date getInitiateDeletionTimestamp() {
        return initiateDeletionTimestamp;
    }

    /**
     * <p>
     * The time at which the API deletes data.
     * </p>
     *
     * @param initiateDeletionTimestamp <p>
     *            The time at which the API deletes data.
     *            </p>
     */
    public void setInitiateDeletionTimestamp(java.util.Date initiateDeletionTimestamp) {
        this.initiateDeletionTimestamp = initiateDeletionTimestamp;
    }

    /**
     * <p>
     * The time at which the API deletes data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiateDeletionTimestamp <p>
     *            The time at which the API deletes data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutAppInstanceRetentionSettingsResult withInitiateDeletionTimestamp(
            java.util.Date initiateDeletionTimestamp) {
        this.initiateDeletionTimestamp = initiateDeletionTimestamp;
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
        if (getAppInstanceRetentionSettings() != null)
            sb.append("AppInstanceRetentionSettings: " + getAppInstanceRetentionSettings() + ",");
        if (getInitiateDeletionTimestamp() != null)
            sb.append("InitiateDeletionTimestamp: " + getInitiateDeletionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAppInstanceRetentionSettings() == null) ? 0
                        : getAppInstanceRetentionSettings().hashCode());
        hashCode = prime
                * hashCode
                + ((getInitiateDeletionTimestamp() == null) ? 0 : getInitiateDeletionTimestamp()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAppInstanceRetentionSettingsResult == false)
            return false;
        PutAppInstanceRetentionSettingsResult other = (PutAppInstanceRetentionSettingsResult) obj;

        if (other.getAppInstanceRetentionSettings() == null
                ^ this.getAppInstanceRetentionSettings() == null)
            return false;
        if (other.getAppInstanceRetentionSettings() != null
                && other.getAppInstanceRetentionSettings().equals(
                        this.getAppInstanceRetentionSettings()) == false)
            return false;
        if (other.getInitiateDeletionTimestamp() == null
                ^ this.getInitiateDeletionTimestamp() == null)
            return false;
        if (other.getInitiateDeletionTimestamp() != null
                && other.getInitiateDeletionTimestamp().equals(this.getInitiateDeletionTimestamp()) == false)
            return false;
        return true;
    }
}
