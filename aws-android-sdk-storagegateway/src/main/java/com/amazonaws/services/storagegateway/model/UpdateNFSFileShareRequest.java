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
 * Updates a Network File System (NFS) file share. This operation is only
 * supported in the file gateway type.
 * </p>
 * <note>
 * <p>
 * To leave a file share field unchanged, set the corresponding input field to
 * null.
 * </p>
 * </note>
 * <p>
 * Updates the following file share setting:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Default storage class for your S3 bucket
 * </p>
 * </li>
 * <li>
 * <p>
 * Metadata defaults for your S3 bucket
 * </p>
 * </li>
 * <li>
 * <p>
 * Allowed NFS clients for your file share
 * </p>
 * </li>
 * <li>
 * <p>
 * Squash settings
 * </p>
 * </li>
 * <li>
 * <p>
 * Write status of your file share
 * </p>
 * </li>
 * </ul>
 * <note>
 * <p>
 * To leave a file share field unchanged, set the corresponding input field to
 * null. This operation is only supported in file gateways.
 * </p>
 * </note>
 */
public class UpdateNFSFileShareRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be updated.
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
     * The default values for the file share. Optional.
     * </p>
     */
    private NFSFileShareDefaults nFSFileShareDefaults;

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
     * The list of clients that are allowed to access the file gateway. The list
     * must contain either valid IP addresses or valid CIDR blocks.
     * </p>
     */
    private java.util.List<String> clientList;

    /**
     * <p>
     * The user mapped to anonymous user.
     * </p>
     * <p>
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code>: Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code>: No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code>: Everyone is mapped to anonymous user.
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
     * A value that sets the write status of a file share. Set this value to
     * <code>true</code> to set the write status to read-only, otherwise set to
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
     * The Amazon Resource Name (ARN) of the file share to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the file share to be updated.
     *         </p>
     */
    public String getFileShareARN() {
        return fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be updated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the file share to be
     *            updated.
     *            </p>
     */
    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share to be updated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the file share to be
     *            updated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNFSFileShareRequest withFileShareARN(String fileShareARN) {
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
    public UpdateNFSFileShareRequest withKMSEncrypted(Boolean kMSEncrypted) {
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
    public UpdateNFSFileShareRequest withKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
        return this;
    }

    /**
     * <p>
     * The default values for the file share. Optional.
     * </p>
     *
     * @return <p>
     *         The default values for the file share. Optional.
     *         </p>
     */
    public NFSFileShareDefaults getNFSFileShareDefaults() {
        return nFSFileShareDefaults;
    }

    /**
     * <p>
     * The default values for the file share. Optional.
     * </p>
     *
     * @param nFSFileShareDefaults <p>
     *            The default values for the file share. Optional.
     *            </p>
     */
    public void setNFSFileShareDefaults(NFSFileShareDefaults nFSFileShareDefaults) {
        this.nFSFileShareDefaults = nFSFileShareDefaults;
    }

    /**
     * <p>
     * The default values for the file share. Optional.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nFSFileShareDefaults <p>
     *            The default values for the file share. Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNFSFileShareRequest withNFSFileShareDefaults(
            NFSFileShareDefaults nFSFileShareDefaults) {
        this.nFSFileShareDefaults = nFSFileShareDefaults;
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
    public UpdateNFSFileShareRequest withDefaultStorageClass(String defaultStorageClass) {
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
    public UpdateNFSFileShareRequest withObjectACL(String objectACL) {
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
    public UpdateNFSFileShareRequest withObjectACL(ObjectACL objectACL) {
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
    public UpdateNFSFileShareRequest withClientList(String... clientList) {
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
    public UpdateNFSFileShareRequest withClientList(java.util.Collection<String> clientList) {
        setClientList(clientList);
        return this;
    }

    /**
     * <p>
     * The user mapped to anonymous user.
     * </p>
     * <p>
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code>: Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code>: No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code>: Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 15<br/>
     *
     * @return <p>
     *         The user mapped to anonymous user.
     *         </p>
     *         <p>
     *         Valid values are the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RootSquash</code>: Only root is mapped to anonymous user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NoSquash</code>: No one is mapped to anonymous user.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AllSquash</code>: Everyone is mapped to anonymous user.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSquash() {
        return squash;
    }

    /**
     * <p>
     * The user mapped to anonymous user.
     * </p>
     * <p>
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code>: Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code>: No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code>: Everyone is mapped to anonymous user.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 15<br/>
     *
     * @param squash <p>
     *            The user mapped to anonymous user.
     *            </p>
     *            <p>
     *            Valid values are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RootSquash</code>: Only root is mapped to anonymous
     *            user.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NoSquash</code>: No one is mapped to anonymous user.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AllSquash</code>: Everyone is mapped to anonymous user.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSquash(String squash) {
        this.squash = squash;
    }

    /**
     * <p>
     * The user mapped to anonymous user.
     * </p>
     * <p>
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RootSquash</code>: Only root is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NoSquash</code>: No one is mapped to anonymous user.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AllSquash</code>: Everyone is mapped to anonymous user.
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
     *            The user mapped to anonymous user.
     *            </p>
     *            <p>
     *            Valid values are the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>RootSquash</code>: Only root is mapped to anonymous
     *            user.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>NoSquash</code>: No one is mapped to anonymous user.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>AllSquash</code>: Everyone is mapped to anonymous user.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNFSFileShareRequest withSquash(String squash) {
        this.squash = squash;
        return this;
    }

    /**
     * <p>
     * A value that sets the write status of a file share. Set this value to
     * <code>true</code> to set the write status to read-only, otherwise set to
     * <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A value that sets the write status of a file share. Set this
     *         value to <code>true</code> to set the write status to read-only,
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
     * <code>true</code> to set the write status to read-only, otherwise set to
     * <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A value that sets the write status of a file share. Set this
     *         value to <code>true</code> to set the write status to read-only,
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
     * <code>true</code> to set the write status to read-only, otherwise set to
     * <code>false</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @param readOnly <p>
     *            A value that sets the write status of a file share. Set this
     *            value to <code>true</code> to set the write status to
     *            read-only, otherwise set to <code>false</code>.
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
     * <code>true</code> to set the write status to read-only, otherwise set to
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
     *            value to <code>true</code> to set the write status to
     *            read-only, otherwise set to <code>false</code>.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateNFSFileShareRequest withReadOnly(Boolean readOnly) {
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
    public UpdateNFSFileShareRequest withGuessMIMETypeEnabled(Boolean guessMIMETypeEnabled) {
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
    public UpdateNFSFileShareRequest withRequesterPays(Boolean requesterPays) {
        this.requesterPays = requesterPays;
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
        if (getNFSFileShareDefaults() != null)
            sb.append("NFSFileShareDefaults: " + getNFSFileShareDefaults() + ",");
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
            sb.append("RequesterPays: " + getRequesterPays());
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
                + ((getNFSFileShareDefaults() == null) ? 0 : getNFSFileShareDefaults().hashCode());
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
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNFSFileShareRequest == false)
            return false;
        UpdateNFSFileShareRequest other = (UpdateNFSFileShareRequest) obj;

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
        if (other.getNFSFileShareDefaults() == null ^ this.getNFSFileShareDefaults() == null)
            return false;
        if (other.getNFSFileShareDefaults() != null
                && other.getNFSFileShareDefaults().equals(this.getNFSFileShareDefaults()) == false)
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
        return true;
    }
}
