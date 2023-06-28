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

package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;

/**
 * <p>
 * The structure that contains the information required to deliver images to a
 * customer.
 * </p>
 */
public class ImageGenerationDestinationConfig implements Serializable {
    /**
     * <p>
     * The Uniform Resource Identifier (URI) that identifies where the images
     * will be delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z_0-9]+:(//)?([^/]+)/?([^*]*)$<br/>
     */
    private String uri;

    /**
     * <p>
     * The Amazon Web Services Region of the S3 bucket where images will be
     * delivered. This <code>DestinationRegion</code> must match the Region
     * where the stream is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 14<br/>
     * <b>Pattern: </b>^[a-z]+(-[a-z]+)?-[a-z]+-[0-9]$<br/>
     */
    private String destinationRegion;

    /**
     * <p>
     * The Uniform Resource Identifier (URI) that identifies where the images
     * will be delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z_0-9]+:(//)?([^/]+)/?([^*]*)$<br/>
     *
     * @return <p>
     *         The Uniform Resource Identifier (URI) that identifies where the
     *         images will be delivered.
     *         </p>
     */
    public String getUri() {
        return uri;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) that identifies where the images
     * will be delivered.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z_0-9]+:(//)?([^/]+)/?([^*]*)$<br/>
     *
     * @param uri <p>
     *            The Uniform Resource Identifier (URI) that identifies where
     *            the images will be delivered.
     *            </p>
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * <p>
     * The Uniform Resource Identifier (URI) that identifies where the images
     * will be delivered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>^[a-zA-Z_0-9]+:(//)?([^/]+)/?([^*]*)$<br/>
     *
     * @param uri <p>
     *            The Uniform Resource Identifier (URI) that identifies where
     *            the images will be delivered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageGenerationDestinationConfig withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the S3 bucket where images will be
     * delivered. This <code>DestinationRegion</code> must match the Region
     * where the stream is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 14<br/>
     * <b>Pattern: </b>^[a-z]+(-[a-z]+)?-[a-z]+-[0-9]$<br/>
     *
     * @return <p>
     *         The Amazon Web Services Region of the S3 bucket where images will
     *         be delivered. This <code>DestinationRegion</code> must match the
     *         Region where the stream is located.
     *         </p>
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the S3 bucket where images will be
     * delivered. This <code>DestinationRegion</code> must match the Region
     * where the stream is located.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 14<br/>
     * <b>Pattern: </b>^[a-z]+(-[a-z]+)?-[a-z]+-[0-9]$<br/>
     *
     * @param destinationRegion <p>
     *            The Amazon Web Services Region of the S3 bucket where images
     *            will be delivered. This <code>DestinationRegion</code> must
     *            match the Region where the stream is located.
     *            </p>
     */
    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the S3 bucket where images will be
     * delivered. This <code>DestinationRegion</code> must match the Region
     * where the stream is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>9 - 14<br/>
     * <b>Pattern: </b>^[a-z]+(-[a-z]+)?-[a-z]+-[0-9]$<br/>
     *
     * @param destinationRegion <p>
     *            The Amazon Web Services Region of the S3 bucket where images
     *            will be delivered. This <code>DestinationRegion</code> must
     *            match the Region where the stream is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageGenerationDestinationConfig withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
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
        if (getUri() != null)
            sb.append("Uri: " + getUri() + ",");
        if (getDestinationRegion() != null)
            sb.append("DestinationRegion: " + getDestinationRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUri() == null) ? 0 : getUri().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationRegion() == null) ? 0 : getDestinationRegion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageGenerationDestinationConfig == false)
            return false;
        ImageGenerationDestinationConfig other = (ImageGenerationDestinationConfig) obj;

        if (other.getUri() == null ^ this.getUri() == null)
            return false;
        if (other.getUri() != null && other.getUri().equals(this.getUri()) == false)
            return false;
        if (other.getDestinationRegion() == null ^ this.getDestinationRegion() == null)
            return false;
        if (other.getDestinationRegion() != null
                && other.getDestinationRegion().equals(this.getDestinationRegion()) == false)
            return false;
        return true;
    }
}
