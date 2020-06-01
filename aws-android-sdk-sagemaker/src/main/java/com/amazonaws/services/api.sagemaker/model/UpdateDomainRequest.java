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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the default settings for new user profiles in the domain.
 * </p>
 */
public class UpdateDomainRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     */
    private String domainId;

    /**
     * <p>
     * A collection of settings.
     * </p>
     */
    private UserSettings defaultUserSettings;

    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @return <p>
     *         The ID of the domain to be updated.
     *         </p>
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainId <p>
     *            The ID of the domain to be updated.
     *            </p>
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The ID of the domain to be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 63<br/>
     *
     * @param domainId <p>
     *            The ID of the domain to be updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     *
     * @return <p>
     *         A collection of settings.
     *         </p>
     */
    public UserSettings getDefaultUserSettings() {
        return defaultUserSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     *
     * @param defaultUserSettings <p>
     *            A collection of settings.
     *            </p>
     */
    public void setDefaultUserSettings(UserSettings defaultUserSettings) {
        this.defaultUserSettings = defaultUserSettings;
    }

    /**
     * <p>
     * A collection of settings.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultUserSettings <p>
     *            A collection of settings.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateDomainRequest withDefaultUserSettings(UserSettings defaultUserSettings) {
        this.defaultUserSettings = defaultUserSettings;
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
        if (getDomainId() != null)
            sb.append("DomainId: " + getDomainId() + ",");
        if (getDefaultUserSettings() != null)
            sb.append("DefaultUserSettings: " + getDefaultUserSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultUserSettings() == null) ? 0 : getDefaultUserSettings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainRequest == false)
            return false;
        UpdateDomainRequest other = (UpdateDomainRequest) obj;

        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getDefaultUserSettings() == null ^ this.getDefaultUserSettings() == null)
            return false;
        if (other.getDefaultUserSettings() != null
                && other.getDefaultUserSettings().equals(this.getDefaultUserSettings()) == false)
            return false;
        return true;
    }
}
