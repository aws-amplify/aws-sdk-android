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

package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Makes a copy of an existing snapshot.
 * </p>
 * <note>
 * <p>
 * This operation is valid for Redis only.
 * </p>
 * </note> <important>
 * <p>
 * Users or groups that have permissions to use the <code>CopySnapshot</code>
 * operation can create their own Amazon S3 buckets and copy snapshots to it. To
 * control access to your snapshots, use an IAM policy to control who has the
 * ability to use the <code>CopySnapshot</code> operation. For more information
 * about using IAM to control the use of ElastiCache operations, see <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html"
 * >Exporting Snapshots</a> and <a
 * href="https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/IAM.html"
 * >Authentication &amp; Access Control</a>.
 * </p>
 * </important>
 * <p>
 * You could receive the following error messages.
 * </p>
 * <p class="title">
 * <b>Error Messages</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Error Message:</b> The S3 bucket %s is outside of the region.
 * </p>
 * <p>
 * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your
 * snapshot. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
 * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Error Message:</b> The S3 bucket %s does not exist.
 * </p>
 * <p>
 * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your
 * snapshot. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
 * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Error Message:</b> The S3 bucket %s is not owned by the authenticated
 * user.
 * </p>
 * <p>
 * <b>Solution:</b> Create an Amazon S3 bucket in the same region as your
 * snapshot. For more information, see <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-create-s3-bucket"
 * >Step 1: Create an Amazon S3 Bucket</a> in the ElastiCache User Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Error Message:</b> The authenticated user does not have sufficient
 * permissions to perform the desired activity.
 * </p>
 * <p>
 * <b>Solution:</b> Contact your system administrator to get the needed
 * permissions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Error Message:</b> The S3 bucket %s already contains an object with key
 * %s.
 * </p>
 * <p>
 * <b>Solution:</b> Give the <code>TargetSnapshotName</code> a new and unique
 * value. If exporting a snapshot, you could alternatively create a new Amazon
 * S3 bucket and use this same value for <code>TargetSnapshotName</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Error Message: </b> ElastiCache has not been granted READ permissions %s
 * on the S3 Bucket.
 * </p>
 * <p>
 * <b>Solution:</b> Add List and Read permissions on the bucket. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
 * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
 * ElastiCache User Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Error Message: </b> ElastiCache has not been granted WRITE permissions %s
 * on the S3 Bucket.
 * </p>
 * <p>
 * <b>Solution:</b> Add Upload/Delete permissions on the bucket. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
 * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
 * ElastiCache User Guide.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Error Message: </b> ElastiCache has not been granted READ_ACP permissions
 * %s on the S3 Bucket.
 * </p>
 * <p>
 * <b>Solution:</b> Add View Permissions on the bucket. For more information,
 * see <a href=
 * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
 * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
 * ElastiCache User Guide.
 * </p>
 * </li>
 * </ul>
 */
public class CopySnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of an existing snapshot from which to make a copy.
     * </p>
     */
    private String sourceSnapshotName;

    /**
     * <p>
     * A name for the snapshot copy. ElastiCache does not permit overwriting a
     * snapshot, therefore this name must be unique within its context -
     * ElastiCache or an Amazon S3 bucket if exporting.
     * </p>
     */
    private String targetSnapshotName;

    /**
     * <p>
     * The Amazon S3 bucket to which the snapshot is exported. This parameter is
     * used only when exporting a snapshot for external access.
     * </p>
     * <p>
     * When using this parameter to export a snapshot, be sure Amazon
     * ElastiCache has the needed permissions to this S3 bucket. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
     * <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html"
     * >Exporting a Snapshot</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     */
    private String targetBucket;

    /**
     * <p>
     * The ID of the KMS key used to encrypt the target snapshot.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The name of an existing snapshot from which to make a copy.
     * </p>
     *
     * @return <p>
     *         The name of an existing snapshot from which to make a copy.
     *         </p>
     */
    public String getSourceSnapshotName() {
        return sourceSnapshotName;
    }

    /**
     * <p>
     * The name of an existing snapshot from which to make a copy.
     * </p>
     *
     * @param sourceSnapshotName <p>
     *            The name of an existing snapshot from which to make a copy.
     *            </p>
     */
    public void setSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
    }

    /**
     * <p>
     * The name of an existing snapshot from which to make a copy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceSnapshotName <p>
     *            The name of an existing snapshot from which to make a copy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withSourceSnapshotName(String sourceSnapshotName) {
        this.sourceSnapshotName = sourceSnapshotName;
        return this;
    }

    /**
     * <p>
     * A name for the snapshot copy. ElastiCache does not permit overwriting a
     * snapshot, therefore this name must be unique within its context -
     * ElastiCache or an Amazon S3 bucket if exporting.
     * </p>
     *
     * @return <p>
     *         A name for the snapshot copy. ElastiCache does not permit
     *         overwriting a snapshot, therefore this name must be unique within
     *         its context - ElastiCache or an Amazon S3 bucket if exporting.
     *         </p>
     */
    public String getTargetSnapshotName() {
        return targetSnapshotName;
    }

    /**
     * <p>
     * A name for the snapshot copy. ElastiCache does not permit overwriting a
     * snapshot, therefore this name must be unique within its context -
     * ElastiCache or an Amazon S3 bucket if exporting.
     * </p>
     *
     * @param targetSnapshotName <p>
     *            A name for the snapshot copy. ElastiCache does not permit
     *            overwriting a snapshot, therefore this name must be unique
     *            within its context - ElastiCache or an Amazon S3 bucket if
     *            exporting.
     *            </p>
     */
    public void setTargetSnapshotName(String targetSnapshotName) {
        this.targetSnapshotName = targetSnapshotName;
    }

    /**
     * <p>
     * A name for the snapshot copy. ElastiCache does not permit overwriting a
     * snapshot, therefore this name must be unique within its context -
     * ElastiCache or an Amazon S3 bucket if exporting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetSnapshotName <p>
     *            A name for the snapshot copy. ElastiCache does not permit
     *            overwriting a snapshot, therefore this name must be unique
     *            within its context - ElastiCache or an Amazon S3 bucket if
     *            exporting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withTargetSnapshotName(String targetSnapshotName) {
        this.targetSnapshotName = targetSnapshotName;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket to which the snapshot is exported. This parameter is
     * used only when exporting a snapshot for external access.
     * </p>
     * <p>
     * When using this parameter to export a snapshot, be sure Amazon
     * ElastiCache has the needed permissions to this S3 bucket. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
     * <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html"
     * >Exporting a Snapshot</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket to which the snapshot is exported. This
     *         parameter is used only when exporting a snapshot for external
     *         access.
     *         </p>
     *         <p>
     *         When using this parameter to export a snapshot, be sure Amazon
     *         ElastiCache has the needed permissions to this S3 bucket. For
     *         more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     *         >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in
     *         the <i>Amazon ElastiCache User Guide</i>.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html"
     *         >Exporting a Snapshot</a> in the <i>Amazon ElastiCache User
     *         Guide</i>.
     *         </p>
     */
    public String getTargetBucket() {
        return targetBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to which the snapshot is exported. This parameter is
     * used only when exporting a snapshot for external access.
     * </p>
     * <p>
     * When using this parameter to export a snapshot, be sure Amazon
     * ElastiCache has the needed permissions to this S3 bucket. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
     * <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html"
     * >Exporting a Snapshot</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     *
     * @param targetBucket <p>
     *            The Amazon S3 bucket to which the snapshot is exported. This
     *            parameter is used only when exporting a snapshot for external
     *            access.
     *            </p>
     *            <p>
     *            When using this parameter to export a snapshot, be sure Amazon
     *            ElastiCache has the needed permissions to this S3 bucket. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     *            >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a>
     *            in the <i>Amazon ElastiCache User Guide</i>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html"
     *            >Exporting a Snapshot</a> in the <i>Amazon ElastiCache User
     *            Guide</i>.
     *            </p>
     */
    public void setTargetBucket(String targetBucket) {
        this.targetBucket = targetBucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket to which the snapshot is exported. This parameter is
     * used only when exporting a snapshot for external access.
     * </p>
     * <p>
     * When using this parameter to export a snapshot, be sure Amazon
     * ElastiCache has the needed permissions to this S3 bucket. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     * >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a> in the
     * <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html"
     * >Exporting a Snapshot</a> in the <i>Amazon ElastiCache User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param targetBucket <p>
     *            The Amazon S3 bucket to which the snapshot is exported. This
     *            parameter is used only when exporting a snapshot for external
     *            access.
     *            </p>
     *            <p>
     *            When using this parameter to export a snapshot, be sure Amazon
     *            ElastiCache has the needed permissions to this S3 bucket. For
     *            more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/backups-exporting.html#backups-exporting-grant-access"
     *            >Step 2: Grant ElastiCache Access to Your Amazon S3 Bucket</a>
     *            in the <i>Amazon ElastiCache User Guide</i>.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonElastiCache/latest/red-ug/Snapshots.Exporting.html"
     *            >Exporting a Snapshot</a> in the <i>Amazon ElastiCache User
     *            Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withTargetBucket(String targetBucket) {
        this.targetBucket = targetBucket;
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the target snapshot.
     * </p>
     *
     * @return <p>
     *         The ID of the KMS key used to encrypt the target snapshot.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the target snapshot.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The ID of the KMS key used to encrypt the target snapshot.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key used to encrypt the target snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The ID of the KMS key used to encrypt the target snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CopySnapshotRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
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
        if (getSourceSnapshotName() != null)
            sb.append("SourceSnapshotName: " + getSourceSnapshotName() + ",");
        if (getTargetSnapshotName() != null)
            sb.append("TargetSnapshotName: " + getTargetSnapshotName() + ",");
        if (getTargetBucket() != null)
            sb.append("TargetBucket: " + getTargetBucket() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceSnapshotName() == null) ? 0 : getSourceSnapshotName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetSnapshotName() == null) ? 0 : getTargetSnapshotName().hashCode());
        hashCode = prime * hashCode
                + ((getTargetBucket() == null) ? 0 : getTargetBucket().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopySnapshotRequest == false)
            return false;
        CopySnapshotRequest other = (CopySnapshotRequest) obj;

        if (other.getSourceSnapshotName() == null ^ this.getSourceSnapshotName() == null)
            return false;
        if (other.getSourceSnapshotName() != null
                && other.getSourceSnapshotName().equals(this.getSourceSnapshotName()) == false)
            return false;
        if (other.getTargetSnapshotName() == null ^ this.getTargetSnapshotName() == null)
            return false;
        if (other.getTargetSnapshotName() != null
                && other.getTargetSnapshotName().equals(this.getTargetSnapshotName()) == false)
            return false;
        if (other.getTargetBucket() == null ^ this.getTargetBucket() == null)
            return false;
        if (other.getTargetBucket() != null
                && other.getTargetBucket().equals(this.getTargetBucket()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }
}
