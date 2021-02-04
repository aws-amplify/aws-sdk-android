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
 * A summary of information about a fleet provisioning template.
 * </p>
 */
public class ProvisioningTemplateSummary implements Serializable {
    /**
     * <p>
     * The ARN of the fleet provisioning template.
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
     * The date when the fleet provisioning template summary was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date when the fleet provisioning template summary was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * True if the fleet provision template is enabled, otherwise false.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The ARN of the fleet provisioning template.
     * </p>
     *
     * @return <p>
     *         The ARN of the fleet provisioning template.
     *         </p>
     */
    public String getTemplateArn() {
        return templateArn;
    }

    /**
     * <p>
     * The ARN of the fleet provisioning template.
     * </p>
     *
     * @param templateArn <p>
     *            The ARN of the fleet provisioning template.
     *            </p>
     */
    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The ARN of the fleet provisioning template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateArn <p>
     *            The ARN of the fleet provisioning template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningTemplateSummary withTemplateArn(String templateArn) {
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
    public ProvisioningTemplateSummary withTemplateName(String templateName) {
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
    public ProvisioningTemplateSummary withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was created.
     * </p>
     *
     * @return <p>
     *         The date when the fleet provisioning template summary was
     *         created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date when the fleet provisioning template summary was
     *            created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date when the fleet provisioning template summary was
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningTemplateSummary withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was last modified.
     * </p>
     *
     * @return <p>
     *         The date when the fleet provisioning template summary was last
     *         modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date when the fleet provisioning template summary was last
     *            modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date when the fleet provisioning template summary was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date when the fleet provisioning template summary was last
     *            modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningTemplateSummary withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * True if the fleet provision template is enabled, otherwise false.
     * </p>
     *
     * @return <p>
     *         True if the fleet provision template is enabled, otherwise false.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * True if the fleet provision template is enabled, otherwise false.
     * </p>
     *
     * @return <p>
     *         True if the fleet provision template is enabled, otherwise false.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * True if the fleet provision template is enabled, otherwise false.
     * </p>
     *
     * @param enabled <p>
     *            True if the fleet provision template is enabled, otherwise
     *            false.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * True if the fleet provision template is enabled, otherwise false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            True if the fleet provision template is enabled, otherwise
     *            false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningTemplateSummary withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        if (getEnabled() != null)
            sb.append("enabled: " + getEnabled());
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
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningTemplateSummary == false)
            return false;
        ProvisioningTemplateSummary other = (ProvisioningTemplateSummary) obj;

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
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
