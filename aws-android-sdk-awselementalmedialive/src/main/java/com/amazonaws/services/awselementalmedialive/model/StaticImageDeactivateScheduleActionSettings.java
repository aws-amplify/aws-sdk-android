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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * Settings for the action to deactivate the image in a specific layer.
 */
public class StaticImageDeactivateScheduleActionSettings implements Serializable {
    /**
     * The time in milliseconds for the image to fade out. Default is 0 (no
     * fade-out).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer fadeOut;

    /**
     * The image overlay layer to deactivate, 0 to 7. Default is 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     */
    private Integer layer;

    /**
     * The time in milliseconds for the image to fade out. Default is 0 (no
     * fade-out).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return The time in milliseconds for the image to fade out. Default is 0
     *         (no fade-out).
     */
    public Integer getFadeOut() {
        return fadeOut;
    }

    /**
     * The time in milliseconds for the image to fade out. Default is 0 (no
     * fade-out).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param fadeOut The time in milliseconds for the image to fade out.
     *            Default is 0 (no fade-out).
     */
    public void setFadeOut(Integer fadeOut) {
        this.fadeOut = fadeOut;
    }

    /**
     * The time in milliseconds for the image to fade out. Default is 0 (no
     * fade-out).
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param fadeOut The time in milliseconds for the image to fade out.
     *            Default is 0 (no fade-out).
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageDeactivateScheduleActionSettings withFadeOut(Integer fadeOut) {
        this.fadeOut = fadeOut;
        return this;
    }

    /**
     * The image overlay layer to deactivate, 0 to 7. Default is 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @return The image overlay layer to deactivate, 0 to 7. Default is 0.
     */
    public Integer getLayer() {
        return layer;
    }

    /**
     * The image overlay layer to deactivate, 0 to 7. Default is 0.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @param layer The image overlay layer to deactivate, 0 to 7. Default is 0.
     */
    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    /**
     * The image overlay layer to deactivate, 0 to 7. Default is 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 7<br/>
     *
     * @param layer The image overlay layer to deactivate, 0 to 7. Default is 0.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StaticImageDeactivateScheduleActionSettings withLayer(Integer layer) {
        this.layer = layer;
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
        if (getFadeOut() != null)
            sb.append("FadeOut: " + getFadeOut() + ",");
        if (getLayer() != null)
            sb.append("Layer: " + getLayer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFadeOut() == null) ? 0 : getFadeOut().hashCode());
        hashCode = prime * hashCode + ((getLayer() == null) ? 0 : getLayer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StaticImageDeactivateScheduleActionSettings == false)
            return false;
        StaticImageDeactivateScheduleActionSettings other = (StaticImageDeactivateScheduleActionSettings) obj;

        if (other.getFadeOut() == null ^ this.getFadeOut() == null)
            return false;
        if (other.getFadeOut() != null && other.getFadeOut().equals(this.getFadeOut()) == false)
            return false;
        if (other.getLayer() == null ^ this.getLayer() == null)
            return false;
        if (other.getLayer() != null && other.getLayer().equals(this.getLayer()) == false)
            return false;
        return true;
    }
}
