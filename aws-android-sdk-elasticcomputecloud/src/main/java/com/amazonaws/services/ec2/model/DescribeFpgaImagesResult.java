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

public class DescribeFpgaImagesResult implements Serializable {
    /**
     * <p>
     * Information about the FPGA images.
     * </p>
     */
    private java.util.List<FpgaImage> fpgaImages;

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the FPGA images.
     * </p>
     *
     * @return <p>
     *         Information about the FPGA images.
     *         </p>
     */
    public java.util.List<FpgaImage> getFpgaImages() {
        return fpgaImages;
    }

    /**
     * <p>
     * Information about the FPGA images.
     * </p>
     *
     * @param fpgaImages <p>
     *            Information about the FPGA images.
     *            </p>
     */
    public void setFpgaImages(java.util.Collection<FpgaImage> fpgaImages) {
        if (fpgaImages == null) {
            this.fpgaImages = null;
            return;
        }

        this.fpgaImages = new java.util.ArrayList<FpgaImage>(fpgaImages);
    }

    /**
     * <p>
     * Information about the FPGA images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgaImages <p>
     *            Information about the FPGA images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFpgaImagesResult withFpgaImages(FpgaImage... fpgaImages) {
        if (getFpgaImages() == null) {
            this.fpgaImages = new java.util.ArrayList<FpgaImage>(fpgaImages.length);
        }
        for (FpgaImage value : fpgaImages) {
            this.fpgaImages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the FPGA images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fpgaImages <p>
     *            Information about the FPGA images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFpgaImagesResult withFpgaImages(java.util.Collection<FpgaImage> fpgaImages) {
        setFpgaImages(fpgaImages);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @return <p>
     *         The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to use to retrieve the next page of results. This
     *            value is <code>null</code> when there are no more results to
     *            return.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFpgaImagesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getFpgaImages() != null)
            sb.append("FpgaImages: " + getFpgaImages() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpgaImages() == null) ? 0 : getFpgaImages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFpgaImagesResult == false)
            return false;
        DescribeFpgaImagesResult other = (DescribeFpgaImagesResult) obj;

        if (other.getFpgaImages() == null ^ this.getFpgaImages() == null)
            return false;
        if (other.getFpgaImages() != null
                && other.getFpgaImages().equals(this.getFpgaImages()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
