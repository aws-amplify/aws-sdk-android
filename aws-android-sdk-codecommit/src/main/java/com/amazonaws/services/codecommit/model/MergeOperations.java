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
 * Information about the file operation conflicts in a merge operation.
 * </p>
 */
public class MergeOperations implements Serializable {
    /**
     * <p>
     * The operation (add, modify, or delete) on a file in the source of a merge
     * or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     */
    private String source;

    /**
     * <p>
     * The operation on a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     */
    private String destination;

    /**
     * <p>
     * The operation (add, modify, or delete) on a file in the source of a merge
     * or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @return <p>
     *         The operation (add, modify, or delete) on a file in the source of
     *         a merge or pull request.
     *         </p>
     * @see ChangeTypeEnum
     */
    public String getSource() {
        return source;
    }

    /**
     * <p>
     * The operation (add, modify, or delete) on a file in the source of a merge
     * or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param source <p>
     *            The operation (add, modify, or delete) on a file in the source
     *            of a merge or pull request.
     *            </p>
     * @see ChangeTypeEnum
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The operation (add, modify, or delete) on a file in the source of a merge
     * or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param source <p>
     *            The operation (add, modify, or delete) on a file in the source
     *            of a merge or pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeTypeEnum
     */
    public MergeOperations withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * <p>
     * The operation (add, modify, or delete) on a file in the source of a merge
     * or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param source <p>
     *            The operation (add, modify, or delete) on a file in the source
     *            of a merge or pull request.
     *            </p>
     * @see ChangeTypeEnum
     */
    public void setSource(ChangeTypeEnum source) {
        this.source = source.toString();
    }

    /**
     * <p>
     * The operation (add, modify, or delete) on a file in the source of a merge
     * or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param source <p>
     *            The operation (add, modify, or delete) on a file in the source
     *            of a merge or pull request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeTypeEnum
     */
    public MergeOperations withSource(ChangeTypeEnum source) {
        this.source = source.toString();
        return this;
    }

    /**
     * <p>
     * The operation on a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @return <p>
     *         The operation on a file in the destination of a merge or pull
     *         request.
     *         </p>
     * @see ChangeTypeEnum
     */
    public String getDestination() {
        return destination;
    }

    /**
     * <p>
     * The operation on a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param destination <p>
     *            The operation on a file in the destination of a merge or pull
     *            request.
     *            </p>
     * @see ChangeTypeEnum
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The operation on a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param destination <p>
     *            The operation on a file in the destination of a merge or pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeTypeEnum
     */
    public MergeOperations withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * <p>
     * The operation on a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param destination <p>
     *            The operation on a file in the destination of a merge or pull
     *            request.
     *            </p>
     * @see ChangeTypeEnum
     */
    public void setDestination(ChangeTypeEnum destination) {
        this.destination = destination.toString();
    }

    /**
     * <p>
     * The operation on a file in the destination of a merge or pull request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param destination <p>
     *            The operation on a file in the destination of a merge or pull
     *            request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeTypeEnum
     */
    public MergeOperations withDestination(ChangeTypeEnum destination) {
        this.destination = destination.toString();
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
            sb.append("destination: " + getDestination());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MergeOperations == false)
            return false;
        MergeOperations other = (MergeOperations) obj;

        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null
                && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }
}
