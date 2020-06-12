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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

/**
 * <p>
 * Image state shows the image status and the reason for that status.
 * </p>
 */
public class ImageState implements Serializable {
    /**
     * <p>
     * The status of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CREATING, BUILDING, TESTING,
     * DISTRIBUTING, INTEGRATING, AVAILABLE, CANCELLED, FAILED, DEPRECATED,
     * DELETED
     */
    private String status;

    /**
     * <p>
     * The reason for the image's status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String reason;

    /**
     * <p>
     * The status of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CREATING, BUILDING, TESTING,
     * DISTRIBUTING, INTEGRATING, AVAILABLE, CANCELLED, FAILED, DEPRECATED,
     * DELETED
     *
     * @return <p>
     *         The status of the image.
     *         </p>
     * @see ImageStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CREATING, BUILDING, TESTING,
     * DISTRIBUTING, INTEGRATING, AVAILABLE, CANCELLED, FAILED, DEPRECATED,
     * DELETED
     *
     * @param status <p>
     *            The status of the image.
     *            </p>
     * @see ImageStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CREATING, BUILDING, TESTING,
     * DISTRIBUTING, INTEGRATING, AVAILABLE, CANCELLED, FAILED, DEPRECATED,
     * DELETED
     *
     * @param status <p>
     *            The status of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageStatus
     */
    public ImageState withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CREATING, BUILDING, TESTING,
     * DISTRIBUTING, INTEGRATING, AVAILABLE, CANCELLED, FAILED, DEPRECATED,
     * DELETED
     *
     * @param status <p>
     *            The status of the image.
     *            </p>
     * @see ImageStatus
     */
    public void setStatus(ImageStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PENDING, CREATING, BUILDING, TESTING,
     * DISTRIBUTING, INTEGRATING, AVAILABLE, CANCELLED, FAILED, DEPRECATED,
     * DELETED
     *
     * @param status <p>
     *            The status of the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageStatus
     */
    public ImageState withStatus(ImageStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the image's status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The reason for the image's status.
     *         </p>
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * The reason for the image's status.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param reason <p>
     *            The reason for the image's status.
     *            </p>
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * The reason for the image's status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param reason <p>
     *            The reason for the image's status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageState withReason(String reason) {
        this.reason = reason;
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
        if (getStatus() != null)
            sb.append("status: " + getStatus() + ",");
        if (getReason() != null)
            sb.append("reason: " + getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageState == false)
            return false;
        ImageState other = (ImageState) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }
}
