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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

/**
 * <p>
 * Updates settings for the require check in feature that are applied to a room
 * profile. Require check in allows a meeting room’s Alexa or AVS device to
 * prompt the user to check in; otherwise, the room will be released.
 * </p>
 */
public class UpdateRequireCheckIn implements Serializable {
    /**
     * <p>
     * Duration between 5 and 20 minutes to determine when to release the room
     * if it's not checked into.
     * </p>
     */
    private Integer releaseAfterMinutes;

    /**
     * <p>
     * Whether require check in is enabled or not.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * Duration between 5 and 20 minutes to determine when to release the room
     * if it's not checked into.
     * </p>
     *
     * @return <p>
     *         Duration between 5 and 20 minutes to determine when to release
     *         the room if it's not checked into.
     *         </p>
     */
    public Integer getReleaseAfterMinutes() {
        return releaseAfterMinutes;
    }

    /**
     * <p>
     * Duration between 5 and 20 minutes to determine when to release the room
     * if it's not checked into.
     * </p>
     *
     * @param releaseAfterMinutes <p>
     *            Duration between 5 and 20 minutes to determine when to release
     *            the room if it's not checked into.
     *            </p>
     */
    public void setReleaseAfterMinutes(Integer releaseAfterMinutes) {
        this.releaseAfterMinutes = releaseAfterMinutes;
    }

    /**
     * <p>
     * Duration between 5 and 20 minutes to determine when to release the room
     * if it's not checked into.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param releaseAfterMinutes <p>
     *            Duration between 5 and 20 minutes to determine when to release
     *            the room if it's not checked into.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRequireCheckIn withReleaseAfterMinutes(Integer releaseAfterMinutes) {
        this.releaseAfterMinutes = releaseAfterMinutes;
        return this;
    }

    /**
     * <p>
     * Whether require check in is enabled or not.
     * </p>
     *
     * @return <p>
     *         Whether require check in is enabled or not.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether require check in is enabled or not.
     * </p>
     *
     * @return <p>
     *         Whether require check in is enabled or not.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether require check in is enabled or not.
     * </p>
     *
     * @param enabled <p>
     *            Whether require check in is enabled or not.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether require check in is enabled or not.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Whether require check in is enabled or not.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateRequireCheckIn withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getReleaseAfterMinutes() != null)
            sb.append("ReleaseAfterMinutes: " + getReleaseAfterMinutes() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getReleaseAfterMinutes() == null) ? 0 : getReleaseAfterMinutes().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRequireCheckIn == false)
            return false;
        UpdateRequireCheckIn other = (UpdateRequireCheckIn) obj;

        if (other.getReleaseAfterMinutes() == null ^ this.getReleaseAfterMinutes() == null)
            return false;
        if (other.getReleaseAfterMinutes() != null
                && other.getReleaseAfterMinutes().equals(this.getReleaseAfterMinutes()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
