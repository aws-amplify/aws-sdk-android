/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class DescribeManagedJobTemplateResult implements Serializable {
    /**
     * <p>
     * The unique name of a managed template, such as <code>AWS-Reboot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String templateName;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     */
    private String templateArn;

    /**
     * <p>
     * The unique description of a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * The version for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[1-9]+.[0-9]+<br/>
     */
    private String templateVersion;

    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     */
    private java.util.List<String> environments;

    /**
     * <p>
     * A map of key-value pairs that you can use as guidance to specify the
     * inputs for creating a job from a managed template.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from
     * Amazon Web Services managed templates. This parameter can't be used with
     * custom job templates or to create jobs from them.
     * </p>
     * </note>
     */
    private java.util.List<DocumentParameter> documentParameters;

    /**
     * <p>
     * The document schema for a managed job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     */
    private String document;

    /**
     * <p>
     * The unique name of a managed template, such as <code>AWS-Reboot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The unique name of a managed template, such as
     *         <code>AWS-Reboot</code>.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The unique name of a managed template, such as <code>AWS-Reboot</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param templateName <p>
     *            The unique name of a managed template, such as
     *            <code>AWS-Reboot</code>.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The unique name of a managed template, such as <code>AWS-Reboot</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param templateName <p>
     *            The unique name of a managed template, such as
     *            <code>AWS-Reboot</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeManagedJobTemplateResult withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @return <p>
     *         The unique Amazon Resource Name (ARN) of the managed template.
     *         </p>
     */
    public String getTemplateArn() {
        return templateArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @param templateArn <p>
     *            The unique Amazon Resource Name (ARN) of the managed template.
     *            </p>
     */
    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) of the managed template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @param templateArn <p>
     *            The unique Amazon Resource Name (ARN) of the managed template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeManagedJobTemplateResult withTemplateArn(String templateArn) {
        this.templateArn = templateArn;
        return this;
    }

    /**
     * <p>
     * The unique description of a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         The unique description of a managed template.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The unique description of a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            The unique description of a managed template.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The unique description of a managed template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            The unique description of a managed template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeManagedJobTemplateResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The version for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[1-9]+.[0-9]+<br/>
     *
     * @return <p>
     *         The version for a managed template.
     *         </p>
     */
    public String getTemplateVersion() {
        return templateVersion;
    }

    /**
     * <p>
     * The version for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[1-9]+.[0-9]+<br/>
     *
     * @param templateVersion <p>
     *            The version for a managed template.
     *            </p>
     */
    public void setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
    }

    /**
     * <p>
     * The version for a managed template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[1-9]+.[0-9]+<br/>
     *
     * @param templateVersion <p>
     *            The version for a managed template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeManagedJobTemplateResult withTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }

    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     *
     * @return <p>
     *         A list of environments that are supported with the managed job
     *         template.
     *         </p>
     */
    public java.util.List<String> getEnvironments() {
        return environments;
    }

    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     *
     * @param environments <p>
     *            A list of environments that are supported with the managed job
     *            template.
     *            </p>
     */
    public void setEnvironments(java.util.Collection<String> environments) {
        if (environments == null) {
            this.environments = null;
            return;
        }

        this.environments = new java.util.ArrayList<String>(environments);
    }

    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environments <p>
     *            A list of environments that are supported with the managed job
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeManagedJobTemplateResult withEnvironments(String... environments) {
        if (getEnvironments() == null) {
            this.environments = new java.util.ArrayList<String>(environments.length);
        }
        for (String value : environments) {
            this.environments.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param environments <p>
     *            A list of environments that are supported with the managed job
     *            template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeManagedJobTemplateResult withEnvironments(
            java.util.Collection<String> environments) {
        setEnvironments(environments);
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that you can use as guidance to specify the
     * inputs for creating a job from a managed template.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from
     * Amazon Web Services managed templates. This parameter can't be used with
     * custom job templates or to create jobs from them.
     * </p>
     * </note>
     *
     * @return <p>
     *         A map of key-value pairs that you can use as guidance to specify
     *         the inputs for creating a job from a managed template.
     *         </p>
     *         <note>
     *         <p>
     *         <code>documentParameters</code> can only be used when creating
     *         jobs from Amazon Web Services managed templates. This parameter
     *         can't be used with custom job templates or to create jobs from
     *         them.
     *         </p>
     *         </note>
     */
    public java.util.List<DocumentParameter> getDocumentParameters() {
        return documentParameters;
    }

    /**
     * <p>
     * A map of key-value pairs that you can use as guidance to specify the
     * inputs for creating a job from a managed template.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from
     * Amazon Web Services managed templates. This parameter can't be used with
     * custom job templates or to create jobs from them.
     * </p>
     * </note>
     *
     * @param documentParameters <p>
     *            A map of key-value pairs that you can use as guidance to
     *            specify the inputs for creating a job from a managed template.
     *            </p>
     *            <note>
     *            <p>
     *            <code>documentParameters</code> can only be used when creating
     *            jobs from Amazon Web Services managed templates. This
     *            parameter can't be used with custom job templates or to create
     *            jobs from them.
     *            </p>
     *            </note>
     */
    public void setDocumentParameters(java.util.Collection<DocumentParameter> documentParameters) {
        if (documentParameters == null) {
            this.documentParameters = null;
            return;
        }

        this.documentParameters = new java.util.ArrayList<DocumentParameter>(documentParameters);
    }

    /**
     * <p>
     * A map of key-value pairs that you can use as guidance to specify the
     * inputs for creating a job from a managed template.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from
     * Amazon Web Services managed templates. This parameter can't be used with
     * custom job templates or to create jobs from them.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentParameters <p>
     *            A map of key-value pairs that you can use as guidance to
     *            specify the inputs for creating a job from a managed template.
     *            </p>
     *            <note>
     *            <p>
     *            <code>documentParameters</code> can only be used when creating
     *            jobs from Amazon Web Services managed templates. This
     *            parameter can't be used with custom job templates or to create
     *            jobs from them.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeManagedJobTemplateResult withDocumentParameters(
            DocumentParameter... documentParameters) {
        if (getDocumentParameters() == null) {
            this.documentParameters = new java.util.ArrayList<DocumentParameter>(
                    documentParameters.length);
        }
        for (DocumentParameter value : documentParameters) {
            this.documentParameters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A map of key-value pairs that you can use as guidance to specify the
     * inputs for creating a job from a managed template.
     * </p>
     * <note>
     * <p>
     * <code>documentParameters</code> can only be used when creating jobs from
     * Amazon Web Services managed templates. This parameter can't be used with
     * custom job templates or to create jobs from them.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param documentParameters <p>
     *            A map of key-value pairs that you can use as guidance to
     *            specify the inputs for creating a job from a managed template.
     *            </p>
     *            <note>
     *            <p>
     *            <code>documentParameters</code> can only be used when creating
     *            jobs from Amazon Web Services managed templates. This
     *            parameter can't be used with custom job templates or to create
     *            jobs from them.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeManagedJobTemplateResult withDocumentParameters(
            java.util.Collection<DocumentParameter> documentParameters) {
        setDocumentParameters(documentParameters);
        return this;
    }

    /**
     * <p>
     * The document schema for a managed job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @return <p>
     *         The document schema for a managed job template.
     *         </p>
     */
    public String getDocument() {
        return document;
    }

    /**
     * <p>
     * The document schema for a managed job template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @param document <p>
     *            The document schema for a managed job template.
     *            </p>
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The document schema for a managed job template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32768<br/>
     *
     * @param document <p>
     *            The document schema for a managed job template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeManagedJobTemplateResult withDocument(String document) {
        this.document = document;
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
        if (getTemplateArn() != null)
            sb.append("templateArn: " + getTemplateArn() + ",");
        if (getDescription() != null)
            sb.append("description: " + getDescription() + ",");
        if (getTemplateVersion() != null)
            sb.append("templateVersion: " + getTemplateVersion() + ",");
        if (getEnvironments() != null)
            sb.append("environments: " + getEnvironments() + ",");
        if (getDocumentParameters() != null)
            sb.append("documentParameters: " + getDocumentParameters() + ",");
        if (getDocument() != null)
            sb.append("document: " + getDocument());
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
                + ((getTemplateArn() == null) ? 0 : getTemplateArn().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateVersion() == null) ? 0 : getTemplateVersion().hashCode());
        hashCode = prime * hashCode
                + ((getEnvironments() == null) ? 0 : getEnvironments().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentParameters() == null) ? 0 : getDocumentParameters().hashCode());
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeManagedJobTemplateResult == false)
            return false;
        DescribeManagedJobTemplateResult other = (DescribeManagedJobTemplateResult) obj;

        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null
                && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getTemplateArn() == null ^ this.getTemplateArn() == null)
            return false;
        if (other.getTemplateArn() != null
                && other.getTemplateArn().equals(this.getTemplateArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTemplateVersion() == null ^ this.getTemplateVersion() == null)
            return false;
        if (other.getTemplateVersion() != null
                && other.getTemplateVersion().equals(this.getTemplateVersion()) == false)
            return false;
        if (other.getEnvironments() == null ^ this.getEnvironments() == null)
            return false;
        if (other.getEnvironments() != null
                && other.getEnvironments().equals(this.getEnvironments()) == false)
            return false;
        if (other.getDocumentParameters() == null ^ this.getDocumentParameters() == null)
            return false;
        if (other.getDocumentParameters() != null
                && other.getDocumentParameters().equals(this.getDocumentParameters()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        return true;
    }
}
