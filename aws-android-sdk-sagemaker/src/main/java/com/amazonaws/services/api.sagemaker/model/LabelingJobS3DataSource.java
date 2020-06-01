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
 * The Amazon S3 location of the input data objects.
 * </p>
 */
public class LabelingJobS3DataSource implements Serializable {
    /**
     * <p>
     * The Amazon S3 location of the manifest file that describes the input data
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     */
    private String manifestS3Uri;

    /**
     * <p>
     * The Amazon S3 location of the manifest file that describes the input data
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @return <p>
     *         The Amazon S3 location of the manifest file that describes the
     *         input data objects.
     *         </p>
     */
    public String getManifestS3Uri() {
        return manifestS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the manifest file that describes the input data
     * objects.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param manifestS3Uri <p>
     *            The Amazon S3 location of the manifest file that describes the
     *            input data objects.
     *            </p>
     */
    public void setManifestS3Uri(String manifestS3Uri) {
        this.manifestS3Uri = manifestS3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the manifest file that describes the input data
     * objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>^(https|s3)://([^/]+)/?(.*)$<br/>
     *
     * @param manifestS3Uri <p>
     *            The Amazon S3 location of the manifest file that describes the
     *            input data objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LabelingJobS3DataSource withManifestS3Uri(String manifestS3Uri) {
        this.manifestS3Uri = manifestS3Uri;
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
        if (getManifestS3Uri() != null)
            sb.append("ManifestS3Uri: " + getManifestS3Uri());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getManifestS3Uri() == null) ? 0 : getManifestS3Uri().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingJobS3DataSource == false)
            return false;
        LabelingJobS3DataSource other = (LabelingJobS3DataSource) obj;

        if (other.getManifestS3Uri() == null ^ this.getManifestS3Uri() == null)
            return false;
        if (other.getManifestS3Uri() != null
                && other.getManifestS3Uri().equals(this.getManifestS3Uri()) == false)
            return false;
        return true;
    }
}
