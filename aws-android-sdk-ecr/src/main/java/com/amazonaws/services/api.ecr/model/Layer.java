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
 * An object representing an Amazon ECR image layer.
 * </p>
 */
public class Layer implements Serializable {
    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     */
    private String layerDigest;

    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     */
    private String layerAvailability;

    /**
     * <p>
     * The size, in bytes, of the image layer.
     * </p>
     */
    private Long layerSize;

    /**
     * <p>
     * The media type of the layer, such as
     * <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     * <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     * </p>
     */
    private String mediaType;

    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     *
     * @return <p>
     *         The <code>sha256</code> digest of the image layer.
     *         </p>
     */
    public String getLayerDigest() {
        return layerDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     *
     * @param layerDigest <p>
     *            The <code>sha256</code> digest of the image layer.
     *            </p>
     */
    public void setLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image layer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[a-zA-Z0-9-_+.]+:[a-fA-F0-9]+<br/>
     *
     * @param layerDigest <p>
     *            The <code>sha256</code> digest of the image layer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Layer withLayerDigest(String layerDigest) {
        this.layerDigest = layerDigest;
        return this;
    }

    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     *
     * @return <p>
     *         The availability status of the image layer.
     *         </p>
     * @see LayerAvailability
     */
    public String getLayerAvailability() {
        return layerAvailability;
    }

    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     *
     * @param layerAvailability <p>
     *            The availability status of the image layer.
     *            </p>
     * @see LayerAvailability
     */
    public void setLayerAvailability(String layerAvailability) {
        this.layerAvailability = layerAvailability;
    }

    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     *
     * @param layerAvailability <p>
     *            The availability status of the image layer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LayerAvailability
     */
    public Layer withLayerAvailability(String layerAvailability) {
        this.layerAvailability = layerAvailability;
        return this;
    }

    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     *
     * @param layerAvailability <p>
     *            The availability status of the image layer.
     *            </p>
     * @see LayerAvailability
     */
    public void setLayerAvailability(LayerAvailability layerAvailability) {
        this.layerAvailability = layerAvailability.toString();
    }

    /**
     * <p>
     * The availability status of the image layer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>AVAILABLE, UNAVAILABLE
     *
     * @param layerAvailability <p>
     *            The availability status of the image layer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LayerAvailability
     */
    public Layer withLayerAvailability(LayerAvailability layerAvailability) {
        this.layerAvailability = layerAvailability.toString();
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the image layer.
     * </p>
     *
     * @return <p>
     *         The size, in bytes, of the image layer.
     *         </p>
     */
    public Long getLayerSize() {
        return layerSize;
    }

    /**
     * <p>
     * The size, in bytes, of the image layer.
     * </p>
     *
     * @param layerSize <p>
     *            The size, in bytes, of the image layer.
     *            </p>
     */
    public void setLayerSize(Long layerSize) {
        this.layerSize = layerSize;
    }

    /**
     * <p>
     * The size, in bytes, of the image layer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param layerSize <p>
     *            The size, in bytes, of the image layer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Layer withLayerSize(Long layerSize) {
        this.layerSize = layerSize;
        return this;
    }

    /**
     * <p>
     * The media type of the layer, such as
     * <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     * <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     * </p>
     *
     * @return <p>
     *         The media type of the layer, such as
     *         <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     *         <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     *         </p>
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * <p>
     * The media type of the layer, such as
     * <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     * <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     * </p>
     *
     * @param mediaType <p>
     *            The media type of the layer, such as
     *            <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code>
     *            or <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     *            </p>
     */
    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * <p>
     * The media type of the layer, such as
     * <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code> or
     * <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param mediaType <p>
     *            The media type of the layer, such as
     *            <code>application/vnd.docker.image.rootfs.diff.tar.gzip</code>
     *            or <code>application/vnd.oci.image.layer.v1.tar+gzip</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Layer withMediaType(String mediaType) {
        this.mediaType = mediaType;
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
        if (getLayerDigest() != null)
            sb.append("layerDigest: " + getLayerDigest() + ",");
        if (getLayerAvailability() != null)
            sb.append("layerAvailability: " + getLayerAvailability() + ",");
        if (getLayerSize() != null)
            sb.append("layerSize: " + getLayerSize() + ",");
        if (getMediaType() != null)
            sb.append("mediaType: " + getMediaType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLayerDigest() == null) ? 0 : getLayerDigest().hashCode());
        hashCode = prime * hashCode
                + ((getLayerAvailability() == null) ? 0 : getLayerAvailability().hashCode());
        hashCode = prime * hashCode + ((getLayerSize() == null) ? 0 : getLayerSize().hashCode());
        hashCode = prime * hashCode + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Layer == false)
            return false;
        Layer other = (Layer) obj;

        if (other.getLayerDigest() == null ^ this.getLayerDigest() == null)
            return false;
        if (other.getLayerDigest() != null
                && other.getLayerDigest().equals(this.getLayerDigest()) == false)
            return false;
        if (other.getLayerAvailability() == null ^ this.getLayerAvailability() == null)
            return false;
        if (other.getLayerAvailability() != null
                && other.getLayerAvailability().equals(this.getLayerAvailability()) == false)
            return false;
        if (other.getLayerSize() == null ^ this.getLayerSize() == null)
            return false;
        if (other.getLayerSize() != null
                && other.getLayerSize().equals(this.getLayerSize()) == false)
            return false;
        if (other.getMediaType() == null ^ this.getMediaType() == null)
            return false;
        if (other.getMediaType() != null
                && other.getMediaType().equals(this.getMediaType()) == false)
            return false;
        return true;
    }
}
