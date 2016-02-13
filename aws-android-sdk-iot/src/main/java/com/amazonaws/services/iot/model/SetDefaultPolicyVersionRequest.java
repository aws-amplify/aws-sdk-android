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
package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.iot.AWSIot#setDefaultPolicyVersion(SetDefaultPolicyVersionRequest) SetDefaultPolicyVersion operation}.
 * <p>
 * Sets the specified version of the specified policy as the policy's
 * default (operative) version. This action affects all certificates that
 * the policy is attached to. To list the principals the policy is
 * attached to, use the ListPrincipalPolicy API.
 * </p>
 *
 * @see com.amazonaws.services.iot.AWSIot#setDefaultPolicyVersion(SetDefaultPolicyVersionRequest)
 */
public class SetDefaultPolicyVersionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The policy name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * The policy version ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String policyVersionId;

    /**
     * The policy name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return The policy name.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The policy name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName The policy name.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The policy name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName The policy name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetDefaultPolicyVersionRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The policy version ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return The policy version ID.
     */
    public String getPolicyVersionId() {
        return policyVersionId;
    }
    
    /**
     * The policy version ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param policyVersionId The policy version ID.
     */
    public void setPolicyVersionId(String policyVersionId) {
        this.policyVersionId = policyVersionId;
    }
    
    /**
     * The policy version ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param policyVersionId The policy version ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public SetDefaultPolicyVersionRequest withPolicyVersionId(String policyVersionId) {
        this.policyVersionId = policyVersionId;
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
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyVersionId() != null) sb.append("PolicyVersionId: " + getPolicyVersionId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyVersionId() == null) ? 0 : getPolicyVersionId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetDefaultPolicyVersionRequest == false) return false;
        SetDefaultPolicyVersionRequest other = (SetDefaultPolicyVersionRequest)obj;
        
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPolicyVersionId() == null ^ this.getPolicyVersionId() == null) return false;
        if (other.getPolicyVersionId() != null && other.getPolicyVersionId().equals(this.getPolicyVersionId()) == false) return false; 
        return true;
    }
    
}
    