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

package com.amazonaws.services.amazonec2containerregistry.model;

import java.io.Serializable;

/**
 * <p>
 * An object with identifying information for an Amazon ECR image.
 * </p>
 */
public class ImageIdentifier implements Serializable {
    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     */
    private String imageDigest;

    /**
     * <p>
     * The tag used for the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String imageTag;

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     *
     * @return <p>
     *         The <code>sha256</code> digest of the image manifest.
     *         </p>
     */
    public String getImageDigest() {
        return imageDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     *
     * @param imageDigest <p>
     *            The <code>sha256</code> digest of the image manifest.
     *            </p>
     */
    public void setImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
    }

    /**
     * <p>
     * The <code>sha256</code> digest of the image manifest.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageDigest <p>
     *            The <code>sha256</code> digest of the image manifest.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageIdentifier withImageDigest(String imageDigest) {
        this.imageDigest = imageDigest;
        return this;
    }

    /**
     * <p>
     * The tag used for the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The tag used for the image.
     *         </p>
     */
    public String getImageTag() {
        return imageTag;
    }

    /**
     * <p>
     * The tag used for the image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param imageTag <p>
     *            The tag used for the image.
     *            </p>
     */
    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    /**
     * <p>
     * The tag used for the image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param imageTag <p>
     *            The tag used for the image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImageIdentifier withImageTag(String imageTag) {
        this.imageTag = imageTag;
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
        if (getImageDigest() != null)
            sb.append("imageDigest: " + getImageDigest() + ",");
        if (getImageTag() != null)
            sb.append("imageTag: " + getImageTag());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImageDigest() == null) ? 0 : getImageDigest().hashCode());
        hashCode = prime * hashCode + ((getImageTag() == null) ? 0 : getImageTag().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageIdentifier == false)
            return false;
        ImageIdentifier other = (ImageIdentifier) obj;

        if (other.getImageDigest() == null ^ this.getImageDigest() == null)
            return false;
        if (other.getImageDigest() != null
                && other.getImageDigest().equals(this.getImageDigest()) == false)
            return false;
        if (other.getImageTag() == null ^ this.getImageTag() == null)
            return false;
        if (other.getImageTag() != null && other.getImageTag().equals(this.getImageTag()) == false)
            return false;
        return true;
    }
}
