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
 * Contains information about the external connection of a repository.
 * </p>
 */
public class RepositoryExternalConnectionInfo implements Serializable {
    /**
     * <p>
     * The name of the external connection associated with a repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-:]{1,99}<br/>
     */
    private String externalConnectionName;

    /**
     * <p>
     * The package format associated with a repository's external connection.
     * The valid package formats are:
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
    private String packageFormat;

    /**
     * <p>
     * The status of the external connection of a repository. There is one valid
     * value, <code>Available</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Available
     */
    private String status;

    /**
     * <p>
     * The name of the external connection associated with a repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-:]{1,99}<br/>
     *
     * @return <p>
     *         The name of the external connection associated with a repository.
     *         </p>
     */
    public String getExternalConnectionName() {
        return externalConnectionName;
    }

    /**
     * <p>
     * The name of the external connection associated with a repository.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-:]{1,99}<br/>
     *
     * @param externalConnectionName <p>
     *            The name of the external connection associated with a
     *            repository.
     *            </p>
     */
    public void setExternalConnectionName(String externalConnectionName) {
        this.externalConnectionName = externalConnectionName;
    }

    /**
     * <p>
     * The name of the external connection associated with a repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[A-Za-z0-9][A-Za-z0-9._\-:]{1,99}<br/>
     *
     * @param externalConnectionName <p>
     *            The name of the external connection associated with a
     *            repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RepositoryExternalConnectionInfo withExternalConnectionName(String externalConnectionName) {
        this.externalConnectionName = externalConnectionName;
        return this;
    }

    /**
     * <p>
     * The package format associated with a repository's external connection.
     * The valid package formats are:
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
     *         The package format associated with a repository's external
     *         connection. The valid package formats are:
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
    public String getPackageFormat() {
        return packageFormat;
    }

    /**
     * <p>
     * The package format associated with a repository's external connection.
     * The valid package formats are:
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
     * @param packageFormat <p>
     *            The package format associated with a repository's external
     *            connection. The valid package formats are:
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
    public void setPackageFormat(String packageFormat) {
        this.packageFormat = packageFormat;
    }

    /**
     * <p>
     * The package format associated with a repository's external connection.
     * The valid package formats are:
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
     * @param packageFormat <p>
     *            The package format associated with a repository's external
     *            connection. The valid package formats are:
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
    public RepositoryExternalConnectionInfo withPackageFormat(String packageFormat) {
        this.packageFormat = packageFormat;
        return this;
    }

    /**
     * <p>
     * The package format associated with a repository's external connection.
     * The valid package formats are:
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
     * @param packageFormat <p>
     *            The package format associated with a repository's external
     *            connection. The valid package formats are:
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
    public void setPackageFormat(PackageFormat packageFormat) {
        this.packageFormat = packageFormat.toString();
    }

    /**
     * <p>
     * The package format associated with a repository's external connection.
     * The valid package formats are:
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
     * @param packageFormat <p>
     *            The package format associated with a repository's external
     *            connection. The valid package formats are:
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
    public RepositoryExternalConnectionInfo withPackageFormat(PackageFormat packageFormat) {
        this.packageFormat = packageFormat.toString();
        return this;
    }

    /**
     * <p>
     * The status of the external connection of a repository. There is one valid
     * value, <code>Available</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Available
     *
     * @return <p>
     *         The status of the external connection of a repository. There is
     *         one valid value, <code>Available</code>.
     *         </p>
     * @see ExternalConnectionStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the external connection of a repository. There is one valid
     * value, <code>Available</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Available
     *
     * @param status <p>
     *            The status of the external connection of a repository. There
     *            is one valid value, <code>Available</code>.
     *            </p>
     * @see ExternalConnectionStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the external connection of a repository. There is one valid
     * value, <code>Available</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Available
     *
     * @param status <p>
     *            The status of the external connection of a repository. There
     *            is one valid value, <code>Available</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExternalConnectionStatus
     */
    public RepositoryExternalConnectionInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the external connection of a repository. There is one valid
     * value, <code>Available</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Available
     *
     * @param status <p>
     *            The status of the external connection of a repository. There
     *            is one valid value, <code>Available</code>.
     *            </p>
     * @see ExternalConnectionStatus
     */
    public void setStatus(ExternalConnectionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the external connection of a repository. There is one valid
     * value, <code>Available</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Available
     *
     * @param status <p>
     *            The status of the external connection of a repository. There
     *            is one valid value, <code>Available</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExternalConnectionStatus
     */
    public RepositoryExternalConnectionInfo withStatus(ExternalConnectionStatus status) {
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
        if (getExternalConnectionName() != null)
            sb.append("externalConnectionName: " + getExternalConnectionName() + ",");
        if (getPackageFormat() != null)
            sb.append("packageFormat: " + getPackageFormat() + ",");
        if (getStatus() != null)
            sb.append("status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getExternalConnectionName() == null) ? 0 : getExternalConnectionName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPackageFormat() == null) ? 0 : getPackageFormat().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RepositoryExternalConnectionInfo == false)
            return false;
        RepositoryExternalConnectionInfo other = (RepositoryExternalConnectionInfo) obj;

        if (other.getExternalConnectionName() == null ^ this.getExternalConnectionName() == null)
            return false;
        if (other.getExternalConnectionName() != null
                && other.getExternalConnectionName().equals(this.getExternalConnectionName()) == false)
            return false;
        if (other.getPackageFormat() == null ^ this.getPackageFormat() == null)
            return false;
        if (other.getPackageFormat() != null
                && other.getPackageFormat().equals(this.getPackageFormat()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
