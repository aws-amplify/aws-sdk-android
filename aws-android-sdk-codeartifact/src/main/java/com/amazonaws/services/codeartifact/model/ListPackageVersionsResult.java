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


public class ListPackageVersionsResult implements Serializable {
    /**
     * <p> The default package version to display. This depends on the package format: </p> <ul> <li> <p> For Maven and PyPI packages, it's the most recently published package version. </p> </li> <li> <p> For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code> tag is not set, it's the most recently published package version. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String defaultDisplayVersion;

    /**
     * <p> A format of the package. Valid package format values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     */
    private String format;

    /**
     * <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String namespace;

    /**
     * <p> The name of the package. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String package;

    /**
     * <p> The returned list of <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"> <code>PackageVersionSummary</code> </a> objects. </p>
     */
    private java.util.List<PackageVersionSummary> versions;

    /**
     * <p> If there are additional results, this is the token for the next set of results. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String nextToken;

    /**
     * <p> The default package version to display. This depends on the package format: </p> <ul> <li> <p> For Maven and PyPI packages, it's the most recently published package version. </p> </li> <li> <p> For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code> tag is not set, it's the most recently published package version. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p> The default package version to display. This depends on the package format: </p> <ul> <li> <p> For Maven and PyPI packages, it's the most recently published package version. </p> </li> <li> <p> For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code> tag is not set, it's the most recently published package version. </p> </li> </ul>
     */
    public String getDefaultDisplayVersion() {
        return defaultDisplayVersion;
    }

    /**
     * <p> The default package version to display. This depends on the package format: </p> <ul> <li> <p> For Maven and PyPI packages, it's the most recently published package version. </p> </li> <li> <p> For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code> tag is not set, it's the most recently published package version. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param defaultDisplayVersion <p> The default package version to display. This depends on the package format: </p> <ul> <li> <p> For Maven and PyPI packages, it's the most recently published package version. </p> </li> <li> <p> For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code> tag is not set, it's the most recently published package version. </p> </li> </ul>
     */
    public void setDefaultDisplayVersion(String defaultDisplayVersion) {
        this.defaultDisplayVersion = defaultDisplayVersion;
    }

    /**
     * <p> The default package version to display. This depends on the package format: </p> <ul> <li> <p> For Maven and PyPI packages, it's the most recently published package version. </p> </li> <li> <p> For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code> tag is not set, it's the most recently published package version. </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param defaultDisplayVersion <p> The default package version to display. This depends on the package format: </p> <ul> <li> <p> For Maven and PyPI packages, it's the most recently published package version. </p> </li> <li> <p> For npm packages, it's the version referenced by the <code>latest</code> tag. If the <code>latest</code> tag is not set, it's the most recently published package version. </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackageVersionsResult withDefaultDisplayVersion(String defaultDisplayVersion) {
        this.defaultDisplayVersion = defaultDisplayVersion;
        return this;
    }

    /**
     * <p> A format of the package. Valid package format values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @return <p> A format of the package. Valid package format values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p> A format of the package. Valid package format values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> A format of the package. Valid package format values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p> A format of the package. Valid package format values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> A format of the package. Valid package format values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PackageFormat
     */
    public ListPackageVersionsResult withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p> A format of the package. Valid package format values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> A format of the package. Valid package format values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public void setFormat(PackageFormat format) {
        this.format = format.toString();
    }

    /**
     * <p> A format of the package. Valid package format values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> A format of the package. Valid package format values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PackageFormat
     */
    public ListPackageVersionsResult withFormat(PackageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param namespace <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param namespace <p> The namespace of the package. The package component that specifies its namespace depends on its type. For example: </p> <ul> <li> <p> The namespace of a Maven package is its <code>groupId</code>. </p> </li> <li> <p> The namespace of an npm package is its <code>scope</code>. </p> </li> <li> <p> A Python package does not contain a corresponding component, so Python packages do not have a namespace. </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackageVersionsResult withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p> The name of the package. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p> The name of the package. </p>
     */
    public String getPackage() {
        return package;
    }

    /**
     * <p> The name of the package. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param package <p> The name of the package. </p>
     */
    public void setPackage(String package) {
        this.package = package;
    }

    /**
     * <p> The name of the package. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param package <p> The name of the package. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackageVersionsResult withPackage(String package) {
        this.package = package;
        return this;
    }

    /**
     * <p> The returned list of <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"> <code>PackageVersionSummary</code> </a> objects. </p>
     *
     * @return <p> The returned list of <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"> <code>PackageVersionSummary</code> </a> objects. </p>
     */
    public java.util.List<PackageVersionSummary> getVersions() {
        return versions;
    }

    /**
     * <p> The returned list of <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"> <code>PackageVersionSummary</code> </a> objects. </p>
     *
     * @param versions <p> The returned list of <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"> <code>PackageVersionSummary</code> </a> objects. </p>
     */
    public void setVersions(java.util.Collection<PackageVersionSummary> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<PackageVersionSummary>(versions);
    }

    /**
     * <p> The returned list of <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"> <code>PackageVersionSummary</code> </a> objects. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions <p> The returned list of <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"> <code>PackageVersionSummary</code> </a> objects. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackageVersionsResult withVersions(PackageVersionSummary... versions) {
        if (getVersions() == null) {
            this.versions = new java.util.ArrayList<PackageVersionSummary>(versions.length);
        }
        for (PackageVersionSummary value : versions) {
            this.versions.add(value);
        }
        return this;
    }

    /**
     * <p> The returned list of <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"> <code>PackageVersionSummary</code> </a> objects. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions <p> The returned list of <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_PackageVersionSummary.html"> <code>PackageVersionSummary</code> </a> objects. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackageVersionsResult withVersions(java.util.Collection<PackageVersionSummary> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p> If there are additional results, this is the token for the next set of results. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p> If there are additional results, this is the token for the next set of results. </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p> If there are additional results, this is the token for the next set of results. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param nextToken <p> If there are additional results, this is the token for the next set of results. </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p> If there are additional results, this is the token for the next set of results. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param nextToken <p> If there are additional results, this is the token for the next set of results. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackageVersionsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDefaultDisplayVersion() != null) sb.append("defaultDisplayVersion: " + getDefaultDisplayVersion() + ",");
        if (getFormat() != null) sb.append("format: " + getFormat() + ",");
        if (getNamespace() != null) sb.append("namespace: " + getNamespace() + ",");
        if (getPackage() != null) sb.append("package: " + getPackage() + ",");
        if (getVersions() != null) sb.append("versions: " + getVersions() + ",");
        if (getNextToken() != null) sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultDisplayVersion() == null) ? 0 : getDefaultDisplayVersion().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPackageVersionsResult == false) return false;
        ListPackageVersionsResult other = (ListPackageVersionsResult)obj;

        if (other.getDefaultDisplayVersion() == null ^ this.getDefaultDisplayVersion() == null) return false;
        if (other.getDefaultDisplayVersion() != null && other.getDefaultDisplayVersion().equals(this.getDefaultDisplayVersion()) == false) return false;
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null) return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false) return false;
        if (other.getPackage() == null ^ this.getPackage() == null) return false;
        if (other.getPackage() != null && other.getPackage().equals(this.getPackage()) == false) return false;
        if (other.getVersions() == null ^ this.getVersions() == null) return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
