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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * The information for a change request.
 * </p>
 */
public class ChangeBatch implements Serializable {
    /**
     * <p>
     * <i>Optional:</i> Any comments you want to include about a change batch
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String comment;

    /**
     * <p>
     * Information about the changes to make to the record sets.
     * </p>
     */
    private java.util.List<Change> changes;

    /**
     * <p>
     * <i>Optional:</i> Any comments you want to include about a change batch
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         <i>Optional:</i> Any comments you want to include about a change
     *         batch request.
     *         </p>
     */
    public String getComment() {
        return comment;
    }

    /**
     * <p>
     * <i>Optional:</i> Any comments you want to include about a change batch
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param comment <p>
     *            <i>Optional:</i> Any comments you want to include about a
     *            change batch request.
     *            </p>
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * <i>Optional:</i> Any comments you want to include about a change batch
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param comment <p>
     *            <i>Optional:</i> Any comments you want to include about a
     *            change batch request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeBatch withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * <p>
     * Information about the changes to make to the record sets.
     * </p>
     *
     * @return <p>
     *         Information about the changes to make to the record sets.
     *         </p>
     */
    public java.util.List<Change> getChanges() {
        return changes;
    }

    /**
     * <p>
     * Information about the changes to make to the record sets.
     * </p>
     *
     * @param changes <p>
     *            Information about the changes to make to the record sets.
     *            </p>
     */
    public void setChanges(java.util.Collection<Change> changes) {
        if (changes == null) {
            this.changes = null;
            return;
        }

        this.changes = new java.util.ArrayList<Change>(changes);
    }

    /**
     * <p>
     * Information about the changes to make to the record sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changes <p>
     *            Information about the changes to make to the record sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeBatch withChanges(Change... changes) {
        if (getChanges() == null) {
            this.changes = new java.util.ArrayList<Change>(changes.length);
        }
        for (Change value : changes) {
            this.changes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the changes to make to the record sets.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param changes <p>
     *            Information about the changes to make to the record sets.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ChangeBatch withChanges(java.util.Collection<Change> changes) {
        setChanges(changes);
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
            sb.append("Comment: " + getComment() + ",");
        if (getChanges() != null)
            sb.append("Changes: " + getChanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getChanges() == null) ? 0 : getChanges().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangeBatch == false)
            return false;
        ChangeBatch other = (ChangeBatch) obj;

        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getChanges() == null ^ this.getChanges() == null)
            return false;
        if (other.getChanges() != null && other.getChanges().equals(this.getChanges()) == false)
            return false;
        return true;
    }
}
