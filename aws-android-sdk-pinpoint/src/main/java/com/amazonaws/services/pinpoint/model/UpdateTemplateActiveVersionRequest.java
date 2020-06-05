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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Changes the status of a specific version of a message template to
 * <i>active</i>.
 * </p>
 */
public class UpdateTemplateActiveVersionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies which version of a message template to use as the active
     * version of the template.
     * </p>
     */
    private TemplateActiveVersionRequest templateActiveVersionRequest;

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The type of channel that the message template is designed for. Valid
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * Specifies which version of a message template to use as the active
     * version of the template.
     * </p>
     *
     * @return <p>
     *         Specifies which version of a message template to use as the
     *         active version of the template.
     *         </p>
     */
    public TemplateActiveVersionRequest getTemplateActiveVersionRequest() {
        return templateActiveVersionRequest;
    }

    /**
     * <p>
     * Specifies which version of a message template to use as the active
     * version of the template.
     * </p>
     *
     * @param templateActiveVersionRequest <p>
     *            Specifies which version of a message template to use as the
     *            active version of the template.
     *            </p>
     */
    public void setTemplateActiveVersionRequest(
            TemplateActiveVersionRequest templateActiveVersionRequest) {
        this.templateActiveVersionRequest = templateActiveVersionRequest;
    }

    /**
     * <p>
     * Specifies which version of a message template to use as the active
     * version of the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateActiveVersionRequest <p>
     *            Specifies which version of a message template to use as the
     *            active version of the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplateActiveVersionRequest withTemplateActiveVersionRequest(
            TemplateActiveVersionRequest templateActiveVersionRequest) {
        this.templateActiveVersionRequest = templateActiveVersionRequest;
        return this;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     *
     * @return <p>
     *         The name of the message template. A template name must start with
     *         an alphanumeric character and can contain a maximum of 128
     *         characters. The characters can be alphanumeric characters,
     *         underscores (_), or hyphens (-). Template names are case
     *         sensitive.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     *
     * @param templateName <p>
     *            The name of the message template. A template name must start
     *            with an alphanumeric character and can contain a maximum of
     *            128 characters. The characters can be alphanumeric characters,
     *            underscores (_), or hyphens (-). Template names are case
     *            sensitive.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template. A template name must start with an
     * alphanumeric character and can contain a maximum of 128 characters. The
     * characters can be alphanumeric characters, underscores (_), or hyphens
     * (-). Template names are case sensitive.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the message template. A template name must start
     *            with an alphanumeric character and can contain a maximum of
     *            128 characters. The characters can be alphanumeric characters,
     *            underscores (_), or hyphens (-). Template names are case
     *            sensitive.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplateActiveVersionRequest withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. Valid
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     *
     * @return <p>
     *         The type of channel that the message template is designed for.
     *         Valid values are: EMAIL, PUSH, SMS, and VOICE.
     *         </p>
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. Valid
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            Valid values are: EMAIL, PUSH, SMS, and VOICE.
     *            </p>
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. Valid
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            Valid values are: EMAIL, PUSH, SMS, and VOICE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplateActiveVersionRequest withTemplateType(String templateType) {
        this.templateType = templateType;
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
        if (getTemplateActiveVersionRequest() != null)
            sb.append("TemplateActiveVersionRequest: " + getTemplateActiveVersionRequest() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getTemplateType() != null)
            sb.append("TemplateType: " + getTemplateType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTemplateActiveVersionRequest() == null) ? 0
                        : getTemplateActiveVersionRequest().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTemplateActiveVersionRequest == false)
            return false;
        UpdateTemplateActiveVersionRequest other = (UpdateTemplateActiveVersionRequest) obj;

        if (other.getTemplateActiveVersionRequest() == null
                ^ this.getTemplateActiveVersionRequest() == null)
            return false;
        if (other.getTemplateActiveVersionRequest() != null
                && other.getTemplateActiveVersionRequest().equals(
                        this.getTemplateActiveVersionRequest()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateType() == null ^ this.getTemplateType() == null)
            return false;
        if (other.getTemplateType() != null
                && other.getTemplateType().equals(this.getTemplateType()) == false)
            return false;
        return true;
    }
}
