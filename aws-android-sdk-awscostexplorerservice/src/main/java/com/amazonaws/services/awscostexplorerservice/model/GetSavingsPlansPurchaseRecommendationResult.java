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

package com.amazonaws.services.awscostexplorerservice.model;

import java.io.Serializable;

public class GetSavingsPlansPurchaseRecommendationResult implements Serializable {
    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     */
    private SavingsPlansPurchaseRecommendationMetadata metadata;

    /**
     * <p>
     * Contains your request parameters, Savings Plan Recommendations Summary,
     * and Details.
     * </p>
     */
    private SavingsPlansPurchaseRecommendation savingsPlansPurchaseRecommendation;

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     *
     * @return <p>
     *         Information regarding this specific recommendation set.
     *         </p>
     */
    public SavingsPlansPurchaseRecommendationMetadata getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     *
     * @param metadata <p>
     *            Information regarding this specific recommendation set.
     *            </p>
     */
    public void setMetadata(SavingsPlansPurchaseRecommendationMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Information regarding this specific recommendation set.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            Information regarding this specific recommendation set.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansPurchaseRecommendationResult withMetadata(
            SavingsPlansPurchaseRecommendationMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * Contains your request parameters, Savings Plan Recommendations Summary,
     * and Details.
     * </p>
     *
     * @return <p>
     *         Contains your request parameters, Savings Plan Recommendations
     *         Summary, and Details.
     *         </p>
     */
    public SavingsPlansPurchaseRecommendation getSavingsPlansPurchaseRecommendation() {
        return savingsPlansPurchaseRecommendation;
    }

    /**
     * <p>
     * Contains your request parameters, Savings Plan Recommendations Summary,
     * and Details.
     * </p>
     *
     * @param savingsPlansPurchaseRecommendation <p>
     *            Contains your request parameters, Savings Plan Recommendations
     *            Summary, and Details.
     *            </p>
     */
    public void setSavingsPlansPurchaseRecommendation(
            SavingsPlansPurchaseRecommendation savingsPlansPurchaseRecommendation) {
        this.savingsPlansPurchaseRecommendation = savingsPlansPurchaseRecommendation;
    }

    /**
     * <p>
     * Contains your request parameters, Savings Plan Recommendations Summary,
     * and Details.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param savingsPlansPurchaseRecommendation <p>
     *            Contains your request parameters, Savings Plan Recommendations
     *            Summary, and Details.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansPurchaseRecommendationResult withSavingsPlansPurchaseRecommendation(
            SavingsPlansPurchaseRecommendation savingsPlansPurchaseRecommendation) {
        this.savingsPlansPurchaseRecommendation = savingsPlansPurchaseRecommendation;
        return this;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The token for the next set of retrievable results. AWS provides
     *         the token when the response from a previous call has more results
     *         than the maximum page size.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token for the next set of retrievable results. AWS
     *            provides the token when the response from a previous call has
     *            more results than the maximum page size.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token for the next set of retrievable results. AWS provides the token
     * when the response from a previous call has more results than the maximum
     * page size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The token for the next set of retrievable results. AWS
     *            provides the token when the response from a previous call has
     *            more results than the maximum page size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSavingsPlansPurchaseRecommendationResult withNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
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
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata() + ",");
        if (getSavingsPlansPurchaseRecommendation() != null)
            sb.append("SavingsPlansPurchaseRecommendation: "
                    + getSavingsPlansPurchaseRecommendation() + ",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: " + getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime
                * hashCode
                + ((getSavingsPlansPurchaseRecommendation() == null) ? 0
                        : getSavingsPlansPurchaseRecommendation().hashCode());
        hashCode = prime * hashCode
                + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSavingsPlansPurchaseRecommendationResult == false)
            return false;
        GetSavingsPlansPurchaseRecommendationResult other = (GetSavingsPlansPurchaseRecommendationResult) obj;

        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getSavingsPlansPurchaseRecommendation() == null
                ^ this.getSavingsPlansPurchaseRecommendation() == null)
            return false;
        if (other.getSavingsPlansPurchaseRecommendation() != null
                && other.getSavingsPlansPurchaseRecommendation().equals(
                        this.getSavingsPlansPurchaseRecommendation()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
