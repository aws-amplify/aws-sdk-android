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
 * Specifies lifecycle rules for an Amazon S3 bucket. For more information, see
 * <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTlifecycle.html"
 * >Put Bucket Lifecycle Configuration</a> in the <i>Amazon Simple Storage
 * Service API Reference</i>. For examples, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/API/API_PutBucketLifecycleConfiguration.html#API_PutBucketLifecycleConfiguration_Examples"
 * >Put Bucket Lifecycle Configuration Examples</a>
 * </p>
 */
public class Rule implements Serializable {
    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object.
     * </p>
     */
    private LifecycleExpiration expiration;

    /**
     * <p>
     * Unique identifier for the rule. The value can't be longer than 255
     * characters.
     * </p>
     */
    private String iD;

    /**
     * <p>
     * Object key prefix that identifies one or more objects to which this rule
     * applies.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * If <code>Enabled</code>, the rule is currently being applied. If
     * <code>Disabled</code>, the rule is not currently being applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String status;

    /**
     * <p>
     * Specifies when an object transitions to a specified storage class. For
     * more information about Amazon S3 lifecycle configuration rules, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html"
     * >Transitioning Objects Using Amazon S3 Lifecycle</a> in the <i>Amazon
     * Simple Storage Service Developer Guide</i>.
     * </p>
     */
    private Transition transition;

    /**
     * <p>
     * Container for the transition rule that describes when noncurrent objects
     * transition to the <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
     * <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
     * <code>DEEP_ARCHIVE</code> storage class. If your bucket is
     * versioning-enabled (or versioning is suspended), you can set this action
     * to request that Amazon S3 transition noncurrent object versions to the
     * <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
     * <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
     * <code>DEEP_ARCHIVE</code> storage class at a specific period in the
     * object's lifetime.
     * </p>
     */
    private NoncurrentVersionTransition noncurrentVersionTransition;

    /**
     * <p>
     * Specifies when noncurrent object versions expire. Upon expiration, Amazon
     * S3 permanently deletes the noncurrent object versions. You set this
     * lifecycle configuration action on a bucket that has versioning enabled
     * (or suspended) to request that Amazon S3 delete noncurrent object
     * versions at a specific period in the object's lifetime.
     * </p>
     */
    private NoncurrentVersionExpiration noncurrentVersionExpiration;

    /**
     * <p>
     * Specifies the days since the initiation of an incomplete multipart upload
     * that Amazon S3 will wait before permanently removing all parts of the
     * upload. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     */
    private AbortIncompleteMultipartUpload abortIncompleteMultipartUpload;

    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object.
     * </p>
     *
     * @return <p>
     *         Specifies the expiration for the lifecycle of the object.
     *         </p>
     */
    public LifecycleExpiration getExpiration() {
        return expiration;
    }

    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object.
     * </p>
     *
     * @param expiration <p>
     *            Specifies the expiration for the lifecycle of the object.
     *            </p>
     */
    public void setExpiration(LifecycleExpiration expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiration <p>
     *            Specifies the expiration for the lifecycle of the object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withExpiration(LifecycleExpiration expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * <p>
     * Unique identifier for the rule. The value can't be longer than 255
     * characters.
     * </p>
     *
     * @return <p>
     *         Unique identifier for the rule. The value can't be longer than
     *         255 characters.
     *         </p>
     */
    public String getID() {
        return iD;
    }

    /**
     * <p>
     * Unique identifier for the rule. The value can't be longer than 255
     * characters.
     * </p>
     *
     * @param iD <p>
     *            Unique identifier for the rule. The value can't be longer than
     *            255 characters.
     *            </p>
     */
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * <p>
     * Unique identifier for the rule. The value can't be longer than 255
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iD <p>
     *            Unique identifier for the rule. The value can't be longer than
     *            255 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withID(String iD) {
        this.iD = iD;
        return this;
    }

    /**
     * <p>
     * Object key prefix that identifies one or more objects to which this rule
     * applies.
     * </p>
     *
     * @return <p>
     *         Object key prefix that identifies one or more objects to which
     *         this rule applies.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * Object key prefix that identifies one or more objects to which this rule
     * applies.
     * </p>
     *
     * @param prefix <p>
     *            Object key prefix that identifies one or more objects to which
     *            this rule applies.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Object key prefix that identifies one or more objects to which this rule
     * applies.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            Object key prefix that identifies one or more objects to which
     *            this rule applies.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * If <code>Enabled</code>, the rule is currently being applied. If
     * <code>Disabled</code>, the rule is not currently being applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         If <code>Enabled</code>, the rule is currently being applied. If
     *         <code>Disabled</code>, the rule is not currently being applied.
     *         </p>
     * @see ExpirationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * If <code>Enabled</code>, the rule is currently being applied. If
     * <code>Disabled</code>, the rule is not currently being applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            If <code>Enabled</code>, the rule is currently being applied.
     *            If <code>Disabled</code>, the rule is not currently being
     *            applied.
     *            </p>
     * @see ExpirationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * If <code>Enabled</code>, the rule is currently being applied. If
     * <code>Disabled</code>, the rule is not currently being applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            If <code>Enabled</code>, the rule is currently being applied.
     *            If <code>Disabled</code>, the rule is not currently being
     *            applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpirationStatus
     */
    public Rule withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * If <code>Enabled</code>, the rule is currently being applied. If
     * <code>Disabled</code>, the rule is not currently being applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            If <code>Enabled</code>, the rule is currently being applied.
     *            If <code>Disabled</code>, the rule is not currently being
     *            applied.
     *            </p>
     * @see ExpirationStatus
     */
    public void setStatus(ExpirationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * If <code>Enabled</code>, the rule is currently being applied. If
     * <code>Disabled</code>, the rule is not currently being applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            If <code>Enabled</code>, the rule is currently being applied.
     *            If <code>Disabled</code>, the rule is not currently being
     *            applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpirationStatus
     */
    public Rule withStatus(ExpirationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies when an object transitions to a specified storage class. For
     * more information about Amazon S3 lifecycle configuration rules, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html"
     * >Transitioning Objects Using Amazon S3 Lifecycle</a> in the <i>Amazon
     * Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies when an object transitions to a specified storage
     *         class. For more information about Amazon S3 lifecycle
     *         configuration rules, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html"
     *         >Transitioning Objects Using Amazon S3 Lifecycle</a> in the
     *         <i>Amazon Simple Storage Service Developer Guide</i>.
     *         </p>
     */
    public Transition getTransition() {
        return transition;
    }

    /**
     * <p>
     * Specifies when an object transitions to a specified storage class. For
     * more information about Amazon S3 lifecycle configuration rules, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html"
     * >Transitioning Objects Using Amazon S3 Lifecycle</a> in the <i>Amazon
     * Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @param transition <p>
     *            Specifies when an object transitions to a specified storage
     *            class. For more information about Amazon S3 lifecycle
     *            configuration rules, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html"
     *            >Transitioning Objects Using Amazon S3 Lifecycle</a> in the
     *            <i>Amazon Simple Storage Service Developer Guide</i>.
     *            </p>
     */
    public void setTransition(Transition transition) {
        this.transition = transition;
    }

    /**
     * <p>
     * Specifies when an object transitions to a specified storage class. For
     * more information about Amazon S3 lifecycle configuration rules, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html"
     * >Transitioning Objects Using Amazon S3 Lifecycle</a> in the <i>Amazon
     * Simple Storage Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transition <p>
     *            Specifies when an object transitions to a specified storage
     *            class. For more information about Amazon S3 lifecycle
     *            configuration rules, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/lifecycle-transition-general-considerations.html"
     *            >Transitioning Objects Using Amazon S3 Lifecycle</a> in the
     *            <i>Amazon Simple Storage Service Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withTransition(Transition transition) {
        this.transition = transition;
        return this;
    }

    /**
     * <p>
     * Container for the transition rule that describes when noncurrent objects
     * transition to the <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
     * <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
     * <code>DEEP_ARCHIVE</code> storage class. If your bucket is
     * versioning-enabled (or versioning is suspended), you can set this action
     * to request that Amazon S3 transition noncurrent object versions to the
     * <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
     * <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
     * <code>DEEP_ARCHIVE</code> storage class at a specific period in the
     * object's lifetime.
     * </p>
     *
     * @return <p>
     *         Container for the transition rule that describes when noncurrent
     *         objects transition to the <code>STANDARD_IA</code>,
     *         <code>ONEZONE_IA</code>, <code>INTELLIGENT_TIERING</code>,
     *         <code>GLACIER</code>, or <code>DEEP_ARCHIVE</code> storage class.
     *         If your bucket is versioning-enabled (or versioning is
     *         suspended), you can set this action to request that Amazon S3
     *         transition noncurrent object versions to the
     *         <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
     *         <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
     *         <code>DEEP_ARCHIVE</code> storage class at a specific period in
     *         the object's lifetime.
     *         </p>
     */
    public NoncurrentVersionTransition getNoncurrentVersionTransition() {
        return noncurrentVersionTransition;
    }

    /**
     * <p>
     * Container for the transition rule that describes when noncurrent objects
     * transition to the <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
     * <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
     * <code>DEEP_ARCHIVE</code> storage class. If your bucket is
     * versioning-enabled (or versioning is suspended), you can set this action
     * to request that Amazon S3 transition noncurrent object versions to the
     * <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
     * <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
     * <code>DEEP_ARCHIVE</code> storage class at a specific period in the
     * object's lifetime.
     * </p>
     *
     * @param noncurrentVersionTransition <p>
     *            Container for the transition rule that describes when
     *            noncurrent objects transition to the <code>STANDARD_IA</code>,
     *            <code>ONEZONE_IA</code>, <code>INTELLIGENT_TIERING</code>,
     *            <code>GLACIER</code>, or <code>DEEP_ARCHIVE</code> storage
     *            class. If your bucket is versioning-enabled (or versioning is
     *            suspended), you can set this action to request that Amazon S3
     *            transition noncurrent object versions to the
     *            <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
     *            <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
     *            <code>DEEP_ARCHIVE</code> storage class at a specific period
     *            in the object's lifetime.
     *            </p>
     */
    public void setNoncurrentVersionTransition(
            NoncurrentVersionTransition noncurrentVersionTransition) {
        this.noncurrentVersionTransition = noncurrentVersionTransition;
    }

    /**
     * <p>
     * Container for the transition rule that describes when noncurrent objects
     * transition to the <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
     * <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
     * <code>DEEP_ARCHIVE</code> storage class. If your bucket is
     * versioning-enabled (or versioning is suspended), you can set this action
     * to request that Amazon S3 transition noncurrent object versions to the
     * <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
     * <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
     * <code>DEEP_ARCHIVE</code> storage class at a specific period in the
     * object's lifetime.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noncurrentVersionTransition <p>
     *            Container for the transition rule that describes when
     *            noncurrent objects transition to the <code>STANDARD_IA</code>,
     *            <code>ONEZONE_IA</code>, <code>INTELLIGENT_TIERING</code>,
     *            <code>GLACIER</code>, or <code>DEEP_ARCHIVE</code> storage
     *            class. If your bucket is versioning-enabled (or versioning is
     *            suspended), you can set this action to request that Amazon S3
     *            transition noncurrent object versions to the
     *            <code>STANDARD_IA</code>, <code>ONEZONE_IA</code>,
     *            <code>INTELLIGENT_TIERING</code>, <code>GLACIER</code>, or
     *            <code>DEEP_ARCHIVE</code> storage class at a specific period
     *            in the object's lifetime.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withNoncurrentVersionTransition(
            NoncurrentVersionTransition noncurrentVersionTransition) {
        this.noncurrentVersionTransition = noncurrentVersionTransition;
        return this;
    }

    /**
     * <p>
     * Specifies when noncurrent object versions expire. Upon expiration, Amazon
     * S3 permanently deletes the noncurrent object versions. You set this
     * lifecycle configuration action on a bucket that has versioning enabled
     * (or suspended) to request that Amazon S3 delete noncurrent object
     * versions at a specific period in the object's lifetime.
     * </p>
     *
     * @return <p>
     *         Specifies when noncurrent object versions expire. Upon
     *         expiration, Amazon S3 permanently deletes the noncurrent object
     *         versions. You set this lifecycle configuration action on a bucket
     *         that has versioning enabled (or suspended) to request that Amazon
     *         S3 delete noncurrent object versions at a specific period in the
     *         object's lifetime.
     *         </p>
     */
    public NoncurrentVersionExpiration getNoncurrentVersionExpiration() {
        return noncurrentVersionExpiration;
    }

    /**
     * <p>
     * Specifies when noncurrent object versions expire. Upon expiration, Amazon
     * S3 permanently deletes the noncurrent object versions. You set this
     * lifecycle configuration action on a bucket that has versioning enabled
     * (or suspended) to request that Amazon S3 delete noncurrent object
     * versions at a specific period in the object's lifetime.
     * </p>
     *
     * @param noncurrentVersionExpiration <p>
     *            Specifies when noncurrent object versions expire. Upon
     *            expiration, Amazon S3 permanently deletes the noncurrent
     *            object versions. You set this lifecycle configuration action
     *            on a bucket that has versioning enabled (or suspended) to
     *            request that Amazon S3 delete noncurrent object versions at a
     *            specific period in the object's lifetime.
     *            </p>
     */
    public void setNoncurrentVersionExpiration(
            NoncurrentVersionExpiration noncurrentVersionExpiration) {
        this.noncurrentVersionExpiration = noncurrentVersionExpiration;
    }

    /**
     * <p>
     * Specifies when noncurrent object versions expire. Upon expiration, Amazon
     * S3 permanently deletes the noncurrent object versions. You set this
     * lifecycle configuration action on a bucket that has versioning enabled
     * (or suspended) to request that Amazon S3 delete noncurrent object
     * versions at a specific period in the object's lifetime.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noncurrentVersionExpiration <p>
     *            Specifies when noncurrent object versions expire. Upon
     *            expiration, Amazon S3 permanently deletes the noncurrent
     *            object versions. You set this lifecycle configuration action
     *            on a bucket that has versioning enabled (or suspended) to
     *            request that Amazon S3 delete noncurrent object versions at a
     *            specific period in the object's lifetime.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withNoncurrentVersionExpiration(
            NoncurrentVersionExpiration noncurrentVersionExpiration) {
        this.noncurrentVersionExpiration = noncurrentVersionExpiration;
        return this;
    }

    /**
     * <p>
     * Specifies the days since the initiation of an incomplete multipart upload
     * that Amazon S3 will wait before permanently removing all parts of the
     * upload. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @return <p>
     *         Specifies the days since the initiation of an incomplete
     *         multipart upload that Amazon S3 will wait before permanently
     *         removing all parts of the upload. For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *         > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     *         Policy</a> in the <i>Amazon Simple Storage Service Developer
     *         Guide</i>.
     *         </p>
     */
    public AbortIncompleteMultipartUpload getAbortIncompleteMultipartUpload() {
        return abortIncompleteMultipartUpload;
    }

    /**
     * <p>
     * Specifies the days since the initiation of an incomplete multipart upload
     * that Amazon S3 will wait before permanently removing all parts of the
     * upload. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     *
     * @param abortIncompleteMultipartUpload <p>
     *            Specifies the days since the initiation of an incomplete
     *            multipart upload that Amazon S3 will wait before permanently
     *            removing all parts of the upload. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *            > Aborting Incomplete Multipart Uploads Using a Bucket
     *            Lifecycle Policy</a> in the <i>Amazon Simple Storage Service
     *            Developer Guide</i>.
     *            </p>
     */
    public void setAbortIncompleteMultipartUpload(
            AbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
    }

    /**
     * <p>
     * Specifies the days since the initiation of an incomplete multipart upload
     * that Amazon S3 will wait before permanently removing all parts of the
     * upload. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * > Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a> in the <i>Amazon Simple Storage Service Developer Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortIncompleteMultipartUpload <p>
     *            Specifies the days since the initiation of an incomplete
     *            multipart upload that Amazon S3 will wait before permanently
     *            removing all parts of the upload. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *            > Aborting Incomplete Multipart Uploads Using a Bucket
     *            Lifecycle Policy</a> in the <i>Amazon Simple Storage Service
     *            Developer Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Rule withAbortIncompleteMultipartUpload(
            AbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
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
        if (getExpiration() != null)
            sb.append("Expiration: " + getExpiration() + ",");
        if (getID() != null)
            sb.append("ID: " + getID() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTransition() != null)
            sb.append("Transition: " + getTransition() + ",");
        if (getNoncurrentVersionTransition() != null)
            sb.append("NoncurrentVersionTransition: " + getNoncurrentVersionTransition() + ",");
        if (getNoncurrentVersionExpiration() != null)
            sb.append("NoncurrentVersionExpiration: " + getNoncurrentVersionExpiration() + ",");
        if (getAbortIncompleteMultipartUpload() != null)
            sb.append("AbortIncompleteMultipartUpload: " + getAbortIncompleteMultipartUpload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExpiration() == null) ? 0 : getExpiration().hashCode());
        hashCode = prime * hashCode + ((getID() == null) ? 0 : getID().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTransition() == null) ? 0 : getTransition().hashCode());
        hashCode = prime
                * hashCode
                + ((getNoncurrentVersionTransition() == null) ? 0
                        : getNoncurrentVersionTransition().hashCode());
        hashCode = prime
                * hashCode
                + ((getNoncurrentVersionExpiration() == null) ? 0
                        : getNoncurrentVersionExpiration().hashCode());
        hashCode = prime
                * hashCode
                + ((getAbortIncompleteMultipartUpload() == null) ? 0
                        : getAbortIncompleteMultipartUpload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Rule == false)
            return false;
        Rule other = (Rule) obj;

        if (other.getExpiration() == null ^ this.getExpiration() == null)
            return false;
        if (other.getExpiration() != null
                && other.getExpiration().equals(this.getExpiration()) == false)
            return false;
        if (other.getID() == null ^ this.getID() == null)
            return false;
        if (other.getID() != null && other.getID().equals(this.getID()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTransition() == null ^ this.getTransition() == null)
            return false;
        if (other.getTransition() != null
                && other.getTransition().equals(this.getTransition()) == false)
            return false;
        if (other.getNoncurrentVersionTransition() == null
                ^ this.getNoncurrentVersionTransition() == null)
            return false;
        if (other.getNoncurrentVersionTransition() != null
                && other.getNoncurrentVersionTransition().equals(
                        this.getNoncurrentVersionTransition()) == false)
            return false;
        if (other.getNoncurrentVersionExpiration() == null
                ^ this.getNoncurrentVersionExpiration() == null)
            return false;
        if (other.getNoncurrentVersionExpiration() != null
                && other.getNoncurrentVersionExpiration().equals(
                        this.getNoncurrentVersionExpiration()) == false)
            return false;
        if (other.getAbortIncompleteMultipartUpload() == null
                ^ this.getAbortIncompleteMultipartUpload() == null)
            return false;
        if (other.getAbortIncompleteMultipartUpload() != null
                && other.getAbortIncompleteMultipartUpload().equals(
                        this.getAbortIncompleteMultipartUpload()) == false)
            return false;
        return true;
    }
}
