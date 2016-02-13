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
 * Container for the parameters to the {@link com.amazonaws.services.iot.AWSIot#deletePolicy(DeletePolicyRequest) DeletePolicy operation}.
 * <p>
 * Deletes the specified policy.
 * </p>
 * <p>
 * A policy cannot be deleted if it has non-default versions and/or it is
 * attached to any certificate.
 * </p>
 * <p>
 * To delete a policy, delete all non-default versions of the policy
 * using the DeletePolicyVersion API, detach the policy from any
 * certificate using the DetachPrincipalPolicy API, and then use the
 * DeletePolicy API to delete the policy.
 * </p>
 * <p>
 * When a policy is deleted using DeletePolicy, its default version is
 * deleted with it.
 * </p>
 *
 * @see com.amazonaws.services.iot.AWSIot#deletePolicy(DeletePolicyRequest)
 */
public class DeletePolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the policy to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * The name of the policy to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return The name of the policy to delete.
     */
    public String getPolicyName() {
        return policyName;
    }
    
    /**
     * The name of the policy to delete.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName The name of the policy to delete.
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }
    
    /**
     * The name of the policy to delete.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName The name of the policy to delete.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeletePolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
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
        if (getPolicyName() != null) sb.append("PolicyName: " + getPolicyName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeletePolicyRequest == false) return false;
        DeletePolicyRequest other = (DeletePolicyRequest)obj;
        
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        return true;
    }
    
}
    