/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <note>
 * <p>
 * This is <b>AWS WAF Classic</b> documentation. For more information, see <a
 * href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html"
 * >AWS WAF Classic</a> in the developer guide.
 * </p>
 * <p>
 * <b>For the latest version of AWS WAF</b>, use the AWS WAFV2 API and see the
 * <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS
 * WAF Developer Guide</a>. With the latest version, AWS WAF has a single set of
 * endpoints for regional and global use.
 * </p>
 * </note>
 * <p>
 * Attaches an IAM policy to the specified resource. The only supported use for
 * this action is to share a RuleGroup across accounts.
 * </p>
 * <p>
 * The <code>PutPermissionPolicy</code> is subject to the following
 * restrictions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You can attach only one policy with each <code>PutPermissionPolicy</code>
 * request.
 * </p>
 * </li>
 * <li>
 * <p>
 * The policy must include an <code>Effect</code>, <code>Action</code> and
 * <code>Principal</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>Effect</code> must specify <code>Allow</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <code>Action</code> in the policy must be <code>waf:UpdateWebACL</code>,
 * <code>waf-regional:UpdateWebACL</code>, <code>waf:GetRuleGroup</code> and
 * <code>waf-regional:GetRuleGroup</code> . Any extra or wildcard actions in the
 * policy will be rejected.
 * </p>
 * </li>
 * <li>
 * <p>
 * The policy cannot include a <code>Resource</code> parameter.
 * </p>
 * </li>
 * <li>
 * <p>
 * The ARN in the request must be a valid WAF RuleGroup ARN and the RuleGroup
 * must exist in the same region.
 * </p>
 * </li>
 * <li>
 * <p>
 * The user making the request must be the owner of the RuleGroup.
 * </p>
 * </li>
 * <li>
 * <p>
 * Your policy must be composed using IAM Policy version 2012-10-17.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html">IAM
 * Policies</a>.
 * </p>
 * <p>
 * An example of a valid policy parameter is shown in the Examples section
 * below.
 * </p>
 */
public class PutPermissionPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RuleGroup to which you want to
     * attach the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * The policy to attach to the specified RuleGroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 395000<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String policy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RuleGroup to which you want to
     * attach the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the RuleGroup to which you want
     *         to attach the policy.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RuleGroup to which you want to
     * attach the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the RuleGroup to which you
     *            want to attach the policy.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RuleGroup to which you want to
     * attach the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param resourceArn <p>
     *            The Amazon Resource Name (ARN) of the RuleGroup to which you
     *            want to attach the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPermissionPolicyRequest withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * The policy to attach to the specified RuleGroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 395000<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The policy to attach to the specified RuleGroup.
     *         </p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The policy to attach to the specified RuleGroup.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 395000<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param policy <p>
     *            The policy to attach to the specified RuleGroup.
     *            </p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy to attach to the specified RuleGroup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 395000<br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param policy <p>
     *            The policy to attach to the specified RuleGroup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPermissionPolicyRequest withPolicy(String policy) {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPermissionPolicyRequest == false)
            return false;
        PutPermissionPolicyRequest other = (PutPermissionPolicyRequest) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }
}
