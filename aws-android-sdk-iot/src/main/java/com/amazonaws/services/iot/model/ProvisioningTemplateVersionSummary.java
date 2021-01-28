/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * A summary of information about a fleet provision template version.
 * </p>
 */
public class ProvisioningTemplateVersionSummary implements Serializable {
    /**
     * <p>
     * The ID of the fleet privisioning template version.
     * </p>
     */
    private Integer versionId;

    /**
     * <p>
     * The date when the fleet provisioning template version was created
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * True if the fleet provisioning template version is the default version,
     * otherwise false.
     * </p>
     */
    private Boolean isDefaultVersion;

    /**
     * <p>
     * The ID of the fleet privisioning template version.
     * </p>
     *
     * @return <p>
     *         The ID of the fleet privisioning template version.
     *         </p>
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * The ID of the fleet privisioning template version.
     * </p>
     *
     * @param versionId <p>
     *            The ID of the fleet privisioning template version.
     *            </p>
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of the fleet privisioning template version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            The ID of the fleet privisioning template version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningTemplateVersionSummary withVersionId(Integer versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * <p>
     * The date when the fleet provisioning template version was created
     * </p>
     *
     * @return <p>
     *         The date when the fleet provisioning template version was created
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template version was created
     * </p>
     *
     * @param creationDate <p>
     *            The date when the fleet provisioning template version was
     *            created
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template version was created
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date when the fleet provisioning template version was
     *            created
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningTemplateVersionSummary withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version,
     * otherwise false.
     * </p>
     *
     * @return <p>
     *         True if the fleet provisioning template version is the default
     *         version, otherwise false.
     *         </p>
     */
    public Boolean isIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version,
     * otherwise false.
     * </p>
     *
     * @return <p>
     *         True if the fleet provisioning template version is the default
     *         version, otherwise false.
     *         </p>
     */
    public Boolean getIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version,
     * otherwise false.
     * </p>
     *
     * @param isDefaultVersion <p>
     *            True if the fleet provisioning template version is the default
     *            version, otherwise false.
     *            </p>
     */
    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * True if the fleet provisioning template version is the default version,
     * otherwise false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefaultVersion <p>
     *            True if the fleet provisioning template version is the default
     *            version, otherwise false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningTemplateVersionSummary withIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
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
        if (getVersionId() != null)
            sb.append("versionId: " + getVersionId() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getIsDefaultVersion() != null)
            sb.append("isDefaultVersion: " + getIsDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningTemplateVersionSummary == false)
            return false;
        ProvisioningTemplateVersionSummary other = (ProvisioningTemplateVersionSummary) obj;

        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null
                && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        return true;
    }
}
