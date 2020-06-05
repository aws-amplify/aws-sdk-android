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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

/**
 * <p>
 * The input configuration of a batch inference job.
 * </p>
 */
public class BatchInferenceJobInput implements Serializable {
    /**
     * <p>
     * The URI of the Amazon S3 location that contains your input data. The
     * Amazon S3 bucket must be in the same region as the API endpoint you are
     * calling.
     * </p>
     */
    private S3DataConfig s3DataSource;

    /**
     * <p>
     * The URI of the Amazon S3 location that contains your input data. The
     * Amazon S3 bucket must be in the same region as the API endpoint you are
     * calling.
     * </p>
     *
     * @return <p>
     *         The URI of the Amazon S3 location that contains your input data.
     *         The Amazon S3 bucket must be in the same region as the API
     *         endpoint you are calling.
     *         </p>
     */
    public S3DataConfig getS3DataSource() {
        return s3DataSource;
    }

    /**
     * <p>
     * The URI of the Amazon S3 location that contains your input data. The
     * Amazon S3 bucket must be in the same region as the API endpoint you are
     * calling.
     * </p>
     *
     * @param s3DataSource <p>
     *            The URI of the Amazon S3 location that contains your input
     *            data. The Amazon S3 bucket must be in the same region as the
     *            API endpoint you are calling.
     *            </p>
     */
    public void setS3DataSource(S3DataConfig s3DataSource) {
        this.s3DataSource = s3DataSource;
    }

    /**
     * <p>
     * The URI of the Amazon S3 location that contains your input data. The
     * Amazon S3 bucket must be in the same region as the API endpoint you are
     * calling.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3DataSource <p>
     *            The URI of the Amazon S3 location that contains your input
     *            data. The Amazon S3 bucket must be in the same region as the
     *            API endpoint you are calling.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchInferenceJobInput withS3DataSource(S3DataConfig s3DataSource) {
        this.s3DataSource = s3DataSource;
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
        if (getS3DataSource() != null)
            sb.append("s3DataSource: " + getS3DataSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3DataSource() == null) ? 0 : getS3DataSource().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchInferenceJobInput == false)
            return false;
        BatchInferenceJobInput other = (BatchInferenceJobInput) obj;

        if (other.getS3DataSource() == null ^ this.getS3DataSource() == null)
            return false;
        if (other.getS3DataSource() != null
                && other.getS3DataSource().equals(this.getS3DataSource()) == false)
            return false;
        return true;
    }
}
