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
 * Container for the transition rule that describes when noncurrent objects
 * transition to the <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
 * <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
 * <code>DEEP_ARCHIVE</code> storage class. If your bucket is versioning-enabled
 * (or versioning is suspended), you can set this action to request that Amazon
 * S3 transition noncurrent object versions to the <code>STANDARD_IA</code>,
 * <code>ONEZONE_IA</code>, <code>INTELLIGENT_TIERING</code>,
 * <code>GLACIER</code>, or <code>DEEP_ARCHIVE</code> storage class at a
 * specific period in the object's lifetime.
 * </p>
 */
public class NoncurrentVersionTransition implements Serializable {
    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can
     * perform the associated action. For information about the noncurrent days
     * calculations, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates How Long an Object Has Been Noncurrent</a> in
     * the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     */
    private Integer noncurrentDays;

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GLACIER, STANDARD_IA, ONEZONE_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE
     */
    private String storageClass;

    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can
     * perform the associated action. For information about the noncurrent days
     * calculations, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates How Long an Object Has Been Noncurrent</a> in
     * the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the number of days an object is noncurrent before
     *         Amazon S3 can perform the associated action. For information
     *         about the noncurrent days calculations, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     *         >How Amazon S3 Calculates How Long an Object Has Been
     *         Noncurrent</a> in the <i>Amazon Simple Storage Service Developer
     *         Guide</i>.
     *         </p>
     */
    public Integer getNoncurrentDays() {
        return noncurrentDays;
    }

    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can
     * perform the associated action. For information about the noncurrent days
     * calculations, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates How Long an Object Has Been Noncurrent</a> in
     * the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @param noncurrentDays <p>
     *            Specifies the number of days an object is noncurrent before
     *            Amazon S3 can perform the associated action. For information
     *            about the noncurrent days calculations, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     *            >How Amazon S3 Calculates How Long an Object Has Been
     *            Noncurrent</a> in the <i>Amazon Simple Storage Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setNoncurrentDays(Integer noncurrentDays) {
        this.noncurrentDays = noncurrentDays;
    }

    /**
     * <p>
     * Specifies the number of days an object is noncurrent before Amazon S3 can
     * perform the associated action. For information about the noncurrent days
     * calculations, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     * >How Amazon S3 Calculates How Long an Object Has Been Noncurrent</a> in
     * the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noncurrentDays <p>
     *            Specifies the number of days an object is noncurrent before
     *            Amazon S3 can perform the associated action. For information
     *            about the noncurrent days calculations, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/intro-lifecycle-rules.html#non-current-days-calculations"
     *            >How Amazon S3 Calculates How Long an Object Has Been
     *            Noncurrent</a> in the <i>Amazon Simple Storage Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NoncurrentVersionTransition withNoncurrentDays(Integer noncurrentDays) {
        this.noncurrentDays = noncurrentDays;
        return this;
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GLACIER, STANDARD_IA, ONEZONE_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @return <p>
     *         The class of storage used to store the object.
     *         </p>
     * @see TransitionStorageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GLACIER, STANDARD_IA, ONEZONE_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the object.
     *            </p>
     * @see TransitionStorageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * The class of storage used to store the object.
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
     *            The class of storage used to store the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitionStorageClass
     */
    public NoncurrentVersionTransition withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p>
     * The class of storage used to store the object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>GLACIER, STANDARD_IA, ONEZONE_IA,
     * INTELLIGENT_TIERING, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            The class of storage used to store the object.
     *            </p>
     * @see TransitionStorageClass
     */
    public void setStorageClass(TransitionStorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p>
     * The class of storage used to store the object.
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
     *            The class of storage used to store the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see TransitionStorageClass
     */
    public NoncurrentVersionTransition withStorageClass(TransitionStorageClass storageClass) {
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
        if (getNoncurrentDays() != null)
            sb.append("NoncurrentDays: " + getNoncurrentDays() + ",");
        if (getStorageClass() != null)
            sb.append("StorageClass: " + getStorageClass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNoncurrentDays() == null) ? 0 : getNoncurrentDays().hashCode());
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

        if (obj instanceof NoncurrentVersionTransition == false)
            return false;
        NoncurrentVersionTransition other = (NoncurrentVersionTransition) obj;

        if (other.getNoncurrentDays() == null ^ this.getNoncurrentDays() == null)
            return false;
        if (other.getNoncurrentDays() != null
                && other.getNoncurrentDays().equals(this.getNoncurrentDays()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null
                && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        return true;
    }
}
