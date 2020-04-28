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

package com.amazonaws.services.amazonec2containerregistry.model;

import java.io.Serializable;

/**
 * <p>
 * The current status of an image scan.
 * </p>
 */
public class ImageScanStatus implements Serializable {
    /**
     * <p>
     * The current state of an image scan.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     */
    private String status;

    /**
     * <p>
     * The description of the image scan status.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The current state of an image scan.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     *
     * @return <p>
     *         The current state of an image scan.
     *         </p>
     * @see ScanStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The current state of an image scan.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     *
     * @param status <p>
     *            The current state of an image scan.
     *            </p>
     * @see ScanStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of an image scan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     *
     * @param status <p>
     *            The current state of an image scan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScanStatus
     */
    public ImageScanStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The current state of an image scan.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     *
     * @param status <p>
     *            The current state of an image scan.
     *            </p>
     * @see ScanStatus
     */
    public void setStatus(ScanStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current state of an image scan.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN_PROGRESS, COMPLETE, FAILED
     *
     * @param status <p>
     *            The current state of an image scan.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScanStatus
     */
    public ImageScanStatus withStatus(ScanStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description of the image scan status.
     * </p>
     *
     * @return <p>
     *         The description of the image scan status.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the image scan status.
     * </p>
     *
     * @param description <p>
     *            The description of the image scan status.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the image scan status.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the image scan status.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageScanStatus withDescription(String description) {
        this.description = description;
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
        if (getDescription() != null)
            sb.append("description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanStatus == false)
            return false;
        ImageScanStatus other = (ImageScanStatus) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }
}
