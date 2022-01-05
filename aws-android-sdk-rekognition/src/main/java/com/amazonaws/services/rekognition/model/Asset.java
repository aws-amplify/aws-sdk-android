/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Assets are the images that you use to train and evaluate a model version.
 * Assets can also contain validation information that you use to debug a failed
 * model training.
 * </p>
 */
public class Asset implements Serializable {
    /**
     * <p>
     * The S3 bucket that contains an Amazon Sagemaker Ground Truth format
     * manifest file.
     * </p>
     */
    private GroundTruthManifest groundTruthManifest;

    /**
     * <p>
     * The S3 bucket that contains an Amazon Sagemaker Ground Truth format
     * manifest file.
     * </p>
     *
     * @return <p>
     *         The S3 bucket that contains an Amazon Sagemaker Ground Truth
     *         format manifest file.
     *         </p>
     */
    public GroundTruthManifest getGroundTruthManifest() {
        return groundTruthManifest;
    }

    /**
     * <p>
     * The S3 bucket that contains an Amazon Sagemaker Ground Truth format
     * manifest file.
     * </p>
     *
     * @param groundTruthManifest <p>
     *            The S3 bucket that contains an Amazon Sagemaker Ground Truth
     *            format manifest file.
     *            </p>
     */
    public void setGroundTruthManifest(GroundTruthManifest groundTruthManifest) {
        this.groundTruthManifest = groundTruthManifest;
    }

    /**
     * <p>
     * The S3 bucket that contains an Amazon Sagemaker Ground Truth format
     * manifest file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groundTruthManifest <p>
     *            The S3 bucket that contains an Amazon Sagemaker Ground Truth
     *            format manifest file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Asset withGroundTruthManifest(GroundTruthManifest groundTruthManifest) {
        this.groundTruthManifest = groundTruthManifest;
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
        if (getGroundTruthManifest() != null)
            sb.append("GroundTruthManifest: " + getGroundTruthManifest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGroundTruthManifest() == null) ? 0 : getGroundTruthManifest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Asset == false)
            return false;
        Asset other = (Asset) obj;

        if (other.getGroundTruthManifest() == null ^ this.getGroundTruthManifest() == null)
            return false;
        if (other.getGroundTruthManifest() != null
                && other.getGroundTruthManifest().equals(this.getGroundTruthManifest()) == false)
            return false;
        return true;
    }
}
