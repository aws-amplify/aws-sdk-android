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

public class GetImportJobResult implements Serializable {
    /**
     * <p>
     * Provides information about the status and settings of a job that imports
     * endpoint definitions from one or more files. The files can be stored in
     * an Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly
     * from a computer by using the Amazon Pinpoint console.
     * </p>
     */
    private ImportJobResponse importJobResponse;

    /**
     * <p>
     * Provides information about the status and settings of a job that imports
     * endpoint definitions from one or more files. The files can be stored in
     * an Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly
     * from a computer by using the Amazon Pinpoint console.
     * </p>
     *
     * @return <p>
     *         Provides information about the status and settings of a job that
     *         imports endpoint definitions from one or more files. The files
     *         can be stored in an Amazon Simple Storage Service (Amazon S3)
     *         bucket or uploaded directly from a computer by using the Amazon
     *         Pinpoint console.
     *         </p>
     */
    public ImportJobResponse getImportJobResponse() {
        return importJobResponse;
    }

    /**
     * <p>
     * Provides information about the status and settings of a job that imports
     * endpoint definitions from one or more files. The files can be stored in
     * an Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly
     * from a computer by using the Amazon Pinpoint console.
     * </p>
     *
     * @param importJobResponse <p>
     *            Provides information about the status and settings of a job
     *            that imports endpoint definitions from one or more files. The
     *            files can be stored in an Amazon Simple Storage Service
     *            (Amazon S3) bucket or uploaded directly from a computer by
     *            using the Amazon Pinpoint console.
     *            </p>
     */
    public void setImportJobResponse(ImportJobResponse importJobResponse) {
        this.importJobResponse = importJobResponse;
    }

    /**
     * <p>
     * Provides information about the status and settings of a job that imports
     * endpoint definitions from one or more files. The files can be stored in
     * an Amazon Simple Storage Service (Amazon S3) bucket or uploaded directly
     * from a computer by using the Amazon Pinpoint console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param importJobResponse <p>
     *            Provides information about the status and settings of a job
     *            that imports endpoint definitions from one or more files. The
     *            files can be stored in an Amazon Simple Storage Service
     *            (Amazon S3) bucket or uploaded directly from a computer by
     *            using the Amazon Pinpoint console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImportJobResult withImportJobResponse(ImportJobResponse importJobResponse) {
        this.importJobResponse = importJobResponse;
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
        if (getImportJobResponse() != null)
            sb.append("ImportJobResponse: " + getImportJobResponse());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImportJobResponse() == null) ? 0 : getImportJobResponse().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImportJobResult == false)
            return false;
        GetImportJobResult other = (GetImportJobResult) obj;

        if (other.getImportJobResponse() == null ^ this.getImportJobResponse() == null)
            return false;
        if (other.getImportJobResponse() != null
                && other.getImportJobResponse().equals(this.getImportJobResponse()) == false)
            return false;
        return true;
    }
}
