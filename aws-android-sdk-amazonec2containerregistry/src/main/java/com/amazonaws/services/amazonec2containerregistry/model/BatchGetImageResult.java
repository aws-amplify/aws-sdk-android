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

public class BatchGetImageResult implements Serializable {
    /**
     * <p>
     * A list of image objects corresponding to the image references in the
     * request.
     * </p>
     */
    private java.util.List<Image> images;

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     */
    private java.util.List<ImageFailure> failures;

    /**
     * <p>
     * A list of image objects corresponding to the image references in the
     * request.
     * </p>
     *
     * @return <p>
     *         A list of image objects corresponding to the image references in
     *         the request.
     *         </p>
     */
    public java.util.List<Image> getImages() {
        return images;
    }

    /**
     * <p>
     * A list of image objects corresponding to the image references in the
     * request.
     * </p>
     *
     * @param images <p>
     *            A list of image objects corresponding to the image references
     *            in the request.
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
     * A list of image objects corresponding to the image references in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param images <p>
     *            A list of image objects corresponding to the image references
     *            in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetImageResult withImages(Image... images) {
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
     * A list of image objects corresponding to the image references in the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param images <p>
     *            A list of image objects corresponding to the image references
     *            in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetImageResult withImages(java.util.Collection<Image> images) {
        setImages(images);
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     *
     * @return <p>
     *         Any failures associated with the call.
     *         </p>
     */
    public java.util.List<ImageFailure> getFailures() {
        return failures;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     */
    public void setFailures(java.util.Collection<ImageFailure> failures) {
        if (failures == null) {
            this.failures = null;
            return;
        }

        this.failures = new java.util.ArrayList<ImageFailure>(failures);
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetImageResult withFailures(ImageFailure... failures) {
        if (getFailures() == null) {
            this.failures = new java.util.ArrayList<ImageFailure>(failures.length);
        }
        for (ImageFailure value : failures) {
            this.failures.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Any failures associated with the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param failures <p>
     *            Any failures associated with the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchGetImageResult withFailures(java.util.Collection<ImageFailure> failures) {
        setFailures(failures);
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
            sb.append("images: " + getImages() + ",");
        if (getFailures() != null)
            sb.append("failures: " + getFailures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImages() == null) ? 0 : getImages().hashCode());
        hashCode = prime * hashCode + ((getFailures() == null) ? 0 : getFailures().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetImageResult == false)
            return false;
        BatchGetImageResult other = (BatchGetImageResult) obj;

        if (other.getImages() == null ^ this.getImages() == null)
            return false;
        if (other.getImages() != null && other.getImages().equals(this.getImages()) == false)
            return false;
        if (other.getFailures() == null ^ this.getFailures() == null)
            return false;
        if (other.getFailures() != null && other.getFailures().equals(this.getFailures()) == false)
            return false;
        return true;
    }
}
