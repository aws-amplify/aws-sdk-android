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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a provisioning artifact. A provisioning artifact is also
 * known as a product version.
 * </p>
 */
public class ProvisioningArtifact implements Serializable {
    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     */
    private String name;

    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     */
    private String description;

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     */
    private java.util.Date createdTime;

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     */
    private String guidance;

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @return <p>
     *         The identifier of the provisioning artifact.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param id <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-]*<br/>
     *
     * @param id <p>
     *            The identifier of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifact withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @return <p>
     *         The name of the provisioning artifact.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param name <p>
     *            The name of the provisioning artifact.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param name <p>
     *            The name of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifact withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @return <p>
     *         The description of the provisioning artifact.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param description <p>
     *            The description of the provisioning artifact.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the provisioning artifact.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 8192<br/>
     *
     * @param description <p>
     *            The description of the provisioning artifact.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifact withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     *
     * @return <p>
     *         The UTC time stamp of the creation time.
     *         </p>
     */
    public java.util.Date getCreatedTime() {
        return createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     *
     * @param createdTime <p>
     *            The UTC time stamp of the creation time.
     *            </p>
     */
    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The UTC time stamp of the creation time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdTime <p>
     *            The UTC time stamp of the creation time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningArtifact withCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     *
     * @return <p>
     *         Information set by the administrator to provide guidance to end
     *         users about which provisioning artifacts to use.
     *         </p>
     * @see ProvisioningArtifactGuidance
     */
    public String getGuidance() {
        return guidance;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     *
     * @param guidance <p>
     *            Information set by the administrator to provide guidance to
     *            end users about which provisioning artifacts to use.
     *            </p>
     * @see ProvisioningArtifactGuidance
     */
    public void setGuidance(String guidance) {
        this.guidance = guidance;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     *
     * @param guidance <p>
     *            Information set by the administrator to provide guidance to
     *            end users about which provisioning artifacts to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisioningArtifactGuidance
     */
    public ProvisioningArtifact withGuidance(String guidance) {
        this.guidance = guidance;
        return this;
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     *
     * @param guidance <p>
     *            Information set by the administrator to provide guidance to
     *            end users about which provisioning artifacts to use.
     *            </p>
     * @see ProvisioningArtifactGuidance
     */
    public void setGuidance(ProvisioningArtifactGuidance guidance) {
        this.guidance = guidance.toString();
    }

    /**
     * <p>
     * Information set by the administrator to provide guidance to end users
     * about which provisioning artifacts to use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>DEFAULT, DEPRECATED
     *
     * @param guidance <p>
     *            Information set by the administrator to provide guidance to
     *            end users about which provisioning artifacts to use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ProvisioningArtifactGuidance
     */
    public ProvisioningArtifact withGuidance(ProvisioningArtifactGuidance guidance) {
        this.guidance = guidance.toString();
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: " + getCreatedTime() + ",");
        if (getGuidance() != null)
            sb.append("Guidance: " + getGuidance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getGuidance() == null) ? 0 : getGuidance().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningArtifact == false)
            return false;
        ProvisioningArtifact other = (ProvisioningArtifact) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null
                && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getGuidance() == null ^ this.getGuidance() == null)
            return false;
        if (other.getGuidance() != null && other.getGuidance().equals(this.getGuidance()) == false)
            return false;
        return true;
    }
}
