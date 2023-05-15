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
 * Indicates the direction the eyes are gazing in (independent of the head pose)
 * as determined by its pitch and yaw.
 * </p>
 */
public class EyeDirection implements Serializable {
    /**
     * <p>
     * Value representing eye direction on the yaw axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180.0 - 180.0<br/>
     */
    private Float yaw;

    /**
     * <p>
     * Value representing eye direction on the pitch axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180.0 - 180.0<br/>
     */
    private Float pitch;

    /**
     * <p>
     * The confidence that the service has in its predicted eye direction.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     */
    private Float confidence;

    /**
     * <p>
     * Value representing eye direction on the yaw axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180.0 - 180.0<br/>
     *
     * @return <p>
     *         Value representing eye direction on the yaw axis.
     *         </p>
     */
    public Float getYaw() {
        return yaw;
    }

    /**
     * <p>
     * Value representing eye direction on the yaw axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180.0 - 180.0<br/>
     *
     * @param yaw <p>
     *            Value representing eye direction on the yaw axis.
     *            </p>
     */
    public void setYaw(Float yaw) {
        this.yaw = yaw;
    }

    /**
     * <p>
     * Value representing eye direction on the yaw axis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180.0 - 180.0<br/>
     *
     * @param yaw <p>
     *            Value representing eye direction on the yaw axis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EyeDirection withYaw(Float yaw) {
        this.yaw = yaw;
        return this;
    }

    /**
     * <p>
     * Value representing eye direction on the pitch axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180.0 - 180.0<br/>
     *
     * @return <p>
     *         Value representing eye direction on the pitch axis.
     *         </p>
     */
    public Float getPitch() {
        return pitch;
    }

    /**
     * <p>
     * Value representing eye direction on the pitch axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180.0 - 180.0<br/>
     *
     * @param pitch <p>
     *            Value representing eye direction on the pitch axis.
     *            </p>
     */
    public void setPitch(Float pitch) {
        this.pitch = pitch;
    }

    /**
     * <p>
     * Value representing eye direction on the pitch axis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180.0 - 180.0<br/>
     *
     * @param pitch <p>
     *            Value representing eye direction on the pitch axis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EyeDirection withPitch(Float pitch) {
        this.pitch = pitch;
        return this;
    }

    /**
     * <p>
     * The confidence that the service has in its predicted eye direction.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @return <p>
     *         The confidence that the service has in its predicted eye
     *         direction.
     *         </p>
     */
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <p>
     * The confidence that the service has in its predicted eye direction.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            The confidence that the service has in its predicted eye
     *            direction.
     *            </p>
     */
    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that the service has in its predicted eye direction.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0.0 - 100.0<br/>
     *
     * @param confidence <p>
     *            The confidence that the service has in its predicted eye
     *            direction.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EyeDirection withConfidence(Float confidence) {
        this.confidence = confidence;
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
        if (getYaw() != null)
            sb.append("Yaw: " + getYaw() + ",");
        if (getPitch() != null)
            sb.append("Pitch: " + getPitch() + ",");
        if (getConfidence() != null)
            sb.append("Confidence: " + getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getYaw() == null) ? 0 : getYaw().hashCode());
        hashCode = prime * hashCode + ((getPitch() == null) ? 0 : getPitch().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EyeDirection == false)
            return false;
        EyeDirection other = (EyeDirection) obj;

        if (other.getYaw() == null ^ this.getYaw() == null)
            return false;
        if (other.getYaw() != null && other.getYaw().equals(this.getYaw()) == false)
            return false;
        if (other.getPitch() == null ^ this.getPitch() == null)
            return false;
        if (other.getPitch() != null && other.getPitch().equals(this.getPitch()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null
                && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }
}
