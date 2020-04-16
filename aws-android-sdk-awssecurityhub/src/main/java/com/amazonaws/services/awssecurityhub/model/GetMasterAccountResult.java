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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

public class GetMasterAccountResult implements Serializable {
    /**
     * <p>
     * A list of details about the Security Hub master account for the current
     * member account.
     * </p>
     */
    private Invitation master;

    /**
     * <p>
     * A list of details about the Security Hub master account for the current
     * member account.
     * </p>
     *
     * @return <p>
     *         A list of details about the Security Hub master account for the
     *         current member account.
     *         </p>
     */
    public Invitation getMaster() {
        return master;
    }

    /**
     * <p>
     * A list of details about the Security Hub master account for the current
     * member account.
     * </p>
     *
     * @param master <p>
     *            A list of details about the Security Hub master account for
     *            the current member account.
     *            </p>
     */
    public void setMaster(Invitation master) {
        this.master = master;
    }

    /**
     * <p>
     * A list of details about the Security Hub master account for the current
     * member account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param master <p>
     *            A list of details about the Security Hub master account for
     *            the current member account.
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
            sb.append("Master: " + getMaster());
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
