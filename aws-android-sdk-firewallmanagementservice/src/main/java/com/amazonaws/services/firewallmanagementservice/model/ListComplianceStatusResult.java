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

public class ListComplianceStatusResult implements Serializable {
    /**
     * <p>
     * An array of <code>PolicyComplianceStatus</code> objects.
     * </p>
     */
    private java.util.List<PolicyComplianceStatus> policyComplianceStatusList;

    /**
     * <p>
     * If you have more <code>PolicyComplianceStatus</code> objects than the
     * number that you specified for <code>MaxResults</code> in the request, the
     * response includes a <code>NextToken</code> value. To list more
     * <code>PolicyComplianceStatus</code> objects, submit another
     * <code>ListComplianceStatus</code> request, and specify the
     * <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array of <code>PolicyComplianceStatus</code> objects.
     * </p>
     *
     * @return <p>
     *         An array of <code>PolicyComplianceStatus</code> objects.
     *         </p>
     */
    public java.util.List<PolicyComplianceStatus> getPolicyComplianceStatusList() {
        return policyComplianceStatusList;
    }

    /**
     * <p>
     * An array of <code>PolicyComplianceStatus</code> objects.
     * </p>
     *
     * @param policyComplianceStatusList <p>
     *            An array of <code>PolicyComplianceStatus</code> objects.
     *            </p>
     */
    public void setPolicyComplianceStatusList(
            java.util.Collection<PolicyComplianceStatus> policyComplianceStatusList) {
        if (policyComplianceStatusList == null) {
            this.policyComplianceStatusList = null;
            return;
        }

        this.policyComplianceStatusList = new java.util.ArrayList<PolicyComplianceStatus>(
                policyComplianceStatusList);
    }

    /**
     * <p>
     * An array of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyComplianceStatusList <p>
     *            An array of <code>PolicyComplianceStatus</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceStatusResult withPolicyComplianceStatusList(
            PolicyComplianceStatus... policyComplianceStatusList) {
        if (getPolicyComplianceStatusList() == null) {
            this.policyComplianceStatusList = new java.util.ArrayList<PolicyComplianceStatus>(
                    policyComplianceStatusList.length);
        }
        for (PolicyComplianceStatus value : policyComplianceStatusList) {
            this.policyComplianceStatusList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>PolicyComplianceStatus</code> objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param policyComplianceStatusList <p>
     *            An array of <code>PolicyComplianceStatus</code> objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceStatusResult withPolicyComplianceStatusList(
            java.util.Collection<PolicyComplianceStatus> policyComplianceStatusList) {
        setPolicyComplianceStatusList(policyComplianceStatusList);
        return this;
    }

    /**
     * <p>
     * If you have more <code>PolicyComplianceStatus</code> objects than the
     * number that you specified for <code>MaxResults</code> in the request, the
     * response includes a <code>NextToken</code> value. To list more
     * <code>PolicyComplianceStatus</code> objects, submit another
     * <code>ListComplianceStatus</code> request, and specify the
     * <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @return <p>
     *         If you have more <code>PolicyComplianceStatus</code> objects than
     *         the number that you specified for <code>MaxResults</code> in the
     *         request, the response includes a <code>NextToken</code> value. To
     *         list more <code>PolicyComplianceStatus</code> objects, submit
     *         another <code>ListComplianceStatus</code> request, and specify
     *         the <code>NextToken</code> value from the response in the
     *         <code>NextToken</code> value in the next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If you have more <code>PolicyComplianceStatus</code> objects than the
     * number that you specified for <code>MaxResults</code> in the request, the
     * response includes a <code>NextToken</code> value. To list more
     * <code>PolicyComplianceStatus</code> objects, submit another
     * <code>ListComplianceStatus</code> request, and specify the
     * <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param nextToken <p>
     *            If you have more <code>PolicyComplianceStatus</code> objects
     *            than the number that you specified for <code>MaxResults</code>
     *            in the request, the response includes a <code>NextToken</code>
     *            value. To list more <code>PolicyComplianceStatus</code>
     *            objects, submit another <code>ListComplianceStatus</code>
     *            request, and specify the <code>NextToken</code> value from the
     *            response in the <code>NextToken</code> value in the next
     *            request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If you have more <code>PolicyComplianceStatus</code> objects than the
     * number that you specified for <code>MaxResults</code> in the request, the
     * response includes a <code>NextToken</code> value. To list more
     * <code>PolicyComplianceStatus</code> objects, submit another
     * <code>ListComplianceStatus</code> request, and specify the
     * <code>NextToken</code> value from the response in the
     * <code>NextToken</code> value in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>^([\p{L}\p{Z}\p{N}_.:/=+\-@]*)$<br/>
     *
     * @param nextToken <p>
     *            If you have more <code>PolicyComplianceStatus</code> objects
     *            than the number that you specified for <code>MaxResults</code>
     *            in the request, the response includes a <code>NextToken</code>
     *            value. To list more <code>PolicyComplianceStatus</code>
     *            objects, submit another <code>ListComplianceStatus</code>
     *            request, and specify the <code>NextToken</code> value from the
     *            response in the <code>NextToken</code> value in the next
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListComplianceStatusResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getPolicyComplianceStatusList() != null)
            sb.append("PolicyComplianceStatusList: " + getPolicyComplianceStatusList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPolicyComplianceStatusList() == null) ? 0 : getPolicyComplianceStatusList()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListComplianceStatusResult == false)
            return false;
        ListComplianceStatusResult other = (ListComplianceStatusResult) obj;

        if (other.getPolicyComplianceStatusList() == null
                ^ this.getPolicyComplianceStatusList() == null)
            return false;
        if (other.getPolicyComplianceStatusList() != null
                && other.getPolicyComplianceStatusList().equals(
                        this.getPolicyComplianceStatusList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
