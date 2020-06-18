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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Settings associated with the destination. Will vary based on the type of
 * destination
 */
public class DestinationSettings implements Serializable {
    /**
     * Settings associated with S3 destination
     */
    private S3DestinationSettings s3Settings;

    /**
     * Settings associated with S3 destination
     *
     * @return Settings associated with S3 destination
     */
    public S3DestinationSettings getS3Settings() {
        return s3Settings;
    }

    /**
     * Settings associated with S3 destination
     *
     * @param s3Settings Settings associated with S3 destination
     */
    public void setS3Settings(S3DestinationSettings s3Settings) {
        this.s3Settings = s3Settings;
    }

    /**
     * Settings associated with S3 destination
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Settings Settings associated with S3 destination
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DestinationSettings withS3Settings(S3DestinationSettings s3Settings) {
        this.s3Settings = s3Settings;
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
        if (getS3Settings() != null)
            sb.append("S3Settings: " + getS3Settings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Settings() == null) ? 0 : getS3Settings().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationSettings == false)
            return false;
        DestinationSettings other = (DestinationSettings) obj;

        if (other.getS3Settings() == null ^ this.getS3Settings() == null)
            return false;
        if (other.getS3Settings() != null
                && other.getS3Settings().equals(this.getS3Settings()) == false)
            return false;
        return true;
    }
}
