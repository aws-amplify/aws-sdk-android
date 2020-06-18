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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * An attachment to a case communication. The attachment consists of the file
 * name and the content of the file.
 * </p>
 */
public class Attachment implements Serializable {
    /**
     * <p>
     * The name of the attachment file.
     * </p>
     */
    private String fileName;

    /**
     * <p>
     * The content of the attachment file.
     * </p>
     */
    private java.nio.ByteBuffer data;

    /**
     * <p>
     * The name of the attachment file.
     * </p>
     *
     * @return <p>
     *         The name of the attachment file.
     *         </p>
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * <p>
     * The name of the attachment file.
     * </p>
     *
     * @param fileName <p>
     *            The name of the attachment file.
     *            </p>
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The name of the attachment file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileName <p>
     *            The name of the attachment file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attachment withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * <p>
     * The content of the attachment file.
     * </p>
     *
     * @return <p>
     *         The content of the attachment file.
     *         </p>
     */
    public java.nio.ByteBuffer getData() {
        return data;
    }

    /**
     * <p>
     * The content of the attachment file.
     * </p>
     *
     * @param data <p>
     *            The content of the attachment file.
     *            </p>
     */
    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The content of the attachment file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param data <p>
     *            The content of the attachment file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Attachment withData(java.nio.ByteBuffer data) {
        this.data = data;
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
        if (getFileName() != null)
            sb.append("fileName: " + getFileName() + ",");
        if (getData() != null)
            sb.append("data: " + getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attachment == false)
            return false;
        Attachment other = (Attachment) obj;

        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }
}
