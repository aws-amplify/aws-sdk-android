/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#updateUserPool(UpdateUserPoolRequest) UpdateUserPool operation}.
 * <p>
 * Updates the specified user pool with the specified attributes.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#updateUserPool(UpdateUserPoolRequest)
 */
public class UpdateUserPoolRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The user pool ID for the user pool you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     */
    private String userPoolId;

    /**
     * A container with the policies you wish to update in a user pool.
     */
    private UserPoolPolicyType policies;

    /**
     * The AWS Lambda configuration information from the request to update
     * the user pool.
     */
    private LambdaConfigType lambdaConfig;

    /**
     * The attributes that are automatically verified when the Amazon Cognito
     * service makes a request to update user pools.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> autoVerifiedAttributes;

    /**
     * A container with information about the SMS verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     */
    private String smsVerificationMessage;

    /**
     * The contents of the email verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 2048<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     */
    private String emailVerificationMessage;

    /**
     * The subject of the email verfication message
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     */
    private String emailVerificationSubject;

    /**
     * The contents of the SMS authentication message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     */
    private String smsAuthenticationMessage;

    /**
     * Can be one of the following values: <ul> <li><code>OFF</code> - MFA
     * tokens are not required and cannot be specified during user
     * registration.</li> <li><code>ON</code> - MFA tokens are required for
     * all user registrations. You can only specify required when you are
     * initially creating a user pool.</li> <li><code>OPTIONAL</code> - Users
     * have the option when registering to create an MFA token.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     */
    private String mfaConfiguration;

    /**
     * The user pool ID for the user pool you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @return The user pool ID for the user pool you want to update.
     */
    public String getUserPoolId() {
        return userPoolId;
    }
    
    /**
     * The user pool ID for the user pool you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The user pool ID for the user pool you want to update.
     */
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }
    
    /**
     * The user pool ID for the user pool you want to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param userPoolId The user pool ID for the user pool you want to update.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserPoolRequest withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * A container with the policies you wish to update in a user pool.
     *
     * @return A container with the policies you wish to update in a user pool.
     */
    public UserPoolPolicyType getPolicies() {
        return policies;
    }
    
    /**
     * A container with the policies you wish to update in a user pool.
     *
     * @param policies A container with the policies you wish to update in a user pool.
     */
    public void setPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
    }
    
    /**
     * A container with the policies you wish to update in a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policies A container with the policies you wish to update in a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserPoolRequest withPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
        return this;
    }

    /**
     * The AWS Lambda configuration information from the request to update
     * the user pool.
     *
     * @return The AWS Lambda configuration information from the request to update
     *         the user pool.
     */
    public LambdaConfigType getLambdaConfig() {
        return lambdaConfig;
    }
    
    /**
     * The AWS Lambda configuration information from the request to update
     * the user pool.
     *
     * @param lambdaConfig The AWS Lambda configuration information from the request to update
     *         the user pool.
     */
    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }
    
    /**
     * The AWS Lambda configuration information from the request to update
     * the user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lambdaConfig The AWS Lambda configuration information from the request to update
     *         the user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserPoolRequest withLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
        return this;
    }

    /**
     * The attributes that are automatically verified when the Amazon Cognito
     * service makes a request to update user pools.
     *
     * @return The attributes that are automatically verified when the Amazon Cognito
     *         service makes a request to update user pools.
     */
    public java.util.List<String> getAutoVerifiedAttributes() {
        if (autoVerifiedAttributes == null) {
              autoVerifiedAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              autoVerifiedAttributes.setAutoConstruct(true);
        }
        return autoVerifiedAttributes;
    }
    
    /**
     * The attributes that are automatically verified when the Amazon Cognito
     * service makes a request to update user pools.
     *
     * @param autoVerifiedAttributes The attributes that are automatically verified when the Amazon Cognito
     *         service makes a request to update user pools.
     */
    public void setAutoVerifiedAttributes(java.util.Collection<String> autoVerifiedAttributes) {
        if (autoVerifiedAttributes == null) {
            this.autoVerifiedAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> autoVerifiedAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(autoVerifiedAttributes.size());
        autoVerifiedAttributesCopy.addAll(autoVerifiedAttributes);
        this.autoVerifiedAttributes = autoVerifiedAttributesCopy;
    }
    
    /**
     * The attributes that are automatically verified when the Amazon Cognito
     * service makes a request to update user pools.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoVerifiedAttributes The attributes that are automatically verified when the Amazon Cognito
     *         service makes a request to update user pools.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserPoolRequest withAutoVerifiedAttributes(String... autoVerifiedAttributes) {
        if (getAutoVerifiedAttributes() == null) setAutoVerifiedAttributes(new java.util.ArrayList<String>(autoVerifiedAttributes.length));
        for (String value : autoVerifiedAttributes) {
            getAutoVerifiedAttributes().add(value);
        }
        return this;
    }
    
    /**
     * The attributes that are automatically verified when the Amazon Cognito
     * service makes a request to update user pools.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoVerifiedAttributes The attributes that are automatically verified when the Amazon Cognito
     *         service makes a request to update user pools.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserPoolRequest withAutoVerifiedAttributes(java.util.Collection<String> autoVerifiedAttributes) {
        if (autoVerifiedAttributes == null) {
            this.autoVerifiedAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> autoVerifiedAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(autoVerifiedAttributes.size());
            autoVerifiedAttributesCopy.addAll(autoVerifiedAttributes);
            this.autoVerifiedAttributes = autoVerifiedAttributesCopy;
        }

        return this;
    }

    /**
     * The attributes that are automatically verified when the Amazon Cognito
     * service makes a request to update user pools.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoVerifiedAttributes The attributes that are automatically verified when the Amazon Cognito
     *         service makes a request to update user pools.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserPoolRequest withAutoVerifiedAttributes(VerifiedAttributeType... autoVerifiedAttributes) {
        java.util.ArrayList<String> autoVerifiedAttributesCopy = new java.util.ArrayList<String>(autoVerifiedAttributes.length);
        for (VerifiedAttributeType member : autoVerifiedAttributes) {
            autoVerifiedAttributesCopy.add(member.toString());
        }
        if (getAutoVerifiedAttributes() == null) {
            setAutoVerifiedAttributes(autoVerifiedAttributesCopy);
        } else {
            getAutoVerifiedAttributes().addAll(autoVerifiedAttributesCopy);
        }
        return this;
    }

    /**
     * A container with information about the SMS verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return A container with information about the SMS verification message.
     */
    public String getSmsVerificationMessage() {
        return smsVerificationMessage;
    }
    
    /**
     * A container with information about the SMS verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsVerificationMessage A container with information about the SMS verification message.
     */
    public void setSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }
    
    /**
     * A container with information about the SMS verification message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsVerificationMessage A container with information about the SMS verification message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserPoolRequest withSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
        return this;
    }

    /**
     * The contents of the email verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 2048<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     *
     * @return The contents of the email verification message.
     */
    public String getEmailVerificationMessage() {
        return emailVerificationMessage;
    }
    
    /**
     * The contents of the email verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 2048<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     *
     * @param emailVerificationMessage The contents of the email verification message.
     */
    public void setEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
    }
    
    /**
     * The contents of the email verification message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 2048<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     *
     * @param emailVerificationMessage The contents of the email verification message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserPoolRequest withEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
        return this;
    }

    /**
     * The subject of the email verfication message
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @return The subject of the email verfication message
     */
    public String getEmailVerificationSubject() {
        return emailVerificationSubject;
    }
    
    /**
     * The subject of the email verfication message
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailVerificationSubject The subject of the email verfication message
     */
    public void setEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }
    
    /**
     * The subject of the email verfication message
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailVerificationSubject The subject of the email verfication message
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserPoolRequest withEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
        return this;
    }

    /**
     * The contents of the SMS authentication message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return The contents of the SMS authentication message.
     */
    public String getSmsAuthenticationMessage() {
        return smsAuthenticationMessage;
    }
    
    /**
     * The contents of the SMS authentication message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsAuthenticationMessage The contents of the SMS authentication message.
     */
    public void setSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
    }
    
    /**
     * The contents of the SMS authentication message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsAuthenticationMessage The contents of the SMS authentication message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateUserPoolRequest withSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
        return this;
    }

    /**
     * Can be one of the following values: <ul> <li><code>OFF</code> - MFA
     * tokens are not required and cannot be specified during user
     * registration.</li> <li><code>ON</code> - MFA tokens are required for
     * all user registrations. You can only specify required when you are
     * initially creating a user pool.</li> <li><code>OPTIONAL</code> - Users
     * have the option when registering to create an MFA token.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @return Can be one of the following values: <ul> <li><code>OFF</code> - MFA
     *         tokens are not required and cannot be specified during user
     *         registration.</li> <li><code>ON</code> - MFA tokens are required for
     *         all user registrations. You can only specify required when you are
     *         initially creating a user pool.</li> <li><code>OPTIONAL</code> - Users
     *         have the option when registering to create an MFA token.</li> </ul>
     *
     * @see UserPoolMfaType
     */
    public String getMfaConfiguration() {
        return mfaConfiguration;
    }
    
    /**
     * Can be one of the following values: <ul> <li><code>OFF</code> - MFA
     * tokens are not required and cannot be specified during user
     * registration.</li> <li><code>ON</code> - MFA tokens are required for
     * all user registrations. You can only specify required when you are
     * initially creating a user pool.</li> <li><code>OPTIONAL</code> - Users
     * have the option when registering to create an MFA token.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration Can be one of the following values: <ul> <li><code>OFF</code> - MFA
     *         tokens are not required and cannot be specified during user
     *         registration.</li> <li><code>ON</code> - MFA tokens are required for
     *         all user registrations. You can only specify required when you are
     *         initially creating a user pool.</li> <li><code>OPTIONAL</code> - Users
     *         have the option when registering to create an MFA token.</li> </ul>
     *
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }
    
    /**
     * Can be one of the following values: <ul> <li><code>OFF</code> - MFA
     * tokens are not required and cannot be specified during user
     * registration.</li> <li><code>ON</code> - MFA tokens are required for
     * all user registrations. You can only specify required when you are
     * initially creating a user pool.</li> <li><code>OPTIONAL</code> - Users
     * have the option when registering to create an MFA token.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration Can be one of the following values: <ul> <li><code>OFF</code> - MFA
     *         tokens are not required and cannot be specified during user
     *         registration.</li> <li><code>ON</code> - MFA tokens are required for
     *         all user registrations. You can only specify required when you are
     *         initially creating a user pool.</li> <li><code>OPTIONAL</code> - Users
     *         have the option when registering to create an MFA token.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see UserPoolMfaType
     */
    public UpdateUserPoolRequest withMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
        return this;
    }

    /**
     * Can be one of the following values: <ul> <li><code>OFF</code> - MFA
     * tokens are not required and cannot be specified during user
     * registration.</li> <li><code>ON</code> - MFA tokens are required for
     * all user registrations. You can only specify required when you are
     * initially creating a user pool.</li> <li><code>OPTIONAL</code> - Users
     * have the option when registering to create an MFA token.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration Can be one of the following values: <ul> <li><code>OFF</code> - MFA
     *         tokens are not required and cannot be specified during user
     *         registration.</li> <li><code>ON</code> - MFA tokens are required for
     *         all user registrations. You can only specify required when you are
     *         initially creating a user pool.</li> <li><code>OPTIONAL</code> - Users
     *         have the option when registering to create an MFA token.</li> </ul>
     *
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
    }
    
    /**
     * Can be one of the following values: <ul> <li><code>OFF</code> - MFA
     * tokens are not required and cannot be specified during user
     * registration.</li> <li><code>ON</code> - MFA tokens are required for
     * all user registrations. You can only specify required when you are
     * initially creating a user pool.</li> <li><code>OPTIONAL</code> - Users
     * have the option when registering to create an MFA token.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration Can be one of the following values: <ul> <li><code>OFF</code> - MFA
     *         tokens are not required and cannot be specified during user
     *         registration.</li> <li><code>ON</code> - MFA tokens are required for
     *         all user registrations. You can only specify required when you are
     *         initially creating a user pool.</li> <li><code>OPTIONAL</code> - Users
     *         have the option when registering to create an MFA token.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see UserPoolMfaType
     */
    public UpdateUserPoolRequest withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getUserPoolId() != null) sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getPolicies() != null) sb.append("Policies: " + getPolicies() + ",");
        if (getLambdaConfig() != null) sb.append("LambdaConfig: " + getLambdaConfig() + ",");
        if (getAutoVerifiedAttributes() != null) sb.append("AutoVerifiedAttributes: " + getAutoVerifiedAttributes() + ",");
        if (getSmsVerificationMessage() != null) sb.append("SmsVerificationMessage: " + getSmsVerificationMessage() + ",");
        if (getEmailVerificationMessage() != null) sb.append("EmailVerificationMessage: " + getEmailVerificationMessage() + ",");
        if (getEmailVerificationSubject() != null) sb.append("EmailVerificationSubject: " + getEmailVerificationSubject() + ",");
        if (getSmsAuthenticationMessage() != null) sb.append("SmsAuthenticationMessage: " + getSmsAuthenticationMessage() + ",");
        if (getMfaConfiguration() != null) sb.append("MfaConfiguration: " + getMfaConfiguration() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode()); 
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode()); 
        hashCode = prime * hashCode + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode()); 
        hashCode = prime * hashCode + ((getAutoVerifiedAttributes() == null) ? 0 : getAutoVerifiedAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getSmsVerificationMessage() == null) ? 0 : getSmsVerificationMessage().hashCode()); 
        hashCode = prime * hashCode + ((getEmailVerificationMessage() == null) ? 0 : getEmailVerificationMessage().hashCode()); 
        hashCode = prime * hashCode + ((getEmailVerificationSubject() == null) ? 0 : getEmailVerificationSubject().hashCode()); 
        hashCode = prime * hashCode + ((getSmsAuthenticationMessage() == null) ? 0 : getSmsAuthenticationMessage().hashCode()); 
        hashCode = prime * hashCode + ((getMfaConfiguration() == null) ? 0 : getMfaConfiguration().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateUserPoolRequest == false) return false;
        UpdateUserPoolRequest other = (UpdateUserPoolRequest)obj;
        
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null) return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false) return false; 
        if (other.getPolicies() == null ^ this.getPolicies() == null) return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false) return false; 
        if (other.getLambdaConfig() == null ^ this.getLambdaConfig() == null) return false;
        if (other.getLambdaConfig() != null && other.getLambdaConfig().equals(this.getLambdaConfig()) == false) return false; 
        if (other.getAutoVerifiedAttributes() == null ^ this.getAutoVerifiedAttributes() == null) return false;
        if (other.getAutoVerifiedAttributes() != null && other.getAutoVerifiedAttributes().equals(this.getAutoVerifiedAttributes()) == false) return false; 
        if (other.getSmsVerificationMessage() == null ^ this.getSmsVerificationMessage() == null) return false;
        if (other.getSmsVerificationMessage() != null && other.getSmsVerificationMessage().equals(this.getSmsVerificationMessage()) == false) return false; 
        if (other.getEmailVerificationMessage() == null ^ this.getEmailVerificationMessage() == null) return false;
        if (other.getEmailVerificationMessage() != null && other.getEmailVerificationMessage().equals(this.getEmailVerificationMessage()) == false) return false; 
        if (other.getEmailVerificationSubject() == null ^ this.getEmailVerificationSubject() == null) return false;
        if (other.getEmailVerificationSubject() != null && other.getEmailVerificationSubject().equals(this.getEmailVerificationSubject()) == false) return false; 
        if (other.getSmsAuthenticationMessage() == null ^ this.getSmsAuthenticationMessage() == null) return false;
        if (other.getSmsAuthenticationMessage() != null && other.getSmsAuthenticationMessage().equals(this.getSmsAuthenticationMessage()) == false) return false; 
        if (other.getMfaConfiguration() == null ^ this.getMfaConfiguration() == null) return false;
        if (other.getMfaConfiguration() != null && other.getMfaConfiguration().equals(this.getMfaConfiguration()) == false) return false; 
        return true;
    }
    
}
    