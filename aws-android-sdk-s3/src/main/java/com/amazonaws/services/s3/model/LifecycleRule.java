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
 * A lifecycle rule for individual objects in an Amazon S3 bucket.
 * </p>
 */
public class LifecycleRule implements Serializable {
    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object in the form of
     * date, days and, whether the object has a delete marker.
     * </p>
     */
    private LifecycleExpiration expiration;

    /**
     * <p>
     * Unique identifier for the rule. The value cannot be longer than 255
     * characters.
     * </p>
     */
    private String iD;

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies. This is
     * No longer used; use <code>Filter</code> instead.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The <code>Filter</code> is used to identify objects that a Lifecycle Rule
     * applies to. A <code>Filter</code> must have exactly one of
     * <code>Prefix</code>, <code>Tag</code>, or <code>And</code> specified.
     * </p>
     */
    private LifecycleRuleFilter filter;

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the
     * rule is not currently being applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     */
    private String status;

    /**
     * <p>
     * Specifies when an Amazon S3 object transitions to a specified storage
     * class.
     * </p>
     */
    private java.util.List<Transition> transitions;

    /**
     * <p>
     * Specifies the transition rule for the lifecycle rule that describes when
     * noncurrent objects transition to a specific storage class. If your bucket
     * is versioning-enabled (or versioning is suspended), you can set this
     * action to request that Amazon S3 transition noncurrent object versions to
     * a specific storage class at a set period in the object's lifetime.
     * </p>
     */
    private java.util.List<NoncurrentVersionTransition> noncurrentVersionTransitions;

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
     * Specifies the expiration for the lifecycle of the object in the form of
     * date, days and, whether the object has a delete marker.
     * </p>
     *
     * @return <p>
     *         Specifies the expiration for the lifecycle of the object in the
     *         form of date, days and, whether the object has a delete marker.
     *         </p>
     */
    public LifecycleExpiration getExpiration() {
        return expiration;
    }

    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object in the form of
     * date, days and, whether the object has a delete marker.
     * </p>
     *
     * @param expiration <p>
     *            Specifies the expiration for the lifecycle of the object in
     *            the form of date, days and, whether the object has a delete
     *            marker.
     *            </p>
     */
    public void setExpiration(LifecycleExpiration expiration) {
        this.expiration = expiration;
    }

    /**
     * <p>
     * Specifies the expiration for the lifecycle of the object in the form of
     * date, days and, whether the object has a delete marker.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param expiration <p>
     *            Specifies the expiration for the lifecycle of the object in
     *            the form of date, days and, whether the object has a delete
     *            marker.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRule withExpiration(LifecycleExpiration expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * <p>
     * Unique identifier for the rule. The value cannot be longer than 255
     * characters.
     * </p>
     *
     * @return <p>
     *         Unique identifier for the rule. The value cannot be longer than
     *         255 characters.
     *         </p>
     */
    public String getID() {
        return iD;
    }

    /**
     * <p>
     * Unique identifier for the rule. The value cannot be longer than 255
     * characters.
     * </p>
     *
     * @param iD <p>
     *            Unique identifier for the rule. The value cannot be longer
     *            than 255 characters.
     *            </p>
     */
    public void setID(String iD) {
        this.iD = iD;
    }

    /**
     * <p>
     * Unique identifier for the rule. The value cannot be longer than 255
     * characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iD <p>
     *            Unique identifier for the rule. The value cannot be longer
     *            than 255 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRule withID(String iD) {
        this.iD = iD;
        return this;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies. This is
     * No longer used; use <code>Filter</code> instead.
     * </p>
     *
     * @return <p>
     *         Prefix identifying one or more objects to which the rule applies.
     *         This is No longer used; use <code>Filter</code> instead.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies. This is
     * No longer used; use <code>Filter</code> instead.
     * </p>
     *
     * @param prefix <p>
     *            Prefix identifying one or more objects to which the rule
     *            applies. This is No longer used; use <code>Filter</code>
     *            instead.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * Prefix identifying one or more objects to which the rule applies. This is
     * No longer used; use <code>Filter</code> instead.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            Prefix identifying one or more objects to which the rule
     *            applies. This is No longer used; use <code>Filter</code>
     *            instead.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRule withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * The <code>Filter</code> is used to identify objects that a Lifecycle Rule
     * applies to. A <code>Filter</code> must have exactly one of
     * <code>Prefix</code>, <code>Tag</code>, or <code>And</code> specified.
     * </p>
     *
     * @return <p>
     *         The <code>Filter</code> is used to identify objects that a
     *         Lifecycle Rule applies to. A <code>Filter</code> must have
     *         exactly one of <code>Prefix</code>, <code>Tag</code>, or
     *         <code>And</code> specified.
     *         </p>
     */
    public LifecycleRuleFilter getFilter() {
        return filter;
    }

    /**
     * <p>
     * The <code>Filter</code> is used to identify objects that a Lifecycle Rule
     * applies to. A <code>Filter</code> must have exactly one of
     * <code>Prefix</code>, <code>Tag</code>, or <code>And</code> specified.
     * </p>
     *
     * @param filter <p>
     *            The <code>Filter</code> is used to identify objects that a
     *            Lifecycle Rule applies to. A <code>Filter</code> must have
     *            exactly one of <code>Prefix</code>, <code>Tag</code>, or
     *            <code>And</code> specified.
     *            </p>
     */
    public void setFilter(LifecycleRuleFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The <code>Filter</code> is used to identify objects that a Lifecycle Rule
     * applies to. A <code>Filter</code> must have exactly one of
     * <code>Prefix</code>, <code>Tag</code>, or <code>And</code> specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filter <p>
     *            The <code>Filter</code> is used to identify objects that a
     *            Lifecycle Rule applies to. A <code>Filter</code> must have
     *            exactly one of <code>Prefix</code>, <code>Tag</code>, or
     *            <code>And</code> specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRule withFilter(LifecycleRuleFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the
     * rule is not currently being applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @return <p>
     *         If 'Enabled', the rule is currently being applied. If 'Disabled',
     *         the rule is not currently being applied.
     *         </p>
     * @see ExpirationStatus
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the
     * rule is not currently being applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            If 'Enabled', the rule is currently being applied. If
     *            'Disabled', the rule is not currently being applied.
     *            </p>
     * @see ExpirationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the
     * rule is not currently being applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            If 'Enabled', the rule is currently being applied. If
     *            'Disabled', the rule is not currently being applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpirationStatus
     */
    public LifecycleRule withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the
     * rule is not currently being applied.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            If 'Enabled', the rule is currently being applied. If
     *            'Disabled', the rule is not currently being applied.
     *            </p>
     * @see ExpirationStatus
     */
    public void setStatus(ExpirationStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * If 'Enabled', the rule is currently being applied. If 'Disabled', the
     * rule is not currently being applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Enabled, Disabled
     *
     * @param status <p>
     *            If 'Enabled', the rule is currently being applied. If
     *            'Disabled', the rule is not currently being applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ExpirationStatus
     */
    public LifecycleRule withStatus(ExpirationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies when an Amazon S3 object transitions to a specified storage
     * class.
     * </p>
     *
     * @return <p>
     *         Specifies when an Amazon S3 object transitions to a specified
     *         storage class.
     *         </p>
     */
    public java.util.List<Transition> getTransitions() {
        return transitions;
    }

    /**
     * <p>
     * Specifies when an Amazon S3 object transitions to a specified storage
     * class.
     * </p>
     *
     * @param transitions <p>
     *            Specifies when an Amazon S3 object transitions to a specified
     *            storage class.
     *            </p>
     */
    public void setTransitions(java.util.Collection<Transition> transitions) {
        if (transitions == null) {
            this.transitions = null;
            return;
        }

        this.transitions = new java.util.ArrayList<Transition>(transitions);
    }

    /**
     * <p>
     * Specifies when an Amazon S3 object transitions to a specified storage
     * class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitions <p>
     *            Specifies when an Amazon S3 object transitions to a specified
     *            storage class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRule withTransitions(Transition... transitions) {
        if (getTransitions() == null) {
            this.transitions = new java.util.ArrayList<Transition>(transitions.length);
        }
        for (Transition value : transitions) {
            this.transitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies when an Amazon S3 object transitions to a specified storage
     * class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param transitions <p>
     *            Specifies when an Amazon S3 object transitions to a specified
     *            storage class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRule withTransitions(java.util.Collection<Transition> transitions) {
        setTransitions(transitions);
        return this;
    }

    /**
     * <p>
     * Specifies the transition rule for the lifecycle rule that describes when
     * noncurrent objects transition to a specific storage class. If your bucket
     * is versioning-enabled (or versioning is suspended), you can set this
     * action to request that Amazon S3 transition noncurrent object versions to
     * a specific storage class at a set period in the object's lifetime.
     * </p>
     *
     * @return <p>
     *         Specifies the transition rule for the lifecycle rule that
     *         describes when noncurrent objects transition to a specific
     *         storage class. If your bucket is versioning-enabled (or
     *         versioning is suspended), you can set this action to request that
     *         Amazon S3 transition noncurrent object versions to a specific
     *         storage class at a set period in the object's lifetime.
     *         </p>
     */
    public java.util.List<NoncurrentVersionTransition> getNoncurrentVersionTransitions() {
        return noncurrentVersionTransitions;
    }

    /**
     * <p>
     * Specifies the transition rule for the lifecycle rule that describes when
     * noncurrent objects transition to a specific storage class. If your bucket
     * is versioning-enabled (or versioning is suspended), you can set this
     * action to request that Amazon S3 transition noncurrent object versions to
     * a specific storage class at a set period in the object's lifetime.
     * </p>
     *
     * @param noncurrentVersionTransitions <p>
     *            Specifies the transition rule for the lifecycle rule that
     *            describes when noncurrent objects transition to a specific
     *            storage class. If your bucket is versioning-enabled (or
     *            versioning is suspended), you can set this action to request
     *            that Amazon S3 transition noncurrent object versions to a
     *            specific storage class at a set period in the object's
     *            lifetime.
     *            </p>
     */
    public void setNoncurrentVersionTransitions(
            java.util.Collection<NoncurrentVersionTransition> noncurrentVersionTransitions) {
        if (noncurrentVersionTransitions == null) {
            this.noncurrentVersionTransitions = null;
            return;
        }

        this.noncurrentVersionTransitions = new java.util.ArrayList<NoncurrentVersionTransition>(
                noncurrentVersionTransitions);
    }

    /**
     * <p>
     * Specifies the transition rule for the lifecycle rule that describes when
     * noncurrent objects transition to a specific storage class. If your bucket
     * is versioning-enabled (or versioning is suspended), you can set this
     * action to request that Amazon S3 transition noncurrent object versions to
     * a specific storage class at a set period in the object's lifetime.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noncurrentVersionTransitions <p>
     *            Specifies the transition rule for the lifecycle rule that
     *            describes when noncurrent objects transition to a specific
     *            storage class. If your bucket is versioning-enabled (or
     *            versioning is suspended), you can set this action to request
     *            that Amazon S3 transition noncurrent object versions to a
     *            specific storage class at a set period in the object's
     *            lifetime.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRule withNoncurrentVersionTransitions(
            NoncurrentVersionTransition... noncurrentVersionTransitions) {
        if (getNoncurrentVersionTransitions() == null) {
            this.noncurrentVersionTransitions = new java.util.ArrayList<NoncurrentVersionTransition>(
                    noncurrentVersionTransitions.length);
        }
        for (NoncurrentVersionTransition value : noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the transition rule for the lifecycle rule that describes when
     * noncurrent objects transition to a specific storage class. If your bucket
     * is versioning-enabled (or versioning is suspended), you can set this
     * action to request that Amazon S3 transition noncurrent object versions to
     * a specific storage class at a set period in the object's lifetime.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param noncurrentVersionTransitions <p>
     *            Specifies the transition rule for the lifecycle rule that
     *            describes when noncurrent objects transition to a specific
     *            storage class. If your bucket is versioning-enabled (or
     *            versioning is suspended), you can set this action to request
     *            that Amazon S3 transition noncurrent object versions to a
     *            specific storage class at a set period in the object's
     *            lifetime.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LifecycleRule withNoncurrentVersionTransitions(
            java.util.Collection<NoncurrentVersionTransition> noncurrentVersionTransitions) {
        setNoncurrentVersionTransitions(noncurrentVersionTransitions);
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
    public LifecycleRule withNoncurrentVersionExpiration(
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
    public LifecycleRule withAbortIncompleteMultipartUpload(
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
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getTransitions() != null)
            sb.append("Transitions: " + getTransitions() + ",");
        if (getNoncurrentVersionTransitions() != null)
            sb.append("NoncurrentVersionTransitions: " + getNoncurrentVersionTransitions() + ",");
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
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getTransitions() == null) ? 0 : getTransitions().hashCode());
        hashCode = prime
                * hashCode
                + ((getNoncurrentVersionTransitions() == null) ? 0
                        : getNoncurrentVersionTransitions().hashCode());
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

        if (obj instanceof LifecycleRule == false)
            return false;
        LifecycleRule other = (LifecycleRule) obj;

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
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTransitions() == null ^ this.getTransitions() == null)
            return false;
        if (other.getTransitions() != null
                && other.getTransitions().equals(this.getTransitions()) == false)
            return false;
        if (other.getNoncurrentVersionTransitions() == null
                ^ this.getNoncurrentVersionTransitions() == null)
            return false;
        if (other.getNoncurrentVersionTransitions() != null
                && other.getNoncurrentVersionTransitions().equals(
                        this.getNoncurrentVersionTransitions()) == false)
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
