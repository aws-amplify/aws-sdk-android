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

package com.amazonaws.services.amazonroute53domains.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Transfers a domain from the current AWS account to another AWS account. Note
 * the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The AWS account that you're transferring the domain to must accept the
 * transfer. If the other account doesn't accept the transfer within 3 days, we
 * cancel the transfer. See <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
 * >AcceptDomainTransferFromAnotherAwsAccount</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can cancel the transfer before the other account accepts it. See <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_CancelDomainTransferToAnotherAwsAccount.html"
 * >CancelDomainTransferToAnotherAwsAccount</a>.
 * </p>
 * </li>
 * <li>
 * <p>
 * The other account can reject the transfer. See <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_RejectDomainTransferFromAnotherAwsAccount.html"
 * >RejectDomainTransferFromAnotherAwsAccount</a>.
 * </p>
 * </li>
 * </ul>
 * <important>
 * <p>
 * When you transfer a domain from one AWS account to another, Route 53 doesn't
 * transfer the hosted zone that is associated with the domain. DNS resolution
 * isn't affected if the domain and the hosted zone are owned by separate
 * accounts, so transferring the hosted zone is optional. For information about
 * transferring the hosted zone to another AWS account, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/hosted-zones-migrating.html"
 * >Migrating a Hosted Zone to a Different AWS Account</a> in the <i>Amazon
 * Route 53 Developer Guide</i>.
 * </p>
 * </important>
 * <p>
 * Use either <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ListOperations.html"
 * >ListOperations</a> or <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
 * >GetOperationDetail</a> to determine whether the operation succeeded. <a
 * href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
 * >GetOperationDetail</a> provides additional information, for example,
 * <code>Domain Transfer from Aws Account 111122223333 has been cancelled</code>
 * .
 * </p>
 */
public class TransferDomainToAnotherAwsAccountRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the domain that you want to transfer from the current AWS
     * account to another account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * The account ID of the AWS account that you want to transfer the domain
     * to, for example, <code>111122223333</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\d{12})$<br/>
     */
    private String accountId;

    /**
     * <p>
     * The name of the domain that you want to transfer from the current AWS
     * account to another account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain that you want to transfer from the current
     *         AWS account to another account.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer from the current AWS
     * account to another account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to transfer from the
     *            current AWS account to another account.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you want to transfer from the current AWS
     * account to another account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain that you want to transfer from the
     *            current AWS account to another account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainToAnotherAwsAccountRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * <p>
     * The account ID of the AWS account that you want to transfer the domain
     * to, for example, <code>111122223333</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\d{12})$<br/>
     *
     * @return <p>
     *         The account ID of the AWS account that you want to transfer the
     *         domain to, for example, <code>111122223333</code>.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The account ID of the AWS account that you want to transfer the domain
     * to, for example, <code>111122223333</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\d{12})$<br/>
     *
     * @param accountId <p>
     *            The account ID of the AWS account that you want to transfer
     *            the domain to, for example, <code>111122223333</code>.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID of the AWS account that you want to transfer the domain
     * to, for example, <code>111122223333</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^(\d{12})$<br/>
     *
     * @param accountId <p>
     *            The account ID of the AWS account that you want to transfer
     *            the domain to, for example, <code>111122223333</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainToAnotherAwsAccountRequest withAccountId(String accountId) {
        this.accountId = accountId;
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferDomainToAnotherAwsAccountRequest == false)
            return false;
        TransferDomainToAnotherAwsAccountRequest other = (TransferDomainToAnotherAwsAccountRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }
}
