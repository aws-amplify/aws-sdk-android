/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideoarchivedmedia.model;

import java.io.Serializable;

public class GetImagesResult implements Serializable {
    /**
     * <p>
     * The list of images generated from the video stream. If there is no media
     * available for the given timestamp, the <code>NO_MEDIA</code> error will
     * be listed in the output. If an error occurs while the image is being
     * generated, the <code>MEDIA_ERROR</code> will be listed in the output as
     * the cause of the missing image.
     * </p>
     */
    private java.util.List<Image> images = new java.util.ArrayList<Image>();

    /**
     * <p>
     * The encrypted token that was used in the request to get more images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]+={0,2}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * The list of images generated from the video stream. If there is no media
     * available for the given timestamp, the <code>NO_MEDIA</code> error will
     * be listed in the output. If an error occurs while the image is being
     * generated, the <code>MEDIA_ERROR</code> will be listed in the output as
     * the cause of the missing image.
     * </p>
     *
     * @return <p>
     *         The list of images generated from the video stream. If there is
     *         no media available for the given timestamp, the
     *         <code>NO_MEDIA</code> error will be listed in the output. If an
     *         error occurs while the image is being generated, the
     *         <code>MEDIA_ERROR</code> will be listed in the output as the
     *         cause of the missing image.
     *         </p>
     */
    public java.util.List<Image> getImages() {
        return images;
    }

    /**
     * <p>
     * The list of images generated from the video stream. If there is no media
     * available for the given timestamp, the <code>NO_MEDIA</code> error will
     * be listed in the output. If an error occurs while the image is being
     * generated, the <code>MEDIA_ERROR</code> will be listed in the output as
     * the cause of the missing image.
     * </p>
     *
     * @param images <p>
     *            The list of images generated from the video stream. If there
     *            is no media available for the given timestamp, the
     *            <code>NO_MEDIA</code> error will be listed in the output. If
     *            an error occurs while the image is being generated, the
     *            <code>MEDIA_ERROR</code> will be listed in the output as the
     *            cause of the missing image.
     *            </p>
     */
    public void setImages(java.util.Collection<Image> images) {
        if (images == null) {
            this.images = null;
            return;
        }

        this.images = new java.util.ArrayList<Image>(images);
    }

    /**
     * <p>
     * The list of images generated from the video stream. If there is no media
     * available for the given timestamp, the <code>NO_MEDIA</code> error will
     * be listed in the output. If an error occurs while the image is being
     * generated, the <code>MEDIA_ERROR</code> will be listed in the output as
     * the cause of the missing image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param images <p>
     *            The list of images generated from the video stream. If there
     *            is no media available for the given timestamp, the
     *            <code>NO_MEDIA</code> error will be listed in the output. If
     *            an error occurs while the image is being generated, the
     *            <code>MEDIA_ERROR</code> will be listed in the output as the
     *            cause of the missing image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagesResult withImages(Image... images) {
        if (getImages() == null) {
            this.images = new java.util.ArrayList<Image>(images.length);
        }
        for (Image value : images) {
            this.images.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of images generated from the video stream. If there is no media
     * available for the given timestamp, the <code>NO_MEDIA</code> error will
     * be listed in the output. If an error occurs while the image is being
     * generated, the <code>MEDIA_ERROR</code> will be listed in the output as
     * the cause of the missing image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param images <p>
     *            The list of images generated from the video stream. If there
     *            is no media available for the given timestamp, the
     *            <code>NO_MEDIA</code> error will be listed in the output. If
     *            an error occurs while the image is being generated, the
     *            <code>MEDIA_ERROR</code> will be listed in the output as the
     *            cause of the missing image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagesResult withImages(java.util.Collection<Image> images) {
        setImages(images);
        return this;
    }

    /**
     * <p>
     * The encrypted token that was used in the request to get more images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]+={0,2}<br/>
     *
     * @return <p>
     *         The encrypted token that was used in the request to get more
     *         images.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The encrypted token that was used in the request to get more images.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]+={0,2}<br/>
     *
     * @param nextToken <p>
     *            The encrypted token that was used in the request to get more
     *            images.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The encrypted token that was used in the request to get more images.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4096<br/>
     * <b>Pattern: </b>[a-zA-Z0-9+/]+={0,2}<br/>
     *
     * @param nextToken <p>
     *            The encrypted token that was used in the request to get more
     *            images.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetImagesResult withNextToken(String nextToken) {
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
        if (getImages() != null)
            sb.append("Images: " + getImages() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImages() == null) ? 0 : getImages().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetImagesResult == false)
            return false;
        GetImagesResult other = (GetImagesResult) obj;

        if (other.getImages() == null ^ this.getImages() == null)
            return false;
        if (other.getImages() != null && other.getImages().equals(this.getImages()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
