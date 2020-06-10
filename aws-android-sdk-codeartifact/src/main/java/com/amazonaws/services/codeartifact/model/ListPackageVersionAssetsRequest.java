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
 * <p> Returns a list of <a href="https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_AssetSummary.html"> <code>AssetSummary</code> </a> objects for assets in a package version. </p>
 */
public class ListPackageVersionAssetsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p> The name of the domain that contains the repository associated with the package version assets. </p>
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
     * <p> The name of the repository that contains the package that contains the returned package version assets. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     */
    private String repository;

    /**
     * <p> The format of the package that contains the returned package version assets. The valid package types are: </p> <ul> <li> <p> <code>npm</code>: A Node Package Manager (npm) package. </p> </li> <li> <p> <code>pypi</code>: A Python Package Index (PyPI) package. </p> </li> <li> <p> <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file. </p> </li> </ul>
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
     * <p> The name of the package that contains the returned package version assets. </p>
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
     * <p> The maximum number of results to return per page. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p> The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String nextToken;

    /**
     * <p> The name of the domain that contains the repository associated with the package version assets. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @return <p> The name of the domain that contains the repository associated with the package version assets. </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p> The name of the domain that contains the repository associated with the package version assets. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p> The name of the domain that contains the repository associated with the package version assets. </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p> The name of the domain that contains the repository associated with the package version assets. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 50<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]{0,48}[a-z0-9]<br/>
     *
     * @param domain <p> The name of the domain that contains the repository associated with the package version assets. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackageVersionAssetsRequest withDomain(String domain) {
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
    public ListPackageVersionAssetsRequest withDomainOwner(String domainOwner) {
        this.domainOwner = domainOwner;
        return this;
    }

    /**
     * <p> The name of the repository that contains the package that contains the returned package version assets. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @return <p> The name of the repository that contains the package that contains the returned package version assets. </p>
     */
    public String getRepository() {
        return repository;
    }

    /**
     * <p> The name of the repository that contains the package that contains the returned package version assets. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param repository <p> The name of the repository that contains the package that contains the returned package version assets. </p>
     */
    public void setRepository(String repository) {
        this.repository = repository;
    }

    /**
     * <p> The name of the repository that contains the package that contains the returned package version assets. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 100<br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-]{1,99}<br/>
     *
     * @param repository <p> The name of the repository that contains the package that contains the returned package version assets. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackageVersionAssetsRequest withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * <p> The format of the package that contains the returned package version assets. The valid package types are: </p> <ul> <li> <p> <code>npm</code>: A Node Package Manager (npm) package. </p> </li> <li> <p> <code>pypi</code>: A Python Package Index (PyPI) package. </p> </li> <li> <p> <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @return <p> The format of the package that contains the returned package version assets. The valid package types are: </p> <ul> <li> <p> <code>npm</code>: A Node Package Manager (npm) package. </p> </li> <li> <p> <code>pypi</code>: A Python Package Index (PyPI) package. </p> </li> <li> <p> <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file. </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p> The format of the package that contains the returned package version assets. The valid package types are: </p> <ul> <li> <p> <code>npm</code>: A Node Package Manager (npm) package. </p> </li> <li> <p> <code>pypi</code>: A Python Package Index (PyPI) package. </p> </li> <li> <p> <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> The format of the package that contains the returned package version assets. The valid package types are: </p> <ul> <li> <p> <code>npm</code>: A Node Package Manager (npm) package. </p> </li> <li> <p> <code>pypi</code>: A Python Package Index (PyPI) package. </p> </li> <li> <p> <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file. </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p> The format of the package that contains the returned package version assets. The valid package types are: </p> <ul> <li> <p> <code>npm</code>: A Node Package Manager (npm) package. </p> </li> <li> <p> <code>pypi</code>: A Python Package Index (PyPI) package. </p> </li> <li> <p> <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file. </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> The format of the package that contains the returned package version assets. The valid package types are: </p> <ul> <li> <p> <code>npm</code>: A Node Package Manager (npm) package. </p> </li> <li> <p> <code>pypi</code>: A Python Package Index (PyPI) package. </p> </li> <li> <p> <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file. </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PackageFormat
     */
    public ListPackageVersionAssetsRequest withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p> The format of the package that contains the returned package version assets. The valid package types are: </p> <ul> <li> <p> <code>npm</code>: A Node Package Manager (npm) package. </p> </li> <li> <p> <code>pypi</code>: A Python Package Index (PyPI) package. </p> </li> <li> <p> <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file. </p> </li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> The format of the package that contains the returned package version assets. The valid package types are: </p> <ul> <li> <p> <code>npm</code>: A Node Package Manager (npm) package. </p> </li> <li> <p> <code>pypi</code>: A Python Package Index (PyPI) package. </p> </li> <li> <p> <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file. </p> </li> </ul>
     *
     * @see PackageFormat
     */
    public void setFormat(PackageFormat format) {
        this.format = format.toString();
    }

    /**
     * <p> The format of the package that contains the returned package version assets. The valid package types are: </p> <ul> <li> <p> <code>npm</code>: A Node Package Manager (npm) package. </p> </li> <li> <p> <code>pypi</code>: A Python Package Index (PyPI) package. </p> </li> <li> <p> <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file. </p> </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p> The format of the package that contains the returned package version assets. The valid package types are: </p> <ul> <li> <p> <code>npm</code>: A Node Package Manager (npm) package. </p> </li> <li> <p> <code>pypi</code>: A Python Package Index (PyPI) package. </p> </li> <li> <p> <code>maven</code>: A Maven package that contains compiled code in a distributable format, such as a JAR file. </p> </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see PackageFormat
     */
    public ListPackageVersionAssetsRequest withFormat(PackageFormat format) {
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
    public ListPackageVersionAssetsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p> The name of the package that contains the returned package version assets. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p> The name of the package that contains the returned package version assets. </p>
     */
    public String getPackage() {
        return package;
    }

    /**
     * <p> The name of the package that contains the returned package version assets. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param package <p> The name of the package that contains the returned package version assets. </p>
     */
    public void setPackage(String package) {
        this.package = package;
    }

    /**
     * <p> The name of the package that contains the returned package version assets. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param package <p> The name of the package that contains the returned package version assets. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackageVersionAssetsRequest withPackage(String package) {
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
    public ListPackageVersionAssetsRequest withPackageVersion(String packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }

    /**
     * <p> The maximum number of results to return per page. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p> The maximum number of results to return per page. </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p> The maximum number of results to return per page. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p> The maximum number of results to return per page. </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p> The maximum number of results to return per page. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p> The maximum number of results to return per page. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackageVersionAssetsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p> The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p> The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p> The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param nextToken <p> The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p> The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param nextToken <p> The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results. </p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ListPackageVersionAssetsRequest withNextToken(String nextToken) {
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
        if (getDomain() != null) sb.append("domain: " + getDomain() + ",");
        if (getDomainOwner() != null) sb.append("domainOwner: " + getDomainOwner() + ",");
        if (getRepository() != null) sb.append("repository: " + getRepository() + ",");
        if (getFormat() != null) sb.append("format: " + getFormat() + ",");
        if (getNamespace() != null) sb.append("namespace: " + getNamespace() + ",");
        if (getPackage() != null) sb.append("package: " + getPackage() + ",");
        if (getPackageVersion() != null) sb.append("packageVersion: " + getPackageVersion() + ",");
        if (getMaxResults() != null) sb.append("maxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("nextToken: " + getNextToken());
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
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPackageVersionAssetsRequest == false) return false;
        ListPackageVersionAssetsRequest other = (ListPackageVersionAssetsRequest)obj;

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
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false;
        return true;
    }
}
