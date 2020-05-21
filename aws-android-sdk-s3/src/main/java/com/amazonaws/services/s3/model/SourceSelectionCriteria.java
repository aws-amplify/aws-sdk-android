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

/**
 * <p>
 * A container that describes additional filters for identifying the source
 * objects that you want to replicate. You can choose to enable or disable the
 * replication of these objects. Currently, Amazon S3 supports only the filter
 * that you can specify for objects created with server-side encryption using a
 * customer master key (CMK) stored in AWS Key Management Service (SSE-KMS).
 * </p>
 */
public class SourceSelectionCriteria implements Serializable {
    /**
     * <p>
     * A container for filter information for the selection of Amazon S3 objects
     * encrypted with AWS KMS. If you include
     * <code>SourceSelectionCriteria</code> in the replication configuration,
     * this element is required.
     * </p>
     */
    private SseKmsEncryptedObjects sseKmsEncryptedObjects;

    /**
     * <p>
     * A container for filter information for the selection of Amazon S3 objects
     * encrypted with AWS KMS. If you include
     * <code>SourceSelectionCriteria</code> in the replication configuration,
     * this element is required.
     * </p>
     *
     * @return <p>
     *         A container for filter information for the selection of Amazon S3
     *         objects encrypted with AWS KMS. If you include
     *         <code>SourceSelectionCriteria</code> in the replication
     *         configuration, this element is required.
     *         </p>
     */
    public SseKmsEncryptedObjects getSseKmsEncryptedObjects() {
        return sseKmsEncryptedObjects;
    }

    /**
     * <p>
     * A container for filter information for the selection of Amazon S3 objects
     * encrypted with AWS KMS. If you include
     * <code>SourceSelectionCriteria</code> in the replication configuration,
     * this element is required.
     * </p>
     *
     * @param sseKmsEncryptedObjects <p>
     *            A container for filter information for the selection of Amazon
     *            S3 objects encrypted with AWS KMS. If you include
     *            <code>SourceSelectionCriteria</code> in the replication
     *            configuration, this element is required.
     *            </p>
     */
    public void setSseKmsEncryptedObjects(SseKmsEncryptedObjects sseKmsEncryptedObjects) {
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    /**
     * <p>
     * A container for filter information for the selection of Amazon S3 objects
     * encrypted with AWS KMS. If you include
     * <code>SourceSelectionCriteria</code> in the replication configuration,
     * this element is required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sseKmsEncryptedObjects <p>
     *            A container for filter information for the selection of Amazon
     *            S3 objects encrypted with AWS KMS. If you include
     *            <code>SourceSelectionCriteria</code> in the replication
     *            configuration, this element is required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SourceSelectionCriteria withSseKmsEncryptedObjects(
            SseKmsEncryptedObjects sseKmsEncryptedObjects) {
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
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
        if (getSseKmsEncryptedObjects() != null)
            sb.append("SseKmsEncryptedObjects: " + getSseKmsEncryptedObjects());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSseKmsEncryptedObjects() == null) ? 0 : getSseKmsEncryptedObjects()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SourceSelectionCriteria == false)
            return false;
        SourceSelectionCriteria other = (SourceSelectionCriteria) obj;

        if (other.getSseKmsEncryptedObjects() == null ^ this.getSseKmsEncryptedObjects() == null)
            return false;
        if (other.getSseKmsEncryptedObjects() != null
                && other.getSseKmsEncryptedObjects().equals(this.getSseKmsEncryptedObjects()) == false)
            return false;
        return true;
    }
}
