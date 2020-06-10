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
 * <p> Deletes one or more versions of a package. A deleted package version cannot be restored in your repository. If you want to remove a package version from your repository and be able to restore it later, set its status to <code>Archived</code>. Archived packages cannot be downloaded from a repository and don't show up with list package APIs (for example, <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html">ListackageVersions</a> </code>), but you can restore them using <code> <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_UpdatePackageVersionsStatus.html">UpdatePackageVersionsStatus</a> </code>. </p>
 */
public class DeletePackageVersionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p> The name of the domain that contains the package to delete. </p>
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
     * <p> The name of the repository that contains the package versions to delete. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     */
    private String repository;

    /**
     * <p> The format of the package versions to delete. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
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
     * <p> The name of the package with the versions to delete. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String package;

    /**
     * <p> An array of strings that specify the versions of the package to delete. </p>
     */
    private java.util.List<String> versions;

    /**
     * <p> The expected status of the package version to delete. Valid values are: </p> <ul> <li> <p> <code>Published</code> </p> </li> <li> <p> <code>Unfinished</code> </p> </li> <li> <p> <code>Unlisted</code> </p> </li> <li> <p> <code>Archived</code> </p> </li> <li> <p> <code>Disposed</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived, Disposed, Deleted
     */
    private String expectedStatus;

    /**
     * <p> The name of the domain that contains the package to delete. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @return <p> The name of the domain that contains the package to delete. </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p> The name of the domain that contains the package to delete. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p> The name of the domain that contains the package to delete. </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p> The name of the domain that contains the package to delete. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p> The name of the domain that contains the package to delete. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeletePackageVersionsRequest withDomain(String domain) {
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
    public DeletePackageVersionsRequest withDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
        return this;
    }

    /**
     * <p> The name of the repository that contains the package versions to delete. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @return <p> The name of the repository that contains the package versions to delete. </p>
     */
    public String getRepository() {
        return repository;
    }

    /**
     * <p> The name of the repository that contains the package versions to delete. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param repository <p> The name of the repository that contains the package versions to delete. </p>
     */
    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p> The name of the repository that contains the package versions to delete. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param repository <p> The name of the repository that contains the package versions to delete. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeletePackageVersionsRequest withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * <p> The format of the package versions to delete. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @return <p> The format of the package versions to delete. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p> The format of the package versions to delete. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> The format of the package versions to delete. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p> The format of the package versions to delete. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> The format of the package versions to delete. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PackageFormat
     */
    public DeletePackageVersionsRequest withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p> The format of the package versions to delete. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> The format of the package versions to delete. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public void setFormat(PackageFormat format) {
        this.format = format.toString();
    }

    /**
     * <p> The format of the package versions to delete. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> The format of the package versions to delete. The valid values are: </p> <ul> <li> <p> <code>npm</code> </p> </li> <li> <p> <code>pypi</code> </p> </li> <li> <p> <code>maven</code> </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PackageFormat
     */
    public DeletePackageVersionsRequest withFormat(PackageFormat format) {
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
    public DeletePackageVersionsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p> The name of the package with the versions to delete. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p> The name of the package with the versions to delete. </p>
     */
    public String getPackage() {
        return package;
    }

    /**
     * <p> The name of the package with the versions to delete. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param package <p> The name of the package with the versions to delete. </p>
     */
    public void setPackage(String package) {
        this.package = package;
    }

    /**
     * <p> The name of the package with the versions to delete. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param package <p> The name of the package with the versions to delete. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeletePackageVersionsRequest withPackage(String package) {
        this.package = package;
        return this;
    }

    /**
     * <p> An array of strings that specify the versions of the package to delete. </p>
     *
     * @return <p> An array of strings that specify the versions of the package to delete. </p>
     */
    public java.util.List<String> getVersions() {
        return versions;
    }

    /**
     * <p> An array of strings that specify the versions of the package to delete. </p>
     *
     * @param versions <p> An array of strings that specify the versions of the package to delete. </p>
     */
    public void setVersions(java.util.Collection<String> versions) {
        if (versions == null) {
            this.versions = null;
            return;
        }

        this.versions = new java.util.ArrayList<String>(versions);
    }

    /**
     * <p> An array of strings that specify the versions of the package to delete. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions <p> An array of strings that specify the versions of the package to delete. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeletePackageVersionsRequest withVersions(String... versions) {
        if (getVersions() == null) {
            this.versions = new java.util.ArrayList<String>(versions.length);
        }
        for (String value : versions) {
            this.versions.add(value);
        }
        return this;
    }

    /**
     * <p> An array of strings that specify the versions of the package to delete. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param versions <p> An array of strings that specify the versions of the package to delete. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public DeletePackageVersionsRequest withVersions(java.util.Collection<String> versions) {
        setVersions(versions);
        return this;
    }

    /**
     * <p> The expected status of the package version to delete. Valid values are: </p> <ul> <li> <p> <code>Published</code> </p> </li> <li> <p> <code>Unfinished</code> </p> </li> <li> <p> <code>Unlisted</code> </p> </li> <li> <p> <code>Archived</code> </p> </li> <li> <p> <code>Disposed</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived, Disposed, Deleted
     *
     * @return <p> The expected status of the package version to delete. Valid values are: </p> <ul> <li> <p> <code>Published</code> </p> </li> <li> <p> <code>Unfinished</code> </p> </li> <li> <p> <code>Unlisted</code> </p> </li> <li> <p> <code>Archived</code> </p> </li> <li> <p> <code>Disposed</code> </p> </li> </ul>
     *
     * @see PackageVersionStatus
     */
    public String getExpectedStatus() {
        return expectedStatus;
    }

    /**
     * <p> The expected status of the package version to delete. Valid values are: </p> <ul> <li> <p> <code>Published</code> </p> </li> <li> <p> <code>Unfinished</code> </p> </li> <li> <p> <code>Unlisted</code> </p> </li> <li> <p> <code>Archived</code> </p> </li> <li> <p> <code>Disposed</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived, Disposed, Deleted
     *
     * @param expectedStatus <p> The expected status of the package version to delete. Valid values are: </p> <ul> <li> <p> <code>Published</code> </p> </li> <li> <p> <code>Unfinished</code> </p> </li> <li> <p> <code>Unlisted</code> </p> </li> <li> <p> <code>Archived</code> </p> </li> <li> <p> <code>Disposed</code> </p> </li> </ul>
     *
     * @see PackageVersionStatus
     */
    public void setExpectedStatus(String expectedStatus) {
        this.expectedStatus = expectedStatus;
    }

    /**
     * <p> The expected status of the package version to delete. Valid values are: </p> <ul> <li> <p> <code>Published</code> </p> </li> <li> <p> <code>Unfinished</code> </p> </li> <li> <p> <code>Unlisted</code> </p> </li> <li> <p> <code>Archived</code> </p> </li> <li> <p> <code>Disposed</code> </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived, Disposed, Deleted
     *
     * @param expectedStatus <p> The expected status of the package version to delete. Valid values are: </p> <ul> <li> <p> <code>Published</code> </p> </li> <li> <p> <code>Unfinished</code> </p> </li> <li> <p> <code>Unlisted</code> </p> </li> <li> <p> <code>Archived</code> </p> </li> <li> <p> <code>Disposed</code> </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PackageVersionStatus
     */
    public DeletePackageVersionsRequest withExpectedStatus(String expectedStatus) {
        this.expectedStatus = expectedStatus;
        return this;
    }

    /**
     * <p> The expected status of the package version to delete. Valid values are: </p> <ul> <li> <p> <code>Published</code> </p> </li> <li> <p> <code>Unfinished</code> </p> </li> <li> <p> <code>Unlisted</code> </p> </li> <li> <p> <code>Archived</code> </p> </li> <li> <p> <code>Disposed</code> </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived, Disposed, Deleted
     *
     * @param expectedStatus <p> The expected status of the package version to delete. Valid values are: </p> <ul> <li> <p> <code>Published</code> </p> </li> <li> <p> <code>Unfinished</code> </p> </li> <li> <p> <code>Unlisted</code> </p> </li> <li> <p> <code>Archived</code> </p> </li> <li> <p> <code>Disposed</code> </p> </li> </ul>
     *
     * @see PackageVersionStatus
     */
    public void setExpectedStatus(PackageVersionStatus expectedStatus) {
        this.expectedStatus = expectedStatus.toString();
    }

    /**
     * <p> The expected status of the package version to delete. Valid values are: </p> <ul> <li> <p> <code>Published</code> </p> </li> <li> <p> <code>Unfinished</code> </p> </li> <li> <p> <code>Unlisted</code> </p> </li> <li> <p> <code>Archived</code> </p> </li> <li> <p> <code>Disposed</code> </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived, Disposed, Deleted
     *
     * @param expectedStatus <p> The expected status of the package version to delete. Valid values are: </p> <ul> <li> <p> <code>Published</code> </p> </li> <li> <p> <code>Unfinished</code> </p> </li> <li> <p> <code>Unlisted</code> </p> </li> <li> <p> <code>Archived</code> </p> </li> <li> <p> <code>Disposed</code> </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PackageVersionStatus
     */
    public DeletePackageVersionsRequest withExpectedStatus(PackageVersionStatus expectedStatus) {
        this.expectedStatus = expectedStatus.toString();
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
        if (getVersions() != null) sb.append("versions: " + getVersions() + ",");
        if (getExpectedStatus() != null) sb.append("expectedStatus: " + getExpectedStatus());
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
        hashCode = prime * hashCode + ((getVersions() == null) ? 0 : getVersions().hashCode());
        hashCode = prime * hashCode + ((getExpectedStatus() == null) ? 0 : getExpectedStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeletePackageVersionsRequest == false) return false;
        DeletePackageVersionsRequest other = (DeletePackageVersionsRequest)obj;

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
        if (other.getVersions() == null ^ this.getVersions() == null) return false;
        if (other.getVersions() != null && other.getVersions().equals(this.getVersions()) == false) return false;
        if (other.getExpectedStatus() == null ^ this.getExpectedStatus() == null) return false;
        if (other.getExpectedStatus() != null && other.getExpectedStatus().equals(this.getExpectedStatus()) == false) return false;
        return true;
    }
}
