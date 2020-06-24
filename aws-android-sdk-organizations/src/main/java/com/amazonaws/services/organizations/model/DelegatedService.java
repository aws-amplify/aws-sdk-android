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

/**
 * <p>
 * Contains information about the AWS service for which the account is a
 * delegated administrator.
 * </p>
 */
public class DelegatedService implements Serializable {
    /**
     * <p>
     * The name of a service that can request an operation for the specified
     * service. This is typically in the form of a URL, such as:
     * <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String servicePrincipal;

    /**
     * <p>
     * The date that the account became a delegated administrator for this
     * service.
     * </p>
     */
    private java.util.Date delegationEnabledDate;

    /**
     * <p>
     * The name of a service that can request an operation for the specified
     * service. This is typically in the form of a URL, such as:
     * <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return <p>
     *         The name of a service that can request an operation for the
     *         specified service. This is typically in the form of a URL, such
     *         as: <code> <i>servicename</i>.amazonaws.com</code>.
     *         </p>
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    /**
     * <p>
     * The name of a service that can request an operation for the specified
     * service. This is typically in the form of a URL, such as:
     * <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param servicePrincipal <p>
     *            The name of a service that can request an operation for the
     *            specified service. This is typically in the form of a URL,
     *            such as: <code> <i>servicename</i>.amazonaws.com</code>.
     *            </p>
     */
    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * <p>
     * The name of a service that can request an operation for the specified
     * service. This is typically in the form of a URL, such as:
     * <code> <i>servicename</i>.amazonaws.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param servicePrincipal <p>
     *            The name of a service that can request an operation for the
     *            specified service. This is typically in the form of a URL,
     *            such as: <code> <i>servicename</i>.amazonaws.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DelegatedService withServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
        return this;
    }

    /**
     * <p>
     * The date that the account became a delegated administrator for this
     * service.
     * </p>
     *
     * @return <p>
     *         The date that the account became a delegated administrator for
     *         this service.
     *         </p>
     */
    public java.util.Date getDelegationEnabledDate() {
        return delegationEnabledDate;
    }

    /**
     * <p>
     * The date that the account became a delegated administrator for this
     * service.
     * </p>
     *
     * @param delegationEnabledDate <p>
     *            The date that the account became a delegated administrator for
     *            this service.
     *            </p>
     */
    public void setDelegationEnabledDate(java.util.Date delegationEnabledDate) {
        this.delegationEnabledDate = delegationEnabledDate;
    }

    /**
     * <p>
     * The date that the account became a delegated administrator for this
     * service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param delegationEnabledDate <p>
     *            The date that the account became a delegated administrator for
     *            this service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DelegatedService withDelegationEnabledDate(java.util.Date delegationEnabledDate) {
        this.delegationEnabledDate = delegationEnabledDate;
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
        if (getServicePrincipal() != null)
            sb.append("ServicePrincipal: " + getServicePrincipal() + ",");
        if (getDelegationEnabledDate() != null)
            sb.append("DelegationEnabledDate: " + getDelegationEnabledDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getServicePrincipal() == null) ? 0 : getServicePrincipal().hashCode());
        hashCode = prime
                * hashCode
                + ((getDelegationEnabledDate() == null) ? 0 : getDelegationEnabledDate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DelegatedService == false)
            return false;
        DelegatedService other = (DelegatedService) obj;

        if (other.getServicePrincipal() == null ^ this.getServicePrincipal() == null)
            return false;
        if (other.getServicePrincipal() != null
                && other.getServicePrincipal().equals(this.getServicePrincipal()) == false)
            return false;
        if (other.getDelegationEnabledDate() == null ^ this.getDelegationEnabledDate() == null)
            return false;
        if (other.getDelegationEnabledDate() != null
                && other.getDelegationEnabledDate().equals(this.getDelegationEnabledDate()) == false)
            return false;
        return true;
    }
}
