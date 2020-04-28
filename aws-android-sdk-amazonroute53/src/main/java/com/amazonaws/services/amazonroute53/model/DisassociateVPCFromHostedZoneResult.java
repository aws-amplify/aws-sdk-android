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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the response information for the disassociate
 * request.
 * </p>
 */
public class DisassociateVPCFromHostedZoneResult implements Serializable {
    /**
     * <p>
     * A complex type that describes the changes made to the specified private
     * hosted zone.
     * </p>
     */
    private ChangeInfo changeInfo;

    /**
     * <p>
     * A complex type that describes the changes made to the specified private
     * hosted zone.
     * </p>
     *
     * @return <p>
     *         A complex type that describes the changes made to the specified
     *         private hosted zone.
     *         </p>
     */
    public ChangeInfo getChangeInfo() {
        return changeInfo;
    }

    /**
     * <p>
     * A complex type that describes the changes made to the specified private
     * hosted zone.
     * </p>
     *
     * @param changeInfo <p>
     *            A complex type that describes the changes made to the
     *            specified private hosted zone.
     *            </p>
     */
    public void setChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
    }

    /**
     * <p>
     * A complex type that describes the changes made to the specified private
     * hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changeInfo <p>
     *            A complex type that describes the changes made to the
     *            specified private hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateVPCFromHostedZoneResult withChangeInfo(ChangeInfo changeInfo) {
        this.changeInfo = changeInfo;
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
        if (getChangeInfo() != null)
            sb.append("ChangeInfo: " + getChangeInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeInfo() == null) ? 0 : getChangeInfo().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateVPCFromHostedZoneResult == false)
            return false;
        DisassociateVPCFromHostedZoneResult other = (DisassociateVPCFromHostedZoneResult) obj;

        if (other.getChangeInfo() == null ^ this.getChangeInfo() == null)
            return false;
        if (other.getChangeInfo() != null
                && other.getChangeInfo().equals(this.getChangeInfo()) == false)
            return false;
        return true;
    }
}
