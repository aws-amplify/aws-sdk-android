/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class UpdateAdmChannelResult implements Serializable {
    /**
     * Amazon Device Messaging channel definition.
     */
    private ADMChannelResponse aDMChannelResponse;

    /**
     * Amazon Device Messaging channel definition.
     *
     * @return Amazon Device Messaging channel definition.
     */
    public ADMChannelResponse getADMChannelResponse() {
        return aDMChannelResponse;
    }

    /**
     * Amazon Device Messaging channel definition.
     *
     * @param aDMChannelResponse Amazon Device Messaging channel definition.
     */
    public void setADMChannelResponse(ADMChannelResponse aDMChannelResponse) {
        this.aDMChannelResponse = aDMChannelResponse;
    }

    /**
     * Amazon Device Messaging channel definition.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aDMChannelResponse Amazon Device Messaging channel definition.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAdmChannelResult withADMChannelResponse(ADMChannelResponse aDMChannelResponse) {
        this.aDMChannelResponse = aDMChannelResponse;
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
        if (getADMChannelResponse() != null)
            sb.append("ADMChannelResponse: " + getADMChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getADMChannelResponse() == null) ? 0 : getADMChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAdmChannelResult == false)
            return false;
        UpdateAdmChannelResult other = (UpdateAdmChannelResult) obj;

        if (other.getADMChannelResponse() == null ^ this.getADMChannelResponse() == null)
            return false;
        if (other.getADMChannelResponse() != null
                && other.getADMChannelResponse().equals(this.getADMChannelResponse()) == false)
            return false;
        return true;
    }
}
