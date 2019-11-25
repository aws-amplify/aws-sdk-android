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
 * The output from the GetPolicyVersion operation.
 * </p>
 */
public class GetPolicyVersionResult implements Serializable {
    /**
     * <p>
     * The policy ARN.
     * </p>
     */
    private String policyArn;

    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

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
     * The date the policy version was created.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The date the policy version was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The generation ID of the policy version.
     * </p>
     */
    private String generationId;

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
    public GetPolicyVersionResult withPolicyArn(String policyArn) {
        this.policyArn = policyArn;
        return this;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The policy name.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName <p>
     *            The policy name.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The policy name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName <p>
     *            The policy name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPolicyVersionResult withPolicyName(String policyName) {
        this.policyName = policyName;
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
    public GetPolicyVersionResult withPolicyDocument(String policyDocument) {
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
    public GetPolicyVersionResult withPolicyVersionId(String policyVersionId) {
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
    public GetPolicyVersionResult withIsDefaultVersion(Boolean isDefaultVersion) {
        this.isDefaultVersion = isDefaultVersion;
        return this;
    }

    /**
     * <p>
     * The date the policy version was created.
     * </p>
     *
     * @return <p>
     *         The date the policy version was created.
     *         </p>
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }

    /**
     * <p>
     * The date the policy version was created.
     * </p>
     *
     * @param creationDate <p>
     *            The date the policy version was created.
     *            </p>
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date the policy version was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param creationDate <p>
     *            The date the policy version was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPolicyVersionResult withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * <p>
     * The date the policy version was last modified.
     * </p>
     *
     * @return <p>
     *         The date the policy version was last modified.
     *         </p>
     */
    public java.util.Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * <p>
     * The date the policy version was last modified.
     * </p>
     *
     * @param lastModifiedDate <p>
     *            The date the policy version was last modified.
     *            </p>
     */
    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date the policy version was last modified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lastModifiedDate <p>
     *            The date the policy version was last modified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPolicyVersionResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
        return this;
    }

    /**
     * <p>
     * The generation ID of the policy version.
     * </p>
     *
     * @return <p>
     *         The generation ID of the policy version.
     *         </p>
     */
    public String getGenerationId() {
        return generationId;
    }

    /**
     * <p>
     * The generation ID of the policy version.
     * </p>
     *
     * @param generationId <p>
     *            The generation ID of the policy version.
     *            </p>
     */
    public void setGenerationId(String generationId) {
        this.generationId = generationId;
    }

    /**
     * <p>
     * The generation ID of the policy version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param generationId <p>
     *            The generation ID of the policy version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetPolicyVersionResult withGenerationId(String generationId) {
        this.generationId = generationId;
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
        if (getPolicyName() != null)
            sb.append("policyName: " + getPolicyName() + ",");
        if (getPolicyDocument() != null)
            sb.append("policyDocument: " + getPolicyDocument() + ",");
        if (getPolicyVersionId() != null)
            sb.append("policyVersionId: " + getPolicyVersionId() + ",");
        if (getIsDefaultVersion() != null)
            sb.append("isDefaultVersion: " + getIsDefaultVersion() + ",");
        if (getCreationDate() != null)
            sb.append("creationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        if (getGenerationId() != null)
            sb.append("generationId: " + getGenerationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyVersionId() == null) ? 0 : getPolicyVersionId().hashCode());
        hashCode = prime * hashCode
                + ((getIsDefaultVersion() == null) ? 0 : getIsDefaultVersion().hashCode());
        hashCode = prime * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode
                + ((getGenerationId() == null) ? 0 : getGenerationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPolicyVersionResult == false)
            return false;
        GetPolicyVersionResult other = (GetPolicyVersionResult) obj;

        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
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
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getGenerationId() == null ^ this.getGenerationId() == null)
            return false;
        if (other.getGenerationId() != null
                && other.getGenerationId().equals(this.getGenerationId()) == false)
            return false;
        return true;
    }
}
