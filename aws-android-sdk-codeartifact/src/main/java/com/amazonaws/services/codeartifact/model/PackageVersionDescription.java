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

/**
 * <p>
 * Details about a package version.
 * </p>
 */
public class PackageVersionDescription implements Serializable {
    /**
     * <p>
     * The format of the package version. The valid package formats are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a
     * distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     */
    private String format;

    /**
     * <p>
     * The namespace of the package. The package component that specifies its
     * namespace depends on its type. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python
     * packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String namespace;

    /**
     * <p>
     * The name of the requested package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String packageName;

    /**
     * <p>
     * The name of the package that is displayed. The <code>displayName</code>
     * varies depending on the package version's format. For example, if an npm
     * package is named <code>ui</code>, is in the namespace <code>vue</code>,
     * and has the format <code>npm</code>, then the <code>displayName</code> is
     * <code>@vue/ui</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String displayName;

    /**
     * <p>
     * The version of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String version;

    /**
     * <p>
     * A summary of the package version. The summary is extracted from the
     * package. The information in and detail level of the summary depends on
     * the package version's format.
     * </p>
     */
    private String summary;

    /**
     * <p>
     * The homepage associated with the package.
     * </p>
     */
    private String homePage;

    /**
     * <p>
     * The repository for the source code in the package version, or the source
     * code used to build it.
     * </p>
     */
    private String sourceCodeRepository;

    /**
     * <p>
     * A timestamp that contains the date and time the package version was
     * published.
     * </p>
     */
    private java.util.Date publishedTime;

    /**
     * <p>
     * Information about licenses associated with the package version.
     * </p>
     */
    private java.util.List<LicenseInfo> licenses;

    /**
     * <p>
     * The revision of the package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>\S+<br/>
     */
    private String revision;

    /**
     * <p>
     * A string that contains the status of the package version. It can be one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived,
     * Disposed, Deleted
     */
    private String status;

    /**
     * <p>
     * The format of the package version. The valid package formats are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a
     * distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @return <p>
     *         The format of the package version. The valid package formats are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>npm</code>: A Node Package Manager (npm) package.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pypi</code>: A Python Package Index (PyPI) package.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>maven</code>: A Maven package that contains compiled code
     *         in a distributable format, such as a JAR file.
     *         </p>
     *         </li>
     *         </ul>
     * @see PackageFormat
     */
    public String getFormat() {
        return format;
    }

    /**
     * <p>
     * The format of the package version. The valid package formats are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a
     * distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p>
     *            The format of the package version. The valid package formats
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>npm</code>: A Node Package Manager (npm) package.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pypi</code>: A Python Package Index (PyPI) package.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>maven</code>: A Maven package that contains compiled
     *            code in a distributable format, such as a JAR file.
     *            </p>
     *            </li>
     *            </ul>
     * @see PackageFormat
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the package version. The valid package formats are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a
     * distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p>
     *            The format of the package version. The valid package formats
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>npm</code>: A Node Package Manager (npm) package.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pypi</code>: A Python Package Index (PyPI) package.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>maven</code>: A Maven package that contains compiled
     *            code in a distributable format, such as a JAR file.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageFormat
     */
    public PackageVersionDescription withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * <p>
     * The format of the package version. The valid package formats are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a
     * distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p>
     *            The format of the package version. The valid package formats
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>npm</code>: A Node Package Manager (npm) package.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pypi</code>: A Python Package Index (PyPI) package.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>maven</code>: A Maven package that contains compiled
     *            code in a distributable format, such as a JAR file.
     *            </p>
     *            </li>
     *            </ul>
     * @see PackageFormat
     */
    public void setFormat(PackageFormat format) {
        this.format = format.toString();
    }

    /**
     * <p>
     * The format of the package version. The valid package formats are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>npm</code>: A Node Package Manager (npm) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pypi</code>: A Python Package Index (PyPI) package.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>maven</code>: A Maven package that contains compiled code in a
     * distributable format, such as a JAR file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>npm, pypi, maven
     *
     * @param format <p>
     *            The format of the package version. The valid package formats
     *            are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>npm</code>: A Node Package Manager (npm) package.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>pypi</code>: A Python Package Index (PyPI) package.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>maven</code>: A Maven package that contains compiled
     *            code in a distributable format, such as a JAR file.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageFormat
     */
    public PackageVersionDescription withFormat(PackageFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its
     * namespace depends on its type. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python
     * packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p>
     *         The namespace of the package. The package component that
     *         specifies its namespace depends on its type. For example:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The namespace of a Maven package is its <code>groupId</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The namespace of an npm package is its <code>scope</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A Python package does not contain a corresponding component, so
     *         Python packages do not have a namespace.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its
     * namespace depends on its type. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python
     * packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param namespace <p>
     *            The namespace of the package. The package component that
     *            specifies its namespace depends on its type. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The namespace of a Maven package is its <code>groupId</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The namespace of an npm package is its <code>scope</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A Python package does not contain a corresponding component,
     *            so Python packages do not have a namespace.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace of the package. The package component that specifies its
     * namespace depends on its type. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The namespace of a Maven package is its <code>groupId</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The namespace of an npm package is its <code>scope</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Python package does not contain a corresponding component, so Python
     * packages do not have a namespace.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param namespace <p>
     *            The namespace of the package. The package component that
     *            specifies its namespace depends on its type. For example:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The namespace of a Maven package is its <code>groupId</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The namespace of an npm package is its <code>scope</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            A Python package does not contain a corresponding component,
     *            so Python packages do not have a namespace.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionDescription withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * The name of the requested package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p>
     *         The name of the requested package.
     *         </p>
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * <p>
     * The name of the requested package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param packageName <p>
     *            The name of the requested package.
     *            </p>
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * The name of the requested package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param packageName <p>
     *            The name of the requested package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionDescription withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * <p>
     * The name of the package that is displayed. The <code>displayName</code>
     * varies depending on the package version's format. For example, if an npm
     * package is named <code>ui</code>, is in the namespace <code>vue</code>,
     * and has the format <code>npm</code>, then the <code>displayName</code> is
     * <code>@vue/ui</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         The name of the package that is displayed. The
     *         <code>displayName</code> varies depending on the package
     *         version's format. For example, if an npm package is named
     *         <code>ui</code>, is in the namespace <code>vue</code>, and has
     *         the format <code>npm</code>, then the <code>displayName</code> is
     *         <code>@vue/ui</code>.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The name of the package that is displayed. The <code>displayName</code>
     * varies depending on the package version's format. For example, if an npm
     * package is named <code>ui</code>, is in the namespace <code>vue</code>,
     * and has the format <code>npm</code>, then the <code>displayName</code> is
     * <code>@vue/ui</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param displayName <p>
     *            The name of the package that is displayed. The
     *            <code>displayName</code> varies depending on the package
     *            version's format. For example, if an npm package is named
     *            <code>ui</code>, is in the namespace <code>vue</code>, and has
     *            the format <code>npm</code>, then the <code>displayName</code>
     *            is <code>@vue/ui</code>.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the package that is displayed. The <code>displayName</code>
     * varies depending on the package version's format. For example, if an npm
     * package is named <code>ui</code>, is in the namespace <code>vue</code>,
     * and has the format <code>npm</code>, then the <code>displayName</code> is
     * <code>@vue/ui</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param displayName <p>
     *            The name of the package that is displayed. The
     *            <code>displayName</code> varies depending on the package
     *            version's format. For example, if an npm package is named
     *            <code>ui</code>, is in the namespace <code>vue</code>, and has
     *            the format <code>npm</code>, then the <code>displayName</code>
     *            is <code>@vue/ui</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionDescription withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The version of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p>
     *         The version of the package.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The version of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param version <p>
     *            The version of the package.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param version <p>
     *            The version of the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionDescription withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * A summary of the package version. The summary is extracted from the
     * package. The information in and detail level of the summary depends on
     * the package version's format.
     * </p>
     *
     * @return <p>
     *         A summary of the package version. The summary is extracted from
     *         the package. The information in and detail level of the summary
     *         depends on the package version's format.
     *         </p>
     */
    public String getSummary() {
        return summary;
    }

    /**
     * <p>
     * A summary of the package version. The summary is extracted from the
     * package. The information in and detail level of the summary depends on
     * the package version's format.
     * </p>
     *
     * @param summary <p>
     *            A summary of the package version. The summary is extracted
     *            from the package. The information in and detail level of the
     *            summary depends on the package version's format.
     *            </p>
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * A summary of the package version. The summary is extracted from the
     * package. The information in and detail level of the summary depends on
     * the package version's format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param summary <p>
     *            A summary of the package version. The summary is extracted
     *            from the package. The information in and detail level of the
     *            summary depends on the package version's format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionDescription withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * <p>
     * The homepage associated with the package.
     * </p>
     *
     * @return <p>
     *         The homepage associated with the package.
     *         </p>
     */
    public String getHomePage() {
        return homePage;
    }

    /**
     * <p>
     * The homepage associated with the package.
     * </p>
     *
     * @param homePage <p>
     *            The homepage associated with the package.
     *            </p>
     */
    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    /**
     * <p>
     * The homepage associated with the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param homePage <p>
     *            The homepage associated with the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionDescription withHomePage(String homePage) {
        this.homePage = homePage;
        return this;
    }

    /**
     * <p>
     * The repository for the source code in the package version, or the source
     * code used to build it.
     * </p>
     *
     * @return <p>
     *         The repository for the source code in the package version, or the
     *         source code used to build it.
     *         </p>
     */
    public String getSourceCodeRepository() {
        return sourceCodeRepository;
    }

    /**
     * <p>
     * The repository for the source code in the package version, or the source
     * code used to build it.
     * </p>
     *
     * @param sourceCodeRepository <p>
     *            The repository for the source code in the package version, or
     *            the source code used to build it.
     *            </p>
     */
    public void setSourceCodeRepository(String sourceCodeRepository) {
        this.sourceCodeRepository = sourceCodeRepository;
    }

    /**
     * <p>
     * The repository for the source code in the package version, or the source
     * code used to build it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceCodeRepository <p>
     *            The repository for the source code in the package version, or
     *            the source code used to build it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionDescription withSourceCodeRepository(String sourceCodeRepository) {
        this.sourceCodeRepository = sourceCodeRepository;
        return this;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the package version was
     * published.
     * </p>
     *
     * @return <p>
     *         A timestamp that contains the date and time the package version
     *         was published.
     *         </p>
     */
    public java.util.Date getPublishedTime() {
        return publishedTime;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the package version was
     * published.
     * </p>
     *
     * @param publishedTime <p>
     *            A timestamp that contains the date and time the package
     *            version was published.
     *            </p>
     */
    public void setPublishedTime(java.util.Date publishedTime) {
        this.publishedTime = publishedTime;
    }

    /**
     * <p>
     * A timestamp that contains the date and time the package version was
     * published.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publishedTime <p>
     *            A timestamp that contains the date and time the package
     *            version was published.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionDescription withPublishedTime(java.util.Date publishedTime) {
        this.publishedTime = publishedTime;
        return this;
    }

    /**
     * <p>
     * Information about licenses associated with the package version.
     * </p>
     *
     * @return <p>
     *         Information about licenses associated with the package version.
     *         </p>
     */
    public java.util.List<LicenseInfo> getLicenses() {
        return licenses;
    }

    /**
     * <p>
     * Information about licenses associated with the package version.
     * </p>
     *
     * @param licenses <p>
     *            Information about licenses associated with the package
     *            version.
     *            </p>
     */
    public void setLicenses(java.util.Collection<LicenseInfo> licenses) {
        if (licenses == null) {
            this.licenses = null;
            return;
        }

        this.licenses = new java.util.ArrayList<LicenseInfo>(licenses);
    }

    /**
     * <p>
     * Information about licenses associated with the package version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenses <p>
     *            Information about licenses associated with the package
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionDescription withLicenses(LicenseInfo... licenses) {
        if (getLicenses() == null) {
            this.licenses = new java.util.ArrayList<LicenseInfo>(licenses.length);
        }
        for (LicenseInfo value : licenses) {
            this.licenses.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about licenses associated with the package version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenses <p>
     *            Information about licenses associated with the package
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionDescription withLicenses(java.util.Collection<LicenseInfo> licenses) {
        setLicenses(licenses);
        return this;
    }

    /**
     * <p>
     * The revision of the package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         The revision of the package version.
     *         </p>
     */
    public String getRevision() {
        return revision;
    }

    /**
     * <p>
     * The revision of the package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param revision <p>
     *            The revision of the package version.
     *            </p>
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of the package version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param revision <p>
     *            The revision of the package version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionDescription withRevision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * <p>
     * A string that contains the status of the package version. It can be one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived,
     * Disposed, Deleted
     *
     * @return <p>
     *         A string that contains the status of the package version. It can
     *         be one of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Published</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unfinished</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Unlisted</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Archived</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Disposed</code>
     *         </p>
     *         </li>
     *         </ul>
     * @see PackageVersionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * A string that contains the status of the package version. It can be one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived,
     * Disposed, Deleted
     *
     * @param status <p>
     *            A string that contains the status of the package version. It
     *            can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Published</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unfinished</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unlisted</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Archived</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Disposed</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see PackageVersionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A string that contains the status of the package version. It can be one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived,
     * Disposed, Deleted
     *
     * @param status <p>
     *            A string that contains the status of the package version. It
     *            can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Published</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unfinished</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unlisted</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Archived</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Disposed</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageVersionStatus
     */
    public PackageVersionDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * A string that contains the status of the package version. It can be one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived,
     * Disposed, Deleted
     *
     * @param status <p>
     *            A string that contains the status of the package version. It
     *            can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Published</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unfinished</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unlisted</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Archived</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Disposed</code>
     *            </p>
     *            </li>
     *            </ul>
     * @see PackageVersionStatus
     */
    public void setStatus(PackageVersionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * A string that contains the status of the package version. It can be one
     * of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Published</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unfinished</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Unlisted</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Archived</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Disposed</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Published, Unfinished, Unlisted, Archived,
     * Disposed, Deleted
     *
     * @param status <p>
     *            A string that contains the status of the package version. It
     *            can be one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>Published</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unfinished</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Unlisted</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Archived</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>Disposed</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageVersionStatus
     */
    public PackageVersionDescription withStatus(PackageVersionStatus status) {
        this.status = status.toString();
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
        if (getFormat() != null)
            sb.append("format: " + getFormat() + ",");
        if (getNamespace() != null)
            sb.append("namespace: " + getNamespace() + ",");
        if (getPackageName() != null)
            sb.append("packageName: " + getPackageName() + ",");
        if (getDisplayName() != null)
            sb.append("displayName: " + getDisplayName() + ",");
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
        if (getSummary() != null)
            sb.append("summary: " + getSummary() + ",");
        if (getHomePage() != null)
            sb.append("homePage: " + getHomePage() + ",");
        if (getSourceCodeRepository() != null)
            sb.append("sourceCodeRepository: " + getSourceCodeRepository() + ",");
        if (getPublishedTime() != null)
            sb.append("publishedTime: " + getPublishedTime() + ",");
        if (getLicenses() != null)
            sb.append("licenses: " + getLicenses() + ",");
        if (getRevision() != null)
            sb.append("revision: " + getRevision() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode
                + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getHomePage() == null) ? 0 : getHomePage().hashCode());
        hashCode = prime * hashCode
                + ((getSourceCodeRepository() == null) ? 0 : getSourceCodeRepository().hashCode());
        hashCode = prime * hashCode
                + ((getPublishedTime() == null) ? 0 : getPublishedTime().hashCode());
        hashCode = prime * hashCode + ((getLicenses() == null) ? 0 : getLicenses().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageVersionDescription == false)
            return false;
        PackageVersionDescription other = (PackageVersionDescription) obj;

        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null
                && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getHomePage() == null ^ this.getHomePage() == null)
            return false;
        if (other.getHomePage() != null && other.getHomePage().equals(this.getHomePage()) == false)
            return false;
        if (other.getSourceCodeRepository() == null ^ this.getSourceCodeRepository() == null)
            return false;
        if (other.getSourceCodeRepository() != null
                && other.getSourceCodeRepository().equals(this.getSourceCodeRepository()) == false)
            return false;
        if (other.getPublishedTime() == null ^ this.getPublishedTime() == null)
            return false;
        if (other.getPublishedTime() != null
                && other.getPublishedTime().equals(this.getPublishedTime()) == false)
            return false;
        if (other.getLicenses() == null ^ this.getLicenses() == null)
            return false;
        if (other.getLicenses() != null && other.getLicenses().equals(this.getLicenses()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
