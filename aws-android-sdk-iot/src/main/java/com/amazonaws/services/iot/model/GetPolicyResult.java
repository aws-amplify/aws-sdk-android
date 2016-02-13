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

/**
 * <p>
 * The output from the GetPolicy operation.
 * </p>
 */
public class GetPolicyResult implements Serializable {

    /**
     * The policy name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * The policy ARN.
     */
    private String policyArn;

    /**
     * The JSON document that describes the policy.
     */
    private String policyDocument;

    /**
     * The default policy version ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String defaultVersionId;

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
    public GetPolicyResult withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The policy ARN.
     *
     * @return The policy ARN.
     */
    public String getPolicyArn() {
        return policyArn;
    }
    
    /**
     * The policy ARN.
     *
     * @param policyArn The policy ARN.
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }
    
    /**
     * The policy ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyArn The policy ARN.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetPolicyResult withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * The JSON document that describes the policy.
     *
     * @return The JSON document that describes the policy.
     */
    public String getPolicyDocument() {
        return policyDocument;
    }
    
    /**
     * The JSON document that describes the policy.
     *
     * @param policyDocument The JSON document that describes the policy.
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }
    
    /**
     * The JSON document that describes the policy.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyDocument The JSON document that describes the policy.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetPolicyResult withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * The default policy version ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return The default policy version ID.
     */
    public String getDefaultVersionId() {
        return defaultVersionId;
    }
    
    /**
     * The default policy version ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param defaultVersionId The default policy version ID.
     */
    public void setDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
    }
    
    /**
     * The default policy version ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param defaultVersionId The default policy version ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetPolicyResult withDefaultVersionId(String defaultVersionId) {
        this.defaultVersionId = defaultVersionId;
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
        if (getPolicyArn() != null) sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getPolicyDocument() != null) sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getDefaultVersionId() != null) sb.append("DefaultVersionId: " + getDefaultVersionId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultVersionId() == null) ? 0 : getDefaultVersionId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetPolicyResult == false) return false;
        GetPolicyResult other = (GetPolicyResult)obj;
        
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null) return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false) return false; 
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null) return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false) return false; 
        if (other.getDefaultVersionId() == null ^ this.getDefaultVersionId() == null) return false;
        if (other.getDefaultVersionId() != null && other.getDefaultVersionId().equals(this.getDefaultVersionId()) == false) return false; 
        return true;
    }
    
}
    