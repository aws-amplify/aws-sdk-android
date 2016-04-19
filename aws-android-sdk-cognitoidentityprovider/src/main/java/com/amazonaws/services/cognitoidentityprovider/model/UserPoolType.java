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

/**
 * <p>
 * A container with information about the user pool type.
 * </p>
 */
public class UserPoolType implements Serializable {

    /**
     * The ID of the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     */
    private String id;

    /**
     * The name of the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     */
    private String name;

    /**
     * A container describing the policies associated with a user pool.
     */
    private UserPoolPolicyType policies;

    /**
     * A container describing the AWS Lambda triggers associated with a user
     * pool.
     */
    private LambdaConfigType lambdaConfig;

    /**
     * The status of a user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String status;

    /**
     * The last modified date of a user pool.
     */
    private java.util.Date lastModifiedDate;

    /**
     * The creation date of a user pool.
     */
    private java.util.Date creationDate;

    /**
     * A container with the schema attributes of a user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType> schemaAttributes;

    /**
     * Specifies the attributes that are auto-verified in a user pool.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> autoVerifiedAttributes;

    /**
     * Specifies the attributes that are aliased in a user pool.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> aliasAttributes;

    /**
     * The contents of the SMS verification message.
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
     * The subject of the email verification message.
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
     * A number estimating the size of the user pool.
     */
    private Integer estimatedNumberOfUsers;

    /**
     * The ID of the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @return The ID of the user pool.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param id The ID of the user pool.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 55<br/>
     * <b>Pattern: </b>[\w-]+.[0-9a-zA-Z-]+<br/>
     *
     * @param id The ID of the user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The name of the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @return The name of the user pool.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param name The name of the user pool.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w\s+=,.@-]+<br/>
     *
     * @param name The name of the user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A container describing the policies associated with a user pool.
     *
     * @return A container describing the policies associated with a user pool.
     */
    public UserPoolPolicyType getPolicies() {
        return policies;
    }
    
    /**
     * A container describing the policies associated with a user pool.
     *
     * @param policies A container describing the policies associated with a user pool.
     */
    public void setPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
    }
    
    /**
     * A container describing the policies associated with a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policies A container describing the policies associated with a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withPolicies(UserPoolPolicyType policies) {
        this.policies = policies;
        return this;
    }

    /**
     * A container describing the AWS Lambda triggers associated with a user
     * pool.
     *
     * @return A container describing the AWS Lambda triggers associated with a user
     *         pool.
     */
    public LambdaConfigType getLambdaConfig() {
        return lambdaConfig;
    }
    
    /**
     * A container describing the AWS Lambda triggers associated with a user
     * pool.
     *
     * @param lambdaConfig A container describing the AWS Lambda triggers associated with a user
     *         pool.
     */
    public void setLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }
    
    /**
     * A container describing the AWS Lambda triggers associated with a user
     * pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lambdaConfig A container describing the AWS Lambda triggers associated with a user
     *         pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withLambdaConfig(LambdaConfigType lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
        return this;
    }

    /**
     * The status of a user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return The status of a user pool.
     *
     * @see StatusType
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of a user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status The status of a user pool.
     *
     * @see StatusType
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status The status of a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StatusType
     */
    public UserPoolType withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of a user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status The status of a user pool.
     *
     * @see StatusType
     */
    public void setStatus(StatusType status) {
        this.status = status.toString();
    }
    
    /**
     * The status of a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status The status of a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see StatusType
     */
    public UserPoolType withStatus(StatusType status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The last modified date of a user pool.
     *
     * @return The last modified date of a user pool.
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }
    
    /**
     * The last modified date of a user pool.
     *
     * @param lastModifiedDate The last modified date of a user pool.
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
    
    /**
     * The last modified date of a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModifiedDate The last modified date of a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * The creation date of a user pool.
     *
     * @return The creation date of a user pool.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * The creation date of a user pool.
     *
     * @param creationDate The creation date of a user pool.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * The creation date of a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The creation date of a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * A container with the schema attributes of a user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @return A container with the schema attributes of a user pool.
     */
    public java.util.List<SchemaAttributeType> getSchemaAttributes() {
        if (schemaAttributes == null) {
              schemaAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType>();
              schemaAttributes.setAutoConstruct(true);
        }
        return schemaAttributes;
    }
    
    /**
     * A container with the schema attributes of a user pool.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param schemaAttributes A container with the schema attributes of a user pool.
     */
    public void setSchemaAttributes(java.util.Collection<SchemaAttributeType> schemaAttributes) {
        if (schemaAttributes == null) {
            this.schemaAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType> schemaAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType>(schemaAttributes.size());
        schemaAttributesCopy.addAll(schemaAttributes);
        this.schemaAttributes = schemaAttributesCopy;
    }
    
    /**
     * A container with the schema attributes of a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param schemaAttributes A container with the schema attributes of a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withSchemaAttributes(SchemaAttributeType... schemaAttributes) {
        if (getSchemaAttributes() == null) setSchemaAttributes(new java.util.ArrayList<SchemaAttributeType>(schemaAttributes.length));
        for (SchemaAttributeType value : schemaAttributes) {
            getSchemaAttributes().add(value);
        }
        return this;
    }
    
    /**
     * A container with the schema attributes of a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 50<br/>
     *
     * @param schemaAttributes A container with the schema attributes of a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withSchemaAttributes(java.util.Collection<SchemaAttributeType> schemaAttributes) {
        if (schemaAttributes == null) {
            this.schemaAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType> schemaAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<SchemaAttributeType>(schemaAttributes.size());
            schemaAttributesCopy.addAll(schemaAttributes);
            this.schemaAttributes = schemaAttributesCopy;
        }

        return this;
    }

    /**
     * Specifies the attributes that are auto-verified in a user pool.
     *
     * @return Specifies the attributes that are auto-verified in a user pool.
     */
    public java.util.List<String> getAutoVerifiedAttributes() {
        if (autoVerifiedAttributes == null) {
              autoVerifiedAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              autoVerifiedAttributes.setAutoConstruct(true);
        }
        return autoVerifiedAttributes;
    }
    
    /**
     * Specifies the attributes that are auto-verified in a user pool.
     *
     * @param autoVerifiedAttributes Specifies the attributes that are auto-verified in a user pool.
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
     * Specifies the attributes that are auto-verified in a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoVerifiedAttributes Specifies the attributes that are auto-verified in a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withAutoVerifiedAttributes(String... autoVerifiedAttributes) {
        if (getAutoVerifiedAttributes() == null) setAutoVerifiedAttributes(new java.util.ArrayList<String>(autoVerifiedAttributes.length));
        for (String value : autoVerifiedAttributes) {
            getAutoVerifiedAttributes().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the attributes that are auto-verified in a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoVerifiedAttributes Specifies the attributes that are auto-verified in a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withAutoVerifiedAttributes(java.util.Collection<String> autoVerifiedAttributes) {
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
     * Specifies the attributes that are auto-verified in a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param autoVerifiedAttributes Specifies the attributes that are auto-verified in a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withAutoVerifiedAttributes(VerifiedAttributeType... autoVerifiedAttributes) {
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
     * Specifies the attributes that are aliased in a user pool.
     *
     * @return Specifies the attributes that are aliased in a user pool.
     */
    public java.util.List<String> getAliasAttributes() {
        if (aliasAttributes == null) {
              aliasAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              aliasAttributes.setAutoConstruct(true);
        }
        return aliasAttributes;
    }
    
    /**
     * Specifies the attributes that are aliased in a user pool.
     *
     * @param aliasAttributes Specifies the attributes that are aliased in a user pool.
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
     * Specifies the attributes that are aliased in a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliasAttributes Specifies the attributes that are aliased in a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withAliasAttributes(String... aliasAttributes) {
        if (getAliasAttributes() == null) setAliasAttributes(new java.util.ArrayList<String>(aliasAttributes.length));
        for (String value : aliasAttributes) {
            getAliasAttributes().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the attributes that are aliased in a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliasAttributes Specifies the attributes that are aliased in a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withAliasAttributes(java.util.Collection<String> aliasAttributes) {
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
     * Specifies the attributes that are aliased in a user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param aliasAttributes Specifies the attributes that are aliased in a user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withAliasAttributes(AliasAttributeType... aliasAttributes) {
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
     * The contents of the SMS verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @return The contents of the SMS verification message.
     */
    public String getSmsVerificationMessage() {
        return smsVerificationMessage;
    }
    
    /**
     * The contents of the SMS verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsVerificationMessage The contents of the SMS verification message.
     */
    public void setSmsVerificationMessage(String smsVerificationMessage) {
        this.smsVerificationMessage = smsVerificationMessage;
    }
    
    /**
     * The contents of the SMS verification message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 140<br/>
     * <b>Pattern: </b>.*\{####\}.*<br/>
     *
     * @param smsVerificationMessage The contents of the SMS verification message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withSmsVerificationMessage(String smsVerificationMessage) {
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
    public UserPoolType withEmailVerificationMessage(String emailVerificationMessage) {
        this.emailVerificationMessage = emailVerificationMessage;
        return this;
    }

    /**
     * The subject of the email verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @return The subject of the email verification message.
     */
    public String getEmailVerificationSubject() {
        return emailVerificationSubject;
    }
    
    /**
     * The subject of the email verification message.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailVerificationSubject The subject of the email verification message.
     */
    public void setEmailVerificationSubject(String emailVerificationSubject) {
        this.emailVerificationSubject = emailVerificationSubject;
    }
    
    /**
     * The subject of the email verification message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}\s]+<br/>
     *
     * @param emailVerificationSubject The subject of the email verification message.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withEmailVerificationSubject(String emailVerificationSubject) {
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
    public UserPoolType withSmsAuthenticationMessage(String smsAuthenticationMessage) {
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
    public UserPoolType withMfaConfiguration(String mfaConfiguration) {
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
    public UserPoolType withMfaConfiguration(UserPoolMfaType mfaConfiguration) {
        this.mfaConfiguration = mfaConfiguration.toString();
        return this;
    }

    /**
     * A number estimating the size of the user pool.
     *
     * @return A number estimating the size of the user pool.
     */
    public Integer getEstimatedNumberOfUsers() {
        return estimatedNumberOfUsers;
    }
    
    /**
     * A number estimating the size of the user pool.
     *
     * @param estimatedNumberOfUsers A number estimating the size of the user pool.
     */
    public void setEstimatedNumberOfUsers(Integer estimatedNumberOfUsers) {
        this.estimatedNumberOfUsers = estimatedNumberOfUsers;
    }
    
    /**
     * A number estimating the size of the user pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param estimatedNumberOfUsers A number estimating the size of the user pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserPoolType withEstimatedNumberOfUsers(Integer estimatedNumberOfUsers) {
        this.estimatedNumberOfUsers = estimatedNumberOfUsers;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getPolicies() != null) sb.append("Policies: " + getPolicies() + ",");
        if (getLambdaConfig() != null) sb.append("LambdaConfig: " + getLambdaConfig() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getLastModifiedDate() != null) sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getSchemaAttributes() != null) sb.append("SchemaAttributes: " + getSchemaAttributes() + ",");
        if (getAutoVerifiedAttributes() != null) sb.append("AutoVerifiedAttributes: " + getAutoVerifiedAttributes() + ",");
        if (getAliasAttributes() != null) sb.append("AliasAttributes: " + getAliasAttributes() + ",");
        if (getSmsVerificationMessage() != null) sb.append("SmsVerificationMessage: " + getSmsVerificationMessage() + ",");
        if (getEmailVerificationMessage() != null) sb.append("EmailVerificationMessage: " + getEmailVerificationMessage() + ",");
        if (getEmailVerificationSubject() != null) sb.append("EmailVerificationSubject: " + getEmailVerificationSubject() + ",");
        if (getSmsAuthenticationMessage() != null) sb.append("SmsAuthenticationMessage: " + getSmsAuthenticationMessage() + ",");
        if (getMfaConfiguration() != null) sb.append("MfaConfiguration: " + getMfaConfiguration() + ",");
        if (getEstimatedNumberOfUsers() != null) sb.append("EstimatedNumberOfUsers: " + getEstimatedNumberOfUsers() );
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
        hashCode = prime * hashCode + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((getSchemaAttributes() == null) ? 0 : getSchemaAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getAutoVerifiedAttributes() == null) ? 0 : getAutoVerifiedAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getAliasAttributes() == null) ? 0 : getAliasAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getSmsVerificationMessage() == null) ? 0 : getSmsVerificationMessage().hashCode()); 
        hashCode = prime * hashCode + ((getEmailVerificationMessage() == null) ? 0 : getEmailVerificationMessage().hashCode()); 
        hashCode = prime * hashCode + ((getEmailVerificationSubject() == null) ? 0 : getEmailVerificationSubject().hashCode()); 
        hashCode = prime * hashCode + ((getSmsAuthenticationMessage() == null) ? 0 : getSmsAuthenticationMessage().hashCode()); 
        hashCode = prime * hashCode + ((getMfaConfiguration() == null) ? 0 : getMfaConfiguration().hashCode()); 
        hashCode = prime * hashCode + ((getEstimatedNumberOfUsers() == null) ? 0 : getEstimatedNumberOfUsers().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UserPoolType == false) return false;
        UserPoolType other = (UserPoolType)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getPolicies() == null ^ this.getPolicies() == null) return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false) return false; 
        if (other.getLambdaConfig() == null ^ this.getLambdaConfig() == null) return false;
        if (other.getLambdaConfig() != null && other.getLambdaConfig().equals(this.getLambdaConfig()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null) return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getSchemaAttributes() == null ^ this.getSchemaAttributes() == null) return false;
        if (other.getSchemaAttributes() != null && other.getSchemaAttributes().equals(this.getSchemaAttributes()) == false) return false; 
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
        if (other.getEstimatedNumberOfUsers() == null ^ this.getEstimatedNumberOfUsers() == null) return false;
        if (other.getEstimatedNumberOfUsers() != null && other.getEstimatedNumberOfUsers().equals(this.getEstimatedNumberOfUsers()) == false) return false; 
        return true;
    }
    
}
    