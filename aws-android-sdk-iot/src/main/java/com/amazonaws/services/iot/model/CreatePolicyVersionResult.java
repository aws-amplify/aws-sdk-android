/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * <p>
     * The policy ARN.
     * </p>
     */
    private String policyArn;

    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * The policy version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     */
    private String policyVersionId;

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     */
    private Boolean isDefaultVersion;

    /**
     * <p>
     * The policy ARN.
     * </p>
     *
     * @return <p>
     *         The policy ARN.
     *         </p>
     */
    public String getPolicyArn() {
        return policyArn;
    }

    /**
     * <p>
     * The policy ARN.
     * </p>
     *
     * @param policyArn <p>
     *            The policy ARN.
     *            </p>
     */
    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The policy ARN.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyArn <p>
     *            The policy ARN.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyVersionResult withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     *
     * @return <p>
     *         The JSON document that describes the policy.
     *         </p>
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     *
     * @param policyDocument <p>
     *            The JSON document that describes the policy.
     *            </p>
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDocument <p>
     *            The JSON document that describes the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyVersionResult withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * <p>
     * The policy version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @return <p>
     *         The policy version ID.
     *         </p>
     */
    public String getPolicyVersionId() {
        return policyVersionId;
    }

    /**
     * <p>
     * The policy version ID.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param policyVersionId <p>
     *            The policy version ID.
     *            </p>
     */
    public void setPolicyVersionId(String policyVersionId) {
        this.policyVersionId = policyVersionId;
    }

    /**
     * <p>
     * The policy version ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]+<br/>
     *
     * @param policyVersionId <p>
     *            The policy version ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyVersionResult withPolicyVersionId(String policyVersionId) {
        this.policyVersionId = policyVersionId;
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     *
     * @return <p>
     *         Specifies whether the policy version is the default.
     *         </p>
     */
    public Boolean isIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     *
     * @return <p>
     *         Specifies whether the policy version is the default.
     *         </p>
     */
    public Boolean getIsDefaultVersion() {
        return isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     *
     * @param isDefaultVersion <p>
     *            Specifies whether the policy version is the default.
     *            </p>
     */
    public void setIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
    }

    /**
     * <p>
     * Specifies whether the policy version is the default.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isDefaultVersion <p>
     *            Specifies whether the policy version is the default.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyVersionResult withIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPolicyArn() != null)
            sb.append("policyArn: " + getPolicyArn() + ",");
        if (getPolicyDocument() != null)
            sb.append("policyDocument: " + getPolicyDocument() + ",");
        if (getPolicyVersionId() != null)
            sb.append("policyVersionId: " + getPolicyVersionId() + ",");
        if (getIsDefaultVersion() != null)
            sb.append("isDefaultVersion: " + getIsDefaultVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyVersionId() == null) ? 0 : getPolicyVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyVersionResult == false)
            return false;
        CreatePolicyVersionResult other = (CreatePolicyVersionResult) obj;

        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getPolicyDocument() == null ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        if (other.getPolicyVersionId() == null ^ this.getPolicyVersionId() == null)
            return false;
        if (other.getPolicyVersionId() != null
                && other.getPolicyVersionId().equals(this.getPolicyVersionId()) == false)
            return false;
        if (other.getIsDefaultVersion() == null ^ this.getIsDefaultVersion() == null)
            return false;
        if (other.getIsDefaultVersion() != null
                && other.getIsDefaultVersion().equals(this.getIsDefaultVersion()) == false)
            return false;
        return true;
    }
}
