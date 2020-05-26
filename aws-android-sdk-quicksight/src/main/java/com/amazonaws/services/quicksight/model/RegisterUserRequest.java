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
 * Creates an Amazon QuickSight user, whose identity is associated with the AWS
 * Identity and Access Management (IAM) identity or role specified in the
 * request.
 * </p>
 */
public class RegisterUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Amazon QuickSight supports several ways of managing the identity of
     * users. This parameter accepts two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code>: A user whose identity maps to an existing IAM user or
     * role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code>: A user whose identity is owned and managed
     * internally by Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     */
    private String identityType;

    /**
     * <p>
     * The email address of the user that you want to register.
     * </p>
     */
    private String email;

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     */
    private String userRole;

    /**
     * <p>
     * The ARN of the IAM user or role that you are registering with Amazon
     * QuickSight.
     * </p>
     */
    private String iamArn;

    /**
     * <p>
     * You need to use this parameter only when you register one or more users
     * using an assumed IAM role. You don't need to provide the session name for
     * other scenarios, for example when you are registering an IAM user or an
     * Amazon QuickSight user. You can register multiple users using the same
     * IAM role if each user has a different session name. For more information
     * on assuming IAM roles, see <a href=
     * "https://awscli.amazonaws.com/v2/documentation/api/latest/reference/sts/assume-role.html"
     * > <code>assume-role</code> </a> in the <i>AWS CLI Reference.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=.@-]*<br/>
     */
    private String sessionName;

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID
     * for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     */
    private String awsAccountId;

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     */
    private String namespace;

    /**
     * <p>
     * The Amazon QuickSight user name that you want to create for the user you
     * are registering.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     */
    private String userName;

    /**
     * <p>
     * Amazon QuickSight supports several ways of managing the identity of
     * users. This parameter accepts two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code>: A user whose identity maps to an existing IAM user or
     * role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code>: A user whose identity is owned and managed
     * internally by Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @return <p>
     *         Amazon QuickSight supports several ways of managing the identity
     *         of users. This parameter accepts two values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IAM</code>: A user whose identity maps to an existing IAM
     *         user or role.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>QUICKSIGHT</code>: A user whose identity is owned and
     *         managed internally by Amazon QuickSight.
     *         </p>
     *         </li>
     *         </ul>
     * @see IdentityType
     */
    public String getIdentityType() {
        return identityType;
    }

    /**
     * <p>
     * Amazon QuickSight supports several ways of managing the identity of
     * users. This parameter accepts two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code>: A user whose identity maps to an existing IAM user or
     * role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code>: A user whose identity is owned and managed
     * internally by Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            Amazon QuickSight supports several ways of managing the
     *            identity of users. This parameter accepts two values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IAM</code>: A user whose identity maps to an existing
     *            IAM user or role.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUICKSIGHT</code>: A user whose identity is owned and
     *            managed internally by Amazon QuickSight.
     *            </p>
     *            </li>
     *            </ul>
     * @see IdentityType
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    /**
     * <p>
     * Amazon QuickSight supports several ways of managing the identity of
     * users. This parameter accepts two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code>: A user whose identity maps to an existing IAM user or
     * role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code>: A user whose identity is owned and managed
     * internally by Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            Amazon QuickSight supports several ways of managing the
     *            identity of users. This parameter accepts two values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IAM</code>: A user whose identity maps to an existing
     *            IAM user or role.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUICKSIGHT</code>: A user whose identity is owned and
     *            managed internally by Amazon QuickSight.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityType
     */
    public RegisterUserRequest withIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }

    /**
     * <p>
     * Amazon QuickSight supports several ways of managing the identity of
     * users. This parameter accepts two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code>: A user whose identity maps to an existing IAM user or
     * role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code>: A user whose identity is owned and managed
     * internally by Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            Amazon QuickSight supports several ways of managing the
     *            identity of users. This parameter accepts two values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IAM</code>: A user whose identity maps to an existing
     *            IAM user or role.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUICKSIGHT</code>: A user whose identity is owned and
     *            managed internally by Amazon QuickSight.
     *            </p>
     *            </li>
     *            </ul>
     * @see IdentityType
     */
    public void setIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
    }

    /**
     * <p>
     * Amazon QuickSight supports several ways of managing the identity of
     * users. This parameter accepts two values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IAM</code>: A user whose identity maps to an existing IAM user or
     * role.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>QUICKSIGHT</code>: A user whose identity is owned and managed
     * internally by Amazon QuickSight.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IAM, QUICKSIGHT
     *
     * @param identityType <p>
     *            Amazon QuickSight supports several ways of managing the
     *            identity of users. This parameter accepts two values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>IAM</code>: A user whose identity maps to an existing
     *            IAM user or role.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>QUICKSIGHT</code>: A user whose identity is owned and
     *            managed internally by Amazon QuickSight.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see IdentityType
     */
    public RegisterUserRequest withIdentityType(IdentityType identityType) {
        this.identityType = identityType.toString();
        return this;
    }

    /**
     * <p>
     * The email address of the user that you want to register.
     * </p>
     *
     * @return <p>
     *         The email address of the user that you want to register.
     *         </p>
     */
    public String getEmail() {
        return email;
    }

    /**
     * <p>
     * The email address of the user that you want to register.
     * </p>
     *
     * @param email <p>
     *            The email address of the user that you want to register.
     *            </p>
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the user that you want to register.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param email <p>
     *            The email address of the user that you want to register.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterUserRequest withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @return <p>
     *         The Amazon QuickSight role for the user. The user role can be one
     *         of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>READER</code>: A user who has read-only access to
     *         dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AUTHOR</code>: A user who can create data sources,
     *         datasets, analyses, and dashboards.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ADMIN</code>: A user who is an author, who can also manage
     *         Amazon QuickSight settings.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESTRICTED_READER</code>: This role isn't currently
     *         available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RESTRICTED_AUTHOR</code>: This role isn't currently
     *         available for use.
     *         </p>
     *         </li>
     *         </ul>
     * @see UserRole
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param userRole <p>
     *            The Amazon QuickSight role for the user. The user role can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_READER</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_AUTHOR</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserRole
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param userRole <p>
     *            The Amazon QuickSight role for the user. The user role can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_READER</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_AUTHOR</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserRole
     */
    public RegisterUserRequest withUserRole(String userRole) {
        this.userRole = userRole;
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param userRole <p>
     *            The Amazon QuickSight role for the user. The user role can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_READER</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_AUTHOR</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserRole
     */
    public void setUserRole(UserRole userRole) {
        this.userRole = userRole.toString();
    }

    /**
     * <p>
     * The Amazon QuickSight role for the user. The user role can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>READER</code>: A user who has read-only access to dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AUTHOR</code>: A user who can create data sources, datasets,
     * analyses, and dashboards.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ADMIN</code>: A user who is an author, who can also manage Amazon
     * QuickSight settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_READER</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RESTRICTED_AUTHOR</code>: This role isn't currently available for
     * use.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR,
     * RESTRICTED_READER
     *
     * @param userRole <p>
     *            The Amazon QuickSight role for the user. The user role can be
     *            one of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>READER</code>: A user who has read-only access to
     *            dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AUTHOR</code>: A user who can create data sources,
     *            datasets, analyses, and dashboards.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ADMIN</code>: A user who is an author, who can also
     *            manage Amazon QuickSight settings.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_READER</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>RESTRICTED_AUTHOR</code>: This role isn't currently
     *            available for use.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserRole
     */
    public RegisterUserRequest withUserRole(UserRole userRole) {
        this.userRole = userRole.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM user or role that you are registering with Amazon
     * QuickSight.
     * </p>
     *
     * @return <p>
     *         The ARN of the IAM user or role that you are registering with
     *         Amazon QuickSight.
     *         </p>
     */
    public String getIamArn() {
        return iamArn;
    }

    /**
     * <p>
     * The ARN of the IAM user or role that you are registering with Amazon
     * QuickSight.
     * </p>
     *
     * @param iamArn <p>
     *            The ARN of the IAM user or role that you are registering with
     *            Amazon QuickSight.
     *            </p>
     */
    public void setIamArn(String iamArn) {
        this.iamArn = iamArn;
    }

    /**
     * <p>
     * The ARN of the IAM user or role that you are registering with Amazon
     * QuickSight.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iamArn <p>
     *            The ARN of the IAM user or role that you are registering with
     *            Amazon QuickSight.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterUserRequest withIamArn(String iamArn) {
        this.iamArn = iamArn;
        return this;
    }

    /**
     * <p>
     * You need to use this parameter only when you register one or more users
     * using an assumed IAM role. You don't need to provide the session name for
     * other scenarios, for example when you are registering an IAM user or an
     * Amazon QuickSight user. You can register multiple users using the same
     * IAM role if each user has a different session name. For more information
     * on assuming IAM roles, see <a href=
     * "https://awscli.amazonaws.com/v2/documentation/api/latest/reference/sts/assume-role.html"
     * > <code>assume-role</code> </a> in the <i>AWS CLI Reference.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=.@-]*<br/>
     *
     * @return <p>
     *         You need to use this parameter only when you register one or more
     *         users using an assumed IAM role. You don't need to provide the
     *         session name for other scenarios, for example when you are
     *         registering an IAM user or an Amazon QuickSight user. You can
     *         register multiple users using the same IAM role if each user has
     *         a different session name. For more information on assuming IAM
     *         roles, see <a href=
     *         "https://awscli.amazonaws.com/v2/documentation/api/latest/reference/sts/assume-role.html"
     *         > <code>assume-role</code> </a> in the <i>AWS CLI Reference.</i>
     *         </p>
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * <p>
     * You need to use this parameter only when you register one or more users
     * using an assumed IAM role. You don't need to provide the session name for
     * other scenarios, for example when you are registering an IAM user or an
     * Amazon QuickSight user. You can register multiple users using the same
     * IAM role if each user has a different session name. For more information
     * on assuming IAM roles, see <a href=
     * "https://awscli.amazonaws.com/v2/documentation/api/latest/reference/sts/assume-role.html"
     * > <code>assume-role</code> </a> in the <i>AWS CLI Reference.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=.@-]*<br/>
     *
     * @param sessionName <p>
     *            You need to use this parameter only when you register one or
     *            more users using an assumed IAM role. You don't need to
     *            provide the session name for other scenarios, for example when
     *            you are registering an IAM user or an Amazon QuickSight user.
     *            You can register multiple users using the same IAM role if
     *            each user has a different session name. For more information
     *            on assuming IAM roles, see <a href=
     *            "https://awscli.amazonaws.com/v2/documentation/api/latest/reference/sts/assume-role.html"
     *            > <code>assume-role</code> </a> in the <i>AWS CLI
     *            Reference.</i>
     *            </p>
     */
    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    /**
     * <p>
     * You need to use this parameter only when you register one or more users
     * using an assumed IAM role. You don't need to provide the session name for
     * other scenarios, for example when you are registering an IAM user or an
     * Amazon QuickSight user. You can register multiple users using the same
     * IAM role if each user has a different session name. For more information
     * on assuming IAM roles, see <a href=
     * "https://awscli.amazonaws.com/v2/documentation/api/latest/reference/sts/assume-role.html"
     * > <code>assume-role</code> </a> in the <i>AWS CLI Reference.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 64<br/>
     * <b>Pattern: </b>[\w+=.@-]*<br/>
     *
     * @param sessionName <p>
     *            You need to use this parameter only when you register one or
     *            more users using an assumed IAM role. You don't need to
     *            provide the session name for other scenarios, for example when
     *            you are registering an IAM user or an Amazon QuickSight user.
     *            You can register multiple users using the same IAM role if
     *            each user has a different session name. For more information
     *            on assuming IAM roles, see <a href=
     *            "https://awscli.amazonaws.com/v2/documentation/api/latest/reference/sts/assume-role.html"
     *            > <code>assume-role</code> </a> in the <i>AWS CLI
     *            Reference.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterUserRequest withSessionName(String sessionName) {
        this.sessionName = sessionName;
        return this;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID
     * for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @return <p>
     *         The ID for the AWS account that the user is in. Currently, you
     *         use the ID for the AWS account that contains your Amazon
     *         QuickSight account.
     *         </p>
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID
     * for the AWS account that contains your Amazon QuickSight account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 12<br/>
     * <b>Pattern: </b>^[0-9]{12}$<br/>
     *
     * @param awsAccountId <p>
     *            The ID for the AWS account that the user is in. Currently, you
     *            use the ID for the AWS account that contains your Amazon
     *            QuickSight account.
     *            </p>
     */
    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that the user is in. Currently, you use the ID
     * for the AWS account that contains your Amazon QuickSight account.
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
     *            The ID for the AWS account that the user is in. Currently, you
     *            use the ID for the AWS account that contains your Amazon
     *            QuickSight account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterUserRequest withAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
        return this;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @return <p>
     *         The namespace. Currently, you should set this to
     *         <code>default</code>.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @param namespace <p>
     *            The namespace. Currently, you should set this to
     *            <code>default</code>.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace. Currently, you should set this to <code>default</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9._-]*$<br/>
     *
     * @param namespace <p>
     *            The namespace. Currently, you should set this to
     *            <code>default</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterUserRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * The Amazon QuickSight user name that you want to create for the user you
     * are registering.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @return <p>
     *         The Amazon QuickSight user name that you want to create for the
     *         user you are registering.
     *         </p>
     */
    public String getUserName() {
        return userName;
    }

    /**
     * <p>
     * The Amazon QuickSight user name that you want to create for the user you
     * are registering.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param userName <p>
     *            The Amazon QuickSight user name that you want to create for
     *            the user you are registering.
     *            </p>
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The Amazon QuickSight user name that you want to create for the user you
     * are registering.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     * <b>Pattern: </b>[ -\u00FF]+<br/>
     *
     * @param userName <p>
     *            The Amazon QuickSight user name that you want to create for
     *            the user you are registering.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterUserRequest withUserName(String userName) {
        this.userName = userName;
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
        if (getIdentityType() != null)
            sb.append("IdentityType: " + getIdentityType() + ",");
        if (getEmail() != null)
            sb.append("Email: " + getEmail() + ",");
        if (getUserRole() != null)
            sb.append("UserRole: " + getUserRole() + ",");
        if (getIamArn() != null)
            sb.append("IamArn: " + getIamArn() + ",");
        if (getSessionName() != null)
            sb.append("SessionName: " + getSessionName() + ",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: " + getAwsAccountId() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getUserName() != null)
            sb.append("UserName: " + getUserName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
        hashCode = prime * hashCode + ((getIamArn() == null) ? 0 : getIamArn().hashCode());
        hashCode = prime * hashCode
                + ((getSessionName() == null) ? 0 : getSessionName().hashCode());
        hashCode = prime * hashCode
                + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterUserRequest == false)
            return false;
        RegisterUserRequest other = (RegisterUserRequest) obj;

        if (other.getIdentityType() == null ^ this.getIdentityType() == null)
            return false;
        if (other.getIdentityType() != null
                && other.getIdentityType().equals(this.getIdentityType()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getUserRole() == null ^ this.getUserRole() == null)
            return false;
        if (other.getUserRole() != null && other.getUserRole().equals(this.getUserRole()) == false)
            return false;
        if (other.getIamArn() == null ^ this.getIamArn() == null)
            return false;
        if (other.getIamArn() != null && other.getIamArn().equals(this.getIamArn()) == false)
            return false;
        if (other.getSessionName() == null ^ this.getSessionName() == null)
            return false;
        if (other.getSessionName() != null
                && other.getSessionName().equals(this.getSessionName()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null
                && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        return true;
    }
}
