/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Settings for the IMAGE_PROPERTIES feature type.
 * </p>
 */
public class DetectLabelsImagePropertiesSettings implements Serializable {
    /**
     * <p>
     * The maximum number of dominant colors to return when detecting labels in
     * an image. The default value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     */
    private Integer maxDominantColors;

    /**
     * <p>
     * The maximum number of dominant colors to return when detecting labels in
     * an image. The default value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     *
     * @return <p>
     *         The maximum number of dominant colors to return when detecting
     *         labels in an image. The default value is 10.
     *         </p>
     */
    public Integer getMaxDominantColors() {
        return maxDominantColors;
    }

    /**
     * <p>
     * The maximum number of dominant colors to return when detecting labels in
     * an image. The default value is 10.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     *
     * @param maxDominantColors <p>
     *            The maximum number of dominant colors to return when detecting
     *            labels in an image. The default value is 10.
     *            </p>
     */
    public void setMaxDominantColors(Integer maxDominantColors) {
        this.maxDominantColors = maxDominantColors;
    }

    /**
     * <p>
     * The maximum number of dominant colors to return when detecting labels in
     * an image. The default value is 10.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 20<br/>
     *
     * @param maxDominantColors <p>
     *            The maximum number of dominant colors to return when detecting
     *            labels in an image. The default value is 10.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetectLabelsImagePropertiesSettings withMaxDominantColors(Integer maxDominantColors) {
        this.maxDominantColors = maxDominantColors;
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
        if (getMaxDominantColors() != null)
            sb.append("MaxDominantColors: " + getMaxDominantColors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaxDominantColors() == null) ? 0 : getMaxDominantColors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectLabelsImagePropertiesSettings == false)
            return false;
        DetectLabelsImagePropertiesSettings other = (DetectLabelsImagePropertiesSettings) obj;

        if (other.getMaxDominantColors() == null ^ this.getMaxDominantColors() == null)
            return false;
        if (other.getMaxDominantColors() != null
                && other.getMaxDominantColors().equals(this.getMaxDominantColors()) == false)
            return false;
        return true;
    }
}
