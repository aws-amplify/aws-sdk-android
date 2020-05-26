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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes the specified member account from Amazon Macie Classic.
 * </p>
 */
public class DisassociateMemberAccountRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ID of the member account that you want to remove from Amazon Macie
     * Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     */
    private String memberAccountId;

    /**
     * <p>
     * The ID of the member account that you want to remove from Amazon Macie
     * Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @return <p>
     *         The ID of the member account that you want to remove from Amazon
     *         Macie Classic.
     *         </p>
     */
    public String getMemberAccountId() {
        return memberAccountId;
    }

    /**
     * <p>
     * The ID of the member account that you want to remove from Amazon Macie
     * Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param memberAccountId <p>
     *            The ID of the member account that you want to remove from
     *            Amazon Macie Classic.
     *            </p>
     */
    public void setMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
    }

    /**
     * <p>
     * The ID of the member account that you want to remove from Amazon Macie
     * Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[0-9]{12}<br/>
     *
     * @param memberAccountId <p>
     *            The ID of the member account that you want to remove from
     *            Amazon Macie Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateMemberAccountRequest withMemberAccountId(String memberAccountId) {
        this.memberAccountId = memberAccountId;
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
        if (getMemberAccountId() != null)
            sb.append("memberAccountId: " + getMemberAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMemberAccountId() == null) ? 0 : getMemberAccountId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateMemberAccountRequest == false)
            return false;
        DisassociateMemberAccountRequest other = (DisassociateMemberAccountRequest) obj;

        if (other.getMemberAccountId() == null ^ this.getMemberAccountId() == null)
            return false;
        if (other.getMemberAccountId() != null
                && other.getMemberAccountId().equals(this.getMemberAccountId()) == false)
            return false;
        return true;
    }
}
