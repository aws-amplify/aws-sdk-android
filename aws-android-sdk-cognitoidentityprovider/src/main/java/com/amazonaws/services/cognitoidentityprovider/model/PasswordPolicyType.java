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
 * The password policy type.
 * </p>
 */
public class PasswordPolicyType implements Serializable {

    /**
     * The minimum length of the password policy that you have set. Cannot be
     * less than 6.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 99<br/>
     */
    private Integer minimumLength;

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one uppercase letter in their password.
     */
    private Boolean requireUppercase;

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one lowercase letter in their password.
     */
    private Boolean requireLowercase;

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one number in their password.
     */
    private Boolean requireNumbers;

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one symbol in their password.
     */
    private Boolean requireSymbols;

    /**
     * The minimum length of the password policy that you have set. Cannot be
     * less than 6.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 99<br/>
     *
     * @return The minimum length of the password policy that you have set. Cannot be
     *         less than 6.
     */
    public Integer getMinimumLength() {
        return minimumLength;
    }
    
    /**
     * The minimum length of the password policy that you have set. Cannot be
     * less than 6.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 99<br/>
     *
     * @param minimumLength The minimum length of the password policy that you have set. Cannot be
     *         less than 6.
     */
    public void setMinimumLength(Integer minimumLength) {
        this.minimumLength = minimumLength;
    }
    
    /**
     * The minimum length of the password policy that you have set. Cannot be
     * less than 6.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>6 - 99<br/>
     *
     * @param minimumLength The minimum length of the password policy that you have set. Cannot be
     *         less than 6.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicyType withMinimumLength(Integer minimumLength) {
        this.minimumLength = minimumLength;
        return this;
    }

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one uppercase letter in their password.
     *
     * @return In the password policy that you have set, refers to whether you have
     *         required users to use at least one uppercase letter in their password.
     */
    public Boolean isRequireUppercase() {
        return requireUppercase;
    }
    
    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one uppercase letter in their password.
     *
     * @param requireUppercase In the password policy that you have set, refers to whether you have
     *         required users to use at least one uppercase letter in their password.
     */
    public void setRequireUppercase(Boolean requireUppercase) {
        this.requireUppercase = requireUppercase;
    }
    
    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one uppercase letter in their password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireUppercase In the password policy that you have set, refers to whether you have
     *         required users to use at least one uppercase letter in their password.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicyType withRequireUppercase(Boolean requireUppercase) {
        this.requireUppercase = requireUppercase;
        return this;
    }

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one uppercase letter in their password.
     *
     * @return In the password policy that you have set, refers to whether you have
     *         required users to use at least one uppercase letter in their password.
     */
    public Boolean getRequireUppercase() {
        return requireUppercase;
    }

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one lowercase letter in their password.
     *
     * @return In the password policy that you have set, refers to whether you have
     *         required users to use at least one lowercase letter in their password.
     */
    public Boolean isRequireLowercase() {
        return requireLowercase;
    }
    
    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one lowercase letter in their password.
     *
     * @param requireLowercase In the password policy that you have set, refers to whether you have
     *         required users to use at least one lowercase letter in their password.
     */
    public void setRequireLowercase(Boolean requireLowercase) {
        this.requireLowercase = requireLowercase;
    }
    
    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one lowercase letter in their password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireLowercase In the password policy that you have set, refers to whether you have
     *         required users to use at least one lowercase letter in their password.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicyType withRequireLowercase(Boolean requireLowercase) {
        this.requireLowercase = requireLowercase;
        return this;
    }

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one lowercase letter in their password.
     *
     * @return In the password policy that you have set, refers to whether you have
     *         required users to use at least one lowercase letter in their password.
     */
    public Boolean getRequireLowercase() {
        return requireLowercase;
    }

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one number in their password.
     *
     * @return In the password policy that you have set, refers to whether you have
     *         required users to use at least one number in their password.
     */
    public Boolean isRequireNumbers() {
        return requireNumbers;
    }
    
    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one number in their password.
     *
     * @param requireNumbers In the password policy that you have set, refers to whether you have
     *         required users to use at least one number in their password.
     */
    public void setRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
    }
    
    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one number in their password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireNumbers In the password policy that you have set, refers to whether you have
     *         required users to use at least one number in their password.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicyType withRequireNumbers(Boolean requireNumbers) {
        this.requireNumbers = requireNumbers;
        return this;
    }

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one number in their password.
     *
     * @return In the password policy that you have set, refers to whether you have
     *         required users to use at least one number in their password.
     */
    public Boolean getRequireNumbers() {
        return requireNumbers;
    }

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one symbol in their password.
     *
     * @return In the password policy that you have set, refers to whether you have
     *         required users to use at least one symbol in their password.
     */
    public Boolean isRequireSymbols() {
        return requireSymbols;
    }
    
    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one symbol in their password.
     *
     * @param requireSymbols In the password policy that you have set, refers to whether you have
     *         required users to use at least one symbol in their password.
     */
    public void setRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
    }
    
    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one symbol in their password.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requireSymbols In the password policy that you have set, refers to whether you have
     *         required users to use at least one symbol in their password.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public PasswordPolicyType withRequireSymbols(Boolean requireSymbols) {
        this.requireSymbols = requireSymbols;
        return this;
    }

    /**
     * In the password policy that you have set, refers to whether you have
     * required users to use at least one symbol in their password.
     *
     * @return In the password policy that you have set, refers to whether you have
     *         required users to use at least one symbol in their password.
     */
    public Boolean getRequireSymbols() {
        return requireSymbols;
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
        if (getMinimumLength() != null) sb.append("MinimumLength: " + getMinimumLength() + ",");
        if (isRequireUppercase() != null) sb.append("RequireUppercase: " + isRequireUppercase() + ",");
        if (isRequireLowercase() != null) sb.append("RequireLowercase: " + isRequireLowercase() + ",");
        if (isRequireNumbers() != null) sb.append("RequireNumbers: " + isRequireNumbers() + ",");
        if (isRequireSymbols() != null) sb.append("RequireSymbols: " + isRequireSymbols() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMinimumLength() == null) ? 0 : getMinimumLength().hashCode()); 
        hashCode = prime * hashCode + ((isRequireUppercase() == null) ? 0 : isRequireUppercase().hashCode()); 
        hashCode = prime * hashCode + ((isRequireLowercase() == null) ? 0 : isRequireLowercase().hashCode()); 
        hashCode = prime * hashCode + ((isRequireNumbers() == null) ? 0 : isRequireNumbers().hashCode()); 
        hashCode = prime * hashCode + ((isRequireSymbols() == null) ? 0 : isRequireSymbols().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PasswordPolicyType == false) return false;
        PasswordPolicyType other = (PasswordPolicyType)obj;
        
        if (other.getMinimumLength() == null ^ this.getMinimumLength() == null) return false;
        if (other.getMinimumLength() != null && other.getMinimumLength().equals(this.getMinimumLength()) == false) return false; 
        if (other.isRequireUppercase() == null ^ this.isRequireUppercase() == null) return false;
        if (other.isRequireUppercase() != null && other.isRequireUppercase().equals(this.isRequireUppercase()) == false) return false; 
        if (other.isRequireLowercase() == null ^ this.isRequireLowercase() == null) return false;
        if (other.isRequireLowercase() != null && other.isRequireLowercase().equals(this.isRequireLowercase()) == false) return false; 
        if (other.isRequireNumbers() == null ^ this.isRequireNumbers() == null) return false;
        if (other.isRequireNumbers() != null && other.isRequireNumbers().equals(this.isRequireNumbers()) == false) return false; 
        if (other.isRequireSymbols() == null ^ this.isRequireSymbols() == null) return false;
        if (other.isRequireSymbols() != null && other.isRequireSymbols().equals(this.isRequireSymbols()) == false) return false; 
        return true;
    }
    
}
    