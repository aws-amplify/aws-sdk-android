/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Indicates the pose of the face as determined by its pitch, roll, and yaw.
 * </p>
 */
public class Pose implements Serializable {
    /**
     * <p>
     * Value representing the face rotation on the roll axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     */
    private Float roll;

    /**
     * <p>
     * Value representing the face rotation on the yaw axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     */
    private Float yaw;

    /**
     * <p>
     * Value representing the face rotation on the pitch axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     */
    private Float pitch;

    /**
     * <p>
     * Value representing the face rotation on the roll axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     *
     * @return <p>
     *         Value representing the face rotation on the roll axis.
     *         </p>
     */
    public Float getRoll() {
        return roll;
    }

    /**
     * <p>
     * Value representing the face rotation on the roll axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     *
     * @param roll <p>
     *            Value representing the face rotation on the roll axis.
     *            </p>
     */
    public void setRoll(Float roll) {
        this.roll = roll;
    }

    /**
     * <p>
     * Value representing the face rotation on the roll axis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     *
     * @param roll <p>
     *            Value representing the face rotation on the roll axis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Pose withRoll(Float roll) {
        this.roll = roll;
        return this;
    }

    /**
     * <p>
     * Value representing the face rotation on the yaw axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     *
     * @return <p>
     *         Value representing the face rotation on the yaw axis.
     *         </p>
     */
    public Float getYaw() {
        return yaw;
    }

    /**
     * <p>
     * Value representing the face rotation on the yaw axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     *
     * @param yaw <p>
     *            Value representing the face rotation on the yaw axis.
     *            </p>
     */
    public void setYaw(Float yaw) {
        this.yaw = yaw;
    }

    /**
     * <p>
     * Value representing the face rotation on the yaw axis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     *
     * @param yaw <p>
     *            Value representing the face rotation on the yaw axis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Pose withYaw(Float yaw) {
        this.yaw = yaw;
        return this;
    }

    /**
     * <p>
     * Value representing the face rotation on the pitch axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     *
     * @return <p>
     *         Value representing the face rotation on the pitch axis.
     *         </p>
     */
    public Float getPitch() {
        return pitch;
    }

    /**
     * <p>
     * Value representing the face rotation on the pitch axis.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     *
     * @param pitch <p>
     *            Value representing the face rotation on the pitch axis.
     *            </p>
     */
    public void setPitch(Float pitch) {
        this.pitch = pitch;
    }

    /**
     * <p>
     * Value representing the face rotation on the pitch axis.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>-180 - 180<br/>
     *
     * @param pitch <p>
     *            Value representing the face rotation on the pitch axis.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Pose withPitch(Float pitch) {
        this.pitch = pitch;
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
        if (getRoll() != null)
            sb.append("Roll: " + getRoll() + ",");
        if (getYaw() != null)
            sb.append("Yaw: " + getYaw() + ",");
        if (getPitch() != null)
            sb.append("Pitch: " + getPitch());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoll() == null) ? 0 : getRoll().hashCode());
        hashCode = prime * hashCode + ((getYaw() == null) ? 0 : getYaw().hashCode());
        hashCode = prime * hashCode + ((getPitch() == null) ? 0 : getPitch().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Pose == false)
            return false;
        Pose other = (Pose) obj;

        if (other.getRoll() == null ^ this.getRoll() == null)
            return false;
        if (other.getRoll() != null && other.getRoll().equals(this.getRoll()) == false)
            return false;
        if (other.getYaw() == null ^ this.getYaw() == null)
            return false;
        if (other.getYaw() != null && other.getYaw().equals(this.getYaw()) == false)
            return false;
        if (other.getPitch() == null ^ this.getPitch() == null)
            return false;
        if (other.getPitch() != null && other.getPitch().equals(this.getPitch()) == false)
            return false;
        return true;
    }
}
