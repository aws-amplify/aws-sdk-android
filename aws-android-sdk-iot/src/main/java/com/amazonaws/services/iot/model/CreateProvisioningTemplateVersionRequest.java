/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a new version of a fleet provisioning template.
 * </p>
 */
public class CreateProvisioningTemplateVersionRequest extends AmazonWebServiceRequest implements
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
     * The JSON formatted contents of the fleet provisioning template.
     * </p>
     */
    private String templateBody;

    /**
     * <p>
     * Sets a fleet provision template version as the default version.
     * </p>
     */
    private Boolean setAsDefault;

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
    public CreateProvisioningTemplateVersionRequest withTemplateName(String templateName) {
        this.templateName = templateName;
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
    public CreateProvisioningTemplateVersionRequest withTemplateBody(String templateBody) {
        this.templateBody = templateBody;
        return this;
    }

    /**
     * <p>
     * Sets a fleet provision template version as the default version.
     * </p>
     *
     * @return <p>
     *         Sets a fleet provision template version as the default version.
     *         </p>
     */
    public Boolean isSetAsDefault() {
        return setAsDefault;
    }

    /**
     * <p>
     * Sets a fleet provision template version as the default version.
     * </p>
     *
     * @return <p>
     *         Sets a fleet provision template version as the default version.
     *         </p>
     */
    public Boolean getSetAsDefault() {
        return setAsDefault;
    }

    /**
     * <p>
     * Sets a fleet provision template version as the default version.
     * </p>
     *
     * @param setAsDefault <p>
     *            Sets a fleet provision template version as the default
     *            version.
     *            </p>
     */
    public void setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
    }

    /**
     * <p>
     * Sets a fleet provision template version as the default version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setAsDefault <p>
     *            Sets a fleet provision template version as the default
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateProvisioningTemplateVersionRequest withSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
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
        if (getTemplateBody() != null)
            sb.append("templateBody: " + getTemplateBody() + ",");
        if (getSetAsDefault() != null)
            sb.append("setAsDefault: " + getSetAsDefault());
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
                + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode
                + ((getSetAsDefault() == null) ? 0 : getSetAsDefault().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProvisioningTemplateVersionRequest == false)
            return false;
        CreateProvisioningTemplateVersionRequest other = (CreateProvisioningTemplateVersionRequest) obj;

        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null
                && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getSetAsDefault() == null ^ this.getSetAsDefault() == null)
            return false;
        if (other.getSetAsDefault() != null
                && other.getSetAsDefault().equals(this.getSetAsDefault()) == false)
            return false;
        return true;
    }
}
