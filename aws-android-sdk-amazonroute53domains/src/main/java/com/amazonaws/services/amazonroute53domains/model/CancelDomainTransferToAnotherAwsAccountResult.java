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
 * The <code>CancelDomainTransferToAnotherAwsAccount</code> response includes
 * the following element.
 * </p>
 */
public class CancelDomainTransferToAnotherAwsAccountResult implements Serializable {
    /**
     * <p>
     * The identifier that <code>TransferDomainToAnotherAwsAccount</code>
     * returned to track the progress of the request. Because the transfer
     * request was canceled, the value is no longer valid, and you can't use
     * <code>GetOperationDetail</code> to query the operation status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     */
    private String operationId;

    /**
     * <p>
     * The identifier that <code>TransferDomainToAnotherAwsAccount</code>
     * returned to track the progress of the request. Because the transfer
     * request was canceled, the value is no longer valid, and you can't use
     * <code>GetOperationDetail</code> to query the operation status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @return <p>
     *         The identifier that
     *         <code>TransferDomainToAnotherAwsAccount</code> returned to track
     *         the progress of the request. Because the transfer request was
     *         canceled, the value is no longer valid, and you can't use
     *         <code>GetOperationDetail</code> to query the operation status.
     *         </p>
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * <p>
     * The identifier that <code>TransferDomainToAnotherAwsAccount</code>
     * returned to track the progress of the request. Because the transfer
     * request was canceled, the value is no longer valid, and you can't use
     * <code>GetOperationDetail</code> to query the operation status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param operationId <p>
     *            The identifier that
     *            <code>TransferDomainToAnotherAwsAccount</code> returned to
     *            track the progress of the request. Because the transfer
     *            request was canceled, the value is no longer valid, and you
     *            can't use <code>GetOperationDetail</code> to query the
     *            operation status.
     *            </p>
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The identifier that <code>TransferDomainToAnotherAwsAccount</code>
     * returned to track the progress of the request. Because the transfer
     * request was canceled, the value is no longer valid, and you can't use
     * <code>GetOperationDetail</code> to query the operation status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 255<br/>
     *
     * @param operationId <p>
     *            The identifier that
     *            <code>TransferDomainToAnotherAwsAccount</code> returned to
     *            track the progress of the request. Because the transfer
     *            request was canceled, the value is no longer valid, and you
     *            can't use <code>GetOperationDetail</code> to query the
     *            operation status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelDomainTransferToAnotherAwsAccountResult withOperationId(String operationId) {
        this.operationId = operationId;
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
            sb.append("OperationId: " + getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelDomainTransferToAnotherAwsAccountResult == false)
            return false;
        CancelDomainTransferToAnotherAwsAccountResult other = (CancelDomainTransferToAnotherAwsAccountResult) obj;

        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null
                && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }
}
