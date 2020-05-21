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
 * Container for the expiration for the lifecycle of the object.
 * </p>
 */
public class LifecycleExpiration implements Serializable {
    /**
     * <p>
     * Indicates at what date the object is to be moved or deleted. Should be in
     * GMT ISO 8601 Format.
     * </p>
     */
    private java.util.Date dateValue;

    /**
     * <p>
     * Indicates the lifetime, in days, of the objects that are subject to the
     * rule. The value must be a non-zero positive integer.
     * </p>
     */
    private Integer days;

    /**
     * <p>
     * Indicates whether Amazon S3 will remove a delete marker with no
     * noncurrent versions. If set to true, the delete marker will be expired;
     * if set to false the policy takes no action. This cannot be specified with
     * Days or Date in a Lifecycle Expiration Policy.
     * </p>
     */
    private Boolean expiredObjectDeleteMarker;

    /**
     * <p>
     * Indicates at what date the object is to be moved or deleted. Should be in
     * GMT ISO 8601 Format.
     * </p>
     *
     * @return <p>
     *         Indicates at what date the object is to be moved or deleted.
     *         Should be in GMT ISO 8601 Format.
     *         </p>
     */
    public java.util.Date getDate() {
        return dateValue;
    }

    /**
     * <p>
     * Indicates at what date the object is to be moved or deleted. Should be in
     * GMT ISO 8601 Format.
     * </p>
     *
     * @param dateValue <p>
     *            Indicates at what date the object is to be moved or deleted.
     *            Should be in GMT ISO 8601 Format.
     *            </p>
     */
    public void setDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * Indicates at what date the object is to be moved or deleted. Should be in
     * GMT ISO 8601 Format.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateValue <p>
     *            Indicates at what date the object is to be moved or deleted.
     *            Should be in GMT ISO 8601 Format.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleExpiration withDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
        return this;
    }

    /**
     * <p>
     * Indicates the lifetime, in days, of the objects that are subject to the
     * rule. The value must be a non-zero positive integer.
     * </p>
     *
     * @return <p>
     *         Indicates the lifetime, in days, of the objects that are subject
     *         to the rule. The value must be a non-zero positive integer.
     *         </p>
     */
    public Integer getDays() {
        return days;
    }

    /**
     * <p>
     * Indicates the lifetime, in days, of the objects that are subject to the
     * rule. The value must be a non-zero positive integer.
     * </p>
     *
     * @param days <p>
     *            Indicates the lifetime, in days, of the objects that are
     *            subject to the rule. The value must be a non-zero positive
     *            integer.
     *            </p>
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * <p>
     * Indicates the lifetime, in days, of the objects that are subject to the
     * rule. The value must be a non-zero positive integer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param days <p>
     *            Indicates the lifetime, in days, of the objects that are
     *            subject to the rule. The value must be a non-zero positive
     *            integer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleExpiration withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 will remove a delete marker with no
     * noncurrent versions. If set to true, the delete marker will be expired;
     * if set to false the policy takes no action. This cannot be specified with
     * Days or Date in a Lifecycle Expiration Policy.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon S3 will remove a delete marker with no
     *         noncurrent versions. If set to true, the delete marker will be
     *         expired; if set to false the policy takes no action. This cannot
     *         be specified with Days or Date in a Lifecycle Expiration Policy.
     *         </p>
     */
    public Boolean isExpiredObjectDeleteMarker() {
        return expiredObjectDeleteMarker;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 will remove a delete marker with no
     * noncurrent versions. If set to true, the delete marker will be expired;
     * if set to false the policy takes no action. This cannot be specified with
     * Days or Date in a Lifecycle Expiration Policy.
     * </p>
     *
     * @return <p>
     *         Indicates whether Amazon S3 will remove a delete marker with no
     *         noncurrent versions. If set to true, the delete marker will be
     *         expired; if set to false the policy takes no action. This cannot
     *         be specified with Days or Date in a Lifecycle Expiration Policy.
     *         </p>
     */
    public Boolean getExpiredObjectDeleteMarker() {
        return expiredObjectDeleteMarker;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 will remove a delete marker with no
     * noncurrent versions. If set to true, the delete marker will be expired;
     * if set to false the policy takes no action. This cannot be specified with
     * Days or Date in a Lifecycle Expiration Policy.
     * </p>
     *
     * @param expiredObjectDeleteMarker <p>
     *            Indicates whether Amazon S3 will remove a delete marker with
     *            no noncurrent versions. If set to true, the delete marker will
     *            be expired; if set to false the policy takes no action. This
     *            cannot be specified with Days or Date in a Lifecycle
     *            Expiration Policy.
     *            </p>
     */
    public void setExpiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
        this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
    }

    /**
     * <p>
     * Indicates whether Amazon S3 will remove a delete marker with no
     * noncurrent versions. If set to true, the delete marker will be expired;
     * if set to false the policy takes no action. This cannot be specified with
     * Days or Date in a Lifecycle Expiration Policy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiredObjectDeleteMarker <p>
     *            Indicates whether Amazon S3 will remove a delete marker with
     *            no noncurrent versions. If set to true, the delete marker will
     *            be expired; if set to false the policy takes no action. This
     *            cannot be specified with Days or Date in a Lifecycle
     *            Expiration Policy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleExpiration withExpiredObjectDeleteMarker(Boolean expiredObjectDeleteMarker) {
        this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
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
        if (getDate() != null)
            sb.append("Date: " + getDate() + ",");
        if (getDays() != null)
            sb.append("Days: " + getDays() + ",");
        if (getExpiredObjectDeleteMarker() != null)
            sb.append("ExpiredObjectDeleteMarker: " + getExpiredObjectDeleteMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getDays() == null) ? 0 : getDays().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpiredObjectDeleteMarker() == null) ? 0 : getExpiredObjectDeleteMarker()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleExpiration == false)
            return false;
        LifecycleExpiration other = (LifecycleExpiration) obj;

        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getDays() == null ^ this.getDays() == null)
            return false;
        if (other.getDays() != null && other.getDays().equals(this.getDays()) == false)
            return false;
        if (other.getExpiredObjectDeleteMarker() == null
                ^ this.getExpiredObjectDeleteMarker() == null)
            return false;
        if (other.getExpiredObjectDeleteMarker() != null
                && other.getExpiredObjectDeleteMarker().equals(this.getExpiredObjectDeleteMarker()) == false)
            return false;
        return true;
    }
}
