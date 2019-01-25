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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The location of the OTA update.
 * </p>
 */
public class FileLocation implements Serializable {
    /**
     * <p>
     * The stream that contains the OTA update.
     * </p>
     */
    private Stream stream;

    /**
     * <p>
     * The location of the updated firmware in S3.
     * </p>
     */
    private S3Location s3Location;

    /**
     * <p>
     * The stream that contains the OTA update.
     * </p>
     *
     * @return <p>
     *         The stream that contains the OTA update.
     *         </p>
     */
    public Stream getStream() {
        return stream;
    }

    /**
     * <p>
     * The stream that contains the OTA update.
     * </p>
     *
     * @param stream <p>
     *            The stream that contains the OTA update.
     *            </p>
     */
    public void setStream(Stream stream) {
        this.stream = stream;
    }

    /**
     * <p>
     * The stream that contains the OTA update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stream <p>
     *            The stream that contains the OTA update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileLocation withStream(Stream stream) {
        this.stream = stream;
        return this;
    }

    /**
     * <p>
     * The location of the updated firmware in S3.
     * </p>
     *
     * @return <p>
     *         The location of the updated firmware in S3.
     *         </p>
     */
    public S3Location getS3Location() {
        return s3Location;
    }

    /**
     * <p>
     * The location of the updated firmware in S3.
     * </p>
     *
     * @param s3Location <p>
     *            The location of the updated firmware in S3.
     *            </p>
     */
    public void setS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The location of the updated firmware in S3.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Location <p>
     *            The location of the updated firmware in S3.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FileLocation withS3Location(S3Location s3Location) {
        this.s3Location = s3Location;
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
        if (getStream() != null)
            sb.append("stream: " + getStream() + ",");
        if (getS3Location() != null)
            sb.append("s3Location: " + getS3Location());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStream() == null) ? 0 : getStream().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileLocation == false)
            return false;
        FileLocation other = (FileLocation) obj;

        if (other.getStream() == null ^ this.getStream() == null)
            return false;
        if (other.getStream() != null && other.getStream().equals(this.getStream()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null
                && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        return true;
    }
}
