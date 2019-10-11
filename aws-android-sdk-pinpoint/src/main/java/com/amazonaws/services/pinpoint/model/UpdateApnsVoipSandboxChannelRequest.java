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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables the APNs VoIP sandbox channel for an application or updates the
 * status and settings of the APNs VoIP sandbox channel for an application.
 * </p>
 */
public class UpdateApnsVoipSandboxChannelRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies the status and settings of the APNs (Apple Push Notification
     * service) VoIP sandbox channel for an application.
     * </p>
     */
    private APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     */
    private String applicationId;

    /**
     * <p>
     * Specifies the status and settings of the APNs (Apple Push Notification
     * service) VoIP sandbox channel for an application.
     * </p>
     *
     * @return <p>
     *         Specifies the status and settings of the APNs (Apple Push
     *         Notification service) VoIP sandbox channel for an application.
     *         </p>
     */
    public APNSVoipSandboxChannelRequest getAPNSVoipSandboxChannelRequest() {
        return aPNSVoipSandboxChannelRequest;
    }

    /**
     * <p>
     * Specifies the status and settings of the APNs (Apple Push Notification
     * service) VoIP sandbox channel for an application.
     * </p>
     *
     * @param aPNSVoipSandboxChannelRequest <p>
     *            Specifies the status and settings of the APNs (Apple Push
     *            Notification service) VoIP sandbox channel for an application.
     *            </p>
     */
    public void setAPNSVoipSandboxChannelRequest(
            APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest) {
        this.aPNSVoipSandboxChannelRequest = aPNSVoipSandboxChannelRequest;
    }

    /**
     * <p>
     * Specifies the status and settings of the APNs (Apple Push Notification
     * service) VoIP sandbox channel for an application.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aPNSVoipSandboxChannelRequest <p>
     *            Specifies the status and settings of the APNs (Apple Push
     *            Notification service) VoIP sandbox channel for an application.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApnsVoipSandboxChannelRequest withAPNSVoipSandboxChannelRequest(
            APNSVoipSandboxChannelRequest aPNSVoipSandboxChannelRequest) {
        this.aPNSVoipSandboxChannelRequest = aPNSVoipSandboxChannelRequest;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the application. This identifier is
     *         displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *         console.
     *         </p>
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed
     * as the <b>Project ID</b> on the Amazon Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId <p>
     *            The unique identifier for the application. This identifier is
     *            displayed as the <b>Project ID</b> on the Amazon Pinpoint
     *            console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApnsVoipSandboxChannelRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
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
        if (getAPNSVoipSandboxChannelRequest() != null)
            sb.append("APNSVoipSandboxChannelRequest: " + getAPNSVoipSandboxChannelRequest() + ",");
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAPNSVoipSandboxChannelRequest() == null) ? 0
                        : getAPNSVoipSandboxChannelRequest().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApnsVoipSandboxChannelRequest == false)
            return false;
        UpdateApnsVoipSandboxChannelRequest other = (UpdateApnsVoipSandboxChannelRequest) obj;

        if (other.getAPNSVoipSandboxChannelRequest() == null
                ^ this.getAPNSVoipSandboxChannelRequest() == null)
            return false;
        if (other.getAPNSVoipSandboxChannelRequest() != null
                && other.getAPNSVoipSandboxChannelRequest().equals(
                        this.getAPNSVoipSandboxChannelRequest()) == false)
            return false;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        return true;
    }
}
