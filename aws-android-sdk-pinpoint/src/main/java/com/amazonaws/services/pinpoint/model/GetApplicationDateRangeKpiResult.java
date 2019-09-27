/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class GetApplicationDateRangeKpiResult implements Serializable {
    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * metric that applies to an application, and provides information about
     * that query.
     * </p>
     */
    private ApplicationDateRangeKpiResponse applicationDateRangeKpiResponse;

    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * metric that applies to an application, and provides information about
     * that query.
     * </p>
     *
     * @return <p>
     *         Provides the results of a query that retrieved the data for a
     *         standard metric that applies to an application, and provides
     *         information about that query.
     *         </p>
     */
    public ApplicationDateRangeKpiResponse getApplicationDateRangeKpiResponse() {
        return applicationDateRangeKpiResponse;
    }

    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * metric that applies to an application, and provides information about
     * that query.
     * </p>
     *
     * @param applicationDateRangeKpiResponse <p>
     *            Provides the results of a query that retrieved the data for a
     *            standard metric that applies to an application, and provides
     *            information about that query.
     *            </p>
     */
    public void setApplicationDateRangeKpiResponse(
            ApplicationDateRangeKpiResponse applicationDateRangeKpiResponse) {
        this.applicationDateRangeKpiResponse = applicationDateRangeKpiResponse;
    }

    /**
     * <p>
     * Provides the results of a query that retrieved the data for a standard
     * metric that applies to an application, and provides information about
     * that query.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationDateRangeKpiResponse <p>
     *            Provides the results of a query that retrieved the data for a
     *            standard metric that applies to an application, and provides
     *            information about that query.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetApplicationDateRangeKpiResult withApplicationDateRangeKpiResponse(
            ApplicationDateRangeKpiResponse applicationDateRangeKpiResponse) {
        this.applicationDateRangeKpiResponse = applicationDateRangeKpiResponse;
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
        if (getApplicationDateRangeKpiResponse() != null)
            sb.append("ApplicationDateRangeKpiResponse: " + getApplicationDateRangeKpiResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getApplicationDateRangeKpiResponse() == null) ? 0
                        : getApplicationDateRangeKpiResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationDateRangeKpiResult == false)
            return false;
        GetApplicationDateRangeKpiResult other = (GetApplicationDateRangeKpiResult) obj;

        if (other.getApplicationDateRangeKpiResponse() == null
                ^ this.getApplicationDateRangeKpiResponse() == null)
            return false;
        if (other.getApplicationDateRangeKpiResponse() != null
                && other.getApplicationDateRangeKpiResponse().equals(
                        this.getApplicationDateRangeKpiResponse()) == false)
            return false;
        return true;
    }
}
