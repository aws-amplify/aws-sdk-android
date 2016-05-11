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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/**
 * Get Caller Identity Result
 */
public class GetCallerIdentityResult implements Serializable {

    private String userId;

    private String account;

    private String arn;

    /**
     * Returns the value of the UserId property for this object.
     *
     * @return The value of the UserId property for this object.
     */
    public String getUserId() {
        return userId;
    }
    
    /**
     * Sets the value of the UserId property for this object.
     *
     * @param userId The new value for the UserId property for this object.
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    /**
     * Sets the value of the UserId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userId The new value for the UserId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetCallerIdentityResult withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Returns the value of the Account property for this object.
     *
     * @return The value of the Account property for this object.
     */
    public String getAccount() {
        return account;
    }
    
    /**
     * Sets the value of the Account property for this object.
     *
     * @param account The new value for the Account property for this object.
     */
    public void setAccount(String account) {
        this.account = account;
    }
    
    /**
     * Sets the value of the Account property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param account The new value for the Account property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetCallerIdentityResult withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * Returns the value of the Arn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u007E&#92;u0085&#92;u00A0-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;u10000-&#92;u10FFFF]+<br/>
     *
     * @return The value of the Arn property for this object.
     */
    public String getArn() {
        return arn;
    }
    
    /**
     * Sets the value of the Arn property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u007E&#92;u0085&#92;u00A0-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;u10000-&#92;u10FFFF]+<br/>
     *
     * @param arn The new value for the Arn property for this object.
     */
    public void setArn(String arn) {
        this.arn = arn;
    }
    
    /**
     * Sets the value of the Arn property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u007E&#92;u0085&#92;u00A0-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;u10000-&#92;u10FFFF]+<br/>
     *
     * @param arn The new value for the Arn property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetCallerIdentityResult withArn(String arn) {
        this.arn = arn;
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
        if (getUserId() != null) sb.append("UserId: " + getUserId() + ",");
        if (getAccount() != null) sb.append("Account: " + getAccount() + ",");
        if (getArn() != null) sb.append("Arn: " + getArn() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode()); 
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode()); 
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetCallerIdentityResult == false) return false;
        GetCallerIdentityResult other = (GetCallerIdentityResult)obj;
        
        if (other.getUserId() == null ^ this.getUserId() == null) return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false) return false; 
        if (other.getAccount() == null ^ this.getAccount() == null) return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false) return false; 
        if (other.getArn() == null ^ this.getArn() == null) return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false) return false; 
        return true;
    }
    
}
    