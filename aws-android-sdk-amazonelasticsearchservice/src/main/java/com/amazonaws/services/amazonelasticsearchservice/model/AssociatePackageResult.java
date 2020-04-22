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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Container for response returned by <code> <a>AssociatePackage</a> </code>
 * operation.
 * </p>
 */
public class AssociatePackageResult implements Serializable {
    /**
     * <p>
     * <code>DomainPackageDetails</code>
     * </p>
     */
    private DomainPackageDetails domainPackageDetails;

    /**
     * <p>
     * <code>DomainPackageDetails</code>
     * </p>
     *
     * @return <p>
     *         <code>DomainPackageDetails</code>
     *         </p>
     */
    public DomainPackageDetails getDomainPackageDetails() {
        return domainPackageDetails;
    }

    /**
     * <p>
     * <code>DomainPackageDetails</code>
     * </p>
     *
     * @param domainPackageDetails <p>
     *            <code>DomainPackageDetails</code>
     *            </p>
     */
    public void setDomainPackageDetails(DomainPackageDetails domainPackageDetails) {
        this.domainPackageDetails = domainPackageDetails;
    }

    /**
     * <p>
     * <code>DomainPackageDetails</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domainPackageDetails <p>
     *            <code>DomainPackageDetails</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssociatePackageResult withDomainPackageDetails(DomainPackageDetails domainPackageDetails) {
        this.domainPackageDetails = domainPackageDetails;
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
        if (getDomainPackageDetails() != null)
            sb.append("DomainPackageDetails: " + getDomainPackageDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainPackageDetails() == null) ? 0 : getDomainPackageDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociatePackageResult == false)
            return false;
        AssociatePackageResult other = (AssociatePackageResult) obj;

        if (other.getDomainPackageDetails() == null ^ this.getDomainPackageDetails() == null)
            return false;
        if (other.getDomainPackageDetails() != null
                && other.getDomainPackageDetails().equals(this.getDomainPackageDetails()) == false)
            return false;
        return true;
    }
}
