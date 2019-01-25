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

public class CreateCampaignResult implements Serializable {
    /**
     * Campaign definition
     */
    private CampaignResponse campaignResponse;

    /**
     * Campaign definition
     *
     * @return Campaign definition
     */
    public CampaignResponse getCampaignResponse() {
        return campaignResponse;
    }

    /**
     * Campaign definition
     *
     * @param campaignResponse Campaign definition
     */
    public void setCampaignResponse(CampaignResponse campaignResponse) {
        this.campaignResponse = campaignResponse;
    }

    /**
     * Campaign definition
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaignResponse Campaign definition
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCampaignResult withCampaignResponse(CampaignResponse campaignResponse) {
        this.campaignResponse = campaignResponse;
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
        if (getCampaignResponse() != null)
            sb.append("CampaignResponse: " + getCampaignResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCampaignResponse() == null) ? 0 : getCampaignResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCampaignResult == false)
            return false;
        CreateCampaignResult other = (CreateCampaignResult) obj;

        if (other.getCampaignResponse() == null ^ this.getCampaignResponse() == null)
            return false;
        if (other.getCampaignResponse() != null
                && other.getCampaignResponse().equals(this.getCampaignResponse()) == false)
            return false;
        return true;
    }
}
