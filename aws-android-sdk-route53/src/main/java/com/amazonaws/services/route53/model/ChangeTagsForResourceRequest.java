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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds, edits, or deletes tags for a health check or a hosted zone.
 * </p>
 * <p>
 * For information about using tags for cost allocation, see <a href=
 * "https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/cost-alloc-tags.html"
 * >Using Cost Allocation Tags</a> in the <i>AWS Billing and Cost Management
 * User Guide</i>.
 * </p>
 */
public class ChangeTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     */
    private String resourceType;

    /**
     * <p>
     * The ID of the resource for which you want to add, change, or delete tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String resourceId;

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to add to
     * the specified health check or hosted zone and/or the tags that you want
     * to edit <code>Value</code> for.
     * </p>
     * <p>
     * You can add a maximum of 10 tags to a health check or a hosted zone.
     * </p>
     */
    private java.util.List<Tag> addTags;

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to delete
     * from the specified health check or hosted zone. You can specify up to 10
     * keys.
     * </p>
     */
    private java.util.List<String> removeTagKeys;

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     *
     * @return <p>
     *         The type of the resource.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The resource type for health checks is <code>healthcheck</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The resource type for hosted zones is <code>hostedzone</code>.
     *         </p>
     *         </li>
     *         </ul>
     * @see TagResourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     *
     * @param resourceType <p>
     *            The type of the resource.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The resource type for health checks is
     *            <code>healthcheck</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resource type for hosted zones is <code>hostedzone</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see TagResourceType
     */
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     *
     * @param resourceType <p>
     *            The type of the resource.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The resource type for health checks is
     *            <code>healthcheck</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resource type for hosted zones is <code>hostedzone</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */
    public ChangeTagsForResourceRequest withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     *
     * @param resourceType <p>
     *            The type of the resource.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The resource type for health checks is
     *            <code>healthcheck</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resource type for hosted zones is <code>hostedzone</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @see TagResourceType
     */
    public void setResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The resource type for health checks is <code>healthcheck</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type for hosted zones is <code>hostedzone</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>healthcheck, hostedzone
     *
     * @param resourceType <p>
     *            The type of the resource.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The resource type for health checks is
     *            <code>healthcheck</code>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The resource type for hosted zones is <code>hostedzone</code>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TagResourceType
     */
    public ChangeTagsForResourceRequest withResourceType(TagResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the resource for which you want to add, change, or delete tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         The ID of the resource for which you want to add, change, or
     *         delete tags.
     *         </p>
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * <p>
     * The ID of the resource for which you want to add, change, or delete tags.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param resourceId <p>
     *            The ID of the resource for which you want to add, change, or
     *            delete tags.
     *            </p>
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource for which you want to add, change, or delete tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param resourceId <p>
     *            The ID of the resource for which you want to add, change, or
     *            delete tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeTagsForResourceRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to add to
     * the specified health check or hosted zone and/or the tags that you want
     * to edit <code>Value</code> for.
     * </p>
     * <p>
     * You can add a maximum of 10 tags to a health check or a hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that contains a list of the tags that you want to
     *         add to the specified health check or hosted zone and/or the tags
     *         that you want to edit <code>Value</code> for.
     *         </p>
     *         <p>
     *         You can add a maximum of 10 tags to a health check or a hosted
     *         zone.
     *         </p>
     */
    public java.util.List<Tag> getAddTags() {
        return addTags;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to add to
     * the specified health check or hosted zone and/or the tags that you want
     * to edit <code>Value</code> for.
     * </p>
     * <p>
     * You can add a maximum of 10 tags to a health check or a hosted zone.
     * </p>
     *
     * @param addTags <p>
     *            A complex type that contains a list of the tags that you want
     *            to add to the specified health check or hosted zone and/or the
     *            tags that you want to edit <code>Value</code> for.
     *            </p>
     *            <p>
     *            You can add a maximum of 10 tags to a health check or a hosted
     *            zone.
     *            </p>
     */
    public void setAddTags(java.util.Collection<Tag> addTags) {
        if (addTags == null) {
            this.addTags = null;
            return;
        }

        this.addTags = new java.util.ArrayList<Tag>(addTags);
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to add to
     * the specified health check or hosted zone and/or the tags that you want
     * to edit <code>Value</code> for.
     * </p>
     * <p>
     * You can add a maximum of 10 tags to a health check or a hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addTags <p>
     *            A complex type that contains a list of the tags that you want
     *            to add to the specified health check or hosted zone and/or the
     *            tags that you want to edit <code>Value</code> for.
     *            </p>
     *            <p>
     *            You can add a maximum of 10 tags to a health check or a hosted
     *            zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeTagsForResourceRequest withAddTags(Tag... addTags) {
        if (getAddTags() == null) {
            this.addTags = new java.util.ArrayList<Tag>(addTags.length);
        }
        for (Tag value : addTags) {
            this.addTags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to add to
     * the specified health check or hosted zone and/or the tags that you want
     * to edit <code>Value</code> for.
     * </p>
     * <p>
     * You can add a maximum of 10 tags to a health check or a hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param addTags <p>
     *            A complex type that contains a list of the tags that you want
     *            to add to the specified health check or hosted zone and/or the
     *            tags that you want to edit <code>Value</code> for.
     *            </p>
     *            <p>
     *            You can add a maximum of 10 tags to a health check or a hosted
     *            zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeTagsForResourceRequest withAddTags(java.util.Collection<Tag> addTags) {
        setAddTags(addTags);
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to delete
     * from the specified health check or hosted zone. You can specify up to 10
     * keys.
     * </p>
     *
     * @return <p>
     *         A complex type that contains a list of the tags that you want to
     *         delete from the specified health check or hosted zone. You can
     *         specify up to 10 keys.
     *         </p>
     */
    public java.util.List<String> getRemoveTagKeys() {
        return removeTagKeys;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to delete
     * from the specified health check or hosted zone. You can specify up to 10
     * keys.
     * </p>
     *
     * @param removeTagKeys <p>
     *            A complex type that contains a list of the tags that you want
     *            to delete from the specified health check or hosted zone. You
     *            can specify up to 10 keys.
     *            </p>
     */
    public void setRemoveTagKeys(java.util.Collection<String> removeTagKeys) {
        if (removeTagKeys == null) {
            this.removeTagKeys = null;
            return;
        }

        this.removeTagKeys = new java.util.ArrayList<String>(removeTagKeys);
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to delete
     * from the specified health check or hosted zone. You can specify up to 10
     * keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeTagKeys <p>
     *            A complex type that contains a list of the tags that you want
     *            to delete from the specified health check or hosted zone. You
     *            can specify up to 10 keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeTagsForResourceRequest withRemoveTagKeys(String... removeTagKeys) {
        if (getRemoveTagKeys() == null) {
            this.removeTagKeys = new java.util.ArrayList<String>(removeTagKeys.length);
        }
        for (String value : removeTagKeys) {
            this.removeTagKeys.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains a list of the tags that you want to delete
     * from the specified health check or hosted zone. You can specify up to 10
     * keys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param removeTagKeys <p>
     *            A complex type that contains a list of the tags that you want
     *            to delete from the specified health check or hosted zone. You
     *            can specify up to 10 keys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeTagsForResourceRequest withRemoveTagKeys(java.util.Collection<String> removeTagKeys) {
        setRemoveTagKeys(removeTagKeys);
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
        if (getAddTags() != null)
            sb.append("AddTags: " + getAddTags() + ",");
        if (getRemoveTagKeys() != null)
            sb.append("RemoveTagKeys: " + getRemoveTagKeys());
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
        hashCode = prime * hashCode + ((getAddTags() == null) ? 0 : getAddTags().hashCode());
        hashCode = prime * hashCode
                + ((getRemoveTagKeys() == null) ? 0 : getRemoveTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeTagsForResourceRequest == false)
            return false;
        ChangeTagsForResourceRequest other = (ChangeTagsForResourceRequest) obj;

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
        if (other.getAddTags() == null ^ this.getAddTags() == null)
            return false;
        if (other.getAddTags() != null && other.getAddTags().equals(this.getAddTags()) == false)
            return false;
        if (other.getRemoveTagKeys() == null ^ this.getRemoveTagKeys() == null)
            return false;
        if (other.getRemoveTagKeys() != null
                && other.getRemoveTagKeys().equals(this.getRemoveTagKeys()) == false)
            return false;
        return true;
    }
}
