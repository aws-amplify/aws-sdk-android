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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Creates a security profile.
 * </p>
 */
public class CreateSecurityProfileRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[ a-zA-Z0-9_@-]+$<br/>
     */
    private String securityProfileName;

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     */
    private String description;

    /**
     * <p>
     * Permissions assigned to the security profile. For a list of valid
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html"
     * >List of security profile permissions</a>.
     * </p>
     */
    private java.util.List<String> permissions;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The list of tags that a security profile uses to restrict access to
     * resources in Amazon Connect.
     * </p>
     */
    private java.util.Map<String, String> allowedAccessControlTags;

    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to
     * in Amazon Connect. Following are acceptable ResourceNames:
     * <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     * <code>RoutingProfile</code>
     * </p>
     */
    private java.util.List<String> tagRestrictedResources;

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[ a-zA-Z0-9_@-]+$<br/>
     *
     * @return <p>
     *         The name of the security profile.
     *         </p>
     */
    public String getSecurityProfileName() {
        return securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[ a-zA-Z0-9_@-]+$<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile.
     *            </p>
     */
    public void setSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
    }

    /**
     * <p>
     * The name of the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 127<br/>
     * <b>Pattern: </b>^[ a-zA-Z0-9_@-]+$<br/>
     *
     * @param securityProfileName <p>
     *            The name of the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileRequest withSecurityProfileName(String securityProfileName) {
        this.securityProfileName = securityProfileName;
        return this;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     *
     * @return <p>
     *         The description of the security profile.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     *
     * @param description <p>
     *            The description of the security profile.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the security profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 250<br/>
     *
     * @param description <p>
     *            The description of the security profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * Permissions assigned to the security profile. For a list of valid
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html"
     * >List of security profile permissions</a>.
     * </p>
     *
     * @return <p>
     *         Permissions assigned to the security profile. For a list of valid
     *         permissions, see <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html"
     *         >List of security profile permissions</a>.
     *         </p>
     */
    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * Permissions assigned to the security profile. For a list of valid
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html"
     * >List of security profile permissions</a>.
     * </p>
     *
     * @param permissions <p>
     *            Permissions assigned to the security profile. For a list of
     *            valid permissions, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html"
     *            >List of security profile permissions</a>.
     *            </p>
     */
    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * Permissions assigned to the security profile. For a list of valid
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html"
     * >List of security profile permissions</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            Permissions assigned to the security profile. For a list of
     *            valid permissions, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html"
     *            >List of security profile permissions</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileRequest withPermissions(String... permissions) {
        if (getPermissions() == null) {
            this.permissions = new java.util.ArrayList<String>(permissions.length);
        }
        for (String value : permissions) {
            this.permissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Permissions assigned to the security profile. For a list of valid
     * permissions, see <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html"
     * >List of security profile permissions</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permissions <p>
     *            Permissions assigned to the security profile. For a list of
     *            valid permissions, see <a href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/security-profile-list.html"
     *            >List of security profile permissions</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileRequest withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can <a href=
     *         "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *         >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *         the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a href=
     * "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     * >find the instance ID</a> in the Amazon Resource Name (ARN) of the
     * instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can <a
     *            href=
     *            "https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html"
     *            >find the instance ID</a> in the Amazon Resource Name (ARN) of
     *            the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @return <p>
     *         The tags used to organize, track, or control access for this
     *         resource. For example, { "tags": {"key1":"value1",
     *         "key2":"value2"} }.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags used to organize, track, or control access for this
     *            resource. For example, { "tags": {"key1":"value1",
     *            "key2":"value2"} }.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     * <p>
     * The method adds a new key-value pair into Tags parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Tags.
     * @param value The corresponding value of the entry to be added into Tags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateSecurityProfileRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The list of tags that a security profile uses to restrict access to
     * resources in Amazon Connect.
     * </p>
     *
     * @return <p>
     *         The list of tags that a security profile uses to restrict access
     *         to resources in Amazon Connect.
     *         </p>
     */
    public java.util.Map<String, String> getAllowedAccessControlTags() {
        return allowedAccessControlTags;
    }

    /**
     * <p>
     * The list of tags that a security profile uses to restrict access to
     * resources in Amazon Connect.
     * </p>
     *
     * @param allowedAccessControlTags <p>
     *            The list of tags that a security profile uses to restrict
     *            access to resources in Amazon Connect.
     *            </p>
     */
    public void setAllowedAccessControlTags(java.util.Map<String, String> allowedAccessControlTags) {
        this.allowedAccessControlTags = allowedAccessControlTags;
    }

    /**
     * <p>
     * The list of tags that a security profile uses to restrict access to
     * resources in Amazon Connect.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowedAccessControlTags <p>
     *            The list of tags that a security profile uses to restrict
     *            access to resources in Amazon Connect.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileRequest withAllowedAccessControlTags(
            java.util.Map<String, String> allowedAccessControlTags) {
        this.allowedAccessControlTags = allowedAccessControlTags;
        return this;
    }

    /**
     * <p>
     * The list of tags that a security profile uses to restrict access to
     * resources in Amazon Connect.
     * </p>
     * <p>
     * The method adds a new key-value pair into AllowedAccessControlTags
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            AllowedAccessControlTags.
     * @param value The corresponding value of the entry to be added into
     *            AllowedAccessControlTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileRequest addAllowedAccessControlTagsEntry(String key, String value) {
        if (null == this.allowedAccessControlTags) {
            this.allowedAccessControlTags = new java.util.HashMap<String, String>();
        }
        if (this.allowedAccessControlTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.allowedAccessControlTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AllowedAccessControlTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateSecurityProfileRequest clearAllowedAccessControlTagsEntries() {
        this.allowedAccessControlTags = null;
        return this;
    }

    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to
     * in Amazon Connect. Following are acceptable ResourceNames:
     * <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     * <code>RoutingProfile</code>
     * </p>
     *
     * @return <p>
     *         The list of resources that a security profile applies tag
     *         restrictions to in Amazon Connect. Following are acceptable
     *         ResourceNames: <code>User</code> | <code>SecurityProfile</code> |
     *         <code>Queue</code> | <code>RoutingProfile</code>
     *         </p>
     */
    public java.util.List<String> getTagRestrictedResources() {
        return tagRestrictedResources;
    }

    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to
     * in Amazon Connect. Following are acceptable ResourceNames:
     * <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     * <code>RoutingProfile</code>
     * </p>
     *
     * @param tagRestrictedResources <p>
     *            The list of resources that a security profile applies tag
     *            restrictions to in Amazon Connect. Following are acceptable
     *            ResourceNames: <code>User</code> |
     *            <code>SecurityProfile</code> | <code>Queue</code> |
     *            <code>RoutingProfile</code>
     *            </p>
     */
    public void setTagRestrictedResources(java.util.Collection<String> tagRestrictedResources) {
        if (tagRestrictedResources == null) {
            this.tagRestrictedResources = null;
            return;
        }

        this.tagRestrictedResources = new java.util.ArrayList<String>(tagRestrictedResources);
    }

    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to
     * in Amazon Connect. Following are acceptable ResourceNames:
     * <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     * <code>RoutingProfile</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagRestrictedResources <p>
     *            The list of resources that a security profile applies tag
     *            restrictions to in Amazon Connect. Following are acceptable
     *            ResourceNames: <code>User</code> |
     *            <code>SecurityProfile</code> | <code>Queue</code> |
     *            <code>RoutingProfile</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileRequest withTagRestrictedResources(String... tagRestrictedResources) {
        if (getTagRestrictedResources() == null) {
            this.tagRestrictedResources = new java.util.ArrayList<String>(
                    tagRestrictedResources.length);
        }
        for (String value : tagRestrictedResources) {
            this.tagRestrictedResources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of resources that a security profile applies tag restrictions to
     * in Amazon Connect. Following are acceptable ResourceNames:
     * <code>User</code> | <code>SecurityProfile</code> | <code>Queue</code> |
     * <code>RoutingProfile</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagRestrictedResources <p>
     *            The list of resources that a security profile applies tag
     *            restrictions to in Amazon Connect. Following are acceptable
     *            ResourceNames: <code>User</code> |
     *            <code>SecurityProfile</code> | <code>Queue</code> |
     *            <code>RoutingProfile</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSecurityProfileRequest withTagRestrictedResources(
            java.util.Collection<String> tagRestrictedResources) {
        setTagRestrictedResources(tagRestrictedResources);
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
        if (getSecurityProfileName() != null)
            sb.append("SecurityProfileName: " + getSecurityProfileName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getPermissions() != null)
            sb.append("Permissions: " + getPermissions() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getAllowedAccessControlTags() != null)
            sb.append("AllowedAccessControlTags: " + getAllowedAccessControlTags() + ",");
        if (getTagRestrictedResources() != null)
            sb.append("TagRestrictedResources: " + getTagRestrictedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSecurityProfileName() == null) ? 0 : getSecurityProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowedAccessControlTags() == null) ? 0 : getAllowedAccessControlTags()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTagRestrictedResources() == null) ? 0 : getTagRestrictedResources()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSecurityProfileRequest == false)
            return false;
        CreateSecurityProfileRequest other = (CreateSecurityProfileRequest) obj;

        if (other.getSecurityProfileName() == null ^ this.getSecurityProfileName() == null)
            return false;
        if (other.getSecurityProfileName() != null
                && other.getSecurityProfileName().equals(this.getSecurityProfileName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null
                && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getAllowedAccessControlTags() == null
                ^ this.getAllowedAccessControlTags() == null)
            return false;
        if (other.getAllowedAccessControlTags() != null
                && other.getAllowedAccessControlTags().equals(this.getAllowedAccessControlTags()) == false)
            return false;
        if (other.getTagRestrictedResources() == null ^ this.getTagRestrictedResources() == null)
            return false;
        if (other.getTagRestrictedResources() != null
                && other.getTagRestrictedResources().equals(this.getTagRestrictedResources()) == false)
            return false;
        return true;
    }
}
