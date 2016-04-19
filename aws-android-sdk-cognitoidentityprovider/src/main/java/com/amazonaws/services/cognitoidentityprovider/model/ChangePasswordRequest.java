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
 * Container for the parameters to the {@link com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#changePassword(ChangePasswordRequest) ChangePassword operation}.
 * <p>
 * Changes the password for a specified user in a user pool.
 * </p>
 *
 * @see com.amazonaws.services.cognitoidentityprovider.AmazonCognitoIdentityProvider#changePassword(ChangePasswordRequest)
 */
public class ChangePasswordRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The old password in the change password request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String previousPassword;

    /**
     * The new password in the change password request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     */
    private String proposedPassword;

    /**
     * The access token in the change password request.
     */
    private String accessToken;

    /**
     * The old password in the change password request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return The old password in the change password request.
     */
    public String getPreviousPassword() {
        return previousPassword;
    }
    
    /**
     * The old password in the change password request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param previousPassword The old password in the change password request.
     */
    public void setPreviousPassword(String previousPassword) {
        this.previousPassword = previousPassword;
    }
    
    /**
     * The old password in the change password request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param previousPassword The old password in the change password request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangePasswordRequest withPreviousPassword(String previousPassword) {
        this.previousPassword = previousPassword;
        return this;
    }

    /**
     * The new password in the change password request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @return The new password in the change password request.
     */
    public String getProposedPassword() {
        return proposedPassword;
    }
    
    /**
     * The new password in the change password request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param proposedPassword The new password in the change password request.
     */
    public void setProposedPassword(String proposedPassword) {
        this.proposedPassword = proposedPassword;
    }
    
    /**
     * The new password in the change password request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 256<br/>
     * <b>Pattern: </b>[\S]+<br/>
     *
     * @param proposedPassword The new password in the change password request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangePasswordRequest withProposedPassword(String proposedPassword) {
        this.proposedPassword = proposedPassword;
        return this;
    }

    /**
     * The access token in the change password request.
     *
     * @return The access token in the change password request.
     */
    public String getAccessToken() {
        return accessToken;
    }
    
    /**
     * The access token in the change password request.
     *
     * @param accessToken The access token in the change password request.
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
    /**
     * The access token in the change password request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessToken The access token in the change password request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ChangePasswordRequest withAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
        if (getPreviousPassword() != null) sb.append("PreviousPassword: " + getPreviousPassword() + ",");
        if (getProposedPassword() != null) sb.append("ProposedPassword: " + getProposedPassword() + ",");
        if (getAccessToken() != null) sb.append("AccessToken: " + getAccessToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPreviousPassword() == null) ? 0 : getPreviousPassword().hashCode()); 
        hashCode = prime * hashCode + ((getProposedPassword() == null) ? 0 : getProposedPassword().hashCode()); 
        hashCode = prime * hashCode + ((getAccessToken() == null) ? 0 : getAccessToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangePasswordRequest == false) return false;
        ChangePasswordRequest other = (ChangePasswordRequest)obj;
        
        if (other.getPreviousPassword() == null ^ this.getPreviousPassword() == null) return false;
        if (other.getPreviousPassword() != null && other.getPreviousPassword().equals(this.getPreviousPassword()) == false) return false; 
        if (other.getProposedPassword() == null ^ this.getProposedPassword() == null) return false;
        if (other.getProposedPassword() != null && other.getProposedPassword().equals(this.getProposedPassword()) == false) return false; 
        if (other.getAccessToken() == null ^ this.getAccessToken() == null) return false;
        if (other.getAccessToken() != null && other.getAccessToken().equals(this.getAccessToken()) == false) return false; 
        return true;
    }
    
}
    