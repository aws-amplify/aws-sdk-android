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

public class GetJourneyExecutionActivityMetricsResult implements Serializable {
    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * execution metric that applies to a journey activity, and provides
     * information about that query.
     * </p>
     */
    private JourneyExecutionActivityMetricsResponse journeyExecutionActivityMetricsResponse;

    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * execution metric that applies to a journey activity, and provides
     * information about that query.
     * </p>
     *
     * @return <p>
     *         Provides the results of a query that retrieved the data for a
     *         standard execution metric that applies to a journey activity, and
     *         provides information about that query.
     *         </p>
     */
    public JourneyExecutionActivityMetricsResponse getJourneyExecutionActivityMetricsResponse() {
        return journeyExecutionActivityMetricsResponse;
    }

    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * execution metric that applies to a journey activity, and provides
     * information about that query.
     * </p>
     *
     * @param journeyExecutionActivityMetricsResponse <p>
     *            Provides the results of a query that retrieved the data for a
     *            standard execution metric that applies to a journey activity,
     *            and provides information about that query.
     *            </p>
     */
    public void setJourneyExecutionActivityMetricsResponse(
            JourneyExecutionActivityMetricsResponse journeyExecutionActivityMetricsResponse) {
        this.journeyExecutionActivityMetricsResponse = journeyExecutionActivityMetricsResponse;
    }

    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * execution metric that applies to a journey activity, and provides
     * information about that query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param journeyExecutionActivityMetricsResponse <p>
     *            Provides the results of a query that retrieved the data for a
     *            standard execution metric that applies to a journey activity,
     *            and provides information about that query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetJourneyExecutionActivityMetricsResult withJourneyExecutionActivityMetricsResponse(
            JourneyExecutionActivityMetricsResponse journeyExecutionActivityMetricsResponse) {
        this.journeyExecutionActivityMetricsResponse = journeyExecutionActivityMetricsResponse;
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
        if (getJourneyExecutionActivityMetricsResponse() != null)
            sb.append("JourneyExecutionActivityMetricsResponse: "
                    + getJourneyExecutionActivityMetricsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getJourneyExecutionActivityMetricsResponse() == null) ? 0
                        : getJourneyExecutionActivityMetricsResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJourneyExecutionActivityMetricsResult == false)
            return false;
        GetJourneyExecutionActivityMetricsResult other = (GetJourneyExecutionActivityMetricsResult) obj;

        if (other.getJourneyExecutionActivityMetricsResponse() == null
                ^ this.getJourneyExecutionActivityMetricsResponse() == null)
            return false;
        if (other.getJourneyExecutionActivityMetricsResponse() != null
                && other.getJourneyExecutionActivityMetricsResponse().equals(
                        this.getJourneyExecutionActivityMetricsResponse()) == false)
            return false;
        return true;
    }
}
