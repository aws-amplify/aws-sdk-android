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

public class GetReservationPurchaseRecommendationResult implements Serializable {
    /**
     * <p>
     * Information about this specific recommendation call, such as the time
     * stamp for when Cost Explorer generated this recommendation.
     * </p>
     */
    private ReservationPurchaseRecommendationMetadata metadata;

    /**
     * <p>
     * Recommendations for reservations to purchase.
     * </p>
     */
    private java.util.List<ReservationPurchaseRecommendation> recommendations;

    /**
     * <p>
     * The pagination token for the next set of retrievable results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String nextPageToken;

    /**
     * <p>
     * Information about this specific recommendation call, such as the time
     * stamp for when Cost Explorer generated this recommendation.
     * </p>
     *
     * @return <p>
     *         Information about this specific recommendation call, such as the
     *         time stamp for when Cost Explorer generated this recommendation.
     *         </p>
     */
    public ReservationPurchaseRecommendationMetadata getMetadata() {
        return metadata;
    }

    /**
     * <p>
     * Information about this specific recommendation call, such as the time
     * stamp for when Cost Explorer generated this recommendation.
     * </p>
     *
     * @param metadata <p>
     *            Information about this specific recommendation call, such as
     *            the time stamp for when Cost Explorer generated this
     *            recommendation.
     *            </p>
     */
    public void setMetadata(ReservationPurchaseRecommendationMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * Information about this specific recommendation call, such as the time
     * stamp for when Cost Explorer generated this recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param metadata <p>
     *            Information about this specific recommendation call, such as
     *            the time stamp for when Cost Explorer generated this
     *            recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationPurchaseRecommendationResult withMetadata(
            ReservationPurchaseRecommendationMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * <p>
     * Recommendations for reservations to purchase.
     * </p>
     *
     * @return <p>
     *         Recommendations for reservations to purchase.
     *         </p>
     */
    public java.util.List<ReservationPurchaseRecommendation> getRecommendations() {
        return recommendations;
    }

    /**
     * <p>
     * Recommendations for reservations to purchase.
     * </p>
     *
     * @param recommendations <p>
     *            Recommendations for reservations to purchase.
     *            </p>
     */
    public void setRecommendations(
            java.util.Collection<ReservationPurchaseRecommendation> recommendations) {
        if (recommendations == null) {
            this.recommendations = null;
            return;
        }

        this.recommendations = new java.util.ArrayList<ReservationPurchaseRecommendation>(
                recommendations);
    }

    /**
     * <p>
     * Recommendations for reservations to purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendations <p>
     *            Recommendations for reservations to purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationPurchaseRecommendationResult withRecommendations(
            ReservationPurchaseRecommendation... recommendations) {
        if (getRecommendations() == null) {
            this.recommendations = new java.util.ArrayList<ReservationPurchaseRecommendation>(
                    recommendations.length);
        }
        for (ReservationPurchaseRecommendation value : recommendations) {
            this.recommendations.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Recommendations for reservations to purchase.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommendations <p>
     *            Recommendations for reservations to purchase.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationPurchaseRecommendationResult withRecommendations(
            java.util.Collection<ReservationPurchaseRecommendation> recommendations) {
        setRecommendations(recommendations);
        return this;
    }

    /**
     * <p>
     * The pagination token for the next set of retrievable results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The pagination token for the next set of retrievable results.
     *         </p>
     */
    public String getNextPageToken() {
        return nextPageToken;
    }

    /**
     * <p>
     * The pagination token for the next set of retrievable results.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8192<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param nextPageToken <p>
     *            The pagination token for the next set of retrievable results.
     *            </p>
     */
    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The pagination token for the next set of retrievable results.
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
     *            The pagination token for the next set of retrievable results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetReservationPurchaseRecommendationResult withNextPageToken(String nextPageToken) {
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
        if (getRecommendations() != null)
            sb.append("Recommendations: " + getRecommendations() + ",");
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
        hashCode = prime * hashCode
                + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
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

        if (obj instanceof GetReservationPurchaseRecommendationResult == false)
            return false;
        GetReservationPurchaseRecommendationResult other = (GetReservationPurchaseRecommendationResult) obj;

        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getRecommendations() == null ^ this.getRecommendations() == null)
            return false;
        if (other.getRecommendations() != null
                && other.getRecommendations().equals(this.getRecommendations()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null
                && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }
}
