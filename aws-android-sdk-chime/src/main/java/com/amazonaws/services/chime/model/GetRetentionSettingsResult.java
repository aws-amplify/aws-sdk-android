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

public class GetRetentionSettingsResult implements Serializable {
    /**
     * <p>
     * The retention settings.
     * </p>
     */
    private RetentionSettings retentionSettings;

    /**
     * <p>
     * The timestamp representing the time at which the specified items are
     * permanently deleted, in ISO 8601 format.
     * </p>
     */
    private java.util.Date initiateDeletionTimestamp;

    /**
     * <p>
     * The retention settings.
     * </p>
     *
     * @return <p>
     *         The retention settings.
     *         </p>
     */
    public RetentionSettings getRetentionSettings() {
        return retentionSettings;
    }

    /**
     * <p>
     * The retention settings.
     * </p>
     *
     * @param retentionSettings <p>
     *            The retention settings.
     *            </p>
     */
    public void setRetentionSettings(RetentionSettings retentionSettings) {
        this.retentionSettings = retentionSettings;
    }

    /**
     * <p>
     * The retention settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retentionSettings <p>
     *            The retention settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRetentionSettingsResult withRetentionSettings(RetentionSettings retentionSettings) {
        this.retentionSettings = retentionSettings;
        return this;
    }

    /**
     * <p>
     * The timestamp representing the time at which the specified items are
     * permanently deleted, in ISO 8601 format.
     * </p>
     *
     * @return <p>
     *         The timestamp representing the time at which the specified items
     *         are permanently deleted, in ISO 8601 format.
     *         </p>
     */
    public java.util.Date getInitiateDeletionTimestamp() {
        return initiateDeletionTimestamp;
    }

    /**
     * <p>
     * The timestamp representing the time at which the specified items are
     * permanently deleted, in ISO 8601 format.
     * </p>
     *
     * @param initiateDeletionTimestamp <p>
     *            The timestamp representing the time at which the specified
     *            items are permanently deleted, in ISO 8601 format.
     *            </p>
     */
    public void setInitiateDeletionTimestamp(java.util.Date initiateDeletionTimestamp) {
        this.initiateDeletionTimestamp = initiateDeletionTimestamp;
    }

    /**
     * <p>
     * The timestamp representing the time at which the specified items are
     * permanently deleted, in ISO 8601 format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiateDeletionTimestamp <p>
     *            The timestamp representing the time at which the specified
     *            items are permanently deleted, in ISO 8601 format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRetentionSettingsResult withInitiateDeletionTimestamp(
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
        if (getRetentionSettings() != null)
            sb.append("RetentionSettings: " + getRetentionSettings() + ",");
        if (getInitiateDeletionTimestamp() != null)
            sb.append("InitiateDeletionTimestamp: " + getInitiateDeletionTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRetentionSettings() == null) ? 0 : getRetentionSettings().hashCode());
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

        if (obj instanceof GetRetentionSettingsResult == false)
            return false;
        GetRetentionSettingsResult other = (GetRetentionSettingsResult) obj;

        if (other.getRetentionSettings() == null ^ this.getRetentionSettings() == null)
            return false;
        if (other.getRetentionSettings() != null
                && other.getRetentionSettings().equals(this.getRetentionSettings()) == false)
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
