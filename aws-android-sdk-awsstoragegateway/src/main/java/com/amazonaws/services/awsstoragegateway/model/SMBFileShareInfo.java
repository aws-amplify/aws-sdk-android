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
 * The Windows file permissions and ownership information assigned, by default,
 * to native S3 objects when file gateway discovers them in S3 buckets. This
 * operation is only supported for file gateways.
 * </p>
 */
public class SMBFileShareInfo implements Serializable {
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
     * The file share path used by the SMB client to identify the mount point.
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
     * <b>Length: </b>5 - 50<br/>
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
     * If this value is set to "true", indicates that ACL (access control list)
     * is enabled on the SMB file share. If it is set to "false", it indicates
     * that file and directory permissions are mapped to the POSIX permission.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html
     * in the Storage Gateway User Guide.
     * </p>
     */
    private Boolean sMBACLEnabled;

    /**
     * <p>
     * A list of users or groups in the Active Directory that have administrator
     * rights to the file share. A group must be prefixed with the @ character.
     * For example <code>@group1</code>. Can only be set if Authentication is
     * set to <code>ActiveDirectory</code>.
     * </p>
     */
    private java.util.List<String> adminUserList;

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     */
    private java.util.List<String> validUserList;

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     */
    private java.util.List<String> invalidUserList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String auditDestinationARN;

    /**
     * <p>
     * The authentication method of the file share.
     * </p>
     * <p>
     * Valid values are <code>ActiveDirectory</code> or <code>GuestAccess</code>
     * . The default is <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 15<br/>
     */
    private String authentication;

    /**
     * <p>
     * A list of up to 50 tags assigned to the SMB file share, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     */
    private java.util.List<Tag> tags;

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
    public SMBFileShareInfo withFileShareARN(String fileShareARN) {
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
    public SMBFileShareInfo withFileShareId(String fileShareId) {
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
    public SMBFileShareInfo withFileShareStatus(String fileShareStatus) {
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
    public SMBFileShareInfo withGatewayARN(String gatewayARN) {
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
    public SMBFileShareInfo withKMSEncrypted(Boolean kMSEncrypted) {
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
    public SMBFileShareInfo withKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
        return this;
    }

    /**
     * <p>
     * The file share path used by the SMB client to identify the mount point.
     * </p>
     *
     * @return <p>
     *         The file share path used by the SMB client to identify the mount
     *         point.
     *         </p>
     */
    public String getPath() {
        return path;
    }

    /**
     * <p>
     * The file share path used by the SMB client to identify the mount point.
     * </p>
     *
     * @param path <p>
     *            The file share path used by the SMB client to identify the
     *            mount point.
     *            </p>
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The file share path used by the SMB client to identify the mount point.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param path <p>
     *            The file share path used by the SMB client to identify the
     *            mount point.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withPath(String path) {
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
    public SMBFileShareInfo withRole(String role) {
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
    public SMBFileShareInfo withLocationARN(String locationARN) {
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
     * <b>Length: </b>5 - 50<br/>
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
     * <b>Length: </b>5 - 50<br/>
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
     * <b>Length: </b>5 - 50<br/>
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
    public SMBFileShareInfo withDefaultStorageClass(String defaultStorageClass) {
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
    public SMBFileShareInfo withObjectACL(String objectACL) {
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
    public SMBFileShareInfo withObjectACL(ObjectACL objectACL) {
        this.objectACL = objectACL.toString();
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
    public SMBFileShareInfo withReadOnly(Boolean readOnly) {
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
    public SMBFileShareInfo withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
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
    public SMBFileShareInfo withRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
        return this;
    }

    /**
     * <p>
     * If this value is set to "true", indicates that ACL (access control list)
     * is enabled on the SMB file share. If it is set to "false", it indicates
     * that file and directory permissions are mapped to the POSIX permission.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html
     * in the Storage Gateway User Guide.
     * </p>
     *
     * @return <p>
     *         If this value is set to "true", indicates that ACL (access
     *         control list) is enabled on the SMB file share. If it is set to
     *         "false", it indicates that file and directory permissions are
     *         mapped to the POSIX permission.
     *         </p>
     *         <p>
     *         For more information, see
     *         https://docs.aws.amazon.com/storagegateway
     *         /latest/userguide/smb-acl.html in the Storage Gateway User Guide.
     *         </p>
     */
    public Boolean isSMBACLEnabled() {
        return sMBACLEnabled;
    }

    /**
     * <p>
     * If this value is set to "true", indicates that ACL (access control list)
     * is enabled on the SMB file share. If it is set to "false", it indicates
     * that file and directory permissions are mapped to the POSIX permission.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html
     * in the Storage Gateway User Guide.
     * </p>
     *
     * @return <p>
     *         If this value is set to "true", indicates that ACL (access
     *         control list) is enabled on the SMB file share. If it is set to
     *         "false", it indicates that file and directory permissions are
     *         mapped to the POSIX permission.
     *         </p>
     *         <p>
     *         For more information, see
     *         https://docs.aws.amazon.com/storagegateway
     *         /latest/userguide/smb-acl.html in the Storage Gateway User Guide.
     *         </p>
     */
    public Boolean getSMBACLEnabled() {
        return sMBACLEnabled;
    }

    /**
     * <p>
     * If this value is set to "true", indicates that ACL (access control list)
     * is enabled on the SMB file share. If it is set to "false", it indicates
     * that file and directory permissions are mapped to the POSIX permission.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html
     * in the Storage Gateway User Guide.
     * </p>
     *
     * @param sMBACLEnabled <p>
     *            If this value is set to "true", indicates that ACL (access
     *            control list) is enabled on the SMB file share. If it is set
     *            to "false", it indicates that file and directory permissions
     *            are mapped to the POSIX permission.
     *            </p>
     *            <p>
     *            For more information, see
     *            https://docs.aws.amazon.com/storagegateway
     *            /latest/userguide/smb-acl.html in the Storage Gateway User
     *            Guide.
     *            </p>
     */
    public void setSMBACLEnabled(Boolean sMBACLEnabled) {
        this.sMBACLEnabled = sMBACLEnabled;
    }

    /**
     * <p>
     * If this value is set to "true", indicates that ACL (access control list)
     * is enabled on the SMB file share. If it is set to "false", it indicates
     * that file and directory permissions are mapped to the POSIX permission.
     * </p>
     * <p>
     * For more information, see
     * https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html
     * in the Storage Gateway User Guide.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMBACLEnabled <p>
     *            If this value is set to "true", indicates that ACL (access
     *            control list) is enabled on the SMB file share. If it is set
     *            to "false", it indicates that file and directory permissions
     *            are mapped to the POSIX permission.
     *            </p>
     *            <p>
     *            For more information, see
     *            https://docs.aws.amazon.com/storagegateway
     *            /latest/userguide/smb-acl.html in the Storage Gateway User
     *            Guide.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withSMBACLEnabled(Boolean sMBACLEnabled) {
        this.sMBACLEnabled = sMBACLEnabled;
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that have administrator
     * rights to the file share. A group must be prefixed with the @ character.
     * For example <code>@group1</code>. Can only be set if Authentication is
     * set to <code>ActiveDirectory</code>.
     * </p>
     *
     * @return <p>
     *         A list of users or groups in the Active Directory that have
     *         administrator rights to the file share. A group must be prefixed
     *         with the @ character. For example <code>@group1</code>. Can only
     *         be set if Authentication is set to <code>ActiveDirectory</code>.
     *         </p>
     */
    public java.util.List<String> getAdminUserList() {
        return adminUserList;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that have administrator
     * rights to the file share. A group must be prefixed with the @ character.
     * For example <code>@group1</code>. Can only be set if Authentication is
     * set to <code>ActiveDirectory</code>.
     * </p>
     *
     * @param adminUserList <p>
     *            A list of users or groups in the Active Directory that have
     *            administrator rights to the file share. A group must be
     *            prefixed with the @ character. For example
     *            <code>@group1</code>. Can only be set if Authentication is set
     *            to <code>ActiveDirectory</code>.
     *            </p>
     */
    public void setAdminUserList(java.util.Collection<String> adminUserList) {
        if (adminUserList == null) {
            this.adminUserList = null;
            return;
        }

        this.adminUserList = new java.util.ArrayList<String>(adminUserList);
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that have administrator
     * rights to the file share. A group must be prefixed with the @ character.
     * For example <code>@group1</code>. Can only be set if Authentication is
     * set to <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminUserList <p>
     *            A list of users or groups in the Active Directory that have
     *            administrator rights to the file share. A group must be
     *            prefixed with the @ character. For example
     *            <code>@group1</code>. Can only be set if Authentication is set
     *            to <code>ActiveDirectory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withAdminUserList(String... adminUserList) {
        if (getAdminUserList() == null) {
            this.adminUserList = new java.util.ArrayList<String>(adminUserList.length);
        }
        for (String value : adminUserList) {
            this.adminUserList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that have administrator
     * rights to the file share. A group must be prefixed with the @ character.
     * For example <code>@group1</code>. Can only be set if Authentication is
     * set to <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminUserList <p>
     *            A list of users or groups in the Active Directory that have
     *            administrator rights to the file share. A group must be
     *            prefixed with the @ character. For example
     *            <code>@group1</code>. Can only be set if Authentication is set
     *            to <code>ActiveDirectory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withAdminUserList(java.util.Collection<String> adminUserList) {
        setAdminUserList(adminUserList);
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     *
     * @return <p>
     *         A list of users or groups in the Active Directory that are
     *         allowed to access the file share. A group must be prefixed with
     *         the @ character. For example <code>@group1</code>. Can only be
     *         set if Authentication is set to <code>ActiveDirectory</code>.
     *         </p>
     */
    public java.util.List<String> getValidUserList() {
        return validUserList;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     *
     * @param validUserList <p>
     *            A list of users or groups in the Active Directory that are
     *            allowed to access the file share. A group must be prefixed
     *            with the @ character. For example <code>@group1</code>. Can
     *            only be set if Authentication is set to
     *            <code>ActiveDirectory</code>.
     *            </p>
     */
    public void setValidUserList(java.util.Collection<String> validUserList) {
        if (validUserList == null) {
            this.validUserList = null;
            return;
        }

        this.validUserList = new java.util.ArrayList<String>(validUserList);
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUserList <p>
     *            A list of users or groups in the Active Directory that are
     *            allowed to access the file share. A group must be prefixed
     *            with the @ character. For example <code>@group1</code>. Can
     *            only be set if Authentication is set to
     *            <code>ActiveDirectory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withValidUserList(String... validUserList) {
        if (getValidUserList() == null) {
            this.validUserList = new java.util.ArrayList<String>(validUserList.length);
        }
        for (String value : validUserList) {
            this.validUserList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUserList <p>
     *            A list of users or groups in the Active Directory that are
     *            allowed to access the file share. A group must be prefixed
     *            with the @ character. For example <code>@group1</code>. Can
     *            only be set if Authentication is set to
     *            <code>ActiveDirectory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withValidUserList(java.util.Collection<String> validUserList) {
        setValidUserList(validUserList);
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     *
     * @return <p>
     *         A list of users or groups in the Active Directory that are not
     *         allowed to access the file share. A group must be prefixed with
     *         the @ character. For example <code>@group1</code>. Can only be
     *         set if Authentication is set to <code>ActiveDirectory</code>.
     *         </p>
     */
    public java.util.List<String> getInvalidUserList() {
        return invalidUserList;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     *
     * @param invalidUserList <p>
     *            A list of users or groups in the Active Directory that are not
     *            allowed to access the file share. A group must be prefixed
     *            with the @ character. For example <code>@group1</code>. Can
     *            only be set if Authentication is set to
     *            <code>ActiveDirectory</code>.
     *            </p>
     */
    public void setInvalidUserList(java.util.Collection<String> invalidUserList) {
        if (invalidUserList == null) {
            this.invalidUserList = null;
            return;
        }

        this.invalidUserList = new java.util.ArrayList<String>(invalidUserList);
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invalidUserList <p>
     *            A list of users or groups in the Active Directory that are not
     *            allowed to access the file share. A group must be prefixed
     *            with the @ character. For example <code>@group1</code>. Can
     *            only be set if Authentication is set to
     *            <code>ActiveDirectory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withInvalidUserList(String... invalidUserList) {
        if (getInvalidUserList() == null) {
            this.invalidUserList = new java.util.ArrayList<String>(invalidUserList.length);
        }
        for (String value : invalidUserList) {
            this.invalidUserList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are not allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example <code>@group1</code>. Can only be set if Authentication is set to
     * <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param invalidUserList <p>
     *            A list of users or groups in the Active Directory that are not
     *            allowed to access the file share. A group must be prefixed
     *            with the @ character. For example <code>@group1</code>. Can
     *            only be set if Authentication is set to
     *            <code>ActiveDirectory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withInvalidUserList(java.util.Collection<String> invalidUserList) {
        setInvalidUserList(invalidUserList);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the storage used for the audit
     *         logs.
     *         </p>
     */
    public String getAuditDestinationARN() {
        return auditDestinationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param auditDestinationARN <p>
     *            The Amazon Resource Name (ARN) of the storage used for the
     *            audit logs.
     *            </p>
     */
    public void setAuditDestinationARN(String auditDestinationARN) {
        this.auditDestinationARN = auditDestinationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the storage used for the audit logs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param auditDestinationARN <p>
     *            The Amazon Resource Name (ARN) of the storage used for the
     *            audit logs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withAuditDestinationARN(String auditDestinationARN) {
        this.auditDestinationARN = auditDestinationARN;
        return this;
    }

    /**
     * <p>
     * The authentication method of the file share.
     * </p>
     * <p>
     * Valid values are <code>ActiveDirectory</code> or <code>GuestAccess</code>
     * . The default is <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 15<br/>
     *
     * @return <p>
     *         The authentication method of the file share.
     *         </p>
     *         <p>
     *         Valid values are <code>ActiveDirectory</code> or
     *         <code>GuestAccess</code>. The default is
     *         <code>ActiveDirectory</code>.
     *         </p>
     */
    public String getAuthentication() {
        return authentication;
    }

    /**
     * <p>
     * The authentication method of the file share.
     * </p>
     * <p>
     * Valid values are <code>ActiveDirectory</code> or <code>GuestAccess</code>
     * . The default is <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 15<br/>
     *
     * @param authentication <p>
     *            The authentication method of the file share.
     *            </p>
     *            <p>
     *            Valid values are <code>ActiveDirectory</code> or
     *            <code>GuestAccess</code>. The default is
     *            <code>ActiveDirectory</code>.
     *            </p>
     */
    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    /**
     * <p>
     * The authentication method of the file share.
     * </p>
     * <p>
     * Valid values are <code>ActiveDirectory</code> or <code>GuestAccess</code>
     * . The default is <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 15<br/>
     *
     * @param authentication <p>
     *            The authentication method of the file share.
     *            </p>
     *            <p>
     *            Valid values are <code>ActiveDirectory</code> or
     *            <code>GuestAccess</code>. The default is
     *            <code>ActiveDirectory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withAuthentication(String authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the SMB file share, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     *
     * @return <p>
     *         A list of up to 50 tags assigned to the SMB file share, sorted
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
     * A list of up to 50 tags assigned to the SMB file share, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the SMB file share, sorted
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
     * A list of up to 50 tags assigned to the SMB file share, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the SMB file share, sorted
     *            alphabetically by key name. Each tag is a key-value pair. For
     *            a gateway with more than 10 tags assigned, you can view all
     *            tags using the <code>ListTagsForResource</code> API operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withTags(Tag... tags) {
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
     * A list of up to 50 tags assigned to the SMB file share, sorted
     * alphabetically by key name. Each tag is a key-value pair. For a gateway
     * with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the SMB file share, sorted
     *            alphabetically by key name. Each tag is a key-value pair. For
     *            a gateway with more than 10 tags assigned, you can view all
     *            tags using the <code>ListTagsForResource</code> API operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SMBFileShareInfo withTags(java.util.Collection<Tag> tags) {
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
        if (getReadOnly() != null)
            sb.append("ReadOnly: " + getReadOnly() + ",");
        if (getGuessMIMETypeEnabled() != null)
            sb.append("GuessMIMETypeEnabled: " + getGuessMIMETypeEnabled() + ",");
        if (getRequesterPays() != null)
            sb.append("RequesterPays: " + getRequesterPays() + ",");
        if (getSMBACLEnabled() != null)
            sb.append("SMBACLEnabled: " + getSMBACLEnabled() + ",");
        if (getAdminUserList() != null)
            sb.append("AdminUserList: " + getAdminUserList() + ",");
        if (getValidUserList() != null)
            sb.append("ValidUserList: " + getValidUserList() + ",");
        if (getInvalidUserList() != null)
            sb.append("InvalidUserList: " + getInvalidUserList() + ",");
        if (getAuditDestinationARN() != null)
            sb.append("AuditDestinationARN: " + getAuditDestinationARN() + ",");
        if (getAuthentication() != null)
            sb.append("Authentication: " + getAuthentication() + ",");
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
        hashCode = prime * hashCode + ((getReadOnly() == null) ? 0 : getReadOnly().hashCode());
        hashCode = prime * hashCode
                + ((getGuessMIMETypeEnabled() == null) ? 0 : getGuessMIMETypeEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getRequesterPays() == null) ? 0 : getRequesterPays().hashCode());
        hashCode = prime * hashCode
                + ((getSMBACLEnabled() == null) ? 0 : getSMBACLEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getAdminUserList() == null) ? 0 : getAdminUserList().hashCode());
        hashCode = prime * hashCode
                + ((getValidUserList() == null) ? 0 : getValidUserList().hashCode());
        hashCode = prime * hashCode
                + ((getInvalidUserList() == null) ? 0 : getInvalidUserList().hashCode());
        hashCode = prime * hashCode
                + ((getAuditDestinationARN() == null) ? 0 : getAuditDestinationARN().hashCode());
        hashCode = prime * hashCode
                + ((getAuthentication() == null) ? 0 : getAuthentication().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SMBFileShareInfo == false)
            return false;
        SMBFileShareInfo other = (SMBFileShareInfo) obj;

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
        if (other.getSMBACLEnabled() == null ^ this.getSMBACLEnabled() == null)
            return false;
        if (other.getSMBACLEnabled() != null
                && other.getSMBACLEnabled().equals(this.getSMBACLEnabled()) == false)
            return false;
        if (other.getAdminUserList() == null ^ this.getAdminUserList() == null)
            return false;
        if (other.getAdminUserList() != null
                && other.getAdminUserList().equals(this.getAdminUserList()) == false)
            return false;
        if (other.getValidUserList() == null ^ this.getValidUserList() == null)
            return false;
        if (other.getValidUserList() != null
                && other.getValidUserList().equals(this.getValidUserList()) == false)
            return false;
        if (other.getInvalidUserList() == null ^ this.getInvalidUserList() == null)
            return false;
        if (other.getInvalidUserList() != null
                && other.getInvalidUserList().equals(this.getInvalidUserList()) == false)
            return false;
        if (other.getAuditDestinationARN() == null ^ this.getAuditDestinationARN() == null)
            return false;
        if (other.getAuditDestinationARN() != null
                && other.getAuditDestinationARN().equals(this.getAuditDestinationARN()) == false)
            return false;
        if (other.getAuthentication() == null ^ this.getAuthentication() == null)
            return false;
        if (other.getAuthentication() != null
                && other.getAuthentication().equals(this.getAuthentication()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
