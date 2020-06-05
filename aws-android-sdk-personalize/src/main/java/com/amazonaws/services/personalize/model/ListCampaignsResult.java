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

public class ListCampaignsResult implements Serializable {
    /**
     * <p>
     * A list of the campaigns.
     * </p>
     */
    private java.util.List<CampaignSummary> campaigns;

    /**
     * <p>
     * A token for getting the next set of campaigns (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the campaigns.
     * </p>
     *
     * @return <p>
     *         A list of the campaigns.
     *         </p>
     */
    public java.util.List<CampaignSummary> getCampaigns() {
        return campaigns;
    }

    /**
     * <p>
     * A list of the campaigns.
     * </p>
     *
     * @param campaigns <p>
     *            A list of the campaigns.
     *            </p>
     */
    public void setCampaigns(java.util.Collection<CampaignSummary> campaigns) {
        if (campaigns == null) {
            this.campaigns = null;
            return;
        }

        this.campaigns = new java.util.ArrayList<CampaignSummary>(campaigns);
    }

    /**
     * <p>
     * A list of the campaigns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaigns <p>
     *            A list of the campaigns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCampaignsResult withCampaigns(CampaignSummary... campaigns) {
        if (getCampaigns() == null) {
            this.campaigns = new java.util.ArrayList<CampaignSummary>(campaigns.length);
        }
        for (CampaignSummary value : campaigns) {
            this.campaigns.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the campaigns.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param campaigns <p>
     *            A list of the campaigns.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCampaignsResult withCampaigns(java.util.Collection<CampaignSummary> campaigns) {
        setCampaigns(campaigns);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of campaigns (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @return <p>
     *         A token for getting the next set of campaigns (if they exist).
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of campaigns (if they exist).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of campaigns (if they exist).
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of campaigns (if they exist).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1300<br/>
     *
     * @param nextToken <p>
     *            A token for getting the next set of campaigns (if they exist).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCampaignsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getCampaigns() != null)
            sb.append("campaigns: " + getCampaigns() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCampaigns() == null) ? 0 : getCampaigns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCampaignsResult == false)
            return false;
        ListCampaignsResult other = (ListCampaignsResult) obj;

        if (other.getCampaigns() == null ^ this.getCampaigns() == null)
            return false;
        if (other.getCampaigns() != null
                && other.getCampaigns().equals(this.getCampaigns()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
