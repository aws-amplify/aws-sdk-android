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
 * Retrieves AWS Organizations-related information about the specified account.
 * </p>
 * <p>
 * This operation can be called only from the organization's master account or
 * by a member account that is a delegated administrator for an AWS service.
 * </p>
 */
public class DescribeAccountRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) of the AWS account that you want information
     * about. You can get the ID from the <a>ListAccounts</a> or
     * <a>ListAccountsForParent</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     */
    private String accountId;

    /**
     * <p>
     * The unique identifier (ID) of the AWS account that you want information
     * about. You can get the ID from the <a>ListAccounts</a> or
     * <a>ListAccountsForParent</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @return <p>
     *         The unique identifier (ID) of the AWS account that you want
     *         information about. You can get the ID from the
     *         <a>ListAccounts</a> or <a>ListAccountsForParent</a> operations.
     *         </p>
     *         <p>
     *         The <a href="http://wikipedia.org/wiki/regex">regex pattern</a>
     *         for an account ID string requires exactly 12 digits.
     *         </p>
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the AWS account that you want information
     * about. You can get the ID from the <a>ListAccounts</a> or
     * <a>ListAccountsForParent</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>
     *            The unique identifier (ID) of the AWS account that you want
     *            information about. You can get the ID from the
     *            <a>ListAccounts</a> or <a>ListAccountsForParent</a>
     *            operations.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the AWS account that you want information
     * about. You can get the ID from the <a>ListAccounts</a> or
     * <a>ListAccountsForParent</a> operations.
     * </p>
     * <p>
     * The <a href="http://wikipedia.org/wiki/regex">regex pattern</a> for an
     * account ID string requires exactly 12 digits.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^\d{12}$<br/>
     *
     * @param accountId <p>
     *            The unique identifier (ID) of the AWS account that you want
     *            information about. You can get the ID from the
     *            <a>ListAccounts</a> or <a>ListAccountsForParent</a>
     *            operations.
     *            </p>
     *            <p>
     *            The <a href="http://wikipedia.org/wiki/regex">regex
     *            pattern</a> for an account ID string requires exactly 12
     *            digits.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountRequest withAccountId(String accountId) {
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
        if (getAccountId() != null)
            sb.append("AccountId: " + getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountRequest == false)
            return false;
        DescribeAccountRequest other = (DescribeAccountRequest) obj;

        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null
                && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }
}
