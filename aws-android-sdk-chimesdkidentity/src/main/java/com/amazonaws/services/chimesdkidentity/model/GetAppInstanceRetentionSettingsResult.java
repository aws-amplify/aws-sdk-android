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

public class GetAppInstanceRetentionSettingsResult implements Serializable {
    /**
     * <p>
     * The retention settings for the <code>AppInstance</code>.
     * </p>
     */
    private AppInstanceRetentionSettings appInstanceRetentionSettings;

    /**
     * <p>
     * The timestamp representing the time at which the specified items are
     * retained, in Epoch Seconds.
     * </p>
     */
    private java.util.Date initiateDeletionTimestamp;

    /**
     * <p>
     * The retention settings for the <code>AppInstance</code>.
     * </p>
     *
     * @return <p>
     *         The retention settings for the <code>AppInstance</code>.
     *         </p>
     */
    public AppInstanceRetentionSettings getAppInstanceRetentionSettings() {
        return appInstanceRetentionSettings;
    }

    /**
     * <p>
     * The retention settings for the <code>AppInstance</code>.
     * </p>
     *
     * @param appInstanceRetentionSettings <p>
     *            The retention settings for the <code>AppInstance</code>.
     *            </p>
     */
    public void setAppInstanceRetentionSettings(
            AppInstanceRetentionSettings appInstanceRetentionSettings) {
        this.appInstanceRetentionSettings = appInstanceRetentionSettings;
    }

    /**
     * <p>
     * The retention settings for the <code>AppInstance</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param appInstanceRetentionSettings <p>
     *            The retention settings for the <code>AppInstance</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAppInstanceRetentionSettingsResult withAppInstanceRetentionSettings(
            AppInstanceRetentionSettings appInstanceRetentionSettings) {
        this.appInstanceRetentionSettings = appInstanceRetentionSettings;
        return this;
    }

    /**
     * <p>
     * The timestamp representing the time at which the specified items are
     * retained, in Epoch Seconds.
     * </p>
     *
     * @return <p>
     *         The timestamp representing the time at which the specified items
     *         are retained, in Epoch Seconds.
     *         </p>
     */
    public java.util.Date getInitiateDeletionTimestamp() {
        return initiateDeletionTimestamp;
    }

    /**
     * <p>
     * The timestamp representing the time at which the specified items are
     * retained, in Epoch Seconds.
     * </p>
     *
     * @param initiateDeletionTimestamp <p>
     *            The timestamp representing the time at which the specified
     *            items are retained, in Epoch Seconds.
     *            </p>
     */
    public void setInitiateDeletionTimestamp(java.util.Date initiateDeletionTimestamp) {
        this.initiateDeletionTimestamp = initiateDeletionTimestamp;
    }

    /**
     * <p>
     * The timestamp representing the time at which the specified items are
     * retained, in Epoch Seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiateDeletionTimestamp <p>
     *            The timestamp representing the time at which the specified
     *            items are retained, in Epoch Seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAppInstanceRetentionSettingsResult withInitiateDeletionTimestamp(
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

        if (obj instanceof GetAppInstanceRetentionSettingsResult == false)
            return false;
        GetAppInstanceRetentionSettingsResult other = (GetAppInstanceRetentionSettingsResult) obj;

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
