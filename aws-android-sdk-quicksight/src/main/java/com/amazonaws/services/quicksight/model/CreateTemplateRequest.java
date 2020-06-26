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
 * Creates a template from an existing QuickSight analysis or template. You can
 * use the resulting template to create a dashboard.
 * </p>
 * <p>
 * A <i>template</i> is an entity in QuickSight that encapsulates the metadata
 * required to create an analysis and that you can use to create s dashboard. A
 * template adds a layer of abstraction by using placeholders to replace the
 * dataset associated with the analysis. You can use templates to create
 * dashboards by replacing dataset placeholders with datasets that follow the
 * same schema that was used to create the source analysis and template.
 * </p>
 */
public class CreateTemplateRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the
     * ID for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * An ID for the template that you want to create. This template is unique
     * per AWS Region in each AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     */
    private String templateId;

    /**
     * <p>
     * A display name for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String name;

    /**
     * <p>
     * A list of resource permissions to be set on the template.
     * </p>
     */
    private java.util.List<ResourcePermission> permissions;

    /**
     * <p>
     * The entity that you are using as a source when you create the template.
     * In <code>SourceEntity</code>, you specify the type of object you're using
     * as source: <code>SourceTemplate</code> for a template or
     * <code>SourceAnalysis</code> for an analysis. Both of these require an
     * Amazon Resource Name (ARN). For <code>SourceTemplate</code>, specify the
     * ARN of the source template. For <code>SourceAnalysis</code>, specify the
     * ARN of the source analysis. The <code>SourceTemplate</code> ARN can
     * contain any AWS Account and any QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within
     * <code>SourceTemplate</code> or <code>SourceAnalysis</code> to list the
     * replacement datasets for the placeholders listed in the original. The
     * schema in each dataset must match its placeholder.
     * </p>
     */
    private TemplateSourceEntity sourceEntity;

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A description of the current template version being created. This API
     * operation creates the first version of the template. Every time
     * <code>UpdateTemplate</code> is called, a new version is created. Each
     * version of the template maintains a description of the version in the
     * <code>VersionDescription</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     */
    private String versionDescription;

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the
     * ID for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID for the AWS account that the group is in. Currently, you
     *         use the ID for the AWS account that contains your Amazon
     *         QuickSight account.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the
     * ID for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID for the AWS account that the group is in. Currently,
     *            you use the ID for the AWS account that contains your Amazon
     *            QuickSight account.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the group is in. Currently, you use the
     * ID for the AWS account that contains your Amazon QuickSight account.
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
     *            The ID for the AWS account that the group is in. Currently,
     *            you use the ID for the AWS account that contains your Amazon
     *            QuickSight account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTemplateRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * An ID for the template that you want to create. This template is unique
     * per AWS Region in each AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @return <p>
     *         An ID for the template that you want to create. This template is
     *         unique per AWS Region in each AWS account.
     *         </p>
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * <p>
     * An ID for the template that you want to create. This template is unique
     * per AWS Region in each AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\w\-]+<br/>
     *
     * @param templateId <p>
     *            An ID for the template that you want to create. This template
     *            is unique per AWS Region in each AWS account.
     *            </p>
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * <p>
     * An ID for the template that you want to create. This template is unique
     * per AWS Region in each AWS account.
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
     *            An ID for the template that you want to create. This template
     *            is unique per AWS Region in each AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTemplateRequest withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * <p>
     * A display name for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         A display name for the template.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A display name for the template.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param name <p>
     *            A display name for the template.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the template.
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
     *            A display name for the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTemplateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be set on the template.
     * </p>
     *
     * @return <p>
     *         A list of resource permissions to be set on the template.
     *         </p>
     */
    public java.util.List<ResourcePermission> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * A list of resource permissions to be set on the template.
     * </p>
     *
     * @param permissions <p>
     *            A list of resource permissions to be set on the template.
     *            </p>
     */
    public void setPermissions(java.util.Collection<ResourcePermission> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<ResourcePermission>(permissions);
    }

    /**
     * <p>
     * A list of resource permissions to be set on the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            A list of resource permissions to be set on the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTemplateRequest withPermissions(ResourcePermission... permissions) {
        if (getPermissions() == null) {
            this.permissions = new java.util.ArrayList<ResourcePermission>(permissions.length);
        }
        for (ResourcePermission value : permissions) {
            this.permissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource permissions to be set on the template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            A list of resource permissions to be set on the template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTemplateRequest withPermissions(
            java.util.Collection<ResourcePermission> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The entity that you are using as a source when you create the template.
     * In <code>SourceEntity</code>, you specify the type of object you're using
     * as source: <code>SourceTemplate</code> for a template or
     * <code>SourceAnalysis</code> for an analysis. Both of these require an
     * Amazon Resource Name (ARN). For <code>SourceTemplate</code>, specify the
     * ARN of the source template. For <code>SourceAnalysis</code>, specify the
     * ARN of the source analysis. The <code>SourceTemplate</code> ARN can
     * contain any AWS Account and any QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within
     * <code>SourceTemplate</code> or <code>SourceAnalysis</code> to list the
     * replacement datasets for the placeholders listed in the original. The
     * schema in each dataset must match its placeholder.
     * </p>
     *
     * @return <p>
     *         The entity that you are using as a source when you create the
     *         template. In <code>SourceEntity</code>, you specify the type of
     *         object you're using as source: <code>SourceTemplate</code> for a
     *         template or <code>SourceAnalysis</code> for an analysis. Both of
     *         these require an Amazon Resource Name (ARN). For
     *         <code>SourceTemplate</code>, specify the ARN of the source
     *         template. For <code>SourceAnalysis</code>, specify the ARN of the
     *         source analysis. The <code>SourceTemplate</code> ARN can contain
     *         any AWS Account and any QuickSight-supported AWS Region.
     *         </p>
     *         <p>
     *         Use the <code>DataSetReferences</code> entity within
     *         <code>SourceTemplate</code> or <code>SourceAnalysis</code> to
     *         list the replacement datasets for the placeholders listed in the
     *         original. The schema in each dataset must match its placeholder.
     *         </p>
     */
    public TemplateSourceEntity getSourceEntity() {
        return sourceEntity;
    }

    /**
     * <p>
     * The entity that you are using as a source when you create the template.
     * In <code>SourceEntity</code>, you specify the type of object you're using
     * as source: <code>SourceTemplate</code> for a template or
     * <code>SourceAnalysis</code> for an analysis. Both of these require an
     * Amazon Resource Name (ARN). For <code>SourceTemplate</code>, specify the
     * ARN of the source template. For <code>SourceAnalysis</code>, specify the
     * ARN of the source analysis. The <code>SourceTemplate</code> ARN can
     * contain any AWS Account and any QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within
     * <code>SourceTemplate</code> or <code>SourceAnalysis</code> to list the
     * replacement datasets for the placeholders listed in the original. The
     * schema in each dataset must match its placeholder.
     * </p>
     *
     * @param sourceEntity <p>
     *            The entity that you are using as a source when you create the
     *            template. In <code>SourceEntity</code>, you specify the type
     *            of object you're using as source: <code>SourceTemplate</code>
     *            for a template or <code>SourceAnalysis</code> for an analysis.
     *            Both of these require an Amazon Resource Name (ARN). For
     *            <code>SourceTemplate</code>, specify the ARN of the source
     *            template. For <code>SourceAnalysis</code>, specify the ARN of
     *            the source analysis. The <code>SourceTemplate</code> ARN can
     *            contain any AWS Account and any QuickSight-supported AWS
     *            Region.
     *            </p>
     *            <p>
     *            Use the <code>DataSetReferences</code> entity within
     *            <code>SourceTemplate</code> or <code>SourceAnalysis</code> to
     *            list the replacement datasets for the placeholders listed in
     *            the original. The schema in each dataset must match its
     *            placeholder.
     *            </p>
     */
    public void setSourceEntity(TemplateSourceEntity sourceEntity) {
        this.sourceEntity = sourceEntity;
    }

    /**
     * <p>
     * The entity that you are using as a source when you create the template.
     * In <code>SourceEntity</code>, you specify the type of object you're using
     * as source: <code>SourceTemplate</code> for a template or
     * <code>SourceAnalysis</code> for an analysis. Both of these require an
     * Amazon Resource Name (ARN). For <code>SourceTemplate</code>, specify the
     * ARN of the source template. For <code>SourceAnalysis</code>, specify the
     * ARN of the source analysis. The <code>SourceTemplate</code> ARN can
     * contain any AWS Account and any QuickSight-supported AWS Region.
     * </p>
     * <p>
     * Use the <code>DataSetReferences</code> entity within
     * <code>SourceTemplate</code> or <code>SourceAnalysis</code> to list the
     * replacement datasets for the placeholders listed in the original. The
     * schema in each dataset must match its placeholder.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceEntity <p>
     *            The entity that you are using as a source when you create the
     *            template. In <code>SourceEntity</code>, you specify the type
     *            of object you're using as source: <code>SourceTemplate</code>
     *            for a template or <code>SourceAnalysis</code> for an analysis.
     *            Both of these require an Amazon Resource Name (ARN). For
     *            <code>SourceTemplate</code>, specify the ARN of the source
     *            template. For <code>SourceAnalysis</code>, specify the ARN of
     *            the source analysis. The <code>SourceTemplate</code> ARN can
     *            contain any AWS Account and any QuickSight-supported AWS
     *            Region.
     *            </p>
     *            <p>
     *            Use the <code>DataSetReferences</code> entity within
     *            <code>SourceTemplate</code> or <code>SourceAnalysis</code> to
     *            list the replacement datasets for the placeholders listed in
     *            the original. The schema in each dataset must match its
     *            placeholder.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTemplateRequest withSourceEntity(TemplateSourceEntity sourceEntity) {
        this.sourceEntity = sourceEntity;
        return this;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the resource.
     * </p>
     *
     * @return <p>
     *         Contains a map of the key-value pairs for the resource tag or
     *         tags assigned to the resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the resource.
     * </p>
     *
     * @param tags <p>
     *            Contains a map of the key-value pairs for the resource tag or
     *            tags assigned to the resource.
     *            </p>
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
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Contains a map of the key-value pairs for the resource tag or
     *            tags assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTemplateRequest withTags(Tag... tags) {
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
     * Contains a map of the key-value pairs for the resource tag or tags
     * assigned to the resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Contains a map of the key-value pairs for the resource tag or
     *            tags assigned to the resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTemplateRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A description of the current template version being created. This API
     * operation creates the first version of the template. Every time
     * <code>UpdateTemplate</code> is called, a new version is created. Each
     * version of the template maintains a description of the version in the
     * <code>VersionDescription</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @return <p>
     *         A description of the current template version being created. This
     *         API operation creates the first version of the template. Every
     *         time <code>UpdateTemplate</code> is called, a new version is
     *         created. Each version of the template maintains a description of
     *         the version in the <code>VersionDescription</code> field.
     *         </p>
     */
    public String getVersionDescription() {
        return versionDescription;
    }

    /**
     * <p>
     * A description of the current template version being created. This API
     * operation creates the first version of the template. Every time
     * <code>UpdateTemplate</code> is called, a new version is created. Each
     * version of the template maintains a description of the version in the
     * <code>VersionDescription</code> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param versionDescription <p>
     *            A description of the current template version being created.
     *            This API operation creates the first version of the template.
     *            Every time <code>UpdateTemplate</code> is called, a new
     *            version is created. Each version of the template maintains a
     *            description of the version in the
     *            <code>VersionDescription</code> field.
     *            </p>
     */
    public void setVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
    }

    /**
     * <p>
     * A description of the current template version being created. This API
     * operation creates the first version of the template. Every time
     * <code>UpdateTemplate</code> is called, a new version is created. Each
     * version of the template maintains a description of the version in the
     * <code>VersionDescription</code> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     *
     * @param versionDescription <p>
     *            A description of the current template version being created.
     *            This API operation creates the first version of the template.
     *            Every time <code>UpdateTemplate</code> is called, a new
     *            version is created. Each version of the template maintains a
     *            description of the version in the
     *            <code>VersionDescription</code> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTemplateRequest withVersionDescription(String versionDescription) {
        this.versionDescription = versionDescription;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPermissions() != null)
            sb.append("Permissions: " + getPermissions() + ",");
        if (getSourceEntity() != null)
            sb.append("SourceEntity: " + getSourceEntity() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVersionDescription() != null)
            sb.append("VersionDescription: " + getVersionDescription());
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode
                + ((getSourceEntity() == null) ? 0 : getSourceEntity().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getVersionDescription() == null) ? 0 : getVersionDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTemplateRequest == false)
            return false;
        CreateTemplateRequest other = (CreateTemplateRequest) obj;

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
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null
                && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getSourceEntity() == null ^ this.getSourceEntity() == null)
            return false;
        if (other.getSourceEntity() != null
                && other.getSourceEntity().equals(this.getSourceEntity()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVersionDescription() == null ^ this.getVersionDescription() == null)
            return false;
        if (other.getVersionDescription() != null
                && other.getVersionDescription().equals(this.getVersionDescription()) == false)
            return false;
        return true;
    }
}
