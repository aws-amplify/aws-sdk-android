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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#createUserPool(CreateUserPoolRequest) CreateUserPool operation}.
 * <p>
 * Creates a new Amazon Cognito user pool and sets the password policy
 * for the pool.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#createUserPool(CreateUserPoolRequest)
 */
public class CreateUserPoolRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A string used to name the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String poolName;

    /**
     * The policies associated with the new user pool.
     */
    private UserPoolPolicyType policies;

    /**
     * The Lambda trigger configuration information for the new user pool.
     */
    private LambdaConfigType lambdaConfig;

    /**
     * The attributes to be auto-verified. Possible values: <b>email</b>,
     * <b>phone_number</b>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> autoVerifiedAttributes;

    /**
     * Attributes supported as an alias for this user pool. Possible values:
     * <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> aliasAttributes;

    /**
     * A string representing the SMS verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     */
    private String smsVerificationMessage;

    /**
     * A string representing the email verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 2048<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     */
    private String emailVerificationMessage;

    /**
     * A string representing the email verification subject.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     */
    private String emailVerificationSubject;

    /**
     * A string representing the SMS authentication message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     */
    private String smsAuthenticationMessage;

    /**
     * Specifies MFA configuration details.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     */
    private String mfaConfiguration;

    /**
     * A string used to name the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return A string used to name the user pool.
     */
    public String getPoolName() {
        return poolName;
    }
    
    /**
     * A string used to name the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param poolName A string used to name the user pool.
     */
    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }
    
    /**
     * A string used to name the user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param poolName A string used to name the user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * The policies associated with the new user pool.
     *
     * @return The policies associated with the new user pool.
     */
    public UserPoolPolicyType getPolicies() {
        return policies;
    }
    
    /**
     * The policies associated with the new user pool.
     *
     * @param policies The policies associated with the new user pool.
     */
    public void setPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
    }
    
    /**
     * The policies associated with the new user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policies The policies associated with the new user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
        return this;
    }

    /**
     * The Lambda trigger configuration information for the new user pool.
     *
     * @return The Lambda trigger configuration information for the new user pool.
     */
    public LambdaConfigType getLambdaConfig() {
        return lambdaConfig;
    }
    
    /**
     * The Lambda trigger configuration information for the new user pool.
     *
     * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
     */
    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }
    
    /**
     * The Lambda trigger configuration information for the new user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lambdaConfig The Lambda trigger configuration information for the new user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
        return this;
    }

    /**
     * The attributes to be auto-verified. Possible values: <b>email</b>,
     * <b>phone_number</b>.
     *
     * @return The attributes to be auto-verified. Possible values: <b>email</b>,
     *         <b>phone_number</b>.
     */
    public java.util.List<String> getAutoVerifiedAttributes() {
        if (autoVerifiedAttributes == null) {
              autoVerifiedAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              autoVerifiedAttributes.setAutoConstruct(true);
        }
        return autoVerifiedAttributes;
    }
    
    /**
     * The attributes to be auto-verified. Possible values: <b>email</b>,
     * <b>phone_number</b>.
     *
     * @param autoVerifiedAttributes The attributes to be auto-verified. Possible values: <b>email</b>,
     *         <b>phone_number</b>.
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
     * The attributes to be auto-verified. Possible values: <b>email</b>,
     * <b>phone_number</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoVerifiedAttributes The attributes to be auto-verified. Possible values: <b>email</b>,
     *         <b>phone_number</b>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withAutoVerifiedAttributes(String... autoVerifiedAttributes) {
        if (getAutoVerifiedAttributes() == null) setAutoVerifiedAttributes(new java.util.ArrayList<String>(autoVerifiedAttributes.length));
        for (String value : autoVerifiedAttributes) {
            getAutoVerifiedAttributes().add(value);
        }
        return this;
    }
    
    /**
     * The attributes to be auto-verified. Possible values: <b>email</b>,
     * <b>phone_number</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoVerifiedAttributes The attributes to be auto-verified. Possible values: <b>email</b>,
     *         <b>phone_number</b>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withAutoVerifiedAttributes(java.util.Collection<String> autoVerifiedAttributes) {
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
     * The attributes to be auto-verified. Possible values: <b>email</b>,
     * <b>phone_number</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoVerifiedAttributes The attributes to be auto-verified. Possible values: <b>email</b>,
     *         <b>phone_number</b>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withAutoVerifiedAttributes(VerifiedAttributeType... autoVerifiedAttributes) {
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
     * Attributes supported as an alias for this user pool. Possible values:
     * <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     *
     * @return Attributes supported as an alias for this user pool. Possible values:
     *         <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     */
    public java.util.List<String> getAliasAttributes() {
        if (aliasAttributes == null) {
              aliasAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              aliasAttributes.setAutoConstruct(true);
        }
        return aliasAttributes;
    }
    
    /**
     * Attributes supported as an alias for this user pool. Possible values:
     * <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     *
     * @param aliasAttributes Attributes supported as an alias for this user pool. Possible values:
     *         <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     */
    public void setAliasAttributes(java.util.Collection<String> aliasAttributes) {
        if (aliasAttributes == null) {
            this.aliasAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> aliasAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(aliasAttributes.size());
        aliasAttributesCopy.addAll(aliasAttributes);
        this.aliasAttributes = aliasAttributesCopy;
    }
    
    /**
     * Attributes supported as an alias for this user pool. Possible values:
     * <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliasAttributes Attributes supported as an alias for this user pool. Possible values:
     *         <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withAliasAttributes(String... aliasAttributes) {
        if (getAliasAttributes() == null) setAliasAttributes(new java.util.ArrayList<String>(aliasAttributes.length));
        for (String value : aliasAttributes) {
            getAliasAttributes().add(value);
        }
        return this;
    }
    
    /**
     * Attributes supported as an alias for this user pool. Possible values:
     * <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliasAttributes Attributes supported as an alias for this user pool. Possible values:
     *         <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withAliasAttributes(java.util.Collection<String> aliasAttributes) {
        if (aliasAttributes == null) {
            this.aliasAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> aliasAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(aliasAttributes.size());
            aliasAttributesCopy.addAll(aliasAttributes);
            this.aliasAttributes = aliasAttributesCopy;
        }

        return this;
    }

    /**
     * Attributes supported as an alias for this user pool. Possible values:
     * <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliasAttributes Attributes supported as an alias for this user pool. Possible values:
     *         <b>phone_number</b>, <b>email</b>, or <b>preferred_username</b>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withAliasAttributes(AliasAttributeType... aliasAttributes) {
        java.util.ArrayList<String> aliasAttributesCopy = new java.util.ArrayList<String>(aliasAttributes.length);
        for (AliasAttributeType member : aliasAttributes) {
            aliasAttributesCopy.add(member.toString());
        }
        if (getAliasAttributes() == null) {
            setAliasAttributes(aliasAttributesCopy);
        } else {
            getAliasAttributes().addAll(aliasAttributesCopy);
        }
        return this;
    }

    /**
     * A string representing the SMS verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return A string representing the SMS verification message.
     */
    public String getSmsVerificationMessage() {
        return smsVerificationMessage;
    }
    
    /**
     * A string representing the SMS verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsVerificationMessage A string representing the SMS verification message.
     */
    public void setSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }
    
    /**
     * A string representing the SMS verification message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsVerificationMessage A string representing the SMS verification message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
        return this;
    }

    /**
     * A string representing the email verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 2048<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     *
     * @return A string representing the email verification message.
     */
    public String getEmailVerificationMessage() {
        return emailVerificationMessage;
    }
    
    /**
     * A string representing the email verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 2048<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     *
     * @param emailVerificationMessage A string representing the email verification message.
     */
    public void setEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
    }
    
    /**
     * A string representing the email verification message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 2048<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*\{####\}[\p{L}\p{M}\p{S}\p{N}\p{P}\s*]*<br/>
     *
     * @param emailVerificationMessage A string representing the email verification message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
        return this;
    }

    /**
     * A string representing the email verification subject.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @return A string representing the email verification subject.
     */
    public String getEmailVerificationSubject() {
        return emailVerificationSubject;
    }
    
    /**
     * A string representing the email verification subject.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailVerificationSubject A string representing the email verification subject.
     */
    public void setEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }
    
    /**
     * A string representing the email verification subject.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailVerificationSubject A string representing the email verification subject.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
        return this;
    }

    /**
     * A string representing the SMS authentication message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return A string representing the SMS authentication message.
     */
    public String getSmsAuthenticationMessage() {
        return smsAuthenticationMessage;
    }
    
    /**
     * A string representing the SMS authentication message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsAuthenticationMessage A string representing the SMS authentication message.
     */
    public void setSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
    }
    
    /**
     * A string representing the SMS authentication message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsAuthenticationMessage A string representing the SMS authentication message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateUserPoolRequest withSmsAuthenticationMessage(String smsAuthenticationMessage) {
        this.smsAuthenticationMessage = smsAuthenticationMessage;
        return this;
    }

    /**
     * Specifies MFA configuration details.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @return Specifies MFA configuration details.
     *
     * @see UserPoolMfaType
     */
    public String getMfaConfiguration() {
        return mfaConfiguration;
    }
    
    /**
     * Specifies MFA configuration details.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration Specifies MFA configuration details.
     *
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
    }
    
    /**
     * Specifies MFA configuration details.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration Specifies MFA configuration details.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see UserPoolMfaType
     */
    public CreateUserPoolRequest withMfaConfiguration(String mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration;
        return this;
    }

    /**
     * Specifies MFA configuration details.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration Specifies MFA configuration details.
     *
     * @see UserPoolMfaType
     */
    public void setMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
    }
    
    /**
     * Specifies MFA configuration details.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>OFF, ON, OPTIONAL
     *
     * @param mfaConfiguration Specifies MFA configuration details.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see UserPoolMfaType
     */
    public CreateUserPoolRequest withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
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
        if (getPoolName() != null) sb.append("PoolName: " + getPoolName() + ",");
        if (getPolicies() != null) sb.append("Policies: " + getPolicies() + ",");
        if (getLambdaConfig() != null) sb.append("LambdaConfig: " + getLambdaConfig() + ",");
        if (getAutoVerifiedAttributes() != null) sb.append("AutoVerifiedAttributes: " + getAutoVerifiedAttributes() + ",");
        if (getAliasAttributes() != null) sb.append("AliasAttributes: " + getAliasAttributes() + ",");
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
        
        hashCode = prime * hashCode + ((getPoolName() == null) ? 0 : getPoolName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode()); 
        hashCode = prime * hashCode + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode()); 
        hashCode = prime * hashCode + ((getAutoVerifiedAttributes() == null) ? 0 : getAutoVerifiedAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getAliasAttributes() == null) ? 0 : getAliasAttributes().hashCode()); 
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

        if (obj instanceof CreateUserPoolRequest == false) return false;
        CreateUserPoolRequest other = (CreateUserPoolRequest)obj;
        
        if (other.getPoolName() == null ^ this.getPoolName() == null) return false;
        if (other.getPoolName() != null && other.getPoolName().equals(this.getPoolName()) == false) return false; 
        if (other.getPolicies() == null ^ this.getPolicies() == null) return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false) return false; 
        if (other.getLambdaConfig() == null ^ this.getLambdaConfig() == null) return false;
        if (other.getLambdaConfig() != null && other.getLambdaConfig().equals(this.getLambdaConfig()) == false) return false; 
        if (other.getAutoVerifiedAttributes() == null ^ this.getAutoVerifiedAttributes() == null) return false;
        if (other.getAutoVerifiedAttributes() != null && other.getAutoVerifiedAttributes().equals(this.getAutoVerifiedAttributes()) == false) return false; 
        if (other.getAliasAttributes() == null ^ this.getAliasAttributes() == null) return false;
        if (other.getAliasAttributes() != null && other.getAliasAttributes().equals(this.getAliasAttributes()) == false) return false; 
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
    