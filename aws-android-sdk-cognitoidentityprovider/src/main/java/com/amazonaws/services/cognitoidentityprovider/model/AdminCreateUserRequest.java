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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new user in the specified user pool.
 * </p>
 * <p>
 * If <code>MessageAction</code> is not set, the default is to send a welcome
 * message via email or phone (SMS).
 * </p>
 * <note>
 * <p>
 * This message is based on a template that you configured in your call to or .
 * This template includes your custom sign-up instructions and placeholders for
 * user name and temporary password.
 * </p>
 * </note>
 * <p>
 * Alternatively, you can call AdminCreateUser with “SUPPRESS” for the
 * <code>MessageAction</code> parameter, and Amazon Cognito will not send any
 * email.
 * </p>
 * <p>
 * In either case, the user will be in the <code>FORCE_CHANGE_PASSWORD</code>
 * state until they sign in and change their password.
 * </p>
 * <p>
 * AdminCreateUser requires developer credentials.
 * </p>
 */
public class AdminCreateUserRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool where the user will be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * The username for the user. Must be unique within the user pool. Must be a
     * UTF-8 string between 1 and 128 characters. After the user is created, the
     * username cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * <p>
     * An array of name-value pairs that contain user attributes and attribute
     * values to be set for the user to be created. You can create a user
     * without specifying any attributes other than <code>Username</code>.
     * However, any attributes that you specify as required (in or in the
     * <b>Attributes</b> tab of the console) must be supplied either by you (in
     * your call to <code>AdminCreateUser</code>) or by the user (when he or she
     * signs up in response to your welcome message).
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * To send a message inviting the user to sign up, you must specify the
     * user's email address or phone number. This can be done in your call to
     * AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console
     * for managing your user pools.
     * </p>
     * <p>
     * In your call to <code>AdminCreateUser</code>, you can set the
     * <code>email_verified</code> attribute to <code>True</code>, and you can
     * set the <code>phone_number_verified</code> attribute to <code>True</code>
     * . (You can also do this by calling .)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>email</b>: The email address of the user to whom the message that
     * contains the code and username will be sent. Required if the
     * <code>email_verified</code> attribute is set to <code>True</code>, or if
     * <code>"EMAIL"</code> is specified in the
     * <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>phone_number</b>: The phone number of the user to whom the message
     * that contains the code and username will be sent. Required if the
     * <code>phone_number_verified</code> attribute is set to <code>True</code>,
     * or if <code>"SMS"</code> is specified in the
     * <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<AttributeType> userAttributes;

    /**
     * <p>
     * The user's validation data. This is an array of name-value pairs that
     * contain user attributes and attribute values that you can use for custom
     * validation, such as restricting the types of user accounts that can be
     * registered. For example, you might choose to allow or disallow user
     * sign-up based on the user's domain.
     * </p>
     * <p>
     * To configure custom validation, you must create a Pre Sign-up Lambda
     * trigger for the user pool as described in the Amazon Cognito Developer
     * Guide. The Lambda trigger receives the validation data and uses it in the
     * validation process.
     * </p>
     * <p>
     * The user's validation data is not persisted.
     * </p>
     */
    private java.util.List<AttributeType> validationData;

    /**
     * <p>
     * The user's temporary password. This password must conform to the password
     * policy that you specified when you created the user pool.
     * </p>
     * <p>
     * The temporary password is valid only once. To complete the Admin Create
     * User flow, the user must enter the temporary password in the sign-in page
     * along with a new password to be used in all future sign-ins.
     * </p>
     * <p>
     * This parameter is not required. If you do not specify a value, Amazon
     * Cognito generates one for you.
     * </p>
     * <p>
     * The temporary password can only be used until the user account expiration
     * limit that you specified when you created the user pool. To reset the
     * account after that time limit, you must call <code>AdminCreateUser</code>
     * again, specifying <code>"RESEND"</code> for the
     * <code>MessageAction</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String temporaryPassword;

    /**
     * <p>
     * This parameter is only used if the <code>phone_number_verified</code> or
     * <code>email_verified</code> attribute is set to <code>True</code>.
     * Otherwise, it is ignored.
     * </p>
     * <p>
     * If this parameter is set to <code>True</code> and the phone number or
     * email address specified in the UserAttributes parameter already exists as
     * an alias with a different user, the API call will migrate the alias from
     * the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     * </p>
     * <p>
     * If this parameter is set to <code>False</code>, the API throws an
     * <code>AliasExistsException</code> error if the alias already exists. The
     * default value is <code>False</code>.
     * </p>
     */
    private Boolean forceAliasCreation;

    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user
     * that already exists and reset the expiration limit on the user's account.
     * Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESEND, SUPPRESS
     */
    private String messageAction;

    /**
     * <p>
     * Specify <code>"EMAIL"</code> if email will be used to send the welcome
     * message. Specify <code>"SMS"</code> if the phone number will be used. The
     * default value is <code>"SMS"</code>. More than one value can be
     * specified.
     * </p>
     */
    private java.util.List<String> desiredDeliveryMediums;

    /**
     * <p>
     * The user pool ID for the user pool where the user will be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool where the user will be
     *         created.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where the user will be created.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where the user will be
     *            created.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where the user will be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool where the user will be
     *            created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * The username for the user. Must be unique within the user pool. Must be a
     * UTF-8 string between 1 and 128 characters. After the user is created, the
     * username cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return <p>
     *         The username for the user. Must be unique within the user pool.
     *         Must be a UTF-8 string between 1 and 128 characters. After the
     *         user is created, the username cannot be changed.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The username for the user. Must be unique within the user pool. Must be a
     * UTF-8 string between 1 and 128 characters. After the user is created, the
     * username cannot be changed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The username for the user. Must be unique within the user
     *            pool. Must be a UTF-8 string between 1 and 128 characters.
     *            After the user is created, the username cannot be changed.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username for the user. Must be unique within the user pool. Must be a
     * UTF-8 string between 1 and 128 characters. After the user is created, the
     * username cannot be changed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username <p>
     *            The username for the user. Must be unique within the user
     *            pool. Must be a UTF-8 string between 1 and 128 characters.
     *            After the user is created, the username cannot be changed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs that contain user attributes and attribute
     * values to be set for the user to be created. You can create a user
     * without specifying any attributes other than <code>Username</code>.
     * However, any attributes that you specify as required (in or in the
     * <b>Attributes</b> tab of the console) must be supplied either by you (in
     * your call to <code>AdminCreateUser</code>) or by the user (when he or she
     * signs up in response to your welcome message).
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * To send a message inviting the user to sign up, you must specify the
     * user's email address or phone number. This can be done in your call to
     * AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console
     * for managing your user pools.
     * </p>
     * <p>
     * In your call to <code>AdminCreateUser</code>, you can set the
     * <code>email_verified</code> attribute to <code>True</code>, and you can
     * set the <code>phone_number_verified</code> attribute to <code>True</code>
     * . (You can also do this by calling .)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>email</b>: The email address of the user to whom the message that
     * contains the code and username will be sent. Required if the
     * <code>email_verified</code> attribute is set to <code>True</code>, or if
     * <code>"EMAIL"</code> is specified in the
     * <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>phone_number</b>: The phone number of the user to whom the message
     * that contains the code and username will be sent. Required if the
     * <code>phone_number_verified</code> attribute is set to <code>True</code>,
     * or if <code>"SMS"</code> is specified in the
     * <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         An array of name-value pairs that contain user attributes and
     *         attribute values to be set for the user to be created. You can
     *         create a user without specifying any attributes other than
     *         <code>Username</code>. However, any attributes that you specify
     *         as required (in or in the <b>Attributes</b> tab of the console)
     *         must be supplied either by you (in your call to
     *         <code>AdminCreateUser</code>) or by the user (when he or she
     *         signs up in response to your welcome message).
     *         </p>
     *         <p>
     *         For custom attributes, you must prepend the <code>custom:</code>
     *         prefix to the attribute name.
     *         </p>
     *         <p>
     *         To send a message inviting the user to sign up, you must specify
     *         the user's email address or phone number. This can be done in
     *         your call to AdminCreateUser or in the <b>Users</b> tab of the
     *         Amazon Cognito console for managing your user pools.
     *         </p>
     *         <p>
     *         In your call to <code>AdminCreateUser</code>, you can set the
     *         <code>email_verified</code> attribute to <code>True</code>, and
     *         you can set the <code>phone_number_verified</code> attribute to
     *         <code>True</code>. (You can also do this by calling .)
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>email</b>: The email address of the user to whom the message
     *         that contains the code and username will be sent. Required if the
     *         <code>email_verified</code> attribute is set to <code>True</code>
     *         , or if <code>"EMAIL"</code> is specified in the
     *         <code>DesiredDeliveryMediums</code> parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>phone_number</b>: The phone number of the user to whom the
     *         message that contains the code and username will be sent.
     *         Required if the <code>phone_number_verified</code> attribute is
     *         set to <code>True</code>, or if <code>"SMS"</code> is specified
     *         in the <code>DesiredDeliveryMediums</code> parameter.
     *         </p>
     *         </li>
     *         </ul>
     */
    public java.util.List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * <p>
     * An array of name-value pairs that contain user attributes and attribute
     * values to be set for the user to be created. You can create a user
     * without specifying any attributes other than <code>Username</code>.
     * However, any attributes that you specify as required (in or in the
     * <b>Attributes</b> tab of the console) must be supplied either by you (in
     * your call to <code>AdminCreateUser</code>) or by the user (when he or she
     * signs up in response to your welcome message).
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * To send a message inviting the user to sign up, you must specify the
     * user's email address or phone number. This can be done in your call to
     * AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console
     * for managing your user pools.
     * </p>
     * <p>
     * In your call to <code>AdminCreateUser</code>, you can set the
     * <code>email_verified</code> attribute to <code>True</code>, and you can
     * set the <code>phone_number_verified</code> attribute to <code>True</code>
     * . (You can also do this by calling .)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>email</b>: The email address of the user to whom the message that
     * contains the code and username will be sent. Required if the
     * <code>email_verified</code> attribute is set to <code>True</code>, or if
     * <code>"EMAIL"</code> is specified in the
     * <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>phone_number</b>: The phone number of the user to whom the message
     * that contains the code and username will be sent. Required if the
     * <code>phone_number_verified</code> attribute is set to <code>True</code>,
     * or if <code>"SMS"</code> is specified in the
     * <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * </ul>
     *
     * @param userAttributes <p>
     *            An array of name-value pairs that contain user attributes and
     *            attribute values to be set for the user to be created. You can
     *            create a user without specifying any attributes other than
     *            <code>Username</code>. However, any attributes that you
     *            specify as required (in or in the <b>Attributes</b> tab of the
     *            console) must be supplied either by you (in your call to
     *            <code>AdminCreateUser</code>) or by the user (when he or she
     *            signs up in response to your welcome message).
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     *            <p>
     *            To send a message inviting the user to sign up, you must
     *            specify the user's email address or phone number. This can be
     *            done in your call to AdminCreateUser or in the <b>Users</b>
     *            tab of the Amazon Cognito console for managing your user
     *            pools.
     *            </p>
     *            <p>
     *            In your call to <code>AdminCreateUser</code>, you can set the
     *            <code>email_verified</code> attribute to <code>True</code>,
     *            and you can set the <code>phone_number_verified</code>
     *            attribute to <code>True</code>. (You can also do this by
     *            calling .)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>email</b>: The email address of the user to whom the
     *            message that contains the code and username will be sent.
     *            Required if the <code>email_verified</code> attribute is set
     *            to <code>True</code>, or if <code>"EMAIL"</code> is specified
     *            in the <code>DesiredDeliveryMediums</code> parameter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>phone_number</b>: The phone number of the user to whom the
     *            message that contains the code and username will be sent.
     *            Required if the <code>phone_number_verified</code> attribute
     *            is set to <code>True</code>, or if <code>"SMS"</code> is
     *            specified in the <code>DesiredDeliveryMediums</code>
     *            parameter.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }

        this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes);
    }

    /**
     * <p>
     * An array of name-value pairs that contain user attributes and attribute
     * values to be set for the user to be created. You can create a user
     * without specifying any attributes other than <code>Username</code>.
     * However, any attributes that you specify as required (in or in the
     * <b>Attributes</b> tab of the console) must be supplied either by you (in
     * your call to <code>AdminCreateUser</code>) or by the user (when he or she
     * signs up in response to your welcome message).
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * To send a message inviting the user to sign up, you must specify the
     * user's email address or phone number. This can be done in your call to
     * AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console
     * for managing your user pools.
     * </p>
     * <p>
     * In your call to <code>AdminCreateUser</code>, you can set the
     * <code>email_verified</code> attribute to <code>True</code>, and you can
     * set the <code>phone_number_verified</code> attribute to <code>True</code>
     * . (You can also do this by calling .)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>email</b>: The email address of the user to whom the message that
     * contains the code and username will be sent. Required if the
     * <code>email_verified</code> attribute is set to <code>True</code>, or if
     * <code>"EMAIL"</code> is specified in the
     * <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>phone_number</b>: The phone number of the user to whom the message
     * that contains the code and username will be sent. Required if the
     * <code>phone_number_verified</code> attribute is set to <code>True</code>,
     * or if <code>"SMS"</code> is specified in the
     * <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs that contain user attributes and
     *            attribute values to be set for the user to be created. You can
     *            create a user without specifying any attributes other than
     *            <code>Username</code>. However, any attributes that you
     *            specify as required (in or in the <b>Attributes</b> tab of the
     *            console) must be supplied either by you (in your call to
     *            <code>AdminCreateUser</code>) or by the user (when he or she
     *            signs up in response to your welcome message).
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     *            <p>
     *            To send a message inviting the user to sign up, you must
     *            specify the user's email address or phone number. This can be
     *            done in your call to AdminCreateUser or in the <b>Users</b>
     *            tab of the Amazon Cognito console for managing your user
     *            pools.
     *            </p>
     *            <p>
     *            In your call to <code>AdminCreateUser</code>, you can set the
     *            <code>email_verified</code> attribute to <code>True</code>,
     *            and you can set the <code>phone_number_verified</code>
     *            attribute to <code>True</code>. (You can also do this by
     *            calling .)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>email</b>: The email address of the user to whom the
     *            message that contains the code and username will be sent.
     *            Required if the <code>email_verified</code> attribute is set
     *            to <code>True</code>, or if <code>"EMAIL"</code> is specified
     *            in the <code>DesiredDeliveryMediums</code> parameter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>phone_number</b>: The phone number of the user to whom the
     *            message that contains the code and username will be sent.
     *            Required if the <code>phone_number_verified</code> attribute
     *            is set to <code>True</code>, or if <code>"SMS"</code> is
     *            specified in the <code>DesiredDeliveryMediums</code>
     *            parameter.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserRequest withUserAttributes(AttributeType... userAttributes) {
        if (getUserAttributes() == null) {
            this.userAttributes = new java.util.ArrayList<AttributeType>(userAttributes.length);
        }
        for (AttributeType value : userAttributes) {
            this.userAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of name-value pairs that contain user attributes and attribute
     * values to be set for the user to be created. You can create a user
     * without specifying any attributes other than <code>Username</code>.
     * However, any attributes that you specify as required (in or in the
     * <b>Attributes</b> tab of the console) must be supplied either by you (in
     * your call to <code>AdminCreateUser</code>) or by the user (when he or she
     * signs up in response to your welcome message).
     * </p>
     * <p>
     * For custom attributes, you must prepend the <code>custom:</code> prefix
     * to the attribute name.
     * </p>
     * <p>
     * To send a message inviting the user to sign up, you must specify the
     * user's email address or phone number. This can be done in your call to
     * AdminCreateUser or in the <b>Users</b> tab of the Amazon Cognito console
     * for managing your user pools.
     * </p>
     * <p>
     * In your call to <code>AdminCreateUser</code>, you can set the
     * <code>email_verified</code> attribute to <code>True</code>, and you can
     * set the <code>phone_number_verified</code> attribute to <code>True</code>
     * . (You can also do this by calling .)
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>email</b>: The email address of the user to whom the message that
     * contains the code and username will be sent. Required if the
     * <code>email_verified</code> attribute is set to <code>True</code>, or if
     * <code>"EMAIL"</code> is specified in the
     * <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>phone_number</b>: The phone number of the user to whom the message
     * that contains the code and username will be sent. Required if the
     * <code>phone_number_verified</code> attribute is set to <code>True</code>,
     * or if <code>"SMS"</code> is specified in the
     * <code>DesiredDeliveryMediums</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userAttributes <p>
     *            An array of name-value pairs that contain user attributes and
     *            attribute values to be set for the user to be created. You can
     *            create a user without specifying any attributes other than
     *            <code>Username</code>. However, any attributes that you
     *            specify as required (in or in the <b>Attributes</b> tab of the
     *            console) must be supplied either by you (in your call to
     *            <code>AdminCreateUser</code>) or by the user (when he or she
     *            signs up in response to your welcome message).
     *            </p>
     *            <p>
     *            For custom attributes, you must prepend the
     *            <code>custom:</code> prefix to the attribute name.
     *            </p>
     *            <p>
     *            To send a message inviting the user to sign up, you must
     *            specify the user's email address or phone number. This can be
     *            done in your call to AdminCreateUser or in the <b>Users</b>
     *            tab of the Amazon Cognito console for managing your user
     *            pools.
     *            </p>
     *            <p>
     *            In your call to <code>AdminCreateUser</code>, you can set the
     *            <code>email_verified</code> attribute to <code>True</code>,
     *            and you can set the <code>phone_number_verified</code>
     *            attribute to <code>True</code>. (You can also do this by
     *            calling .)
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <b>email</b>: The email address of the user to whom the
     *            message that contains the code and username will be sent.
     *            Required if the <code>email_verified</code> attribute is set
     *            to <code>True</code>, or if <code>"EMAIL"</code> is specified
     *            in the <code>DesiredDeliveryMediums</code> parameter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <b>phone_number</b>: The phone number of the user to whom the
     *            message that contains the code and username will be sent.
     *            Required if the <code>phone_number_verified</code> attribute
     *            is set to <code>True</code>, or if <code>"SMS"</code> is
     *            specified in the <code>DesiredDeliveryMediums</code>
     *            parameter.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserRequest withUserAttributes(
            java.util.Collection<AttributeType> userAttributes) {
        setUserAttributes(userAttributes);
        return this;
    }

    /**
     * <p>
     * The user's validation data. This is an array of name-value pairs that
     * contain user attributes and attribute values that you can use for custom
     * validation, such as restricting the types of user accounts that can be
     * registered. For example, you might choose to allow or disallow user
     * sign-up based on the user's domain.
     * </p>
     * <p>
     * To configure custom validation, you must create a Pre Sign-up Lambda
     * trigger for the user pool as described in the Amazon Cognito Developer
     * Guide. The Lambda trigger receives the validation data and uses it in the
     * validation process.
     * </p>
     * <p>
     * The user's validation data is not persisted.
     * </p>
     *
     * @return <p>
     *         The user's validation data. This is an array of name-value pairs
     *         that contain user attributes and attribute values that you can
     *         use for custom validation, such as restricting the types of user
     *         accounts that can be registered. For example, you might choose to
     *         allow or disallow user sign-up based on the user's domain.
     *         </p>
     *         <p>
     *         To configure custom validation, you must create a Pre Sign-up
     *         Lambda trigger for the user pool as described in the Amazon
     *         Cognito Developer Guide. The Lambda trigger receives the
     *         validation data and uses it in the validation process.
     *         </p>
     *         <p>
     *         The user's validation data is not persisted.
     *         </p>
     */
    public java.util.List<AttributeType> getValidationData() {
        return validationData;
    }

    /**
     * <p>
     * The user's validation data. This is an array of name-value pairs that
     * contain user attributes and attribute values that you can use for custom
     * validation, such as restricting the types of user accounts that can be
     * registered. For example, you might choose to allow or disallow user
     * sign-up based on the user's domain.
     * </p>
     * <p>
     * To configure custom validation, you must create a Pre Sign-up Lambda
     * trigger for the user pool as described in the Amazon Cognito Developer
     * Guide. The Lambda trigger receives the validation data and uses it in the
     * validation process.
     * </p>
     * <p>
     * The user's validation data is not persisted.
     * </p>
     *
     * @param validationData <p>
     *            The user's validation data. This is an array of name-value
     *            pairs that contain user attributes and attribute values that
     *            you can use for custom validation, such as restricting the
     *            types of user accounts that can be registered. For example,
     *            you might choose to allow or disallow user sign-up based on
     *            the user's domain.
     *            </p>
     *            <p>
     *            To configure custom validation, you must create a Pre Sign-up
     *            Lambda trigger for the user pool as described in the Amazon
     *            Cognito Developer Guide. The Lambda trigger receives the
     *            validation data and uses it in the validation process.
     *            </p>
     *            <p>
     *            The user's validation data is not persisted.
     *            </p>
     */
    public void setValidationData(java.util.Collection<AttributeType> validationData) {
        if (validationData == null) {
            this.validationData = null;
            return;
        }

        this.validationData = new java.util.ArrayList<AttributeType>(validationData);
    }

    /**
     * <p>
     * The user's validation data. This is an array of name-value pairs that
     * contain user attributes and attribute values that you can use for custom
     * validation, such as restricting the types of user accounts that can be
     * registered. For example, you might choose to allow or disallow user
     * sign-up based on the user's domain.
     * </p>
     * <p>
     * To configure custom validation, you must create a Pre Sign-up Lambda
     * trigger for the user pool as described in the Amazon Cognito Developer
     * Guide. The Lambda trigger receives the validation data and uses it in the
     * validation process.
     * </p>
     * <p>
     * The user's validation data is not persisted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationData <p>
     *            The user's validation data. This is an array of name-value
     *            pairs that contain user attributes and attribute values that
     *            you can use for custom validation, such as restricting the
     *            types of user accounts that can be registered. For example,
     *            you might choose to allow or disallow user sign-up based on
     *            the user's domain.
     *            </p>
     *            <p>
     *            To configure custom validation, you must create a Pre Sign-up
     *            Lambda trigger for the user pool as described in the Amazon
     *            Cognito Developer Guide. The Lambda trigger receives the
     *            validation data and uses it in the validation process.
     *            </p>
     *            <p>
     *            The user's validation data is not persisted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserRequest withValidationData(AttributeType... validationData) {
        if (getValidationData() == null) {
            this.validationData = new java.util.ArrayList<AttributeType>(validationData.length);
        }
        for (AttributeType value : validationData) {
            this.validationData.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The user's validation data. This is an array of name-value pairs that
     * contain user attributes and attribute values that you can use for custom
     * validation, such as restricting the types of user accounts that can be
     * registered. For example, you might choose to allow or disallow user
     * sign-up based on the user's domain.
     * </p>
     * <p>
     * To configure custom validation, you must create a Pre Sign-up Lambda
     * trigger for the user pool as described in the Amazon Cognito Developer
     * Guide. The Lambda trigger receives the validation data and uses it in the
     * validation process.
     * </p>
     * <p>
     * The user's validation data is not persisted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validationData <p>
     *            The user's validation data. This is an array of name-value
     *            pairs that contain user attributes and attribute values that
     *            you can use for custom validation, such as restricting the
     *            types of user accounts that can be registered. For example,
     *            you might choose to allow or disallow user sign-up based on
     *            the user's domain.
     *            </p>
     *            <p>
     *            To configure custom validation, you must create a Pre Sign-up
     *            Lambda trigger for the user pool as described in the Amazon
     *            Cognito Developer Guide. The Lambda trigger receives the
     *            validation data and uses it in the validation process.
     *            </p>
     *            <p>
     *            The user's validation data is not persisted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserRequest withValidationData(
            java.util.Collection<AttributeType> validationData) {
        setValidationData(validationData);
        return this;
    }

    /**
     * <p>
     * The user's temporary password. This password must conform to the password
     * policy that you specified when you created the user pool.
     * </p>
     * <p>
     * The temporary password is valid only once. To complete the Admin Create
     * User flow, the user must enter the temporary password in the sign-in page
     * along with a new password to be used in all future sign-ins.
     * </p>
     * <p>
     * This parameter is not required. If you do not specify a value, Amazon
     * Cognito generates one for you.
     * </p>
     * <p>
     * The temporary password can only be used until the user account expiration
     * limit that you specified when you created the user pool. To reset the
     * account after that time limit, you must call <code>AdminCreateUser</code>
     * again, specifying <code>"RESEND"</code> for the
     * <code>MessageAction</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return <p>
     *         The user's temporary password. This password must conform to the
     *         password policy that you specified when you created the user
     *         pool.
     *         </p>
     *         <p>
     *         The temporary password is valid only once. To complete the Admin
     *         Create User flow, the user must enter the temporary password in
     *         the sign-in page along with a new password to be used in all
     *         future sign-ins.
     *         </p>
     *         <p>
     *         This parameter is not required. If you do not specify a value,
     *         Amazon Cognito generates one for you.
     *         </p>
     *         <p>
     *         The temporary password can only be used until the user account
     *         expiration limit that you specified when you created the user
     *         pool. To reset the account after that time limit, you must call
     *         <code>AdminCreateUser</code> again, specifying
     *         <code>"RESEND"</code> for the <code>MessageAction</code>
     *         parameter.
     *         </p>
     */
    public String getTemporaryPassword() {
        return temporaryPassword;
    }

    /**
     * <p>
     * The user's temporary password. This password must conform to the password
     * policy that you specified when you created the user pool.
     * </p>
     * <p>
     * The temporary password is valid only once. To complete the Admin Create
     * User flow, the user must enter the temporary password in the sign-in page
     * along with a new password to be used in all future sign-ins.
     * </p>
     * <p>
     * This parameter is not required. If you do not specify a value, Amazon
     * Cognito generates one for you.
     * </p>
     * <p>
     * The temporary password can only be used until the user account expiration
     * limit that you specified when you created the user pool. To reset the
     * account after that time limit, you must call <code>AdminCreateUser</code>
     * again, specifying <code>"RESEND"</code> for the
     * <code>MessageAction</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param temporaryPassword <p>
     *            The user's temporary password. This password must conform to
     *            the password policy that you specified when you created the
     *            user pool.
     *            </p>
     *            <p>
     *            The temporary password is valid only once. To complete the
     *            Admin Create User flow, the user must enter the temporary
     *            password in the sign-in page along with a new password to be
     *            used in all future sign-ins.
     *            </p>
     *            <p>
     *            This parameter is not required. If you do not specify a value,
     *            Amazon Cognito generates one for you.
     *            </p>
     *            <p>
     *            The temporary password can only be used until the user account
     *            expiration limit that you specified when you created the user
     *            pool. To reset the account after that time limit, you must
     *            call <code>AdminCreateUser</code> again, specifying
     *            <code>"RESEND"</code> for the <code>MessageAction</code>
     *            parameter.
     *            </p>
     */
    public void setTemporaryPassword(String temporaryPassword) {
        this.temporaryPassword = temporaryPassword;
    }

    /**
     * <p>
     * The user's temporary password. This password must conform to the password
     * policy that you specified when you created the user pool.
     * </p>
     * <p>
     * The temporary password is valid only once. To complete the Admin Create
     * User flow, the user must enter the temporary password in the sign-in page
     * along with a new password to be used in all future sign-ins.
     * </p>
     * <p>
     * This parameter is not required. If you do not specify a value, Amazon
     * Cognito generates one for you.
     * </p>
     * <p>
     * The temporary password can only be used until the user account expiration
     * limit that you specified when you created the user pool. To reset the
     * account after that time limit, you must call <code>AdminCreateUser</code>
     * again, specifying <code>"RESEND"</code> for the
     * <code>MessageAction</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param temporaryPassword <p>
     *            The user's temporary password. This password must conform to
     *            the password policy that you specified when you created the
     *            user pool.
     *            </p>
     *            <p>
     *            The temporary password is valid only once. To complete the
     *            Admin Create User flow, the user must enter the temporary
     *            password in the sign-in page along with a new password to be
     *            used in all future sign-ins.
     *            </p>
     *            <p>
     *            This parameter is not required. If you do not specify a value,
     *            Amazon Cognito generates one for you.
     *            </p>
     *            <p>
     *            The temporary password can only be used until the user account
     *            expiration limit that you specified when you created the user
     *            pool. To reset the account after that time limit, you must
     *            call <code>AdminCreateUser</code> again, specifying
     *            <code>"RESEND"</code> for the <code>MessageAction</code>
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserRequest withTemporaryPassword(String temporaryPassword) {
        this.temporaryPassword = temporaryPassword;
        return this;
    }

    /**
     * <p>
     * This parameter is only used if the <code>phone_number_verified</code> or
     * <code>email_verified</code> attribute is set to <code>True</code>.
     * Otherwise, it is ignored.
     * </p>
     * <p>
     * If this parameter is set to <code>True</code> and the phone number or
     * email address specified in the UserAttributes parameter already exists as
     * an alias with a different user, the API call will migrate the alias from
     * the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     * </p>
     * <p>
     * If this parameter is set to <code>False</code>, the API throws an
     * <code>AliasExistsException</code> error if the alias already exists. The
     * default value is <code>False</code>.
     * </p>
     *
     * @return <p>
     *         This parameter is only used if the
     *         <code>phone_number_verified</code> or <code>email_verified</code>
     *         attribute is set to <code>True</code>. Otherwise, it is ignored.
     *         </p>
     *         <p>
     *         If this parameter is set to <code>True</code> and the phone
     *         number or email address specified in the UserAttributes parameter
     *         already exists as an alias with a different user, the API call
     *         will migrate the alias from the previous user to the newly
     *         created user. The previous user will no longer be able to log in
     *         using that alias.
     *         </p>
     *         <p>
     *         If this parameter is set to <code>False</code>, the API throws an
     *         <code>AliasExistsException</code> error if the alias already
     *         exists. The default value is <code>False</code>.
     *         </p>
     */
    public Boolean isForceAliasCreation() {
        return forceAliasCreation;
    }

    /**
     * <p>
     * This parameter is only used if the <code>phone_number_verified</code> or
     * <code>email_verified</code> attribute is set to <code>True</code>.
     * Otherwise, it is ignored.
     * </p>
     * <p>
     * If this parameter is set to <code>True</code> and the phone number or
     * email address specified in the UserAttributes parameter already exists as
     * an alias with a different user, the API call will migrate the alias from
     * the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     * </p>
     * <p>
     * If this parameter is set to <code>False</code>, the API throws an
     * <code>AliasExistsException</code> error if the alias already exists. The
     * default value is <code>False</code>.
     * </p>
     *
     * @return <p>
     *         This parameter is only used if the
     *         <code>phone_number_verified</code> or <code>email_verified</code>
     *         attribute is set to <code>True</code>. Otherwise, it is ignored.
     *         </p>
     *         <p>
     *         If this parameter is set to <code>True</code> and the phone
     *         number or email address specified in the UserAttributes parameter
     *         already exists as an alias with a different user, the API call
     *         will migrate the alias from the previous user to the newly
     *         created user. The previous user will no longer be able to log in
     *         using that alias.
     *         </p>
     *         <p>
     *         If this parameter is set to <code>False</code>, the API throws an
     *         <code>AliasExistsException</code> error if the alias already
     *         exists. The default value is <code>False</code>.
     *         </p>
     */
    public Boolean getForceAliasCreation() {
        return forceAliasCreation;
    }

    /**
     * <p>
     * This parameter is only used if the <code>phone_number_verified</code> or
     * <code>email_verified</code> attribute is set to <code>True</code>.
     * Otherwise, it is ignored.
     * </p>
     * <p>
     * If this parameter is set to <code>True</code> and the phone number or
     * email address specified in the UserAttributes parameter already exists as
     * an alias with a different user, the API call will migrate the alias from
     * the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     * </p>
     * <p>
     * If this parameter is set to <code>False</code>, the API throws an
     * <code>AliasExistsException</code> error if the alias already exists. The
     * default value is <code>False</code>.
     * </p>
     *
     * @param forceAliasCreation <p>
     *            This parameter is only used if the
     *            <code>phone_number_verified</code> or
     *            <code>email_verified</code> attribute is set to
     *            <code>True</code>. Otherwise, it is ignored.
     *            </p>
     *            <p>
     *            If this parameter is set to <code>True</code> and the phone
     *            number or email address specified in the UserAttributes
     *            parameter already exists as an alias with a different user,
     *            the API call will migrate the alias from the previous user to
     *            the newly created user. The previous user will no longer be
     *            able to log in using that alias.
     *            </p>
     *            <p>
     *            If this parameter is set to <code>False</code>, the API throws
     *            an <code>AliasExistsException</code> error if the alias
     *            already exists. The default value is <code>False</code>.
     *            </p>
     */
    public void setForceAliasCreation(Boolean forceAliasCreation) {
        this.forceAliasCreation = forceAliasCreation;
    }

    /**
     * <p>
     * This parameter is only used if the <code>phone_number_verified</code> or
     * <code>email_verified</code> attribute is set to <code>True</code>.
     * Otherwise, it is ignored.
     * </p>
     * <p>
     * If this parameter is set to <code>True</code> and the phone number or
     * email address specified in the UserAttributes parameter already exists as
     * an alias with a different user, the API call will migrate the alias from
     * the previous user to the newly created user. The previous user will no
     * longer be able to log in using that alias.
     * </p>
     * <p>
     * If this parameter is set to <code>False</code>, the API throws an
     * <code>AliasExistsException</code> error if the alias already exists. The
     * default value is <code>False</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param forceAliasCreation <p>
     *            This parameter is only used if the
     *            <code>phone_number_verified</code> or
     *            <code>email_verified</code> attribute is set to
     *            <code>True</code>. Otherwise, it is ignored.
     *            </p>
     *            <p>
     *            If this parameter is set to <code>True</code> and the phone
     *            number or email address specified in the UserAttributes
     *            parameter already exists as an alias with a different user,
     *            the API call will migrate the alias from the previous user to
     *            the newly created user. The previous user will no longer be
     *            able to log in using that alias.
     *            </p>
     *            <p>
     *            If this parameter is set to <code>False</code>, the API throws
     *            an <code>AliasExistsException</code> error if the alias
     *            already exists. The default value is <code>False</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserRequest withForceAliasCreation(Boolean forceAliasCreation) {
        this.forceAliasCreation = forceAliasCreation;
        return this;
    }

    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user
     * that already exists and reset the expiration limit on the user's account.
     * Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESEND, SUPPRESS
     *
     * @return <p>
     *         Set to <code>"RESEND"</code> to resend the invitation message to
     *         a user that already exists and reset the expiration limit on the
     *         user's account. Set to <code>"SUPPRESS"</code> to suppress
     *         sending the message. Only one value can be specified.
     *         </p>
     * @see MessageActionType
     */
    public String getMessageAction() {
        return messageAction;
    }

    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user
     * that already exists and reset the expiration limit on the user's account.
     * Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESEND, SUPPRESS
     *
     * @param messageAction <p>
     *            Set to <code>"RESEND"</code> to resend the invitation message
     *            to a user that already exists and reset the expiration limit
     *            on the user's account. Set to <code>"SUPPRESS"</code> to
     *            suppress sending the message. Only one value can be specified.
     *            </p>
     * @see MessageActionType
     */
    public void setMessageAction(String messageAction) {
        this.messageAction = messageAction;
    }

    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user
     * that already exists and reset the expiration limit on the user's account.
     * Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESEND, SUPPRESS
     *
     * @param messageAction <p>
     *            Set to <code>"RESEND"</code> to resend the invitation message
     *            to a user that already exists and reset the expiration limit
     *            on the user's account. Set to <code>"SUPPRESS"</code> to
     *            suppress sending the message. Only one value can be specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageActionType
     */
    public AdminCreateUserRequest withMessageAction(String messageAction) {
        this.messageAction = messageAction;
        return this;
    }

    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user
     * that already exists and reset the expiration limit on the user's account.
     * Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESEND, SUPPRESS
     *
     * @param messageAction <p>
     *            Set to <code>"RESEND"</code> to resend the invitation message
     *            to a user that already exists and reset the expiration limit
     *            on the user's account. Set to <code>"SUPPRESS"</code> to
     *            suppress sending the message. Only one value can be specified.
     *            </p>
     * @see MessageActionType
     */
    public void setMessageAction(MessageActionType messageAction) {
        this.messageAction = messageAction.toString();
    }

    /**
     * <p>
     * Set to <code>"RESEND"</code> to resend the invitation message to a user
     * that already exists and reset the expiration limit on the user's account.
     * Set to <code>"SUPPRESS"</code> to suppress sending the message. Only one
     * value can be specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>RESEND, SUPPRESS
     *
     * @param messageAction <p>
     *            Set to <code>"RESEND"</code> to resend the invitation message
     *            to a user that already exists and reset the expiration limit
     *            on the user's account. Set to <code>"SUPPRESS"</code> to
     *            suppress sending the message. Only one value can be specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MessageActionType
     */
    public AdminCreateUserRequest withMessageAction(MessageActionType messageAction) {
        this.messageAction = messageAction.toString();
        return this;
    }

    /**
     * <p>
     * Specify <code>"EMAIL"</code> if email will be used to send the welcome
     * message. Specify <code>"SMS"</code> if the phone number will be used. The
     * default value is <code>"SMS"</code>. More than one value can be
     * specified.
     * </p>
     *
     * @return <p>
     *         Specify <code>"EMAIL"</code> if email will be used to send the
     *         welcome message. Specify <code>"SMS"</code> if the phone number
     *         will be used. The default value is <code>"SMS"</code>. More than
     *         one value can be specified.
     *         </p>
     */
    public java.util.List<String> getDesiredDeliveryMediums() {
        return desiredDeliveryMediums;
    }

    /**
     * <p>
     * Specify <code>"EMAIL"</code> if email will be used to send the welcome
     * message. Specify <code>"SMS"</code> if the phone number will be used. The
     * default value is <code>"SMS"</code>. More than one value can be
     * specified.
     * </p>
     *
     * @param desiredDeliveryMediums <p>
     *            Specify <code>"EMAIL"</code> if email will be used to send the
     *            welcome message. Specify <code>"SMS"</code> if the phone
     *            number will be used. The default value is <code>"SMS"</code>.
     *            More than one value can be specified.
     *            </p>
     */
    public void setDesiredDeliveryMediums(java.util.Collection<String> desiredDeliveryMediums) {
        if (desiredDeliveryMediums == null) {
            this.desiredDeliveryMediums = null;
            return;
        }

        this.desiredDeliveryMediums = new java.util.ArrayList<String>(desiredDeliveryMediums);
    }

    /**
     * <p>
     * Specify <code>"EMAIL"</code> if email will be used to send the welcome
     * message. Specify <code>"SMS"</code> if the phone number will be used. The
     * default value is <code>"SMS"</code>. More than one value can be
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredDeliveryMediums <p>
     *            Specify <code>"EMAIL"</code> if email will be used to send the
     *            welcome message. Specify <code>"SMS"</code> if the phone
     *            number will be used. The default value is <code>"SMS"</code>.
     *            More than one value can be specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserRequest withDesiredDeliveryMediums(String... desiredDeliveryMediums) {
        if (getDesiredDeliveryMediums() == null) {
            this.desiredDeliveryMediums = new java.util.ArrayList<String>(
                    desiredDeliveryMediums.length);
        }
        for (String value : desiredDeliveryMediums) {
            this.desiredDeliveryMediums.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specify <code>"EMAIL"</code> if email will be used to send the welcome
     * message. Specify <code>"SMS"</code> if the phone number will be used. The
     * default value is <code>"SMS"</code>. More than one value can be
     * specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param desiredDeliveryMediums <p>
     *            Specify <code>"EMAIL"</code> if email will be used to send the
     *            welcome message. Specify <code>"SMS"</code> if the phone
     *            number will be used. The default value is <code>"SMS"</code>.
     *            More than one value can be specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdminCreateUserRequest withDesiredDeliveryMediums(
            java.util.Collection<String> desiredDeliveryMediums) {
        setDesiredDeliveryMediums(desiredDeliveryMediums);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getUserAttributes() != null)
            sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getValidationData() != null)
            sb.append("ValidationData: " + getValidationData() + ",");
        if (getTemporaryPassword() != null)
            sb.append("TemporaryPassword: " + getTemporaryPassword() + ",");
        if (getForceAliasCreation() != null)
            sb.append("ForceAliasCreation: " + getForceAliasCreation() + ",");
        if (getMessageAction() != null)
            sb.append("MessageAction: " + getMessageAction() + ",");
        if (getDesiredDeliveryMediums() != null)
            sb.append("DesiredDeliveryMediums: " + getDesiredDeliveryMediums());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getValidationData() == null) ? 0 : getValidationData().hashCode());
        hashCode = prime * hashCode
                + ((getTemporaryPassword() == null) ? 0 : getTemporaryPassword().hashCode());
        hashCode = prime * hashCode
                + ((getForceAliasCreation() == null) ? 0 : getForceAliasCreation().hashCode());
        hashCode = prime * hashCode
                + ((getMessageAction() == null) ? 0 : getMessageAction().hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredDeliveryMediums() == null) ? 0 : getDesiredDeliveryMediums()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminCreateUserRequest == false)
            return false;
        AdminCreateUserRequest other = (AdminCreateUserRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null)
            return false;
        if (other.getUserAttributes() != null
                && other.getUserAttributes().equals(this.getUserAttributes()) == false)
            return false;
        if (other.getValidationData() == null ^ this.getValidationData() == null)
            return false;
        if (other.getValidationData() != null
                && other.getValidationData().equals(this.getValidationData()) == false)
            return false;
        if (other.getTemporaryPassword() == null ^ this.getTemporaryPassword() == null)
            return false;
        if (other.getTemporaryPassword() != null
                && other.getTemporaryPassword().equals(this.getTemporaryPassword()) == false)
            return false;
        if (other.getForceAliasCreation() == null ^ this.getForceAliasCreation() == null)
            return false;
        if (other.getForceAliasCreation() != null
                && other.getForceAliasCreation().equals(this.getForceAliasCreation()) == false)
            return false;
        if (other.getMessageAction() == null ^ this.getMessageAction() == null)
            return false;
        if (other.getMessageAction() != null
                && other.getMessageAction().equals(this.getMessageAction()) == false)
            return false;
        if (other.getDesiredDeliveryMediums() == null ^ this.getDesiredDeliveryMediums() == null)
            return false;
        if (other.getDesiredDeliveryMediums() != null
                && other.getDesiredDeliveryMediums().equals(this.getDesiredDeliveryMediums()) == false)
            return false;
        return true;
    }
}
