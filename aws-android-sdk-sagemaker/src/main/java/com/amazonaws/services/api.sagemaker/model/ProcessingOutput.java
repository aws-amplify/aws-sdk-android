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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the results of a processing job.
 * </p>
 */
public class ProcessingOutput implements Serializable {
    /**
     * <p>
     * The name for the processing job output.
     * </p>
     */
    private String outputName;

    /**
     * <p>
     * Configuration for processing job outputs in Amazon S3.
     * </p>
     */
    private ProcessingS3Output s3Output;

    /**
     * <p>
     * The name for the processing job output.
     * </p>
     *
     * @return <p>
     *         The name for the processing job output.
     *         </p>
     */
    public String getOutputName() {
        return outputName;
    }

    /**
     * <p>
     * The name for the processing job output.
     * </p>
     *
     * @param outputName <p>
     *            The name for the processing job output.
     *            </p>
     */
    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    /**
     * <p>
     * The name for the processing job output.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param outputName <p>
     *            The name for the processing job output.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingOutput withOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }

    /**
     * <p>
     * Configuration for processing job outputs in Amazon S3.
     * </p>
     *
     * @return <p>
     *         Configuration for processing job outputs in Amazon S3.
     *         </p>
     */
    public ProcessingS3Output getS3Output() {
        return s3Output;
    }

    /**
     * <p>
     * Configuration for processing job outputs in Amazon S3.
     * </p>
     *
     * @param s3Output <p>
     *            Configuration for processing job outputs in Amazon S3.
     *            </p>
     */
    public void setS3Output(ProcessingS3Output s3Output) {
        this.s3Output = s3Output;
    }

    /**
     * <p>
     * Configuration for processing job outputs in Amazon S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Output <p>
     *            Configuration for processing job outputs in Amazon S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProcessingOutput withS3Output(ProcessingS3Output s3Output) {
        this.s3Output = s3Output;
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
        if (getOutputName() != null)
            sb.append("OutputName: " + getOutputName() + ",");
        if (getS3Output() != null)
            sb.append("S3Output: " + getS3Output());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputName() == null) ? 0 : getOutputName().hashCode());
        hashCode = prime * hashCode + ((getS3Output() == null) ? 0 : getS3Output().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessingOutput == false)
            return false;
        ProcessingOutput other = (ProcessingOutput) obj;

        if (other.getOutputName() == null ^ this.getOutputName() == null)
            return false;
        if (other.getOutputName() != null
                && other.getOutputName().equals(this.getOutputName()) == false)
            return false;
        if (other.getS3Output() == null ^ this.getS3Output() == null)
            return false;
        if (other.getS3Output() != null && other.getS3Output().equals(this.getS3Output()) == false)
            return false;
        return true;
    }
}
