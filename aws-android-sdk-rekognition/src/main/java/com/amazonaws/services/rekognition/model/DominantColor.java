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
 * A description of the dominant colors in an image.
 * </p>
 */
public class DominantColor implements Serializable {
    /**
     * <p>
     * The Red RGB value for a dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer red;

    /**
     * <p>
     * The Blue RGB value for a dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer blue;

    /**
     * <p>
     * The Green RGB value for a dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer green;

    /**
     * <p>
     * The Hex code equivalent of the RGB values for a dominant color.
     * </p>
     */
    private String hexCode;

    /**
     * <p>
     * The CSS color name of a dominant color.
     * </p>
     */
    private String cSSColor;

    /**
     * <p>
     * One of 12 simplified color names applied to a dominant color.
     * </p>
     */
    private String simplifiedColor;

    /**
     * <p>
     * The percentage of image pixels that have a given dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float pixelPercent;

    /**
     * <p>
     * The Red RGB value for a dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The Red RGB value for a dominant color.
     *         </p>
     */
    public Integer getRed() {
        return red;
    }

    /**
     * <p>
     * The Red RGB value for a dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param red <p>
     *            The Red RGB value for a dominant color.
     *            </p>
     */
    public void setRed(Integer red) {
        this.red = red;
    }

    /**
     * <p>
     * The Red RGB value for a dominant color.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param red <p>
     *            The Red RGB value for a dominant color.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DominantColor withRed(Integer red) {
        this.red = red;
        return this;
    }

    /**
     * <p>
     * The Blue RGB value for a dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The Blue RGB value for a dominant color.
     *         </p>
     */
    public Integer getBlue() {
        return blue;
    }

    /**
     * <p>
     * The Blue RGB value for a dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param blue <p>
     *            The Blue RGB value for a dominant color.
     *            </p>
     */
    public void setBlue(Integer blue) {
        this.blue = blue;
    }

    /**
     * <p>
     * The Blue RGB value for a dominant color.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param blue <p>
     *            The Blue RGB value for a dominant color.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DominantColor withBlue(Integer blue) {
        this.blue = blue;
        return this;
    }

    /**
     * <p>
     * The Green RGB value for a dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The Green RGB value for a dominant color.
     *         </p>
     */
    public Integer getGreen() {
        return green;
    }

    /**
     * <p>
     * The Green RGB value for a dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param green <p>
     *            The Green RGB value for a dominant color.
     *            </p>
     */
    public void setGreen(Integer green) {
        this.green = green;
    }

    /**
     * <p>
     * The Green RGB value for a dominant color.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param green <p>
     *            The Green RGB value for a dominant color.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DominantColor withGreen(Integer green) {
        this.green = green;
        return this;
    }

    /**
     * <p>
     * The Hex code equivalent of the RGB values for a dominant color.
     * </p>
     *
     * @return <p>
     *         The Hex code equivalent of the RGB values for a dominant color.
     *         </p>
     */
    public String getHexCode() {
        return hexCode;
    }

    /**
     * <p>
     * The Hex code equivalent of the RGB values for a dominant color.
     * </p>
     *
     * @param hexCode <p>
     *            The Hex code equivalent of the RGB values for a dominant
     *            color.
     *            </p>
     */
    public void setHexCode(String hexCode) {
        this.hexCode = hexCode;
    }

    /**
     * <p>
     * The Hex code equivalent of the RGB values for a dominant color.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hexCode <p>
     *            The Hex code equivalent of the RGB values for a dominant
     *            color.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DominantColor withHexCode(String hexCode) {
        this.hexCode = hexCode;
        return this;
    }

    /**
     * <p>
     * The CSS color name of a dominant color.
     * </p>
     *
     * @return <p>
     *         The CSS color name of a dominant color.
     *         </p>
     */
    public String getCSSColor() {
        return cSSColor;
    }

    /**
     * <p>
     * The CSS color name of a dominant color.
     * </p>
     *
     * @param cSSColor <p>
     *            The CSS color name of a dominant color.
     *            </p>
     */
    public void setCSSColor(String cSSColor) {
        this.cSSColor = cSSColor;
    }

    /**
     * <p>
     * The CSS color name of a dominant color.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cSSColor <p>
     *            The CSS color name of a dominant color.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DominantColor withCSSColor(String cSSColor) {
        this.cSSColor = cSSColor;
        return this;
    }

    /**
     * <p>
     * One of 12 simplified color names applied to a dominant color.
     * </p>
     *
     * @return <p>
     *         One of 12 simplified color names applied to a dominant color.
     *         </p>
     */
    public String getSimplifiedColor() {
        return simplifiedColor;
    }

    /**
     * <p>
     * One of 12 simplified color names applied to a dominant color.
     * </p>
     *
     * @param simplifiedColor <p>
     *            One of 12 simplified color names applied to a dominant color.
     *            </p>
     */
    public void setSimplifiedColor(String simplifiedColor) {
        this.simplifiedColor = simplifiedColor;
    }

    /**
     * <p>
     * One of 12 simplified color names applied to a dominant color.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param simplifiedColor <p>
     *            One of 12 simplified color names applied to a dominant color.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DominantColor withSimplifiedColor(String simplifiedColor) {
        this.simplifiedColor = simplifiedColor;
        return this;
    }

    /**
     * <p>
     * The percentage of image pixels that have a given dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         The percentage of image pixels that have a given dominant color.
     *         </p>
     */
    public Float getPixelPercent() {
        return pixelPercent;
    }

    /**
     * <p>
     * The percentage of image pixels that have a given dominant color.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param pixelPercent <p>
     *            The percentage of image pixels that have a given dominant
     *            color.
     *            </p>
     */
    public void setPixelPercent(Float pixelPercent) {
        this.pixelPercent = pixelPercent;
    }

    /**
     * <p>
     * The percentage of image pixels that have a given dominant color.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param pixelPercent <p>
     *            The percentage of image pixels that have a given dominant
     *            color.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DominantColor withPixelPercent(Float pixelPercent) {
        this.pixelPercent = pixelPercent;
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
        if (getRed() != null)
            sb.append("Red: " + getRed() + ",");
        if (getBlue() != null)
            sb.append("Blue: " + getBlue() + ",");
        if (getGreen() != null)
            sb.append("Green: " + getGreen() + ",");
        if (getHexCode() != null)
            sb.append("HexCode: " + getHexCode() + ",");
        if (getCSSColor() != null)
            sb.append("CSSColor: " + getCSSColor() + ",");
        if (getSimplifiedColor() != null)
            sb.append("SimplifiedColor: " + getSimplifiedColor() + ",");
        if (getPixelPercent() != null)
            sb.append("PixelPercent: " + getPixelPercent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRed() == null) ? 0 : getRed().hashCode());
        hashCode = prime * hashCode + ((getBlue() == null) ? 0 : getBlue().hashCode());
        hashCode = prime * hashCode + ((getGreen() == null) ? 0 : getGreen().hashCode());
        hashCode = prime * hashCode + ((getHexCode() == null) ? 0 : getHexCode().hashCode());
        hashCode = prime * hashCode + ((getCSSColor() == null) ? 0 : getCSSColor().hashCode());
        hashCode = prime * hashCode
                + ((getSimplifiedColor() == null) ? 0 : getSimplifiedColor().hashCode());
        hashCode = prime * hashCode
                + ((getPixelPercent() == null) ? 0 : getPixelPercent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DominantColor == false)
            return false;
        DominantColor other = (DominantColor) obj;

        if (other.getRed() == null ^ this.getRed() == null)
            return false;
        if (other.getRed() != null && other.getRed().equals(this.getRed()) == false)
            return false;
        if (other.getBlue() == null ^ this.getBlue() == null)
            return false;
        if (other.getBlue() != null && other.getBlue().equals(this.getBlue()) == false)
            return false;
        if (other.getGreen() == null ^ this.getGreen() == null)
            return false;
        if (other.getGreen() != null && other.getGreen().equals(this.getGreen()) == false)
            return false;
        if (other.getHexCode() == null ^ this.getHexCode() == null)
            return false;
        if (other.getHexCode() != null && other.getHexCode().equals(this.getHexCode()) == false)
            return false;
        if (other.getCSSColor() == null ^ this.getCSSColor() == null)
            return false;
        if (other.getCSSColor() != null && other.getCSSColor().equals(this.getCSSColor()) == false)
            return false;
        if (other.getSimplifiedColor() == null ^ this.getSimplifiedColor() == null)
            return false;
        if (other.getSimplifiedColor() != null
                && other.getSimplifiedColor().equals(this.getSimplifiedColor()) == false)
            return false;
        if (other.getPixelPercent() == null ^ this.getPixelPercent() == null)
            return false;
        if (other.getPixelPercent() != null
                && other.getPixelPercent().equals(this.getPixelPercent()) == false)
            return false;
        return true;
    }
}
