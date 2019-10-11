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

public class GetExportJobsResult implements Serializable {
    /**
     * <p>
     * Provides information about all the export jobs that are associated with
     * an application or segment. An export job is a job that exports endpoint
     * definitions to a file.
     * </p>
     */
    private ExportJobsResponse exportJobsResponse;

    /**
     * <p>
     * Provides information about all the export jobs that are associated with
     * an application or segment. An export job is a job that exports endpoint
     * definitions to a file.
     * </p>
     *
     * @return <p>
     *         Provides information about all the export jobs that are
     *         associated with an application or segment. An export job is a job
     *         that exports endpoint definitions to a file.
     *         </p>
     */
    public ExportJobsResponse getExportJobsResponse() {
        return exportJobsResponse;
    }

    /**
     * <p>
     * Provides information about all the export jobs that are associated with
     * an application or segment. An export job is a job that exports endpoint
     * definitions to a file.
     * </p>
     *
     * @param exportJobsResponse <p>
     *            Provides information about all the export jobs that are
     *            associated with an application or segment. An export job is a
     *            job that exports endpoint definitions to a file.
     *            </p>
     */
    public void setExportJobsResponse(ExportJobsResponse exportJobsResponse) {
        this.exportJobsResponse = exportJobsResponse;
    }

    /**
     * <p>
     * Provides information about all the export jobs that are associated with
     * an application or segment. An export job is a job that exports endpoint
     * definitions to a file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param exportJobsResponse <p>
     *            Provides information about all the export jobs that are
     *            associated with an application or segment. An export job is a
     *            job that exports endpoint definitions to a file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetExportJobsResult withExportJobsResponse(ExportJobsResponse exportJobsResponse) {
        this.exportJobsResponse = exportJobsResponse;
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
        if (getExportJobsResponse() != null)
            sb.append("ExportJobsResponse: " + getExportJobsResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getExportJobsResponse() == null) ? 0 : getExportJobsResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportJobsResult == false)
            return false;
        GetExportJobsResult other = (GetExportJobsResult) obj;

        if (other.getExportJobsResponse() == null ^ this.getExportJobsResponse() == null)
            return false;
        if (other.getExportJobsResponse() != null
                && other.getExportJobsResponse().equals(this.getExportJobsResponse()) == false)
            return false;
        return true;
    }
}
