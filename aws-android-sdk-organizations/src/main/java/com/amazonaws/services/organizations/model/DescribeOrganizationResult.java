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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

public class DescribeOrganizationResult implements Serializable {
    /**
     * <p>
     * A structure that contains information about the organization.
     * </p>
     */
    private Organization organization;

    /**
     * <p>
     * A structure that contains information about the organization.
     * </p>
     *
     * @return <p>
     *         A structure that contains information about the organization.
     *         </p>
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * <p>
     * A structure that contains information about the organization.
     * </p>
     *
     * @param organization <p>
     *            A structure that contains information about the organization.
     *            </p>
     */
    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    /**
     * <p>
     * A structure that contains information about the organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organization <p>
     *            A structure that contains information about the organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeOrganizationResult withOrganization(Organization organization) {
        this.organization = organization;
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
        if (getOrganization() != null)
            sb.append("Organization: " + getOrganization());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOrganization() == null) ? 0 : getOrganization().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeOrganizationResult == false)
            return false;
        DescribeOrganizationResult other = (DescribeOrganizationResult) obj;

        if (other.getOrganization() == null ^ this.getOrganization() == null)
            return false;
        if (other.getOrganization() != null
                && other.getOrganization().equals(this.getOrganization()) == false)
            return false;
        return true;
    }
}
