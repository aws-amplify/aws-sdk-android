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

public class CreateProvisioningTemplateVersionResult implements Serializable {
    /**
     * <p>
     * The ARN that identifies the provisioning template.
     * </p>
     */
    private String templateArn;

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[0-9A-Za-z_-]+$<br/>
     */
    private String templateName;

    /**
     * <p>
     * The version of the fleet provisioning template.
     * </p>
     */
    private Integer versionId;

    /**
     * <p>
     * True if the fleet provisioning template version is the default version,
     * otherwise false.
     * </p>
     */
    private Boolean isDefaultVersion;

    /**
     * <p>
     * The ARN that identifies the provisioning template.
     * </p>
     *
     * @return <p>
     *         The ARN that identifies the provisioning template.
     *         </p>
     */
    public String getTemplateArn() {
        return templateArn;
    }

    /**
     * <p>
     * The ARN that identifies the provisioning template.
     * </p>
     *
     * @param templateArn <p>
     *            The ARN that identifies the provisioning template.
     *            </p>
     */
    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The ARN that identifies the provisioning template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateArn <p>
     *            The ARN that identifies the provisioning template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningTemplateVersionResult withTemplateArn(String templateArn) {
        this.templateArn = templateArn;
        return this;
    }

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[0-9A-Za-z_-]+$<br/>
     *
     * @return <p>
     *         The name of the fleet provisioning template.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[0-9A-Za-z_-]+$<br/>
     *
     * @param templateName <p>
     *            The name of the fleet provisioning template.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the fleet provisioning template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>^[0-9A-Za-z_-]+$<br/>
     *
     * @param templateName <p>
     *            The name of the fleet provisioning template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningTemplateVersionResult withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The version of the fleet provisioning template.
     * </p>
     *
     * @return <p>
     *         The version of the fleet provisioning template.
     *         </p>
     */
    public Integer getVersionId() {
        return versionId;
    }

    /**
     * <p>
     * The version of the fleet provisioning template.
     * </p>
     *
     * @param versionId <p>
     *            The version of the fleet provisioning template.
     *            </p>
     */
    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The version of the fleet provisioning template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param versionId <p>
     *            The version of the fleet provisioning template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningTemplateVersionResult withVersionId(Integer versionId) {
        this.versionId = versionId;
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
    public CreateProvisioningTemplateVersionResult withIsDefaultVersion(Boolean isDefaultVersion) {
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
        if (getTemplateArn() != null)
            sb.append("templateArn: " + getTemplateArn() + ",");
        if (getTemplateName() != null)
            sb.append("templateName: " + getTemplateName() + ",");
        if (getVersionId() != null)
            sb.append("versionId: " + getVersionId() + ",");
        if (getIsDefaultVersion() != null)
            sb.append("isDefaultVersion: " + getIsDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
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

        if (obj instanceof CreateProvisioningTemplateVersionResult == false)
            return false;
        CreateProvisioningTemplateVersionResult other = (CreateProvisioningTemplateVersionResult) obj;

        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null
                && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null
                && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null
                && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        return true;
    }
}
