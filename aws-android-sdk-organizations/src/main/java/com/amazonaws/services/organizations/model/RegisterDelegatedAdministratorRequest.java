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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables the specified member account to administer the Organizations features
 * of the specified AWS service. It grants read-only access to AWS Organizations
 * service data. The account still requires IAM permissions to access and
 * administer the AWS service.
 * </p>
 * <p>
 * You can run this action only for AWS services that support this feature. For
 * a current list of services that support it, see the column <i>Supports
 * Delegated Administrator</i> in the table at <a href=
 * "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrated-services-list.html"
 * >AWS Services that you can use with AWS Organizations</a> in the <i>AWS
 * Organizations User Guide.</i>
 * </p>
 * <p>
 * This operation can be called only from the organization's master account.
 * </p>
 */
public class RegisterDelegatedAdministratorRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The account ID number of the member account in the organization to
     * register as a delegated administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String accountId;

    /**
     * <p>
     * The service principal of the AWS service for which you want to make the
     * member account a delegated administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String servicePrincipal;

    /**
     * <p>
     * The account ID number of the member account in the organization to
     * register as a delegated administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>
     *         The account ID number of the member account in the organization
     *         to register as a delegated administrator.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The account ID number of the member account in the organization to
     * register as a delegated administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>
     *            The account ID number of the member account in the
     *            organization to register as a delegated administrator.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID number of the member account in the organization to
     * register as a delegated administrator.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>
     *            The account ID number of the member account in the
     *            organization to register as a delegated administrator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDelegatedAdministratorRequest withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * <p>
     * The service principal of the AWS service for which you want to make the
     * member account a delegated administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return <p>
     *         The service principal of the AWS service for which you want to
     *         make the member account a delegated administrator.
     *         </p>
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    /**
     * <p>
     * The service principal of the AWS service for which you want to make the
     * member account a delegated administrator.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param servicePrincipal <p>
     *            The service principal of the AWS service for which you want to
     *            make the member account a delegated administrator.
     *            </p>
     */
    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * <p>
     * The service principal of the AWS service for which you want to make the
     * member account a delegated administrator.
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
     *            The service principal of the AWS service for which you want to
     *            make the member account a delegated administrator.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RegisterDelegatedAdministratorRequest withServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId() + ",");
        if (getServicePrincipal() != null)
            sb.append("ServicePrincipal: " + getServicePrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode
                + ((getServicePrincipal() == null) ? 0 : getServicePrincipal().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterDelegatedAdministratorRequest == false)
            return false;
        RegisterDelegatedAdministratorRequest other = (RegisterDelegatedAdministratorRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getServicePrincipal() == null ^ this.getServicePrincipal() == null)
            return false;
        if (other.getServicePrincipal() != null
                && other.getServicePrincipal().equals(this.getServicePrincipal()) == false)
            return false;
        return true;
    }
}
