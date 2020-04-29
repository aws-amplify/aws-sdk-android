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

package com.amazonaws.services.awswafregional.model;

import java.io.Serializable;

public class GetChangeTokenStatusResult implements Serializable {
    /**
     * <p>
     * The status of the change token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PENDING, INSYNC
     */
    private String changeTokenStatus;

    /**
     * <p>
     * The status of the change token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PENDING, INSYNC
     *
     * @return <p>
     *         The status of the change token.
     *         </p>
     * @see ChangeTokenStatus
     */
    public String getChangeTokenStatus() {
        return changeTokenStatus;
    }

    /**
     * <p>
     * The status of the change token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PENDING, INSYNC
     *
     * @param changeTokenStatus <p>
     *            The status of the change token.
     *            </p>
     * @see ChangeTokenStatus
     */
    public void setChangeTokenStatus(String changeTokenStatus) {
        this.changeTokenStatus = changeTokenStatus;
    }

    /**
     * <p>
     * The status of the change token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PENDING, INSYNC
     *
     * @param changeTokenStatus <p>
     *            The status of the change token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeTokenStatus
     */
    public GetChangeTokenStatusResult withChangeTokenStatus(String changeTokenStatus) {
        this.changeTokenStatus = changeTokenStatus;
        return this;
    }

    /**
     * <p>
     * The status of the change token.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PENDING, INSYNC
     *
     * @param changeTokenStatus <p>
     *            The status of the change token.
     *            </p>
     * @see ChangeTokenStatus
     */
    public void setChangeTokenStatus(ChangeTokenStatus changeTokenStatus) {
        this.changeTokenStatus = changeTokenStatus.toString();
    }

    /**
     * <p>
     * The status of the change token.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PROVISIONED, PENDING, INSYNC
     *
     * @param changeTokenStatus <p>
     *            The status of the change token.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeTokenStatus
     */
    public GetChangeTokenStatusResult withChangeTokenStatus(ChangeTokenStatus changeTokenStatus) {
        this.changeTokenStatus = changeTokenStatus.toString();
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
        if (getChangeTokenStatus() != null)
            sb.append("ChangeTokenStatus: " + getChangeTokenStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChangeTokenStatus() == null) ? 0 : getChangeTokenStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChangeTokenStatusResult == false)
            return false;
        GetChangeTokenStatusResult other = (GetChangeTokenStatusResult) obj;

        if (other.getChangeTokenStatus() == null ^ this.getChangeTokenStatus() == null)
            return false;
        if (other.getChangeTokenStatus() != null
                && other.getChangeTokenStatus().equals(this.getChangeTokenStatus()) == false)
            return false;
        return true;
    }
}
