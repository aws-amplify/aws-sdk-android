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

/**
 * <p>
 * The <code>TransferDomainToAnotherAwsAccount</code> response includes the
 * following elements.
 * </p>
 */
public class TransferDomainToAnotherAwsAccountResult implements Serializable {
    /**
     * <p>
     * Identifier for tracking the progress of the request. To query the
     * operation status, use <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String operationId;

    /**
     * <p>
     * To finish transferring a domain to another AWS account, the account that
     * the domain is being transferred to must submit an <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a> request. The request must
     * include the value of the <code>Password</code> element that was returned
     * in the <code>TransferDomainToAnotherAwsAccount</code> response.
     * </p>
     */
    private String password;

    /**
     * <p>
     * Identifier for tracking the progress of the request. To query the
     * operation status, use <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         Identifier for tracking the progress of the request. To query the
     *         operation status, use <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     *         >GetOperationDetail</a>.
     *         </p>
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * <p>
     * Identifier for tracking the progress of the request. To query the
     * operation status, use <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param operationId <p>
     *            Identifier for tracking the progress of the request. To query
     *            the operation status, use <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     *            >GetOperationDetail</a>.
     *            </p>
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * Identifier for tracking the progress of the request. To query the
     * operation status, use <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     * >GetOperationDetail</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param operationId <p>
     *            Identifier for tracking the progress of the request. To query
     *            the operation status, use <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_GetOperationDetail.html"
     *            >GetOperationDetail</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainToAnotherAwsAccountResult withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * <p>
     * To finish transferring a domain to another AWS account, the account that
     * the domain is being transferred to must submit an <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a> request. The request must
     * include the value of the <code>Password</code> element that was returned
     * in the <code>TransferDomainToAnotherAwsAccount</code> response.
     * </p>
     *
     * @return <p>
     *         To finish transferring a domain to another AWS account, the
     *         account that the domain is being transferred to must submit an <a
     *         href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     *         >AcceptDomainTransferFromAnotherAwsAccount</a> request. The
     *         request must include the value of the <code>Password</code>
     *         element that was returned in the
     *         <code>TransferDomainToAnotherAwsAccount</code> response.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * To finish transferring a domain to another AWS account, the account that
     * the domain is being transferred to must submit an <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a> request. The request must
     * include the value of the <code>Password</code> element that was returned
     * in the <code>TransferDomainToAnotherAwsAccount</code> response.
     * </p>
     *
     * @param password <p>
     *            To finish transferring a domain to another AWS account, the
     *            account that the domain is being transferred to must submit an
     *            <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     *            >AcceptDomainTransferFromAnotherAwsAccount</a> request. The
     *            request must include the value of the <code>Password</code>
     *            element that was returned in the
     *            <code>TransferDomainToAnotherAwsAccount</code> response.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * To finish transferring a domain to another AWS account, the account that
     * the domain is being transferred to must submit an <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     * >AcceptDomainTransferFromAnotherAwsAccount</a> request. The request must
     * include the value of the <code>Password</code> element that was returned
     * in the <code>TransferDomainToAnotherAwsAccount</code> response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param password <p>
     *            To finish transferring a domain to another AWS account, the
     *            account that the domain is being transferred to must submit an
     *            <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_AcceptDomainTransferFromAnotherAwsAccount.html"
     *            >AcceptDomainTransferFromAnotherAwsAccount</a> request. The
     *            request must include the value of the <code>Password</code>
     *            element that was returned in the
     *            <code>TransferDomainToAnotherAwsAccount</code> response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TransferDomainToAnotherAwsAccountResult withPassword(String password) {
        this.password = password;
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
        if (getOperationId() != null)
            sb.append("OperationId: " + getOperationId() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferDomainToAnotherAwsAccountResult == false)
            return false;
        TransferDomainToAnotherAwsAccountResult other = (TransferDomainToAnotherAwsAccountResult) obj;

        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null
                && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        return true;
    }
}
