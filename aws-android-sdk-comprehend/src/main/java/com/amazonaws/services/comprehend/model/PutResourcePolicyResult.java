/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

public class PutResourcePolicyResult implements Serializable {
    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon
     * Comprehend assigns a new revision ID, and it deletes the prior version of
     * the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[0-9A-Fa-f]+<br/>
     */
    private String policyRevisionId;

    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon
     * Comprehend assigns a new revision ID, and it deletes the prior version of
     * the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[0-9A-Fa-f]+<br/>
     *
     * @return <p>
     *         The revision ID of the policy. Each time you modify a policy,
     *         Amazon Comprehend assigns a new revision ID, and it deletes the
     *         prior version of the policy.
     *         </p>
     */
    public String getPolicyRevisionId() {
        return policyRevisionId;
    }

    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon
     * Comprehend assigns a new revision ID, and it deletes the prior version of
     * the policy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[0-9A-Fa-f]+<br/>
     *
     * @param policyRevisionId <p>
     *            The revision ID of the policy. Each time you modify a policy,
     *            Amazon Comprehend assigns a new revision ID, and it deletes
     *            the prior version of the policy.
     *            </p>
     */
    public void setPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
    }

    /**
     * <p>
     * The revision ID of the policy. Each time you modify a policy, Amazon
     * Comprehend assigns a new revision ID, and it deletes the prior version of
     * the policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     * <b>Pattern: </b>[0-9A-Fa-f]+<br/>
     *
     * @param policyRevisionId <p>
     *            The revision ID of the policy. Each time you modify a policy,
     *            Amazon Comprehend assigns a new revision ID, and it deletes
     *            the prior version of the policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutResourcePolicyResult withPolicyRevisionId(String policyRevisionId) {
        this.policyRevisionId = policyRevisionId;
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
        if (getPolicyRevisionId() != null)
            sb.append("PolicyRevisionId: " + getPolicyRevisionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyRevisionId() == null) ? 0 : getPolicyRevisionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourcePolicyResult == false)
            return false;
        PutResourcePolicyResult other = (PutResourcePolicyResult) obj;

        if (other.getPolicyRevisionId() == null ^ this.getPolicyRevisionId() == null)
            return false;
        if (other.getPolicyRevisionId() != null
                && other.getPolicyRevisionId().equals(this.getPolicyRevisionId()) == false)
            return false;
        return true;
    }
}
