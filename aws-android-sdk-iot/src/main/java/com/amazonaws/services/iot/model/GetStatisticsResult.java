/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

public class GetStatisticsResult implements Serializable {
    /**
     * <p>
     * The statistics returned by the Fleet Indexing service based on the query
     * and aggregation field.
     * </p>
     */
    private Statistics statistics;

    /**
     * <p>
     * The statistics returned by the Fleet Indexing service based on the query
     * and aggregation field.
     * </p>
     *
     * @return <p>
     *         The statistics returned by the Fleet Indexing service based on
     *         the query and aggregation field.
     *         </p>
     */
    public Statistics getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * The statistics returned by the Fleet Indexing service based on the query
     * and aggregation field.
     * </p>
     *
     * @param statistics <p>
     *            The statistics returned by the Fleet Indexing service based on
     *            the query and aggregation field.
     *            </p>
     */
    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    /**
     * <p>
     * The statistics returned by the Fleet Indexing service based on the query
     * and aggregation field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param statistics <p>
     *            The statistics returned by the Fleet Indexing service based on
     *            the query and aggregation field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetStatisticsResult withStatistics(Statistics statistics) {
        this.statistics = statistics;
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
        if (getStatistics() != null)
            sb.append("statistics: " + getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStatisticsResult == false)
            return false;
        GetStatisticsResult other = (GetStatisticsResult) obj;

        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null
                && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }
}
