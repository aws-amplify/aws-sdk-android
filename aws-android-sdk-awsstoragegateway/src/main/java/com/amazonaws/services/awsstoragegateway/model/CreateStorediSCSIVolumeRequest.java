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
 * Creates a volume on a specified gateway. This operation is only supported in
 * the stored volume gateway type.
 * </p>
 * <p>
 * The size of the volume to create is inferred from the disk size. You can
 * choose to preserve existing data on the disk, create volume from an existing
 * snapshot, or create an empty volume. If you choose to create an empty gateway
 * volume, then any existing data on the disk is erased.
 * </p>
 * <p>
 * In the request you must specify the gateway and the disk information on which
 * you are creating the volume. In response, the gateway creates the volume and
 * returns volume information such as the volume Amazon Resource Name (ARN), its
 * size, and the iSCSI target ARN that initiators can use to connect to the
 * volume target.
 * </p>
 */
public class CreateStorediSCSIVolumeRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The unique identifier for the gateway local disk that is configured as a
     * stored volume. Use <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     * >ListLocalDisks</a> to list disk IDs for a gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String diskId;

    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the
     * new stored volume. Specify this field if you want to create the iSCSI
     * storage volume from a snapshot otherwise do not include this field. To
     * list snapshots for your account use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     */
    private String snapshotId;

    /**
     * <p>
     * Specify this field as true if you want to preserve the data on the local
     * disk. Otherwise, specifying this field as false creates an empty volume.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     */
    private Boolean preserveExistingData;

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume
     * and used as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was
     * previously used for this volume as the new target name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     */
    private String targetName;

    /**
     * <p>
     * The network interface of the gateway on which to expose the iSCSI target.
     * Only IPv4 addresses are accepted. Use <a>DescribeGatewayInformation</a>
     * to get a list of the network interfaces available on a gateway.
     * </p>
     * <p>
     * Valid Values: A valid IP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]
     * ?\d?\d)){3}\z<br/>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * True to use Amazon S3 server-side encryption with your own AWS KMS key,
     * or false to use a key managed by Amazon S3. Optional.
     * </p>
     */
    private Boolean kMSEncrypted;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used for Amazon S3
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
     * A list of up to 50 tags that can be assigned to a stored volume. Each tag
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
    public CreateStorediSCSIVolumeRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The unique identifier for the gateway local disk that is configured as a
     * stored volume. Use <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     * >ListLocalDisks</a> to list disk IDs for a gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The unique identifier for the gateway local disk that is
     *         configured as a stored volume. Use <a href=
     *         "https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     *         >ListLocalDisks</a> to list disk IDs for a gateway.
     *         </p>
     */
    public String getDiskId() {
        return diskId;
    }

    /**
     * <p>
     * The unique identifier for the gateway local disk that is configured as a
     * stored volume. Use <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     * >ListLocalDisks</a> to list disk IDs for a gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param diskId <p>
     *            The unique identifier for the gateway local disk that is
     *            configured as a stored volume. Use <a href=
     *            "https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     *            >ListLocalDisks</a> to list disk IDs for a gateway.
     *            </p>
     */
    public void setDiskId(String diskId) {
        this.diskId = diskId;
    }

    /**
     * <p>
     * The unique identifier for the gateway local disk that is configured as a
     * stored volume. Use <a href=
     * "https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     * >ListLocalDisks</a> to list disk IDs for a gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param diskId <p>
     *            The unique identifier for the gateway local disk that is
     *            configured as a stored volume. Use <a href=
     *            "https://docs.aws.amazon.com/storagegateway/latest/userguide/API_ListLocalDisks.html"
     *            >ListLocalDisks</a> to list disk IDs for a gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStorediSCSIVolumeRequest withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the
     * new stored volume. Specify this field if you want to create the iSCSI
     * storage volume from a snapshot otherwise do not include this field. To
     * list snapshots for your account use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @return <p>
     *         The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore
     *         as the new stored volume. Specify this field if you want to
     *         create the iSCSI storage volume from a snapshot otherwise do not
     *         include this field. To list snapshots for your account use <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     *         >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     *         Reference</i>.
     *         </p>
     */
    public String getSnapshotId() {
        return snapshotId;
    }

    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the
     * new stored volume. Specify this field if you want to create the iSCSI
     * storage volume from a snapshot otherwise do not include this field. To
     * list snapshots for your account use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @param snapshotId <p>
     *            The snapshot ID (e.g. "snap-1122aabb") of the snapshot to
     *            restore as the new stored volume. Specify this field if you
     *            want to create the iSCSI storage volume from a snapshot
     *            otherwise do not include this field. To list snapshots for
     *            your account use <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     *            >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud
     *            API Reference</i>.
     *            </p>
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the
     * new stored volume. Specify this field if you want to create the iSCSI
     * storage volume from a snapshot otherwise do not include this field. To
     * list snapshots for your account use <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     * >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud API
     * Reference</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\Asnap-([0-9A-Fa-f]{8}|[0-9A-Fa-f]{17})\z<br/>
     *
     * @param snapshotId <p>
     *            The snapshot ID (e.g. "snap-1122aabb") of the snapshot to
     *            restore as the new stored volume. Specify this field if you
     *            want to create the iSCSI storage volume from a snapshot
     *            otherwise do not include this field. To list snapshots for
     *            your account use <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     *            >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud
     *            API Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStorediSCSIVolumeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * <p>
     * Specify this field as true if you want to preserve the data on the local
     * disk. Otherwise, specifying this field as false creates an empty volume.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     *
     * @return <p>
     *         Specify this field as true if you want to preserve the data on
     *         the local disk. Otherwise, specifying this field as false creates
     *         an empty volume.
     *         </p>
     *         <p>
     *         Valid Values: true, false
     *         </p>
     */
    public Boolean isPreserveExistingData() {
        return preserveExistingData;
    }

    /**
     * <p>
     * Specify this field as true if you want to preserve the data on the local
     * disk. Otherwise, specifying this field as false creates an empty volume.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     *
     * @return <p>
     *         Specify this field as true if you want to preserve the data on
     *         the local disk. Otherwise, specifying this field as false creates
     *         an empty volume.
     *         </p>
     *         <p>
     *         Valid Values: true, false
     *         </p>
     */
    public Boolean getPreserveExistingData() {
        return preserveExistingData;
    }

    /**
     * <p>
     * Specify this field as true if you want to preserve the data on the local
     * disk. Otherwise, specifying this field as false creates an empty volume.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     *
     * @param preserveExistingData <p>
     *            Specify this field as true if you want to preserve the data on
     *            the local disk. Otherwise, specifying this field as false
     *            creates an empty volume.
     *            </p>
     *            <p>
     *            Valid Values: true, false
     *            </p>
     */
    public void setPreserveExistingData(Boolean preserveExistingData) {
        this.preserveExistingData = preserveExistingData;
    }

    /**
     * <p>
     * Specify this field as true if you want to preserve the data on the local
     * disk. Otherwise, specifying this field as false creates an empty volume.
     * </p>
     * <p>
     * Valid Values: true, false
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param preserveExistingData <p>
     *            Specify this field as true if you want to preserve the data on
     *            the local disk. Otherwise, specifying this field as false
     *            creates an empty volume.
     *            </p>
     *            <p>
     *            Valid Values: true, false
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStorediSCSIVolumeRequest withPreserveExistingData(Boolean preserveExistingData) {
        this.preserveExistingData = preserveExistingData;
        return this;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume
     * and used as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was
     * previously used for this volume as the new target name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @return <p>
     *         The name of the iSCSI target used by an initiator to connect to a
     *         volume and used as a suffix for the target ARN. For example,
     *         specifying <code>TargetName</code> as <i>myvolume</i> results in
     *         the target ARN of
     *         <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *         . The target name must be unique across all volumes on a gateway.
     *         </p>
     *         <p>
     *         If you don't specify a value, Storage Gateway uses the value that
     *         was previously used for this volume as the new target name.
     *         </p>
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume
     * and used as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was
     * previously used for this volume as the new target name.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @param targetName <p>
     *            The name of the iSCSI target used by an initiator to connect
     *            to a volume and used as a suffix for the target ARN. For
     *            example, specifying <code>TargetName</code> as <i>myvolume</i>
     *            results in the target ARN of
     *            <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *            . The target name must be unique across all volumes on a
     *            gateway.
     *            </p>
     *            <p>
     *            If you don't specify a value, Storage Gateway uses the value
     *            that was previously used for this volume as the new target
     *            name.
     *            </p>
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * <p>
     * The name of the iSCSI target used by an initiator to connect to a volume
     * and used as a suffix for the target ARN. For example, specifying
     * <code>TargetName</code> as <i>myvolume</i> results in the target ARN of
     * <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     * . The target name must be unique across all volumes on a gateway.
     * </p>
     * <p>
     * If you don't specify a value, Storage Gateway uses the value that was
     * previously used for this volume as the new target name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 200<br/>
     * <b>Pattern: </b>^[-\.;a-z0-9]+$<br/>
     *
     * @param targetName <p>
     *            The name of the iSCSI target used by an initiator to connect
     *            to a volume and used as a suffix for the target ARN. For
     *            example, specifying <code>TargetName</code> as <i>myvolume</i>
     *            results in the target ARN of
     *            <code>arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume</code>
     *            . The target name must be unique across all volumes on a
     *            gateway.
     *            </p>
     *            <p>
     *            If you don't specify a value, Storage Gateway uses the value
     *            that was previously used for this volume as the new target
     *            name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStorediSCSIVolumeRequest withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * <p>
     * The network interface of the gateway on which to expose the iSCSI target.
     * Only IPv4 addresses are accepted. Use <a>DescribeGatewayInformation</a>
     * to get a list of the network interfaces available on a gateway.
     * </p>
     * <p>
     * Valid Values: A valid IP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]
     * ?\d?\d)){3}\z<br/>
     *
     * @return <p>
     *         The network interface of the gateway on which to expose the iSCSI
     *         target. Only IPv4 addresses are accepted. Use
     *         <a>DescribeGatewayInformation</a> to get a list of the network
     *         interfaces available on a gateway.
     *         </p>
     *         <p>
     *         Valid Values: A valid IP address.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The network interface of the gateway on which to expose the iSCSI target.
     * Only IPv4 addresses are accepted. Use <a>DescribeGatewayInformation</a>
     * to get a list of the network interfaces available on a gateway.
     * </p>
     * <p>
     * Valid Values: A valid IP address.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]
     * ?\d?\d)){3}\z<br/>
     *
     * @param networkInterfaceId <p>
     *            The network interface of the gateway on which to expose the
     *            iSCSI target. Only IPv4 addresses are accepted. Use
     *            <a>DescribeGatewayInformation</a> to get a list of the network
     *            interfaces available on a gateway.
     *            </p>
     *            <p>
     *            Valid Values: A valid IP address.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The network interface of the gateway on which to expose the iSCSI target.
     * Only IPv4 addresses are accepted. Use <a>DescribeGatewayInformation</a>
     * to get a list of the network interfaces available on a gateway.
     * </p>
     * <p>
     * Valid Values: A valid IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>\A(25[0-5]|2[0-4]\d|[0-1]?\d?\d)(\.(25[0-5]|2[0-4]\d|[0-1]
     * ?\d?\d)){3}\z<br/>
     *
     * @param networkInterfaceId <p>
     *            The network interface of the gateway on which to expose the
     *            iSCSI target. Only IPv4 addresses are accepted. Use
     *            <a>DescribeGatewayInformation</a> to get a list of the network
     *            interfaces available on a gateway.
     *            </p>
     *            <p>
     *            Valid Values: A valid IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStorediSCSIVolumeRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
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
    public CreateStorediSCSIVolumeRequest withKMSEncrypted(Boolean kMSEncrypted) {
        this.kMSEncrypted = kMSEncrypted;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the KMS key used for Amazon S3
     *         server-side encryption. This value can only be set when
     *         KMSEncrypted is true. Optional.
     *         </p>
     */
    public String getKMSKey() {
        return kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used for Amazon S3
     * server-side encryption. This value can only be set when KMSEncrypted is
     * true. Optional.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>7 - 2048<br/>
     *
     * @param kMSKey <p>
     *            The Amazon Resource Name (ARN) of the KMS key used for Amazon
     *            S3 server-side encryption. This value can only be set when
     *            KMSEncrypted is true. Optional.
     *            </p>
     */
    public void setKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the KMS key used for Amazon S3
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
     *            The Amazon Resource Name (ARN) of the KMS key used for Amazon
     *            S3 server-side encryption. This value can only be set when
     *            KMSEncrypted is true. Optional.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateStorediSCSIVolumeRequest withKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that can be assigned to a stored volume. Each tag
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
     *         A list of up to 50 tags that can be assigned to a stored volume.
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
     * A list of up to 50 tags that can be assigned to a stored volume. Each tag
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
     *            A list of up to 50 tags that can be assigned to a stored
     *            volume. Each tag is a key-value pair.
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
     * A list of up to 50 tags that can be assigned to a stored volume. Each tag
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
     *            A list of up to 50 tags that can be assigned to a stored
     *            volume. Each tag is a key-value pair.
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
    public CreateStorediSCSIVolumeRequest withTags(Tag... tags) {
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
     * A list of up to 50 tags that can be assigned to a stored volume. Each tag
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
     *            A list of up to 50 tags that can be assigned to a stored
     *            volume. Each tag is a key-value pair.
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
    public CreateStorediSCSIVolumeRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDiskId() != null)
            sb.append("DiskId: " + getDiskId() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getPreserveExistingData() != null)
            sb.append("PreserveExistingData: " + getPreserveExistingData() + ",");
        if (getTargetName() != null)
            sb.append("TargetName: " + getTargetName() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getKMSEncrypted() != null)
            sb.append("KMSEncrypted: " + getKMSEncrypted() + ",");
        if (getKMSKey() != null)
            sb.append("KMSKey: " + getKMSKey() + ",");
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
        hashCode = prime * hashCode + ((getDiskId() == null) ? 0 : getDiskId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode
                + ((getPreserveExistingData() == null) ? 0 : getPreserveExistingData().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getKMSEncrypted() == null) ? 0 : getKMSEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKMSKey() == null) ? 0 : getKMSKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStorediSCSIVolumeRequest == false)
            return false;
        CreateStorediSCSIVolumeRequest other = (CreateStorediSCSIVolumeRequest) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDiskId() == null ^ this.getDiskId() == null)
            return false;
        if (other.getDiskId() != null && other.getDiskId().equals(this.getDiskId()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getPreserveExistingData() == null ^ this.getPreserveExistingData() == null)
            return false;
        if (other.getPreserveExistingData() != null
                && other.getPreserveExistingData().equals(this.getPreserveExistingData()) == false)
            return false;
        if (other.getTargetName() == null ^ this.getTargetName() == null)
            return false;
        if (other.getTargetName() != null
                && other.getTargetName().equals(this.getTargetName()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
