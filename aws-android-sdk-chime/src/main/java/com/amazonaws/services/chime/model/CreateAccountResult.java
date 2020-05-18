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

package com.amazonaws.services.chime.model;

import java.io.Serializable;

public class CreateAccountResult implements Serializable {
    /**
     * <p>
     * The Amazon Chime account details.
     * </p>
     */
    private Account account;

    /**
     * <p>
     * The Amazon Chime account details.
     * </p>
     *
     * @return <p>
     *         The Amazon Chime account details.
     *         </p>
     */
    public Account getAccount() {
        return account;
    }

    /**
     * <p>
     * The Amazon Chime account details.
     * </p>
     *
     * @param account <p>
     *            The Amazon Chime account details.
     *            </p>
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * <p>
     * The Amazon Chime account details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param account <p>
     *            The Amazon Chime account details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateAccountResult withAccount(Account account) {
        this.account = account;
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
        if (getAccount() != null)
            sb.append("Account: " + getAccount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAccountResult == false)
            return false;
        CreateAccountResult other = (CreateAccountResult) obj;

        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        return true;
    }
}
