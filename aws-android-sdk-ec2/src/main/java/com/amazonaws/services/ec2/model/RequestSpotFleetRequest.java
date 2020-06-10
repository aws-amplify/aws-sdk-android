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
 * Creates a Spot Fleet request.
 * </p>
 * <p>
 * The Spot Fleet request specifies the total target capacity and the On-Demand
 * target capacity. Amazon EC2 calculates the difference between the total
 * capacity and On-Demand capacity, and launches the difference as Spot
 * capacity.
 * </p>
 * <p>
 * You can submit a single request that includes multiple launch specifications
 * that vary by instance type, AMI, Availability Zone, or subnet.
 * </p>
 * <p>
 * By default, the Spot Fleet requests Spot Instances in the Spot Instance pool
 * where the price per unit is the lowest. Each launch specification can include
 * its own instance weighting that reflects the value of the instance type to
 * your application workload.
 * </p>
 * <p>
 * Alternatively, you can specify that the Spot Fleet distribute the target
 * capacity across the Spot pools included in its launch specifications. By
 * ensuring that the Spot Instances in your Spot Fleet are in different Spot
 * pools, you can improve the availability of your fleet.
 * </p>
 * <p>
 * You can specify tags for the Spot Fleet request and instances launched by the
 * fleet. You cannot tag other resource types in a Spot Fleet request because
 * only the <code>spot-fleet-request</code> and <code>instance</code> resource
 * types are supported.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-fleet-requests.html"
 * >Spot Fleet Requests</a> in the <i>Amazon EC2 User Guide for Linux
 * Instances</i>.
 * </p>
 */
public class RequestSpotFleetRequest extends AmazonWebServiceRequest implements Serializable {
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
     * The configuration for the Spot Fleet request.
     * </p>
     */
    private SpotFleetRequestConfigData spotFleetRequestConfig;

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
    public RequestSpotFleetRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The configuration for the Spot Fleet request.
     * </p>
     *
     * @return <p>
     *         The configuration for the Spot Fleet request.
     *         </p>
     */
    public SpotFleetRequestConfigData getSpotFleetRequestConfig() {
        return spotFleetRequestConfig;
    }

    /**
     * <p>
     * The configuration for the Spot Fleet request.
     * </p>
     *
     * @param spotFleetRequestConfig <p>
     *            The configuration for the Spot Fleet request.
     *            </p>
     */
    public void setSpotFleetRequestConfig(SpotFleetRequestConfigData spotFleetRequestConfig) {
        this.spotFleetRequestConfig = spotFleetRequestConfig;
    }

    /**
     * <p>
     * The configuration for the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotFleetRequestConfig <p>
     *            The configuration for the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RequestSpotFleetRequest withSpotFleetRequestConfig(
            SpotFleetRequestConfigData spotFleetRequestConfig) {
        this.spotFleetRequestConfig = spotFleetRequestConfig;
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getSpotFleetRequestConfig() != null)
            sb.append("SpotFleetRequestConfig: " + getSpotFleetRequestConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime
                * hashCode
                + ((getSpotFleetRequestConfig() == null) ? 0 : getSpotFleetRequestConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestSpotFleetRequest == false)
            return false;
        RequestSpotFleetRequest other = (RequestSpotFleetRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getSpotFleetRequestConfig() == null ^ this.getSpotFleetRequestConfig() == null)
            return false;
        if (other.getSpotFleetRequestConfig() != null
                && other.getSpotFleetRequestConfig().equals(this.getSpotFleetRequestConfig()) == false)
            return false;
        return true;
    }
}
