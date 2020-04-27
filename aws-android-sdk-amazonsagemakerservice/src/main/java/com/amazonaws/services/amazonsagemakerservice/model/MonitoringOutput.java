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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * The output object for a monitoring job.
 * </p>
 */
public class MonitoringOutput implements Serializable {
    /**
     * <p>
     * The Amazon S3 storage location where the results of a monitoring job are
     * saved.
     * </p>
     */
    private MonitoringS3Output s3Output;

    /**
     * <p>
     * The Amazon S3 storage location where the results of a monitoring job are
     * saved.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 storage location where the results of a monitoring
     *         job are saved.
     *         </p>
     */
    public MonitoringS3Output getS3Output() {
        return s3Output;
    }

    /**
     * <p>
     * The Amazon S3 storage location where the results of a monitoring job are
     * saved.
     * </p>
     *
     * @param s3Output <p>
     *            The Amazon S3 storage location where the results of a
     *            monitoring job are saved.
     *            </p>
     */
    public void setS3Output(MonitoringS3Output s3Output) {
        this.s3Output = s3Output;
    }

    /**
     * <p>
     * The Amazon S3 storage location where the results of a monitoring job are
     * saved.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Output <p>
     *            The Amazon S3 storage location where the results of a
     *            monitoring job are saved.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MonitoringOutput withS3Output(MonitoringS3Output s3Output) {
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
        if (getS3Output() != null)
            sb.append("S3Output: " + getS3Output());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Output() == null) ? 0 : getS3Output().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringOutput == false)
            return false;
        MonitoringOutput other = (MonitoringOutput) obj;

        if (other.getS3Output() == null ^ this.getS3Output() == null)
            return false;
        if (other.getS3Output() != null && other.getS3Output().equals(this.getS3Output()) == false)
            return false;
        return true;
    }
}
