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

package com.amazonaws.services.awsstoragegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a Network File System (NFS) file share on an existing file gateway.
 * In Storage Gateway, a file share is a file system mount point backed by
 * Amazon S3 cloud storage. Storage Gateway exposes file shares using an NFS
 * interface. This operation is only supported for file gateways.
 * </p>
 * <important>
 * <p>
 * File gateway requires AWS Security Token Service (AWS STS) to be activated to
 * enable you to create a file share. Make sure AWS STS is activated in the AWS
 * Region you are creating your file gateway in. If AWS STS is not activated in
 * the AWS Region, activate it. For information about how to activate AWS STS,
 * see Activating and Deactivating AWS STS in an AWS Region in the AWS Identity
 * and Access Management User Guide.
 * </p>
 * <p>
 * File gateway does not support creating hard or symbolic links on a file
 * share.
 * </p>
 * </important>
 */
public class CreateNFSFileShareRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * A unique string value that you supply that is used by file gateway to
     * ensure idempotent file share creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     */
    private String clientToken;

    /**
     * <p>
     * File share default values. Optional.
     * </p>
     */
    private NFSFileShareDefaults nFSFileShareDefaults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway on which you want to
     * create a file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * <p>
     * True to use Amazon S3 server-side encryption with your own AWS KMS key,
     * or false to use a key managed by Amazon S3. Optional.
     * </p>
     */
    private Boolean kMSEncrypted;

    /**
     * <p>
     * The Amazon Resource Name (ARN) AWS KMS key used for Amazon S3 server-side
     * encryption. This value can only be set when KMSEncrypted is true.
     * Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     */
    private String kMSKey;

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that a file
     * gateway assumes when it accesses the underlying storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String role;

    /**
     * <p>
     * The ARN of the backed storage used for storing file data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 310<br/>
     */
    private String locationARN;

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the
     * file gateway. Possible values are <code>S3_STANDARD</code>,
     * <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field
     * is not populated, the default value <code>S3_STANDARD</code> is used.
     * Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 20<br/>
     */
    private String defaultStorageClass;

    /**
     * <p>
     * A value that sets the access control list permission for objects in the
     * S3 bucket that a file gateway puts objects into. The default value is
     * "private".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, bucket-owner-read, bucket-owner-full-control,
     * aws-exec-read
     */
    private String objectACL;

    /**
     * <p>
     * The list of clients that are allowed to access the file gateway. The list
     * must contain either valid IP addresses or valid CIDR blocks.
     * </p>
     */
    private java.util.List<String> clientList;

    /**
     * <p>
     * A value that maps a user to anonymous user. Valid options are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code> - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code> - No one is mapped to anonymous user
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code> - Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 15<br/>
     */
    private String squash;

    /**
     * <p>
     * A value that sets the write status of a file share. This value is true if
     * the write status is read-only, and otherwise false.
     * </p>
     */
    private Boolean readOnly;

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based
     * on file extensions. Set this value to true to enable MIME type guessing,
     * and otherwise to false. The default value is true.
     * </p>
     */
    private Boolean guessMIMETypeEnabled;

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost
     * associated with data download from the S3 bucket. If this value is set to
     * true, the requester pays the costs. Otherwise the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that
     * backs the file share, so make sure that the configuration on the file
     * share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     */
    private Boolean requesterPays;

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the NFS file share. Each
     * tag is a key-value pair.
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
     * A unique string value that you supply that is used by file gateway to
     * ensure idempotent file share creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @return <p>
     *         A unique string value that you supply that is used by file
     *         gateway to ensure idempotent file share creation.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique string value that you supply that is used by file gateway to
     * ensure idempotent file share creation.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @param clientToken <p>
     *            A unique string value that you supply that is used by file
     *            gateway to ensure idempotent file share creation.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique string value that you supply that is used by file gateway to
     * ensure idempotent file share creation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @param clientToken <p>
     *            A unique string value that you supply that is used by file
     *            gateway to ensure idempotent file share creation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * <p>
     * File share default values. Optional.
     * </p>
     *
     * @return <p>
     *         File share default values. Optional.
     *         </p>
     */
    public NFSFileShareDefaults getNFSFileShareDefaults() {
        return nFSFileShareDefaults;
    }

    /**
     * <p>
     * File share default values. Optional.
     * </p>
     *
     * @param nFSFileShareDefaults <p>
     *            File share default values. Optional.
     *            </p>
     */
    public void setNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        this.nFSFileShareDefaults = nFSFileShareDefaults;
    }

    /**
     * <p>
     * File share default values. Optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nFSFileShareDefaults <p>
     *            File share default values. Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withNFSFileShareDefaults(
            NFSFileShareDefaults nFSFileShareDefaults) {
        this.nFSFileShareDefaults = nFSFileShareDefaults;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway on which you want to
     * create a file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the file gateway on which you
     *         want to create a file share.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway on which you want to
     * create a file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the file gateway on which
     *            you want to create a file share.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file gateway on which you want to
     * create a file share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the file gateway on which
     *            you want to create a file share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * True to use Amazon S3 server-side encryption with your own AWS KMS key,
     * or false to use a key managed by Amazon S3. Optional.
     * </p>
     *
     * @return <p>
     *         True to use Amazon S3 server-side encryption with your own AWS
     *         KMS key, or false to use a key managed by Amazon S3. Optional.
     *         </p>
     */
    public Boolean isKMSEncrypted() {
        return kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server-side encryption with your own AWS KMS key,
     * or false to use a key managed by Amazon S3. Optional.
     * </p>
     *
     * @return <p>
     *         True to use Amazon S3 server-side encryption with your own AWS
     *         KMS key, or false to use a key managed by Amazon S3. Optional.
     *         </p>
     */
    public Boolean getKMSEncrypted() {
        return kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server-side encryption with your own AWS KMS key,
     * or false to use a key managed by Amazon S3. Optional.
     * </p>
     *
     * @param kMSEncrypted <p>
     *            True to use Amazon S3 server-side encryption with your own AWS
     *            KMS key, or false to use a key managed by Amazon S3. Optional.
     *            </p>
     */
    public void setKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
    }

    /**
     * <p>
     * True to use Amazon S3 server-side encryption with your own AWS KMS key,
     * or false to use a key managed by Amazon S3. Optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kMSEncrypted <p>
     *            True to use Amazon S3 server-side encryption with your own AWS
     *            KMS key, or false to use a key managed by Amazon S3. Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) AWS KMS key used for Amazon S3 server-side
     * encryption. This value can only be set when KMSEncrypted is true.
     * Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) AWS KMS key used for Amazon S3
     *         server-side encryption. This value can only be set when
     *         KMSEncrypted is true. Optional.
     *         </p>
     */
    public String getKMSKey() {
        return kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) AWS KMS key used for Amazon S3 server-side
     * encryption. This value can only be set when KMSEncrypted is true.
     * Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @param kMSKey <p>
     *            The Amazon Resource Name (ARN) AWS KMS key used for Amazon S3
     *            server-side encryption. This value can only be set when
     *            KMSEncrypted is true. Optional.
     *            </p>
     */
    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) AWS KMS key used for Amazon S3 server-side
     * encryption. This value can only be set when KMSEncrypted is true.
     * Optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @param kMSKey <p>
     *            The Amazon Resource Name (ARN) AWS KMS key used for Amazon S3
     *            server-side encryption. This value can only be set when
     *            KMSEncrypted is true. Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
        return this;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that a file
     * gateway assumes when it accesses the underlying storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the AWS Identity and Access Management (IAM) role that
     *         a file gateway assumes when it accesses the underlying storage.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that a file
     * gateway assumes when it accesses the underlying storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param role <p>
     *            The ARN of the AWS Identity and Access Management (IAM) role
     *            that a file gateway assumes when it accesses the underlying
     *            storage.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The ARN of the AWS Identity and Access Management (IAM) role that a file
     * gateway assumes when it accesses the underlying storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param role <p>
     *            The ARN of the AWS Identity and Access Management (IAM) role
     *            that a file gateway assumes when it accesses the underlying
     *            storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * The ARN of the backed storage used for storing file data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 310<br/>
     *
     * @return <p>
     *         The ARN of the backed storage used for storing file data.
     *         </p>
     */
    public String getLocationARN() {
        return locationARN;
    }

    /**
     * <p>
     * The ARN of the backed storage used for storing file data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 310<br/>
     *
     * @param locationARN <p>
     *            The ARN of the backed storage used for storing file data.
     *            </p>
     */
    public void setLocationARN(String locationARN) {
        this.locationARN = locationARN;
    }

    /**
     * <p>
     * The ARN of the backed storage used for storing file data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 310<br/>
     *
     * @param locationARN <p>
     *            The ARN of the backed storage used for storing file data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withLocationARN(String locationARN) {
        this.locationARN = locationARN;
        return this;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the
     * file gateway. Possible values are <code>S3_STANDARD</code>,
     * <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field
     * is not populated, the default value <code>S3_STANDARD</code> is used.
     * Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 20<br/>
     *
     * @return <p>
     *         The default storage class for objects put into an Amazon S3
     *         bucket by the file gateway. Possible values are
     *         <code>S3_STANDARD</code>, <code>S3_STANDARD_IA</code>, or
     *         <code>S3_ONEZONE_IA</code>. If this field is not populated, the
     *         default value <code>S3_STANDARD</code> is used. Optional.
     *         </p>
     */
    public String getDefaultStorageClass() {
        return defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the
     * file gateway. Possible values are <code>S3_STANDARD</code>,
     * <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field
     * is not populated, the default value <code>S3_STANDARD</code> is used.
     * Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 20<br/>
     *
     * @param defaultStorageClass <p>
     *            The default storage class for objects put into an Amazon S3
     *            bucket by the file gateway. Possible values are
     *            <code>S3_STANDARD</code>, <code>S3_STANDARD_IA</code>, or
     *            <code>S3_ONEZONE_IA</code>. If this field is not populated,
     *            the default value <code>S3_STANDARD</code> is used. Optional.
     *            </p>
     */
    public void setDefaultStorageClass(String defaultStorageClass) {
        this.defaultStorageClass = defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the
     * file gateway. Possible values are <code>S3_STANDARD</code>,
     * <code>S3_STANDARD_IA</code>, or <code>S3_ONEZONE_IA</code>. If this field
     * is not populated, the default value <code>S3_STANDARD</code> is used.
     * Optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 20<br/>
     *
     * @param defaultStorageClass <p>
     *            The default storage class for objects put into an Amazon S3
     *            bucket by the file gateway. Possible values are
     *            <code>S3_STANDARD</code>, <code>S3_STANDARD_IA</code>, or
     *            <code>S3_ONEZONE_IA</code>. If this field is not populated,
     *            the default value <code>S3_STANDARD</code> is used. Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withDefaultStorageClass(String defaultStorageClass) {
        this.defaultStorageClass = defaultStorageClass;
        return this;
    }

    /**
     * <p>
     * A value that sets the access control list permission for objects in the
     * S3 bucket that a file gateway puts objects into. The default value is
     * "private".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, bucket-owner-read, bucket-owner-full-control,
     * aws-exec-read
     *
     * @return <p>
     *         A value that sets the access control list permission for objects
     *         in the S3 bucket that a file gateway puts objects into. The
     *         default value is "private".
     *         </p>
     * @see ObjectACL
     */
    public String getObjectACL() {
        return objectACL;
    }

    /**
     * <p>
     * A value that sets the access control list permission for objects in the
     * S3 bucket that a file gateway puts objects into. The default value is
     * "private".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, bucket-owner-read, bucket-owner-full-control,
     * aws-exec-read
     *
     * @param objectACL <p>
     *            A value that sets the access control list permission for
     *            objects in the S3 bucket that a file gateway puts objects
     *            into. The default value is "private".
     *            </p>
     * @see ObjectACL
     */
    public void setObjectACL(String objectACL) {
        this.objectACL = objectACL;
    }

    /**
     * <p>
     * A value that sets the access control list permission for objects in the
     * S3 bucket that a file gateway puts objects into. The default value is
     * "private".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, bucket-owner-read, bucket-owner-full-control,
     * aws-exec-read
     *
     * @param objectACL <p>
     *            A value that sets the access control list permission for
     *            objects in the S3 bucket that a file gateway puts objects
     *            into. The default value is "private".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectACL
     */
    public CreateNFSFileShareRequest withObjectACL(String objectACL) {
        this.objectACL = objectACL;
        return this;
    }

    /**
     * <p>
     * A value that sets the access control list permission for objects in the
     * S3 bucket that a file gateway puts objects into. The default value is
     * "private".
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, bucket-owner-read, bucket-owner-full-control,
     * aws-exec-read
     *
     * @param objectACL <p>
     *            A value that sets the access control list permission for
     *            objects in the S3 bucket that a file gateway puts objects
     *            into. The default value is "private".
     *            </p>
     * @see ObjectACL
     */
    public void setObjectACL(ObjectACL objectACL) {
        this.objectACL = objectACL.toString();
    }

    /**
     * <p>
     * A value that sets the access control list permission for objects in the
     * S3 bucket that a file gateway puts objects into. The default value is
     * "private".
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, bucket-owner-read, bucket-owner-full-control,
     * aws-exec-read
     *
     * @param objectACL <p>
     *            A value that sets the access control list permission for
     *            objects in the S3 bucket that a file gateway puts objects
     *            into. The default value is "private".
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectACL
     */
    public CreateNFSFileShareRequest withObjectACL(ObjectACL objectACL) {
        this.objectACL = objectACL.toString();
        return this;
    }

    /**
     * <p>
     * The list of clients that are allowed to access the file gateway. The list
     * must contain either valid IP addresses or valid CIDR blocks.
     * </p>
     *
     * @return <p>
     *         The list of clients that are allowed to access the file gateway.
     *         The list must contain either valid IP addresses or valid CIDR
     *         blocks.
     *         </p>
     */
    public java.util.List<String> getClientList() {
        return clientList;
    }

    /**
     * <p>
     * The list of clients that are allowed to access the file gateway. The list
     * must contain either valid IP addresses or valid CIDR blocks.
     * </p>
     *
     * @param clientList <p>
     *            The list of clients that are allowed to access the file
     *            gateway. The list must contain either valid IP addresses or
     *            valid CIDR blocks.
     *            </p>
     */
    public void setClientList(java.util.Collection<String> clientList) {
        if (clientList == null) {
            this.clientList = null;
            return;
        }

        this.clientList = new java.util.ArrayList<String>(clientList);
    }

    /**
     * <p>
     * The list of clients that are allowed to access the file gateway. The list
     * must contain either valid IP addresses or valid CIDR blocks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientList <p>
     *            The list of clients that are allowed to access the file
     *            gateway. The list must contain either valid IP addresses or
     *            valid CIDR blocks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withClientList(String... clientList) {
        if (getClientList() == null) {
            this.clientList = new java.util.ArrayList<String>(clientList.length);
        }
        for (String value : clientList) {
            this.clientList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of clients that are allowed to access the file gateway. The list
     * must contain either valid IP addresses or valid CIDR blocks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clientList <p>
     *            The list of clients that are allowed to access the file
     *            gateway. The list must contain either valid IP addresses or
     *            valid CIDR blocks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withClientList(java.util.Collection<String> clientList) {
        setClientList(clientList);
        return this;
    }

    /**
     * <p>
     * A value that maps a user to anonymous user. Valid options are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code> - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code> - No one is mapped to anonymous user
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code> - Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 15<br/>
     *
     * @return <p>
     *         A value that maps a user to anonymous user. Valid options are the
     *         following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RootSquash</code> - Only root is mapped to anonymous user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NoSquash</code> - No one is mapped to anonymous user
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AllSquash</code> - Everyone is mapped to anonymous user.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSquash() {
        return squash;
    }

    /**
     * <p>
     * A value that maps a user to anonymous user. Valid options are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code> - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code> - No one is mapped to anonymous user
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code> - Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 15<br/>
     *
     * @param squash <p>
     *            A value that maps a user to anonymous user. Valid options are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RootSquash</code> - Only root is mapped to anonymous
     *            user.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NoSquash</code> - No one is mapped to anonymous user
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AllSquash</code> - Everyone is mapped to anonymous user.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSquash(String squash) {
        this.squash = squash;
    }

    /**
     * <p>
     * A value that maps a user to anonymous user. Valid options are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code> - Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code> - No one is mapped to anonymous user
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code> - Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 15<br/>
     *
     * @param squash <p>
     *            A value that maps a user to anonymous user. Valid options are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RootSquash</code> - Only root is mapped to anonymous
     *            user.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NoSquash</code> - No one is mapped to anonymous user
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AllSquash</code> - Everyone is mapped to anonymous user.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withSquash(String squash) {
        this.squash = squash;
        return this;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. This value is true if
     * the write status is read-only, and otherwise false.
     * </p>
     *
     * @return <p>
     *         A value that sets the write status of a file share. This value is
     *         true if the write status is read-only, and otherwise false.
     *         </p>
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. This value is true if
     * the write status is read-only, and otherwise false.
     * </p>
     *
     * @return <p>
     *         A value that sets the write status of a file share. This value is
     *         true if the write status is read-only, and otherwise false.
     *         </p>
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. This value is true if
     * the write status is read-only, and otherwise false.
     * </p>
     *
     * @param readOnly <p>
     *            A value that sets the write status of a file share. This value
     *            is true if the write status is read-only, and otherwise false.
     *            </p>
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. This value is true if
     * the write status is read-only, and otherwise false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readOnly <p>
     *            A value that sets the write status of a file share. This value
     *            is true if the write status is read-only, and otherwise false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based
     * on file extensions. Set this value to true to enable MIME type guessing,
     * and otherwise to false. The default value is true.
     * </p>
     *
     * @return <p>
     *         A value that enables guessing of the MIME type for uploaded
     *         objects based on file extensions. Set this value to true to
     *         enable MIME type guessing, and otherwise to false. The default
     *         value is true.
     *         </p>
     */
    public Boolean isGuessMIMETypeEnabled() {
        return guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based
     * on file extensions. Set this value to true to enable MIME type guessing,
     * and otherwise to false. The default value is true.
     * </p>
     *
     * @return <p>
     *         A value that enables guessing of the MIME type for uploaded
     *         objects based on file extensions. Set this value to true to
     *         enable MIME type guessing, and otherwise to false. The default
     *         value is true.
     *         </p>
     */
    public Boolean getGuessMIMETypeEnabled() {
        return guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based
     * on file extensions. Set this value to true to enable MIME type guessing,
     * and otherwise to false. The default value is true.
     * </p>
     *
     * @param guessMIMETypeEnabled <p>
     *            A value that enables guessing of the MIME type for uploaded
     *            objects based on file extensions. Set this value to true to
     *            enable MIME type guessing, and otherwise to false. The default
     *            value is true.
     *            </p>
     */
    public void setGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        this.guessMIMETypeEnabled = guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based
     * on file extensions. Set this value to true to enable MIME type guessing,
     * and otherwise to false. The default value is true.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param guessMIMETypeEnabled <p>
     *            A value that enables guessing of the MIME type for uploaded
     *            objects based on file extensions. Set this value to true to
     *            enable MIME type guessing, and otherwise to false. The default
     *            value is true.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        this.guessMIMETypeEnabled = guessMIMETypeEnabled;
        return this;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost
     * associated with data download from the S3 bucket. If this value is set to
     * true, the requester pays the costs. Otherwise the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that
     * backs the file share, so make sure that the configuration on the file
     * share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that sets who pays the cost of the request and the cost
     *         associated with data download from the S3 bucket. If this value
     *         is set to true, the requester pays the costs. Otherwise the S3
     *         bucket owner pays. However, the S3 bucket owner always pays the
     *         cost of storing data.
     *         </p>
     *         <note>
     *         <p>
     *         <code>RequesterPays</code> is a configuration for the S3 bucket
     *         that backs the file share, so make sure that the configuration on
     *         the file share is the same as the S3 bucket configuration.
     *         </p>
     *         </note>
     */
    public Boolean isRequesterPays() {
        return requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost
     * associated with data download from the S3 bucket. If this value is set to
     * true, the requester pays the costs. Otherwise the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that
     * backs the file share, so make sure that the configuration on the file
     * share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     *
     * @return <p>
     *         A value that sets who pays the cost of the request and the cost
     *         associated with data download from the S3 bucket. If this value
     *         is set to true, the requester pays the costs. Otherwise the S3
     *         bucket owner pays. However, the S3 bucket owner always pays the
     *         cost of storing data.
     *         </p>
     *         <note>
     *         <p>
     *         <code>RequesterPays</code> is a configuration for the S3 bucket
     *         that backs the file share, so make sure that the configuration on
     *         the file share is the same as the S3 bucket configuration.
     *         </p>
     *         </note>
     */
    public Boolean getRequesterPays() {
        return requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost
     * associated with data download from the S3 bucket. If this value is set to
     * true, the requester pays the costs. Otherwise the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that
     * backs the file share, so make sure that the configuration on the file
     * share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     *
     * @param requesterPays <p>
     *            A value that sets who pays the cost of the request and the
     *            cost associated with data download from the S3 bucket. If this
     *            value is set to true, the requester pays the costs. Otherwise
     *            the S3 bucket owner pays. However, the S3 bucket owner always
     *            pays the cost of storing data.
     *            </p>
     *            <note>
     *            <p>
     *            <code>RequesterPays</code> is a configuration for the S3
     *            bucket that backs the file share, so make sure that the
     *            configuration on the file share is the same as the S3 bucket
     *            configuration.
     *            </p>
     *            </note>
     */
    public void setRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost
     * associated with data download from the S3 bucket. If this value is set to
     * true, the requester pays the costs. Otherwise the S3 bucket owner pays.
     * However, the S3 bucket owner always pays the cost of storing data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that
     * backs the file share, so make sure that the configuration on the file
     * share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requesterPays <p>
     *            A value that sets who pays the cost of the request and the
     *            cost associated with data download from the S3 bucket. If this
     *            value is set to true, the requester pays the costs. Otherwise
     *            the S3 bucket owner pays. However, the S3 bucket owner always
     *            pays the cost of storing data.
     *            </p>
     *            <note>
     *            <p>
     *            <code>RequesterPays</code> is a configuration for the S3
     *            bucket that backs the file share, so make sure that the
     *            configuration on the file share is the same as the S3 bucket
     *            configuration.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateNFSFileShareRequest withRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to the NFS file share. Each
     * tag is a key-value pair.
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
     *         A list of up to 50 tags that can be assigned to the NFS file
     *         share. Each tag is a key-value pair.
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
     * A list of up to 50 tags that can be assigned to the NFS file share. Each
     * tag is a key-value pair.
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
     *            A list of up to 50 tags that can be assigned to the NFS file
     *            share. Each tag is a key-value pair.
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
     * A list of up to 50 tags that can be assigned to the NFS file share. Each
     * tag is a key-value pair.
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
     *            A list of up to 50 tags that can be assigned to the NFS file
     *            share. Each tag is a key-value pair.
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
    public CreateNFSFileShareRequest withTags(Tag... tags) {
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
     * A list of up to 50 tags that can be assigned to the NFS file share. Each
     * tag is a key-value pair.
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
     *            A list of up to 50 tags that can be assigned to the NFS file
     *            share. Each tag is a key-value pair.
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
    public CreateNFSFileShareRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
        if (getNFSFileShareDefaults() != null)
            sb.append("NFSFileShareDefaults: " + getNFSFileShareDefaults() + ",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: " + getKMSEncrypted() + ",");
        if (getKMSKey() != null)
            sb.append("KMSKey: " + getKMSKey() + ",");
        if (getRole() != null)
            sb.append("Role: " + getRole() + ",");
        if (getLocationARN() != null)
            sb.append("LocationARN: " + getLocationARN() + ",");
        if (getDefaultStorageClass() != null)
            sb.append("DefaultStorageClass: " + getDefaultStorageClass() + ",");
        if (getObjectACL() != null)
            sb.append("ObjectACL: " + getObjectACL() + ",");
        if (getClientList() != null)
            sb.append("ClientList: " + getClientList() + ",");
        if (getSquash() != null)
            sb.append("Squash: " + getSquash() + ",");
        if (getReadOnly() != null)
            sb.append("ReadOnly: " + getReadOnly() + ",");
        if (getGuessMIMETypeEnabled() != null)
            sb.append("GuessMIMETypeEnabled: " + getGuessMIMETypeEnabled() + ",");
        if (getRequesterPays() != null)
            sb.append("RequesterPays: " + getRequesterPays() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode
                + ((getNFSFileShareDefaults() == null) ? 0 : getNFSFileShareDefaults().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode
                + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode
                + ((getLocationARN() == null) ? 0 : getLocationARN().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultStorageClass() == null) ? 0 : getDefaultStorageClass().hashCode());
        hashCode = prime * hashCode + ((getObjectACL() == null) ? 0 : getObjectACL().hashCode());
        hashCode = prime * hashCode + ((getClientList() == null) ? 0 : getClientList().hashCode());
        hashCode = prime * hashCode + ((getSquash() == null) ? 0 : getSquash().hashCode());
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode
                + ((getGuessMIMETypeEnabled() == null) ? 0 : getGuessMIMETypeEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getRequesterPays() == null) ? 0 : getRequesterPays().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNFSFileShareRequest == false)
            return false;
        CreateNFSFileShareRequest other = (CreateNFSFileShareRequest) obj;

        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getNFSFileShareDefaults() == null ^ this.getNFSFileShareDefaults() == null)
            return false;
        if (other.getNFSFileShareDefaults() != null
                && other.getNFSFileShareDefaults().equals(this.getNFSFileShareDefaults()) == false)
            return false;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
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
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getLocationARN() == null ^ this.getLocationARN() == null)
            return false;
        if (other.getLocationARN() != null
                && other.getLocationARN().equals(this.getLocationARN()) == false)
            return false;
        if (other.getDefaultStorageClass() == null ^ this.getDefaultStorageClass() == null)
            return false;
        if (other.getDefaultStorageClass() != null
                && other.getDefaultStorageClass().equals(this.getDefaultStorageClass()) == false)
            return false;
        if (other.getObjectACL() == null ^ this.getObjectACL() == null)
            return false;
        if (other.getObjectACL() != null
                && other.getObjectACL().equals(this.getObjectACL()) == false)
            return false;
        if (other.getClientList() == null ^ this.getClientList() == null)
            return false;
        if (other.getClientList() != null
                && other.getClientList().equals(this.getClientList()) == false)
            return false;
        if (other.getSquash() == null ^ this.getSquash() == null)
            return false;
        if (other.getSquash() != null && other.getSquash().equals(this.getSquash()) == false)
            return false;
        if (other.getReadOnly() == null ^ this.getReadOnly() == null)
            return false;
        if (other.getReadOnly() != null && other.getReadOnly().equals(this.getReadOnly()) == false)
            return false;
        if (other.getGuessMIMETypeEnabled() == null ^ this.getGuessMIMETypeEnabled() == null)
            return false;
        if (other.getGuessMIMETypeEnabled() != null
                && other.getGuessMIMETypeEnabled().equals(this.getGuessMIMETypeEnabled()) == false)
            return false;
        if (other.getRequesterPays() == null ^ this.getRequesterPays() == null)
            return false;
        if (other.getRequesterPays() != null
                && other.getRequesterPays().equals(this.getRequesterPays()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
