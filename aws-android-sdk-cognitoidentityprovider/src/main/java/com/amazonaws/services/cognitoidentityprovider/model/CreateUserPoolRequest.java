/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Creates a new Amazon Cognito user pool and sets the password policy for the
 * pool.
 * </p>
 * <note>
 * <p>
 * This action might generate an SMS text message. Starting June 1, 2021, U.S.
 * telecom carriers require that you register an origination phone number before
 * you can send SMS messages to U.S. phone numbers. If you use SMS text messages
 * in Amazon Cognito, you must register a phone number with <a
 * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
 * Cognito will use the the registered number automatically. Otherwise, Cognito
 * users that must receive SMS messages might be unable to sign up, activate
 * their accounts, or sign in.
 * </p>
 * <p>
 * If you have never used SMS text messages with Amazon Cognito or any other
 * Amazon Web Service, Amazon SNS might place your account in SMS sandbox. In
 * <i> <a href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">
 * sandbox mode</a> </i>, you’ll have limitations, such as sending messages to
 * only verified phone numbers. After testing in the sandbox environment, you
 * can move out of the SMS sandbox and into production. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
 * > SMS message settings for Cognito User Pools</a> in the <i>Amazon Cognito
 * Developer Guide</i>.
 * </p>
 * </note>
 */
public class CreateUserPoolRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A string used to name the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String poolName;

    /**
     * <p>
     * The policies associated with the new user pool.
     * </p>
     */
    private UserPoolPolicyType policies;

    /**
     * <p>
     * The Lambda trigger configuration information for the new user pool.
     * </p>
     * <note>
     * <p>
     * In a push model, event sources (such as Amazon S3 and custom
     * applications) need permission to invoke a function. So you will need to
     * make an extra call to add permission for these event sources to invoke
     * your Lambda function.
     * </p>
     * <p/>
     * <p>
     * For more information on using the Lambda API to add permission, see <a
     * href
     * ="https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html">
     * AddPermission </a>.
     * </p>
     * <p>
     * For adding permission using the CLI, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"
     * > add-permission </a>.
     * </p>
     * </note>
     */
    private LambdaConfigType lambdaConfig;

    /**
     * <p>
     * The attributes to be auto-verified. Possible values: <b>email</b>,
     * <b>phone_number</b>.
     * </p>
     */
    private java.util.List<String> autoVerifiedAttributes;

    /**
     * <p>
     * Attributes supported as an alias for this user pool. Possible values:
     * <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     * </p>
     */
    private java.util.List<String> aliasAttributes;

    /**
     * <p>
     * Specifies whether email addresses or phone numbers can be specified as
     * usernames when a user signs up.
     * </p>
     */
    private java.util.List<String> usernameAttributes;

    /**
     * <p>
     * A string representing the SMS verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     */
    private String smsVerificationMessage;

    /**
     * <p>
     * A string representing the email verification message.
     * EmailVerificationMessage is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     */
    private String emailVerificationMessage;

    /**
     * <p>
     * A string representing the email verification subject.
     * EmailVerificationSubject is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     */
    private String emailVerificationSubject;

    /**
     * <p>
     * The template for the verification message that the user sees when the app
     * requests permission to access the user's information.
     * </p>
     */
    private VerificationMessageTemplateType verificationMessageTemplate;

    /**
     * <p>
     * A string representing the SMS authentication message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     */
    private String smsAuthenticationMessage;

    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     */
    private String mfaConfiguration;

    /**
     * <p>
     * The device configuration.
     * </p>
     */
    private DeviceConfigurationType deviceConfiguration;

    /**
     * <p>
     * The email configuration.
     * </p>
     */
    private EmailConfigurationType emailConfiguration;

    /**
     * <p>
     * The SMS configuration.
     * </p>
     */
    private SmsConfigurationType smsConfiguration;

    /**
     * <p>
     * The tag keys and values to assign to the user pool. A tag is a label that
     * you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     * </p>
     */
    private java.util.Map<String, String> userPoolTags;

    /**
     * <p>
     * The configuration for <code>AdminCreateUser</code> requests.
     * </p>
     */
    private AdminCreateUserConfigType adminCreateUserConfig;

    /**
     * <p>
     * An array of schema attributes for the new user pool. These attributes can
     * be standard or custom attributes.
     * </p>
     */
    private java.util.List<SchemaAttributeType> schema;

    /**
     * <p>
     * Used to enable advanced security risk detection. Set the key
     * <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     */
    private UserPoolAddOnsType userPoolAddOns;

    /**
     * <p>
     * You can choose to set case sensitivity on the username input for the
     * selected sign-in option. For example, when this is set to
     * <code>False</code>, users will be able to sign in using either "username"
     * or "Username". This configuration is immutable once it has been set. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UsernameConfigurationType.html"
     * >UsernameConfigurationType</a>.
     * </p>
     */
    private UsernameConfigurationType usernameConfiguration;

    /**
     * <p>
     * Use this setting to define which verified available method a user can use
     * to recover their password when they call <code>ForgotPassword</code>. It
     * allows you to define a preferred method when a user has more than one
     * method available. With this setting, SMS does not qualify for a valid
     * password recovery mechanism if the user also has SMS MFA enabled. In the
     * absence of this setting, Cognito uses the legacy behavior to determine
     * the recovery method where SMS is preferred over email.
     * </p>
     */
    private AccountRecoverySettingType accountRecoverySetting;

    /**
     * <p>
     * A string used to name the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return <p>
     *         A string used to name the user pool.
     *         </p>
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * <p>
     * A string used to name the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param poolName <p>
     *            A string used to name the user pool.
     *            </p>
     */
    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    /**
     * <p>
     * A string used to name the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param poolName <p>
     *            A string used to name the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * <p>
     * The policies associated with the new user pool.
     * </p>
     *
     * @return <p>
     *         The policies associated with the new user pool.
     *         </p>
     */
    public UserPoolPolicyType getPolicies() {
        return policies;
    }

    /**
     * <p>
     * The policies associated with the new user pool.
     * </p>
     *
     * @param policies <p>
     *            The policies associated with the new user pool.
     *            </p>
     */
    public void setPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * The policies associated with the new user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            The policies associated with the new user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
        return this;
    }

    /**
     * <p>
     * The Lambda trigger configuration information for the new user pool.
     * </p>
     * <note>
     * <p>
     * In a push model, event sources (such as Amazon S3 and custom
     * applications) need permission to invoke a function. So you will need to
     * make an extra call to add permission for these event sources to invoke
     * your Lambda function.
     * </p>
     * <p/>
     * <p>
     * For more information on using the Lambda API to add permission, see <a
     * href
     * ="https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html">
     * AddPermission </a>.
     * </p>
     * <p>
     * For adding permission using the CLI, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"
     * > add-permission </a>.
     * </p>
     * </note>
     *
     * @return <p>
     *         The Lambda trigger configuration information for the new user
     *         pool.
     *         </p>
     *         <note>
     *         <p>
     *         In a push model, event sources (such as Amazon S3 and custom
     *         applications) need permission to invoke a function. So you will
     *         need to make an extra call to add permission for these event
     *         sources to invoke your Lambda function.
     *         </p>
     *         <p/>
     *         <p>
     *         For more information on using the Lambda API to add permission,
     *         see <a href=
     *         "https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html"
     *         > AddPermission </a>.
     *         </p>
     *         <p>
     *         For adding permission using the CLI, see <a href=
     *         "https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"
     *         > add-permission </a>.
     *         </p>
     *         </note>
     */
    public LambdaConfigType getLambdaConfig() {
        return lambdaConfig;
    }

    /**
     * <p>
     * The Lambda trigger configuration information for the new user pool.
     * </p>
     * <note>
     * <p>
     * In a push model, event sources (such as Amazon S3 and custom
     * applications) need permission to invoke a function. So you will need to
     * make an extra call to add permission for these event sources to invoke
     * your Lambda function.
     * </p>
     * <p/>
     * <p>
     * For more information on using the Lambda API to add permission, see <a
     * href
     * ="https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html">
     * AddPermission </a>.
     * </p>
     * <p>
     * For adding permission using the CLI, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"
     * > add-permission </a>.
     * </p>
     * </note>
     *
     * @param lambdaConfig <p>
     *            The Lambda trigger configuration information for the new user
     *            pool.
     *            </p>
     *            <note>
     *            <p>
     *            In a push model, event sources (such as Amazon S3 and custom
     *            applications) need permission to invoke a function. So you
     *            will need to make an extra call to add permission for these
     *            event sources to invoke your Lambda function.
     *            </p>
     *            <p/>
     *            <p>
     *            For more information on using the Lambda API to add
     *            permission, see <a href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html"
     *            > AddPermission </a>.
     *            </p>
     *            <p>
     *            For adding permission using the CLI, see <a href=
     *            "https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"
     *            > add-permission </a>.
     *            </p>
     *            </note>
     */
    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * The Lambda trigger configuration information for the new user pool.
     * </p>
     * <note>
     * <p>
     * In a push model, event sources (such as Amazon S3 and custom
     * applications) need permission to invoke a function. So you will need to
     * make an extra call to add permission for these event sources to invoke
     * your Lambda function.
     * </p>
     * <p/>
     * <p>
     * For more information on using the Lambda API to add permission, see <a
     * href
     * ="https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html">
     * AddPermission </a>.
     * </p>
     * <p>
     * For adding permission using the CLI, see <a href=
     * "https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"
     * > add-permission </a>.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaConfig <p>
     *            The Lambda trigger configuration information for the new user
     *            pool.
     *            </p>
     *            <note>
     *            <p>
     *            In a push model, event sources (such as Amazon S3 and custom
     *            applications) need permission to invoke a function. So you
     *            will need to make an extra call to add permission for these
     *            event sources to invoke your Lambda function.
     *            </p>
     *            <p/>
     *            <p>
     *            For more information on using the Lambda API to add
     *            permission, see <a href=
     *            "https://docs.aws.amazon.com/lambda/latest/dg/API_AddPermission.html"
     *            > AddPermission </a>.
     *            </p>
     *            <p>
     *            For adding permission using the CLI, see <a href=
     *            "https://docs.aws.amazon.com/cli/latest/reference/lambda/add-permission.html"
     *            > add-permission </a>.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
        return this;
    }

    /**
     * <p>
     * The attributes to be auto-verified. Possible values: <b>email</b>,
     * <b>phone_number</b>.
     * </p>
     *
     * @return <p>
     *         The attributes to be auto-verified. Possible values:
     *         <b>email</b>, <b>phone_number</b>.
     *         </p>
     */
    public java.util.List<String> getAutoVerifiedAttributes() {
        return autoVerifiedAttributes;
    }

    /**
     * <p>
     * The attributes to be auto-verified. Possible values: <b>email</b>,
     * <b>phone_number</b>.
     * </p>
     *
     * @param autoVerifiedAttributes <p>
     *            The attributes to be auto-verified. Possible values:
     *            <b>email</b>, <b>phone_number</b>.
     *            </p>
     */
    public void setAutoVerifiedAttributes(java.util.Collection<String> autoVerifiedAttributes) {
        if (autoVerifiedAttributes == null) {
            this.autoVerifiedAttributes = null;
            return;
        }

        this.autoVerifiedAttributes = new java.util.ArrayList<String>(autoVerifiedAttributes);
    }

    /**
     * <p>
     * The attributes to be auto-verified. Possible values: <b>email</b>,
     * <b>phone_number</b>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoVerifiedAttributes <p>
     *            The attributes to be auto-verified. Possible values:
     *            <b>email</b>, <b>phone_number</b>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withAutoVerifiedAttributes(String... autoVerifiedAttributes) {
        if (getAutoVerifiedAttributes() == null) {
            this.autoVerifiedAttributes = new java.util.ArrayList<String>(
                    autoVerifiedAttributes.length);
        }
        for (String value : autoVerifiedAttributes) {
            this.autoVerifiedAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The attributes to be auto-verified. Possible values: <b>email</b>,
     * <b>phone_number</b>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoVerifiedAttributes <p>
     *            The attributes to be auto-verified. Possible values:
     *            <b>email</b>, <b>phone_number</b>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withAutoVerifiedAttributes(
            java.util.Collection<String> autoVerifiedAttributes) {
        setAutoVerifiedAttributes(autoVerifiedAttributes);
        return this;
    }

    /**
     * <p>
     * Attributes supported as an alias for this user pool. Possible values:
     * <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     * </p>
     *
     * @return <p>
     *         Attributes supported as an alias for this user pool. Possible
     *         values: <b>phone_number</b>, <b>email</b>, or
     *         <b>preferred_username</b>.
     *         </p>
     */
    public java.util.List<String> getAliasAttributes() {
        return aliasAttributes;
    }

    /**
     * <p>
     * Attributes supported as an alias for this user pool. Possible values:
     * <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     * </p>
     *
     * @param aliasAttributes <p>
     *            Attributes supported as an alias for this user pool. Possible
     *            values: <b>phone_number</b>, <b>email</b>, or
     *            <b>preferred_username</b>.
     *            </p>
     */
    public void setAliasAttributes(java.util.Collection<String> aliasAttributes) {
        if (aliasAttributes == null) {
            this.aliasAttributes = null;
            return;
        }

        this.aliasAttributes = new java.util.ArrayList<String>(aliasAttributes);
    }

    /**
     * <p>
     * Attributes supported as an alias for this user pool. Possible values:
     * <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aliasAttributes <p>
     *            Attributes supported as an alias for this user pool. Possible
     *            values: <b>phone_number</b>, <b>email</b>, or
     *            <b>preferred_username</b>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withAliasAttributes(String... aliasAttributes) {
        if (getAliasAttributes() == null) {
            this.aliasAttributes = new java.util.ArrayList<String>(aliasAttributes.length);
        }
        for (String value : aliasAttributes) {
            this.aliasAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Attributes supported as an alias for this user pool. Possible values:
     * <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aliasAttributes <p>
     *            Attributes supported as an alias for this user pool. Possible
     *            values: <b>phone_number</b>, <b>email</b>, or
     *            <b>preferred_username</b>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withAliasAttributes(java.util.Collection<String> aliasAttributes) {
        setAliasAttributes(aliasAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies whether email addresses or phone numbers can be specified as
     * usernames when a user signs up.
     * </p>
     *
     * @return <p>
     *         Specifies whether email addresses or phone numbers can be
     *         specified as usernames when a user signs up.
     *         </p>
     */
    public java.util.List<String> getUsernameAttributes() {
        return usernameAttributes;
    }

    /**
     * <p>
     * Specifies whether email addresses or phone numbers can be specified as
     * usernames when a user signs up.
     * </p>
     *
     * @param usernameAttributes <p>
     *            Specifies whether email addresses or phone numbers can be
     *            specified as usernames when a user signs up.
     *            </p>
     */
    public void setUsernameAttributes(java.util.Collection<String> usernameAttributes) {
        if (usernameAttributes == null) {
            this.usernameAttributes = null;
            return;
        }

        this.usernameAttributes = new java.util.ArrayList<String>(usernameAttributes);
    }

    /**
     * <p>
     * Specifies whether email addresses or phone numbers can be specified as
     * usernames when a user signs up.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usernameAttributes <p>
     *            Specifies whether email addresses or phone numbers can be
     *            specified as usernames when a user signs up.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withUsernameAttributes(String... usernameAttributes) {
        if (getUsernameAttributes() == null) {
            this.usernameAttributes = new java.util.ArrayList<String>(usernameAttributes.length);
        }
        for (String value : usernameAttributes) {
            this.usernameAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies whether email addresses or phone numbers can be specified as
     * usernames when a user signs up.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usernameAttributes <p>
     *            Specifies whether email addresses or phone numbers can be
     *            specified as usernames when a user signs up.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withUsernameAttributes(
            java.util.Collection<String> usernameAttributes) {
        setUsernameAttributes(usernameAttributes);
        return this;
    }

    /**
     * <p>
     * A string representing the SMS verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return <p>
     *         A string representing the SMS verification message.
     *         </p>
     */
    public String getSmsVerificationMessage() {
        return smsVerificationMessage;
    }

    /**
     * <p>
     * A string representing the SMS verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsVerificationMessage <p>
     *            A string representing the SMS verification message.
     *            </p>
     */
    public void setSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }

    /**
     * <p>
     * A string representing the SMS verification message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsVerificationMessage <p>
     *            A string representing the SMS verification message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
        return this;
    }

    /**
     * <p>
     * A string representing the email verification message.
     * EmailVerificationMessage is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     *
     * @return <p>
     *         A string representing the email verification message.
     *         EmailVerificationMessage is allowed only if <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *         >EmailSendingAccount</a> is DEVELOPER.
     *         </p>
     */
    public String getEmailVerificationMessage() {
        return emailVerificationMessage;
    }

    /**
     * <p>
     * A string representing the email verification message.
     * EmailVerificationMessage is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     *
     * @param emailVerificationMessage <p>
     *            A string representing the email verification message.
     *            EmailVerificationMessage is allowed only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            >EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     */
    public void setEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
    }

    /**
     * <p>
     * A string representing the email verification message.
     * EmailVerificationMessage is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     *
     * @param emailVerificationMessage <p>
     *            A string representing the email verification message.
     *            EmailVerificationMessage is allowed only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            >EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
        return this;
    }

    /**
     * <p>
     * A string representing the email verification subject.
     * EmailVerificationSubject is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @return <p>
     *         A string representing the email verification subject.
     *         EmailVerificationSubject is allowed only if <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *         >EmailSendingAccount</a> is DEVELOPER.
     *         </p>
     */
    public String getEmailVerificationSubject() {
        return emailVerificationSubject;
    }

    /**
     * <p>
     * A string representing the email verification subject.
     * EmailVerificationSubject is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailVerificationSubject <p>
     *            A string representing the email verification subject.
     *            EmailVerificationSubject is allowed only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            >EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     */
    public void setEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }

    /**
     * <p>
     * A string representing the email verification subject.
     * EmailVerificationSubject is allowed only if <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     * >EmailSendingAccount</a> is DEVELOPER.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailVerificationSubject <p>
     *            A string representing the email verification subject.
     *            EmailVerificationSubject is allowed only if <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount"
     *            >EmailSendingAccount</a> is DEVELOPER.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
        return this;
    }

    /**
     * <p>
     * The template for the verification message that the user sees when the app
     * requests permission to access the user's information.
     * </p>
     *
     * @return <p>
     *         The template for the verification message that the user sees when
     *         the app requests permission to access the user's information.
     *         </p>
     */
    public VerificationMessageTemplateType getVerificationMessageTemplate() {
        return verificationMessageTemplate;
    }

    /**
     * <p>
     * The template for the verification message that the user sees when the app
     * requests permission to access the user's information.
     * </p>
     *
     * @param verificationMessageTemplate <p>
     *            The template for the verification message that the user sees
     *            when the app requests permission to access the user's
     *            information.
     *            </p>
     */
    public void setVerificationMessageTemplate(
            VerificationMessageTemplateType verificationMessageTemplate) {
        this.verificationMessageTemplate = verificationMessageTemplate;
    }

    /**
     * <p>
     * The template for the verification message that the user sees when the app
     * requests permission to access the user's information.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param verificationMessageTemplate <p>
     *            The template for the verification message that the user sees
     *            when the app requests permission to access the user's
     *            information.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withVerificationMessageTemplate(
            VerificationMessageTemplateType verificationMessageTemplate) {
        this.verificationMessageTemplate = verificationMessageTemplate;
        return this;
    }

    /**
     * <p>
     * A string representing the SMS authentication message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return <p>
     *         A string representing the SMS authentication message.
     *         </p>
     */
    public String getSmsAuthenticationMessage() {
        return smsAuthenticationMessage;
    }

    /**
     * <p>
     * A string representing the SMS authentication message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsAuthenticationMessage <p>
     *            A string representing the SMS authentication message.
     *            </p>
     */
    public void setSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
    }

    /**
     * <p>
     * A string representing the SMS authentication message.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsAuthenticationMessage <p>
     *            A string representing the SMS authentication message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
        return this;
    }

    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @return <p>
     *         Specifies MFA configuration details.
     *         </p>
     * @see UserPoolMfaType
     */
    public String getMfaConfiguration() {
        return mfaConfiguration;
    }

    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            Specifies MFA configuration details.
     *            </p>
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            Specifies MFA configuration details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserPoolMfaType
     */
    public CreateUserPoolRequest withMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
        return this;
    }

    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            Specifies MFA configuration details.
     *            </p>
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
    }

    /**
     * <p>
     * Specifies MFA configuration details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            Specifies MFA configuration details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserPoolMfaType
     */
    public CreateUserPoolRequest withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
        return this;
    }

    /**
     * <p>
     * The device configuration.
     * </p>
     *
     * @return <p>
     *         The device configuration.
     *         </p>
     */
    public DeviceConfigurationType getDeviceConfiguration() {
        return deviceConfiguration;
    }

    /**
     * <p>
     * The device configuration.
     * </p>
     *
     * @param deviceConfiguration <p>
     *            The device configuration.
     *            </p>
     */
    public void setDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
    }

    /**
     * <p>
     * The device configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceConfiguration <p>
     *            The device configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
        return this;
    }

    /**
     * <p>
     * The email configuration.
     * </p>
     *
     * @return <p>
     *         The email configuration.
     *         </p>
     */
    public EmailConfigurationType getEmailConfiguration() {
        return emailConfiguration;
    }

    /**
     * <p>
     * The email configuration.
     * </p>
     *
     * @param emailConfiguration <p>
     *            The email configuration.
     *            </p>
     */
    public void setEmailConfiguration(EmailConfigurationType emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
    }

    /**
     * <p>
     * The email configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailConfiguration <p>
     *            The email configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withEmailConfiguration(EmailConfigurationType emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
        return this;
    }

    /**
     * <p>
     * The SMS configuration.
     * </p>
     *
     * @return <p>
     *         The SMS configuration.
     *         </p>
     */
    public SmsConfigurationType getSmsConfiguration() {
        return smsConfiguration;
    }

    /**
     * <p>
     * The SMS configuration.
     * </p>
     *
     * @param smsConfiguration <p>
     *            The SMS configuration.
     *            </p>
     */
    public void setSmsConfiguration(SmsConfigurationType smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
    }

    /**
     * <p>
     * The SMS configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smsConfiguration <p>
     *            The SMS configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withSmsConfiguration(SmsConfigurationType smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
        return this;
    }

    /**
     * <p>
     * The tag keys and values to assign to the user pool. A tag is a label that
     * you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     * </p>
     *
     * @return <p>
     *         The tag keys and values to assign to the user pool. A tag is a
     *         label that you can use to categorize and manage user pools in
     *         different ways, such as by purpose, owner, environment, or other
     *         criteria.
     *         </p>
     */
    public java.util.Map<String, String> getUserPoolTags() {
        return userPoolTags;
    }

    /**
     * <p>
     * The tag keys and values to assign to the user pool. A tag is a label that
     * you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     * </p>
     *
     * @param userPoolTags <p>
     *            The tag keys and values to assign to the user pool. A tag is a
     *            label that you can use to categorize and manage user pools in
     *            different ways, such as by purpose, owner, environment, or
     *            other criteria.
     *            </p>
     */
    public void setUserPoolTags(java.util.Map<String, String> userPoolTags) {
        this.userPoolTags = userPoolTags;
    }

    /**
     * <p>
     * The tag keys and values to assign to the user pool. A tag is a label that
     * you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPoolTags <p>
     *            The tag keys and values to assign to the user pool. A tag is a
     *            label that you can use to categorize and manage user pools in
     *            different ways, such as by purpose, owner, environment, or
     *            other criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withUserPoolTags(java.util.Map<String, String> userPoolTags) {
        this.userPoolTags = userPoolTags;
        return this;
    }

    /**
     * <p>
     * The tag keys and values to assign to the user pool. A tag is a label that
     * you can use to categorize and manage user pools in different ways, such
     * as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * The method adds a new key-value pair into UserPoolTags parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into UserPoolTags.
     * @param value The corresponding value of the entry to be added into
     *            UserPoolTags.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest addUserPoolTagsEntry(String key, String value) {
        if (null == this.userPoolTags) {
            this.userPoolTags = new java.util.HashMap<String, String>();
        }
        if (this.userPoolTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.userPoolTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into UserPoolTags.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public CreateUserPoolRequest clearUserPoolTagsEntries() {
        this.userPoolTags = null;
        return this;
    }

    /**
     * <p>
     * The configuration for <code>AdminCreateUser</code> requests.
     * </p>
     *
     * @return <p>
     *         The configuration for <code>AdminCreateUser</code> requests.
     *         </p>
     */
    public AdminCreateUserConfigType getAdminCreateUserConfig() {
        return adminCreateUserConfig;
    }

    /**
     * <p>
     * The configuration for <code>AdminCreateUser</code> requests.
     * </p>
     *
     * @param adminCreateUserConfig <p>
     *            The configuration for <code>AdminCreateUser</code> requests.
     *            </p>
     */
    public void setAdminCreateUserConfig(AdminCreateUserConfigType adminCreateUserConfig) {
        this.adminCreateUserConfig = adminCreateUserConfig;
    }

    /**
     * <p>
     * The configuration for <code>AdminCreateUser</code> requests.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminCreateUserConfig <p>
     *            The configuration for <code>AdminCreateUser</code> requests.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withAdminCreateUserConfig(
            AdminCreateUserConfigType adminCreateUserConfig) {
        this.adminCreateUserConfig = adminCreateUserConfig;
        return this;
    }

    /**
     * <p>
     * An array of schema attributes for the new user pool. These attributes can
     * be standard or custom attributes.
     * </p>
     *
     * @return <p>
     *         An array of schema attributes for the new user pool. These
     *         attributes can be standard or custom attributes.
     *         </p>
     */
    public java.util.List<SchemaAttributeType> getSchema() {
        return schema;
    }

    /**
     * <p>
     * An array of schema attributes for the new user pool. These attributes can
     * be standard or custom attributes.
     * </p>
     *
     * @param schema <p>
     *            An array of schema attributes for the new user pool. These
     *            attributes can be standard or custom attributes.
     *            </p>
     */
    public void setSchema(java.util.Collection<SchemaAttributeType> schema) {
        if (schema == null) {
            this.schema = null;
            return;
        }

        this.schema = new java.util.ArrayList<SchemaAttributeType>(schema);
    }

    /**
     * <p>
     * An array of schema attributes for the new user pool. These attributes can
     * be standard or custom attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schema <p>
     *            An array of schema attributes for the new user pool. These
     *            attributes can be standard or custom attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withSchema(SchemaAttributeType... schema) {
        if (getSchema() == null) {
            this.schema = new java.util.ArrayList<SchemaAttributeType>(schema.length);
        }
        for (SchemaAttributeType value : schema) {
            this.schema.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of schema attributes for the new user pool. These attributes can
     * be standard or custom attributes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schema <p>
     *            An array of schema attributes for the new user pool. These
     *            attributes can be standard or custom attributes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withSchema(java.util.Collection<SchemaAttributeType> schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * Used to enable advanced security risk detection. Set the key
     * <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     *
     * @return <p>
     *         Used to enable advanced security risk detection. Set the key
     *         <code>AdvancedSecurityMode</code> to the value "AUDIT".
     *         </p>
     */
    public UserPoolAddOnsType getUserPoolAddOns() {
        return userPoolAddOns;
    }

    /**
     * <p>
     * Used to enable advanced security risk detection. Set the key
     * <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     *
     * @param userPoolAddOns <p>
     *            Used to enable advanced security risk detection. Set the key
     *            <code>AdvancedSecurityMode</code> to the value "AUDIT".
     *            </p>
     */
    public void setUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        this.userPoolAddOns = userPoolAddOns;
    }

    /**
     * <p>
     * Used to enable advanced security risk detection. Set the key
     * <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPoolAddOns <p>
     *            Used to enable advanced security risk detection. Set the key
     *            <code>AdvancedSecurityMode</code> to the value "AUDIT".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        this.userPoolAddOns = userPoolAddOns;
        return this;
    }

    /**
     * <p>
     * You can choose to set case sensitivity on the username input for the
     * selected sign-in option. For example, when this is set to
     * <code>False</code>, users will be able to sign in using either "username"
     * or "Username". This configuration is immutable once it has been set. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UsernameConfigurationType.html"
     * >UsernameConfigurationType</a>.
     * </p>
     *
     * @return <p>
     *         You can choose to set case sensitivity on the username input for
     *         the selected sign-in option. For example, when this is set to
     *         <code>False</code>, users will be able to sign in using either
     *         "username" or "Username". This configuration is immutable once it
     *         has been set. For more information, see <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UsernameConfigurationType.html"
     *         >UsernameConfigurationType</a>.
     *         </p>
     */
    public UsernameConfigurationType getUsernameConfiguration() {
        return usernameConfiguration;
    }

    /**
     * <p>
     * You can choose to set case sensitivity on the username input for the
     * selected sign-in option. For example, when this is set to
     * <code>False</code>, users will be able to sign in using either "username"
     * or "Username". This configuration is immutable once it has been set. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UsernameConfigurationType.html"
     * >UsernameConfigurationType</a>.
     * </p>
     *
     * @param usernameConfiguration <p>
     *            You can choose to set case sensitivity on the username input
     *            for the selected sign-in option. For example, when this is set
     *            to <code>False</code>, users will be able to sign in using
     *            either "username" or "Username". This configuration is
     *            immutable once it has been set. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UsernameConfigurationType.html"
     *            >UsernameConfigurationType</a>.
     *            </p>
     */
    public void setUsernameConfiguration(UsernameConfigurationType usernameConfiguration) {
        this.usernameConfiguration = usernameConfiguration;
    }

    /**
     * <p>
     * You can choose to set case sensitivity on the username input for the
     * selected sign-in option. For example, when this is set to
     * <code>False</code>, users will be able to sign in using either "username"
     * or "Username". This configuration is immutable once it has been set. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UsernameConfigurationType.html"
     * >UsernameConfigurationType</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param usernameConfiguration <p>
     *            You can choose to set case sensitivity on the username input
     *            for the selected sign-in option. For example, when this is set
     *            to <code>False</code>, users will be able to sign in using
     *            either "username" or "Username". This configuration is
     *            immutable once it has been set. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UsernameConfigurationType.html"
     *            >UsernameConfigurationType</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withUsernameConfiguration(
            UsernameConfigurationType usernameConfiguration) {
        this.usernameConfiguration = usernameConfiguration;
        return this;
    }

    /**
     * <p>
     * Use this setting to define which verified available method a user can use
     * to recover their password when they call <code>ForgotPassword</code>. It
     * allows you to define a preferred method when a user has more than one
     * method available. With this setting, SMS does not qualify for a valid
     * password recovery mechanism if the user also has SMS MFA enabled. In the
     * absence of this setting, Cognito uses the legacy behavior to determine
     * the recovery method where SMS is preferred over email.
     * </p>
     *
     * @return <p>
     *         Use this setting to define which verified available method a user
     *         can use to recover their password when they call
     *         <code>ForgotPassword</code>. It allows you to define a preferred
     *         method when a user has more than one method available. With this
     *         setting, SMS does not qualify for a valid password recovery
     *         mechanism if the user also has SMS MFA enabled. In the absence of
     *         this setting, Cognito uses the legacy behavior to determine the
     *         recovery method where SMS is preferred over email.
     *         </p>
     */
    public AccountRecoverySettingType getAccountRecoverySetting() {
        return accountRecoverySetting;
    }

    /**
     * <p>
     * Use this setting to define which verified available method a user can use
     * to recover their password when they call <code>ForgotPassword</code>. It
     * allows you to define a preferred method when a user has more than one
     * method available. With this setting, SMS does not qualify for a valid
     * password recovery mechanism if the user also has SMS MFA enabled. In the
     * absence of this setting, Cognito uses the legacy behavior to determine
     * the recovery method where SMS is preferred over email.
     * </p>
     *
     * @param accountRecoverySetting <p>
     *            Use this setting to define which verified available method a
     *            user can use to recover their password when they call
     *            <code>ForgotPassword</code>. It allows you to define a
     *            preferred method when a user has more than one method
     *            available. With this setting, SMS does not qualify for a valid
     *            password recovery mechanism if the user also has SMS MFA
     *            enabled. In the absence of this setting, Cognito uses the
     *            legacy behavior to determine the recovery method where SMS is
     *            preferred over email.
     *            </p>
     */
    public void setAccountRecoverySetting(AccountRecoverySettingType accountRecoverySetting) {
        this.accountRecoverySetting = accountRecoverySetting;
    }

    /**
     * <p>
     * Use this setting to define which verified available method a user can use
     * to recover their password when they call <code>ForgotPassword</code>. It
     * allows you to define a preferred method when a user has more than one
     * method available. With this setting, SMS does not qualify for a valid
     * password recovery mechanism if the user also has SMS MFA enabled. In the
     * absence of this setting, Cognito uses the legacy behavior to determine
     * the recovery method where SMS is preferred over email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountRecoverySetting <p>
     *            Use this setting to define which verified available method a
     *            user can use to recover their password when they call
     *            <code>ForgotPassword</code>. It allows you to define a
     *            preferred method when a user has more than one method
     *            available. With this setting, SMS does not qualify for a valid
     *            password recovery mechanism if the user also has SMS MFA
     *            enabled. In the absence of this setting, Cognito uses the
     *            legacy behavior to determine the recovery method where SMS is
     *            preferred over email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateUserPoolRequest withAccountRecoverySetting(
            AccountRecoverySettingType accountRecoverySetting) {
        this.accountRecoverySetting = accountRecoverySetting;
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
        if (getPoolName() != null)
            sb.append("PoolName: " + getPoolName() + ",");
        if (getPolicies() != null)
            sb.append("Policies: " + getPolicies() + ",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: " + getLambdaConfig() + ",");
        if (getAutoVerifiedAttributes() != null)
            sb.append("AutoVerifiedAttributes: " + getAutoVerifiedAttributes() + ",");
        if (getAliasAttributes() != null)
            sb.append("AliasAttributes: " + getAliasAttributes() + ",");
        if (getUsernameAttributes() != null)
            sb.append("UsernameAttributes: " + getUsernameAttributes() + ",");
        if (getSmsVerificationMessage() != null)
            sb.append("SmsVerificationMessage: " + getSmsVerificationMessage() + ",");
        if (getEmailVerificationMessage() != null)
            sb.append("EmailVerificationMessage: " + getEmailVerificationMessage() + ",");
        if (getEmailVerificationSubject() != null)
            sb.append("EmailVerificationSubject: " + getEmailVerificationSubject() + ",");
        if (getVerificationMessageTemplate() != null)
            sb.append("VerificationMessageTemplate: " + getVerificationMessageTemplate() + ",");
        if (getSmsAuthenticationMessage() != null)
            sb.append("SmsAuthenticationMessage: " + getSmsAuthenticationMessage() + ",");
        if (getMfaConfiguration() != null)
            sb.append("MfaConfiguration: " + getMfaConfiguration() + ",");
        if (getDeviceConfiguration() != null)
            sb.append("DeviceConfiguration: " + getDeviceConfiguration() + ",");
        if (getEmailConfiguration() != null)
            sb.append("EmailConfiguration: " + getEmailConfiguration() + ",");
        if (getSmsConfiguration() != null)
            sb.append("SmsConfiguration: " + getSmsConfiguration() + ",");
        if (getUserPoolTags() != null)
            sb.append("UserPoolTags: " + getUserPoolTags() + ",");
        if (getAdminCreateUserConfig() != null)
            sb.append("AdminCreateUserConfig: " + getAdminCreateUserConfig() + ",");
        if (getSchema() != null)
            sb.append("Schema: " + getSchema() + ",");
        if (getUserPoolAddOns() != null)
            sb.append("UserPoolAddOns: " + getUserPoolAddOns() + ",");
        if (getUsernameConfiguration() != null)
            sb.append("UsernameConfiguration: " + getUsernameConfiguration() + ",");
        if (getAccountRecoverySetting() != null)
            sb.append("AccountRecoverySetting: " + getAccountRecoverySetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolName() == null) ? 0 : getPoolName().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode
                + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoVerifiedAttributes() == null) ? 0 : getAutoVerifiedAttributes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getAliasAttributes() == null) ? 0 : getAliasAttributes().hashCode());
        hashCode = prime * hashCode
                + ((getUsernameAttributes() == null) ? 0 : getUsernameAttributes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSmsVerificationMessage() == null) ? 0 : getSmsVerificationMessage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEmailVerificationMessage() == null) ? 0 : getEmailVerificationMessage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEmailVerificationSubject() == null) ? 0 : getEmailVerificationSubject()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getVerificationMessageTemplate() == null) ? 0
                        : getVerificationMessageTemplate().hashCode());
        hashCode = prime
                * hashCode
                + ((getSmsAuthenticationMessage() == null) ? 0 : getSmsAuthenticationMessage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMfaConfiguration() == null) ? 0 : getMfaConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceConfiguration() == null) ? 0 : getDeviceConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getEmailConfiguration() == null) ? 0 : getEmailConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getSmsConfiguration() == null) ? 0 : getSmsConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getUserPoolTags() == null) ? 0 : getUserPoolTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdminCreateUserConfig() == null) ? 0 : getAdminCreateUserConfig().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode
                + ((getUserPoolAddOns() == null) ? 0 : getUserPoolAddOns().hashCode());
        hashCode = prime
                * hashCode
                + ((getUsernameConfiguration() == null) ? 0 : getUsernameConfiguration().hashCode());
        hashCode = prime
                * hashCode
                + ((getAccountRecoverySetting() == null) ? 0 : getAccountRecoverySetting()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserPoolRequest == false)
            return false;
        CreateUserPoolRequest other = (CreateUserPoolRequest) obj;

        if (other.getPoolName() == null ^ this.getPoolName() == null)
            return false;
        if (other.getPoolName() != null && other.getPoolName().equals(this.getPoolName()) == false)
            return false;
        if (other.getPolicies() == null ^ this.getPolicies() == null)
            return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false)
            return false;
        if (other.getLambdaConfig() == null ^ this.getLambdaConfig() == null)
            return false;
        if (other.getLambdaConfig() != null
                && other.getLambdaConfig().equals(this.getLambdaConfig()) == false)
            return false;
        if (other.getAutoVerifiedAttributes() == null ^ this.getAutoVerifiedAttributes() == null)
            return false;
        if (other.getAutoVerifiedAttributes() != null
                && other.getAutoVerifiedAttributes().equals(this.getAutoVerifiedAttributes()) == false)
            return false;
        if (other.getAliasAttributes() == null ^ this.getAliasAttributes() == null)
            return false;
        if (other.getAliasAttributes() != null
                && other.getAliasAttributes().equals(this.getAliasAttributes()) == false)
            return false;
        if (other.getUsernameAttributes() == null ^ this.getUsernameAttributes() == null)
            return false;
        if (other.getUsernameAttributes() != null
                && other.getUsernameAttributes().equals(this.getUsernameAttributes()) == false)
            return false;
        if (other.getSmsVerificationMessage() == null ^ this.getSmsVerificationMessage() == null)
            return false;
        if (other.getSmsVerificationMessage() != null
                && other.getSmsVerificationMessage().equals(this.getSmsVerificationMessage()) == false)
            return false;
        if (other.getEmailVerificationMessage() == null
                ^ this.getEmailVerificationMessage() == null)
            return false;
        if (other.getEmailVerificationMessage() != null
                && other.getEmailVerificationMessage().equals(this.getEmailVerificationMessage()) == false)
            return false;
        if (other.getEmailVerificationSubject() == null
                ^ this.getEmailVerificationSubject() == null)
            return false;
        if (other.getEmailVerificationSubject() != null
                && other.getEmailVerificationSubject().equals(this.getEmailVerificationSubject()) == false)
            return false;
        if (other.getVerificationMessageTemplate() == null
                ^ this.getVerificationMessageTemplate() == null)
            return false;
        if (other.getVerificationMessageTemplate() != null
                && other.getVerificationMessageTemplate().equals(
                        this.getVerificationMessageTemplate()) == false)
            return false;
        if (other.getSmsAuthenticationMessage() == null
                ^ this.getSmsAuthenticationMessage() == null)
            return false;
        if (other.getSmsAuthenticationMessage() != null
                && other.getSmsAuthenticationMessage().equals(this.getSmsAuthenticationMessage()) == false)
            return false;
        if (other.getMfaConfiguration() == null ^ this.getMfaConfiguration() == null)
            return false;
        if (other.getMfaConfiguration() != null
                && other.getMfaConfiguration().equals(this.getMfaConfiguration()) == false)
            return false;
        if (other.getDeviceConfiguration() == null ^ this.getDeviceConfiguration() == null)
            return false;
        if (other.getDeviceConfiguration() != null
                && other.getDeviceConfiguration().equals(this.getDeviceConfiguration()) == false)
            return false;
        if (other.getEmailConfiguration() == null ^ this.getEmailConfiguration() == null)
            return false;
        if (other.getEmailConfiguration() != null
                && other.getEmailConfiguration().equals(this.getEmailConfiguration()) == false)
            return false;
        if (other.getSmsConfiguration() == null ^ this.getSmsConfiguration() == null)
            return false;
        if (other.getSmsConfiguration() != null
                && other.getSmsConfiguration().equals(this.getSmsConfiguration()) == false)
            return false;
        if (other.getUserPoolTags() == null ^ this.getUserPoolTags() == null)
            return false;
        if (other.getUserPoolTags() != null
                && other.getUserPoolTags().equals(this.getUserPoolTags()) == false)
            return false;
        if (other.getAdminCreateUserConfig() == null ^ this.getAdminCreateUserConfig() == null)
            return false;
        if (other.getAdminCreateUserConfig() != null
                && other.getAdminCreateUserConfig().equals(this.getAdminCreateUserConfig()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getUserPoolAddOns() == null ^ this.getUserPoolAddOns() == null)
            return false;
        if (other.getUserPoolAddOns() != null
                && other.getUserPoolAddOns().equals(this.getUserPoolAddOns()) == false)
            return false;
        if (other.getUsernameConfiguration() == null ^ this.getUsernameConfiguration() == null)
            return false;
        if (other.getUsernameConfiguration() != null
                && other.getUsernameConfiguration().equals(this.getUsernameConfiguration()) == false)
            return false;
        if (other.getAccountRecoverySetting() == null ^ this.getAccountRecoverySetting() == null)
            return false;
        if (other.getAccountRecoverySetting() != null
                && other.getAccountRecoverySetting().equals(this.getAccountRecoverySetting()) == false)
            return false;
        return true;
    }
}
