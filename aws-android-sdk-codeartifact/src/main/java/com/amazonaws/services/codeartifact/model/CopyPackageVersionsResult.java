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

public class CopyPackageVersionsResult implements Serializable {
    /**
     * <p>
     * A list of the package versions that were successfully copied to your
     * repository.
     * </p>
     */
    private java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions;

    /**
     * <p>
     * A map of package versions that failed to copy and their error codes. The
     * possible error codes are in the <code>PackageVersionError</code> data
     * type. They are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, PackageVersionError> failedVersions;

    /**
     * <p>
     * A list of the package versions that were successfully copied to your
     * repository.
     * </p>
     *
     * @return <p>
     *         A list of the package versions that were successfully copied to
     *         your repository.
     *         </p>
     */
    public java.util.Map<String, SuccessfulPackageVersionInfo> getSuccessfulVersions() {
        return successfulVersions;
    }

    /**
     * <p>
     * A list of the package versions that were successfully copied to your
     * repository.
     * </p>
     *
     * @param successfulVersions <p>
     *            A list of the package versions that were successfully copied
     *            to your repository.
     *            </p>
     */
    public void setSuccessfulVersions(
            java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions) {
        this.successfulVersions = successfulVersions;
    }

    /**
     * <p>
     * A list of the package versions that were successfully copied to your
     * repository.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param successfulVersions <p>
     *            A list of the package versions that were successfully copied
     *            to your repository.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyPackageVersionsResult withSuccessfulVersions(
            java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions) {
        this.successfulVersions = successfulVersions;
        return this;
    }

    /**
     * <p>
     * A list of the package versions that were successfully copied to your
     * repository.
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
    public CopyPackageVersionsResult addsuccessfulVersionsEntry(String key,
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
    public CopyPackageVersionsResult clearsuccessfulVersionsEntries() {
        this.successfulVersions = null;
        return this;
    }

    /**
     * <p>
     * A map of package versions that failed to copy and their error codes. The
     * possible error codes are in the <code>PackageVersionError</code> data
     * type. They are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A map of package versions that failed to copy and their error
     *         codes. The possible error codes are in the
     *         <code>PackageVersionError</code> data type. They are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALREADY_EXISTS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISMATCHED_REVISION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISMATCHED_STATUS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_ALLOWED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_FOUND</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SKIPPED</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.Map<String, PackageVersionError> getFailedVersions() {
        return failedVersions;
    }

    /**
     * <p>
     * A map of package versions that failed to copy and their error codes. The
     * possible error codes are in the <code>PackageVersionError</code> data
     * type. They are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param failedVersions <p>
     *            A map of package versions that failed to copy and their error
     *            codes. The possible error codes are in the
     *            <code>PackageVersionError</code> data type. They are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALREADY_EXISTS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_REVISION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_STATUS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_ALLOWED</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_FOUND</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SKIPPED</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setFailedVersions(java.util.Map<String, PackageVersionError> failedVersions) {
        this.failedVersions = failedVersions;
    }

    /**
     * <p>
     * A map of package versions that failed to copy and their error codes. The
     * possible error codes are in the <code>PackageVersionError</code> data
     * type. They are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failedVersions <p>
     *            A map of package versions that failed to copy and their error
     *            codes. The possible error codes are in the
     *            <code>PackageVersionError</code> data type. They are:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>ALREADY_EXISTS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_REVISION</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>MISMATCHED_STATUS</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_ALLOWED</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NOT_FOUND</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SKIPPED</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyPackageVersionsResult withFailedVersions(
            java.util.Map<String, PackageVersionError> failedVersions) {
        this.failedVersions = failedVersions;
        return this;
    }

    /**
     * <p>
     * A map of package versions that failed to copy and their error codes. The
     * possible error codes are in the <code>PackageVersionError</code> data
     * type. They are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
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
    public CopyPackageVersionsResult addfailedVersionsEntry(String key, PackageVersionError value) {
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
    public CopyPackageVersionsResult clearfailedVersionsEntries() {
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

        if (obj instanceof CopyPackageVersionsResult == false)
            return false;
        CopyPackageVersionsResult other = (CopyPackageVersionsResult) obj;

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
