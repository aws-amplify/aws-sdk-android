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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates an Amazon Pinpoint configuration for a recommender model.
 * </p>
 */
public class UpdateRecommenderConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The unique identifier for the recommender model configuration. This
     * identifier is displayed as the <b>Recommender ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     */
    private String recommenderId;

    /**
     * <p>
     * Specifies Amazon Pinpoint configuration settings for retrieving and
     * processing recommendation data from a recommender model.
     * </p>
     */
    private UpdateRecommenderConfiguration updateRecommenderConfiguration;

    /**
     * <p>
     * The unique identifier for the recommender model configuration. This
     * identifier is displayed as the <b>Recommender ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     *
     * @return <p>
     *         The unique identifier for the recommender model configuration.
     *         This identifier is displayed as the <b>Recommender ID</b> on the
     *         Amazon Pinpoint console.
     *         </p>
     */
    public String getRecommenderId() {
        return recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model configuration. This
     * identifier is displayed as the <b>Recommender ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     *
     * @param recommenderId <p>
     *            The unique identifier for the recommender model configuration.
     *            This identifier is displayed as the <b>Recommender ID</b> on
     *            the Amazon Pinpoint console.
     *            </p>
     */
    public void setRecommenderId(String recommenderId) {
        this.recommenderId = recommenderId;
    }

    /**
     * <p>
     * The unique identifier for the recommender model configuration. This
     * identifier is displayed as the <b>Recommender ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommenderId <p>
     *            The unique identifier for the recommender model configuration.
     *            This identifier is displayed as the <b>Recommender ID</b> on
     *            the Amazon Pinpoint console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRecommenderConfigurationRequest withRecommenderId(String recommenderId) {
        this.recommenderId = recommenderId;
        return this;
    }

    /**
     * <p>
     * Specifies Amazon Pinpoint configuration settings for retrieving and
     * processing recommendation data from a recommender model.
     * </p>
     *
     * @return <p>
     *         Specifies Amazon Pinpoint configuration settings for retrieving
     *         and processing recommendation data from a recommender model.
     *         </p>
     */
    public UpdateRecommenderConfiguration getUpdateRecommenderConfiguration() {
        return updateRecommenderConfiguration;
    }

    /**
     * <p>
     * Specifies Amazon Pinpoint configuration settings for retrieving and
     * processing recommendation data from a recommender model.
     * </p>
     *
     * @param updateRecommenderConfiguration <p>
     *            Specifies Amazon Pinpoint configuration settings for
     *            retrieving and processing recommendation data from a
     *            recommender model.
     *            </p>
     */
    public void setUpdateRecommenderConfiguration(
            UpdateRecommenderConfiguration updateRecommenderConfiguration) {
        this.updateRecommenderConfiguration = updateRecommenderConfiguration;
    }

    /**
     * <p>
     * Specifies Amazon Pinpoint configuration settings for retrieving and
     * processing recommendation data from a recommender model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param updateRecommenderConfiguration <p>
     *            Specifies Amazon Pinpoint configuration settings for
     *            retrieving and processing recommendation data from a
     *            recommender model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRecommenderConfigurationRequest withUpdateRecommenderConfiguration(
            UpdateRecommenderConfiguration updateRecommenderConfiguration) {
        this.updateRecommenderConfiguration = updateRecommenderConfiguration;
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
        if (getRecommenderId() != null)
            sb.append("RecommenderId: " + getRecommenderId() + ",");
        if (getUpdateRecommenderConfiguration() != null)
            sb.append("UpdateRecommenderConfiguration: " + getUpdateRecommenderConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecommenderId() == null) ? 0 : getRecommenderId().hashCode());
        hashCode = prime
                * hashCode
                + ((getUpdateRecommenderConfiguration() == null) ? 0
                        : getUpdateRecommenderConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRecommenderConfigurationRequest == false)
            return false;
        UpdateRecommenderConfigurationRequest other = (UpdateRecommenderConfigurationRequest) obj;

        if (other.getRecommenderId() == null ^ this.getRecommenderId() == null)
            return false;
        if (other.getRecommenderId() != null
                && other.getRecommenderId().equals(this.getRecommenderId()) == false)
            return false;
        if (other.getUpdateRecommenderConfiguration() == null
                ^ this.getUpdateRecommenderConfiguration() == null)
            return false;
        if (other.getUpdateRecommenderConfiguration() != null
                && other.getUpdateRecommenderConfiguration().equals(
                        this.getUpdateRecommenderConfiguration()) == false)
            return false;
        return true;
    }
}
