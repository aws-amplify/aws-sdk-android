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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class GetResourcePolicyResult implements Serializable {
    /**
     * <p>
     * Contains the requested policy document, in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 10240<br/>
     */
    private String policyInJson;

    /**
     * <p>
     * Contains the hash value associated with this policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String policyHash;

    /**
     * <p>
     * The date and time at which the policy was created.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The date and time at which the policy was last updated.
     * </p>
     */
    private java.util.Date updateTime;

    /**
     * <p>
     * Contains the requested policy document, in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 10240<br/>
     *
     * @return <p>
     *         Contains the requested policy document, in JSON format.
     *         </p>
     */
    public String getPolicyInJson() {
        return policyInJson;
    }

    /**
     * <p>
     * Contains the requested policy document, in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 10240<br/>
     *
     * @param policyInJson <p>
     *            Contains the requested policy document, in JSON format.
     *            </p>
     */
    public void setPolicyInJson(String policyInJson) {
        this.policyInJson = policyInJson;
    }

    /**
     * <p>
     * Contains the requested policy document, in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 10240<br/>
     *
     * @param policyInJson <p>
     *            Contains the requested policy document, in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcePolicyResult withPolicyInJson(String policyInJson) {
        this.policyInJson = policyInJson;
        return this;
    }

    /**
     * <p>
     * Contains the hash value associated with this policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         Contains the hash value associated with this policy.
     *         </p>
     */
    public String getPolicyHash() {
        return policyHash;
    }

    /**
     * <p>
     * Contains the hash value associated with this policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param policyHash <p>
     *            Contains the hash value associated with this policy.
     *            </p>
     */
    public void setPolicyHash(String policyHash) {
        this.policyHash = policyHash;
    }

    /**
     * <p>
     * Contains the hash value associated with this policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param policyHash <p>
     *            Contains the hash value associated with this policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcePolicyResult withPolicyHash(String policyHash) {
        this.policyHash = policyHash;
        return this;
    }

    /**
     * <p>
     * The date and time at which the policy was created.
     * </p>
     *
     * @return <p>
     *         The date and time at which the policy was created.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The date and time at which the policy was created.
     * </p>
     *
     * @param createTime <p>
     *            The date and time at which the policy was created.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time at which the policy was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The date and time at which the policy was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcePolicyResult withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The date and time at which the policy was last updated.
     * </p>
     *
     * @return <p>
     *         The date and time at which the policy was last updated.
     *         </p>
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * <p>
     * The date and time at which the policy was last updated.
     * </p>
     *
     * @param updateTime <p>
     *            The date and time at which the policy was last updated.
     *            </p>
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The date and time at which the policy was last updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateTime <p>
     *            The date and time at which the policy was last updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetResourcePolicyResult withUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
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
        if (getPolicyInJson() != null)
            sb.append("PolicyInJson: " + getPolicyInJson() + ",");
        if (getPolicyHash() != null)
            sb.append("PolicyHash: " + getPolicyHash() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: " + getUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyInJson() == null) ? 0 : getPolicyInJson().hashCode());
        hashCode = prime * hashCode + ((getPolicyHash() == null) ? 0 : getPolicyHash().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourcePolicyResult == false)
            return false;
        GetResourcePolicyResult other = (GetResourcePolicyResult) obj;

        if (other.getPolicyInJson() == null ^ this.getPolicyInJson() == null)
            return false;
        if (other.getPolicyInJson() != null
                && other.getPolicyInJson().equals(this.getPolicyInJson()) == false)
            return false;
        if (other.getPolicyHash() == null ^ this.getPolicyHash() == null)
            return false;
        if (other.getPolicyHash() != null
                && other.getPolicyHash().equals(this.getPolicyHash()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        return true;
    }
}
