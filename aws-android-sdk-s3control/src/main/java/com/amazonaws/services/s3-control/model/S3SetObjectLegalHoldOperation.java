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
package com.amazonaws.services.s3-control.model;

import java.io.Serializable;


/**
 * <p>Contains the configuration parameters for a Set Object Legal Hold operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Legal Hold API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.htmll#object-lock-legal-holds">PUT Object Legal Hold</a>.</p>
 */
public class S3SetObjectLegalHoldOperation implements Serializable {
    /**
     * <p>The Legal Hold contains the status to be applied to all objects in the Batch Operations job.</p>
     */
    private S3ObjectLockLegalHold legalHold;

    /**
     * <p>The Legal Hold contains the status to be applied to all objects in the Batch Operations job.</p>
     *
     * @return <p>The Legal Hold contains the status to be applied to all objects in the Batch Operations job.</p>
     */
    public S3ObjectLockLegalHold getLegalHold() {
        return legalHold;
    }

    /**
     * <p>The Legal Hold contains the status to be applied to all objects in the Batch Operations job.</p>
     *
     * @param legalHold <p>The Legal Hold contains the status to be applied to all objects in the Batch Operations job.</p>
     */
    public void setLegalHold(S3ObjectLockLegalHold legalHold) {
        this.legalHold = legalHold;
    }

    /**
     * <p>The Legal Hold contains the status to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param legalHold <p>The Legal Hold contains the status to be applied to all objects in the Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3SetObjectLegalHoldOperation withLegalHold(S3ObjectLockLegalHold legalHold) {
        this.legalHold = legalHold;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLegalHold() != null) sb.append("LegalHold: " + getLegalHold());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLegalHold() == null) ? 0 : getLegalHold().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3SetObjectLegalHoldOperation == false) return false;
        S3SetObjectLegalHoldOperation other = (S3SetObjectLegalHoldOperation)obj;

        if (other.getLegalHold() == null ^ this.getLegalHold() == null) return false;
        if (other.getLegalHold() != null && other.getLegalHold().equals(this.getLegalHold()) == false) return false;
        return true;
    }
}
