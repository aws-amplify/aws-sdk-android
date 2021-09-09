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
 * Creates a fleet provisioning template.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >CreateProvisioningTemplate</a> action.
 * </p>
 */
public class CreateProvisioningTemplateRequest extends AmazonWebServiceRequest implements
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
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     */
    private String templateBody;

    /**
     * <p>
     * True to enable the fleet provisioning template, otherwise false.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The role ARN for the role associated with the fleet provisioning
     * template. This IoT role grants permission to provision a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String provisioningRoleArn;

    /**
     * <p>
     * Creates a pre-provisioning hook template.
     * </p>
     */
    private ProvisioningHook preProvisioningHook;

    /**
     * <p>
     * Metadata which can be used to manage the fleet provisioning template.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

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
    public CreateProvisioningTemplateRequest withTemplateName(String templateName) {
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
    public CreateProvisioningTemplateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     *
     * @return <p>
     *         The JSON formatted contents of the fleet provisioning template.
     *         </p>
     */
    public String getTemplateBody() {
        return templateBody;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     *
     * @param templateBody <p>
     *            The JSON formatted contents of the fleet provisioning
     *            template.
     *            </p>
     */
    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateBody <p>
     *            The JSON formatted contents of the fleet provisioning
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningTemplateRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
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
    public CreateProvisioningTemplateRequest withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * <p>
     * The role ARN for the role associated with the fleet provisioning
     * template. This IoT role grants permission to provision a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The role ARN for the role associated with the fleet provisioning
     *         template. This IoT role grants permission to provision a device.
     *         </p>
     */
    public String getProvisioningRoleArn() {
        return provisioningRoleArn;
    }

    /**
     * <p>
     * The role ARN for the role associated with the fleet provisioning
     * template. This IoT role grants permission to provision a device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param provisioningRoleArn <p>
     *            The role ARN for the role associated with the fleet
     *            provisioning template. This IoT role grants permission to
     *            provision a device.
     *            </p>
     */
    public void setProvisioningRoleArn(String provisioningRoleArn) {
        this.provisioningRoleArn = provisioningRoleArn;
    }

    /**
     * <p>
     * The role ARN for the role associated with the fleet provisioning
     * template. This IoT role grants permission to provision a device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param provisioningRoleArn <p>
     *            The role ARN for the role associated with the fleet
     *            provisioning template. This IoT role grants permission to
     *            provision a device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningTemplateRequest withProvisioningRoleArn(String provisioningRoleArn) {
        this.provisioningRoleArn = provisioningRoleArn;
        return this;
    }

    /**
     * <p>
     * Creates a pre-provisioning hook template.
     * </p>
     *
     * @return <p>
     *         Creates a pre-provisioning hook template.
     *         </p>
     */
    public ProvisioningHook getPreProvisioningHook() {
        return preProvisioningHook;
    }

    /**
     * <p>
     * Creates a pre-provisioning hook template.
     * </p>
     *
     * @param preProvisioningHook <p>
     *            Creates a pre-provisioning hook template.
     *            </p>
     */
    public void setPreProvisioningHook(ProvisioningHook preProvisioningHook) {
        this.preProvisioningHook = preProvisioningHook;
    }

    /**
     * <p>
     * Creates a pre-provisioning hook template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preProvisioningHook <p>
     *            Creates a pre-provisioning hook template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningTemplateRequest withPreProvisioningHook(
            ProvisioningHook preProvisioningHook) {
        this.preProvisioningHook = preProvisioningHook;
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the fleet provisioning template.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     *
     * @return <p>
     *         Metadata which can be used to manage the fleet provisioning
     *         template.
     *         </p>
     *         <note>
     *         <p>
     *         For URI Request parameters use format:
     *         ...key1=value1&amp;key2=value2...
     *         </p>
     *         <p>
     *         For the CLI command-line parameter use format: &amp;&amp;tags
     *         "key1=value1&amp;key2=value2..."
     *         </p>
     *         <p>
     *         For the cli-input-json file use format: "tags":
     *         "key1=value1&amp;key2=value2..."
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the fleet provisioning template.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     *
     * @param tags <p>
     *            Metadata which can be used to manage the fleet provisioning
     *            template.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * Metadata which can be used to manage the fleet provisioning template.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the fleet provisioning
     *            template.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningTemplateRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the fleet provisioning template.
     * </p>
     * <note>
     * <p>
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     * </p>
     * <p>
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     * </p>
     * <p>
     * For the cli-input-json file use format: "tags":
     * "key1=value1&amp;key2=value2..."
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Metadata which can be used to manage the fleet provisioning
     *            template.
     *            </p>
     *            <note>
     *            <p>
     *            For URI Request parameters use format:
     *            ...key1=value1&amp;key2=value2...
     *            </p>
     *            <p>
     *            For the CLI command-line parameter use format: &amp;&amp;tags
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            <p>
     *            For the cli-input-json file use format: "tags":
     *            "key1=value1&amp;key2=value2..."
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningTemplateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTemplateBody() != null)
            sb.append("templateBody: " + getTemplateBody() + ",");
        if (getEnabled() != null)
            sb.append("enabled: " + getEnabled() + ",");
        if (getProvisioningRoleArn() != null)
            sb.append("provisioningRoleArn: " + getProvisioningRoleArn() + ",");
        if (getPreProvisioningHook() != null)
            sb.append("preProvisioningHook: " + getPreProvisioningHook() + ",");
        if (getTags() != null)
            sb.append("tags: " + getTags());
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
        hashCode = prime * hashCode
                + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getProvisioningRoleArn() == null) ? 0 : getProvisioningRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getPreProvisioningHook() == null) ? 0 : getPreProvisioningHook().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisioningTemplateRequest == false)
            return false;
        CreateProvisioningTemplateRequest other = (CreateProvisioningTemplateRequest) obj;

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
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null
                && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
