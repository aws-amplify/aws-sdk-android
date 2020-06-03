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

package com.amazonaws.services.es.model;

import java.io.Serializable;

/**
 * <p>
 * Basic information about a package.
 * </p>
 */
public class PackageDetails implements Serializable {
    /**
     * <p>
     * Internal ID of the package.
     * </p>
     */
    private String packageID;

    /**
     * <p>
     * User specified name of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String packageName;

    /**
     * <p>
     * Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     */
    private String packageType;

    /**
     * <p>
     * User-specified description of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String packageDescription;

    /**
     * <p>
     * Current state of the package. Values are
     * COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPYING, COPY_FAILED, VALIDATING,
     * VALIDATION_FAILED, AVAILABLE, DELETING, DELETED, DELETE_FAILED
     */
    private String packageStatus;

    /**
     * <p>
     * Timestamp which tells creation date of the package.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * Additional information if the package is in an error state. Null
     * otherwise.
     * </p>
     */
    private ErrorDetails errorDetails;

    /**
     * <p>
     * Internal ID of the package.
     * </p>
     *
     * @return <p>
     *         Internal ID of the package.
     *         </p>
     */
    public String getPackageID() {
        return packageID;
    }

    /**
     * <p>
     * Internal ID of the package.
     * </p>
     *
     * @param packageID <p>
     *            Internal ID of the package.
     *            </p>
     */
    public void setPackageID(String packageID) {
        this.packageID = packageID;
    }

    /**
     * <p>
     * Internal ID of the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param packageID <p>
     *            Internal ID of the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageDetails withPackageID(String packageID) {
        this.packageID = packageID;
        return this;
    }

    /**
     * <p>
     * User specified name of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return <p>
     *         User specified name of the package.
     *         </p>
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * <p>
     * User specified name of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param packageName <p>
     *            User specified name of the package.
     *            </p>
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    /**
     * <p>
     * User specified name of the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param packageName <p>
     *            User specified name of the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageDetails withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * <p>
     * Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     *
     * @return <p>
     *         Currently supports only TXT-DICTIONARY.
     *         </p>
     * @see PackageType
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * <p>
     * Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     *
     * @param packageType <p>
     *            Currently supports only TXT-DICTIONARY.
     *            </p>
     * @see PackageType
     */
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * <p>
     * Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     *
     * @param packageType <p>
     *            Currently supports only TXT-DICTIONARY.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageType
     */
    public PackageDetails withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * <p>
     * Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     *
     * @param packageType <p>
     *            Currently supports only TXT-DICTIONARY.
     *            </p>
     * @see PackageType
     */
    public void setPackageType(PackageType packageType) {
        this.packageType = packageType.toString();
    }

    /**
     * <p>
     * Currently supports only TXT-DICTIONARY.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TXT-DICTIONARY
     *
     * @param packageType <p>
     *            Currently supports only TXT-DICTIONARY.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageType
     */
    public PackageDetails withPackageType(PackageType packageType) {
        this.packageType = packageType.toString();
        return this;
    }

    /**
     * <p>
     * User-specified description of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         User-specified description of the package.
     *         </p>
     */
    public String getPackageDescription() {
        return packageDescription;
    }

    /**
     * <p>
     * User-specified description of the package.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param packageDescription <p>
     *            User-specified description of the package.
     *            </p>
     */
    public void setPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
    }

    /**
     * <p>
     * User-specified description of the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param packageDescription <p>
     *            User-specified description of the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageDetails withPackageDescription(String packageDescription) {
        this.packageDescription = packageDescription;
        return this;
    }

    /**
     * <p>
     * Current state of the package. Values are
     * COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPYING, COPY_FAILED, VALIDATING,
     * VALIDATION_FAILED, AVAILABLE, DELETING, DELETED, DELETE_FAILED
     *
     * @return <p>
     *         Current state of the package. Values are
     *         COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     *         </p>
     * @see PackageStatus
     */
    public String getPackageStatus() {
        return packageStatus;
    }

    /**
     * <p>
     * Current state of the package. Values are
     * COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPYING, COPY_FAILED, VALIDATING,
     * VALIDATION_FAILED, AVAILABLE, DELETING, DELETED, DELETE_FAILED
     *
     * @param packageStatus <p>
     *            Current state of the package. Values are
     *            COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     *            </p>
     * @see PackageStatus
     */
    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }

    /**
     * <p>
     * Current state of the package. Values are
     * COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPYING, COPY_FAILED, VALIDATING,
     * VALIDATION_FAILED, AVAILABLE, DELETING, DELETED, DELETE_FAILED
     *
     * @param packageStatus <p>
     *            Current state of the package. Values are
     *            COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageStatus
     */
    public PackageDetails withPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
        return this;
    }

    /**
     * <p>
     * Current state of the package. Values are
     * COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPYING, COPY_FAILED, VALIDATING,
     * VALIDATION_FAILED, AVAILABLE, DELETING, DELETED, DELETE_FAILED
     *
     * @param packageStatus <p>
     *            Current state of the package. Values are
     *            COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     *            </p>
     * @see PackageStatus
     */
    public void setPackageStatus(PackageStatus packageStatus) {
        this.packageStatus = packageStatus.toString();
    }

    /**
     * <p>
     * Current state of the package. Values are
     * COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COPYING, COPY_FAILED, VALIDATING,
     * VALIDATION_FAILED, AVAILABLE, DELETING, DELETED, DELETE_FAILED
     *
     * @param packageStatus <p>
     *            Current state of the package. Values are
     *            COPYING/COPY_FAILED/AVAILABLE/DELETING/DELETE_FAILED
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PackageStatus
     */
    public PackageDetails withPackageStatus(PackageStatus packageStatus) {
        this.packageStatus = packageStatus.toString();
        return this;
    }

    /**
     * <p>
     * Timestamp which tells creation date of the package.
     * </p>
     *
     * @return <p>
     *         Timestamp which tells creation date of the package.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * Timestamp which tells creation date of the package.
     * </p>
     *
     * @param createdAt <p>
     *            Timestamp which tells creation date of the package.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * Timestamp which tells creation date of the package.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            Timestamp which tells creation date of the package.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageDetails withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * Additional information if the package is in an error state. Null
     * otherwise.
     * </p>
     *
     * @return <p>
     *         Additional information if the package is in an error state. Null
     *         otherwise.
     *         </p>
     */
    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    /**
     * <p>
     * Additional information if the package is in an error state. Null
     * otherwise.
     * </p>
     *
     * @param errorDetails <p>
     *            Additional information if the package is in an error state.
     *            Null otherwise.
     *            </p>
     */
    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * <p>
     * Additional information if the package is in an error state. Null
     * otherwise.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorDetails <p>
     *            Additional information if the package is in an error state.
     *            Null otherwise.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PackageDetails withErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
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
        if (getPackageID() != null)
            sb.append("PackageID: " + getPackageID() + ",");
        if (getPackageName() != null)
            sb.append("PackageName: " + getPackageName() + ",");
        if (getPackageType() != null)
            sb.append("PackageType: " + getPackageType() + ",");
        if (getPackageDescription() != null)
            sb.append("PackageDescription: " + getPackageDescription() + ",");
        if (getPackageStatus() != null)
            sb.append("PackageStatus: " + getPackageStatus() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: " + getErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPackageID() == null) ? 0 : getPackageID().hashCode());
        hashCode = prime * hashCode
                + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        hashCode = prime * hashCode
                + ((getPackageType() == null) ? 0 : getPackageType().hashCode());
        hashCode = prime * hashCode
                + ((getPackageDescription() == null) ? 0 : getPackageDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPackageStatus() == null) ? 0 : getPackageStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PackageDetails == false)
            return false;
        PackageDetails other = (PackageDetails) obj;

        if (other.getPackageID() == null ^ this.getPackageID() == null)
            return false;
        if (other.getPackageID() != null
                && other.getPackageID().equals(this.getPackageID()) == false)
            return false;
        if (other.getPackageName() == null ^ this.getPackageName() == null)
            return false;
        if (other.getPackageName() != null
                && other.getPackageName().equals(this.getPackageName()) == false)
            return false;
        if (other.getPackageType() == null ^ this.getPackageType() == null)
            return false;
        if (other.getPackageType() != null
                && other.getPackageType().equals(this.getPackageType()) == false)
            return false;
        if (other.getPackageDescription() == null ^ this.getPackageDescription() == null)
            return false;
        if (other.getPackageDescription() != null
                && other.getPackageDescription().equals(this.getPackageDescription()) == false)
            return false;
        if (other.getPackageStatus() == null ^ this.getPackageStatus() == null)
            return false;
        if (other.getPackageStatus() != null
                && other.getPackageStatus().equals(this.getPackageStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null
                && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        return true;
    }
}
