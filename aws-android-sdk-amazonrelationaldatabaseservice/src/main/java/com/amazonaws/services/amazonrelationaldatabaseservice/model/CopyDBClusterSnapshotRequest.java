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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Copies a snapshot of a DB cluster.
 * </p>
 * <p>
 * To copy a DB cluster snapshot from a shared manual DB cluster snapshot,
 * <code>SourceDBClusterSnapshotIdentifier</code> must be the Amazon Resource
 * Name (ARN) of the shared DB cluster snapshot.
 * </p>
 * <p>
 * You can copy an encrypted DB cluster snapshot from another AWS Region. In
 * that case, the AWS Region where you call the
 * <code>CopyDBClusterSnapshot</code> action is the destination AWS Region for
 * the encrypted DB cluster snapshot to be copied to. To copy an encrypted DB
 * cluster snapshot from another AWS Region, you must provide the following
 * values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>KmsKeyId</code> - The AWS Key Management System (AWS KMS) key
 * identifier for the key to use to encrypt the copy of the DB cluster snapshot
 * in the destination AWS Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>PreSignedUrl</code> - A URL that contains a Signature Version 4 signed
 * request for the <code>CopyDBClusterSnapshot</code> action to be called in the
 * source AWS Region where the DB cluster snapshot is copied from. The
 * pre-signed URL must be a valid request for the
 * <code>CopyDBClusterSnapshot</code> API action that can be executed in the
 * source AWS Region that contains the encrypted DB cluster snapshot to be
 * copied.
 * </p>
 * <p>
 * The pre-signed URL request must contain the following parameter values:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>KmsKeyId</code> - The KMS key identifier for the key to use to encrypt
 * the copy of the DB cluster snapshot in the destination AWS Region. This is
 * the same identifier for both the <code>CopyDBClusterSnapshot</code> action
 * that is called in the destination AWS Region, and the action contained in the
 * pre-signed URL.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>DestinationRegion</code> - The name of the AWS Region that the DB
 * cluster snapshot is to be created in.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot
 * identifier for the encrypted DB cluster snapshot to be copied. This
 * identifier must be in the Amazon Resource Name (ARN) format for the source
 * AWS Region. For example, if you are copying an encrypted DB cluster snapshot
 * from the us-west-2 AWS Region, then your
 * <code>SourceDBClusterSnapshotIdentifier</code> looks like the following
 * example:
 * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>
 * .
 * </p>
 * </li>
 * </ul>
 * <p>
 * To learn how to generate a Signature Version 4 signed request, see <a href=
 * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
 * > Authenticating Requests: Using Query Parameters (AWS Signature Version
 * 4)</a> and <a href=
 * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">
 * Signature Version 4 Signing Process</a>.
 * </p>
 * <note>
 * <p>
 * If you are using an AWS SDK tool or the AWS CLI, you can specify
 * <code>SourceRegion</code> (or <code>--source-region</code> for the AWS CLI)
 * instead of specifying <code>PreSignedUrl</code> manually. Specifying
 * <code>SourceRegion</code> autogenerates a pre-signed URL that is a valid
 * request for the operation that can be executed in the source AWS Region.
 * </p>
 * </note></li>
 * <li>
 * <p>
 * <code>TargetDBClusterSnapshotIdentifier</code> - The identifier for the new
 * copy of the DB cluster snapshot in the destination AWS Region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot
 * identifier for the encrypted DB cluster snapshot to be copied. This
 * identifier must be in the ARN format for the source AWS Region and is the
 * same value as the <code>SourceDBClusterSnapshotIdentifier</code> in the
 * pre-signed URL.
 * </p>
 * </li>
 * </ul>
 * <p>
 * To cancel the copy operation once it is in progress, delete the target DB
 * cluster snapshot identified by <code>TargetDBClusterSnapshotIdentifier</code>
 * while that DB cluster snapshot is in "copying" status.
 * </p>
 * <p>
 * For more information on copying encrypted DB cluster snapshots from one AWS
 * Region to another, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html"
 * > Copying a Snapshot</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * <p>
 * For more information on Amazon Aurora, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
 * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class CopyDBClusterSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the DB cluster snapshot to copy. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * You can't copy an encrypted, shared DB cluster snapshot from one AWS
     * Region to another.
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
     * <li>
     * <p>
     * If the source snapshot is in the same AWS Region as the copy, specify a
     * valid DB snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different AWS Region than the copy,
     * specify a valid DB cluster snapshot ARN. For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html#USER_CopySnapshot.AcrossRegions"
     * > Copying Snapshots Across AWS Regions</a> in the <i>Amazon Aurora User
     * Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot1</code>
     * </p>
     */
    private String sourceDBClusterSnapshotIdentifier;

    /**
     * <p>
     * The identifier of the new DB cluster snapshot to create from the source
     * DB cluster snapshot. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot2</code>
     * </p>
     */
    private String targetDBClusterSnapshotIdentifier;

    /**
     * <p>
     * The AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID
     * is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key
     * alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot from your AWS account, you
     * can specify a value for <code>KmsKeyId</code> to encrypt the copy with a
     * new KMS encryption key. If you don't specify a value for
     * <code>KmsKeyId</code>, then the copy of the DB cluster snapshot is
     * encrypted with the same KMS key as the source DB cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot that is shared from another
     * AWS account, then you must specify a value for <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted DB cluster snapshot to another AWS Region, you must
     * set <code>KmsKeyId</code> to the KMS key ID you want to use to encrypt
     * the copy of the DB cluster snapshot in the destination AWS Region. KMS
     * encryption keys are specific to the AWS Region that they are created in,
     * and you can't use encryption keys from one AWS Region in another AWS
     * Region.
     * </p>
     * <p>
     * If you copy an unencrypted DB cluster snapshot and specify a value for
     * the <code>KmsKeyId</code> parameter, an error is returned.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the
     * <code>CopyDBClusterSnapshot</code> API action in the AWS Region that
     * contains the source DB cluster snapshot to copy. The
     * <code>PreSignedUrl</code> parameter must be used when copying an
     * encrypted DB cluster snapshot from another AWS Region. Don't specify
     * <code>PreSignedUrl</code> when you are copying an encrypted DB cluster
     * snapshot in the same AWS Region.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the
     * <code>CopyDBClusterSnapshot</code> API action that can be executed in the
     * source AWS Region that contains the encrypted DB cluster snapshot to be
     * copied. The pre-signed URL request must contain the following parameter
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB cluster snapshot in the destination AWS
     * Region. This is the same identifier for both the
     * <code>CopyDBClusterSnapshot</code> action that is called in the
     * destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that the DB
     * cluster snapshot is to be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot
     * identifier for the encrypted DB cluster snapshot to be copied. This
     * identifier must be in the Amazon Resource Name (ARN) format for the
     * source AWS Region. For example, if you are copying an encrypted DB
     * cluster snapshot from the us-west-2 AWS Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks like the following
     * example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * > Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">
     * Signature Version 4 Signing Process</a>.
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
     * A value that indicates whether to copy all tags from the source DB
     * cluster snapshot to the target DB cluster snapshot. By default, tags are
     * not copied.
     * </p>
     */
    private Boolean copyTags;

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
     * The identifier of the DB cluster snapshot to copy. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * You can't copy an encrypted, shared DB cluster snapshot from one AWS
     * Region to another.
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
     * <li>
     * <p>
     * If the source snapshot is in the same AWS Region as the copy, specify a
     * valid DB snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different AWS Region than the copy,
     * specify a valid DB cluster snapshot ARN. For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html#USER_CopySnapshot.AcrossRegions"
     * > Copying Snapshots Across AWS Regions</a> in the <i>Amazon Aurora User
     * Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot1</code>
     * </p>
     *
     * @return <p>
     *         The identifier of the DB cluster snapshot to copy. This parameter
     *         isn't case-sensitive.
     *         </p>
     *         <p>
     *         You can't copy an encrypted, shared DB cluster snapshot from one
     *         AWS Region to another.
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
     *         <li>
     *         <p>
     *         If the source snapshot is in the same AWS Region as the copy,
     *         specify a valid DB snapshot identifier.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source snapshot is in a different AWS Region than the
     *         copy, specify a valid DB cluster snapshot ARN. For more
     *         information, go to <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html#USER_CopySnapshot.AcrossRegions"
     *         > Copying Snapshots Across AWS Regions</a> in the <i>Amazon
     *         Aurora User Guide.</i>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster-snapshot1</code>
     *         </p>
     */
    public String getSourceDBClusterSnapshotIdentifier() {
        return sourceDBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot to copy. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * You can't copy an encrypted, shared DB cluster snapshot from one AWS
     * Region to another.
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
     * <li>
     * <p>
     * If the source snapshot is in the same AWS Region as the copy, specify a
     * valid DB snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different AWS Region than the copy,
     * specify a valid DB cluster snapshot ARN. For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html#USER_CopySnapshot.AcrossRegions"
     * > Copying Snapshots Across AWS Regions</a> in the <i>Amazon Aurora User
     * Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot1</code>
     * </p>
     *
     * @param sourceDBClusterSnapshotIdentifier <p>
     *            The identifier of the DB cluster snapshot to copy. This
     *            parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            You can't copy an encrypted, shared DB cluster snapshot from
     *            one AWS Region to another.
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
     *            <li>
     *            <p>
     *            If the source snapshot is in the same AWS Region as the copy,
     *            specify a valid DB snapshot identifier.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source snapshot is in a different AWS Region than the
     *            copy, specify a valid DB cluster snapshot ARN. For more
     *            information, go to <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html#USER_CopySnapshot.AcrossRegions"
     *            > Copying Snapshots Across AWS Regions</a> in the <i>Amazon
     *            Aurora User Guide.</i>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster-snapshot1</code>
     *            </p>
     */
    public void setSourceDBClusterSnapshotIdentifier(String sourceDBClusterSnapshotIdentifier) {
        this.sourceDBClusterSnapshotIdentifier = sourceDBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot to copy. This parameter isn't
     * case-sensitive.
     * </p>
     * <p>
     * You can't copy an encrypted, shared DB cluster snapshot from one AWS
     * Region to another.
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
     * <li>
     * <p>
     * If the source snapshot is in the same AWS Region as the copy, specify a
     * valid DB snapshot identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source snapshot is in a different AWS Region than the copy,
     * specify a valid DB cluster snapshot ARN. For more information, go to <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html#USER_CopySnapshot.AcrossRegions"
     * > Copying Snapshots Across AWS Regions</a> in the <i>Amazon Aurora User
     * Guide.</i>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot1</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDBClusterSnapshotIdentifier <p>
     *            The identifier of the DB cluster snapshot to copy. This
     *            parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            You can't copy an encrypted, shared DB cluster snapshot from
     *            one AWS Region to another.
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
     *            <li>
     *            <p>
     *            If the source snapshot is in the same AWS Region as the copy,
     *            specify a valid DB snapshot identifier.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the source snapshot is in a different AWS Region than the
     *            copy, specify a valid DB cluster snapshot ARN. For more
     *            information, go to <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_CopySnapshot.html#USER_CopySnapshot.AcrossRegions"
     *            > Copying Snapshots Across AWS Regions</a> in the <i>Amazon
     *            Aurora User Guide.</i>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster-snapshot1</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBClusterSnapshotRequest withSourceDBClusterSnapshotIdentifier(
            String sourceDBClusterSnapshotIdentifier) {
        this.sourceDBClusterSnapshotIdentifier = sourceDBClusterSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The identifier of the new DB cluster snapshot to create from the source
     * DB cluster snapshot. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot2</code>
     * </p>
     *
     * @return <p>
     *         The identifier of the new DB cluster snapshot to create from the
     *         source DB cluster snapshot. This parameter isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 letters, numbers, or hyphens.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster-snapshot2</code>
     *         </p>
     */
    public String getTargetDBClusterSnapshotIdentifier() {
        return targetDBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the new DB cluster snapshot to create from the source
     * DB cluster snapshot. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot2</code>
     * </p>
     *
     * @param targetDBClusterSnapshotIdentifier <p>
     *            The identifier of the new DB cluster snapshot to create from
     *            the source DB cluster snapshot. This parameter isn't
     *            case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster-snapshot2</code>
     *            </p>
     */
    public void setTargetDBClusterSnapshotIdentifier(String targetDBClusterSnapshotIdentifier) {
        this.targetDBClusterSnapshotIdentifier = targetDBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the new DB cluster snapshot to create from the source
     * DB cluster snapshot. This parameter isn't case-sensitive.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 letters, numbers, or hyphens.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster-snapshot2</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetDBClusterSnapshotIdentifier <p>
     *            The identifier of the new DB cluster snapshot to create from
     *            the source DB cluster snapshot. This parameter isn't
     *            case-sensitive.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain from 1 to 63 letters, numbers, or hyphens.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            First character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster-snapshot2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBClusterSnapshotRequest withTargetDBClusterSnapshotIdentifier(
            String targetDBClusterSnapshotIdentifier) {
        this.targetDBClusterSnapshotIdentifier = targetDBClusterSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID
     * is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key
     * alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot from your AWS account, you
     * can specify a value for <code>KmsKeyId</code> to encrypt the copy with a
     * new KMS encryption key. If you don't specify a value for
     * <code>KmsKeyId</code>, then the copy of the DB cluster snapshot is
     * encrypted with the same KMS key as the source DB cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot that is shared from another
     * AWS account, then you must specify a value for <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted DB cluster snapshot to another AWS Region, you must
     * set <code>KmsKeyId</code> to the KMS key ID you want to use to encrypt
     * the copy of the DB cluster snapshot in the destination AWS Region. KMS
     * encryption keys are specific to the AWS Region that they are created in,
     * and you can't use encryption keys from one AWS Region in another AWS
     * Region.
     * </p>
     * <p>
     * If you copy an unencrypted DB cluster snapshot and specify a value for
     * the <code>KmsKeyId</code> parameter, an error is returned.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key ID for an encrypted DB cluster snapshot. The KMS
     *         key ID is the Amazon Resource Name (ARN), KMS key identifier, or
     *         the KMS key alias for the KMS encryption key.
     *         </p>
     *         <p>
     *         If you copy an encrypted DB cluster snapshot from your AWS
     *         account, you can specify a value for <code>KmsKeyId</code> to
     *         encrypt the copy with a new KMS encryption key. If you don't
     *         specify a value for <code>KmsKeyId</code>, then the copy of the
     *         DB cluster snapshot is encrypted with the same KMS key as the
     *         source DB cluster snapshot.
     *         </p>
     *         <p>
     *         If you copy an encrypted DB cluster snapshot that is shared from
     *         another AWS account, then you must specify a value for
     *         <code>KmsKeyId</code>.
     *         </p>
     *         <p>
     *         To copy an encrypted DB cluster snapshot to another AWS Region,
     *         you must set <code>KmsKeyId</code> to the KMS key ID you want to
     *         use to encrypt the copy of the DB cluster snapshot in the
     *         destination AWS Region. KMS encryption keys are specific to the
     *         AWS Region that they are created in, and you can't use encryption
     *         keys from one AWS Region in another AWS Region.
     *         </p>
     *         <p>
     *         If you copy an unencrypted DB cluster snapshot and specify a
     *         value for the <code>KmsKeyId</code> parameter, an error is
     *         returned.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID
     * is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key
     * alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot from your AWS account, you
     * can specify a value for <code>KmsKeyId</code> to encrypt the copy with a
     * new KMS encryption key. If you don't specify a value for
     * <code>KmsKeyId</code>, then the copy of the DB cluster snapshot is
     * encrypted with the same KMS key as the source DB cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot that is shared from another
     * AWS account, then you must specify a value for <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted DB cluster snapshot to another AWS Region, you must
     * set <code>KmsKeyId</code> to the KMS key ID you want to use to encrypt
     * the copy of the DB cluster snapshot in the destination AWS Region. KMS
     * encryption keys are specific to the AWS Region that they are created in,
     * and you can't use encryption keys from one AWS Region in another AWS
     * Region.
     * </p>
     * <p>
     * If you copy an unencrypted DB cluster snapshot and specify a value for
     * the <code>KmsKeyId</code> parameter, an error is returned.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key ID for an encrypted DB cluster snapshot. The
     *            KMS key ID is the Amazon Resource Name (ARN), KMS key
     *            identifier, or the KMS key alias for the KMS encryption key.
     *            </p>
     *            <p>
     *            If you copy an encrypted DB cluster snapshot from your AWS
     *            account, you can specify a value for <code>KmsKeyId</code> to
     *            encrypt the copy with a new KMS encryption key. If you don't
     *            specify a value for <code>KmsKeyId</code>, then the copy of
     *            the DB cluster snapshot is encrypted with the same KMS key as
     *            the source DB cluster snapshot.
     *            </p>
     *            <p>
     *            If you copy an encrypted DB cluster snapshot that is shared
     *            from another AWS account, then you must specify a value for
     *            <code>KmsKeyId</code>.
     *            </p>
     *            <p>
     *            To copy an encrypted DB cluster snapshot to another AWS
     *            Region, you must set <code>KmsKeyId</code> to the KMS key ID
     *            you want to use to encrypt the copy of the DB cluster snapshot
     *            in the destination AWS Region. KMS encryption keys are
     *            specific to the AWS Region that they are created in, and you
     *            can't use encryption keys from one AWS Region in another AWS
     *            Region.
     *            </p>
     *            <p>
     *            If you copy an unencrypted DB cluster snapshot and specify a
     *            value for the <code>KmsKeyId</code> parameter, an error is
     *            returned.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an encrypted DB cluster snapshot. The KMS key ID
     * is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key
     * alias for the KMS encryption key.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot from your AWS account, you
     * can specify a value for <code>KmsKeyId</code> to encrypt the copy with a
     * new KMS encryption key. If you don't specify a value for
     * <code>KmsKeyId</code>, then the copy of the DB cluster snapshot is
     * encrypted with the same KMS key as the source DB cluster snapshot.
     * </p>
     * <p>
     * If you copy an encrypted DB cluster snapshot that is shared from another
     * AWS account, then you must specify a value for <code>KmsKeyId</code>.
     * </p>
     * <p>
     * To copy an encrypted DB cluster snapshot to another AWS Region, you must
     * set <code>KmsKeyId</code> to the KMS key ID you want to use to encrypt
     * the copy of the DB cluster snapshot in the destination AWS Region. KMS
     * encryption keys are specific to the AWS Region that they are created in,
     * and you can't use encryption keys from one AWS Region in another AWS
     * Region.
     * </p>
     * <p>
     * If you copy an unencrypted DB cluster snapshot and specify a value for
     * the <code>KmsKeyId</code> parameter, an error is returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key ID for an encrypted DB cluster snapshot. The
     *            KMS key ID is the Amazon Resource Name (ARN), KMS key
     *            identifier, or the KMS key alias for the KMS encryption key.
     *            </p>
     *            <p>
     *            If you copy an encrypted DB cluster snapshot from your AWS
     *            account, you can specify a value for <code>KmsKeyId</code> to
     *            encrypt the copy with a new KMS encryption key. If you don't
     *            specify a value for <code>KmsKeyId</code>, then the copy of
     *            the DB cluster snapshot is encrypted with the same KMS key as
     *            the source DB cluster snapshot.
     *            </p>
     *            <p>
     *            If you copy an encrypted DB cluster snapshot that is shared
     *            from another AWS account, then you must specify a value for
     *            <code>KmsKeyId</code>.
     *            </p>
     *            <p>
     *            To copy an encrypted DB cluster snapshot to another AWS
     *            Region, you must set <code>KmsKeyId</code> to the KMS key ID
     *            you want to use to encrypt the copy of the DB cluster snapshot
     *            in the destination AWS Region. KMS encryption keys are
     *            specific to the AWS Region that they are created in, and you
     *            can't use encryption keys from one AWS Region in another AWS
     *            Region.
     *            </p>
     *            <p>
     *            If you copy an unencrypted DB cluster snapshot and specify a
     *            value for the <code>KmsKeyId</code> parameter, an error is
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBClusterSnapshotRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The URL that contains a Signature Version 4 signed request for the
     * <code>CopyDBClusterSnapshot</code> API action in the AWS Region that
     * contains the source DB cluster snapshot to copy. The
     * <code>PreSignedUrl</code> parameter must be used when copying an
     * encrypted DB cluster snapshot from another AWS Region. Don't specify
     * <code>PreSignedUrl</code> when you are copying an encrypted DB cluster
     * snapshot in the same AWS Region.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the
     * <code>CopyDBClusterSnapshot</code> API action that can be executed in the
     * source AWS Region that contains the encrypted DB cluster snapshot to be
     * copied. The pre-signed URL request must contain the following parameter
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB cluster snapshot in the destination AWS
     * Region. This is the same identifier for both the
     * <code>CopyDBClusterSnapshot</code> action that is called in the
     * destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that the DB
     * cluster snapshot is to be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot
     * identifier for the encrypted DB cluster snapshot to be copied. This
     * identifier must be in the Amazon Resource Name (ARN) format for the
     * source AWS Region. For example, if you are copying an encrypted DB
     * cluster snapshot from the us-west-2 AWS Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks like the following
     * example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * > Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">
     * Signature Version 4 Signing Process</a>.
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
     *         the <code>CopyDBClusterSnapshot</code> API action in the AWS
     *         Region that contains the source DB cluster snapshot to copy. The
     *         <code>PreSignedUrl</code> parameter must be used when copying an
     *         encrypted DB cluster snapshot from another AWS Region. Don't
     *         specify <code>PreSignedUrl</code> when you are copying an
     *         encrypted DB cluster snapshot in the same AWS Region.
     *         </p>
     *         <p>
     *         The pre-signed URL must be a valid request for the
     *         <code>CopyDBClusterSnapshot</code> API action that can be
     *         executed in the source AWS Region that contains the encrypted DB
     *         cluster snapshot to be copied. The pre-signed URL request must
     *         contain the following parameter values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>KmsKeyId</code> - The AWS KMS key identifier for the key to
     *         use to encrypt the copy of the DB cluster snapshot in the
     *         destination AWS Region. This is the same identifier for both the
     *         <code>CopyDBClusterSnapshot</code> action that is called in the
     *         destination AWS Region, and the action contained in the
     *         pre-signed URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DestinationRegion</code> - The name of the AWS Region that
     *         the DB cluster snapshot is to be created in.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster
     *         snapshot identifier for the encrypted DB cluster snapshot to be
     *         copied. This identifier must be in the Amazon Resource Name (ARN)
     *         format for the source AWS Region. For example, if you are copying
     *         an encrypted DB cluster snapshot from the us-west-2 AWS Region,
     *         then your <code>SourceDBClusterSnapshotIdentifier</code> looks
     *         like the following example:
     *         <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>
     *         .
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To learn how to generate a Signature Version 4 signed request,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *         > Authenticating Requests: Using Query Parameters (AWS Signature
     *         Version 4)</a> and <a href=
     *         "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *         > Signature Version 4 Signing Process</a>.
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
     * <code>CopyDBClusterSnapshot</code> API action in the AWS Region that
     * contains the source DB cluster snapshot to copy. The
     * <code>PreSignedUrl</code> parameter must be used when copying an
     * encrypted DB cluster snapshot from another AWS Region. Don't specify
     * <code>PreSignedUrl</code> when you are copying an encrypted DB cluster
     * snapshot in the same AWS Region.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the
     * <code>CopyDBClusterSnapshot</code> API action that can be executed in the
     * source AWS Region that contains the encrypted DB cluster snapshot to be
     * copied. The pre-signed URL request must contain the following parameter
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB cluster snapshot in the destination AWS
     * Region. This is the same identifier for both the
     * <code>CopyDBClusterSnapshot</code> action that is called in the
     * destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that the DB
     * cluster snapshot is to be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot
     * identifier for the encrypted DB cluster snapshot to be copied. This
     * identifier must be in the Amazon Resource Name (ARN) format for the
     * source AWS Region. For example, if you are copying an encrypted DB
     * cluster snapshot from the us-west-2 AWS Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks like the following
     * example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * > Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">
     * Signature Version 4 Signing Process</a>.
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
     *            the <code>CopyDBClusterSnapshot</code> API action in the AWS
     *            Region that contains the source DB cluster snapshot to copy.
     *            The <code>PreSignedUrl</code> parameter must be used when
     *            copying an encrypted DB cluster snapshot from another AWS
     *            Region. Don't specify <code>PreSignedUrl</code> when you are
     *            copying an encrypted DB cluster snapshot in the same AWS
     *            Region.
     *            </p>
     *            <p>
     *            The pre-signed URL must be a valid request for the
     *            <code>CopyDBClusterSnapshot</code> API action that can be
     *            executed in the source AWS Region that contains the encrypted
     *            DB cluster snapshot to be copied. The pre-signed URL request
     *            must contain the following parameter values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KmsKeyId</code> - The AWS KMS key identifier for the key
     *            to use to encrypt the copy of the DB cluster snapshot in the
     *            destination AWS Region. This is the same identifier for both
     *            the <code>CopyDBClusterSnapshot</code> action that is called
     *            in the destination AWS Region, and the action contained in the
     *            pre-signed URL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DestinationRegion</code> - The name of the AWS Region
     *            that the DB cluster snapshot is to be created in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SourceDBClusterSnapshotIdentifier</code> - The DB
     *            cluster snapshot identifier for the encrypted DB cluster
     *            snapshot to be copied. This identifier must be in the Amazon
     *            Resource Name (ARN) format for the source AWS Region. For
     *            example, if you are copying an encrypted DB cluster snapshot
     *            from the us-west-2 AWS Region, then your
     *            <code>SourceDBClusterSnapshotIdentifier</code> looks like the
     *            following example:
     *            <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To learn how to generate a Signature Version 4 signed request,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *            > Authenticating Requests: Using Query Parameters (AWS
     *            Signature Version 4)</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *            > Signature Version 4 Signing Process</a>.
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
     * <code>CopyDBClusterSnapshot</code> API action in the AWS Region that
     * contains the source DB cluster snapshot to copy. The
     * <code>PreSignedUrl</code> parameter must be used when copying an
     * encrypted DB cluster snapshot from another AWS Region. Don't specify
     * <code>PreSignedUrl</code> when you are copying an encrypted DB cluster
     * snapshot in the same AWS Region.
     * </p>
     * <p>
     * The pre-signed URL must be a valid request for the
     * <code>CopyDBClusterSnapshot</code> API action that can be executed in the
     * source AWS Region that contains the encrypted DB cluster snapshot to be
     * copied. The pre-signed URL request must contain the following parameter
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>KmsKeyId</code> - The AWS KMS key identifier for the key to use to
     * encrypt the copy of the DB cluster snapshot in the destination AWS
     * Region. This is the same identifier for both the
     * <code>CopyDBClusterSnapshot</code> action that is called in the
     * destination AWS Region, and the action contained in the pre-signed URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DestinationRegion</code> - The name of the AWS Region that the DB
     * cluster snapshot is to be created in.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SourceDBClusterSnapshotIdentifier</code> - The DB cluster snapshot
     * identifier for the encrypted DB cluster snapshot to be copied. This
     * identifier must be in the Amazon Resource Name (ARN) format for the
     * source AWS Region. For example, if you are copying an encrypted DB
     * cluster snapshot from the us-west-2 AWS Region, then your
     * <code>SourceDBClusterSnapshotIdentifier</code> looks like the following
     * example:
     * <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>
     * .
     * </p>
     * </li>
     * </ul>
     * <p>
     * To learn how to generate a Signature Version 4 signed request, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     * > Authenticating Requests: Using Query Parameters (AWS Signature Version
     * 4)</a> and <a href=
     * "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html">
     * Signature Version 4 Signing Process</a>.
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
     *            the <code>CopyDBClusterSnapshot</code> API action in the AWS
     *            Region that contains the source DB cluster snapshot to copy.
     *            The <code>PreSignedUrl</code> parameter must be used when
     *            copying an encrypted DB cluster snapshot from another AWS
     *            Region. Don't specify <code>PreSignedUrl</code> when you are
     *            copying an encrypted DB cluster snapshot in the same AWS
     *            Region.
     *            </p>
     *            <p>
     *            The pre-signed URL must be a valid request for the
     *            <code>CopyDBClusterSnapshot</code> API action that can be
     *            executed in the source AWS Region that contains the encrypted
     *            DB cluster snapshot to be copied. The pre-signed URL request
     *            must contain the following parameter values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>KmsKeyId</code> - The AWS KMS key identifier for the key
     *            to use to encrypt the copy of the DB cluster snapshot in the
     *            destination AWS Region. This is the same identifier for both
     *            the <code>CopyDBClusterSnapshot</code> action that is called
     *            in the destination AWS Region, and the action contained in the
     *            pre-signed URL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>DestinationRegion</code> - The name of the AWS Region
     *            that the DB cluster snapshot is to be created in.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SourceDBClusterSnapshotIdentifier</code> - The DB
     *            cluster snapshot identifier for the encrypted DB cluster
     *            snapshot to be copied. This identifier must be in the Amazon
     *            Resource Name (ARN) format for the source AWS Region. For
     *            example, if you are copying an encrypted DB cluster snapshot
     *            from the us-west-2 AWS Region, then your
     *            <code>SourceDBClusterSnapshotIdentifier</code> looks like the
     *            following example:
     *            <code>arn:aws:rds:us-west-2:123456789012:cluster-snapshot:aurora-cluster1-snapshot-20161115</code>
     *            .
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            To learn how to generate a Signature Version 4 signed request,
     *            see <a href=
     *            "https://docs.aws.amazon.com/AmazonS3/latest/API/sigv4-query-string-auth.html"
     *            > Authenticating Requests: Using Query Parameters (AWS
     *            Signature Version 4)</a> and <a href=
     *            "https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     *            > Signature Version 4 Signing Process</a>.
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
    public CopyDBClusterSnapshotRequest withPreSignedUrl(String preSignedUrl) {
        this.preSignedUrl = preSignedUrl;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the source DB
     * cluster snapshot to the target DB cluster snapshot. By default, tags are
     * not copied.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the source
     *         DB cluster snapshot to the target DB cluster snapshot. By
     *         default, tags are not copied.
     *         </p>
     */
    public Boolean isCopyTags() {
        return copyTags;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the source DB
     * cluster snapshot to the target DB cluster snapshot. By default, tags are
     * not copied.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy all tags from the source
     *         DB cluster snapshot to the target DB cluster snapshot. By
     *         default, tags are not copied.
     *         </p>
     */
    public Boolean getCopyTags() {
        return copyTags;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the source DB
     * cluster snapshot to the target DB cluster snapshot. By default, tags are
     * not copied.
     * </p>
     *
     * @param copyTags <p>
     *            A value that indicates whether to copy all tags from the
     *            source DB cluster snapshot to the target DB cluster snapshot.
     *            By default, tags are not copied.
     *            </p>
     */
    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    /**
     * <p>
     * A value that indicates whether to copy all tags from the source DB
     * cluster snapshot to the target DB cluster snapshot. By default, tags are
     * not copied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTags <p>
     *            A value that indicates whether to copy all tags from the
     *            source DB cluster snapshot to the target DB cluster snapshot.
     *            By default, tags are not copied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopyDBClusterSnapshotRequest withCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
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
    public CopyDBClusterSnapshotRequest withTags(Tag... tags) {
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
    public CopyDBClusterSnapshotRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSourceDBClusterSnapshotIdentifier() != null)
            sb.append("SourceDBClusterSnapshotIdentifier: "
                    + getSourceDBClusterSnapshotIdentifier() + ",");
        if (getTargetDBClusterSnapshotIdentifier() != null)
            sb.append("TargetDBClusterSnapshotIdentifier: "
                    + getTargetDBClusterSnapshotIdentifier() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getPreSignedUrl() != null)
            sb.append("PreSignedUrl: " + getPreSignedUrl() + ",");
        if (getCopyTags() != null)
            sb.append("CopyTags: " + getCopyTags() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSourceDBClusterSnapshotIdentifier() == null) ? 0
                        : getSourceDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetDBClusterSnapshotIdentifier() == null) ? 0
                        : getTargetDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getPreSignedUrl() == null) ? 0 : getPreSignedUrl().hashCode());
        hashCode = prime * hashCode + ((getCopyTags() == null) ? 0 : getCopyTags().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyDBClusterSnapshotRequest == false)
            return false;
        CopyDBClusterSnapshotRequest other = (CopyDBClusterSnapshotRequest) obj;

        if (other.getSourceDBClusterSnapshotIdentifier() == null
                ^ this.getSourceDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getSourceDBClusterSnapshotIdentifier() != null
                && other.getSourceDBClusterSnapshotIdentifier().equals(
                        this.getSourceDBClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getTargetDBClusterSnapshotIdentifier() == null
                ^ this.getTargetDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getTargetDBClusterSnapshotIdentifier() != null
                && other.getTargetDBClusterSnapshotIdentifier().equals(
                        this.getTargetDBClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getPreSignedUrl() == null ^ this.getPreSignedUrl() == null)
            return false;
        if (other.getPreSignedUrl() != null
                && other.getPreSignedUrl().equals(this.getPreSignedUrl()) == false)
            return false;
        if (other.getCopyTags() == null ^ this.getCopyTags() == null)
            return false;
        if (other.getCopyTags() != null && other.getCopyTags().equals(this.getCopyTags()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
