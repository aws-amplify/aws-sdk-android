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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

/**
 * <p>
 * Video file stored in an Amazon S3 bucket. Amazon Rekognition video start
 * operations such as use <code>Video</code> to specify a video for analysis.
 * The supported file formats are .mp4, .mov and .avi.
 * </p>
 */
public class Video implements Serializable {
    /**
     * <p>
     * The Amazon S3 bucket name and file name for the video.
     * </p>
     */
    private S3Object s3Object;

    /**
     * <p>
     * The Amazon S3 bucket name and file name for the video.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket name and file name for the video.
     *         </p>
     */
    public S3Object getS3Object() {
        return s3Object;
    }

    /**
     * <p>
     * The Amazon S3 bucket name and file name for the video.
     * </p>
     *
     * @param s3Object <p>
     *            The Amazon S3 bucket name and file name for the video.
     *            </p>
     */
    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * <p>
     * The Amazon S3 bucket name and file name for the video.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Object <p>
     *            The Amazon S3 bucket name and file name for the video.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Video withS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
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
        if (getS3Object() != null)
            sb.append("S3Object: " + getS3Object());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Video == false)
            return false;
        Video other = (Video) obj;

        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        return true;
    }
}
