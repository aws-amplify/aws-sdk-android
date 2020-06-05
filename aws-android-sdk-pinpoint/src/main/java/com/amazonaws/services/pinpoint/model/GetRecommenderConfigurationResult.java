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

public class GetRecommenderConfigurationResult implements Serializable {
    /**
     * <p>
     * Provides information about Amazon Pinpoint configuration settings for
     * retrieving and processing data from a recommender model.
     * </p>
     */
    private RecommenderConfigurationResponse recommenderConfigurationResponse;

    /**
     * <p>
     * Provides information about Amazon Pinpoint configuration settings for
     * retrieving and processing data from a recommender model.
     * </p>
     *
     * @return <p>
     *         Provides information about Amazon Pinpoint configuration settings
     *         for retrieving and processing data from a recommender model.
     *         </p>
     */
    public RecommenderConfigurationResponse getRecommenderConfigurationResponse() {
        return recommenderConfigurationResponse;
    }

    /**
     * <p>
     * Provides information about Amazon Pinpoint configuration settings for
     * retrieving and processing data from a recommender model.
     * </p>
     *
     * @param recommenderConfigurationResponse <p>
     *            Provides information about Amazon Pinpoint configuration
     *            settings for retrieving and processing data from a recommender
     *            model.
     *            </p>
     */
    public void setRecommenderConfigurationResponse(
            RecommenderConfigurationResponse recommenderConfigurationResponse) {
        this.recommenderConfigurationResponse = recommenderConfigurationResponse;
    }

    /**
     * <p>
     * Provides information about Amazon Pinpoint configuration settings for
     * retrieving and processing data from a recommender model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recommenderConfigurationResponse <p>
     *            Provides information about Amazon Pinpoint configuration
     *            settings for retrieving and processing data from a recommender
     *            model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRecommenderConfigurationResult withRecommenderConfigurationResponse(
            RecommenderConfigurationResponse recommenderConfigurationResponse) {
        this.recommenderConfigurationResponse = recommenderConfigurationResponse;
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
        if (getRecommenderConfigurationResponse() != null)
            sb.append("RecommenderConfigurationResponse: " + getRecommenderConfigurationResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRecommenderConfigurationResponse() == null) ? 0
                        : getRecommenderConfigurationResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommenderConfigurationResult == false)
            return false;
        GetRecommenderConfigurationResult other = (GetRecommenderConfigurationResult) obj;

        if (other.getRecommenderConfigurationResponse() == null
                ^ this.getRecommenderConfigurationResponse() == null)
            return false;
        if (other.getRecommenderConfigurationResponse() != null
                && other.getRecommenderConfigurationResponse().equals(
                        this.getRecommenderConfigurationResponse()) == false)
            return false;
        return true;
    }
}
