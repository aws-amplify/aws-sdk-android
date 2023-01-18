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

/**
 * <p>
 * Information about the returned users.
 * </p>
 */
public class UserSearchSummary implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The directory identifier of the user.
     * </p>
     */
    private String directoryUserId;

    /**
     * <p>
     * The identifier of the user's hierarchy group.
     * </p>
     */
    private String hierarchyGroupId;

    /**
     * <p>
     * The identifier of the user's summary.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The user's first name and last name.
     * </p>
     */
    private UserIdentityInfoLite identityInfo;

    /**
     * <p>
     * Contains information about the phone configuration settings for a user.
     * </p>
     */
    private UserPhoneConfig phoneConfig;

    /**
     * <p>
     * The identifier of the user's routing profile.
     * </p>
     */
    private String routingProfileId;

    /**
     * <p>
     * The identifiers of the user's security profiles.
     * </p>
     */
    private java.util.List<String> securityProfileIds;

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String username;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the user.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSearchSummary withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The directory identifier of the user.
     * </p>
     *
     * @return <p>
     *         The directory identifier of the user.
     *         </p>
     */
    public String getDirectoryUserId() {
        return directoryUserId;
    }

    /**
     * <p>
     * The directory identifier of the user.
     * </p>
     *
     * @param directoryUserId <p>
     *            The directory identifier of the user.
     *            </p>
     */
    public void setDirectoryUserId(String directoryUserId) {
        this.directoryUserId = directoryUserId;
    }

    /**
     * <p>
     * The directory identifier of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directoryUserId <p>
     *            The directory identifier of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSearchSummary withDirectoryUserId(String directoryUserId) {
        this.directoryUserId = directoryUserId;
        return this;
    }

    /**
     * <p>
     * The identifier of the user's hierarchy group.
     * </p>
     *
     * @return <p>
     *         The identifier of the user's hierarchy group.
     *         </p>
     */
    public String getHierarchyGroupId() {
        return hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the user's hierarchy group.
     * </p>
     *
     * @param hierarchyGroupId <p>
     *            The identifier of the user's hierarchy group.
     *            </p>
     */
    public void setHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the user's hierarchy group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hierarchyGroupId <p>
     *            The identifier of the user's hierarchy group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSearchSummary withHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
        return this;
    }

    /**
     * <p>
     * The identifier of the user's summary.
     * </p>
     *
     * @return <p>
     *         The identifier of the user's summary.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the user's summary.
     * </p>
     *
     * @param id <p>
     *            The identifier of the user's summary.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the user's summary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of the user's summary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSearchSummary withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The user's first name and last name.
     * </p>
     *
     * @return <p>
     *         The user's first name and last name.
     *         </p>
     */
    public UserIdentityInfoLite getIdentityInfo() {
        return identityInfo;
    }

    /**
     * <p>
     * The user's first name and last name.
     * </p>
     *
     * @param identityInfo <p>
     *            The user's first name and last name.
     *            </p>
     */
    public void setIdentityInfo(UserIdentityInfoLite identityInfo) {
        this.identityInfo = identityInfo;
    }

    /**
     * <p>
     * The user's first name and last name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityInfo <p>
     *            The user's first name and last name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSearchSummary withIdentityInfo(UserIdentityInfoLite identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }

    /**
     * <p>
     * Contains information about the phone configuration settings for a user.
     * </p>
     *
     * @return <p>
     *         Contains information about the phone configuration settings for a
     *         user.
     *         </p>
     */
    public UserPhoneConfig getPhoneConfig() {
        return phoneConfig;
    }

    /**
     * <p>
     * Contains information about the phone configuration settings for a user.
     * </p>
     *
     * @param phoneConfig <p>
     *            Contains information about the phone configuration settings
     *            for a user.
     *            </p>
     */
    public void setPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    /**
     * <p>
     * Contains information about the phone configuration settings for a user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneConfig <p>
     *            Contains information about the phone configuration settings
     *            for a user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSearchSummary withPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
        return this;
    }

    /**
     * <p>
     * The identifier of the user's routing profile.
     * </p>
     *
     * @return <p>
     *         The identifier of the user's routing profile.
     *         </p>
     */
    public String getRoutingProfileId() {
        return routingProfileId;
    }

    /**
     * <p>
     * The identifier of the user's routing profile.
     * </p>
     *
     * @param routingProfileId <p>
     *            The identifier of the user's routing profile.
     *            </p>
     */
    public void setRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
    }

    /**
     * <p>
     * The identifier of the user's routing profile.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfileId <p>
     *            The identifier of the user's routing profile.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSearchSummary withRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
        return this;
    }

    /**
     * <p>
     * The identifiers of the user's security profiles.
     * </p>
     *
     * @return <p>
     *         The identifiers of the user's security profiles.
     *         </p>
     */
    public java.util.List<String> getSecurityProfileIds() {
        return securityProfileIds;
    }

    /**
     * <p>
     * The identifiers of the user's security profiles.
     * </p>
     *
     * @param securityProfileIds <p>
     *            The identifiers of the user's security profiles.
     *            </p>
     */
    public void setSecurityProfileIds(java.util.Collection<String> securityProfileIds) {
        if (securityProfileIds == null) {
            this.securityProfileIds = null;
            return;
        }

        this.securityProfileIds = new java.util.ArrayList<String>(securityProfileIds);
    }

    /**
     * <p>
     * The identifiers of the user's security profiles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileIds <p>
     *            The identifiers of the user's security profiles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSearchSummary withSecurityProfileIds(String... securityProfileIds) {
        if (getSecurityProfileIds() == null) {
            this.securityProfileIds = new java.util.ArrayList<String>(securityProfileIds.length);
        }
        for (String value : securityProfileIds) {
            this.securityProfileIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers of the user's security profiles.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileIds <p>
     *            The identifiers of the user's security profiles.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSearchSummary withSecurityProfileIds(java.util.Collection<String> securityProfileIds) {
        setSecurityProfileIds(securityProfileIds);
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
    public UserSearchSummary withTags(java.util.Map<String, String> tags) {
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
    public UserSearchSummary addTagsEntry(String key, String value) {
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
    public UserSearchSummary clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The name of the user.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param username <p>
     *            The name of the user.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param username <p>
     *            The name of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserSearchSummary withUsername(String username) {
        this.username = username;
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getDirectoryUserId() != null)
            sb.append("DirectoryUserId: " + getDirectoryUserId() + ",");
        if (getHierarchyGroupId() != null)
            sb.append("HierarchyGroupId: " + getHierarchyGroupId() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getIdentityInfo() != null)
            sb.append("IdentityInfo: " + getIdentityInfo() + ",");
        if (getPhoneConfig() != null)
            sb.append("PhoneConfig: " + getPhoneConfig() + ",");
        if (getRoutingProfileId() != null)
            sb.append("RoutingProfileId: " + getRoutingProfileId() + ",");
        if (getSecurityProfileIds() != null)
            sb.append("SecurityProfileIds: " + getSecurityProfileIds() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode
                + ((getDirectoryUserId() == null) ? 0 : getDirectoryUserId().hashCode());
        hashCode = prime * hashCode
                + ((getHierarchyGroupId() == null) ? 0 : getHierarchyGroupId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getIdentityInfo() == null) ? 0 : getIdentityInfo().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneConfig() == null) ? 0 : getPhoneConfig().hashCode());
        hashCode = prime * hashCode
                + ((getRoutingProfileId() == null) ? 0 : getRoutingProfileId().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityProfileIds() == null) ? 0 : getSecurityProfileIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserSearchSummary == false)
            return false;
        UserSearchSummary other = (UserSearchSummary) obj;

        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDirectoryUserId() == null ^ this.getDirectoryUserId() == null)
            return false;
        if (other.getDirectoryUserId() != null
                && other.getDirectoryUserId().equals(this.getDirectoryUserId()) == false)
            return false;
        if (other.getHierarchyGroupId() == null ^ this.getHierarchyGroupId() == null)
            return false;
        if (other.getHierarchyGroupId() != null
                && other.getHierarchyGroupId().equals(this.getHierarchyGroupId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getIdentityInfo() == null ^ this.getIdentityInfo() == null)
            return false;
        if (other.getIdentityInfo() != null
                && other.getIdentityInfo().equals(this.getIdentityInfo()) == false)
            return false;
        if (other.getPhoneConfig() == null ^ this.getPhoneConfig() == null)
            return false;
        if (other.getPhoneConfig() != null
                && other.getPhoneConfig().equals(this.getPhoneConfig()) == false)
            return false;
        if (other.getRoutingProfileId() == null ^ this.getRoutingProfileId() == null)
            return false;
        if (other.getRoutingProfileId() != null
                && other.getRoutingProfileId().equals(this.getRoutingProfileId()) == false)
            return false;
        if (other.getSecurityProfileIds() == null ^ this.getSecurityProfileIds() == null)
            return false;
        if (other.getSecurityProfileIds() != null
                && other.getSecurityProfileIds().equals(this.getSecurityProfileIds()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        return true;
    }
}
