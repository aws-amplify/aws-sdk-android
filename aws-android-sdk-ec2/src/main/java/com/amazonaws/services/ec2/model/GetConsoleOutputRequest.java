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
 * Gets the console output for the specified instance. For Linux instances, the
 * instance console output displays the exact console output that would normally
 * be displayed on a physical monitor attached to a computer. For Windows
 * instances, the instance console output includes the last three system event
 * log errors.
 * </p>
 * <p>
 * By default, the console output returns buffered information that was posted
 * shortly after an instance transition state (start, stop, reboot, or
 * terminate). This information is available for at least one hour after the
 * most recent post. Only the most recent 64 KB of console output is available.
 * </p>
 * <p>
 * You can optionally retrieve the latest serial console output at any time
 * during the instance lifecycle. This option is supported on instance types
 * that use the Nitro hypervisor.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-console.html#instance-console-console-output"
 * >Instance Console Output</a> in the <i>Amazon Elastic Compute Cloud User
 * Guide</i>.
 * </p>
 */
public class GetConsoleOutputRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;

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
     * When enabled, retrieves the latest console output for the instance.
     * </p>
     * <p>
     * Default: disabled (<code>false</code>)
     * </p>
     */
    private Boolean latest;

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @return <p>
     *         The ID of the instance.
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceId <p>
     *            The ID of the instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConsoleOutputRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
    public GetConsoleOutputRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * When enabled, retrieves the latest console output for the instance.
     * </p>
     * <p>
     * Default: disabled (<code>false</code>)
     * </p>
     *
     * @return <p>
     *         When enabled, retrieves the latest console output for the
     *         instance.
     *         </p>
     *         <p>
     *         Default: disabled (<code>false</code>)
     *         </p>
     */
    public Boolean isLatest() {
        return latest;
    }

    /**
     * <p>
     * When enabled, retrieves the latest console output for the instance.
     * </p>
     * <p>
     * Default: disabled (<code>false</code>)
     * </p>
     *
     * @return <p>
     *         When enabled, retrieves the latest console output for the
     *         instance.
     *         </p>
     *         <p>
     *         Default: disabled (<code>false</code>)
     *         </p>
     */
    public Boolean getLatest() {
        return latest;
    }

    /**
     * <p>
     * When enabled, retrieves the latest console output for the instance.
     * </p>
     * <p>
     * Default: disabled (<code>false</code>)
     * </p>
     *
     * @param latest <p>
     *            When enabled, retrieves the latest console output for the
     *            instance.
     *            </p>
     *            <p>
     *            Default: disabled (<code>false</code>)
     *            </p>
     */
    public void setLatest(Boolean latest) {
        this.latest = latest;
    }

    /**
     * <p>
     * When enabled, retrieves the latest console output for the instance.
     * </p>
     * <p>
     * Default: disabled (<code>false</code>)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param latest <p>
     *            When enabled, retrieves the latest console output for the
     *            instance.
     *            </p>
     *            <p>
     *            Default: disabled (<code>false</code>)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetConsoleOutputRequest withLatest(Boolean latest) {
        this.latest = latest;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getLatest() != null)
            sb.append("Latest: " + getLatest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getLatest() == null) ? 0 : getLatest().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetConsoleOutputRequest == false)
            return false;
        GetConsoleOutputRequest other = (GetConsoleOutputRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getLatest() == null ^ this.getLatest() == null)
            return false;
        if (other.getLatest() != null && other.getLatest().equals(this.getLatest()) == false)
            return false;
        return true;
    }
}
