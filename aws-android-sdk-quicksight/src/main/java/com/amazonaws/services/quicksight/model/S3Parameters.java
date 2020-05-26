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

package com.amazonaws.services.quicksight.model;

import java.io.Serializable;

/**
 * <p>
 * S3 parameters.
 * </p>
 */
public class S3Parameters implements Serializable {
    /**
     * <p>
     * Location of the Amazon S3 manifest file. This is NULL if the manifest
     * file was uploaded in the console.
     * </p>
     */
    private ManifestFileLocation manifestFileLocation;

    /**
     * <p>
     * Location of the Amazon S3 manifest file. This is NULL if the manifest
     * file was uploaded in the console.
     * </p>
     *
     * @return <p>
     *         Location of the Amazon S3 manifest file. This is NULL if the
     *         manifest file was uploaded in the console.
     *         </p>
     */
    public ManifestFileLocation getManifestFileLocation() {
        return manifestFileLocation;
    }

    /**
     * <p>
     * Location of the Amazon S3 manifest file. This is NULL if the manifest
     * file was uploaded in the console.
     * </p>
     *
     * @param manifestFileLocation <p>
     *            Location of the Amazon S3 manifest file. This is NULL if the
     *            manifest file was uploaded in the console.
     *            </p>
     */
    public void setManifestFileLocation(ManifestFileLocation manifestFileLocation) {
        this.manifestFileLocation = manifestFileLocation;
    }

    /**
     * <p>
     * Location of the Amazon S3 manifest file. This is NULL if the manifest
     * file was uploaded in the console.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manifestFileLocation <p>
     *            Location of the Amazon S3 manifest file. This is NULL if the
     *            manifest file was uploaded in the console.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public S3Parameters withManifestFileLocation(ManifestFileLocation manifestFileLocation) {
        this.manifestFileLocation = manifestFileLocation;
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
        if (getManifestFileLocation() != null)
            sb.append("ManifestFileLocation: " + getManifestFileLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getManifestFileLocation() == null) ? 0 : getManifestFileLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Parameters == false)
            return false;
        S3Parameters other = (S3Parameters) obj;

        if (other.getManifestFileLocation() == null ^ this.getManifestFileLocation() == null)
            return false;
        if (other.getManifestFileLocation() != null
                && other.getManifestFileLocation().equals(this.getManifestFileLocation()) == false)
            return false;
        return true;
    }
}
