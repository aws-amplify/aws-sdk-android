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

public class GetCampaignActivitiesResult implements Serializable {
    /**
     * Activities for campaign.
     */
    private ActivitiesResponse activitiesResponse;

    /**
     * Activities for campaign.
     *
     * @return Activities for campaign.
     */
    public ActivitiesResponse getActivitiesResponse() {
        return activitiesResponse;
    }

    /**
     * Activities for campaign.
     *
     * @param activitiesResponse Activities for campaign.
     */
    public void setActivitiesResponse(ActivitiesResponse activitiesResponse) {
        this.activitiesResponse = activitiesResponse;
    }

    /**
     * Activities for campaign.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param activitiesResponse Activities for campaign.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetCampaignActivitiesResult withActivitiesResponse(ActivitiesResponse activitiesResponse) {
        this.activitiesResponse = activitiesResponse;
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
        if (getActivitiesResponse() != null)
            sb.append("ActivitiesResponse: " + getActivitiesResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActivitiesResponse() == null) ? 0 : getActivitiesResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCampaignActivitiesResult == false)
            return false;
        GetCampaignActivitiesResult other = (GetCampaignActivitiesResult) obj;

        if (other.getActivitiesResponse() == null ^ this.getActivitiesResponse() == null)
            return false;
        if (other.getActivitiesResponse() != null
                && other.getActivitiesResponse().equals(this.getActivitiesResponse()) == false)
            return false;
        return true;
    }
}
