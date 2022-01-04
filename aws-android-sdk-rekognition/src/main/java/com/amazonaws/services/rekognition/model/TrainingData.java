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
 * The dataset used for training.
 * </p>
 */
public class TrainingData implements Serializable {
    /**
     * <p>
     * A Sagemaker GroundTruth manifest file that contains the training images
     * (assets).
     * </p>
     */
    private java.util.List<Asset> assets;

    /**
     * <p>
     * A Sagemaker GroundTruth manifest file that contains the training images
     * (assets).
     * </p>
     *
     * @return <p>
     *         A Sagemaker GroundTruth manifest file that contains the training
     *         images (assets).
     *         </p>
     */
    public java.util.List<Asset> getAssets() {
        return assets;
    }

    /**
     * <p>
     * A Sagemaker GroundTruth manifest file that contains the training images
     * (assets).
     * </p>
     *
     * @param assets <p>
     *            A Sagemaker GroundTruth manifest file that contains the
     *            training images (assets).
     *            </p>
     */
    public void setAssets(java.util.Collection<Asset> assets) {
        if (assets == null) {
            this.assets = null;
            return;
        }

        this.assets = new java.util.ArrayList<Asset>(assets);
    }

    /**
     * <p>
     * A Sagemaker GroundTruth manifest file that contains the training images
     * (assets).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assets <p>
     *            A Sagemaker GroundTruth manifest file that contains the
     *            training images (assets).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingData withAssets(Asset... assets) {
        if (getAssets() == null) {
            this.assets = new java.util.ArrayList<Asset>(assets.length);
        }
        for (Asset value : assets) {
            this.assets.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A Sagemaker GroundTruth manifest file that contains the training images
     * (assets).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assets <p>
     *            A Sagemaker GroundTruth manifest file that contains the
     *            training images (assets).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TrainingData withAssets(java.util.Collection<Asset> assets) {
        setAssets(assets);
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
        if (getAssets() != null)
            sb.append("Assets: " + getAssets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssets() == null) ? 0 : getAssets().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingData == false)
            return false;
        TrainingData other = (TrainingData) obj;

        if (other.getAssets() == null ^ this.getAssets() == null)
            return false;
        if (other.getAssets() != null && other.getAssets().equals(this.getAssets()) == false)
            return false;
        return true;
    }
}
