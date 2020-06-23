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
 * Retrieves the current status of an asynchronous request to create an account.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account or
 * by a member account that is a delegated administrator for an AWS service.
 * </p>
 */
public class DescribeCreateAccountStatusRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies the <code>operationId</code> that uniquely identifies the
     * request. You can get the ID from the response to an earlier
     * <a>CreateAccount</a> request, or from the <a>ListCreateAccountStatus</a>
     * operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * create account request ID string requires "car-" followed by from 8 to 32
     * lowercase letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^car-[a-z0-9]{8,32}$<br/>
     */
    private String createAccountRequestId;

    /**
     * <p>
     * Specifies the <code>operationId</code> that uniquely identifies the
     * request. You can get the ID from the response to an earlier
     * <a>CreateAccount</a> request, or from the <a>ListCreateAccountStatus</a>
     * operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * create account request ID string requires "car-" followed by from 8 to 32
     * lowercase letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^car-[a-z0-9]{8,32}$<br/>
     *
     * @return <p>
     *         Specifies the <code>operationId</code> that uniquely identifies
     *         the request. You can get the ID from the response to an earlier
     *         <a>CreateAccount</a> request, or from the
     *         <a>ListCreateAccountStatus</a> operation.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for a create account request ID string requires "car-" followed
     *         by from 8 to 32 lowercase letters or digits.
     *         </p>
     */
    public String getCreateAccountRequestId() {
        return createAccountRequestId;
    }

    /**
     * <p>
     * Specifies the <code>operationId</code> that uniquely identifies the
     * request. You can get the ID from the response to an earlier
     * <a>CreateAccount</a> request, or from the <a>ListCreateAccountStatus</a>
     * operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * create account request ID string requires "car-" followed by from 8 to 32
     * lowercase letters or digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^car-[a-z0-9]{8,32}$<br/>
     *
     * @param createAccountRequestId <p>
     *            Specifies the <code>operationId</code> that uniquely
     *            identifies the request. You can get the ID from the response
     *            to an earlier <a>CreateAccount</a> request, or from the
     *            <a>ListCreateAccountStatus</a> operation.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a create account request ID string requires
     *            "car-" followed by from 8 to 32 lowercase letters or digits.
     *            </p>
     */
    public void setCreateAccountRequestId(String createAccountRequestId) {
        this.createAccountRequestId = createAccountRequestId;
    }

    /**
     * <p>
     * Specifies the <code>operationId</code> that uniquely identifies the
     * request. You can get the ID from the response to an earlier
     * <a>CreateAccount</a> request, or from the <a>ListCreateAccountStatus</a>
     * operation.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for a
     * create account request ID string requires "car-" followed by from 8 to 32
     * lowercase letters or digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^car-[a-z0-9]{8,32}$<br/>
     *
     * @param createAccountRequestId <p>
     *            Specifies the <code>operationId</code> that uniquely
     *            identifies the request. You can get the ID from the response
     *            to an earlier <a>CreateAccount</a> request, or from the
     *            <a>ListCreateAccountStatus</a> operation.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for a create account request ID string requires
     *            "car-" followed by from 8 to 32 lowercase letters or digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCreateAccountStatusRequest withCreateAccountRequestId(
            String createAccountRequestId) {
        this.createAccountRequestId = createAccountRequestId;
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
        if (getCreateAccountRequestId() != null)
            sb.append("CreateAccountRequestId: " + getCreateAccountRequestId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCreateAccountRequestId() == null) ? 0 : getCreateAccountRequestId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCreateAccountStatusRequest == false)
            return false;
        DescribeCreateAccountStatusRequest other = (DescribeCreateAccountStatusRequest) obj;

        if (other.getCreateAccountRequestId() == null ^ this.getCreateAccountRequestId() == null)
            return false;
        if (other.getCreateAccountRequestId() != null
                && other.getCreateAccountRequestId().equals(this.getCreateAccountRequestId()) == false)
            return false;
        return true;
    }
}
