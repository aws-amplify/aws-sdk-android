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

package com.amazonaws.services.firewallmanagementservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an AWS Firewall Manager policy.
 * </p>
 * <p>
 * Firewall Manager provides the following types of policies:
 * </p>
 * <ul>
 * <li>
 * <p>
 * A Shield Advanced policy, which applies Shield Advanced protection to
 * specified accounts and resources
 * </p>
 * </li>
 * <li>
 * <p>
 * An AWS WAF policy (type WAFV2), which defines rule groups to run first in the
 * corresponding AWS WAF web ACL and rule groups to run last in the web ACL.
 * </p>
 * </li>
 * <li>
 * <p>
 * An AWS WAF Classic policy (type WAF), which defines a rule group.
 * </p>
 * </li>
 * <li>
 * <p>
 * A security group policy, which manages VPC security groups across your AWS
 * organization.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Each policy is specific to one of the types. If you want to enforce more than
 * one policy type across accounts, create multiple policies. You can create
 * multiple policies for each type.
 * </p>
 * <p>
 * You must be subscribed to Shield Advanced to create a Shield Advanced policy.
 * For more information about subscribing to Shield Advanced, see <a href=
 * "https://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_CreateSubscription.html"
 * >CreateSubscription</a>.
 * </p>
 */
public class PutPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The details of the AWS Firewall Manager policy to be created.
     * </p>
     */
    private Policy policy;

    /**
     * <p>
     * The tags to add to the AWS resource.
     * </p>
     */
    private java.util.List<Tag> tagList;

    /**
     * <p>
     * The details of the AWS Firewall Manager policy to be created.
     * </p>
     *
     * @return <p>
     *         The details of the AWS Firewall Manager policy to be created.
     *         </p>
     */
    public Policy getPolicy() {
        return policy;
    }

    /**
     * <p>
     * The details of the AWS Firewall Manager policy to be created.
     * </p>
     *
     * @param policy <p>
     *            The details of the AWS Firewall Manager policy to be created.
     *            </p>
     */
    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The details of the AWS Firewall Manager policy to be created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policy <p>
     *            The details of the AWS Firewall Manager policy to be created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPolicyRequest withPolicy(Policy policy) {
        this.policy = policy;
        return this;
    }

    /**
     * <p>
     * The tags to add to the AWS resource.
     * </p>
     *
     * @return <p>
     *         The tags to add to the AWS resource.
     *         </p>
     */
    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * The tags to add to the AWS resource.
     * </p>
     *
     * @param tagList <p>
     *            The tags to add to the AWS resource.
     *            </p>
     */
    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p>
     * The tags to add to the AWS resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagList <p>
     *            The tags to add to the AWS resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPolicyRequest withTagList(Tag... tagList) {
        if (getTagList() == null) {
            this.tagList = new java.util.ArrayList<Tag>(tagList.length);
        }
        for (Tag value : tagList) {
            this.tagList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags to add to the AWS resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tagList <p>
     *            The tags to add to the AWS resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutPolicyRequest withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
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
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getTagList() != null)
            sb.append("TagList: " + getTagList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPolicyRequest == false)
            return false;
        PutPolicyRequest other = (PutPolicyRequest) obj;

        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        return true;
    }
}
