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
 * The output of the CreatePolicyVersion operation.
 * </p>
 */
public class CreatePolicyVersionResult implements Serializable {

    /**
     * The policy ARN.
     */
    private String policyArn;

    /**
     * The JSON document that describes the policy.
     */
    private String policyDocument;

    /**
     * The policy version ID.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String policyVersionId;

    /**
     * Specifies whether the policy version is the default.
     */
    private Boolean isDefaultVersion;

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
    public CreatePolicyVersionResult withPolicyArn(String policyArn) {
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
    public CreatePolicyVersionResult withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
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
    public CreatePolicyVersionResult withPolicyVersionId(String policyVersionId) {
        this.policyVersionId = policyVersionId;
        return this;
    }

    /**
     * Specifies whether the policy version is the default.
     *
     * @return Specifies whether the policy version is the default.
     */
    public Boolean isDefaultVersion() {
        return isDefaultVersion;
    }
    
    /**
     * Specifies whether the policy version is the default.
     *
     * @param isDefaultVersion Specifies whether the policy version is the default.
     */
    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }
    
    /**
     * Specifies whether the policy version is the default.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isDefaultVersion Specifies whether the policy version is the default.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePolicyVersionResult withIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
        return this;
    }

    /**
     * Specifies whether the policy version is the default.
     *
     * @return Specifies whether the policy version is the default.
     */
    public Boolean getIsDefaultVersion() {
        return isDefaultVersion;
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
        if (getPolicyArn() != null) sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getPolicyDocument() != null) sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (getPolicyVersionId() != null) sb.append("PolicyVersionId: " + getPolicyVersionId() + ",");
        if (isDefaultVersion() != null) sb.append("IsDefaultVersion: " + isDefaultVersion() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyVersionId() == null) ? 0 : getPolicyVersionId().hashCode()); 
        hashCode = prime * hashCode + ((isDefaultVersion() == null) ? 0 : isDefaultVersion().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePolicyVersionResult == false) return false;
        CreatePolicyVersionResult other = (CreatePolicyVersionResult)obj;
        
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null) return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false) return false; 
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null) return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false) return false; 
        if (other.getPolicyVersionId() == null ^ this.getPolicyVersionId() == null) return false;
        if (other.getPolicyVersionId() != null && other.getPolicyVersionId().equals(this.getPolicyVersionId()) == false) return false; 
        if (other.isDefaultVersion() == null ^ this.isDefaultVersion() == null) return false;
        if (other.isDefaultVersion() != null && other.isDefaultVersion().equals(this.isDefaultVersion()) == false) return false; 
        return true;
    }
    
}
    