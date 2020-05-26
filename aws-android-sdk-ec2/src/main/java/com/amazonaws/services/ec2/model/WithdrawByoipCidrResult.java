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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class WithdrawByoipCidrResult implements Serializable {
    /**
     * <p>
     * Information about the address pool.
     * </p>
     */
    private ByoipCidr byoipCidr;

    /**
     * <p>
     * Information about the address pool.
     * </p>
     *
     * @return <p>
     *         Information about the address pool.
     *         </p>
     */
    public ByoipCidr getByoipCidr() {
        return byoipCidr;
    }

    /**
     * <p>
     * Information about the address pool.
     * </p>
     *
     * @param byoipCidr <p>
     *            Information about the address pool.
     *            </p>
     */
    public void setByoipCidr(ByoipCidr byoipCidr) {
        this.byoipCidr = byoipCidr;
    }

    /**
     * <p>
     * Information about the address pool.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param byoipCidr <p>
     *            Information about the address pool.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WithdrawByoipCidrResult withByoipCidr(ByoipCidr byoipCidr) {
        this.byoipCidr = byoipCidr;
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
        if (getByoipCidr() != null)
            sb.append("ByoipCidr: " + getByoipCidr());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getByoipCidr() == null) ? 0 : getByoipCidr().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WithdrawByoipCidrResult == false)
            return false;
        WithdrawByoipCidrResult other = (WithdrawByoipCidrResult) obj;

        if (other.getByoipCidr() == null ^ this.getByoipCidr() == null)
            return false;
        if (other.getByoipCidr() != null
                && other.getByoipCidr().equals(this.getByoipCidr()) == false)
            return false;
        return true;
    }
}
