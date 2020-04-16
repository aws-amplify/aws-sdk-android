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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists details about all member accounts for the current Security Hub master
 * account.
 * </p>
 */
public class ListMembersRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Specifies which member accounts to include in the response based on their
     * relationship status with the master account. The default value is
     * <code>TRUE</code>.
     * </p>
     * <p>
     * If <code>OnlyAssociated</code> is set to <code>TRUE</code>, the response
     * includes member accounts whose relationship status with the master is set
     * to <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * <p>
     * If <code>OnlyAssociated</code> is set to <code>FALSE</code>, the response
     * includes all existing member accounts.
     * </p>
     */
    private Boolean onlyAssociated;

    /**
     * <p>
     * The maximum number of items to return in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>ListMembers</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies which member accounts to include in the response based on their
     * relationship status with the master account. The default value is
     * <code>TRUE</code>.
     * </p>
     * <p>
     * If <code>OnlyAssociated</code> is set to <code>TRUE</code>, the response
     * includes member accounts whose relationship status with the master is set
     * to <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * <p>
     * If <code>OnlyAssociated</code> is set to <code>FALSE</code>, the response
     * includes all existing member accounts.
     * </p>
     *
     * @return <p>
     *         Specifies which member accounts to include in the response based
     *         on their relationship status with the master account. The default
     *         value is <code>TRUE</code>.
     *         </p>
     *         <p>
     *         If <code>OnlyAssociated</code> is set to <code>TRUE</code>, the
     *         response includes member accounts whose relationship status with
     *         the master is set to <code>ENABLED</code> or
     *         <code>DISABLED</code>.
     *         </p>
     *         <p>
     *         If <code>OnlyAssociated</code> is set to <code>FALSE</code>, the
     *         response includes all existing member accounts.
     *         </p>
     */
    public Boolean isOnlyAssociated() {
        return onlyAssociated;
    }

    /**
     * <p>
     * Specifies which member accounts to include in the response based on their
     * relationship status with the master account. The default value is
     * <code>TRUE</code>.
     * </p>
     * <p>
     * If <code>OnlyAssociated</code> is set to <code>TRUE</code>, the response
     * includes member accounts whose relationship status with the master is set
     * to <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * <p>
     * If <code>OnlyAssociated</code> is set to <code>FALSE</code>, the response
     * includes all existing member accounts.
     * </p>
     *
     * @return <p>
     *         Specifies which member accounts to include in the response based
     *         on their relationship status with the master account. The default
     *         value is <code>TRUE</code>.
     *         </p>
     *         <p>
     *         If <code>OnlyAssociated</code> is set to <code>TRUE</code>, the
     *         response includes member accounts whose relationship status with
     *         the master is set to <code>ENABLED</code> or
     *         <code>DISABLED</code>.
     *         </p>
     *         <p>
     *         If <code>OnlyAssociated</code> is set to <code>FALSE</code>, the
     *         response includes all existing member accounts.
     *         </p>
     */
    public Boolean getOnlyAssociated() {
        return onlyAssociated;
    }

    /**
     * <p>
     * Specifies which member accounts to include in the response based on their
     * relationship status with the master account. The default value is
     * <code>TRUE</code>.
     * </p>
     * <p>
     * If <code>OnlyAssociated</code> is set to <code>TRUE</code>, the response
     * includes member accounts whose relationship status with the master is set
     * to <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * <p>
     * If <code>OnlyAssociated</code> is set to <code>FALSE</code>, the response
     * includes all existing member accounts.
     * </p>
     *
     * @param onlyAssociated <p>
     *            Specifies which member accounts to include in the response
     *            based on their relationship status with the master account.
     *            The default value is <code>TRUE</code>.
     *            </p>
     *            <p>
     *            If <code>OnlyAssociated</code> is set to <code>TRUE</code>,
     *            the response includes member accounts whose relationship
     *            status with the master is set to <code>ENABLED</code> or
     *            <code>DISABLED</code>.
     *            </p>
     *            <p>
     *            If <code>OnlyAssociated</code> is set to <code>FALSE</code>,
     *            the response includes all existing member accounts.
     *            </p>
     */
    public void setOnlyAssociated(Boolean onlyAssociated) {
        this.onlyAssociated = onlyAssociated;
    }

    /**
     * <p>
     * Specifies which member accounts to include in the response based on their
     * relationship status with the master account. The default value is
     * <code>TRUE</code>.
     * </p>
     * <p>
     * If <code>OnlyAssociated</code> is set to <code>TRUE</code>, the response
     * includes member accounts whose relationship status with the master is set
     * to <code>ENABLED</code> or <code>DISABLED</code>.
     * </p>
     * <p>
     * If <code>OnlyAssociated</code> is set to <code>FALSE</code>, the response
     * includes all existing member accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onlyAssociated <p>
     *            Specifies which member accounts to include in the response
     *            based on their relationship status with the master account.
     *            The default value is <code>TRUE</code>.
     *            </p>
     *            <p>
     *            If <code>OnlyAssociated</code> is set to <code>TRUE</code>,
     *            the response includes member accounts whose relationship
     *            status with the master is set to <code>ENABLED</code> or
     *            <code>DISABLED</code>.
     *            </p>
     *            <p>
     *            If <code>OnlyAssociated</code> is set to <code>FALSE</code>,
     *            the response includes all existing member accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersRequest withOnlyAssociated(Boolean onlyAssociated) {
        this.onlyAssociated = onlyAssociated;
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum number of items to return in the response.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return in the response.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxResults <p>
     *            The maximum number of items to return in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>ListMembers</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     *
     * @return <p>
     *         The token that is required for pagination. On your first call to
     *         the <code>ListMembers</code> operation, set the value of this
     *         parameter to <code>NULL</code>.
     *         </p>
     *         <p>
     *         For subsequent calls to the operation, to continue listing data,
     *         set the value of this parameter to the value returned from the
     *         previous response.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>ListMembers</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     *
     * @param nextToken <p>
     *            The token that is required for pagination. On your first call
     *            to the <code>ListMembers</code> operation, set the value of
     *            this parameter to <code>NULL</code>.
     *            </p>
     *            <p>
     *            For subsequent calls to the operation, to continue listing
     *            data, set the value of this parameter to the value returned
     *            from the previous response.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token that is required for pagination. On your first call to the
     * <code>ListMembers</code> operation, set the value of this parameter to
     * <code>NULL</code>.
     * </p>
     * <p>
     * For subsequent calls to the operation, to continue listing data, set the
     * value of this parameter to the value returned from the previous response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token that is required for pagination. On your first call
     *            to the <code>ListMembers</code> operation, set the value of
     *            this parameter to <code>NULL</code>.
     *            </p>
     *            <p>
     *            For subsequent calls to the operation, to continue listing
     *            data, set the value of this parameter to the value returned
     *            from the previous response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMembersRequest withNextToken(String nextToken) {
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
        if (getOnlyAssociated() != null)
            sb.append("OnlyAssociated: " + getOnlyAssociated() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOnlyAssociated() == null) ? 0 : getOnlyAssociated().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMembersRequest == false)
            return false;
        ListMembersRequest other = (ListMembersRequest) obj;

        if (other.getOnlyAssociated() == null ^ this.getOnlyAssociated() == null)
            return false;
        if (other.getOnlyAssociated() != null
                && other.getOnlyAssociated().equals(this.getOnlyAssociated()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
