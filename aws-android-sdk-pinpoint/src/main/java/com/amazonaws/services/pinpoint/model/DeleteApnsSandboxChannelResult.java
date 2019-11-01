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

public class DeleteApnsSandboxChannelResult implements Serializable {
    /**
     * Apple Development Push Notification Service channel definition.
     */
    private APNSSandboxChannelResponse aPNSSandboxChannelResponse;

    /**
     * Apple Development Push Notification Service channel definition.
     *
     * @return Apple Development Push Notification Service channel definition.
     */
    public APNSSandboxChannelResponse getAPNSSandboxChannelResponse() {
        return aPNSSandboxChannelResponse;
    }

    /**
     * Apple Development Push Notification Service channel definition.
     *
     * @param aPNSSandboxChannelResponse Apple Development Push Notification
     *            Service channel definition.
     */
    public void setAPNSSandboxChannelResponse(APNSSandboxChannelResponse aPNSSandboxChannelResponse) {
        this.aPNSSandboxChannelResponse = aPNSSandboxChannelResponse;
    }

    /**
     * Apple Development Push Notification Service channel definition.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aPNSSandboxChannelResponse Apple Development Push Notification
     *            Service channel definition.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteApnsSandboxChannelResult withAPNSSandboxChannelResponse(
            APNSSandboxChannelResponse aPNSSandboxChannelResponse) {
        this.aPNSSandboxChannelResponse = aPNSSandboxChannelResponse;
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
        if (getAPNSSandboxChannelResponse() != null)
            sb.append("APNSSandboxChannelResponse: " + getAPNSSandboxChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAPNSSandboxChannelResponse() == null) ? 0 : getAPNSSandboxChannelResponse()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApnsSandboxChannelResult == false)
            return false;
        DeleteApnsSandboxChannelResult other = (DeleteApnsSandboxChannelResult) obj;

        if (other.getAPNSSandboxChannelResponse() == null
                ^ this.getAPNSSandboxChannelResponse() == null)
            return false;
        if (other.getAPNSSandboxChannelResponse() != null
                && other.getAPNSSandboxChannelResponse().equals(
                        this.getAPNSSandboxChannelResponse()) == false)
            return false;
        return true;
    }
}
