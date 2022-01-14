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
 * The dataset used for testing. Optionally, if <code>AutoCreate</code> is set,
 * Amazon Rekognition Custom Labels uses the training dataset to create a test
 * dataset with a temporary split of the training dataset.
 * </p>
 */
public class TestingData implements Serializable {
    /**
     * <p>
     * The assets used for testing.
     * </p>
     */
    private java.util.List<Asset> assets;

    /**
     * <p>
     * If specified, Amazon Rekognition Custom Labels temporarily splits the
     * training dataset (80%) to create a test dataset (20%) for the training
     * job. After training completes, the test dataset is not stored and the
     * training dataset reverts to its previous size.
     * </p>
     */
    private Boolean autoCreate;

    /**
     * <p>
     * The assets used for testing.
     * </p>
     *
     * @return <p>
     *         The assets used for testing.
     *         </p>
     */
    public java.util.List<Asset> getAssets() {
        return assets;
    }

    /**
     * <p>
     * The assets used for testing.
     * </p>
     *
     * @param assets <p>
     *            The assets used for testing.
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
     * The assets used for testing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assets <p>
     *            The assets used for testing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestingData withAssets(Asset... assets) {
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
     * The assets used for testing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param assets <p>
     *            The assets used for testing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestingData withAssets(java.util.Collection<Asset> assets) {
        setAssets(assets);
        return this;
    }

    /**
     * <p>
     * If specified, Amazon Rekognition Custom Labels temporarily splits the
     * training dataset (80%) to create a test dataset (20%) for the training
     * job. After training completes, the test dataset is not stored and the
     * training dataset reverts to its previous size.
     * </p>
     *
     * @return <p>
     *         If specified, Amazon Rekognition Custom Labels temporarily splits
     *         the training dataset (80%) to create a test dataset (20%) for the
     *         training job. After training completes, the test dataset is not
     *         stored and the training dataset reverts to its previous size.
     *         </p>
     */
    public Boolean isAutoCreate() {
        return autoCreate;
    }

    /**
     * <p>
     * If specified, Amazon Rekognition Custom Labels temporarily splits the
     * training dataset (80%) to create a test dataset (20%) for the training
     * job. After training completes, the test dataset is not stored and the
     * training dataset reverts to its previous size.
     * </p>
     *
     * @return <p>
     *         If specified, Amazon Rekognition Custom Labels temporarily splits
     *         the training dataset (80%) to create a test dataset (20%) for the
     *         training job. After training completes, the test dataset is not
     *         stored and the training dataset reverts to its previous size.
     *         </p>
     */
    public Boolean getAutoCreate() {
        return autoCreate;
    }

    /**
     * <p>
     * If specified, Amazon Rekognition Custom Labels temporarily splits the
     * training dataset (80%) to create a test dataset (20%) for the training
     * job. After training completes, the test dataset is not stored and the
     * training dataset reverts to its previous size.
     * </p>
     *
     * @param autoCreate <p>
     *            If specified, Amazon Rekognition Custom Labels temporarily
     *            splits the training dataset (80%) to create a test dataset
     *            (20%) for the training job. After training completes, the test
     *            dataset is not stored and the training dataset reverts to its
     *            previous size.
     *            </p>
     */
    public void setAutoCreate(Boolean autoCreate) {
        this.autoCreate = autoCreate;
    }

    /**
     * <p>
     * If specified, Amazon Rekognition Custom Labels temporarily splits the
     * training dataset (80%) to create a test dataset (20%) for the training
     * job. After training completes, the test dataset is not stored and the
     * training dataset reverts to its previous size.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoCreate <p>
     *            If specified, Amazon Rekognition Custom Labels temporarily
     *            splits the training dataset (80%) to create a test dataset
     *            (20%) for the training job. After training completes, the test
     *            dataset is not stored and the training dataset reverts to its
     *            previous size.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TestingData withAutoCreate(Boolean autoCreate) {
        this.autoCreate = autoCreate;
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
            sb.append("Assets: " + getAssets() + ",");
        if (getAutoCreate() != null)
            sb.append("AutoCreate: " + getAutoCreate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssets() == null) ? 0 : getAssets().hashCode());
        hashCode = prime * hashCode + ((getAutoCreate() == null) ? 0 : getAutoCreate().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestingData == false)
            return false;
        TestingData other = (TestingData) obj;

        if (other.getAssets() == null ^ this.getAssets() == null)
            return false;
        if (other.getAssets() != null && other.getAssets().equals(this.getAssets()) == false)
            return false;
        if (other.getAutoCreate() == null ^ this.getAutoCreate() == null)
            return false;
        if (other.getAutoCreate() != null
                && other.getAutoCreate().equals(this.getAutoCreate()) == false)
            return false;
        return true;
    }
}
