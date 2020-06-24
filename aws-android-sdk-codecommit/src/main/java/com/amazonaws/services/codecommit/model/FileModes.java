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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Information about file modes in a merge or pull request.
 * </p>
 */
public class FileModes implements Serializable {
    /**
     * <p>
     * The file mode of a file in the source of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     */
    private String source;

    /**
     * <p>
     * The file mode of a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     */
    private String destination;

    /**
     * <p>
     * The file mode of a file in the base of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     */
    private String base;

    /**
     * <p>
     * The file mode of a file in the source of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @return <p>
     *         The file mode of a file in the source of a merge or pull request.
     *         </p>
     * @see FileModeTypeEnum
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The file mode of a file in the source of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param source <p>
     *            The file mode of a file in the source of a merge or pull
     *            request.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The file mode of a file in the source of a merge or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param source <p>
     *            The file mode of a file in the source of a merge or pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public FileModes withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The file mode of a file in the source of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param source <p>
     *            The file mode of a file in the source of a merge or pull
     *            request.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setSource(FileModeTypeEnum source) {
        this.source = source.toString();
    }

    /**
     * <p>
     * The file mode of a file in the source of a merge or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param source <p>
     *            The file mode of a file in the source of a merge or pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public FileModes withSource(FileModeTypeEnum source) {
        this.source = source.toString();
        return this;
    }

    /**
     * <p>
     * The file mode of a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @return <p>
     *         The file mode of a file in the destination of a merge or pull
     *         request.
     *         </p>
     * @see FileModeTypeEnum
     */
    public String getDestination() {
        return destination;
    }

    /**
     * <p>
     * The file mode of a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param destination <p>
     *            The file mode of a file in the destination of a merge or pull
     *            request.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The file mode of a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param destination <p>
     *            The file mode of a file in the destination of a merge or pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public FileModes withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * The file mode of a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param destination <p>
     *            The file mode of a file in the destination of a merge or pull
     *            request.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setDestination(FileModeTypeEnum destination) {
        this.destination = destination.toString();
    }

    /**
     * <p>
     * The file mode of a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param destination <p>
     *            The file mode of a file in the destination of a merge or pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public FileModes withDestination(FileModeTypeEnum destination) {
        this.destination = destination.toString();
        return this;
    }

    /**
     * <p>
     * The file mode of a file in the base of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @return <p>
     *         The file mode of a file in the base of a merge or pull request.
     *         </p>
     * @see FileModeTypeEnum
     */
    public String getBase() {
        return base;
    }

    /**
     * <p>
     * The file mode of a file in the base of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param base <p>
     *            The file mode of a file in the base of a merge or pull
     *            request.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setBase(String base) {
        this.base = base;
    }

    /**
     * <p>
     * The file mode of a file in the base of a merge or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param base <p>
     *            The file mode of a file in the base of a merge or pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public FileModes withBase(String base) {
        this.base = base;
        return this;
    }

    /**
     * <p>
     * The file mode of a file in the base of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param base <p>
     *            The file mode of a file in the base of a merge or pull
     *            request.
     *            </p>
     * @see FileModeTypeEnum
     */
    public void setBase(FileModeTypeEnum base) {
        this.base = base.toString();
    }

    /**
     * <p>
     * The file mode of a file in the base of a merge or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>EXECUTABLE, NORMAL, SYMLINK
     *
     * @param base <p>
     *            The file mode of a file in the base of a merge or pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see FileModeTypeEnum
     */
    public FileModes withBase(FileModeTypeEnum base) {
        this.base = base.toString();
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
        if (getSource() != null)
            sb.append("source: " + getSource() + ",");
        if (getDestination() != null)
            sb.append("destination: " + getDestination() + ",");
        if (getBase() != null)
            sb.append("base: " + getBase());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode
                + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getBase() == null) ? 0 : getBase().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileModes == false)
            return false;
        FileModes other = (FileModes) obj;

        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getBase() == null ^ this.getBase() == null)
            return false;
        if (other.getBase() != null && other.getBase().equals(this.getBase()) == false)
            return false;
        return true;
    }
}
