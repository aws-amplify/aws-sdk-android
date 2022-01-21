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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a user account for the specified Amazon Connect instance.
 * </p>
 * <p>
 * For information about how to create user accounts using the Amazon Connect
 * console, see <a href=
 * "https://docs.aws.amazon.com/connect/latest/adminguide/user-management.html"
 * >Add Users</a> in the <i>Amazon Connect Administrator Guide</i>.
 * </p>
 */
public class CreateUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user name for the account. For instances not using SAML for identity
     * management, the user name can include up to 20 characters. If you are
     * using SAML for identity management, the user name can include up to 64
     * characters from [a-zA-Z0-9_-.\@]+.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String username;

    /**
     * <p>
     * The password for the user account. A password is required if you are
     * using Amazon Connect for identity management. Otherwise, it is an error
     * to include a password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d\S]{8,64}$/<br/>
     */
    private String password;

    /**
     * <p>
     * The information about the identity of the user.
     * </p>
     */
    private UserIdentityInfo identityInfo;

    /**
     * <p>
     * The phone settings for the user.
     * </p>
     */
    private UserPhoneConfig phoneConfig;

    /**
     * <p>
     * The identifier of the user account in the directory used for identity
     * management. If Amazon Connect cannot access the directory, you can
     * specify this identifier to authenticate users. If you include the
     * identifier, we assume that Amazon Connect cannot access the directory.
     * Otherwise, the identity information is used to authenticate users from
     * your directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for
     * identity management in Amazon Connect when Amazon Connect cannot access
     * your directory to authenticate users. If you are using SAML for identity
     * management and include this parameter, an error is returned.
     * </p>
     */
    private String directoryUserId;

    /**
     * <p>
     * The identifier of the security profile for the user.
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
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * One or more tags.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The user name for the account. For instances not using SAML for identity
     * management, the user name can include up to 20 characters. If you are
     * using SAML for identity management, the user name can include up to 64
     * characters from [a-zA-Z0-9_-.\@]+.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The user name for the account. For instances not using SAML for
     *         identity management, the user name can include up to 20
     *         characters. If you are using SAML for identity management, the
     *         user name can include up to 64 characters from [a-zA-Z0-9_-.\@]+.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name for the account. For instances not using SAML for identity
     * management, the user name can include up to 20 characters. If you are
     * using SAML for identity management, the user name can include up to 64
     * characters from [a-zA-Z0-9_-.\@]+.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param username <p>
     *            The user name for the account. For instances not using SAML
     *            for identity management, the user name can include up to 20
     *            characters. If you are using SAML for identity management, the
     *            user name can include up to 64 characters from
     *            [a-zA-Z0-9_-.\@]+.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name for the account. For instances not using SAML for identity
     * management, the user name can include up to 20 characters. If you are
     * using SAML for identity management, the user name can include up to 64
     * characters from [a-zA-Z0-9_-.\@]+.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param username <p>
     *            The user name for the account. For instances not using SAML
     *            for identity management, the user name can include up to 20
     *            characters. If you are using SAML for identity management, the
     *            user name can include up to 64 characters from
     *            [a-zA-Z0-9_-.\@]+.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The password for the user account. A password is required if you are
     * using Amazon Connect for identity management. Otherwise, it is an error
     * to include a password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d\S]{8,64}$/<br/>
     *
     * @return <p>
     *         The password for the user account. A password is required if you
     *         are using Amazon Connect for identity management. Otherwise, it
     *         is an error to include a password.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * The password for the user account. A password is required if you are
     * using Amazon Connect for identity management. Otherwise, it is an error
     * to include a password.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d\S]{8,64}$/<br/>
     *
     * @param password <p>
     *            The password for the user account. A password is required if
     *            you are using Amazon Connect for identity management.
     *            Otherwise, it is an error to include a password.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the user account. A password is required if you are
     * using Amazon Connect for identity management. Otherwise, it is an error
     * to include a password.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d\S]{8,64}$/<br/>
     *
     * @param password <p>
     *            The password for the user account. A password is required if
     *            you are using Amazon Connect for identity management.
     *            Otherwise, it is an error to include a password.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * <p>
     * The information about the identity of the user.
     * </p>
     *
     * @return <p>
     *         The information about the identity of the user.
     *         </p>
     */
    public UserIdentityInfo getIdentityInfo() {
        return identityInfo;
    }

    /**
     * <p>
     * The information about the identity of the user.
     * </p>
     *
     * @param identityInfo <p>
     *            The information about the identity of the user.
     *            </p>
     */
    public void setIdentityInfo(UserIdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
    }

    /**
     * <p>
     * The information about the identity of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityInfo <p>
     *            The information about the identity of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withIdentityInfo(UserIdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
        return this;
    }

    /**
     * <p>
     * The phone settings for the user.
     * </p>
     *
     * @return <p>
     *         The phone settings for the user.
     *         </p>
     */
    public UserPhoneConfig getPhoneConfig() {
        return phoneConfig;
    }

    /**
     * <p>
     * The phone settings for the user.
     * </p>
     *
     * @param phoneConfig <p>
     *            The phone settings for the user.
     *            </p>
     */
    public void setPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    /**
     * <p>
     * The phone settings for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneConfig <p>
     *            The phone settings for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
        return this;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity
     * management. If Amazon Connect cannot access the directory, you can
     * specify this identifier to authenticate users. If you include the
     * identifier, we assume that Amazon Connect cannot access the directory.
     * Otherwise, the identity information is used to authenticate users from
     * your directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for
     * identity management in Amazon Connect when Amazon Connect cannot access
     * your directory to authenticate users. If you are using SAML for identity
     * management and include this parameter, an error is returned.
     * </p>
     *
     * @return <p>
     *         The identifier of the user account in the directory used for
     *         identity management. If Amazon Connect cannot access the
     *         directory, you can specify this identifier to authenticate users.
     *         If you include the identifier, we assume that Amazon Connect
     *         cannot access the directory. Otherwise, the identity information
     *         is used to authenticate users from your directory.
     *         </p>
     *         <p>
     *         This parameter is required if you are using an existing directory
     *         for identity management in Amazon Connect when Amazon Connect
     *         cannot access your directory to authenticate users. If you are
     *         using SAML for identity management and include this parameter, an
     *         error is returned.
     *         </p>
     */
    public String getDirectoryUserId() {
        return directoryUserId;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity
     * management. If Amazon Connect cannot access the directory, you can
     * specify this identifier to authenticate users. If you include the
     * identifier, we assume that Amazon Connect cannot access the directory.
     * Otherwise, the identity information is used to authenticate users from
     * your directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for
     * identity management in Amazon Connect when Amazon Connect cannot access
     * your directory to authenticate users. If you are using SAML for identity
     * management and include this parameter, an error is returned.
     * </p>
     *
     * @param directoryUserId <p>
     *            The identifier of the user account in the directory used for
     *            identity management. If Amazon Connect cannot access the
     *            directory, you can specify this identifier to authenticate
     *            users. If you include the identifier, we assume that Amazon
     *            Connect cannot access the directory. Otherwise, the identity
     *            information is used to authenticate users from your directory.
     *            </p>
     *            <p>
     *            This parameter is required if you are using an existing
     *            directory for identity management in Amazon Connect when
     *            Amazon Connect cannot access your directory to authenticate
     *            users. If you are using SAML for identity management and
     *            include this parameter, an error is returned.
     *            </p>
     */
    public void setDirectoryUserId(String directoryUserId) {
        this.directoryUserId = directoryUserId;
    }

    /**
     * <p>
     * The identifier of the user account in the directory used for identity
     * management. If Amazon Connect cannot access the directory, you can
     * specify this identifier to authenticate users. If you include the
     * identifier, we assume that Amazon Connect cannot access the directory.
     * Otherwise, the identity information is used to authenticate users from
     * your directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for
     * identity management in Amazon Connect when Amazon Connect cannot access
     * your directory to authenticate users. If you are using SAML for identity
     * management and include this parameter, an error is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directoryUserId <p>
     *            The identifier of the user account in the directory used for
     *            identity management. If Amazon Connect cannot access the
     *            directory, you can specify this identifier to authenticate
     *            users. If you include the identifier, we assume that Amazon
     *            Connect cannot access the directory. Otherwise, the identity
     *            information is used to authenticate users from your directory.
     *            </p>
     *            <p>
     *            This parameter is required if you are using an existing
     *            directory for identity management in Amazon Connect when
     *            Amazon Connect cannot access your directory to authenticate
     *            users. If you are using SAML for identity management and
     *            include this parameter, an error is returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withDirectoryUserId(String directoryUserId) {
        this.directoryUserId = directoryUserId;
        return this;
    }

    /**
     * <p>
     * The identifier of the security profile for the user.
     * </p>
     *
     * @return <p>
     *         The identifier of the security profile for the user.
     *         </p>
     */
    public java.util.List<String> getSecurityProfileIds() {
        return securityProfileIds;
    }

    /**
     * <p>
     * The identifier of the security profile for the user.
     * </p>
     *
     * @param securityProfileIds <p>
     *            The identifier of the security profile for the user.
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
     * The identifier of the security profile for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileIds <p>
     *            The identifier of the security profile for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withSecurityProfileIds(String... securityProfileIds) {
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
     * The identifier of the security profile for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileIds <p>
     *            The identifier of the security profile for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withSecurityProfileIds(java.util.Collection<String> securityProfileIds) {
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
    public CreateUserRequest withRoutingProfileId(String routingProfileId) {
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
    public CreateUserRequest withHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @return <p>
     *         One or more tags.
     *         </p>
     */
    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     */
    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * One or more tags.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            One or more tags.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * <p>
     * One or more tags.
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
    public CreateUserRequest addTagsEntry(String key, String value) {
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
    public CreateUserRequest clearTagsEntries() {
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
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
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
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserRequest == false)
            return false;
        CreateUserRequest other = (CreateUserRequest) obj;

        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
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
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
