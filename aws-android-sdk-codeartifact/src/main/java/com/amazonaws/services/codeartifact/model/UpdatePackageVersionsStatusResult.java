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

public class UpdatePackageVersionsStatusResult implements Serializable {
    /**
     * <p>
     * A list of <code>PackageVersionError</code> objects, one for each package
     * version with a status that failed to update.
     * </p>
     */
    private java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions;

    /**
     * <p>
     * A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each
     * package version with a status that successfully updated.
     * </p>
     */
    private java.util.Map<String, PackageVersionError> failedVersions;

    /**
     * <p>
     * A list of <code>PackageVersionError</code> objects, one for each package
     * version with a status that failed to update.
     * </p>
     *
     * @return <p>
     *         A list of <code>PackageVersionError</code> objects, one for each
     *         package version with a status that failed to update.
     *         </p>
     */
    public java.util.Map<String, SuccessfulPackageVersionInfo> getSuccessfulVersions() {
        return successfulVersions;
    }

    /**
     * <p>
     * A list of <code>PackageVersionError</code> objects, one for each package
     * version with a status that failed to update.
     * </p>
     *
     * @param successfulVersions <p>
     *            A list of <code>PackageVersionError</code> objects, one for
     *            each package version with a status that failed to update.
     *            </p>
     */
    public void setSuccessfulVersions(
            java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions) {
        this.successfulVersions = successfulVersions;
    }

    /**
     * <p>
     * A list of <code>PackageVersionError</code> objects, one for each package
     * version with a status that failed to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulVersions <p>
     *            A list of <code>PackageVersionError</code> objects, one for
     *            each package version with a status that failed to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageVersionsStatusResult withSuccessfulVersions(
            java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions) {
        this.successfulVersions = successfulVersions;
        return this;
    }

    /**
     * <p>
     * A list of <code>PackageVersionError</code> objects, one for each package
     * version with a status that failed to update.
     * </p>
     * <p>
     * The method adds a new key-value pair into successfulVersions parameter,
     * and returns a reference to this object so that method calls can be
     * chained together.
     *
     * @param key The key of the entry to be added into successfulVersions.
     * @param value The corresponding value of the entry to be added into
     *            successfulVersions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageVersionsStatusResult addsuccessfulVersionsEntry(String key,
            SuccessfulPackageVersionInfo value) {
        if (null == this.successfulVersions) {
            this.successfulVersions = new java.util.HashMap<String, SuccessfulPackageVersionInfo>();
        }
        if (this.successfulVersions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.successfulVersions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into successfulVersions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdatePackageVersionsStatusResult clearsuccessfulVersionsEntries() {
        this.successfulVersions = null;
        return this;
    }

    /**
     * <p>
     * A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each
     * package version with a status that successfully updated.
     * </p>
     *
     * @return <p>
     *         A list of <code>SuccessfulPackageVersionInfo</code> objects, one
     *         for each package version with a status that successfully updated.
     *         </p>
     */
    public java.util.Map<String, PackageVersionError> getFailedVersions() {
        return failedVersions;
    }

    /**
     * <p>
     * A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each
     * package version with a status that successfully updated.
     * </p>
     *
     * @param failedVersions <p>
     *            A list of <code>SuccessfulPackageVersionInfo</code> objects,
     *            one for each package version with a status that successfully
     *            updated.
     *            </p>
     */
    public void setFailedVersions(java.util.Map<String, PackageVersionError> failedVersions) {
        this.failedVersions = failedVersions;
    }

    /**
     * <p>
     * A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each
     * package version with a status that successfully updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedVersions <p>
     *            A list of <code>SuccessfulPackageVersionInfo</code> objects,
     *            one for each package version with a status that successfully
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageVersionsStatusResult withFailedVersions(
            java.util.Map<String, PackageVersionError> failedVersions) {
        this.failedVersions = failedVersions;
        return this;
    }

    /**
     * <p>
     * A list of <code>SuccessfulPackageVersionInfo</code> objects, one for each
     * package version with a status that successfully updated.
     * </p>
     * <p>
     * The method adds a new key-value pair into failedVersions parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into failedVersions.
     * @param value The corresponding value of the entry to be added into
     *            failedVersions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdatePackageVersionsStatusResult addfailedVersionsEntry(String key,
            PackageVersionError value) {
        if (null == this.failedVersions) {
            this.failedVersions = new java.util.HashMap<String, PackageVersionError>();
        }
        if (this.failedVersions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.failedVersions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into failedVersions.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public UpdatePackageVersionsStatusResult clearfailedVersionsEntries() {
        this.failedVersions = null;
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
        if (getSuccessfulVersions() != null)
            sb.append("successfulVersions: " + getSuccessfulVersions() + ",");
        if (getFailedVersions() != null)
            sb.append("failedVersions: " + getFailedVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSuccessfulVersions() == null) ? 0 : getSuccessfulVersions().hashCode());
        hashCode = prime * hashCode
                + ((getFailedVersions() == null) ? 0 : getFailedVersions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePackageVersionsStatusResult == false)
            return false;
        UpdatePackageVersionsStatusResult other = (UpdatePackageVersionsStatusResult) obj;

        if (other.getSuccessfulVersions() == null ^ this.getSuccessfulVersions() == null)
            return false;
        if (other.getSuccessfulVersions() != null
                && other.getSuccessfulVersions().equals(this.getSuccessfulVersions()) == false)
            return false;
        if (other.getFailedVersions() == null ^ this.getFailedVersions() == null)
            return false;
        if (other.getFailedVersions() != null
                && other.getFailedVersions().equals(this.getFailedVersions()) == false)
            return false;
        return true;
    }
}
