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
 * Removes tag keys from the specified resource.
 * </p>
 */
public class RemoveTagsFromResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The type of resource from which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises
     * managed instances. Specify the name of the managed instance in the
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
     * The ID of the resource from which you want to remove tags. For example:
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
     * managed instances. Specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     */
    private String resourceId;

    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>
     * The type of resource from which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises
     * managed instances. Specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow,
     * Parameter, PatchBaseline, OpsItem
     *
     * @return <p>
     *         The type of resource from which you want to remove a tag.
     *         </p>
     *         <note>
     *         <p>
     *         The ManagedInstance type for this API action is only for
     *         on-premises managed instances. Specify the name of the managed
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
     * The type of resource from which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises
     * managed instances. Specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow,
     * Parameter, PatchBaseline, OpsItem
     *
     * @param resourceType <p>
     *            The type of resource from which you want to remove a tag.
     *            </p>
     *            <note>
     *            <p>
     *            The ManagedInstance type for this API action is only for
     *            on-premises managed instances. Specify the name of the managed
     *            instance in the following format: mi-ID_number. For example,
     *            mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     * @see ResourceTypeForTagging
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource from which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises
     * managed instances. Specify the name of the managed instance in the
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
     *            The type of resource from which you want to remove a tag.
     *            </p>
     *            <note>
     *            <p>
     *            The ManagedInstance type for this API action is only for
     *            on-premises managed instances. Specify the name of the managed
     *            instance in the following format: mi-ID_number. For example,
     *            mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceTypeForTagging
     */
    public RemoveTagsFromResourceRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of resource from which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises
     * managed instances. Specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Document, ManagedInstance, MaintenanceWindow,
     * Parameter, PatchBaseline, OpsItem
     *
     * @param resourceType <p>
     *            The type of resource from which you want to remove a tag.
     *            </p>
     *            <note>
     *            <p>
     *            The ManagedInstance type for this API action is only for
     *            on-premises managed instances. Specify the name of the managed
     *            instance in the following format: mi-ID_number. For example,
     *            mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     * @see ResourceTypeForTagging
     */
    public void setResourceType(ResourceTypeForTagging resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of resource from which you want to remove a tag.
     * </p>
     * <note>
     * <p>
     * The ManagedInstance type for this API action is only for on-premises
     * managed instances. Specify the name of the managed instance in the
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
     *            The type of resource from which you want to remove a tag.
     *            </p>
     *            <note>
     *            <p>
     *            The ManagedInstance type for this API action is only for
     *            on-premises managed instances. Specify the name of the managed
     *            instance in the following format: mi-ID_number. For example,
     *            mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ResourceTypeForTagging
     */
    public RemoveTagsFromResourceRequest withResourceType(ResourceTypeForTagging resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource from which you want to remove tags. For example:
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
     * managed instances. Specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     *
     * @return <p>
     *         The ID of the resource from which you want to remove tags. For
     *         example:
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
     *         on-premises managed instances. Specify the name of the managed
     *         instance in the following format: mi-ID_number. For example,
     *         mi-1a2b3c4d5e6f.
     *         </p>
     *         </note>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The ID of the resource from which you want to remove tags. For example:
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
     * managed instances. Specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     *
     * @param resourceId <p>
     *            The ID of the resource from which you want to remove tags. For
     *            example:
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
     *            on-premises managed instances. Specify the name of the managed
     *            instance in the following format: mi-ID_number. For example,
     *            mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource from which you want to remove tags. For example:
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
     * managed instances. Specify the name of the managed instance in the
     * following format: mi-ID_number. For example, mi-1a2b3c4d5e6f.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceId <p>
     *            The ID of the resource from which you want to remove tags. For
     *            example:
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
     *            on-premises managed instances. Specify the name of the managed
     *            instance in the following format: mi-ID_number. For example,
     *            mi-1a2b3c4d5e6f.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     *
     * @return <p>
     *         Tag keys that you want to remove from the specified resource.
     *         </p>
     */
    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     *
     * @param tagKeys <p>
     *            Tag keys that you want to remove from the specified resource.
     *            </p>
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            Tag keys that you want to remove from the specified resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromResourceRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) {
            this.tagKeys = new java.util.ArrayList<String>(tagKeys.length);
        }
        for (String value : tagKeys) {
            this.tagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Tag keys that you want to remove from the specified resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagKeys <p>
     *            Tag keys that you want to remove from the specified resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RemoveTagsFromResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
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
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false)
            return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest) obj;

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
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }
}
