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
 * Cancels the transfer of a domain from the current AWS account to another AWS
 * account. You initiate a transfer between AWS accounts using <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_TransferDomainToAnotherAwsAccount.html"
 * >TransferDomainToAnotherAwsAccount</a>.
 * </p>
 * <important>
 * <p>
 * You must cancel the transfer before the other AWS account accepts the
 * transfer using <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
 * >AcceptDomainTransferFromAnotherAwsAccount</a>.
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
public class CancelDomainTransferToAnotherAwsAccountRequest extends AmazonWebServiceRequest
        implements Serializable {
    /**
     * <p>
     * The name of the domain for which you want to cancel the transfer to
     * another AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String domainName;

    /**
     * <p>
     * The name of the domain for which you want to cancel the transfer to
     * another AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The name of the domain for which you want to cancel the transfer
     *         to another AWS account.
     *         </p>
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * <p>
     * The name of the domain for which you want to cancel the transfer to
     * another AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain for which you want to cancel the
     *            transfer to another AWS account.
     *            </p>
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain for which you want to cancel the transfer to
     * another AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param domainName <p>
     *            The name of the domain for which you want to cancel the
     *            transfer to another AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelDomainTransferToAnotherAwsAccountRequest withDomainName(String domainName) {
        this.domainName = domainName;
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
            sb.append("DomainName: " + getDomainName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelDomainTransferToAnotherAwsAccountRequest == false)
            return false;
        CancelDomainTransferToAnotherAwsAccountRequest other = (CancelDomainTransferToAnotherAwsAccountRequest) obj;

        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        return true;
    }
}
