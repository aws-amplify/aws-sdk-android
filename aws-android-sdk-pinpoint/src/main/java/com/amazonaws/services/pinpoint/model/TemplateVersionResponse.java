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

/**
 * <p>
 * Provides information about a specific version of a message template.
 * </p>
 */
public class TemplateVersionResponse implements Serializable {
    /**
     * <p>
     * The date, in ISO 8601 format, when the version of the message template
     * was created.
     * </p>
     */
    private String creationDate;

    /**
     * <p>
     * A JSON object that specifies the default values that are used for message
     * variables in the version of the message template. This object is a set of
     * key-value pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable.
     * </p>
     */
    private String defaultSubstitutions;

    /**
     * <p>
     * The date, in ISO 8601 format, when the version of the message template
     * was last modified.
     * </p>
     */
    private String lastModifiedDate;

    /**
     * <p>
     * The custom description of the version of the message template.
     * </p>
     */
    private String templateDescription;

    /**
     * <p>
     * The name of the message template.
     * </p>
     */
    private String templateName;

    /**
     * <p>
     * The type of channel that the message template is designed for. Possible
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     */
    private String templateType;

    /**
     * <p>
     * The unique identifier for the version of the message template. This value
     * is an integer that Amazon Pinpoint automatically increments and assigns
     * to each new version of a template.
     * </p>
     */
    private String version;

    /**
     * <p>
     * The date, in ISO 8601 format, when the version of the message template
     * was created.
     * </p>
     *
     * @return <p>
     *         The date, in ISO 8601 format, when the version of the message
     *         template was created.
     *         </p>
     */
    public String getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the version of the message template
     * was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date, in ISO 8601 format, when the version of the message
     *            template was created.
     *            </p>
     */
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the version of the message template
     * was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date, in ISO 8601 format, when the version of the message
     *            template was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersionResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * A JSON object that specifies the default values that are used for message
     * variables in the version of the message template. This object is a set of
     * key-value pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable.
     * </p>
     *
     * @return <p>
     *         A JSON object that specifies the default values that are used for
     *         message variables in the version of the message template. This
     *         object is a set of key-value pairs. Each key defines a message
     *         variable in the template. The corresponding value defines the
     *         default value for that variable.
     *         </p>
     */
    public String getDefaultSubstitutions() {
        return defaultSubstitutions;
    }

    /**
     * <p>
     * A JSON object that specifies the default values that are used for message
     * variables in the version of the message template. This object is a set of
     * key-value pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable.
     * </p>
     *
     * @param defaultSubstitutions <p>
     *            A JSON object that specifies the default values that are used
     *            for message variables in the version of the message template.
     *            This object is a set of key-value pairs. Each key defines a
     *            message variable in the template. The corresponding value
     *            defines the default value for that variable.
     *            </p>
     */
    public void setDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
    }

    /**
     * <p>
     * A JSON object that specifies the default values that are used for message
     * variables in the version of the message template. This object is a set of
     * key-value pairs. Each key defines a message variable in the template. The
     * corresponding value defines the default value for that variable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultSubstitutions <p>
     *            A JSON object that specifies the default values that are used
     *            for message variables in the version of the message template.
     *            This object is a set of key-value pairs. Each key defines a
     *            message variable in the template. The corresponding value
     *            defines the default value for that variable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersionResponse withDefaultSubstitutions(String defaultSubstitutions) {
        this.defaultSubstitutions = defaultSubstitutions;
        return this;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the version of the message template
     * was last modified.
     * </p>
     *
     * @return <p>
     *         The date, in ISO 8601 format, when the version of the message
     *         template was last modified.
     *         </p>
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the version of the message template
     * was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date, in ISO 8601 format, when the version of the message
     *            template was last modified.
     *            </p>
     */
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date, in ISO 8601 format, when the version of the message template
     * was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date, in ISO 8601 format, when the version of the message
     *            template was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersionResponse withLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The custom description of the version of the message template.
     * </p>
     *
     * @return <p>
     *         The custom description of the version of the message template.
     *         </p>
     */
    public String getTemplateDescription() {
        return templateDescription;
    }

    /**
     * <p>
     * The custom description of the version of the message template.
     * </p>
     *
     * @param templateDescription <p>
     *            The custom description of the version of the message template.
     *            </p>
     */
    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
    }

    /**
     * <p>
     * The custom description of the version of the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateDescription <p>
     *            The custom description of the version of the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersionResponse withTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
        return this;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     *
     * @return <p>
     *         The name of the message template.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     *
     * @param templateName <p>
     *            The name of the message template.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the message template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateName <p>
     *            The name of the message template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersionResponse withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. Possible
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     *
     * @return <p>
     *         The type of channel that the message template is designed for.
     *         Possible values are: EMAIL, PUSH, SMS, and VOICE.
     *         </p>
     */
    public String getTemplateType() {
        return templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. Possible
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            Possible values are: EMAIL, PUSH, SMS, and VOICE.
     *            </p>
     */
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    /**
     * <p>
     * The type of channel that the message template is designed for. Possible
     * values are: EMAIL, PUSH, SMS, and VOICE.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param templateType <p>
     *            The type of channel that the message template is designed for.
     *            Possible values are: EMAIL, PUSH, SMS, and VOICE.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersionResponse withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template. This value
     * is an integer that Amazon Pinpoint automatically increments and assigns
     * to each new version of a template.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the version of the message template.
     *         This value is an integer that Amazon Pinpoint automatically
     *         increments and assigns to each new version of a template.
     *         </p>
     */
    public String getVersion() {
        return version;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template. This value
     * is an integer that Amazon Pinpoint automatically increments and assigns
     * to each new version of a template.
     * </p>
     *
     * @param version <p>
     *            The unique identifier for the version of the message template.
     *            This value is an integer that Amazon Pinpoint automatically
     *            increments and assigns to each new version of a template.
     *            </p>
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The unique identifier for the version of the message template. This value
     * is an integer that Amazon Pinpoint automatically increments and assigns
     * to each new version of a template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param version <p>
     *            The unique identifier for the version of the message template.
     *            This value is an integer that Amazon Pinpoint automatically
     *            increments and assigns to each new version of a template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TemplateVersionResponse withVersion(String version) {
        this.version = version;
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
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDefaultSubstitutions() != null)
            sb.append("DefaultSubstitutions: " + getDefaultSubstitutions() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getTemplateDescription() != null)
            sb.append("TemplateDescription: " + getTemplateDescription() + ",");
        if (getTemplateName() != null)
            sb.append("TemplateName: " + getTemplateName() + ",");
        if (getTemplateType() != null)
            sb.append("TemplateType: " + getTemplateType() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultSubstitutions() == null) ? 0 : getDefaultSubstitutions().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateDescription() == null) ? 0 : getTemplateDescription().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateType() == null) ? 0 : getTemplateType().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateVersionResponse == false)
            return false;
        TemplateVersionResponse other = (TemplateVersionResponse) obj;

        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDefaultSubstitutions() == null ^ this.getDefaultSubstitutions() == null)
            return false;
        if (other.getDefaultSubstitutions() != null
                && other.getDefaultSubstitutions().equals(this.getDefaultSubstitutions()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getTemplateDescription() == null ^ this.getTemplateDescription() == null)
            return false;
        if (other.getTemplateDescription() != null
                && other.getTemplateDescription().equals(this.getTemplateDescription()) == false)
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
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        return true;
    }
}
