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

public class GetJourneyExecutionMetricsResult implements Serializable {
    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * execution metric that applies to a journey, and provides information
     * about that query.
     * </p>
     */
    private JourneyExecutionMetricsResponse journeyExecutionMetricsResponse;

    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * execution metric that applies to a journey, and provides information
     * about that query.
     * </p>
     *
     * @return <p>
     *         Provides the results of a query that retrieved the data for a
     *         standard execution metric that applies to a journey, and provides
     *         information about that query.
     *         </p>
     */
    public JourneyExecutionMetricsResponse getJourneyExecutionMetricsResponse() {
        return journeyExecutionMetricsResponse;
    }

    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * execution metric that applies to a journey, and provides information
     * about that query.
     * </p>
     *
     * @param journeyExecutionMetricsResponse <p>
     *            Provides the results of a query that retrieved the data for a
     *            standard execution metric that applies to a journey, and
     *            provides information about that query.
     *            </p>
     */
    public void setJourneyExecutionMetricsResponse(
            JourneyExecutionMetricsResponse journeyExecutionMetricsResponse) {
        this.journeyExecutionMetricsResponse = journeyExecutionMetricsResponse;
    }

    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * execution metric that applies to a journey, and provides information
     * about that query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param journeyExecutionMetricsResponse <p>
     *            Provides the results of a query that retrieved the data for a
     *            standard execution metric that applies to a journey, and
     *            provides information about that query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJourneyExecutionMetricsResult withJourneyExecutionMetricsResponse(
            JourneyExecutionMetricsResponse journeyExecutionMetricsResponse) {
        this.journeyExecutionMetricsResponse = journeyExecutionMetricsResponse;
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
        if (getJourneyExecutionMetricsResponse() != null)
            sb.append("JourneyExecutionMetricsResponse: " + getJourneyExecutionMetricsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getJourneyExecutionMetricsResponse() == null) ? 0
                        : getJourneyExecutionMetricsResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJourneyExecutionMetricsResult == false)
            return false;
        GetJourneyExecutionMetricsResult other = (GetJourneyExecutionMetricsResult) obj;

        if (other.getJourneyExecutionMetricsResponse() == null
                ^ this.getJourneyExecutionMetricsResponse() == null)
            return false;
        if (other.getJourneyExecutionMetricsResponse() != null
                && other.getJourneyExecutionMetricsResponse().equals(
                        this.getJourneyExecutionMetricsResponse()) == false)
            return false;
        return true;
    }
}
