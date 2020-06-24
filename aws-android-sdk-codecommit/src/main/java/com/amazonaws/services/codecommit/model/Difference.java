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
 * Returns information about a set of differences for a commit specifier.
 * </p>
 */
public class Difference implements Serializable {
    /**
     * <p>
     * Information about a <code>beforeBlob</code> data type object, including
     * the ID, the file mode permission code, and the path.
     * </p>
     */
    private BlobMetadata beforeBlob;

    /**
     * <p>
     * Information about an <code>afterBlob</code> data type object, including
     * the ID, the file mode permission code, and the path.
     * </p>
     */
    private BlobMetadata afterBlob;

    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion
     * (D), or modification (M).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     */
    private String changeType;

    /**
     * <p>
     * Information about a <code>beforeBlob</code> data type object, including
     * the ID, the file mode permission code, and the path.
     * </p>
     *
     * @return <p>
     *         Information about a <code>beforeBlob</code> data type object,
     *         including the ID, the file mode permission code, and the path.
     *         </p>
     */
    public BlobMetadata getBeforeBlob() {
        return beforeBlob;
    }

    /**
     * <p>
     * Information about a <code>beforeBlob</code> data type object, including
     * the ID, the file mode permission code, and the path.
     * </p>
     *
     * @param beforeBlob <p>
     *            Information about a <code>beforeBlob</code> data type object,
     *            including the ID, the file mode permission code, and the path.
     *            </p>
     */
    public void setBeforeBlob(BlobMetadata beforeBlob) {
        this.beforeBlob = beforeBlob;
    }

    /**
     * <p>
     * Information about a <code>beforeBlob</code> data type object, including
     * the ID, the file mode permission code, and the path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param beforeBlob <p>
     *            Information about a <code>beforeBlob</code> data type object,
     *            including the ID, the file mode permission code, and the path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Difference withBeforeBlob(BlobMetadata beforeBlob) {
        this.beforeBlob = beforeBlob;
        return this;
    }

    /**
     * <p>
     * Information about an <code>afterBlob</code> data type object, including
     * the ID, the file mode permission code, and the path.
     * </p>
     *
     * @return <p>
     *         Information about an <code>afterBlob</code> data type object,
     *         including the ID, the file mode permission code, and the path.
     *         </p>
     */
    public BlobMetadata getAfterBlob() {
        return afterBlob;
    }

    /**
     * <p>
     * Information about an <code>afterBlob</code> data type object, including
     * the ID, the file mode permission code, and the path.
     * </p>
     *
     * @param afterBlob <p>
     *            Information about an <code>afterBlob</code> data type object,
     *            including the ID, the file mode permission code, and the path.
     *            </p>
     */
    public void setAfterBlob(BlobMetadata afterBlob) {
        this.afterBlob = afterBlob;
    }

    /**
     * <p>
     * Information about an <code>afterBlob</code> data type object, including
     * the ID, the file mode permission code, and the path.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param afterBlob <p>
     *            Information about an <code>afterBlob</code> data type object,
     *            including the ID, the file mode permission code, and the path.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Difference withAfterBlob(BlobMetadata afterBlob) {
        this.afterBlob = afterBlob;
        return this;
    }

    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion
     * (D), or modification (M).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @return <p>
     *         Whether the change type of the difference is an addition (A),
     *         deletion (D), or modification (M).
     *         </p>
     * @see ChangeTypeEnum
     */
    public String getChangeType() {
        return changeType;
    }

    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion
     * (D), or modification (M).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param changeType <p>
     *            Whether the change type of the difference is an addition (A),
     *            deletion (D), or modification (M).
     *            </p>
     * @see ChangeTypeEnum
     */
    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion
     * (D), or modification (M).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param changeType <p>
     *            Whether the change type of the difference is an addition (A),
     *            deletion (D), or modification (M).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeTypeEnum
     */
    public Difference withChangeType(String changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion
     * (D), or modification (M).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param changeType <p>
     *            Whether the change type of the difference is an addition (A),
     *            deletion (D), or modification (M).
     *            </p>
     * @see ChangeTypeEnum
     */
    public void setChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType.toString();
    }

    /**
     * <p>
     * Whether the change type of the difference is an addition (A), deletion
     * (D), or modification (M).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>A, M, D
     *
     * @param changeType <p>
     *            Whether the change type of the difference is an addition (A),
     *            deletion (D), or modification (M).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ChangeTypeEnum
     */
    public Difference withChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType.toString();
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
        if (getBeforeBlob() != null)
            sb.append("beforeBlob: " + getBeforeBlob() + ",");
        if (getAfterBlob() != null)
            sb.append("afterBlob: " + getAfterBlob() + ",");
        if (getChangeType() != null)
            sb.append("changeType: " + getChangeType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBeforeBlob() == null) ? 0 : getBeforeBlob().hashCode());
        hashCode = prime * hashCode + ((getAfterBlob() == null) ? 0 : getAfterBlob().hashCode());
        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Difference == false)
            return false;
        Difference other = (Difference) obj;

        if (other.getBeforeBlob() == null ^ this.getBeforeBlob() == null)
            return false;
        if (other.getBeforeBlob() != null
                && other.getBeforeBlob().equals(this.getBeforeBlob()) == false)
            return false;
        if (other.getAfterBlob() == null ^ this.getAfterBlob() == null)
            return false;
        if (other.getAfterBlob() != null
                && other.getAfterBlob().equals(this.getAfterBlob()) == false)
            return false;
        if (other.getChangeType() == null ^ this.getChangeType() == null)
            return false;
        if (other.getChangeType() != null
                && other.getChangeType().equals(this.getChangeType()) == false)
            return false;
        return true;
    }
}
