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
 * <p>
 * Provides information about the status of a campaign.
 * </p>
 */
public class CampaignState implements Serializable {
    /**
     * <p>
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. If a campaign uses A/B testing, the campaign has a
     * status of COMPLETED only when all campaign treatments have a status of
     * COMPLETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     */
    private String campaignStatus;

    /**
     * <p>
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. If a campaign uses A/B testing, the campaign has a
     * status of COMPLETED only when all campaign treatments have a status of
     * COMPLETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     *
     * @return <p>
     *         The status of the campaign, or the status of a treatment that
     *         belongs to an A/B test campaign. If a campaign uses A/B testing,
     *         the campaign has a status of COMPLETED only when all campaign
     *         treatments have a status of COMPLETED.
     *         </p>
     * @see CampaignStatus
     */
    public String getCampaignStatus() {
        return campaignStatus;
    }

    /**
     * <p>
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. If a campaign uses A/B testing, the campaign has a
     * status of COMPLETED only when all campaign treatments have a status of
     * COMPLETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     *
     * @param campaignStatus <p>
     *            The status of the campaign, or the status of a treatment that
     *            belongs to an A/B test campaign. If a campaign uses A/B
     *            testing, the campaign has a status of COMPLETED only when all
     *            campaign treatments have a status of COMPLETED.
     *            </p>
     * @see CampaignStatus
     */
    public void setCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }

    /**
     * <p>
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. If a campaign uses A/B testing, the campaign has a
     * status of COMPLETED only when all campaign treatments have a status of
     * COMPLETED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     *
     * @param campaignStatus <p>
     *            The status of the campaign, or the status of a treatment that
     *            belongs to an A/B test campaign. If a campaign uses A/B
     *            testing, the campaign has a status of COMPLETED only when all
     *            campaign treatments have a status of COMPLETED.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see CampaignStatus
     */
    public CampaignState withCampaignStatus(String campaignStatus) {
        this.campaignStatus = campaignStatus;
        return this;
    }

    /**
     * <p>
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. If a campaign uses A/B testing, the campaign has a
     * status of COMPLETED only when all campaign treatments have a status of
     * COMPLETED.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     *
     * @param campaignStatus <p>
     *            The status of the campaign, or the status of a treatment that
     *            belongs to an A/B test campaign. If a campaign uses A/B
     *            testing, the campaign has a status of COMPLETED only when all
     *            campaign treatments have a status of COMPLETED.
     *            </p>
     * @see CampaignStatus
     */
    public void setCampaignStatus(CampaignStatus campaignStatus) {
        this.campaignStatus = campaignStatus.toString();
    }

    /**
     * <p>
     * The status of the campaign, or the status of a treatment that belongs to
     * an A/B test campaign. If a campaign uses A/B testing, the campaign has a
     * status of COMPLETED only when all campaign treatments have a status of
     * COMPLETED.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SCHEDULED, EXECUTING, PENDING_NEXT_RUN, COMPLETED,
     * PAUSED, DELETED
     *
     * @param campaignStatus <p>
     *            The status of the campaign, or the status of a treatment that
     *            belongs to an A/B test campaign. If a campaign uses A/B
     *            testing, the campaign has a status of COMPLETED only when all
     *            campaign treatments have a status of COMPLETED.
     *            </p>
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
