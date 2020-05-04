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
 * <p>Contains the configuration parameters for an Initiate Glacier Restore job. Amazon S3 Batch Operations passes each value through to the underlying POST Object restore API. For more information about the parameters for this operation, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectPOSTrestore.html#RESTObjectPOSTrestore-restore-request">Restoring Archives</a>.</p>
 */
public class S3InitiateRestoreObjectOperation implements Serializable {
    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer expirationInDays;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BULK, STANDARD
     */
    private String glacierJobTier;

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p/>
     */
    public Integer getExpirationInDays() {
        return expirationInDays;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param expirationInDays <p/>
     */
    public void setExpirationInDays(Integer expirationInDays) {
        this.expirationInDays = expirationInDays;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param expirationInDays <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public S3InitiateRestoreObjectOperation withExpirationInDays(Integer expirationInDays) {
        this.expirationInDays = expirationInDays;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BULK, STANDARD
     *
     * @return <p/>
     *
     * @see S3GlacierJobTier
     */
    public String getGlacierJobTier() {
        return glacierJobTier;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BULK, STANDARD
     *
     * @param glacierJobTier <p/>
     *
     * @see S3GlacierJobTier
     */
    public void setGlacierJobTier(String glacierJobTier) {
        this.glacierJobTier = glacierJobTier;
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BULK, STANDARD
     *
     * @param glacierJobTier <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3GlacierJobTier
     */
    public S3InitiateRestoreObjectOperation withGlacierJobTier(String glacierJobTier) {
        this.glacierJobTier = glacierJobTier;
        return this;
    }

    /**
     * <p/>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BULK, STANDARD
     *
     * @param glacierJobTier <p/>
     *
     * @see S3GlacierJobTier
     */
    public void setGlacierJobTier(S3GlacierJobTier glacierJobTier) {
        this.glacierJobTier = glacierJobTier.toString();
    }

    /**
     * <p/>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>BULK, STANDARD
     *
     * @param glacierJobTier <p/>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     *
     * @see S3GlacierJobTier
     */
    public S3InitiateRestoreObjectOperation withGlacierJobTier(S3GlacierJobTier glacierJobTier) {
        this.glacierJobTier = glacierJobTier.toString();
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
        if (getExpirationInDays() != null) sb.append("ExpirationInDays: " + getExpirationInDays() + ",");
        if (getGlacierJobTier() != null) sb.append("GlacierJobTier: " + getGlacierJobTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpirationInDays() == null) ? 0 : getExpirationInDays().hashCode());
        hashCode = prime * hashCode + ((getGlacierJobTier() == null) ? 0 : getGlacierJobTier().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof S3InitiateRestoreObjectOperation == false) return false;
        S3InitiateRestoreObjectOperation other = (S3InitiateRestoreObjectOperation)obj;

        if (other.getExpirationInDays() == null ^ this.getExpirationInDays() == null) return false;
        if (other.getExpirationInDays() != null && other.getExpirationInDays().equals(this.getExpirationInDays()) == false) return false;
        if (other.getGlacierJobTier() == null ^ this.getGlacierJobTier() == null) return false;
        if (other.getGlacierJobTier() != null && other.getGlacierJobTier().equals(this.getGlacierJobTier()) == false) return false;
        return true;
    }
}
