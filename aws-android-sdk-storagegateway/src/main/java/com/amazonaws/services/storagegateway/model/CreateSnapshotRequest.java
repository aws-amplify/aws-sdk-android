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
 * Initiates a snapshot of a volume.
 * </p>
 * <p>
 * AWS Storage Gateway provides the ability to back up point-in-time snapshots
 * of your data to Amazon Simple Storage (Amazon S3) for durable off-site
 * recovery, as well as import the data to an Amazon Elastic Block Store (EBS)
 * volume in Amazon Elastic Compute Cloud (EC2). You can take snapshots of your
 * gateway volume on a scheduled or ad hoc basis. This API enables you to take
 * ad-hoc snapshot. For more information, see <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/managing-volumes.html#SchedulingSnapshot"
 * >Editing a snapshot schedule</a>.
 * </p>
 * <p>
 * In the CreateSnapshot request you identify the volume by providing its Amazon
 * Resource Name (ARN). You must also provide description for the snapshot. When
 * AWS Storage Gateway takes the snapshot of specified volume, the snapshot and
 * description appears in the AWS Storage Gateway Console. In response, AWS
 * Storage Gateway returns you a snapshot ID. You can use this snapshot ID to
 * check the snapshot progress or later use it when you want to create a volume
 * from a snapshot. This operation is only supported in stored and cached volume
 * gateway type.
 * </p>
 * <note>
 * <p>
 * To list or delete a snapshot, you must use the Amazon EC2 API. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeSnapshots.html"
 * >DescribeSnapshots</a> or <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DeleteSnapshot.html"
 * >DeleteSnapshot</a> in the <i>Amazon Elastic Compute Cloud API Reference</i>.
 * </p>
 * </note> <important>
 * <p>
 * Volume and snapshot IDs are changing to a longer length ID format. For more
 * information, see the important note on the <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/APIReference/Welcome.html"
 * >Welcome</a> page.
 * </p>
 * </important>
 */
public class CreateSnapshotRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a>
     * operation to return a list of gateway volumes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String volumeARN;

    /**
     * <p>
     * Textual description of the snapshot that appears in the Amazon EC2
     * console, Elastic Block Store snapshots panel in the <b>Description</b>
     * field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     * <b>Description</b> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     */
    private String snapshotDescription;

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a
     * key-value pair.
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
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a>
     * operation to return a list of gateway volumes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the volume. Use the
     *         <a>ListVolumes</a> operation to return a list of gateway volumes.
     *         </p>
     */
    public String getVolumeARN() {
        return volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a>
     * operation to return a list of gateway volumes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the volume. Use the
     *            <a>ListVolumes</a> operation to return a list of gateway
     *            volumes.
     *            </p>
     */
    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume. Use the <a>ListVolumes</a>
     * operation to return a list of gateway volumes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param volumeARN <p>
     *            The Amazon Resource Name (ARN) of the volume. Use the
     *            <a>ListVolumes</a> operation to return a list of gateway
     *            volumes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotRequest withVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
        return this;
    }

    /**
     * <p>
     * Textual description of the snapshot that appears in the Amazon EC2
     * console, Elastic Block Store snapshots panel in the <b>Description</b>
     * field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     * <b>Description</b> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @return <p>
     *         Textual description of the snapshot that appears in the Amazon
     *         EC2 console, Elastic Block Store snapshots panel in the
     *         <b>Description</b> field, and in the AWS Storage Gateway snapshot
     *         <b>Details</b> pane, <b>Description</b> field.
     *         </p>
     */
    public String getSnapshotDescription() {
        return snapshotDescription;
    }

    /**
     * <p>
     * Textual description of the snapshot that appears in the Amazon EC2
     * console, Elastic Block Store snapshots panel in the <b>Description</b>
     * field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     * <b>Description</b> field.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param snapshotDescription <p>
     *            Textual description of the snapshot that appears in the Amazon
     *            EC2 console, Elastic Block Store snapshots panel in the
     *            <b>Description</b> field, and in the AWS Storage Gateway
     *            snapshot <b>Details</b> pane, <b>Description</b> field.
     *            </p>
     */
    public void setSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
    }

    /**
     * <p>
     * Textual description of the snapshot that appears in the Amazon EC2
     * console, Elastic Block Store snapshots panel in the <b>Description</b>
     * field, and in the AWS Storage Gateway snapshot <b>Details</b> pane,
     * <b>Description</b> field.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     *
     * @param snapshotDescription <p>
     *            Textual description of the snapshot that appears in the Amazon
     *            EC2 console, Elastic Block Store snapshots panel in the
     *            <b>Description</b> field, and in the AWS Storage Gateway
     *            snapshot <b>Details</b> pane, <b>Description</b> field.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSnapshotRequest withSnapshotDescription(String snapshotDescription) {
        this.snapshotDescription = snapshotDescription;
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a
     * key-value pair.
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
     *         A list of up to 50 tags that can be assigned to a snapshot. Each
     *         tag is a key-value pair.
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
     * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a
     * key-value pair.
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
     *            A list of up to 50 tags that can be assigned to a snapshot.
     *            Each tag is a key-value pair.
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
     * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a
     * key-value pair.
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
     *            A list of up to 50 tags that can be assigned to a snapshot.
     *            Each tag is a key-value pair.
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
    public CreateSnapshotRequest withTags(Tag... tags) {
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
     * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a
     * key-value pair.
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
     *            A list of up to 50 tags that can be assigned to a snapshot.
     *            Each tag is a key-value pair.
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
    public CreateSnapshotRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: " + getVolumeARN() + ",");
        if (getSnapshotDescription() != null)
            sb.append("SnapshotDescription: " + getSnapshotDescription() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotDescription() == null) ? 0 : getSnapshotDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotRequest == false)
            return false;
        CreateSnapshotRequest other = (CreateSnapshotRequest) obj;

        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null
                && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getSnapshotDescription() == null ^ this.getSnapshotDescription() == null)
            return false;
        if (other.getSnapshotDescription() != null
                && other.getSnapshotDescription().equals(this.getSnapshotDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
