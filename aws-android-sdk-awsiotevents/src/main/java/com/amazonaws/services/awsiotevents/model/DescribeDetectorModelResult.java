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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

public class DescribeDetectorModelResult implements Serializable {
    /**
     * <p>
     * Information about the detector model.
     * </p>
     */
    private DetectorModel detectorModel;

    /**
     * <p>
     * Information about the detector model.
     * </p>
     *
     * @return <p>
     *         Information about the detector model.
     *         </p>
     */
    public DetectorModel getDetectorModel() {
        return detectorModel;
    }

    /**
     * <p>
     * Information about the detector model.
     * </p>
     *
     * @param detectorModel <p>
     *            Information about the detector model.
     *            </p>
     */
    public void setDetectorModel(DetectorModel detectorModel) {
        this.detectorModel = detectorModel;
    }

    /**
     * <p>
     * Information about the detector model.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param detectorModel <p>
     *            Information about the detector model.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDetectorModelResult withDetectorModel(DetectorModel detectorModel) {
        this.detectorModel = detectorModel;
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
        if (getDetectorModel() != null)
            sb.append("detectorModel: " + getDetectorModel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDetectorModel() == null) ? 0 : getDetectorModel().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDetectorModelResult == false)
            return false;
        DescribeDetectorModelResult other = (DescribeDetectorModelResult) obj;

        if (other.getDetectorModel() == null ^ this.getDetectorModel() == null)
            return false;
        if (other.getDetectorModel() != null
                && other.getDetectorModel().equals(this.getDetectorModel()) == false)
            return false;
        return true;
    }
}
