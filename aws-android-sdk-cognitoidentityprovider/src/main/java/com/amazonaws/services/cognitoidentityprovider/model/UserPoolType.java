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

/**
 * <p>
 * A container for information about the user pool.
 * </p>
 */
public class UserPoolType implements Serializable {
    /**
     * <p>
     * The ID of the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     */
    private String id;

    /**
     * <p>
     * The name of the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String name;

    /**
     * <p>
     * The policies associated with the user pool.
     * </p>
     */
    private UserPoolPolicyType policies;

    /**
     * <p>
     * The Lambda triggers associated with the user pool.
     * </p>
     */
    private LambdaConfigType lambdaConfig;

    /**
     * <p>
     * The status of a user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String status;

    /**
     * <p>
     * The date the user pool was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The date the user pool was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * A container with the schema attributes of a user pool.
     * </p>
     */
    private java.util.List<SchemaAttributeType> schemaAttributes;

    /**
     * <p>
     * Specifies the attributes that are auto-verified in a user pool.
     * </p>
     */
    private java.util.List<String> autoVerifiedAttributes;

    /**
     * <p>
     * Specifies the attributes that are aliased in a user pool.
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
     * The contents of the SMS verification message.
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
     * <code>OFF</code> - MFA tokens are not required and cannot be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify required when you are initially creating a user pool.
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
     * The device configuration.
     * </p>
     */
    private DeviceConfigurationType deviceConfiguration;

    /**
     * <p>
     * A number estimating the size of the user pool.
     * </p>
     */
    private Integer estimatedNumberOfUsers;

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
     * The tags that are assigned to the user pool. A tag is a label that you
     * can apply to user pools to categorize and manage them in different ways,
     * such as by purpose, owner, environment, or other criteria.
     * </p>
     */
    private java.util.Map<String, String> userPoolTags;

    /**
     * <p>
     * The reason why the SMS configuration cannot send the messages to your
     * users.
     * </p>
     * <p>
     * This message might include comma-separated values to describe why your
     * SMS configuration can't send messages to user pool end users.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InvalidSmsRoleAccessPolicyException - The IAM role which Cognito uses to
     * send SMS messages is not properly configured. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SmsConfigurationType.html"
     * >SmsConfigurationType</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * SNSSandbox - The account is in SNS Sandbox and messages won’t reach
     * unverified end users. This parameter won’t get populated with SNSSandbox
     * if the IAM user creating the user pool doesn’t have SNS permissions. To
     * learn how to move your account out of the sandbox, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox-moving-to-production.html"
     * >Moving out of the SMS sandbox</a>.
     * </p>
     * </li>
     * </ul>
     */
    private String smsConfigurationFailure;

    /**
     * <p>
     * The reason why the email configuration cannot send the messages to your
     * users.
     * </p>
     */
    private String emailConfigurationFailure;

    /**
     * <p>
     * Holds the domain prefix if the user pool has a domain associated with it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     */
    private String domain;

    /**
     * <p>
     * A custom domain name that you provide to Amazon Cognito. This parameter
     * applies only if you use a custom domain to host the sign-up and sign-in
     * pages for your application. For example: <code>auth.example.com</code>.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html"
     * >Using Your Own Domain for the Hosted UI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     */
    private String customDomain;

    /**
     * <p>
     * The configuration for <code>AdminCreateUser</code> requests.
     * </p>
     */
    private AdminCreateUserConfigType adminCreateUserConfig;

    /**
     * <p>
     * The user pool add-ons.
     * </p>
     */
    private UserPoolAddOnsType userPoolAddOns;

    /**
     * <p>
     * You can choose to enable case sensitivity on the username input for the
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
     * The Amazon Resource Name (ARN) for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     */
    private String arn;

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
     * The ID of the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @return <p>
     *         The ID of the user pool.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param id <p>
     *            The ID of the user pool.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+_[0-9a-zA-Z]+<br/>
     *
     * @param id <p>
     *            The ID of the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The name of the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the user pool.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param name <p>
     *            The name of the user pool.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param name <p>
     *            The name of the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The policies associated with the user pool.
     * </p>
     *
     * @return <p>
     *         The policies associated with the user pool.
     *         </p>
     */
    public UserPoolPolicyType getPolicies() {
        return policies;
    }

    /**
     * <p>
     * The policies associated with the user pool.
     * </p>
     *
     * @param policies <p>
     *            The policies associated with the user pool.
     *            </p>
     */
    public void setPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
    }

    /**
     * <p>
     * The policies associated with the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policies <p>
     *            The policies associated with the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
        return this;
    }

    /**
     * <p>
     * The Lambda triggers associated with the user pool.
     * </p>
     *
     * @return <p>
     *         The Lambda triggers associated with the user pool.
     *         </p>
     */
    public LambdaConfigType getLambdaConfig() {
        return lambdaConfig;
    }

    /**
     * <p>
     * The Lambda triggers associated with the user pool.
     * </p>
     *
     * @param lambdaConfig <p>
     *            The Lambda triggers associated with the user pool.
     *            </p>
     */
    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * The Lambda triggers associated with the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lambdaConfig <p>
     *            The Lambda triggers associated with the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
        return this;
    }

    /**
     * <p>
     * The status of a user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         The status of a user pool.
     *         </p>
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of a user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            The status of a user pool.
     *            </p>
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            The status of a user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public UserPoolType withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of a user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            The status of a user pool.
     *            </p>
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            The status of a user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StatusType
     */
    public UserPoolType withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date the user pool was last modified.
     * </p>
     *
     * @return <p>
     *         The date the user pool was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date the user pool was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date the user pool was last modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the user pool was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date the user pool was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The date the user pool was created.
     * </p>
     *
     * @return <p>
     *         The date the user pool was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the user pool was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date the user pool was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the user pool was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the user pool was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * A container with the schema attributes of a user pool.
     * </p>
     *
     * @return <p>
     *         A container with the schema attributes of a user pool.
     *         </p>
     */
    public java.util.List<SchemaAttributeType> getSchemaAttributes() {
        return schemaAttributes;
    }

    /**
     * <p>
     * A container with the schema attributes of a user pool.
     * </p>
     *
     * @param schemaAttributes <p>
     *            A container with the schema attributes of a user pool.
     *            </p>
     */
    public void setSchemaAttributes(java.util.Collection<SchemaAttributeType> schemaAttributes) {
        if (schemaAttributes == null) {
            this.schemaAttributes = null;
            return;
        }

        this.schemaAttributes = new java.util.ArrayList<SchemaAttributeType>(schemaAttributes);
    }

    /**
     * <p>
     * A container with the schema attributes of a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaAttributes <p>
     *            A container with the schema attributes of a user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withSchemaAttributes(SchemaAttributeType... schemaAttributes) {
        if (getSchemaAttributes() == null) {
            this.schemaAttributes = new java.util.ArrayList<SchemaAttributeType>(
                    schemaAttributes.length);
        }
        for (SchemaAttributeType value : schemaAttributes) {
            this.schemaAttributes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A container with the schema attributes of a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param schemaAttributes <p>
     *            A container with the schema attributes of a user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withSchemaAttributes(
            java.util.Collection<SchemaAttributeType> schemaAttributes) {
        setSchemaAttributes(schemaAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies the attributes that are auto-verified in a user pool.
     * </p>
     *
     * @return <p>
     *         Specifies the attributes that are auto-verified in a user pool.
     *         </p>
     */
    public java.util.List<String> getAutoVerifiedAttributes() {
        return autoVerifiedAttributes;
    }

    /**
     * <p>
     * Specifies the attributes that are auto-verified in a user pool.
     * </p>
     *
     * @param autoVerifiedAttributes <p>
     *            Specifies the attributes that are auto-verified in a user
     *            pool.
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
     * Specifies the attributes that are auto-verified in a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoVerifiedAttributes <p>
     *            Specifies the attributes that are auto-verified in a user
     *            pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withAutoVerifiedAttributes(String... autoVerifiedAttributes) {
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
     * Specifies the attributes that are auto-verified in a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoVerifiedAttributes <p>
     *            Specifies the attributes that are auto-verified in a user
     *            pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withAutoVerifiedAttributes(
            java.util.Collection<String> autoVerifiedAttributes) {
        setAutoVerifiedAttributes(autoVerifiedAttributes);
        return this;
    }

    /**
     * <p>
     * Specifies the attributes that are aliased in a user pool.
     * </p>
     *
     * @return <p>
     *         Specifies the attributes that are aliased in a user pool.
     *         </p>
     */
    public java.util.List<String> getAliasAttributes() {
        return aliasAttributes;
    }

    /**
     * <p>
     * Specifies the attributes that are aliased in a user pool.
     * </p>
     *
     * @param aliasAttributes <p>
     *            Specifies the attributes that are aliased in a user pool.
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
     * Specifies the attributes that are aliased in a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aliasAttributes <p>
     *            Specifies the attributes that are aliased in a user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withAliasAttributes(String... aliasAttributes) {
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
     * Specifies the attributes that are aliased in a user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aliasAttributes <p>
     *            Specifies the attributes that are aliased in a user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withAliasAttributes(java.util.Collection<String> aliasAttributes) {
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
    public UserPoolType withUsernameAttributes(String... usernameAttributes) {
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
    public UserPoolType withUsernameAttributes(java.util.Collection<String> usernameAttributes) {
        setUsernameAttributes(usernameAttributes);
        return this;
    }

    /**
     * <p>
     * The contents of the SMS verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return <p>
     *         The contents of the SMS verification message.
     *         </p>
     */
    public String getSmsVerificationMessage() {
        return smsVerificationMessage;
    }

    /**
     * <p>
     * The contents of the SMS verification message.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsVerificationMessage <p>
     *            The contents of the SMS verification message.
     *            </p>
     */
    public void setSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }

    /**
     * <p>
     * The contents of the SMS verification message.
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
     *            The contents of the SMS verification message.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withSmsVerificationMessage(String smsVerificationMessage) {
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
    public UserPoolType withEmailVerificationMessage(String emailVerificationMessage) {
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
    public UserPoolType withEmailVerificationSubject(String emailVerificationSubject) {
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
    public UserPoolType withVerificationMessageTemplate(
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
    public UserPoolType withSmsAuthenticationMessage(String smsAuthenticationMessage) {
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
     * <code>OFF</code> - MFA tokens are not required and cannot be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify required when you are initially creating a user pool.
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
     *         <code>OFF</code> - MFA tokens are not required and cannot be
     *         specified during user registration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ON</code> - MFA tokens are required for all user
     *         registrations. You can only specify required when you are
     *         initially creating a user pool.
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
     * <code>OFF</code> - MFA tokens are not required and cannot be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify required when you are initially creating a user pool.
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
     *            <code>OFF</code> - MFA tokens are not required and cannot be
     *            specified during user registration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> - MFA tokens are required for all user
     *            registrations. You can only specify required when you are
     *            initially creating a user pool.
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
     * <code>OFF</code> - MFA tokens are not required and cannot be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify required when you are initially creating a user pool.
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
     *            <code>OFF</code> - MFA tokens are not required and cannot be
     *            specified during user registration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> - MFA tokens are required for all user
     *            registrations. You can only specify required when you are
     *            initially creating a user pool.
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
    public UserPoolType withMfaConfiguration(String mfaConfiguration) {
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
     * <code>OFF</code> - MFA tokens are not required and cannot be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify required when you are initially creating a user pool.
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
     *            <code>OFF</code> - MFA tokens are not required and cannot be
     *            specified during user registration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> - MFA tokens are required for all user
     *            registrations. You can only specify required when you are
     *            initially creating a user pool.
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
     * <code>OFF</code> - MFA tokens are not required and cannot be specified
     * during user registration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ON</code> - MFA tokens are required for all user registrations. You
     * can only specify required when you are initially creating a user pool.
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
     *            <code>OFF</code> - MFA tokens are not required and cannot be
     *            specified during user registration.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>ON</code> - MFA tokens are required for all user
     *            registrations. You can only specify required when you are
     *            initially creating a user pool.
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
    public UserPoolType withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
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
    public UserPoolType withDeviceConfiguration(DeviceConfigurationType deviceConfiguration) {
        this.deviceConfiguration = deviceConfiguration;
        return this;
    }

    /**
     * <p>
     * A number estimating the size of the user pool.
     * </p>
     *
     * @return <p>
     *         A number estimating the size of the user pool.
     *         </p>
     */
    public Integer getEstimatedNumberOfUsers() {
        return estimatedNumberOfUsers;
    }

    /**
     * <p>
     * A number estimating the size of the user pool.
     * </p>
     *
     * @param estimatedNumberOfUsers <p>
     *            A number estimating the size of the user pool.
     *            </p>
     */
    public void setEstimatedNumberOfUsers(Integer estimatedNumberOfUsers) {
        this.estimatedNumberOfUsers = estimatedNumberOfUsers;
    }

    /**
     * <p>
     * A number estimating the size of the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param estimatedNumberOfUsers <p>
     *            A number estimating the size of the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withEstimatedNumberOfUsers(Integer estimatedNumberOfUsers) {
        this.estimatedNumberOfUsers = estimatedNumberOfUsers;
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
    public UserPoolType withEmailConfiguration(EmailConfigurationType emailConfiguration) {
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
    public UserPoolType withSmsConfiguration(SmsConfigurationType smsConfiguration) {
        this.smsConfiguration = smsConfiguration;
        return this;
    }

    /**
     * <p>
     * The tags that are assigned to the user pool. A tag is a label that you
     * can apply to user pools to categorize and manage them in different ways,
     * such as by purpose, owner, environment, or other criteria.
     * </p>
     *
     * @return <p>
     *         The tags that are assigned to the user pool. A tag is a label
     *         that you can apply to user pools to categorize and manage them in
     *         different ways, such as by purpose, owner, environment, or other
     *         criteria.
     *         </p>
     */
    public java.util.Map<String, String> getUserPoolTags() {
        return userPoolTags;
    }

    /**
     * <p>
     * The tags that are assigned to the user pool. A tag is a label that you
     * can apply to user pools to categorize and manage them in different ways,
     * such as by purpose, owner, environment, or other criteria.
     * </p>
     *
     * @param userPoolTags <p>
     *            The tags that are assigned to the user pool. A tag is a label
     *            that you can apply to user pools to categorize and manage them
     *            in different ways, such as by purpose, owner, environment, or
     *            other criteria.
     *            </p>
     */
    public void setUserPoolTags(java.util.Map<String, String> userPoolTags) {
        this.userPoolTags = userPoolTags;
    }

    /**
     * <p>
     * The tags that are assigned to the user pool. A tag is a label that you
     * can apply to user pools to categorize and manage them in different ways,
     * such as by purpose, owner, environment, or other criteria.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPoolTags <p>
     *            The tags that are assigned to the user pool. A tag is a label
     *            that you can apply to user pools to categorize and manage them
     *            in different ways, such as by purpose, owner, environment, or
     *            other criteria.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withUserPoolTags(java.util.Map<String, String> userPoolTags) {
        this.userPoolTags = userPoolTags;
        return this;
    }

    /**
     * <p>
     * The tags that are assigned to the user pool. A tag is a label that you
     * can apply to user pools to categorize and manage them in different ways,
     * such as by purpose, owner, environment, or other criteria.
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
    public UserPoolType addUserPoolTagsEntry(String key, String value) {
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
    public UserPoolType clearUserPoolTagsEntries() {
        this.userPoolTags = null;
        return this;
    }

    /**
     * <p>
     * The reason why the SMS configuration cannot send the messages to your
     * users.
     * </p>
     * <p>
     * This message might include comma-separated values to describe why your
     * SMS configuration can't send messages to user pool end users.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InvalidSmsRoleAccessPolicyException - The IAM role which Cognito uses to
     * send SMS messages is not properly configured. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SmsConfigurationType.html"
     * >SmsConfigurationType</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * SNSSandbox - The account is in SNS Sandbox and messages won’t reach
     * unverified end users. This parameter won’t get populated with SNSSandbox
     * if the IAM user creating the user pool doesn’t have SNS permissions. To
     * learn how to move your account out of the sandbox, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox-moving-to-production.html"
     * >Moving out of the SMS sandbox</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The reason why the SMS configuration cannot send the messages to
     *         your users.
     *         </p>
     *         <p>
     *         This message might include comma-separated values to describe why
     *         your SMS configuration can't send messages to user pool end
     *         users.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         InvalidSmsRoleAccessPolicyException - The IAM role which Cognito
     *         uses to send SMS messages is not properly configured. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SmsConfigurationType.html"
     *         >SmsConfigurationType</a>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SNSSandbox - The account is in SNS Sandbox and messages won’t
     *         reach unverified end users. This parameter won’t get populated
     *         with SNSSandbox if the IAM user creating the user pool doesn’t
     *         have SNS permissions. To learn how to move your account out of
     *         the sandbox, see <a href=
     *         "https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox-moving-to-production.html"
     *         >Moving out of the SMS sandbox</a>.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSmsConfigurationFailure() {
        return smsConfigurationFailure;
    }

    /**
     * <p>
     * The reason why the SMS configuration cannot send the messages to your
     * users.
     * </p>
     * <p>
     * This message might include comma-separated values to describe why your
     * SMS configuration can't send messages to user pool end users.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InvalidSmsRoleAccessPolicyException - The IAM role which Cognito uses to
     * send SMS messages is not properly configured. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SmsConfigurationType.html"
     * >SmsConfigurationType</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * SNSSandbox - The account is in SNS Sandbox and messages won’t reach
     * unverified end users. This parameter won’t get populated with SNSSandbox
     * if the IAM user creating the user pool doesn’t have SNS permissions. To
     * learn how to move your account out of the sandbox, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox-moving-to-production.html"
     * >Moving out of the SMS sandbox</a>.
     * </p>
     * </li>
     * </ul>
     *
     * @param smsConfigurationFailure <p>
     *            The reason why the SMS configuration cannot send the messages
     *            to your users.
     *            </p>
     *            <p>
     *            This message might include comma-separated values to describe
     *            why your SMS configuration can't send messages to user pool
     *            end users.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            InvalidSmsRoleAccessPolicyException - The IAM role which
     *            Cognito uses to send SMS messages is not properly configured.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SmsConfigurationType.html"
     *            >SmsConfigurationType</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SNSSandbox - The account is in SNS Sandbox and messages won’t
     *            reach unverified end users. This parameter won’t get populated
     *            with SNSSandbox if the IAM user creating the user pool doesn’t
     *            have SNS permissions. To learn how to move your account out of
     *            the sandbox, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox-moving-to-production.html"
     *            >Moving out of the SMS sandbox</a>.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSmsConfigurationFailure(String smsConfigurationFailure) {
        this.smsConfigurationFailure = smsConfigurationFailure;
    }

    /**
     * <p>
     * The reason why the SMS configuration cannot send the messages to your
     * users.
     * </p>
     * <p>
     * This message might include comma-separated values to describe why your
     * SMS configuration can't send messages to user pool end users.
     * </p>
     * <ul>
     * <li>
     * <p>
     * InvalidSmsRoleAccessPolicyException - The IAM role which Cognito uses to
     * send SMS messages is not properly configured. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SmsConfigurationType.html"
     * >SmsConfigurationType</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * SNSSandbox - The account is in SNS Sandbox and messages won’t reach
     * unverified end users. This parameter won’t get populated with SNSSandbox
     * if the IAM user creating the user pool doesn’t have SNS permissions. To
     * learn how to move your account out of the sandbox, see <a href=
     * "https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox-moving-to-production.html"
     * >Moving out of the SMS sandbox</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param smsConfigurationFailure <p>
     *            The reason why the SMS configuration cannot send the messages
     *            to your users.
     *            </p>
     *            <p>
     *            This message might include comma-separated values to describe
     *            why your SMS configuration can't send messages to user pool
     *            end users.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            InvalidSmsRoleAccessPolicyException - The IAM role which
     *            Cognito uses to send SMS messages is not properly configured.
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SmsConfigurationType.html"
     *            >SmsConfigurationType</a>.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            SNSSandbox - The account is in SNS Sandbox and messages won’t
     *            reach unverified end users. This parameter won’t get populated
     *            with SNSSandbox if the IAM user creating the user pool doesn’t
     *            have SNS permissions. To learn how to move your account out of
     *            the sandbox, see <a href=
     *            "https://docs.aws.amazon.com/sns/latest/dg/sns-sms-sandbox-moving-to-production.html"
     *            >Moving out of the SMS sandbox</a>.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withSmsConfigurationFailure(String smsConfigurationFailure) {
        this.smsConfigurationFailure = smsConfigurationFailure;
        return this;
    }

    /**
     * <p>
     * The reason why the email configuration cannot send the messages to your
     * users.
     * </p>
     *
     * @return <p>
     *         The reason why the email configuration cannot send the messages
     *         to your users.
     *         </p>
     */
    public String getEmailConfigurationFailure() {
        return emailConfigurationFailure;
    }

    /**
     * <p>
     * The reason why the email configuration cannot send the messages to your
     * users.
     * </p>
     *
     * @param emailConfigurationFailure <p>
     *            The reason why the email configuration cannot send the
     *            messages to your users.
     *            </p>
     */
    public void setEmailConfigurationFailure(String emailConfigurationFailure) {
        this.emailConfigurationFailure = emailConfigurationFailure;
    }

    /**
     * <p>
     * The reason why the email configuration cannot send the messages to your
     * users.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param emailConfigurationFailure <p>
     *            The reason why the email configuration cannot send the
     *            messages to your users.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withEmailConfigurationFailure(String emailConfigurationFailure) {
        this.emailConfigurationFailure = emailConfigurationFailure;
        return this;
    }

    /**
     * <p>
     * Holds the domain prefix if the user pool has a domain associated with it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @return <p>
     *         Holds the domain prefix if the user pool has a domain associated
     *         with it.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * Holds the domain prefix if the user pool has a domain associated with it.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param domain <p>
     *            Holds the domain prefix if the user pool has a domain
     *            associated with it.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Holds the domain prefix if the user pool has a domain associated with it.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param domain <p>
     *            Holds the domain prefix if the user pool has a domain
     *            associated with it.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * A custom domain name that you provide to Amazon Cognito. This parameter
     * applies only if you use a custom domain to host the sign-up and sign-in
     * pages for your application. For example: <code>auth.example.com</code>.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html"
     * >Using Your Own Domain for the Hosted UI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @return <p>
     *         A custom domain name that you provide to Amazon Cognito. This
     *         parameter applies only if you use a custom domain to host the
     *         sign-up and sign-in pages for your application. For example:
     *         <code>auth.example.com</code>.
     *         </p>
     *         <p>
     *         For more information about adding a custom domain to your user
     *         pool, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html"
     *         >Using Your Own Domain for the Hosted UI</a>.
     *         </p>
     */
    public String getCustomDomain() {
        return customDomain;
    }

    /**
     * <p>
     * A custom domain name that you provide to Amazon Cognito. This parameter
     * applies only if you use a custom domain to host the sign-up and sign-in
     * pages for your application. For example: <code>auth.example.com</code>.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html"
     * >Using Your Own Domain for the Hosted UI</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param customDomain <p>
     *            A custom domain name that you provide to Amazon Cognito. This
     *            parameter applies only if you use a custom domain to host the
     *            sign-up and sign-in pages for your application. For example:
     *            <code>auth.example.com</code>.
     *            </p>
     *            <p>
     *            For more information about adding a custom domain to your user
     *            pool, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html"
     *            >Using Your Own Domain for the Hosted UI</a>.
     *            </p>
     */
    public void setCustomDomain(String customDomain) {
        this.customDomain = customDomain;
    }

    /**
     * <p>
     * A custom domain name that you provide to Amazon Cognito. This parameter
     * applies only if you use a custom domain to host the sign-up and sign-in
     * pages for your application. For example: <code>auth.example.com</code>.
     * </p>
     * <p>
     * For more information about adding a custom domain to your user pool, see
     * <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html"
     * >Using Your Own Domain for the Hosted UI</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-z0-9](?:[a-z0-9\-]{0,61}[a-z0-9])?$<br/>
     *
     * @param customDomain <p>
     *            A custom domain name that you provide to Amazon Cognito. This
     *            parameter applies only if you use a custom domain to host the
     *            sign-up and sign-in pages for your application. For example:
     *            <code>auth.example.com</code>.
     *            </p>
     *            <p>
     *            For more information about adding a custom domain to your user
     *            pool, see <a href=
     *            "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-add-custom-domain.html"
     *            >Using Your Own Domain for the Hosted UI</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withCustomDomain(String customDomain) {
        this.customDomain = customDomain;
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
    public UserPoolType withAdminCreateUserConfig(AdminCreateUserConfigType adminCreateUserConfig) {
        this.adminCreateUserConfig = adminCreateUserConfig;
        return this;
    }

    /**
     * <p>
     * The user pool add-ons.
     * </p>
     *
     * @return <p>
     *         The user pool add-ons.
     *         </p>
     */
    public UserPoolAddOnsType getUserPoolAddOns() {
        return userPoolAddOns;
    }

    /**
     * <p>
     * The user pool add-ons.
     * </p>
     *
     * @param userPoolAddOns <p>
     *            The user pool add-ons.
     *            </p>
     */
    public void setUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        this.userPoolAddOns = userPoolAddOns;
    }

    /**
     * <p>
     * The user pool add-ons.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userPoolAddOns <p>
     *            The user pool add-ons.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withUserPoolAddOns(UserPoolAddOnsType userPoolAddOns) {
        this.userPoolAddOns = userPoolAddOns;
        return this;
    }

    /**
     * <p>
     * You can choose to enable case sensitivity on the username input for the
     * selected sign-in option. For example, when this is set to
     * <code>False</code>, users will be able to sign in using either "username"
     * or "Username". This configuration is immutable once it has been set. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UsernameConfigurationType.html"
     * >UsernameConfigurationType</a>.
     * </p>
     *
     * @return <p>
     *         You can choose to enable case sensitivity on the username input
     *         for the selected sign-in option. For example, when this is set to
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
     * You can choose to enable case sensitivity on the username input for the
     * selected sign-in option. For example, when this is set to
     * <code>False</code>, users will be able to sign in using either "username"
     * or "Username". This configuration is immutable once it has been set. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UsernameConfigurationType.html"
     * >UsernameConfigurationType</a>.
     * </p>
     *
     * @param usernameConfiguration <p>
     *            You can choose to enable case sensitivity on the username
     *            input for the selected sign-in option. For example, when this
     *            is set to <code>False</code>, users will be able to sign in
     *            using either "username" or "Username". This configuration is
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
     * You can choose to enable case sensitivity on the username input for the
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
     *            You can choose to enable case sensitivity on the username
     *            input for the selected sign-in option. For example, when this
     *            is set to <code>False</code>, users will be able to sign in
     *            using either "username" or "Username". This configuration is
     *            immutable once it has been set. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_UsernameConfigurationType.html"
     *            >UsernameConfigurationType</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withUsernameConfiguration(UsernameConfigurationType usernameConfiguration) {
        this.usernameConfiguration = usernameConfiguration;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the user pool.
     *         </p>
     */
    public String getArn() {
        return arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user pool.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the user pool.
     *            </p>
     */
    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the user pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern:
     * </b>arn:[\w+=/,.@-]+:[\w+=/,.@-]+:([\w+=/,.@-]*)?:[0-9]+:[\w+=
     * /,.@-]+(:[\w+=/,.@-]+)?(:[\w+=/,.@-]+)?<br/>
     *
     * @param arn <p>
     *            The Amazon Resource Name (ARN) for the user pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UserPoolType withArn(String arn) {
        this.arn = arn;
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
    public UserPoolType withAccountRecoverySetting(AccountRecoverySettingType accountRecoverySetting) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPolicies() != null)
            sb.append("Policies: " + getPolicies() + ",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: " + getLambdaConfig() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getSchemaAttributes() != null)
            sb.append("SchemaAttributes: " + getSchemaAttributes() + ",");
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
        if (getEstimatedNumberOfUsers() != null)
            sb.append("EstimatedNumberOfUsers: " + getEstimatedNumberOfUsers() + ",");
        if (getEmailConfiguration() != null)
            sb.append("EmailConfiguration: " + getEmailConfiguration() + ",");
        if (getSmsConfiguration() != null)
            sb.append("SmsConfiguration: " + getSmsConfiguration() + ",");
        if (getUserPoolTags() != null)
            sb.append("UserPoolTags: " + getUserPoolTags() + ",");
        if (getSmsConfigurationFailure() != null)
            sb.append("SmsConfigurationFailure: " + getSmsConfigurationFailure() + ",");
        if (getEmailConfigurationFailure() != null)
            sb.append("EmailConfigurationFailure: " + getEmailConfigurationFailure() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getCustomDomain() != null)
            sb.append("CustomDomain: " + getCustomDomain() + ",");
        if (getAdminCreateUserConfig() != null)
            sb.append("AdminCreateUserConfig: " + getAdminCreateUserConfig() + ",");
        if (getUserPoolAddOns() != null)
            sb.append("UserPoolAddOns: " + getUserPoolAddOns() + ",");
        if (getUsernameConfiguration() != null)
            sb.append("UsernameConfiguration: " + getUsernameConfiguration() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getAccountRecoverySetting() != null)
            sb.append("AccountRecoverySetting: " + getAccountRecoverySetting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode());
        hashCode = prime * hashCode
                + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getSchemaAttributes() == null) ? 0 : getSchemaAttributes().hashCode());
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
        hashCode = prime
                * hashCode
                + ((getEstimatedNumberOfUsers() == null) ? 0 : getEstimatedNumberOfUsers()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEmailConfiguration() == null) ? 0 : getEmailConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getSmsConfiguration() == null) ? 0 : getSmsConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getUserPoolTags() == null) ? 0 : getUserPoolTags().hashCode());
        hashCode = prime
                * hashCode
                + ((getSmsConfigurationFailure() == null) ? 0 : getSmsConfigurationFailure()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEmailConfigurationFailure() == null) ? 0 : getEmailConfigurationFailure()
                        .hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode
                + ((getCustomDomain() == null) ? 0 : getCustomDomain().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdminCreateUserConfig() == null) ? 0 : getAdminCreateUserConfig().hashCode());
        hashCode = prime * hashCode
                + ((getUserPoolAddOns() == null) ? 0 : getUserPoolAddOns().hashCode());
        hashCode = prime
                * hashCode
                + ((getUsernameConfiguration() == null) ? 0 : getUsernameConfiguration().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
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

        if (obj instanceof UserPoolType == false)
            return false;
        UserPoolType other = (UserPoolType) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getSchemaAttributes() == null ^ this.getSchemaAttributes() == null)
            return false;
        if (other.getSchemaAttributes() != null
                && other.getSchemaAttributes().equals(this.getSchemaAttributes()) == false)
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
        if (other.getEstimatedNumberOfUsers() == null ^ this.getEstimatedNumberOfUsers() == null)
            return false;
        if (other.getEstimatedNumberOfUsers() != null
                && other.getEstimatedNumberOfUsers().equals(this.getEstimatedNumberOfUsers()) == false)
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
        if (other.getSmsConfigurationFailure() == null ^ this.getSmsConfigurationFailure() == null)
            return false;
        if (other.getSmsConfigurationFailure() != null
                && other.getSmsConfigurationFailure().equals(this.getSmsConfigurationFailure()) == false)
            return false;
        if (other.getEmailConfigurationFailure() == null
                ^ this.getEmailConfigurationFailure() == null)
            return false;
        if (other.getEmailConfigurationFailure() != null
                && other.getEmailConfigurationFailure().equals(this.getEmailConfigurationFailure()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getCustomDomain() == null ^ this.getCustomDomain() == null)
            return false;
        if (other.getCustomDomain() != null
                && other.getCustomDomain().equals(this.getCustomDomain()) == false)
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
        if (other.getUsernameConfiguration() == null ^ this.getUsernameConfiguration() == null)
            return false;
        if (other.getUsernameConfiguration() != null
                && other.getUsernameConfiguration().equals(this.getUsernameConfiguration()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAccountRecoverySetting() == null ^ this.getAccountRecoverySetting() == null)
            return false;
        if (other.getAccountRecoverySetting() != null
                && other.getAccountRecoverySetting().equals(this.getAccountRecoverySetting()) == false)
            return false;
        return true;
    }
}
