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

package com.amazonaws.services.fsx.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * One or more network settings specified in the request are invalid.
 * <code>InvalidVpcId</code> means that the ID passed for the virtual private
 * cloud (VPC) is invalid. <code>InvalidSubnetIds</code> returns the list of IDs
 * for subnets that are either invalid or not part of the VPC specified.
 * <code>InvalidSecurityGroupIds</code> returns the list of IDs for security
 * groups that are either invalid or not part of the VPC specified.
 * </p>
 */
public class InvalidNetworkSettingsException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The ID for a subnet. A <i>subnet</i> is a range of IP addresses in your
     * virtual private cloud (VPC). For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"
     * >VPC and Subnets</a> in the <i>Amazon VPC User Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 24<br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8,})$<br/>
     */
    private String invalidSubnetId;

    /**
     * <p>
     * The ID of your Amazon EC2 security group. This ID is used to control
     * network access to the endpoint that Amazon FSx creates on your behalf in
     * each subnet. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     * >Amazon EC2 Security Groups for Linux Instances</a> in the <i>Amazon EC2
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 20<br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8,})$<br/>
     */
    private String invalidSecurityGroupId;

    /**
     * Constructs a new InvalidNetworkSettingsException with the specified error
     * message.
     *
     * @param message Describes the error encountered.
     */
    public InvalidNetworkSettingsException(String message) {
        super(message);
    }

    /**
     * <p>
     * The ID for a subnet. A <i>subnet</i> is a range of IP addresses in your
     * virtual private cloud (VPC). For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"
     * >VPC and Subnets</a> in the <i>Amazon VPC User Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 24<br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The ID for a subnet. A <i>subnet</i> is a range of IP addresses
     *         in your virtual private cloud (VPC). For more information, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"
     *         >VPC and Subnets</a> in the <i>Amazon VPC User Guide.</i>
     *         </p>
     */
    public String getInvalidSubnetId() {
        return invalidSubnetId;
    }

    /**
     * <p>
     * The ID for a subnet. A <i>subnet</i> is a range of IP addresses in your
     * virtual private cloud (VPC). For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"
     * >VPC and Subnets</a> in the <i>Amazon VPC User Guide.</i>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 24<br/>
     * <b>Pattern: </b>^(subnet-[0-9a-f]{8,})$<br/>
     *
     * @param invalidSubnetId <p>
     *            The ID for a subnet. A <i>subnet</i> is a range of IP
     *            addresses in your virtual private cloud (VPC). For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonVPC/latest/UserGuide/VPC_Subnets.html"
     *            >VPC and Subnets</a> in the <i>Amazon VPC User Guide.</i>
     *            </p>
     */
    public void setInvalidSubnetId(String invalidSubnetId) {
        this.invalidSubnetId = invalidSubnetId;
    }

    /**
     * <p>
     * The ID of your Amazon EC2 security group. This ID is used to control
     * network access to the endpoint that Amazon FSx creates on your behalf in
     * each subnet. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     * >Amazon EC2 Security Groups for Linux Instances</a> in the <i>Amazon EC2
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 20<br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8,})$<br/>
     *
     * @return <p>
     *         The ID of your Amazon EC2 security group. This ID is used to
     *         control network access to the endpoint that Amazon FSx creates on
     *         your behalf in each subnet. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     *         >Amazon EC2 Security Groups for Linux Instances</a> in the
     *         <i>Amazon EC2 User Guide</i>.
     *         </p>
     */
    public String getInvalidSecurityGroupId() {
        return invalidSecurityGroupId;
    }

    /**
     * <p>
     * The ID of your Amazon EC2 security group. This ID is used to control
     * network access to the endpoint that Amazon FSx creates on your behalf in
     * each subnet. For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     * >Amazon EC2 Security Groups for Linux Instances</a> in the <i>Amazon EC2
     * User Guide</i>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>11 - 20<br/>
     * <b>Pattern: </b>^(sg-[0-9a-f]{8,})$<br/>
     *
     * @param invalidSecurityGroupId <p>
     *            The ID of your Amazon EC2 security group. This ID is used to
     *            control network access to the endpoint that Amazon FSx creates
     *            on your behalf in each subnet. For more information, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-network-security.html"
     *            >Amazon EC2 Security Groups for Linux Instances</a> in the
     *            <i>Amazon EC2 User Guide</i>.
     *            </p>
     */
    public void setInvalidSecurityGroupId(String invalidSecurityGroupId) {
        this.invalidSecurityGroupId = invalidSecurityGroupId;
    }
}
