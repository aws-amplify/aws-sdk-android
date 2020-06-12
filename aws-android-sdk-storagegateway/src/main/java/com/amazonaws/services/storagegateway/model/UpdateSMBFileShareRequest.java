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
 * Updates a Server Message Block (SMB) file share.
 * </p>
 * <note>
 * <p>
 * To leave a file share field unchanged, set the corresponding input field to
 * null. This operation is only supported for file gateways.
 * </p>
 * </note> <important>
 * <p>
 * File gateways require AWS Security Token Service (AWS STS) to be activated to
 * enable you to create a file share. Make sure that AWS STS is activated in the
 * AWS Region you are creating your file gateway in. If AWS STS is not activated
 * in this AWS Region, activate it. For information about how to activate AWS
 * STS, see <a href=
 * "https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
 * >Activating and deactivating AWS STS in an AWS Region</a> in the <i>AWS
 * Identity and Access Management User Guide</i>.
 * </p>
 * <p>
 * File gateways don't support creating hard or symbolic links on a file share.
 * </p>
 * </important>
 */
public class UpdateSMBFileShareRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB file share that you want to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String fileShareARN;

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
     * The default storage class for objects put into an Amazon S3 bucket by the
     * file gateway. The default value is <code>S3_INTELLIGENT_TIERING</code>.
     * Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> |
     * <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 50<br/>
     */
    private String defaultStorageClass;

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in
     * the S3 bucket that a file gateway puts objects into. The default value is
     * <code>private</code>.
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
     * A value that sets the write status of a file share. Set this value to
     * <code>true</code> to set write status to read-only, otherwise set to
     * <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean readOnly;

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based
     * on file extensions. Set this value to <code>true</code> to enable MIME
     * type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean guessMIMETypeEnabled;

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost
     * associated with data download from the S3 bucket. If this value is set to
     * <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     * owner pays. However, the S3 bucket owner always pays the cost of storing
     * data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that
     * backs the file share, so make sure that the configuration on the file
     * share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean requesterPays;

    /**
     * <p>
     * Set this value to <code>true</code> to enable access control list (ACL)
     * on the SMB file share. Set it to <code>false</code> to map file and
     * directory permissions to the POSIX permissions.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html"
     * >Using Microsoft Windows ACLs to control access to an SMB file share</a>
     * in the <i>AWS Storage Gateway User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean sMBACLEnabled;

    /**
     * <p>
     * A list of users in the Active Directory that have administrator rights to
     * the file share. A group must be prefixed with the @ character. For
     * example, <code>@group1</code>. Can only be set if Authentication is set
     * to <code>ActiveDirectory</code>.
     * </p>
     */
    private java.util.List<String> adminUserList;

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example, <code>@group1</code>. Can only be set if Authentication is set
     * to <code>ActiveDirectory</code>.
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
     * The Amazon Resource Name (ARN) of the SMB file share that you want to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the SMB file share that you
     *         want to update.
     *         </p>
     */
    public String getFileShareARN() {
        return fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB file share that you want to
     * update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the SMB file share that you
     *            want to update.
     *            </p>
     */
    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB file share that you want to
     * update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the SMB file share that you
     *            want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSMBFileShareRequest withFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
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
    public UpdateSMBFileShareRequest withKMSEncrypted(Boolean kMSEncrypted) {
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
    public UpdateSMBFileShareRequest withKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
        return this;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the
     * file gateway. The default value is <code>S3_INTELLIGENT_TIERING</code>.
     * Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> |
     * <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 50<br/>
     *
     * @return <p>
     *         The default storage class for objects put into an Amazon S3
     *         bucket by the file gateway. The default value is
     *         <code>S3_INTELLIGENT_TIERING</code>. Optional.
     *         </p>
     *         <p>
     *         Valid Values: <code>S3_STANDARD</code> |
     *         <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code>
     *         | <code>S3_ONEZONE_IA</code>
     *         </p>
     */
    public String getDefaultStorageClass() {
        return defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the
     * file gateway. The default value is <code>S3_INTELLIGENT_TIERING</code>.
     * Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> |
     * <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 50<br/>
     *
     * @param defaultStorageClass <p>
     *            The default storage class for objects put into an Amazon S3
     *            bucket by the file gateway. The default value is
     *            <code>S3_INTELLIGENT_TIERING</code>. Optional.
     *            </p>
     *            <p>
     *            Valid Values: <code>S3_STANDARD</code> |
     *            <code>S3_INTELLIGENT_TIERING</code> |
     *            <code>S3_STANDARD_IA</code> | <code>S3_ONEZONE_IA</code>
     *            </p>
     */
    public void setDefaultStorageClass(String defaultStorageClass) {
        this.defaultStorageClass = defaultStorageClass;
    }

    /**
     * <p>
     * The default storage class for objects put into an Amazon S3 bucket by the
     * file gateway. The default value is <code>S3_INTELLIGENT_TIERING</code>.
     * Optional.
     * </p>
     * <p>
     * Valid Values: <code>S3_STANDARD</code> |
     * <code>S3_INTELLIGENT_TIERING</code> | <code>S3_STANDARD_IA</code> |
     * <code>S3_ONEZONE_IA</code>
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
     *            bucket by the file gateway. The default value is
     *            <code>S3_INTELLIGENT_TIERING</code>. Optional.
     *            </p>
     *            <p>
     *            Valid Values: <code>S3_STANDARD</code> |
     *            <code>S3_INTELLIGENT_TIERING</code> |
     *            <code>S3_STANDARD_IA</code> | <code>S3_ONEZONE_IA</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSMBFileShareRequest withDefaultStorageClass(String defaultStorageClass) {
        this.defaultStorageClass = defaultStorageClass;
        return this;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in
     * the S3 bucket that a file gateway puts objects into. The default value is
     * <code>private</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, bucket-owner-read, bucket-owner-full-control,
     * aws-exec-read
     *
     * @return <p>
     *         A value that sets the access control list (ACL) permission for
     *         objects in the S3 bucket that a file gateway puts objects into.
     *         The default value is <code>private</code>.
     *         </p>
     * @see ObjectACL
     */
    public String getObjectACL() {
        return objectACL;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in
     * the S3 bucket that a file gateway puts objects into. The default value is
     * <code>private</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, bucket-owner-read, bucket-owner-full-control,
     * aws-exec-read
     *
     * @param objectACL <p>
     *            A value that sets the access control list (ACL) permission for
     *            objects in the S3 bucket that a file gateway puts objects
     *            into. The default value is <code>private</code>.
     *            </p>
     * @see ObjectACL
     */
    public void setObjectACL(String objectACL) {
        this.objectACL = objectACL;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in
     * the S3 bucket that a file gateway puts objects into. The default value is
     * <code>private</code>.
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
     *            A value that sets the access control list (ACL) permission for
     *            objects in the S3 bucket that a file gateway puts objects
     *            into. The default value is <code>private</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectACL
     */
    public UpdateSMBFileShareRequest withObjectACL(String objectACL) {
        this.objectACL = objectACL;
        return this;
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in
     * the S3 bucket that a file gateway puts objects into. The default value is
     * <code>private</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>private, public-read, public-read-write,
     * authenticated-read, bucket-owner-read, bucket-owner-full-control,
     * aws-exec-read
     *
     * @param objectACL <p>
     *            A value that sets the access control list (ACL) permission for
     *            objects in the S3 bucket that a file gateway puts objects
     *            into. The default value is <code>private</code>.
     *            </p>
     * @see ObjectACL
     */
    public void setObjectACL(ObjectACL objectACL) {
        this.objectACL = objectACL.toString();
    }

    /**
     * <p>
     * A value that sets the access control list (ACL) permission for objects in
     * the S3 bucket that a file gateway puts objects into. The default value is
     * <code>private</code>.
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
     *            A value that sets the access control list (ACL) permission for
     *            objects in the S3 bucket that a file gateway puts objects
     *            into. The default value is <code>private</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ObjectACL
     */
    public UpdateSMBFileShareRequest withObjectACL(ObjectACL objectACL) {
        this.objectACL = objectACL.toString();
        return this;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to
     * <code>true</code> to set write status to read-only, otherwise set to
     * <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A value that sets the write status of a file share. Set this
     *         value to <code>true</code> to set write status to read-only,
     *         otherwise set to <code>false</code>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean isReadOnly() {
        return readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to
     * <code>true</code> to set write status to read-only, otherwise set to
     * <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A value that sets the write status of a file share. Set this
     *         value to <code>true</code> to set write status to read-only,
     *         otherwise set to <code>false</code>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to
     * <code>true</code> to set write status to read-only, otherwise set to
     * <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @param readOnly <p>
     *            A value that sets the write status of a file share. Set this
     *            value to <code>true</code> to set write status to read-only,
     *            otherwise set to <code>false</code>.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     */
    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to
     * <code>true</code> to set write status to read-only, otherwise set to
     * <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readOnly <p>
     *            A value that sets the write status of a file share. Set this
     *            value to <code>true</code> to set write status to read-only,
     *            otherwise set to <code>false</code>.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSMBFileShareRequest withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based
     * on file extensions. Set this value to <code>true</code> to enable MIME
     * type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A value that enables guessing of the MIME type for uploaded
     *         objects based on file extensions. Set this value to
     *         <code>true</code> to enable MIME type guessing, otherwise set to
     *         <code>false</code>. The default value is <code>true</code>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean isGuessMIMETypeEnabled() {
        return guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based
     * on file extensions. Set this value to <code>true</code> to enable MIME
     * type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A value that enables guessing of the MIME type for uploaded
     *         objects based on file extensions. Set this value to
     *         <code>true</code> to enable MIME type guessing, otherwise set to
     *         <code>false</code>. The default value is <code>true</code>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean getGuessMIMETypeEnabled() {
        return guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based
     * on file extensions. Set this value to <code>true</code> to enable MIME
     * type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @param guessMIMETypeEnabled <p>
     *            A value that enables guessing of the MIME type for uploaded
     *            objects based on file extensions. Set this value to
     *            <code>true</code> to enable MIME type guessing, otherwise set
     *            to <code>false</code>. The default value is <code>true</code>.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     */
    public void setGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        this.guessMIMETypeEnabled = guessMIMETypeEnabled;
    }

    /**
     * <p>
     * A value that enables guessing of the MIME type for uploaded objects based
     * on file extensions. Set this value to <code>true</code> to enable MIME
     * type guessing, otherwise set to <code>false</code>. The default value is
     * <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param guessMIMETypeEnabled <p>
     *            A value that enables guessing of the MIME type for uploaded
     *            objects based on file extensions. Set this value to
     *            <code>true</code> to enable MIME type guessing, otherwise set
     *            to <code>false</code>. The default value is <code>true</code>.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSMBFileShareRequest withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
        this.guessMIMETypeEnabled = guessMIMETypeEnabled;
        return this;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost
     * associated with data download from the S3 bucket. If this value is set to
     * <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     * owner pays. However, the S3 bucket owner always pays the cost of storing
     * data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that
     * backs the file share, so make sure that the configuration on the file
     * share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A value that sets who pays the cost of the request and the cost
     *         associated with data download from the S3 bucket. If this value
     *         is set to <code>true</code>, the requester pays the costs;
     *         otherwise, the S3 bucket owner pays. However, the S3 bucket owner
     *         always pays the cost of storing data.
     *         </p>
     *         <note>
     *         <p>
     *         <code>RequesterPays</code> is a configuration for the S3 bucket
     *         that backs the file share, so make sure that the configuration on
     *         the file share is the same as the S3 bucket configuration.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean isRequesterPays() {
        return requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost
     * associated with data download from the S3 bucket. If this value is set to
     * <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     * owner pays. However, the S3 bucket owner always pays the cost of storing
     * data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that
     * backs the file share, so make sure that the configuration on the file
     * share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A value that sets who pays the cost of the request and the cost
     *         associated with data download from the S3 bucket. If this value
     *         is set to <code>true</code>, the requester pays the costs;
     *         otherwise, the S3 bucket owner pays. However, the S3 bucket owner
     *         always pays the cost of storing data.
     *         </p>
     *         <note>
     *         <p>
     *         <code>RequesterPays</code> is a configuration for the S3 bucket
     *         that backs the file share, so make sure that the configuration on
     *         the file share is the same as the S3 bucket configuration.
     *         </p>
     *         </note>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean getRequesterPays() {
        return requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost
     * associated with data download from the S3 bucket. If this value is set to
     * <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     * owner pays. However, the S3 bucket owner always pays the cost of storing
     * data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that
     * backs the file share, so make sure that the configuration on the file
     * share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @param requesterPays <p>
     *            A value that sets who pays the cost of the request and the
     *            cost associated with data download from the S3 bucket. If this
     *            value is set to <code>true</code>, the requester pays the
     *            costs; otherwise, the S3 bucket owner pays. However, the S3
     *            bucket owner always pays the cost of storing data.
     *            </p>
     *            <note>
     *            <p>
     *            <code>RequesterPays</code> is a configuration for the S3
     *            bucket that backs the file share, so make sure that the
     *            configuration on the file share is the same as the S3 bucket
     *            configuration.
     *            </p>
     *            </note>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     */
    public void setRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
    }

    /**
     * <p>
     * A value that sets who pays the cost of the request and the cost
     * associated with data download from the S3 bucket. If this value is set to
     * <code>true</code>, the requester pays the costs; otherwise, the S3 bucket
     * owner pays. However, the S3 bucket owner always pays the cost of storing
     * data.
     * </p>
     * <note>
     * <p>
     * <code>RequesterPays</code> is a configuration for the S3 bucket that
     * backs the file share, so make sure that the configuration on the file
     * share is the same as the S3 bucket configuration.
     * </p>
     * </note>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param requesterPays <p>
     *            A value that sets who pays the cost of the request and the
     *            cost associated with data download from the S3 bucket. If this
     *            value is set to <code>true</code>, the requester pays the
     *            costs; otherwise, the S3 bucket owner pays. However, the S3
     *            bucket owner always pays the cost of storing data.
     *            </p>
     *            <note>
     *            <p>
     *            <code>RequesterPays</code> is a configuration for the S3
     *            bucket that backs the file share, so make sure that the
     *            configuration on the file share is the same as the S3 bucket
     *            configuration.
     *            </p>
     *            </note>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSMBFileShareRequest withRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
        return this;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable access control list (ACL)
     * on the SMB file share. Set it to <code>false</code> to map file and
     * directory permissions to the POSIX permissions.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html"
     * >Using Microsoft Windows ACLs to control access to an SMB file share</a>
     * in the <i>AWS Storage Gateway User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         Set this value to <code>true</code> to enable access control list
     *         (ACL) on the SMB file share. Set it to <code>false</code> to map
     *         file and directory permissions to the POSIX permissions.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html"
     *         >Using Microsoft Windows ACLs to control access to an SMB file
     *         share</a> in the <i>AWS Storage Gateway User Guide</i>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean isSMBACLEnabled() {
        return sMBACLEnabled;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable access control list (ACL)
     * on the SMB file share. Set it to <code>false</code> to map file and
     * directory permissions to the POSIX permissions.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html"
     * >Using Microsoft Windows ACLs to control access to an SMB file share</a>
     * in the <i>AWS Storage Gateway User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         Set this value to <code>true</code> to enable access control list
     *         (ACL) on the SMB file share. Set it to <code>false</code> to map
     *         file and directory permissions to the POSIX permissions.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html"
     *         >Using Microsoft Windows ACLs to control access to an SMB file
     *         share</a> in the <i>AWS Storage Gateway User Guide</i>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean getSMBACLEnabled() {
        return sMBACLEnabled;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable access control list (ACL)
     * on the SMB file share. Set it to <code>false</code> to map file and
     * directory permissions to the POSIX permissions.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html"
     * >Using Microsoft Windows ACLs to control access to an SMB file share</a>
     * in the <i>AWS Storage Gateway User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @param sMBACLEnabled <p>
     *            Set this value to <code>true</code> to enable access control
     *            list (ACL) on the SMB file share. Set it to <code>false</code>
     *            to map file and directory permissions to the POSIX
     *            permissions.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html"
     *            >Using Microsoft Windows ACLs to control access to an SMB file
     *            share</a> in the <i>AWS Storage Gateway User Guide</i>.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     */
    public void setSMBACLEnabled(Boolean sMBACLEnabled) {
        this.sMBACLEnabled = sMBACLEnabled;
    }

    /**
     * <p>
     * Set this value to <code>true</code> to enable access control list (ACL)
     * on the SMB file share. Set it to <code>false</code> to map file and
     * directory permissions to the POSIX permissions.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html"
     * >Using Microsoft Windows ACLs to control access to an SMB file share</a>
     * in the <i>AWS Storage Gateway User Guide</i>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sMBACLEnabled <p>
     *            Set this value to <code>true</code> to enable access control
     *            list (ACL) on the SMB file share. Set it to <code>false</code>
     *            to map file and directory permissions to the POSIX
     *            permissions.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/storagegateway/latest/userguide/smb-acl.html"
     *            >Using Microsoft Windows ACLs to control access to an SMB file
     *            share</a> in the <i>AWS Storage Gateway User Guide</i>.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSMBFileShareRequest withSMBACLEnabled(Boolean sMBACLEnabled) {
        this.sMBACLEnabled = sMBACLEnabled;
        return this;
    }

    /**
     * <p>
     * A list of users in the Active Directory that have administrator rights to
     * the file share. A group must be prefixed with the @ character. For
     * example, <code>@group1</code>. Can only be set if Authentication is set
     * to <code>ActiveDirectory</code>.
     * </p>
     *
     * @return <p>
     *         A list of users in the Active Directory that have administrator
     *         rights to the file share. A group must be prefixed with the @
     *         character. For example, <code>@group1</code>. Can only be set if
     *         Authentication is set to <code>ActiveDirectory</code>.
     *         </p>
     */
    public java.util.List<String> getAdminUserList() {
        return adminUserList;
    }

    /**
     * <p>
     * A list of users in the Active Directory that have administrator rights to
     * the file share. A group must be prefixed with the @ character. For
     * example, <code>@group1</code>. Can only be set if Authentication is set
     * to <code>ActiveDirectory</code>.
     * </p>
     *
     * @param adminUserList <p>
     *            A list of users in the Active Directory that have
     *            administrator rights to the file share. A group must be
     *            prefixed with the @ character. For example,
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
     * A list of users in the Active Directory that have administrator rights to
     * the file share. A group must be prefixed with the @ character. For
     * example, <code>@group1</code>. Can only be set if Authentication is set
     * to <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminUserList <p>
     *            A list of users in the Active Directory that have
     *            administrator rights to the file share. A group must be
     *            prefixed with the @ character. For example,
     *            <code>@group1</code>. Can only be set if Authentication is set
     *            to <code>ActiveDirectory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSMBFileShareRequest withAdminUserList(String... adminUserList) {
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
     * A list of users in the Active Directory that have administrator rights to
     * the file share. A group must be prefixed with the @ character. For
     * example, <code>@group1</code>. Can only be set if Authentication is set
     * to <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adminUserList <p>
     *            A list of users in the Active Directory that have
     *            administrator rights to the file share. A group must be
     *            prefixed with the @ character. For example,
     *            <code>@group1</code>. Can only be set if Authentication is set
     *            to <code>ActiveDirectory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSMBFileShareRequest withAdminUserList(java.util.Collection<String> adminUserList) {
        setAdminUserList(adminUserList);
        return this;
    }

    /**
     * <p>
     * A list of users or groups in the Active Directory that are allowed to
     * access the file share. A group must be prefixed with the @ character. For
     * example, <code>@group1</code>. Can only be set if Authentication is set
     * to <code>ActiveDirectory</code>.
     * </p>
     *
     * @return <p>
     *         A list of users or groups in the Active Directory that are
     *         allowed to access the file share. A group must be prefixed with
     *         the @ character. For example, <code>@group1</code>. Can only be
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
     * example, <code>@group1</code>. Can only be set if Authentication is set
     * to <code>ActiveDirectory</code>.
     * </p>
     *
     * @param validUserList <p>
     *            A list of users or groups in the Active Directory that are
     *            allowed to access the file share. A group must be prefixed
     *            with the @ character. For example, <code>@group1</code>. Can
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
     * example, <code>@group1</code>. Can only be set if Authentication is set
     * to <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUserList <p>
     *            A list of users or groups in the Active Directory that are
     *            allowed to access the file share. A group must be prefixed
     *            with the @ character. For example, <code>@group1</code>. Can
     *            only be set if Authentication is set to
     *            <code>ActiveDirectory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSMBFileShareRequest withValidUserList(String... validUserList) {
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
     * example, <code>@group1</code>. Can only be set if Authentication is set
     * to <code>ActiveDirectory</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param validUserList <p>
     *            A list of users or groups in the Active Directory that are
     *            allowed to access the file share. A group must be prefixed
     *            with the @ character. For example, <code>@group1</code>. Can
     *            only be set if Authentication is set to
     *            <code>ActiveDirectory</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateSMBFileShareRequest withValidUserList(java.util.Collection<String> validUserList) {
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
    public UpdateSMBFileShareRequest withInvalidUserList(String... invalidUserList) {
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
    public UpdateSMBFileShareRequest withInvalidUserList(
            java.util.Collection<String> invalidUserList) {
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
    public UpdateSMBFileShareRequest withAuditDestinationARN(String auditDestinationARN) {
        this.auditDestinationARN = auditDestinationARN;
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
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: " + getKMSEncrypted() + ",");
        if (getKMSKey() != null)
            sb.append("KMSKey: " + getKMSKey() + ",");
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
            sb.append("AuditDestinationARN: " + getAuditDestinationARN());
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
                + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSMBFileShareRequest == false)
            return false;
        UpdateSMBFileShareRequest other = (UpdateSMBFileShareRequest) obj;

        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null
                && other.getFileShareARN().equals(this.getFileShareARN()) == false)
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
        return true;
    }
}
