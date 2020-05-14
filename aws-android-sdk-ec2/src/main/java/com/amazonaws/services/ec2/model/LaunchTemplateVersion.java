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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a launch template version.
 * </p>
 */
public class LaunchTemplateVersion implements Serializable {
    /**
     * <p>
     * The ID of the launch template.
     * </p>
     */
    private String launchTemplateId;

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     */
    private String launchTemplateName;

    /**
     * <p>
     * The version number.
     * </p>
     */
    private Long versionNumber;

    /**
     * <p>
     * The description for the version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String versionDescription;

    /**
     * <p>
     * The time the version was created.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The principal that created the version.
     * </p>
     */
    private String createdBy;

    /**
     * <p>
     * Indicates whether the version is the default version.
     * </p>
     */
    private Boolean defaultVersion;

    /**
     * <p>
     * Information about the launch template.
     * </p>
     */
    private ResponseLaunchTemplateData launchTemplateData;

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     *
     * @return <p>
     *         The ID of the launch template.
     *         </p>
     */
    public String getLaunchTemplateId() {
        return launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     *
     * @param launchTemplateId <p>
     *            The ID of the launch template.
     *            </p>
     */
    public void setLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    /**
     * <p>
     * The ID of the launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateId <p>
     *            The ID of the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateVersion withLaunchTemplateId(String launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     *
     * @return <p>
     *         The name of the launch template.
     *         </p>
     */
    public String getLaunchTemplateName() {
        return launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     *
     * @param launchTemplateName <p>
     *            The name of the launch template.
     *            </p>
     */
    public void setLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    /**
     * <p>
     * The name of the launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\(\)\.\-/_]+<br/>
     *
     * @param launchTemplateName <p>
     *            The name of the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateVersion withLaunchTemplateName(String launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }

    /**
     * <p>
     * The version number.
     * </p>
     *
     * @return <p>
     *         The version number.
     *         </p>
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * <p>
     * The version number.
     * </p>
     *
     * @param versionNumber <p>
     *            The version number.
     *            </p>
     */
    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionNumber <p>
     *            The version number.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateVersion withVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }

    /**
     * <p>
     * The description for the version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The description for the version.
     *         </p>
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * <p>
     * The description for the version.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param versionDescription <p>
     *            The description for the version.
     *            </p>
     */
    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * The description for the version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param versionDescription <p>
     *            The description for the version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateVersion withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * <p>
     * The time the version was created.
     * </p>
     *
     * @return <p>
     *         The time the version was created.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The time the version was created.
     * </p>
     *
     * @param createTime <p>
     *            The time the version was created.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time the version was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The time the version was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateVersion withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The principal that created the version.
     * </p>
     *
     * @return <p>
     *         The principal that created the version.
     *         </p>
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * <p>
     * The principal that created the version.
     * </p>
     *
     * @param createdBy <p>
     *            The principal that created the version.
     *            </p>
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The principal that created the version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdBy <p>
     *            The principal that created the version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateVersion withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * <p>
     * Indicates whether the version is the default version.
     * </p>
     *
     * @return <p>
     *         Indicates whether the version is the default version.
     *         </p>
     */
    public Boolean isDefaultVersion() {
        return defaultVersion;
    }

    /**
     * <p>
     * Indicates whether the version is the default version.
     * </p>
     *
     * @return <p>
     *         Indicates whether the version is the default version.
     *         </p>
     */
    public Boolean getDefaultVersion() {
        return defaultVersion;
    }

    /**
     * <p>
     * Indicates whether the version is the default version.
     * </p>
     *
     * @param defaultVersion <p>
     *            Indicates whether the version is the default version.
     *            </p>
     */
    public void setDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
    }

    /**
     * <p>
     * Indicates whether the version is the default version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultVersion <p>
     *            Indicates whether the version is the default version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateVersion withDefaultVersion(Boolean defaultVersion) {
        this.defaultVersion = defaultVersion;
        return this;
    }

    /**
     * <p>
     * Information about the launch template.
     * </p>
     *
     * @return <p>
     *         Information about the launch template.
     *         </p>
     */
    public ResponseLaunchTemplateData getLaunchTemplateData() {
        return launchTemplateData;
    }

    /**
     * <p>
     * Information about the launch template.
     * </p>
     *
     * @param launchTemplateData <p>
     *            Information about the launch template.
     *            </p>
     */
    public void setLaunchTemplateData(ResponseLaunchTemplateData launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
    }

    /**
     * <p>
     * Information about the launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateData <p>
     *            Information about the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LaunchTemplateVersion withLaunchTemplateData(
            ResponseLaunchTemplateData launchTemplateData) {
        this.launchTemplateData = launchTemplateData;
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
        if (getLaunchTemplateId() != null)
            sb.append("LaunchTemplateId: " + getLaunchTemplateId() + ",");
        if (getLaunchTemplateName() != null)
            sb.append("LaunchTemplateName: " + getLaunchTemplateName() + ",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: " + getVersionNumber() + ",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: " + getVersionDescription() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: " + getCreatedBy() + ",");
        if (getDefaultVersion() != null)
            sb.append("DefaultVersion: " + getDefaultVersion() + ",");
        if (getLaunchTemplateData() != null)
            sb.append("LaunchTemplateData: " + getLaunchTemplateData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLaunchTemplateId() == null) ? 0 : getLaunchTemplateId().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplateName() == null) ? 0 : getLaunchTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode
                + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultVersion() == null) ? 0 : getDefaultVersion().hashCode());
        hashCode = prime * hashCode
                + ((getLaunchTemplateData() == null) ? 0 : getLaunchTemplateData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LaunchTemplateVersion == false)
            return false;
        LaunchTemplateVersion other = (LaunchTemplateVersion) obj;

        if (other.getLaunchTemplateId() == null ^ this.getLaunchTemplateId() == null)
            return false;
        if (other.getLaunchTemplateId() != null
                && other.getLaunchTemplateId().equals(this.getLaunchTemplateId()) == false)
            return false;
        if (other.getLaunchTemplateName() == null ^ this.getLaunchTemplateName() == null)
            return false;
        if (other.getLaunchTemplateName() != null
                && other.getLaunchTemplateName().equals(this.getLaunchTemplateName()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null
                && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null
                && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null
                && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getDefaultVersion() == null ^ this.getDefaultVersion() == null)
            return false;
        if (other.getDefaultVersion() != null
                && other.getDefaultVersion().equals(this.getDefaultVersion()) == false)
            return false;
        if (other.getLaunchTemplateData() == null ^ this.getLaunchTemplateData() == null)
            return false;
        if (other.getLaunchTemplateData() != null
                && other.getLaunchTemplateData().equals(this.getLaunchTemplateData()) == false)
            return false;
        return true;
    }
}
