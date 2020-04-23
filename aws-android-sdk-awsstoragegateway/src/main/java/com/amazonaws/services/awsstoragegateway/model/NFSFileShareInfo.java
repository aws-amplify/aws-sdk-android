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

/**
 * <p>
 * The Unix file permissions and ownership information assigned, by default, to
 * native S3 objects when file gateway discovers them in S3 buckets. This
 * operation is only supported in file gateways.
 * </p>
 */
public class NFSFileShareInfo implements Serializable {
    /**
     * <p>
     * Describes Network File System (NFS) file share default values. Files and
     * folders stored as Amazon S3 objects in S3 buckets don't, by default, have
     * Unix file permissions assigned to them. Upon discovery in an S3 bucket by
     * Storage Gateway, the S3 objects that represent files and folders are
     * assigned these default Unix permissions. This operation is only supported
     * for file gateways.
     * </p>
     */
    private NFSFileShareDefaults nFSFileShareDefaults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String fileShareARN;

    /**
     * <p>
     * The ID of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     */
    private String fileShareId;

    /**
     * <p>
     * The status of the file share. Possible values are <code>CREATING</code>,
     * <code>UPDATING</code>, <code>AVAILABLE</code> and <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     */
    private String fileShareStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
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
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     */
    private String kMSKey;

    /**
     * <p>
     * The file share path used by the NFS client to identify the mount point.
     * </p>
     */
    private String path;

    /**
     * <p>
     * The ARN of the IAM role that file gateway assumes when it accesses the
     * underlying storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String role;

    /**
     * <p>
     * The ARN of the backend storage used for storing file data.
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
     * The user mapped to anonymous user. Valid options are the following:
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
     * A list of up to 50 tags assigned to the NFS file share, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * Describes Network File System (NFS) file share default values. Files and
     * folders stored as Amazon S3 objects in S3 buckets don't, by default, have
     * Unix file permissions assigned to them. Upon discovery in an S3 bucket by
     * Storage Gateway, the S3 objects that represent files and folders are
     * assigned these default Unix permissions. This operation is only supported
     * for file gateways.
     * </p>
     *
     * @return <p>
     *         Describes Network File System (NFS) file share default values.
     *         Files and folders stored as Amazon S3 objects in S3 buckets
     *         don't, by default, have Unix file permissions assigned to them.
     *         Upon discovery in an S3 bucket by Storage Gateway, the S3 objects
     *         that represent files and folders are assigned these default Unix
     *         permissions. This operation is only supported for file gateways.
     *         </p>
     */
    public NFSFileShareDefaults getNFSFileShareDefaults() {
        return nFSFileShareDefaults;
    }

    /**
     * <p>
     * Describes Network File System (NFS) file share default values. Files and
     * folders stored as Amazon S3 objects in S3 buckets don't, by default, have
     * Unix file permissions assigned to them. Upon discovery in an S3 bucket by
     * Storage Gateway, the S3 objects that represent files and folders are
     * assigned these default Unix permissions. This operation is only supported
     * for file gateways.
     * </p>
     *
     * @param nFSFileShareDefaults <p>
     *            Describes Network File System (NFS) file share default values.
     *            Files and folders stored as Amazon S3 objects in S3 buckets
     *            don't, by default, have Unix file permissions assigned to
     *            them. Upon discovery in an S3 bucket by Storage Gateway, the
     *            S3 objects that represent files and folders are assigned these
     *            default Unix permissions. This operation is only supported for
     *            file gateways.
     *            </p>
     */
    public void setNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        this.nFSFileShareDefaults = nFSFileShareDefaults;
    }

    /**
     * <p>
     * Describes Network File System (NFS) file share default values. Files and
     * folders stored as Amazon S3 objects in S3 buckets don't, by default, have
     * Unix file permissions assigned to them. Upon discovery in an S3 bucket by
     * Storage Gateway, the S3 objects that represent files and folders are
     * assigned these default Unix permissions. This operation is only supported
     * for file gateways.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nFSFileShareDefaults <p>
     *            Describes Network File System (NFS) file share default values.
     *            Files and folders stored as Amazon S3 objects in S3 buckets
     *            don't, by default, have Unix file permissions assigned to
     *            them. Upon discovery in an S3 bucket by Storage Gateway, the
     *            S3 objects that represent files and folders are assigned these
     *            default Unix permissions. This operation is only supported for
     *            file gateways.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareInfo withNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        this.nFSFileShareDefaults = nFSFileShareDefaults;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the file share.
     *         </p>
     */
    public String getFileShareARN() {
        return fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the file share.
     *            </p>
     */
    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the file share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareInfo withFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
        return this;
    }

    /**
     * <p>
     * The ID of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @return <p>
     *         The ID of the file share.
     *         </p>
     */
    public String getFileShareId() {
        return fileShareId;
    }

    /**
     * <p>
     * The ID of the file share.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param fileShareId <p>
     *            The ID of the file share.
     *            </p>
     */
    public void setFileShareId(String fileShareId) {
        this.fileShareId = fileShareId;
    }

    /**
     * <p>
     * The ID of the file share.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param fileShareId <p>
     *            The ID of the file share.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareInfo withFileShareId(String fileShareId) {
        this.fileShareId = fileShareId;
        return this;
    }

    /**
     * <p>
     * The status of the file share. Possible values are <code>CREATING</code>,
     * <code>UPDATING</code>, <code>AVAILABLE</code> and <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @return <p>
     *         The status of the file share. Possible values are
     *         <code>CREATING</code>, <code>UPDATING</code>,
     *         <code>AVAILABLE</code> and <code>DELETING</code>.
     *         </p>
     */
    public String getFileShareStatus() {
        return fileShareStatus;
    }

    /**
     * <p>
     * The status of the file share. Possible values are <code>CREATING</code>,
     * <code>UPDATING</code>, <code>AVAILABLE</code> and <code>DELETING</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param fileShareStatus <p>
     *            The status of the file share. Possible values are
     *            <code>CREATING</code>, <code>UPDATING</code>,
     *            <code>AVAILABLE</code> and <code>DELETING</code>.
     *            </p>
     */
    public void setFileShareStatus(String fileShareStatus) {
        this.fileShareStatus = fileShareStatus;
    }

    /**
     * <p>
     * The status of the file share. Possible values are <code>CREATING</code>,
     * <code>UPDATING</code>, <code>AVAILABLE</code> and <code>DELETING</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 50<br/>
     *
     * @param fileShareStatus <p>
     *            The status of the file share. Possible values are
     *            <code>CREATING</code>, <code>UPDATING</code>,
     *            <code>AVAILABLE</code> and <code>DELETING</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareInfo withFileShareStatus(String fileShareStatus) {
        this.fileShareStatus = fileShareStatus;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for
     *         your account and AWS Region.
     *         </p>
     */
    public String getGatewayARN() {
        return gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN <p>
     *            The Amazon Resource Name (ARN) of the gateway. Use the
     *            <a>ListGateways</a> operation to return a list of gateways for
     *            your account and AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareInfo withGatewayARN(String gatewayARN) {
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
    public NFSFileShareInfo withKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon
     *         S3 server-side encryption. This value can only be set when
     *         KMSEncrypted is true. Optional.
     *         </p>
     */
    public String getKMSKey() {
        return kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @param kMSKey <p>
     *            The Amazon Resource Name (ARN) of the AWS KMS key used for
     *            Amazon S3 server-side encryption. This value can only be set
     *            when KMSEncrypted is true. Optional.
     *            </p>
     */
    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @param kMSKey <p>
     *            The Amazon Resource Name (ARN) of the AWS KMS key used for
     *            Amazon S3 server-side encryption. This value can only be set
     *            when KMSEncrypted is true. Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareInfo withKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
        return this;
    }

    /**
     * <p>
     * The file share path used by the NFS client to identify the mount point.
     * </p>
     *
     * @return <p>
     *         The file share path used by the NFS client to identify the mount
     *         point.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The file share path used by the NFS client to identify the mount point.
     * </p>
     *
     * @param path <p>
     *            The file share path used by the NFS client to identify the
     *            mount point.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The file share path used by the NFS client to identify the mount point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The file share path used by the NFS client to identify the
     *            mount point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that file gateway assumes when it accesses the
     * underlying storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the IAM role that file gateway assumes when it
     *         accesses the underlying storage.
     *         </p>
     */
    public String getRole() {
        return role;
    }

    /**
     * <p>
     * The ARN of the IAM role that file gateway assumes when it accesses the
     * underlying storage.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param role <p>
     *            The ARN of the IAM role that file gateway assumes when it
     *            accesses the underlying storage.
     *            </p>
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The ARN of the IAM role that file gateway assumes when it accesses the
     * underlying storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param role <p>
     *            The ARN of the IAM role that file gateway assumes when it
     *            accesses the underlying storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareInfo withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * <p>
     * The ARN of the backend storage used for storing file data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 310<br/>
     *
     * @return <p>
     *         The ARN of the backend storage used for storing file data.
     *         </p>
     */
    public String getLocationARN() {
        return locationARN;
    }

    /**
     * <p>
     * The ARN of the backend storage used for storing file data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 310<br/>
     *
     * @param locationARN <p>
     *            The ARN of the backend storage used for storing file data.
     *            </p>
     */
    public void setLocationARN(String locationARN) {
        this.locationARN = locationARN;
    }

    /**
     * <p>
     * The ARN of the backend storage used for storing file data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>16 - 310<br/>
     *
     * @param locationARN <p>
     *            The ARN of the backend storage used for storing file data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareInfo withLocationARN(String locationARN) {
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
    public NFSFileShareInfo withDefaultStorageClass(String defaultStorageClass) {
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
    public NFSFileShareInfo withObjectACL(String objectACL) {
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
    public NFSFileShareInfo withObjectACL(ObjectACL objectACL) {
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
    public NFSFileShareInfo withClientList(String... clientList) {
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
    public NFSFileShareInfo withClientList(java.util.Collection<String> clientList) {
        setClientList(clientList);
        return this;
    }

    /**
     * <p>
     * The user mapped to anonymous user. Valid options are the following:
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
     *         The user mapped to anonymous user. Valid options are the
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
     * The user mapped to anonymous user. Valid options are the following:
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
     *            The user mapped to anonymous user. Valid options are the
     *            following:
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
     * The user mapped to anonymous user. Valid options are the following:
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
     *            The user mapped to anonymous user. Valid options are the
     *            following:
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
    public NFSFileShareInfo withSquash(String squash) {
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
    public NFSFileShareInfo withReadOnly(Boolean readOnly) {
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
    public NFSFileShareInfo withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
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
    public NFSFileShareInfo withRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the NFS file share, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     *
     * @return <p>
     *         A list of up to 50 tags assigned to the NFS file share, sorted
     *         alphabetically by key name. Each tag is a key-value pair. For a
     *         gateway with more than 10 tags assigned, you can view all tags
     *         using the <code>ListTagsForResource</code> API operation.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the NFS file share, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the NFS file share, sorted
     *            alphabetically by key name. Each tag is a key-value pair. For
     *            a gateway with more than 10 tags assigned, you can view all
     *            tags using the <code>ListTagsForResource</code> API operation.
     *            </p>
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
     * A list of up to 50 tags assigned to the NFS file share, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the NFS file share, sorted
     *            alphabetically by key name. Each tag is a key-value pair. For
     *            a gateway with more than 10 tags assigned, you can view all
     *            tags using the <code>ListTagsForResource</code> API operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareInfo withTags(Tag... tags) {
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
     * A list of up to 50 tags assigned to the NFS file share, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the NFS file share, sorted
     *            alphabetically by key name. Each tag is a key-value pair. For
     *            a gateway with more than 10 tags assigned, you can view all
     *            tags using the <code>ListTagsForResource</code> API operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NFSFileShareInfo withTags(java.util.Collection<Tag> tags) {
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
        if (getNFSFileShareDefaults() != null)
            sb.append("NFSFileShareDefaults: " + getNFSFileShareDefaults() + ",");
        if (getFileShareARN() != null)
            sb.append("FileShareARN: " + getFileShareARN() + ",");
        if (getFileShareId() != null)
            sb.append("FileShareId: " + getFileShareId() + ",");
        if (getFileShareStatus() != null)
            sb.append("FileShareStatus: " + getFileShareStatus() + ",");
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: " + getKMSEncrypted() + ",");
        if (getKMSKey() != null)
            sb.append("KMSKey: " + getKMSKey() + ",");
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
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
                + ((getNFSFileShareDefaults() == null) ? 0 : getNFSFileShareDefaults().hashCode());
        hashCode = prime * hashCode
                + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode
                + ((getFileShareId() == null) ? 0 : getFileShareId().hashCode());
        hashCode = prime * hashCode
                + ((getFileShareStatus() == null) ? 0 : getFileShareStatus().hashCode());
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode
                + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
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

        if (obj instanceof NFSFileShareInfo == false)
            return false;
        NFSFileShareInfo other = (NFSFileShareInfo) obj;

        if (other.getNFSFileShareDefaults() == null ^ this.getNFSFileShareDefaults() == null)
            return false;
        if (other.getNFSFileShareDefaults() != null
                && other.getNFSFileShareDefaults().equals(this.getNFSFileShareDefaults()) == false)
            return false;
        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null
                && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getFileShareId() == null ^ this.getFileShareId() == null)
            return false;
        if (other.getFileShareId() != null
                && other.getFileShareId().equals(this.getFileShareId()) == false)
            return false;
        if (other.getFileShareStatus() == null ^ this.getFileShareStatus() == null)
            return false;
        if (other.getFileShareStatus() != null
                && other.getFileShareStatus().equals(this.getFileShareStatus()) == false)
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
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
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
