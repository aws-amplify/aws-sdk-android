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

package com.amazonaws.services.amazonpinpoint.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates an Amazon Pinpoint configuration for a recommender model.
 * </p>
 */
public class CreateRecommenderConfigurationRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Specifies Amazon Pinpoint configuration settings for retrieving and
     * processing recommendation data from a recommender model.
     * </p>
     */
    private CreateRecommenderConfiguration createRecommenderConfiguration;

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
    public CreateRecommenderConfiguration getCreateRecommenderConfiguration() {
        return createRecommenderConfiguration;
    }

    /**
     * <p>
     * Specifies Amazon Pinpoint configuration settings for retrieving and
     * processing recommendation data from a recommender model.
     * </p>
     *
     * @param createRecommenderConfiguration <p>
     *            Specifies Amazon Pinpoint configuration settings for
     *            retrieving and processing recommendation data from a
     *            recommender model.
     *            </p>
     */
    public void setCreateRecommenderConfiguration(
            CreateRecommenderConfiguration createRecommenderConfiguration) {
        this.createRecommenderConfiguration = createRecommenderConfiguration;
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
     * @param createRecommenderConfiguration <p>
     *            Specifies Amazon Pinpoint configuration settings for
     *            retrieving and processing recommendation data from a
     *            recommender model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateRecommenderConfigurationRequest withCreateRecommenderConfiguration(
            CreateRecommenderConfiguration createRecommenderConfiguration) {
        this.createRecommenderConfiguration = createRecommenderConfiguration;
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
        if (getCreateRecommenderConfiguration() != null)
            sb.append("CreateRecommenderConfiguration: " + getCreateRecommenderConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCreateRecommenderConfiguration() == null) ? 0
                        : getCreateRecommenderConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRecommenderConfigurationRequest == false)
            return false;
        CreateRecommenderConfigurationRequest other = (CreateRecommenderConfigurationRequest) obj;

        if (other.getCreateRecommenderConfiguration() == null
                ^ this.getCreateRecommenderConfiguration() == null)
            return false;
        if (other.getCreateRecommenderConfiguration() != null
                && other.getCreateRecommenderConfiguration().equals(
                        this.getCreateRecommenderConfiguration()) == false)
            return false;
        return true;
    }
}
