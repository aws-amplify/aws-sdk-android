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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Copies the specified DB snapshot. The source DB snapshot must be in the
 * "available" state.
 * </p>
 * <p>
 * You can copy a snapshot from one AWS Region to another. In that case, the AWS
 * Region where you call the <code>CopyDBSnapshot</code> action is the
 * destination AWS Region for the DB snapshot copy.
 * </p>
 * <p>
 * For more information about copying snapshots, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopyDBSnapshot"
 * >Copying a DB Snapshot</a> in the <i>Amazon RDS User Guide.</i>
 * </p>
 */
public class CopyDBSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier for the source DB snapshot.
     * </p>
     * <p>
     * If the source snapshot is in the same AWS Region as the copy, specify a
     * valid DB snapshot identifier. For example, you might specify
     * <code>rds:mysql-instance1-snapshot-20130805</code>.
     * </p>
     * <p>
     * If the source snapshot is in a different AWS Region than the copy,
     * specify a valid DB snapshot ARN. For example, you might specify
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * .
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, this parameter must
     * be the Amazon Resource Name (ARN) of the shared DB snapshot.
     * </p>
     * <p>
     * If you are copying an encrypted snapshot this parameter must be in the
     * ARN format for the source AWS Region, and must match the
     * <code>SourceDBSnapshotIdentifier</code> in the <code>PreSignedUrl</code>
     * parameter.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the "available" state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>rds:mydb-2012-04-02-00-01</code>
     * </p>
     * <p>
     * Example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * </p>
     */
    private String sourceDBSnapshotIdentifier;

    /**
     * <p>
     * The identifier for the copy of the snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-snapshot</code>
     * </p>
     */
    private String targetDBSnapshotIdentifier;

    /**
     * <p>
     * The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the
     * Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for
     * the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can
     * specify a value for this parameter to encrypt the copy with a new KMS
     * encryption key. If you don't specify a value for this parameter, then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source
     * DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS
     * account, then you must specify a value for this parameter.
     * </p>
     * <p>
     * If you specify this parameter when you copy an unencrypted snapshot, the
     * copy is encrypted.
     * </p>
     * <p>
     * If you copy an encrypted snapshot to a different AWS Region, then you
     * must specify a KMS key for the destination AWS Region. KMS encryption
     * keys are specific to the AWS Region that they are created in, and you
     * can't use encryption keys from one AWS Region in another AWS Region.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * A value that indicates whether to copy all tags from the source DB
     * snapshot to the target DB snapshot. By default, tags are not copied.
     * </p>
     */
    private Boolean copyTags;

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the
     * <code>CopyDBSnapshot</code> API action in the source AWS Region that
     * contains the source DB snapshot to copy.
     * </p>
     * <p>
     * You must specify this parameter when you copy an encrypted DB snapshot
     * from another AWS Region by using the Amazon RDS API. Don't specify
     * <code>PreSignedUrl</code> when you are copying an encrypted DB snapshot
     * in the same AWS Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the
     * <code>CopyDBSnapshot</code> API action that can be executed in the source
     * AWS Region that contains the encrypted DB snapshot to be copied. The
     * presigned URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted DB
     * snapshot is copied to. This AWS Region is the same one where the
     * <code>CopyDBSnapshot</code> action is called that contains this presigned
     * URL.
     * </p>
     * <p>
     * For example, if you copy an encrypted DB snapshot from the us-west-2 AWS
     * Region to the us-east-1 AWS Region, then you call the
     * <code>CopyDBSnapshot</code> action in the us-east-1 AWS Region and
     * provide a presigned URL that contains a call to the
     * <code>CopyDBSnapshot</code> action in the us-west-2 AWS Region. For this
     * example, the <code>DestinationRegion</code> in the presigned URL must be
     * set to the us-east-1 AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB snapshot in the destination AWS Region. This
     * is the same identifier for both the <code>CopyDBSnapshot</code> action
     * that is called in the destination AWS Region, and the action contained in
     * the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBSnapshotIdentifier</code> - The DB snapshot identifier for
     * the encrypted snapshot to be copied. This identifier must be in the
     * Amazon Resource Name (ARN) format for the source AWS Region. For example,
     * if you are copying an encrypted DB snapshot from the us-west-2 AWS
     * Region, then your <code>SourceDBSnapshotIdentifier</code> looks like the
     * following example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * >Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 Signing Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify
     * <code>SourceRegion</code> (or <code>--source-region</code> for the AWS
     * CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid
     * request for the operation that can be executed in the source AWS Region.
     * </p>
     * </note>
     */
    private String preSignedUrl;

    /**
     * <p>
     * The name of an option group to associate with the copy of the snapshot.
     * </p>
     * <p>
     * Specify this option if you are copying a snapshot from one AWS Region to
     * another, and your DB instance uses a nondefault option group. If your
     * source DB instance uses Transparent Data Encryption for Oracle or
     * Microsoft SQL Server, you must specify this option when copying across
     * AWS Regions. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopySnapshot.Options"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * The identifier for the source DB snapshot.
     * </p>
     * <p>
     * If the source snapshot is in the same AWS Region as the copy, specify a
     * valid DB snapshot identifier. For example, you might specify
     * <code>rds:mysql-instance1-snapshot-20130805</code>.
     * </p>
     * <p>
     * If the source snapshot is in a different AWS Region than the copy,
     * specify a valid DB snapshot ARN. For example, you might specify
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * .
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, this parameter must
     * be the Amazon Resource Name (ARN) of the shared DB snapshot.
     * </p>
     * <p>
     * If you are copying an encrypted snapshot this parameter must be in the
     * ARN format for the source AWS Region, and must match the
     * <code>SourceDBSnapshotIdentifier</code> in the <code>PreSignedUrl</code>
     * parameter.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the "available" state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>rds:mydb-2012-04-02-00-01</code>
     * </p>
     * <p>
     * Example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * </p>
     *
     * @return <p>
     *         The identifier for the source DB snapshot.
     *         </p>
     *         <p>
     *         If the source snapshot is in the same AWS Region as the copy,
     *         specify a valid DB snapshot identifier. For example, you might
     *         specify <code>rds:mysql-instance1-snapshot-20130805</code>.
     *         </p>
     *         <p>
     *         If the source snapshot is in a different AWS Region than the
     *         copy, specify a valid DB snapshot ARN. For example, you might
     *         specify
     *         <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     *         .
     *         </p>
     *         <p>
     *         If you are copying from a shared manual DB snapshot, this
     *         parameter must be the Amazon Resource Name (ARN) of the shared DB
     *         snapshot.
     *         </p>
     *         <p>
     *         If you are copying an encrypted snapshot this parameter must be
     *         in the ARN format for the source AWS Region, and must match the
     *         <code>SourceDBSnapshotIdentifier</code> in the
     *         <code>PreSignedUrl</code> parameter.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must specify a valid system snapshot in the "available" state.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>rds:mydb-2012-04-02-00-01</code>
     *         </p>
     *         <p>
     *         Example:
     *         <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     *         </p>
     */
    public String getSourceDBSnapshotIdentifier() {
        return sourceDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the source DB snapshot.
     * </p>
     * <p>
     * If the source snapshot is in the same AWS Region as the copy, specify a
     * valid DB snapshot identifier. For example, you might specify
     * <code>rds:mysql-instance1-snapshot-20130805</code>.
     * </p>
     * <p>
     * If the source snapshot is in a different AWS Region than the copy,
     * specify a valid DB snapshot ARN. For example, you might specify
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * .
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, this parameter must
     * be the Amazon Resource Name (ARN) of the shared DB snapshot.
     * </p>
     * <p>
     * If you are copying an encrypted snapshot this parameter must be in the
     * ARN format for the source AWS Region, and must match the
     * <code>SourceDBSnapshotIdentifier</code> in the <code>PreSignedUrl</code>
     * parameter.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the "available" state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>rds:mydb-2012-04-02-00-01</code>
     * </p>
     * <p>
     * Example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * </p>
     *
     * @param sourceDBSnapshotIdentifier <p>
     *            The identifier for the source DB snapshot.
     *            </p>
     *            <p>
     *            If the source snapshot is in the same AWS Region as the copy,
     *            specify a valid DB snapshot identifier. For example, you might
     *            specify <code>rds:mysql-instance1-snapshot-20130805</code>.
     *            </p>
     *            <p>
     *            If the source snapshot is in a different AWS Region than the
     *            copy, specify a valid DB snapshot ARN. For example, you might
     *            specify
     *            <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     *            .
     *            </p>
     *            <p>
     *            If you are copying from a shared manual DB snapshot, this
     *            parameter must be the Amazon Resource Name (ARN) of the shared
     *            DB snapshot.
     *            </p>
     *            <p>
     *            If you are copying an encrypted snapshot this parameter must
     *            be in the ARN format for the source AWS Region, and must match
     *            the <code>SourceDBSnapshotIdentifier</code> in the
     *            <code>PreSignedUrl</code> parameter.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must specify a valid system snapshot in the "available" state.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>rds:mydb-2012-04-02-00-01</code>
     *            </p>
     *            <p>
     *            Example:
     *            <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     *            </p>
     */
    public void setSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        this.sourceDBSnapshotIdentifier = sourceDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the source DB snapshot.
     * </p>
     * <p>
     * If the source snapshot is in the same AWS Region as the copy, specify a
     * valid DB snapshot identifier. For example, you might specify
     * <code>rds:mysql-instance1-snapshot-20130805</code>.
     * </p>
     * <p>
     * If the source snapshot is in a different AWS Region than the copy,
     * specify a valid DB snapshot ARN. For example, you might specify
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * .
     * </p>
     * <p>
     * If you are copying from a shared manual DB snapshot, this parameter must
     * be the Amazon Resource Name (ARN) of the shared DB snapshot.
     * </p>
     * <p>
     * If you are copying an encrypted snapshot this parameter must be in the
     * ARN format for the source AWS Region, and must match the
     * <code>SourceDBSnapshotIdentifier</code> in the <code>PreSignedUrl</code>
     * parameter.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid system snapshot in the "available" state.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>rds:mydb-2012-04-02-00-01</code>
     * </p>
     * <p>
     * Example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDBSnapshotIdentifier <p>
     *            The identifier for the source DB snapshot.
     *            </p>
     *            <p>
     *            If the source snapshot is in the same AWS Region as the copy,
     *            specify a valid DB snapshot identifier. For example, you might
     *            specify <code>rds:mysql-instance1-snapshot-20130805</code>.
     *            </p>
     *            <p>
     *            If the source snapshot is in a different AWS Region than the
     *            copy, specify a valid DB snapshot ARN. For example, you might
     *            specify
     *            <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     *            .
     *            </p>
     *            <p>
     *            If you are copying from a shared manual DB snapshot, this
     *            parameter must be the Amazon Resource Name (ARN) of the shared
     *            DB snapshot.
     *            </p>
     *            <p>
     *            If you are copying an encrypted snapshot this parameter must
     *            be in the ARN format for the source AWS Region, and must match
     *            the <code>SourceDBSnapshotIdentifier</code> in the
     *            <code>PreSignedUrl</code> parameter.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must specify a valid system snapshot in the "available" state.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>rds:mydb-2012-04-02-00-01</code>
     *            </p>
     *            <p>
     *            Example:
     *            <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20130805</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBSnapshotRequest withSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        this.sourceDBSnapshotIdentifier = sourceDBSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier for the copy of the snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-snapshot</code>
     * </p>
     *
     * @return <p>
     *         The identifier for the copy of the snapshot.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be null, empty, or blank
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain from 1 to 255 letters, numbers, or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-db-snapshot</code>
     *         </p>
     */
    public String getTargetDBSnapshotIdentifier() {
        return targetDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the copy of the snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-snapshot</code>
     * </p>
     *
     * @param targetDBSnapshotIdentifier <p>
     *            The identifier for the copy of the snapshot.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Can't be null, empty, or blank
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain from 1 to 255 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-db-snapshot</code>
     *            </p>
     */
    public void setTargetDBSnapshotIdentifier(String targetDBSnapshotIdentifier) {
        this.targetDBSnapshotIdentifier = targetDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier for the copy of the snapshot.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-snapshot</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetDBSnapshotIdentifier <p>
     *            The identifier for the copy of the snapshot.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Can't be null, empty, or blank
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must contain from 1 to 255 letters, numbers, or hyphens
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-db-snapshot</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBSnapshotRequest withTargetDBSnapshotIdentifier(String targetDBSnapshotIdentifier) {
        this.targetDBSnapshotIdentifier = targetDBSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the
     * Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for
     * the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can
     * specify a value for this parameter to encrypt the copy with a new KMS
     * encryption key. If you don't specify a value for this parameter, then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source
     * DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS
     * account, then you must specify a value for this parameter.
     * </p>
     * <p>
     * If you specify this parameter when you copy an unencrypted snapshot, the
     * copy is encrypted.
     * </p>
     * <p>
     * If you copy an encrypted snapshot to a different AWS Region, then you
     * must specify a KMS key for the destination AWS Region. KMS encryption
     * keys are specific to the AWS Region that they are created in, and you
     * can't use encryption keys from one AWS Region in another AWS Region.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID
     *         is the Amazon Resource Name (ARN), KMS key identifier, or the KMS
     *         key alias for the KMS encryption key.
     *         </p>
     *         <p>
     *         If you copy an encrypted DB snapshot from your AWS account, you
     *         can specify a value for this parameter to encrypt the copy with a
     *         new KMS encryption key. If you don't specify a value for this
     *         parameter, then the copy of the DB snapshot is encrypted with the
     *         same KMS key as the source DB snapshot.
     *         </p>
     *         <p>
     *         If you copy an encrypted DB snapshot that is shared from another
     *         AWS account, then you must specify a value for this parameter.
     *         </p>
     *         <p>
     *         If you specify this parameter when you copy an unencrypted
     *         snapshot, the copy is encrypted.
     *         </p>
     *         <p>
     *         If you copy an encrypted snapshot to a different AWS Region, then
     *         you must specify a KMS key for the destination AWS Region. KMS
     *         encryption keys are specific to the AWS Region that they are
     *         created in, and you can't use encryption keys from one AWS Region
     *         in another AWS Region.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the
     * Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for
     * the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can
     * specify a value for this parameter to encrypt the copy with a new KMS
     * encryption key. If you don't specify a value for this parameter, then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source
     * DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS
     * account, then you must specify a value for this parameter.
     * </p>
     * <p>
     * If you specify this parameter when you copy an unencrypted snapshot, the
     * copy is encrypted.
     * </p>
     * <p>
     * If you copy an encrypted snapshot to a different AWS Region, then you
     * must specify a KMS key for the destination AWS Region. KMS encryption
     * keys are specific to the AWS Region that they are created in, and you
     * can't use encryption keys from one AWS Region in another AWS Region.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key ID for an encrypted DB snapshot. The KMS key
     *            ID is the Amazon Resource Name (ARN), KMS key identifier, or
     *            the KMS key alias for the KMS encryption key.
     *            </p>
     *            <p>
     *            If you copy an encrypted DB snapshot from your AWS account,
     *            you can specify a value for this parameter to encrypt the copy
     *            with a new KMS encryption key. If you don't specify a value
     *            for this parameter, then the copy of the DB snapshot is
     *            encrypted with the same KMS key as the source DB snapshot.
     *            </p>
     *            <p>
     *            If you copy an encrypted DB snapshot that is shared from
     *            another AWS account, then you must specify a value for this
     *            parameter.
     *            </p>
     *            <p>
     *            If you specify this parameter when you copy an unencrypted
     *            snapshot, the copy is encrypted.
     *            </p>
     *            <p>
     *            If you copy an encrypted snapshot to a different AWS Region,
     *            then you must specify a KMS key for the destination AWS
     *            Region. KMS encryption keys are specific to the AWS Region
     *            that they are created in, and you can't use encryption keys
     *            from one AWS Region in another AWS Region.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an encrypted DB snapshot. The KMS key ID is the
     * Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for
     * the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot from your AWS account, you can
     * specify a value for this parameter to encrypt the copy with a new KMS
     * encryption key. If you don't specify a value for this parameter, then the
     * copy of the DB snapshot is encrypted with the same KMS key as the source
     * DB snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB snapshot that is shared from another AWS
     * account, then you must specify a value for this parameter.
     * </p>
     * <p>
     * If you specify this parameter when you copy an unencrypted snapshot, the
     * copy is encrypted.
     * </p>
     * <p>
     * If you copy an encrypted snapshot to a different AWS Region, then you
     * must specify a KMS key for the destination AWS Region. KMS encryption
     * keys are specific to the AWS Region that they are created in, and you
     * can't use encryption keys from one AWS Region in another AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key ID for an encrypted DB snapshot. The KMS key
     *            ID is the Amazon Resource Name (ARN), KMS key identifier, or
     *            the KMS key alias for the KMS encryption key.
     *            </p>
     *            <p>
     *            If you copy an encrypted DB snapshot from your AWS account,
     *            you can specify a value for this parameter to encrypt the copy
     *            with a new KMS encryption key. If you don't specify a value
     *            for this parameter, then the copy of the DB snapshot is
     *            encrypted with the same KMS key as the source DB snapshot.
     *            </p>
     *            <p>
     *            If you copy an encrypted DB snapshot that is shared from
     *            another AWS account, then you must specify a value for this
     *            parameter.
     *            </p>
     *            <p>
     *            If you specify this parameter when you copy an unencrypted
     *            snapshot, the copy is encrypted.
     *            </p>
     *            <p>
     *            If you copy an encrypted snapshot to a different AWS Region,
     *            then you must specify a KMS key for the destination AWS
     *            Region. KMS encryption keys are specific to the AWS Region
     *            that they are created in, and you can't use encryption keys
     *            from one AWS Region in another AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBSnapshotRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A list of tags. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *         >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
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
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBSnapshotRequest withTags(Tag... tags) {
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
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBSnapshotRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the source DB
     * snapshot to the target DB snapshot. By default, tags are not copied.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the source
     *         DB snapshot to the target DB snapshot. By default, tags are not
     *         copied.
     *         </p>
     */
    public Boolean isCopyTags() {
        return copyTags;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the source DB
     * snapshot to the target DB snapshot. By default, tags are not copied.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the source
     *         DB snapshot to the target DB snapshot. By default, tags are not
     *         copied.
     *         </p>
     */
    public Boolean getCopyTags() {
        return copyTags;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the source DB
     * snapshot to the target DB snapshot. By default, tags are not copied.
     * </p>
     *
     * @param copyTags <p>
     *            A value that indicates whether to copy all tags from the
     *            source DB snapshot to the target DB snapshot. By default, tags
     *            are not copied.
     *            </p>
     */
    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the source DB
     * snapshot to the target DB snapshot. By default, tags are not copied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTags <p>
     *            A value that indicates whether to copy all tags from the
     *            source DB snapshot to the target DB snapshot. By default, tags
     *            are not copied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBSnapshotRequest withCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
        return this;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the
     * <code>CopyDBSnapshot</code> API action in the source AWS Region that
     * contains the source DB snapshot to copy.
     * </p>
     * <p>
     * You must specify this parameter when you copy an encrypted DB snapshot
     * from another AWS Region by using the Amazon RDS API. Don't specify
     * <code>PreSignedUrl</code> when you are copying an encrypted DB snapshot
     * in the same AWS Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the
     * <code>CopyDBSnapshot</code> API action that can be executed in the source
     * AWS Region that contains the encrypted DB snapshot to be copied. The
     * presigned URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted DB
     * snapshot is copied to. This AWS Region is the same one where the
     * <code>CopyDBSnapshot</code> action is called that contains this presigned
     * URL.
     * </p>
     * <p>
     * For example, if you copy an encrypted DB snapshot from the us-west-2 AWS
     * Region to the us-east-1 AWS Region, then you call the
     * <code>CopyDBSnapshot</code> action in the us-east-1 AWS Region and
     * provide a presigned URL that contains a call to the
     * <code>CopyDBSnapshot</code> action in the us-west-2 AWS Region. For this
     * example, the <code>DestinationRegion</code> in the presigned URL must be
     * set to the us-east-1 AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB snapshot in the destination AWS Region. This
     * is the same identifier for both the <code>CopyDBSnapshot</code> action
     * that is called in the destination AWS Region, and the action contained in
     * the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBSnapshotIdentifier</code> - The DB snapshot identifier for
     * the encrypted snapshot to be copied. This identifier must be in the
     * Amazon Resource Name (ARN) format for the source AWS Region. For example,
     * if you are copying an encrypted DB snapshot from the us-west-2 AWS
     * Region, then your <code>SourceDBSnapshotIdentifier</code> looks like the
     * following example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * >Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 Signing Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify
     * <code>SourceRegion</code> (or <code>--source-region</code> for the AWS
     * CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid
     * request for the operation that can be executed in the source AWS Region.
     * </p>
     * </note>
     *
     * @return <p>
     *         The URL that contains a Signature Version 4 signed request for
     *         the <code>CopyDBSnapshot</code> API action in the source AWS
     *         Region that contains the source DB snapshot to copy.
     *         </p>
     *         <p>
     *         You must specify this parameter when you copy an encrypted DB
     *         snapshot from another AWS Region by using the Amazon RDS API.
     *         Don't specify <code>PreSignedUrl</code> when you are copying an
     *         encrypted DB snapshot in the same AWS Region.
     *         </p>
     *         <p>
     *         The presigned URL must be a valid request for the
     *         <code>CopyDBSnapshot</code> API action that can be executed in
     *         the source AWS Region that contains the encrypted DB snapshot to
     *         be copied. The presigned URL request must contain the following
     *         parameter values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DestinationRegion</code> - The AWS Region that the
     *         encrypted DB snapshot is copied to. This AWS Region is the same
     *         one where the <code>CopyDBSnapshot</code> action is called that
     *         contains this presigned URL.
     *         </p>
     *         <p>
     *         For example, if you copy an encrypted DB snapshot from the
     *         us-west-2 AWS Region to the us-east-1 AWS Region, then you call
     *         the <code>CopyDBSnapshot</code> action in the us-east-1 AWS
     *         Region and provide a presigned URL that contains a call to the
     *         <code>CopyDBSnapshot</code> action in the us-west-2 AWS Region.
     *         For this example, the <code>DestinationRegion</code> in the
     *         presigned URL must be set to the us-east-1 AWS Region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KmsKeyId</code> - The AWS KMS key identifier for the key to
     *         use to encrypt the copy of the DB snapshot in the destination AWS
     *         Region. This is the same identifier for both the
     *         <code>CopyDBSnapshot</code> action that is called in the
     *         destination AWS Region, and the action contained in the presigned
     *         URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SourceDBSnapshotIdentifier</code> - The DB snapshot
     *         identifier for the encrypted snapshot to be copied. This
     *         identifier must be in the Amazon Resource Name (ARN) format for
     *         the source AWS Region. For example, if you are copying an
     *         encrypted DB snapshot from the us-west-2 AWS Region, then your
     *         <code>SourceDBSnapshotIdentifier</code> looks like the following
     *         example:
     *         <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To learn how to generate a Signature Version 4 signed request,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *         >Authenticating Requests: Using Query Parameters (AWS Signature
     *         Version 4)</a> and <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *         >Signature Version 4 Signing Process</a>.
     *         </p>
     *         <note>
     *         <p>
     *         If you are using an AWS SDK tool or the AWS CLI, you can specify
     *         <code>SourceRegion</code> (or <code>--source-region</code> for
     *         the AWS CLI) instead of specifying <code>PreSignedUrl</code>
     *         manually. Specifying <code>SourceRegion</code> autogenerates a
     *         pre-signed URL that is a valid request for the operation that can
     *         be executed in the source AWS Region.
     *         </p>
     *         </note>
     */
    public String getPreSignedUrl() {
        return preSignedUrl;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the
     * <code>CopyDBSnapshot</code> API action in the source AWS Region that
     * contains the source DB snapshot to copy.
     * </p>
     * <p>
     * You must specify this parameter when you copy an encrypted DB snapshot
     * from another AWS Region by using the Amazon RDS API. Don't specify
     * <code>PreSignedUrl</code> when you are copying an encrypted DB snapshot
     * in the same AWS Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the
     * <code>CopyDBSnapshot</code> API action that can be executed in the source
     * AWS Region that contains the encrypted DB snapshot to be copied. The
     * presigned URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted DB
     * snapshot is copied to. This AWS Region is the same one where the
     * <code>CopyDBSnapshot</code> action is called that contains this presigned
     * URL.
     * </p>
     * <p>
     * For example, if you copy an encrypted DB snapshot from the us-west-2 AWS
     * Region to the us-east-1 AWS Region, then you call the
     * <code>CopyDBSnapshot</code> action in the us-east-1 AWS Region and
     * provide a presigned URL that contains a call to the
     * <code>CopyDBSnapshot</code> action in the us-west-2 AWS Region. For this
     * example, the <code>DestinationRegion</code> in the presigned URL must be
     * set to the us-east-1 AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB snapshot in the destination AWS Region. This
     * is the same identifier for both the <code>CopyDBSnapshot</code> action
     * that is called in the destination AWS Region, and the action contained in
     * the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBSnapshotIdentifier</code> - The DB snapshot identifier for
     * the encrypted snapshot to be copied. This identifier must be in the
     * Amazon Resource Name (ARN) format for the source AWS Region. For example,
     * if you are copying an encrypted DB snapshot from the us-west-2 AWS
     * Region, then your <code>SourceDBSnapshotIdentifier</code> looks like the
     * following example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * >Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 Signing Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify
     * <code>SourceRegion</code> (or <code>--source-region</code> for the AWS
     * CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid
     * request for the operation that can be executed in the source AWS Region.
     * </p>
     * </note>
     *
     * @param preSignedUrl <p>
     *            The URL that contains a Signature Version 4 signed request for
     *            the <code>CopyDBSnapshot</code> API action in the source AWS
     *            Region that contains the source DB snapshot to copy.
     *            </p>
     *            <p>
     *            You must specify this parameter when you copy an encrypted DB
     *            snapshot from another AWS Region by using the Amazon RDS API.
     *            Don't specify <code>PreSignedUrl</code> when you are copying
     *            an encrypted DB snapshot in the same AWS Region.
     *            </p>
     *            <p>
     *            The presigned URL must be a valid request for the
     *            <code>CopyDBSnapshot</code> API action that can be executed in
     *            the source AWS Region that contains the encrypted DB snapshot
     *            to be copied. The presigned URL request must contain the
     *            following parameter values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DestinationRegion</code> - The AWS Region that the
     *            encrypted DB snapshot is copied to. This AWS Region is the
     *            same one where the <code>CopyDBSnapshot</code> action is
     *            called that contains this presigned URL.
     *            </p>
     *            <p>
     *            For example, if you copy an encrypted DB snapshot from the
     *            us-west-2 AWS Region to the us-east-1 AWS Region, then you
     *            call the <code>CopyDBSnapshot</code> action in the us-east-1
     *            AWS Region and provide a presigned URL that contains a call to
     *            the <code>CopyDBSnapshot</code> action in the us-west-2 AWS
     *            Region. For this example, the <code>DestinationRegion</code>
     *            in the presigned URL must be set to the us-east-1 AWS Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KmsKeyId</code> - The AWS KMS key identifier for the key
     *            to use to encrypt the copy of the DB snapshot in the
     *            destination AWS Region. This is the same identifier for both
     *            the <code>CopyDBSnapshot</code> action that is called in the
     *            destination AWS Region, and the action contained in the
     *            presigned URL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SourceDBSnapshotIdentifier</code> - The DB snapshot
     *            identifier for the encrypted snapshot to be copied. This
     *            identifier must be in the Amazon Resource Name (ARN) format
     *            for the source AWS Region. For example, if you are copying an
     *            encrypted DB snapshot from the us-west-2 AWS Region, then your
     *            <code>SourceDBSnapshotIdentifier</code> looks like the
     *            following example:
     *            <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To learn how to generate a Signature Version 4 signed request,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *            >Authenticating Requests: Using Query Parameters (AWS
     *            Signature Version 4)</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *            >Signature Version 4 Signing Process</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using an AWS SDK tool or the AWS CLI, you can
     *            specify <code>SourceRegion</code> (or
     *            <code>--source-region</code> for the AWS CLI) instead of
     *            specifying <code>PreSignedUrl</code> manually. Specifying
     *            <code>SourceRegion</code> autogenerates a pre-signed URL that
     *            is a valid request for the operation that can be executed in
     *            the source AWS Region.
     *            </p>
     *            </note>
     */
    public void setPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the
     * <code>CopyDBSnapshot</code> API action in the source AWS Region that
     * contains the source DB snapshot to copy.
     * </p>
     * <p>
     * You must specify this parameter when you copy an encrypted DB snapshot
     * from another AWS Region by using the Amazon RDS API. Don't specify
     * <code>PreSignedUrl</code> when you are copying an encrypted DB snapshot
     * in the same AWS Region.
     * </p>
     * <p>
     * The presigned URL must be a valid request for the
     * <code>CopyDBSnapshot</code> API action that can be executed in the source
     * AWS Region that contains the encrypted DB snapshot to be copied. The
     * presigned URL request must contain the following parameter values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The AWS Region that the encrypted DB
     * snapshot is copied to. This AWS Region is the same one where the
     * <code>CopyDBSnapshot</code> action is called that contains this presigned
     * URL.
     * </p>
     * <p>
     * For example, if you copy an encrypted DB snapshot from the us-west-2 AWS
     * Region to the us-east-1 AWS Region, then you call the
     * <code>CopyDBSnapshot</code> action in the us-east-1 AWS Region and
     * provide a presigned URL that contains a call to the
     * <code>CopyDBSnapshot</code> action in the us-west-2 AWS Region. For this
     * example, the <code>DestinationRegion</code> in the presigned URL must be
     * set to the us-east-1 AWS Region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB snapshot in the destination AWS Region. This
     * is the same identifier for both the <code>CopyDBSnapshot</code> action
     * that is called in the destination AWS Region, and the action contained in
     * the presigned URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBSnapshotIdentifier</code> - The DB snapshot identifier for
     * the encrypted snapshot to be copied. This identifier must be in the
     * Amazon Resource Name (ARN) format for the source AWS Region. For example,
     * if you are copying an encrypted DB snapshot from the us-west-2 AWS
     * Region, then your <code>SourceDBSnapshotIdentifier</code> looks like the
     * following example:
     * <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * >Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4 Signing Process</a>.
     * </p>
     * <note>
     * <p>
     * If you are using an AWS SDK tool or the AWS CLI, you can specify
     * <code>SourceRegion</code> (or <code>--source-region</code> for the AWS
     * CLI) instead of specifying <code>PreSignedUrl</code> manually. Specifying
     * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid
     * request for the operation that can be executed in the source AWS Region.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preSignedUrl <p>
     *            The URL that contains a Signature Version 4 signed request for
     *            the <code>CopyDBSnapshot</code> API action in the source AWS
     *            Region that contains the source DB snapshot to copy.
     *            </p>
     *            <p>
     *            You must specify this parameter when you copy an encrypted DB
     *            snapshot from another AWS Region by using the Amazon RDS API.
     *            Don't specify <code>PreSignedUrl</code> when you are copying
     *            an encrypted DB snapshot in the same AWS Region.
     *            </p>
     *            <p>
     *            The presigned URL must be a valid request for the
     *            <code>CopyDBSnapshot</code> API action that can be executed in
     *            the source AWS Region that contains the encrypted DB snapshot
     *            to be copied. The presigned URL request must contain the
     *            following parameter values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>DestinationRegion</code> - The AWS Region that the
     *            encrypted DB snapshot is copied to. This AWS Region is the
     *            same one where the <code>CopyDBSnapshot</code> action is
     *            called that contains this presigned URL.
     *            </p>
     *            <p>
     *            For example, if you copy an encrypted DB snapshot from the
     *            us-west-2 AWS Region to the us-east-1 AWS Region, then you
     *            call the <code>CopyDBSnapshot</code> action in the us-east-1
     *            AWS Region and provide a presigned URL that contains a call to
     *            the <code>CopyDBSnapshot</code> action in the us-west-2 AWS
     *            Region. For this example, the <code>DestinationRegion</code>
     *            in the presigned URL must be set to the us-east-1 AWS Region.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>KmsKeyId</code> - The AWS KMS key identifier for the key
     *            to use to encrypt the copy of the DB snapshot in the
     *            destination AWS Region. This is the same identifier for both
     *            the <code>CopyDBSnapshot</code> action that is called in the
     *            destination AWS Region, and the action contained in the
     *            presigned URL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SourceDBSnapshotIdentifier</code> - The DB snapshot
     *            identifier for the encrypted snapshot to be copied. This
     *            identifier must be in the Amazon Resource Name (ARN) format
     *            for the source AWS Region. For example, if you are copying an
     *            encrypted DB snapshot from the us-west-2 AWS Region, then your
     *            <code>SourceDBSnapshotIdentifier</code> looks like the
     *            following example:
     *            <code>arn:aws:rds:us-west-2:123456789012:snapshot:mysql-instance1-snapshot-20161115</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To learn how to generate a Signature Version 4 signed request,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *            >Authenticating Requests: Using Query Parameters (AWS
     *            Signature Version 4)</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *            >Signature Version 4 Signing Process</a>.
     *            </p>
     *            <note>
     *            <p>
     *            If you are using an AWS SDK tool or the AWS CLI, you can
     *            specify <code>SourceRegion</code> (or
     *            <code>--source-region</code> for the AWS CLI) instead of
     *            specifying <code>PreSignedUrl</code> manually. Specifying
     *            <code>SourceRegion</code> autogenerates a pre-signed URL that
     *            is a valid request for the operation that can be executed in
     *            the source AWS Region.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBSnapshotRequest withPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
        return this;
    }

    /**
     * <p>
     * The name of an option group to associate with the copy of the snapshot.
     * </p>
     * <p>
     * Specify this option if you are copying a snapshot from one AWS Region to
     * another, and your DB instance uses a nondefault option group. If your
     * source DB instance uses Transparent Data Encryption for Oracle or
     * Microsoft SQL Server, you must specify this option when copying across
     * AWS Regions. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopySnapshot.Options"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         The name of an option group to associate with the copy of the
     *         snapshot.
     *         </p>
     *         <p>
     *         Specify this option if you are copying a snapshot from one AWS
     *         Region to another, and your DB instance uses a nondefault option
     *         group. If your source DB instance uses Transparent Data
     *         Encryption for Oracle or Microsoft SQL Server, you must specify
     *         this option when copying across AWS Regions. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopySnapshot.Options"
     *         >Option Group Considerations</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * The name of an option group to associate with the copy of the snapshot.
     * </p>
     * <p>
     * Specify this option if you are copying a snapshot from one AWS Region to
     * another, and your DB instance uses a nondefault option group. If your
     * source DB instance uses Transparent Data Encryption for Oracle or
     * Microsoft SQL Server, you must specify this option when copying across
     * AWS Regions. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopySnapshot.Options"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param optionGroupName <p>
     *            The name of an option group to associate with the copy of the
     *            snapshot.
     *            </p>
     *            <p>
     *            Specify this option if you are copying a snapshot from one AWS
     *            Region to another, and your DB instance uses a nondefault
     *            option group. If your source DB instance uses Transparent Data
     *            Encryption for Oracle or Microsoft SQL Server, you must
     *            specify this option when copying across AWS Regions. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopySnapshot.Options"
     *            >Option Group Considerations</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of an option group to associate with the copy of the snapshot.
     * </p>
     * <p>
     * Specify this option if you are copying a snapshot from one AWS Region to
     * another, and your DB instance uses a nondefault option group. If your
     * source DB instance uses Transparent Data Encryption for Oracle or
     * Microsoft SQL Server, you must specify this option when copying across
     * AWS Regions. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopySnapshot.Options"
     * >Option Group Considerations</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            The name of an option group to associate with the copy of the
     *            snapshot.
     *            </p>
     *            <p>
     *            Specify this option if you are copying a snapshot from one AWS
     *            Region to another, and your DB instance uses a nondefault
     *            option group. If your source DB instance uses Transparent Data
     *            Encryption for Oracle or Microsoft SQL Server, you must
     *            specify this option when copying across AWS Regions. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_CopySnapshot.html#USER_CopySnapshot.Options"
     *            >Option Group Considerations</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBSnapshotRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
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
        if (getSourceDBSnapshotIdentifier() != null)
            sb.append("SourceDBSnapshotIdentifier: " + getSourceDBSnapshotIdentifier() + ",");
        if (getTargetDBSnapshotIdentifier() != null)
            sb.append("TargetDBSnapshotIdentifier: " + getTargetDBSnapshotIdentifier() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getCopyTags() != null)
            sb.append("CopyTags: " + getCopyTags() + ",");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: " + getPreSignedUrl() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSourceDBSnapshotIdentifier() == null) ? 0 : getSourceDBSnapshotIdentifier()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetDBSnapshotIdentifier() == null) ? 0 : getTargetDBSnapshotIdentifier()
                        .hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode
                + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyDBSnapshotRequest == false)
            return false;
        CopyDBSnapshotRequest other = (CopyDBSnapshotRequest) obj;

        if (other.getSourceDBSnapshotIdentifier() == null
                ^ this.getSourceDBSnapshotIdentifier() == null)
            return false;
        if (other.getSourceDBSnapshotIdentifier() != null
                && other.getSourceDBSnapshotIdentifier().equals(
                        this.getSourceDBSnapshotIdentifier()) == false)
            return false;
        if (other.getTargetDBSnapshotIdentifier() == null
                ^ this.getTargetDBSnapshotIdentifier() == null)
            return false;
        if (other.getTargetDBSnapshotIdentifier() != null
                && other.getTargetDBSnapshotIdentifier().equals(
                        this.getTargetDBSnapshotIdentifier()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null
                && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null
                && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        return true;
    }
}
