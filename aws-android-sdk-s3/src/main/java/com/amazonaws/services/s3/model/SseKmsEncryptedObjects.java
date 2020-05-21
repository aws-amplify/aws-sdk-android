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
 * A container for filter information for the selection of S3 objects encrypted
 * with AWS KMS.
 * </p>
 */
public class SseKmsEncryptedObjects implements Serializable {
    /**
     * <p>
     * Specifies whether Amazon S3 replicates objects created with server-side
     * encryption using a customer master key (CMK) stored in AWS Key Management
     * Service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String status;

    /**
     * <p>
     * Specifies whether Amazon S3 replicates objects created with server-side
     * encryption using a customer master key (CMK) stored in AWS Key Management
     * Service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         Specifies whether Amazon S3 replicates objects created with
     *         server-side encryption using a customer master key (CMK) stored
     *         in AWS Key Management Service.
     *         </p>
     * @see SseKmsEncryptedObjectsStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 replicates objects created with server-side
     * encryption using a customer master key (CMK) stored in AWS Key Management
     * Service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether Amazon S3 replicates objects created with
     *            server-side encryption using a customer master key (CMK)
     *            stored in AWS Key Management Service.
     *            </p>
     * @see SseKmsEncryptedObjectsStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 replicates objects created with server-side
     * encryption using a customer master key (CMK) stored in AWS Key Management
     * Service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether Amazon S3 replicates objects created with
     *            server-side encryption using a customer master key (CMK)
     *            stored in AWS Key Management Service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SseKmsEncryptedObjectsStatus
     */
    public SseKmsEncryptedObjects withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies whether Amazon S3 replicates objects created with server-side
     * encryption using a customer master key (CMK) stored in AWS Key Management
     * Service.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether Amazon S3 replicates objects created with
     *            server-side encryption using a customer master key (CMK)
     *            stored in AWS Key Management Service.
     *            </p>
     * @see SseKmsEncryptedObjectsStatus
     */
    public void setStatus(SseKmsEncryptedObjectsStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Specifies whether Amazon S3 replicates objects created with server-side
     * encryption using a customer master key (CMK) stored in AWS Key Management
     * Service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            Specifies whether Amazon S3 replicates objects created with
     *            server-side encryption using a customer master key (CMK)
     *            stored in AWS Key Management Service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see SseKmsEncryptedObjectsStatus
     */
    public SseKmsEncryptedObjects withStatus(SseKmsEncryptedObjectsStatus status) {
        this.status = status.toString();
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

        if (obj instanceof SseKmsEncryptedObjects == false)
            return false;
        SseKmsEncryptedObjects other = (SseKmsEncryptedObjects) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
