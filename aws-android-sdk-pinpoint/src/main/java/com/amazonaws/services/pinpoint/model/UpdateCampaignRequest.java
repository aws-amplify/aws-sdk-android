/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Use to update a campaign.
 */
public class UpdateCampaignRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * The new value for the applicationId property for this object.
     */
    private String applicationId;

    /**
     * The new value for the campaignId property for this object.
     */
    private String campaignId;

    /**
     * Used to create a campaign.
     */
    private WriteCampaignRequest writeCampaignRequest;

    /**
     * Returns the value of the applicationId property for this object.
     *
     * @return The value of the applicationId property for this object.
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * Sets the value of applicationId
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     */
    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * Sets the value of the applicationId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationId The new value for the applicationId property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCampaignRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Returns the value of the campaignId property for this object.
     *
     * @return The value of the campaignId property for this object.
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**
     * Sets the value of campaignId
     *
     * @param campaignId The new value for the campaignId property for this
     *            object.
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Sets the value of the campaignId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaignId The new value for the campaignId property for this
     *            object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCampaignRequest withCampaignId(String campaignId) {
        this.campaignId = campaignId;
        return this;
    }

    /**
     * Used to create a campaign.
     *
     * @return Used to create a campaign.
     */
    public WriteCampaignRequest getWriteCampaignRequest() {
        return writeCampaignRequest;
    }

    /**
     * Used to create a campaign.
     *
     * @param writeCampaignRequest Used to create a campaign.
     */
    public void setWriteCampaignRequest(WriteCampaignRequest writeCampaignRequest) {
        this.writeCampaignRequest = writeCampaignRequest;
    }

    /**
     * Used to create a campaign.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param writeCampaignRequest Used to create a campaign.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCampaignRequest withWriteCampaignRequest(WriteCampaignRequest writeCampaignRequest) {
        this.writeCampaignRequest = writeCampaignRequest;
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
        if (getCampaignId() != null)
            sb.append("CampaignId: " + getCampaignId() + ",");
        if (getWriteCampaignRequest() != null)
            sb.append("WriteCampaignRequest: " + getWriteCampaignRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        hashCode = prime * hashCode
                + ((getWriteCampaignRequest() == null) ? 0 : getWriteCampaignRequest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateCampaignRequest == false)
            return false;
        UpdateCampaignRequest other = (UpdateCampaignRequest) obj;

        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null
                && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null
                && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        if (other.getWriteCampaignRequest() == null ^ this.getWriteCampaignRequest() == null)
            return false;
        if (other.getWriteCampaignRequest() != null
                && other.getWriteCampaignRequest().equals(this.getWriteCampaignRequest()) == false)
            return false;
        return true;
    }
}
