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

package com.amazonaws.services.macie2.model;

import java.io.Serializable;

public class GetMasterAccountResult implements Serializable {
    /**
     * <p>
     * The AWS account ID for the master account. If the accounts are associated
     * by a Macie membership invitation, this object also provides details about
     * the invitation that was sent and accepted to establish the relationship
     * between the accounts.
     * </p>
     */
    private Invitation master;

    /**
     * <p>
     * The AWS account ID for the master account. If the accounts are associated
     * by a Macie membership invitation, this object also provides details about
     * the invitation that was sent and accepted to establish the relationship
     * between the accounts.
     * </p>
     *
     * @return <p>
     *         The AWS account ID for the master account. If the accounts are
     *         associated by a Macie membership invitation, this object also
     *         provides details about the invitation that was sent and accepted
     *         to establish the relationship between the accounts.
     *         </p>
     */
    public Invitation getMaster() {
        return master;
    }

    /**
     * <p>
     * The AWS account ID for the master account. If the accounts are associated
     * by a Macie membership invitation, this object also provides details about
     * the invitation that was sent and accepted to establish the relationship
     * between the accounts.
     * </p>
     *
     * @param master <p>
     *            The AWS account ID for the master account. If the accounts are
     *            associated by a Macie membership invitation, this object also
     *            provides details about the invitation that was sent and
     *            accepted to establish the relationship between the accounts.
     *            </p>
     */
    public void setMaster(Invitation master) {
        this.master = master;
    }

    /**
     * <p>
     * The AWS account ID for the master account. If the accounts are associated
     * by a Macie membership invitation, this object also provides details about
     * the invitation that was sent and accepted to establish the relationship
     * between the accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param master <p>
     *            The AWS account ID for the master account. If the accounts are
     *            associated by a Macie membership invitation, this object also
     *            provides details about the invitation that was sent and
     *            accepted to establish the relationship between the accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetMasterAccountResult withMaster(Invitation master) {
        this.master = master;
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
        if (getMaster() != null)
            sb.append("master: " + getMaster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaster() == null) ? 0 : getMaster().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMasterAccountResult == false)
            return false;
        GetMasterAccountResult other = (GetMasterAccountResult) obj;

        if (other.getMaster() == null ^ this.getMaster() == null)
            return false;
        if (other.getMaster() != null && other.getMaster().equals(this.getMaster()) == false)
            return false;
        return true;
    }
}
