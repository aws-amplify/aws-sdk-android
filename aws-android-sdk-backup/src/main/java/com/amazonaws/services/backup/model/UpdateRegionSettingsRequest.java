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

package com.amazonaws.services.backup.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the current service opt-in settings for the Region. If the service
 * has a value set to <code>true</code>, AWS Backup attempts to protect that
 * service's resources in this Region, when included in an on-demand backup or
 * scheduled backup plan. If the value is set to <code>false</code> for a
 * service, AWS Backup does not attempt to protect that service's resources in
 * this Region.
 * </p>
 */
public class UpdateRegionSettingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Updates the list of services along with the opt-in preferences for the
     * region.
     * </p>
     */
    private java.util.Map<String, Boolean> resourceTypeOptInPreference;

    /**
     * <p>
     * Updates the list of services along with the opt-in preferences for the
     * region.
     * </p>
     *
     * @return <p>
     *         Updates the list of services along with the opt-in preferences
     *         for the region.
     *         </p>
     */
    public java.util.Map<String, Boolean> getResourceTypeOptInPreference() {
        return resourceTypeOptInPreference;
    }

    /**
     * <p>
     * Updates the list of services along with the opt-in preferences for the
     * region.
     * </p>
     *
     * @param resourceTypeOptInPreference <p>
     *            Updates the list of services along with the opt-in preferences
     *            for the region.
     *            </p>
     */
    public void setResourceTypeOptInPreference(
            java.util.Map<String, Boolean> resourceTypeOptInPreference) {
        this.resourceTypeOptInPreference = resourceTypeOptInPreference;
    }

    /**
     * <p>
     * Updates the list of services along with the opt-in preferences for the
     * region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceTypeOptInPreference <p>
     *            Updates the list of services along with the opt-in preferences
     *            for the region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRegionSettingsRequest withResourceTypeOptInPreference(
            java.util.Map<String, Boolean> resourceTypeOptInPreference) {
        this.resourceTypeOptInPreference = resourceTypeOptInPreference;
        return this;
    }

    /**
     * <p>
     * Updates the list of services along with the opt-in preferences for the
     * region.
     * </p>
     * <p>
     * The method adds a new key-value pair into ResourceTypeOptInPreference
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            ResourceTypeOptInPreference.
     * @param value The corresponding value of the entry to be added into
     *            ResourceTypeOptInPreference.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRegionSettingsRequest addResourceTypeOptInPreferenceEntry(String key, Boolean value) {
        if (null == this.resourceTypeOptInPreference) {
            this.resourceTypeOptInPreference = new java.util.HashMap<String, Boolean>();
        }
        if (this.resourceTypeOptInPreference.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.resourceTypeOptInPreference.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResourceTypeOptInPreference.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdateRegionSettingsRequest clearResourceTypeOptInPreferenceEntries() {
        this.resourceTypeOptInPreference = null;
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
        if (getResourceTypeOptInPreference() != null)
            sb.append("ResourceTypeOptInPreference: " + getResourceTypeOptInPreference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceTypeOptInPreference() == null) ? 0
                        : getResourceTypeOptInPreference().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRegionSettingsRequest == false)
            return false;
        UpdateRegionSettingsRequest other = (UpdateRegionSettingsRequest) obj;

        if (other.getResourceTypeOptInPreference() == null
                ^ this.getResourceTypeOptInPreference() == null)
            return false;
        if (other.getResourceTypeOptInPreference() != null
                && other.getResourceTypeOptInPreference().equals(
                        this.getResourceTypeOptInPreference()) == false)
            return false;
        return true;
    }
}
