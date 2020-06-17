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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Enables or disables an Availability Zone group for your account.
 * </p>
 * <p>
 * Use <a href=
 * "https://docs.aws.amazon.com/AWSEC2ApiDocReef/build/server-root/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html"
 * >describe-availability-zones</a> to view the value for <code>GroupName</code>
 * .
 * </p>
 */
public class ModifyAvailabilityZoneGroupRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the Availability Zone Group.
     * </p>
     */
    private String groupName;

    /**
     * <p>
     * Indicates whether to enable or disable membership. The valid values are
     * <code>opted-in</code>. You must contact <a href=
     * "https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services"
     * >AWS Support</a> to disable an Availability Zone group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opted-in, not-opted-in
     */
    private String optInStatus;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the Availability Zone Group.
     * </p>
     *
     * @return <p>
     *         The name of the Availability Zone Group.
     *         </p>
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * <p>
     * The name of the Availability Zone Group.
     * </p>
     *
     * @param groupName <p>
     *            The name of the Availability Zone Group.
     *            </p>
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the Availability Zone Group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param groupName <p>
     *            The name of the Availability Zone Group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyAvailabilityZoneGroupRequest withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable membership. The valid values are
     * <code>opted-in</code>. You must contact <a href=
     * "https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services"
     * >AWS Support</a> to disable an Availability Zone group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opted-in, not-opted-in
     *
     * @return <p>
     *         Indicates whether to enable or disable membership. The valid
     *         values are <code>opted-in</code>. You must contact <a href=
     *         "https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services"
     *         >AWS Support</a> to disable an Availability Zone group.
     *         </p>
     * @see ModifyAvailabilityZoneOptInStatus
     */
    public String getOptInStatus() {
        return optInStatus;
    }

    /**
     * <p>
     * Indicates whether to enable or disable membership. The valid values are
     * <code>opted-in</code>. You must contact <a href=
     * "https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services"
     * >AWS Support</a> to disable an Availability Zone group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opted-in, not-opted-in
     *
     * @param optInStatus <p>
     *            Indicates whether to enable or disable membership. The valid
     *            values are <code>opted-in</code>. You must contact <a href=
     *            "https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services"
     *            >AWS Support</a> to disable an Availability Zone group.
     *            </p>
     * @see ModifyAvailabilityZoneOptInStatus
     */
    public void setOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
    }

    /**
     * <p>
     * Indicates whether to enable or disable membership. The valid values are
     * <code>opted-in</code>. You must contact <a href=
     * "https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services"
     * >AWS Support</a> to disable an Availability Zone group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opted-in, not-opted-in
     *
     * @param optInStatus <p>
     *            Indicates whether to enable or disable membership. The valid
     *            values are <code>opted-in</code>. You must contact <a href=
     *            "https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services"
     *            >AWS Support</a> to disable an Availability Zone group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModifyAvailabilityZoneOptInStatus
     */
    public ModifyAvailabilityZoneGroupRequest withOptInStatus(String optInStatus) {
        this.optInStatus = optInStatus;
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable or disable membership. The valid values are
     * <code>opted-in</code>. You must contact <a href=
     * "https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services"
     * >AWS Support</a> to disable an Availability Zone group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opted-in, not-opted-in
     *
     * @param optInStatus <p>
     *            Indicates whether to enable or disable membership. The valid
     *            values are <code>opted-in</code>. You must contact <a href=
     *            "https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services"
     *            >AWS Support</a> to disable an Availability Zone group.
     *            </p>
     * @see ModifyAvailabilityZoneOptInStatus
     */
    public void setOptInStatus(ModifyAvailabilityZoneOptInStatus optInStatus) {
        this.optInStatus = optInStatus.toString();
    }

    /**
     * <p>
     * Indicates whether to enable or disable membership. The valid values are
     * <code>opted-in</code>. You must contact <a href=
     * "https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services"
     * >AWS Support</a> to disable an Availability Zone group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>opted-in, not-opted-in
     *
     * @param optInStatus <p>
     *            Indicates whether to enable or disable membership. The valid
     *            values are <code>opted-in</code>. You must contact <a href=
     *            "https://console.aws.amazon.com/support/home#/case/create%3FissueType=customer-service%26serviceCode=general-info%26getting-started%26categoryCode=using-aws%26services"
     *            >AWS Support</a> to disable an Availability Zone group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ModifyAvailabilityZoneOptInStatus
     */
    public ModifyAvailabilityZoneGroupRequest withOptInStatus(
            ModifyAvailabilityZoneOptInStatus optInStatus) {
        this.optInStatus = optInStatus.toString();
        return this;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyAvailabilityZoneGroupRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
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
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getOptInStatus() != null)
            sb.append("OptInStatus: " + getOptInStatus() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getOptInStatus() == null) ? 0 : getOptInStatus().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyAvailabilityZoneGroupRequest == false)
            return false;
        ModifyAvailabilityZoneGroupRequest other = (ModifyAvailabilityZoneGroupRequest) obj;

        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getOptInStatus() == null ^ this.getOptInStatus() == null)
            return false;
        if (other.getOptInStatus() != null
                && other.getOptInStatus().equals(this.getOptInStatus()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }
}
