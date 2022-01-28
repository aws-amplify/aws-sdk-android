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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the specified user pool with the specified attributes. You can get a
 * list of the current user pool settings using <a href=
 * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_DescribeUserPool.html"
 * >DescribeUserPool</a>. If you don't provide a value for an attribute, it will
 * be set to the default value.
 * </p>
 * <note>
 * <p>
 * This action might generate an SMS text message. Starting June 1, 2021, US
 * telecom carriers require you to register an origination phone number before
 * you can send SMS messages to U.S. phone numbers. If you use SMS text messages
 * in Amazon Cognito, you must register a phone number with <a
 * href="https://console.aws.amazon.com/pinpoint/home/">Amazon Pinpoint</a>.
 * Amazon Cognito will use the registered number automatically. Otherwise,
 * Amazon Cognito users that must receive SMS messages might be unable to sign
 * up, activate their accounts, or sign in.
 * </p>
 * <p>
 * If you have never used SMS text messages with Amazon Cognito or any other
 * Amazon Web Service, Amazon Simple Notification Service might place your
 * account in SMS sandbox. In <i> <a
 * href="https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox.html">sandbox
 * mode</a> </i>, you will have limitations, such as sending messages only to
 * verified phone numbers. After testing in the sandbox environment, you can
 * move out of the SMS sandbox and into production. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-identity-pools-sms-userpool-settings.html"
 * > SMS message settings for Amazon Cognito User Pools</a> in the <i>Amazon
 * Cognito Developer Guide</i>.
 * </p>
 * </note>
 */
public class UpdateUserPoolRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The user pool ID for the user pool you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String userPoolId;

    /**
     * <p>
     * A container with the policies you want to update in a user pool.
     * </p>
     */
    private UserPoolPolicyType policies;

    /**
     * <p>
     * The Lambda configuration information from the request to update the user
     * pool.
     * </p>
     */
    private LambdaConfigType lambdaConfig;

    /**
     * <p>
     * The attributes that are automatically verified when Amazon Cognito
     * requests to update user pools.
     * </p>
     */
    private java.util.List<String> autoVerifiedAttributes;

    /**
     * <p>
     * A container with information about the SMS verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     */
    private String smsVerificationMessage;

    /**
     * <p>
     * The contents of the email verification message.
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
     * The subject of the email verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     */
    private String emailVerificationSubject;

    /**
     * <p>
     * The template for verification messages.
     * </p>
     */
    private VerificationMessageTemplateType verificationMessageTemplate;

    /**
     * <p>
     * The contents of the SMS authentication message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     */
    private String smsAuthenticationMessage;

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify ON when you're initially creating a user pool. You can
     * use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing
     * user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create
     * an MFA token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     */
    private String mfaConfiguration;

    /**
     * <p>
     * Device configuration.
     * </p>
     */
    private DeviceConfigurationType deviceConfiguration;

    /**
     * <p>
     * Email configuration.
     * </p>
     */
    private EmailConfigurationType emailConfiguration;

    /**
     * <p>
     * SMS configuration.
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
     * Enables advanced security risk detection. Set the key
     * <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     */
    private UserPoolAddOnsType userPoolAddOns;

    /**
     * <p>
     * The available verified method a user can use to recover their password
     * when they call <code>ForgotPassword</code>. You can use this setting to
     * define a preferred method when a user has more than one method available.
     * With this setting, SMS doesn't qualify for a valid password recovery
     * mechanism if the user also has SMS multi-factor authentication (MFA)
     * activated. In the absence of this setting, Amazon Cognito uses the legacy
     * behavior to determine the recovery method where SMS is preferred through
     * email.
     * </p>
     */
    private AccountRecoverySettingType accountRecoverySetting;

    /**
     * <p>
     * The user pool ID for the user pool you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The user pool ID for the user pool you want to update.
     *         </p>
     */
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param userPoolId <p>
     *            The user pool ID for the user pool you want to update.
     *            </p>
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool you want to update.
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
     *            The user pool ID for the user pool you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * <p>
     * A container with the policies you want to update in a user pool.
     * </p>
     *
     * @return <p>
     *         A container with the policies you want to update in a user pool.
     *         </p>
     */
    public UserPoolPolicyType getPolicies() {
        return policies;
    }

    /**
     * <p>
     * A container with the policies you want to update in a user pool.
     * </p>
     *
     * @param policies <p>
     *            A container with the policies you want to update in a user
     *            pool.
     *            </p>
     */
    public void setPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * A container with the policies you want to update in a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            A container with the policies you want to update in a user
     *            pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
        return this;
    }

    /**
     * <p>
     * The Lambda configuration information from the request to update the user
     * pool.
     * </p>
     *
     * @return <p>
     *         The Lambda configuration information from the request to update
     *         the user pool.
     *         </p>
     */
    public LambdaConfigType getLambdaConfig() {
        return lambdaConfig;
    }

    /**
     * <p>
     * The Lambda configuration information from the request to update the user
     * pool.
     * </p>
     *
     * @param lambdaConfig <p>
     *            The Lambda configuration information from the request to
     *            update the user pool.
     *            </p>
     */
    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * The Lambda configuration information from the request to update the user
     * pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaConfig <p>
     *            The Lambda configuration information from the request to
     *            update the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
        return this;
    }

    /**
     * <p>
     * The attributes that are automatically verified when Amazon Cognito
     * requests to update user pools.
     * </p>
     *
     * @return <p>
     *         The attributes that are automatically verified when Amazon
     *         Cognito requests to update user pools.
     *         </p>
     */
    public java.util.List<String> getAutoVerifiedAttributes() {
        return autoVerifiedAttributes;
    }

    /**
     * <p>
     * The attributes that are automatically verified when Amazon Cognito
     * requests to update user pools.
     * </p>
     *
     * @param autoVerifiedAttributes <p>
     *            The attributes that are automatically verified when Amazon
     *            Cognito requests to update user pools.
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
     * The attributes that are automatically verified when Amazon Cognito
     * requests to update user pools.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoVerifiedAttributes <p>
     *            The attributes that are automatically verified when Amazon
     *            Cognito requests to update user pools.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withAutoVerifiedAttributes(String... autoVerifiedAttributes) {
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
     * The attributes that are automatically verified when Amazon Cognito
     * requests to update user pools.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoVerifiedAttributes <p>
     *            The attributes that are automatically verified when Amazon
     *            Cognito requests to update user pools.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withAutoVerifiedAttributes(
            java.util.Collection<String> autoVerifiedAttributes) {
        setAutoVerifiedAttributes(autoVerifiedAttributes);
        return this;
    }

    /**
     * <p>
     * A container with information about the SMS verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return <p>
     *         A container with information about the SMS verification message.
     *         </p>
     */
    public String getSmsVerificationMessage() {
        return smsVerificationMessage;
    }

    /**
     * <p>
     * A container with information about the SMS verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsVerificationMessage <p>
     *            A container with information about the SMS verification
     *            message.
     *            </p>
     */
    public void setSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }

    /**
     * <p>
     * A container with information about the SMS verification message.
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
     *            A container with information about the SMS verification
     *            message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
        return this;
    }

    /**
     * <p>
     * The contents of the email verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     *
     * @return <p>
     *         The contents of the email verification message.
     *         </p>
     */
    public String getEmailVerificationMessage() {
        return emailVerificationMessage;
    }

    /**
     * <p>
     * The contents of the email verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 20000<br/>
     * <b>Pattern:
     * </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{
     * N}\p{P}\s*]*<br/>
     *
     * @param emailVerificationMessage <p>
     *            The contents of the email verification message.
     *            </p>
     */
    public void setEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
    }

    /**
     * <p>
     * The contents of the email verification message.
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
     *            The contents of the email verification message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
        return this;
    }

    /**
     * <p>
     * The subject of the email verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @return <p>
     *         The subject of the email verification message.
     *         </p>
     */
    public String getEmailVerificationSubject() {
        return emailVerificationSubject;
    }

    /**
     * <p>
     * The subject of the email verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailVerificationSubject <p>
     *            The subject of the email verification message.
     *            </p>
     */
    public void setEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }

    /**
     * <p>
     * The subject of the email verification message.
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
     *            The subject of the email verification message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
        return this;
    }

    /**
     * <p>
     * The template for verification messages.
     * </p>
     *
     * @return <p>
     *         The template for verification messages.
     *         </p>
     */
    public VerificationMessageTemplateType getVerificationMessageTemplate() {
        return verificationMessageTemplate;
    }

    /**
     * <p>
     * The template for verification messages.
     * </p>
     *
     * @param verificationMessageTemplate <p>
     *            The template for verification messages.
     *            </p>
     */
    public void setVerificationMessageTemplate(
            VerificationMessageTemplateType verificationMessageTemplate) {
        this.verificationMessageTemplate = verificationMessageTemplate;
    }

    /**
     * <p>
     * The template for verification messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param verificationMessageTemplate <p>
     *            The template for verification messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withVerificationMessageTemplate(
            VerificationMessageTemplateType verificationMessageTemplate) {
        this.verificationMessageTemplate = verificationMessageTemplate;
        return this;
    }

    /**
     * <p>
     * The contents of the SMS authentication message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return <p>
     *         The contents of the SMS authentication message.
     *         </p>
     */
    public String getSmsAuthenticationMessage() {
        return smsAuthenticationMessage;
    }

    /**
     * <p>
     * The contents of the SMS authentication message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsAuthenticationMessage <p>
     *            The contents of the SMS authentication message.
     *            </p>
     */
    public void setSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
    }

    /**
     * <p>
     * The contents of the SMS authentication message.
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
     *            The contents of the SMS authentication message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
        return this;
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify ON when you're initially creating a user pool. You can
     * use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing
     * user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create
     * an MFA token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @return <p>
     *         Can be one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>OFF</code> - MFA tokens aren't required and can't be
     *         specified during user registration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ON</code> - MFA tokens are required for all user
     *         registrations. You can only specify ON when you're initially
     *         creating a user pool. You can use the <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     *         >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for
     *         existing user pools.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPTIONAL</code> - Users have the option when registering to
     *         create an MFA token.
     *         </p>
     *         </li>
     *         </ul>
     * @see UserPoolMfaType
     */
    public String getMfaConfiguration() {
        return mfaConfiguration;
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify ON when you're initially creating a user pool. You can
     * use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing
     * user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create
     * an MFA token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            Can be one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OFF</code> - MFA tokens aren't required and can't be
     *            specified during user registration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> - MFA tokens are required for all user
     *            registrations. You can only specify ON when you're initially
     *            creating a user pool. You can use the <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     *            >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for
     *            existing user pools.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OPTIONAL</code> - Users have the option when registering
     *            to create an MFA token.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify ON when you're initially creating a user pool. You can
     * use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing
     * user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create
     * an MFA token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            Can be one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OFF</code> - MFA tokens aren't required and can't be
     *            specified during user registration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> - MFA tokens are required for all user
     *            registrations. You can only specify ON when you're initially
     *            creating a user pool. You can use the <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     *            >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for
     *            existing user pools.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OPTIONAL</code> - Users have the option when registering
     *            to create an MFA token.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserPoolMfaType
     */
    public UpdateUserPoolRequest withMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
        return this;
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify ON when you're initially creating a user pool. You can
     * use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing
     * user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create
     * an MFA token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            Can be one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OFF</code> - MFA tokens aren't required and can't be
     *            specified during user registration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> - MFA tokens are required for all user
     *            registrations. You can only specify ON when you're initially
     *            creating a user pool. You can use the <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     *            >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for
     *            existing user pools.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OPTIONAL</code> - Users have the option when registering
     *            to create an MFA token.
     *            </p>
     *            </li>
     *            </ul>
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
    }

    /**
     * <p>
     * Can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>OFF</code> - MFA tokens aren't required and can't be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify ON when you're initially creating a user pool. You can
     * use the <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     * >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for existing
     * user pools.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPTIONAL</code> - Users have the option when registering to create
     * an MFA token.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration <p>
     *            Can be one of the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>OFF</code> - MFA tokens aren't required and can't be
     *            specified during user registration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> - MFA tokens are required for all user
     *            registrations. You can only specify ON when you're initially
     *            creating a user pool. You can use the <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SetUserPoolMfaConfig.html"
     *            >SetUserPoolMfaConfig</a> API operation to turn MFA "ON" for
     *            existing user pools.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>OPTIONAL</code> - Users have the option when registering
     *            to create an MFA token.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UserPoolMfaType
     */
    public UpdateUserPoolRequest withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
        return this;
    }

    /**
     * <p>
     * Device configuration.
     * </p>
     *
     * @return <p>
     *         Device configuration.
     *         </p>
     */
    public DeviceConfigurationType getDeviceConfiguration() {
        return deviceConfiguration;
    }

    /**
     * <p>
     * Device configuration.
     * </p>
     *
     * @param deviceConfiguration <p>
     *            Device configuration.
     *            </p>
     */
    public void setDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
    }

    /**
     * <p>
     * Device configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deviceConfiguration <p>
     *            Device configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
        return this;
    }

    /**
     * <p>
     * Email configuration.
     * </p>
     *
     * @return <p>
     *         Email configuration.
     *         </p>
     */
    public EmailConfigurationType getEmailConfiguration() {
        return emailConfiguration;
    }

    /**
     * <p>
     * Email configuration.
     * </p>
     *
     * @param emailConfiguration <p>
     *            Email configuration.
     *            </p>
     */
    public void setEmailConfiguration(EmailConfigurationType emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
    }

    /**
     * <p>
     * Email configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailConfiguration <p>
     *            Email configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withEmailConfiguration(EmailConfigurationType emailConfiguration) {
        this.emailConfiguration = emailConfiguration;
        return this;
    }

    /**
     * <p>
     * SMS configuration.
     * </p>
     *
     * @return <p>
     *         SMS configuration.
     *         </p>
     */
    public SmsConfigurationType getSmsConfiguration() {
        return smsConfiguration;
    }

    /**
     * <p>
     * SMS configuration.
     * </p>
     *
     * @param smsConfiguration <p>
     *            SMS configuration.
     *            </p>
     */
    public void setSmsConfiguration(SmsConfigurationType smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
    }

    /**
     * <p>
     * SMS configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smsConfiguration <p>
     *            SMS configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withSmsConfiguration(SmsConfigurationType smsConfiguration) {
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
    public UpdateUserPoolRequest withUserPoolTags(java.util.Map<String, String> userPoolTags) {
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
    public UpdateUserPoolRequest addUserPoolTagsEntry(String key, String value) {
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
    public UpdateUserPoolRequest clearUserPoolTagsEntries() {
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
    public UpdateUserPoolRequest withAdminCreateUserConfig(
            AdminCreateUserConfigType adminCreateUserConfig) {
        this.adminCreateUserConfig = adminCreateUserConfig;
        return this;
    }

    /**
     * <p>
     * Enables advanced security risk detection. Set the key
     * <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     *
     * @return <p>
     *         Enables advanced security risk detection. Set the key
     *         <code>AdvancedSecurityMode</code> to the value "AUDIT".
     *         </p>
     */
    public UserPoolAddOnsType getUserPoolAddOns() {
        return userPoolAddOns;
    }

    /**
     * <p>
     * Enables advanced security risk detection. Set the key
     * <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     *
     * @param userPoolAddOns <p>
     *            Enables advanced security risk detection. Set the key
     *            <code>AdvancedSecurityMode</code> to the value "AUDIT".
     *            </p>
     */
    public void setUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        this.userPoolAddOns = userPoolAddOns;
    }

    /**
     * <p>
     * Enables advanced security risk detection. Set the key
     * <code>AdvancedSecurityMode</code> to the value "AUDIT".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPoolAddOns <p>
     *            Enables advanced security risk detection. Set the key
     *            <code>AdvancedSecurityMode</code> to the value "AUDIT".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        this.userPoolAddOns = userPoolAddOns;
        return this;
    }

    /**
     * <p>
     * The available verified method a user can use to recover their password
     * when they call <code>ForgotPassword</code>. You can use this setting to
     * define a preferred method when a user has more than one method available.
     * With this setting, SMS doesn't qualify for a valid password recovery
     * mechanism if the user also has SMS multi-factor authentication (MFA)
     * activated. In the absence of this setting, Amazon Cognito uses the legacy
     * behavior to determine the recovery method where SMS is preferred through
     * email.
     * </p>
     *
     * @return <p>
     *         The available verified method a user can use to recover their
     *         password when they call <code>ForgotPassword</code>. You can use
     *         this setting to define a preferred method when a user has more
     *         than one method available. With this setting, SMS doesn't qualify
     *         for a valid password recovery mechanism if the user also has SMS
     *         multi-factor authentication (MFA) activated. In the absence of
     *         this setting, Amazon Cognito uses the legacy behavior to
     *         determine the recovery method where SMS is preferred through
     *         email.
     *         </p>
     */
    public AccountRecoverySettingType getAccountRecoverySetting() {
        return accountRecoverySetting;
    }

    /**
     * <p>
     * The available verified method a user can use to recover their password
     * when they call <code>ForgotPassword</code>. You can use this setting to
     * define a preferred method when a user has more than one method available.
     * With this setting, SMS doesn't qualify for a valid password recovery
     * mechanism if the user also has SMS multi-factor authentication (MFA)
     * activated. In the absence of this setting, Amazon Cognito uses the legacy
     * behavior to determine the recovery method where SMS is preferred through
     * email.
     * </p>
     *
     * @param accountRecoverySetting <p>
     *            The available verified method a user can use to recover their
     *            password when they call <code>ForgotPassword</code>. You can
     *            use this setting to define a preferred method when a user has
     *            more than one method available. With this setting, SMS doesn't
     *            qualify for a valid password recovery mechanism if the user
     *            also has SMS multi-factor authentication (MFA) activated. In
     *            the absence of this setting, Amazon Cognito uses the legacy
     *            behavior to determine the recovery method where SMS is
     *            preferred through email.
     *            </p>
     */
    public void setAccountRecoverySetting(AccountRecoverySettingType accountRecoverySetting) {
        this.accountRecoverySetting = accountRecoverySetting;
    }

    /**
     * <p>
     * The available verified method a user can use to recover their password
     * when they call <code>ForgotPassword</code>. You can use this setting to
     * define a preferred method when a user has more than one method available.
     * With this setting, SMS doesn't qualify for a valid password recovery
     * mechanism if the user also has SMS multi-factor authentication (MFA)
     * activated. In the absence of this setting, Amazon Cognito uses the legacy
     * behavior to determine the recovery method where SMS is preferred through
     * email.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountRecoverySetting <p>
     *            The available verified method a user can use to recover their
     *            password when they call <code>ForgotPassword</code>. You can
     *            use this setting to define a preferred method when a user has
     *            more than one method available. With this setting, SMS doesn't
     *            qualify for a valid password recovery mechanism if the user
     *            also has SMS multi-factor authentication (MFA) activated. In
     *            the absence of this setting, Amazon Cognito uses the legacy
     *            behavior to determine the recovery method where SMS is
     *            preferred through email.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateUserPoolRequest withAccountRecoverySetting(
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getPolicies() != null)
            sb.append("Policies: " + getPolicies() + ",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: " + getLambdaConfig() + ",");
        if (getAutoVerifiedAttributes() != null)
            sb.append("AutoVerifiedAttributes: " + getAutoVerifiedAttributes() + ",");
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
        if (getUserPoolAddOns() != null)
            sb.append("UserPoolAddOns: " + getUserPoolAddOns() + ",");
        if (getAccountRecoverySetting() != null)
            sb.append("AccountRecoverySetting: " + getAccountRecoverySetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode
                + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoVerifiedAttributes() == null) ? 0 : getAutoVerifiedAttributes()
                        .hashCode());
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
        hashCode = prime * hashCode
                + ((getUserPoolAddOns() == null) ? 0 : getUserPoolAddOns().hashCode());
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

        if (obj instanceof UpdateUserPoolRequest == false)
            return false;
        UpdateUserPoolRequest other = (UpdateUserPoolRequest) obj;

        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
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
        if (other.getUserPoolAddOns() == null ^ this.getUserPoolAddOns() == null)
            return false;
        if (other.getUserPoolAddOns() != null
                && other.getUserPoolAddOns().equals(this.getUserPoolAddOns()) == false)
            return false;
        if (other.getAccountRecoverySetting() == null ^ this.getAccountRecoverySetting() == null)
            return false;
        if (other.getAccountRecoverySetting() != null
                && other.getAccountRecoverySetting().equals(this.getAccountRecoverySetting()) == false)
            return false;
        return true;
    }
}
