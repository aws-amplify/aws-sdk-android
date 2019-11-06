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

public class UpdateSmsChannelResult implements Serializable {
    /**
     * SMS Channel Response.
     */
    private SMSChannelResponse sMSChannelResponse;

    /**
     * SMS Channel Response.
     *
     * @return SMS Channel Response.
     */
    public SMSChannelResponse getSMSChannelResponse() {
        return sMSChannelResponse;
    }

    /**
     * SMS Channel Response.
     *
     * @param sMSChannelResponse SMS Channel Response.
     */
    public void setSMSChannelResponse(SMSChannelResponse sMSChannelResponse) {
        this.sMSChannelResponse = sMSChannelResponse;
    }

    /**
     * SMS Channel Response.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMSChannelResponse SMS Channel Response.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSmsChannelResult withSMSChannelResponse(SMSChannelResponse sMSChannelResponse) {
        this.sMSChannelResponse = sMSChannelResponse;
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
        if (getSMSChannelResponse() != null)
            sb.append("SMSChannelResponse: " + getSMSChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSMSChannelResponse() == null) ? 0 : getSMSChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSmsChannelResult == false)
            return false;
        UpdateSmsChannelResult other = (UpdateSmsChannelResult) obj;

        if (other.getSMSChannelResponse() == null ^ this.getSMSChannelResponse() == null)
            return false;
        if (other.getSMSChannelResponse() != null
                && other.getSMSChannelResponse().equals(this.getSMSChannelResponse()) == false)
            return false;
        return true;
    }
}
