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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new version of the specified AWS IoT policy. To update a policy,
 * create a new policy version. A managed policy can have up to five versions.
 * If the policy has five versions, you must use <a>DeletePolicyVersion</a> to
 * delete an existing version before you create a new one.
 * </p>
 * <p>
 * Optionally, you can set the new version as the policy's default version. The
 * default version is the operative version (that is, the version that is in
 * effect for the certificates to which the policy is attached).
 * </p>
 */
public class CreatePolicyVersionRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The JSON document that describes the policy. Minimum length of 1. Maximum
     * length of 2048, excluding whitespace.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * Specifies whether the policy version is set as the default. When this
     * parameter is true, the new policy version becomes the operative version
     * (that is, the version that is in effect for the certificates to which the
     * policy is attached).
     * </p>
     */
    private Boolean setAsDefault;

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
    public CreatePolicyVersionRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The JSON document that describes the policy. Minimum length of 1. Maximum
     * length of 2048, excluding whitespace.
     * </p>
     *
     * @return <p>
     *         The JSON document that describes the policy. Minimum length of 1.
     *         Maximum length of 2048, excluding whitespace.
     *         </p>
     */
    public String getPolicyDocument() {
        return policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy. Minimum length of 1. Maximum
     * length of 2048, excluding whitespace.
     * </p>
     *
     * @param policyDocument <p>
     *            The JSON document that describes the policy. Minimum length of
     *            1. Maximum length of 2048, excluding whitespace.
     *            </p>
     */
    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The JSON document that describes the policy. Minimum length of 1. Maximum
     * length of 2048, excluding whitespace.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyDocument <p>
     *            The JSON document that describes the policy. Minimum length of
     *            1. Maximum length of 2048, excluding whitespace.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyVersionRequest withPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the default. When this
     * parameter is true, the new policy version becomes the operative version
     * (that is, the version that is in effect for the certificates to which the
     * policy is attached).
     * </p>
     *
     * @return <p>
     *         Specifies whether the policy version is set as the default. When
     *         this parameter is true, the new policy version becomes the
     *         operative version (that is, the version that is in effect for the
     *         certificates to which the policy is attached).
     *         </p>
     */
    public Boolean isSetAsDefault() {
        return setAsDefault;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the default. When this
     * parameter is true, the new policy version becomes the operative version
     * (that is, the version that is in effect for the certificates to which the
     * policy is attached).
     * </p>
     *
     * @return <p>
     *         Specifies whether the policy version is set as the default. When
     *         this parameter is true, the new policy version becomes the
     *         operative version (that is, the version that is in effect for the
     *         certificates to which the policy is attached).
     *         </p>
     */
    public Boolean getSetAsDefault() {
        return setAsDefault;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the default. When this
     * parameter is true, the new policy version becomes the operative version
     * (that is, the version that is in effect for the certificates to which the
     * policy is attached).
     * </p>
     *
     * @param setAsDefault <p>
     *            Specifies whether the policy version is set as the default.
     *            When this parameter is true, the new policy version becomes
     *            the operative version (that is, the version that is in effect
     *            for the certificates to which the policy is attached).
     *            </p>
     */
    public void setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
    }

    /**
     * <p>
     * Specifies whether the policy version is set as the default. When this
     * parameter is true, the new policy version becomes the operative version
     * (that is, the version that is in effect for the certificates to which the
     * policy is attached).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param setAsDefault <p>
     *            Specifies whether the policy version is set as the default.
     *            When this parameter is true, the new policy version becomes
     *            the operative version (that is, the version that is in effect
     *            for the certificates to which the policy is attached).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreatePolicyVersionRequest withSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
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
        if (getPolicyName() != null)
            sb.append("policyName: " + getPolicyName() + ",");
        if (getPolicyDocument() != null)
            sb.append("policyDocument: " + getPolicyDocument() + ",");
        if (getSetAsDefault() != null)
            sb.append("setAsDefault: " + getSetAsDefault());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument().hashCode());
        hashCode = prime * hashCode
                + ((getSetAsDefault() == null) ? 0 : getSetAsDefault().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreatePolicyVersionRequest == false)
            return false;
        CreatePolicyVersionRequest other = (CreatePolicyVersionRequest) obj;

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
        if (other.getSetAsDefault() == null ^ this.getSetAsDefault() == null)
            return false;
        if (other.getSetAsDefault() != null
                && other.getSetAsDefault().equals(this.getSetAsDefault()) == false)
            return false;
        return true;
    }
}
