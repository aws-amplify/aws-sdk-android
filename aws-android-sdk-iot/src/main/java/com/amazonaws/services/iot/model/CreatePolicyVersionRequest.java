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
 * Container for the parameters to the {@link com.amazonaws.services.iot.AWSIot#createPolicyVersion(CreatePolicyVersionRequest) CreatePolicyVersion operation}.
 * <p>
 * Creates a new version of the specified AWS IoT policy. To update a
 * policy, create a new policy version. A managed policy can have up to
 * five versions. If the policy has five versions, you must delete an
 * existing version using DeletePolicyVersion before you create a new
 * version.
 * </p>
 * <p>
 * Optionally, you can set the new version as the policy's default
 * version. The default version is the operative version; that is, the
 * version that is in effect for the certificates that the policy is
 * attached to.
 * </p>
 *
 * @see com.amazonaws.services.iot.AWSIot#createPolicyVersion(CreatePolicyVersionRequest)
 */
public class CreatePolicyVersionRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The policy name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * The JSON document that describes the policy. Minimum length of 1.
     * Maximum length of 2048 excluding whitespaces
     */
    private String policyDocument;

    /**
     * Specifies whether the policy version is set as the default. When this
     * parameter is true, the new policy version becomes the operative
     * version; that is, the version that is in effect for the certificates
     * that the policy is attached to.
     */
    private Boolean setAsDefault;

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
    public CreatePolicyVersionRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * The JSON document that describes the policy. Minimum length of 1.
     * Maximum length of 2048 excluding whitespaces
     *
     * @return The JSON document that describes the policy. Minimum length of 1.
     *         Maximum length of 2048 excluding whitespaces
     */
    public String getPolicyDocument() {
        return policyDocument;
    }
    
    /**
     * The JSON document that describes the policy. Minimum length of 1.
     * Maximum length of 2048 excluding whitespaces
     *
     * @param policyDocument The JSON document that describes the policy. Minimum length of 1.
     *         Maximum length of 2048 excluding whitespaces
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }
    
    /**
     * The JSON document that describes the policy. Minimum length of 1.
     * Maximum length of 2048 excluding whitespaces
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyDocument The JSON document that describes the policy. Minimum length of 1.
     *         Maximum length of 2048 excluding whitespaces
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePolicyVersionRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * Specifies whether the policy version is set as the default. When this
     * parameter is true, the new policy version becomes the operative
     * version; that is, the version that is in effect for the certificates
     * that the policy is attached to.
     *
     * @return Specifies whether the policy version is set as the default. When this
     *         parameter is true, the new policy version becomes the operative
     *         version; that is, the version that is in effect for the certificates
     *         that the policy is attached to.
     */
    public Boolean isSetAsDefault() {
        return setAsDefault;
    }
    
    /**
     * Specifies whether the policy version is set as the default. When this
     * parameter is true, the new policy version becomes the operative
     * version; that is, the version that is in effect for the certificates
     * that the policy is attached to.
     *
     * @param setAsDefault Specifies whether the policy version is set as the default. When this
     *         parameter is true, the new policy version becomes the operative
     *         version; that is, the version that is in effect for the certificates
     *         that the policy is attached to.
     */
    public void setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
    }
    
    /**
     * Specifies whether the policy version is set as the default. When this
     * parameter is true, the new policy version becomes the operative
     * version; that is, the version that is in effect for the certificates
     * that the policy is attached to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param setAsDefault Specifies whether the policy version is set as the default. When this
     *         parameter is true, the new policy version becomes the operative
     *         version; that is, the version that is in effect for the certificates
     *         that the policy is attached to.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreatePolicyVersionRequest withSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
        return this;
    }

    /**
     * Specifies whether the policy version is set as the default. When this
     * parameter is true, the new policy version becomes the operative
     * version; that is, the version that is in effect for the certificates
     * that the policy is attached to.
     *
     * @return Specifies whether the policy version is set as the default. When this
     *         parameter is true, the new policy version becomes the operative
     *         version; that is, the version that is in effect for the certificates
     *         that the policy is attached to.
     */
    public Boolean getSetAsDefault() {
        return setAsDefault;
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
        if (getPolicyDocument() != null) sb.append("PolicyDocument: " + getPolicyDocument() + ",");
        if (isSetAsDefault() != null) sb.append("SetAsDefault: " + isSetAsDefault() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode()); 
        hashCode = prime * hashCode + ((isSetAsDefault() == null) ? 0 : isSetAsDefault().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreatePolicyVersionRequest == false) return false;
        CreatePolicyVersionRequest other = (CreatePolicyVersionRequest)obj;
        
        if (other.getPolicyName() == null ^ this.getPolicyName() == null) return false;
        if (other.getPolicyName() != null && other.getPolicyName().equals(this.getPolicyName()) == false) return false; 
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null) return false;
        if (other.getPolicyDocument() != null && other.getPolicyDocument().equals(this.getPolicyDocument()) == false) return false; 
        if (other.isSetAsDefault() == null ^ this.isSetAsDefault() == null) return false;
        if (other.isSetAsDefault() != null && other.isSetAsDefault().equals(this.isSetAsDefault()) == false) return false; 
        return true;
    }
    
}
    