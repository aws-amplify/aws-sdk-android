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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the location where the restore job's output is stored.
 * </p>
 */
public class OutputLocation implements Serializable {
    /**
     * <p>
     * Describes an S3 location that will receive the results of the restore
     * request.
     * </p>
     */
    private S3Location s3;

    /**
     * <p>
     * Describes an S3 location that will receive the results of the restore
     * request.
     * </p>
     *
     * @return <p>
     *         Describes an S3 location that will receive the results of the
     *         restore request.
     *         </p>
     */
    public S3Location getS3() {
        return s3;
    }

    /**
     * <p>
     * Describes an S3 location that will receive the results of the restore
     * request.
     * </p>
     *
     * @param s3 <p>
     *            Describes an S3 location that will receive the results of the
     *            restore request.
     *            </p>
     */
    public void setS3(S3Location s3) {
        this.s3 = s3;
    }

    /**
     * <p>
     * Describes an S3 location that will receive the results of the restore
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3 <p>
     *            Describes an S3 location that will receive the results of the
     *            restore request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputLocation withS3(S3Location s3) {
        this.s3 = s3;
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
        if (getS3() != null)
            sb.append("S3: " + getS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3() == null) ? 0 : getS3().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputLocation == false)
            return false;
        OutputLocation other = (OutputLocation) obj;

        if (other.getS3() == null ^ this.getS3() == null)
            return false;
        if (other.getS3() != null && other.getS3().equals(this.getS3()) == false)
            return false;
        return true;
    }
}
