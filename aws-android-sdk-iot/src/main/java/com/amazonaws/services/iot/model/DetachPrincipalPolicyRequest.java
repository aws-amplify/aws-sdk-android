/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Removes the specified policy from the specified certificate.
 * </p>
 */
public class DetachPrincipalPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the policy to detach.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * <p>
     * The principal.
     * </p>
     * <p>
     * If the principal is a certificate, specify the certificate ARN. If the
     * principal is an Amazon Cognito identity, specify the identity ID.
     * </p>
     */
    private String principal;

    /**
     * <p>
     * The name of the policy to detach.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the policy to detach.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the policy to detach.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName <p>
     *            The name of the policy to detach.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy to detach.
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
     *            The name of the policy to detach.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachPrincipalPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The principal.
     * </p>
     * <p>
     * If the principal is a certificate, specify the certificate ARN. If the
     * principal is an Amazon Cognito identity, specify the identity ID.
     * </p>
     *
     * @return <p>
     *         The principal.
     *         </p>
     *         <p>
     *         If the principal is a certificate, specify the certificate ARN.
     *         If the principal is an Amazon Cognito identity, specify the
     *         identity ID.
     *         </p>
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * <p>
     * The principal.
     * </p>
     * <p>
     * If the principal is a certificate, specify the certificate ARN. If the
     * principal is an Amazon Cognito identity, specify the identity ID.
     * </p>
     *
     * @param principal <p>
     *            The principal.
     *            </p>
     *            <p>
     *            If the principal is a certificate, specify the certificate
     *            ARN. If the principal is an Amazon Cognito identity, specify
     *            the identity ID.
     *            </p>
     */
    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * The principal.
     * </p>
     * <p>
     * If the principal is a certificate, specify the certificate ARN. If the
     * principal is an Amazon Cognito identity, specify the identity ID.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param principal <p>
     *            The principal.
     *            </p>
     *            <p>
     *            If the principal is a certificate, specify the certificate
     *            ARN. If the principal is an Amazon Cognito identity, specify
     *            the identity ID.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachPrincipalPolicyRequest withPrincipal(String principal) {
        this.principal = principal;
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
        if (getPrincipal() != null)
            sb.append("principal: " + getPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachPrincipalPolicyRequest == false)
            return false;
        DetachPrincipalPolicyRequest other = (DetachPrincipalPolicyRequest) obj;

        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null
                && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        return true;
    }
}
