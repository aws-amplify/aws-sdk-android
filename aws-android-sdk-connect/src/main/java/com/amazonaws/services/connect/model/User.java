/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about a user account for a Amazon Connect instance.
 * </p>
 */
public class User implements Serializable {
    /**
     * <p>
     * The identifier of the user account.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user account.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The user name assigned to the user account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String username;

    /**
     * <p>
     * Information about the user identity.
     * </p>
     */
    private UserIdentityInfo identityInfo;

    /**
     * <p>
     * Information about the phone configuration for the user.
     * </p>
     */
    private UserPhoneConfig phoneConfig;

    /**
     * <p>
     * The identifier of the user account in the directory used for identity
     * management.
     * </p>
     */
    private String directoryUserId;

    /**
     * <p>
     * The identifiers of the security profiles for the user.
     * </p>
     */
    private java.util.List<String> securityProfileIds;

    /**
     * <p>
     * The identifier of the routing profile for the user.
     * </p>
     */
    private String routingProfileId;

    /**
     * <p>
     * The identifier of the hierarchy group for the user.
     * </p>
     */
    private String hierarchyGroupId;

    /**
     * <p>
     * The tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     *
     * @return <p>
     *         The identifier of the user account.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     *
     * @param id <p>
     *            The identifier of the user account.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the user account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id <p>
     *            The identifier of the user account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user account.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user account.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user account.
     * </p>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the user account.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) of the user account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withArn(String arn) {
        this.arn = arn;
        return this;
    }

    /**
     * <p>
     * The user name assigned to the user account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The user name assigned to the user account.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name assigned to the user account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param username <p>
     *            The user name assigned to the user account.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name assigned to the user account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param username <p>
     *            The user name assigned to the user account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * Information about the user identity.
     * </p>
     *
     * @return <p>
     *         Information about the user identity.
     *         </p>
     */
    public UserIdentityInfo getIdentityInfo() {
        return identityInfo;
    }

    /**
     * <p>
     * Information about the user identity.
     * </p>
     *
     * @param identityInfo <p>
     *            Information about the user identity.
     *            </p>
     */
    public void setIdentityInfo(UserIdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
    }

    /**
     * <p>
     * Information about the user identity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityInfo <p>
     *            Information about the user identity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withIdentityInfo(UserIdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }

    /**
     * <p>
     * Information about the phone configuration for the user.
     * </p>
     *
     * @return <p>
     *         Information about the phone configuration for the user.
     *         </p>
     */
    public UserPhoneConfig getPhoneConfig() {
        return phoneConfig;
    }

    /**
     * <p>
     * Information about the phone configuration for the user.
     * </p>
     *
     * @param phoneConfig <p>
     *            Information about the phone configuration for the user.
     *            </p>
     */
    public void setPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    /**
     * <p>
     * Information about the phone configuration for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneConfig <p>
     *            Information about the phone configuration for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
        return this;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity
     * management.
     * </p>
     *
     * @return <p>
     *         The identifier of the user account in the directory used for
     *         identity management.
     *         </p>
     */
    public String getDirectoryUserId() {
        return directoryUserId;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity
     * management.
     * </p>
     *
     * @param directoryUserId <p>
     *            The identifier of the user account in the directory used for
     *            identity management.
     *            </p>
     */
    public void setDirectoryUserId(String directoryUserId) {
        this.directoryUserId = directoryUserId;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity
     * management.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directoryUserId <p>
     *            The identifier of the user account in the directory used for
     *            identity management.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withDirectoryUserId(String directoryUserId) {
        this.directoryUserId = directoryUserId;
        return this;
    }

    /**
     * <p>
     * The identifiers of the security profiles for the user.
     * </p>
     *
     * @return <p>
     *         The identifiers of the security profiles for the user.
     *         </p>
     */
    public java.util.List<String> getSecurityProfileIds() {
        return securityProfileIds;
    }

    /**
     * <p>
     * The identifiers of the security profiles for the user.
     * </p>
     *
     * @param securityProfileIds <p>
     *            The identifiers of the security profiles for the user.
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
     * The identifiers of the security profiles for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileIds <p>
     *            The identifiers of the security profiles for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withSecurityProfileIds(String... securityProfileIds) {
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
     * The identifiers of the security profiles for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileIds <p>
     *            The identifiers of the security profiles for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withSecurityProfileIds(java.util.Collection<String> securityProfileIds) {
        setSecurityProfileIds(securityProfileIds);
        return this;
    }

    /**
     * <p>
     * The identifier of the routing profile for the user.
     * </p>
     *
     * @return <p>
     *         The identifier of the routing profile for the user.
     *         </p>
     */
    public String getRoutingProfileId() {
        return routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile for the user.
     * </p>
     *
     * @param routingProfileId <p>
     *            The identifier of the routing profile for the user.
     *            </p>
     */
    public void setRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
    }

    /**
     * <p>
     * The identifier of the routing profile for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfileId <p>
     *            The identifier of the routing profile for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
        return this;
    }

    /**
     * <p>
     * The identifier of the hierarchy group for the user.
     * </p>
     *
     * @return <p>
     *         The identifier of the hierarchy group for the user.
     *         </p>
     */
    public String getHierarchyGroupId() {
        return hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the hierarchy group for the user.
     * </p>
     *
     * @param hierarchyGroupId <p>
     *            The identifier of the hierarchy group for the user.
     *            </p>
     */
    public void setHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
    }

    /**
     * <p>
     * The identifier of the hierarchy group for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hierarchyGroupId <p>
     *            The identifier of the hierarchy group for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     *
     * @return <p>
     *         The tags.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     *
     * @param tags <p>
     *            The tags.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public User withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * The tags.
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
    public User addTagsEntry(String key, String value) {
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
    public User clearTagsEntries() {
        this.tags = null;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getIdentityInfo() != null)
            sb.append("IdentityInfo: " + getIdentityInfo() + ",");
        if (getPhoneConfig() != null)
            sb.append("PhoneConfig: " + getPhoneConfig() + ",");
        if (getDirectoryUserId() != null)
            sb.append("DirectoryUserId: " + getDirectoryUserId() + ",");
        if (getSecurityProfileIds() != null)
            sb.append("SecurityProfileIds: " + getSecurityProfileIds() + ",");
        if (getRoutingProfileId() != null)
            sb.append("RoutingProfileId: " + getRoutingProfileId() + ",");
        if (getHierarchyGroupId() != null)
            sb.append("HierarchyGroupId: " + getHierarchyGroupId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getIdentityInfo() == null) ? 0 : getIdentityInfo().hashCode());
        hashCode = prime * hashCode
                + ((getPhoneConfig() == null) ? 0 : getPhoneConfig().hashCode());
        hashCode = prime * hashCode
                + ((getDirectoryUserId() == null) ? 0 : getDirectoryUserId().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityProfileIds() == null) ? 0 : getSecurityProfileIds().hashCode());
        hashCode = prime * hashCode
                + ((getRoutingProfileId() == null) ? 0 : getRoutingProfileId().hashCode());
        hashCode = prime * hashCode
                + ((getHierarchyGroupId() == null) ? 0 : getHierarchyGroupId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof User == false)
            return false;
        User other = (User) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
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
        if (other.getDirectoryUserId() == null ^ this.getDirectoryUserId() == null)
            return false;
        if (other.getDirectoryUserId() != null
                && other.getDirectoryUserId().equals(this.getDirectoryUserId()) == false)
            return false;
        if (other.getSecurityProfileIds() == null ^ this.getSecurityProfileIds() == null)
            return false;
        if (other.getSecurityProfileIds() != null
                && other.getSecurityProfileIds().equals(this.getSecurityProfileIds()) == false)
            return false;
        if (other.getRoutingProfileId() == null ^ this.getRoutingProfileId() == null)
            return false;
        if (other.getRoutingProfileId() != null
                && other.getRoutingProfileId().equals(this.getRoutingProfileId()) == false)
            return false;
        if (other.getHierarchyGroupId() == null ^ this.getHierarchyGroupId() == null)
            return false;
        if (other.getHierarchyGroupId() != null
                && other.getHierarchyGroupId().equals(this.getHierarchyGroupId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
