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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a template from an existing Amazon QuickSight analysis or another
 * template.
 * </p>
 */
public class UpdateTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the AWS account that contains the template that you're
     * updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The ID for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String templateId;

    /**
     * <p>
     * The source QuickSight entity from which this template is being updated.
     * You can currently update templates from an Analysis or another template.
     * </p>
     */
    private TemplateSourceEntity sourceEntity;

    /**
     * <p>
     * A description of the current template version that is being updated.
     * Every time you call <code>UpdateTemplate</code>, you create a new version
     * of the template. Each version of the template maintains a description of
     * the version in the <code>VersionDescription</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String versionDescription;

    /**
     * <p>
     * The name for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String name;

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're
     * updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID of the AWS account that contains the template that you're
     *         updating.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're
     * updating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the template that
     *            you're updating.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the AWS account that contains the template that you're
     * updating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID of the AWS account that contains the template that
     *            you're updating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplateRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         The ID for the template.
     *         </p>
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param templateId <p>
     *            The ID for the template.
     *            </p>
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * The ID for the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param templateId <p>
     *            The ID for the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplateRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * <p>
     * The source QuickSight entity from which this template is being updated.
     * You can currently update templates from an Analysis or another template.
     * </p>
     *
     * @return <p>
     *         The source QuickSight entity from which this template is being
     *         updated. You can currently update templates from an Analysis or
     *         another template.
     *         </p>
     */
    public TemplateSourceEntity getSourceEntity() {
        return sourceEntity;
    }

    /**
     * <p>
     * The source QuickSight entity from which this template is being updated.
     * You can currently update templates from an Analysis or another template.
     * </p>
     *
     * @param sourceEntity <p>
     *            The source QuickSight entity from which this template is being
     *            updated. You can currently update templates from an Analysis
     *            or another template.
     *            </p>
     */
    public void setSourceEntity(TemplateSourceEntity sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    /**
     * <p>
     * The source QuickSight entity from which this template is being updated.
     * You can currently update templates from an Analysis or another template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceEntity <p>
     *            The source QuickSight entity from which this template is being
     *            updated. You can currently update templates from an Analysis
     *            or another template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplateRequest withSourceEntity(TemplateSourceEntity sourceEntity) {
        this.sourceEntity = sourceEntity;
        return this;
    }

    /**
     * <p>
     * A description of the current template version that is being updated.
     * Every time you call <code>UpdateTemplate</code>, you create a new version
     * of the template. Each version of the template maintains a description of
     * the version in the <code>VersionDescription</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         A description of the current template version that is being
     *         updated. Every time you call <code>UpdateTemplate</code>, you
     *         create a new version of the template. Each version of the
     *         template maintains a description of the version in the
     *         <code>VersionDescription</code> field.
     *         </p>
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * <p>
     * A description of the current template version that is being updated.
     * Every time you call <code>UpdateTemplate</code>, you create a new version
     * of the template. Each version of the template maintains a description of
     * the version in the <code>VersionDescription</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param versionDescription <p>
     *            A description of the current template version that is being
     *            updated. Every time you call <code>UpdateTemplate</code>, you
     *            create a new version of the template. Each version of the
     *            template maintains a description of the version in the
     *            <code>VersionDescription</code> field.
     *            </p>
     */
    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description of the current template version that is being updated.
     * Every time you call <code>UpdateTemplate</code>, you create a new version
     * of the template. Each version of the template maintains a description of
     * the version in the <code>VersionDescription</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param versionDescription <p>
     *            A description of the current template version that is being
     *            updated. Every time you call <code>UpdateTemplate</code>, you
     *            create a new version of the template. Each version of the
     *            template maintains a description of the version in the
     *            <code>VersionDescription</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplateRequest withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
        return this;
    }

    /**
     * <p>
     * The name for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The name for the template.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param name <p>
     *            The name for the template.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param name <p>
     *            The name for the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateTemplateRequest withName(String name) {
        this.name = name;
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getTemplateId() != null)
            sb.append("TemplateId: " + getTemplateId() + ",");
        if (getSourceEntity() != null)
            sb.append("SourceEntity: " + getSourceEntity() + ",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: " + getVersionDescription() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        hashCode = prime * hashCode
                + ((getSourceEntity() == null) ? 0 : getSourceEntity().hashCode());
        hashCode = prime * hashCode
                + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTemplateRequest == false)
            return false;
        UpdateTemplateRequest other = (UpdateTemplateRequest) obj;

        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getTemplateId() == null ^ this.getTemplateId() == null)
            return false;
        if (other.getTemplateId() != null
                && other.getTemplateId().equals(this.getTemplateId()) == false)
            return false;
        if (other.getSourceEntity() == null ^ this.getSourceEntity() == null)
            return false;
        if (other.getSourceEntity() != null
                && other.getSourceEntity().equals(this.getSourceEntity()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null
                && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
