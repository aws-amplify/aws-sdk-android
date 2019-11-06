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

public class GetAppsResult implements Serializable {
    /**
     * Get Applications Result.
     */
    private ApplicationsResponse applicationsResponse;

    /**
     * Get Applications Result.
     *
     * @return Get Applications Result.
     */
    public ApplicationsResponse getApplicationsResponse() {
        return applicationsResponse;
    }

    /**
     * Get Applications Result.
     *
     * @param applicationsResponse Get Applications Result.
     */
    public void setApplicationsResponse(ApplicationsResponse applicationsResponse) {
        this.applicationsResponse = applicationsResponse;
    }

    /**
     * Get Applications Result.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationsResponse Get Applications Result.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetAppsResult withApplicationsResponse(ApplicationsResponse applicationsResponse) {
        this.applicationsResponse = applicationsResponse;
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
        if (getApplicationsResponse() != null)
            sb.append("ApplicationsResponse: " + getApplicationsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationsResponse() == null) ? 0 : getApplicationsResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAppsResult == false)
            return false;
        GetAppsResult other = (GetAppsResult) obj;

        if (other.getApplicationsResponse() == null ^ this.getApplicationsResponse() == null)
            return false;
        if (other.getApplicationsResponse() != null
                && other.getApplicationsResponse().equals(this.getApplicationsResponse()) == false)
            return false;
        return true;
    }
}
