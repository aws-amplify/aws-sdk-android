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
 * Creates a campaign by deploying a solution version. When a client calls the
 * <a href=
 * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html"
 * >GetRecommendations</a> and <a href=
 * "https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetPersonalizedRanking.html"
 * >GetPersonalizedRanking</a> APIs, a campaign is specified in the request.
 * </p>
 * <p>
 * <b>Minimum Provisioned TPS and Auto-Scaling</b>
 * </p>
 * <p>
 * A transaction is a single <code>GetRecommendations</code> or
 * <code>GetPersonalizedRanking</code> call. Transactions per second (TPS) is
 * the throughput and unit of billing for Amazon Personalize. The minimum
 * provisioned TPS (<code>minProvisionedTPS</code>) specifies the baseline
 * throughput provisioned by Amazon Personalize, and thus, the minimum billing
 * charge. If your TPS increases beyond <code>minProvisionedTPS</code>, Amazon
 * Personalize auto-scales the provisioned capacity up and down, but never below
 * <code>minProvisionedTPS</code>, to maintain a 70% utilization. There's a
 * short time delay while the capacity is increased that might cause loss of
 * transactions. It's recommended to start with a low
 * <code>minProvisionedTPS</code>, track your usage using Amazon CloudWatch
 * metrics, and then increase the <code>minProvisionedTPS</code> as necessary.
 * </p>
 * <p>
 * <b>Status</b>
 * </p>
 * <p>
 * A campaign can be in one of the following states:
 * </p>
 * <ul>
 * <li>
 * <p>
 * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
 * </p>
 * </li>
 * <li>
 * <p>
 * DELETE PENDING &gt; DELETE IN_PROGRESS
 * </p>
 * </li>
 * </ul>
 * <p>
 * To get the campaign status, call <a>DescribeCampaign</a>.
 * </p>
 * <note>
 * <p>
 * Wait until the <code>status</code> of the campaign is <code>ACTIVE</code>
 * before asking the campaign for recommendations.
 * </p>
 * </note>
 * <p class="title">
 * <b>Related APIs</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListCampaigns</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeCampaign</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateCampaign</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteCampaign</a>
 * </p>
 * </li>
 * </ul>
 */
public class CreateCampaignRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A name for the new campaign. The campaign name must be unique within your
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version to deploy.
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
     * A name for the new campaign. The campaign name must be unique within your
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @return <p>
     *         A name for the new campaign. The campaign name must be unique
     *         within your account.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * A name for the new campaign. The campaign name must be unique within your
     * account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            A name for the new campaign. The campaign name must be unique
     *            within your account.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the new campaign. The campaign name must be unique within your
     * account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 63<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9][a-zA-Z0-9\-_]*<br/>
     *
     * @param name <p>
     *            A name for the new campaign. The campaign name must be unique
     *            within your account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCampaignRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version to deploy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the solution version to deploy.
     *         </p>
     */
    public String getSolutionVersionArn() {
        return solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version to deploy.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     * <b>Pattern: </b>arn:([a-z\d-]+):personalize:.*:.*:.+<br/>
     *
     * @param solutionVersionArn <p>
     *            The Amazon Resource Name (ARN) of the solution version to
     *            deploy.
     *            </p>
     */
    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the solution version to deploy.
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
     *            The Amazon Resource Name (ARN) of the solution version to
     *            deploy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCampaignRequest withSolutionVersionArn(String solutionVersionArn) {
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
    public CreateCampaignRequest withMinProvisionedTPS(Integer minProvisionedTPS) {
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
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

        if (obj instanceof CreateCampaignRequest == false)
            return false;
        CreateCampaignRequest other = (CreateCampaignRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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
