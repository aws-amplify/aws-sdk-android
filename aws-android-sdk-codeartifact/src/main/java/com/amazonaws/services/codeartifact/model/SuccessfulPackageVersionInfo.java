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
 * Contains the revision and status of a package version.
 * </p>
 */
public class SuccessfulPackageVersionInfo implements Serializable {
    /**
     * <p>
     * The revision of a package version.
     * </p>
     */
    private String revision;

    /**
     * <p>
     * The status of a package version. Valid statuses are:
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
     * The revision of a package version.
     * </p>
     *
     * @return <p>
     *         The revision of a package version.
     *         </p>
     */
    public String getRevision() {
        return revision;
    }

    /**
     * <p>
     * The revision of a package version.
     * </p>
     *
     * @param revision <p>
     *            The revision of a package version.
     *            </p>
     */
    public void setRevision(String revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The revision of a package version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param revision <p>
     *            The revision of a package version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SuccessfulPackageVersionInfo withRevision(String revision) {
        this.revision = revision;
        return this;
    }

    /**
     * <p>
     * The status of a package version. Valid statuses are:
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
     *         The status of a package version. Valid statuses are:
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
     * The status of a package version. Valid statuses are:
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
     *            The status of a package version. Valid statuses are:
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
     * The status of a package version. Valid statuses are:
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
     *            The status of a package version. Valid statuses are:
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
    public SuccessfulPackageVersionInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of a package version. Valid statuses are:
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
     *            The status of a package version. Valid statuses are:
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
     * The status of a package version. Valid statuses are:
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
     *            The status of a package version. Valid statuses are:
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
    public SuccessfulPackageVersionInfo withStatus(PackageVersionStatus status) {
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

        if (obj instanceof SuccessfulPackageVersionInfo == false)
            return false;
        SuccessfulPackageVersionInfo other = (SuccessfulPackageVersionInfo) obj;

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
