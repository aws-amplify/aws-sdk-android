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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>Associates an access policy with the specified access point. Each access point can have only one policy, so a request made to this API replaces any existing policy associated with the specified access point.</p>
 */
public class PutAccessPointPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>The AWS account ID for owner of the bucket associated with the specified access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String accountId;

    /**
     * <p>The name of the access point that you want to associate with the specified policy.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     */
    private String name;

    /**
     * <p>The policy that you want to apply to the specified access point. For more information about access point policies, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points.html">Managing Data Access with Amazon S3 Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     */
    private String policy;

    /**
     * <p>The AWS account ID for owner of the bucket associated with the specified access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>The AWS account ID for owner of the bucket associated with the specified access point.</p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>The AWS account ID for owner of the bucket associated with the specified access point.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>The AWS account ID for owner of the bucket associated with the specified access point.</p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>The AWS account ID for owner of the bucket associated with the specified access point.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>The AWS account ID for owner of the bucket associated with the specified access point.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutAccessPointPolicyRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>The name of the access point that you want to associate with the specified policy.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @return <p>The name of the access point that you want to associate with the specified policy.</p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>The name of the access point that you want to associate with the specified policy.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param name <p>The name of the access point that you want to associate with the specified policy.</p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>The name of the access point that you want to associate with the specified policy.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param name <p>The name of the access point that you want to associate with the specified policy.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutAccessPointPolicyRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>The policy that you want to apply to the specified access point. For more information about access point policies, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points.html">Managing Data Access with Amazon S3 Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     *
     * @return <p>The policy that you want to apply to the specified access point. For more information about access point policies, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points.html">Managing Data Access with Amazon S3 Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     */
    public String getPolicy() {
        return policy;
    }

    /**
     * <p>The policy that you want to apply to the specified access point. For more information about access point policies, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points.html">Managing Data Access with Amazon S3 Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     *
     * @param policy <p>The policy that you want to apply to the specified access point. For more information about access point policies, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points.html">Managing Data Access with Amazon S3 Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     */
    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>The policy that you want to apply to the specified access point. For more information about access point policies, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points.html">Managing Data Access with Amazon S3 Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policy <p>The policy that you want to apply to the specified access point. For more information about access point policies, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/access-points.html">Managing Data Access with Amazon S3 Access Points</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public PutAccessPointPolicyRequest withPolicy(String policy) {
        this.policy = policy;
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
        if (getAccountId() != null) sb.append("AccountId: " + getAccountId() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getPolicy() != null) sb.append("Policy: " + getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof PutAccessPointPolicyRequest == false) return false;
        PutAccessPointPolicyRequest other = (PutAccessPointPolicyRequest)obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null) return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false) return false;
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null) return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false) return false;
        return true;
    }
}
