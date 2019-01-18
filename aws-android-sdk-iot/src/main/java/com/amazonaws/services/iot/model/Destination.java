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
 * Describes the location of the updated firmware.
 * </p>
 */
public class Destination implements Serializable {
    /**
     * <p>
     * Describes the location in S3 of the updated firmware.
     * </p>
     */
    private S3Destination s3Destination;

    /**
     * <p>
     * Describes the location in S3 of the updated firmware.
     * </p>
     *
     * @return <p>
     *         Describes the location in S3 of the updated firmware.
     *         </p>
     */
    public S3Destination getS3Destination() {
        return s3Destination;
    }

    /**
     * <p>
     * Describes the location in S3 of the updated firmware.
     * </p>
     *
     * @param s3Destination <p>
     *            Describes the location in S3 of the updated firmware.
     *            </p>
     */
    public void setS3Destination(S3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * <p>
     * Describes the location in S3 of the updated firmware.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Destination <p>
     *            Describes the location in S3 of the updated firmware.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Destination withS3Destination(S3Destination s3Destination) {
        this.s3Destination = s3Destination;
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
        if (getS3Destination() != null)
            sb.append("s3Destination: " + getS3Destination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Destination == false)
            return false;
        Destination other = (Destination) obj;

        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null
                && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        return true;
    }
}
