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

public class GetBucketVersioningResult implements Serializable {
    /**
     * <p>
     * The versioning state of the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     */
    private String status;

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning
     * configuration. This element is only returned if the bucket has been
     * configured with MFA delete. If the bucket has never been so configured,
     * this element is not returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String mFADelete;

    /**
     * <p>
     * The versioning state of the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     *
     * @return <p>
     *         The versioning state of the bucket.
     *         </p>
     * @see BucketVersioningStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * The versioning state of the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     *
     * @param status <p>
     *            The versioning state of the bucket.
     *            </p>
     * @see BucketVersioningStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The versioning state of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     *
     * @param status <p>
     *            The versioning state of the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BucketVersioningStatus
     */
    public GetBucketVersioningResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The versioning state of the bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     *
     * @param status <p>
     *            The versioning state of the bucket.
     *            </p>
     * @see BucketVersioningStatus
     */
    public void setStatus(BucketVersioningStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The versioning state of the bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Suspended
     *
     * @param status <p>
     *            The versioning state of the bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BucketVersioningStatus
     */
    public GetBucketVersioningResult withStatus(BucketVersioningStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning
     * configuration. This element is only returned if the bucket has been
     * configured with MFA delete. If the bucket has never been so configured,
     * this element is not returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         Specifies whether MFA delete is enabled in the bucket versioning
     *         configuration. This element is only returned if the bucket has
     *         been configured with MFA delete. If the bucket has never been so
     *         configured, this element is not returned.
     *         </p>
     * @see MFADeleteStatus
     */
    public String getMFADelete() {
        return mFADelete;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning
     * configuration. This element is only returned if the bucket has been
     * configured with MFA delete. If the bucket has never been so configured,
     * this element is not returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param mFADelete <p>
     *            Specifies whether MFA delete is enabled in the bucket
     *            versioning configuration. This element is only returned if the
     *            bucket has been configured with MFA delete. If the bucket has
     *            never been so configured, this element is not returned.
     *            </p>
     * @see MFADeleteStatus
     */
    public void setMFADelete(String mFADelete) {
        this.mFADelete = mFADelete;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning
     * configuration. This element is only returned if the bucket has been
     * configured with MFA delete. If the bucket has never been so configured,
     * this element is not returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param mFADelete <p>
     *            Specifies whether MFA delete is enabled in the bucket
     *            versioning configuration. This element is only returned if the
     *            bucket has been configured with MFA delete. If the bucket has
     *            never been so configured, this element is not returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MFADeleteStatus
     */
    public GetBucketVersioningResult withMFADelete(String mFADelete) {
        this.mFADelete = mFADelete;
        return this;
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning
     * configuration. This element is only returned if the bucket has been
     * configured with MFA delete. If the bucket has never been so configured,
     * this element is not returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param mFADelete <p>
     *            Specifies whether MFA delete is enabled in the bucket
     *            versioning configuration. This element is only returned if the
     *            bucket has been configured with MFA delete. If the bucket has
     *            never been so configured, this element is not returned.
     *            </p>
     * @see MFADeleteStatus
     */
    public void setMFADelete(MFADeleteStatus mFADelete) {
        this.mFADelete = mFADelete.toString();
    }

    /**
     * <p>
     * Specifies whether MFA delete is enabled in the bucket versioning
     * configuration. This element is only returned if the bucket has been
     * configured with MFA delete. If the bucket has never been so configured,
     * this element is not returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param mFADelete <p>
     *            Specifies whether MFA delete is enabled in the bucket
     *            versioning configuration. This element is only returned if the
     *            bucket has been configured with MFA delete. If the bucket has
     *            never been so configured, this element is not returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MFADeleteStatus
     */
    public GetBucketVersioningResult withMFADelete(MFADeleteStatus mFADelete) {
        this.mFADelete = mFADelete.toString();
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
            sb.append("Status: " + getStatus() + ",");
        if (getMFADelete() != null)
            sb.append("MFADelete: " + getMFADelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMFADelete() == null) ? 0 : getMFADelete().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketVersioningResult == false)
            return false;
        GetBucketVersioningResult other = (GetBucketVersioningResult) obj;

        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMFADelete() == null ^ this.getMFADelete() == null)
            return false;
        if (other.getMFADelete() != null
                && other.getMFADelete().equals(this.getMFADelete()) == false)
            return false;
        return true;
    }
}
