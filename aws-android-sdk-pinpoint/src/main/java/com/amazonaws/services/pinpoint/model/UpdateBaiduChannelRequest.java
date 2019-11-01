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
 * Update a BAIDU GCM channel
 */
public class UpdateBaiduChannelRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The unique ID of your Amazon Pinpoint application.
     */
    private String applicationId;

    /**
     * Baidu Cloud Push credentials
     */
    private BaiduChannelRequest baiduChannelRequest;

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
    public UpdateBaiduChannelRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Baidu Cloud Push credentials
     *
     * @return Baidu Cloud Push credentials
     */
    public BaiduChannelRequest getBaiduChannelRequest() {
        return baiduChannelRequest;
    }

    /**
     * Baidu Cloud Push credentials
     *
     * @param baiduChannelRequest Baidu Cloud Push credentials
     */
    public void setBaiduChannelRequest(BaiduChannelRequest baiduChannelRequest) {
        this.baiduChannelRequest = baiduChannelRequest;
    }

    /**
     * Baidu Cloud Push credentials
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param baiduChannelRequest Baidu Cloud Push credentials
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateBaiduChannelRequest withBaiduChannelRequest(BaiduChannelRequest baiduChannelRequest) {
        this.baiduChannelRequest = baiduChannelRequest;
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
        if (getBaiduChannelRequest() != null)
            sb.append("BaiduChannelRequest: " + getBaiduChannelRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode
                + ((getBaiduChannelRequest() == null) ? 0 : getBaiduChannelRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBaiduChannelRequest == false)
            return false;
        UpdateBaiduChannelRequest other = (UpdateBaiduChannelRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getBaiduChannelRequest() == null ^ this.getBaiduChannelRequest() == null)
            return false;
        if (other.getBaiduChannelRequest() != null
                && other.getBaiduChannelRequest().equals(this.getBaiduChannelRequest()) == false)
            return false;
        return true;
    }
}
