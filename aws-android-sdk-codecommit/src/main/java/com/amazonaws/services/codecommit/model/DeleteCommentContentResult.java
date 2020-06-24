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

public class DeleteCommentContentResult implements Serializable {
    /**
     * <p>
     * Information about the comment you just deleted.
     * </p>
     */
    private Comment comment;

    /**
     * <p>
     * Information about the comment you just deleted.
     * </p>
     *
     * @return <p>
     *         Information about the comment you just deleted.
     *         </p>
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * <p>
     * Information about the comment you just deleted.
     * </p>
     *
     * @param comment <p>
     *            Information about the comment you just deleted.
     *            </p>
     */
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Information about the comment you just deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param comment <p>
     *            Information about the comment you just deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteCommentContentResult withComment(Comment comment) {
        this.comment = comment;
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
        if (getComment() != null)
            sb.append("comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteCommentContentResult == false)
            return false;
        DeleteCommentContentResult other = (DeleteCommentContentResult) obj;

        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }
}
