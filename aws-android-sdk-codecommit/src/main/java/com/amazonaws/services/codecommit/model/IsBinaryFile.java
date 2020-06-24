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
 * Information about whether a file is binary or textual in a merge or pull
 * request operation.
 * </p>
 */
public class IsBinaryFile implements Serializable {
    /**
     * <p>
     * The binary or non-binary status of file in the source of a merge or pull
     * request.
     * </p>
     */
    private Boolean source;

    /**
     * <p>
     * The binary or non-binary status of a file in the destination of a merge
     * or pull request.
     * </p>
     */
    private Boolean destination;

    /**
     * <p>
     * The binary or non-binary status of a file in the base of a merge or pull
     * request.
     * </p>
     */
    private Boolean base;

    /**
     * <p>
     * The binary or non-binary status of file in the source of a merge or pull
     * request.
     * </p>
     *
     * @return <p>
     *         The binary or non-binary status of file in the source of a merge
     *         or pull request.
     *         </p>
     */
    public Boolean isSource() {
        return source;
    }

    /**
     * <p>
     * The binary or non-binary status of file in the source of a merge or pull
     * request.
     * </p>
     *
     * @return <p>
     *         The binary or non-binary status of file in the source of a merge
     *         or pull request.
     *         </p>
     */
    public Boolean getSource() {
        return source;
    }

    /**
     * <p>
     * The binary or non-binary status of file in the source of a merge or pull
     * request.
     * </p>
     *
     * @param source <p>
     *            The binary or non-binary status of file in the source of a
     *            merge or pull request.
     *            </p>
     */
    public void setSource(Boolean source) {
        this.source = source;
    }

    /**
     * <p>
     * The binary or non-binary status of file in the source of a merge or pull
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param source <p>
     *            The binary or non-binary status of file in the source of a
     *            merge or pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IsBinaryFile withSource(Boolean source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The binary or non-binary status of a file in the destination of a merge
     * or pull request.
     * </p>
     *
     * @return <p>
     *         The binary or non-binary status of a file in the destination of a
     *         merge or pull request.
     *         </p>
     */
    public Boolean isDestination() {
        return destination;
    }

    /**
     * <p>
     * The binary or non-binary status of a file in the destination of a merge
     * or pull request.
     * </p>
     *
     * @return <p>
     *         The binary or non-binary status of a file in the destination of a
     *         merge or pull request.
     *         </p>
     */
    public Boolean getDestination() {
        return destination;
    }

    /**
     * <p>
     * The binary or non-binary status of a file in the destination of a merge
     * or pull request.
     * </p>
     *
     * @param destination <p>
     *            The binary or non-binary status of a file in the destination
     *            of a merge or pull request.
     *            </p>
     */
    public void setDestination(Boolean destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The binary or non-binary status of a file in the destination of a merge
     * or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destination <p>
     *            The binary or non-binary status of a file in the destination
     *            of a merge or pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IsBinaryFile withDestination(Boolean destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * The binary or non-binary status of a file in the base of a merge or pull
     * request.
     * </p>
     *
     * @return <p>
     *         The binary or non-binary status of a file in the base of a merge
     *         or pull request.
     *         </p>
     */
    public Boolean isBase() {
        return base;
    }

    /**
     * <p>
     * The binary or non-binary status of a file in the base of a merge or pull
     * request.
     * </p>
     *
     * @return <p>
     *         The binary or non-binary status of a file in the base of a merge
     *         or pull request.
     *         </p>
     */
    public Boolean getBase() {
        return base;
    }

    /**
     * <p>
     * The binary or non-binary status of a file in the base of a merge or pull
     * request.
     * </p>
     *
     * @param base <p>
     *            The binary or non-binary status of a file in the base of a
     *            merge or pull request.
     *            </p>
     */
    public void setBase(Boolean base) {
        this.base = base;
    }

    /**
     * <p>
     * The binary or non-binary status of a file in the base of a merge or pull
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param base <p>
     *            The binary or non-binary status of a file in the base of a
     *            merge or pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IsBinaryFile withBase(Boolean base) {
        this.base = base;
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

        if (obj instanceof IsBinaryFile == false)
            return false;
        IsBinaryFile other = (IsBinaryFile) obj;

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
