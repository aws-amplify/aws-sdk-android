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
 * Represents the response from the server from the request to get the
 * specified user as an administrator.
 * </p>
 */
public class AdminGetUserResult implements Serializable {

    /**
     * The user name of the user about whom you are receiving information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * An array of name-value pairs representing user attributes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> userAttributes;

    /**
     * The date the user was created.
     */
    private java.util.Date userCreateDate;

    /**
     * The date the user was last modified.
     */
    private java.util.Date userLastModifiedDate;

    /**
     * Indicates that the status is enabled.
     */
    private Boolean enabled;

    /**
     * The user status. Can be one of the following: <ul> <li>UNCONFIRMED -
     * User has been created but not confirmed.</li> <li>CONFIRMED - User has
     * been confirmed.</li> <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security
     * threat.</li> <li>UNKNOWN - User status is not known.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN
     */
    private String userStatus;

    /**
     * Specifies the options for MFA (e.g., email or phone number).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType> mFAOptions;

    /**
     * The user name of the user about whom you are receiving information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return The user name of the user about whom you are receiving information.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name of the user about whom you are receiving information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user about whom you are receiving information.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name of the user about whom you are receiving information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user about whom you are receiving information.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminGetUserResult withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * An array of name-value pairs representing user attributes.
     *
     * @return An array of name-value pairs representing user attributes.
     */
    public java.util.List<AttributeType> getUserAttributes() {
        if (userAttributes == null) {
              userAttributes = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>();
              userAttributes.setAutoConstruct(true);
        }
        return userAttributes;
    }
    
    /**
     * An array of name-value pairs representing user attributes.
     *
     * @param userAttributes An array of name-value pairs representing user attributes.
     */
    public void setUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> userAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>(userAttributes.size());
        userAttributesCopy.addAll(userAttributes);
        this.userAttributes = userAttributesCopy;
    }
    
    /**
     * An array of name-value pairs representing user attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userAttributes An array of name-value pairs representing user attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminGetUserResult withUserAttributes(AttributeType... userAttributes) {
        if (getUserAttributes() == null) setUserAttributes(new java.util.ArrayList<AttributeType>(userAttributes.length));
        for (AttributeType value : userAttributes) {
            getUserAttributes().add(value);
        }
        return this;
    }
    
    /**
     * An array of name-value pairs representing user attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userAttributes An array of name-value pairs representing user attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminGetUserResult withUserAttributes(java.util.Collection<AttributeType> userAttributes) {
        if (userAttributes == null) {
            this.userAttributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> userAttributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>(userAttributes.size());
            userAttributesCopy.addAll(userAttributes);
            this.userAttributes = userAttributesCopy;
        }

        return this;
    }

    /**
     * The date the user was created.
     *
     * @return The date the user was created.
     */
    public java.util.Date getUserCreateDate() {
        return userCreateDate;
    }
    
    /**
     * The date the user was created.
     *
     * @param userCreateDate The date the user was created.
     */
    public void setUserCreateDate(java.util.Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }
    
    /**
     * The date the user was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userCreateDate The date the user was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminGetUserResult withUserCreateDate(java.util.Date userCreateDate) {
        this.userCreateDate = userCreateDate;
        return this;
    }

    /**
     * The date the user was last modified.
     *
     * @return The date the user was last modified.
     */
    public java.util.Date getUserLastModifiedDate() {
        return userLastModifiedDate;
    }
    
    /**
     * The date the user was last modified.
     *
     * @param userLastModifiedDate The date the user was last modified.
     */
    public void setUserLastModifiedDate(java.util.Date userLastModifiedDate) {
        this.userLastModifiedDate = userLastModifiedDate;
    }
    
    /**
     * The date the user was last modified.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userLastModifiedDate The date the user was last modified.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminGetUserResult withUserLastModifiedDate(java.util.Date userLastModifiedDate) {
        this.userLastModifiedDate = userLastModifiedDate;
        return this;
    }

    /**
     * Indicates that the status is enabled.
     *
     * @return Indicates that the status is enabled.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Indicates that the status is enabled.
     *
     * @param enabled Indicates that the status is enabled.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Indicates that the status is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Indicates that the status is enabled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminGetUserResult withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Indicates that the status is enabled.
     *
     * @return Indicates that the status is enabled.
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * The user status. Can be one of the following: <ul> <li>UNCONFIRMED -
     * User has been created but not confirmed.</li> <li>CONFIRMED - User has
     * been confirmed.</li> <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security
     * threat.</li> <li>UNKNOWN - User status is not known.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN
     *
     * @return The user status. Can be one of the following: <ul> <li>UNCONFIRMED -
     *         User has been created but not confirmed.</li> <li>CONFIRMED - User has
     *         been confirmed.</li> <li>ARCHIVED - User is no longer active.</li>
     *         <li>COMPROMISED - User is disabled due to a potential security
     *         threat.</li> <li>UNKNOWN - User status is not known.</li> </ul>
     *
     * @see UserStatusType
     */
    public String getUserStatus() {
        return userStatus;
    }
    
    /**
     * The user status. Can be one of the following: <ul> <li>UNCONFIRMED -
     * User has been created but not confirmed.</li> <li>CONFIRMED - User has
     * been confirmed.</li> <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security
     * threat.</li> <li>UNKNOWN - User status is not known.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN
     *
     * @param userStatus The user status. Can be one of the following: <ul> <li>UNCONFIRMED -
     *         User has been created but not confirmed.</li> <li>CONFIRMED - User has
     *         been confirmed.</li> <li>ARCHIVED - User is no longer active.</li>
     *         <li>COMPROMISED - User is disabled due to a potential security
     *         threat.</li> <li>UNKNOWN - User status is not known.</li> </ul>
     *
     * @see UserStatusType
     */
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    
    /**
     * The user status. Can be one of the following: <ul> <li>UNCONFIRMED -
     * User has been created but not confirmed.</li> <li>CONFIRMED - User has
     * been confirmed.</li> <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security
     * threat.</li> <li>UNKNOWN - User status is not known.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN
     *
     * @param userStatus The user status. Can be one of the following: <ul> <li>UNCONFIRMED -
     *         User has been created but not confirmed.</li> <li>CONFIRMED - User has
     *         been confirmed.</li> <li>ARCHIVED - User is no longer active.</li>
     *         <li>COMPROMISED - User is disabled due to a potential security
     *         threat.</li> <li>UNKNOWN - User status is not known.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see UserStatusType
     */
    public AdminGetUserResult withUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    /**
     * The user status. Can be one of the following: <ul> <li>UNCONFIRMED -
     * User has been created but not confirmed.</li> <li>CONFIRMED - User has
     * been confirmed.</li> <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security
     * threat.</li> <li>UNKNOWN - User status is not known.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN
     *
     * @param userStatus The user status. Can be one of the following: <ul> <li>UNCONFIRMED -
     *         User has been created but not confirmed.</li> <li>CONFIRMED - User has
     *         been confirmed.</li> <li>ARCHIVED - User is no longer active.</li>
     *         <li>COMPROMISED - User is disabled due to a potential security
     *         threat.</li> <li>UNKNOWN - User status is not known.</li> </ul>
     *
     * @see UserStatusType
     */
    public void setUserStatus(UserStatusType userStatus) {
        this.userStatus = userStatus.toString();
    }
    
    /**
     * The user status. Can be one of the following: <ul> <li>UNCONFIRMED -
     * User has been created but not confirmed.</li> <li>CONFIRMED - User has
     * been confirmed.</li> <li>ARCHIVED - User is no longer active.</li>
     * <li>COMPROMISED - User is disabled due to a potential security
     * threat.</li> <li>UNKNOWN - User status is not known.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>UNCONFIRMED, CONFIRMED, ARCHIVED, COMPROMISED, UNKNOWN
     *
     * @param userStatus The user status. Can be one of the following: <ul> <li>UNCONFIRMED -
     *         User has been created but not confirmed.</li> <li>CONFIRMED - User has
     *         been confirmed.</li> <li>ARCHIVED - User is no longer active.</li>
     *         <li>COMPROMISED - User is disabled due to a potential security
     *         threat.</li> <li>UNKNOWN - User status is not known.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see UserStatusType
     */
    public AdminGetUserResult withUserStatus(UserStatusType userStatus) {
        this.userStatus = userStatus.toString();
        return this;
    }

    /**
     * Specifies the options for MFA (e.g., email or phone number).
     *
     * @return Specifies the options for MFA (e.g., email or phone number).
     */
    public java.util.List<MFAOptionType> getMFAOptions() {
        if (mFAOptions == null) {
              mFAOptions = new com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType>();
              mFAOptions.setAutoConstruct(true);
        }
        return mFAOptions;
    }
    
    /**
     * Specifies the options for MFA (e.g., email or phone number).
     *
     * @param mFAOptions Specifies the options for MFA (e.g., email or phone number).
     */
    public void setMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        if (mFAOptions == null) {
            this.mFAOptions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType> mFAOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType>(mFAOptions.size());
        mFAOptionsCopy.addAll(mFAOptions);
        this.mFAOptions = mFAOptionsCopy;
    }
    
    /**
     * Specifies the options for MFA (e.g., email or phone number).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mFAOptions Specifies the options for MFA (e.g., email or phone number).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminGetUserResult withMFAOptions(MFAOptionType... mFAOptions) {
        if (getMFAOptions() == null) setMFAOptions(new java.util.ArrayList<MFAOptionType>(mFAOptions.length));
        for (MFAOptionType value : mFAOptions) {
            getMFAOptions().add(value);
        }
        return this;
    }
    
    /**
     * Specifies the options for MFA (e.g., email or phone number).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param mFAOptions Specifies the options for MFA (e.g., email or phone number).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AdminGetUserResult withMFAOptions(java.util.Collection<MFAOptionType> mFAOptions) {
        if (mFAOptions == null) {
            this.mFAOptions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType> mFAOptionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<MFAOptionType>(mFAOptions.size());
            mFAOptionsCopy.addAll(mFAOptions);
            this.mFAOptions = mFAOptionsCopy;
        }

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
        if (getUsername() != null) sb.append("Username: " + getUsername() + ",");
        if (getUserAttributes() != null) sb.append("UserAttributes: " + getUserAttributes() + ",");
        if (getUserCreateDate() != null) sb.append("UserCreateDate: " + getUserCreateDate() + ",");
        if (getUserLastModifiedDate() != null) sb.append("UserLastModifiedDate: " + getUserLastModifiedDate() + ",");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() + ",");
        if (getUserStatus() != null) sb.append("UserStatus: " + getUserStatus() + ",");
        if (getMFAOptions() != null) sb.append("MFAOptions: " + getMFAOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        hashCode = prime * hashCode + ((getUserAttributes() == null) ? 0 : getUserAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getUserCreateDate() == null) ? 0 : getUserCreateDate().hashCode()); 
        hashCode = prime * hashCode + ((getUserLastModifiedDate() == null) ? 0 : getUserLastModifiedDate().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode()); 
        hashCode = prime * hashCode + ((getMFAOptions() == null) ? 0 : getMFAOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AdminGetUserResult == false) return false;
        AdminGetUserResult other = (AdminGetUserResult)obj;
        
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getUserAttributes() == null ^ this.getUserAttributes() == null) return false;
        if (other.getUserAttributes() != null && other.getUserAttributes().equals(this.getUserAttributes()) == false) return false; 
        if (other.getUserCreateDate() == null ^ this.getUserCreateDate() == null) return false;
        if (other.getUserCreateDate() != null && other.getUserCreateDate().equals(this.getUserCreateDate()) == false) return false; 
        if (other.getUserLastModifiedDate() == null ^ this.getUserLastModifiedDate() == null) return false;
        if (other.getUserLastModifiedDate() != null && other.getUserLastModifiedDate().equals(this.getUserLastModifiedDate()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getUserStatus() == null ^ this.getUserStatus() == null) return false;
        if (other.getUserStatus() != null && other.getUserStatus().equals(this.getUserStatus()) == false) return false; 
        if (other.getMFAOptions() == null ^ this.getMFAOptions() == null) return false;
        if (other.getMFAOptions() != null && other.getMFAOptions().equals(this.getMFAOptions()) == false) return false; 
        return true;
    }
    
}
    