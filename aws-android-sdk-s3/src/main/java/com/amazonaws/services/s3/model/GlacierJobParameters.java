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
 * Container for S3 Glacier job parameters.
 * </p>
 */
public class GlacierJobParameters implements Serializable {
    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     */
    private String tier;

    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     *
     * @return <p>
     *         S3 Glacier retrieval tier at which the restore will be processed.
     *         </p>
     * @see Tier
     */
    public String getTier() {
        return tier;
    }

    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     *
     * @param tier <p>
     *            S3 Glacier retrieval tier at which the restore will be
     *            processed.
     *            </p>
     * @see Tier
     */
    public void setTier(String tier) {
        this.tier = tier;
    }

    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     *
     * @param tier <p>
     *            S3 Glacier retrieval tier at which the restore will be
     *            processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tier
     */
    public GlacierJobParameters withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     *
     * @param tier <p>
     *            S3 Glacier retrieval tier at which the restore will be
     *            processed.
     *            </p>
     * @see Tier
     */
    public void setTier(Tier tier) {
        this.tier = tier.toString();
    }

    /**
     * <p>
     * S3 Glacier retrieval tier at which the restore will be processed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Standard, Bulk, Expedited
     *
     * @param tier <p>
     *            S3 Glacier retrieval tier at which the restore will be
     *            processed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Tier
     */
    public GlacierJobParameters withTier(Tier tier) {
        this.tier = tier.toString();
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
        if (getTier() != null)
            sb.append("Tier: " + getTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTier() == null) ? 0 : getTier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlacierJobParameters == false)
            return false;
        GlacierJobParameters other = (GlacierJobParameters) obj;

        if (other.getTier() == null ^ this.getTier() == null)
            return false;
        if (other.getTier() != null && other.getTier().equals(this.getTier()) == false)
            return false;
        return true;
    }
}
