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

package com.amazonaws.services.s3.model;

import java.io.Serializable;

public class DeleteObjectsResult implements Serializable {
    /**
     * <p>
     * Container element for a successful delete. It identifies the object that
     * was successfully deleted.
     * </p>
     */
    private java.util.List<DeletedObject> deleted;

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestCharged;

    /**
     * <p>
     * Container for a failed delete operation that describes the object that
     * Amazon S3 attempted to delete and the error it encountered.
     * </p>
     */
    private java.util.List<Error> errors;

    /**
     * <p>
     * Container element for a successful delete. It identifies the object that
     * was successfully deleted.
     * </p>
     *
     * @return <p>
     *         Container element for a successful delete. It identifies the
     *         object that was successfully deleted.
     *         </p>
     */
    public java.util.List<DeletedObject> getDeleted() {
        return deleted;
    }

    /**
     * <p>
     * Container element for a successful delete. It identifies the object that
     * was successfully deleted.
     * </p>
     *
     * @param deleted <p>
     *            Container element for a successful delete. It identifies the
     *            object that was successfully deleted.
     *            </p>
     */
    public void setDeleted(java.util.Collection<DeletedObject> deleted) {
        if (deleted == null) {
            this.deleted = null;
            return;
        }

        this.deleted = new java.util.ArrayList<DeletedObject>(deleted);
    }

    /**
     * <p>
     * Container element for a successful delete. It identifies the object that
     * was successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleted <p>
     *            Container element for a successful delete. It identifies the
     *            object that was successfully deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectsResult withDeleted(DeletedObject... deleted) {
        if (getDeleted() == null) {
            this.deleted = new java.util.ArrayList<DeletedObject>(deleted.length);
        }
        for (DeletedObject value : deleted) {
            this.deleted.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Container element for a successful delete. It identifies the object that
     * was successfully deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deleted <p>
     *            Container element for a successful delete. It identifies the
     *            object that was successfully deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectsResult withDeleted(java.util.Collection<DeletedObject> deleted) {
        setDeleted(deleted);
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         If present, indicates that the requester was successfully charged
     *         for the request.
     *         </p>
     * @see RequestCharged
     */
    public String getRequestCharged() {
        return requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public DeleteObjectsResult withRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public DeleteObjectsResult withRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
        return this;
    }

    /**
     * <p>
     * Container for a failed delete operation that describes the object that
     * Amazon S3 attempted to delete and the error it encountered.
     * </p>
     *
     * @return <p>
     *         Container for a failed delete operation that describes the object
     *         that Amazon S3 attempted to delete and the error it encountered.
     *         </p>
     */
    public java.util.List<Error> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Container for a failed delete operation that describes the object that
     * Amazon S3 attempted to delete and the error it encountered.
     * </p>
     *
     * @param errors <p>
     *            Container for a failed delete operation that describes the
     *            object that Amazon S3 attempted to delete and the error it
     *            encountered.
     *            </p>
     */
    public void setErrors(java.util.Collection<Error> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<Error>(errors);
    }

    /**
     * <p>
     * Container for a failed delete operation that describes the object that
     * Amazon S3 attempted to delete and the error it encountered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Container for a failed delete operation that describes the
     *            object that Amazon S3 attempted to delete and the error it
     *            encountered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectsResult withErrors(Error... errors) {
        if (getErrors() == null) {
            this.errors = new java.util.ArrayList<Error>(errors.length);
        }
        for (Error value : errors) {
            this.errors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Container for a failed delete operation that describes the object that
     * Amazon S3 attempted to delete and the error it encountered.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errors <p>
     *            Container for a failed delete operation that describes the
     *            object that Amazon S3 attempted to delete and the error it
     *            encountered.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteObjectsResult withErrors(java.util.Collection<Error> errors) {
        setErrors(errors);
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
        if (getDeleted() != null)
            sb.append("Deleted: " + getDeleted() + ",");
        if (getRequestCharged() != null)
            sb.append("RequestCharged: " + getRequestCharged() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCharged() == null) ? 0 : getRequestCharged().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteObjectsResult == false)
            return false;
        DeleteObjectsResult other = (DeleteObjectsResult) obj;

        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
            return false;
        if (other.getRequestCharged() == null ^ this.getRequestCharged() == null)
            return false;
        if (other.getRequestCharged() != null
                && other.getRequestCharged().equals(this.getRequestCharged()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }
}
