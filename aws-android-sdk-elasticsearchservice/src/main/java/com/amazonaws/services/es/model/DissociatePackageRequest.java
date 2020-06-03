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

package com.amazonaws.services.es.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Dissociates a package from the Amazon ES domain.
 * </p>
 */
public class DissociatePackageRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Internal ID of the package that you want to associate with a domain. Use
     * <code>DescribePackages</code> to find this value.
     * </p>
     */
    private String packageID;

    /**
     * <p>
     * Name of the domain that you want to associate the package with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * <p>
     * Internal ID of the package that you want to associate with a domain. Use
     * <code>DescribePackages</code> to find this value.
     * </p>
     *
     * @return <p>
     *         Internal ID of the package that you want to associate with a
     *         domain. Use <code>DescribePackages</code> to find this value.
     *         </p>
     */
    public String getPackageID() {
        return packageID;
    }

    /**
     * <p>
     * Internal ID of the package that you want to associate with a domain. Use
     * <code>DescribePackages</code> to find this value.
     * </p>
     *
     * @param packageID <p>
     *            Internal ID of the package that you want to associate with a
     *            domain. Use <code>DescribePackages</code> to find this value.
     *            </p>
     */
    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    /**
     * <p>
     * Internal ID of the package that you want to associate with a domain. Use
     * <code>DescribePackages</code> to find this value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packageID <p>
     *            Internal ID of the package that you want to associate with a
     *            domain. Use <code>DescribePackages</code> to find this value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DissociatePackageRequest withPackageID(String packageID) {
        this.packageID = packageID;
        return this;
    }

    /**
     * <p>
     * Name of the domain that you want to associate the package with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return <p>
     *         Name of the domain that you want to associate the package with.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * Name of the domain that you want to associate the package with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            Name of the domain that you want to associate the package
     *            with.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the domain that you want to associate the package with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            Name of the domain that you want to associate the package
     *            with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DissociatePackageRequest withDomainName(String domainName) {
        this.domainName = domainName;
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
        if (getPackageID() != null)
            sb.append("PackageID: " + getPackageID() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageID() == null) ? 0 : getPackageID().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DissociatePackageRequest == false)
            return false;
        DissociatePackageRequest other = (DissociatePackageRequest) obj;

        if (other.getPackageID() == null ^ this.getPackageID() == null)
            return false;
        if (other.getPackageID() != null
                && other.getPackageID().equals(this.getPackageID()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }
}
