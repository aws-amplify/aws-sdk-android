/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

public class SendBulkTemplatedEmailResult implements Serializable {
    /**
     * <p>
     * One object per intended recipient. Check each response object and retry
     * any messages with a failure status. (Note that order of responses will be
     * respective to order of destinations in the request.)Receipt rules enable
     * you to specify which actions
     * </p>
     */
    private java.util.List<BulkEmailDestinationStatus> status = new java.util.ArrayList<BulkEmailDestinationStatus>();

    /**
     * <p>
     * One object per intended recipient. Check each response object and retry
     * any messages with a failure status. (Note that order of responses will be
     * respective to order of destinations in the request.)Receipt rules enable
     * you to specify which actions
     * </p>
     *
     * @return <p>
     *         One object per intended recipient. Check each response object and
     *         retry any messages with a failure status. (Note that order of
     *         responses will be respective to order of destinations in the
     *         request.)Receipt rules enable you to specify which actions
     *         </p>
     */
    public java.util.List<BulkEmailDestinationStatus> getStatus() {
        return status;
    }

    /**
     * <p>
     * One object per intended recipient. Check each response object and retry
     * any messages with a failure status. (Note that order of responses will be
     * respective to order of destinations in the request.)Receipt rules enable
     * you to specify which actions
     * </p>
     *
     * @param status <p>
     *            One object per intended recipient. Check each response object
     *            and retry any messages with a failure status. (Note that order
     *            of responses will be respective to order of destinations in
     *            the request.)Receipt rules enable you to specify which actions
     *            </p>
     */
    public void setStatus(java.util.Collection<BulkEmailDestinationStatus> status) {
        if (status == null) {
            this.status = null;
            return;
        }

        this.status = new java.util.ArrayList<BulkEmailDestinationStatus>(status);
    }

    /**
     * <p>
     * One object per intended recipient. Check each response object and retry
     * any messages with a failure status. (Note that order of responses will be
     * respective to order of destinations in the request.)Receipt rules enable
     * you to specify which actions
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            One object per intended recipient. Check each response object
     *            and retry any messages with a failure status. (Note that order
     *            of responses will be respective to order of destinations in
     *            the request.)Receipt rules enable you to specify which actions
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBulkTemplatedEmailResult withStatus(BulkEmailDestinationStatus... status) {
        if (getStatus() == null) {
            this.status = new java.util.ArrayList<BulkEmailDestinationStatus>(status.length);
        }
        for (BulkEmailDestinationStatus value : status) {
            this.status.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One object per intended recipient. Check each response object and retry
     * any messages with a failure status. (Note that order of responses will be
     * respective to order of destinations in the request.)Receipt rules enable
     * you to specify which actions
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            One object per intended recipient. Check each response object
     *            and retry any messages with a failure status. (Note that order
     *            of responses will be respective to order of destinations in
     *            the request.)Receipt rules enable you to specify which actions
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SendBulkTemplatedEmailResult withStatus(
            java.util.Collection<BulkEmailDestinationStatus> status) {
        setStatus(status);
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendBulkTemplatedEmailResult == false)
            return false;
        SendBulkTemplatedEmailResult other = (SendBulkTemplatedEmailResult) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
