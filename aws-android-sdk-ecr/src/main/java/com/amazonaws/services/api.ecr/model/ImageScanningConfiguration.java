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

package com.amazonaws.services.api.ecr.model;

import java.io.Serializable;

/**
 * <p>
 * The image scanning configuration for a repository.
 * </p>
 */
public class ImageScanningConfiguration implements Serializable {
    /**
     * <p>
     * The setting that determines whether images are scanned after being pushed
     * to a repository. If set to <code>true</code>, images will be scanned
     * after being pushed. If this parameter is not specified, it will default
     * to <code>false</code> and images will not be scanned unless a scan is
     * manually started with the <a>StartImageScan</a> API.
     * </p>
     */
    private Boolean scanOnPush;

    /**
     * <p>
     * The setting that determines whether images are scanned after being pushed
     * to a repository. If set to <code>true</code>, images will be scanned
     * after being pushed. If this parameter is not specified, it will default
     * to <code>false</code> and images will not be scanned unless a scan is
     * manually started with the <a>StartImageScan</a> API.
     * </p>
     *
     * @return <p>
     *         The setting that determines whether images are scanned after
     *         being pushed to a repository. If set to <code>true</code>, images
     *         will be scanned after being pushed. If this parameter is not
     *         specified, it will default to <code>false</code> and images will
     *         not be scanned unless a scan is manually started with the
     *         <a>StartImageScan</a> API.
     *         </p>
     */
    public Boolean isScanOnPush() {
        return scanOnPush;
    }

    /**
     * <p>
     * The setting that determines whether images are scanned after being pushed
     * to a repository. If set to <code>true</code>, images will be scanned
     * after being pushed. If this parameter is not specified, it will default
     * to <code>false</code> and images will not be scanned unless a scan is
     * manually started with the <a>StartImageScan</a> API.
     * </p>
     *
     * @return <p>
     *         The setting that determines whether images are scanned after
     *         being pushed to a repository. If set to <code>true</code>, images
     *         will be scanned after being pushed. If this parameter is not
     *         specified, it will default to <code>false</code> and images will
     *         not be scanned unless a scan is manually started with the
     *         <a>StartImageScan</a> API.
     *         </p>
     */
    public Boolean getScanOnPush() {
        return scanOnPush;
    }

    /**
     * <p>
     * The setting that determines whether images are scanned after being pushed
     * to a repository. If set to <code>true</code>, images will be scanned
     * after being pushed. If this parameter is not specified, it will default
     * to <code>false</code> and images will not be scanned unless a scan is
     * manually started with the <a>StartImageScan</a> API.
     * </p>
     *
     * @param scanOnPush <p>
     *            The setting that determines whether images are scanned after
     *            being pushed to a repository. If set to <code>true</code>,
     *            images will be scanned after being pushed. If this parameter
     *            is not specified, it will default to <code>false</code> and
     *            images will not be scanned unless a scan is manually started
     *            with the <a>StartImageScan</a> API.
     *            </p>
     */
    public void setScanOnPush(Boolean scanOnPush) {
        this.scanOnPush = scanOnPush;
    }

    /**
     * <p>
     * The setting that determines whether images are scanned after being pushed
     * to a repository. If set to <code>true</code>, images will be scanned
     * after being pushed. If this parameter is not specified, it will default
     * to <code>false</code> and images will not be scanned unless a scan is
     * manually started with the <a>StartImageScan</a> API.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scanOnPush <p>
     *            The setting that determines whether images are scanned after
     *            being pushed to a repository. If set to <code>true</code>,
     *            images will be scanned after being pushed. If this parameter
     *            is not specified, it will default to <code>false</code> and
     *            images will not be scanned unless a scan is manually started
     *            with the <a>StartImageScan</a> API.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageScanningConfiguration withScanOnPush(Boolean scanOnPush) {
        this.scanOnPush = scanOnPush;
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
        if (getScanOnPush() != null)
            sb.append("scanOnPush: " + getScanOnPush());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanOnPush() == null) ? 0 : getScanOnPush().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageScanningConfiguration == false)
            return false;
        ImageScanningConfiguration other = (ImageScanningConfiguration) obj;

        if (other.getScanOnPush() == null ^ this.getScanOnPush() == null)
            return false;
        if (other.getScanOnPush() != null
                && other.getScanOnPush().equals(this.getScanOnPush()) == false)
            return false;
        return true;
    }
}
