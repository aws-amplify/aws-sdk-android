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

public class DeleteApnsVoipSandboxChannelResult implements Serializable {
    /**
     * <p>
     * Provides information about the status and settings of the APNs (Apple
     * Push Notification service) VoIP sandbox channel for an application.
     * </p>
     */
    private APNSVoipSandboxChannelResponse aPNSVoipSandboxChannelResponse;

    /**
     * <p>
     * Provides information about the status and settings of the APNs (Apple
     * Push Notification service) VoIP sandbox channel for an application.
     * </p>
     *
     * @return <p>
     *         Provides information about the status and settings of the APNs
     *         (Apple Push Notification service) VoIP sandbox channel for an
     *         application.
     *         </p>
     */
    public APNSVoipSandboxChannelResponse getAPNSVoipSandboxChannelResponse() {
        return aPNSVoipSandboxChannelResponse;
    }

    /**
     * <p>
     * Provides information about the status and settings of the APNs (Apple
     * Push Notification service) VoIP sandbox channel for an application.
     * </p>
     *
     * @param aPNSVoipSandboxChannelResponse <p>
     *            Provides information about the status and settings of the APNs
     *            (Apple Push Notification service) VoIP sandbox channel for an
     *            application.
     *            </p>
     */
    public void setAPNSVoipSandboxChannelResponse(
            APNSVoipSandboxChannelResponse aPNSVoipSandboxChannelResponse) {
        this.aPNSVoipSandboxChannelResponse = aPNSVoipSandboxChannelResponse;
    }

    /**
     * <p>
     * Provides information about the status and settings of the APNs (Apple
     * Push Notification service) VoIP sandbox channel for an application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aPNSVoipSandboxChannelResponse <p>
     *            Provides information about the status and settings of the APNs
     *            (Apple Push Notification service) VoIP sandbox channel for an
     *            application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteApnsVoipSandboxChannelResult withAPNSVoipSandboxChannelResponse(
            APNSVoipSandboxChannelResponse aPNSVoipSandboxChannelResponse) {
        this.aPNSVoipSandboxChannelResponse = aPNSVoipSandboxChannelResponse;
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
        if (getAPNSVoipSandboxChannelResponse() != null)
            sb.append("APNSVoipSandboxChannelResponse: " + getAPNSVoipSandboxChannelResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAPNSVoipSandboxChannelResponse() == null) ? 0
                        : getAPNSVoipSandboxChannelResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteApnsVoipSandboxChannelResult == false)
            return false;
        DeleteApnsVoipSandboxChannelResult other = (DeleteApnsVoipSandboxChannelResult) obj;

        if (other.getAPNSVoipSandboxChannelResponse() == null
                ^ this.getAPNSVoipSandboxChannelResponse() == null)
            return false;
        if (other.getAPNSVoipSandboxChannelResponse() != null
                && other.getAPNSVoipSandboxChannelResponse().equals(
                        this.getAPNSVoipSandboxChannelResponse()) == false)
            return false;
        return true;
    }
}
