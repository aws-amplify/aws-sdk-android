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

package com.amazonaws.services.amazonsagemakerservice.model;

import java.io.Serializable;

/**
 * <p>
 * A configuration for a shuffle option for input data in a channel. If you use
 * <code>S3Prefix</code> for <code>S3DataType</code>, the results of the S3 key
 * prefix matches are shuffled. If you use <code>ManifestFile</code>, the order
 * of the S3 object references in the <code>ManifestFile</code> is shuffled. If
 * you use <code>AugmentedManifestFile</code>, the order of the JSON lines in
 * the <code>AugmentedManifestFile</code> is shuffled. The shuffling order is
 * determined using the <code>Seed</code> value.
 * </p>
 * <p>
 * For Pipe input mode, when <code>ShuffleConfig</code> is specified shuffling
 * is done at the start of every epoch. With large datasets, this ensures that
 * the order of the training data is different for each epoch, and it helps
 * reduce bias and possible overfitting. In a multi-node training job when
 * <code>ShuffleConfig</code> is combined with
 * <code>S3DataDistributionType</code> of <code>ShardedByS3Key</code>, the data
 * is shuffled across nodes so that the content sent to a particular node on the
 * first epoch might be sent to a different node on the second epoch.
 * </p>
 */
public class ShuffleConfig implements Serializable {
    /**
     * <p>
     * Determines the shuffling order in <code>ShuffleConfig</code> value.
     * </p>
     */
    private Long seed;

    /**
     * <p>
     * Determines the shuffling order in <code>ShuffleConfig</code> value.
     * </p>
     *
     * @return <p>
     *         Determines the shuffling order in <code>ShuffleConfig</code>
     *         value.
     *         </p>
     */
    public Long getSeed() {
        return seed;
    }

    /**
     * <p>
     * Determines the shuffling order in <code>ShuffleConfig</code> value.
     * </p>
     *
     * @param seed <p>
     *            Determines the shuffling order in <code>ShuffleConfig</code>
     *            value.
     *            </p>
     */
    public void setSeed(Long seed) {
        this.seed = seed;
    }

    /**
     * <p>
     * Determines the shuffling order in <code>ShuffleConfig</code> value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param seed <p>
     *            Determines the shuffling order in <code>ShuffleConfig</code>
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ShuffleConfig withSeed(Long seed) {
        this.seed = seed;
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
        if (getSeed() != null)
            sb.append("Seed: " + getSeed());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSeed() == null) ? 0 : getSeed().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShuffleConfig == false)
            return false;
        ShuffleConfig other = (ShuffleConfig) obj;

        if (other.getSeed() == null ^ this.getSeed() == null)
            return false;
        if (other.getSeed() != null && other.getSeed().equals(this.getSeed()) == false)
            return false;
        return true;
    }
}
