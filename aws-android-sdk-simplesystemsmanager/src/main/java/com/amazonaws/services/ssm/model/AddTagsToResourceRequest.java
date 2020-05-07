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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds or overwrites one or more tags for the specified resource. Tags are
 * metadata that you can assign to your documents, managed instances,
 * maintenance windows, Parameter Store parameters, and patch baselines. Tags
 * enable you to categorize your resources in different ways, for example, by
 * purpose, owner, or environment. Each tag consists of a key and an optional
 * value, both of which you define. For example, you could define a set of tags
 * for your account's managed instances that helps you track each instance's
 * owner and stack level. For example: Key=Owner and Value=DbAdmin, SysAdmin, or
 * Dev. Or Key=Stack and Value=Production, Pre-Production, or Test.
 * </p>
 * <p>
 * Each resource can have a maximum of 50 tags.
 * </p>
 * <p>
 * We recommend that you devise a set of tag keys that meets your needs for each
 * resource type. Using a consistent set of tag keys makes it easier for you to
 * manage your resources. You can search and filter the resources based on the
 * tags you add. Tags don't have any semantic meaning to and are interpreted
 * strictly as a string of characters.
 * </p>
 * <p>
 * For more information about using tags with EC2 instances, see <a
 * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Using_Tags.html"
 * >Tagging your Amazon EC2 resources</a> in the <i>Amazon EC2 User Guide</i>.
 * </p>
 */
public class AddTagsToResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is for on-premises managed
     * instances. You must specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow,
     * Parameter, PatchBaseline, OpsItem
     */
    private String resourceType;

    /**
     * <p>
     * The resource ID you want to tag.
     * </p>
     * <p>
     * Use the ID of the resource. Here are some examples:
     * </p>
     * <p>
     * ManagedInstance: mi-012345abcde
     * </p>
     * <p>
     * MaintenanceWindow: mw-012345abcde
     * </p>
     * <p>
     * PatchBaseline: pb-012345abcde
     * </p>
     * <p>
     * For the Document and Parameter values, use the name of the resource.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises
     * managed instances. You must specify the name of the managed instance in
     * the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     */
    private String resourceId;

    /**
     * <p>
     * One or more tags. The value parameter is required, but if you don't want
     * the tag to have a value, specify the parameter with no value, and we set
     * the value to an empty string.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is for on-premises managed
     * instances. You must specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow,
     * Parameter, PatchBaseline, OpsItem
     *
     * @return <p>
     *         Specifies the type of resource you are tagging.
     *         </p>
     *         <note>
     *         <p>
     *         The ManagedInstance type for this API action is for on-premises
     *         managed instances. You must specify the name of the managed
     *         instance in the following format: mi-ID_number. For example,
     *         mi-1a2b3c4d5e6f.
     *         </p>
     *         </note>
     * @see ResourceTypeForTagging
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is for on-premises managed
     * instances. You must specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow,
     * Parameter, PatchBaseline, OpsItem
     *
     * @param resourceType <p>
     *            Specifies the type of resource you are tagging.
     *            </p>
     *            <note>
     *            <p>
     *            The ManagedInstance type for this API action is for
     *            on-premises managed instances. You must specify the name of
     *            the managed instance in the following format: mi-ID_number.
     *            For example, mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     * @see ResourceTypeForTagging
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is for on-premises managed
     * instances. You must specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow,
     * Parameter, PatchBaseline, OpsItem
     *
     * @param resourceType <p>
     *            Specifies the type of resource you are tagging.
     *            </p>
     *            <note>
     *            <p>
     *            The ManagedInstance type for this API action is for
     *            on-premises managed instances. You must specify the name of
     *            the managed instance in the following format: mi-ID_number.
     *            For example, mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceTypeForTagging
     */
    public AddTagsToResourceRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is for on-premises managed
     * instances. You must specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow,
     * Parameter, PatchBaseline, OpsItem
     *
     * @param resourceType <p>
     *            Specifies the type of resource you are tagging.
     *            </p>
     *            <note>
     *            <p>
     *            The ManagedInstance type for this API action is for
     *            on-premises managed instances. You must specify the name of
     *            the managed instance in the following format: mi-ID_number.
     *            For example, mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     * @see ResourceTypeForTagging
     */
    public void setResourceType(ResourceTypeForTagging resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * Specifies the type of resource you are tagging.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is for on-premises managed
     * instances. You must specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow,
     * Parameter, PatchBaseline, OpsItem
     *
     * @param resourceType <p>
     *            Specifies the type of resource you are tagging.
     *            </p>
     *            <note>
     *            <p>
     *            The ManagedInstance type for this API action is for
     *            on-premises managed instances. You must specify the name of
     *            the managed instance in the following format: mi-ID_number.
     *            For example, mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceTypeForTagging
     */
    public AddTagsToResourceRequest withResourceType(ResourceTypeForTagging resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The resource ID you want to tag.
     * </p>
     * <p>
     * Use the ID of the resource. Here are some examples:
     * </p>
     * <p>
     * ManagedInstance: mi-012345abcde
     * </p>
     * <p>
     * MaintenanceWindow: mw-012345abcde
     * </p>
     * <p>
     * PatchBaseline: pb-012345abcde
     * </p>
     * <p>
     * For the Document and Parameter values, use the name of the resource.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises
     * managed instances. You must specify the name of the managed instance in
     * the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     *
     * @return <p>
     *         The resource ID you want to tag.
     *         </p>
     *         <p>
     *         Use the ID of the resource. Here are some examples:
     *         </p>
     *         <p>
     *         ManagedInstance: mi-012345abcde
     *         </p>
     *         <p>
     *         MaintenanceWindow: mw-012345abcde
     *         </p>
     *         <p>
     *         PatchBaseline: pb-012345abcde
     *         </p>
     *         <p>
     *         For the Document and Parameter values, use the name of the
     *         resource.
     *         </p>
     *         <note>
     *         <p>
     *         The ManagedInstance type for this API action is only for
     *         on-premises managed instances. You must specify the name of the
     *         managed instance in the following format: mi-ID_number. For
     *         example, mi-1a2b3c4d5e6f.
     *         </p>
     *         </note>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The resource ID you want to tag.
     * </p>
     * <p>
     * Use the ID of the resource. Here are some examples:
     * </p>
     * <p>
     * ManagedInstance: mi-012345abcde
     * </p>
     * <p>
     * MaintenanceWindow: mw-012345abcde
     * </p>
     * <p>
     * PatchBaseline: pb-012345abcde
     * </p>
     * <p>
     * For the Document and Parameter values, use the name of the resource.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises
     * managed instances. You must specify the name of the managed instance in
     * the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     *
     * @param resourceId <p>
     *            The resource ID you want to tag.
     *            </p>
     *            <p>
     *            Use the ID of the resource. Here are some examples:
     *            </p>
     *            <p>
     *            ManagedInstance: mi-012345abcde
     *            </p>
     *            <p>
     *            MaintenanceWindow: mw-012345abcde
     *            </p>
     *            <p>
     *            PatchBaseline: pb-012345abcde
     *            </p>
     *            <p>
     *            For the Document and Parameter values, use the name of the
     *            resource.
     *            </p>
     *            <note>
     *            <p>
     *            The ManagedInstance type for this API action is only for
     *            on-premises managed instances. You must specify the name of
     *            the managed instance in the following format: mi-ID_number.
     *            For example, mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The resource ID you want to tag.
     * </p>
     * <p>
     * Use the ID of the resource. Here are some examples:
     * </p>
     * <p>
     * ManagedInstance: mi-012345abcde
     * </p>
     * <p>
     * MaintenanceWindow: mw-012345abcde
     * </p>
     * <p>
     * PatchBaseline: pb-012345abcde
     * </p>
     * <p>
     * For the Document and Parameter values, use the name of the resource.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises
     * managed instances. You must specify the name of the managed instance in
     * the following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            The resource ID you want to tag.
     *            </p>
     *            <p>
     *            Use the ID of the resource. Here are some examples:
     *            </p>
     *            <p>
     *            ManagedInstance: mi-012345abcde
     *            </p>
     *            <p>
     *            MaintenanceWindow: mw-012345abcde
     *            </p>
     *            <p>
     *            PatchBaseline: pb-012345abcde
     *            </p>
     *            <p>
     *            For the Document and Parameter values, use the name of the
     *            resource.
     *            </p>
     *            <note>
     *            <p>
     *            The ManagedInstance type for this API action is only for
     *            on-premises managed instances. You must specify the name of
     *            the managed instance in the following format: mi-ID_number.
     *            For example, mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsToResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * One or more tags. The value parameter is required, but if you don't want
     * the tag to have a value, specify the parameter with no value, and we set
     * the value to an empty string.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     *
     * @return <p>
     *         One or more tags. The value parameter is required, but if you
     *         don't want the tag to have a value, specify the parameter with no
     *         value, and we set the value to an empty string.
     *         </p>
     *         <important>
     *         <p>
     *         Do not enter personally identifiable information in this field.
     *         </p>
     *         </important>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags. The value parameter is required, but if you don't want
     * the tag to have a value, specify the parameter with no value, and we set
     * the value to an empty string.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     *
     * @param tags <p>
     *            One or more tags. The value parameter is required, but if you
     *            don't want the tag to have a value, specify the parameter with
     *            no value, and we set the value to an empty string.
     *            </p>
     *            <important>
     *            <p>
     *            Do not enter personally identifiable information in this
     *            field.
     *            </p>
     *            </important>
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
     * One or more tags. The value parameter is required, but if you don't want
     * the tag to have a value, specify the parameter with no value, and we set
     * the value to an empty string.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags. The value parameter is required, but if you
     *            don't want the tag to have a value, specify the parameter with
     *            no value, and we set the value to an empty string.
     *            </p>
     *            <important>
     *            <p>
     *            Do not enter personally identifiable information in this
     *            field.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsToResourceRequest withTags(Tag... tags) {
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
     * One or more tags. The value parameter is required, but if you don't want
     * the tag to have a value, specify the parameter with no value, and we set
     * the value to an empty string.
     * </p>
     * <important>
     * <p>
     * Do not enter personally identifiable information in this field.
     * </p>
     * </important>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags. The value parameter is required, but if you
     *            don't want the tag to have a value, specify the parameter with
     *            no value, and we set the value to an empty string.
     *            </p>
     *            <important>
     *            <p>
     *            Do not enter personally identifiable information in this
     *            field.
     *            </p>
     *            </important>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AddTagsToResourceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddTagsToResourceRequest == false)
            return false;
        AddTagsToResourceRequest other = (AddTagsToResourceRequest) obj;

        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
