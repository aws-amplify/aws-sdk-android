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
 * Used to update the settings for an app.
 */
public class UpdateApplicationSettingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * The unique ID of your Amazon Pinpoint application.
     */
    private String applicationId;

    /**
     * Creating application setting request
     */
    private WriteApplicationSettingsRequest writeApplicationSettingsRequest;

    /**
     * The unique ID of your Amazon Pinpoint application.
     *
     * @return The unique ID of your Amazon Pinpoint application.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     *
     * @param applicationId The unique ID of your Amazon Pinpoint application.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID of your Amazon Pinpoint application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The unique ID of your Amazon Pinpoint application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApplicationSettingsRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Creating application setting request
     *
     * @return Creating application setting request
     */
    public WriteApplicationSettingsRequest getWriteApplicationSettingsRequest() {
        return writeApplicationSettingsRequest;
    }

    /**
     * Creating application setting request
     *
     * @param writeApplicationSettingsRequest Creating application setting
     *            request
     */
    public void setWriteApplicationSettingsRequest(
            WriteApplicationSettingsRequest writeApplicationSettingsRequest) {
        this.writeApplicationSettingsRequest = writeApplicationSettingsRequest;
    }

    /**
     * Creating application setting request
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeApplicationSettingsRequest Creating application setting
     *            request
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateApplicationSettingsRequest withWriteApplicationSettingsRequest(
            WriteApplicationSettingsRequest writeApplicationSettingsRequest) {
        this.writeApplicationSettingsRequest = writeApplicationSettingsRequest;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: " + getApplicationId() + ",");
        if (getWriteApplicationSettingsRequest() != null)
            sb.append("WriteApplicationSettingsRequest: " + getWriteApplicationSettingsRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime
                * hashCode
                + ((getWriteApplicationSettingsRequest() == null) ? 0
                        : getWriteApplicationSettingsRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationSettingsRequest == false)
            return false;
        UpdateApplicationSettingsRequest other = (UpdateApplicationSettingsRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getWriteApplicationSettingsRequest() == null
                ^ this.getWriteApplicationSettingsRequest() == null)
            return false;
        if (other.getWriteApplicationSettingsRequest() != null
                && other.getWriteApplicationSettingsRequest().equals(
                        this.getWriteApplicationSettingsRequest()) == false)
            return false;
        return true;
    }
}
