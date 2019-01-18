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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Adds or updates a sending authorization policy for the specified identity (an
 * email address or a domain).
 * </p>
 * <note>
 * <p>
 * This API is for the identity owner only. If you have not verified the
 * identity, this API will return an error.
 * </p>
 * </note>
 * <p>
 * Sending authorization is a feature that enables an identity owner to
 * authorize other senders to use its identities. For information about using
 * sending authorization, see the <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization.html"
 * >Amazon SES Developer Guide</a>.
 * </p>
 * <p>
 * You can execute this operation no more than once per second.
 * </p>
 */
public class PutIdentityPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identity that the policy will apply to. You can specify an identity
     * by using its name or by using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     */
    private String identity;

    /**
     * <p>
     * The name of the policy.
     * </p>
     * <p>
     * The policy name cannot exceed 64 characters and can only include
     * alphanumeric characters, dashes, and underscores.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String policyName;

    /**
     * <p>
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * </p>
     * <p>
     * For information about the syntax of sending authorization policies, see
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String policy;

    /**
     * <p>
     * The identity that the policy will apply to. You can specify an identity
     * by using its name or by using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     *
     * @return <p>
     *         The identity that the policy will apply to. You can specify an
     *         identity by using its name or by using its Amazon Resource Name
     *         (ARN). Examples: <code>user@example.com</code>,
     *         <code>example.com</code>,
     *         <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *         .
     *         </p>
     *         <p>
     *         To successfully call this API, you must own the identity.
     *         </p>
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * <p>
     * The identity that the policy will apply to. You can specify an identity
     * by using its name or by using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     *
     * @param identity <p>
     *            The identity that the policy will apply to. You can specify an
     *            identity by using its name or by using its Amazon Resource
     *            Name (ARN). Examples: <code>user@example.com</code>,
     *            <code>example.com</code>,
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            .
     *            </p>
     *            <p>
     *            To successfully call this API, you must own the identity.
     *            </p>
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     * <p>
     * The identity that the policy will apply to. You can specify an identity
     * by using its name or by using its Amazon Resource Name (ARN). Examples:
     * <code>user@example.com</code>, <code>example.com</code>,
     * <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>.
     * </p>
     * <p>
     * To successfully call this API, you must own the identity.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param identity <p>
     *            The identity that the policy will apply to. You can specify an
     *            identity by using its name or by using its Amazon Resource
     *            Name (ARN). Examples: <code>user@example.com</code>,
     *            <code>example.com</code>,
     *            <code>arn:aws:ses:us-east-1:123456789012:identity/example.com</code>
     *            .
     *            </p>
     *            <p>
     *            To successfully call this API, you must own the identity.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIdentityPolicyRequest withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * <p>
     * The policy name cannot exceed 64 characters and can only include
     * alphanumeric characters, dashes, and underscores.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return <p>
     *         The name of the policy.
     *         </p>
     *         <p>
     *         The policy name cannot exceed 64 characters and can only include
     *         alphanumeric characters, dashes, and underscores.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * <p>
     * The policy name cannot exceed 64 characters and can only include
     * alphanumeric characters, dashes, and underscores.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param policyName <p>
     *            The name of the policy.
     *            </p>
     *            <p>
     *            The policy name cannot exceed 64 characters and can only
     *            include alphanumeric characters, dashes, and underscores.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * <p>
     * The policy name cannot exceed 64 characters and can only include
     * alphanumeric characters, dashes, and underscores.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param policyName <p>
     *            The name of the policy.
     *            </p>
     *            <p>
     *            The policy name cannot exceed 64 characters and can only
     *            include alphanumeric characters, dashes, and underscores.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIdentityPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * </p>
     * <p>
     * For information about the syntax of sending authorization policies, see
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The text of the policy in JSON format. The policy cannot exceed 4
     *         KB.
     *         </p>
     *         <p>
     *         For information about the syntax of sending authorization
     *         policies, see the <a href=
     *         "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html"
     *         >Amazon SES Developer Guide</a>.
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * </p>
     * <p>
     * For information about the syntax of sending authorization policies, see
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param policy <p>
     *            The text of the policy in JSON format. The policy cannot
     *            exceed 4 KB.
     *            </p>
     *            <p>
     *            For information about the syntax of sending authorization
     *            policies, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The text of the policy in JSON format. The policy cannot exceed 4 KB.
     * </p>
     * <p>
     * For information about the syntax of sending authorization policies, see
     * the <a href=
     * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html"
     * >Amazon SES Developer Guide</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param policy <p>
     *            The text of the policy in JSON format. The policy cannot
     *            exceed 4 KB.
     *            </p>
     *            <p>
     *            For information about the syntax of sending authorization
     *            policies, see the <a href=
     *            "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/sending-authorization-policies.html"
     *            >Amazon SES Developer Guide</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutIdentityPolicyRequest withPolicy(String policy) {
        this.policy = policy;
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
        if (getIdentity() != null)
            sb.append("Identity: " + getIdentity() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentity() == null) ? 0 : getIdentity().hashCode());
        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutIdentityPolicyRequest == false)
            return false;
        PutIdentityPolicyRequest other = (PutIdentityPolicyRequest) obj;

        if (other.getIdentity() == null ^ this.getIdentity() == null)
            return false;
        if (other.getIdentity() != null && other.getIdentity().equals(this.getIdentity()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }
}
