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

/**
 * State of the Campaign
 */
public class CampaignState implements Serializable {
    /**
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. Valid values: SCHEDULED, EXECUTING,
     * PENDING_NEXT_RUN, COMPLETED, PAUSED
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     */
    private String campaignStatus;

    /**
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. Valid values: SCHEDULED, EXECUTING,
     * PENDING_NEXT_RUN, COMPLETED, PAUSED
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     *
     * @return The status of the campaign, or the status of a treatment that
     *         belongs to an A/B test campaign. Valid values: SCHEDULED,
     *         EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED
     * @see CampaignStatus
     */
    public String getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. Valid values: SCHEDULED, EXECUTING,
     * PENDING_NEXT_RUN, COMPLETED, PAUSED
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     *
     * @param campaignStatus The status of the campaign, or the status of a
     *            treatment that belongs to an A/B test campaign. Valid values:
     *            SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED
     * @see CampaignStatus
     */
    public void setCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    /**
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. Valid values: SCHEDULED, EXECUTING,
     * PENDING_NEXT_RUN, COMPLETED, PAUSED
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     *
     * @param campaignStatus The status of the campaign, or the status of a
     *            treatment that belongs to an A/B test campaign. Valid values:
     *            SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CampaignStatus
     */
    public CampaignState withCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
        return this;
    }

    /**
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. Valid values: SCHEDULED, EXECUTING,
     * PENDING_NEXT_RUN, COMPLETED, PAUSED
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     *
     * @param campaignStatus The status of the campaign, or the status of a
     *            treatment that belongs to an A/B test campaign. Valid values:
     *            SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED
     * @see CampaignStatus
     */
    public void setCampaignStatus(CampaignStatus campaignStatus) {
        this.campaignStatus = campaignStatus.toString();
    }

    /**
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. Valid values: SCHEDULED, EXECUTING,
     * PENDING_NEXT_RUN, COMPLETED, PAUSED
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     *
     * @param campaignStatus The status of the campaign, or the status of a
     *            treatment that belongs to an A/B test campaign. Valid values:
     *            SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED, PAUSED
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CampaignStatus
     */
    public CampaignState withCampaignStatus(CampaignStatus campaignStatus) {
        this.campaignStatus = campaignStatus.toString();
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
        if (getCampaignStatus() != null)
            sb.append("CampaignStatus: " + getCampaignStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCampaignStatus() == null) ? 0 : getCampaignStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CampaignState == false)
            return false;
        CampaignState other = (CampaignState) obj;

        if (other.getCampaignStatus() == null ^ this.getCampaignStatus() == null)
            return false;
        if (other.getCampaignStatus() != null
                && other.getCampaignStatus().equals(this.getCampaignStatus()) == false)
            return false;
        return true;
    }
}
