/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class DescribeCampaignResult implements Serializable {
    /**
     * <p>
     * The properties of the campaign.
     * </p>
     */
    private Campaign campaign;

    /**
     * <p>
     * The properties of the campaign.
     * </p>
     *
     * @return <p>
     *         The properties of the campaign.
     *         </p>
     */
    public Campaign getCampaign() {
        return campaign;
    }

    /**
     * <p>
     * The properties of the campaign.
     * </p>
     *
     * @param campaign <p>
     *            The properties of the campaign.
     *            </p>
     */
    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    /**
     * <p>
     * The properties of the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaign <p>
     *            The properties of the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeCampaignResult withCampaign(Campaign campaign) {
        this.campaign = campaign;
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
        if (getCampaign() != null)
            sb.append("campaign: " + getCampaign());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaign() == null) ? 0 : getCampaign().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCampaignResult == false)
            return false;
        DescribeCampaignResult other = (DescribeCampaignResult) obj;

        if (other.getCampaign() == null ^ this.getCampaign() == null)
            return false;
        if (other.getCampaign() != null && other.getCampaign().equals(this.getCampaign()) == false)
            return false;
        return true;
    }
}
