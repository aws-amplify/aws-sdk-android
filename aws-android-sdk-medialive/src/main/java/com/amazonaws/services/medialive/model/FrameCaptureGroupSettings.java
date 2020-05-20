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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Frame Capture Group Settings
 */
public class FrameCaptureGroupSettings implements Serializable {
    /**
     * The destination for the frame capture files. Either the URI for an Amazon
     * S3 bucket and object, plus a file name prefix (for example,
     * s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a
     * MediaStore container, plus a file name prefix (for example,
     * mediastoressl://sportsDelivery/20180820/curling_). The final file names
     * consist of the prefix from the destination field (for example,
     * "curling_") + name modifier + the counter (5 digits, starting from 00001)
     * + extension (which is always .jpg). For example, curlingLow.00001.jpg
     */
    private OutputLocationRef destination;

    /**
     * The destination for the frame capture files. Either the URI for an Amazon
     * S3 bucket and object, plus a file name prefix (for example,
     * s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a
     * MediaStore container, plus a file name prefix (for example,
     * mediastoressl://sportsDelivery/20180820/curling_). The final file names
     * consist of the prefix from the destination field (for example,
     * "curling_") + name modifier + the counter (5 digits, starting from 00001)
     * + extension (which is always .jpg). For example, curlingLow.00001.jpg
     *
     * @return The destination for the frame capture files. Either the URI for
     *         an Amazon S3 bucket and object, plus a file name prefix (for
     *         example, s3ssl://sportsDelivery/highlights/20180820/curling_) or
     *         the URI for a MediaStore container, plus a file name prefix (for
     *         example, mediastoressl://sportsDelivery/20180820/curling_). The
     *         final file names consist of the prefix from the destination field
     *         (for example, "curling_") + name modifier + the counter (5
     *         digits, starting from 00001) + extension (which is always .jpg).
     *         For example, curlingLow.00001.jpg
     */
    public OutputLocationRef getDestination() {
        return destination;
    }

    /**
     * The destination for the frame capture files. Either the URI for an Amazon
     * S3 bucket and object, plus a file name prefix (for example,
     * s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a
     * MediaStore container, plus a file name prefix (for example,
     * mediastoressl://sportsDelivery/20180820/curling_). The final file names
     * consist of the prefix from the destination field (for example,
     * "curling_") + name modifier + the counter (5 digits, starting from 00001)
     * + extension (which is always .jpg). For example, curlingLow.00001.jpg
     *
     * @param destination The destination for the frame capture files. Either
     *            the URI for an Amazon S3 bucket and object, plus a file name
     *            prefix (for example,
     *            s3ssl://sportsDelivery/highlights/20180820/curling_) or the
     *            URI for a MediaStore container, plus a file name prefix (for
     *            example, mediastoressl://sportsDelivery/20180820/curling_).
     *            The final file names consist of the prefix from the
     *            destination field (for example, "curling_") + name modifier +
     *            the counter (5 digits, starting from 00001) + extension (which
     *            is always .jpg). For example, curlingLow.00001.jpg
     */
    public void setDestination(OutputLocationRef destination) {
        this.destination = destination;
    }

    /**
     * The destination for the frame capture files. Either the URI for an Amazon
     * S3 bucket and object, plus a file name prefix (for example,
     * s3ssl://sportsDelivery/highlights/20180820/curling_) or the URI for a
     * MediaStore container, plus a file name prefix (for example,
     * mediastoressl://sportsDelivery/20180820/curling_). The final file names
     * consist of the prefix from the destination field (for example,
     * "curling_") + name modifier + the counter (5 digits, starting from 00001)
     * + extension (which is always .jpg). For example, curlingLow.00001.jpg
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination The destination for the frame capture files. Either
     *            the URI for an Amazon S3 bucket and object, plus a file name
     *            prefix (for example,
     *            s3ssl://sportsDelivery/highlights/20180820/curling_) or the
     *            URI for a MediaStore container, plus a file name prefix (for
     *            example, mediastoressl://sportsDelivery/20180820/curling_).
     *            The final file names consist of the prefix from the
     *            destination field (for example, "curling_") + name modifier +
     *            the counter (5 digits, starting from 00001) + extension (which
     *            is always .jpg). For example, curlingLow.00001.jpg
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FrameCaptureGroupSettings withDestination(OutputLocationRef destination) {
        this.destination = destination;
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
        if (getDestination() != null)
            sb.append("Destination: " + getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FrameCaptureGroupSettings == false)
            return false;
        FrameCaptureGroupSettings other = (FrameCaptureGroupSettings) obj;

        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }
}
