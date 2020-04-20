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
 * Metadata for this recommendation set.
 * </p>
 */
public class RightsizingRecommendationMetadata implements Serializable {
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
     * The time stamp for when Amazon Web Services made this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     */
    private String generationTimestamp;

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when
     * making this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     */
    private String lookbackPeriodInDays;

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
    public RightsizingRecommendationMetadata withRecommendationId(String recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    /**
     * <p>
     * The time stamp for when Amazon Web Services made this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @return <p>
     *         The time stamp for when Amazon Web Services made this
     *         recommendation.
     *         </p>
     */
    public String getGenerationTimestamp() {
        return generationTimestamp;
    }

    /**
     * <p>
     * The time stamp for when Amazon Web Services made this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\S\s]*<br/>
     *
     * @param generationTimestamp <p>
     *            The time stamp for when Amazon Web Services made this
     *            recommendation.
     *            </p>
     */
    public void setGenerationTimestamp(String generationTimestamp) {
        this.generationTimestamp = generationTimestamp;
    }

    /**
     * <p>
     * The time stamp for when Amazon Web Services made this recommendation.
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
     *            The time stamp for when Amazon Web Services made this
     *            recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RightsizingRecommendationMetadata withGenerationTimestamp(String generationTimestamp) {
        this.generationTimestamp = generationTimestamp;
        return this;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when
     * making this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @return <p>
     *         How many days of previous usage that Amazon Web Services
     *         considers when making this recommendation.
     *         </p>
     * @see LookbackPeriodInDays
     */
    public String getLookbackPeriodInDays() {
        return lookbackPeriodInDays;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when
     * making this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            How many days of previous usage that Amazon Web Services
     *            considers when making this recommendation.
     *            </p>
     * @see LookbackPeriodInDays
     */
    public void setLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when
     * making this recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            How many days of previous usage that Amazon Web Services
     *            considers when making this recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LookbackPeriodInDays
     */
    public RightsizingRecommendationMetadata withLookbackPeriodInDays(String lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays;
        return this;
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when
     * making this recommendation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            How many days of previous usage that Amazon Web Services
     *            considers when making this recommendation.
     *            </p>
     * @see LookbackPeriodInDays
     */
    public void setLookbackPeriodInDays(LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
    }

    /**
     * <p>
     * How many days of previous usage that Amazon Web Services considers when
     * making this recommendation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SEVEN_DAYS, THIRTY_DAYS, SIXTY_DAYS
     *
     * @param lookbackPeriodInDays <p>
     *            How many days of previous usage that Amazon Web Services
     *            considers when making this recommendation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LookbackPeriodInDays
     */
    public RightsizingRecommendationMetadata withLookbackPeriodInDays(
            LookbackPeriodInDays lookbackPeriodInDays) {
        this.lookbackPeriodInDays = lookbackPeriodInDays.toString();
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
            sb.append("GenerationTimestamp: " + getGenerationTimestamp() + ",");
        if (getLookbackPeriodInDays() != null)
            sb.append("LookbackPeriodInDays: " + getLookbackPeriodInDays());
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
        hashCode = prime * hashCode
                + ((getLookbackPeriodInDays() == null) ? 0 : getLookbackPeriodInDays().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RightsizingRecommendationMetadata == false)
            return false;
        RightsizingRecommendationMetadata other = (RightsizingRecommendationMetadata) obj;

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
        if (other.getLookbackPeriodInDays() == null ^ this.getLookbackPeriodInDays() == null)
            return false;
        if (other.getLookbackPeriodInDays() != null
                && other.getLookbackPeriodInDays().equals(this.getLookbackPeriodInDays()) == false)
            return false;
        return true;
    }
}
