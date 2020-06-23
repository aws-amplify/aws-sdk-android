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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

public class ListDelegatedAdministratorsResult implements Serializable {
    /**
     * <p>
     * The list of delegated administrators in your organization.
     * </p>
     */
    private java.util.List<DelegatedAdministrator> delegatedAdministrators;

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of delegated administrators in your organization.
     * </p>
     *
     * @return <p>
     *         The list of delegated administrators in your organization.
     *         </p>
     */
    public java.util.List<DelegatedAdministrator> getDelegatedAdministrators() {
        return delegatedAdministrators;
    }

    /**
     * <p>
     * The list of delegated administrators in your organization.
     * </p>
     *
     * @param delegatedAdministrators <p>
     *            The list of delegated administrators in your organization.
     *            </p>
     */
    public void setDelegatedAdministrators(
            java.util.Collection<DelegatedAdministrator> delegatedAdministrators) {
        if (delegatedAdministrators == null) {
            this.delegatedAdministrators = null;
            return;
        }

        this.delegatedAdministrators = new java.util.ArrayList<DelegatedAdministrator>(
                delegatedAdministrators);
    }

    /**
     * <p>
     * The list of delegated administrators in your organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delegatedAdministrators <p>
     *            The list of delegated administrators in your organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDelegatedAdministratorsResult withDelegatedAdministrators(
            DelegatedAdministrator... delegatedAdministrators) {
        if (getDelegatedAdministrators() == null) {
            this.delegatedAdministrators = new java.util.ArrayList<DelegatedAdministrator>(
                    delegatedAdministrators.length);
        }
        for (DelegatedAdministrator value : delegatedAdministrators) {
            this.delegatedAdministrators.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of delegated administrators in your organization.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delegatedAdministrators <p>
     *            The list of delegated administrators in your organization.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDelegatedAdministratorsResult withDelegatedAdministrators(
            java.util.Collection<DelegatedAdministrator> delegatedAdministrators) {
        setDelegatedAdministrators(delegatedAdministrators);
        return this;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     *
     * @return <p>
     *         If present, indicates that more output is available than is
     *         included in the current response. Use this value in the
     *         <code>NextToken</code> request parameter in a subsequent call to
     *         the operation to get the next part of the output. You should
     *         repeat this until the <code>NextToken</code> response element
     *         comes back as <code>null</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     *
     * @param nextToken <p>
     *            If present, indicates that more output is available than is
     *            included in the current response. Use this value in the
     *            <code>NextToken</code> request parameter in a subsequent call
     *            to the operation to get the next part of the output. You
     *            should repeat this until the <code>NextToken</code> response
     *            element comes back as <code>null</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If present, indicates that more output is available than is
     *            included in the current response. Use this value in the
     *            <code>NextToken</code> request parameter in a subsequent call
     *            to the operation to get the next part of the output. You
     *            should repeat this until the <code>NextToken</code> response
     *            element comes back as <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDelegatedAdministratorsResult withNextToken(String nextToken) {
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
        if (getDelegatedAdministrators() != null)
            sb.append("DelegatedAdministrators: " + getDelegatedAdministrators() + ",");
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
                + ((getDelegatedAdministrators() == null) ? 0 : getDelegatedAdministrators()
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

        if (obj instanceof ListDelegatedAdministratorsResult == false)
            return false;
        ListDelegatedAdministratorsResult other = (ListDelegatedAdministratorsResult) obj;

        if (other.getDelegatedAdministrators() == null ^ this.getDelegatedAdministrators() == null)
            return false;
        if (other.getDelegatedAdministrators() != null
                && other.getDelegatedAdministrators().equals(this.getDelegatedAdministrators()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
