/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a new user account in your Amazon Connect instance.
 * </p>
 */
public class CreateUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user name in Amazon Connect for the account to create. If you are
     * using SAML for identity management in your Amazon Connect, the value for
     * <code>Username</code> can include up to 64 characters from
     * [a-zA-Z0-9_-.\@]+.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\_\-\.]+<br/>
     */
    private String username;

    /**
     * <p>
     * The password for the user account to create. This is required if you are
     * using Amazon Connect for identity management. If you are using SAML for
     * identity management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d\S]{8,64}$/<br/>
     */
    private String password;

    /**
     * <p>
     * Information about the user, including email address, first name, and last
     * name.
     * </p>
     */
    private UserIdentityInfo identityInfo;

    /**
     * <p>
     * Specifies the phone settings for the user, including
     * <code>AfterContactWorkTimeLimit</code>, <code>AutoAccept</code>,
     * <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     * </p>
     */
    private UserPhoneConfig phoneConfig;

    /**
     * <p>
     * The unique identifier for the user account in the directory service
     * directory used for identity management. If Amazon Connect is unable to
     * access the existing directory, you can use the
     * <code>DirectoryUserId</code> to authenticate users. If you include the
     * parameter, it is assumed that Amazon Connect cannot access the directory.
     * If the parameter is not included, the <code>UserIdentityInfo</code> is
     * used to authenticate users from your existing directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for
     * identity management in Amazon Connect when Amazon Connect cannot access
     * your directory to authenticate users. If you are using SAML for identity
     * management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     */
    private String directoryUserId;

    /**
     * <p>
     * The unique identifier of the security profile to assign to the user
     * created.
     * </p>
     */
    private java.util.List<String> securityProfileIds;

    /**
     * <p>
     * The unique identifier for the routing profile to assign to the user
     * created.
     * </p>
     */
    private String routingProfileId;

    /**
     * <p>
     * The unique identifier for the hierarchy group to assign to the user
     * created.
     * </p>
     */
    private String hierarchyGroupId;

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The user name in Amazon Connect for the account to create. If you are
     * using SAML for identity management in your Amazon Connect, the value for
     * <code>Username</code> can include up to 64 characters from
     * [a-zA-Z0-9_-.\@]+.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\_\-\.]+<br/>
     *
     * @return <p>
     *         The user name in Amazon Connect for the account to create. If you
     *         are using SAML for identity management in your Amazon Connect,
     *         the value for <code>Username</code> can include up to 64
     *         characters from [a-zA-Z0-9_-.\@]+.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The user name in Amazon Connect for the account to create. If you are
     * using SAML for identity management in your Amazon Connect, the value for
     * <code>Username</code> can include up to 64 characters from
     * [a-zA-Z0-9_-.\@]+.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\_\-\.]+<br/>
     *
     * @param username <p>
     *            The user name in Amazon Connect for the account to create. If
     *            you are using SAML for identity management in your Amazon
     *            Connect, the value for <code>Username</code> can include up to
     *            64 characters from [a-zA-Z0-9_-.\@]+.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name in Amazon Connect for the account to create. If you are
     * using SAML for identity management in your Amazon Connect, the value for
     * <code>Username</code> can include up to 64 characters from
     * [a-zA-Z0-9_-.\@]+.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 20<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\_\-\.]+<br/>
     *
     * @param username <p>
     *            The user name in Amazon Connect for the account to create. If
     *            you are using SAML for identity management in your Amazon
     *            Connect, the value for <code>Username</code> can include up to
     *            64 characters from [a-zA-Z0-9_-.\@]+.
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
     * The password for the user account to create. This is required if you are
     * using Amazon Connect for identity management. If you are using SAML for
     * identity management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d\S]{8,64}$/<br/>
     *
     * @return <p>
     *         The password for the user account to create. This is required if
     *         you are using Amazon Connect for identity management. If you are
     *         using SAML for identity management and include this parameter, an
     *         <code>InvalidRequestException</code> is returned.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * The password for the user account to create. This is required if you are
     * using Amazon Connect for identity management. If you are using SAML for
     * identity management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d\S]{8,64}$/<br/>
     *
     * @param password <p>
     *            The password for the user account to create. This is required
     *            if you are using Amazon Connect for identity management. If
     *            you are using SAML for identity management and include this
     *            parameter, an <code>InvalidRequestException</code> is
     *            returned.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the user account to create. This is required if you are
     * using Amazon Connect for identity management. If you are using SAML for
     * identity management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>/^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d\S]{8,64}$/<br/>
     *
     * @param password <p>
     *            The password for the user account to create. This is required
     *            if you are using Amazon Connect for identity management. If
     *            you are using SAML for identity management and include this
     *            parameter, an <code>InvalidRequestException</code> is
     *            returned.
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
     * Information about the user, including email address, first name, and last
     * name.
     * </p>
     *
     * @return <p>
     *         Information about the user, including email address, first name,
     *         and last name.
     *         </p>
     */
    public UserIdentityInfo getIdentityInfo() {
        return identityInfo;
    }

    /**
     * <p>
     * Information about the user, including email address, first name, and last
     * name.
     * </p>
     *
     * @param identityInfo <p>
     *            Information about the user, including email address, first
     *            name, and last name.
     *            </p>
     */
    public void setIdentityInfo(UserIdentityInfo identityInfo) {
        this.identityInfo = identityInfo;
    }

    /**
     * <p>
     * Information about the user, including email address, first name, and last
     * name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identityInfo <p>
     *            Information about the user, including email address, first
     *            name, and last name.
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
     * Specifies the phone settings for the user, including
     * <code>AfterContactWorkTimeLimit</code>, <code>AutoAccept</code>,
     * <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     * </p>
     *
     * @return <p>
     *         Specifies the phone settings for the user, including
     *         <code>AfterContactWorkTimeLimit</code>, <code>AutoAccept</code>,
     *         <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     *         </p>
     */
    public UserPhoneConfig getPhoneConfig() {
        return phoneConfig;
    }

    /**
     * <p>
     * Specifies the phone settings for the user, including
     * <code>AfterContactWorkTimeLimit</code>, <code>AutoAccept</code>,
     * <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     * </p>
     *
     * @param phoneConfig <p>
     *            Specifies the phone settings for the user, including
     *            <code>AfterContactWorkTimeLimit</code>,
     *            <code>AutoAccept</code>, <code>DeskPhoneNumber</code>, and
     *            <code>PhoneType</code>.
     *            </p>
     */
    public void setPhoneConfig(UserPhoneConfig phoneConfig) {
        this.phoneConfig = phoneConfig;
    }

    /**
     * <p>
     * Specifies the phone settings for the user, including
     * <code>AfterContactWorkTimeLimit</code>, <code>AutoAccept</code>,
     * <code>DeskPhoneNumber</code>, and <code>PhoneType</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param phoneConfig <p>
     *            Specifies the phone settings for the user, including
     *            <code>AfterContactWorkTimeLimit</code>,
     *            <code>AutoAccept</code>, <code>DeskPhoneNumber</code>, and
     *            <code>PhoneType</code>.
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
     * The unique identifier for the user account in the directory service
     * directory used for identity management. If Amazon Connect is unable to
     * access the existing directory, you can use the
     * <code>DirectoryUserId</code> to authenticate users. If you include the
     * parameter, it is assumed that Amazon Connect cannot access the directory.
     * If the parameter is not included, the <code>UserIdentityInfo</code> is
     * used to authenticate users from your existing directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for
     * identity management in Amazon Connect when Amazon Connect cannot access
     * your directory to authenticate users. If you are using SAML for identity
     * management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the user account in the directory
     *         service directory used for identity management. If Amazon Connect
     *         is unable to access the existing directory, you can use the
     *         <code>DirectoryUserId</code> to authenticate users. If you
     *         include the parameter, it is assumed that Amazon Connect cannot
     *         access the directory. If the parameter is not included, the
     *         <code>UserIdentityInfo</code> is used to authenticate users from
     *         your existing directory.
     *         </p>
     *         <p>
     *         This parameter is required if you are using an existing directory
     *         for identity management in Amazon Connect when Amazon Connect
     *         cannot access your directory to authenticate users. If you are
     *         using SAML for identity management and include this parameter, an
     *         <code>InvalidRequestException</code> is returned.
     *         </p>
     */
    public String getDirectoryUserId() {
        return directoryUserId;
    }

    /**
     * <p>
     * The unique identifier for the user account in the directory service
     * directory used for identity management. If Amazon Connect is unable to
     * access the existing directory, you can use the
     * <code>DirectoryUserId</code> to authenticate users. If you include the
     * parameter, it is assumed that Amazon Connect cannot access the directory.
     * If the parameter is not included, the <code>UserIdentityInfo</code> is
     * used to authenticate users from your existing directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for
     * identity management in Amazon Connect when Amazon Connect cannot access
     * your directory to authenticate users. If you are using SAML for identity
     * management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     *
     * @param directoryUserId <p>
     *            The unique identifier for the user account in the directory
     *            service directory used for identity management. If Amazon
     *            Connect is unable to access the existing directory, you can
     *            use the <code>DirectoryUserId</code> to authenticate users. If
     *            you include the parameter, it is assumed that Amazon Connect
     *            cannot access the directory. If the parameter is not included,
     *            the <code>UserIdentityInfo</code> is used to authenticate
     *            users from your existing directory.
     *            </p>
     *            <p>
     *            This parameter is required if you are using an existing
     *            directory for identity management in Amazon Connect when
     *            Amazon Connect cannot access your directory to authenticate
     *            users. If you are using SAML for identity management and
     *            include this parameter, an
     *            <code>InvalidRequestException</code> is returned.
     *            </p>
     */
    public void setDirectoryUserId(String directoryUserId) {
        this.directoryUserId = directoryUserId;
    }

    /**
     * <p>
     * The unique identifier for the user account in the directory service
     * directory used for identity management. If Amazon Connect is unable to
     * access the existing directory, you can use the
     * <code>DirectoryUserId</code> to authenticate users. If you include the
     * parameter, it is assumed that Amazon Connect cannot access the directory.
     * If the parameter is not included, the <code>UserIdentityInfo</code> is
     * used to authenticate users from your existing directory.
     * </p>
     * <p>
     * This parameter is required if you are using an existing directory for
     * identity management in Amazon Connect when Amazon Connect cannot access
     * your directory to authenticate users. If you are using SAML for identity
     * management and include this parameter, an
     * <code>InvalidRequestException</code> is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param directoryUserId <p>
     *            The unique identifier for the user account in the directory
     *            service directory used for identity management. If Amazon
     *            Connect is unable to access the existing directory, you can
     *            use the <code>DirectoryUserId</code> to authenticate users. If
     *            you include the parameter, it is assumed that Amazon Connect
     *            cannot access the directory. If the parameter is not included,
     *            the <code>UserIdentityInfo</code> is used to authenticate
     *            users from your existing directory.
     *            </p>
     *            <p>
     *            This parameter is required if you are using an existing
     *            directory for identity management in Amazon Connect when
     *            Amazon Connect cannot access your directory to authenticate
     *            users. If you are using SAML for identity management and
     *            include this parameter, an
     *            <code>InvalidRequestException</code> is returned.
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
     * The unique identifier of the security profile to assign to the user
     * created.
     * </p>
     *
     * @return <p>
     *         The unique identifier of the security profile to assign to the
     *         user created.
     *         </p>
     */
    public java.util.List<String> getSecurityProfileIds() {
        return securityProfileIds;
    }

    /**
     * <p>
     * The unique identifier of the security profile to assign to the user
     * created.
     * </p>
     *
     * @param securityProfileIds <p>
     *            The unique identifier of the security profile to assign to the
     *            user created.
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
     * The unique identifier of the security profile to assign to the user
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileIds <p>
     *            The unique identifier of the security profile to assign to the
     *            user created.
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
     * The unique identifier of the security profile to assign to the user
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityProfileIds <p>
     *            The unique identifier of the security profile to assign to the
     *            user created.
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
     * The unique identifier for the routing profile to assign to the user
     * created.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the routing profile to assign to the
     *         user created.
     *         </p>
     */
    public String getRoutingProfileId() {
        return routingProfileId;
    }

    /**
     * <p>
     * The unique identifier for the routing profile to assign to the user
     * created.
     * </p>
     *
     * @param routingProfileId <p>
     *            The unique identifier for the routing profile to assign to the
     *            user created.
     *            </p>
     */
    public void setRoutingProfileId(String routingProfileId) {
        this.routingProfileId = routingProfileId;
    }

    /**
     * <p>
     * The unique identifier for the routing profile to assign to the user
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param routingProfileId <p>
     *            The unique identifier for the routing profile to assign to the
     *            user created.
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
     * The unique identifier for the hierarchy group to assign to the user
     * created.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the hierarchy group to assign to the
     *         user created.
     *         </p>
     */
    public String getHierarchyGroupId() {
        return hierarchyGroupId;
    }

    /**
     * <p>
     * The unique identifier for the hierarchy group to assign to the user
     * created.
     * </p>
     *
     * @param hierarchyGroupId <p>
     *            The unique identifier for the hierarchy group to assign to the
     *            user created.
     *            </p>
     */
    public void setHierarchyGroupId(String hierarchyGroupId) {
        this.hierarchyGroupId = hierarchyGroupId;
    }

    /**
     * <p>
     * The unique identifier for the hierarchy group to assign to the user
     * created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hierarchyGroupId <p>
     *            The unique identifier for the hierarchy group to assign to the
     *            user created.
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
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier for your Amazon Connect instance. To find the ID
     *         of your instance, open the AWS console and select Amazon Connect.
     *         Select the alias of the instance in the Instance alias column.
     *         The instance ID is displayed in the Overview section of your
     *         instance settings. For example, the instance ID is the set of
     *         characters at the end of the instance ARN, after instance/, such
     *         as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier for your Amazon Connect instance. To find the
     *            ID of your instance, open the AWS console and select Amazon
     *            Connect. Select the alias of the instance in the Instance
     *            alias column. The instance ID is displayed in the Overview
     *            section of your instance settings. For example, the instance
     *            ID is the set of characters at the end of the instance ARN,
     *            after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier for your Amazon Connect instance. To find the ID of your
     * instance, open the AWS console and select Amazon Connect. Select the
     * alias of the instance in the Instance alias column. The instance ID is
     * displayed in the Overview section of your instance settings. For example,
     * the instance ID is the set of characters at the end of the instance ARN,
     * after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier for your Amazon Connect instance. To find the
     *            ID of your instance, open the AWS console and select Amazon
     *            Connect. Select the alias of the instance in the Instance
     *            alias column. The instance ID is displayed in the Overview
     *            section of your instance settings. For example, the instance
     *            ID is the set of characters at the end of the instance ARN,
     *            after instance/, such as 10a4c4eb-f57e-4d4c-b602-bf39176ced07.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
            sb.append("InstanceId: " + getInstanceId());
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
        return true;
    }
}
