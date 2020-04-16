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

package com.amazonaws.services.awsglue.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets the Data Catalog resource policy for access control.
 * </p>
 */
public class PutResourcePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 10240<br/>
     */
    private String policyInJson;

    /**
     * <p>
     * The hash value returned when the previous policy was set using
     * <code>PutResourcePolicy</code>. Its purpose is to prevent concurrent
     * modifications of a policy. Do not use this parameter if no previous
     * policy has been set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String policyHashCondition;

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of
     * <code>NOT_EXIST</code> is used to create a new policy. If a value of
     * <code>NONE</code> or a null value is used, the call will not depend on
     * the existence of a policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUST_EXIST, NOT_EXIST, NONE
     */
    private String policyExistsCondition;

    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 10240<br/>
     *
     * @return <p>
     *         Contains the policy document to set, in JSON format.
     *         </p>
     */
    public String getPolicyInJson() {
        return policyInJson;
    }

    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 10240<br/>
     *
     * @param policyInJson <p>
     *            Contains the policy document to set, in JSON format.
     *            </p>
     */
    public void setPolicyInJson(String policyInJson) {
        this.policyInJson = policyInJson;
    }

    /**
     * <p>
     * Contains the policy document to set, in JSON format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 10240<br/>
     *
     * @param policyInJson <p>
     *            Contains the policy document to set, in JSON format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourcePolicyRequest withPolicyInJson(String policyInJson) {
        this.policyInJson = policyInJson;
        return this;
    }

    /**
     * <p>
     * The hash value returned when the previous policy was set using
     * <code>PutResourcePolicy</code>. Its purpose is to prevent concurrent
     * modifications of a policy. Do not use this parameter if no previous
     * policy has been set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The hash value returned when the previous policy was set using
     *         <code>PutResourcePolicy</code>. Its purpose is to prevent
     *         concurrent modifications of a policy. Do not use this parameter
     *         if no previous policy has been set.
     *         </p>
     */
    public String getPolicyHashCondition() {
        return policyHashCondition;
    }

    /**
     * <p>
     * The hash value returned when the previous policy was set using
     * <code>PutResourcePolicy</code>. Its purpose is to prevent concurrent
     * modifications of a policy. Do not use this parameter if no previous
     * policy has been set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param policyHashCondition <p>
     *            The hash value returned when the previous policy was set using
     *            <code>PutResourcePolicy</code>. Its purpose is to prevent
     *            concurrent modifications of a policy. Do not use this
     *            parameter if no previous policy has been set.
     *            </p>
     */
    public void setPolicyHashCondition(String policyHashCondition) {
        this.policyHashCondition = policyHashCondition;
    }

    /**
     * <p>
     * The hash value returned when the previous policy was set using
     * <code>PutResourcePolicy</code>. Its purpose is to prevent concurrent
     * modifications of a policy. Do not use this parameter if no previous
     * policy has been set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param policyHashCondition <p>
     *            The hash value returned when the previous policy was set using
     *            <code>PutResourcePolicy</code>. Its purpose is to prevent
     *            concurrent modifications of a policy. Do not use this
     *            parameter if no previous policy has been set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourcePolicyRequest withPolicyHashCondition(String policyHashCondition) {
        this.policyHashCondition = policyHashCondition;
        return this;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of
     * <code>NOT_EXIST</code> is used to create a new policy. If a value of
     * <code>NONE</code> or a null value is used, the call will not depend on
     * the existence of a policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUST_EXIST, NOT_EXIST, NONE
     *
     * @return <p>
     *         A value of <code>MUST_EXIST</code> is used to update a policy. A
     *         value of <code>NOT_EXIST</code> is used to create a new policy.
     *         If a value of <code>NONE</code> or a null value is used, the call
     *         will not depend on the existence of a policy.
     *         </p>
     * @see ExistCondition
     */
    public String getPolicyExistsCondition() {
        return policyExistsCondition;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of
     * <code>NOT_EXIST</code> is used to create a new policy. If a value of
     * <code>NONE</code> or a null value is used, the call will not depend on
     * the existence of a policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUST_EXIST, NOT_EXIST, NONE
     *
     * @param policyExistsCondition <p>
     *            A value of <code>MUST_EXIST</code> is used to update a policy.
     *            A value of <code>NOT_EXIST</code> is used to create a new
     *            policy. If a value of <code>NONE</code> or a null value is
     *            used, the call will not depend on the existence of a policy.
     *            </p>
     * @see ExistCondition
     */
    public void setPolicyExistsCondition(String policyExistsCondition) {
        this.policyExistsCondition = policyExistsCondition;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of
     * <code>NOT_EXIST</code> is used to create a new policy. If a value of
     * <code>NONE</code> or a null value is used, the call will not depend on
     * the existence of a policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUST_EXIST, NOT_EXIST, NONE
     *
     * @param policyExistsCondition <p>
     *            A value of <code>MUST_EXIST</code> is used to update a policy.
     *            A value of <code>NOT_EXIST</code> is used to create a new
     *            policy. If a value of <code>NONE</code> or a null value is
     *            used, the call will not depend on the existence of a policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExistCondition
     */
    public PutResourcePolicyRequest withPolicyExistsCondition(String policyExistsCondition) {
        this.policyExistsCondition = policyExistsCondition;
        return this;
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of
     * <code>NOT_EXIST</code> is used to create a new policy. If a value of
     * <code>NONE</code> or a null value is used, the call will not depend on
     * the existence of a policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUST_EXIST, NOT_EXIST, NONE
     *
     * @param policyExistsCondition <p>
     *            A value of <code>MUST_EXIST</code> is used to update a policy.
     *            A value of <code>NOT_EXIST</code> is used to create a new
     *            policy. If a value of <code>NONE</code> or a null value is
     *            used, the call will not depend on the existence of a policy.
     *            </p>
     * @see ExistCondition
     */
    public void setPolicyExistsCondition(ExistCondition policyExistsCondition) {
        this.policyExistsCondition = policyExistsCondition.toString();
    }

    /**
     * <p>
     * A value of <code>MUST_EXIST</code> is used to update a policy. A value of
     * <code>NOT_EXIST</code> is used to create a new policy. If a value of
     * <code>NONE</code> or a null value is used, the call will not depend on
     * the existence of a policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>MUST_EXIST, NOT_EXIST, NONE
     *
     * @param policyExistsCondition <p>
     *            A value of <code>MUST_EXIST</code> is used to update a policy.
     *            A value of <code>NOT_EXIST</code> is used to create a new
     *            policy. If a value of <code>NONE</code> or a null value is
     *            used, the call will not depend on the existence of a policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExistCondition
     */
    public PutResourcePolicyRequest withPolicyExistsCondition(ExistCondition policyExistsCondition) {
        this.policyExistsCondition = policyExistsCondition.toString();
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
        if (getPolicyHashCondition() != null)
            sb.append("PolicyHashCondition: " + getPolicyHashCondition() + ",");
        if (getPolicyExistsCondition() != null)
            sb.append("PolicyExistsCondition: " + getPolicyExistsCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyInJson() == null) ? 0 : getPolicyInJson().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyHashCondition() == null) ? 0 : getPolicyHashCondition().hashCode());
        hashCode = prime
                * hashCode
                + ((getPolicyExistsCondition() == null) ? 0 : getPolicyExistsCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyRequest == false)
            return false;
        PutResourcePolicyRequest other = (PutResourcePolicyRequest) obj;

        if (other.getPolicyInJson() == null ^ this.getPolicyInJson() == null)
            return false;
        if (other.getPolicyInJson() != null
                && other.getPolicyInJson().equals(this.getPolicyInJson()) == false)
            return false;
        if (other.getPolicyHashCondition() == null ^ this.getPolicyHashCondition() == null)
            return false;
        if (other.getPolicyHashCondition() != null
                && other.getPolicyHashCondition().equals(this.getPolicyHashCondition()) == false)
            return false;
        if (other.getPolicyExistsCondition() == null ^ this.getPolicyExistsCondition() == null)
            return false;
        if (other.getPolicyExistsCondition() != null
                && other.getPolicyExistsCondition().equals(this.getPolicyExistsCondition()) == false)
            return false;
        return true;
    }
}
