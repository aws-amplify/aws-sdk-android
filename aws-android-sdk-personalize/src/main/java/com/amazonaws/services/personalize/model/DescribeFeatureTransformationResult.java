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

package com.amazonaws.services.personalize.model;

import java.io.Serializable;

public class DescribeFeatureTransformationResult implements Serializable {
    /**
     * <p>
     * A listing of the FeatureTransformation properties.
     * </p>
     */
    private FeatureTransformation featureTransformation;

    /**
     * <p>
     * A listing of the FeatureTransformation properties.
     * </p>
     *
     * @return <p>
     *         A listing of the FeatureTransformation properties.
     *         </p>
     */
    public FeatureTransformation getFeatureTransformation() {
        return featureTransformation;
    }

    /**
     * <p>
     * A listing of the FeatureTransformation properties.
     * </p>
     *
     * @param featureTransformation <p>
     *            A listing of the FeatureTransformation properties.
     *            </p>
     */
    public void setFeatureTransformation(FeatureTransformation featureTransformation) {
        this.featureTransformation = featureTransformation;
    }

    /**
     * <p>
     * A listing of the FeatureTransformation properties.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param featureTransformation <p>
     *            A listing of the FeatureTransformation properties.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFeatureTransformationResult withFeatureTransformation(
            FeatureTransformation featureTransformation) {
        this.featureTransformation = featureTransformation;
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
        if (getFeatureTransformation() != null)
            sb.append("featureTransformation: " + getFeatureTransformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getFeatureTransformation() == null) ? 0 : getFeatureTransformation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFeatureTransformationResult == false)
            return false;
        DescribeFeatureTransformationResult other = (DescribeFeatureTransformationResult) obj;

        if (other.getFeatureTransformation() == null ^ this.getFeatureTransformation() == null)
            return false;
        if (other.getFeatureTransformation() != null
                && other.getFeatureTransformation().equals(this.getFeatureTransformation()) == false)
            return false;
        return true;
    }
}
