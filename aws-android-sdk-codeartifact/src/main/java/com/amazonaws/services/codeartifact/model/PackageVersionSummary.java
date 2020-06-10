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
 * Details about a package version, including its status, version, and revision.
 * The <a href=
 * "https://docs.aws.amazon.com/codeartifact/latest/APIReference/API_ListPackageVersions.html"
 * > <code>ListPackageVersions</code> </a> operation returns a list of
 * <code>PackageVersionSummary</code> objects.
 * </p>
 */
public class PackageVersionSummary implements Serializable {
    /**
     * <p>
     * Information about a package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     */
    private String version;

    /**
     * <p>
     * The revision associated with a package version.
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
     * Information about a package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @return <p>
     *         Information about a package version.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * Information about a package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[^!#/\s]+<br/>
     *
     * @param version <p>
     *            Information about a package version.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * Information about a package version.
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
     *            Information about a package version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionSummary withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * <p>
     * The revision associated with a package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @return <p>
     *         The revision associated with a package version.
     *         </p>
     */
    public String getRevision() {
        return revision;
    }

    /**
     * <p>
     * The revision associated with a package version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     * <b>Pattern: </b>\S+<br/>
     *
     * @param revision <p>
     *            The revision associated with a package version.
     *            </p>
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision associated with a package version.
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
     *            The revision associated with a package version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageVersionSummary withRevision(String revision) {
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
    public PackageVersionSummary withStatus(String status) {
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
    public PackageVersionSummary withStatus(PackageVersionStatus status) {
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
        if (getVersion() != null)
            sb.append("version: " + getVersion() + ",");
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

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
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

        if (obj instanceof PackageVersionSummary == false)
            return false;
        PackageVersionSummary other = (PackageVersionSummary) obj;

        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
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
