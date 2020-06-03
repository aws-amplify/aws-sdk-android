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

package com.amazonaws.services.iam.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the effect that Organizations has on a policy
 * simulation.
 * </p>
 */
public class OrganizationsDecisionDetail implements Serializable {
    /**
     * <p>
     * Specifies whether the simulated operation is allowed by the Organizations
     * service control policies that impact the simulated user's account.
     * </p>
     */
    private Boolean allowedByOrganizations;

    /**
     * <p>
     * Specifies whether the simulated operation is allowed by the Organizations
     * service control policies that impact the simulated user's account.
     * </p>
     *
     * @return <p>
     *         Specifies whether the simulated operation is allowed by the
     *         Organizations service control policies that impact the simulated
     *         user's account.
     *         </p>
     */
    public Boolean isAllowedByOrganizations() {
        return allowedByOrganizations;
    }

    /**
     * <p>
     * Specifies whether the simulated operation is allowed by the Organizations
     * service control policies that impact the simulated user's account.
     * </p>
     *
     * @return <p>
     *         Specifies whether the simulated operation is allowed by the
     *         Organizations service control policies that impact the simulated
     *         user's account.
     *         </p>
     */
    public Boolean getAllowedByOrganizations() {
        return allowedByOrganizations;
    }

    /**
     * <p>
     * Specifies whether the simulated operation is allowed by the Organizations
     * service control policies that impact the simulated user's account.
     * </p>
     *
     * @param allowedByOrganizations <p>
     *            Specifies whether the simulated operation is allowed by the
     *            Organizations service control policies that impact the
     *            simulated user's account.
     *            </p>
     */
    public void setAllowedByOrganizations(Boolean allowedByOrganizations) {
        this.allowedByOrganizations = allowedByOrganizations;
    }

    /**
     * <p>
     * Specifies whether the simulated operation is allowed by the Organizations
     * service control policies that impact the simulated user's account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedByOrganizations <p>
     *            Specifies whether the simulated operation is allowed by the
     *            Organizations service control policies that impact the
     *            simulated user's account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrganizationsDecisionDetail withAllowedByOrganizations(Boolean allowedByOrganizations) {
        this.allowedByOrganizations = allowedByOrganizations;
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
        if (getAllowedByOrganizations() != null)
            sb.append("AllowedByOrganizations: " + getAllowedByOrganizations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAllowedByOrganizations() == null) ? 0 : getAllowedByOrganizations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationsDecisionDetail == false)
            return false;
        OrganizationsDecisionDetail other = (OrganizationsDecisionDetail) obj;

        if (other.getAllowedByOrganizations() == null ^ this.getAllowedByOrganizations() == null)
            return false;
        if (other.getAllowedByOrganizations() != null
                && other.getAllowedByOrganizations().equals(this.getAllowedByOrganizations()) == false)
            return false;
        return true;
    }
}
