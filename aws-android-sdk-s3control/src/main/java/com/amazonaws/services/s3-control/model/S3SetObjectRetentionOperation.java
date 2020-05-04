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
 * <p>Contains the configuration parameters for a Set Object Retention operation. Amazon S3 Batch Operations passes each value through to the underlying PUT Object Retention API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lock-overview.html#object-lock-retention-modes">PUT Object Retention</a>.</p>
 */
public class S3SetObjectRetentionOperation implements Serializable {
    /**
     * <p>Indicates if the operation should be applied to objects in the Batch Operations job even if they have Governance-type Object Lock in place.</p>
     */
    private Boolean bypassGovernanceRetention;

    /**
     * <p>Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations job.</p>
     */
    private S3Retention retention;

    /**
     * <p>Indicates if the operation should be applied to objects in the Batch Operations job even if they have Governance-type Object Lock in place.</p>
     *
     * @return <p>Indicates if the operation should be applied to objects in the Batch Operations job even if they have Governance-type Object Lock in place.</p>
     */
    public Boolean isBypassGovernanceRetention() {
        return bypassGovernanceRetention;
    }

    /**
     * <p>Indicates if the operation should be applied to objects in the Batch Operations job even if they have Governance-type Object Lock in place.</p>
     *
     * @return <p>Indicates if the operation should be applied to objects in the Batch Operations job even if they have Governance-type Object Lock in place.</p>
     */
    public Boolean getBypassGovernanceRetention() {
        return bypassGovernanceRetention;
    }

    /**
     * <p>Indicates if the operation should be applied to objects in the Batch Operations job even if they have Governance-type Object Lock in place.</p>
     *
     * @param bypassGovernanceRetention <p>Indicates if the operation should be applied to objects in the Batch Operations job even if they have Governance-type Object Lock in place.</p>
     */
    public void setBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
        this.bypassGovernanceRetention = bypassGovernanceRetention;
    }

    /**
     * <p>Indicates if the operation should be applied to objects in the Batch Operations job even if they have Governance-type Object Lock in place.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param bypassGovernanceRetention <p>Indicates if the operation should be applied to objects in the Batch Operations job even if they have Governance-type Object Lock in place.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3SetObjectRetentionOperation withBypassGovernanceRetention(Boolean bypassGovernanceRetention) {
        this.bypassGovernanceRetention = bypassGovernanceRetention;
        return this;
    }

    /**
     * <p>Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @return <p>Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations job.</p>
     */
    public S3Retention getRetention() {
        return retention;
    }

    /**
     * <p>Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @param retention <p>Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations job.</p>
     */
    public void setRetention(S3Retention retention) {
        this.retention = retention;
    }

    /**
     * <p>Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations job.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param retention <p>Amazon S3 object lock Retention contains the retention mode to be applied to all objects in the Batch Operations job.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3SetObjectRetentionOperation withRetention(S3Retention retention) {
        this.retention = retention;
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
        if (getBypassGovernanceRetention() != null) sb.append("BypassGovernanceRetention: " + getBypassGovernanceRetention() + ",");
        if (getRetention() != null) sb.append("Retention: " + getRetention());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBypassGovernanceRetention() == null) ? 0 : getBypassGovernanceRetention().hashCode());
        hashCode = prime * hashCode + ((getRetention() == null) ? 0 : getRetention().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3SetObjectRetentionOperation == false) return false;
        S3SetObjectRetentionOperation other = (S3SetObjectRetentionOperation)obj;

        if (other.getBypassGovernanceRetention() == null ^ this.getBypassGovernanceRetention() == null) return false;
        if (other.getBypassGovernanceRetention() != null && other.getBypassGovernanceRetention().equals(this.getBypassGovernanceRetention()) == false) return false;
        if (other.getRetention() == null ^ this.getRetention() == null) return false;
        if (other.getRetention() != null && other.getRetention().equals(this.getRetention()) == false) return false;
        return true;
    }
}
