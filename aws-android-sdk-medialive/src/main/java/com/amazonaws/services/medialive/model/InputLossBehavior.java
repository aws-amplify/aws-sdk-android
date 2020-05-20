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

package com.amazonaws.services.medialive.model;

import java.io.Serializable;

/**
 * Input Loss Behavior
 */
public class InputLossBehavior implements Serializable {
    /**
     * Documentation update needed
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     */
    private Integer blackFrameMsec;

    /**
     * When input loss image type is "color" this field specifies the color to
     * use. Value: 6 hex characters representing the values of RGB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     */
    private String inputLossImageColor;

    /**
     * When input loss image type is "slate" these fields specify the parameters
     * for accessing the slate.
     */
    private InputLocation inputLossImageSlate;

    /**
     * Indicates whether to substitute a solid color or a slate into the output
     * after input loss exceeds blackFrameMsec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLOR, SLATE
     */
    private String inputLossImageType;

    /**
     * Documentation update needed
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     */
    private Integer repeatFrameMsec;

    /**
     * Documentation update needed
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @return Documentation update needed
     */
    public Integer getBlackFrameMsec() {
        return blackFrameMsec;
    }

    /**
     * Documentation update needed
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @param blackFrameMsec Documentation update needed
     */
    public void setBlackFrameMsec(Integer blackFrameMsec) {
        this.blackFrameMsec = blackFrameMsec;
    }

    /**
     * Documentation update needed
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @param blackFrameMsec Documentation update needed
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputLossBehavior withBlackFrameMsec(Integer blackFrameMsec) {
        this.blackFrameMsec = blackFrameMsec;
        return this;
    }

    /**
     * When input loss image type is "color" this field specifies the color to
     * use. Value: 6 hex characters representing the values of RGB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     *
     * @return When input loss image type is "color" this field specifies the
     *         color to use. Value: 6 hex characters representing the values of
     *         RGB.
     */
    public String getInputLossImageColor() {
        return inputLossImageColor;
    }

    /**
     * When input loss image type is "color" this field specifies the color to
     * use. Value: 6 hex characters representing the values of RGB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     *
     * @param inputLossImageColor When input loss image type is "color" this
     *            field specifies the color to use. Value: 6 hex characters
     *            representing the values of RGB.
     */
    public void setInputLossImageColor(String inputLossImageColor) {
        this.inputLossImageColor = inputLossImageColor;
    }

    /**
     * When input loss image type is "color" this field specifies the color to
     * use. Value: 6 hex characters representing the values of RGB.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>6 - 6<br/>
     *
     * @param inputLossImageColor When input loss image type is "color" this
     *            field specifies the color to use. Value: 6 hex characters
     *            representing the values of RGB.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputLossBehavior withInputLossImageColor(String inputLossImageColor) {
        this.inputLossImageColor = inputLossImageColor;
        return this;
    }

    /**
     * When input loss image type is "slate" these fields specify the parameters
     * for accessing the slate.
     *
     * @return When input loss image type is "slate" these fields specify the
     *         parameters for accessing the slate.
     */
    public InputLocation getInputLossImageSlate() {
        return inputLossImageSlate;
    }

    /**
     * When input loss image type is "slate" these fields specify the parameters
     * for accessing the slate.
     *
     * @param inputLossImageSlate When input loss image type is "slate" these
     *            fields specify the parameters for accessing the slate.
     */
    public void setInputLossImageSlate(InputLocation inputLossImageSlate) {
        this.inputLossImageSlate = inputLossImageSlate;
    }

    /**
     * When input loss image type is "slate" these fields specify the parameters
     * for accessing the slate.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param inputLossImageSlate When input loss image type is "slate" these
     *            fields specify the parameters for accessing the slate.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputLossBehavior withInputLossImageSlate(InputLocation inputLossImageSlate) {
        this.inputLossImageSlate = inputLossImageSlate;
        return this;
    }

    /**
     * Indicates whether to substitute a solid color or a slate into the output
     * after input loss exceeds blackFrameMsec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLOR, SLATE
     *
     * @return Indicates whether to substitute a solid color or a slate into the
     *         output after input loss exceeds blackFrameMsec.
     * @see InputLossImageType
     */
    public String getInputLossImageType() {
        return inputLossImageType;
    }

    /**
     * Indicates whether to substitute a solid color or a slate into the output
     * after input loss exceeds blackFrameMsec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLOR, SLATE
     *
     * @param inputLossImageType Indicates whether to substitute a solid color
     *            or a slate into the output after input loss exceeds
     *            blackFrameMsec.
     * @see InputLossImageType
     */
    public void setInputLossImageType(String inputLossImageType) {
        this.inputLossImageType = inputLossImageType;
    }

    /**
     * Indicates whether to substitute a solid color or a slate into the output
     * after input loss exceeds blackFrameMsec.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLOR, SLATE
     *
     * @param inputLossImageType Indicates whether to substitute a solid color
     *            or a slate into the output after input loss exceeds
     *            blackFrameMsec.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputLossImageType
     */
    public InputLossBehavior withInputLossImageType(String inputLossImageType) {
        this.inputLossImageType = inputLossImageType;
        return this;
    }

    /**
     * Indicates whether to substitute a solid color or a slate into the output
     * after input loss exceeds blackFrameMsec.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLOR, SLATE
     *
     * @param inputLossImageType Indicates whether to substitute a solid color
     *            or a slate into the output after input loss exceeds
     *            blackFrameMsec.
     * @see InputLossImageType
     */
    public void setInputLossImageType(InputLossImageType inputLossImageType) {
        this.inputLossImageType = inputLossImageType.toString();
    }

    /**
     * Indicates whether to substitute a solid color or a slate into the output
     * after input loss exceeds blackFrameMsec.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>COLOR, SLATE
     *
     * @param inputLossImageType Indicates whether to substitute a solid color
     *            or a slate into the output after input loss exceeds
     *            blackFrameMsec.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InputLossImageType
     */
    public InputLossBehavior withInputLossImageType(InputLossImageType inputLossImageType) {
        this.inputLossImageType = inputLossImageType.toString();
        return this;
    }

    /**
     * Documentation update needed
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @return Documentation update needed
     */
    public Integer getRepeatFrameMsec() {
        return repeatFrameMsec;
    }

    /**
     * Documentation update needed
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @param repeatFrameMsec Documentation update needed
     */
    public void setRepeatFrameMsec(Integer repeatFrameMsec) {
        this.repeatFrameMsec = repeatFrameMsec;
    }

    /**
     * Documentation update needed
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 1000000<br/>
     *
     * @param repeatFrameMsec Documentation update needed
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InputLossBehavior withRepeatFrameMsec(Integer repeatFrameMsec) {
        this.repeatFrameMsec = repeatFrameMsec;
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
        if (getBlackFrameMsec() != null)
            sb.append("BlackFrameMsec: " + getBlackFrameMsec() + ",");
        if (getInputLossImageColor() != null)
            sb.append("InputLossImageColor: " + getInputLossImageColor() + ",");
        if (getInputLossImageSlate() != null)
            sb.append("InputLossImageSlate: " + getInputLossImageSlate() + ",");
        if (getInputLossImageType() != null)
            sb.append("InputLossImageType: " + getInputLossImageType() + ",");
        if (getRepeatFrameMsec() != null)
            sb.append("RepeatFrameMsec: " + getRepeatFrameMsec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBlackFrameMsec() == null) ? 0 : getBlackFrameMsec().hashCode());
        hashCode = prime * hashCode
                + ((getInputLossImageColor() == null) ? 0 : getInputLossImageColor().hashCode());
        hashCode = prime * hashCode
                + ((getInputLossImageSlate() == null) ? 0 : getInputLossImageSlate().hashCode());
        hashCode = prime * hashCode
                + ((getInputLossImageType() == null) ? 0 : getInputLossImageType().hashCode());
        hashCode = prime * hashCode
                + ((getRepeatFrameMsec() == null) ? 0 : getRepeatFrameMsec().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputLossBehavior == false)
            return false;
        InputLossBehavior other = (InputLossBehavior) obj;

        if (other.getBlackFrameMsec() == null ^ this.getBlackFrameMsec() == null)
            return false;
        if (other.getBlackFrameMsec() != null
                && other.getBlackFrameMsec().equals(this.getBlackFrameMsec()) == false)
            return false;
        if (other.getInputLossImageColor() == null ^ this.getInputLossImageColor() == null)
            return false;
        if (other.getInputLossImageColor() != null
                && other.getInputLossImageColor().equals(this.getInputLossImageColor()) == false)
            return false;
        if (other.getInputLossImageSlate() == null ^ this.getInputLossImageSlate() == null)
            return false;
        if (other.getInputLossImageSlate() != null
                && other.getInputLossImageSlate().equals(this.getInputLossImageSlate()) == false)
            return false;
        if (other.getInputLossImageType() == null ^ this.getInputLossImageType() == null)
            return false;
        if (other.getInputLossImageType() != null
                && other.getInputLossImageType().equals(this.getInputLossImageType()) == false)
            return false;
        if (other.getRepeatFrameMsec() == null ^ this.getRepeatFrameMsec() == null)
            return false;
        if (other.getRepeatFrameMsec() != null
                && other.getRepeatFrameMsec().equals(this.getRepeatFrameMsec()) == false)
            return false;
        return true;
    }
}
