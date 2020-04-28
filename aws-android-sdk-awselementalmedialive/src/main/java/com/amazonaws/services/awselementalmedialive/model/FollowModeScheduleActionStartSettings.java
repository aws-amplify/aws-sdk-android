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
 * Settings to specify if an action follows another.
 */
public class FollowModeScheduleActionStartSettings implements Serializable {
    /**
     * Identifies whether this action starts relative to the start or relative
     * to the end of the reference action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END, START
     */
    private String followPoint;

    /**
     * The action name of another action that this one refers to.
     */
    private String referenceActionName;

    /**
     * Identifies whether this action starts relative to the start or relative
     * to the end of the reference action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END, START
     *
     * @return Identifies whether this action starts relative to the start or
     *         relative to the end of the reference action.
     * @see FollowPoint
     */
    public String getFollowPoint() {
        return followPoint;
    }

    /**
     * Identifies whether this action starts relative to the start or relative
     * to the end of the reference action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END, START
     *
     * @param followPoint Identifies whether this action starts relative to the
     *            start or relative to the end of the reference action.
     * @see FollowPoint
     */
    public void setFollowPoint(String followPoint) {
        this.followPoint = followPoint;
    }

    /**
     * Identifies whether this action starts relative to the start or relative
     * to the end of the reference action.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END, START
     *
     * @param followPoint Identifies whether this action starts relative to the
     *            start or relative to the end of the reference action.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FollowPoint
     */
    public FollowModeScheduleActionStartSettings withFollowPoint(String followPoint) {
        this.followPoint = followPoint;
        return this;
    }

    /**
     * Identifies whether this action starts relative to the start or relative
     * to the end of the reference action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END, START
     *
     * @param followPoint Identifies whether this action starts relative to the
     *            start or relative to the end of the reference action.
     * @see FollowPoint
     */
    public void setFollowPoint(FollowPoint followPoint) {
        this.followPoint = followPoint.toString();
    }

    /**
     * Identifies whether this action starts relative to the start or relative
     * to the end of the reference action.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>END, START
     *
     * @param followPoint Identifies whether this action starts relative to the
     *            start or relative to the end of the reference action.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FollowPoint
     */
    public FollowModeScheduleActionStartSettings withFollowPoint(FollowPoint followPoint) {
        this.followPoint = followPoint.toString();
        return this;
    }

    /**
     * The action name of another action that this one refers to.
     *
     * @return The action name of another action that this one refers to.
     */
    public String getReferenceActionName() {
        return referenceActionName;
    }

    /**
     * The action name of another action that this one refers to.
     *
     * @param referenceActionName The action name of another action that this
     *            one refers to.
     */
    public void setReferenceActionName(String referenceActionName) {
        this.referenceActionName = referenceActionName;
    }

    /**
     * The action name of another action that this one refers to.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param referenceActionName The action name of another action that this
     *            one refers to.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public FollowModeScheduleActionStartSettings withReferenceActionName(String referenceActionName) {
        this.referenceActionName = referenceActionName;
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
        if (getFollowPoint() != null)
            sb.append("FollowPoint: " + getFollowPoint() + ",");
        if (getReferenceActionName() != null)
            sb.append("ReferenceActionName: " + getReferenceActionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFollowPoint() == null) ? 0 : getFollowPoint().hashCode());
        hashCode = prime * hashCode
                + ((getReferenceActionName() == null) ? 0 : getReferenceActionName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FollowModeScheduleActionStartSettings == false)
            return false;
        FollowModeScheduleActionStartSettings other = (FollowModeScheduleActionStartSettings) obj;

        if (other.getFollowPoint() == null ^ this.getFollowPoint() == null)
            return false;
        if (other.getFollowPoint() != null
                && other.getFollowPoint().equals(this.getFollowPoint()) == false)
            return false;
        if (other.getReferenceActionName() == null ^ this.getReferenceActionName() == null)
            return false;
        if (other.getReferenceActionName() != null
                && other.getReferenceActionName().equals(this.getReferenceActionName()) == false)
            return false;
        return true;
    }
}
