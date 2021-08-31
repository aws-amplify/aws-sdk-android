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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a fleet provisioning template.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >UpdateProvisioningTemplate</a> action.
 * </p>
 */
public class UpdateProvisioningTemplateRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The description of the fleet provisioning template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[^\p{C}]*<br/>
     */
    private String description;

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The ID of the default provisioning template version.
     * </p>
     */
    private Integer defaultVersionId;

    /**
     * <p>
     * The ARN of the role associated with the provisioning template. This IoT
     * role grants permission to provision a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String provisioningRoleArn;

    /**
     * <p>
     * Updates the pre-provisioning hook template.
     * </p>
     */
    private ProvisioningHook preProvisioningHook;

    /**
     * <p>
     * Removes pre-provisioning hook template.
     * </p>
     */
    private Boolean removePreProvisioningHook;

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
    public UpdateProvisioningTemplateRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The description of the fleet provisioning template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[^\p{C}]*<br/>
     *
     * @return <p>
     *         The description of the fleet provisioning template.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the fleet provisioning template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[^\p{C}]*<br/>
     *
     * @param description <p>
     *            The description of the fleet provisioning template.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the fleet provisioning template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 500<br/>
     * <b>Pattern: </b>[^\p{C}]*<br/>
     *
     * @param description <p>
     *            The description of the fleet provisioning template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningTemplateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     *
     * @return <p>
     *         True to enable the fleet provisioning template, otherwise false.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     *
     * @return <p>
     *         True to enable the fleet provisioning template, otherwise false.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     *
     * @param enabled <p>
     *            True to enable the fleet provisioning template, otherwise
     *            false.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            True to enable the fleet provisioning template, otherwise
     *            false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningTemplateRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The ID of the default provisioning template version.
     * </p>
     *
     * @return <p>
     *         The ID of the default provisioning template version.
     *         </p>
     */
    public Integer getDefaultVersionId() {
        return defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default provisioning template version.
     * </p>
     *
     * @param defaultVersionId <p>
     *            The ID of the default provisioning template version.
     *            </p>
     */
    public void setDefaultVersionId(Integer defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }

    /**
     * <p>
     * The ID of the default provisioning template version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultVersionId <p>
     *            The ID of the default provisioning template version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningTemplateRequest withDefaultVersionId(Integer defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
        return this;
    }

    /**
     * <p>
     * The ARN of the role associated with the provisioning template. This IoT
     * role grants permission to provision a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the role associated with the provisioning template.
     *         This IoT role grants permission to provision a device.
     *         </p>
     */
    public String getProvisioningRoleArn() {
        return provisioningRoleArn;
    }

    /**
     * <p>
     * The ARN of the role associated with the provisioning template. This IoT
     * role grants permission to provision a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param provisioningRoleArn <p>
     *            The ARN of the role associated with the provisioning template.
     *            This IoT role grants permission to provision a device.
     *            </p>
     */
    public void setProvisioningRoleArn(String provisioningRoleArn) {
        this.provisioningRoleArn = provisioningRoleArn;
    }

    /**
     * <p>
     * The ARN of the role associated with the provisioning template. This IoT
     * role grants permission to provision a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param provisioningRoleArn <p>
     *            The ARN of the role associated with the provisioning template.
     *            This IoT role grants permission to provision a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningTemplateRequest withProvisioningRoleArn(String provisioningRoleArn) {
        this.provisioningRoleArn = provisioningRoleArn;
        return this;
    }

    /**
     * <p>
     * Updates the pre-provisioning hook template.
     * </p>
     *
     * @return <p>
     *         Updates the pre-provisioning hook template.
     *         </p>
     */
    public ProvisioningHook getPreProvisioningHook() {
        return preProvisioningHook;
    }

    /**
     * <p>
     * Updates the pre-provisioning hook template.
     * </p>
     *
     * @param preProvisioningHook <p>
     *            Updates the pre-provisioning hook template.
     *            </p>
     */
    public void setPreProvisioningHook(ProvisioningHook preProvisioningHook) {
        this.preProvisioningHook = preProvisioningHook;
    }

    /**
     * <p>
     * Updates the pre-provisioning hook template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preProvisioningHook <p>
     *            Updates the pre-provisioning hook template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningTemplateRequest withPreProvisioningHook(
            ProvisioningHook preProvisioningHook) {
        this.preProvisioningHook = preProvisioningHook;
        return this;
    }

    /**
     * <p>
     * Removes pre-provisioning hook template.
     * </p>
     *
     * @return <p>
     *         Removes pre-provisioning hook template.
     *         </p>
     */
    public Boolean isRemovePreProvisioningHook() {
        return removePreProvisioningHook;
    }

    /**
     * <p>
     * Removes pre-provisioning hook template.
     * </p>
     *
     * @return <p>
     *         Removes pre-provisioning hook template.
     *         </p>
     */
    public Boolean getRemovePreProvisioningHook() {
        return removePreProvisioningHook;
    }

    /**
     * <p>
     * Removes pre-provisioning hook template.
     * </p>
     *
     * @param removePreProvisioningHook <p>
     *            Removes pre-provisioning hook template.
     *            </p>
     */
    public void setRemovePreProvisioningHook(Boolean removePreProvisioningHook) {
        this.removePreProvisioningHook = removePreProvisioningHook;
    }

    /**
     * <p>
     * Removes pre-provisioning hook template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removePreProvisioningHook <p>
     *            Removes pre-provisioning hook template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningTemplateRequest withRemovePreProvisioningHook(
            Boolean removePreProvisioningHook) {
        this.removePreProvisioningHook = removePreProvisioningHook;
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
        if (getTemplateName() != null)
            sb.append("templateName: " + getTemplateName() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getEnabled() != null)
            sb.append("enabled: " + getEnabled() + ",");
        if (getDefaultVersionId() != null)
            sb.append("defaultVersionId: " + getDefaultVersionId() + ",");
        if (getProvisioningRoleArn() != null)
            sb.append("provisioningRoleArn: " + getProvisioningRoleArn() + ",");
        if (getPreProvisioningHook() != null)
            sb.append("preProvisioningHook: " + getPreProvisioningHook() + ",");
        if (getRemovePreProvisioningHook() != null)
            sb.append("removePreProvisioningHook: " + getRemovePreProvisioningHook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getProvisioningRoleArn() == null) ? 0 : getProvisioningRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getPreProvisioningHook() == null) ? 0 : getPreProvisioningHook().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemovePreProvisioningHook() == null) ? 0 : getRemovePreProvisioningHook()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisioningTemplateRequest == false)
            return false;
        UpdateProvisioningTemplateRequest other = (UpdateProvisioningTemplateRequest) obj;

        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null)
            return false;
        if (other.getDefaultVersionId() != null
                && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false)
            return false;
        if (other.getProvisioningRoleArn() == null ^ this.getProvisioningRoleArn() == null)
            return false;
        if (other.getProvisioningRoleArn() != null
                && other.getProvisioningRoleArn().equals(this.getProvisioningRoleArn()) == false)
            return false;
        if (other.getPreProvisioningHook() == null ^ this.getPreProvisioningHook() == null)
            return false;
        if (other.getPreProvisioningHook() != null
                && other.getPreProvisioningHook().equals(this.getPreProvisioningHook()) == false)
            return false;
        if (other.getRemovePreProvisioningHook() == null
                ^ this.getRemovePreProvisioningHook() == null)
            return false;
        if (other.getRemovePreProvisioningHook() != null
                && other.getRemovePreProvisioningHook().equals(this.getRemovePreProvisioningHook()) == false)
            return false;
        return true;
    }
}
