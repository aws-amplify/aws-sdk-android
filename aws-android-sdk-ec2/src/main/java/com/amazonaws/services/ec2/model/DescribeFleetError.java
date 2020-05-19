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

/**
 * <p>
 * Describes the instances that could not be launched by the fleet.
 * </p>
 */
public class DescribeFleetError implements Serializable {
    /**
     * <p>
     * The launch templates and overrides that were used for launching the
     * instances. The values that you specify in the Overrides replace the
     * values in the launch template.
     * </p>
     */
    private LaunchTemplateAndOverridesResponse launchTemplateAndOverrides;

    /**
     * <p>
     * Indicates if the instance that could not be launched was a Spot Instance
     * or On-Demand Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     */
    private String lifecycle;

    /**
     * <p>
     * The error code that indicates why the instance could not be launched. For
     * more information about error codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * The error message that describes why the instance could not be launched.
     * For more information about error messages, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The launch templates and overrides that were used for launching the
     * instances. The values that you specify in the Overrides replace the
     * values in the launch template.
     * </p>
     *
     * @return <p>
     *         The launch templates and overrides that were used for launching
     *         the instances. The values that you specify in the Overrides
     *         replace the values in the launch template.
     *         </p>
     */
    public LaunchTemplateAndOverridesResponse getLaunchTemplateAndOverrides() {
        return launchTemplateAndOverrides;
    }

    /**
     * <p>
     * The launch templates and overrides that were used for launching the
     * instances. The values that you specify in the Overrides replace the
     * values in the launch template.
     * </p>
     *
     * @param launchTemplateAndOverrides <p>
     *            The launch templates and overrides that were used for
     *            launching the instances. The values that you specify in the
     *            Overrides replace the values in the launch template.
     *            </p>
     */
    public void setLaunchTemplateAndOverrides(
            LaunchTemplateAndOverridesResponse launchTemplateAndOverrides) {
        this.launchTemplateAndOverrides = launchTemplateAndOverrides;
    }

    /**
     * <p>
     * The launch templates and overrides that were used for launching the
     * instances. The values that you specify in the Overrides replace the
     * values in the launch template.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param launchTemplateAndOverrides <p>
     *            The launch templates and overrides that were used for
     *            launching the instances. The values that you specify in the
     *            Overrides replace the values in the launch template.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetError withLaunchTemplateAndOverrides(
            LaunchTemplateAndOverridesResponse launchTemplateAndOverrides) {
        this.launchTemplateAndOverrides = launchTemplateAndOverrides;
        return this;
    }

    /**
     * <p>
     * Indicates if the instance that could not be launched was a Spot Instance
     * or On-Demand Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     *
     * @return <p>
     *         Indicates if the instance that could not be launched was a Spot
     *         Instance or On-Demand Instance.
     *         </p>
     * @see InstanceLifecycle
     */
    public String getLifecycle() {
        return lifecycle;
    }

    /**
     * <p>
     * Indicates if the instance that could not be launched was a Spot Instance
     * or On-Demand Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     *
     * @param lifecycle <p>
     *            Indicates if the instance that could not be launched was a
     *            Spot Instance or On-Demand Instance.
     *            </p>
     * @see InstanceLifecycle
     */
    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Indicates if the instance that could not be launched was a Spot Instance
     * or On-Demand Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     *
     * @param lifecycle <p>
     *            Indicates if the instance that could not be launched was a
     *            Spot Instance or On-Demand Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceLifecycle
     */
    public DescribeFleetError withLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }

    /**
     * <p>
     * Indicates if the instance that could not be launched was a Spot Instance
     * or On-Demand Instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     *
     * @param lifecycle <p>
     *            Indicates if the instance that could not be launched was a
     *            Spot Instance or On-Demand Instance.
     *            </p>
     * @see InstanceLifecycle
     */
    public void setLifecycle(InstanceLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
    }

    /**
     * <p>
     * Indicates if the instance that could not be launched was a Spot Instance
     * or On-Demand Instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>spot, on-demand
     *
     * @param lifecycle <p>
     *            Indicates if the instance that could not be launched was a
     *            Spot Instance or On-Demand Instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceLifecycle
     */
    public DescribeFleetError withLifecycle(InstanceLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The error code that indicates why the instance could not be launched. For
     * more information about error codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     *
     * @return <p>
     *         The error code that indicates why the instance could not be
     *         launched. For more information about error codes, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *         >Error Codes</a>.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The error code that indicates why the instance could not be launched. For
     * more information about error codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     *
     * @param errorCode <p>
     *            The error code that indicates why the instance could not be
     *            launched. For more information about error codes, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *            >Error Codes</a>.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code that indicates why the instance could not be launched. For
     * more information about error codes, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            The error code that indicates why the instance could not be
     *            launched. For more information about error codes, see <a href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *            >Error Codes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetError withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The error message that describes why the instance could not be launched.
     * For more information about error messages, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     *
     * @return <p>
     *         The error message that describes why the instance could not be
     *         launched. For more information about error messages, see <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *         >Error Codes</a>.
     *         </p>
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * <p>
     * The error message that describes why the instance could not be launched.
     * For more information about error messages, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     *
     * @param errorMessage <p>
     *            The error message that describes why the instance could not be
     *            launched. For more information about error messages, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *            >Error Codes</a>.
     *            </p>
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message that describes why the instance could not be launched.
     * For more information about error messages, see <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     * >Error Codes</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorMessage <p>
     *            The error message that describes why the instance could not be
     *            launched. For more information about error messages, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html.html"
     *            >Error Codes</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeFleetError withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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
        if (getLaunchTemplateAndOverrides() != null)
            sb.append("LaunchTemplateAndOverrides: " + getLaunchTemplateAndOverrides() + ",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: " + getLifecycle() + ",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: " + getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLaunchTemplateAndOverrides() == null) ? 0 : getLaunchTemplateAndOverrides()
                        .hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode
                + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFleetError == false)
            return false;
        DescribeFleetError other = (DescribeFleetError) obj;

        if (other.getLaunchTemplateAndOverrides() == null
                ^ this.getLaunchTemplateAndOverrides() == null)
            return false;
        if (other.getLaunchTemplateAndOverrides() != null
                && other.getLaunchTemplateAndOverrides().equals(
                        this.getLaunchTemplateAndOverrides()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null
                && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null
                && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }
}
