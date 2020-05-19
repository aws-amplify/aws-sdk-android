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

package com.amazonaws.services.health.model;

import java.io.Serializable;

public class DescribeHealthServiceStatusForOrganizationResult implements Serializable {
    /**
     * <p>
     * Information about the status of enabling or disabling AWS Health
     * Organizational View in your organization.
     * </p>
     * <p>
     * Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     * </p>
     */
    private String healthServiceAccessStatusForOrganization;

    /**
     * <p>
     * Information about the status of enabling or disabling AWS Health
     * Organizational View in your organization.
     * </p>
     * <p>
     * Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     * </p>
     *
     * @return <p>
     *         Information about the status of enabling or disabling AWS Health
     *         Organizational View in your organization.
     *         </p>
     *         <p>
     *         Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     *         </p>
     */
    public String getHealthServiceAccessStatusForOrganization() {
        return healthServiceAccessStatusForOrganization;
    }

    /**
     * <p>
     * Information about the status of enabling or disabling AWS Health
     * Organizational View in your organization.
     * </p>
     * <p>
     * Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     * </p>
     *
     * @param healthServiceAccessStatusForOrganization <p>
     *            Information about the status of enabling or disabling AWS
     *            Health Organizational View in your organization.
     *            </p>
     *            <p>
     *            Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     *            </p>
     */
    public void setHealthServiceAccessStatusForOrganization(
            String healthServiceAccessStatusForOrganization) {
        this.healthServiceAccessStatusForOrganization = healthServiceAccessStatusForOrganization;
    }

    /**
     * <p>
     * Information about the status of enabling or disabling AWS Health
     * Organizational View in your organization.
     * </p>
     * <p>
     * Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthServiceAccessStatusForOrganization <p>
     *            Information about the status of enabling or disabling AWS
     *            Health Organizational View in your organization.
     *            </p>
     *            <p>
     *            Valid values are <code>ENABLED | DISABLED | PENDING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeHealthServiceStatusForOrganizationResult withHealthServiceAccessStatusForOrganization(
            String healthServiceAccessStatusForOrganization) {
        this.healthServiceAccessStatusForOrganization = healthServiceAccessStatusForOrganization;
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
        if (getHealthServiceAccessStatusForOrganization() != null)
            sb.append("healthServiceAccessStatusForOrganization: "
                    + getHealthServiceAccessStatusForOrganization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHealthServiceAccessStatusForOrganization() == null) ? 0
                        : getHealthServiceAccessStatusForOrganization().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeHealthServiceStatusForOrganizationResult == false)
            return false;
        DescribeHealthServiceStatusForOrganizationResult other = (DescribeHealthServiceStatusForOrganizationResult) obj;

        if (other.getHealthServiceAccessStatusForOrganization() == null
                ^ this.getHealthServiceAccessStatusForOrganization() == null)
            return false;
        if (other.getHealthServiceAccessStatusForOrganization() != null
                && other.getHealthServiceAccessStatusForOrganization().equals(
                        this.getHealthServiceAccessStatusForOrganization()) == false)
            return false;
        return true;
    }
}
