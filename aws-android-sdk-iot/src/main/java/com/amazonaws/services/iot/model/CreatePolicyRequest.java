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
 * Container for the parameters to the {@link com.amazonaws.services.iot.AWSIot#createPolicy(CreatePolicyRequest) CreatePolicy operation}.
 * <p>
 * Creates an AWS IoT policy.
 * </p>
 * <p>
 * The created policy is the default version for the policy. This
 * operation creates a policy version with a version identifier of
 * <b>1</b> and sets <b>1</b> as the policy's default version.
 * </p>
 *
 * @see com.amazonaws.services.iot.AWSIot#createPolicy(CreatePolicyRequest)
 */
public class CreatePolicyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The policy name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * The JSON document that describes the policy. The length of the
     * <b>policyDocument</b> must be a minimum length of 1, with a maximum
     * length of 2048, excluding whitespace.
     */
    private String policyDocument;

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
    public CreatePolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The JSON document that describes the policy. The length of the
     * <b>policyDocument</b> must be a minimum length of 1, with a maximum
     * length of 2048, excluding whitespace.
     *
     * @return The JSON document that describes the policy. The length of the
     *         <b>policyDocument</b> must be a minimum length of 1, with a maximum
     *         length of 2048, excluding whitespace.
     */
    public String getPolicyDocument() {
        return policyDocument;
    }
    
    /**
     * The JSON document that describes the policy. The length of the
     * <b>policyDocument</b> must be a minimum length of 1, with a maximum
     * length of 2048, excluding whitespace.
     *
     * @param policyDocument The JSON document that describes the policy. The length of the
     *         <b>policyDocument</b> must be a minimum length of 1, with a maximum
     *         length of 2048, excluding whitespace.
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }
    
    /**
     * The JSON document that describes the policy. The length of the
     * <b>policyDocument</b> must be a minimum length of 1, with a maximum
     * length of 2048, excluding whitespace.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyDocument The JSON document that describes the policy. The length of the
     *         <b>policyDocument</b> must be a minimum length of 1, with a maximum
     *         length of 2048, excluding whitespace.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePolicyRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
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
        if (getPolicyDocument() != null) sb.append("PolicyDocument: " + getPolicyDocument() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePolicyRequest == false) return false;
        CreatePolicyRequest other = (CreatePolicyRequest)obj;
        
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null) return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false) return false; 
        return true;
    }
    
}
    