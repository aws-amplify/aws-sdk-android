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

/**
 * <p>
 * Information about this specific recommendation, such as the timestamp for
 * when AWS made a specific recommendation.
 * </p>
 */
public class ReservationPurchaseRecommendationMetadata implements Serializable {
    /**
     * <p>
     * The ID for this specific recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String recommendationId;

    /**
     * <p>
     * The timestamp for when AWS made this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String generationTimestamp;

    /**
     * <p>
     * The ID for this specific recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The ID for this specific recommendation.
     *         </p>
     */
    public String getRecommendationId() {
        return recommendationId;
    }

    /**
     * <p>
     * The ID for this specific recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param recommendationId <p>
     *            The ID for this specific recommendation.
     *            </p>
     */
    public void setRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
    }

    /**
     * <p>
     * The ID for this specific recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param recommendationId <p>
     *            The ID for this specific recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationMetadata withRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    /**
     * <p>
     * The timestamp for when AWS made this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The timestamp for when AWS made this recommendation.
     *         </p>
     */
    public String getGenerationTimestamp() {
        return generationTimestamp;
    }

    /**
     * <p>
     * The timestamp for when AWS made this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param generationTimestamp <p>
     *            The timestamp for when AWS made this recommendation.
     *            </p>
     */
    public void setGenerationTimestamp(String generationTimestamp) {
        this.generationTimestamp = generationTimestamp;
    }

    /**
     * <p>
     * The timestamp for when AWS made this recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param generationTimestamp <p>
     *            The timestamp for when AWS made this recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ReservationPurchaseRecommendationMetadata withGenerationTimestamp(
            String generationTimestamp) {
        this.generationTimestamp = generationTimestamp;
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
        if (getRecommendationId() != null)
            sb.append("RecommendationId: " + getRecommendationId() + ",");
        if (getGenerationTimestamp() != null)
            sb.append("GenerationTimestamp: " + getGenerationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecommendationId() == null) ? 0 : getRecommendationId().hashCode());
        hashCode = prime * hashCode
                + ((getGenerationTimestamp() == null) ? 0 : getGenerationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReservationPurchaseRecommendationMetadata == false)
            return false;
        ReservationPurchaseRecommendationMetadata other = (ReservationPurchaseRecommendationMetadata) obj;

        if (other.getRecommendationId() == null ^ this.getRecommendationId() == null)
            return false;
        if (other.getRecommendationId() != null
                && other.getRecommendationId().equals(this.getRecommendationId()) == false)
            return false;
        if (other.getGenerationTimestamp() == null ^ this.getGenerationTimestamp() == null)
            return false;
        if (other.getGenerationTimestamp() != null
                && other.getGenerationTimestamp().equals(this.getGenerationTimestamp()) == false)
            return false;
        return true;
    }
}
