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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

public class DescribePackageVersionResult implements Serializable {
    /**
     * <p>
     * A
     * <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">PackageVersionDescription</a> </code>
     * object that contains information about the requested package version.
     * </p>
     */
    private PackageVersionDescription packageVersion;

    /**
     * <p>
     * A
     * <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">PackageVersionDescription</a> </code>
     * object that contains information about the requested package version.
     * </p>
     *
     * @return <p>
     *         A
     *         <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">PackageVersionDescription</a> </code>
     *         object that contains information about the requested package
     *         version.
     *         </p>
     */
    public PackageVersionDescription getPackageVersion() {
        return packageVersion;
    }

    /**
     * <p>
     * A
     * <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">PackageVersionDescription</a> </code>
     * object that contains information about the requested package version.
     * </p>
     *
     * @param packageVersion <p>
     *            A
     *            <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">PackageVersionDescription</a> </code>
     *            object that contains information about the requested package
     *            version.
     *            </p>
     */
    public void setPackageVersion(PackageVersionDescription packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p>
     * A
     * <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">PackageVersionDescription</a> </code>
     * object that contains information about the requested package version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packageVersion <p>
     *            A
     *            <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionDescription.html">PackageVersionDescription</a> </code>
     *            object that contains information about the requested package
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePackageVersionResult withPackageVersion(PackageVersionDescription packageVersion) {
        this.packageVersion = packageVersion;
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
        if (getPackageVersion() != null)
            sb.append("packageVersion: " + getPackageVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePackageVersionResult == false)
            return false;
        DescribePackageVersionResult other = (DescribePackageVersionResult) obj;

        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null)
            return false;
        if (other.getPackageVersion() != null
                && other.getPackageVersion().equals(this.getPackageVersion()) == false)
            return false;
        return true;
    }
}
