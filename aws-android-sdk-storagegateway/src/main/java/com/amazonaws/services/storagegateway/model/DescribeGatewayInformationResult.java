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

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 */
public class DescribeGatewayInformationResult implements Serializable {
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
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     */
    private String gatewayId;

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     */
    private String gatewayName;

    /**
     * <p>
     * A value that indicates the time zone configured for the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     */
    private String gatewayTimezone;

    /**
     * <p>
     * A value that indicates the operating state of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     */
    private String gatewayState;

    /**
     * <p>
     * A <a>NetworkInterface</a> array that contains descriptions of the gateway
     * network interfaces.
     * </p>
     */
    private java.util.List<NetworkInterface> gatewayNetworkInterfaces;

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     */
    private String gatewayType;

    /**
     * <p>
     * The date on which an update to the gateway is available. This date is in
     * the time zone of the gateway. If the gateway is not available for an
     * update this field is not returned in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private String nextUpdateAvailabilityDate;

    /**
     * <p>
     * The date on which the last software update was applied to the gateway. If
     * the gateway has never been updated, this field does not return a value in
     * the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     */
    private String lastSoftwareUpdate;

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     */
    private String ec2InstanceId;

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     */
    private String ec2InstanceRegion;

    /**
     * <p>
     * A list of up to 50 tags assigned to the gateway, sorted alphabetically by
     * key name. Each tag is a key-value pair. For a gateway with more than 10
     * tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The configuration settings for the virtual private cloud (VPC) endpoint
     * for your gateway.
     * </p>
     */
    private String vPCEndpoint;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Log Group that is
     * used to monitor events in the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 562<br/>
     */
    private String cloudWatchLogGroupARN;

    /**
     * <p>
     * The type of hypervisor environment used by the host.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMWARE, HYPER-V, EC2, KVM, OTHER
     */
    private String hostEnvironment;

    /**
     * <p>
     * The type of endpoint for your gateway.
     * </p>
     * <p>
     * Valid Values: <code>STANDARD</code> | <code>FIPS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 8<br/>
     */
    private String endpointType;

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
    public DescribeGatewayInformationResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @return <p>
     *         The unique identifier assigned to your gateway during activation.
     *         This ID becomes part of the gateway Amazon Resource Name (ARN),
     *         which you use as input for other operations.
     *         </p>
     */
    public String getGatewayId() {
        return gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param gatewayId <p>
     *            The unique identifier assigned to your gateway during
     *            activation. This ID becomes part of the gateway Amazon
     *            Resource Name (ARN), which you use as input for other
     *            operations.
     *            </p>
     */
    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The unique identifier assigned to your gateway during activation. This ID
     * becomes part of the gateway Amazon Resource Name (ARN), which you use as
     * input for other operations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 30<br/>
     *
     * @param gatewayId <p>
     *            The unique identifier assigned to your gateway during
     *            activation. This ID becomes part of the gateway Amazon
     *            Resource Name (ARN), which you use as input for other
     *            operations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     *
     * @return <p>
     *         The name you configured for your gateway.
     *         </p>
     */
    public String getGatewayName() {
        return gatewayName;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     *
     * @param gatewayName <p>
     *            The name you configured for your gateway.
     *            </p>
     */
    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayName <p>
     *            The name you configured for your gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
        return this;
    }

    /**
     * <p>
     * A value that indicates the time zone configured for the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @return <p>
     *         A value that indicates the time zone configured for the gateway.
     *         </p>
     */
    public String getGatewayTimezone() {
        return gatewayTimezone;
    }

    /**
     * <p>
     * A value that indicates the time zone configured for the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param gatewayTimezone <p>
     *            A value that indicates the time zone configured for the
     *            gateway.
     *            </p>
     */
    public void setGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
    }

    /**
     * <p>
     * A value that indicates the time zone configured for the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 10<br/>
     *
     * @param gatewayTimezone <p>
     *            A value that indicates the time zone configured for the
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
        return this;
    }

    /**
     * <p>
     * A value that indicates the operating state of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @return <p>
     *         A value that indicates the operating state of the gateway.
     *         </p>
     */
    public String getGatewayState() {
        return gatewayState;
    }

    /**
     * <p>
     * A value that indicates the operating state of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @param gatewayState <p>
     *            A value that indicates the operating state of the gateway.
     *            </p>
     */
    public void setGatewayState(String gatewayState) {
        this.gatewayState = gatewayState;
    }

    /**
     * <p>
     * A value that indicates the operating state of the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 25<br/>
     *
     * @param gatewayState <p>
     *            A value that indicates the operating state of the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withGatewayState(String gatewayState) {
        this.gatewayState = gatewayState;
        return this;
    }

    /**
     * <p>
     * A <a>NetworkInterface</a> array that contains descriptions of the gateway
     * network interfaces.
     * </p>
     *
     * @return <p>
     *         A <a>NetworkInterface</a> array that contains descriptions of the
     *         gateway network interfaces.
     *         </p>
     */
    public java.util.List<NetworkInterface> getGatewayNetworkInterfaces() {
        return gatewayNetworkInterfaces;
    }

    /**
     * <p>
     * A <a>NetworkInterface</a> array that contains descriptions of the gateway
     * network interfaces.
     * </p>
     *
     * @param gatewayNetworkInterfaces <p>
     *            A <a>NetworkInterface</a> array that contains descriptions of
     *            the gateway network interfaces.
     *            </p>
     */
    public void setGatewayNetworkInterfaces(
            java.util.Collection<NetworkInterface> gatewayNetworkInterfaces) {
        if (gatewayNetworkInterfaces == null) {
            this.gatewayNetworkInterfaces = null;
            return;
        }

        this.gatewayNetworkInterfaces = new java.util.ArrayList<NetworkInterface>(
                gatewayNetworkInterfaces);
    }

    /**
     * <p>
     * A <a>NetworkInterface</a> array that contains descriptions of the gateway
     * network interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayNetworkInterfaces <p>
     *            A <a>NetworkInterface</a> array that contains descriptions of
     *            the gateway network interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withGatewayNetworkInterfaces(
            NetworkInterface... gatewayNetworkInterfaces) {
        if (getGatewayNetworkInterfaces() == null) {
            this.gatewayNetworkInterfaces = new java.util.ArrayList<NetworkInterface>(
                    gatewayNetworkInterfaces.length);
        }
        for (NetworkInterface value : gatewayNetworkInterfaces) {
            this.gatewayNetworkInterfaces.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A <a>NetworkInterface</a> array that contains descriptions of the gateway
     * network interfaces.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gatewayNetworkInterfaces <p>
     *            A <a>NetworkInterface</a> array that contains descriptions of
     *            the gateway network interfaces.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withGatewayNetworkInterfaces(
            java.util.Collection<NetworkInterface> gatewayNetworkInterfaces) {
        setGatewayNetworkInterfaces(gatewayNetworkInterfaces);
        return this;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @return <p>
     *         The type of the gateway.
     *         </p>
     */
    public String getGatewayType() {
        return gatewayType;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType <p>
     *            The type of the gateway.
     *            </p>
     */
    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * <p>
     * The type of the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 20<br/>
     *
     * @param gatewayType <p>
     *            The type of the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * <p>
     * The date on which an update to the gateway is available. This date is in
     * the time zone of the gateway. If the gateway is not available for an
     * update this field is not returned in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return <p>
     *         The date on which an update to the gateway is available. This
     *         date is in the time zone of the gateway. If the gateway is not
     *         available for an update this field is not returned in the
     *         response.
     *         </p>
     */
    public String getNextUpdateAvailabilityDate() {
        return nextUpdateAvailabilityDate;
    }

    /**
     * <p>
     * The date on which an update to the gateway is available. This date is in
     * the time zone of the gateway. If the gateway is not available for an
     * update this field is not returned in the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param nextUpdateAvailabilityDate <p>
     *            The date on which an update to the gateway is available. This
     *            date is in the time zone of the gateway. If the gateway is not
     *            available for an update this field is not returned in the
     *            response.
     *            </p>
     */
    public void setNextUpdateAvailabilityDate(String nextUpdateAvailabilityDate) {
        this.nextUpdateAvailabilityDate = nextUpdateAvailabilityDate;
    }

    /**
     * <p>
     * The date on which an update to the gateway is available. This date is in
     * the time zone of the gateway. If the gateway is not available for an
     * update this field is not returned in the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param nextUpdateAvailabilityDate <p>
     *            The date on which an update to the gateway is available. This
     *            date is in the time zone of the gateway. If the gateway is not
     *            available for an update this field is not returned in the
     *            response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withNextUpdateAvailabilityDate(
            String nextUpdateAvailabilityDate) {
        this.nextUpdateAvailabilityDate = nextUpdateAvailabilityDate;
        return this;
    }

    /**
     * <p>
     * The date on which the last software update was applied to the gateway. If
     * the gateway has never been updated, this field does not return a value in
     * the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @return <p>
     *         The date on which the last software update was applied to the
     *         gateway. If the gateway has never been updated, this field does
     *         not return a value in the response.
     *         </p>
     */
    public String getLastSoftwareUpdate() {
        return lastSoftwareUpdate;
    }

    /**
     * <p>
     * The date on which the last software update was applied to the gateway. If
     * the gateway has never been updated, this field does not return a value in
     * the response.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param lastSoftwareUpdate <p>
     *            The date on which the last software update was applied to the
     *            gateway. If the gateway has never been updated, this field
     *            does not return a value in the response.
     *            </p>
     */
    public void setLastSoftwareUpdate(String lastSoftwareUpdate) {
        this.lastSoftwareUpdate = lastSoftwareUpdate;
    }

    /**
     * <p>
     * The date on which the last software update was applied to the gateway. If
     * the gateway has never been updated, this field does not return a value in
     * the response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 25<br/>
     *
     * @param lastSoftwareUpdate <p>
     *            The date on which the last software update was applied to the
     *            gateway. If the gateway has never been updated, this field
     *            does not return a value in the response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withLastSoftwareUpdate(String lastSoftwareUpdate) {
        this.lastSoftwareUpdate = lastSoftwareUpdate;
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     *
     * @return <p>
     *         The ID of the Amazon EC2 instance that was used to launch the
     *         gateway.
     *         </p>
     */
    public String getEc2InstanceId() {
        return ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     *
     * @param ec2InstanceId <p>
     *            The ID of the Amazon EC2 instance that was used to launch the
     *            gateway.
     *            </p>
     */
    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }

    /**
     * <p>
     * The ID of the Amazon EC2 instance that was used to launch the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2InstanceId <p>
     *            The ID of the Amazon EC2 instance that was used to launch the
     *            gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
        return this;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     *
     * @return <p>
     *         The AWS Region where the Amazon EC2 instance is located.
     *         </p>
     */
    public String getEc2InstanceRegion() {
        return ec2InstanceRegion;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     *
     * @param ec2InstanceRegion <p>
     *            The AWS Region where the Amazon EC2 instance is located.
     *            </p>
     */
    public void setEc2InstanceRegion(String ec2InstanceRegion) {
        this.ec2InstanceRegion = ec2InstanceRegion;
    }

    /**
     * <p>
     * The AWS Region where the Amazon EC2 instance is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2InstanceRegion <p>
     *            The AWS Region where the Amazon EC2 instance is located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withEc2InstanceRegion(String ec2InstanceRegion) {
        this.ec2InstanceRegion = ec2InstanceRegion;
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the gateway, sorted alphabetically by
     * key name. Each tag is a key-value pair. For a gateway with more than 10
     * tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     *
     * @return <p>
     *         A list of up to 50 tags assigned to the gateway, sorted
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
     * A list of up to 50 tags assigned to the gateway, sorted alphabetically by
     * key name. Each tag is a key-value pair. For a gateway with more than 10
     * tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the gateway, sorted
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
     * A list of up to 50 tags assigned to the gateway, sorted alphabetically by
     * key name. Each tag is a key-value pair. For a gateway with more than 10
     * tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the gateway, sorted
     *            alphabetically by key name. Each tag is a key-value pair. For
     *            a gateway with more than 10 tags assigned, you can view all
     *            tags using the <code>ListTagsForResource</code> API operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withTags(Tag... tags) {
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
     * A list of up to 50 tags assigned to the gateway, sorted alphabetically by
     * key name. Each tag is a key-value pair. For a gateway with more than 10
     * tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of up to 50 tags assigned to the gateway, sorted
     *            alphabetically by key name. Each tag is a key-value pair. For
     *            a gateway with more than 10 tags assigned, you can view all
     *            tags using the <code>ListTagsForResource</code> API operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The configuration settings for the virtual private cloud (VPC) endpoint
     * for your gateway.
     * </p>
     *
     * @return <p>
     *         The configuration settings for the virtual private cloud (VPC)
     *         endpoint for your gateway.
     *         </p>
     */
    public String getVPCEndpoint() {
        return vPCEndpoint;
    }

    /**
     * <p>
     * The configuration settings for the virtual private cloud (VPC) endpoint
     * for your gateway.
     * </p>
     *
     * @param vPCEndpoint <p>
     *            The configuration settings for the virtual private cloud (VPC)
     *            endpoint for your gateway.
     *            </p>
     */
    public void setVPCEndpoint(String vPCEndpoint) {
        this.vPCEndpoint = vPCEndpoint;
    }

    /**
     * <p>
     * The configuration settings for the virtual private cloud (VPC) endpoint
     * for your gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vPCEndpoint <p>
     *            The configuration settings for the virtual private cloud (VPC)
     *            endpoint for your gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withVPCEndpoint(String vPCEndpoint) {
        this.vPCEndpoint = vPCEndpoint;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Log Group that is
     * used to monitor events in the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 562<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Amazon CloudWatch Log Group
     *         that is used to monitor events in the gateway.
     *         </p>
     */
    public String getCloudWatchLogGroupARN() {
        return cloudWatchLogGroupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Log Group that is
     * used to monitor events in the gateway.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 562<br/>
     *
     * @param cloudWatchLogGroupARN <p>
     *            The Amazon Resource Name (ARN) of the Amazon CloudWatch Log
     *            Group that is used to monitor events in the gateway.
     *            </p>
     */
    public void setCloudWatchLogGroupARN(String cloudWatchLogGroupARN) {
        this.cloudWatchLogGroupARN = cloudWatchLogGroupARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon CloudWatch Log Group that is
     * used to monitor events in the gateway.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 562<br/>
     *
     * @param cloudWatchLogGroupARN <p>
     *            The Amazon Resource Name (ARN) of the Amazon CloudWatch Log
     *            Group that is used to monitor events in the gateway.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withCloudWatchLogGroupARN(String cloudWatchLogGroupARN) {
        this.cloudWatchLogGroupARN = cloudWatchLogGroupARN;
        return this;
    }

    /**
     * <p>
     * The type of hypervisor environment used by the host.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMWARE, HYPER-V, EC2, KVM, OTHER
     *
     * @return <p>
     *         The type of hypervisor environment used by the host.
     *         </p>
     * @see HostEnvironment
     */
    public String getHostEnvironment() {
        return hostEnvironment;
    }

    /**
     * <p>
     * The type of hypervisor environment used by the host.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMWARE, HYPER-V, EC2, KVM, OTHER
     *
     * @param hostEnvironment <p>
     *            The type of hypervisor environment used by the host.
     *            </p>
     * @see HostEnvironment
     */
    public void setHostEnvironment(String hostEnvironment) {
        this.hostEnvironment = hostEnvironment;
    }

    /**
     * <p>
     * The type of hypervisor environment used by the host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMWARE, HYPER-V, EC2, KVM, OTHER
     *
     * @param hostEnvironment <p>
     *            The type of hypervisor environment used by the host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostEnvironment
     */
    public DescribeGatewayInformationResult withHostEnvironment(String hostEnvironment) {
        this.hostEnvironment = hostEnvironment;
        return this;
    }

    /**
     * <p>
     * The type of hypervisor environment used by the host.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMWARE, HYPER-V, EC2, KVM, OTHER
     *
     * @param hostEnvironment <p>
     *            The type of hypervisor environment used by the host.
     *            </p>
     * @see HostEnvironment
     */
    public void setHostEnvironment(HostEnvironment hostEnvironment) {
        this.hostEnvironment = hostEnvironment.toString();
    }

    /**
     * <p>
     * The type of hypervisor environment used by the host.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>VMWARE, HYPER-V, EC2, KVM, OTHER
     *
     * @param hostEnvironment <p>
     *            The type of hypervisor environment used by the host.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see HostEnvironment
     */
    public DescribeGatewayInformationResult withHostEnvironment(HostEnvironment hostEnvironment) {
        this.hostEnvironment = hostEnvironment.toString();
        return this;
    }

    /**
     * <p>
     * The type of endpoint for your gateway.
     * </p>
     * <p>
     * Valid Values: <code>STANDARD</code> | <code>FIPS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 8<br/>
     *
     * @return <p>
     *         The type of endpoint for your gateway.
     *         </p>
     *         <p>
     *         Valid Values: <code>STANDARD</code> | <code>FIPS</code>
     *         </p>
     */
    public String getEndpointType() {
        return endpointType;
    }

    /**
     * <p>
     * The type of endpoint for your gateway.
     * </p>
     * <p>
     * Valid Values: <code>STANDARD</code> | <code>FIPS</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 8<br/>
     *
     * @param endpointType <p>
     *            The type of endpoint for your gateway.
     *            </p>
     *            <p>
     *            Valid Values: <code>STANDARD</code> | <code>FIPS</code>
     *            </p>
     */
    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint for your gateway.
     * </p>
     * <p>
     * Valid Values: <code>STANDARD</code> | <code>FIPS</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 8<br/>
     *
     * @param endpointType <p>
     *            The type of endpoint for your gateway.
     *            </p>
     *            <p>
     *            Valid Values: <code>STANDARD</code> | <code>FIPS</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeGatewayInformationResult withEndpointType(String endpointType) {
        this.endpointType = endpointType;
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
        if (getGatewayId() != null)
            sb.append("GatewayId: " + getGatewayId() + ",");
        if (getGatewayName() != null)
            sb.append("GatewayName: " + getGatewayName() + ",");
        if (getGatewayTimezone() != null)
            sb.append("GatewayTimezone: " + getGatewayTimezone() + ",");
        if (getGatewayState() != null)
            sb.append("GatewayState: " + getGatewayState() + ",");
        if (getGatewayNetworkInterfaces() != null)
            sb.append("GatewayNetworkInterfaces: " + getGatewayNetworkInterfaces() + ",");
        if (getGatewayType() != null)
            sb.append("GatewayType: " + getGatewayType() + ",");
        if (getNextUpdateAvailabilityDate() != null)
            sb.append("NextUpdateAvailabilityDate: " + getNextUpdateAvailabilityDate() + ",");
        if (getLastSoftwareUpdate() != null)
            sb.append("LastSoftwareUpdate: " + getLastSoftwareUpdate() + ",");
        if (getEc2InstanceId() != null)
            sb.append("Ec2InstanceId: " + getEc2InstanceId() + ",");
        if (getEc2InstanceRegion() != null)
            sb.append("Ec2InstanceRegion: " + getEc2InstanceRegion() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getVPCEndpoint() != null)
            sb.append("VPCEndpoint: " + getVPCEndpoint() + ",");
        if (getCloudWatchLogGroupARN() != null)
            sb.append("CloudWatchLogGroupARN: " + getCloudWatchLogGroupARN() + ",");
        if (getHostEnvironment() != null)
            sb.append("HostEnvironment: " + getHostEnvironment() + ",");
        if (getEndpointType() != null)
            sb.append("EndpointType: " + getEndpointType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayTimezone() == null) ? 0 : getGatewayTimezone().hashCode());
        hashCode = prime * hashCode
                + ((getGatewayState() == null) ? 0 : getGatewayState().hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayNetworkInterfaces() == null) ? 0 : getGatewayNetworkInterfaces()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextUpdateAvailabilityDate() == null) ? 0 : getNextUpdateAvailabilityDate()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLastSoftwareUpdate() == null) ? 0 : getLastSoftwareUpdate().hashCode());
        hashCode = prime * hashCode
                + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getEc2InstanceRegion() == null) ? 0 : getEc2InstanceRegion().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getVPCEndpoint() == null) ? 0 : getVPCEndpoint().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchLogGroupARN() == null) ? 0 : getCloudWatchLogGroupARN().hashCode());
        hashCode = prime * hashCode
                + ((getHostEnvironment() == null) ? 0 : getHostEnvironment().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGatewayInformationResult == false)
            return false;
        DescribeGatewayInformationResult other = (DescribeGatewayInformationResult) obj;

        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null
                && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null
                && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        if (other.getGatewayTimezone() == null ^ this.getGatewayTimezone() == null)
            return false;
        if (other.getGatewayTimezone() != null
                && other.getGatewayTimezone().equals(this.getGatewayTimezone()) == false)
            return false;
        if (other.getGatewayState() == null ^ this.getGatewayState() == null)
            return false;
        if (other.getGatewayState() != null
                && other.getGatewayState().equals(this.getGatewayState()) == false)
            return false;
        if (other.getGatewayNetworkInterfaces() == null
                ^ this.getGatewayNetworkInterfaces() == null)
            return false;
        if (other.getGatewayNetworkInterfaces() != null
                && other.getGatewayNetworkInterfaces().equals(this.getGatewayNetworkInterfaces()) == false)
            return false;
        if (other.getGatewayType() == null ^ this.getGatewayType() == null)
            return false;
        if (other.getGatewayType() != null
                && other.getGatewayType().equals(this.getGatewayType()) == false)
            return false;
        if (other.getNextUpdateAvailabilityDate() == null
                ^ this.getNextUpdateAvailabilityDate() == null)
            return false;
        if (other.getNextUpdateAvailabilityDate() != null
                && other.getNextUpdateAvailabilityDate().equals(
                        this.getNextUpdateAvailabilityDate()) == false)
            return false;
        if (other.getLastSoftwareUpdate() == null ^ this.getLastSoftwareUpdate() == null)
            return false;
        if (other.getLastSoftwareUpdate() != null
                && other.getLastSoftwareUpdate().equals(this.getLastSoftwareUpdate()) == false)
            return false;
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null)
            return false;
        if (other.getEc2InstanceId() != null
                && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false)
            return false;
        if (other.getEc2InstanceRegion() == null ^ this.getEc2InstanceRegion() == null)
            return false;
        if (other.getEc2InstanceRegion() != null
                && other.getEc2InstanceRegion().equals(this.getEc2InstanceRegion()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVPCEndpoint() == null ^ this.getVPCEndpoint() == null)
            return false;
        if (other.getVPCEndpoint() != null
                && other.getVPCEndpoint().equals(this.getVPCEndpoint()) == false)
            return false;
        if (other.getCloudWatchLogGroupARN() == null ^ this.getCloudWatchLogGroupARN() == null)
            return false;
        if (other.getCloudWatchLogGroupARN() != null
                && other.getCloudWatchLogGroupARN().equals(this.getCloudWatchLogGroupARN()) == false)
            return false;
        if (other.getHostEnvironment() == null ^ this.getHostEnvironment() == null)
            return false;
        if (other.getHostEnvironment() != null
                && other.getHostEnvironment().equals(this.getHostEnvironment()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null
                && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        return true;
    }
}
