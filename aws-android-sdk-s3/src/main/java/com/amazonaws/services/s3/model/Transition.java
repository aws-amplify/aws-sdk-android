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
 * Specifies when an object transitions to a specified storage class. For more
 * information about Amazon S3 lifecycle configuration rules, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html"
 * >Transitioning Objects Using Amazon S3 Lifecycle</a> in the <i>Amazon Simple
 * Storage Service Developer Guide</i>.
 * </p>
 */
public class Transition implements Serializable {
    /**
     * <p>
     * Indicates when objects are transitioned to the specified storage class.
     * The date value must be in ISO 8601 format. The time is always midnight
     * UTC.
     * </p>
     */
    private java.util.Date dateValue;

    /**
     * <p>
     * Indicates the number of days after creation when objects are transitioned
     * to the specified storage class. The value must be a positive integer.
     * </p>
     */
    private Integer days;

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GLACIER, STANDARD_IA, ONEZONE_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE
     */
    private String storageClass;

    /**
     * <p>
     * Indicates when objects are transitioned to the specified storage class.
     * The date value must be in ISO 8601 format. The time is always midnight
     * UTC.
     * </p>
     *
     * @return <p>
     *         Indicates when objects are transitioned to the specified storage
     *         class. The date value must be in ISO 8601 format. The time is
     *         always midnight UTC.
     *         </p>
     */
    public java.util.Date getDate() {
        return dateValue;
    }

    /**
     * <p>
     * Indicates when objects are transitioned to the specified storage class.
     * The date value must be in ISO 8601 format. The time is always midnight
     * UTC.
     * </p>
     *
     * @param dateValue <p>
     *            Indicates when objects are transitioned to the specified
     *            storage class. The date value must be in ISO 8601 format. The
     *            time is always midnight UTC.
     *            </p>
     */
    public void setDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
    }

    /**
     * <p>
     * Indicates when objects are transitioned to the specified storage class.
     * The date value must be in ISO 8601 format. The time is always midnight
     * UTC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dateValue <p>
     *            Indicates when objects are transitioned to the specified
     *            storage class. The date value must be in ISO 8601 format. The
     *            time is always midnight UTC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transition withDate(java.util.Date dateValue) {
        this.dateValue = dateValue;
        return this;
    }

    /**
     * <p>
     * Indicates the number of days after creation when objects are transitioned
     * to the specified storage class. The value must be a positive integer.
     * </p>
     *
     * @return <p>
     *         Indicates the number of days after creation when objects are
     *         transitioned to the specified storage class. The value must be a
     *         positive integer.
     *         </p>
     */
    public Integer getDays() {
        return days;
    }

    /**
     * <p>
     * Indicates the number of days after creation when objects are transitioned
     * to the specified storage class. The value must be a positive integer.
     * </p>
     *
     * @param days <p>
     *            Indicates the number of days after creation when objects are
     *            transitioned to the specified storage class. The value must be
     *            a positive integer.
     *            </p>
     */
    public void setDays(Integer days) {
        this.days = days;
    }

    /**
     * <p>
     * Indicates the number of days after creation when objects are transitioned
     * to the specified storage class. The value must be a positive integer.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param days <p>
     *            Indicates the number of days after creation when objects are
     *            transitioned to the specified storage class. The value must be
     *            a positive integer.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Transition withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GLACIER, STANDARD_IA, ONEZONE_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @return <p>
     *         The storage class to which you want the object to transition.
     *         </p>
     * @see TransitionStorageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GLACIER, STANDARD_IA, ONEZONE_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The storage class to which you want the object to transition.
     *            </p>
     * @see TransitionStorageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GLACIER, STANDARD_IA, ONEZONE_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The storage class to which you want the object to transition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitionStorageClass
     */
    public Transition withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GLACIER, STANDARD_IA, ONEZONE_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The storage class to which you want the object to transition.
     *            </p>
     * @see TransitionStorageClass
     */
    public void setStorageClass(TransitionStorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p>
     * The storage class to which you want the object to transition.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GLACIER, STANDARD_IA, ONEZONE_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The storage class to which you want the object to transition.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitionStorageClass
     */
    public Transition withStorageClass(TransitionStorageClass storageClass) {
        this.storageClass = storageClass.toString();
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
        if (getStorageClass() != null)
            sb.append("StorageClass: " + getStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getDays() == null) ? 0 : getDays().hashCode());
        hashCode = prime * hashCode
                + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Transition == false)
            return false;
        Transition other = (Transition) obj;

        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getDays() == null ^ this.getDays() == null)
            return false;
        if (other.getDays() != null && other.getDays().equals(this.getDays()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null
                && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        return true;
    }
}
