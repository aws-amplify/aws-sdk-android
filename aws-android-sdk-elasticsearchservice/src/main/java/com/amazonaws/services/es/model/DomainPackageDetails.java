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
 * Information on a package that is associated with a domain.
 * </p>
 */
public class DomainPackageDetails implements Serializable {
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
     * Timestamp of the most-recent update to the association status.
     * </p>
     */
    private java.util.Date lastUpdated;

    /**
     * <p>
     * Name of the domain you've associated a package with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * <p>
     * State of the association. Values are
     * ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATION_FAILED, ACTIVE,
     * DISSOCIATING, DISSOCIATION_FAILED
     */
    private String domainPackageStatus;

    /**
     * <p>
     * The relative path on Amazon ES nodes, which can be used as synonym_path
     * when the package is synonym file.
     * </p>
     */
    private String referencePath;

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
    public DomainPackageDetails withPackageID(String packageID) {
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
    public DomainPackageDetails withPackageName(String packageName) {
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
    public DomainPackageDetails withPackageType(String packageType) {
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
    public DomainPackageDetails withPackageType(PackageType packageType) {
        this.packageType = packageType.toString();
        return this;
    }

    /**
     * <p>
     * Timestamp of the most-recent update to the association status.
     * </p>
     *
     * @return <p>
     *         Timestamp of the most-recent update to the association status.
     *         </p>
     */
    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * <p>
     * Timestamp of the most-recent update to the association status.
     * </p>
     *
     * @param lastUpdated <p>
     *            Timestamp of the most-recent update to the association status.
     *            </p>
     */
    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * Timestamp of the most-recent update to the association status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastUpdated <p>
     *            Timestamp of the most-recent update to the association status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainPackageDetails withLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    /**
     * <p>
     * Name of the domain you've associated a package with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return <p>
     *         Name of the domain you've associated a package with.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * Name of the domain you've associated a package with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            Name of the domain you've associated a package with.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the domain you've associated a package with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName <p>
     *            Name of the domain you've associated a package with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainPackageDetails withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * State of the association. Values are
     * ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATION_FAILED, ACTIVE,
     * DISSOCIATING, DISSOCIATION_FAILED
     *
     * @return <p>
     *         State of the association. Values are
     *         ASSOCIATING/ASSOCIATION_FAILED
     *         /ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     *         </p>
     * @see DomainPackageStatus
     */
    public String getDomainPackageStatus() {
        return domainPackageStatus;
    }

    /**
     * <p>
     * State of the association. Values are
     * ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATION_FAILED, ACTIVE,
     * DISSOCIATING, DISSOCIATION_FAILED
     *
     * @param domainPackageStatus <p>
     *            State of the association. Values are
     *            ASSOCIATING/ASSOCIATION_FAILED
     *            /ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     *            </p>
     * @see DomainPackageStatus
     */
    public void setDomainPackageStatus(String domainPackageStatus) {
        this.domainPackageStatus = domainPackageStatus;
    }

    /**
     * <p>
     * State of the association. Values are
     * ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATION_FAILED, ACTIVE,
     * DISSOCIATING, DISSOCIATION_FAILED
     *
     * @param domainPackageStatus <p>
     *            State of the association. Values are
     *            ASSOCIATING/ASSOCIATION_FAILED
     *            /ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainPackageStatus
     */
    public DomainPackageDetails withDomainPackageStatus(String domainPackageStatus) {
        this.domainPackageStatus = domainPackageStatus;
        return this;
    }

    /**
     * <p>
     * State of the association. Values are
     * ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATION_FAILED, ACTIVE,
     * DISSOCIATING, DISSOCIATION_FAILED
     *
     * @param domainPackageStatus <p>
     *            State of the association. Values are
     *            ASSOCIATING/ASSOCIATION_FAILED
     *            /ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     *            </p>
     * @see DomainPackageStatus
     */
    public void setDomainPackageStatus(DomainPackageStatus domainPackageStatus) {
        this.domainPackageStatus = domainPackageStatus.toString();
    }

    /**
     * <p>
     * State of the association. Values are
     * ASSOCIATING/ASSOCIATION_FAILED/ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASSOCIATING, ASSOCIATION_FAILED, ACTIVE,
     * DISSOCIATING, DISSOCIATION_FAILED
     *
     * @param domainPackageStatus <p>
     *            State of the association. Values are
     *            ASSOCIATING/ASSOCIATION_FAILED
     *            /ACTIVE/DISSOCIATING/DISSOCIATION_FAILED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DomainPackageStatus
     */
    public DomainPackageDetails withDomainPackageStatus(DomainPackageStatus domainPackageStatus) {
        this.domainPackageStatus = domainPackageStatus.toString();
        return this;
    }

    /**
     * <p>
     * The relative path on Amazon ES nodes, which can be used as synonym_path
     * when the package is synonym file.
     * </p>
     *
     * @return <p>
     *         The relative path on Amazon ES nodes, which can be used as
     *         synonym_path when the package is synonym file.
     *         </p>
     */
    public String getReferencePath() {
        return referencePath;
    }

    /**
     * <p>
     * The relative path on Amazon ES nodes, which can be used as synonym_path
     * when the package is synonym file.
     * </p>
     *
     * @param referencePath <p>
     *            The relative path on Amazon ES nodes, which can be used as
     *            synonym_path when the package is synonym file.
     *            </p>
     */
    public void setReferencePath(String referencePath) {
        this.referencePath = referencePath;
    }

    /**
     * <p>
     * The relative path on Amazon ES nodes, which can be used as synonym_path
     * when the package is synonym file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param referencePath <p>
     *            The relative path on Amazon ES nodes, which can be used as
     *            synonym_path when the package is synonym file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DomainPackageDetails withReferencePath(String referencePath) {
        this.referencePath = referencePath;
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
    public DomainPackageDetails withErrorDetails(ErrorDetails errorDetails) {
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
        if (getLastUpdated() != null)
            sb.append("LastUpdated: " + getLastUpdated() + ",");
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getDomainPackageStatus() != null)
            sb.append("DomainPackageStatus: " + getDomainPackageStatus() + ",");
        if (getReferencePath() != null)
            sb.append("ReferencePath: " + getReferencePath() + ",");
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
                + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getDomainPackageStatus() == null) ? 0 : getDomainPackageStatus().hashCode());
        hashCode = prime * hashCode
                + ((getReferencePath() == null) ? 0 : getReferencePath().hashCode());
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

        if (obj instanceof DomainPackageDetails == false)
            return false;
        DomainPackageDetails other = (DomainPackageDetails) obj;

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
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null
                && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getDomainPackageStatus() == null ^ this.getDomainPackageStatus() == null)
            return false;
        if (other.getDomainPackageStatus() != null
                && other.getDomainPackageStatus().equals(this.getDomainPackageStatus()) == false)
            return false;
        if (other.getReferencePath() == null ^ this.getReferencePath() == null)
            return false;
        if (other.getReferencePath() != null
                && other.getReferencePath().equals(this.getReferencePath()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null
                && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        return true;
    }
}
