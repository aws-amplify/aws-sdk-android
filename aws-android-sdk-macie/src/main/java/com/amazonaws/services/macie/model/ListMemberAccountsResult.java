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

package com.amazonaws.services.macie.model;

import java.io.Serializable;

public class ListMemberAccountsResult implements Serializable {
    /**
     * <p>
     * A list of the Amazon Macie Classic member accounts returned by the
     * action. The current master account is also included in this list.
     * </p>
     */
    private java.util.List<MemberAccount> memberAccounts;

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the nextToken parameter in a subsequent pagination request. If there is
     * no more data to be listed, this parameter is set to null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the Amazon Macie Classic member accounts returned by the
     * action. The current master account is also included in this list.
     * </p>
     *
     * @return <p>
     *         A list of the Amazon Macie Classic member accounts returned by
     *         the action. The current master account is also included in this
     *         list.
     *         </p>
     */
    public java.util.List<MemberAccount> getMemberAccounts() {
        return memberAccounts;
    }

    /**
     * <p>
     * A list of the Amazon Macie Classic member accounts returned by the
     * action. The current master account is also included in this list.
     * </p>
     *
     * @param memberAccounts <p>
     *            A list of the Amazon Macie Classic member accounts returned by
     *            the action. The current master account is also included in
     *            this list.
     *            </p>
     */
    public void setMemberAccounts(java.util.Collection<MemberAccount> memberAccounts) {
        if (memberAccounts == null) {
            this.memberAccounts = null;
            return;
        }

        this.memberAccounts = new java.util.ArrayList<MemberAccount>(memberAccounts);
    }

    /**
     * <p>
     * A list of the Amazon Macie Classic member accounts returned by the
     * action. The current master account is also included in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberAccounts <p>
     *            A list of the Amazon Macie Classic member accounts returned by
     *            the action. The current master account is also included in
     *            this list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMemberAccountsResult withMemberAccounts(MemberAccount... memberAccounts) {
        if (getMemberAccounts() == null) {
            this.memberAccounts = new java.util.ArrayList<MemberAccount>(memberAccounts.length);
        }
        for (MemberAccount value : memberAccounts) {
            this.memberAccounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the Amazon Macie Classic member accounts returned by the
     * action. The current master account is also included in this list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param memberAccounts <p>
     *            A list of the Amazon Macie Classic member accounts returned by
     *            the action. The current master account is also included in
     *            this list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMemberAccountsResult withMemberAccounts(
            java.util.Collection<MemberAccount> memberAccounts) {
        setMemberAccounts(memberAccounts);
        return this;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the nextToken parameter in a subsequent pagination request. If there is
     * no more data to be listed, this parameter is set to null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         When a response is generated, if there is more data to be listed,
     *         this parameter is present in the response and contains the value
     *         to use for the nextToken parameter in a subsequent pagination
     *         request. If there is no more data to be listed, this parameter is
     *         set to null.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the nextToken parameter in a subsequent pagination request. If there is
     * no more data to be listed, this parameter is set to null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param nextToken <p>
     *            When a response is generated, if there is more data to be
     *            listed, this parameter is present in the response and contains
     *            the value to use for the nextToken parameter in a subsequent
     *            pagination request. If there is no more data to be listed,
     *            this parameter is set to null.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the nextToken parameter in a subsequent pagination request. If there is
     * no more data to be listed, this parameter is set to null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param nextToken <p>
     *            When a response is generated, if there is more data to be
     *            listed, this parameter is present in the response and contains
     *            the value to use for the nextToken parameter in a subsequent
     *            pagination request. If there is no more data to be listed,
     *            this parameter is set to null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListMemberAccountsResult withNextToken(String nextToken) {
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
        if (getMemberAccounts() != null)
            sb.append("memberAccounts: " + getMemberAccounts() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMemberAccounts() == null) ? 0 : getMemberAccounts().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListMemberAccountsResult == false)
            return false;
        ListMemberAccountsResult other = (ListMemberAccountsResult) obj;

        if (other.getMemberAccounts() == null ^ this.getMemberAccounts() == null)
            return false;
        if (other.getMemberAccounts() != null
                && other.getMemberAccounts().equals(this.getMemberAccounts()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
