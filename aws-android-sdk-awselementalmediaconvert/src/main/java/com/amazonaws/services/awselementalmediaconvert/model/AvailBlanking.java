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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Settings for Avail Blanking
 */
public class AvailBlanking implements Serializable {
    /**
     * Blanking image to be used. Leave empty for solid black. Only bmp and png
     * images are supported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(bmp|BMP|png|PNG))|(https?://(.*?)\.(bmp|BMP
     * |png|PNG)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     */
    private String availBlankingImage;

    /**
     * Blanking image to be used. Leave empty for solid black. Only bmp and png
     * images are supported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(bmp|BMP|png|PNG))|(https?://(.*?)\.(bmp|BMP
     * |png|PNG)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @return Blanking image to be used. Leave empty for solid black. Only bmp
     *         and png images are supported.
     */
    public String getAvailBlankingImage() {
        return availBlankingImage;
    }

    /**
     * Blanking image to be used. Leave empty for solid black. Only bmp and png
     * images are supported.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(bmp|BMP|png|PNG))|(https?://(.*?)\.(bmp|BMP
     * |png|PNG)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @param availBlankingImage Blanking image to be used. Leave empty for
     *            solid black. Only bmp and png images are supported.
     */
    public void setAvailBlankingImage(String availBlankingImage) {
        this.availBlankingImage = availBlankingImage;
    }

    /**
     * Blanking image to be used. Leave empty for solid black. Only bmp and png
     * images are supported.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>14 - <br/>
     * <b>Pattern:
     * </b>^((s3://(.*?)\.(bmp|BMP|png|PNG))|(https?://(.*?)\.(bmp|BMP
     * |png|PNG)(\?([^&=]+=[^&]+&)*[^&=]+=[^&]+)?))$<br/>
     *
     * @param availBlankingImage Blanking image to be used. Leave empty for
     *            solid black. Only bmp and png images are supported.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AvailBlanking withAvailBlankingImage(String availBlankingImage) {
        this.availBlankingImage = availBlankingImage;
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
        if (getAvailBlankingImage() != null)
            sb.append("AvailBlankingImage: " + getAvailBlankingImage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAvailBlankingImage() == null) ? 0 : getAvailBlankingImage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AvailBlanking == false)
            return false;
        AvailBlanking other = (AvailBlanking) obj;

        if (other.getAvailBlankingImage() == null ^ this.getAvailBlankingImage() == null)
            return false;
        if (other.getAvailBlankingImage() != null
                && other.getAvailBlankingImage().equals(this.getAvailBlankingImage()) == false)
            return false;
        return true;
    }
}
