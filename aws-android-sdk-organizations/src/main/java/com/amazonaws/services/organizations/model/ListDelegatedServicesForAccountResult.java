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

public class ListDelegatedServicesForAccountResult implements Serializable {
    /**
     * <p>
     * The services for which the account is a delegated administrator.
     * </p>
     */
    private java.util.List<DelegatedService> delegatedServices;

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The services for which the account is a delegated administrator.
     * </p>
     *
     * @return <p>
     *         The services for which the account is a delegated administrator.
     *         </p>
     */
    public java.util.List<DelegatedService> getDelegatedServices() {
        return delegatedServices;
    }

    /**
     * <p>
     * The services for which the account is a delegated administrator.
     * </p>
     *
     * @param delegatedServices <p>
     *            The services for which the account is a delegated
     *            administrator.
     *            </p>
     */
    public void setDelegatedServices(java.util.Collection<DelegatedService> delegatedServices) {
        if (delegatedServices == null) {
            this.delegatedServices = null;
            return;
        }

        this.delegatedServices = new java.util.ArrayList<DelegatedService>(delegatedServices);
    }

    /**
     * <p>
     * The services for which the account is a delegated administrator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delegatedServices <p>
     *            The services for which the account is a delegated
     *            administrator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDelegatedServicesForAccountResult withDelegatedServices(
            DelegatedService... delegatedServices) {
        if (getDelegatedServices() == null) {
            this.delegatedServices = new java.util.ArrayList<DelegatedService>(
                    delegatedServices.length);
        }
        for (DelegatedService value : delegatedServices) {
            this.delegatedServices.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The services for which the account is a delegated administrator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delegatedServices <p>
     *            The services for which the account is a delegated
     *            administrator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListDelegatedServicesForAccountResult withDelegatedServices(
            java.util.Collection<DelegatedService> delegatedServices) {
        setDelegatedServices(delegatedServices);
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100000<br/>
     * <b>Pattern: </b>[\s\S]*<br/>
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
    public ListDelegatedServicesForAccountResult withNextToken(String nextToken) {
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
        if (getDelegatedServices() != null)
            sb.append("DelegatedServices: " + getDelegatedServices() + ",");
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
                + ((getDelegatedServices() == null) ? 0 : getDelegatedServices().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDelegatedServicesForAccountResult == false)
            return false;
        ListDelegatedServicesForAccountResult other = (ListDelegatedServicesForAccountResult) obj;

        if (other.getDelegatedServices() == null ^ this.getDelegatedServices() == null)
            return false;
        if (other.getDelegatedServices() != null
                && other.getDelegatedServices().equals(this.getDelegatedServices()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
