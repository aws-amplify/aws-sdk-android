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

public class GetSegmentImportJobsResult implements Serializable {
    /**
     * Import job list.
     */
    private ImportJobsResponse importJobsResponse;

    /**
     * Import job list.
     *
     * @return Import job list.
     */
    public ImportJobsResponse getImportJobsResponse() {
        return importJobsResponse;
    }

    /**
     * Import job list.
     *
     * @param importJobsResponse Import job list.
     */
    public void setImportJobsResponse(ImportJobsResponse importJobsResponse) {
        this.importJobsResponse = importJobsResponse;
    }

    /**
     * Import job list.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importJobsResponse Import job list.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetSegmentImportJobsResult withImportJobsResponse(ImportJobsResponse importJobsResponse) {
        this.importJobsResponse = importJobsResponse;
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
        if (getImportJobsResponse() != null)
            sb.append("ImportJobsResponse: " + getImportJobsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImportJobsResponse() == null) ? 0 : getImportJobsResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSegmentImportJobsResult == false)
            return false;
        GetSegmentImportJobsResult other = (GetSegmentImportJobsResult) obj;

        if (other.getImportJobsResponse() == null ^ this.getImportJobsResponse() == null)
            return false;
        if (other.getImportJobsResponse() != null
                && other.getImportJobsResponse().equals(this.getImportJobsResponse()) == false)
            return false;
        return true;
    }
}
