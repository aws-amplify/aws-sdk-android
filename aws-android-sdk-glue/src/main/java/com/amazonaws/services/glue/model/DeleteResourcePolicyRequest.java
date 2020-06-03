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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Deletes a specified policy.
 * </p>
 */
public class DeleteResourcePolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The hash value returned when this policy was set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     */
    private String policyHashCondition;

    /**
     * <p>
     * The hash value returned when this policy was set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @return <p>
     *         The hash value returned when this policy was set.
     *         </p>
     */
    public String getPolicyHashCondition() {
        return policyHashCondition;
    }

    /**
     * <p>
     * The hash value returned when this policy was set.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\t]*<br/>
     *
     * @param policyHashCondition <p>
     *            The hash value returned when this policy was set.
     *            </p>
     */
    public void setPolicyHashCondition(String policyHashCondition) {
        this.policyHashCondition = policyHashCondition;
    }

    /**
     * <p>
     * The hash value returned when this policy was set.
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
     *            The hash value returned when this policy was set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteResourcePolicyRequest withPolicyHashCondition(String policyHashCondition) {
        this.policyHashCondition = policyHashCondition;
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
        if (getPolicyHashCondition() != null)
            sb.append("PolicyHashCondition: " + getPolicyHashCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyHashCondition() == null) ? 0 : getPolicyHashCondition().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourcePolicyRequest == false)
            return false;
        DeleteResourcePolicyRequest other = (DeleteResourcePolicyRequest) obj;

        if (other.getPolicyHashCondition() == null ^ this.getPolicyHashCondition() == null)
            return false;
        if (other.getPolicyHashCondition() != null
                && other.getPolicyHashCondition().equals(this.getPolicyHashCondition()) == false)
            return false;
        return true;
    }
}
