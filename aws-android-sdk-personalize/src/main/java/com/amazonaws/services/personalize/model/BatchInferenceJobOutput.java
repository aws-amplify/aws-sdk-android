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
 * The output configuration parameters of a batch inference job.
 * </p>
 */
public class BatchInferenceJobOutput implements Serializable {
    /**
     * <p>
     * Information on the Amazon S3 bucket in which the batch inference job's
     * output is stored.
     * </p>
     */
    private S3DataConfig s3DataDestination;

    /**
     * <p>
     * Information on the Amazon S3 bucket in which the batch inference job's
     * output is stored.
     * </p>
     *
     * @return <p>
     *         Information on the Amazon S3 bucket in which the batch inference
     *         job's output is stored.
     *         </p>
     */
    public S3DataConfig getS3DataDestination() {
        return s3DataDestination;
    }

    /**
     * <p>
     * Information on the Amazon S3 bucket in which the batch inference job's
     * output is stored.
     * </p>
     *
     * @param s3DataDestination <p>
     *            Information on the Amazon S3 bucket in which the batch
     *            inference job's output is stored.
     *            </p>
     */
    public void setS3DataDestination(S3DataConfig s3DataDestination) {
        this.s3DataDestination = s3DataDestination;
    }

    /**
     * <p>
     * Information on the Amazon S3 bucket in which the batch inference job's
     * output is stored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3DataDestination <p>
     *            Information on the Amazon S3 bucket in which the batch
     *            inference job's output is stored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchInferenceJobOutput withS3DataDestination(S3DataConfig s3DataDestination) {
        this.s3DataDestination = s3DataDestination;
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
        if (getS3DataDestination() != null)
            sb.append("s3DataDestination: " + getS3DataDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3DataDestination() == null) ? 0 : getS3DataDestination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchInferenceJobOutput == false)
            return false;
        BatchInferenceJobOutput other = (BatchInferenceJobOutput) obj;

        if (other.getS3DataDestination() == null ^ this.getS3DataDestination() == null)
            return false;
        if (other.getS3DataDestination() != null
                && other.getS3DataDestination().equals(this.getS3DataDestination()) == false)
            return false;
        return true;
    }
}
