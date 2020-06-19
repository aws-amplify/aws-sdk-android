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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

public class CreateFpgaImageResult implements Serializable {
    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     */
    private String fpgaImageId;

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     */
    private String fpgaImageGlobalId;

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     *
     * @return <p>
     *         The FPGA image identifier (AFI ID).
     *         </p>
     */
    public String getFpgaImageId() {
        return fpgaImageId;
    }

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     *
     * @param fpgaImageId <p>
     *            The FPGA image identifier (AFI ID).
     *            </p>
     */
    public void setFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
    }

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgaImageId <p>
     *            The FPGA image identifier (AFI ID).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFpgaImageResult withFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
        return this;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     *
     * @return <p>
     *         The global FPGA image identifier (AGFI ID).
     *         </p>
     */
    public String getFpgaImageGlobalId() {
        return fpgaImageGlobalId;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     *
     * @param fpgaImageGlobalId <p>
     *            The global FPGA image identifier (AGFI ID).
     *            </p>
     */
    public void setFpgaImageGlobalId(String fpgaImageGlobalId) {
        this.fpgaImageGlobalId = fpgaImageGlobalId;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgaImageGlobalId <p>
     *            The global FPGA image identifier (AGFI ID).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateFpgaImageResult withFpgaImageGlobalId(String fpgaImageGlobalId) {
        this.fpgaImageGlobalId = fpgaImageGlobalId;
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
        if (getFpgaImageId() != null)
            sb.append("FpgaImageId: " + getFpgaImageId() + ",");
        if (getFpgaImageGlobalId() != null)
            sb.append("FpgaImageGlobalId: " + getFpgaImageGlobalId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFpgaImageId() == null) ? 0 : getFpgaImageId().hashCode());
        hashCode = prime * hashCode
                + ((getFpgaImageGlobalId() == null) ? 0 : getFpgaImageGlobalId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFpgaImageResult == false)
            return false;
        CreateFpgaImageResult other = (CreateFpgaImageResult) obj;

        if (other.getFpgaImageId() == null ^ this.getFpgaImageId() == null)
            return false;
        if (other.getFpgaImageId() != null
                && other.getFpgaImageId().equals(this.getFpgaImageId()) == false)
            return false;
        if (other.getFpgaImageGlobalId() == null ^ this.getFpgaImageGlobalId() == null)
            return false;
        if (other.getFpgaImageGlobalId() != null
                && other.getFpgaImageGlobalId().equals(this.getFpgaImageGlobalId()) == false)
            return false;
        return true;
    }
}
