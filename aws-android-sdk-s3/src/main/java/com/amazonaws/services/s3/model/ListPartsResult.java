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

public class ListPartsResult implements Serializable {
    /**
     * <p>
     * If the bucket has a lifecycle rule configured with an action to abort
     * incomplete multipart uploads and the prefix in the lifecycle rule matches
     * the object name in the request, then the response includes this header
     * indicating when the initiated multipart upload will become eligible for
     * abort operation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * >Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a>.
     * </p>
     * <p>
     * The response will also include the <code>x-amz-abort-rule-id</code>
     * header that will provide the ID of the lifecycle configuration rule that
     * defines this action.
     * </p>
     */
    private java.util.Date abortDate;

    /**
     * <p>
     * This header is returned along with the <code>x-amz-abort-date</code>
     * header. It identifies applicable lifecycle configuration rule that
     * defines the action to abort incomplete multipart uploads.
     * </p>
     */
    private String abortRuleId;

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String key;

    /**
     * <p>
     * Upload ID identifying the multipart upload whose parts are being listed.
     * </p>
     */
    private String uploadId;

    /**
     * <p>
     * When a list is truncated, this element specifies the last part in the
     * list, as well as the value to use for the part-number-marker request
     * parameter in a subsequent request.
     * </p>
     */
    private Integer partNumberMarker;

    /**
     * <p>
     * When a list is truncated, this element specifies the last part in the
     * list, as well as the value to use for the part-number-marker request
     * parameter in a subsequent request.
     * </p>
     */
    private Integer nextPartNumberMarker;

    /**
     * <p>
     * Maximum number of parts that were allowed in the response.
     * </p>
     */
    private Integer maxParts;

    /**
     * <p>
     * Indicates whether the returned list of parts is truncated. A true value
     * indicates that the list was truncated. A list can be truncated if the
     * number of parts exceeds the limit returned in the MaxParts element.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * Container for elements related to a particular part. A response can
     * contain zero or more <code>Part</code> elements.
     * </p>
     */
    private java.util.List<Part> parts;

    /**
     * <p>
     * Container element that identifies who initiated the multipart upload. If
     * the initiator is an AWS account, this element provides the same
     * information as the <code>Owner</code> element. If the initiator is an IAM
     * User, this element provides the user ARN and display name.
     * </p>
     */
    private Initiator initiator;

    /**
     * <p>
     * Container element that identifies the object owner, after the object is
     * created. If multipart upload is initiated by an IAM user, this element
     * provides the parent account ID and display name.
     * </p>
     */
    private Owner owner;

    /**
     * <p>
     * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the
     * uploaded object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     */
    private String storageClass;

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     */
    private String requestCharged;

    /**
     * <p>
     * If the bucket has a lifecycle rule configured with an action to abort
     * incomplete multipart uploads and the prefix in the lifecycle rule matches
     * the object name in the request, then the response includes this header
     * indicating when the initiated multipart upload will become eligible for
     * abort operation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * >Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a>.
     * </p>
     * <p>
     * The response will also include the <code>x-amz-abort-rule-id</code>
     * header that will provide the ID of the lifecycle configuration rule that
     * defines this action.
     * </p>
     *
     * @return <p>
     *         If the bucket has a lifecycle rule configured with an action to
     *         abort incomplete multipart uploads and the prefix in the
     *         lifecycle rule matches the object name in the request, then the
     *         response includes this header indicating when the initiated
     *         multipart upload will become eligible for abort operation. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *         >Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     *         Policy</a>.
     *         </p>
     *         <p>
     *         The response will also include the
     *         <code>x-amz-abort-rule-id</code> header that will provide the ID
     *         of the lifecycle configuration rule that defines this action.
     *         </p>
     */
    public java.util.Date getAbortDate() {
        return abortDate;
    }

    /**
     * <p>
     * If the bucket has a lifecycle rule configured with an action to abort
     * incomplete multipart uploads and the prefix in the lifecycle rule matches
     * the object name in the request, then the response includes this header
     * indicating when the initiated multipart upload will become eligible for
     * abort operation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * >Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a>.
     * </p>
     * <p>
     * The response will also include the <code>x-amz-abort-rule-id</code>
     * header that will provide the ID of the lifecycle configuration rule that
     * defines this action.
     * </p>
     *
     * @param abortDate <p>
     *            If the bucket has a lifecycle rule configured with an action
     *            to abort incomplete multipart uploads and the prefix in the
     *            lifecycle rule matches the object name in the request, then
     *            the response includes this header indicating when the
     *            initiated multipart upload will become eligible for abort
     *            operation. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *            >Aborting Incomplete Multipart Uploads Using a Bucket
     *            Lifecycle Policy</a>.
     *            </p>
     *            <p>
     *            The response will also include the
     *            <code>x-amz-abort-rule-id</code> header that will provide the
     *            ID of the lifecycle configuration rule that defines this
     *            action.
     *            </p>
     */
    public void setAbortDate(java.util.Date abortDate) {
        this.abortDate = abortDate;
    }

    /**
     * <p>
     * If the bucket has a lifecycle rule configured with an action to abort
     * incomplete multipart uploads and the prefix in the lifecycle rule matches
     * the object name in the request, then the response includes this header
     * indicating when the initiated multipart upload will become eligible for
     * abort operation. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     * >Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle
     * Policy</a>.
     * </p>
     * <p>
     * The response will also include the <code>x-amz-abort-rule-id</code>
     * header that will provide the ID of the lifecycle configuration rule that
     * defines this action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortDate <p>
     *            If the bucket has a lifecycle rule configured with an action
     *            to abort incomplete multipart uploads and the prefix in the
     *            lifecycle rule matches the object name in the request, then
     *            the response includes this header indicating when the
     *            initiated multipart upload will become eligible for abort
     *            operation. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config"
     *            >Aborting Incomplete Multipart Uploads Using a Bucket
     *            Lifecycle Policy</a>.
     *            </p>
     *            <p>
     *            The response will also include the
     *            <code>x-amz-abort-rule-id</code> header that will provide the
     *            ID of the lifecycle configuration rule that defines this
     *            action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withAbortDate(java.util.Date abortDate) {
        this.abortDate = abortDate;
        return this;
    }

    /**
     * <p>
     * This header is returned along with the <code>x-amz-abort-date</code>
     * header. It identifies applicable lifecycle configuration rule that
     * defines the action to abort incomplete multipart uploads.
     * </p>
     *
     * @return <p>
     *         This header is returned along with the
     *         <code>x-amz-abort-date</code> header. It identifies applicable
     *         lifecycle configuration rule that defines the action to abort
     *         incomplete multipart uploads.
     *         </p>
     */
    public String getAbortRuleId() {
        return abortRuleId;
    }

    /**
     * <p>
     * This header is returned along with the <code>x-amz-abort-date</code>
     * header. It identifies applicable lifecycle configuration rule that
     * defines the action to abort incomplete multipart uploads.
     * </p>
     *
     * @param abortRuleId <p>
     *            This header is returned along with the
     *            <code>x-amz-abort-date</code> header. It identifies applicable
     *            lifecycle configuration rule that defines the action to abort
     *            incomplete multipart uploads.
     *            </p>
     */
    public void setAbortRuleId(String abortRuleId) {
        this.abortRuleId = abortRuleId;
    }

    /**
     * <p>
     * This header is returned along with the <code>x-amz-abort-date</code>
     * header. It identifies applicable lifecycle configuration rule that
     * defines the action to abort incomplete multipart uploads.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param abortRuleId <p>
     *            This header is returned along with the
     *            <code>x-amz-abort-date</code> header. It identifies applicable
     *            lifecycle configuration rule that defines the action to abort
     *            incomplete multipart uploads.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withAbortRuleId(String abortRuleId) {
        this.abortRuleId = abortRuleId;
        return this;
    }

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     *
     * @return <p>
     *         Name of the bucket to which the multipart upload was initiated.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     *
     * @param bucket <p>
     *            Name of the bucket to which the multipart upload was
     *            initiated.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * Name of the bucket to which the multipart upload was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            Name of the bucket to which the multipart upload was
     *            initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Object key for which the multipart upload was initiated.
     *         </p>
     */
    public String getKey() {
        return key;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the multipart upload was initiated.
     *            </p>
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * Object key for which the multipart upload was initiated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param key <p>
     *            Object key for which the multipart upload was initiated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * <p>
     * Upload ID identifying the multipart upload whose parts are being listed.
     * </p>
     *
     * @return <p>
     *         Upload ID identifying the multipart upload whose parts are being
     *         listed.
     *         </p>
     */
    public String getUploadId() {
        return uploadId;
    }

    /**
     * <p>
     * Upload ID identifying the multipart upload whose parts are being listed.
     * </p>
     *
     * @param uploadId <p>
     *            Upload ID identifying the multipart upload whose parts are
     *            being listed.
     *            </p>
     */
    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * Upload ID identifying the multipart upload whose parts are being listed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uploadId <p>
     *            Upload ID identifying the multipart upload whose parts are
     *            being listed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the last part in the
     * list, as well as the value to use for the part-number-marker request
     * parameter in a subsequent request.
     * </p>
     *
     * @return <p>
     *         When a list is truncated, this element specifies the last part in
     *         the list, as well as the value to use for the part-number-marker
     *         request parameter in a subsequent request.
     *         </p>
     */
    public Integer getPartNumberMarker() {
        return partNumberMarker;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the last part in the
     * list, as well as the value to use for the part-number-marker request
     * parameter in a subsequent request.
     * </p>
     *
     * @param partNumberMarker <p>
     *            When a list is truncated, this element specifies the last part
     *            in the list, as well as the value to use for the
     *            part-number-marker request parameter in a subsequent request.
     *            </p>
     */
    public void setPartNumberMarker(Integer partNumberMarker) {
        this.partNumberMarker = partNumberMarker;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the last part in the
     * list, as well as the value to use for the part-number-marker request
     * parameter in a subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param partNumberMarker <p>
     *            When a list is truncated, this element specifies the last part
     *            in the list, as well as the value to use for the
     *            part-number-marker request parameter in a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withPartNumberMarker(Integer partNumberMarker) {
        this.partNumberMarker = partNumberMarker;
        return this;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the last part in the
     * list, as well as the value to use for the part-number-marker request
     * parameter in a subsequent request.
     * </p>
     *
     * @return <p>
     *         When a list is truncated, this element specifies the last part in
     *         the list, as well as the value to use for the part-number-marker
     *         request parameter in a subsequent request.
     *         </p>
     */
    public Integer getNextPartNumberMarker() {
        return nextPartNumberMarker;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the last part in the
     * list, as well as the value to use for the part-number-marker request
     * parameter in a subsequent request.
     * </p>
     *
     * @param nextPartNumberMarker <p>
     *            When a list is truncated, this element specifies the last part
     *            in the list, as well as the value to use for the
     *            part-number-marker request parameter in a subsequent request.
     *            </p>
     */
    public void setNextPartNumberMarker(Integer nextPartNumberMarker) {
        this.nextPartNumberMarker = nextPartNumberMarker;
    }

    /**
     * <p>
     * When a list is truncated, this element specifies the last part in the
     * list, as well as the value to use for the part-number-marker request
     * parameter in a subsequent request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextPartNumberMarker <p>
     *            When a list is truncated, this element specifies the last part
     *            in the list, as well as the value to use for the
     *            part-number-marker request parameter in a subsequent request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withNextPartNumberMarker(Integer nextPartNumberMarker) {
        this.nextPartNumberMarker = nextPartNumberMarker;
        return this;
    }

    /**
     * <p>
     * Maximum number of parts that were allowed in the response.
     * </p>
     *
     * @return <p>
     *         Maximum number of parts that were allowed in the response.
     *         </p>
     */
    public Integer getMaxParts() {
        return maxParts;
    }

    /**
     * <p>
     * Maximum number of parts that were allowed in the response.
     * </p>
     *
     * @param maxParts <p>
     *            Maximum number of parts that were allowed in the response.
     *            </p>
     */
    public void setMaxParts(Integer maxParts) {
        this.maxParts = maxParts;
    }

    /**
     * <p>
     * Maximum number of parts that were allowed in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxParts <p>
     *            Maximum number of parts that were allowed in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withMaxParts(Integer maxParts) {
        this.maxParts = maxParts;
        return this;
    }

    /**
     * <p>
     * Indicates whether the returned list of parts is truncated. A true value
     * indicates that the list was truncated. A list can be truncated if the
     * number of parts exceeds the limit returned in the MaxParts element.
     * </p>
     *
     * @return <p>
     *         Indicates whether the returned list of parts is truncated. A true
     *         value indicates that the list was truncated. A list can be
     *         truncated if the number of parts exceeds the limit returned in
     *         the MaxParts element.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of parts is truncated. A true value
     * indicates that the list was truncated. A list can be truncated if the
     * number of parts exceeds the limit returned in the MaxParts element.
     * </p>
     *
     * @return <p>
     *         Indicates whether the returned list of parts is truncated. A true
     *         value indicates that the list was truncated. A list can be
     *         truncated if the number of parts exceeds the limit returned in
     *         the MaxParts element.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of parts is truncated. A true value
     * indicates that the list was truncated. A list can be truncated if the
     * number of parts exceeds the limit returned in the MaxParts element.
     * </p>
     *
     * @param isTruncated <p>
     *            Indicates whether the returned list of parts is truncated. A
     *            true value indicates that the list was truncated. A list can
     *            be truncated if the number of parts exceeds the limit returned
     *            in the MaxParts element.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * Indicates whether the returned list of parts is truncated. A true value
     * indicates that the list was truncated. A list can be truncated if the
     * number of parts exceeds the limit returned in the MaxParts element.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            Indicates whether the returned list of parts is truncated. A
     *            true value indicates that the list was truncated. A list can
     *            be truncated if the number of parts exceeds the limit returned
     *            in the MaxParts element.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * Container for elements related to a particular part. A response can
     * contain zero or more <code>Part</code> elements.
     * </p>
     *
     * @return <p>
     *         Container for elements related to a particular part. A response
     *         can contain zero or more <code>Part</code> elements.
     *         </p>
     */
    public java.util.List<Part> getParts() {
        return parts;
    }

    /**
     * <p>
     * Container for elements related to a particular part. A response can
     * contain zero or more <code>Part</code> elements.
     * </p>
     *
     * @param parts <p>
     *            Container for elements related to a particular part. A
     *            response can contain zero or more <code>Part</code> elements.
     *            </p>
     */
    public void setParts(java.util.Collection<Part> parts) {
        if (parts == null) {
            this.parts = null;
            return;
        }

        this.parts = new java.util.ArrayList<Part>(parts);
    }

    /**
     * <p>
     * Container for elements related to a particular part. A response can
     * contain zero or more <code>Part</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parts <p>
     *            Container for elements related to a particular part. A
     *            response can contain zero or more <code>Part</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withParts(Part... parts) {
        if (getParts() == null) {
            this.parts = new java.util.ArrayList<Part>(parts.length);
        }
        for (Part value : parts) {
            this.parts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Container for elements related to a particular part. A response can
     * contain zero or more <code>Part</code> elements.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parts <p>
     *            Container for elements related to a particular part. A
     *            response can contain zero or more <code>Part</code> elements.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withParts(java.util.Collection<Part> parts) {
        setParts(parts);
        return this;
    }

    /**
     * <p>
     * Container element that identifies who initiated the multipart upload. If
     * the initiator is an AWS account, this element provides the same
     * information as the <code>Owner</code> element. If the initiator is an IAM
     * User, this element provides the user ARN and display name.
     * </p>
     *
     * @return <p>
     *         Container element that identifies who initiated the multipart
     *         upload. If the initiator is an AWS account, this element provides
     *         the same information as the <code>Owner</code> element. If the
     *         initiator is an IAM User, this element provides the user ARN and
     *         display name.
     *         </p>
     */
    public Initiator getInitiator() {
        return initiator;
    }

    /**
     * <p>
     * Container element that identifies who initiated the multipart upload. If
     * the initiator is an AWS account, this element provides the same
     * information as the <code>Owner</code> element. If the initiator is an IAM
     * User, this element provides the user ARN and display name.
     * </p>
     *
     * @param initiator <p>
     *            Container element that identifies who initiated the multipart
     *            upload. If the initiator is an AWS account, this element
     *            provides the same information as the <code>Owner</code>
     *            element. If the initiator is an IAM User, this element
     *            provides the user ARN and display name.
     *            </p>
     */
    public void setInitiator(Initiator initiator) {
        this.initiator = initiator;
    }

    /**
     * <p>
     * Container element that identifies who initiated the multipart upload. If
     * the initiator is an AWS account, this element provides the same
     * information as the <code>Owner</code> element. If the initiator is an IAM
     * User, this element provides the user ARN and display name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param initiator <p>
     *            Container element that identifies who initiated the multipart
     *            upload. If the initiator is an AWS account, this element
     *            provides the same information as the <code>Owner</code>
     *            element. If the initiator is an IAM User, this element
     *            provides the user ARN and display name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withInitiator(Initiator initiator) {
        this.initiator = initiator;
        return this;
    }

    /**
     * <p>
     * Container element that identifies the object owner, after the object is
     * created. If multipart upload is initiated by an IAM user, this element
     * provides the parent account ID and display name.
     * </p>
     *
     * @return <p>
     *         Container element that identifies the object owner, after the
     *         object is created. If multipart upload is initiated by an IAM
     *         user, this element provides the parent account ID and display
     *         name.
     *         </p>
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * <p>
     * Container element that identifies the object owner, after the object is
     * created. If multipart upload is initiated by an IAM user, this element
     * provides the parent account ID and display name.
     * </p>
     *
     * @param owner <p>
     *            Container element that identifies the object owner, after the
     *            object is created. If multipart upload is initiated by an IAM
     *            user, this element provides the parent account ID and display
     *            name.
     *            </p>
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * Container element that identifies the object owner, after the object is
     * created. If multipart upload is initiated by an IAM user, this element
     * provides the parent account ID and display name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            Container element that identifies the object owner, after the
     *            object is created. If multipart upload is initiated by an IAM
     *            user, this element provides the parent account ID and display
     *            name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListPartsResult withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    /**
     * <p>
     * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the
     * uploaded object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @return <p>
     *         Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store
     *         the uploaded object.
     *         </p>
     * @see StorageClass
     */
    public String getStorageClass() {
        return storageClass;
    }

    /**
     * <p>
     * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the
     * uploaded object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            Class of storage (STANDARD or REDUCED_REDUNDANCY) used to
     *            store the uploaded object.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    /**
     * <p>
     * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the
     * uploaded object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            Class of storage (STANDARD or REDUCED_REDUNDANCY) used to
     *            store the uploaded object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public ListPartsResult withStorageClass(String storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    /**
     * <p>
     * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the
     * uploaded object.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            Class of storage (STANDARD or REDUCED_REDUNDANCY) used to
     *            store the uploaded object.
     *            </p>
     * @see StorageClass
     */
    public void setStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
    }

    /**
     * <p>
     * Class of storage (STANDARD or REDUCED_REDUNDANCY) used to store the
     * uploaded object.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>STANDARD, REDUCED_REDUNDANCY, STANDARD_IA,
     * ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE
     *
     * @param storageClass <p>
     *            Class of storage (STANDARD or REDUCED_REDUNDANCY) used to
     *            store the uploaded object.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StorageClass
     */
    public ListPartsResult withStorageClass(StorageClass storageClass) {
        this.storageClass = storageClass.toString();
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @return <p>
     *         If present, indicates that the requester was successfully charged
     *         for the request.
     *         </p>
     * @see RequestCharged
     */
    public String getRequestCharged() {
        return requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public ListPartsResult withRequestCharged(String requestCharged) {
        this.requestCharged = requestCharged;
        return this;
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @see RequestCharged
     */
    public void setRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
    }

    /**
     * <p>
     * If present, indicates that the requester was successfully charged for the
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requester
     *
     * @param requestCharged <p>
     *            If present, indicates that the requester was successfully
     *            charged for the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RequestCharged
     */
    public ListPartsResult withRequestCharged(RequestCharged requestCharged) {
        this.requestCharged = requestCharged.toString();
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
        if (getAbortDate() != null)
            sb.append("AbortDate: " + getAbortDate() + ",");
        if (getAbortRuleId() != null)
            sb.append("AbortRuleId: " + getAbortRuleId() + ",");
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getUploadId() != null)
            sb.append("UploadId: " + getUploadId() + ",");
        if (getPartNumberMarker() != null)
            sb.append("PartNumberMarker: " + getPartNumberMarker() + ",");
        if (getNextPartNumberMarker() != null)
            sb.append("NextPartNumberMarker: " + getNextPartNumberMarker() + ",");
        if (getMaxParts() != null)
            sb.append("MaxParts: " + getMaxParts() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getParts() != null)
            sb.append("Parts: " + getParts() + ",");
        if (getInitiator() != null)
            sb.append("Initiator: " + getInitiator() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner() + ",");
        if (getStorageClass() != null)
            sb.append("StorageClass: " + getStorageClass() + ",");
        if (getRequestCharged() != null)
            sb.append("RequestCharged: " + getRequestCharged());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAbortDate() == null) ? 0 : getAbortDate().hashCode());
        hashCode = prime * hashCode
                + ((getAbortRuleId() == null) ? 0 : getAbortRuleId().hashCode());
        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode
                + ((getPartNumberMarker() == null) ? 0 : getPartNumberMarker().hashCode());
        hashCode = prime * hashCode
                + ((getNextPartNumberMarker() == null) ? 0 : getNextPartNumberMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxParts() == null) ? 0 : getMaxParts().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getParts() == null) ? 0 : getParts().hashCode());
        hashCode = prime * hashCode + ((getInitiator() == null) ? 0 : getInitiator().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode
                + ((getStorageClass() == null) ? 0 : getStorageClass().hashCode());
        hashCode = prime * hashCode
                + ((getRequestCharged() == null) ? 0 : getRequestCharged().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPartsResult == false)
            return false;
        ListPartsResult other = (ListPartsResult) obj;

        if (other.getAbortDate() == null ^ this.getAbortDate() == null)
            return false;
        if (other.getAbortDate() != null
                && other.getAbortDate().equals(this.getAbortDate()) == false)
            return false;
        if (other.getAbortRuleId() == null ^ this.getAbortRuleId() == null)
            return false;
        if (other.getAbortRuleId() != null
                && other.getAbortRuleId().equals(this.getAbortRuleId()) == false)
            return false;
        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getPartNumberMarker() == null ^ this.getPartNumberMarker() == null)
            return false;
        if (other.getPartNumberMarker() != null
                && other.getPartNumberMarker().equals(this.getPartNumberMarker()) == false)
            return false;
        if (other.getNextPartNumberMarker() == null ^ this.getNextPartNumberMarker() == null)
            return false;
        if (other.getNextPartNumberMarker() != null
                && other.getNextPartNumberMarker().equals(this.getNextPartNumberMarker()) == false)
            return false;
        if (other.getMaxParts() == null ^ this.getMaxParts() == null)
            return false;
        if (other.getMaxParts() != null && other.getMaxParts().equals(this.getMaxParts()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getParts() == null ^ this.getParts() == null)
            return false;
        if (other.getParts() != null && other.getParts().equals(this.getParts()) == false)
            return false;
        if (other.getInitiator() == null ^ this.getInitiator() == null)
            return false;
        if (other.getInitiator() != null
                && other.getInitiator().equals(this.getInitiator()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getStorageClass() == null ^ this.getStorageClass() == null)
            return false;
        if (other.getStorageClass() != null
                && other.getStorageClass().equals(this.getStorageClass()) == false)
            return false;
        if (other.getRequestCharged() == null ^ this.getRequestCharged() == null)
            return false;
        if (other.getRequestCharged() != null
                && other.getRequestCharged().equals(this.getRequestCharged()) == false)
            return false;
        return true;
    }
}
