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

package com.amazonaws.services.amazonimportexportsnowball.model;

import java.io.Serializable;

public class ListCompatibleImagesResult implements Serializable {
    /**
     * <p>
     * A JSON-formatted object that describes a compatible AMI, including the ID
     * and name for a Snowball Edge AMI.
     * </p>
     */
    private java.util.List<CompatibleImage> compatibleImages;

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your
     * next list of returned images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * <p>
     * A JSON-formatted object that describes a compatible AMI, including the ID
     * and name for a Snowball Edge AMI.
     * </p>
     *
     * @return <p>
     *         A JSON-formatted object that describes a compatible AMI,
     *         including the ID and name for a Snowball Edge AMI.
     *         </p>
     */
    public java.util.List<CompatibleImage> getCompatibleImages() {
        return compatibleImages;
    }

    /**
     * <p>
     * A JSON-formatted object that describes a compatible AMI, including the ID
     * and name for a Snowball Edge AMI.
     * </p>
     *
     * @param compatibleImages <p>
     *            A JSON-formatted object that describes a compatible AMI,
     *            including the ID and name for a Snowball Edge AMI.
     *            </p>
     */
    public void setCompatibleImages(java.util.Collection<CompatibleImage> compatibleImages) {
        if (compatibleImages == null) {
            this.compatibleImages = null;
            return;
        }

        this.compatibleImages = new java.util.ArrayList<CompatibleImage>(compatibleImages);
    }

    /**
     * <p>
     * A JSON-formatted object that describes a compatible AMI, including the ID
     * and name for a Snowball Edge AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compatibleImages <p>
     *            A JSON-formatted object that describes a compatible AMI,
     *            including the ID and name for a Snowball Edge AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCompatibleImagesResult withCompatibleImages(CompatibleImage... compatibleImages) {
        if (getCompatibleImages() == null) {
            this.compatibleImages = new java.util.ArrayList<CompatibleImage>(
                    compatibleImages.length);
        }
        for (CompatibleImage value : compatibleImages) {
            this.compatibleImages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A JSON-formatted object that describes a compatible AMI, including the ID
     * and name for a Snowball Edge AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param compatibleImages <p>
     *            A JSON-formatted object that describes a compatible AMI,
     *            including the ID and name for a Snowball Edge AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCompatibleImagesResult withCompatibleImages(
            java.util.Collection<CompatibleImage> compatibleImages) {
        setCompatibleImages(compatibleImages);
        return this;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your
     * next list of returned images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Because HTTP requests are stateless, this is the starting point
     *         for your next list of returned images.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your
     * next list of returned images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Because HTTP requests are stateless, this is the starting
     *            point for your next list of returned images.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Because HTTP requests are stateless, this is the starting point for your
     * next list of returned images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken <p>
     *            Because HTTP requests are stateless, this is the starting
     *            point for your next list of returned images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListCompatibleImagesResult withNextToken(String nextToken) {
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
        if (getCompatibleImages() != null)
            sb.append("CompatibleImages: " + getCompatibleImages() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCompatibleImages() == null) ? 0 : getCompatibleImages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCompatibleImagesResult == false)
            return false;
        ListCompatibleImagesResult other = (ListCompatibleImagesResult) obj;

        if (other.getCompatibleImages() == null ^ this.getCompatibleImages() == null)
            return false;
        if (other.getCompatibleImages() != null
                && other.getCompatibleImages().equals(this.getCompatibleImages()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
