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
 * The user type.
 * </p>
 */
public class UserType implements Serializable {

    /**
     * The user name of the user you wish to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     */
    private String username;

    /**
     * A container with information about the user type attributes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> attributes;

    /**
     * The creation date of the user.
     */
    private java.util.Date userCreateDate;

    /**
     * The last modified date of the user.
     */
    private java.util.Date userLastModifiedDate;

    /**
     * Specifies whether the user is enabled.
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
     * The user name of the user you wish to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @return The user name of the user you wish to describe.
     */
    public String getUsername() {
        return username;
    }
    
    /**
     * The user name of the user you wish to describe.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user you wish to describe.
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
     * The user name of the user you wish to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\p{L}\p{M}\p{S}\p{N}\p{P}]+<br/>
     *
     * @param username The user name of the user you wish to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserType withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * A container with information about the user type attributes.
     *
     * @return A container with information about the user type attributes.
     */
    public java.util.List<AttributeType> getAttributes() {
        if (attributes == null) {
              attributes = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>();
              attributes.setAutoConstruct(true);
        }
        return attributes;
    }
    
    /**
     * A container with information about the user type attributes.
     *
     * @param attributes A container with information about the user type attributes.
     */
    public void setAttributes(java.util.Collection<AttributeType> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> attributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>(attributes.size());
        attributesCopy.addAll(attributes);
        this.attributes = attributesCopy;
    }
    
    /**
     * A container with information about the user type attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes A container with information about the user type attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserType withAttributes(AttributeType... attributes) {
        if (getAttributes() == null) setAttributes(new java.util.ArrayList<AttributeType>(attributes.length));
        for (AttributeType value : attributes) {
            getAttributes().add(value);
        }
        return this;
    }
    
    /**
     * A container with information about the user type attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes A container with information about the user type attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserType withAttributes(java.util.Collection<AttributeType> attributes) {
        if (attributes == null) {
            this.attributes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType> attributesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttributeType>(attributes.size());
            attributesCopy.addAll(attributes);
            this.attributes = attributesCopy;
        }

        return this;
    }

    /**
     * The creation date of the user.
     *
     * @return The creation date of the user.
     */
    public java.util.Date getUserCreateDate() {
        return userCreateDate;
    }
    
    /**
     * The creation date of the user.
     *
     * @param userCreateDate The creation date of the user.
     */
    public void setUserCreateDate(java.util.Date userCreateDate) {
        this.userCreateDate = userCreateDate;
    }
    
    /**
     * The creation date of the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userCreateDate The creation date of the user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserType withUserCreateDate(java.util.Date userCreateDate) {
        this.userCreateDate = userCreateDate;
        return this;
    }

    /**
     * The last modified date of the user.
     *
     * @return The last modified date of the user.
     */
    public java.util.Date getUserLastModifiedDate() {
        return userLastModifiedDate;
    }
    
    /**
     * The last modified date of the user.
     *
     * @param userLastModifiedDate The last modified date of the user.
     */
    public void setUserLastModifiedDate(java.util.Date userLastModifiedDate) {
        this.userLastModifiedDate = userLastModifiedDate;
    }
    
    /**
     * The last modified date of the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userLastModifiedDate The last modified date of the user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserType withUserLastModifiedDate(java.util.Date userLastModifiedDate) {
        this.userLastModifiedDate = userLastModifiedDate;
        return this;
    }

    /**
     * Specifies whether the user is enabled.
     *
     * @return Specifies whether the user is enabled.
     */
    public Boolean isEnabled() {
        return enabled;
    }
    
    /**
     * Specifies whether the user is enabled.
     *
     * @param enabled Specifies whether the user is enabled.
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    
    /**
     * Specifies whether the user is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enabled Specifies whether the user is enabled.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UserType withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Specifies whether the user is enabled.
     *
     * @return Specifies whether the user is enabled.
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
    public UserType withUserStatus(String userStatus) {
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
    public UserType withUserStatus(UserStatusType userStatus) {
        this.userStatus = userStatus.toString();
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
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");
        if (getUserCreateDate() != null) sb.append("UserCreateDate: " + getUserCreateDate() + ",");
        if (getUserLastModifiedDate() != null) sb.append("UserLastModifiedDate: " + getUserLastModifiedDate() + ",");
        if (isEnabled() != null) sb.append("Enabled: " + isEnabled() + ",");
        if (getUserStatus() != null) sb.append("UserStatus: " + getUserStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getUserCreateDate() == null) ? 0 : getUserCreateDate().hashCode()); 
        hashCode = prime * hashCode + ((getUserLastModifiedDate() == null) ? 0 : getUserLastModifiedDate().hashCode()); 
        hashCode = prime * hashCode + ((isEnabled() == null) ? 0 : isEnabled().hashCode()); 
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UserType == false) return false;
        UserType other = (UserType)obj;
        
        if (other.getUsername() == null ^ this.getUsername() == null) return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getUserCreateDate() == null ^ this.getUserCreateDate() == null) return false;
        if (other.getUserCreateDate() != null && other.getUserCreateDate().equals(this.getUserCreateDate()) == false) return false; 
        if (other.getUserLastModifiedDate() == null ^ this.getUserLastModifiedDate() == null) return false;
        if (other.getUserLastModifiedDate() != null && other.getUserLastModifiedDate().equals(this.getUserLastModifiedDate()) == false) return false; 
        if (other.isEnabled() == null ^ this.isEnabled() == null) return false;
        if (other.isEnabled() != null && other.isEnabled().equals(this.isEnabled()) == false) return false; 
        if (other.getUserStatus() == null ^ this.getUserStatus() == null) return false;
        if (other.getUserStatus() != null && other.getUserStatus().equals(this.getUserStatus()) == false) return false; 
        return true;
    }
    
}
    