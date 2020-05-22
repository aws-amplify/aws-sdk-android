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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains an image that is one of the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * An image file. Choose this option to upload a new image.
 * </p>
 * </li>
 * <li>
 * <p>
 * The ID of an existing image. Choose this option to keep an existing image.
 * </p>
 * </li>
 * </ul>
 */
public class Image implements Serializable {
    /**
     * <p>
     * The ID of an existing image. Specify this parameter to keep an existing
     * image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     */
    private String id;

    /**
     * <p>
     * Contains an image file.
     * </p>
     */
    private ImageFile file;

    /**
     * <p>
     * The ID of an existing image. Specify this parameter to keep an existing
     * image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @return <p>
     *         The ID of an existing image. Specify this parameter to keep an
     *         existing image.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of an existing image. Specify this parameter to keep an existing
     * image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param id <p>
     *            The ID of an existing image. Specify this parameter to keep an
     *            existing image.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of an existing image. Specify this parameter to keep an existing
     * image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>36 - 36<br/>
     * <b>Pattern:
     * </b>^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$<br/>
     *
     * @param id <p>
     *            The ID of an existing image. Specify this parameter to keep an
     *            existing image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * Contains an image file.
     * </p>
     *
     * @return <p>
     *         Contains an image file.
     *         </p>
     */
    public ImageFile getFile() {
        return file;
    }

    /**
     * <p>
     * Contains an image file.
     * </p>
     *
     * @param file <p>
     *            Contains an image file.
     *            </p>
     */
    public void setFile(ImageFile file) {
        this.file = file;
    }

    /**
     * <p>
     * Contains an image file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param file <p>
     *            Contains an image file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Image withFile(ImageFile file) {
        this.file = file;
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getFile() != null)
            sb.append("file: " + getFile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getFile() == null) ? 0 : getFile().hashCode());
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

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getFile() == null ^ this.getFile() == null)
            return false;
        if (other.getFile() != null && other.getFile().equals(this.getFile()) == false)
            return false;
        return true;
    }
}
