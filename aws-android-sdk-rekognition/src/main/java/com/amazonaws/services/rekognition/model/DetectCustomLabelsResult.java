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

public class DetectCustomLabelsResult implements Serializable {
    /**
     * <p>
     * An array of custom labels detected in the input image.
     * </p>
     */
    private java.util.List<CustomLabel> customLabels;

    /**
     * <p>
     * An array of custom labels detected in the input image.
     * </p>
     *
     * @return <p>
     *         An array of custom labels detected in the input image.
     *         </p>
     */
    public java.util.List<CustomLabel> getCustomLabels() {
        return customLabels;
    }

    /**
     * <p>
     * An array of custom labels detected in the input image.
     * </p>
     *
     * @param customLabels <p>
     *            An array of custom labels detected in the input image.
     *            </p>
     */
    public void setCustomLabels(java.util.Collection<CustomLabel> customLabels) {
        if (customLabels == null) {
            this.customLabels = null;
            return;
        }

        this.customLabels = new java.util.ArrayList<CustomLabel>(customLabels);
    }

    /**
     * <p>
     * An array of custom labels detected in the input image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customLabels <p>
     *            An array of custom labels detected in the input image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectCustomLabelsResult withCustomLabels(CustomLabel... customLabels) {
        if (getCustomLabels() == null) {
            this.customLabels = new java.util.ArrayList<CustomLabel>(customLabels.length);
        }
        for (CustomLabel value : customLabels) {
            this.customLabels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of custom labels detected in the input image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param customLabels <p>
     *            An array of custom labels detected in the input image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectCustomLabelsResult withCustomLabels(java.util.Collection<CustomLabel> customLabels) {
        setCustomLabels(customLabels);
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
        if (getCustomLabels() != null)
            sb.append("CustomLabels: " + getCustomLabels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCustomLabels() == null) ? 0 : getCustomLabels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectCustomLabelsResult == false)
            return false;
        DetectCustomLabelsResult other = (DetectCustomLabelsResult) obj;

        if (other.getCustomLabels() == null ^ this.getCustomLabels() == null)
            return false;
        if (other.getCustomLabels() != null
                && other.getCustomLabels().equals(this.getCustomLabels()) == false)
            return false;
        return true;
    }
}
