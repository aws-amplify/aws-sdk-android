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
 * Creates a cached volume on a specified cached volume gateway. This operation
 * is only supported in the cached volume gateway type.
 * </p>
 * <note>
 * <p>
 * Cache storage must be allocated to the gateway before you can create a cached
 * volume. Use the <a>AddCache</a> operation to add cache storage to a gateway.
 * </p>
 * </note>
 * <p>
 * In the request, you must specify the gateway, size of the volume in bytes,
 * the iSCSI target name, an IP address on which to expose the target, and a
 * unique client token. In response, the gateway creates the volume and returns
 * information about it. This information includes the volume Amazon Resource
 * Name (ARN), its size, and the iSCSI target ARN that initiators can use to
 * connect to the volume target.
 * </p>
 * <p>
 * Optionally, you can provide the ARN for an existing volume as the
 * <code>SourceVolumeARN</code> for this cached volume, which creates an exact
 * copy of the existing volume’s latest recovery point. The
 * <code>VolumeSizeInBytes</code> value must be equal to or larger than the size
 * of the copied volume, in bytes.
 * </p>
 */
public class CreateCachediSCSIVolumeRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The size of the volume in bytes.
     * </p>
     */
    private Long volumeSizeInBytes;

    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the
     * new cached volume. Specify this field if you want to create the iSCSI
     * storage volume from a snapshot; otherwise, do not include this field. To
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
     * The ARN for an existing volume. Specifying this ARN makes the new volume
     * into an exact copy of the specified existing volume's latest recovery
     * point. The <code>VolumeSizeInBytes</code> value for this new volume must
     * be equal to or larger than the size of the existing volume, in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String sourceVolumeARN;

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
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     */
    private String clientToken;

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
     * A list of up to 50 tags that you can assign to a cached volume. Each tag
     * is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers that
     * you can represent in UTF-8 format, and the following special characters:
     * + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     * the maximum length for a tag's value is 256 characters.
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
    public CreateCachediSCSIVolumeRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     *
     * @return <p>
     *         The size of the volume in bytes.
     *         </p>
     */
    public Long getVolumeSizeInBytes() {
        return volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     *
     * @param volumeSizeInBytes <p>
     *            The size of the volume in bytes.
     *            </p>
     */
    public void setVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
    }

    /**
     * <p>
     * The size of the volume in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param volumeSizeInBytes <p>
     *            The size of the volume in bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCachediSCSIVolumeRequest withVolumeSizeInBytes(Long volumeSizeInBytes) {
        this.volumeSizeInBytes = volumeSizeInBytes;
        return this;
    }

    /**
     * <p>
     * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the
     * new cached volume. Specify this field if you want to create the iSCSI
     * storage volume from a snapshot; otherwise, do not include this field. To
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
     *         as the new cached volume. Specify this field if you want to
     *         create the iSCSI storage volume from a snapshot; otherwise, do
     *         not include this field. To list snapshots for your account use <a
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
     * new cached volume. Specify this field if you want to create the iSCSI
     * storage volume from a snapshot; otherwise, do not include this field. To
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
     *            restore as the new cached volume. Specify this field if you
     *            want to create the iSCSI storage volume from a snapshot;
     *            otherwise, do not include this field. To list snapshots for
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
     * new cached volume. Specify this field if you want to create the iSCSI
     * storage volume from a snapshot; otherwise, do not include this field. To
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
     *            restore as the new cached volume. Specify this field if you
     *            want to create the iSCSI storage volume from a snapshot;
     *            otherwise, do not include this field. To list snapshots for
     *            your account use <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/ApiReference-query-DescribeSnapshots.html"
     *            >DescribeSnapshots</a> in the <i>Amazon Elastic Compute Cloud
     *            API Reference</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCachediSCSIVolumeRequest withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
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
    public CreateCachediSCSIVolumeRequest withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * <p>
     * The ARN for an existing volume. Specifying this ARN makes the new volume
     * into an exact copy of the specified existing volume's latest recovery
     * point. The <code>VolumeSizeInBytes</code> value for this new volume must
     * be equal to or larger than the size of the existing volume, in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The ARN for an existing volume. Specifying this ARN makes the new
     *         volume into an exact copy of the specified existing volume's
     *         latest recovery point. The <code>VolumeSizeInBytes</code> value
     *         for this new volume must be equal to or larger than the size of
     *         the existing volume, in bytes.
     *         </p>
     */
    public String getSourceVolumeARN() {
        return sourceVolumeARN;
    }

    /**
     * <p>
     * The ARN for an existing volume. Specifying this ARN makes the new volume
     * into an exact copy of the specified existing volume's latest recovery
     * point. The <code>VolumeSizeInBytes</code> value for this new volume must
     * be equal to or larger than the size of the existing volume, in bytes.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param sourceVolumeARN <p>
     *            The ARN for an existing volume. Specifying this ARN makes the
     *            new volume into an exact copy of the specified existing
     *            volume's latest recovery point. The
     *            <code>VolumeSizeInBytes</code> value for this new volume must
     *            be equal to or larger than the size of the existing volume, in
     *            bytes.
     *            </p>
     */
    public void setSourceVolumeARN(String sourceVolumeARN) {
        this.sourceVolumeARN = sourceVolumeARN;
    }

    /**
     * <p>
     * The ARN for an existing volume. Specifying this ARN makes the new volume
     * into an exact copy of the specified existing volume's latest recovery
     * point. The <code>VolumeSizeInBytes</code> value for this new volume must
     * be equal to or larger than the size of the existing volume, in bytes.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param sourceVolumeARN <p>
     *            The ARN for an existing volume. Specifying this ARN makes the
     *            new volume into an exact copy of the specified existing
     *            volume's latest recovery point. The
     *            <code>VolumeSizeInBytes</code> value for this new volume must
     *            be equal to or larger than the size of the existing volume, in
     *            bytes.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCachediSCSIVolumeRequest withSourceVolumeARN(String sourceVolumeARN) {
        this.sourceVolumeARN = sourceVolumeARN;
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
    public CreateCachediSCSIVolumeRequest withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @return <p>
     *         A unique identifier that you use to retry a request. If you retry
     *         a request, use the same <code>ClientToken</code> you specified in
     *         the initial request.
     *         </p>
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @param clientToken <p>
     *            A unique identifier that you use to retry a request. If you
     *            retry a request, use the same <code>ClientToken</code> you
     *            specified in the initial request.
     *            </p>
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A unique identifier that you use to retry a request. If you retry a
     * request, use the same <code>ClientToken</code> you specified in the
     * initial request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 100<br/>
     *
     * @param clientToken <p>
     *            A unique identifier that you use to retry a request. If you
     *            retry a request, use the same <code>ClientToken</code> you
     *            specified in the initial request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCachediSCSIVolumeRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
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
    public CreateCachediSCSIVolumeRequest withKMSEncrypted(Boolean kMSEncrypted) {
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
    public CreateCachediSCSIVolumeRequest withKMSKey(String kMSKey) {
        this.kMSKey = kMSKey;
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags that you can assign to a cached volume. Each tag
     * is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers that
     * you can represent in UTF-8 format, and the following special characters:
     * + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     * the maximum length for a tag's value is 256 characters.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of up to 50 tags that you can assign to a cached volume.
     *         Each tag is a key-value pair.
     *         </p>
     *         <note>
     *         <p>
     *         Valid characters for key and value are letters, spaces, and
     *         numbers that you can represent in UTF-8 format, and the following
     *         special characters: + - = . _ : / @. The maximum length of a
     *         tag's key is 128 characters, and the maximum length for a tag's
     *         value is 256 characters.
     *         </p>
     *         </note>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags that you can assign to a cached volume. Each tag
     * is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers that
     * you can represent in UTF-8 format, and the following special characters:
     * + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     * the maximum length for a tag's value is 256 characters.
     * </p>
     * </note>
     *
     * @param tags <p>
     *            A list of up to 50 tags that you can assign to a cached
     *            volume. Each tag is a key-value pair.
     *            </p>
     *            <note>
     *            <p>
     *            Valid characters for key and value are letters, spaces, and
     *            numbers that you can represent in UTF-8 format, and the
     *            following special characters: + - = . _ : / @. The maximum
     *            length of a tag's key is 128 characters, and the maximum
     *            length for a tag's value is 256 characters.
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
     * A list of up to 50 tags that you can assign to a cached volume. Each tag
     * is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers that
     * you can represent in UTF-8 format, and the following special characters:
     * + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     * the maximum length for a tag's value is 256 characters.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags that you can assign to a cached
     *            volume. Each tag is a key-value pair.
     *            </p>
     *            <note>
     *            <p>
     *            Valid characters for key and value are letters, spaces, and
     *            numbers that you can represent in UTF-8 format, and the
     *            following special characters: + - = . _ : / @. The maximum
     *            length of a tag's key is 128 characters, and the maximum
     *            length for a tag's value is 256 characters.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCachediSCSIVolumeRequest withTags(Tag... tags) {
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
     * A list of up to 50 tags that you can assign to a cached volume. Each tag
     * is a key-value pair.
     * </p>
     * <note>
     * <p>
     * Valid characters for key and value are letters, spaces, and numbers that
     * you can represent in UTF-8 format, and the following special characters:
     * + - = . _ : / @. The maximum length of a tag's key is 128 characters, and
     * the maximum length for a tag's value is 256 characters.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags that you can assign to a cached
     *            volume. Each tag is a key-value pair.
     *            </p>
     *            <note>
     *            <p>
     *            Valid characters for key and value are letters, spaces, and
     *            numbers that you can represent in UTF-8 format, and the
     *            following special characters: + - = . _ : / @. The maximum
     *            length of a tag's key is 128 characters, and the maximum
     *            length for a tag's value is 256 characters.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateCachediSCSIVolumeRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getVolumeSizeInBytes() != null)
            sb.append("VolumeSizeInBytes: " + getVolumeSizeInBytes() + ",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getTargetName() != null)
            sb.append("TargetName: " + getTargetName() + ",");
        if (getSourceVolumeARN() != null)
            sb.append("SourceVolumeARN: " + getSourceVolumeARN() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getClientToken() != null)
            sb.append("ClientToken: " + getClientToken() + ",");
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
        hashCode = prime * hashCode
                + ((getVolumeSizeInBytes() == null) ? 0 : getVolumeSizeInBytes().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getTargetName() == null) ? 0 : getTargetName().hashCode());
        hashCode = prime * hashCode
                + ((getSourceVolumeARN() == null) ? 0 : getSourceVolumeARN().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
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

        if (obj instanceof CreateCachediSCSIVolumeRequest == false)
            return false;
        CreateCachediSCSIVolumeRequest other = (CreateCachediSCSIVolumeRequest) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getVolumeSizeInBytes() == null ^ this.getVolumeSizeInBytes() == null)
            return false;
        if (other.getVolumeSizeInBytes() != null
                && other.getVolumeSizeInBytes().equals(this.getVolumeSizeInBytes()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getTargetName() == null ^ this.getTargetName() == null)
            return false;
        if (other.getTargetName() != null
                && other.getTargetName().equals(this.getTargetName()) == false)
            return false;
        if (other.getSourceVolumeARN() == null ^ this.getSourceVolumeARN() == null)
            return false;
        if (other.getSourceVolumeARN() != null
                && other.getSourceVolumeARN().equals(this.getSourceVolumeARN()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null
                && other.getClientToken().equals(this.getClientToken()) == false)
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
