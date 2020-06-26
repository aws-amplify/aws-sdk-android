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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The output for the <a>DescribeAccountLimits</a> action.
 * </p>
 */
public class DescribeAccountLimitsResult implements Serializable {
    /**
     * <p>
     * An account limit structure that contain a list of AWS CloudFormation
     * account limits and their values.
     * </p>
     */
    private java.util.List<AccountLimit> accountLimits;

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next
     * page of limits. If no additional page exists, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An account limit structure that contain a list of AWS CloudFormation
     * account limits and their values.
     * </p>
     *
     * @return <p>
     *         An account limit structure that contain a list of AWS
     *         CloudFormation account limits and their values.
     *         </p>
     */
    public java.util.List<AccountLimit> getAccountLimits() {
        return accountLimits;
    }

    /**
     * <p>
     * An account limit structure that contain a list of AWS CloudFormation
     * account limits and their values.
     * </p>
     *
     * @param accountLimits <p>
     *            An account limit structure that contain a list of AWS
     *            CloudFormation account limits and their values.
     *            </p>
     */
    public void setAccountLimits(java.util.Collection<AccountLimit> accountLimits) {
        if (accountLimits == null) {
            this.accountLimits = null;
            return;
        }

        this.accountLimits = new java.util.ArrayList<AccountLimit>(accountLimits);
    }

    /**
     * <p>
     * An account limit structure that contain a list of AWS CloudFormation
     * account limits and their values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountLimits <p>
     *            An account limit structure that contain a list of AWS
     *            CloudFormation account limits and their values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountLimitsResult withAccountLimits(AccountLimit... accountLimits) {
        if (getAccountLimits() == null) {
            this.accountLimits = new java.util.ArrayList<AccountLimit>(accountLimits.length);
        }
        for (AccountLimit value : accountLimits) {
            this.accountLimits.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An account limit structure that contain a list of AWS CloudFormation
     * account limits and their values.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accountLimits <p>
     *            An account limit structure that contain a list of AWS
     *            CloudFormation account limits and their values.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountLimitsResult withAccountLimits(
            java.util.Collection<AccountLimit> accountLimits) {
        setAccountLimits(accountLimits);
        return this;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next
     * page of limits. If no additional page exists, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         If the output exceeds 1 MB in size, a string that identifies the
     *         next page of limits. If no additional page exists, this value is
     *         null.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next
     * page of limits. If no additional page exists, this value is null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the output exceeds 1 MB in size, a string that identifies
     *            the next page of limits. If no additional page exists, this
     *            value is null.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the output exceeds 1 MB in size, a string that identifies the next
     * page of limits. If no additional page exists, this value is null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param nextToken <p>
     *            If the output exceeds 1 MB in size, a string that identifies
     *            the next page of limits. If no additional page exists, this
     *            value is null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAccountLimitsResult withNextToken(String nextToken) {
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
        if (getAccountLimits() != null)
            sb.append("AccountLimits: " + getAccountLimits() + ",");
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
                + ((getAccountLimits() == null) ? 0 : getAccountLimits().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountLimitsResult == false)
            return false;
        DescribeAccountLimitsResult other = (DescribeAccountLimitsResult) obj;

        if (other.getAccountLimits() == null ^ this.getAccountLimits() == null)
            return false;
        if (other.getAccountLimits() != null
                && other.getAccountLimits().equals(this.getAccountLimits()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
