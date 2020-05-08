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

package com.amazonaws.services.guardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the delegated administrator account with the values provided.
 * </p>
 */
public class UpdateOrganizationConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the detector to update the delegated administrator for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * Indicates whether to automatically enable member accounts in the
     * organization.
     * </p>
     */
    private Boolean autoEnable;

    /**
     * <p>
     * The ID of the detector to update the delegated administrator for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The ID of the detector to update the delegated administrator for.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The ID of the detector to update the delegated administrator for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector to update the delegated administrator
     *            for.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector to update the delegated administrator for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector to update the delegated administrator
     *            for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOrganizationConfigurationRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * Indicates whether to automatically enable member accounts in the
     * organization.
     * </p>
     *
     * @return <p>
     *         Indicates whether to automatically enable member accounts in the
     *         organization.
     *         </p>
     */
    public Boolean isAutoEnable() {
        return autoEnable;
    }

    /**
     * <p>
     * Indicates whether to automatically enable member accounts in the
     * organization.
     * </p>
     *
     * @return <p>
     *         Indicates whether to automatically enable member accounts in the
     *         organization.
     *         </p>
     */
    public Boolean getAutoEnable() {
        return autoEnable;
    }

    /**
     * <p>
     * Indicates whether to automatically enable member accounts in the
     * organization.
     * </p>
     *
     * @param autoEnable <p>
     *            Indicates whether to automatically enable member accounts in
     *            the organization.
     *            </p>
     */
    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    /**
     * <p>
     * Indicates whether to automatically enable member accounts in the
     * organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoEnable <p>
     *            Indicates whether to automatically enable member accounts in
     *            the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateOrganizationConfigurationRequest withAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getAutoEnable() != null)
            sb.append("AutoEnable: " + getAutoEnable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode + ((getAutoEnable() == null) ? 0 : getAutoEnable().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOrganizationConfigurationRequest == false)
            return false;
        UpdateOrganizationConfigurationRequest other = (UpdateOrganizationConfigurationRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getAutoEnable() == null ^ this.getAutoEnable() == null)
            return false;
        if (other.getAutoEnable() != null
                && other.getAutoEnable().equals(this.getAutoEnable()) == false)
            return false;
        return true;
    }
}
