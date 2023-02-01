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

/**
 * <p>
 * An object that contains information about the managed template.
 * </p>
 */
public class ManagedJobTemplateSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     */
    private String templateArn;

    /**
     * <p>
     * The unique Name for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String templateName;

    /**
     * <p>
     * The description for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     */
    private String description;

    /**
     * <p>
     * A list of environments that are supported with the managed job template.
     * </p>
     */
    private java.util.List<String> environments;

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
     * The Amazon Resource Name (ARN) for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for a managed template.
     *         </p>
     */
    public String getTemplateArn() {
        return templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>^arn:[!-~]+$<br/>
     *
     * @param templateArn <p>
     *            The Amazon Resource Name (ARN) for a managed template.
     *            </p>
     */
    public void setTemplateArn(String templateArn) {
        this.templateArn = templateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for a managed template.
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
     *            The Amazon Resource Name (ARN) for a managed template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedJobTemplateSummary withTemplateArn(String templateArn) {
        this.templateArn = templateArn;
        return this;
    }

    /**
     * <p>
     * The unique Name for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The unique Name for a managed template.
     *         </p>
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * <p>
     * The unique Name for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param templateName <p>
     *            The unique Name for a managed template.
     *            </p>
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The unique Name for a managed template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param templateName <p>
     *            The unique Name for a managed template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedJobTemplateSummary withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * <p>
     * The description for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @return <p>
     *         The description for a managed template.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description for a managed template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2028<br/>
     * <b>Pattern: </b>[^\p{C}]+<br/>
     *
     * @param description <p>
     *            The description for a managed template.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for a managed template.
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
     *            The description for a managed template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ManagedJobTemplateSummary withDescription(String description) {
        this.description = description;
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
    public ManagedJobTemplateSummary withEnvironments(String... environments) {
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
    public ManagedJobTemplateSummary withEnvironments(java.util.Collection<String> environments) {
        setEnvironments(environments);
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
    public ManagedJobTemplateSummary withTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
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
        if (getEnvironments() != null)
            sb.append("environments: " + getEnvironments() + ",");
        if (getTemplateVersion() != null)
            sb.append("templateVersion: " + getTemplateVersion());
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
                + ((getEnvironments() == null) ? 0 : getEnvironments().hashCode());
        hashCode = prime * hashCode
                + ((getTemplateVersion() == null) ? 0 : getTemplateVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ManagedJobTemplateSummary == false)
            return false;
        ManagedJobTemplateSummary other = (ManagedJobTemplateSummary) obj;

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
        if (other.getEnvironments() == null ^ this.getEnvironments() == null)
            return false;
        if (other.getEnvironments() != null
                && other.getEnvironments().equals(this.getEnvironments()) == false)
            return false;
        if (other.getTemplateVersion() == null ^ this.getTemplateVersion() == null)
            return false;
        if (other.getTemplateVersion() != null
                && other.getTemplateVersion().equals(this.getTemplateVersion()) == false)
            return false;
        return true;
    }
}
