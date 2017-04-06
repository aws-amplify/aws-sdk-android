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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

public class ListKeyPoliciesResult implements Serializable {
    /**
     * <p>
     * A list of policy names. Currently, there is only one policy and it is
     * named "Default".
     * </p>
     */
    private java.util.List<String> policyNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * When <code>Truncated</code> is true, this value is present and contains
     * the value to use for the <code>Marker</code> parameter in a subsequent
     * pagination request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. If your
     * results were truncated, you can use the <code>Marker</code> parameter to
     * make a subsequent pagination request to retrieve more items in the list.
     * </p>
     */
    private Boolean truncated;

    /**
     * <p>
     * A list of policy names. Currently, there is only one policy and it is
     * named "Default".
     * </p>
     *
     * @return <p>
     *         A list of policy names. Currently, there is only one policy and
     *         it is named "Default".
     *         </p>
     */
    public java.util.List<String> getPolicyNames() {
        return policyNames;
    }

    /**
     * <p>
     * A list of policy names. Currently, there is only one policy and it is
     * named "Default".
     * </p>
     *
     * @param policyNames <p>
     *            A list of policy names. Currently, there is only one policy
     *            and it is named "Default".
     *            </p>
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new java.util.ArrayList<String>(policyNames);
    }

    /**
     * <p>
     * A list of policy names. Currently, there is only one policy and it is
     * named "Default".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            A list of policy names. Currently, there is only one policy
     *            and it is named "Default".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeyPoliciesResult withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) {
            this.policyNames = new java.util.ArrayList<String>(policyNames.length);
        }
        for (String value : policyNames) {
            this.policyNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of policy names. Currently, there is only one policy and it is
     * named "Default".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyNames <p>
     *            A list of policy names. Currently, there is only one policy
     *            and it is named "Default".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeyPoliciesResult withPolicyNames(java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
        return this;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this value is present and contains
     * the value to use for the <code>Marker</code> parameter in a subsequent
     * pagination request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @return <p>
     *         When <code>Truncated</code> is true, this value is present and
     *         contains the value to use for the <code>Marker</code> parameter
     *         in a subsequent pagination request.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this value is present and contains
     * the value to use for the <code>Marker</code> parameter in a subsequent
     * pagination request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param nextMarker <p>
     *            When <code>Truncated</code> is true, this value is present and
     *            contains the value to use for the <code>Marker</code>
     *            parameter in a subsequent pagination request.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * When <code>Truncated</code> is true, this value is present and contains
     * the value to use for the <code>Marker</code> parameter in a subsequent
     * pagination request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[ -\u00FF]*<br/>
     *
     * @param nextMarker <p>
     *            When <code>Truncated</code> is true, this value is present and
     *            contains the value to use for the <code>Marker</code>
     *            parameter in a subsequent pagination request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeyPoliciesResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. If your
     * results were truncated, you can use the <code>Marker</code> parameter to
     * make a subsequent pagination request to retrieve more items in the list.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items in the list.
     *         If your results were truncated, you can use the
     *         <code>Marker</code> parameter to make a subsequent pagination
     *         request to retrieve more items in the list.
     *         </p>
     */
    public Boolean isTruncated() {
        return truncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. If your
     * results were truncated, you can use the <code>Marker</code> parameter to
     * make a subsequent pagination request to retrieve more items in the list.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more items in the list.
     *         If your results were truncated, you can use the
     *         <code>Marker</code> parameter to make a subsequent pagination
     *         request to retrieve more items in the list.
     *         </p>
     */
    public Boolean getTruncated() {
        return truncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. If your
     * results were truncated, you can use the <code>Marker</code> parameter to
     * make a subsequent pagination request to retrieve more items in the list.
     * </p>
     *
     * @param truncated <p>
     *            A flag that indicates whether there are more items in the
     *            list. If your results were truncated, you can use the
     *            <code>Marker</code> parameter to make a subsequent pagination
     *            request to retrieve more items in the list.
     *            </p>
     */
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more items in the list. If your
     * results were truncated, you can use the <code>Marker</code> parameter to
     * make a subsequent pagination request to retrieve more items in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param truncated <p>
     *            A flag that indicates whether there are more items in the
     *            list. If your results were truncated, you can use the
     *            <code>Marker</code> parameter to make a subsequent pagination
     *            request to retrieve more items in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListKeyPoliciesResult withTruncated(Boolean truncated) {
        this.truncated = truncated;
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
        if (getPolicyNames() != null)
            sb.append("PolicyNames: " + getPolicyNames() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getTruncated() != null)
            sb.append("Truncated: " + getTruncated());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getTruncated() == null) ? 0 : getTruncated().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListKeyPoliciesResult == false)
            return false;
        ListKeyPoliciesResult other = (ListKeyPoliciesResult) obj;

        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null
                && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getTruncated() == null ^ this.getTruncated() == null)
            return false;
        if (other.getTruncated() != null
                && other.getTruncated().equals(this.getTruncated()) == false)
            return false;
        return true;
    }
}
