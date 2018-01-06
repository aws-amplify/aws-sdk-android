/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Identifies face image brightness and sharpness.
 * </p>
 */
public class ImageQuality implements Serializable {
    /**
     * <p>
     * Value representing brightness of the face. The service returns a value
     * between 0 and 100 (inclusive). A higher value indicates a brighter face
     * image.
     * </p>
     */
    private Float brightness;

    /**
     * <p>
     * Value representing sharpness of the face. The service returns a value
     * between 0 and 100 (inclusive). A higher value indicates a sharper face
     * image.
     * </p>
     */
    private Float sharpness;

    /**
     * <p>
     * Value representing brightness of the face. The service returns a value
     * between 0 and 100 (inclusive). A higher value indicates a brighter face
     * image.
     * </p>
     *
     * @return <p>
     *         Value representing brightness of the face. The service returns a
     *         value between 0 and 100 (inclusive). A higher value indicates a
     *         brighter face image.
     *         </p>
     */
    public Float getBrightness() {
        return brightness;
    }

    /**
     * <p>
     * Value representing brightness of the face. The service returns a value
     * between 0 and 100 (inclusive). A higher value indicates a brighter face
     * image.
     * </p>
     *
     * @param brightness <p>
     *            Value representing brightness of the face. The service returns
     *            a value between 0 and 100 (inclusive). A higher value
     *            indicates a brighter face image.
     *            </p>
     */
    public void setBrightness(Float brightness) {
        this.brightness = brightness;
    }

    /**
     * <p>
     * Value representing brightness of the face. The service returns a value
     * between 0 and 100 (inclusive). A higher value indicates a brighter face
     * image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param brightness <p>
     *            Value representing brightness of the face. The service returns
     *            a value between 0 and 100 (inclusive). A higher value
     *            indicates a brighter face image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageQuality withBrightness(Float brightness) {
        this.brightness = brightness;
        return this;
    }

    /**
     * <p>
     * Value representing sharpness of the face. The service returns a value
     * between 0 and 100 (inclusive). A higher value indicates a sharper face
     * image.
     * </p>
     *
     * @return <p>
     *         Value representing sharpness of the face. The service returns a
     *         value between 0 and 100 (inclusive). A higher value indicates a
     *         sharper face image.
     *         </p>
     */
    public Float getSharpness() {
        return sharpness;
    }

    /**
     * <p>
     * Value representing sharpness of the face. The service returns a value
     * between 0 and 100 (inclusive). A higher value indicates a sharper face
     * image.
     * </p>
     *
     * @param sharpness <p>
     *            Value representing sharpness of the face. The service returns
     *            a value between 0 and 100 (inclusive). A higher value
     *            indicates a sharper face image.
     *            </p>
     */
    public void setSharpness(Float sharpness) {
        this.sharpness = sharpness;
    }

    /**
     * <p>
     * Value representing sharpness of the face. The service returns a value
     * between 0 and 100 (inclusive). A higher value indicates a sharper face
     * image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sharpness <p>
     *            Value representing sharpness of the face. The service returns
     *            a value between 0 and 100 (inclusive). A higher value
     *            indicates a sharper face image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageQuality withSharpness(Float sharpness) {
        this.sharpness = sharpness;
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
        if (getBrightness() != null)
            sb.append("Brightness: " + getBrightness() + ",");
        if (getSharpness() != null)
            sb.append("Sharpness: " + getSharpness());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrightness() == null) ? 0 : getBrightness().hashCode());
        hashCode = prime * hashCode + ((getSharpness() == null) ? 0 : getSharpness().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageQuality == false)
            return false;
        ImageQuality other = (ImageQuality) obj;

        if (other.getBrightness() == null ^ this.getBrightness() == null)
            return false;
        if (other.getBrightness() != null
                && other.getBrightness().equals(this.getBrightness()) == false)
            return false;
        if (other.getSharpness() == null ^ this.getSharpness() == null)
            return false;
        if (other.getSharpness() != null
                && other.getSharpness().equals(this.getSharpness()) == false)
            return false;
        return true;
    }
}
