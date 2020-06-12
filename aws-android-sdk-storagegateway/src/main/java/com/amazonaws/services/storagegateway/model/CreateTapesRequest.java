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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates one or more virtual tapes. You write data to the virtual tapes and
 * then archive the tapes. This operation is only supported in the tape gateway
 * type.
 * </p>
 * <note>
 * <p>
 * Cache storage must be allocated to the gateway before you can create virtual
 * tapes. Use the <a>AddCache</a> operation to add cache storage to a gateway.
 * </p>
 * </note>
 */
public class CreateTapesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to
     * associate the virtual tapes with. Use the <a>ListGateways</a> operation
     * to return a list of gateways for your account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 bytes).
     * </p>
     * </note>
     */
    private Long tapeSizeInBytes;

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape
     * multiple times.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     */
    private String clientToken;

    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     */
    private Integer numTapesToCreate;

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are
     * creating. This prefix makes the barcode unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the
     * uppercase letters from A to Z.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     */
    private String tapeBarcodePrefix;

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with
     * your own AWS KMS key, or <code>false</code> to use a key managed by
     * Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean kMSEncrypted;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK)
     * used for Amazon S3 server-side encryption. Storage Gateway does not
     * support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     */
    private String kMSKey;

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The
     * tape in this pool is archived in the S3 storage class that is associated
     * with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3
     * Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String poolId;

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a virtual tape. Each tag
     * is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers
     * representable in UTF-8 format, and the following special characters: + -
     * = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to
     * associate the virtual tapes with. Use the <a>ListGateways</a> operation
     * to return a list of gateways for your account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The unique Amazon Resource Name (ARN) that represents the gateway
     *         to associate the virtual tapes with. Use the <a>ListGateways</a>
     *         operation to return a list of gateways for your account and AWS
     *         Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to
     * associate the virtual tapes with. Use the <a>ListGateways</a> operation
     * to return a list of gateways for your account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The unique Amazon Resource Name (ARN) that represents the
     *            gateway to associate the virtual tapes with. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The unique Amazon Resource Name (ARN) that represents the gateway to
     * associate the virtual tapes with. Use the <a>ListGateways</a> operation
     * to return a list of gateways for your account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The unique Amazon Resource Name (ARN) that represents the
     *            gateway to associate the virtual tapes with. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTapesRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 bytes).
     * </p>
     * </note>
     *
     * @return <p>
     *         The size, in bytes, of the virtual tapes that you want to create.
     *         </p>
     *         <note>
     *         <p>
     *         The size must be aligned by gigabyte (1024*1024*1024 bytes).
     *         </p>
     *         </note>
     */
    public Long getTapeSizeInBytes() {
        return tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 bytes).
     * </p>
     * </note>
     *
     * @param tapeSizeInBytes <p>
     *            The size, in bytes, of the virtual tapes that you want to
     *            create.
     *            </p>
     *            <note>
     *            <p>
     *            The size must be aligned by gigabyte (1024*1024*1024 bytes).
     *            </p>
     *            </note>
     */
    public void setTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
    }

    /**
     * <p>
     * The size, in bytes, of the virtual tapes that you want to create.
     * </p>
     * <note>
     * <p>
     * The size must be aligned by gigabyte (1024*1024*1024 bytes).
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tapeSizeInBytes <p>
     *            The size, in bytes, of the virtual tapes that you want to
     *            create.
     *            </p>
     *            <note>
     *            <p>
     *            The size must be aligned by gigabyte (1024*1024*1024 bytes).
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTapesRequest withTapeSizeInBytes(Long tapeSizeInBytes) {
        this.tapeSizeInBytes = tapeSizeInBytes;
        return this;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape
     * multiple times.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @return <p>
     *         A unique identifier that you use to retry a request. If you retry
     *         a request, use the same <code>ClientToken</code> you specified in
     *         the initial request.
     *         </p>
     *         <note>
     *         <p>
     *         Using the same <code>ClientToken</code> prevents creating the
     *         tape multiple times.
     *         </p>
     *         </note>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape
     * multiple times.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @param clientToken <p>
     *            A unique identifier that you use to retry a request. If you
     *            retry a request, use the same <code>ClientToken</code> you
     *            specified in the initial request.
     *            </p>
     *            <note>
     *            <p>
     *            Using the same <code>ClientToken</code> prevents creating the
     *            tape multiple times.
     *            </p>
     *            </note>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request.
     * </p>
     * <note>
     * <p>
     * Using the same <code>ClientToken</code> prevents creating the tape
     * multiple times.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @param clientToken <p>
     *            A unique identifier that you use to retry a request. If you
     *            retry a request, use the same <code>ClientToken</code> you
     *            specified in the initial request.
     *            </p>
     *            <note>
     *            <p>
     *            Using the same <code>ClientToken</code> prevents creating the
     *            tape multiple times.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTapesRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @return <p>
     *         The number of virtual tapes that you want to create.
     *         </p>
     */
    public Integer getNumTapesToCreate() {
        return numTapesToCreate;
    }

    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param numTapesToCreate <p>
     *            The number of virtual tapes that you want to create.
     *            </p>
     */
    public void setNumTapesToCreate(Integer numTapesToCreate) {
        this.numTapesToCreate = numTapesToCreate;
    }

    /**
     * <p>
     * The number of virtual tapes that you want to create.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 10<br/>
     *
     * @param numTapesToCreate <p>
     *            The number of virtual tapes that you want to create.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTapesRequest withNumTapesToCreate(Integer numTapesToCreate) {
        this.numTapesToCreate = numTapesToCreate;
        return this;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are
     * creating. This prefix makes the barcode unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the
     * uppercase letters from A to Z.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     *
     * @return <p>
     *         A prefix that you append to the barcode of the virtual tape you
     *         are creating. This prefix makes the barcode unique.
     *         </p>
     *         <note>
     *         <p>
     *         The prefix must be 1 to 4 characters in length and must be one of
     *         the uppercase letters from A to Z.
     *         </p>
     *         </note>
     */
    public String getTapeBarcodePrefix() {
        return tapeBarcodePrefix;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are
     * creating. This prefix makes the barcode unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the
     * uppercase letters from A to Z.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     *
     * @param tapeBarcodePrefix <p>
     *            A prefix that you append to the barcode of the virtual tape
     *            you are creating. This prefix makes the barcode unique.
     *            </p>
     *            <note>
     *            <p>
     *            The prefix must be 1 to 4 characters in length and must be one
     *            of the uppercase letters from A to Z.
     *            </p>
     *            </note>
     */
    public void setTapeBarcodePrefix(String tapeBarcodePrefix) {
        this.tapeBarcodePrefix = tapeBarcodePrefix;
    }

    /**
     * <p>
     * A prefix that you append to the barcode of the virtual tape you are
     * creating. This prefix makes the barcode unique.
     * </p>
     * <note>
     * <p>
     * The prefix must be 1 to 4 characters in length and must be one of the
     * uppercase letters from A to Z.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 4<br/>
     * <b>Pattern: </b>^[A-Z]*$<br/>
     *
     * @param tapeBarcodePrefix <p>
     *            A prefix that you append to the barcode of the virtual tape
     *            you are creating. This prefix makes the barcode unique.
     *            </p>
     *            <note>
     *            <p>
     *            The prefix must be 1 to 4 characters in length and must be one
     *            of the uppercase letters from A to Z.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTapesRequest withTapeBarcodePrefix(String tapeBarcodePrefix) {
        this.tapeBarcodePrefix = tapeBarcodePrefix;
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with
     * your own AWS KMS key, or <code>false</code> to use a key managed by
     * Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to use Amazon S3 server-side encryption
     *         with your own AWS KMS key, or <code>false</code> to use a key
     *         managed by Amazon S3. Optional.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean isKMSEncrypted() {
        return kMSEncrypted;
    }

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with
     * your own AWS KMS key, or <code>false</code> to use a key managed by
     * Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         Set to <code>true</code> to use Amazon S3 server-side encryption
     *         with your own AWS KMS key, or <code>false</code> to use a key
     *         managed by Amazon S3. Optional.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean getKMSEncrypted() {
        return kMSEncrypted;
    }

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with
     * your own AWS KMS key, or <code>false</code> to use a key managed by
     * Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @param kMSEncrypted <p>
     *            Set to <code>true</code> to use Amazon S3 server-side
     *            encryption with your own AWS KMS key, or <code>false</code> to
     *            use a key managed by Amazon S3. Optional.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     */
    public void setKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
    }

    /**
     * <p>
     * Set to <code>true</code> to use Amazon S3 server-side encryption with
     * your own AWS KMS key, or <code>false</code> to use a key managed by
     * Amazon S3. Optional.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kMSEncrypted <p>
     *            Set to <code>true</code> to use Amazon S3 server-side
     *            encryption with your own AWS KMS key, or <code>false</code> to
     *            use a key managed by Amazon S3. Optional.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTapesRequest withKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK)
     * used for Amazon S3 server-side encryption. Storage Gateway does not
     * support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of a symmetric customer master key
     *         (CMK) used for Amazon S3 server-side encryption. Storage Gateway
     *         does not support asymmetric CMKs. This value can only be set when
     *         <code>KMSEncrypted</code> is <code>true</code>. Optional.
     *         </p>
     */
    public String getKMSKey() {
        return kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK)
     * used for Amazon S3 server-side encryption. Storage Gateway does not
     * support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @param kMSKey <p>
     *            The Amazon Resource Name (ARN) of a symmetric customer master
     *            key (CMK) used for Amazon S3 server-side encryption. Storage
     *            Gateway does not support asymmetric CMKs. This value can only
     *            be set when <code>KMSEncrypted</code> is <code>true</code>.
     *            Optional.
     *            </p>
     */
    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK)
     * used for Amazon S3 server-side encryption. Storage Gateway does not
     * support asymmetric CMKs. This value can only be set when
     * <code>KMSEncrypted</code> is <code>true</code>. Optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @param kMSKey <p>
     *            The Amazon Resource Name (ARN) of a symmetric customer master
     *            key (CMK) used for Amazon S3 server-side encryption. Storage
     *            Gateway does not support asymmetric CMKs. This value can only
     *            be set when <code>KMSEncrypted</code> is <code>true</code>.
     *            Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTapesRequest withKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
        return this;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The
     * tape in this pool is archived in the S3 storage class that is associated
     * with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3
     * Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The ID of the pool that you want to add your tape to for
     *         archiving. The tape in this pool is archived in the S3 storage
     *         class that is associated with the pool. When you use your backup
     *         application to eject the tape, the tape is archived directly into
     *         the storage class (S3 Glacier or S3 Glacier Deep Archive) that
     *         corresponds to the pool.
     *         </p>
     *         <p>
     *         Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     *         </p>
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The
     * tape in this pool is archived in the S3 storage class that is associated
     * with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3
     * Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param poolId <p>
     *            The ID of the pool that you want to add your tape to for
     *            archiving. The tape in this pool is archived in the S3 storage
     *            class that is associated with the pool. When you use your
     *            backup application to eject the tape, the tape is archived
     *            directly into the storage class (S3 Glacier or S3 Glacier Deep
     *            Archive) that corresponds to the pool.
     *            </p>
     *            <p>
     *            Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     *            </p>
     */
    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the pool that you want to add your tape to for archiving. The
     * tape in this pool is archived in the S3 storage class that is associated
     * with the pool. When you use your backup application to eject the tape,
     * the tape is archived directly into the storage class (S3 Glacier or S3
     * Glacier Deep Archive) that corresponds to the pool.
     * </p>
     * <p>
     * Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param poolId <p>
     *            The ID of the pool that you want to add your tape to for
     *            archiving. The tape in this pool is archived in the S3 storage
     *            class that is associated with the pool. When you use your
     *            backup application to eject the tape, the tape is archived
     *            directly into the storage class (S3 Glacier or S3 Glacier Deep
     *            Archive) that corresponds to the pool.
     *            </p>
     *            <p>
     *            Valid Values: <code>GLACIER</code> | <code>DEEP_ARCHIVE</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTapesRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a virtual tape. Each tag
     * is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers
     * representable in UTF-8 format, and the following special characters: + -
     * = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of up to 50 tags that can be assigned to a virtual tape.
     *         Each tag is a key-value pair.
     *         </p>
     *         <note>
     *         <p>
     *         Valid characters for key and value are letters, spaces, and
     *         numbers representable in UTF-8 format, and the following special
     *         characters: + - = . _ : / @. The maximum length of a tag's key is
     *         128 characters, and the maximum length for a tag's value is 256.
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a virtual tape. Each tag
     * is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers
     * representable in UTF-8 format, and the following special characters: + -
     * = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     *
     * @param tags <p>
     *            A list of up to 50 tags that can be assigned to a virtual
     *            tape. Each tag is a key-value pair.
     *            </p>
     *            <note>
     *            <p>
     *            Valid characters for key and value are letters, spaces, and
     *            numbers representable in UTF-8 format, and the following
     *            special characters: + - = . _ : / @. The maximum length of a
     *            tag's key is 128 characters, and the maximum length for a
     *            tag's value is 256.
     *            </p>
     *            </note>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a virtual tape. Each tag
     * is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers
     * representable in UTF-8 format, and the following special characters: + -
     * = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags that can be assigned to a virtual
     *            tape. Each tag is a key-value pair.
     *            </p>
     *            <note>
     *            <p>
     *            Valid characters for key and value are letters, spaces, and
     *            numbers representable in UTF-8 format, and the following
     *            special characters: + - = . _ : / @. The maximum length of a
     *            tag's key is 128 characters, and the maximum length for a
     *            tag's value is 256.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTapesRequest withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a virtual tape. Each tag
     * is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers
     * representable in UTF-8 format, and the following special characters: + -
     * = . _ : / @. The maximum length of a tag's key is 128 characters, and the
     * maximum length for a tag's value is 256.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags that can be assigned to a virtual
     *            tape. Each tag is a key-value pair.
     *            </p>
     *            <note>
     *            <p>
     *            Valid characters for key and value are letters, spaces, and
     *            numbers representable in UTF-8 format, and the following
     *            special characters: + - = . _ : / @. The maximum length of a
     *            tag's key is 128 characters, and the maximum length for a
     *            tag's value is 256.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateTapesRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getTapeSizeInBytes() != null)
            sb.append("TapeSizeInBytes: " + getTapeSizeInBytes() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getNumTapesToCreate() != null)
            sb.append("NumTapesToCreate: " + getNumTapesToCreate() + ",");
        if (getTapeBarcodePrefix() != null)
            sb.append("TapeBarcodePrefix: " + getTapeBarcodePrefix() + ",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: " + getKMSEncrypted() + ",");
        if (getKMSKey() != null)
            sb.append("KMSKey: " + getKMSKey() + ",");
        if (getPoolId() != null)
            sb.append("PoolId: " + getPoolId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode
                + ((getTapeSizeInBytes() == null) ? 0 : getTapeSizeInBytes().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getNumTapesToCreate() == null) ? 0 : getNumTapesToCreate().hashCode());
        hashCode = prime * hashCode
                + ((getTapeBarcodePrefix() == null) ? 0 : getTapeBarcodePrefix().hashCode());
        hashCode = prime * hashCode
                + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTapesRequest == false)
            return false;
        CreateTapesRequest other = (CreateTapesRequest) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getTapeSizeInBytes() == null ^ this.getTapeSizeInBytes() == null)
            return false;
        if (other.getTapeSizeInBytes() != null
                && other.getTapeSizeInBytes().equals(this.getTapeSizeInBytes()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getNumTapesToCreate() == null ^ this.getNumTapesToCreate() == null)
            return false;
        if (other.getNumTapesToCreate() != null
                && other.getNumTapesToCreate().equals(this.getNumTapesToCreate()) == false)
            return false;
        if (other.getTapeBarcodePrefix() == null ^ this.getTapeBarcodePrefix() == null)
            return false;
        if (other.getTapeBarcodePrefix() != null
                && other.getTapeBarcodePrefix().equals(this.getTapeBarcodePrefix()) == false)
            return false;
        if (other.getKMSEncrypted() == null ^ this.getKMSEncrypted() == null)
            return false;
        if (other.getKMSEncrypted() != null
                && other.getKMSEncrypted().equals(this.getKMSEncrypted()) == false)
            return false;
        if (other.getKMSKey() == null ^ this.getKMSKey() == null)
            return false;
        if (other.getKMSKey() != null && other.getKMSKey().equals(this.getKMSKey()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
