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

/**
 * <p>
 * A structure that contains the <code>Timestamp</code>, <code>Error</code>, and
 * <code>ImageContent</code>.
 * </p>
 */
public class Image implements Serializable {
    /**
     * <p>
     * An attribute of the <code>Image</code> object that is used to extract an
     * image from the video stream. This field is used to manage gaps on images
     * or to better understand the pagination window.
     * </p>
     */
    private java.util.Date timeStamp;

    /**
     * <p>
     * The error message shown when the image for the provided timestamp was not
     * extracted due to a non-tryable error. An error will be returned if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no media that exists for the specified <code>Timestamp</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * The media for the specified time does not allow an image to be extracted.
     * In this case the media is audio only, or the incorrect media has been
     * ingested.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_MEDIA, MEDIA_ERROR
     */
    private String error;

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is Base64 encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6291456<br/>
     */
    private String imageContent;

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is used to extract an
     * image from the video stream. This field is used to manage gaps on images
     * or to better understand the pagination window.
     * </p>
     *
     * @return <p>
     *         An attribute of the <code>Image</code> object that is used to
     *         extract an image from the video stream. This field is used to
     *         manage gaps on images or to better understand the pagination
     *         window.
     *         </p>
     */
    public java.util.Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is used to extract an
     * image from the video stream. This field is used to manage gaps on images
     * or to better understand the pagination window.
     * </p>
     *
     * @param timeStamp <p>
     *            An attribute of the <code>Image</code> object that is used to
     *            extract an image from the video stream. This field is used to
     *            manage gaps on images or to better understand the pagination
     *            window.
     *            </p>
     */
    public void setTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is used to extract an
     * image from the video stream. This field is used to manage gaps on images
     * or to better understand the pagination window.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeStamp <p>
     *            An attribute of the <code>Image</code> object that is used to
     *            extract an image from the video stream. This field is used to
     *            manage gaps on images or to better understand the pagination
     *            window.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withTimeStamp(java.util.Date timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * <p>
     * The error message shown when the image for the provided timestamp was not
     * extracted due to a non-tryable error. An error will be returned if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no media that exists for the specified <code>Timestamp</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * The media for the specified time does not allow an image to be extracted.
     * In this case the media is audio only, or the incorrect media has been
     * ingested.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_MEDIA, MEDIA_ERROR
     *
     * @return <p>
     *         The error message shown when the image for the provided timestamp
     *         was not extracted due to a non-tryable error. An error will be
     *         returned if:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         There is no media that exists for the specified
     *         <code>Timestamp</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         The media for the specified time does not allow an image to be
     *         extracted. In this case the media is audio only, or the incorrect
     *         media has been ingested.
     *         </p>
     *         </li>
     *         </ul>
     * @see ImageError
     */
    public String getError() {
        return error;
    }

    /**
     * <p>
     * The error message shown when the image for the provided timestamp was not
     * extracted due to a non-tryable error. An error will be returned if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no media that exists for the specified <code>Timestamp</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * The media for the specified time does not allow an image to be extracted.
     * In this case the media is audio only, or the incorrect media has been
     * ingested.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_MEDIA, MEDIA_ERROR
     *
     * @param error <p>
     *            The error message shown when the image for the provided
     *            timestamp was not extracted due to a non-tryable error. An
     *            error will be returned if:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            There is no media that exists for the specified
     *            <code>Timestamp</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            The media for the specified time does not allow an image to be
     *            extracted. In this case the media is audio only, or the
     *            incorrect media has been ingested.
     *            </p>
     *            </li>
     *            </ul>
     * @see ImageError
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * The error message shown when the image for the provided timestamp was not
     * extracted due to a non-tryable error. An error will be returned if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no media that exists for the specified <code>Timestamp</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * The media for the specified time does not allow an image to be extracted.
     * In this case the media is audio only, or the incorrect media has been
     * ingested.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_MEDIA, MEDIA_ERROR
     *
     * @param error <p>
     *            The error message shown when the image for the provided
     *            timestamp was not extracted due to a non-tryable error. An
     *            error will be returned if:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            There is no media that exists for the specified
     *            <code>Timestamp</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            The media for the specified time does not allow an image to be
     *            extracted. In this case the media is audio only, or the
     *            incorrect media has been ingested.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageError
     */
    public Image withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * <p>
     * The error message shown when the image for the provided timestamp was not
     * extracted due to a non-tryable error. An error will be returned if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no media that exists for the specified <code>Timestamp</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * The media for the specified time does not allow an image to be extracted.
     * In this case the media is audio only, or the incorrect media has been
     * ingested.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_MEDIA, MEDIA_ERROR
     *
     * @param error <p>
     *            The error message shown when the image for the provided
     *            timestamp was not extracted due to a non-tryable error. An
     *            error will be returned if:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            There is no media that exists for the specified
     *            <code>Timestamp</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            The media for the specified time does not allow an image to be
     *            extracted. In this case the media is audio only, or the
     *            incorrect media has been ingested.
     *            </p>
     *            </li>
     *            </ul>
     * @see ImageError
     */
    public void setError(ImageError error) {
        this.error = error.toString();
    }

    /**
     * <p>
     * The error message shown when the image for the provided timestamp was not
     * extracted due to a non-tryable error. An error will be returned if:
     * </p>
     * <ul>
     * <li>
     * <p>
     * There is no media that exists for the specified <code>Timestamp</code>.
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * The media for the specified time does not allow an image to be extracted.
     * In this case the media is audio only, or the incorrect media has been
     * ingested.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NO_MEDIA, MEDIA_ERROR
     *
     * @param error <p>
     *            The error message shown when the image for the provided
     *            timestamp was not extracted due to a non-tryable error. An
     *            error will be returned if:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            There is no media that exists for the specified
     *            <code>Timestamp</code>.
     *            </p>
     *            </li>
     *            </ul>
     *            <ul>
     *            <li>
     *            <p>
     *            The media for the specified time does not allow an image to be
     *            extracted. In this case the media is audio only, or the
     *            incorrect media has been ingested.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ImageError
     */
    public Image withError(ImageError error) {
        this.error = error.toString();
        return this;
    }

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is Base64 encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6291456<br/>
     *
     * @return <p>
     *         An attribute of the <code>Image</code> object that is Base64
     *         encoded.
     *         </p>
     */
    public String getImageContent() {
        return imageContent;
    }

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is Base64 encoded.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6291456<br/>
     *
     * @param imageContent <p>
     *            An attribute of the <code>Image</code> object that is Base64
     *            encoded.
     *            </p>
     */
    public void setImageContent(String imageContent) {
        this.imageContent = imageContent;
    }

    /**
     * <p>
     * An attribute of the <code>Image</code> object that is Base64 encoded.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 6291456<br/>
     *
     * @param imageContent <p>
     *            An attribute of the <code>Image</code> object that is Base64
     *            encoded.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withImageContent(String imageContent) {
        this.imageContent = imageContent;
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
        if (getTimeStamp() != null)
            sb.append("TimeStamp: " + getTimeStamp() + ",");
        if (getError() != null)
            sb.append("Error: " + getError() + ",");
        if (getImageContent() != null)
            sb.append("ImageContent: " + getImageContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeStamp() == null) ? 0 : getTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode
                + ((getImageContent() == null) ? 0 : getImageContent().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;

        if (other.getTimeStamp() == null ^ this.getTimeStamp() == null)
            return false;
        if (other.getTimeStamp() != null
                && other.getTimeStamp().equals(this.getTimeStamp()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getImageContent() == null ^ this.getImageContent() == null)
            return false;
        if (other.getImageContent() != null
                && other.getImageContent().equals(this.getImageContent()) == false)
            return false;
        return true;
    }
}
