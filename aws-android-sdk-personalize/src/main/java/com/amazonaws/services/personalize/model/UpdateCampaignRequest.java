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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a campaign by either deploying a new solution or changing the value
 * of the campaign's <code>minProvisionedTPS</code> parameter.
 * </p>
 * <p>
 * To update a campaign, the campaign status must be ACTIVE or CREATE FAILED.
 * Check the campaign status using the <a>DescribeCampaign</a> API.
 * </p>
 * <note>
 * <p>
 * You must wait until the <code>status</code> of the updated campaign is
 * <code>ACTIVE</code> before asking the campaign for recommendations.
 * </p>
 * </note>
 * <p>
 * For more information on campaigns, see <a>CreateCampaign</a>.
 * </p>
 */
public class UpdateCampaignRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String campaignArn;

    /**
     * <p>
     * The ARN of a new solution version to deploy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     */
    private String solutionVersionArn;

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions
     * (recommendations) per second that Amazon Personalize will support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer minProvisionedTPS;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the campaign.
     *         </p>
     */
    public String getCampaignArn() {
        return campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param campaignArn <p>
     *            The Amazon Resource Name (ARN) of the campaign.
     *            </p>
     */
    public void setCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the campaign.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param campaignArn <p>
     *            The Amazon Resource Name (ARN) of the campaign.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCampaignRequest withCampaignArn(String campaignArn) {
        this.campaignArn = campaignArn;
        return this;
    }

    /**
     * <p>
     * The ARN of a new solution version to deploy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The ARN of a new solution version to deploy.
     *         </p>
     */
    public String getSolutionVersionArn() {
        return solutionVersionArn;
    }

    /**
     * <p>
     * The ARN of a new solution version to deploy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The ARN of a new solution version to deploy.
     *            </p>
     */
    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The ARN of a new solution version to deploy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The ARN of a new solution version to deploy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCampaignRequest withSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
        return this;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions
     * (recommendations) per second that Amazon Personalize will support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         Specifies the requested minimum provisioned transactions
     *         (recommendations) per second that Amazon Personalize will
     *         support.
     *         </p>
     */
    public Integer getMinProvisionedTPS() {
        return minProvisionedTPS;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions
     * (recommendations) per second that Amazon Personalize will support.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minProvisionedTPS <p>
     *            Specifies the requested minimum provisioned transactions
     *            (recommendations) per second that Amazon Personalize will
     *            support.
     *            </p>
     */
    public void setMinProvisionedTPS(Integer minProvisionedTPS) {
        this.minProvisionedTPS = minProvisionedTPS;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned transactions
     * (recommendations) per second that Amazon Personalize will support.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param minProvisionedTPS <p>
     *            Specifies the requested minimum provisioned transactions
     *            (recommendations) per second that Amazon Personalize will
     *            support.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateCampaignRequest withMinProvisionedTPS(Integer minProvisionedTPS) {
        this.minProvisionedTPS = minProvisionedTPS;
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
        if (getCampaignArn() != null)
            sb.append("campaignArn: " + getCampaignArn() + ",");
        if (getSolutionVersionArn() != null)
            sb.append("solutionVersionArn: " + getSolutionVersionArn() + ",");
        if (getMinProvisionedTPS() != null)
            sb.append("minProvisionedTPS: " + getMinProvisionedTPS());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCampaignArn() == null) ? 0 : getCampaignArn().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        hashCode = prime * hashCode
                + ((getMinProvisionedTPS() == null) ? 0 : getMinProvisionedTPS().hashCode());
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

        if (other.getCampaignArn() == null ^ this.getCampaignArn() == null)
            return false;
        if (other.getCampaignArn() != null
                && other.getCampaignArn().equals(this.getCampaignArn()) == false)
            return false;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null
                && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        if (other.getMinProvisionedTPS() == null ^ this.getMinProvisionedTPS() == null)
            return false;
        if (other.getMinProvisionedTPS() != null
                && other.getMinProvisionedTPS().equals(this.getMinProvisionedTPS()) == false)
            return false;
        return true;
    }
}
