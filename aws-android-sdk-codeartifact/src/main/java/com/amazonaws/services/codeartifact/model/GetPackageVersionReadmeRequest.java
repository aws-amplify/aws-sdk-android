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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p> Gets the readme file or descriptive text for a package version. For packages that do not contain a readme file, CodeArtifact extracts a description from a metadata file. For example, from the <code>&lt;description&gt;</code> element in the <code>pom.xml</code> file of a Maven package. </p> <p> The returned text might contain formatting. For example, it might contain formatting for Markdown or reStructuredText. </p>
 */
public class GetPackageVersionReadmeRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p> The name of the domain that contains the repository that contains the package version with the requested readme file. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     */
    private String domain;

    /**
     * <p> The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String domainOwner;

    /**
     * <p> The repository that contains the package with the requested readme file. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     */
    private String repository;

    /**
     * <p> A format that specifies the type of the package version with the requested readme file. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
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
     * <p> The name of the package version that contains the requested readme file. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String package;

    /**
     * <p> A string that contains the package version (for example, <code>3.5.2</code>). </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String packageVersion;

    /**
     * <p> The name of the domain that contains the repository that contains the package version with the requested readme file. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @return <p> The name of the domain that contains the repository that contains the package version with the requested readme file. </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p> The name of the domain that contains the repository that contains the package version with the requested readme file. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p> The name of the domain that contains the repository that contains the package version with the requested readme file. </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p> The name of the domain that contains the repository that contains the package version with the requested readme file. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p> The name of the domain that contains the repository that contains the package version with the requested readme file. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetPackageVersionReadmeRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p> The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p> The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. </p>
     */
    public String getDomainOwner() {
        return domainOwner;
    }

    /**
     * <p> The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param domainOwner <p> The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. </p>
     */
    public void setDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
    }

    /**
     * <p> The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param domainOwner <p> The 12-digit account number of the AWS account that owns the domain. It does not include dashes or spaces. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetPackageVersionReadmeRequest withDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
        return this;
    }

    /**
     * <p> The repository that contains the package with the requested readme file. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @return <p> The repository that contains the package with the requested readme file. </p>
     */
    public String getRepository() {
        return repository;
    }

    /**
     * <p> The repository that contains the package with the requested readme file. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param repository <p> The repository that contains the package with the requested readme file. </p>
     */
    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p> The repository that contains the package with the requested readme file. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param repository <p> The repository that contains the package with the requested readme file. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetPackageVersionReadmeRequest withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * <p> A format that specifies the type of the package version with the requested readme file. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @return <p> A format that specifies the type of the package version with the requested readme file. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p> A format that specifies the type of the package version with the requested readme file. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> A format that specifies the type of the package version with the requested readme file. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p> A format that specifies the type of the package version with the requested readme file. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> A format that specifies the type of the package version with the requested readme file. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PackageFormat
     */
    public GetPackageVersionReadmeRequest withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p> A format that specifies the type of the package version with the requested readme file. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> A format that specifies the type of the package version with the requested readme file. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public void setFormat(PackageFormat format) {
        this.format = format.toString();
    }

    /**
     * <p> A format that specifies the type of the package version with the requested readme file. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> A format that specifies the type of the package version with the requested readme file. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PackageFormat
     */
    public GetPackageVersionReadmeRequest withFormat(PackageFormat format) {
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
    public GetPackageVersionReadmeRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p> The name of the package version that contains the requested readme file. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p> The name of the package version that contains the requested readme file. </p>
     */
    public String getPackage() {
        return package;
    }

    /**
     * <p> The name of the package version that contains the requested readme file. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param package <p> The name of the package version that contains the requested readme file. </p>
     */
    public void setPackage(String package) {
        this.package = package;
    }

    /**
     * <p> The name of the package version that contains the requested readme file. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param package <p> The name of the package version that contains the requested readme file. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetPackageVersionReadmeRequest withPackage(String package) {
        this.package = package;
        return this;
    }

    /**
     * <p> A string that contains the package version (for example, <code>3.5.2</code>). </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p> A string that contains the package version (for example, <code>3.5.2</code>). </p>
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /**
     * <p> A string that contains the package version (for example, <code>3.5.2</code>). </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param packageVersion <p> A string that contains the package version (for example, <code>3.5.2</code>). </p>
     */
    public void setPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * <p> A string that contains the package version (for example, <code>3.5.2</code>). </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param packageVersion <p> A string that contains the package version (for example, <code>3.5.2</code>). </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public GetPackageVersionReadmeRequest withPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
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
        if (getDomain() != null) sb.append("domain: " + getDomain() + ",");
        if (getDomainOwner() != null) sb.append("domainOwner: " + getDomainOwner() + ",");
        if (getRepository() != null) sb.append("repository: " + getRepository() + ",");
        if (getFormat() != null) sb.append("format: " + getFormat() + ",");
        if (getNamespace() != null) sb.append("namespace: " + getNamespace() + ",");
        if (getPackage() != null) sb.append("package: " + getPackage() + ",");
        if (getPackageVersion() != null) sb.append("packageVersion: " + getPackageVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getDomainOwner() == null) ? 0 : getDomainOwner().hashCode());
        hashCode = prime * hashCode + ((getRepository() == null) ? 0 : getRepository().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getPackage() == null) ? 0 : getPackage().hashCode());
        hashCode = prime * hashCode + ((getPackageVersion() == null) ? 0 : getPackageVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetPackageVersionReadmeRequest == false) return false;
        GetPackageVersionReadmeRequest other = (GetPackageVersionReadmeRequest)obj;

        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false;
        if (other.getDomainOwner() == null ^ this.getDomainOwner() == null) return false;
        if (other.getDomainOwner() != null && other.getDomainOwner().equals(this.getDomainOwner()) == false) return false;
        if (other.getRepository() == null ^ this.getRepository() == null) return false;
        if (other.getRepository() != null && other.getRepository().equals(this.getRepository()) == false) return false;
        if (other.getFormat() == null ^ this.getFormat() == null) return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false) return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null) return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false) return false;
        if (other.getPackage() == null ^ this.getPackage() == null) return false;
        if (other.getPackage() != null && other.getPackage().equals(this.getPackage()) == false) return false;
        if (other.getPackageVersion() == null ^ this.getPackageVersion() == null) return false;
        if (other.getPackageVersion() != null && other.getPackageVersion().equals(this.getPackageVersion()) == false) return false;
        return true;
    }
}
