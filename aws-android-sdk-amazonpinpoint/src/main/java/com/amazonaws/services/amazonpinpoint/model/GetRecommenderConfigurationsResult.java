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

public class GetRecommenderConfigurationsResult implements Serializable {
    /**
     * <p>
     * Provides information about all the recommender model configurations that
     * are associated with your Amazon Pinpoint account.
     * </p>
     */
    private ListRecommenderConfigurationsResponse listRecommenderConfigurationsResponse;

    /**
     * <p>
     * Provides information about all the recommender model configurations that
     * are associated with your Amazon Pinpoint account.
     * </p>
     *
     * @return <p>
     *         Provides information about all the recommender model
     *         configurations that are associated with your Amazon Pinpoint
     *         account.
     *         </p>
     */
    public ListRecommenderConfigurationsResponse getListRecommenderConfigurationsResponse() {
        return listRecommenderConfigurationsResponse;
    }

    /**
     * <p>
     * Provides information about all the recommender model configurations that
     * are associated with your Amazon Pinpoint account.
     * </p>
     *
     * @param listRecommenderConfigurationsResponse <p>
     *            Provides information about all the recommender model
     *            configurations that are associated with your Amazon Pinpoint
     *            account.
     *            </p>
     */
    public void setListRecommenderConfigurationsResponse(
            ListRecommenderConfigurationsResponse listRecommenderConfigurationsResponse) {
        this.listRecommenderConfigurationsResponse = listRecommenderConfigurationsResponse;
    }

    /**
     * <p>
     * Provides information about all the recommender model configurations that
     * are associated with your Amazon Pinpoint account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param listRecommenderConfigurationsResponse <p>
     *            Provides information about all the recommender model
     *            configurations that are associated with your Amazon Pinpoint
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetRecommenderConfigurationsResult withListRecommenderConfigurationsResponse(
            ListRecommenderConfigurationsResponse listRecommenderConfigurationsResponse) {
        this.listRecommenderConfigurationsResponse = listRecommenderConfigurationsResponse;
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
        if (getListRecommenderConfigurationsResponse() != null)
            sb.append("ListRecommenderConfigurationsResponse: "
                    + getListRecommenderConfigurationsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getListRecommenderConfigurationsResponse() == null) ? 0
                        : getListRecommenderConfigurationsResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecommenderConfigurationsResult == false)
            return false;
        GetRecommenderConfigurationsResult other = (GetRecommenderConfigurationsResult) obj;

        if (other.getListRecommenderConfigurationsResponse() == null
                ^ this.getListRecommenderConfigurationsResponse() == null)
            return false;
        if (other.getListRecommenderConfigurationsResponse() != null
                && other.getListRecommenderConfigurationsResponse().equals(
                        this.getListRecommenderConfigurationsResponse()) == false)
            return false;
        return true;
    }
}
